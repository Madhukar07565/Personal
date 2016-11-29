/**
 *
 */
package com.cnk.travelogix.supplier.core.daos.services.impl;

import java.util.List;

import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.masterdata.core.enums.PolicyCategory;
import com.cnk.travelogix.masterdata.core.enums.PolicyType;
import com.cnk.travelogix.masterdata.core.model.TravelogixPolicyModel;
import com.cnk.travelogix.supplier.core.daos.TravelogixPolicyDao;
import com.cnk.travelogix.supplier.core.daos.services.TravelogixPolicyService;


/**
 * @author admin
 *
 */
public class DefaultTravelogixPolicyService implements TravelogixPolicyService
{
	TravelogixPolicyDao travelogixPolicyDao;

	@Override
	public List<TravelogixPolicyModel> duplicacyOfSlab(final ProductCategorySubTypeModel productCategorySubType,
			final PolicyType policyType, final String name, final PolicyCategory policyCategory)
	{
		return travelogixPolicyDao.duplicacyOfSlab(productCategorySubType, policyType, name, policyCategory);

	}

	public TravelogixPolicyDao getTravelogixPolicyDao()
	{
		return travelogixPolicyDao;
	}

	public void setTravelogixPolicyDao(final TravelogixPolicyDao travelogixPolicyDao)
	{
		this.travelogixPolicyDao = travelogixPolicyDao;
	}

}
