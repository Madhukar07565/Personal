/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.pickuplocation.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.TransportationOffers;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.products.jalo.CarGroup;
import com.cnk.travelogix.masterdata.core.products.jalo.Station;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.pickuplocation.jalo.PickupLocation PickupLocation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPickupLocation extends GenericItem
{
	/** Qualifier of the <code>PickupLocation.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>PickupLocation.station</code> attribute **/
	public static final String STATION = "station";
	/** Qualifier of the <code>PickupLocation.carGroup</code> attribute **/
	public static final String CARGROUP = "carGroup";
	/** Qualifier of the <code>PickupLocation.sippCode</code> attribute **/
	public static final String SIPPCODE = "sippCode";
	/** Qualifier of the <code>PickupLocation.vehicleCategory</code> attribute **/
	public static final String VEHICLECATEGORY = "vehicleCategory";
	/** Qualifier of the <code>PickupLocation.transportationOffers</code> attribute **/
	public static final String TRANSPORTATIONOFFERS = "transportationOffers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRANSPORTATIONOFFERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPickupLocation> TRANSPORTATIONOFFERSHANDLER = new BidirectionalOneToManyHandler<GeneratedPickupLocation>(
	SupplierratedefinitionstransportConstants.TC.PICKUPLOCATION,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(STATION, AttributeMode.INITIAL);
		tmp.put(CARGROUP, AttributeMode.INITIAL);
		tmp.put(SIPPCODE, AttributeMode.INITIAL);
		tmp.put(VEHICLECATEGORY, AttributeMode.INITIAL);
		tmp.put(TRANSPORTATIONOFFERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.carGroup</code> attribute.
	 * @return the carGroup
	 */
	public CarGroup getCarGroup(final SessionContext ctx)
	{
		return (CarGroup)getProperty( ctx, CARGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.carGroup</code> attribute.
	 * @return the carGroup
	 */
	public CarGroup getCarGroup()
	{
		return getCarGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.carGroup</code> attribute. 
	 * @param value the carGroup
	 */
	public void setCarGroup(final SessionContext ctx, final CarGroup value)
	{
		setProperty(ctx, CARGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.carGroup</code> attribute. 
	 * @param value the carGroup
	 */
	public void setCarGroup(final CarGroup value)
	{
		setCarGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRANSPORTATIONOFFERSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.sippCode</code> attribute.
	 * @return the sippCode
	 */
	public EnumerationValue getSippCode(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SIPPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.sippCode</code> attribute.
	 * @return the sippCode
	 */
	public EnumerationValue getSippCode()
	{
		return getSippCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.sippCode</code> attribute. 
	 * @param value the sippCode
	 */
	public void setSippCode(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SIPPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.sippCode</code> attribute. 
	 * @param value the sippCode
	 */
	public void setSippCode(final EnumerationValue value)
	{
		setSippCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.station</code> attribute.
	 * @return the station
	 */
	public Station getStation(final SessionContext ctx)
	{
		return (Station)getProperty( ctx, STATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.station</code> attribute.
	 * @return the station
	 */
	public Station getStation()
	{
		return getStation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.station</code> attribute. 
	 * @param value the station
	 */
	public void setStation(final SessionContext ctx, final Station value)
	{
		setProperty(ctx, STATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.station</code> attribute. 
	 * @param value the station
	 */
	public void setStation(final Station value)
	{
		setStation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationOffers getTransportationOffers(final SessionContext ctx)
	{
		return (TransportationOffers)getProperty( ctx, TRANSPORTATIONOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationOffers getTransportationOffers()
	{
		return getTransportationOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final SessionContext ctx, final TransportationOffers value)
	{
		TRANSPORTATIONOFFERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final TransportationOffers value)
	{
		setTransportationOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.vehicleCategory</code> attribute.
	 * @return the vehicleCategory
	 */
	public EnumerationValue getVehicleCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLECATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PickupLocation.vehicleCategory</code> attribute.
	 * @return the vehicleCategory
	 */
	public EnumerationValue getVehicleCategory()
	{
		return getVehicleCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory
	 */
	public void setVehicleCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLECATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PickupLocation.vehicleCategory</code> attribute. 
	 * @param value the vehicleCategory
	 */
	public void setVehicleCategory(final EnumerationValue value)
	{
		setVehicleCategory( getSession().getSessionContext(), value );
	}
	
}
