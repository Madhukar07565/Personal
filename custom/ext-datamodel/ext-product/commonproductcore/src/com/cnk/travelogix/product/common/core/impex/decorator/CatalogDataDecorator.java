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
 * To retrieve the catalog based on company id
 */
public class CatalogDataDecorator extends AbstractImpExCSVCellDecorator
{

	@Override
	public String decorate(final int position, final Map<Integer, String> srcLine)
	{
		final String companyId = srcLine.get(Integer.valueOf(position));
		if (StringUtils.isNotBlank(companyId) && StringUtils.contains(companyId, ":"))
		{
			final String[] data = StringUtils.split(companyId, ":");
			final StringBuilder stringBuilder = new StringBuilder();

			if (StringUtils.startsWith(companyId, ":"))
			{
				stringBuilder.append(":");
			}
			for (int i = 0; i < data.length - 1; i++)
			{
				stringBuilder.append(data[i] + ":");
			}
			if (StringUtils.endsWith(companyId, ":"))
			{
				stringBuilder.append(":Staged");
			}

			return ("Staged").equalsIgnoreCase(data[data.length - 1]) ? stringBuilder.append(data[data.length - 1]).toString()
					: stringBuilder.append(Config.getParameter("company.catalog." + data[data.length - 1].toLowerCase()) + ":Staged")
							.toString();
		}
		else if (StringUtils.isNotBlank(companyId))
		{
			return Config.getParameter("company.catalog." + companyId.toLowerCase()) + ":Staged";
		}
		return null;
	}

}