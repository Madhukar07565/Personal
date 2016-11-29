/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.promotions.jalo.AbstractPromotionRestriction;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.OfferBookingValidityRestriction OfferBookingValidityRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOfferBookingValidityRestriction extends AbstractPromotionRestriction
{
	/** Qualifier of the <code>OfferBookingValidityRestriction.bookingValidity</code> attribute **/
	public static final String BOOKINGVALIDITY = "bookingValidity";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPromotionRestriction.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BOOKINGVALIDITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBookingValidityRestriction.bookingValidity</code> attribute.
	 * @return the bookingValidity
	 */
	public StandardDateRange getBookingValidity(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, BOOKINGVALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferBookingValidityRestriction.bookingValidity</code> attribute.
	 * @return the bookingValidity
	 */
	public StandardDateRange getBookingValidity()
	{
		return getBookingValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBookingValidityRestriction.bookingValidity</code> attribute. 
	 * @param value the bookingValidity
	 */
	public void setBookingValidity(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, BOOKINGVALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferBookingValidityRestriction.bookingValidity</code> attribute. 
	 * @param value the bookingValidity
	 */
	public void setBookingValidity(final StandardDateRange value)
	{
		setBookingValidity( getSession().getSessionContext(), value );
	}
	
}
