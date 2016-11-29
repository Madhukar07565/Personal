/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractProductDocument;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayBrand;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayProduct;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.HolidaysProductDocument HolidaysProductDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidaysProductDocument extends AbstractProductDocument
{
	/** Qualifier of the <code>HolidaysProductDocument.flavorType</code> attribute **/
	public static final String FLAVORTYPE = "flavorType";
	/** Qualifier of the <code>HolidaysProductDocument.destination</code> attribute **/
	public static final String DESTINATION = "destination";
	/** Qualifier of the <code>HolidaysProductDocument.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>HolidaysProductDocument.brand</code> attribute **/
	public static final String BRAND = "brand";
	/** Qualifier of the <code>HolidaysProductDocument.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>HolidaysProductDocument.productFlavorName</code> attribute **/
	public static final String PRODUCTFLAVORNAME = "productFlavorName";
	/** Qualifier of the <code>HolidaysProductDocument.companyPackageCategory</code> attribute **/
	public static final String COMPANYPACKAGECATEGORY = "companyPackageCategory";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractProductDocument.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FLAVORTYPE, AttributeMode.INITIAL);
		tmp.put(DESTINATION, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(BRAND, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(PRODUCTFLAVORNAME, AttributeMode.INITIAL);
		tmp.put(COMPANYPACKAGECATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.brand</code> attribute.
	 * @return the brand - Holidays Product Brand
	 */
	public HolidayBrand getBrand(final SessionContext ctx)
	{
		return (HolidayBrand)getProperty( ctx, BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.brand</code> attribute.
	 * @return the brand - Holidays Product Brand
	 */
	public HolidayBrand getBrand()
	{
		return getBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.brand</code> attribute. 
	 * @param value the brand - Holidays Product Brand
	 */
	public void setBrand(final SessionContext ctx, final HolidayBrand value)
	{
		setProperty(ctx, BRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.brand</code> attribute. 
	 * @param value the brand - Holidays Product Brand
	 */
	public void setBrand(final HolidayBrand value)
	{
		setBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.companyPackageCategory</code> attribute.
	 * @return the companyPackageCategory - Holidays Product Product Package Category
	 */
	public EnumerationValue getCompanyPackageCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYPACKAGECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.companyPackageCategory</code> attribute.
	 * @return the companyPackageCategory - Holidays Product Product Package Category
	 */
	public EnumerationValue getCompanyPackageCategory()
	{
		return getCompanyPackageCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.companyPackageCategory</code> attribute. 
	 * @param value the companyPackageCategory - Holidays Product Product Package Category
	 */
	public void setCompanyPackageCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYPACKAGECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.companyPackageCategory</code> attribute. 
	 * @param value the companyPackageCategory - Holidays Product Product Package Category
	 */
	public void setCompanyPackageCategory(final EnumerationValue value)
	{
		setCompanyPackageCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.country</code> attribute.
	 * @return the country - Holidays Product Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.country</code> attribute.
	 * @return the country - Holidays Product Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.country</code> attribute. 
	 * @param value the country - Holidays Product Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.country</code> attribute. 
	 * @param value the country - Holidays Product Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.destination</code> attribute.
	 * @return the destination - Holidays Product Destination
	 */
	public Continent getDestination(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, DESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.destination</code> attribute.
	 * @return the destination - Holidays Product Destination
	 */
	public Continent getDestination()
	{
		return getDestination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.destination</code> attribute. 
	 * @param value the destination - Holidays Product Destination
	 */
	public void setDestination(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, DESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.destination</code> attribute. 
	 * @param value the destination - Holidays Product Destination
	 */
	public void setDestination(final Continent value)
	{
		setDestination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.flavorType</code> attribute.
	 * @return the flavorType - Holidays Product Flavor Type
	 */
	public HolidayFlavor getFlavorType(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, FLAVORTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.flavorType</code> attribute.
	 * @return the flavorType - Holidays Product Flavor Type
	 */
	public HolidayFlavor getFlavorType()
	{
		return getFlavorType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.flavorType</code> attribute. 
	 * @param value the flavorType - Holidays Product Flavor Type
	 */
	public void setFlavorType(final SessionContext ctx, final HolidayFlavor value)
	{
		setProperty(ctx, FLAVORTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.flavorType</code> attribute. 
	 * @param value the flavorType - Holidays Product Flavor Type
	 */
	public void setFlavorType(final HolidayFlavor value)
	{
		setFlavorType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.productFlavorName</code> attribute.
	 * @return the productFlavorName - Holidays Product Product Flavor Name
	 */
	public HolidayFlavor getProductFlavorName(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, PRODUCTFLAVORNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.productFlavorName</code> attribute.
	 * @return the productFlavorName - Holidays Product Product Flavor Name
	 */
	public HolidayFlavor getProductFlavorName()
	{
		return getProductFlavorName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.productFlavorName</code> attribute. 
	 * @param value the productFlavorName - Holidays Product Product Flavor Name
	 */
	public void setProductFlavorName(final SessionContext ctx, final HolidayFlavor value)
	{
		setProperty(ctx, PRODUCTFLAVORNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.productFlavorName</code> attribute. 
	 * @param value the productFlavorName - Holidays Product Product Flavor Name
	 */
	public void setProductFlavorName(final HolidayFlavor value)
	{
		setProductFlavorName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.productName</code> attribute.
	 * @return the productName - Holidays Product Product Name
	 */
	public HolidayProduct getProductName(final SessionContext ctx)
	{
		return (HolidayProduct)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysProductDocument.productName</code> attribute.
	 * @return the productName - Holidays Product Product Name
	 */
	public HolidayProduct getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.productName</code> attribute. 
	 * @param value the productName - Holidays Product Product Name
	 */
	public void setProductName(final SessionContext ctx, final HolidayProduct value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysProductDocument.productName</code> attribute. 
	 * @param value the productName - Holidays Product Product Name
	 */
	public void setProductName(final HolidayProduct value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
}
