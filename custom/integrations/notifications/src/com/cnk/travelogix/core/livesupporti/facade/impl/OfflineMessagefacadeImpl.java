package com.cnk.travelogix.core.livesupporti.facade.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.core.livesupporti.client.OffLineMessagesRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessage;
import com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessages;
import com.cnk.travelogix.core.livesupporti.facade.OfflineMessagefacade;

public class OfflineMessagefacadeImpl implements OfflineMessagefacade{

	private static final Logger LOG = LoggerFactory
			.getLogger(OfflineMessagefacadeImpl.class);

	@Autowired
	private OffLineMessagesRestClient offlineMessagesRestClient;
	
	@Override
	public OfflineMessages getAllOffLineMessages(String page) {
		OfflineMessages offlineMessages = new OfflineMessages();
		try {
			offlineMessages = offlineMessagesRestClient.getAllOffLineMessages(page);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return offlineMessages;
	}

	@Override
	public OfflineMessage getOffLineMessageById(int messageId) {
		OfflineMessage offlineMessage = new OfflineMessage();
		try {
			offlineMessage = offlineMessagesRestClient.getOffLineMessageById(messageId);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return offlineMessage;
	}
	
	public OffLineMessagesRestClient getOfflineMessagesRestClient() {
		return offlineMessagesRestClient;
	}

	public void setOfflineMessagesRestClient(OffLineMessagesRestClient offlineMessagesRestClient) {
		this.offlineMessagesRestClient = offlineMessagesRestClient;
	}

}
