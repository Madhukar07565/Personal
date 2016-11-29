/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AncillaryDetails AncillaryDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAncillaryDetails extends GenericItem
{
	/** Qualifier of the <code>AncillaryDetails.ancillaryType</code> attribute **/
	public static final String ANCILLARYTYPE = "ancillaryType";
	/** Qualifier of the <code>AncillaryDetails.ancillaryName</code> attribute **/
	public static final String ANCILLARYNAME = "ancillaryName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ANCILLARYTYPE, AttributeMode.INITIAL);
		tmp.put(ANCILLARYNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDetails.ancillaryName</code> attribute.
	 * @return the ancillaryName - Company Policy Cabin Type
	 */
	public Ancillary getAncillaryName(final SessionContext ctx)
	{
		return (Ancillary)getProperty( ctx, ANCILLARYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDetails.ancillaryName</code> attribute.
	 * @return the ancillaryName - Company Policy Cabin Type
	 */
	public Ancillary getAncillaryName()
	{
		return getAncillaryName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDetails.ancillaryName</code> attribute. 
	 * @param value the ancillaryName - Company Policy Cabin Type
	 */
	public void setAncillaryName(final SessionContext ctx, final Ancillary value)
	{
		setProperty(ctx, ANCILLARYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDetails.ancillaryName</code> attribute. 
	 * @param value the ancillaryName - Company Policy Cabin Type
	 */
	public void setAncillaryName(final Ancillary value)
	{
		setAncillaryName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDetails.ancillaryType</code> attribute.
	 * @return the ancillaryType - Company Policy Cabin Category
	 */
	public EnumerationValue getAncillaryType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ANCILLARYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryDetails.ancillaryType</code> attribute.
	 * @return the ancillaryType - Company Policy Cabin Category
	 */
	public EnumerationValue getAncillaryType()
	{
		return getAncillaryType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDetails.ancillaryType</code> attribute. 
	 * @param value the ancillaryType - Company Policy Cabin Category
	 */
	public void setAncillaryType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ANCILLARYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryDetails.ancillaryType</code> attribute. 
	 * @param value the ancillaryType - Company Policy Cabin Category
	 */
	public void setAncillaryType(final EnumerationValue value)
	{
		setAncillaryType( getSession().getSessionContext(), value );
	}
	
}
