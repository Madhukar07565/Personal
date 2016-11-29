/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryDetail;
import com.cnk.travelogix.product.common.core.jalo.Ship;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.AbstractCruiseInventoryDetail AbstractCruiseInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCruiseInventoryDetail extends AbstractInventoryDetail
{
	/** Qualifier of the <code>AbstractCruiseInventoryDetail.shipName</code> attribute **/
	public static final String SHIPNAME = "shipName";
	/** Qualifier of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute **/
	public static final String NOOFNIGHTS = "noOfNights";
	/** Qualifier of the <code>AbstractCruiseInventoryDetail.priceRangeFrom</code> attribute **/
	public static final String PRICERANGEFROM = "priceRangeFrom";
	/** Qualifier of the <code>AbstractCruiseInventoryDetail.priceRangeTo</code> attribute **/
	public static final String PRICERANGETO = "priceRangeTo";
	/** Qualifier of the <code>AbstractCruiseInventoryDetail.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>AbstractCruiseInventoryDetail.remark</code> attribute **/
	public static final String REMARK = "remark";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SHIPNAME, AttributeMode.INITIAL);
		tmp.put(NOOFNIGHTS, AttributeMode.INITIAL);
		tmp.put(PRICERANGEFROM, AttributeMode.INITIAL);
		tmp.put(PRICERANGETO, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute.
	 * @return the noOfNights - No Of Nights
	 */
	public Integer getNoOfNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute.
	 * @return the noOfNights - No Of Nights
	 */
	public Integer getNoOfNights()
	{
		return getNoOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute. 
	 * @return the noOfNights - No Of Nights
	 */
	public int getNoOfNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute. 
	 * @return the noOfNights - No Of Nights
	 */
	public int getNoOfNightsAsPrimitive()
	{
		return getNoOfNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute. 
	 * @param value the noOfNights - No Of Nights
	 */
	public void setNoOfNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute. 
	 * @param value the noOfNights - No Of Nights
	 */
	public void setNoOfNights(final Integer value)
	{
		setNoOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute. 
	 * @param value the noOfNights - No Of Nights
	 */
	public void setNoOfNights(final SessionContext ctx, final int value)
	{
		setNoOfNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.noOfNights</code> attribute. 
	 * @param value the noOfNights - No Of Nights
	 */
	public void setNoOfNights(final int value)
	{
		setNoOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.priceRangeFrom</code> attribute.
	 * @return the priceRangeFrom - Price Range From
	 */
	public BigDecimal getPriceRangeFrom(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PRICERANGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.priceRangeFrom</code> attribute.
	 * @return the priceRangeFrom - Price Range From
	 */
	public BigDecimal getPriceRangeFrom()
	{
		return getPriceRangeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.priceRangeFrom</code> attribute. 
	 * @param value the priceRangeFrom - Price Range From
	 */
	public void setPriceRangeFrom(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PRICERANGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.priceRangeFrom</code> attribute. 
	 * @param value the priceRangeFrom - Price Range From
	 */
	public void setPriceRangeFrom(final BigDecimal value)
	{
		setPriceRangeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.priceRangeTo</code> attribute.
	 * @return the priceRangeTo - Price Range To
	 */
	public BigDecimal getPriceRangeTo(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PRICERANGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.priceRangeTo</code> attribute.
	 * @return the priceRangeTo - Price Range To
	 */
	public BigDecimal getPriceRangeTo()
	{
		return getPriceRangeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.priceRangeTo</code> attribute. 
	 * @param value the priceRangeTo - Price Range To
	 */
	public void setPriceRangeTo(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PRICERANGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.priceRangeTo</code> attribute. 
	 * @param value the priceRangeTo - Price Range To
	 */
	public void setPriceRangeTo(final BigDecimal value)
	{
		setPriceRangeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.shipName</code> attribute.
	 * @return the shipName - Ship Name
	 */
	public Ship getShipName(final SessionContext ctx)
	{
		return (Ship)getProperty( ctx, SHIPNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCruiseInventoryDetail.shipName</code> attribute.
	 * @return the shipName - Ship Name
	 */
	public Ship getShipName()
	{
		return getShipName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.shipName</code> attribute. 
	 * @param value the shipName - Ship Name
	 */
	public void setShipName(final SessionContext ctx, final Ship value)
	{
		setProperty(ctx, SHIPNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCruiseInventoryDetail.shipName</code> attribute. 
	 * @param value the shipName - Ship Name
	 */
	public void setShipName(final Ship value)
	{
		setShipName( getSession().getSessionContext(), value );
	}
	
}
