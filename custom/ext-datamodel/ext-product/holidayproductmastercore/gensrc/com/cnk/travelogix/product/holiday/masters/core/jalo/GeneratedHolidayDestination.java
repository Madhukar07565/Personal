/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayDestination HolidayDestination}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayDestination extends GenericItem
{
	/** Qualifier of the <code>HolidayDestination.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>HolidayDestination.destinationName</code> attribute **/
	public static final String DESTINATIONNAME = "destinationName";
	/** Qualifier of the <code>HolidayDestination.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>HolidayDestination.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>HolidayDestination.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHolidayDestination> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedHolidayDestination>(
	HolidayproductmastercoreConstants.TC.HOLIDAYDESTINATION,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(DESTINATIONNAME, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.city</code> attribute.
	 * @return the city - City from selected Country
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.city</code> attribute.
	 * @return the city - City from selected Country
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.city</code> attribute. 
	 * @param value the city - City from selected Country
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.city</code> attribute. 
	 * @param value the city - City from selected Country
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.country</code> attribute.
	 * @return the country - County selected form Destination
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.country</code> attribute.
	 * @return the country - County selected form Destination
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.country</code> attribute. 
	 * @param value the country - County selected form Destination
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.country</code> attribute. 
	 * @param value the country - County selected form Destination
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.destinationName</code> attribute.
	 * @return the destinationName - destination name form destination Master
	 */
	public Continent getDestinationName(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, DESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.destinationName</code> attribute.
	 * @return the destinationName - destination name form destination Master
	 */
	public Continent getDestinationName()
	{
		return getDestinationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.destinationName</code> attribute. 
	 * @param value the destinationName - destination name form destination Master
	 */
	public void setDestinationName(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, DESTINATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.destinationName</code> attribute. 
	 * @param value the destinationName - destination name form destination Master
	 */
	public void setDestinationName(final Continent value)
	{
		setDestinationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.product</code> attribute.
	 * @return the product
	 */
	public HolidayProduct getProduct(final SessionContext ctx)
	{
		return (HolidayProduct)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.product</code> attribute.
	 * @return the product
	 */
	public HolidayProduct getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final HolidayProduct value)
	{
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final HolidayProduct value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.uid</code> attribute.
	 * @return the uid - system generated Unique key
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayDestination.uid</code> attribute.
	 * @return the uid - system generated Unique key
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.uid</code> attribute. 
	 * @param value the uid - system generated Unique key
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayDestination.uid</code> attribute. 
	 * @param value the uid - system generated Unique key
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
}
