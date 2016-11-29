package com.cnk.travelogix.core.livesupporti.facade.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.core.livesupporti.client.AgentRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.Agent;
import com.cnk.travelogix.core.livesupporti.client.dto.Agents;
import com.cnk.travelogix.core.livesupporti.facade.AgentFacade;

public class AgentFacadeImpl implements AgentFacade{

	Logger LOG = Logger.getLogger(AgentFacadeImpl.class);
	
	@Resource(name = "agentRestClient")
	AgentRestClient agentRestClient;
	
	@Override
	public List<Agent> getAllAgents() {
		List<Agent> agents = null;
		try{
			agents = agentRestClient.getAllAgents();
		}catch(Exception e){
			LOG.info(e.getMessage(),e);
		}
		return agents;
	}

	@Override
	public Agent getAgentByID(String agentID) {
		Agent agent = null;
		try{
			agent = agentRestClient.getAgentByID(agentID);
		}catch(Exception e){
			LOG.info(e.getMessage(),e);
		}
		return agent;
	}

	@Override
	public Agent createAgent(Agent agent) {
		Agent agentResponse = null;
		try{
			agentResponse = agentRestClient.createAgent(agent);
		}catch(Exception e){
			LOG.info(e.getMessage(),e);
		}
		return agentResponse;
	}

	@Override
	public Agent updateAgent(Agent agent , String agentID) {
		Agent agentResponse = null;
		try{
			agentResponse = agentRestClient.updateAgent(agent, agentID);
		}catch(Exception e){
			LOG.info(e.getMessage(),e);
		}
		return agentResponse;
	}

	@Override
	public void deleteAgent(String agentID) {
		try{
			agentRestClient.deleteAgent(agentID);
		}catch(Exception e){
			LOG.info(e.getMessage(),e);
		}
	}	
}
