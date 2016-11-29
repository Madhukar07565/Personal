/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentRequest;
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
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentCommission AirCouponIndentCommission}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirCouponIndentCommission extends GenericItem
{
	/** Qualifier of the <code>AirCouponIndentCommission.commissionType</code> attribute **/
	public static final String COMMISSIONTYPE = "commissionType";
	/** Qualifier of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute **/
	public static final String CUTPAYORGROSS = "cutPayOrGross";
	/** Qualifier of the <code>AirCouponIndentCommission.percentageAmount</code> attribute **/
	public static final String PERCENTAGEAMOUNT = "percentageAmount";
	/** Qualifier of the <code>AirCouponIndentCommission.actualAmount</code> attribute **/
	public static final String ACTUALAMOUNT = "actualAmount";
	/** Qualifier of the <code>AirCouponIndentCommission.fareComponent</code> attribute **/
	public static final String FARECOMPONENT = "fareComponent";
	/** Qualifier of the <code>AirCouponIndentCommission.airCouponIndentRequest</code> attribute **/
	public static final String AIRCOUPONINDENTREQUEST = "airCouponIndentRequest";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRCOUPONINDENTREQUEST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirCouponIndentCommission> AIRCOUPONINDENTREQUESTHANDLER = new BidirectionalOneToManyHandler<GeneratedAirCouponIndentCommission>(
	TransportinventorycoreConstants.TC.AIRCOUPONINDENTCOMMISSION,
	false,
	"airCouponIndentRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMMISSIONTYPE, AttributeMode.INITIAL);
		tmp.put(CUTPAYORGROSS, AttributeMode.INITIAL);
		tmp.put(PERCENTAGEAMOUNT, AttributeMode.INITIAL);
		tmp.put(ACTUALAMOUNT, AttributeMode.INITIAL);
		tmp.put(FARECOMPONENT, AttributeMode.INITIAL);
		tmp.put(AIRCOUPONINDENTREQUEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.actualAmount</code> attribute.
	 * @return the actualAmount
	 */
	public Double getActualAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ACTUALAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.actualAmount</code> attribute.
	 * @return the actualAmount
	 */
	public Double getActualAmount()
	{
		return getActualAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.actualAmount</code> attribute. 
	 * @return the actualAmount
	 */
	public double getActualAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getActualAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.actualAmount</code> attribute. 
	 * @return the actualAmount
	 */
	public double getActualAmountAsPrimitive()
	{
		return getActualAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.actualAmount</code> attribute. 
	 * @param value the actualAmount
	 */
	public void setActualAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ACTUALAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.actualAmount</code> attribute. 
	 * @param value the actualAmount
	 */
	public void setActualAmount(final Double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.actualAmount</code> attribute. 
	 * @param value the actualAmount
	 */
	public void setActualAmount(final SessionContext ctx, final double value)
	{
		setActualAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.actualAmount</code> attribute. 
	 * @param value the actualAmount
	 */
	public void setActualAmount(final double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.airCouponIndentRequest</code> attribute.
	 * @return the airCouponIndentRequest
	 */
	public AirCouponIndentRequest getAirCouponIndentRequest(final SessionContext ctx)
	{
		return (AirCouponIndentRequest)getProperty( ctx, AIRCOUPONINDENTREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.airCouponIndentRequest</code> attribute.
	 * @return the airCouponIndentRequest
	 */
	public AirCouponIndentRequest getAirCouponIndentRequest()
	{
		return getAirCouponIndentRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.airCouponIndentRequest</code> attribute. 
	 * @param value the airCouponIndentRequest
	 */
	public void setAirCouponIndentRequest(final SessionContext ctx, final AirCouponIndentRequest value)
	{
		AIRCOUPONINDENTREQUESTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.airCouponIndentRequest</code> attribute. 
	 * @param value the airCouponIndentRequest
	 */
	public void setAirCouponIndentRequest(final AirCouponIndentRequest value)
	{
		setAirCouponIndentRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.commissionType</code> attribute.
	 * @return the commissionType
	 */
	public EnumerationValue getCommissionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMISSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.commissionType</code> attribute.
	 * @return the commissionType
	 */
	public EnumerationValue getCommissionType()
	{
		return getCommissionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.commissionType</code> attribute. 
	 * @param value the commissionType
	 */
	public void setCommissionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMISSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.commissionType</code> attribute. 
	 * @param value the commissionType
	 */
	public void setCommissionType(final EnumerationValue value)
	{
		setCommissionType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRCOUPONINDENTREQUESTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute.
	 * @return the cutPayOrGross
	 */
	public Boolean isCutPayOrGross(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CUTPAYORGROSS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute.
	 * @return the cutPayOrGross
	 */
	public Boolean isCutPayOrGross()
	{
		return isCutPayOrGross( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute. 
	 * @return the cutPayOrGross
	 */
	public boolean isCutPayOrGrossAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCutPayOrGross( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute. 
	 * @return the cutPayOrGross
	 */
	public boolean isCutPayOrGrossAsPrimitive()
	{
		return isCutPayOrGrossAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute. 
	 * @param value the cutPayOrGross
	 */
	public void setCutPayOrGross(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CUTPAYORGROSS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute. 
	 * @param value the cutPayOrGross
	 */
	public void setCutPayOrGross(final Boolean value)
	{
		setCutPayOrGross( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute. 
	 * @param value the cutPayOrGross
	 */
	public void setCutPayOrGross(final SessionContext ctx, final boolean value)
	{
		setCutPayOrGross( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.cutPayOrGross</code> attribute. 
	 * @param value the cutPayOrGross
	 */
	public void setCutPayOrGross(final boolean value)
	{
		setCutPayOrGross( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent(final SessionContext ctx)
	{
		return (FareComponent)getProperty( ctx, FARECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent()
	{
		return getFareComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final SessionContext ctx, final FareComponent value)
	{
		setProperty(ctx, FARECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final FareComponent value)
	{
		setFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.percentageAmount</code> attribute.
	 * @return the percentageAmount
	 */
	public Double getPercentageAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGEAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.percentageAmount</code> attribute.
	 * @return the percentageAmount
	 */
	public Double getPercentageAmount()
	{
		return getPercentageAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.percentageAmount</code> attribute. 
	 * @return the percentageAmount
	 */
	public double getPercentageAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentageAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentCommission.percentageAmount</code> attribute. 
	 * @return the percentageAmount
	 */
	public double getPercentageAmountAsPrimitive()
	{
		return getPercentageAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.percentageAmount</code> attribute. 
	 * @param value the percentageAmount
	 */
	public void setPercentageAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGEAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.percentageAmount</code> attribute. 
	 * @param value the percentageAmount
	 */
	public void setPercentageAmount(final Double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.percentageAmount</code> attribute. 
	 * @param value the percentageAmount
	 */
	public void setPercentageAmount(final SessionContext ctx, final double value)
	{
		setPercentageAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentCommission.percentageAmount</code> attribute. 
	 * @param value the percentageAmount
	 */
	public void setPercentageAmount(final double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
}
