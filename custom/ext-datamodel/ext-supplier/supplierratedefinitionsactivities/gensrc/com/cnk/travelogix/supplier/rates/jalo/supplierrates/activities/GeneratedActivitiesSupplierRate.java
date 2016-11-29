/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import com.cnk.travelogix.supplier.rates.jalo.AbstractSupplierRate;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivitiesSupplierRate ActivitiesSupplierRate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivitiesSupplierRate extends AbstractSupplierRate
{
	/** Qualifier of the <code>ActivitiesSupplierRate.productType</code> attribute **/
	public static final String PRODUCTTYPE = "productType";
	/** Qualifier of the <code>ActivitiesSupplierRate.city</code> attribute **/
	public static final String CITY = "city";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierRate.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTTYPE, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesSupplierRate.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesSupplierRate.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesSupplierRate.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesSupplierRate.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesSupplierRate.productType</code> attribute.
	 * @return the productType
	 */
	public ActivityProductSubType getProductType(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, PRODUCTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitiesSupplierRate.productType</code> attribute.
	 * @return the productType
	 */
	public ActivityProductSubType getProductType()
	{
		return getProductType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesSupplierRate.productType</code> attribute. 
	 * @param value the productType
	 */
	public void setProductType(final SessionContext ctx, final ActivityProductSubType value)
	{
		setProperty(ctx, PRODUCTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitiesSupplierRate.productType</code> attribute. 
	 * @param value the productType
	 */
	public void setProductType(final ActivityProductSubType value)
	{
		setProductType( getSession().getSessionContext(), value );
	}
	
}
