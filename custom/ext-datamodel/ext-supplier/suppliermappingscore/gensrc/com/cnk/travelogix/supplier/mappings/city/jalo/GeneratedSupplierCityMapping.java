/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.city.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.supplier.mappings.city.jalo.SupplierCity;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.city.jalo.SupplierCityMapping SupplierCityMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierCityMapping extends AbstractSupplierMapping
{
	/** Qualifier of the <code>SupplierCityMapping.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>SupplierCityMapping.supplierCity</code> attribute **/
	public static final String SUPPLIERCITY = "supplierCity";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierMapping.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCityMapping.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCityMapping.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCityMapping.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCityMapping.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCityMapping.supplierCity</code> attribute.
	 * @return the supplierCity
	 */
	public SupplierCity getSupplierCity(final SessionContext ctx)
	{
		return (SupplierCity)getProperty( ctx, SUPPLIERCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCityMapping.supplierCity</code> attribute.
	 * @return the supplierCity
	 */
	public SupplierCity getSupplierCity()
	{
		return getSupplierCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCityMapping.supplierCity</code> attribute. 
	 * @param value the supplierCity
	 */
	public void setSupplierCity(final SessionContext ctx, final SupplierCity value)
	{
		setProperty(ctx, SUPPLIERCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCityMapping.supplierCity</code> attribute. 
	 * @param value the supplierCity
	 */
	public void setSupplierCity(final SupplierCity value)
	{
		setSupplierCity( getSession().getSessionContext(), value );
	}
	
}
