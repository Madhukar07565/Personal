/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.FreeOfCostSeatsOrTickets;
import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AirFreeOfCostSeatsOrTickets AirFreeOfCostSeatsOrTickets}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirFreeOfCostSeatsOrTickets extends FreeOfCostSeatsOrTickets
{
	/** Qualifier of the <code>AirFreeOfCostSeatsOrTickets.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>AirFreeOfCostSeatsOrTickets.rbd</code> attribute **/
	public static final String RBD = "rbd";
	/** Qualifier of the <code>AirFreeOfCostSeatsOrTickets.fareComponent</code> attribute **/
	public static final String FARECOMPONENT = "fareComponent";
	/** Qualifier of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute **/
	public static final String NOTICKETSORUPGRADE = "noTicketsOrUpgrade";
	/** Qualifier of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute **/
	public static final String FREEOFCOSTPERCENTAGEAMOUNT = "freeOfCostPercentageAmount";
	/** Qualifier of the <code>AirFreeOfCostSeatsOrTickets.discountType</code> attribute **/
	public static final String DISCOUNTTYPE = "discountType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(FreeOfCostSeatsOrTickets.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(RBD, AttributeMode.INITIAL);
		tmp.put(FARECOMPONENT, AttributeMode.INITIAL);
		tmp.put(NOTICKETSORUPGRADE, AttributeMode.INITIAL);
		tmp.put(FREEOFCOSTPERCENTAGEAMOUNT, AttributeMode.INITIAL);
		tmp.put(DISCOUNTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.cabinClass</code> attribute.
	 * @return the cabinClass - Cabin class
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.cabinClass</code> attribute.
	 * @return the cabinClass - Cabin class
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.cabinClass</code> attribute. 
	 * @param value the cabinClass - Cabin class
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.cabinClass</code> attribute. 
	 * @param value the cabinClass - Cabin class
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.discountType</code> attribute.
	 * @return the discountType - discountType
	 */
	public EnumerationValue getDiscountType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISCOUNTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.discountType</code> attribute.
	 * @return the discountType - discountType
	 */
	public EnumerationValue getDiscountType()
	{
		return getDiscountType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.discountType</code> attribute. 
	 * @param value the discountType - discountType
	 */
	public void setDiscountType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISCOUNTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.discountType</code> attribute. 
	 * @param value the discountType - discountType
	 */
	public void setDiscountType(final EnumerationValue value)
	{
		setDiscountType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.fareComponent</code> attribute.
	 * @return the fareComponent - Fare component
	 */
	public FareComponent getFareComponent(final SessionContext ctx)
	{
		return (FareComponent)getProperty( ctx, FARECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.fareComponent</code> attribute.
	 * @return the fareComponent - Fare component
	 */
	public FareComponent getFareComponent()
	{
		return getFareComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.fareComponent</code> attribute. 
	 * @param value the fareComponent - Fare component
	 */
	public void setFareComponent(final SessionContext ctx, final FareComponent value)
	{
		setProperty(ctx, FARECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.fareComponent</code> attribute. 
	 * @param value the fareComponent - Fare component
	 */
	public void setFareComponent(final FareComponent value)
	{
		setFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute.
	 * @return the freeOfCostPercentageAmount - freeOfCostPercentageAmount
	 */
	public Double getFreeOfCostPercentageAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, FREEOFCOSTPERCENTAGEAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute.
	 * @return the freeOfCostPercentageAmount - freeOfCostPercentageAmount
	 */
	public Double getFreeOfCostPercentageAmount()
	{
		return getFreeOfCostPercentageAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute. 
	 * @return the freeOfCostPercentageAmount - freeOfCostPercentageAmount
	 */
	public double getFreeOfCostPercentageAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getFreeOfCostPercentageAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute. 
	 * @return the freeOfCostPercentageAmount - freeOfCostPercentageAmount
	 */
	public double getFreeOfCostPercentageAmountAsPrimitive()
	{
		return getFreeOfCostPercentageAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute. 
	 * @param value the freeOfCostPercentageAmount - freeOfCostPercentageAmount
	 */
	public void setFreeOfCostPercentageAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, FREEOFCOSTPERCENTAGEAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute. 
	 * @param value the freeOfCostPercentageAmount - freeOfCostPercentageAmount
	 */
	public void setFreeOfCostPercentageAmount(final Double value)
	{
		setFreeOfCostPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute. 
	 * @param value the freeOfCostPercentageAmount - freeOfCostPercentageAmount
	 */
	public void setFreeOfCostPercentageAmount(final SessionContext ctx, final double value)
	{
		setFreeOfCostPercentageAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.freeOfCostPercentageAmount</code> attribute. 
	 * @param value the freeOfCostPercentageAmount - freeOfCostPercentageAmount
	 */
	public void setFreeOfCostPercentageAmount(final double value)
	{
		setFreeOfCostPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute.
	 * @return the noTicketsOrUpgrade - noTicketsOrUpgrade
	 */
	public Long getNoTicketsOrUpgrade(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, NOTICKETSORUPGRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute.
	 * @return the noTicketsOrUpgrade - noTicketsOrUpgrade
	 */
	public Long getNoTicketsOrUpgrade()
	{
		return getNoTicketsOrUpgrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute. 
	 * @return the noTicketsOrUpgrade - noTicketsOrUpgrade
	 */
	public long getNoTicketsOrUpgradeAsPrimitive(final SessionContext ctx)
	{
		Long value = getNoTicketsOrUpgrade( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute. 
	 * @return the noTicketsOrUpgrade - noTicketsOrUpgrade
	 */
	public long getNoTicketsOrUpgradeAsPrimitive()
	{
		return getNoTicketsOrUpgradeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute. 
	 * @param value the noTicketsOrUpgrade - noTicketsOrUpgrade
	 */
	public void setNoTicketsOrUpgrade(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, NOTICKETSORUPGRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute. 
	 * @param value the noTicketsOrUpgrade - noTicketsOrUpgrade
	 */
	public void setNoTicketsOrUpgrade(final Long value)
	{
		setNoTicketsOrUpgrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute. 
	 * @param value the noTicketsOrUpgrade - noTicketsOrUpgrade
	 */
	public void setNoTicketsOrUpgrade(final SessionContext ctx, final long value)
	{
		setNoTicketsOrUpgrade( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.noTicketsOrUpgrade</code> attribute. 
	 * @param value the noTicketsOrUpgrade - noTicketsOrUpgrade
	 */
	public void setNoTicketsOrUpgrade(final long value)
	{
		setNoTicketsOrUpgrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.rbd</code> attribute.
	 * @return the rbd - Reservation booking designator
	 */
	public EnumerationValue getRbd(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RBD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirFreeOfCostSeatsOrTickets.rbd</code> attribute.
	 * @return the rbd - Reservation booking designator
	 */
	public EnumerationValue getRbd()
	{
		return getRbd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.rbd</code> attribute. 
	 * @param value the rbd - Reservation booking designator
	 */
	public void setRbd(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RBD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirFreeOfCostSeatsOrTickets.rbd</code> attribute. 
	 * @param value the rbd - Reservation booking designator
	 */
	public void setRbd(final EnumerationValue value)
	{
		setRbd( getSession().getSessionContext(), value );
	}
	
}
