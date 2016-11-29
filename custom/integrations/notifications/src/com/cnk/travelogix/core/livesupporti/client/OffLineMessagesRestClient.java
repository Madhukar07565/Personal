package com.cnk.travelogix.core.livesupporti.client;

import com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessage;
import com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessages;

public interface OffLineMessagesRestClient {
	
	public OfflineMessages getAllOffLineMessages(String page);
	public OfflineMessage getOffLineMessageById(int id);
}
