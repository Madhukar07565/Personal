/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.product.common.core.impex.decorator;

import de.hybris.platform.impex.jalo.header.AbstractImpExCSVCellDecorator;
import de.hybris.platform.util.Config;

import java.util.Map;

import org.apache.commons.lang.StringUtils;



/**
 * Based on column value get approval status (approved/unapproved)
 */
public class ArticleStatusDataDecorator extends AbstractImpExCSVCellDecorator
{

	@Override
	public String decorate(final int position, final Map<Integer, String> srcLine)
	{
		final String status = srcLine.get(Integer.valueOf(position));
		if (StringUtils.isNotBlank(status))
		{
			return "active".equalsIgnoreCase(status) ? Config.getParameter("article.status.approved")
					: "inactive".equalsIgnoreCase(status) ? Config.getParameter("article.status.unapproved") : null;
		}
		return null;
	}
}
