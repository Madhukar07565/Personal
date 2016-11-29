/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.core.livesupporti.client.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.cnk.travelogix.core.livesupporti.client.BannedVisitorRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.BannedVisitor;
import com.cnk.travelogix.core.livesupporti.client.dto.BannedVisitors;

import de.hybris.platform.servicelayer.config.ConfigurationService;

/**
 * This class is rest client used to communicate with Flight View.
 * 
 * @author I313619
 */
public class BannedVisitorRestClientImpl extends
		CommonRestClientImpl<BannedVisitors, BannedVisitor, String[]>
		implements BannedVisitorRestClient {

	private static final Logger LOG = LoggerFactory
			.getLogger(BannedVisitorRestClientImpl.class);
	
	private static final String LIVE_SUPPORT_GET_ALL_BANNED_VISITOR_URL = "livesupport.get.all.banned.visitor.url";
	private static final String LIVE_SUPPORT_GET_ALL_BANNED_IP_URL = "livesupport.get.all.banned.ip.url";
	private static final String LIVE_SUPPORT_GET_ALL_BANNED_VISITOR_BY_ID_URL = "livesupport.get.all.banned.visitor.byid.url";
	private static final String LIVE_SUPPORT_GET_ALL_BANNED_VISITOR_CREATE_URL = "livesupport.get.all.banned.visitor.create.url";
	private static final String LIVE_SUPPORT_GET_ALL_BANNED_VISITOR_DELETE_URL = "livesupport.get.all.banned.visitor.delete.url";
	@Autowired
	private ConfigurationService configurationService;

	private String encodeGetAllBannedVisitorsUrl(String page) {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_BANNED_VISITOR_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString(liveSupportRestUrl);

		builder.queryParam("page", page);
		return builder.build(Boolean.TRUE).toUriString();
	}

	private String encodeGetAllBannedIpUrl() {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_BANNED_IP_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString(liveSupportRestUrl);
		return builder.build(Boolean.TRUE).toUriString();
	}
	@Override
	public BannedVisitors getAllBannedVisitors(String page) {
		LOG.trace("#getAllBannedVisitors - page : {}", page);
		
		String encodedUrl = encodeGetAllBannedVisitorsUrl(page);
		BannedVisitors bannedVisitors = getAll(encodedUrl,
				BannedVisitors.class);
		LOG.info("#getAllBannedVisitors - Finish");
		return bannedVisitors;
	}

	private String encodeGetBannedVisitorByIdUrl(int bannedVisitorId) {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_BANNED_VISITOR_BY_ID_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString(liveSupportRestUrl);

		Map<String, String> params = new HashMap();
		params.put("bannedVisitorId", String.valueOf(bannedVisitorId));

		return builder.buildAndExpand(params).toUri().toString();
	}

	@Override
	public BannedVisitor getBannedVisitorById(int bannedVisitorId) {
		String encodedUrl = encodeGetBannedVisitorByIdUrl(bannedVisitorId);
		BannedVisitor bannedVisitor = getById(encodedUrl,
				BannedVisitor.class);
		return bannedVisitor;
	}

	@Override
	public List<String> getBannedIPAddresses() {
		String encodedUrl = encodeGetAllBannedIpUrl();
		String[] bannedIps = getStringArray(encodedUrl, HttpMethod.GET,
				String[].class);
		return Arrays.asList(bannedIps);
	}

	private String encodeCreateBannedVisitorUrl() {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_BANNED_VISITOR_CREATE_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString(liveSupportRestUrl);

		return builder.build(Boolean.TRUE).toUriString();
	}
	
	@Override
	public BannedVisitor createBannedVisitor(BannedVisitor bannedVisitor) {
		String encodedUrl = encodeCreateBannedVisitorUrl();
		BannedVisitor response = createUpdate(encodedUrl, HttpMethod.POST, bannedVisitor,
				BannedVisitor.class);
		return response;
	}

	@Override
	public void deleteBannedVisitor(int bannedVisitorId) {
		String encodedUrl = encodeGetBannedVisitorDeleteUrl(bannedVisitorId);
		delete(encodedUrl);
	}

	private String encodeGetBannedVisitorDeleteUrl(int bannedVisitorId) {
		String liveSupportRestUrl = configurationService.getConfiguration()
				.getString(LIVE_SUPPORT_GET_ALL_BANNED_VISITOR_DELETE_URL);
		final UriComponentsBuilder builder = UriComponentsBuilder
				.fromUriString(liveSupportRestUrl);

		Map<String, String> params = new HashMap();
		params.put("bannedVisitorId", String.valueOf(bannedVisitorId));

		return builder.buildAndExpand(params).toUri().toString();
	}

}