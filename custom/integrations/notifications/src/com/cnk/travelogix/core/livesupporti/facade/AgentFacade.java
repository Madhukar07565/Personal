package com.cnk.travelogix.core.livesupporti.facade;

import java.util.List;

import com.cnk.travelogix.core.livesupporti.client.dto.Agent;
import com.cnk.travelogix.core.livesupporti.client.dto.Agents;

public interface AgentFacade {

	public List<Agent> getAllAgents();
	
	public Agent getAgentByID(String agentID);
	
	public Agent createAgent(Agent agent);
	
	public Agent updateAgent(Agent agent , String agentID);
	
	public void deleteAgent(String agentID);
}
