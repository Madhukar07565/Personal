/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary AbstractDayWiseItinerary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractDayWiseItinerary extends GenericItem
{
	/** Qualifier of the <code>AbstractDayWiseItinerary.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute **/
	public static final String SEQUENCENUMBER = "sequenceNumber";
	/** Qualifier of the <code>AbstractDayWiseItinerary.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>AbstractDayWiseItinerary.ProductCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "ProductCategorySubType";
	/** Qualifier of the <code>AbstractDayWiseItinerary.day</code> attribute **/
	public static final String DAY = "day";
	/** Qualifier of the <code>AbstractDayWiseItinerary.standardPrice</code> attribute **/
	public static final String STANDARDPRICE = "standardPrice";
	/** Qualifier of the <code>AbstractDayWiseItinerary.deluxePrice</code> attribute **/
	public static final String DELUXEPRICE = "deluxePrice";
	/** Qualifier of the <code>AbstractDayWiseItinerary.superiorPrice</code> attribute **/
	public static final String SUPERIORPRICE = "superiorPrice";
	/** Qualifier of the <code>AbstractDayWiseItinerary.itineraryBrief</code> attribute **/
	public static final String ITINERARYBRIEF = "itineraryBrief";
	/** Qualifier of the <code>AbstractDayWiseItinerary.itineraryDetails</code> attribute **/
	public static final String ITINERARYDETAILS = "itineraryDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(SEQUENCENUMBER, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(DAY, AttributeMode.INITIAL);
		tmp.put(STANDARDPRICE, AttributeMode.INITIAL);
		tmp.put(DELUXEPRICE, AttributeMode.INITIAL);
		tmp.put(SUPERIORPRICE, AttributeMode.INITIAL);
		tmp.put(ITINERARYBRIEF, AttributeMode.INITIAL);
		tmp.put(ITINERARYDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.city</code> attribute.
	 * @return the city - City
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.city</code> attribute. 
	 * @param value the city - City
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.day</code> attribute.
	 * @return the day - Day
	 */
	public Integer getDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.day</code> attribute.
	 * @return the day - Day
	 */
	public Integer getDay()
	{
		return getDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.day</code> attribute. 
	 * @return the day - Day
	 */
	public int getDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.day</code> attribute. 
	 * @return the day - Day
	 */
	public int getDayAsPrimitive()
	{
		return getDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final Integer value)
	{
		setDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final SessionContext ctx, final int value)
	{
		setDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.day</code> attribute. 
	 * @param value the day - Day
	 */
	public void setDay(final int value)
	{
		setDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.deluxePrice</code> attribute.
	 * @return the deluxePrice - Deluxe price
	 */
	public PriceRow getDeluxePrice(final SessionContext ctx)
	{
		return (PriceRow)getProperty( ctx, DELUXEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.deluxePrice</code> attribute.
	 * @return the deluxePrice - Deluxe price
	 */
	public PriceRow getDeluxePrice()
	{
		return getDeluxePrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.deluxePrice</code> attribute. 
	 * @param value the deluxePrice - Deluxe price
	 */
	public void setDeluxePrice(final SessionContext ctx, final PriceRow value)
	{
		setProperty(ctx, DELUXEPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.deluxePrice</code> attribute. 
	 * @param value the deluxePrice - Deluxe price
	 */
	public void setDeluxePrice(final PriceRow value)
	{
		setDeluxePrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.itineraryBrief</code> attribute.
	 * @return the itineraryBrief - Itinerary brief
	 */
	public String getItineraryBrief(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITINERARYBRIEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.itineraryBrief</code> attribute.
	 * @return the itineraryBrief - Itinerary brief
	 */
	public String getItineraryBrief()
	{
		return getItineraryBrief( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.itineraryBrief</code> attribute. 
	 * @param value the itineraryBrief - Itinerary brief
	 */
	public void setItineraryBrief(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITINERARYBRIEF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.itineraryBrief</code> attribute. 
	 * @param value the itineraryBrief - Itinerary brief
	 */
	public void setItineraryBrief(final String value)
	{
		setItineraryBrief( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.itineraryDetails</code> attribute.
	 * @return the itineraryDetails - Itinerary details
	 */
	public String getItineraryDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITINERARYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.itineraryDetails</code> attribute.
	 * @return the itineraryDetails - Itinerary details
	 */
	public String getItineraryDetails()
	{
		return getItineraryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.itineraryDetails</code> attribute. 
	 * @param value the itineraryDetails - Itinerary details
	 */
	public void setItineraryDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITINERARYDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.itineraryDetails</code> attribute. 
	 * @param value the itineraryDetails - Itinerary details
	 */
	public void setItineraryDetails(final String value)
	{
		setItineraryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.productCategory</code> attribute.
	 * @return the productCategory - Product category
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.productCategory</code> attribute.
	 * @return the productCategory - Product category
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.productCategory</code> attribute. 
	 * @param value the productCategory - Product category
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.productCategory</code> attribute. 
	 * @param value the productCategory - Product category
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.ProductCategorySubType</code> attribute.
	 * @return the ProductCategorySubType - Product category sub type
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.ProductCategorySubType</code> attribute.
	 * @return the ProductCategorySubType - Product category sub type
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.ProductCategorySubType</code> attribute. 
	 * @param value the ProductCategorySubType - Product category sub type
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.ProductCategorySubType</code> attribute. 
	 * @param value the ProductCategorySubType - Product category sub type
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute.
	 * @return the sequenceNumber - Sequence number
	 */
	public Integer getSequenceNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SEQUENCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute.
	 * @return the sequenceNumber - Sequence number
	 */
	public Integer getSequenceNumber()
	{
		return getSequenceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute. 
	 * @return the sequenceNumber - Sequence number
	 */
	public int getSequenceNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSequenceNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute. 
	 * @return the sequenceNumber - Sequence number
	 */
	public int getSequenceNumberAsPrimitive()
	{
		return getSequenceNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute. 
	 * @param value the sequenceNumber - Sequence number
	 */
	public void setSequenceNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SEQUENCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute. 
	 * @param value the sequenceNumber - Sequence number
	 */
	public void setSequenceNumber(final Integer value)
	{
		setSequenceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute. 
	 * @param value the sequenceNumber - Sequence number
	 */
	public void setSequenceNumber(final SessionContext ctx, final int value)
	{
		setSequenceNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.sequenceNumber</code> attribute. 
	 * @param value the sequenceNumber - Sequence number
	 */
	public void setSequenceNumber(final int value)
	{
		setSequenceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.standardPrice</code> attribute.
	 * @return the standardPrice - Standard price
	 */
	public PriceRow getStandardPrice(final SessionContext ctx)
	{
		return (PriceRow)getProperty( ctx, STANDARDPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.standardPrice</code> attribute.
	 * @return the standardPrice - Standard price
	 */
	public PriceRow getStandardPrice()
	{
		return getStandardPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.standardPrice</code> attribute. 
	 * @param value the standardPrice - Standard price
	 */
	public void setStandardPrice(final SessionContext ctx, final PriceRow value)
	{
		setProperty(ctx, STANDARDPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.standardPrice</code> attribute. 
	 * @param value the standardPrice - Standard price
	 */
	public void setStandardPrice(final PriceRow value)
	{
		setStandardPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.superiorPrice</code> attribute.
	 * @return the superiorPrice - Superior price
	 */
	public PriceRow getSuperiorPrice(final SessionContext ctx)
	{
		return (PriceRow)getProperty( ctx, SUPERIORPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractDayWiseItinerary.superiorPrice</code> attribute.
	 * @return the superiorPrice - Superior price
	 */
	public PriceRow getSuperiorPrice()
	{
		return getSuperiorPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.superiorPrice</code> attribute. 
	 * @param value the superiorPrice - Superior price
	 */
	public void setSuperiorPrice(final SessionContext ctx, final PriceRow value)
	{
		setProperty(ctx, SUPERIORPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractDayWiseItinerary.superiorPrice</code> attribute. 
	 * @param value the superiorPrice - Superior price
	 */
	public void setSuperiorPrice(final PriceRow value)
	{
		setSuperiorPrice( getSession().getSessionContext(), value );
	}
	
}
