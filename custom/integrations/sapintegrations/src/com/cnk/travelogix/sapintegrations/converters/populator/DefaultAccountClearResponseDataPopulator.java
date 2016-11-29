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
package com.cnk.travelogix.sapintegrations.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.commons.error.Error;
import com.cnk.travelogix.constants.SapintegrationsConstants;
import com.cnk.travelogix.custom.zifws.account.clear.ZIffmAccountClearResponse;
import com.cnk.travelogix.custom.zifws.account.clear.ZifstAccount;
import com.cnk.travelogix.custom.zifws.account.clear.ZifstStatusDoc;
import com.cnk.travelogix.custom.zifws.account.clear.data.TableOfZifstAccountData;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZIffmAccountClearDataResponse;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZifstAccountData;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZifstStatusDocData;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZifttStatusDocData;



public class DefaultAccountClearResponseDataPopulator extends AbstractErrorResponsePopulator
		implements Populator<ZIffmAccountClearResponse, ZIffmAccountClearDataResponse>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZIffmAccountClearResponse source, final ZIffmAccountClearDataResponse target)
			throws ConversionException
	{
		try
		{
			final ZifttStatusDocData zifttStatusDocData = new ZifttStatusDocData();
			final TableOfZifstAccountData tableOfZifstAccountData = new TableOfZifstAccountData();
			final List<ZifstStatusDoc> statues = source.getEStatus() == null ? new ArrayList() : source.getEStatus().getItem();
			for (final ZifstStatusDoc statusC : statues)
			{
				final ZifstStatusDocData zifstStatusDocData = new ZifstStatusDocData();
				zifstStatusDocData.setDocnumber(statusC.getDocnumber());
				zifstStatusDocData.setMessage(statusC.getMessage());
				zifstStatusDocData.setMessagetype(statusC.getMessagetype());
				zifstStatusDocData.setStatus(statusC.getStatus());
				zifstStatusDocData.setSysubrc(statusC.getSysubrc());
				zifstStatusDocData.setUniqid(statusC.getUniqid());

				zifttStatusDocData.getItem().add(zifstStatusDocData);
				if (SapintegrationsConstants.ERROR_STATUS.equalsIgnoreCase(statusC.getStatus()))
				{
					final Error er = new Error();
					er.setCode(statusC.getStatus());
					er.setMessage(statusC.getMessage());
					target.getErrors().add(populateError(er));
				}
			}

			if (source.getItAccount() != null)
			{
				for (final ZifstAccount zifstAccount : source.getItAccount().getItem())
				{
					final ZifstAccountData zifstAccountData = new ZifstAccountData();
					zifstAccountData.setAccount(zifstAccount.getAccount());
					zifstAccountData.setBelnr(zifstAccount.getBelnr());
					zifstAccountData.setBudat(zifstAccount.getBudat());
					zifstAccountData.setWrbtr(zifstAccount.getWrbtr());
					zifstAccountData.setXblnr(zifstAccount.getXblnr());
					zifstAccountData.setZuonr(zifstAccount.getZuonr());

					tableOfZifstAccountData.getItem().add(zifstAccountData);
				}
			}

			target.setEStatus(zifttStatusDocData);
			target.setItAccount(tableOfZifstAccountData);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}
}
