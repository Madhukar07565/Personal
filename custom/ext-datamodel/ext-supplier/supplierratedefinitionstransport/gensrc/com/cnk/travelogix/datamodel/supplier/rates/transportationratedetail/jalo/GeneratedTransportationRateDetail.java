/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.transportationratedetail.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.abstractpriceapplicability.jalo.AbstractPriceApplicability;
import com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.TransportationRateDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.products.jalo.CarGroup;
import com.cnk.travelogix.product.transport.masters.core.jalo.VehicleDetails;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.price.Tax;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.transportationratedetail.jalo.TransportationRateDetail TransportationRateDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationRateDetail extends GenericItem
{
	/** Qualifier of the <code>TransportationRateDetail.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>TransportationRateDetail.cityTier</code> attribute **/
	public static final String CITYTIER = "cityTier";
	/** Qualifier of the <code>TransportationRateDetail.withChauffer</code> attribute **/
	public static final String WITHCHAUFFER = "withChauffer";
	/** Qualifier of the <code>TransportationRateDetail.carGroup</code> attribute **/
	public static final String CARGROUP = "carGroup";
	/** Qualifier of the <code>TransportationRateDetail.sippCode</code> attribute **/
	public static final String SIPPCODE = "sippCode";
	/** Qualifier of the <code>TransportationRateDetail.vehicle</code> attribute **/
	public static final String VEHICLE = "vehicle";
	/** Qualifier of the <code>TransportationRateDetail.airCondition</code> attribute **/
	public static final String AIRCONDITION = "airCondition";
	/** Qualifier of the <code>TransportationRateDetail.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>TransportationRateDetail.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>TransportationRateDetail.ratesDefinedFor</code> attribute **/
	public static final String RATESDEFINEDFOR = "ratesDefinedFor";
	/** Qualifier of the <code>TransportationRateDetail.transferType</code> attribute **/
	public static final String TRANSFERTYPE = "transferType";
	/** Qualifier of the <code>TransportationRateDetail.rateCalculationCriteria</code> attribute **/
	public static final String RATECALCULATIONCRITERIA = "rateCalculationCriteria";
	/** Qualifier of the <code>TransportationRateDetail.pickUpPointType</code> attribute **/
	public static final String PICKUPPOINTTYPE = "pickUpPointType";
	/** Qualifier of the <code>TransportationRateDetail.pickUpPoints</code> attribute **/
	public static final String PICKUPPOINTS = "pickUpPoints";
	/** Qualifier of the <code>TransportationRateDetail.dropOffPoint</code> attribute **/
	public static final String DROPOFFPOINT = "dropOffPoint";
	/** Qualifier of the <code>TransportationRateDetail.dropOffPoints</code> attribute **/
	public static final String DROPOFFPOINTS = "dropOffPoints";
	/** Qualifier of the <code>TransportationRateDetail.viaPointType</code> attribute **/
	public static final String VIAPOINTTYPE = "viaPointType";
	/** Qualifier of the <code>TransportationRateDetail.viaPointName</code> attribute **/
	public static final String VIAPOINTNAME = "viaPointName";
	/** Qualifier of the <code>TransportationRateDetail.routing</code> attribute **/
	public static final String ROUTING = "routing";
	/** Qualifier of the <code>TransportationRateDetail.journeyType</code> attribute **/
	public static final String JOURNEYTYPE = "journeyType";
	/** Qualifier of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute **/
	public static final String MINIMUMDAYSFROM = "minimumDaysfrom";
	/** Qualifier of the <code>TransportationRateDetail.minimumDaysTo</code> attribute **/
	public static final String MINIMUMDAYSTO = "minimumDaysTo";
	/** Qualifier of the <code>TransportationRateDetail.minimumHoursFrom</code> attribute **/
	public static final String MINIMUMHOURSFROM = "minimumHoursFrom";
	/** Qualifier of the <code>TransportationRateDetail.unit</code> attribute **/
	public static final String UNIT = "unit";
	/** Qualifier of the <code>TransportationRateDetail.minimumDistance</code> attribute **/
	public static final String MINIMUMDISTANCE = "minimumDistance";
	/** Qualifier of the <code>TransportationRateDetail.priceApplicability</code> attribute **/
	public static final String PRICEAPPLICABILITY = "priceApplicability";
	/** Qualifier of the <code>TransportationRateDetail.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/** Qualifier of the <code>TransportationRateDetail.payOnArrival</code> attribute **/
	public static final String PAYONARRIVAL = "payOnArrival";
	/** Qualifier of the <code>TransportationRateDetail.taxes</code> attribute **/
	public static final String TAXES = "taxes";
	/** Qualifier of the <code>TransportationRateDetail.transportationRateDefinition</code> attribute **/
	public static final String TRANSPORTATIONRATEDEFINITION = "transportationRateDefinition";
	/** Qualifier of the <code>TransportationRateDetail.travelogixPolicies</code> attribute **/
	public static final String TRAVELOGIXPOLICIES = "travelogixPolicies";
	/** Relation ordering override parameter constants for TransportRateDet2TravelogixpolicyRelation from ((supplierratedefinitionstransport))*/
	protected static String TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_SRC_ORDERED = "relation.TransportRateDet2TravelogixpolicyRelation.source.ordered";
	protected static String TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_TGT_ORDERED = "relation.TransportRateDet2TravelogixpolicyRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for TransportRateDet2TravelogixpolicyRelation from ((supplierratedefinitionstransport))*/
	protected static String TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_MARKMODIFIED = "relation.TransportRateDet2TravelogixpolicyRelation.markmodified";
	/** Qualifier of the <code>TransportationRateDetail.travelogixSupplierOffers</code> attribute **/
	public static final String TRAVELOGIXSUPPLIEROFFERS = "travelogixSupplierOffers";
	/**
	* {@link OneToManyHandler} for handling 1:n TAXES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Tax> TAXESHANDLER = new OneToManyHandler<Tax>(
	CoreConstants.TC.TAX,
	true,
	"transportationRateDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRANSPORTATIONRATEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTransportationRateDetail> TRANSPORTATIONRATEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedTransportationRateDetail>(
	SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONRATEDETAIL,
	false,
	"transportationRateDefinition",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELOGIXSUPPLIEROFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractTravelogixSupplierOffer> TRAVELOGIXSUPPLIEROFFERSHANDLER = new OneToManyHandler<AbstractTravelogixSupplierOffer>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTTRAVELOGIXSUPPLIEROFFER,
	false,
	"transportationRateDetail",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(CITYTIER, AttributeMode.INITIAL);
		tmp.put(WITHCHAUFFER, AttributeMode.INITIAL);
		tmp.put(CARGROUP, AttributeMode.INITIAL);
		tmp.put(SIPPCODE, AttributeMode.INITIAL);
		tmp.put(VEHICLE, AttributeMode.INITIAL);
		tmp.put(AIRCONDITION, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(RATESDEFINEDFOR, AttributeMode.INITIAL);
		tmp.put(TRANSFERTYPE, AttributeMode.INITIAL);
		tmp.put(RATECALCULATIONCRITERIA, AttributeMode.INITIAL);
		tmp.put(PICKUPPOINTTYPE, AttributeMode.INITIAL);
		tmp.put(PICKUPPOINTS, AttributeMode.INITIAL);
		tmp.put(DROPOFFPOINT, AttributeMode.INITIAL);
		tmp.put(DROPOFFPOINTS, AttributeMode.INITIAL);
		tmp.put(VIAPOINTTYPE, AttributeMode.INITIAL);
		tmp.put(VIAPOINTNAME, AttributeMode.INITIAL);
		tmp.put(ROUTING, AttributeMode.INITIAL);
		tmp.put(JOURNEYTYPE, AttributeMode.INITIAL);
		tmp.put(MINIMUMDAYSFROM, AttributeMode.INITIAL);
		tmp.put(MINIMUMDAYSTO, AttributeMode.INITIAL);
		tmp.put(MINIMUMHOURSFROM, AttributeMode.INITIAL);
		tmp.put(UNIT, AttributeMode.INITIAL);
		tmp.put(MINIMUMDISTANCE, AttributeMode.INITIAL);
		tmp.put(PRICEAPPLICABILITY, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		tmp.put(PAYONARRIVAL, AttributeMode.INITIAL);
		tmp.put(TRANSPORTATIONRATEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AbstractRateAdvDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (AbstractRateAdvDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AbstractRateAdvDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final AbstractRateAdvDefinition value)
	{
		setProperty(ctx, ADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final AbstractRateAdvDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.airCondition</code> attribute.
	 * @return the airCondition
	 */
	public Boolean isAirCondition(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AIRCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.airCondition</code> attribute.
	 * @return the airCondition
	 */
	public Boolean isAirCondition()
	{
		return isAirCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.airCondition</code> attribute. 
	 * @return the airCondition
	 */
	public boolean isAirConditionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAirCondition( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.airCondition</code> attribute. 
	 * @return the airCondition
	 */
	public boolean isAirConditionAsPrimitive()
	{
		return isAirConditionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.airCondition</code> attribute. 
	 * @param value the airCondition
	 */
	public void setAirCondition(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AIRCONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.airCondition</code> attribute. 
	 * @param value the airCondition
	 */
	public void setAirCondition(final Boolean value)
	{
		setAirCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.airCondition</code> attribute. 
	 * @param value the airCondition
	 */
	public void setAirCondition(final SessionContext ctx, final boolean value)
	{
		setAirCondition( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.airCondition</code> attribute. 
	 * @param value the airCondition
	 */
	public void setAirCondition(final boolean value)
	{
		setAirCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.carGroup</code> attribute.
	 * @return the carGroup
	 */
	public CarGroup getCarGroup(final SessionContext ctx)
	{
		return (CarGroup)getProperty( ctx, CARGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.carGroup</code> attribute.
	 * @return the carGroup
	 */
	public CarGroup getCarGroup()
	{
		return getCarGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.carGroup</code> attribute. 
	 * @param value the carGroup
	 */
	public void setCarGroup(final SessionContext ctx, final CarGroup value)
	{
		setProperty(ctx, CARGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.carGroup</code> attribute. 
	 * @param value the carGroup
	 */
	public void setCarGroup(final CarGroup value)
	{
		setCarGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.category</code> attribute.
	 * @return the category
	 */
	public EnumerationValue getCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.category</code> attribute.
	 * @return the category
	 */
	public EnumerationValue getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final EnumerationValue value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.cityTier</code> attribute.
	 * @return the cityTier
	 */
	public EnumerationValue getCityTier(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CITYTIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.cityTier</code> attribute.
	 * @return the cityTier
	 */
	public EnumerationValue getCityTier()
	{
		return getCityTier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.cityTier</code> attribute. 
	 * @param value the cityTier
	 */
	public void setCityTier(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CITYTIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.cityTier</code> attribute. 
	 * @param value the cityTier
	 */
	public void setCityTier(final EnumerationValue value)
	{
		setCityTier( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRANSPORTATIONRATEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.daysOfWeek</code> attribute.
	 * @return the daysOfWeek
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.dropOffPoint</code> attribute.
	 * @return the dropOffPoint
	 */
	public EnumerationValue getDropOffPoint(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DROPOFFPOINT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.dropOffPoint</code> attribute.
	 * @return the dropOffPoint
	 */
	public EnumerationValue getDropOffPoint()
	{
		return getDropOffPoint( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.dropOffPoint</code> attribute. 
	 * @param value the dropOffPoint
	 */
	public void setDropOffPoint(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DROPOFFPOINT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.dropOffPoint</code> attribute. 
	 * @param value the dropOffPoint
	 */
	public void setDropOffPoint(final EnumerationValue value)
	{
		setDropOffPoint( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.dropOffPoints</code> attribute.
	 * @return the dropOffPoints
	 */
	public Address getDropOffPoints(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, DROPOFFPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.dropOffPoints</code> attribute.
	 * @return the dropOffPoints
	 */
	public Address getDropOffPoints()
	{
		return getDropOffPoints( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.dropOffPoints</code> attribute. 
	 * @param value the dropOffPoints
	 */
	public void setDropOffPoints(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, DROPOFFPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.dropOffPoints</code> attribute. 
	 * @param value the dropOffPoints
	 */
	public void setDropOffPoints(final Address value)
	{
		setDropOffPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.journeyType</code> attribute.
	 * @return the journeyType
	 */
	public EnumerationValue getJourneyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, JOURNEYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.journeyType</code> attribute.
	 * @return the journeyType
	 */
	public EnumerationValue getJourneyType()
	{
		return getJourneyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.journeyType</code> attribute. 
	 * @param value the journeyType
	 */
	public void setJourneyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, JOURNEYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.journeyType</code> attribute. 
	 * @param value the journeyType
	 */
	public void setJourneyType(final EnumerationValue value)
	{
		setJourneyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute.
	 * @return the minimumDaysfrom
	 */
	public Integer getMinimumDaysfrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINIMUMDAYSFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute.
	 * @return the minimumDaysfrom
	 */
	public Integer getMinimumDaysfrom()
	{
		return getMinimumDaysfrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute. 
	 * @return the minimumDaysfrom
	 */
	public int getMinimumDaysfromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumDaysfrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute. 
	 * @return the minimumDaysfrom
	 */
	public int getMinimumDaysfromAsPrimitive()
	{
		return getMinimumDaysfromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute. 
	 * @param value the minimumDaysfrom
	 */
	public void setMinimumDaysfrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINIMUMDAYSFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute. 
	 * @param value the minimumDaysfrom
	 */
	public void setMinimumDaysfrom(final Integer value)
	{
		setMinimumDaysfrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute. 
	 * @param value the minimumDaysfrom
	 */
	public void setMinimumDaysfrom(final SessionContext ctx, final int value)
	{
		setMinimumDaysfrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDaysfrom</code> attribute. 
	 * @param value the minimumDaysfrom
	 */
	public void setMinimumDaysfrom(final int value)
	{
		setMinimumDaysfrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDaysTo</code> attribute.
	 * @return the minimumDaysTo
	 */
	public Integer getMinimumDaysTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINIMUMDAYSTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDaysTo</code> attribute.
	 * @return the minimumDaysTo
	 */
	public Integer getMinimumDaysTo()
	{
		return getMinimumDaysTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDaysTo</code> attribute. 
	 * @return the minimumDaysTo
	 */
	public int getMinimumDaysToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumDaysTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDaysTo</code> attribute. 
	 * @return the minimumDaysTo
	 */
	public int getMinimumDaysToAsPrimitive()
	{
		return getMinimumDaysToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setMinimumDaysTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINIMUMDAYSTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setMinimumDaysTo(final Integer value)
	{
		setMinimumDaysTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setMinimumDaysTo(final SessionContext ctx, final int value)
	{
		setMinimumDaysTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setMinimumDaysTo(final int value)
	{
		setMinimumDaysTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDistance</code> attribute.
	 * @return the minimumDistance
	 */
	public Double getMinimumDistance(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MINIMUMDISTANCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDistance</code> attribute.
	 * @return the minimumDistance
	 */
	public Double getMinimumDistance()
	{
		return getMinimumDistance( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDistance</code> attribute. 
	 * @return the minimumDistance
	 */
	public double getMinimumDistanceAsPrimitive(final SessionContext ctx)
	{
		Double value = getMinimumDistance( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumDistance</code> attribute. 
	 * @return the minimumDistance
	 */
	public double getMinimumDistanceAsPrimitive()
	{
		return getMinimumDistanceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDistance</code> attribute. 
	 * @param value the minimumDistance
	 */
	public void setMinimumDistance(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MINIMUMDISTANCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDistance</code> attribute. 
	 * @param value the minimumDistance
	 */
	public void setMinimumDistance(final Double value)
	{
		setMinimumDistance( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDistance</code> attribute. 
	 * @param value the minimumDistance
	 */
	public void setMinimumDistance(final SessionContext ctx, final double value)
	{
		setMinimumDistance( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumDistance</code> attribute. 
	 * @param value the minimumDistance
	 */
	public void setMinimumDistance(final double value)
	{
		setMinimumDistance( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumHoursFrom</code> attribute.
	 * @return the minimumHoursFrom
	 */
	public Date getMinimumHoursFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, MINIMUMHOURSFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.minimumHoursFrom</code> attribute.
	 * @return the minimumHoursFrom
	 */
	public Date getMinimumHoursFrom()
	{
		return getMinimumHoursFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumHoursFrom</code> attribute. 
	 * @param value the minimumHoursFrom
	 */
	public void setMinimumHoursFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, MINIMUMHOURSFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.minimumHoursFrom</code> attribute. 
	 * @param value the minimumHoursFrom
	 */
	public void setMinimumHoursFrom(final Date value)
	{
		setMinimumHoursFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYONARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival()
	{
		return isPayOnArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayOnArrival( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive()
	{
		return isPayOnArrivalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYONARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final Boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final boolean value)
	{
		setPayOnArrival( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.pickUpPoints</code> attribute.
	 * @return the pickUpPoints
	 */
	public Address getPickUpPoints(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, PICKUPPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.pickUpPoints</code> attribute.
	 * @return the pickUpPoints
	 */
	public Address getPickUpPoints()
	{
		return getPickUpPoints( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.pickUpPoints</code> attribute. 
	 * @param value the pickUpPoints
	 */
	public void setPickUpPoints(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, PICKUPPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.pickUpPoints</code> attribute. 
	 * @param value the pickUpPoints
	 */
	public void setPickUpPoints(final Address value)
	{
		setPickUpPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.pickUpPointType</code> attribute.
	 * @return the pickUpPointType
	 */
	public EnumerationValue getPickUpPointType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PICKUPPOINTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.pickUpPointType</code> attribute.
	 * @return the pickUpPointType
	 */
	public EnumerationValue getPickUpPointType()
	{
		return getPickUpPointType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.pickUpPointType</code> attribute. 
	 * @param value the pickUpPointType
	 */
	public void setPickUpPointType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PICKUPPOINTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.pickUpPointType</code> attribute. 
	 * @param value the pickUpPointType
	 */
	public void setPickUpPointType(final EnumerationValue value)
	{
		setPickUpPointType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.priceApplicability</code> attribute.
	 * @return the priceApplicability
	 */
	public AbstractPriceApplicability getPriceApplicability(final SessionContext ctx)
	{
		return (AbstractPriceApplicability)getProperty( ctx, PRICEAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.priceApplicability</code> attribute.
	 * @return the priceApplicability
	 */
	public AbstractPriceApplicability getPriceApplicability()
	{
		return getPriceApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.priceApplicability</code> attribute. 
	 * @param value the priceApplicability
	 */
	public void setPriceApplicability(final SessionContext ctx, final AbstractPriceApplicability value)
	{
		setProperty(ctx, PRICEAPPLICABILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.priceApplicability</code> attribute. 
	 * @param value the priceApplicability
	 */
	public void setPriceApplicability(final AbstractPriceApplicability value)
	{
		setPriceApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.rateCalculationCriteria</code> attribute.
	 * @return the rateCalculationCriteria
	 */
	public EnumerationValue getRateCalculationCriteria(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATECALCULATIONCRITERIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.rateCalculationCriteria</code> attribute.
	 * @return the rateCalculationCriteria
	 */
	public EnumerationValue getRateCalculationCriteria()
	{
		return getRateCalculationCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.rateCalculationCriteria</code> attribute. 
	 * @param value the rateCalculationCriteria
	 */
	public void setRateCalculationCriteria(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATECALCULATIONCRITERIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.rateCalculationCriteria</code> attribute. 
	 * @param value the rateCalculationCriteria
	 */
	public void setRateCalculationCriteria(final EnumerationValue value)
	{
		setRateCalculationCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.ratesDefinedFor</code> attribute.
	 * @return the ratesDefinedFor
	 */
	public EnumerationValue getRatesDefinedFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATESDEFINEDFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.ratesDefinedFor</code> attribute.
	 * @return the ratesDefinedFor
	 */
	public EnumerationValue getRatesDefinedFor()
	{
		return getRatesDefinedFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.ratesDefinedFor</code> attribute. 
	 * @param value the ratesDefinedFor
	 */
	public void setRatesDefinedFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATESDEFINEDFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.ratesDefinedFor</code> attribute. 
	 * @param value the ratesDefinedFor
	 */
	public void setRatesDefinedFor(final EnumerationValue value)
	{
		setRatesDefinedFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.routing</code> attribute.
	 * @return the routing
	 */
	public String getRouting(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROUTING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.routing</code> attribute.
	 * @return the routing
	 */
	public String getRouting()
	{
		return getRouting( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.routing</code> attribute. 
	 * @param value the routing
	 */
	public void setRouting(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROUTING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.routing</code> attribute. 
	 * @param value the routing
	 */
	public void setRouting(final String value)
	{
		setRouting( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.sippCode</code> attribute.
	 * @return the sippCode
	 */
	public EnumerationValue getSippCode(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SIPPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.sippCode</code> attribute.
	 * @return the sippCode
	 */
	public EnumerationValue getSippCode()
	{
		return getSippCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.sippCode</code> attribute. 
	 * @param value the sippCode
	 */
	public void setSippCode(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SIPPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.sippCode</code> attribute. 
	 * @param value the sippCode
	 */
	public void setSippCode(final EnumerationValue value)
	{
		setSippCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.taxes</code> attribute.
	 * @return the taxes
	 */
	public Collection<Tax> getTaxes(final SessionContext ctx)
	{
		return TAXESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.taxes</code> attribute.
	 * @return the taxes
	 */
	public Collection<Tax> getTaxes()
	{
		return getTaxes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final SessionContext ctx, final Collection<Tax> value)
	{
		TAXESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final Collection<Tax> value)
	{
		setTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxes. 
	 * @param value the item to add to taxes
	 */
	public void addToTaxes(final SessionContext ctx, final Tax value)
	{
		TAXESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxes. 
	 * @param value the item to add to taxes
	 */
	public void addToTaxes(final Tax value)
	{
		addToTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxes. 
	 * @param value the item to remove from taxes
	 */
	public void removeFromTaxes(final SessionContext ctx, final Tax value)
	{
		TAXESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxes. 
	 * @param value the item to remove from taxes
	 */
	public void removeFromTaxes(final Tax value)
	{
		removeFromTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.transferType</code> attribute.
	 * @return the transferType
	 */
	public EnumerationValue getTransferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRANSFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.transferType</code> attribute.
	 * @return the transferType
	 */
	public EnumerationValue getTransferType()
	{
		return getTransferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.transferType</code> attribute. 
	 * @param value the transferType
	 */
	public void setTransferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRANSFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.transferType</code> attribute. 
	 * @param value the transferType
	 */
	public void setTransferType(final EnumerationValue value)
	{
		setTransferType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.transportationRateDefinition</code> attribute.
	 * @return the transportationRateDefinition
	 */
	public TransportationRateDefinition getTransportationRateDefinition(final SessionContext ctx)
	{
		return (TransportationRateDefinition)getProperty( ctx, TRANSPORTATIONRATEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.transportationRateDefinition</code> attribute.
	 * @return the transportationRateDefinition
	 */
	public TransportationRateDefinition getTransportationRateDefinition()
	{
		return getTransportationRateDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.transportationRateDefinition</code> attribute. 
	 * @param value the transportationRateDefinition
	 */
	public void setTransportationRateDefinition(final SessionContext ctx, final TransportationRateDefinition value)
	{
		TRANSPORTATIONRATEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.transportationRateDefinition</code> attribute. 
	 * @param value the transportationRateDefinition
	 */
	public void setTransportationRateDefinition(final TransportationRateDefinition value)
	{
		setTransportationRateDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.travelogixPolicies</code> attribute.
	 * @return the travelogixPolicies
	 */
	public Set<TravelogixPolicy> getTravelogixPolicies(final SessionContext ctx)
	{
		final List<TravelogixPolicy> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			"TravelogixPolicy",
			null,
			false,
			false
		);
		return new LinkedHashSet<TravelogixPolicy>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.travelogixPolicies</code> attribute.
	 * @return the travelogixPolicies
	 */
	public Set<TravelogixPolicy> getTravelogixPolicies()
	{
		return getTravelogixPolicies( getSession().getSessionContext() );
	}
	
	public long getTravelogixPoliciesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			"TravelogixPolicy",
			null
		);
	}
	
	public long getTravelogixPoliciesCount()
	{
		return getTravelogixPoliciesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.travelogixPolicies</code> attribute. 
	 * @param value the travelogixPolicies
	 */
	public void setTravelogixPolicies(final SessionContext ctx, final Set<TravelogixPolicy> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.travelogixPolicies</code> attribute. 
	 * @param value the travelogixPolicies
	 */
	public void setTravelogixPolicies(final Set<TravelogixPolicy> value)
	{
		setTravelogixPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixPolicies. 
	 * @param value the item to add to travelogixPolicies
	 */
	public void addToTravelogixPolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixPolicies. 
	 * @param value the item to add to travelogixPolicies
	 */
	public void addToTravelogixPolicies(final TravelogixPolicy value)
	{
		addToTravelogixPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixPolicies. 
	 * @param value the item to remove from travelogixPolicies
	 */
	public void removeFromTravelogixPolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionstransportConstants.Relations.TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRANSPORTRATEDET2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixPolicies. 
	 * @param value the item to remove from travelogixPolicies
	 */
	public void removeFromTravelogixPolicies(final TravelogixPolicy value)
	{
		removeFromTravelogixPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.travelogixSupplierOffers</code> attribute.
	 * @return the travelogixSupplierOffers
	 */
	public Set<AbstractTravelogixSupplierOffer> getTravelogixSupplierOffers(final SessionContext ctx)
	{
		return (Set<AbstractTravelogixSupplierOffer>)TRAVELOGIXSUPPLIEROFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.travelogixSupplierOffers</code> attribute.
	 * @return the travelogixSupplierOffers
	 */
	public Set<AbstractTravelogixSupplierOffer> getTravelogixSupplierOffers()
	{
		return getTravelogixSupplierOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.travelogixSupplierOffers</code> attribute. 
	 * @param value the travelogixSupplierOffers
	 */
	public void setTravelogixSupplierOffers(final SessionContext ctx, final Set<AbstractTravelogixSupplierOffer> value)
	{
		TRAVELOGIXSUPPLIEROFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.travelogixSupplierOffers</code> attribute. 
	 * @param value the travelogixSupplierOffers
	 */
	public void setTravelogixSupplierOffers(final Set<AbstractTravelogixSupplierOffer> value)
	{
		setTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixSupplierOffers. 
	 * @param value the item to add to travelogixSupplierOffers
	 */
	public void addToTravelogixSupplierOffers(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		TRAVELOGIXSUPPLIEROFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixSupplierOffers. 
	 * @param value the item to add to travelogixSupplierOffers
	 */
	public void addToTravelogixSupplierOffers(final AbstractTravelogixSupplierOffer value)
	{
		addToTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixSupplierOffers. 
	 * @param value the item to remove from travelogixSupplierOffers
	 */
	public void removeFromTravelogixSupplierOffers(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		TRAVELOGIXSUPPLIEROFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixSupplierOffers. 
	 * @param value the item to remove from travelogixSupplierOffers
	 */
	public void removeFromTravelogixSupplierOffers(final AbstractTravelogixSupplierOffer value)
	{
		removeFromTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.unit</code> attribute.
	 * @return the unit
	 */
	public EnumerationValue getUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.unit</code> attribute.
	 * @return the unit
	 */
	public EnumerationValue getUnit()
	{
		return getUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.unit</code> attribute. 
	 * @param value the unit
	 */
	public void setUnit(final EnumerationValue value)
	{
		setUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.vehicle</code> attribute.
	 * @return the vehicle
	 */
	public VehicleDetails getVehicle(final SessionContext ctx)
	{
		return (VehicleDetails)getProperty( ctx, VEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.vehicle</code> attribute.
	 * @return the vehicle
	 */
	public VehicleDetails getVehicle()
	{
		return getVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.vehicle</code> attribute. 
	 * @param value the vehicle
	 */
	public void setVehicle(final SessionContext ctx, final VehicleDetails value)
	{
		setProperty(ctx, VEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.vehicle</code> attribute. 
	 * @param value the vehicle
	 */
	public void setVehicle(final VehicleDetails value)
	{
		setVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.viaPointName</code> attribute.
	 * @return the viaPointName
	 */
	public Address getViaPointName(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, VIAPOINTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.viaPointName</code> attribute.
	 * @return the viaPointName
	 */
	public Address getViaPointName()
	{
		return getViaPointName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.viaPointName</code> attribute. 
	 * @param value the viaPointName
	 */
	public void setViaPointName(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, VIAPOINTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.viaPointName</code> attribute. 
	 * @param value the viaPointName
	 */
	public void setViaPointName(final Address value)
	{
		setViaPointName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.viaPointType</code> attribute.
	 * @return the viaPointType
	 */
	public EnumerationValue getViaPointType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VIAPOINTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.viaPointType</code> attribute.
	 * @return the viaPointType
	 */
	public EnumerationValue getViaPointType()
	{
		return getViaPointType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.viaPointType</code> attribute. 
	 * @param value the viaPointType
	 */
	public void setViaPointType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VIAPOINTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.viaPointType</code> attribute. 
	 * @param value the viaPointType
	 */
	public void setViaPointType(final EnumerationValue value)
	{
		setViaPointType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.withChauffer</code> attribute.
	 * @return the withChauffer
	 */
	public Boolean isWithChauffer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, WITHCHAUFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.withChauffer</code> attribute.
	 * @return the withChauffer
	 */
	public Boolean isWithChauffer()
	{
		return isWithChauffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.withChauffer</code> attribute. 
	 * @return the withChauffer
	 */
	public boolean isWithChaufferAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isWithChauffer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDetail.withChauffer</code> attribute. 
	 * @return the withChauffer
	 */
	public boolean isWithChaufferAsPrimitive()
	{
		return isWithChaufferAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.withChauffer</code> attribute. 
	 * @param value the withChauffer
	 */
	public void setWithChauffer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, WITHCHAUFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.withChauffer</code> attribute. 
	 * @param value the withChauffer
	 */
	public void setWithChauffer(final Boolean value)
	{
		setWithChauffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.withChauffer</code> attribute. 
	 * @param value the withChauffer
	 */
	public void setWithChauffer(final SessionContext ctx, final boolean value)
	{
		setWithChauffer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDetail.withChauffer</code> attribute. 
	 * @param value the withChauffer
	 */
	public void setWithChauffer(final boolean value)
	{
		setWithChauffer( getSession().getSessionContext(), value );
	}
	
}
