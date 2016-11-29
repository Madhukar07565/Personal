/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.masterdata.core.jalo.TravellerProgram;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.product.common.core.jalo.CruiseBrand;
import com.cnk.travelogix.product.common.core.jalo.CruiseCompany;
import com.cnk.travelogix.product.common.core.jalo.CruiseDestination;
import com.cnk.travelogix.product.common.core.jalo.CruisePackage;
import com.cnk.travelogix.product.common.core.jalo.Deck;
import com.cnk.travelogix.product.common.core.jalo.DescriptionDetails;
import com.cnk.travelogix.product.common.core.jalo.HealthAndSafety;
import com.cnk.travelogix.product.common.core.jalo.RescueSecurityDetails;
import com.cnk.travelogix.product.common.core.jalo.Route;
import com.cnk.travelogix.product.common.core.jalo.Sector;
import com.cnk.travelogix.product.common.core.jalo.Ship;
import com.cnk.travelogix.product.common.core.jalo.ShipAccomadationDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipConstructionDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipDescription;
import com.cnk.travelogix.product.common.core.jalo.ShipDimensionDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipEngineDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipEquipmentDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipOverview;
import com.cnk.travelogix.product.common.core.jalo.ShipPerformanceCapabilities;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.AbstractCruiseItem;
import com.cnk.travelogix.product.transport.masters.core.jalo.AbstractItinerary;
import com.cnk.travelogix.product.transport.masters.core.jalo.AirLineDetails;
import com.cnk.travelogix.product.transport.masters.core.jalo.AirMarketDisplayName;
import com.cnk.travelogix.product.transport.masters.core.jalo.AirRoute;
import com.cnk.travelogix.product.transport.masters.core.jalo.CabinOccupancy;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseOpeningSchedule;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruisePlaceDescription;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruisePort;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseRoute;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseRuleInformation;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseUpdate;
import com.cnk.travelogix.product.transport.masters.core.jalo.FacilityDetail;
import com.cnk.travelogix.product.transport.masters.core.jalo.FlightProduct;
import com.cnk.travelogix.product.transport.masters.core.jalo.ItineraryMedia;
import com.cnk.travelogix.product.transport.masters.core.jalo.MarketSpecificLogo;
import com.cnk.travelogix.product.transport.masters.core.jalo.MarketSpecificURL;
import com.cnk.travelogix.product.transport.masters.core.jalo.PortInfo;
import com.cnk.travelogix.product.transport.masters.core.jalo.RouteConnection;
import com.cnk.travelogix.product.transport.masters.core.jalo.RouteDetail;
import com.cnk.travelogix.product.transport.masters.core.jalo.RouteInfo;
import com.cnk.travelogix.product.transport.masters.core.jalo.ShoreExcursion;
import com.cnk.travelogix.product.transport.masters.core.jalo.SocialNetworkingDetails;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import com.cnk.travelogix.product.transport.masters.core.jalo.VehicleDetails;
import com.cnk.travelogix.product.transport.masters.core.jalo.VisaRequirement;
import de.hybris.platform.acceleratorservices.jalo.email.EmailAddress;
import de.hybris.platform.catalog.jalo.classification.ClassAttributeAssignment;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationType;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>TransportproductmasterscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportproductmasterscoreManager extends Extension
{
	/** Relation ordering override parameter constants for FlightProductToTravelPrograms from ((transportproductmasterscore))*/
	protected static String FLIGHTPRODUCTTOTRAVELPROGRAMS_SRC_ORDERED = "relation.FlightProductToTravelPrograms.source.ordered";
	protected static String FLIGHTPRODUCTTOTRAVELPROGRAMS_TGT_ORDERED = "relation.FlightProductToTravelPrograms.target.ordered";
	/** Relation disable markmodifed parameter constants for FlightProductToTravelPrograms from ((transportproductmasterscore))*/
	protected static String FLIGHTPRODUCTTOTRAVELPROGRAMS_MARKMODIFIED = "relation.FlightProductToTravelPrograms.markmodified";
	/** Relation ordering override parameter constants for CruisePackageTOThemes from ((transportproductmasterscore))*/
	protected static String CRUISEPACKAGETOTHEMES_SRC_ORDERED = "relation.CruisePackageTOThemes.source.ordered";
	protected static String CRUISEPACKAGETOTHEMES_TGT_ORDERED = "relation.CruisePackageTOThemes.target.ordered";
	/** Relation disable markmodifed parameter constants for CruisePackageTOThemes from ((transportproductmasterscore))*/
	protected static String CRUISEPACKAGETOTHEMES_MARKMODIFIED = "relation.CruisePackageTOThemes.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("landmark", AttributeMode.INITIAL);
		tmp.put("notes", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("dropDownDataSource", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.catalog.jalo.classification.ClassAttributeAssignment", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("company", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.acceleratorservices.jalo.email.EmailAddress", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cruiseDestination", AttributeMode.INITIAL);
		tmp.put("shoreExcursions", AttributeMode.INITIAL);
		tmp.put("company", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("shipDescription", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.DescriptionDetails", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cruisePort", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.Route", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cruisePackage", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.Ancillary", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("ship", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.HealthAndSafety", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.company</code> attribute.
	 * @return the company
	 */
	public AbstractCruiseItem getCompany(final SessionContext ctx, final EmailAddress item)
	{
		return (AbstractCruiseItem)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.EmailAddress.COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmailAddress.company</code> attribute.
	 * @return the company
	 */
	public AbstractCruiseItem getCompany(final EmailAddress item)
	{
		return getCompany( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final EmailAddress item, final AbstractCruiseItem value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.EmailAddress.COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmailAddress.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final EmailAddress item, final AbstractCruiseItem value)
	{
		setCompany( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.company</code> attribute.
	 * @return the company
	 */
	public AbstractCruiseItem getCompany(final SessionContext ctx, final Media item)
	{
		return (AbstractCruiseItem)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.Media.COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.company</code> attribute.
	 * @return the company
	 */
	public AbstractCruiseItem getCompany(final Media item)
	{
		return getCompany( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Media item, final AbstractCruiseItem value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.Media.COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Media item, final AbstractCruiseItem value)
	{
		setCompany( getSession().getSessionContext(), item, value );
	}
	
	public AbstractItinerary createAbstractItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.ABSTRACTITINERARY );
			return (AbstractItinerary)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AbstractItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractItinerary createAbstractItinerary(final Map attributeValues)
	{
		return createAbstractItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public AirLineDetails createAirLineDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.AIRLINEDETAILS );
			return (AirLineDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirLineDetails : "+e.getMessage(), 0 );
		}
	}
	
	public AirLineDetails createAirLineDetails(final Map attributeValues)
	{
		return createAirLineDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public AirMarketDisplayName createAirMarketDisplayName(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.AIRMARKETDISPLAYNAME );
			return (AirMarketDisplayName)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirMarketDisplayName : "+e.getMessage(), 0 );
		}
	}
	
	public AirMarketDisplayName createAirMarketDisplayName(final Map attributeValues)
	{
		return createAirMarketDisplayName( getSession().getSessionContext(), attributeValues );
	}
	
	public AirRoute createAirRoute(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.AIRROUTE );
			return (AirRoute)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirRoute : "+e.getMessage(), 0 );
		}
	}
	
	public AirRoute createAirRoute(final Map attributeValues)
	{
		return createAirRoute( getSession().getSessionContext(), attributeValues );
	}
	
	public Cabin createCabin(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CABIN );
			return (Cabin)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Cabin : "+e.getMessage(), 0 );
		}
	}
	
	public Cabin createCabin(final Map attributeValues)
	{
		return createCabin( getSession().getSessionContext(), attributeValues );
	}
	
	public CabinOccupancy createCabinOccupancy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CABINOCCUPANCY );
			return (CabinOccupancy)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CabinOccupancy : "+e.getMessage(), 0 );
		}
	}
	
	public CabinOccupancy createCabinOccupancy(final Map attributeValues)
	{
		return createCabinOccupancy( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseBrand createCruiseBrand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEBRAND );
			return (CruiseBrand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseBrand : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseBrand createCruiseBrand(final Map attributeValues)
	{
		return createCruiseBrand( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseCompany createCruiseCompany(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISECOMPANY );
			return (CruiseCompany)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseCompany : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseCompany createCruiseCompany(final Map attributeValues)
	{
		return createCruiseCompany( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseDestination createCruiseDestination(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEDESTINATION );
			return (CruiseDestination)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseDestination : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseDestination createCruiseDestination(final Map attributeValues)
	{
		return createCruiseDestination( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseItinerary createCruiseItinerary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEITINERARY );
			return (CruiseItinerary)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseItinerary : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseItinerary createCruiseItinerary(final Map attributeValues)
	{
		return createCruiseItinerary( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseOpeningSchedule createCruiseOpeningSchedule(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEOPENINGSCHEDULE );
			return (CruiseOpeningSchedule)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseOpeningSchedule : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseOpeningSchedule createCruiseOpeningSchedule(final Map attributeValues)
	{
		return createCruiseOpeningSchedule( getSession().getSessionContext(), attributeValues );
	}
	
	public CruisePackage createCruisePackage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEPACKAGE );
			return (CruisePackage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruisePackage : "+e.getMessage(), 0 );
		}
	}
	
	public CruisePackage createCruisePackage(final Map attributeValues)
	{
		return createCruisePackage( getSession().getSessionContext(), attributeValues );
	}
	
	public CruisePlaceDescription createCruisePlaceDescription(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEPLACEDESCRIPTION );
			return (CruisePlaceDescription)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruisePlaceDescription : "+e.getMessage(), 0 );
		}
	}
	
	public CruisePlaceDescription createCruisePlaceDescription(final Map attributeValues)
	{
		return createCruisePlaceDescription( getSession().getSessionContext(), attributeValues );
	}
	
	public CruisePort createCruisePort(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEPORT );
			return (CruisePort)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruisePort : "+e.getMessage(), 0 );
		}
	}
	
	public CruisePort createCruisePort(final Map attributeValues)
	{
		return createCruisePort( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseRoute createCruiseRoute(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEROUTE );
			return (CruiseRoute)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseRoute : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseRoute createCruiseRoute(final Map attributeValues)
	{
		return createCruiseRoute( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseRuleInformation createCruiseRuleInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISERULEINFORMATION );
			return (CruiseRuleInformation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseRuleInformation : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseRuleInformation createCruiseRuleInformation(final Map attributeValues)
	{
		return createCruiseRuleInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseUpdate createCruiseUpdate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.CRUISEUPDATE );
			return (CruiseUpdate)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseUpdate : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseUpdate createCruiseUpdate(final Map attributeValues)
	{
		return createCruiseUpdate( getSession().getSessionContext(), attributeValues );
	}
	
	public Deck createDeck(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.DECK );
			return (Deck)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Deck : "+e.getMessage(), 0 );
		}
	}
	
	public Deck createDeck(final Map attributeValues)
	{
		return createDeck( getSession().getSessionContext(), attributeValues );
	}
	
	public FacilityDetail createFacilityDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.FACILITYDETAIL );
			return (FacilityDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating FacilityDetail : "+e.getMessage(), 0 );
		}
	}
	
	public FacilityDetail createFacilityDetail(final Map attributeValues)
	{
		return createFacilityDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightProduct createFlightProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.FLIGHTPRODUCT );
			return (FlightProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating FlightProduct : "+e.getMessage(), 0 );
		}
	}
	
	public FlightProduct createFlightProduct(final Map attributeValues)
	{
		return createFlightProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ItineraryMedia createItineraryMedia(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.ITINERARYMEDIA );
			return (ItineraryMedia)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ItineraryMedia : "+e.getMessage(), 0 );
		}
	}
	
	public ItineraryMedia createItineraryMedia(final Map attributeValues)
	{
		return createItineraryMedia( getSession().getSessionContext(), attributeValues );
	}
	
	public MarketSpecificLogo createMarketSpecificLogo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.MARKETSPECIFICLOGO );
			return (MarketSpecificLogo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MarketSpecificLogo : "+e.getMessage(), 0 );
		}
	}
	
	public MarketSpecificLogo createMarketSpecificLogo(final Map attributeValues)
	{
		return createMarketSpecificLogo( getSession().getSessionContext(), attributeValues );
	}
	
	public MarketSpecificURL createMarketSpecificURL(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.MARKETSPECIFICURL );
			return (MarketSpecificURL)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MarketSpecificURL : "+e.getMessage(), 0 );
		}
	}
	
	public MarketSpecificURL createMarketSpecificURL(final Map attributeValues)
	{
		return createMarketSpecificURL( getSession().getSessionContext(), attributeValues );
	}
	
	public PortInfo createPortInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.PORTINFO );
			return (PortInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PortInfo : "+e.getMessage(), 0 );
		}
	}
	
	public PortInfo createPortInfo(final Map attributeValues)
	{
		return createPortInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public RescueSecurityDetails createRescueSecurityDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.RESCUESECURITYDETAILS );
			return (RescueSecurityDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RescueSecurityDetails : "+e.getMessage(), 0 );
		}
	}
	
	public RescueSecurityDetails createRescueSecurityDetails(final Map attributeValues)
	{
		return createRescueSecurityDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public RouteConnection createRouteConnection(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.ROUTECONNECTION );
			return (RouteConnection)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RouteConnection : "+e.getMessage(), 0 );
		}
	}
	
	public RouteConnection createRouteConnection(final Map attributeValues)
	{
		return createRouteConnection( getSession().getSessionContext(), attributeValues );
	}
	
	public RouteDetail createRouteDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.ROUTEDETAIL );
			return (RouteDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RouteDetail : "+e.getMessage(), 0 );
		}
	}
	
	public RouteDetail createRouteDetail(final Map attributeValues)
	{
		return createRouteDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public RouteInfo createRouteInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.ROUTEINFO );
			return (RouteInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating RouteInfo : "+e.getMessage(), 0 );
		}
	}
	
	public RouteInfo createRouteInfo(final Map attributeValues)
	{
		return createRouteInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public Sector createSector(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SECTOR );
			return (Sector)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Sector : "+e.getMessage(), 0 );
		}
	}
	
	public Sector createSector(final Map attributeValues)
	{
		return createSector( getSession().getSessionContext(), attributeValues );
	}
	
	public Ship createShip(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIP );
			return (Ship)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Ship : "+e.getMessage(), 0 );
		}
	}
	
	public Ship createShip(final Map attributeValues)
	{
		return createShip( getSession().getSessionContext(), attributeValues );
	}
	
	public ShipAccomadationDetails createShipAccomadationDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIPACCOMADATIONDETAILS );
			return (ShipAccomadationDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShipAccomadationDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ShipAccomadationDetails createShipAccomadationDetails(final Map attributeValues)
	{
		return createShipAccomadationDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ShipConstructionDetails createShipConstructionDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIPCONSTRUCTIONDETAILS );
			return (ShipConstructionDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShipConstructionDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ShipConstructionDetails createShipConstructionDetails(final Map attributeValues)
	{
		return createShipConstructionDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ShipDescription createShipDescription(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIPDESCRIPTION );
			return (ShipDescription)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShipDescription : "+e.getMessage(), 0 );
		}
	}
	
	public ShipDescription createShipDescription(final Map attributeValues)
	{
		return createShipDescription( getSession().getSessionContext(), attributeValues );
	}
	
	public ShipDimensionDetails createShipDimensionDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIPDIMENSIONDETAILS );
			return (ShipDimensionDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShipDimensionDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ShipDimensionDetails createShipDimensionDetails(final Map attributeValues)
	{
		return createShipDimensionDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ShipEngineDetails createShipEngineDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIPENGINEDETAILS );
			return (ShipEngineDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShipEngineDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ShipEngineDetails createShipEngineDetails(final Map attributeValues)
	{
		return createShipEngineDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ShipEquipmentDetails createShipEquipmentDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIPEQUIPMENTDETAILS );
			return (ShipEquipmentDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShipEquipmentDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ShipEquipmentDetails createShipEquipmentDetails(final Map attributeValues)
	{
		return createShipEquipmentDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ShipOverview createShipOverview(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIPOVERVIEW );
			return (ShipOverview)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShipOverview : "+e.getMessage(), 0 );
		}
	}
	
	public ShipOverview createShipOverview(final Map attributeValues)
	{
		return createShipOverview( getSession().getSessionContext(), attributeValues );
	}
	
	public ShipPerformanceCapabilities createShipPerformanceCapabilities(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHIPPERFORMANCECAPABILITIES );
			return (ShipPerformanceCapabilities)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShipPerformanceCapabilities : "+e.getMessage(), 0 );
		}
	}
	
	public ShipPerformanceCapabilities createShipPerformanceCapabilities(final Map attributeValues)
	{
		return createShipPerformanceCapabilities( getSession().getSessionContext(), attributeValues );
	}
	
	public ShoreExcursion createShoreExcursion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SHOREEXCURSION );
			return (ShoreExcursion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ShoreExcursion : "+e.getMessage(), 0 );
		}
	}
	
	public ShoreExcursion createShoreExcursion(final Map attributeValues)
	{
		return createShoreExcursion( getSession().getSessionContext(), attributeValues );
	}
	
	public SocialNetworkingDetails createSocialNetworkingDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.SOCIALNETWORKINGDETAILS );
			return (SocialNetworkingDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SocialNetworkingDetails : "+e.getMessage(), 0 );
		}
	}
	
	public SocialNetworkingDetails createSocialNetworkingDetails(final Map attributeValues)
	{
		return createSocialNetworkingDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public Vehicle createVehicle(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.VEHICLE );
			return (Vehicle)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Vehicle : "+e.getMessage(), 0 );
		}
	}
	
	public Vehicle createVehicle(final Map attributeValues)
	{
		return createVehicle( getSession().getSessionContext(), attributeValues );
	}
	
	public VehicleDetails createVehicleDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.VEHICLEDETAILS );
			return (VehicleDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating VehicleDetails : "+e.getMessage(), 0 );
		}
	}
	
	public VehicleDetails createVehicleDetails(final Map attributeValues)
	{
		return createVehicleDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public VisaRequirement createVisaRequirement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportproductmasterscoreConstants.TC.VISAREQUIREMENT );
			return (VisaRequirement)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating VisaRequirement : "+e.getMessage(), 0 );
		}
	}
	
	public VisaRequirement createVisaRequirement(final Map attributeValues)
	{
		return createVisaRequirement( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cruiseDestination</code> attribute.
	 * @return the cruiseDestination
	 */
	public CruiseDestination getCruiseDestination(final SessionContext ctx, final Media item)
	{
		return (CruiseDestination)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.Media.CRUISEDESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cruiseDestination</code> attribute.
	 * @return the cruiseDestination
	 */
	public CruiseDestination getCruiseDestination(final Media item)
	{
		return getCruiseDestination( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cruiseDestination</code> attribute. 
	 * @param value the cruiseDestination
	 */
	public void setCruiseDestination(final SessionContext ctx, final Media item, final CruiseDestination value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.Media.CRUISEDESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cruiseDestination</code> attribute. 
	 * @param value the cruiseDestination
	 */
	public void setCruiseDestination(final Media item, final CruiseDestination value)
	{
		setCruiseDestination( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ancillary.cruisePackage</code> attribute.
	 * @return the cruisePackage
	 */
	public CruisePackage getCruisePackage(final SessionContext ctx, final Ancillary item)
	{
		return (CruisePackage)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.Ancillary.CRUISEPACKAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ancillary.cruisePackage</code> attribute.
	 * @return the cruisePackage
	 */
	public CruisePackage getCruisePackage(final Ancillary item)
	{
		return getCruisePackage( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ancillary.cruisePackage</code> attribute. 
	 * @param value the cruisePackage
	 */
	public void setCruisePackage(final SessionContext ctx, final Ancillary item, final CruisePackage value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.Ancillary.CRUISEPACKAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ancillary.cruisePackage</code> attribute. 
	 * @param value the cruisePackage
	 */
	public void setCruisePackage(final Ancillary item, final CruisePackage value)
	{
		setCruisePackage( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Theme.cruisePackage</code> attribute.
	 * @return the cruisePackage
	 */
	public Collection<CruisePackage> getCruisePackage(final SessionContext ctx, final EnumerationValue item)
	{
		final List<CruisePackage> items = item.getLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			"CruisePackage",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Theme.cruisePackage</code> attribute.
	 * @return the cruisePackage
	 */
	public Collection<CruisePackage> getCruisePackage(final EnumerationValue item)
	{
		return getCruisePackage( getSession().getSessionContext(), item );
	}
	
	public long getCruisePackageCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			"CruisePackage",
			null
		);
	}
	
	public long getCruisePackageCount(final EnumerationValue item)
	{
		return getCruisePackageCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Theme.cruisePackage</code> attribute. 
	 * @param value the cruisePackage
	 */
	public void setCruisePackage(final SessionContext ctx, final EnumerationValue item, final Collection<CruisePackage> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CRUISEPACKAGETOTHEMES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Theme.cruisePackage</code> attribute. 
	 * @param value the cruisePackage
	 */
	public void setCruisePackage(final EnumerationValue item, final Collection<CruisePackage> value)
	{
		setCruisePackage( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruisePackage. 
	 * @param value the item to add to cruisePackage
	 */
	public void addToCruisePackage(final SessionContext ctx, final EnumerationValue item, final CruisePackage value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CRUISEPACKAGETOTHEMES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruisePackage. 
	 * @param value the item to add to cruisePackage
	 */
	public void addToCruisePackage(final EnumerationValue item, final CruisePackage value)
	{
		addToCruisePackage( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruisePackage. 
	 * @param value the item to remove from cruisePackage
	 */
	public void removeFromCruisePackage(final SessionContext ctx, final EnumerationValue item, final CruisePackage value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CRUISEPACKAGETOTHEMES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruisePackage. 
	 * @param value the item to remove from cruisePackage
	 */
	public void removeFromCruisePackage(final EnumerationValue item, final CruisePackage value)
	{
		removeFromCruisePackage( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.cruisePort</code> attribute.
	 * @return the cruisePort
	 */
	public CruisePort getCruisePort(final SessionContext ctx, final Route item)
	{
		return (CruisePort)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.Route.CRUISEPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.cruisePort</code> attribute.
	 * @return the cruisePort
	 */
	public CruisePort getCruisePort(final Route item)
	{
		return getCruisePort( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.cruisePort</code> attribute. 
	 * @param value the cruisePort
	 */
	public void setCruisePort(final SessionContext ctx, final Route item, final CruisePort value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.Route.CRUISEPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.cruisePort</code> attribute. 
	 * @param value the cruisePort
	 */
	public void setCruisePort(final Route item, final CruisePort value)
	{
		setCruisePort( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassAttributeAssignment.dropDownDataSource</code> attribute.
	 * @return the dropDownDataSource - Drop Down Data Source
	 */
	public EnumerationType getDropDownDataSource(final SessionContext ctx, final ClassAttributeAssignment item)
	{
		return (EnumerationType)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.ClassAttributeAssignment.DROPDOWNDATASOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClassAttributeAssignment.dropDownDataSource</code> attribute.
	 * @return the dropDownDataSource - Drop Down Data Source
	 */
	public EnumerationType getDropDownDataSource(final ClassAttributeAssignment item)
	{
		return getDropDownDataSource( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassAttributeAssignment.dropDownDataSource</code> attribute. 
	 * @param value the dropDownDataSource - Drop Down Data Source
	 */
	public void setDropDownDataSource(final SessionContext ctx, final ClassAttributeAssignment item, final EnumerationType value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.ClassAttributeAssignment.DROPDOWNDATASOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClassAttributeAssignment.dropDownDataSource</code> attribute. 
	 * @param value the dropDownDataSource - Drop Down Data Source
	 */
	public void setDropDownDataSource(final ClassAttributeAssignment item, final EnumerationType value)
	{
		setDropDownDataSource( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProgram.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public Collection<FlightProduct> getFlightProduct(final SessionContext ctx, final TravellerProgram item)
	{
		final List<FlightProduct> items = item.getLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			"FlightProduct",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravellerProgram.flightProduct</code> attribute.
	 * @return the flightProduct
	 */
	public Collection<FlightProduct> getFlightProduct(final TravellerProgram item)
	{
		return getFlightProduct( getSession().getSessionContext(), item );
	}
	
	public long getFlightProductCount(final SessionContext ctx, final TravellerProgram item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			"FlightProduct",
			null
		);
	}
	
	public long getFlightProductCount(final TravellerProgram item)
	{
		return getFlightProductCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProgram.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final SessionContext ctx, final TravellerProgram item, final Collection<FlightProduct> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHTPRODUCTTOTRAVELPROGRAMS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravellerProgram.flightProduct</code> attribute. 
	 * @param value the flightProduct
	 */
	public void setFlightProduct(final TravellerProgram item, final Collection<FlightProduct> value)
	{
		setFlightProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightProduct. 
	 * @param value the item to add to flightProduct
	 */
	public void addToFlightProduct(final SessionContext ctx, final TravellerProgram item, final FlightProduct value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHTPRODUCTTOTRAVELPROGRAMS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to flightProduct. 
	 * @param value the item to add to flightProduct
	 */
	public void addToFlightProduct(final TravellerProgram item, final FlightProduct value)
	{
		addToFlightProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightProduct. 
	 * @param value the item to remove from flightProduct
	 */
	public void removeFromFlightProduct(final SessionContext ctx, final TravellerProgram item, final FlightProduct value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.FLIGHTPRODUCTTOTRAVELPROGRAMS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(FLIGHTPRODUCTTOTRAVELPROGRAMS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from flightProduct. 
	 * @param value the item to remove from flightProduct
	 */
	public void removeFromFlightProduct(final TravellerProgram item, final FlightProduct value)
	{
		removeFromFlightProduct( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TransportproductmasterscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.landmark</code> attribute.
	 * @return the landmark - Landmark
	 */
	public String getLandmark(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.Address.LANDMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.landmark</code> attribute.
	 * @return the landmark - Landmark
	 */
	public String getLandmark(final Address item)
	{
		return getLandmark( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.landmark</code> attribute. 
	 * @param value the landmark - Landmark
	 */
	public void setLandmark(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.Address.LANDMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.landmark</code> attribute. 
	 * @param value the landmark - Landmark
	 */
	public void setLandmark(final Address item, final String value)
	{
		setLandmark( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.notes</code> attribute.
	 * @return the notes - Notes
	 */
	public String getNotes(final SessionContext ctx, final Address item)
	{
		return (String)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.Address.NOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.notes</code> attribute.
	 * @return the notes - Notes
	 */
	public String getNotes(final Address item)
	{
		return getNotes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.notes</code> attribute. 
	 * @param value the notes - Notes
	 */
	public void setNotes(final SessionContext ctx, final Address item, final String value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.Address.NOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.notes</code> attribute. 
	 * @param value the notes - Notes
	 */
	public void setNotes(final Address item, final String value)
	{
		setNotes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.ship</code> attribute.
	 * @return the ship
	 */
	public Ship getShip(final SessionContext ctx, final HealthAndSafety item)
	{
		return (Ship)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.HealthAndSafety.SHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.ship</code> attribute.
	 * @return the ship
	 */
	public Ship getShip(final HealthAndSafety item)
	{
		return getShip( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final SessionContext ctx, final HealthAndSafety item, final Ship value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.HealthAndSafety.SHIP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final HealthAndSafety item, final Ship value)
	{
		setShip( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.shipDescription</code> attribute.
	 * @return the shipDescription
	 */
	public ShipDescription getShipDescription(final SessionContext ctx, final DescriptionDetails item)
	{
		return (ShipDescription)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.DescriptionDetails.SHIPDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.shipDescription</code> attribute.
	 * @return the shipDescription
	 */
	public ShipDescription getShipDescription(final DescriptionDetails item)
	{
		return getShipDescription( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.shipDescription</code> attribute. 
	 * @param value the shipDescription
	 */
	public void setShipDescription(final SessionContext ctx, final DescriptionDetails item, final ShipDescription value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.DescriptionDetails.SHIPDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.shipDescription</code> attribute. 
	 * @param value the shipDescription
	 */
	public void setShipDescription(final DescriptionDetails item, final ShipDescription value)
	{
		setShipDescription( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.shoreExcursions</code> attribute.
	 * @return the shoreExcursions
	 */
	public ShoreExcursion getShoreExcursions(final SessionContext ctx, final Media item)
	{
		return (ShoreExcursion)item.getProperty( ctx, TransportproductmasterscoreConstants.Attributes.Media.SHOREEXCURSIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.shoreExcursions</code> attribute.
	 * @return the shoreExcursions
	 */
	public ShoreExcursion getShoreExcursions(final Media item)
	{
		return getShoreExcursions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.shoreExcursions</code> attribute. 
	 * @param value the shoreExcursions
	 */
	public void setShoreExcursions(final SessionContext ctx, final Media item, final ShoreExcursion value)
	{
		item.setProperty(ctx, TransportproductmasterscoreConstants.Attributes.Media.SHOREEXCURSIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.shoreExcursions</code> attribute. 
	 * @param value the shoreExcursions
	 */
	public void setShoreExcursions(final Media item, final ShoreExcursion value)
	{
		setShoreExcursions( getSession().getSessionContext(), item, value );
	}
	
}
