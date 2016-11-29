/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.common.core.jalo.Sector;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.Feeder;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayHub HolidayHub}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayHub extends GenericItem
{
	/** Qualifier of the <code>HolidayHub.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>HolidayHub.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>HolidayHub.hub</code> attribute **/
	public static final String HUB = "hub";
	/** Qualifier of the <code>HolidayHub.sectors</code> attribute **/
	public static final String SECTORS = "sectors";
	/** Qualifier of the <code>HolidayHub.holidayFlavor</code> attribute **/
	public static final String HOLIDAYFLAVOR = "holidayFlavor";
	/** Qualifier of the <code>HolidayHub.feeders</code> attribute **/
	public static final String FEEDERS = "feeders";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOLIDAYFLAVOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHolidayHub> HOLIDAYFLAVORHANDLER = new BidirectionalOneToManyHandler<GeneratedHolidayHub>(
	HolidayproductmastercoreConstants.TC.HOLIDAYHUB,
	false,
	"holidayFlavor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FEEDERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Feeder> FEEDERSHANDLER = new OneToManyHandler<Feeder>(
	HolidayproductmastercoreConstants.TC.FEEDER,
	false,
	"holidayHub",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(HUB, AttributeMode.INITIAL);
		tmp.put(SECTORS, AttributeMode.INITIAL);
		tmp.put(HOLIDAYFLAVOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOLIDAYFLAVORHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.feeders</code> attribute.
	 * @return the feeders
	 */
	public Collection<Feeder> getFeeders(final SessionContext ctx)
	{
		return FEEDERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.feeders</code> attribute.
	 * @return the feeders
	 */
	public Collection<Feeder> getFeeders()
	{
		return getFeeders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.feeders</code> attribute. 
	 * @param value the feeders
	 */
	public void setFeeders(final SessionContext ctx, final Collection<Feeder> value)
	{
		FEEDERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.feeders</code> attribute. 
	 * @param value the feeders
	 */
	public void setFeeders(final Collection<Feeder> value)
	{
		setFeeders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to feeders. 
	 * @param value the item to add to feeders
	 */
	public void addToFeeders(final SessionContext ctx, final Feeder value)
	{
		FEEDERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to feeders. 
	 * @param value the item to add to feeders
	 */
	public void addToFeeders(final Feeder value)
	{
		addToFeeders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from feeders. 
	 * @param value the item to remove from feeders
	 */
	public void removeFromFeeders(final SessionContext ctx, final Feeder value)
	{
		FEEDERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from feeders. 
	 * @param value the item to remove from feeders
	 */
	public void removeFromFeeders(final Feeder value)
	{
		removeFromFeeders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, HOLIDAYFLAVOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.holidayFlavor</code> attribute.
	 * @return the holidayFlavor
	 */
	public HolidayFlavor getHolidayFlavor()
	{
		return getHolidayFlavor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final SessionContext ctx, final HolidayFlavor value)
	{
		HOLIDAYFLAVORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.holidayFlavor</code> attribute. 
	 * @param value the holidayFlavor
	 */
	public void setHolidayFlavor(final HolidayFlavor value)
	{
		setHolidayFlavor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.hub</code> attribute.
	 * @return the hub - Hub
	 */
	public City getHub(final SessionContext ctx)
	{
		return (City)getProperty( ctx, HUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.hub</code> attribute.
	 * @return the hub - Hub
	 */
	public City getHub()
	{
		return getHub( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.hub</code> attribute. 
	 * @param value the hub - Hub
	 */
	public void setHub(final SessionContext ctx, final City value)
	{
		setProperty(ctx, HUB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.hub</code> attribute. 
	 * @param value the hub - Hub
	 */
	public void setHub(final City value)
	{
		setHub( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.productCategory</code> attribute.
	 * @return the productCategory - Product category
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.productCategory</code> attribute.
	 * @return the productCategory - Product category
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.productCategory</code> attribute. 
	 * @param value the productCategory - Product category
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.productCategory</code> attribute. 
	 * @param value the productCategory - Product category
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Product category sub type
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.productCategorySubType</code> attribute.
	 * @return the productCategorySubType - Product category sub type
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Product category sub type
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType - Product category sub type
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.sectors</code> attribute.
	 * @return the sectors - List of sectors
	 */
	public Collection<Sector> getSectors(final SessionContext ctx)
	{
		Collection<Sector> coll = (Collection<Sector>)getProperty( ctx, SECTORS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayHub.sectors</code> attribute.
	 * @return the sectors - List of sectors
	 */
	public Collection<Sector> getSectors()
	{
		return getSectors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.sectors</code> attribute. 
	 * @param value the sectors - List of sectors
	 */
	public void setSectors(final SessionContext ctx, final Collection<Sector> value)
	{
		setProperty(ctx, SECTORS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayHub.sectors</code> attribute. 
	 * @param value the sectors - List of sectors
	 */
	public void setSectors(final Collection<Sector> value)
	{
		setSectors( getSession().getSessionContext(), value );
	}
	
}
