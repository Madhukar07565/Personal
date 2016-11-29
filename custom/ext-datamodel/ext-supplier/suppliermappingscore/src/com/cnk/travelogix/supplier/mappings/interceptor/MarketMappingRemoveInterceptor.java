package com.cnk.travelogix.supplier.mappings.interceptor;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.RemoveInterceptor;

import com.cnk.travelogix.supplier.mappings.market.model.MarketMappingModel;


public class MarketMappingRemoveInterceptor implements RemoveInterceptor<MarketMappingModel>
{
	@Override
	public void onRemove(final MarketMappingModel mappingModel, final InterceptorContext ctx) throws InterceptorException
	{
		if (mappingModel.getApprovalStatus().equals(ArticleApprovalStatus.APPROVED))
		{
			throw new InterceptorException(
					"Please update the mapping status as 'Inactive' in 'Company - SupplierMarketmapping', before deleting the Supplier/Company Market'");
		}
	}

}