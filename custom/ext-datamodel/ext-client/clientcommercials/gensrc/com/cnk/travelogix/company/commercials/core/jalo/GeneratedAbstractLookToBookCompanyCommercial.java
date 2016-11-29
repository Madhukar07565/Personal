/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.AbstractLookToBookCompanyCommercial AbstractLookToBookCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractLookToBookCompanyCommercial extends AbstractCompanyCommercial
{
	/** Qualifier of the <code>AbstractLookToBookCompanyCommercial.waiver</code> attribute **/
	public static final String WAIVER = "waiver";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(WAIVER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLookToBookCompanyCommercial.waiver</code> attribute.
	 * @return the waiver
	 */
	public StandardDateRange getWaiver(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, WAIVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractLookToBookCompanyCommercial.waiver</code> attribute.
	 * @return the waiver
	 */
	public StandardDateRange getWaiver()
	{
		return getWaiver( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractLookToBookCompanyCommercial.waiver</code> attribute. 
	 * @param value the waiver
	 */
	public void setWaiver(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, WAIVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractLookToBookCompanyCommercial.waiver</code> attribute. 
	 * @param value the waiver
	 */
	public void setWaiver(final StandardDateRange value)
	{
		setWaiver( getSession().getSessionContext(), value );
	}
	
}
