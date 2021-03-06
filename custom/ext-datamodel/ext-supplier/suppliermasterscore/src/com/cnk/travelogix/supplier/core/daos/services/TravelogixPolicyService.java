/**
 *
 */
package com.cnk.travelogix.supplier.core.daos.services;

import java.util.List;

import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.masterdata.core.enums.PolicyCategory;
import com.cnk.travelogix.masterdata.core.enums.PolicyType;
import com.cnk.travelogix.masterdata.core.model.TravelogixPolicyModel;


/**
 * @author admin
 *
 */
public interface TravelogixPolicyService
{
	public List<TravelogixPolicyModel> duplicacyOfSlab(ProductCategorySubTypeModel productCategorySubType, PolicyType policyType,
			String name, PolicyCategory policyCategory);
}
