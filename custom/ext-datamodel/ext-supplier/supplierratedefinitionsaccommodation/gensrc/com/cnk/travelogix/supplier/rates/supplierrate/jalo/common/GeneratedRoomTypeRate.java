/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsaccommodationConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.AccoRateDetailDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RoomTypeRate RoomTypeRate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomTypeRate extends GenericItem
{
	/** Qualifier of the <code>RoomTypeRate.rate</code> attribute **/
	public static final String RATE = "rate";
	/** Qualifier of the <code>RoomTypeRate.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>RoomTypeRate.payOnArrival</code> attribute **/
	public static final String PAYONARRIVAL = "payOnArrival";
	/** Qualifier of the <code>RoomTypeRate.accoRateDetailDefinition</code> attribute **/
	public static final String ACCORATEDETAILDEFINITION = "accoRateDetailDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCORATEDETAILDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRoomTypeRate> ACCORATEDETAILDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedRoomTypeRate>(
	SupplierratedefinitionsaccommodationConstants.TC.ROOMTYPERATE,
	false,
	"accoRateDetailDefinition",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RATE, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(PAYONARRIVAL, AttributeMode.INITIAL);
		tmp.put(ACCORATEDETAILDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.accoRateDetailDefinition</code> attribute.
	 * @return the accoRateDetailDefinition
	 */
	public AccoRateDetailDefinition getAccoRateDetailDefinition(final SessionContext ctx)
	{
		return (AccoRateDetailDefinition)getProperty( ctx, ACCORATEDETAILDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.accoRateDetailDefinition</code> attribute.
	 * @return the accoRateDetailDefinition
	 */
	public AccoRateDetailDefinition getAccoRateDetailDefinition()
	{
		return getAccoRateDetailDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.accoRateDetailDefinition</code> attribute. 
	 * @param value the accoRateDetailDefinition
	 */
	public void setAccoRateDetailDefinition(final SessionContext ctx, final AccoRateDetailDefinition value)
	{
		ACCORATEDETAILDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.accoRateDetailDefinition</code> attribute. 
	 * @param value the accoRateDetailDefinition
	 */
	public void setAccoRateDetailDefinition(final AccoRateDetailDefinition value)
	{
		setAccoRateDetailDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCORATEDETAILDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYONARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival()
	{
		return isPayOnArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayOnArrival( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive()
	{
		return isPayOnArrivalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYONARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final Boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final boolean value)
	{
		setPayOnArrival( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.rate</code> attribute.
	 * @return the rate
	 */
	public Double getRate(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.rate</code> attribute.
	 * @return the rate
	 */
	public Double getRate()
	{
		return getRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.rate</code> attribute. 
	 * @return the rate
	 */
	public double getRateAsPrimitive(final SessionContext ctx)
	{
		Double value = getRate( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.rate</code> attribute. 
	 * @return the rate
	 */
	public double getRateAsPrimitive()
	{
		return getRateAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final Double value)
	{
		setRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final SessionContext ctx, final double value)
	{
		setRate( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final double value)
	{
		setRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeRate.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeRate.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
}
