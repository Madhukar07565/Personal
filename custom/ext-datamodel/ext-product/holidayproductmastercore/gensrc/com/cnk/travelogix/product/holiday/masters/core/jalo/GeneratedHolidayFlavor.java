/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.AbstractDayWiseItinerary;
import com.cnk.travelogix.product.common.core.jalo.AbstractVisaDetails;
import com.cnk.travelogix.product.common.core.jalo.Brochure;
import com.cnk.travelogix.product.common.core.jalo.CruisePackage;
import com.cnk.travelogix.product.common.core.jalo.Interest;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.BlackOutDates;
import com.cnk.travelogix.product.holiday.masters.core.jalo.DayWiseItinerary;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayBrand;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayHub;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import de.hybris.platform.variants.jalo.VariantProduct;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor HolidayFlavor}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayFlavor extends VariantProduct
{
	/** Qualifier of the <code>HolidayFlavor.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>HolidayFlavor.companyTourCode</code> attribute **/
	public static final String COMPANYTOURCODE = "companyTourCode";
	/** Qualifier of the <code>HolidayFlavor.flavorType</code> attribute **/
	public static final String FLAVORTYPE = "flavorType";
	/** Qualifier of the <code>HolidayFlavor.packageType</code> attribute **/
	public static final String PACKAGETYPE = "packageType";
	/** Qualifier of the <code>HolidayFlavor.productType</code> attribute **/
	public static final String PRODUCTTYPE = "productType";
	/** Qualifier of the <code>HolidayFlavor.brandName</code> attribute **/
	public static final String BRANDNAME = "brandName";
	/** Qualifier of the <code>HolidayFlavor.itineraryWise</code> attribute **/
	public static final String ITINERARYWISE = "itineraryWise";
	/** Qualifier of the <code>HolidayFlavor.comfortLevel</code> attribute **/
	public static final String COMFORTLEVEL = "comfortLevel";
	/** Qualifier of the <code>HolidayFlavor.companyRating</code> attribute **/
	public static final String COMPANYRATING = "companyRating";
	/** Qualifier of the <code>HolidayFlavor.rating</code> attribute **/
	public static final String RATING = "rating";
	/** Qualifier of the <code>HolidayFlavor.recommended</code> attribute **/
	public static final String RECOMMENDED = "recommended";
	/** Qualifier of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute **/
	public static final String FLIGHTDAY1ITINERARY = "flightDay1Itinerary";
	/** Qualifier of the <code>HolidayFlavor.companyPackageCategories</code> attribute **/
	public static final String COMPANYPACKAGECATEGORIES = "companyPackageCategories";
	/** Qualifier of the <code>HolidayFlavor.brochures</code> attribute **/
	public static final String BROCHURES = "brochures";
	/** Qualifier of the <code>HolidayFlavor.interests</code> attribute **/
	public static final String INTERESTS = "interests";
	/** Qualifier of the <code>HolidayFlavor.salesValidities</code> attribute **/
	public static final String SALESVALIDITIES = "salesValidities";
	/** Qualifier of the <code>HolidayFlavor.combinedCruise</code> attribute **/
	public static final String COMBINEDCRUISE = "combinedCruise";
	/** Qualifier of the <code>HolidayFlavor.combinedFlavor</code> attribute **/
	public static final String COMBINEDFLAVOR = "combinedFlavor";
	/** Qualifier of the <code>HolidayFlavor.serviceBasedDayWiseItinerarise</code> attribute **/
	public static final String SERVICEBASEDDAYWISEITINERARISE = "serviceBasedDayWiseItinerarise";
	/** Qualifier of the <code>HolidayFlavor.blackOutDays</code> attribute **/
	public static final String BLACKOUTDAYS = "blackOutDays";
	/** Qualifier of the <code>HolidayFlavor.hubs</code> attribute **/
	public static final String HUBS = "hubs";
	/** Qualifier of the <code>HolidayFlavor.visas</code> attribute **/
	public static final String VISAS = "visas";
	/** Qualifier of the <code>HolidayFlavor.itineraryBasedDayWiseItineraries</code> attribute **/
	public static final String ITINERARYBASEDDAYWISEITINERARIES = "itineraryBasedDayWiseItineraries";
	/**
	* {@link OneToManyHandler} for handling 1:n SERVICEBASEDDAYWISEITINERARISE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractDayWiseItinerary> SERVICEBASEDDAYWISEITINERARISEHANDLER = new OneToManyHandler<AbstractDayWiseItinerary>(
	CommonproductcoreConstants.TC.ABSTRACTDAYWISEITINERARY,
	false,
	"holidayFlavor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BLACKOUTDAYS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BlackOutDates> BLACKOUTDAYSHANDLER = new OneToManyHandler<BlackOutDates>(
	HolidayproductmastercoreConstants.TC.BLACKOUTDATES,
	false,
	"holidayFlavor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n HUBS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HolidayHub> HUBSHANDLER = new OneToManyHandler<HolidayHub>(
	HolidayproductmastercoreConstants.TC.HOLIDAYHUB,
	false,
	"holidayFlavor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n VISAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractVisaDetails> VISASHANDLER = new OneToManyHandler<AbstractVisaDetails>(
	CommonproductcoreConstants.TC.ABSTRACTVISADETAILS,
	false,
	"holidayFlavor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ITINERARYBASEDDAYWISEITINERARIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DayWiseItinerary> ITINERARYBASEDDAYWISEITINERARIESHANDLER = new OneToManyHandler<DayWiseItinerary>(
	HolidayproductmastercoreConstants.TC.DAYWISEITINERARY,
	false,
	"holidayFlavor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(VariantProduct.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(COMPANYTOURCODE, AttributeMode.INITIAL);
		tmp.put(FLAVORTYPE, AttributeMode.INITIAL);
		tmp.put(PACKAGETYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCTTYPE, AttributeMode.INITIAL);
		tmp.put(BRANDNAME, AttributeMode.INITIAL);
		tmp.put(ITINERARYWISE, AttributeMode.INITIAL);
		tmp.put(COMFORTLEVEL, AttributeMode.INITIAL);
		tmp.put(COMPANYRATING, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		tmp.put(RECOMMENDED, AttributeMode.INITIAL);
		tmp.put(FLIGHTDAY1ITINERARY, AttributeMode.INITIAL);
		tmp.put(COMPANYPACKAGECATEGORIES, AttributeMode.INITIAL);
		tmp.put(BROCHURES, AttributeMode.INITIAL);
		tmp.put(INTERESTS, AttributeMode.INITIAL);
		tmp.put(SALESVALIDITIES, AttributeMode.INITIAL);
		tmp.put(COMBINEDCRUISE, AttributeMode.INITIAL);
		tmp.put(COMBINEDFLAVOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.blackOutDays</code> attribute.
	 * @return the blackOutDays
	 */
	public Collection<BlackOutDates> getBlackOutDays(final SessionContext ctx)
	{
		return BLACKOUTDAYSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.blackOutDays</code> attribute.
	 * @return the blackOutDays
	 */
	public Collection<BlackOutDates> getBlackOutDays()
	{
		return getBlackOutDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.blackOutDays</code> attribute. 
	 * @param value the blackOutDays
	 */
	public void setBlackOutDays(final SessionContext ctx, final Collection<BlackOutDates> value)
	{
		BLACKOUTDAYSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.blackOutDays</code> attribute. 
	 * @param value the blackOutDays
	 */
	public void setBlackOutDays(final Collection<BlackOutDates> value)
	{
		setBlackOutDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to blackOutDays. 
	 * @param value the item to add to blackOutDays
	 */
	public void addToBlackOutDays(final SessionContext ctx, final BlackOutDates value)
	{
		BLACKOUTDAYSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to blackOutDays. 
	 * @param value the item to add to blackOutDays
	 */
	public void addToBlackOutDays(final BlackOutDates value)
	{
		addToBlackOutDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from blackOutDays. 
	 * @param value the item to remove from blackOutDays
	 */
	public void removeFromBlackOutDays(final SessionContext ctx, final BlackOutDates value)
	{
		BLACKOUTDAYSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from blackOutDays. 
	 * @param value the item to remove from blackOutDays
	 */
	public void removeFromBlackOutDays(final BlackOutDates value)
	{
		removeFromBlackOutDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.brandName</code> attribute.
	 * @return the brandName - Name of brand
	 */
	public HolidayBrand getBrandName(final SessionContext ctx)
	{
		return (HolidayBrand)getProperty( ctx, BRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.brandName</code> attribute.
	 * @return the brandName - Name of brand
	 */
	public HolidayBrand getBrandName()
	{
		return getBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.brandName</code> attribute. 
	 * @param value the brandName - Name of brand
	 */
	public void setBrandName(final SessionContext ctx, final HolidayBrand value)
	{
		setProperty(ctx, BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.brandName</code> attribute. 
	 * @param value the brandName - Name of brand
	 */
	public void setBrandName(final HolidayBrand value)
	{
		setBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.brochures</code> attribute.
	 * @return the brochures - List of brochures
	 */
	public Collection<Brochure> getBrochures(final SessionContext ctx)
	{
		Collection<Brochure> coll = (Collection<Brochure>)getProperty( ctx, BROCHURES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.brochures</code> attribute.
	 * @return the brochures - List of brochures
	 */
	public Collection<Brochure> getBrochures()
	{
		return getBrochures( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.brochures</code> attribute. 
	 * @param value the brochures - List of brochures
	 */
	public void setBrochures(final SessionContext ctx, final Collection<Brochure> value)
	{
		setProperty(ctx, BROCHURES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.brochures</code> attribute. 
	 * @param value the brochures - List of brochures
	 */
	public void setBrochures(final Collection<Brochure> value)
	{
		setBrochures( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.combinedCruise</code> attribute.
	 * @return the combinedCruise - Combined cruise package
	 */
	public CruisePackage getCombinedCruise(final SessionContext ctx)
	{
		return (CruisePackage)getProperty( ctx, COMBINEDCRUISE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.combinedCruise</code> attribute.
	 * @return the combinedCruise - Combined cruise package
	 */
	public CruisePackage getCombinedCruise()
	{
		return getCombinedCruise( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.combinedCruise</code> attribute. 
	 * @param value the combinedCruise - Combined cruise package
	 */
	public void setCombinedCruise(final SessionContext ctx, final CruisePackage value)
	{
		setProperty(ctx, COMBINEDCRUISE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.combinedCruise</code> attribute. 
	 * @param value the combinedCruise - Combined cruise package
	 */
	public void setCombinedCruise(final CruisePackage value)
	{
		setCombinedCruise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.combinedFlavor</code> attribute.
	 * @return the combinedFlavor - Combined flavor
	 */
	public HolidayFlavor getCombinedFlavor(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, COMBINEDFLAVOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.combinedFlavor</code> attribute.
	 * @return the combinedFlavor - Combined flavor
	 */
	public HolidayFlavor getCombinedFlavor()
	{
		return getCombinedFlavor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.combinedFlavor</code> attribute. 
	 * @param value the combinedFlavor - Combined flavor
	 */
	public void setCombinedFlavor(final SessionContext ctx, final HolidayFlavor value)
	{
		setProperty(ctx, COMBINEDFLAVOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.combinedFlavor</code> attribute. 
	 * @param value the combinedFlavor - Combined flavor
	 */
	public void setCombinedFlavor(final HolidayFlavor value)
	{
		setCombinedFlavor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.comfortLevel</code> attribute.
	 * @return the comfortLevel - Comfort level
	 */
	public Integer getComfortLevel(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, COMFORTLEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.comfortLevel</code> attribute.
	 * @return the comfortLevel - Comfort level
	 */
	public Integer getComfortLevel()
	{
		return getComfortLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.comfortLevel</code> attribute. 
	 * @return the comfortLevel - Comfort level
	 */
	public int getComfortLevelAsPrimitive(final SessionContext ctx)
	{
		Integer value = getComfortLevel( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.comfortLevel</code> attribute. 
	 * @return the comfortLevel - Comfort level
	 */
	public int getComfortLevelAsPrimitive()
	{
		return getComfortLevelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.comfortLevel</code> attribute. 
	 * @param value the comfortLevel - Comfort level
	 */
	public void setComfortLevel(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, COMFORTLEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.comfortLevel</code> attribute. 
	 * @param value the comfortLevel - Comfort level
	 */
	public void setComfortLevel(final Integer value)
	{
		setComfortLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.comfortLevel</code> attribute. 
	 * @param value the comfortLevel - Comfort level
	 */
	public void setComfortLevel(final SessionContext ctx, final int value)
	{
		setComfortLevel( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.comfortLevel</code> attribute. 
	 * @param value the comfortLevel - Comfort level
	 */
	public void setComfortLevel(final int value)
	{
		setComfortLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.companyPackageCategories</code> attribute.
	 * @return the companyPackageCategories - Company package categories
	 */
	public Collection<EnumerationValue> getCompanyPackageCategories(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, COMPANYPACKAGECATEGORIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.companyPackageCategories</code> attribute.
	 * @return the companyPackageCategories - Company package categories
	 */
	public Collection<EnumerationValue> getCompanyPackageCategories()
	{
		return getCompanyPackageCategories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.companyPackageCategories</code> attribute. 
	 * @param value the companyPackageCategories - Company package categories
	 */
	public void setCompanyPackageCategories(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, COMPANYPACKAGECATEGORIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.companyPackageCategories</code> attribute. 
	 * @param value the companyPackageCategories - Company package categories
	 */
	public void setCompanyPackageCategories(final Collection<EnumerationValue> value)
	{
		setCompanyPackageCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.companyRating</code> attribute.
	 * @return the companyRating - Company rating
	 */
	public EnumerationValue getCompanyRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYRATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.companyRating</code> attribute.
	 * @return the companyRating - Company rating
	 */
	public EnumerationValue getCompanyRating()
	{
		return getCompanyRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.companyRating</code> attribute. 
	 * @param value the companyRating - Company rating
	 */
	public void setCompanyRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYRATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.companyRating</code> attribute. 
	 * @param value the companyRating - Company rating
	 */
	public void setCompanyRating(final EnumerationValue value)
	{
		setCompanyRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.companyTourCode</code> attribute.
	 * @return the companyTourCode - Company tour code
	 */
	public String getCompanyTourCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYTOURCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.companyTourCode</code> attribute.
	 * @return the companyTourCode - Company tour code
	 */
	public String getCompanyTourCode()
	{
		return getCompanyTourCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.companyTourCode</code> attribute. 
	 * @param value the companyTourCode - Company tour code
	 */
	public void setCompanyTourCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYTOURCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.companyTourCode</code> attribute. 
	 * @param value the companyTourCode - Company tour code
	 */
	public void setCompanyTourCode(final String value)
	{
		setCompanyTourCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.flavorType</code> attribute.
	 * @return the flavorType - Flavor type
	 */
	public EnumerationValue getFlavorType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FLAVORTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.flavorType</code> attribute.
	 * @return the flavorType - Flavor type
	 */
	public EnumerationValue getFlavorType()
	{
		return getFlavorType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.flavorType</code> attribute. 
	 * @param value the flavorType - Flavor type
	 */
	public void setFlavorType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FLAVORTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.flavorType</code> attribute. 
	 * @param value the flavorType - Flavor type
	 */
	public void setFlavorType(final EnumerationValue value)
	{
		setFlavorType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute.
	 * @return the flightDay1Itinerary - Flight itinerary
	 */
	public Boolean isFlightDay1Itinerary(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FLIGHTDAY1ITINERARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute.
	 * @return the flightDay1Itinerary - Flight itinerary
	 */
	public Boolean isFlightDay1Itinerary()
	{
		return isFlightDay1Itinerary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute. 
	 * @return the flightDay1Itinerary - Flight itinerary
	 */
	public boolean isFlightDay1ItineraryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFlightDay1Itinerary( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute. 
	 * @return the flightDay1Itinerary - Flight itinerary
	 */
	public boolean isFlightDay1ItineraryAsPrimitive()
	{
		return isFlightDay1ItineraryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute. 
	 * @param value the flightDay1Itinerary - Flight itinerary
	 */
	public void setFlightDay1Itinerary(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FLIGHTDAY1ITINERARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute. 
	 * @param value the flightDay1Itinerary - Flight itinerary
	 */
	public void setFlightDay1Itinerary(final Boolean value)
	{
		setFlightDay1Itinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute. 
	 * @param value the flightDay1Itinerary - Flight itinerary
	 */
	public void setFlightDay1Itinerary(final SessionContext ctx, final boolean value)
	{
		setFlightDay1Itinerary( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.flightDay1Itinerary</code> attribute. 
	 * @param value the flightDay1Itinerary - Flight itinerary
	 */
	public void setFlightDay1Itinerary(final boolean value)
	{
		setFlightDay1Itinerary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.hubs</code> attribute.
	 * @return the hubs
	 */
	public Collection<HolidayHub> getHubs(final SessionContext ctx)
	{
		return HUBSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.hubs</code> attribute.
	 * @return the hubs
	 */
	public Collection<HolidayHub> getHubs()
	{
		return getHubs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.hubs</code> attribute. 
	 * @param value the hubs
	 */
	public void setHubs(final SessionContext ctx, final Collection<HolidayHub> value)
	{
		HUBSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.hubs</code> attribute. 
	 * @param value the hubs
	 */
	public void setHubs(final Collection<HolidayHub> value)
	{
		setHubs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to hubs. 
	 * @param value the item to add to hubs
	 */
	public void addToHubs(final SessionContext ctx, final HolidayHub value)
	{
		HUBSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to hubs. 
	 * @param value the item to add to hubs
	 */
	public void addToHubs(final HolidayHub value)
	{
		addToHubs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from hubs. 
	 * @param value the item to remove from hubs
	 */
	public void removeFromHubs(final SessionContext ctx, final HolidayHub value)
	{
		HUBSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from hubs. 
	 * @param value the item to remove from hubs
	 */
	public void removeFromHubs(final HolidayHub value)
	{
		removeFromHubs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.interests</code> attribute.
	 * @return the interests - List of interests
	 */
	public Collection<Interest> getInterests(final SessionContext ctx)
	{
		Collection<Interest> coll = (Collection<Interest>)getProperty( ctx, INTERESTS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.interests</code> attribute.
	 * @return the interests - List of interests
	 */
	public Collection<Interest> getInterests()
	{
		return getInterests( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.interests</code> attribute. 
	 * @param value the interests - List of interests
	 */
	public void setInterests(final SessionContext ctx, final Collection<Interest> value)
	{
		setProperty(ctx, INTERESTS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.interests</code> attribute. 
	 * @param value the interests - List of interests
	 */
	public void setInterests(final Collection<Interest> value)
	{
		setInterests( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.itineraryBasedDayWiseItineraries</code> attribute.
	 * @return the itineraryBasedDayWiseItineraries
	 */
	public Collection<DayWiseItinerary> getItineraryBasedDayWiseItineraries(final SessionContext ctx)
	{
		return ITINERARYBASEDDAYWISEITINERARIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.itineraryBasedDayWiseItineraries</code> attribute.
	 * @return the itineraryBasedDayWiseItineraries
	 */
	public Collection<DayWiseItinerary> getItineraryBasedDayWiseItineraries()
	{
		return getItineraryBasedDayWiseItineraries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.itineraryBasedDayWiseItineraries</code> attribute. 
	 * @param value the itineraryBasedDayWiseItineraries
	 */
	public void setItineraryBasedDayWiseItineraries(final SessionContext ctx, final Collection<DayWiseItinerary> value)
	{
		ITINERARYBASEDDAYWISEITINERARIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.itineraryBasedDayWiseItineraries</code> attribute. 
	 * @param value the itineraryBasedDayWiseItineraries
	 */
	public void setItineraryBasedDayWiseItineraries(final Collection<DayWiseItinerary> value)
	{
		setItineraryBasedDayWiseItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraryBasedDayWiseItineraries. 
	 * @param value the item to add to itineraryBasedDayWiseItineraries
	 */
	public void addToItineraryBasedDayWiseItineraries(final SessionContext ctx, final DayWiseItinerary value)
	{
		ITINERARYBASEDDAYWISEITINERARIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraryBasedDayWiseItineraries. 
	 * @param value the item to add to itineraryBasedDayWiseItineraries
	 */
	public void addToItineraryBasedDayWiseItineraries(final DayWiseItinerary value)
	{
		addToItineraryBasedDayWiseItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraryBasedDayWiseItineraries. 
	 * @param value the item to remove from itineraryBasedDayWiseItineraries
	 */
	public void removeFromItineraryBasedDayWiseItineraries(final SessionContext ctx, final DayWiseItinerary value)
	{
		ITINERARYBASEDDAYWISEITINERARIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraryBasedDayWiseItineraries. 
	 * @param value the item to remove from itineraryBasedDayWiseItineraries
	 */
	public void removeFromItineraryBasedDayWiseItineraries(final DayWiseItinerary value)
	{
		removeFromItineraryBasedDayWiseItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.itineraryWise</code> attribute.
	 * @return the itineraryWise - Itinerary wise
	 */
	public Boolean isItineraryWise(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ITINERARYWISE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.itineraryWise</code> attribute.
	 * @return the itineraryWise - Itinerary wise
	 */
	public Boolean isItineraryWise()
	{
		return isItineraryWise( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.itineraryWise</code> attribute. 
	 * @return the itineraryWise - Itinerary wise
	 */
	public boolean isItineraryWiseAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isItineraryWise( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.itineraryWise</code> attribute. 
	 * @return the itineraryWise - Itinerary wise
	 */
	public boolean isItineraryWiseAsPrimitive()
	{
		return isItineraryWiseAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.itineraryWise</code> attribute. 
	 * @param value the itineraryWise - Itinerary wise
	 */
	public void setItineraryWise(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ITINERARYWISE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.itineraryWise</code> attribute. 
	 * @param value the itineraryWise - Itinerary wise
	 */
	public void setItineraryWise(final Boolean value)
	{
		setItineraryWise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.itineraryWise</code> attribute. 
	 * @param value the itineraryWise - Itinerary wise
	 */
	public void setItineraryWise(final SessionContext ctx, final boolean value)
	{
		setItineraryWise( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.itineraryWise</code> attribute. 
	 * @param value the itineraryWise - Itinerary wise
	 */
	public void setItineraryWise(final boolean value)
	{
		setItineraryWise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.packageType</code> attribute.
	 * @return the packageType - Type of package
	 */
	public EnumerationValue getPackageType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PACKAGETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.packageType</code> attribute.
	 * @return the packageType - Type of package
	 */
	public EnumerationValue getPackageType()
	{
		return getPackageType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.packageType</code> attribute. 
	 * @param value the packageType - Type of package
	 */
	public void setPackageType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PACKAGETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.packageType</code> attribute. 
	 * @param value the packageType - Type of package
	 */
	public void setPackageType(final EnumerationValue value)
	{
		setPackageType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.productType</code> attribute.
	 * @return the productType - Type of product
	 */
	public EnumerationValue getProductType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRODUCTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.productType</code> attribute.
	 * @return the productType - Type of product
	 */
	public EnumerationValue getProductType()
	{
		return getProductType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.productType</code> attribute. 
	 * @param value the productType - Type of product
	 */
	public void setProductType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRODUCTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.productType</code> attribute. 
	 * @param value the productType - Type of product
	 */
	public void setProductType(final EnumerationValue value)
	{
		setProductType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.rating</code> attribute.
	 * @return the rating - Rating
	 */
	public EnumerationValue getRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.rating</code> attribute.
	 * @return the rating - Rating
	 */
	public EnumerationValue getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.rating</code> attribute. 
	 * @param value the rating - Rating
	 */
	public void setRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.rating</code> attribute. 
	 * @param value the rating - Rating
	 */
	public void setRating(final EnumerationValue value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.recommended</code> attribute.
	 * @return the recommended - Recommended
	 */
	public Boolean isRecommended(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, RECOMMENDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.recommended</code> attribute.
	 * @return the recommended - Recommended
	 */
	public Boolean isRecommended()
	{
		return isRecommended( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.recommended</code> attribute. 
	 * @return the recommended - Recommended
	 */
	public boolean isRecommendedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRecommended( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.recommended</code> attribute. 
	 * @return the recommended - Recommended
	 */
	public boolean isRecommendedAsPrimitive()
	{
		return isRecommendedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.recommended</code> attribute. 
	 * @param value the recommended - Recommended
	 */
	public void setRecommended(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, RECOMMENDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.recommended</code> attribute. 
	 * @param value the recommended - Recommended
	 */
	public void setRecommended(final Boolean value)
	{
		setRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.recommended</code> attribute. 
	 * @param value the recommended - Recommended
	 */
	public void setRecommended(final SessionContext ctx, final boolean value)
	{
		setRecommended( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.recommended</code> attribute. 
	 * @param value the recommended - Recommended
	 */
	public void setRecommended(final boolean value)
	{
		setRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.salesValidities</code> attribute.
	 * @return the salesValidities - Sales validities
	 */
	public Set<StandardDateRange> getSalesValidities(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, SALESVALIDITIES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.salesValidities</code> attribute.
	 * @return the salesValidities - Sales validities
	 */
	public Set<StandardDateRange> getSalesValidities()
	{
		return getSalesValidities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.salesValidities</code> attribute. 
	 * @param value the salesValidities - Sales validities
	 */
	public void setSalesValidities(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, SALESVALIDITIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.salesValidities</code> attribute. 
	 * @param value the salesValidities - Sales validities
	 */
	public void setSalesValidities(final Set<StandardDateRange> value)
	{
		setSalesValidities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.serviceBasedDayWiseItinerarise</code> attribute.
	 * @return the serviceBasedDayWiseItinerarise
	 */
	public Collection<AbstractDayWiseItinerary> getServiceBasedDayWiseItinerarise(final SessionContext ctx)
	{
		return SERVICEBASEDDAYWISEITINERARISEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.serviceBasedDayWiseItinerarise</code> attribute.
	 * @return the serviceBasedDayWiseItinerarise
	 */
	public Collection<AbstractDayWiseItinerary> getServiceBasedDayWiseItinerarise()
	{
		return getServiceBasedDayWiseItinerarise( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.serviceBasedDayWiseItinerarise</code> attribute. 
	 * @param value the serviceBasedDayWiseItinerarise
	 */
	public void setServiceBasedDayWiseItinerarise(final SessionContext ctx, final Collection<AbstractDayWiseItinerary> value)
	{
		SERVICEBASEDDAYWISEITINERARISEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.serviceBasedDayWiseItinerarise</code> attribute. 
	 * @param value the serviceBasedDayWiseItinerarise
	 */
	public void setServiceBasedDayWiseItinerarise(final Collection<AbstractDayWiseItinerary> value)
	{
		setServiceBasedDayWiseItinerarise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to serviceBasedDayWiseItinerarise. 
	 * @param value the item to add to serviceBasedDayWiseItinerarise
	 */
	public void addToServiceBasedDayWiseItinerarise(final SessionContext ctx, final AbstractDayWiseItinerary value)
	{
		SERVICEBASEDDAYWISEITINERARISEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to serviceBasedDayWiseItinerarise. 
	 * @param value the item to add to serviceBasedDayWiseItinerarise
	 */
	public void addToServiceBasedDayWiseItinerarise(final AbstractDayWiseItinerary value)
	{
		addToServiceBasedDayWiseItinerarise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from serviceBasedDayWiseItinerarise. 
	 * @param value the item to remove from serviceBasedDayWiseItinerarise
	 */
	public void removeFromServiceBasedDayWiseItinerarise(final SessionContext ctx, final AbstractDayWiseItinerary value)
	{
		SERVICEBASEDDAYWISEITINERARISEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from serviceBasedDayWiseItinerarise. 
	 * @param value the item to remove from serviceBasedDayWiseItinerarise
	 */
	public void removeFromServiceBasedDayWiseItinerarise(final AbstractDayWiseItinerary value)
	{
		removeFromServiceBasedDayWiseItinerarise( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.visas</code> attribute.
	 * @return the visas
	 */
	public Collection<AbstractVisaDetails> getVisas(final SessionContext ctx)
	{
		return VISASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayFlavor.visas</code> attribute.
	 * @return the visas
	 */
	public Collection<AbstractVisaDetails> getVisas()
	{
		return getVisas( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.visas</code> attribute. 
	 * @param value the visas
	 */
	public void setVisas(final SessionContext ctx, final Collection<AbstractVisaDetails> value)
	{
		VISASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayFlavor.visas</code> attribute. 
	 * @param value the visas
	 */
	public void setVisas(final Collection<AbstractVisaDetails> value)
	{
		setVisas( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visas. 
	 * @param value the item to add to visas
	 */
	public void addToVisas(final SessionContext ctx, final AbstractVisaDetails value)
	{
		VISASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visas. 
	 * @param value the item to add to visas
	 */
	public void addToVisas(final AbstractVisaDetails value)
	{
		addToVisas( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visas. 
	 * @param value the item to remove from visas
	 */
	public void removeFromVisas(final SessionContext ctx, final AbstractVisaDetails value)
	{
		VISASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visas. 
	 * @param value the item to remove from visas
	 */
	public void removeFromVisas(final AbstractVisaDetails value)
	{
		removeFromVisas( getSession().getSessionContext(), value );
	}
	
}
