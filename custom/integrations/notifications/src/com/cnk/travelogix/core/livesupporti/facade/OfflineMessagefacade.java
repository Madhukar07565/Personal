package com.cnk.travelogix.core.livesupporti.facade;

import com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessage;
import com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessages;

public interface OfflineMessagefacade {

	public OfflineMessages getAllOffLineMessages(String page);
	public OfflineMessage getOffLineMessageById(int messageId);
	
}
