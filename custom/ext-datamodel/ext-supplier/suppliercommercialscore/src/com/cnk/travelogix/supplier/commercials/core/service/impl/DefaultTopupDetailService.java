/**
 *
 */
package com.cnk.travelogix.supplier.commercials.core.service.impl;

import de.hybris.platform.commerceservices.customer.DuplicateUidException;

import org.apache.log4j.Logger;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.model.TopupDetailModel;
import com.cnk.travelogix.supplier.commercials.core.dao.TopupDetailDao;
import com.cnk.travelogix.supplier.commercials.core.service.TopupDetailService;


/**
 *
 */
public class DefaultTopupDetailService implements TopupDetailService
{
	private static final Logger LOG = Logger.getLogger(DefaultTopupDetailService.class);
	private TopupDetailDao topupDetailDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.supplier.commercials.core.service.TopupDetailService#getTopupDetails(java.lang.Double,
	 * de.hybris.platform.core.model.c2l.CurrencyModel, java.lang.Double)
	 */
	@Override
	public TopupDetailModel getTopupDetails(final TopupDetailModel topupDetailModel) throws DuplicateUidException
	{
		try
		{
			return topupDetailDao.getTopupDetails(topupDetailModel.getAmount(), topupDetailModel.getCurrency(),
					topupDetailModel.getIncentivePercentage());
		}

		catch (final DuplicateUidException e)
		{
			LOG.error(e);
			throw new DuplicateUidException();
		}
	}

	/**
	 * @return the topupDetailDao
	 */
	public TopupDetailDao getTopupDetailDao()
	{
		return topupDetailDao;
	}

	/**
	 * @param topupDetailDao
	 *           the topupDetailDao to set
	 */
	public void setTopupDetailDao(final TopupDetailDao topupDetailDao)
	{
		this.topupDetailDao = topupDetailDao;
	}

}
