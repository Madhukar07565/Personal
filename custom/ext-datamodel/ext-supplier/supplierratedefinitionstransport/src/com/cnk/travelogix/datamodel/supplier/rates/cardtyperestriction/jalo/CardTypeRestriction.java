package com.cnk.travelogix.datamodel.supplier.rates.cardtyperestriction.jalo;

import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.AbstractOrder;
import de.hybris.platform.jalo.product.Product;

import java.util.Collection;
import java.util.Date;

import org.apache.log4j.Logger;


public class CardTypeRestriction extends GeneratedCardTypeRestriction
{
	@SuppressWarnings("unused")
	private final static Logger LOG = Logger.getLogger(CardTypeRestriction.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.promotions.jalo.AbstractPromotionRestriction#evaluate(de.hybris.platform.jalo.SessionContext,
	 * java.util.Collection, java.util.Date, de.hybris.platform.jalo.order.AbstractOrder)
	 */
	@Override
	public RestrictionResult evaluate(final SessionContext arg0, final Collection<Product> arg1, final Date arg2,
			final AbstractOrder arg3)
	{
		// YTODO Auto-generated method stub
		return null;
	}



}
