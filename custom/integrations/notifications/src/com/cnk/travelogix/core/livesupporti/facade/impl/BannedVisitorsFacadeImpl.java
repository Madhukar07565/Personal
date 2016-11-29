package com.cnk.travelogix.core.livesupporti.facade.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.core.livesupporti.client.BannedVisitorRestClient;
import com.cnk.travelogix.core.livesupporti.client.dto.BannedVisitor;
import com.cnk.travelogix.core.livesupporti.client.dto.BannedVisitors;
import com.cnk.travelogix.core.livesupporti.facade.BannedVisitorsFacade;

public class BannedVisitorsFacadeImpl implements BannedVisitorsFacade {

	private static final Logger LOG = LoggerFactory
			.getLogger(BannedVisitorsFacadeImpl.class);

	@Autowired
	private BannedVisitorRestClient bannedVisitorRestClient;

	@Override
	public BannedVisitors getAllBannedVisitors(String page) {
		BannedVisitors bannedVisitors = new BannedVisitors();
		try {
			bannedVisitors = bannedVisitorRestClient.getAllBannedVisitors(page);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return bannedVisitors;
	}

	@Override
	public BannedVisitor getBannedVisitorById(int bannedVisitorId) {
		BannedVisitor bannedVisitor = new BannedVisitor();
		try {
			bannedVisitor = bannedVisitorRestClient.getBannedVisitorById(bannedVisitorId);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return bannedVisitor;
	}

	@Override
	public List<String> getBannedIPAddresses() {
		List<String> response = null;
		try {
			response = bannedVisitorRestClient.getBannedIPAddresses();

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return response;
	}

	@Override
	public BannedVisitor createBannedVisitor(BannedVisitor bannedVisitor) {
		BannedVisitor response = null;
		try {
			response = bannedVisitorRestClient
					.createBannedVisitor(bannedVisitor);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return response;
	}

	@Override
	public void deleteBannedVisitor(int bannedVisitorId) {
		try {
			bannedVisitorRestClient.deleteBannedVisitor(bannedVisitorId);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
	}

	public BannedVisitorRestClient getBannedVisitorRestClient() {
		return bannedVisitorRestClient;
	}

	public void setBannedVisitorRestClient(
			BannedVisitorRestClient bannedVisitorRestClient) {
		this.bannedVisitorRestClient = bannedVisitorRestClient;
	}

}
