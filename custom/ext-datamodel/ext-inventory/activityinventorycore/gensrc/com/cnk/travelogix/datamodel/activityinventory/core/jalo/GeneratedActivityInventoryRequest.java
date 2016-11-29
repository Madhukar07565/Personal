/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.activityinventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryRequest;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityInventoryRequest ActivityInventoryRequest}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityInventoryRequest extends AbstractInventoryRequest
{
	/** Qualifier of the <code>ActivityInventoryRequest.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>ActivityInventoryRequest.productNameSubtype</code> attribute **/
	public static final String PRODUCTNAMESUBTYPE = "productNameSubtype";
	/** Qualifier of the <code>ActivityInventoryRequest.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute **/
	public static final String DETAILEDINVENTORYREQUESTGRID = "detailedInventoryRequestGrid";
	/** Qualifier of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute **/
	public static final String DATEGROUPEDINVENTORYREQUESTGRID = "dateGroupedInventoryRequestGrid";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryRequest.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAMESUBTYPE, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(DETAILEDINVENTORYREQUESTGRID, AttributeMode.INITIAL);
		tmp.put(DATEGROUPEDINVENTORYREQUESTGRID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute.
	 * @return the dateGroupedInventoryRequestGrid - Date Grouped Inventory Request Grid
	 */
	public Boolean isDateGroupedInventoryRequestGrid(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DATEGROUPEDINVENTORYREQUESTGRID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute.
	 * @return the dateGroupedInventoryRequestGrid - Date Grouped Inventory Request Grid
	 */
	public Boolean isDateGroupedInventoryRequestGrid()
	{
		return isDateGroupedInventoryRequestGrid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute. 
	 * @return the dateGroupedInventoryRequestGrid - Date Grouped Inventory Request Grid
	 */
	public boolean isDateGroupedInventoryRequestGridAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDateGroupedInventoryRequestGrid( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute. 
	 * @return the dateGroupedInventoryRequestGrid - Date Grouped Inventory Request Grid
	 */
	public boolean isDateGroupedInventoryRequestGridAsPrimitive()
	{
		return isDateGroupedInventoryRequestGridAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute. 
	 * @param value the dateGroupedInventoryRequestGrid - Date Grouped Inventory Request Grid
	 */
	public void setDateGroupedInventoryRequestGrid(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DATEGROUPEDINVENTORYREQUESTGRID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute. 
	 * @param value the dateGroupedInventoryRequestGrid - Date Grouped Inventory Request Grid
	 */
	public void setDateGroupedInventoryRequestGrid(final Boolean value)
	{
		setDateGroupedInventoryRequestGrid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute. 
	 * @param value the dateGroupedInventoryRequestGrid - Date Grouped Inventory Request Grid
	 */
	public void setDateGroupedInventoryRequestGrid(final SessionContext ctx, final boolean value)
	{
		setDateGroupedInventoryRequestGrid( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.dateGroupedInventoryRequestGrid</code> attribute. 
	 * @param value the dateGroupedInventoryRequestGrid - Date Grouped Inventory Request Grid
	 */
	public void setDateGroupedInventoryRequestGrid(final boolean value)
	{
		setDateGroupedInventoryRequestGrid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute.
	 * @return the detailedInventoryRequestGrid - Detailed Inventory Request Grid
	 */
	public Boolean isDetailedInventoryRequestGrid(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DETAILEDINVENTORYREQUESTGRID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute.
	 * @return the detailedInventoryRequestGrid - Detailed Inventory Request Grid
	 */
	public Boolean isDetailedInventoryRequestGrid()
	{
		return isDetailedInventoryRequestGrid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute. 
	 * @return the detailedInventoryRequestGrid - Detailed Inventory Request Grid
	 */
	public boolean isDetailedInventoryRequestGridAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDetailedInventoryRequestGrid( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute. 
	 * @return the detailedInventoryRequestGrid - Detailed Inventory Request Grid
	 */
	public boolean isDetailedInventoryRequestGridAsPrimitive()
	{
		return isDetailedInventoryRequestGridAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute. 
	 * @param value the detailedInventoryRequestGrid - Detailed Inventory Request Grid
	 */
	public void setDetailedInventoryRequestGrid(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DETAILEDINVENTORYREQUESTGRID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute. 
	 * @param value the detailedInventoryRequestGrid - Detailed Inventory Request Grid
	 */
	public void setDetailedInventoryRequestGrid(final Boolean value)
	{
		setDetailedInventoryRequestGrid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute. 
	 * @param value the detailedInventoryRequestGrid - Detailed Inventory Request Grid
	 */
	public void setDetailedInventoryRequestGrid(final SessionContext ctx, final boolean value)
	{
		setDetailedInventoryRequestGrid( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.detailedInventoryRequestGrid</code> attribute. 
	 * @param value the detailedInventoryRequestGrid - Detailed Inventory Request Grid
	 */
	public void setDetailedInventoryRequestGrid(final boolean value)
	{
		setDetailedInventoryRequestGrid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.product</code> attribute.
	 * @return the product - Product Name
	 */
	public ActivityProduct getProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.product</code> attribute.
	 * @return the product - Product Name
	 */
	public ActivityProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.product</code> attribute. 
	 * @param value the product - Product Name
	 */
	public void setProduct(final SessionContext ctx, final ActivityProduct value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.product</code> attribute. 
	 * @param value the product - Product Name
	 */
	public void setProduct(final ActivityProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.productNameSubtype</code> attribute.
	 * @return the productNameSubtype - Product Name Subtype
	 */
	public ActivityProductSubType getProductNameSubtype(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, PRODUCTNAMESUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityInventoryRequest.productNameSubtype</code> attribute.
	 * @return the productNameSubtype - Product Name Subtype
	 */
	public ActivityProductSubType getProductNameSubtype()
	{
		return getProductNameSubtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.productNameSubtype</code> attribute. 
	 * @param value the productNameSubtype - Product Name Subtype
	 */
	public void setProductNameSubtype(final SessionContext ctx, final ActivityProductSubType value)
	{
		setProperty(ctx, PRODUCTNAMESUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityInventoryRequest.productNameSubtype</code> attribute. 
	 * @param value the productNameSubtype - Product Name Subtype
	 */
	public void setProductNameSubtype(final ActivityProductSubType value)
	{
		setProductNameSubtype( getSession().getSessionContext(), value );
	}
	
}
