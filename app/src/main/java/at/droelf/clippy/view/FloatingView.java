package at.droelf.clippy.view;

import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;

public class FloatingView extends FrameLayout implements View.OnTouchListener {

    private final GestureDetector gestureDetector;
    private final WindowManager.LayoutParams layoutParams;
    private final WindowManager windowManager;

    private FloatingViewCLickListener floatingViewCLickListener;

    private View childView = null;

    private int xDelta;
    private int yDelta;

    public FloatingView(Context context) {
        super(context);
        this.gestureDetector = new GestureDetector(context, new GestureListener());
        this.windowManager = (WindowManager)context.getSystemService(Context.WINDOW_SERVICE);

        this.layoutParams = new WindowManager.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_PHONE,
                WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH|WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);
        this.layoutParams.gravity = Gravity.CENTER;

        this.setOnTouchListener(this);

        this.windowManager.addView(this, layoutParams);
    }

    @Override
    public void addView(View v){
        if(v == null){
            throw new IllegalArgumentException("Provided view is null :(");
        }
        this.removeAllViews();
        this.childView = v;

        super.addView(v);
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        final boolean gestureDetected = gestureDetector.onTouchEvent(motionEvent);

        final int x = (int) motionEvent.getRawX();
        final int y = (int) motionEvent.getRawY();

        boolean motionDetected = false;
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                xDelta = x - layoutParams.x;
                yDelta = y - layoutParams.y;
                motionDetected = true;
                break;
            case MotionEvent.ACTION_MOVE:
                updateLocation((x - xDelta), (y - yDelta));
                motionDetected = true;
                break;
        }

        return gestureDetected || motionDetected;
    }

    public void setFloatingViewCLickListener(FloatingViewCLickListener floatingViewCLickListener){
        this.floatingViewCLickListener = floatingViewCLickListener;
    }

    private void updateLocation(int x, int y){
        layoutParams.x = x;
        layoutParams.y = y;
        windowManager.updateViewLayout(this, layoutParams);
    }

    class GestureListener extends GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            if(FloatingView.this.floatingViewCLickListener != null){
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        FloatingView.this.floatingViewCLickListener.onSingleTap(FloatingView.this);
                    }
                });
            }
            return super.onSingleTapConfirmed(e);
        }

        @Override
        public void onLongPress(MotionEvent e) {
            if(FloatingView.this.floatingViewCLickListener != null){
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        FloatingView.this.floatingViewCLickListener.onLongPress(FloatingView.this);
                    }
                });
            }
            super.onLongPress(e);
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            if(FloatingView.this.floatingViewCLickListener != null){
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        FloatingView.this.floatingViewCLickListener.onDoubleTap(FloatingView.this);
                    }
                });
            }
            return super.onDoubleTap(e);
        }
    }


    public interface FloatingViewCLickListener {
        public void onSingleTap(View v);
        public void onDoubleTap(View v);
        public void onLongPress(View v);
    }

}
