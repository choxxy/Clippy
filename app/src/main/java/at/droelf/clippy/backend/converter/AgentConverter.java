package at.droelf.clippy.backend.converter;


import at.droelf.clippy.model.gui.UiAgent;
import at.droelf.clippy.model.raw.Agent;

public interface AgentConverter {
    UiAgent agentToUiAgent(Agent agent);
}
