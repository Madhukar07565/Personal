/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.PeakHours;
import com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.TimeSlot;
import com.cnk.travelogix.product.transport.masters.core.jalo.Vehicle;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.TransportationRateAdvDefinition TransportationRateAdvDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationRateAdvDefinition extends AbstractRateAdvDefinition
{
	/** Qualifier of the <code>TransportationRateAdvDefinition.vehicleForOffer</code> attribute **/
	public static final String VEHICLEFOROFFER = "vehicleForOffer";
	/** Qualifier of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute **/
	public static final String MAXVEHICLEFOROFFER = "maxVehicleForOffer";
	/** Qualifier of the <code>TransportationRateAdvDefinition.timeSlots</code> attribute **/
	public static final String TIMESLOTS = "timeSlots";
	/** Qualifier of the <code>TransportationRateAdvDefinition.peakHours</code> attribute **/
	public static final String PEAKHOURS = "peakHours";
	/**
	* {@link OneToManyHandler} for handling 1:n TIMESLOTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TimeSlot> TIMESLOTSHANDLER = new OneToManyHandler<TimeSlot>(
	SupplierratedefinitionstransportConstants.TC.TIMESLOT,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PEAKHOURS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PeakHours> PEAKHOURSHANDLER = new OneToManyHandler<PeakHours>(
	SupplierratedefinitionstransportConstants.TC.PEAKHOURS,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateAdvDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VEHICLEFOROFFER, AttributeMode.INITIAL);
		tmp.put(MAXVEHICLEFOROFFER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute.
	 * @return the maxVehicleForOffer
	 */
	public Integer getMaxVehicleForOffer(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXVEHICLEFOROFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute.
	 * @return the maxVehicleForOffer
	 */
	public Integer getMaxVehicleForOffer()
	{
		return getMaxVehicleForOffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute. 
	 * @return the maxVehicleForOffer
	 */
	public int getMaxVehicleForOfferAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxVehicleForOffer( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute. 
	 * @return the maxVehicleForOffer
	 */
	public int getMaxVehicleForOfferAsPrimitive()
	{
		return getMaxVehicleForOfferAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute. 
	 * @param value the maxVehicleForOffer
	 */
	public void setMaxVehicleForOffer(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXVEHICLEFOROFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute. 
	 * @param value the maxVehicleForOffer
	 */
	public void setMaxVehicleForOffer(final Integer value)
	{
		setMaxVehicleForOffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute. 
	 * @param value the maxVehicleForOffer
	 */
	public void setMaxVehicleForOffer(final SessionContext ctx, final int value)
	{
		setMaxVehicleForOffer( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.maxVehicleForOffer</code> attribute. 
	 * @param value the maxVehicleForOffer
	 */
	public void setMaxVehicleForOffer(final int value)
	{
		setMaxVehicleForOffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.peakHours</code> attribute.
	 * @return the peakHours
	 */
	public Set<PeakHours> getPeakHours(final SessionContext ctx)
	{
		return (Set<PeakHours>)PEAKHOURSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.peakHours</code> attribute.
	 * @return the peakHours
	 */
	public Set<PeakHours> getPeakHours()
	{
		return getPeakHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.peakHours</code> attribute. 
	 * @param value the peakHours
	 */
	public void setPeakHours(final SessionContext ctx, final Set<PeakHours> value)
	{
		PEAKHOURSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.peakHours</code> attribute. 
	 * @param value the peakHours
	 */
	public void setPeakHours(final Set<PeakHours> value)
	{
		setPeakHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to peakHours. 
	 * @param value the item to add to peakHours
	 */
	public void addToPeakHours(final SessionContext ctx, final PeakHours value)
	{
		PEAKHOURSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to peakHours. 
	 * @param value the item to add to peakHours
	 */
	public void addToPeakHours(final PeakHours value)
	{
		addToPeakHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from peakHours. 
	 * @param value the item to remove from peakHours
	 */
	public void removeFromPeakHours(final SessionContext ctx, final PeakHours value)
	{
		PEAKHOURSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from peakHours. 
	 * @param value the item to remove from peakHours
	 */
	public void removeFromPeakHours(final PeakHours value)
	{
		removeFromPeakHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.timeSlots</code> attribute.
	 * @return the timeSlots
	 */
	public Set<TimeSlot> getTimeSlots(final SessionContext ctx)
	{
		return (Set<TimeSlot>)TIMESLOTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.timeSlots</code> attribute.
	 * @return the timeSlots
	 */
	public Set<TimeSlot> getTimeSlots()
	{
		return getTimeSlots( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.timeSlots</code> attribute. 
	 * @param value the timeSlots
	 */
	public void setTimeSlots(final SessionContext ctx, final Set<TimeSlot> value)
	{
		TIMESLOTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.timeSlots</code> attribute. 
	 * @param value the timeSlots
	 */
	public void setTimeSlots(final Set<TimeSlot> value)
	{
		setTimeSlots( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to timeSlots. 
	 * @param value the item to add to timeSlots
	 */
	public void addToTimeSlots(final SessionContext ctx, final TimeSlot value)
	{
		TIMESLOTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to timeSlots. 
	 * @param value the item to add to timeSlots
	 */
	public void addToTimeSlots(final TimeSlot value)
	{
		addToTimeSlots( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from timeSlots. 
	 * @param value the item to remove from timeSlots
	 */
	public void removeFromTimeSlots(final SessionContext ctx, final TimeSlot value)
	{
		TIMESLOTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from timeSlots. 
	 * @param value the item to remove from timeSlots
	 */
	public void removeFromTimeSlots(final TimeSlot value)
	{
		removeFromTimeSlots( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.vehicleForOffer</code> attribute.
	 * @return the vehicleForOffer
	 */
	public Vehicle getVehicleForOffer(final SessionContext ctx)
	{
		return (Vehicle)getProperty( ctx, VEHICLEFOROFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateAdvDefinition.vehicleForOffer</code> attribute.
	 * @return the vehicleForOffer
	 */
	public Vehicle getVehicleForOffer()
	{
		return getVehicleForOffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.vehicleForOffer</code> attribute. 
	 * @param value the vehicleForOffer
	 */
	public void setVehicleForOffer(final SessionContext ctx, final Vehicle value)
	{
		setProperty(ctx, VEHICLEFOROFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateAdvDefinition.vehicleForOffer</code> attribute. 
	 * @param value the vehicleForOffer
	 */
	public void setVehicleForOffer(final Vehicle value)
	{
		setVehicleForOffer( getSession().getSessionContext(), value );
	}
	
}
