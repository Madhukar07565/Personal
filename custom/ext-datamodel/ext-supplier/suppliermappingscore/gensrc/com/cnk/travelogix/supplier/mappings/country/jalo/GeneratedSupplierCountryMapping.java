/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.country.jalo;

import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.country.jalo.SupplierCountry;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.country.jalo.SupplierCountryMapping SupplierCountryMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierCountryMapping extends AbstractSupplierMapping
{
	/** Qualifier of the <code>SupplierCountryMapping.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>SupplierCountryMapping.supplierCountry</code> attribute **/
	public static final String SUPPLIERCOUNTRY = "supplierCountry";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierMapping.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCOUNTRY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCountryMapping.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCountryMapping.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCountryMapping.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCountryMapping.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCountryMapping.supplierCountry</code> attribute.
	 * @return the supplierCountry
	 */
	public SupplierCountry getSupplierCountry(final SessionContext ctx)
	{
		return (SupplierCountry)getProperty( ctx, SUPPLIERCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCountryMapping.supplierCountry</code> attribute.
	 * @return the supplierCountry
	 */
	public SupplierCountry getSupplierCountry()
	{
		return getSupplierCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCountryMapping.supplierCountry</code> attribute. 
	 * @param value the supplierCountry
	 */
	public void setSupplierCountry(final SessionContext ctx, final SupplierCountry value)
	{
		setProperty(ctx, SUPPLIERCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCountryMapping.supplierCountry</code> attribute. 
	 * @param value the supplierCountry
	 */
	public void setSupplierCountry(final SupplierCountry value)
	{
		setSupplierCountry( getSession().getSessionContext(), value );
	}
	
}
