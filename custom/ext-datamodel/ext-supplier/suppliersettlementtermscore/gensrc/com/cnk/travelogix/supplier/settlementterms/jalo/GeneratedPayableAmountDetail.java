/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.NoCreditPrePaymentCommSettlement;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.PayableAmountDetail PayableAmountDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPayableAmountDetail extends GenericItem
{
	/** Qualifier of the <code>PayableAmountDetail.paymentType</code> attribute **/
	public static final String PAYMENTTYPE = "paymentType";
	/** Qualifier of the <code>PayableAmountDetail.settlementSchedule</code> attribute **/
	public static final String SETTLEMENTSCHEDULE = "settlementSchedule";
	/** Qualifier of the <code>PayableAmountDetail.noOfDays</code> attribute **/
	public static final String NOOFDAYS = "noOfDays";
	/** Qualifier of the <code>PayableAmountDetail.percent</code> attribute **/
	public static final String PERCENT = "percent";
	/** Qualifier of the <code>PayableAmountDetail.noCreditPrePaymentCommSettlement</code> attribute **/
	public static final String NOCREDITPREPAYMENTCOMMSETTLEMENT = "noCreditPrePaymentCommSettlement";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n NOCREDITPREPAYMENTCOMMSETTLEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPayableAmountDetail> NOCREDITPREPAYMENTCOMMSETTLEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedPayableAmountDetail>(
	SuppliersettlementtermscoreConstants.TC.PAYABLEAMOUNTDETAIL,
	false,
	"noCreditPrePaymentCommSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAYMENTTYPE, AttributeMode.INITIAL);
		tmp.put(SETTLEMENTSCHEDULE, AttributeMode.INITIAL);
		tmp.put(NOOFDAYS, AttributeMode.INITIAL);
		tmp.put(PERCENT, AttributeMode.INITIAL);
		tmp.put(NOCREDITPREPAYMENTCOMMSETTLEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		NOCREDITPREPAYMENTCOMMSETTLEMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.noCreditPrePaymentCommSettlement</code> attribute.
	 * @return the noCreditPrePaymentCommSettlement
	 */
	public NoCreditPrePaymentCommSettlement getNoCreditPrePaymentCommSettlement(final SessionContext ctx)
	{
		return (NoCreditPrePaymentCommSettlement)getProperty( ctx, NOCREDITPREPAYMENTCOMMSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.noCreditPrePaymentCommSettlement</code> attribute.
	 * @return the noCreditPrePaymentCommSettlement
	 */
	public NoCreditPrePaymentCommSettlement getNoCreditPrePaymentCommSettlement()
	{
		return getNoCreditPrePaymentCommSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.noCreditPrePaymentCommSettlement</code> attribute. 
	 * @param value the noCreditPrePaymentCommSettlement
	 */
	public void setNoCreditPrePaymentCommSettlement(final SessionContext ctx, final NoCreditPrePaymentCommSettlement value)
	{
		NOCREDITPREPAYMENTCOMMSETTLEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.noCreditPrePaymentCommSettlement</code> attribute. 
	 * @param value the noCreditPrePaymentCommSettlement
	 */
	public void setNoCreditPrePaymentCommSettlement(final NoCreditPrePaymentCommSettlement value)
	{
		setNoCreditPrePaymentCommSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.noOfDays</code> attribute.
	 * @return the noOfDays
	 */
	public Integer getNoOfDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.noOfDays</code> attribute.
	 * @return the noOfDays
	 */
	public Integer getNoOfDays()
	{
		return getNoOfDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.noOfDays</code> attribute. 
	 * @return the noOfDays
	 */
	public int getNoOfDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.noOfDays</code> attribute. 
	 * @return the noOfDays
	 */
	public int getNoOfDaysAsPrimitive()
	{
		return getNoOfDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.noOfDays</code> attribute. 
	 * @param value the noOfDays
	 */
	public void setNoOfDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.noOfDays</code> attribute. 
	 * @param value the noOfDays
	 */
	public void setNoOfDays(final Integer value)
	{
		setNoOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.noOfDays</code> attribute. 
	 * @param value the noOfDays
	 */
	public void setNoOfDays(final SessionContext ctx, final int value)
	{
		setNoOfDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.noOfDays</code> attribute. 
	 * @param value the noOfDays
	 */
	public void setNoOfDays(final int value)
	{
		setNoOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.paymentType</code> attribute.
	 * @return the paymentType
	 */
	public EnumerationValue getPaymentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.paymentType</code> attribute.
	 * @return the paymentType
	 */
	public EnumerationValue getPaymentType()
	{
		return getPaymentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.paymentType</code> attribute. 
	 * @param value the paymentType
	 */
	public void setPaymentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.paymentType</code> attribute. 
	 * @param value the paymentType
	 */
	public void setPaymentType(final EnumerationValue value)
	{
		setPaymentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.percent</code> attribute.
	 * @return the percent
	 */
	public Integer getPercent(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PERCENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.percent</code> attribute.
	 * @return the percent
	 */
	public Integer getPercent()
	{
		return getPercent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.percent</code> attribute. 
	 * @return the percent
	 */
	public int getPercentAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPercent( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.percent</code> attribute. 
	 * @return the percent
	 */
	public int getPercentAsPrimitive()
	{
		return getPercentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.percent</code> attribute. 
	 * @param value the percent
	 */
	public void setPercent(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PERCENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.percent</code> attribute. 
	 * @param value the percent
	 */
	public void setPercent(final Integer value)
	{
		setPercent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.percent</code> attribute. 
	 * @param value the percent
	 */
	public void setPercent(final SessionContext ctx, final int value)
	{
		setPercent( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.percent</code> attribute. 
	 * @param value the percent
	 */
	public void setPercent(final int value)
	{
		setPercent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.settlementSchedule</code> attribute.
	 * @return the settlementSchedule
	 */
	public EnumerationValue getSettlementSchedule(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SETTLEMENTSCHEDULE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PayableAmountDetail.settlementSchedule</code> attribute.
	 * @return the settlementSchedule
	 */
	public EnumerationValue getSettlementSchedule()
	{
		return getSettlementSchedule( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.settlementSchedule</code> attribute. 
	 * @param value the settlementSchedule
	 */
	public void setSettlementSchedule(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SETTLEMENTSCHEDULE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PayableAmountDetail.settlementSchedule</code> attribute. 
	 * @param value the settlementSchedule
	 */
	public void setSettlementSchedule(final EnumerationValue value)
	{
		setSettlementSchedule( getSession().getSessionContext(), value );
	}
	
}
