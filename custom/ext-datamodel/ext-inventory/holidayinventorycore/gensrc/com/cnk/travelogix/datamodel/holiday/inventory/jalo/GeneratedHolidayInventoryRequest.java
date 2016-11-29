/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.holiday.inventory.jalo;

import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryRequest;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayProduct;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.holiday.inventory.jalo.HolidayInventoryRequest HolidayInventoryRequest}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayInventoryRequest extends AbstractInventoryRequest
{
	/** Qualifier of the <code>HolidayInventoryRequest.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>HolidayInventoryRequest.productFlavour</code> attribute **/
	public static final String PRODUCTFLAVOUR = "productFlavour";
	/** Qualifier of the <code>HolidayInventoryRequest.priceRangeFrom</code> attribute **/
	public static final String PRICERANGEFROM = "priceRangeFrom";
	/** Qualifier of the <code>HolidayInventoryRequest.priceRangeTo</code> attribute **/
	public static final String PRICERANGETO = "priceRangeTo";
	/** Qualifier of the <code>HolidayInventoryRequest.inventoryDefnitionCode</code> attribute **/
	public static final String INVENTORYDEFNITIONCODE = "inventoryDefnitionCode";
	/** Qualifier of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute **/
	public static final String ISFLIGHTINCLUDED = "isFlightIncluded";
	/** Qualifier of the <code>HolidayInventoryRequest.packageCategory</code> attribute **/
	public static final String PACKAGECATEGORY = "packageCategory";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryRequest.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(PRODUCTFLAVOUR, AttributeMode.INITIAL);
		tmp.put(PRICERANGEFROM, AttributeMode.INITIAL);
		tmp.put(PRICERANGETO, AttributeMode.INITIAL);
		tmp.put(INVENTORYDEFNITIONCODE, AttributeMode.INITIAL);
		tmp.put(ISFLIGHTINCLUDED, AttributeMode.INITIAL);
		tmp.put(PACKAGECATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.inventoryDefnitionCode</code> attribute.
	 * @return the inventoryDefnitionCode - Inventory Definition Code
	 */
	public String getInventoryDefnitionCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVENTORYDEFNITIONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.inventoryDefnitionCode</code> attribute.
	 * @return the inventoryDefnitionCode - Inventory Definition Code
	 */
	public String getInventoryDefnitionCode()
	{
		return getInventoryDefnitionCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.inventoryDefnitionCode</code> attribute. 
	 * @param value the inventoryDefnitionCode - Inventory Definition Code
	 */
	public void setInventoryDefnitionCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVENTORYDEFNITIONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.inventoryDefnitionCode</code> attribute. 
	 * @param value the inventoryDefnitionCode - Inventory Definition Code
	 */
	public void setInventoryDefnitionCode(final String value)
	{
		setInventoryDefnitionCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute.
	 * @return the isFlightIncluded - Inventory isFlightIncluded
	 */
	public Boolean isIsFlightIncluded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISFLIGHTINCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute.
	 * @return the isFlightIncluded - Inventory isFlightIncluded
	 */
	public Boolean isIsFlightIncluded()
	{
		return isIsFlightIncluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute. 
	 * @return the isFlightIncluded - Inventory isFlightIncluded
	 */
	public boolean isIsFlightIncludedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsFlightIncluded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute. 
	 * @return the isFlightIncluded - Inventory isFlightIncluded
	 */
	public boolean isIsFlightIncludedAsPrimitive()
	{
		return isIsFlightIncludedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute. 
	 * @param value the isFlightIncluded - Inventory isFlightIncluded
	 */
	public void setIsFlightIncluded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISFLIGHTINCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute. 
	 * @param value the isFlightIncluded - Inventory isFlightIncluded
	 */
	public void setIsFlightIncluded(final Boolean value)
	{
		setIsFlightIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute. 
	 * @param value the isFlightIncluded - Inventory isFlightIncluded
	 */
	public void setIsFlightIncluded(final SessionContext ctx, final boolean value)
	{
		setIsFlightIncluded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.isFlightIncluded</code> attribute. 
	 * @param value the isFlightIncluded - Inventory isFlightIncluded
	 */
	public void setIsFlightIncluded(final boolean value)
	{
		setIsFlightIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.packageCategory</code> attribute.
	 * @return the packageCategory - Inventory package Category
	 */
	public EnumerationValue getPackageCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PACKAGECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.packageCategory</code> attribute.
	 * @return the packageCategory - Inventory package Category
	 */
	public EnumerationValue getPackageCategory()
	{
		return getPackageCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.packageCategory</code> attribute. 
	 * @param value the packageCategory - Inventory package Category
	 */
	public void setPackageCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PACKAGECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.packageCategory</code> attribute. 
	 * @param value the packageCategory - Inventory package Category
	 */
	public void setPackageCategory(final EnumerationValue value)
	{
		setPackageCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.priceRangeFrom</code> attribute.
	 * @return the priceRangeFrom - Inventory Price Range From
	 */
	public BigDecimal getPriceRangeFrom(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PRICERANGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.priceRangeFrom</code> attribute.
	 * @return the priceRangeFrom - Inventory Price Range From
	 */
	public BigDecimal getPriceRangeFrom()
	{
		return getPriceRangeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.priceRangeFrom</code> attribute. 
	 * @param value the priceRangeFrom - Inventory Price Range From
	 */
	public void setPriceRangeFrom(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PRICERANGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.priceRangeFrom</code> attribute. 
	 * @param value the priceRangeFrom - Inventory Price Range From
	 */
	public void setPriceRangeFrom(final BigDecimal value)
	{
		setPriceRangeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.priceRangeTo</code> attribute.
	 * @return the priceRangeTo - Inventory Price Range To
	 */
	public BigDecimal getPriceRangeTo(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PRICERANGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.priceRangeTo</code> attribute.
	 * @return the priceRangeTo - Inventory Price Range To
	 */
	public BigDecimal getPriceRangeTo()
	{
		return getPriceRangeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.priceRangeTo</code> attribute. 
	 * @param value the priceRangeTo - Inventory Price Range To
	 */
	public void setPriceRangeTo(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PRICERANGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.priceRangeTo</code> attribute. 
	 * @param value the priceRangeTo - Inventory Price Range To
	 */
	public void setPriceRangeTo(final BigDecimal value)
	{
		setPriceRangeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.product</code> attribute.
	 * @return the product - Inventory holiday request product Name
	 */
	public HolidayProduct getProduct(final SessionContext ctx)
	{
		return (HolidayProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.product</code> attribute.
	 * @return the product - Inventory holiday request product Name
	 */
	public HolidayProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.product</code> attribute. 
	 * @param value the product - Inventory holiday request product Name
	 */
	public void setProduct(final SessionContext ctx, final HolidayProduct value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.product</code> attribute. 
	 * @param value the product - Inventory holiday request product Name
	 */
	public void setProduct(final HolidayProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.productFlavour</code> attribute.
	 * @return the productFlavour - Inventory holiday request Product Flavour Name
	 */
	public HolidayFlavor getProductFlavour(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, PRODUCTFLAVOUR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInventoryRequest.productFlavour</code> attribute.
	 * @return the productFlavour - Inventory holiday request Product Flavour Name
	 */
	public HolidayFlavor getProductFlavour()
	{
		return getProductFlavour( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.productFlavour</code> attribute. 
	 * @param value the productFlavour - Inventory holiday request Product Flavour Name
	 */
	public void setProductFlavour(final SessionContext ctx, final HolidayFlavor value)
	{
		setProperty(ctx, PRODUCTFLAVOUR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInventoryRequest.productFlavour</code> attribute. 
	 * @param value the productFlavour - Inventory holiday request Product Flavour Name
	 */
	public void setProductFlavour(final HolidayFlavor value)
	{
		setProductFlavour( getSession().getSessionContext(), value );
	}
	
}
