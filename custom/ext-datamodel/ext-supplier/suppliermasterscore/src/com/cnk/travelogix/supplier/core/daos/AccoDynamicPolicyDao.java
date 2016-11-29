/**
 *
 */
package com.cnk.travelogix.supplier.core.daos;

import java.util.List;

import com.cnk.travelogix.masterdata.core.enums.PolicyDefinedByType;
import com.cnk.travelogix.supplier.masterdata.core.model.AccoDynamicPolicyModel;


/**
 * Find FlightProduct for given to fetch from, to , percentage
 *
 */
public interface AccoDynamicPolicyDao
{
	public List<AccoDynamicPolicyModel> fetchFromToAndPercentage(final Double chargesInPercentage, final Integer fromDaysHour,
			final Integer toDaysHour);

	/**
	 * @param fromDaysHour
	 * @param toDaysHour
	 * @return
	 */
	List<AccoDynamicPolicyModel> fetchSlabOfDayAndHour(Integer fromDaysHour, Integer toDaysHour);

	/**
	 * @param chargeNight
	 * @return
	 */
	List<AccoDynamicPolicyModel> checkDuplicacyOfChargeNight(Double chargeNight);

	/**
	 * @param chargesAmount
	 * @return
	 */
	List<AccoDynamicPolicyModel> checkDuplicacyOfChargeAmout(Double chargesAmount);

	/**
	 * @param chargesInPercentage
	 * @return
	 */
	List<AccoDynamicPolicyModel> checkDuplicacyOfChargeInPer(Double chargesInPercentage);


	public AccoDynamicPolicyModel checkContinuationOfSlab(Integer fromDaysHour, Integer toDaysHour, PolicyDefinedByType definedBy);
}

