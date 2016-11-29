package com.cnk.travelogix.core.livesupporti.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.core.livesupporti.client.ChatHistoriesRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.ChatHistories;
import com.cnk.travelogix.core.livesupporti.facade.ChathistoryFacade;

public class ChathistoryFacadeImpl implements ChathistoryFacade{

	private static final Logger LOG = LoggerFactory
			.getLogger(ChathistoryFacadeImpl.class);

	@Autowired
	private ChatHistoriesRestClient chatHistoriesRestClient;
	
	@Override
	public ChatHistories getAllChathistories(String page) {
		ChatHistories chatHistories = new ChatHistories();
		try {
			chatHistories = chatHistoriesRestClient.getAllChathistories(page);
			
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return chatHistories;
	}

	@Override
	public ChatHistories getAllChatHistoryAgentDate(int page, String agent, String formdate, String todate, int type) {
		ChatHistories chatHistories = new ChatHistories();
		try {
			  chatHistories = chatHistoriesRestClient.getAllChatHistoryAgentDate(page, agent, formdate, todate, type);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return chatHistories;
	}
	
	public ChatHistoriesRestClient getChatHistoriesRestClient() {
		return chatHistoriesRestClient;
	}

	public void setChatHistoriesRestClient(ChatHistoriesRestClient chatHistoriesRestClient) {
		this.chatHistoriesRestClient = chatHistoriesRestClient;
	}

	
}
