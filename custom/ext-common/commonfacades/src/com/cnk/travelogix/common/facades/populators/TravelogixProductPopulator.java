/**
 *
 */
package com.cnk.travelogix.common.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.util.Assert;


/**
 * @author C5244544
 *
 */
public class TravelogixProductPopulator extends ProductPopulator
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		super.populate(source, target);

		//		target.setFirstBookingCheck(source.getFirstBookingCheck());
		//		target.setIsProductSharable(source.getIsProductSharable());
	}
}
