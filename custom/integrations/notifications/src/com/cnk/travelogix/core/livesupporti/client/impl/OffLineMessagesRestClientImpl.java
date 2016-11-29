package com.cnk.travelogix.core.livesupporti.client.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

import com.cnk.travelogix.core.livesupporti.client.OffLineMessagesRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessage;
import com.cnk.travelogix.core.livesupporti.client.dto.OfflineMessages;

import de.hybris.platform.servicelayer.config.ConfigurationService;

public class OffLineMessagesRestClientImpl extends CommonRestClientImpl<OfflineMessages, OfflineMessage, String[]>
		implements OffLineMessagesRestClient {
	private static final Logger LOG = LoggerFactory.getLogger(OffLineMessagesRestClientImpl.class);
	private static final String LIVE_SUPPORT_GET_ALL_OFFLINE_MESSAGES_URL = "livesupport.get.all.offline.messages.url";
	private static final String LIVE_SUPPORT_GET_ALL_OFFLINE_MESSAGES_BY_ID_URL = "livesupport.get.all.offline.messages.url";

	@Autowired
	private ConfigurationService configurationService;

	private String encodeGetAllOffLineMessages(String page) {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_OFFLINE_MESSAGES_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(liveSupportRestUrl);
		builder.queryParam("page", page);
		return builder.build(Boolean.TRUE).toUriString();
	}

	@Override
	public OfflineMessages getAllOffLineMessages(String page) {
		LOG.trace("#getAllOffLinemessages - page : {}", page);
		String encodedUrl = encodeGetAllOffLineMessages(page);
		LOG.info("#getAllOffLinemessages - Finish");
		return getAll(encodedUrl, OfflineMessages.class);

	}

	private String encodeGetOffLineMessagesById(int messageId) {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_OFFLINE_MESSAGES_BY_ID_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(liveSupportRestUrl);

		Map<String, String> params = new HashMap();
		params.put("messageId", String.valueOf(messageId));

		return builder.buildAndExpand(params).toUri().toString();
	}

	@Override
	public OfflineMessage getOffLineMessageById(int messageId) {
		String encodedUrl = encodeGetOffLineMessagesById(messageId);
		return getById(encodedUrl, OfflineMessage.class);
	}
}
