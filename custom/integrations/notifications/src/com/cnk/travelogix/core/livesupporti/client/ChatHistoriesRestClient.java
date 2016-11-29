package com.cnk.travelogix.core.livesupporti.client;

import com.cnk.travelogix.core.livesupporti.client.dto.ChatHistories;

public interface ChatHistoriesRestClient {
	public ChatHistories getAllChathistories(String page);
	public ChatHistories getAllChatHistoryAgentDate(int page,String agent, String formdate, String todate, int type);
}

