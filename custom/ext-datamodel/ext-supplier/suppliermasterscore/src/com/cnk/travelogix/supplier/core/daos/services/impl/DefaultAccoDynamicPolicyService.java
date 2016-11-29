/**
 *
 */
package com.cnk.travelogix.supplier.core.daos.services.impl;

import java.util.List;

import com.cnk.travelogix.masterdata.core.enums.PolicyDefinedByType;
import com.cnk.travelogix.supplier.core.daos.AccoDynamicPolicyDao;
import com.cnk.travelogix.supplier.core.daos.services.AccoDynamicPolicyService;
import com.cnk.travelogix.supplier.masterdata.core.model.AccoDynamicPolicyModel;


/**
 * @author admin
 *
 */
public class DefaultAccoDynamicPolicyService implements AccoDynamicPolicyService
{

	AccoDynamicPolicyDao accoDynamicPolicyDao;

	@Override
	public List<AccoDynamicPolicyModel> fetchFromToAndPercentage(final Double chargesInPercentage, final Integer fromDaysHour,
			final Integer toDaysHour)
	{

		return accoDynamicPolicyDao.fetchFromToAndPercentage(chargesInPercentage, fromDaysHour, toDaysHour);
	}

	@Override
	public List<AccoDynamicPolicyModel> fetchSlabOfDayAndHour(final Integer fromDaysHour, final Integer toDaysHour)
	{
		return accoDynamicPolicyDao.fetchSlabOfDayAndHour(fromDaysHour, toDaysHour);
	}

	@Override
	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeInPer(final Double chargesInPercentage)
	{
		return accoDynamicPolicyDao.checkDuplicacyOfChargeInPer(chargesInPercentage);
	}

	@Override
	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeAmout(final Double chargesAmount)
	{
		return accoDynamicPolicyDao.checkDuplicacyOfChargeAmout(chargesAmount);
	}

	@Override
	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeNight(final Double chargeNight)
	{
		return accoDynamicPolicyDao.checkDuplicacyOfChargeNight(chargeNight);
	}

	@Override
	public AccoDynamicPolicyModel checkContinuationOfSlab(final Integer fromDaysHour, final Integer toDaysHour,
			final PolicyDefinedByType definedBy)
	{
		return accoDynamicPolicyDao.checkContinuationOfSlab(fromDaysHour, toDaysHour, definedBy);
	}


	public AccoDynamicPolicyDao getAccoDynamicPolicyDao()
	{
		return accoDynamicPolicyDao;
	}

	public void setAccoDynamicPolicyDao(final AccoDynamicPolicyDao accoDynamicPolicyDao)
	{
		this.accoDynamicPolicyDao = accoDynamicPolicyDao;
	}
}
