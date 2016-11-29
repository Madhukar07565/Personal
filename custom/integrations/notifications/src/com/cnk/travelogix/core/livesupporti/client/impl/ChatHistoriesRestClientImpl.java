package com.cnk.travelogix.core.livesupporti.client.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

import com.cnk.travelogix.core.livesupporti.client.ChatHistoriesRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.ChatHistories;

import de.hybris.platform.servicelayer.config.ConfigurationService;

public class ChatHistoriesRestClientImpl extends CommonRestClientImpl<ChatHistories, ChatHistories, String[]>
		implements ChatHistoriesRestClient {

	private static final Logger LOG = LoggerFactory.getLogger(ChatHistoriesRestClientImpl.class);

	private static final String LIVE_SUPPORT_GET_ALL_CHAT_HISTORY_URL = "livesupport.get.all.chat.history.url";

	@Autowired
	private ConfigurationService configurationService;

	private String encodeGetAllChathistoriesUrl(String page) {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_CHAT_HISTORY_URL);

		final UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(liveSupportRestUrl);

		builder.queryParam("page", page);
		return builder.build(Boolean.TRUE).toUriString();
	}

	@Override
	public ChatHistories getAllChathistories(String page) {
		LOG.trace("#getAllChistories - page : {}", page);
		String encodedUrl = encodeGetAllChathistoriesUrl(page);
		LOG.info("#getAllChistories - Finish");
		return getAll(encodedUrl, ChatHistories.class);
	}

	private String encodeChatHistoryAgentDateUrl(int page, String agent, String formdate, String todate, int type) {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_CHAT_HISTORY_URL);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(liveSupportRestUrl).queryParam("page", page)
				.queryParam("agent", agent).queryParam("fromDate", formdate).queryParam("toDate", todate)
				.queryParam("type", type);
		return builder.buildAndExpand().toUri().toString();
	}

	public static void main(String[] args) {
		ChatHistoriesRestClientImpl chatHistoriesRestClientImpl = new ChatHistoriesRestClientImpl();
		chatHistoriesRestClientImpl.getAllChathistories("1");
	}

	@Override
	public ChatHistories getAllChatHistoryAgentDate(int page, String agent, String formdate, String todate, int type) {
		String encodedUrl = encodeChatHistoryAgentDateUrl(page, agent, formdate, todate, type);
		return getById(encodedUrl, ChatHistories.class);
	}
}
