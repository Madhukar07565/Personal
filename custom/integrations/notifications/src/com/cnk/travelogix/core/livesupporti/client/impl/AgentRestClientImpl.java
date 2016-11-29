package com.cnk.travelogix.core.livesupporti.client.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.cnk.travelogix.core.livesupporti.client.AgentRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.Agent;
import com.cnk.travelogix.core.livesupporti.facade.impl.AgentFacadeImpl;

import de.hybris.platform.servicelayer.config.ConfigurationService;

public class AgentRestClientImpl extends CommonRestClientImpl<Agent[], Agent, String[]>implements AgentRestClient {

	Logger LOG = Logger.getLogger(AgentFacadeImpl.class);

	@Autowired
	private ConfigurationService configurationService;

	private static final String LIVE_SUPPORT_GET_ALL_AND_CREATE_AGENTS_URL = "livesupport.get.all.and.create.agents.url";
	private static final String LIVE_SUPPORT_UPDATE_DELETE_AND_AGENT_BY_ID_URL = "livesupport.upate.delete.and.agent.by.id.url";

	@Override
	public List<Agent> getAllAgents() {
		LOG.info("#getAllAgents - START");
		String encodedUrl = encodeGetAllAndCreateAgentsUrl();
		Agent[] agents = getAll(encodedUrl, Agent[].class);
		return Arrays.asList(agents);
	}

	@Override
	public Agent getAgentByID(String agentID) {
		LOG.info("#getAgentByID - START");
		String encodedUrl = encodeUpdateDeleteAndAgentByIdUrl(agentID);
		Agent agent = getById(encodedUrl, Agent.class);
		return agent;
	}

	@Override
	public Agent createAgent(Agent agent) {
		LOG.info("#createAgent - START");
		Agent response;
		String encodedUrl = encodeGetAllAndCreateAgentsUrl();
		response = createUpdate(encodedUrl, HttpMethod.POST, agent, Agent.class);
		return response;
	}

	@Override
	public Agent updateAgent(Agent agent, String agentID) {
		LOG.info("#updateAgent - START");
		Agent response;
		String encodedUrl = encodeUpdateDeleteAndAgentByIdUrl(agentID);
		response = createUpdate(encodedUrl, HttpMethod.PUT, agent, Agent.class);
		return response;
	}

	@Override
	public void deleteAgent(String agentID) {
		LOG.info("#deleteAgent - START");
		String encodedUrl = encodeUpdateDeleteAndAgentByIdUrl(agentID);
		delete(encodedUrl);
	}

	private String encodeGetAllAndCreateAgentsUrl() {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_AND_CREATE_AGENTS_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(liveSupportRestUrl);
		return builder.build(Boolean.TRUE).toUriString();
	}

	private String encodeUpdateDeleteAndAgentByIdUrl(String agentId) {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_UPDATE_DELETE_AND_AGENT_BY_ID_URL);
		UriComponentsBuilder.fromUriString(liveSupportRestUrl).buildAndExpand(agentId);
		final UriComponents builder = UriComponentsBuilder.fromUriString(liveSupportRestUrl).buildAndExpand(agentId);
		return builder.toString();
	}
}
