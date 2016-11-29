/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.OtherSurcharge OtherSurcharge}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOtherSurcharge extends GenericItem
{
	/** Qualifier of the <code>OtherSurcharge.details</code> attribute **/
	public static final String DETAILS = "details";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherSurcharge.details</code> attribute.
	 * @return the details
	 */
	public String getDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherSurcharge.details</code> attribute.
	 * @return the details
	 */
	public String getDetails()
	{
		return getDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherSurcharge.details</code> attribute. 
	 * @param value the details
	 */
	public void setDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherSurcharge.details</code> attribute. 
	 * @param value the details
	 */
	public void setDetails(final String value)
	{
		setDetails( getSession().getSessionContext(), value );
	}
	
}
