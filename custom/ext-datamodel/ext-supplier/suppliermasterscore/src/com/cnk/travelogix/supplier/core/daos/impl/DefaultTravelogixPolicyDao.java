/**
 *
 */
package com.cnk.travelogix.supplier.core.daos.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.servicelayer.internal.dao.AbstractItemDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;

import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.masterdata.core.enums.PolicyCategory;
import com.cnk.travelogix.masterdata.core.enums.PolicyType;
import com.cnk.travelogix.masterdata.core.model.TravelogixPolicyModel;
import com.cnk.travelogix.supplier.core.daos.TravelogixPolicyDao;


/**
 * @author admin
 *
 */
public class DefaultTravelogixPolicyDao extends AbstractItemDao implements TravelogixPolicyDao
{
	private static final Logger LOG = Logger.getLogger(DefaultTravelogixPolicyDao.class);



	String DUPLICATE_SLAB = "SELECT {" + TravelogixPolicyModel.PK + "} FROM {" + TravelogixPolicyModel._TYPECODE + "} WHERE {"
			+ TravelogixPolicyModel.PRODUCTCATEGORYSUBTYPE + "} = ?productCategorySubType and {" + TravelogixPolicyModel.POLICYTYPE
			+ "} = ?policyType and {" + TravelogixPolicyModel.NAME + "} = ?name and {" + TravelogixPolicyModel.POLICYCATEGORY
			+ "} = ?policyCategory";

	@Override
	public List<TravelogixPolicyModel> duplicacyOfSlab(final ProductCategorySubTypeModel productCategorySubType,
			final PolicyType policyType, final String name, final PolicyCategory policyCategory)
	{
		validateParameterNotNull(productCategorySubType, " ProductCategorySubType Should not null");
		final FlexibleSearchQuery query = new FlexibleSearchQuery(DUPLICATE_SLAB);
		query.addQueryParameter("productCategorySubType", productCategorySubType);
		query.addQueryParameter("policyType", policyType);
		query.addQueryParameter("name", name);
		query.addQueryParameter("policyCategory", policyCategory);

		return getFlexibleSearchService().<TravelogixPolicyModel> search(query).getResult();
	}



}
