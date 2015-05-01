package at.droelf.clippy;

import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.IBinder;

import at.droelf.clippy.broadcastreceiver.DeviceUnlock;
import at.droelf.clippy.model.AgentType;
import at.droelf.clippy.view.NotificationHelper;
import timber.log.Timber;

public class FloatingService extends Service {

    private final static int NOTIFICATION_ID = 14232;

    private final IBinder mBinder = new LocalBinder();
    private AgentController agentController;

    private BroadcastReceiver mReceiver;


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if(intent == null){
            return START_STICKY;
        }

        if(intent.hasExtra(Command.KEY)){

            final Command command = (Command) intent.getSerializableExtra(Command.KEY);
            Timber.d("onStartCommand with command: %s", command);

            switch (command){
                case Show:
                    if(agentController == null){
                        final AgentType agentType = (AgentType) intent.getSerializableExtra(AgentType.KEY);
                        this.agentController = new AgentControllerImpl(agentType, getApplicationContext(), Global.INSTANCE.getAgentService());
                        if(Global.INSTANCE.getClippyStorage().isMute()){
                            agentController.mute();
                        }else{
                            agentController.unMute();
                        }
                        this.agentController.setAgentControllerListener(agentControllerListener);

                        startForeground(NOTIFICATION_ID, NotificationHelper.getNotification(this, agentController.getAgentType(), agentController.isRunning(), agentController.isMute()));
                        registerBroadcastListener();
                    }
                    break;

                case Start:
                    if(agentController != null && !agentController.isRunning()){
                        agentController.start();
                    }
                    break;

                case Stop:
                    if(agentController != null && agentController.isRunning()){
                        agentController.stop();
                    }
                    break;

                case Kill:
                    if(agentController != null){
                        agentController.kill();
                        unregisterBroadcastListener();
                        this.agentController = null;
                    }
                    stopSelf();
                    break;

                case Mute:
                    if(agentController != null && !agentController.isMute()){
                        agentController.mute();
                    }
                    break;

                case UnMute:
                    if(agentController != null && agentController.isMute()){
                        agentController.unMute();
                    }
                    break;
            }

            if(agentController != null){
                final NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                //mNotificationManager.cancel(123);
                mNotificationManager.notify(NOTIFICATION_ID, NotificationHelper.getNotification(this, agentController.getAgentType(), agentController.isRunning(), agentController.isMute()));
            }
        }

        return START_NOT_STICKY;
    }

    private AgentControllerListener agentControllerListener = new AgentControllerListener() {
        @Override
        public void volumeChanged(boolean mute) {
            Global.INSTANCE.getClippyStorage().setMute(mute);
            Timber.d("AgentControllerListener mute: %s", mute);
        }

        @Override
        public void stateChanged(boolean started) {
            Timber.d("AgentControllerListener started: %s", started);
        }
    };

    private void registerBroadcastListener(){
        Timber.d("Register BroadcastListener - DeviceUnlock");
        final IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        this.mReceiver = new DeviceUnlock();
        registerReceiver(mReceiver, filter);
    }

    private void unregisterBroadcastListener(){
        if(mReceiver != null){
            Timber.d("Unregister BroadcastListener - DeviceUnlock");
            unregisterReceiver(mReceiver);
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }


    public class LocalBinder extends Binder {
        FloatingService getService() {
            return FloatingService.this;
        }
    }

    public enum Command{
        Show, Start, Stop, Kill, Mute, UnMute;

        public static String KEY = "COMMAND";
    }

}
