/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.RetainCompanyCommercials RetainCompanyCommercials}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRetainCompanyCommercials extends GenericItem
{
	/** Qualifier of the <code>RetainCompanyCommercials.companyCommercials</code> attribute **/
	public static final String COMPANYCOMMERCIALS = "companyCommercials";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANYCOMMERCIALS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RetainCompanyCommercials.companyCommercials</code> attribute.
	 * @return the companyCommercials - Policy Company Commercials
	 */
	public EnumerationValue getCompanyCommercials(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYCOMMERCIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RetainCompanyCommercials.companyCommercials</code> attribute.
	 * @return the companyCommercials - Policy Company Commercials
	 */
	public EnumerationValue getCompanyCommercials()
	{
		return getCompanyCommercials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RetainCompanyCommercials.companyCommercials</code> attribute. 
	 * @param value the companyCommercials - Policy Company Commercials
	 */
	public void setCompanyCommercials(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYCOMMERCIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RetainCompanyCommercials.companyCommercials</code> attribute. 
	 * @param value the companyCommercials - Policy Company Commercials
	 */
	public void setCompanyCommercials(final EnumerationValue value)
	{
		setCompanyCommercials( getSession().getSessionContext(), value );
	}
	
}
