/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Ancillary Ancillary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAncillary extends Product
{
	/** Qualifier of the <code>Ancillary.ancillaryType</code> attribute **/
	public static final String ANCILLARYTYPE = "ancillaryType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ANCILLARYTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ancillary.ancillaryType</code> attribute.
	 * @return the ancillaryType - Ancillary Type
	 */
	public EnumerationValue getAncillaryType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ANCILLARYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ancillary.ancillaryType</code> attribute.
	 * @return the ancillaryType - Ancillary Type
	 */
	public EnumerationValue getAncillaryType()
	{
		return getAncillaryType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ancillary.ancillaryType</code> attribute. 
	 * @param value the ancillaryType - Ancillary Type
	 */
	public void setAncillaryType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ANCILLARYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ancillary.ancillaryType</code> attribute. 
	 * @param value the ancillaryType - Ancillary Type
	 */
	public void setAncillaryType(final EnumerationValue value)
	{
		setAncillaryType( getSession().getSessionContext(), value );
	}
	
}
