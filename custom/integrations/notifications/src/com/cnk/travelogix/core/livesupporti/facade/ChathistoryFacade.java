package com.cnk.travelogix.core.livesupporti.facade;

import com.cnk.travelogix.core.livesupporti.client.dto.ChatHistories;

public interface ChathistoryFacade {

	public ChatHistories getAllChathistories(String page);
	public ChatHistories getAllChatHistoryAgentDate(int page,String agent, String formdate, String todate, int type);
}
