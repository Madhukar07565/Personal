/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.core.livesupporti.client;

import java.util.List;

import com.cnk.travelogix.core.livesupporti.client.dto.BannedVisitor;
import com.cnk.travelogix.core.livesupporti.client.dto.BannedVisitors;

/**
 * 
 * 
 * @author I313619
 */
public interface BannedVisitorRestClient {

	public BannedVisitors getAllBannedVisitors(String page);

	public BannedVisitor getBannedVisitorById(int bannedVisitorId);

	public List<String> getBannedIPAddresses();

	public BannedVisitor createBannedVisitor(BannedVisitor bannedVisitor);

	public void deleteBannedVisitor(int bannedVisitorId);
}