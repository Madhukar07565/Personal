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

import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.custom.zifws.account.clear.TableOfZifstAccount;
import com.cnk.travelogix.custom.zifws.account.clear.ZIffmAccountClear;
import com.cnk.travelogix.custom.zifws.account.clear.ZifstAccount;
import com.cnk.travelogix.custom.zifws.account.clear.ZifstDocheadClear;
import com.cnk.travelogix.custom.zifws.account.clear.data.TableOfZifstAccountData;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZIffmAccountClearDataRequest;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZifstAccountData;
import com.cnk.travelogix.custom.zifws.account.clear.data.ZifstDocheadClearData;


/**
 *
 */
public class DefaultAccountClearRequestDataPopulator implements Populator<ZIffmAccountClearDataRequest, ZIffmAccountClear>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZIffmAccountClearDataRequest source, final ZIffmAccountClear target) throws ConversionException
	{
		try
		{
			final ZifstDocheadClear zifstDocheadClear = new ZifstDocheadClear();
			final TableOfZifstAccount tableOfZifstAccount = new TableOfZifstAccount();
			if (source.getIDocheader() != null)
			{
				final ZifstDocheadClearData zifstDocheadClearDataSrc = source.getIDocheader();
				zifstDocheadClear.setAccount(zifstDocheadClearDataSrc.getAccount());
				zifstDocheadClear.setAgums(zifstDocheadClearDataSrc.getAgums());
				zifstDocheadClear.setBktxt(zifstDocheadClearDataSrc.getBktxt());
				zifstDocheadClear.setBlart(zifstDocheadClearDataSrc.getBlart());
				zifstDocheadClear.setBudat(zifstDocheadClearDataSrc.getBudat());
				zifstDocheadClear.setBukrs(zifstDocheadClearDataSrc.getBukrs());
				zifstDocheadClear.setUniqid(zifstDocheadClearDataSrc.getUniqid());
				zifstDocheadClear.setWaers(zifstDocheadClearDataSrc.getWaers());
				zifstDocheadClear.setXblnr(zifstDocheadClearDataSrc.getXblnr());
			}

			if (source.getItAccount() != null)
			{
				final List<ZifstAccount> zifstAccounts = tableOfZifstAccount.getItem();
				final TableOfZifstAccountData tableOfZifstAccountData = source.getItAccount();
				final List<ZifstAccountData> accountDatas = tableOfZifstAccountData.getItem();
				for (final ZifstAccountData zifstAccountData : accountDatas)
				{
					final ZifstAccount zifstAccount = new ZifstAccount();
					zifstAccount.setAccount(zifstAccountData.getAccount());
					zifstAccount.setBelnr(zifstAccountData.getBelnr());
					zifstAccount.setBudat(zifstAccountData.getBudat());
					zifstAccount.setWrbtr(zifstAccountData.getWrbtr());
					zifstAccount.setXblnr(zifstAccountData.getXblnr());
					zifstAccount.setZuonr(zifstAccountData.getZuonr());

					zifstAccounts.add(zifstAccount);
				}
			}
			target.setIDocheader(zifstDocheadClear);
			target.setItAccount(tableOfZifstAccount);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}



}
