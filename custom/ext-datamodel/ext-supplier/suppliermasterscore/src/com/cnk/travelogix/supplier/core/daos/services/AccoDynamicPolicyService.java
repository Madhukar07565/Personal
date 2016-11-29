/**
 *
 */
package com.cnk.travelogix.supplier.core.daos.services;

import java.util.List;

import com.cnk.travelogix.masterdata.core.enums.PolicyDefinedByType;
import com.cnk.travelogix.supplier.masterdata.core.model.AccoDynamicPolicyModel;


/**
 * check duplicacy in from, to, defined by
 *
 */
public interface AccoDynamicPolicyService
{
	public List<AccoDynamicPolicyModel> fetchFromToAndPercentage(final Double chargesInPercentage, final Integer fromDaysHour,
			final Integer toDaysHour);

	public List<AccoDynamicPolicyModel> fetchSlabOfDayAndHour(Integer fromDaysHour, Integer toDaysHour);


	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeInPer(Double chargesInPercentage);


	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeAmout(Double chargesAmount);

	public List<AccoDynamicPolicyModel> checkDuplicacyOfChargeNight(Double chargeNight);

	public AccoDynamicPolicyModel checkContinuationOfSlab(Integer fromDaysHour, Integer toDaysHour, PolicyDefinedByType definedBy);





}
