/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.TravelogixPolicyDetail;
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
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.PolicyDetail PolicyDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPolicyDetail extends GenericItem
{
	/** Qualifier of the <code>PolicyDetail.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>PolicyDetail.fromDay</code> attribute **/
	public static final String FROMDAY = "fromDay";
	/** Qualifier of the <code>PolicyDetail.toDay</code> attribute **/
	public static final String TODAY = "toDay";
	/** Qualifier of the <code>PolicyDetail.percentageAmount</code> attribute **/
	public static final String PERCENTAGEAMOUNT = "percentageAmount";
	/** Qualifier of the <code>PolicyDetail.actualAmount</code> attribute **/
	public static final String ACTUALAMOUNT = "actualAmount";
	/** Qualifier of the <code>PolicyDetail.priceApplicableOn</code> attribute **/
	public static final String PRICEAPPLICABLEON = "priceApplicableOn";
	/** Qualifier of the <code>PolicyDetail.travelogixPolicyDetail</code> attribute **/
	public static final String TRAVELOGIXPOLICYDETAIL = "travelogixPolicyDetail";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXPOLICYDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPolicyDetail> TRAVELOGIXPOLICYDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedPolicyDetail>(
	TransportinventorycoreConstants.TC.POLICYDETAIL,
	false,
	"travelogixPolicyDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(FROMDAY, AttributeMode.INITIAL);
		tmp.put(TODAY, AttributeMode.INITIAL);
		tmp.put(PERCENTAGEAMOUNT, AttributeMode.INITIAL);
		tmp.put(ACTUALAMOUNT, AttributeMode.INITIAL);
		tmp.put(PRICEAPPLICABLEON, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXPOLICYDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.actualAmount</code> attribute.
	 * @return the actualAmount - actualAmount
	 */
	public Double getActualAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ACTUALAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.actualAmount</code> attribute.
	 * @return the actualAmount - actualAmount
	 */
	public Double getActualAmount()
	{
		return getActualAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.actualAmount</code> attribute. 
	 * @return the actualAmount - actualAmount
	 */
	public double getActualAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getActualAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.actualAmount</code> attribute. 
	 * @return the actualAmount - actualAmount
	 */
	public double getActualAmountAsPrimitive()
	{
		return getActualAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.actualAmount</code> attribute. 
	 * @param value the actualAmount - actualAmount
	 */
	public void setActualAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ACTUALAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.actualAmount</code> attribute. 
	 * @param value the actualAmount - actualAmount
	 */
	public void setActualAmount(final Double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.actualAmount</code> attribute. 
	 * @param value the actualAmount - actualAmount
	 */
	public void setActualAmount(final SessionContext ctx, final double value)
	{
		setActualAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.actualAmount</code> attribute. 
	 * @param value the actualAmount - actualAmount
	 */
	public void setActualAmount(final double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELOGIXPOLICYDETAILHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.definedBy</code> attribute.
	 * @return the definedBy - Defined by
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.definedBy</code> attribute.
	 * @return the definedBy - Defined by
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.definedBy</code> attribute. 
	 * @param value the definedBy - Defined by
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.definedBy</code> attribute. 
	 * @param value the definedBy - Defined by
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.fromDay</code> attribute.
	 * @return the fromDay - fromDay
	 */
	public Integer getFromDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMDAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.fromDay</code> attribute.
	 * @return the fromDay - fromDay
	 */
	public Integer getFromDay()
	{
		return getFromDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.fromDay</code> attribute. 
	 * @return the fromDay - fromDay
	 */
	public int getFromDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.fromDay</code> attribute. 
	 * @return the fromDay - fromDay
	 */
	public int getFromDayAsPrimitive()
	{
		return getFromDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.fromDay</code> attribute. 
	 * @param value the fromDay - fromDay
	 */
	public void setFromDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMDAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.fromDay</code> attribute. 
	 * @param value the fromDay - fromDay
	 */
	public void setFromDay(final Integer value)
	{
		setFromDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.fromDay</code> attribute. 
	 * @param value the fromDay - fromDay
	 */
	public void setFromDay(final SessionContext ctx, final int value)
	{
		setFromDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.fromDay</code> attribute. 
	 * @param value the fromDay - fromDay
	 */
	public void setFromDay(final int value)
	{
		setFromDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.percentageAmount</code> attribute.
	 * @return the percentageAmount - percentageAmount
	 */
	public Double getPercentageAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGEAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.percentageAmount</code> attribute.
	 * @return the percentageAmount - percentageAmount
	 */
	public Double getPercentageAmount()
	{
		return getPercentageAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.percentageAmount</code> attribute. 
	 * @return the percentageAmount - percentageAmount
	 */
	public double getPercentageAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentageAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.percentageAmount</code> attribute. 
	 * @return the percentageAmount - percentageAmount
	 */
	public double getPercentageAmountAsPrimitive()
	{
		return getPercentageAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - percentageAmount
	 */
	public void setPercentageAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGEAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - percentageAmount
	 */
	public void setPercentageAmount(final Double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - percentageAmount
	 */
	public void setPercentageAmount(final SessionContext ctx, final double value)
	{
		setPercentageAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - percentageAmount
	 */
	public void setPercentageAmount(final double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.priceApplicableOn</code> attribute.
	 * @return the priceApplicableOn - priceApplicableOn
	 */
	public EnumerationValue getPriceApplicableOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICEAPPLICABLEON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.priceApplicableOn</code> attribute.
	 * @return the priceApplicableOn - priceApplicableOn
	 */
	public EnumerationValue getPriceApplicableOn()
	{
		return getPriceApplicableOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.priceApplicableOn</code> attribute. 
	 * @param value the priceApplicableOn - priceApplicableOn
	 */
	public void setPriceApplicableOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICEAPPLICABLEON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.priceApplicableOn</code> attribute. 
	 * @param value the priceApplicableOn - priceApplicableOn
	 */
	public void setPriceApplicableOn(final EnumerationValue value)
	{
		setPriceApplicableOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.toDay</code> attribute.
	 * @return the toDay - toDay
	 */
	public Integer getToDay(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TODAY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.toDay</code> attribute.
	 * @return the toDay - toDay
	 */
	public Integer getToDay()
	{
		return getToDay( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.toDay</code> attribute. 
	 * @return the toDay - toDay
	 */
	public int getToDayAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToDay( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.toDay</code> attribute. 
	 * @return the toDay - toDay
	 */
	public int getToDayAsPrimitive()
	{
		return getToDayAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.toDay</code> attribute. 
	 * @param value the toDay - toDay
	 */
	public void setToDay(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TODAY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.toDay</code> attribute. 
	 * @param value the toDay - toDay
	 */
	public void setToDay(final Integer value)
	{
		setToDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.toDay</code> attribute. 
	 * @param value the toDay - toDay
	 */
	public void setToDay(final SessionContext ctx, final int value)
	{
		setToDay( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.toDay</code> attribute. 
	 * @param value the toDay - toDay
	 */
	public void setToDay(final int value)
	{
		setToDay( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.travelogixPolicyDetail</code> attribute.
	 * @return the travelogixPolicyDetail
	 */
	public TravelogixPolicyDetail getTravelogixPolicyDetail(final SessionContext ctx)
	{
		return (TravelogixPolicyDetail)getProperty( ctx, TRAVELOGIXPOLICYDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyDetail.travelogixPolicyDetail</code> attribute.
	 * @return the travelogixPolicyDetail
	 */
	public TravelogixPolicyDetail getTravelogixPolicyDetail()
	{
		return getTravelogixPolicyDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.travelogixPolicyDetail</code> attribute. 
	 * @param value the travelogixPolicyDetail
	 */
	public void setTravelogixPolicyDetail(final SessionContext ctx, final TravelogixPolicyDetail value)
	{
		TRAVELOGIXPOLICYDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyDetail.travelogixPolicyDetail</code> attribute. 
	 * @param value the travelogixPolicyDetail
	 */
	public void setTravelogixPolicyDetail(final TravelogixPolicyDetail value)
	{
		setTravelogixPolicyDetail( getSession().getSessionContext(), value );
	}
	
}
