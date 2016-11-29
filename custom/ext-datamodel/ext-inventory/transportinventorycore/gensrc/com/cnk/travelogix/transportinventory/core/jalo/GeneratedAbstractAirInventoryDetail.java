/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryDetail;
import com.cnk.travelogix.masterdata.core.iata.jalo.Airport;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInventoryGrid;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.AbstractAirInventoryDetail AbstractAirInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractAirInventoryDetail extends AbstractInventoryDetail
{
	/** Qualifier of the <code>AbstractAirInventoryDetail.origin</code> attribute **/
	public static final String ORIGIN = "origin";
	/** Qualifier of the <code>AbstractAirInventoryDetail.destination</code> attribute **/
	public static final String DESTINATION = "destination";
	/** Qualifier of the <code>AbstractAirInventoryDetail.sectorType</code> attribute **/
	public static final String SECTORTYPE = "sectorType";
	/** Qualifier of the <code>AbstractAirInventoryDetail.flightType</code> attribute **/
	public static final String FLIGHTTYPE = "flightType";
	/** Qualifier of the <code>AbstractAirInventoryDetail.flightNumber</code> attribute **/
	public static final String FLIGHTNUMBER = "flightNumber";
	/** Qualifier of the <code>AbstractAirInventoryDetail.travelFareRangeFrom</code> attribute **/
	public static final String TRAVELFARERANGEFROM = "travelFareRangeFrom";
	/** Qualifier of the <code>AbstractAirInventoryDetail.travelFareRangeTo</code> attribute **/
	public static final String TRAVELFARERANGETO = "travelFareRangeTo";
	/** Qualifier of the <code>AbstractAirInventoryDetail.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute **/
	public static final String NOOFSEATSCONFIRMED = "noOfSeatsConfirmed";
	/** Qualifier of the <code>AbstractAirInventoryDetail.rbd</code> attribute **/
	public static final String RBD = "rbd";
	/** Qualifier of the <code>AbstractAirInventoryDetail.pnr</code> attribute **/
	public static final String PNR = "pnr";
	/** Qualifier of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute **/
	public static final String NOOFWAITLISTSEATS = "noOfWaitListSeats";
	/** Qualifier of the <code>AbstractAirInventoryDetail.baseFare</code> attribute **/
	public static final String BASEFARE = "baseFare";
	/** Qualifier of the <code>AbstractAirInventoryDetail.uqTax</code> attribute **/
	public static final String UQTAX = "uqTax";
	/** Qualifier of the <code>AbstractAirInventoryDetail.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>AbstractAirInventoryDetail.specificTravelDates</code> attribute **/
	public static final String SPECIFICTRAVELDATES = "specificTravelDates";
	/** Qualifier of the <code>AbstractAirInventoryDetail.daysOfWeek</code> attribute **/
	public static final String DAYSOFWEEK = "daysOfWeek";
	/** Qualifier of the <code>AbstractAirInventoryDetail.travelDateRange</code> attribute **/
	public static final String TRAVELDATERANGE = "travelDateRange";
	/** Qualifier of the <code>AbstractAirInventoryDetail.pnrStatus</code> attribute **/
	public static final String PNRSTATUS = "pnrStatus";
	/** Qualifier of the <code>AbstractAirInventoryDetail.perPax</code> attribute **/
	public static final String PERPAX = "perPax";
	/** Qualifier of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute **/
	public static final String DISTRESSSALESUTILIZATIONTHRESHHOLD = "distressSalesUtilizationThreshhold";
	/** Qualifier of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute **/
	public static final String DISTRESSSALESTHRESHHOLDCUTOFFDAYS = "distressSalesThreshholdCutOffDays";
	/** Qualifier of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute **/
	public static final String REQUESTEDQUANTITY = "requestedQuantity";
	/** Qualifier of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute **/
	public static final String DISTRIBUTEDQUANTITY = "distributedQuantity";
	/** Qualifier of the <code>AbstractAirInventoryDetail.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute **/
	public static final String AVAILABLEQUANTITY = "availableQuantity";
	/** Qualifier of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute **/
	public static final String RESERVEDQUANTITY = "reservedQuantity";
	/** Qualifier of the <code>AbstractAirInventoryDetail.inventoryAssociation</code> attribute **/
	public static final String INVENTORYASSOCIATION = "inventoryAssociation";
	/** Qualifier of the <code>AbstractAirInventoryDetail.airInventoryGrid</code> attribute **/
	public static final String AIRINVENTORYGRID = "airInventoryGrid";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRINVENTORYGRID's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractAirInventoryDetail> AIRINVENTORYGRIDHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractAirInventoryDetail>(
	TransportinventorycoreConstants.TC.ABSTRACTAIRINVENTORYDETAIL,
	false,
	"airInventoryGrid",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ORIGIN, AttributeMode.INITIAL);
		tmp.put(DESTINATION, AttributeMode.INITIAL);
		tmp.put(SECTORTYPE, AttributeMode.INITIAL);
		tmp.put(FLIGHTTYPE, AttributeMode.INITIAL);
		tmp.put(FLIGHTNUMBER, AttributeMode.INITIAL);
		tmp.put(TRAVELFARERANGEFROM, AttributeMode.INITIAL);
		tmp.put(TRAVELFARERANGETO, AttributeMode.INITIAL);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(NOOFSEATSCONFIRMED, AttributeMode.INITIAL);
		tmp.put(RBD, AttributeMode.INITIAL);
		tmp.put(PNR, AttributeMode.INITIAL);
		tmp.put(NOOFWAITLISTSEATS, AttributeMode.INITIAL);
		tmp.put(BASEFARE, AttributeMode.INITIAL);
		tmp.put(UQTAX, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(SPECIFICTRAVELDATES, AttributeMode.INITIAL);
		tmp.put(DAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(TRAVELDATERANGE, AttributeMode.INITIAL);
		tmp.put(PNRSTATUS, AttributeMode.INITIAL);
		tmp.put(PERPAX, AttributeMode.INITIAL);
		tmp.put(DISTRESSSALESUTILIZATIONTHRESHHOLD, AttributeMode.INITIAL);
		tmp.put(DISTRESSSALESTHRESHHOLDCUTOFFDAYS, AttributeMode.INITIAL);
		tmp.put(REQUESTEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(DISTRIBUTEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(AVAILABLEQUANTITY, AttributeMode.INITIAL);
		tmp.put(RESERVEDQUANTITY, AttributeMode.INITIAL);
		tmp.put(INVENTORYASSOCIATION, AttributeMode.INITIAL);
		tmp.put(AIRINVENTORYGRID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.airInventoryGrid</code> attribute.
	 * @return the airInventoryGrid
	 */
	public AirInventoryGrid getAirInventoryGrid(final SessionContext ctx)
	{
		return (AirInventoryGrid)getProperty( ctx, AIRINVENTORYGRID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.airInventoryGrid</code> attribute.
	 * @return the airInventoryGrid
	 */
	public AirInventoryGrid getAirInventoryGrid()
	{
		return getAirInventoryGrid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.airInventoryGrid</code> attribute. 
	 * @param value the airInventoryGrid
	 */
	public void setAirInventoryGrid(final SessionContext ctx, final AirInventoryGrid value)
	{
		AIRINVENTORYGRIDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.airInventoryGrid</code> attribute. 
	 * @param value the airInventoryGrid
	 */
	public void setAirInventoryGrid(final AirInventoryGrid value)
	{
		setAirInventoryGrid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute.
	 * @return the availableQuantity - Available  Quantity
	 */
	public Long getAvailableQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, AVAILABLEQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute.
	 * @return the availableQuantity - Available  Quantity
	 */
	public Long getAvailableQuantity()
	{
		return getAvailableQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute. 
	 * @return the availableQuantity - Available  Quantity
	 */
	public long getAvailableQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getAvailableQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute. 
	 * @return the availableQuantity - Available  Quantity
	 */
	public long getAvailableQuantityAsPrimitive()
	{
		return getAvailableQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - Available  Quantity
	 */
	public void setAvailableQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, AVAILABLEQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - Available  Quantity
	 */
	public void setAvailableQuantity(final Long value)
	{
		setAvailableQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - Available  Quantity
	 */
	public void setAvailableQuantity(final SessionContext ctx, final long value)
	{
		setAvailableQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.availableQuantity</code> attribute. 
	 * @param value the availableQuantity - Available  Quantity
	 */
	public void setAvailableQuantity(final long value)
	{
		setAvailableQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.baseFare</code> attribute.
	 * @return the baseFare - Base Fare
	 */
	public BigDecimal getBaseFare(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, BASEFARE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.baseFare</code> attribute.
	 * @return the baseFare - Base Fare
	 */
	public BigDecimal getBaseFare()
	{
		return getBaseFare( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.baseFare</code> attribute. 
	 * @param value the baseFare - Base Fare
	 */
	public void setBaseFare(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, BASEFARE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.baseFare</code> attribute. 
	 * @param value the baseFare - Base Fare
	 */
	public void setBaseFare(final BigDecimal value)
	{
		setBaseFare( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.cabinClass</code> attribute.
	 * @return the cabinClass - Cabin Class
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.cabinClass</code> attribute.
	 * @return the cabinClass - Cabin Class
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.cabinClass</code> attribute. 
	 * @param value the cabinClass - Cabin Class
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.cabinClass</code> attribute. 
	 * @param value the cabinClass - Cabin Class
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRINVENTORYGRIDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - days Of Week
	 */
	public Collection<EnumerationValue> getDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.daysOfWeek</code> attribute.
	 * @return the daysOfWeek - days Of Week
	 */
	public Collection<EnumerationValue> getDaysOfWeek()
	{
		return getDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - days Of Week
	 */
	public void setDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.daysOfWeek</code> attribute. 
	 * @param value the daysOfWeek - days Of Week
	 */
	public void setDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setDaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.destination</code> attribute.
	 * @return the destination - Destination
	 */
	public Airport getDestination(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, DESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.destination</code> attribute.
	 * @return the destination - Destination
	 */
	public Airport getDestination()
	{
		return getDestination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.destination</code> attribute. 
	 * @param value the destination - Destination
	 */
	public void setDestination(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, DESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.destination</code> attribute. 
	 * @param value the destination - Destination
	 */
	public void setDestination(final Airport value)
	{
		setDestination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute.
	 * @return the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public Long getDistressSalesThreshholdCutOffDays(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DISTRESSSALESTHRESHHOLDCUTOFFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute.
	 * @return the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public Long getDistressSalesThreshholdCutOffDays()
	{
		return getDistressSalesThreshholdCutOffDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @return the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public long getDistressSalesThreshholdCutOffDaysAsPrimitive(final SessionContext ctx)
	{
		Long value = getDistressSalesThreshholdCutOffDays( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @return the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public long getDistressSalesThreshholdCutOffDaysAsPrimitive()
	{
		return getDistressSalesThreshholdCutOffDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @param value the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public void setDistressSalesThreshholdCutOffDays(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DISTRESSSALESTHRESHHOLDCUTOFFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @param value the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public void setDistressSalesThreshholdCutOffDays(final Long value)
	{
		setDistressSalesThreshholdCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @param value the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public void setDistressSalesThreshholdCutOffDays(final SessionContext ctx, final long value)
	{
		setDistressSalesThreshholdCutOffDays( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distressSalesThreshholdCutOffDays</code> attribute. 
	 * @param value the distressSalesThreshholdCutOffDays - Threshold CutOff Days
	 */
	public void setDistressSalesThreshholdCutOffDays(final long value)
	{
		setDistressSalesThreshholdCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute.
	 * @return the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public Long getDistressSalesUtilizationThreshhold(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DISTRESSSALESUTILIZATIONTHRESHHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute.
	 * @return the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public Long getDistressSalesUtilizationThreshhold()
	{
		return getDistressSalesUtilizationThreshhold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute. 
	 * @return the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public long getDistressSalesUtilizationThreshholdAsPrimitive(final SessionContext ctx)
	{
		Long value = getDistressSalesUtilizationThreshhold( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute. 
	 * @return the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public long getDistressSalesUtilizationThreshholdAsPrimitive()
	{
		return getDistressSalesUtilizationThreshholdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute. 
	 * @param value the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public void setDistressSalesUtilizationThreshhold(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DISTRESSSALESUTILIZATIONTHRESHHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute. 
	 * @param value the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public void setDistressSalesUtilizationThreshhold(final Long value)
	{
		setDistressSalesUtilizationThreshhold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute. 
	 * @param value the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public void setDistressSalesUtilizationThreshhold(final SessionContext ctx, final long value)
	{
		setDistressSalesUtilizationThreshhold( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distressSalesUtilizationThreshhold</code> attribute. 
	 * @param value the distressSalesUtilizationThreshhold - Minimum Utilization Threshold
	 */
	public void setDistressSalesUtilizationThreshhold(final long value)
	{
		setDistressSalesUtilizationThreshhold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute.
	 * @return the distributedQuantity - Distributed Quantity
	 */
	public Long getDistributedQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DISTRIBUTEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute.
	 * @return the distributedQuantity - Distributed Quantity
	 */
	public Long getDistributedQuantity()
	{
		return getDistributedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute. 
	 * @return the distributedQuantity - Distributed Quantity
	 */
	public long getDistributedQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getDistributedQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute. 
	 * @return the distributedQuantity - Distributed Quantity
	 */
	public long getDistributedQuantityAsPrimitive()
	{
		return getDistributedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute. 
	 * @param value the distributedQuantity - Distributed Quantity
	 */
	public void setDistributedQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DISTRIBUTEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute. 
	 * @param value the distributedQuantity - Distributed Quantity
	 */
	public void setDistributedQuantity(final Long value)
	{
		setDistributedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute. 
	 * @param value the distributedQuantity - Distributed Quantity
	 */
	public void setDistributedQuantity(final SessionContext ctx, final long value)
	{
		setDistributedQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.distributedQuantity</code> attribute. 
	 * @param value the distributedQuantity - Distributed Quantity
	 */
	public void setDistributedQuantity(final long value)
	{
		setDistributedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.flightNumber</code> attribute.
	 * @return the flightNumber - Flight Number
	 */
	public String getFlightNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLIGHTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.flightNumber</code> attribute.
	 * @return the flightNumber - Flight Number
	 */
	public String getFlightNumber()
	{
		return getFlightNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.flightNumber</code> attribute. 
	 * @param value the flightNumber - Flight Number
	 */
	public void setFlightNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLIGHTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.flightNumber</code> attribute. 
	 * @param value the flightNumber - Flight Number
	 */
	public void setFlightNumber(final String value)
	{
		setFlightNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.flightType</code> attribute.
	 * @return the flightType - Flight Type
	 */
	public EnumerationValue getFlightType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FLIGHTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.flightType</code> attribute.
	 * @return the flightType - Flight Type
	 */
	public EnumerationValue getFlightType()
	{
		return getFlightType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.flightType</code> attribute. 
	 * @param value the flightType - Flight Type
	 */
	public void setFlightType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FLIGHTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.flightType</code> attribute. 
	 * @param value the flightType - Flight Type
	 */
	public void setFlightType(final EnumerationValue value)
	{
		setFlightType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.inventoryAssociation</code> attribute.
	 * @return the inventoryAssociation - Reserved Quantity
	 */
	public AssociateInventory getInventoryAssociation(final SessionContext ctx)
	{
		return (AssociateInventory)getProperty( ctx, INVENTORYASSOCIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.inventoryAssociation</code> attribute.
	 * @return the inventoryAssociation - Reserved Quantity
	 */
	public AssociateInventory getInventoryAssociation()
	{
		return getInventoryAssociation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.inventoryAssociation</code> attribute. 
	 * @param value the inventoryAssociation - Reserved Quantity
	 */
	public void setInventoryAssociation(final SessionContext ctx, final AssociateInventory value)
	{
		setProperty(ctx, INVENTORYASSOCIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.inventoryAssociation</code> attribute. 
	 * @param value the inventoryAssociation - Reserved Quantity
	 */
	public void setInventoryAssociation(final AssociateInventory value)
	{
		setInventoryAssociation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute.
	 * @return the noOfSeatsConfirmed - No Of Seats Requested
	 */
	public Integer getNoOfSeatsConfirmed(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFSEATSCONFIRMED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute.
	 * @return the noOfSeatsConfirmed - No Of Seats Requested
	 */
	public Integer getNoOfSeatsConfirmed()
	{
		return getNoOfSeatsConfirmed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute. 
	 * @return the noOfSeatsConfirmed - No Of Seats Requested
	 */
	public int getNoOfSeatsConfirmedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfSeatsConfirmed( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute. 
	 * @return the noOfSeatsConfirmed - No Of Seats Requested
	 */
	public int getNoOfSeatsConfirmedAsPrimitive()
	{
		return getNoOfSeatsConfirmedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute. 
	 * @param value the noOfSeatsConfirmed - No Of Seats Requested
	 */
	public void setNoOfSeatsConfirmed(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFSEATSCONFIRMED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute. 
	 * @param value the noOfSeatsConfirmed - No Of Seats Requested
	 */
	public void setNoOfSeatsConfirmed(final Integer value)
	{
		setNoOfSeatsConfirmed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute. 
	 * @param value the noOfSeatsConfirmed - No Of Seats Requested
	 */
	public void setNoOfSeatsConfirmed(final SessionContext ctx, final int value)
	{
		setNoOfSeatsConfirmed( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.noOfSeatsConfirmed</code> attribute. 
	 * @param value the noOfSeatsConfirmed - No Of Seats Requested
	 */
	public void setNoOfSeatsConfirmed(final int value)
	{
		setNoOfSeatsConfirmed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute.
	 * @return the noOfWaitListSeats - No Of Wait List Seats
	 */
	public Integer getNoOfWaitListSeats(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFWAITLISTSEATS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute.
	 * @return the noOfWaitListSeats - No Of Wait List Seats
	 */
	public Integer getNoOfWaitListSeats()
	{
		return getNoOfWaitListSeats( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute. 
	 * @return the noOfWaitListSeats - No Of Wait List Seats
	 */
	public int getNoOfWaitListSeatsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfWaitListSeats( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute. 
	 * @return the noOfWaitListSeats - No Of Wait List Seats
	 */
	public int getNoOfWaitListSeatsAsPrimitive()
	{
		return getNoOfWaitListSeatsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute. 
	 * @param value the noOfWaitListSeats - No Of Wait List Seats
	 */
	public void setNoOfWaitListSeats(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFWAITLISTSEATS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute. 
	 * @param value the noOfWaitListSeats - No Of Wait List Seats
	 */
	public void setNoOfWaitListSeats(final Integer value)
	{
		setNoOfWaitListSeats( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute. 
	 * @param value the noOfWaitListSeats - No Of Wait List Seats
	 */
	public void setNoOfWaitListSeats(final SessionContext ctx, final int value)
	{
		setNoOfWaitListSeats( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.noOfWaitListSeats</code> attribute. 
	 * @param value the noOfWaitListSeats - No Of Wait List Seats
	 */
	public void setNoOfWaitListSeats(final int value)
	{
		setNoOfWaitListSeats( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.origin</code> attribute.
	 * @return the origin - Origin
	 */
	public Airport getOrigin(final SessionContext ctx)
	{
		return (Airport)getProperty( ctx, ORIGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.origin</code> attribute.
	 * @return the origin - Origin
	 */
	public Airport getOrigin()
	{
		return getOrigin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.origin</code> attribute. 
	 * @param value the origin - Origin
	 */
	public void setOrigin(final SessionContext ctx, final Airport value)
	{
		setProperty(ctx, ORIGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.origin</code> attribute. 
	 * @param value the origin - Origin
	 */
	public void setOrigin(final Airport value)
	{
		setOrigin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.perPax</code> attribute.
	 * @return the perPax - Per pax
	 */
	public Double getPerPax(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.perPax</code> attribute.
	 * @return the perPax - Per pax
	 */
	public Double getPerPax()
	{
		return getPerPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.perPax</code> attribute. 
	 * @return the perPax - Per pax
	 */
	public double getPerPaxAsPrimitive(final SessionContext ctx)
	{
		Double value = getPerPax( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.perPax</code> attribute. 
	 * @return the perPax - Per pax
	 */
	public double getPerPaxAsPrimitive()
	{
		return getPerPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.perPax</code> attribute. 
	 * @param value the perPax - Per pax
	 */
	public void setPerPax(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.perPax</code> attribute. 
	 * @param value the perPax - Per pax
	 */
	public void setPerPax(final Double value)
	{
		setPerPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.perPax</code> attribute. 
	 * @param value the perPax - Per pax
	 */
	public void setPerPax(final SessionContext ctx, final double value)
	{
		setPerPax( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.perPax</code> attribute. 
	 * @param value the perPax - Per pax
	 */
	public void setPerPax(final double value)
	{
		setPerPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.pnr</code> attribute.
	 * @return the pnr - PNR
	 */
	public String getPnr(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PNR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.pnr</code> attribute.
	 * @return the pnr - PNR
	 */
	public String getPnr()
	{
		return getPnr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.pnr</code> attribute. 
	 * @param value the pnr - PNR
	 */
	public void setPnr(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PNR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.pnr</code> attribute. 
	 * @param value the pnr - PNR
	 */
	public void setPnr(final String value)
	{
		setPnr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.pnrStatus</code> attribute.
	 * @return the pnrStatus - PNR 
	 * 						Status
	 */
	public EnumerationValue getPnrStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PNRSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.pnrStatus</code> attribute.
	 * @return the pnrStatus - PNR 
	 * 						Status
	 */
	public EnumerationValue getPnrStatus()
	{
		return getPnrStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.pnrStatus</code> attribute. 
	 * @param value the pnrStatus - PNR 
	 * 						Status
	 */
	public void setPnrStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PNRSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.pnrStatus</code> attribute. 
	 * @param value the pnrStatus - PNR 
	 * 						Status
	 */
	public void setPnrStatus(final EnumerationValue value)
	{
		setPnrStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.product</code> attribute.
	 * @return the product - Product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.product</code> attribute.
	 * @return the product - Product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.product</code> attribute. 
	 * @param value the product - Product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.product</code> attribute. 
	 * @param value the product - Product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.rbd</code> attribute.
	 * @return the rbd - RBD
	 */
	public EnumerationValue getRbd(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RBD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.rbd</code> attribute.
	 * @return the rbd - RBD
	 */
	public EnumerationValue getRbd()
	{
		return getRbd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.rbd</code> attribute. 
	 * @param value the rbd - RBD
	 */
	public void setRbd(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RBD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.rbd</code> attribute. 
	 * @param value the rbd - RBD
	 */
	public void setRbd(final EnumerationValue value)
	{
		setRbd( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute.
	 * @return the requestedQuantity - Requested
	 */
	public Long getRequestedQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, REQUESTEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute.
	 * @return the requestedQuantity - Requested
	 */
	public Long getRequestedQuantity()
	{
		return getRequestedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute. 
	 * @return the requestedQuantity - Requested
	 */
	public long getRequestedQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getRequestedQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute. 
	 * @return the requestedQuantity - Requested
	 */
	public long getRequestedQuantityAsPrimitive()
	{
		return getRequestedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute. 
	 * @param value the requestedQuantity - Requested
	 */
	public void setRequestedQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, REQUESTEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute. 
	 * @param value the requestedQuantity - Requested
	 */
	public void setRequestedQuantity(final Long value)
	{
		setRequestedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute. 
	 * @param value the requestedQuantity - Requested
	 */
	public void setRequestedQuantity(final SessionContext ctx, final long value)
	{
		setRequestedQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.requestedQuantity</code> attribute. 
	 * @param value the requestedQuantity - Requested
	 */
	public void setRequestedQuantity(final long value)
	{
		setRequestedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute.
	 * @return the reservedQuantity - Reserved Quantity
	 */
	public Long getReservedQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, RESERVEDQUANTITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute.
	 * @return the reservedQuantity - Reserved Quantity
	 */
	public Long getReservedQuantity()
	{
		return getReservedQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute. 
	 * @return the reservedQuantity - Reserved Quantity
	 */
	public long getReservedQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getReservedQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute. 
	 * @return the reservedQuantity - Reserved Quantity
	 */
	public long getReservedQuantityAsPrimitive()
	{
		return getReservedQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute. 
	 * @param value the reservedQuantity - Reserved Quantity
	 */
	public void setReservedQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, RESERVEDQUANTITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute. 
	 * @param value the reservedQuantity - Reserved Quantity
	 */
	public void setReservedQuantity(final Long value)
	{
		setReservedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute. 
	 * @param value the reservedQuantity - Reserved Quantity
	 */
	public void setReservedQuantity(final SessionContext ctx, final long value)
	{
		setReservedQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.reservedQuantity</code> attribute. 
	 * @param value the reservedQuantity - Reserved Quantity
	 */
	public void setReservedQuantity(final long value)
	{
		setReservedQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.sectorType</code> attribute.
	 * @return the sectorType - Sector Type
	 */
	public EnumerationValue getSectorType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SECTORTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.sectorType</code> attribute.
	 * @return the sectorType - Sector Type
	 */
	public EnumerationValue getSectorType()
	{
		return getSectorType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.sectorType</code> attribute. 
	 * @param value the sectorType - Sector Type
	 */
	public void setSectorType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SECTORTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.sectorType</code> attribute. 
	 * @param value the sectorType - Sector Type
	 */
	public void setSectorType(final EnumerationValue value)
	{
		setSectorType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.specificTravelDates</code> attribute.
	 * @return the specificTravelDates - Specific Travel Dates
	 */
	public Collection<Date> getSpecificTravelDates(final SessionContext ctx)
	{
		Collection<Date> coll = (Collection<Date>)getProperty( ctx, SPECIFICTRAVELDATES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.specificTravelDates</code> attribute.
	 * @return the specificTravelDates - Specific Travel Dates
	 */
	public Collection<Date> getSpecificTravelDates()
	{
		return getSpecificTravelDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.specificTravelDates</code> attribute. 
	 * @param value the specificTravelDates - Specific Travel Dates
	 */
	public void setSpecificTravelDates(final SessionContext ctx, final Collection<Date> value)
	{
		setProperty(ctx, SPECIFICTRAVELDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.specificTravelDates</code> attribute. 
	 * @param value the specificTravelDates - Specific Travel Dates
	 */
	public void setSpecificTravelDates(final Collection<Date> value)
	{
		setSpecificTravelDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.time</code> attribute.
	 * @return the time - Time
	 */
	public String getTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.time</code> attribute.
	 * @return the time - Time
	 */
	public String getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.time</code> attribute. 
	 * @param value the time - Time
	 */
	public void setTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.time</code> attribute. 
	 * @param value the time - Time
	 */
	public void setTime(final String value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.travelDateRange</code> attribute.
	 * @return the travelDateRange - travel date range
	 */
	public StandardDateRange getTravelDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, TRAVELDATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.travelDateRange</code> attribute.
	 * @return the travelDateRange - travel date range
	 */
	public StandardDateRange getTravelDateRange()
	{
		return getTravelDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.travelDateRange</code> attribute. 
	 * @param value the travelDateRange - travel date range
	 */
	public void setTravelDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, TRAVELDATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.travelDateRange</code> attribute. 
	 * @param value the travelDateRange - travel date range
	 */
	public void setTravelDateRange(final StandardDateRange value)
	{
		setTravelDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.travelFareRangeFrom</code> attribute.
	 * @return the travelFareRangeFrom - Travel Fare Range From
	 */
	public BigDecimal getTravelFareRangeFrom(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, TRAVELFARERANGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.travelFareRangeFrom</code> attribute.
	 * @return the travelFareRangeFrom - Travel Fare Range From
	 */
	public BigDecimal getTravelFareRangeFrom()
	{
		return getTravelFareRangeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.travelFareRangeFrom</code> attribute. 
	 * @param value the travelFareRangeFrom - Travel Fare Range From
	 */
	public void setTravelFareRangeFrom(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, TRAVELFARERANGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.travelFareRangeFrom</code> attribute. 
	 * @param value the travelFareRangeFrom - Travel Fare Range From
	 */
	public void setTravelFareRangeFrom(final BigDecimal value)
	{
		setTravelFareRangeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.travelFareRangeTo</code> attribute.
	 * @return the travelFareRangeTo - Travel FareRange To
	 */
	public BigDecimal getTravelFareRangeTo(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, TRAVELFARERANGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.travelFareRangeTo</code> attribute.
	 * @return the travelFareRangeTo - Travel FareRange To
	 */
	public BigDecimal getTravelFareRangeTo()
	{
		return getTravelFareRangeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.travelFareRangeTo</code> attribute. 
	 * @param value the travelFareRangeTo - Travel FareRange To
	 */
	public void setTravelFareRangeTo(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, TRAVELFARERANGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.travelFareRangeTo</code> attribute. 
	 * @param value the travelFareRangeTo - Travel FareRange To
	 */
	public void setTravelFareRangeTo(final BigDecimal value)
	{
		setTravelFareRangeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.uqTax</code> attribute.
	 * @return the uqTax - uq Tax
	 */
	public BigDecimal getUqTax(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, UQTAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAirInventoryDetail.uqTax</code> attribute.
	 * @return the uqTax - uq Tax
	 */
	public BigDecimal getUqTax()
	{
		return getUqTax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.uqTax</code> attribute. 
	 * @param value the uqTax - uq Tax
	 */
	public void setUqTax(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, UQTAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAirInventoryDetail.uqTax</code> attribute. 
	 * @param value the uqTax - uq Tax
	 */
	public void setUqTax(final BigDecimal value)
	{
		setUqTax( getSession().getSessionContext(), value );
	}
	
}
