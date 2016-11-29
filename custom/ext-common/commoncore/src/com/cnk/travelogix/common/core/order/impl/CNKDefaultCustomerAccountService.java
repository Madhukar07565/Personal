/**
 *
 */
package com.cnk.travelogix.common.core.order.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

import de.hybris.platform.commerceservices.customer.impl.DefaultCustomerAccountService;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;
import de.hybris.platform.core.model.order.AbstractOrderEntryModel;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.store.BaseStoreModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.common.core.model.TravellerModel;
import com.cnk.travelogix.common.core.order.CNKCustomerAccountService;
import com.cnk.travelogix.common.core.order.OrderSearchCondition;
import com.cnk.travelogix.common.core.order.dao.CNKCustomerAccountDao;



/**
 * @author i054410
 *
 */
public class CNKDefaultCustomerAccountService extends DefaultCustomerAccountService implements CNKCustomerAccountService
{

	private CNKCustomerAccountDao customerAccountDao;

	public SearchPageData<OrderModel> searchBookingList(final CustomerModel customerModel, final BaseStoreModel store,
			final OrderSearchCondition osc, final PageableData pageableData)
	{

		validateParameterNotNull(customerModel, "Customer model cannot be null");
		validateParameterNotNull(store, "Store must not be null");
		validateParameterNotNull(pageableData, "PageableData must not be null");
		final SearchPageData<OrderModel> searchBookingList = ((CNKCustomerAccountDao) getCustomerAccountDao())
				.searchBookingList(customerModel, store, osc, pageableData);

//		if (StringUtils.isNotBlank(osc.getPassengerName()))
//		{
//			final String[] split = osc.getPassengerName().split(" ");
//
//			final List<OrderModel> results = new ArrayList<OrderModel>();
//
//			for (final OrderModel om : searchBookingList.getResults())
//			{
//				boolean contains = false;
//				final List<AbstractOrderEntryModel> entries = om.getEntries();
//				for (final AbstractOrderEntryModel aom : entries)
//				{	
//					final Set<TravellerModel> traveller = aom.getTraveller();
//					for (final TravellerModel tm : traveller)
//					{	
//						if (contains = containTraveller(tm, split))
//						{	
//							break;
//						}
//					}
//					if (contains)
//					{
//						break;
//					}
//
//				}
//				if (contains)
//				{
//					results.add(om);
//				}
//
//			}
//			searchBookingList.setResults(results);
//		}
		return searchBookingList;

	}
	
//	private boolean containTraveller(TravellerModel tm, String[] split){
//		final String name = tm.getFirstName() + " " + tm.getMiddleName() + " " + tm.getLastName();
//		boolean shouldAdd = true;
//		
//		for(String pName : split){
//			if(!StringUtils.contains(name, pName)){
//				shouldAdd = false;
//				break;
//			}
//		}
//		return shouldAdd;
//	}
	
	
	
}
