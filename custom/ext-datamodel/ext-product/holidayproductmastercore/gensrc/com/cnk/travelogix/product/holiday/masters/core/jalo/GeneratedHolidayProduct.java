/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.product.common.core.jalo.Brochure;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayBrand;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayDestination;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayProduct HolidayProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayProduct extends Product
{
	/** Qualifier of the <code>HolidayProduct.numberOfNight</code> attribute **/
	public static final String NUMBEROFNIGHT = "numberOfNight";
	/** Qualifier of the <code>HolidayProduct.numberOfDays</code> attribute **/
	public static final String NUMBEROFDAYS = "numberOfDays";
	/** Qualifier of the <code>HolidayProduct.markets</code> attribute **/
	public static final String MARKETS = "markets";
	/** Qualifier of the <code>HolidayProduct.brands</code> attribute **/
	public static final String BRANDS = "brands";
	/** Qualifier of the <code>HolidayProduct.brochures</code> attribute **/
	public static final String BROCHURES = "brochures";
	/** Qualifier of the <code>HolidayProduct.holidayDestinaions</code> attribute **/
	public static final String HOLIDAYDESTINAIONS = "holidayDestinaions";
	/**
	* {@link OneToManyHandler} for handling 1:n HOLIDAYDESTINAIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HolidayDestination> HOLIDAYDESTINAIONSHANDLER = new OneToManyHandler<HolidayDestination>(
	HolidayproductmastercoreConstants.TC.HOLIDAYDESTINATION,
	true,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NUMBEROFNIGHT, AttributeMode.INITIAL);
		tmp.put(NUMBEROFDAYS, AttributeMode.INITIAL);
		tmp.put(MARKETS, AttributeMode.INITIAL);
		tmp.put(BRANDS, AttributeMode.INITIAL);
		tmp.put(BROCHURES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.brands</code> attribute.
	 * @return the brands - Description
	 */
	public Collection<HolidayBrand> getBrands(final SessionContext ctx)
	{
		Collection<HolidayBrand> coll = (Collection<HolidayBrand>)getProperty( ctx, BRANDS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.brands</code> attribute.
	 * @return the brands - Description
	 */
	public Collection<HolidayBrand> getBrands()
	{
		return getBrands( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.brands</code> attribute. 
	 * @param value the brands - Description
	 */
	public void setBrands(final SessionContext ctx, final Collection<HolidayBrand> value)
	{
		setProperty(ctx, BRANDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.brands</code> attribute. 
	 * @param value the brands - Description
	 */
	public void setBrands(final Collection<HolidayBrand> value)
	{
		setBrands( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.brochures</code> attribute.
	 * @return the brochures - Description
	 */
	public Collection<Brochure> getBrochures(final SessionContext ctx)
	{
		Collection<Brochure> coll = (Collection<Brochure>)getProperty( ctx, BROCHURES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.brochures</code> attribute.
	 * @return the brochures - Description
	 */
	public Collection<Brochure> getBrochures()
	{
		return getBrochures( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.brochures</code> attribute. 
	 * @param value the brochures - Description
	 */
	public void setBrochures(final SessionContext ctx, final Collection<Brochure> value)
	{
		setProperty(ctx, BROCHURES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.brochures</code> attribute. 
	 * @param value the brochures - Description
	 */
	public void setBrochures(final Collection<Brochure> value)
	{
		setBrochures( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.holidayDestinaions</code> attribute.
	 * @return the holidayDestinaions
	 */
	public Collection<HolidayDestination> getHolidayDestinaions(final SessionContext ctx)
	{
		return HOLIDAYDESTINAIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.holidayDestinaions</code> attribute.
	 * @return the holidayDestinaions
	 */
	public Collection<HolidayDestination> getHolidayDestinaions()
	{
		return getHolidayDestinaions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.holidayDestinaions</code> attribute. 
	 * @param value the holidayDestinaions
	 */
	public void setHolidayDestinaions(final SessionContext ctx, final Collection<HolidayDestination> value)
	{
		HOLIDAYDESTINAIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.holidayDestinaions</code> attribute. 
	 * @param value the holidayDestinaions
	 */
	public void setHolidayDestinaions(final Collection<HolidayDestination> value)
	{
		setHolidayDestinaions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to holidayDestinaions. 
	 * @param value the item to add to holidayDestinaions
	 */
	public void addToHolidayDestinaions(final SessionContext ctx, final HolidayDestination value)
	{
		HOLIDAYDESTINAIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to holidayDestinaions. 
	 * @param value the item to add to holidayDestinaions
	 */
	public void addToHolidayDestinaions(final HolidayDestination value)
	{
		addToHolidayDestinaions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from holidayDestinaions. 
	 * @param value the item to remove from holidayDestinaions
	 */
	public void removeFromHolidayDestinaions(final SessionContext ctx, final HolidayDestination value)
	{
		HOLIDAYDESTINAIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from holidayDestinaions. 
	 * @param value the item to remove from holidayDestinaions
	 */
	public void removeFromHolidayDestinaions(final HolidayDestination value)
	{
		removeFromHolidayDestinaions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.markets</code> attribute.
	 * @return the markets - Description
	 */
	public Collection<Market> getMarkets(final SessionContext ctx)
	{
		Collection<Market> coll = (Collection<Market>)getProperty( ctx, MARKETS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.markets</code> attribute.
	 * @return the markets - Description
	 */
	public Collection<Market> getMarkets()
	{
		return getMarkets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.markets</code> attribute. 
	 * @param value the markets - Description
	 */
	public void setMarkets(final SessionContext ctx, final Collection<Market> value)
	{
		setProperty(ctx, MARKETS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.markets</code> attribute. 
	 * @param value the markets - Description
	 */
	public void setMarkets(final Collection<Market> value)
	{
		setMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.numberOfDays</code> attribute.
	 * @return the numberOfDays - Description
	 */
	public Integer getNumberOfDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.numberOfDays</code> attribute.
	 * @return the numberOfDays - Description
	 */
	public Integer getNumberOfDays()
	{
		return getNumberOfDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.numberOfDays</code> attribute. 
	 * @return the numberOfDays - Description
	 */
	public int getNumberOfDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.numberOfDays</code> attribute. 
	 * @return the numberOfDays - Description
	 */
	public int getNumberOfDaysAsPrimitive()
	{
		return getNumberOfDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.numberOfDays</code> attribute. 
	 * @param value the numberOfDays - Description
	 */
	public void setNumberOfDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.numberOfDays</code> attribute. 
	 * @param value the numberOfDays - Description
	 */
	public void setNumberOfDays(final Integer value)
	{
		setNumberOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.numberOfDays</code> attribute. 
	 * @param value the numberOfDays - Description
	 */
	public void setNumberOfDays(final SessionContext ctx, final int value)
	{
		setNumberOfDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.numberOfDays</code> attribute. 
	 * @param value the numberOfDays - Description
	 */
	public void setNumberOfDays(final int value)
	{
		setNumberOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.numberOfNight</code> attribute.
	 * @return the numberOfNight - Description
	 */
	public Integer getNumberOfNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.numberOfNight</code> attribute.
	 * @return the numberOfNight - Description
	 */
	public Integer getNumberOfNight()
	{
		return getNumberOfNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.numberOfNight</code> attribute. 
	 * @return the numberOfNight - Description
	 */
	public int getNumberOfNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayProduct.numberOfNight</code> attribute. 
	 * @return the numberOfNight - Description
	 */
	public int getNumberOfNightAsPrimitive()
	{
		return getNumberOfNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.numberOfNight</code> attribute. 
	 * @param value the numberOfNight - Description
	 */
	public void setNumberOfNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.numberOfNight</code> attribute. 
	 * @param value the numberOfNight - Description
	 */
	public void setNumberOfNight(final Integer value)
	{
		setNumberOfNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.numberOfNight</code> attribute. 
	 * @param value the numberOfNight - Description
	 */
	public void setNumberOfNight(final SessionContext ctx, final int value)
	{
		setNumberOfNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayProduct.numberOfNight</code> attribute. 
	 * @param value the numberOfNight - Description
	 */
	public void setNumberOfNight(final int value)
	{
		setNumberOfNight( getSession().getSessionContext(), value );
	}
	
}
