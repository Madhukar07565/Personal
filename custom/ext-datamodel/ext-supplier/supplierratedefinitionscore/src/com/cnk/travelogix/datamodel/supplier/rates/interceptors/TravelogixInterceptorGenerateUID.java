/**
 *
 */
package com.cnk.travelogix.datamodel.supplier.rates.interceptors;

import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.PrepareInterceptor;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.model.AbstractTravelogixSupplierOfferModel;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.service.TravelogixSupplierOfferService;


/**
 * <li>To create the unique offer Id for each offer created</li>
 * <li>To validate effective from date</li>
 *
 */
public class TravelogixInterceptorGenerateUID implements PrepareInterceptor
{

	@Resource(name = "travelogixSupplierOfferService")
	private TravelogixSupplierOfferService travelogixSupplierOfferService;

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.interceptor.PrepareInterceptor#onPrepare(java.lang.Object,
	 * de.hybris.platform.servicelayer.interceptor.InterceptorContext)
	 */
	@Override
	public void onPrepare(final Object model, final InterceptorContext ctx) throws InterceptorException
	{
		final AbstractTravelogixSupplierOfferModel travelLogixModel = (AbstractTravelogixSupplierOfferModel) model;
		if (ctx.isNew(model))
		{
			travelogixSupplierOfferService.generateTravelogixId(travelLogixModel);
		}
		else if (!ctx.isModified(model, "lockedBy"))
		{
			if (StringUtils.isEmpty(travelLogixModel.getOfferName()))
			{
				throw new InterceptorException("Supplier offer name can't be null or empty.");
			}
			if (travelLogixModel.getEffectiveFrom().compareTo(new Date()) < 0)
			{
				throw new InterceptorException("Effective from date must be greater then current date");
			}
		}
	}

}
