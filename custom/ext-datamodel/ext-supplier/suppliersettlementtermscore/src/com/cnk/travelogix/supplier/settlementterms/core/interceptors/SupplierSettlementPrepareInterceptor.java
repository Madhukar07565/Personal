/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP Hybris ("Confidential Information"). You shall
 * not disclose such Confidential Information and shall use it only in accordance with the terms of the license
 * agreement you entered into with SAP Hybris.
 *
 * package com.cnk.travelogix.supplier.settlementterms.core.interceptors;
 *
 * import de.hybris.platform.servicelayer.interceptor.InterceptorContext; import
 * de.hybris.platform.servicelayer.interceptor.InterceptorException; import
 * de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
 *
 * import com.cnk.travelogix.supplier.settlementterms.core.services.impl.SettlementTermIdService; import
 * com.cnk.travelogix.supplier.settlementterms.model.AbstractSupplierSettlementModel;
 *
 *
 */
package com.cnk.travelogix.supplier.settlementterms.core.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;
import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import com.cnk.travelogix.supplier.settlementterms.model.SupplierSettlementModel;


public class SupplierSettlementPrepareInterceptor implements PrepareInterceptor
{
	private KeyGenerator keyGenerator;

	// this method will generate unique settlement term id
	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		if (ctx.isNew(model))
		{
			final SupplierSettlementModel supplierSettlementModel = (SupplierSettlementModel) model;
			supplierSettlementModel.setCode(keyGenerator.generate().toString());
		}
		else if (null != ctx.getDirtyAttributes(model).get("code"))
		{
			ctx.getDirtyAttributes(model).get("code").clear();
		}
	}

	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;

	}

}
