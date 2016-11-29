/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.product.common.core.jalo.CruiseBrand;
import com.cnk.travelogix.product.common.core.jalo.CruiseCompany;
import com.cnk.travelogix.product.common.core.jalo.CruiseDestination;
import com.cnk.travelogix.product.common.core.jalo.Deck;
import com.cnk.travelogix.product.common.core.jalo.HealthAndSafety;
import com.cnk.travelogix.product.common.core.jalo.RescueSecurityDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipAccomadationDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipConstructionDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipDescription;
import com.cnk.travelogix.product.common.core.jalo.ShipDimensionDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipEngineDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipEquipmentDetails;
import com.cnk.travelogix.product.common.core.jalo.ShipOverview;
import com.cnk.travelogix.product.common.core.jalo.ShipPerformanceCapabilities;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseRuleInformation;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseUpdate;
import com.cnk.travelogix.product.transport.masters.core.jalo.FacilityDetail;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Ship Ship}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShip extends AbstractTravelogixItem
{
	/** Qualifier of the <code>Ship.shipCommonID</code> attribute **/
	public static final String SHIPCOMMONID = "shipCommonID";
	/** Qualifier of the <code>Ship.cruiseBrandName</code> attribute **/
	public static final String CRUISEBRANDNAME = "cruiseBrandName";
	/** Qualifier of the <code>Ship.cruiseCompanyName</code> attribute **/
	public static final String CRUISECOMPANYNAME = "cruiseCompanyName";
	/** Qualifier of the <code>Ship.shipName</code> attribute **/
	public static final String SHIPNAME = "shipName";
	/** Qualifier of the <code>Ship.shipCode</code> attribute **/
	public static final String SHIPCODE = "shipCode";
	/** Qualifier of the <code>Ship.shipRating</code> attribute **/
	public static final String SHIPRATING = "shipRating";
	/** Qualifier of the <code>Ship.shipDisplayName</code> attribute **/
	public static final String SHIPDISPLAYNAME = "shipDisplayName";
	/** Qualifier of the <code>Ship.shipClass</code> attribute **/
	public static final String SHIPCLASS = "shipClass";
	/** Qualifier of the <code>Ship.cruiseDestinationName</code> attribute **/
	public static final String CRUISEDESTINATIONNAME = "cruiseDestinationName";
	/** Qualifier of the <code>Ship.shipCategory</code> attribute **/
	public static final String SHIPCATEGORY = "shipCategory";
	/** Qualifier of the <code>Ship.cruiseType</code> attribute **/
	public static final String CRUISETYPE = "cruiseType";
	/** Qualifier of the <code>Ship.cruiseSubType</code> attribute **/
	public static final String CRUISESUBTYPE = "cruiseSubType";
	/** Qualifier of the <code>Ship.isMultipleDeckAvailable</code> attribute **/
	public static final String ISMULTIPLEDECKAVAILABLE = "isMultipleDeckAvailable";
	/** Qualifier of the <code>Ship.onlineDate</code> attribute **/
	public static final String ONLINEDATE = "onlineDate";
	/** Qualifier of the <code>Ship.offlineDate</code> attribute **/
	public static final String OFFLINEDATE = "offlineDate";
	/** Qualifier of the <code>Ship.shipDescription</code> attribute **/
	public static final String SHIPDESCRIPTION = "shipDescription";
	/** Qualifier of the <code>Ship.cabinInformation</code> attribute **/
	public static final String CABININFORMATION = "cabinInformation";
	/** Qualifier of the <code>Ship.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>Ship.shipOverview</code> attribute **/
	public static final String SHIPOVERVIEW = "shipOverview";
	/** Qualifier of the <code>Ship.constructionDetails</code> attribute **/
	public static final String CONSTRUCTIONDETAILS = "constructionDetails";
	/** Qualifier of the <code>Ship.engineDetails</code> attribute **/
	public static final String ENGINEDETAILS = "engineDetails";
	/** Qualifier of the <code>Ship.dimensionDetails</code> attribute **/
	public static final String DIMENSIONDETAILS = "dimensionDetails";
	/** Qualifier of the <code>Ship.shipPerformanceCapabilities</code> attribute **/
	public static final String SHIPPERFORMANCECAPABILITIES = "shipPerformanceCapabilities";
	/** Qualifier of the <code>Ship.accommodationDetails</code> attribute **/
	public static final String ACCOMMODATIONDETAILS = "accommodationDetails";
	/** Qualifier of the <code>Ship.equipmentDetails</code> attribute **/
	public static final String EQUIPMENTDETAILS = "equipmentDetails";
	/** Qualifier of the <code>Ship.rescueSecurityDetails</code> attribute **/
	public static final String RESCUESECURITYDETAILS = "rescueSecurityDetails";
	/** Qualifier of the <code>Ship.cruiseUpdates</code> attribute **/
	public static final String CRUISEUPDATES = "cruiseUpdates";
	/** Qualifier of the <code>Ship.cruiseRuleInformations</code> attribute **/
	public static final String CRUISERULEINFORMATIONS = "cruiseRuleInformations";
	/** Qualifier of the <code>Ship.healthAndSafetyRules</code> attribute **/
	public static final String HEALTHANDSAFETYRULES = "healthAndSafetyRules";
	/** Qualifier of the <code>Ship.shipFacilities</code> attribute **/
	public static final String SHIPFACILITIES = "shipFacilities";
	/** Relation ordering override parameter constants for ShipToFacilities from ((transportproductmasterscore))*/
	protected static String SHIPTOFACILITIES_SRC_ORDERED = "relation.ShipToFacilities.source.ordered";
	protected static String SHIPTOFACILITIES_TGT_ORDERED = "relation.ShipToFacilities.target.ordered";
	/** Relation disable markmodifed parameter constants for ShipToFacilities from ((transportproductmasterscore))*/
	protected static String SHIPTOFACILITIES_MARKMODIFIED = "relation.ShipToFacilities.markmodified";
	/** Qualifier of the <code>Ship.deckDetails</code> attribute **/
	public static final String DECKDETAILS = "deckDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n CRUISEUPDATES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruiseUpdate> CRUISEUPDATESHANDLER = new OneToManyHandler<CruiseUpdate>(
	TransportproductmasterscoreConstants.TC.CRUISEUPDATE,
	true,
	"ship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CRUISERULEINFORMATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruiseRuleInformation> CRUISERULEINFORMATIONSHANDLER = new OneToManyHandler<CruiseRuleInformation>(
	TransportproductmasterscoreConstants.TC.CRUISERULEINFORMATION,
	true,
	"ship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n HEALTHANDSAFETYRULES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HealthAndSafety> HEALTHANDSAFETYRULESHANDLER = new OneToManyHandler<HealthAndSafety>(
	CommonproductcoreConstants.TC.HEALTHANDSAFETY,
	true,
	"ship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DECKDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Deck> DECKDETAILSHANDLER = new OneToManyHandler<Deck>(
	TransportproductmasterscoreConstants.TC.DECK,
	true,
	"ship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SHIPCOMMONID, AttributeMode.INITIAL);
		tmp.put(CRUISEBRANDNAME, AttributeMode.INITIAL);
		tmp.put(CRUISECOMPANYNAME, AttributeMode.INITIAL);
		tmp.put(SHIPNAME, AttributeMode.INITIAL);
		tmp.put(SHIPCODE, AttributeMode.INITIAL);
		tmp.put(SHIPRATING, AttributeMode.INITIAL);
		tmp.put(SHIPDISPLAYNAME, AttributeMode.INITIAL);
		tmp.put(SHIPCLASS, AttributeMode.INITIAL);
		tmp.put(CRUISEDESTINATIONNAME, AttributeMode.INITIAL);
		tmp.put(SHIPCATEGORY, AttributeMode.INITIAL);
		tmp.put(CRUISETYPE, AttributeMode.INITIAL);
		tmp.put(CRUISESUBTYPE, AttributeMode.INITIAL);
		tmp.put(ISMULTIPLEDECKAVAILABLE, AttributeMode.INITIAL);
		tmp.put(ONLINEDATE, AttributeMode.INITIAL);
		tmp.put(OFFLINEDATE, AttributeMode.INITIAL);
		tmp.put(SHIPDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(CABININFORMATION, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(SHIPOVERVIEW, AttributeMode.INITIAL);
		tmp.put(CONSTRUCTIONDETAILS, AttributeMode.INITIAL);
		tmp.put(ENGINEDETAILS, AttributeMode.INITIAL);
		tmp.put(DIMENSIONDETAILS, AttributeMode.INITIAL);
		tmp.put(SHIPPERFORMANCECAPABILITIES, AttributeMode.INITIAL);
		tmp.put(ACCOMMODATIONDETAILS, AttributeMode.INITIAL);
		tmp.put(EQUIPMENTDETAILS, AttributeMode.INITIAL);
		tmp.put(RESCUESECURITYDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.accommodationDetails</code> attribute.
	 * @return the accommodationDetails - Accommodation Details
	 */
	public ShipAccomadationDetails getAccommodationDetails(final SessionContext ctx)
	{
		return (ShipAccomadationDetails)getProperty( ctx, ACCOMMODATIONDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.accommodationDetails</code> attribute.
	 * @return the accommodationDetails - Accommodation Details
	 */
	public ShipAccomadationDetails getAccommodationDetails()
	{
		return getAccommodationDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.accommodationDetails</code> attribute. 
	 * @param value the accommodationDetails - Accommodation Details
	 */
	public void setAccommodationDetails(final SessionContext ctx, final ShipAccomadationDetails value)
	{
		setProperty(ctx, ACCOMMODATIONDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.accommodationDetails</code> attribute. 
	 * @param value the accommodationDetails - Accommodation Details
	 */
	public void setAccommodationDetails(final ShipAccomadationDetails value)
	{
		setAccommodationDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cabinInformation</code> attribute.
	 * @return the cabinInformation - Cabin Information
	 */
	public Cabin getCabinInformation(final SessionContext ctx)
	{
		return (Cabin)getProperty( ctx, CABININFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cabinInformation</code> attribute.
	 * @return the cabinInformation - Cabin Information
	 */
	public Cabin getCabinInformation()
	{
		return getCabinInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cabinInformation</code> attribute. 
	 * @param value the cabinInformation - Cabin Information
	 */
	public void setCabinInformation(final SessionContext ctx, final Cabin value)
	{
		setProperty(ctx, CABININFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cabinInformation</code> attribute. 
	 * @param value the cabinInformation - Cabin Information
	 */
	public void setCabinInformation(final Cabin value)
	{
		setCabinInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.constructionDetails</code> attribute.
	 * @return the constructionDetails - Construction Details
	 */
	public ShipConstructionDetails getConstructionDetails(final SessionContext ctx)
	{
		return (ShipConstructionDetails)getProperty( ctx, CONSTRUCTIONDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.constructionDetails</code> attribute.
	 * @return the constructionDetails - Construction Details
	 */
	public ShipConstructionDetails getConstructionDetails()
	{
		return getConstructionDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.constructionDetails</code> attribute. 
	 * @param value the constructionDetails - Construction Details
	 */
	public void setConstructionDetails(final SessionContext ctx, final ShipConstructionDetails value)
	{
		setProperty(ctx, CONSTRUCTIONDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.constructionDetails</code> attribute. 
	 * @param value the constructionDetails - Construction Details
	 */
	public void setConstructionDetails(final ShipConstructionDetails value)
	{
		setConstructionDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.copiedFrom</code> attribute.
	 * @return the copiedFrom - CopiedFrom
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.copiedFrom</code> attribute.
	 * @return the copiedFrom - CopiedFrom
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - CopiedFrom
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - CopiedFrom
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseBrandName</code> attribute.
	 * @return the cruiseBrandName - Cruise Brand Name
	 */
	public CruiseBrand getCruiseBrandName(final SessionContext ctx)
	{
		return (CruiseBrand)getProperty( ctx, CRUISEBRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseBrandName</code> attribute.
	 * @return the cruiseBrandName - Cruise Brand Name
	 */
	public CruiseBrand getCruiseBrandName()
	{
		return getCruiseBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseBrandName</code> attribute. 
	 * @param value the cruiseBrandName - Cruise Brand Name
	 */
	public void setCruiseBrandName(final SessionContext ctx, final CruiseBrand value)
	{
		setProperty(ctx, CRUISEBRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseBrandName</code> attribute. 
	 * @param value the cruiseBrandName - Cruise Brand Name
	 */
	public void setCruiseBrandName(final CruiseBrand value)
	{
		setCruiseBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseCompanyName</code> attribute.
	 * @return the cruiseCompanyName - Cruise Company Name
	 */
	public CruiseCompany getCruiseCompanyName(final SessionContext ctx)
	{
		return (CruiseCompany)getProperty( ctx, CRUISECOMPANYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseCompanyName</code> attribute.
	 * @return the cruiseCompanyName - Cruise Company Name
	 */
	public CruiseCompany getCruiseCompanyName()
	{
		return getCruiseCompanyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseCompanyName</code> attribute. 
	 * @param value the cruiseCompanyName - Cruise Company Name
	 */
	public void setCruiseCompanyName(final SessionContext ctx, final CruiseCompany value)
	{
		setProperty(ctx, CRUISECOMPANYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseCompanyName</code> attribute. 
	 * @param value the cruiseCompanyName - Cruise Company Name
	 */
	public void setCruiseCompanyName(final CruiseCompany value)
	{
		setCruiseCompanyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseDestinationName</code> attribute.
	 * @return the cruiseDestinationName - Cruise Destination Name
	 */
	public CruiseDestination getCruiseDestinationName(final SessionContext ctx)
	{
		return (CruiseDestination)getProperty( ctx, CRUISEDESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseDestinationName</code> attribute.
	 * @return the cruiseDestinationName - Cruise Destination Name
	 */
	public CruiseDestination getCruiseDestinationName()
	{
		return getCruiseDestinationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseDestinationName</code> attribute. 
	 * @param value the cruiseDestinationName - Cruise Destination Name
	 */
	public void setCruiseDestinationName(final SessionContext ctx, final CruiseDestination value)
	{
		setProperty(ctx, CRUISEDESTINATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseDestinationName</code> attribute. 
	 * @param value the cruiseDestinationName - Cruise Destination Name
	 */
	public void setCruiseDestinationName(final CruiseDestination value)
	{
		setCruiseDestinationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseRuleInformations</code> attribute.
	 * @return the cruiseRuleInformations
	 */
	public Collection<CruiseRuleInformation> getCruiseRuleInformations(final SessionContext ctx)
	{
		return CRUISERULEINFORMATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseRuleInformations</code> attribute.
	 * @return the cruiseRuleInformations
	 */
	public Collection<CruiseRuleInformation> getCruiseRuleInformations()
	{
		return getCruiseRuleInformations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseRuleInformations</code> attribute. 
	 * @param value the cruiseRuleInformations
	 */
	public void setCruiseRuleInformations(final SessionContext ctx, final Collection<CruiseRuleInformation> value)
	{
		CRUISERULEINFORMATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseRuleInformations</code> attribute. 
	 * @param value the cruiseRuleInformations
	 */
	public void setCruiseRuleInformations(final Collection<CruiseRuleInformation> value)
	{
		setCruiseRuleInformations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseRuleInformations. 
	 * @param value the item to add to cruiseRuleInformations
	 */
	public void addToCruiseRuleInformations(final SessionContext ctx, final CruiseRuleInformation value)
	{
		CRUISERULEINFORMATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseRuleInformations. 
	 * @param value the item to add to cruiseRuleInformations
	 */
	public void addToCruiseRuleInformations(final CruiseRuleInformation value)
	{
		addToCruiseRuleInformations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseRuleInformations. 
	 * @param value the item to remove from cruiseRuleInformations
	 */
	public void removeFromCruiseRuleInformations(final SessionContext ctx, final CruiseRuleInformation value)
	{
		CRUISERULEINFORMATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseRuleInformations. 
	 * @param value the item to remove from cruiseRuleInformations
	 */
	public void removeFromCruiseRuleInformations(final CruiseRuleInformation value)
	{
		removeFromCruiseRuleInformations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseSubType</code> attribute.
	 * @return the cruiseSubType - Cruise Sub Types
	 */
	public EnumerationValue getCruiseSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CRUISESUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseSubType</code> attribute.
	 * @return the cruiseSubType - Cruise Sub Types
	 */
	public EnumerationValue getCruiseSubType()
	{
		return getCruiseSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseSubType</code> attribute. 
	 * @param value the cruiseSubType - Cruise Sub Types
	 */
	public void setCruiseSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CRUISESUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseSubType</code> attribute. 
	 * @param value the cruiseSubType - Cruise Sub Types
	 */
	public void setCruiseSubType(final EnumerationValue value)
	{
		setCruiseSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseType</code> attribute.
	 * @return the cruiseType - Cruise Types
	 */
	public EnumerationValue getCruiseType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CRUISETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseType</code> attribute.
	 * @return the cruiseType - Cruise Types
	 */
	public EnumerationValue getCruiseType()
	{
		return getCruiseType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseType</code> attribute. 
	 * @param value the cruiseType - Cruise Types
	 */
	public void setCruiseType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CRUISETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseType</code> attribute. 
	 * @param value the cruiseType - Cruise Types
	 */
	public void setCruiseType(final EnumerationValue value)
	{
		setCruiseType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseUpdates</code> attribute.
	 * @return the cruiseUpdates
	 */
	public Collection<CruiseUpdate> getCruiseUpdates(final SessionContext ctx)
	{
		return CRUISEUPDATESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.cruiseUpdates</code> attribute.
	 * @return the cruiseUpdates
	 */
	public Collection<CruiseUpdate> getCruiseUpdates()
	{
		return getCruiseUpdates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseUpdates</code> attribute. 
	 * @param value the cruiseUpdates
	 */
	public void setCruiseUpdates(final SessionContext ctx, final Collection<CruiseUpdate> value)
	{
		CRUISEUPDATESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.cruiseUpdates</code> attribute. 
	 * @param value the cruiseUpdates
	 */
	public void setCruiseUpdates(final Collection<CruiseUpdate> value)
	{
		setCruiseUpdates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseUpdates. 
	 * @param value the item to add to cruiseUpdates
	 */
	public void addToCruiseUpdates(final SessionContext ctx, final CruiseUpdate value)
	{
		CRUISEUPDATESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseUpdates. 
	 * @param value the item to add to cruiseUpdates
	 */
	public void addToCruiseUpdates(final CruiseUpdate value)
	{
		addToCruiseUpdates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseUpdates. 
	 * @param value the item to remove from cruiseUpdates
	 */
	public void removeFromCruiseUpdates(final SessionContext ctx, final CruiseUpdate value)
	{
		CRUISEUPDATESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseUpdates. 
	 * @param value the item to remove from cruiseUpdates
	 */
	public void removeFromCruiseUpdates(final CruiseUpdate value)
	{
		removeFromCruiseUpdates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.deckDetails</code> attribute.
	 * @return the deckDetails
	 */
	public Collection<Deck> getDeckDetails(final SessionContext ctx)
	{
		return DECKDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.deckDetails</code> attribute.
	 * @return the deckDetails
	 */
	public Collection<Deck> getDeckDetails()
	{
		return getDeckDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.deckDetails</code> attribute. 
	 * @param value the deckDetails
	 */
	public void setDeckDetails(final SessionContext ctx, final Collection<Deck> value)
	{
		DECKDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.deckDetails</code> attribute. 
	 * @param value the deckDetails
	 */
	public void setDeckDetails(final Collection<Deck> value)
	{
		setDeckDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to deckDetails. 
	 * @param value the item to add to deckDetails
	 */
	public void addToDeckDetails(final SessionContext ctx, final Deck value)
	{
		DECKDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to deckDetails. 
	 * @param value the item to add to deckDetails
	 */
	public void addToDeckDetails(final Deck value)
	{
		addToDeckDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from deckDetails. 
	 * @param value the item to remove from deckDetails
	 */
	public void removeFromDeckDetails(final SessionContext ctx, final Deck value)
	{
		DECKDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from deckDetails. 
	 * @param value the item to remove from deckDetails
	 */
	public void removeFromDeckDetails(final Deck value)
	{
		removeFromDeckDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.dimensionDetails</code> attribute.
	 * @return the dimensionDetails - Dimension Details
	 */
	public ShipDimensionDetails getDimensionDetails(final SessionContext ctx)
	{
		return (ShipDimensionDetails)getProperty( ctx, DIMENSIONDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.dimensionDetails</code> attribute.
	 * @return the dimensionDetails - Dimension Details
	 */
	public ShipDimensionDetails getDimensionDetails()
	{
		return getDimensionDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.dimensionDetails</code> attribute. 
	 * @param value the dimensionDetails - Dimension Details
	 */
	public void setDimensionDetails(final SessionContext ctx, final ShipDimensionDetails value)
	{
		setProperty(ctx, DIMENSIONDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.dimensionDetails</code> attribute. 
	 * @param value the dimensionDetails - Dimension Details
	 */
	public void setDimensionDetails(final ShipDimensionDetails value)
	{
		setDimensionDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.engineDetails</code> attribute.
	 * @return the engineDetails - Engine Details
	 */
	public ShipEngineDetails getEngineDetails(final SessionContext ctx)
	{
		return (ShipEngineDetails)getProperty( ctx, ENGINEDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.engineDetails</code> attribute.
	 * @return the engineDetails - Engine Details
	 */
	public ShipEngineDetails getEngineDetails()
	{
		return getEngineDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.engineDetails</code> attribute. 
	 * @param value the engineDetails - Engine Details
	 */
	public void setEngineDetails(final SessionContext ctx, final ShipEngineDetails value)
	{
		setProperty(ctx, ENGINEDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.engineDetails</code> attribute. 
	 * @param value the engineDetails - Engine Details
	 */
	public void setEngineDetails(final ShipEngineDetails value)
	{
		setEngineDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.equipmentDetails</code> attribute.
	 * @return the equipmentDetails - Equipment Details
	 */
	public ShipEquipmentDetails getEquipmentDetails(final SessionContext ctx)
	{
		return (ShipEquipmentDetails)getProperty( ctx, EQUIPMENTDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.equipmentDetails</code> attribute.
	 * @return the equipmentDetails - Equipment Details
	 */
	public ShipEquipmentDetails getEquipmentDetails()
	{
		return getEquipmentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.equipmentDetails</code> attribute. 
	 * @param value the equipmentDetails - Equipment Details
	 */
	public void setEquipmentDetails(final SessionContext ctx, final ShipEquipmentDetails value)
	{
		setProperty(ctx, EQUIPMENTDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.equipmentDetails</code> attribute. 
	 * @param value the equipmentDetails - Equipment Details
	 */
	public void setEquipmentDetails(final ShipEquipmentDetails value)
	{
		setEquipmentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.healthAndSafetyRules</code> attribute.
	 * @return the healthAndSafetyRules
	 */
	public Collection<HealthAndSafety> getHealthAndSafetyRules(final SessionContext ctx)
	{
		return HEALTHANDSAFETYRULESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.healthAndSafetyRules</code> attribute.
	 * @return the healthAndSafetyRules
	 */
	public Collection<HealthAndSafety> getHealthAndSafetyRules()
	{
		return getHealthAndSafetyRules( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.healthAndSafetyRules</code> attribute. 
	 * @param value the healthAndSafetyRules
	 */
	public void setHealthAndSafetyRules(final SessionContext ctx, final Collection<HealthAndSafety> value)
	{
		HEALTHANDSAFETYRULESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.healthAndSafetyRules</code> attribute. 
	 * @param value the healthAndSafetyRules
	 */
	public void setHealthAndSafetyRules(final Collection<HealthAndSafety> value)
	{
		setHealthAndSafetyRules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to healthAndSafetyRules. 
	 * @param value the item to add to healthAndSafetyRules
	 */
	public void addToHealthAndSafetyRules(final SessionContext ctx, final HealthAndSafety value)
	{
		HEALTHANDSAFETYRULESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to healthAndSafetyRules. 
	 * @param value the item to add to healthAndSafetyRules
	 */
	public void addToHealthAndSafetyRules(final HealthAndSafety value)
	{
		addToHealthAndSafetyRules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from healthAndSafetyRules. 
	 * @param value the item to remove from healthAndSafetyRules
	 */
	public void removeFromHealthAndSafetyRules(final SessionContext ctx, final HealthAndSafety value)
	{
		HEALTHANDSAFETYRULESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from healthAndSafetyRules. 
	 * @param value the item to remove from healthAndSafetyRules
	 */
	public void removeFromHealthAndSafetyRules(final HealthAndSafety value)
	{
		removeFromHealthAndSafetyRules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.isMultipleDeckAvailable</code> attribute.
	 * @return the isMultipleDeckAvailable - Is Multiple Deck Available
	 */
	public Boolean isIsMultipleDeckAvailable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISMULTIPLEDECKAVAILABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.isMultipleDeckAvailable</code> attribute.
	 * @return the isMultipleDeckAvailable - Is Multiple Deck Available
	 */
	public Boolean isIsMultipleDeckAvailable()
	{
		return isIsMultipleDeckAvailable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.isMultipleDeckAvailable</code> attribute. 
	 * @return the isMultipleDeckAvailable - Is Multiple Deck Available
	 */
	public boolean isIsMultipleDeckAvailableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsMultipleDeckAvailable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.isMultipleDeckAvailable</code> attribute. 
	 * @return the isMultipleDeckAvailable - Is Multiple Deck Available
	 */
	public boolean isIsMultipleDeckAvailableAsPrimitive()
	{
		return isIsMultipleDeckAvailableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.isMultipleDeckAvailable</code> attribute. 
	 * @param value the isMultipleDeckAvailable - Is Multiple Deck Available
	 */
	public void setIsMultipleDeckAvailable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISMULTIPLEDECKAVAILABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.isMultipleDeckAvailable</code> attribute. 
	 * @param value the isMultipleDeckAvailable - Is Multiple Deck Available
	 */
	public void setIsMultipleDeckAvailable(final Boolean value)
	{
		setIsMultipleDeckAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.isMultipleDeckAvailable</code> attribute. 
	 * @param value the isMultipleDeckAvailable - Is Multiple Deck Available
	 */
	public void setIsMultipleDeckAvailable(final SessionContext ctx, final boolean value)
	{
		setIsMultipleDeckAvailable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.isMultipleDeckAvailable</code> attribute. 
	 * @param value the isMultipleDeckAvailable - Is Multiple Deck Available
	 */
	public void setIsMultipleDeckAvailable(final boolean value)
	{
		setIsMultipleDeckAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.offlineDate</code> attribute.
	 * @return the offlineDate - offline Date
	 */
	public Date getOfflineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.offlineDate</code> attribute.
	 * @return the offlineDate - offline Date
	 */
	public Date getOfflineDate()
	{
		return getOfflineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.offlineDate</code> attribute. 
	 * @param value the offlineDate - offline Date
	 */
	public void setOfflineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.offlineDate</code> attribute. 
	 * @param value the offlineDate - offline Date
	 */
	public void setOfflineDate(final Date value)
	{
		setOfflineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.onlineDate</code> attribute.
	 * @return the onlineDate - Online Date
	 */
	public Date getOnlineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.onlineDate</code> attribute.
	 * @return the onlineDate - Online Date
	 */
	public Date getOnlineDate()
	{
		return getOnlineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.onlineDate</code> attribute. 
	 * @param value the onlineDate - Online Date
	 */
	public void setOnlineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.onlineDate</code> attribute. 
	 * @param value the onlineDate - Online Date
	 */
	public void setOnlineDate(final Date value)
	{
		setOnlineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.rescueSecurityDetails</code> attribute.
	 * @return the rescueSecurityDetails - Rescue Security Details
	 */
	public RescueSecurityDetails getRescueSecurityDetails(final SessionContext ctx)
	{
		return (RescueSecurityDetails)getProperty( ctx, RESCUESECURITYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.rescueSecurityDetails</code> attribute.
	 * @return the rescueSecurityDetails - Rescue Security Details
	 */
	public RescueSecurityDetails getRescueSecurityDetails()
	{
		return getRescueSecurityDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.rescueSecurityDetails</code> attribute. 
	 * @param value the rescueSecurityDetails - Rescue Security Details
	 */
	public void setRescueSecurityDetails(final SessionContext ctx, final RescueSecurityDetails value)
	{
		setProperty(ctx, RESCUESECURITYDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.rescueSecurityDetails</code> attribute. 
	 * @param value the rescueSecurityDetails - Rescue Security Details
	 */
	public void setRescueSecurityDetails(final RescueSecurityDetails value)
	{
		setRescueSecurityDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipCategory</code> attribute.
	 * @return the shipCategory - Ship 
	 * 						Category
	 */
	public EnumerationValue getShipCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SHIPCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipCategory</code> attribute.
	 * @return the shipCategory - Ship 
	 * 						Category
	 */
	public EnumerationValue getShipCategory()
	{
		return getShipCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipCategory</code> attribute. 
	 * @param value the shipCategory - Ship 
	 * 						Category
	 */
	public void setShipCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SHIPCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipCategory</code> attribute. 
	 * @param value the shipCategory - Ship 
	 * 						Category
	 */
	public void setShipCategory(final EnumerationValue value)
	{
		setShipCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipClass</code> attribute.
	 * @return the shipClass - Ship Class
	 */
	public EnumerationValue getShipClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SHIPCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipClass</code> attribute.
	 * @return the shipClass - Ship Class
	 */
	public EnumerationValue getShipClass()
	{
		return getShipClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipClass</code> attribute. 
	 * @param value the shipClass - Ship Class
	 */
	public void setShipClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SHIPCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipClass</code> attribute. 
	 * @param value the shipClass - Ship Class
	 */
	public void setShipClass(final EnumerationValue value)
	{
		setShipClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipCode</code> attribute.
	 * @return the shipCode - Ship Code
	 */
	public String getShipCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipCode</code> attribute.
	 * @return the shipCode - Ship Code
	 */
	public String getShipCode()
	{
		return getShipCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipCode</code> attribute. 
	 * @param value the shipCode - Ship Code
	 */
	public void setShipCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipCode</code> attribute. 
	 * @param value the shipCode - Ship Code
	 */
	public void setShipCode(final String value)
	{
		setShipCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipCommonID</code> attribute.
	 * @return the shipCommonID - Ship Common ID
	 */
	public String getShipCommonID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPCOMMONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipCommonID</code> attribute.
	 * @return the shipCommonID - Ship Common ID
	 */
	public String getShipCommonID()
	{
		return getShipCommonID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipCommonID</code> attribute. 
	 * @param value the shipCommonID - Ship Common ID
	 */
	public void setShipCommonID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPCOMMONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipCommonID</code> attribute. 
	 * @param value the shipCommonID - Ship Common ID
	 */
	public void setShipCommonID(final String value)
	{
		setShipCommonID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipDescription</code> attribute.
	 * @return the shipDescription - Ship Description
	 */
	public ShipDescription getShipDescription(final SessionContext ctx)
	{
		return (ShipDescription)getProperty( ctx, SHIPDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipDescription</code> attribute.
	 * @return the shipDescription - Ship Description
	 */
	public ShipDescription getShipDescription()
	{
		return getShipDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipDescription</code> attribute. 
	 * @param value the shipDescription - Ship Description
	 */
	public void setShipDescription(final SessionContext ctx, final ShipDescription value)
	{
		setProperty(ctx, SHIPDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipDescription</code> attribute. 
	 * @param value the shipDescription - Ship Description
	 */
	public void setShipDescription(final ShipDescription value)
	{
		setShipDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipDisplayName</code> attribute.
	 * @return the shipDisplayName - Ship Display Name
	 */
	public String getShipDisplayName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedShip.getShipDisplayName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SHIPDISPLAYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipDisplayName</code> attribute.
	 * @return the shipDisplayName - Ship Display Name
	 */
	public String getShipDisplayName()
	{
		return getShipDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipDisplayName</code> attribute. 
	 * @return the localized shipDisplayName - Ship Display Name
	 */
	public Map<Language,String> getAllShipDisplayName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SHIPDISPLAYNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipDisplayName</code> attribute. 
	 * @return the localized shipDisplayName - Ship Display Name
	 */
	public Map<Language,String> getAllShipDisplayName()
	{
		return getAllShipDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipDisplayName</code> attribute. 
	 * @param value the shipDisplayName - Ship Display Name
	 */
	public void setShipDisplayName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedShip.setShipDisplayName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SHIPDISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipDisplayName</code> attribute. 
	 * @param value the shipDisplayName - Ship Display Name
	 */
	public void setShipDisplayName(final String value)
	{
		setShipDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipDisplayName</code> attribute. 
	 * @param value the shipDisplayName - Ship Display Name
	 */
	public void setAllShipDisplayName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SHIPDISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipDisplayName</code> attribute. 
	 * @param value the shipDisplayName - Ship Display Name
	 */
	public void setAllShipDisplayName(final Map<Language,String> value)
	{
		setAllShipDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipFacilities</code> attribute.
	 * @return the shipFacilities
	 */
	public Collection<FacilityDetail> getShipFacilities(final SessionContext ctx)
	{
		final List<FacilityDetail> items = getLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			"FacilityDetail",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipFacilities</code> attribute.
	 * @return the shipFacilities
	 */
	public Collection<FacilityDetail> getShipFacilities()
	{
		return getShipFacilities( getSession().getSessionContext() );
	}
	
	public long getShipFacilitiesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			"FacilityDetail",
			null
		);
	}
	
	public long getShipFacilitiesCount()
	{
		return getShipFacilitiesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipFacilities</code> attribute. 
	 * @param value the shipFacilities
	 */
	public void setShipFacilities(final SessionContext ctx, final Collection<FacilityDetail> value)
	{
		new PartOfHandler<Collection<FacilityDetail>>()
		{
			@Override
			protected Collection<FacilityDetail> doGetValue(final SessionContext ctx)
			{
				return getShipFacilities( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<FacilityDetail> _value)
			{
				final Collection<FacilityDetail> value = _value;
				setLinkedItems( 
					ctx,
					true,
					TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(SHIPTOFACILITIES_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipFacilities</code> attribute. 
	 * @param value the shipFacilities
	 */
	public void setShipFacilities(final Collection<FacilityDetail> value)
	{
		setShipFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shipFacilities. 
	 * @param value the item to add to shipFacilities
	 */
	public void addToShipFacilities(final SessionContext ctx, final FacilityDetail value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SHIPTOFACILITIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shipFacilities. 
	 * @param value the item to add to shipFacilities
	 */
	public void addToShipFacilities(final FacilityDetail value)
	{
		addToShipFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shipFacilities. 
	 * @param value the item to remove from shipFacilities
	 */
	public void removeFromShipFacilities(final SessionContext ctx, final FacilityDetail value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SHIPTOFACILITIES_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,TransportproductmasterscoreConstants.Relations.SHIPTOFACILITIES,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shipFacilities. 
	 * @param value the item to remove from shipFacilities
	 */
	public void removeFromShipFacilities(final FacilityDetail value)
	{
		removeFromShipFacilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipName</code> attribute.
	 * @return the shipName - Ship Name
	 */
	public String getShipName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipName</code> attribute.
	 * @return the shipName - Ship Name
	 */
	public String getShipName()
	{
		return getShipName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipName</code> attribute. 
	 * @param value the shipName - Ship Name
	 */
	public void setShipName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipName</code> attribute. 
	 * @param value the shipName - Ship Name
	 */
	public void setShipName(final String value)
	{
		setShipName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipOverview</code> attribute.
	 * @return the shipOverview - Ship Overview
	 */
	public ShipOverview getShipOverview(final SessionContext ctx)
	{
		return (ShipOverview)getProperty( ctx, SHIPOVERVIEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipOverview</code> attribute.
	 * @return the shipOverview - Ship Overview
	 */
	public ShipOverview getShipOverview()
	{
		return getShipOverview( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipOverview</code> attribute. 
	 * @param value the shipOverview - Ship Overview
	 */
	public void setShipOverview(final SessionContext ctx, final ShipOverview value)
	{
		setProperty(ctx, SHIPOVERVIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipOverview</code> attribute. 
	 * @param value the shipOverview - Ship Overview
	 */
	public void setShipOverview(final ShipOverview value)
	{
		setShipOverview( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipPerformanceCapabilities</code> attribute.
	 * @return the shipPerformanceCapabilities - Ship Performance Capabilities
	 */
	public ShipPerformanceCapabilities getShipPerformanceCapabilities(final SessionContext ctx)
	{
		return (ShipPerformanceCapabilities)getProperty( ctx, SHIPPERFORMANCECAPABILITIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipPerformanceCapabilities</code> attribute.
	 * @return the shipPerformanceCapabilities - Ship Performance Capabilities
	 */
	public ShipPerformanceCapabilities getShipPerformanceCapabilities()
	{
		return getShipPerformanceCapabilities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipPerformanceCapabilities</code> attribute. 
	 * @param value the shipPerformanceCapabilities - Ship Performance Capabilities
	 */
	public void setShipPerformanceCapabilities(final SessionContext ctx, final ShipPerformanceCapabilities value)
	{
		setProperty(ctx, SHIPPERFORMANCECAPABILITIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipPerformanceCapabilities</code> attribute. 
	 * @param value the shipPerformanceCapabilities - Ship Performance Capabilities
	 */
	public void setShipPerformanceCapabilities(final ShipPerformanceCapabilities value)
	{
		setShipPerformanceCapabilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipRating</code> attribute.
	 * @return the shipRating - Ship Rating
	 */
	public EnumerationValue getShipRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SHIPRATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ship.shipRating</code> attribute.
	 * @return the shipRating - Ship Rating
	 */
	public EnumerationValue getShipRating()
	{
		return getShipRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipRating</code> attribute. 
	 * @param value the shipRating - Ship Rating
	 */
	public void setShipRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SHIPRATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ship.shipRating</code> attribute. 
	 * @param value the shipRating - Ship Rating
	 */
	public void setShipRating(final EnumerationValue value)
	{
		setShipRating( getSession().getSessionContext(), value );
	}
	
}
