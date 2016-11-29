/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.iata.jalo.AirlineIATAItem;
import com.cnk.travelogix.masterdata.core.jalo.TravellerProgram;
import com.cnk.travelogix.product.common.core.jalo.Sector;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.AirLineDetails;
import com.cnk.travelogix.product.transport.masters.core.jalo.AirMarketDisplayName;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
import com.cnk.travelogix.product.transport.masters.core.jalo.MarketSpecificLogo;
import com.cnk.travelogix.product.transport.masters.core.jalo.MarketSpecificURL;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct FlightProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightProduct extends Product
{
	/** Qualifier of the <code>FlightProduct.airlineIATA</code> attribute **/
	public static final String AIRLINEIATA = "airlineIATA";
	/** Qualifier of the <code>FlightProduct.ticketDesignator</code> attribute **/
	public static final String TICKETDESIGNATOR = "ticketDesignator";
	/** Qualifier of the <code>FlightProduct.airlineType</code> attribute **/
	public static final String AIRLINETYPE = "airlineType";
	/** Qualifier of the <code>FlightProduct.brandAirline</code> attribute **/
	public static final String BRANDAIRLINE = "brandAirline";
	/** Qualifier of the <code>FlightProduct.mainAirlineProduct</code> attribute **/
	public static final String MAINAIRLINEPRODUCT = "mainAirlineProduct";
	/** Qualifier of the <code>FlightProduct.travellerPrograms</code> attribute **/
	public static final String TRAVELLERPROGRAMS = "travellerPrograms";
	/** Relation ordering override parameter constants for FlightProductToTravelPrograms from ((transportproductmasterscore))*/
	protected static String FLIGHTPRODUCTTOTRAVELPROGRAMS_SRC_ORDERED = "relation.FlightProductToTravelPrograms.source.ordered";
	protected static String FLIGHTPRODUCTTOTRAVELPROGRAMS_TGT_ORDERED = "relation.FlightProductToTravelPrograms.target.ordered";
	/** Relation disable markmodifed parameter constants for FlightProductToTravelPrograms from ((transportproductmasterscore))*/
	protected static String FLIGHTPRODUCTTOTRAVELPROGRAMS_MARKMODIFIED = "relation.FlightProductToTravelPrograms.markmodified";
	/** Qualifier of the <code>FlightProduct.airLineDetails</code> attribute **/
	public static final String AIRLINEDETAILS = "airLineDetails";
	/** Qualifier of the <code>FlightProduct.marketDisplayNames</code> attribute **/
	public static final String MARKETDISPLAYNAMES = "marketDisplayNames";
	/** Qualifier of the <code>FlightProduct.marketSpecificLogo</code> attribute **/
	public static final String MARKETSPECIFICLOGO = "marketSpecificLogo";
	/** Qualifier of the <code>FlightProduct.marketSpecificURL</code> attribute **/
	public static final String MARKETSPECIFICURL = "marketSpecificURL";
	/** Qualifier of the <code>FlightProduct.sectors</code> attribute **/
	public static final String SECTORS = "sectors";
	/** Relation ordering override parameter constants for SectorTOFlightProduct from ((transportproductmasterscore))*/
	protected static String SECTORTOFLIGHTPRODUCT_SRC_ORDERED = "relation.SectorTOFlightProduct.source.ordered";
	protected static String SECTORTOFLIGHTPRODUCT_TGT_ORDERED = "relation.SectorTOFlightProduct.target.ordered";
	/** Relation disable markmodifed parameter constants for SectorTOFlightProduct from ((transportproductmasterscore))*/
	protected static String SECTORTOFLIGHTPRODUCT_MARKMODIFIED = "relation.SectorTOFlightProduct.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n AIRLINEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirLineDetails> AIRLINEDETAILSHANDLER = new OneToManyHandler<AirLineDetails>(
	TransportproductmasterscoreConstants.TC.AIRLINEDETAILS,
	true,
	"flightProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MARKETDISPLAYNAMES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirMarketDisplayName> MARKETDISPLAYNAMESHANDLER = new OneToManyHandler<AirMarketDisplayName>(
	TransportproductmasterscoreConstants.TC.AIRMARKETDISPLAYNAME,
	true,
	"flightProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MARKETSPECIFICLOGO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MarketSpecificLogo> MARKETSPECIFICLOGOHANDLER = new OneToManyHandler<MarketSpecificLogo>(
	TransportproductmasterscoreConstants.TC.MARKETSPECIFICLOGO,
	true,
	"flightProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MARKETSPECIFICURL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MarketSpecificURL> MARKETSPECIFICURLHANDLER = new OneToManyHandler<MarketSpecificURL>(
	TransportproductmasterscoreConstants.TC.MARKETSPECIFICURL,
	true,
	"flightProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(AIRLINEIATA, AttributeMode.INITIAL);
		tmp.put(TICKETDESIGNATOR, AttributeMode.INITIAL);
		tmp.put(AIRLINETYPE, AttributeMode.INITIAL);
		tmp.put(BRANDAIRLINE, AttributeMode.INITIAL);
		tmp.put(MAINAIRLINEPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.airLineDetails</code> attribute.
	 * @return the airLineDetails
	 */
	public Collection<AirLineDetails> getAirLineDetails(final SessionContext ctx)
	{
		return AIRLINEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.airLineDetails</code> attribute.
	 * @return the airLineDetails
	 */
	public Collection<AirLineDetails> getAirLineDetails()
	{
		return getAirLineDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.airLineDetails</code> attribute. 
	 * @param value the airLineDetails
	 */
	public void setAirLineDetails(final SessionContext ctx, final Collection<AirLineDetails> value)
	{
		AIRLINEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.airLineDetails</code> attribute. 
	 * @param value the airLineDetails
	 */
	public void setAirLineDetails(final Collection<AirLineDetails> value)
	{
		setAirLineDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airLineDetails. 
	 * @param value the item to add to airLineDetails
	 */
	public void addToAirLineDetails(final SessionContext ctx, final AirLineDetails value)
	{
		AIRLINEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airLineDetails. 
	 * @param value the item to add to airLineDetails
	 */
	public void addToAirLineDetails(final AirLineDetails value)
	{
		addToAirLineDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airLineDetails. 
	 * @param value the item to remove from airLineDetails
	 */
	public void removeFromAirLineDetails(final SessionContext ctx, final AirLineDetails value)
	{
		AIRLINEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airLineDetails. 
	 * @param value the item to remove from airLineDetails
	 */
	public void removeFromAirLineDetails(final AirLineDetails value)
	{
		removeFromAirLineDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.airlineIATA</code> attribute.
	 * @return the airlineIATA - To show the Airline IATA code.
	 */
	public AirlineIATAItem getAirlineIATA(final SessionContext ctx)
	{
		return (AirlineIATAItem)getProperty( ctx, AIRLINEIATA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.airlineIATA</code> attribute.
	 * @return the airlineIATA - To show the Airline IATA code.
	 */
	public AirlineIATAItem getAirlineIATA()
	{
		return getAirlineIATA( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.airlineIATA</code> attribute. 
	 * @param value the airlineIATA - To show the Airline IATA code.
	 */
	public void setAirlineIATA(final SessionContext ctx, final AirlineIATAItem value)
	{
		setProperty(ctx, AIRLINEIATA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.airlineIATA</code> attribute. 
	 * @param value the airlineIATA - To show the Airline IATA code.
	 */
	public void setAirlineIATA(final AirlineIATAItem value)
	{
		setAirlineIATA( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.airlineType</code> attribute.
	 * @return the airlineType - To show the Airline Type
	 */
	public EnumerationValue getAirlineType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, AIRLINETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.airlineType</code> attribute.
	 * @return the airlineType - To show the Airline Type
	 */
	public EnumerationValue getAirlineType()
	{
		return getAirlineType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.airlineType</code> attribute. 
	 * @param value the airlineType - To show the Airline Type
	 */
	public void setAirlineType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, AIRLINETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.airlineType</code> attribute. 
	 * @param value the airlineType - To show the Airline Type
	 */
	public void setAirlineType(final EnumerationValue value)
	{
		setAirlineType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.brandAirline</code> attribute.
	 * @return the brandAirline - To show the main Flight Product.
	 */
	public Boolean isBrandAirline(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BRANDAIRLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.brandAirline</code> attribute.
	 * @return the brandAirline - To show the main Flight Product.
	 */
	public Boolean isBrandAirline()
	{
		return isBrandAirline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.brandAirline</code> attribute. 
	 * @return the brandAirline - To show the main Flight Product.
	 */
	public boolean isBrandAirlineAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBrandAirline( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.brandAirline</code> attribute. 
	 * @return the brandAirline - To show the main Flight Product.
	 */
	public boolean isBrandAirlineAsPrimitive()
	{
		return isBrandAirlineAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.brandAirline</code> attribute. 
	 * @param value the brandAirline - To show the main Flight Product.
	 */
	public void setBrandAirline(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BRANDAIRLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.brandAirline</code> attribute. 
	 * @param value the brandAirline - To show the main Flight Product.
	 */
	public void setBrandAirline(final Boolean value)
	{
		setBrandAirline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.brandAirline</code> attribute. 
	 * @param value the brandAirline - To show the main Flight Product.
	 */
	public void setBrandAirline(final SessionContext ctx, final boolean value)
	{
		setBrandAirline( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.brandAirline</code> attribute. 
	 * @param value the brandAirline - To show the main Flight Product.
	 */
	public void setBrandAirline(final boolean value)
	{
		setBrandAirline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.mainAirlineProduct</code> attribute.
	 * @return the mainAirlineProduct - To show the main Flight Product.
	 */
	public FlightProduct getMainAirlineProduct(final SessionContext ctx)
	{
		return (FlightProduct)getProperty( ctx, MAINAIRLINEPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.mainAirlineProduct</code> attribute.
	 * @return the mainAirlineProduct - To show the main Flight Product.
	 */
	public FlightProduct getMainAirlineProduct()
	{
		return getMainAirlineProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.mainAirlineProduct</code> attribute. 
	 * @param value the mainAirlineProduct - To show the main Flight Product.
	 */
	public void setMainAirlineProduct(final SessionContext ctx, final FlightProduct value)
	{
		setProperty(ctx, MAINAIRLINEPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.mainAirlineProduct</code> attribute. 
	 * @param value the mainAirlineProduct - To show the main Flight Product.
	 */
	public void setMainAirlineProduct(final FlightProduct value)
	{
		setMainAirlineProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.marketDisplayNames</code> attribute.
	 * @return the marketDisplayNames
	 */
	public Collection<AirMarketDisplayName> getMarketDisplayNames(final SessionContext ctx)
	{
		return MARKETDISPLAYNAMESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.marketDisplayNames</code> attribute.
	 * @return the marketDisplayNames
	 */
	public Collection<AirMarketDisplayName> getMarketDisplayNames()
	{
		return getMarketDisplayNames( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.marketDisplayNames</code> attribute. 
	 * @param value the marketDisplayNames
	 */
	public void setMarketDisplayNames(final SessionContext ctx, final Collection<AirMarketDisplayName> value)
	{
		MARKETDISPLAYNAMESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.marketDisplayNames</code> attribute. 
	 * @param value the marketDisplayNames
	 */
	public void setMarketDisplayNames(final Collection<AirMarketDisplayName> value)
	{
		setMarketDisplayNames( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to marketDisplayNames. 
	 * @param value the item to add to marketDisplayNames
	 */
	public void addToMarketDisplayNames(final SessionContext ctx, final AirMarketDisplayName value)
	{
		MARKETDISPLAYNAMESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to marketDisplayNames. 
	 * @param value the item to add to marketDisplayNames
	 */
	public void addToMarketDisplayNames(final AirMarketDisplayName value)
	{
		addToMarketDisplayNames( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from marketDisplayNames. 
	 * @param value the item to remove from marketDisplayNames
	 */
	public void removeFromMarketDisplayNames(final SessionContext ctx, final AirMarketDisplayName value)
	{
		MARKETDISPLAYNAMESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from marketDisplayNames. 
	 * @param value the item to remove from marketDisplayNames
	 */
	public void removeFromMarketDisplayNames(final AirMarketDisplayName value)
	{
		removeFromMarketDisplayNames( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.marketSpecificLogo</code> attribute.
	 * @return the marketSpecificLogo
	 */
	public Collection<MarketSpecificLogo> getMarketSpecificLogo(final SessionContext ctx)
	{
		return MARKETSPECIFICLOGOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.marketSpecificLogo</code> attribute.
	 * @return the marketSpecificLogo
	 */
	public Collection<MarketSpecificLogo> getMarketSpecificLogo()
	{
		return getMarketSpecificLogo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.marketSpecificLogo</code> attribute. 
	 * @param value the marketSpecificLogo
	 */
	public void setMarketSpecificLogo(final SessionContext ctx, final Collection<MarketSpecificLogo> value)
	{
		MARKETSPECIFICLOGOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.marketSpecificLogo</code> attribute. 
	 * @param value the marketSpecificLogo
	 */
	public void setMarketSpecificLogo(final Collection<MarketSpecificLogo> value)
	{
		setMarketSpecificLogo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to marketSpecificLogo. 
	 * @param value the item to add to marketSpecificLogo
	 */
	public void addToMarketSpecificLogo(final SessionContext ctx, final MarketSpecificLogo value)
	{
		MARKETSPECIFICLOGOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to marketSpecificLogo. 
	 * @param value the item to add to marketSpecificLogo
	 */
	public void addToMarketSpecificLogo(final MarketSpecificLogo value)
	{
		addToMarketSpecificLogo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from marketSpecificLogo. 
	 * @param value the item to remove from marketSpecificLogo
	 */
	public void removeFromMarketSpecificLogo(final SessionContext ctx, final MarketSpecificLogo value)
	{
		MARKETSPECIFICLOGOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from marketSpecificLogo. 
	 * @param value the item to remove from marketSpecificLogo
	 */
	public void removeFromMarketSpecificLogo(final MarketSpecificLogo value)
	{
		removeFromMarketSpecificLogo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.marketSpecificURL</code> attribute.
	 * @return the marketSpecificURL
	 */
	public Collection<MarketSpecificURL> getMarketSpecificURL(final SessionContext ctx)
	{
		return MARKETSPECIFICURLHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.marketSpecificURL</code> attribute.
	 * @return the marketSpecificURL
	 */
	public Collection<MarketSpecificURL> getMarketSpecificURL()
	{
		return getMarketSpecificURL( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.marketSpecificURL</code> attribute. 
	 * @param value the marketSpecificURL
	 */
	public void setMarketSpecificURL(final SessionContext ctx, final Collection<MarketSpecificURL> value)
	{
		MARKETSPECIFICURLHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.marketSpecificURL</code> attribute. 
	 * @param value the marketSpecificURL
	 */
	public void setMarketSpecificURL(final Collection<MarketSpecificURL> value)
	{
		setMarketSpecificURL( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to marketSpecificURL. 
	 * @param value the item to add to marketSpecificURL
	 */
	public void addToMarketSpecificURL(final SessionContext ctx, final MarketSpecificURL value)
	{
		MARKETSPECIFICURLHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to marketSpecificURL. 
	 * @param value the item to add to marketSpecificURL
	 */
	public void addToMarketSpecificURL(final MarketSpecificURL value)
	{
		addToMarketSpecificURL( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from marketSpecificURL. 
	 * @param value the item to remove from marketSpecificURL
	 */
	public void removeFromMarketSpecificURL(final SessionContext ctx, final MarketSpecificURL value)
	{
		MARKETSPECIFICURLHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from marketSpecificURL. 
	 * @param value the item to remove from marketSpecificURL
	 */
	public void removeFromMarketSpecificURL(final MarketSpecificURL value)
	{
		removeFromMarketSpecificURL( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.sectors</code> attribute.
	 * @return the sectors
	 */
	public Collection<Sector> getSectors(final SessionContext ctx)
	{
		final List<Sector> items = getLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			"Sector",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.sectors</code> attribute.
	 * @return the sectors
	 */
	public Collection<Sector> getSectors()
	{
		return getSectors( getSession().getSessionContext() );
	}
	
	public long getSectorsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			"Sector",
			null
		);
	}
	
	public long getSectorsCount()
	{
		return getSectorsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.sectors</code> attribute. 
	 * @param value the sectors
	 */
	public void setSectors(final SessionContext ctx, final Collection<Sector> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SECTORTOFLIGHTPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.sectors</code> attribute. 
	 * @param value the sectors
	 */
	public void setSectors(final Collection<Sector> value)
	{
		setSectors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sectors. 
	 * @param value the item to add to sectors
	 */
	public void addToSectors(final SessionContext ctx, final Sector value)
	{
		addLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SECTORTOFLIGHTPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to sectors. 
	 * @param value the item to add to sectors
	 */
	public void addToSectors(final Sector value)
	{
		addToSectors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sectors. 
	 * @param value the item to remove from sectors
	 */
	public void removeFromSectors(final SessionContext ctx, final Sector value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.SECTORTOFLIGHTPRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SECTORTOFLIGHTPRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from sectors. 
	 * @param value the item to remove from sectors
	 */
	public void removeFromSectors(final Sector value)
	{
		removeFromSectors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.ticketDesignator</code> attribute.
	 * @return the ticketDesignator - To show the ticket designator.
	 */
	public Integer getTicketDesignator(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TICKETDESIGNATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.ticketDesignator</code> attribute.
	 * @return the ticketDesignator - To show the ticket designator.
	 */
	public Integer getTicketDesignator()
	{
		return getTicketDesignator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.ticketDesignator</code> attribute. 
	 * @return the ticketDesignator - To show the ticket designator.
	 */
	public int getTicketDesignatorAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTicketDesignator( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.ticketDesignator</code> attribute. 
	 * @return the ticketDesignator - To show the ticket designator.
	 */
	public int getTicketDesignatorAsPrimitive()
	{
		return getTicketDesignatorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.ticketDesignator</code> attribute. 
	 * @param value the ticketDesignator - To show the ticket designator.
	 */
	public void setTicketDesignator(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TICKETDESIGNATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.ticketDesignator</code> attribute. 
	 * @param value the ticketDesignator - To show the ticket designator.
	 */
	public void setTicketDesignator(final Integer value)
	{
		setTicketDesignator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.ticketDesignator</code> attribute. 
	 * @param value the ticketDesignator - To show the ticket designator.
	 */
	public void setTicketDesignator(final SessionContext ctx, final int value)
	{
		setTicketDesignator( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.ticketDesignator</code> attribute. 
	 * @param value the ticketDesignator - To show the ticket designator.
	 */
	public void setTicketDesignator(final int value)
	{
		setTicketDesignator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.travellerPrograms</code> attribute.
	 * @return the travellerPrograms
	 */
	public Collection<TravellerProgram> getTravellerPrograms(final SessionContext ctx)
	{
		final List<TravellerProgram> items = getLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			"TravellerProgram",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightProduct.travellerPrograms</code> attribute.
	 * @return the travellerPrograms
	 */
	public Collection<TravellerProgram> getTravellerPrograms()
	{
		return getTravellerPrograms( getSession().getSessionContext() );
	}
	
	public long getTravellerProgramsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			"TravellerProgram",
			null
		);
	}
	
	public long getTravellerProgramsCount()
	{
		return getTravellerProgramsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.travellerPrograms</code> attribute. 
	 * @param value the travellerPrograms
	 */
	public void setTravellerPrograms(final SessionContext ctx, final Collection<TravellerProgram> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHTPRODUCTTOTRAVELPROGRAMS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightProduct.travellerPrograms</code> attribute. 
	 * @param value the travellerPrograms
	 */
	public void setTravellerPrograms(final Collection<TravellerProgram> value)
	{
		setTravellerPrograms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travellerPrograms. 
	 * @param value the item to add to travellerPrograms
	 */
	public void addToTravellerPrograms(final SessionContext ctx, final TravellerProgram value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHTPRODUCTTOTRAVELPROGRAMS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travellerPrograms. 
	 * @param value the item to add to travellerPrograms
	 */
	public void addToTravellerPrograms(final TravellerProgram value)
	{
		addToTravellerPrograms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travellerPrograms. 
	 * @param value the item to remove from travellerPrograms
	 */
	public void removeFromTravellerPrograms(final SessionContext ctx, final TravellerProgram value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHTPRODUCTTOTRAVELPROGRAMS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travellerPrograms. 
	 * @param value the item to remove from travellerPrograms
	 */
	public void removeFromTravellerPrograms(final TravellerProgram value)
	{
		removeFromTravellerPrograms( getSession().getSessionContext(), value );
	}
	
}
