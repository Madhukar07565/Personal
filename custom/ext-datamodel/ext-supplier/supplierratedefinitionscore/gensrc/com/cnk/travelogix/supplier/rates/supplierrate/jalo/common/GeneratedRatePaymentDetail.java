/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.PaymentTypeDetails;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RatePaymentDetail RatePaymentDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRatePaymentDetail extends GenericItem
{
	/** Qualifier of the <code>RatePaymentDetail.payablePercentage</code> attribute **/
	public static final String PAYABLEPERCENTAGE = "payablePercentage";
	/** Qualifier of the <code>RatePaymentDetail.settlementSchedule</code> attribute **/
	public static final String SETTLEMENTSCHEDULE = "settlementSchedule";
	/** Qualifier of the <code>RatePaymentDetail.guranteeRequired</code> attribute **/
	public static final String GURANTEEREQUIRED = "guranteeRequired";
	/** Qualifier of the <code>RatePaymentDetail.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>RatePaymentDetail.paymentTypeDetails</code> attribute **/
	public static final String PAYMENTTYPEDETAILS = "paymentTypeDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PAYMENTTYPEDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRatePaymentDetail> PAYMENTTYPEDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedRatePaymentDetail>(
	SupplierratedefinitionscoreConstants.TC.RATEPAYMENTDETAIL,
	false,
	"paymentTypeDetails",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAYABLEPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(SETTLEMENTSCHEDULE, AttributeMode.INITIAL);
		tmp.put(GURANTEEREQUIRED, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(PAYMENTTYPEDETAILS, AttributeMode.INITIAL);
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
		PAYMENTTYPEDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.guranteeRequired</code> attribute.
	 * @return the guranteeRequired
	 */
	public Boolean isGuranteeRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, GURANTEEREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.guranteeRequired</code> attribute.
	 * @return the guranteeRequired
	 */
	public Boolean isGuranteeRequired()
	{
		return isGuranteeRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.guranteeRequired</code> attribute. 
	 * @return the guranteeRequired
	 */
	public boolean isGuranteeRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isGuranteeRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.guranteeRequired</code> attribute. 
	 * @return the guranteeRequired
	 */
	public boolean isGuranteeRequiredAsPrimitive()
	{
		return isGuranteeRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.guranteeRequired</code> attribute. 
	 * @param value the guranteeRequired
	 */
	public void setGuranteeRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, GURANTEEREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.guranteeRequired</code> attribute. 
	 * @param value the guranteeRequired
	 */
	public void setGuranteeRequired(final Boolean value)
	{
		setGuranteeRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.guranteeRequired</code> attribute. 
	 * @param value the guranteeRequired
	 */
	public void setGuranteeRequired(final SessionContext ctx, final boolean value)
	{
		setGuranteeRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.guranteeRequired</code> attribute. 
	 * @param value the guranteeRequired
	 */
	public void setGuranteeRequired(final boolean value)
	{
		setGuranteeRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.payablePercentage</code> attribute.
	 * @return the payablePercentage
	 */
	public Double getPayablePercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PAYABLEPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.payablePercentage</code> attribute.
	 * @return the payablePercentage
	 */
	public Double getPayablePercentage()
	{
		return getPayablePercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.payablePercentage</code> attribute. 
	 * @return the payablePercentage
	 */
	public double getPayablePercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getPayablePercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.payablePercentage</code> attribute. 
	 * @return the payablePercentage
	 */
	public double getPayablePercentageAsPrimitive()
	{
		return getPayablePercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.payablePercentage</code> attribute. 
	 * @param value the payablePercentage
	 */
	public void setPayablePercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PAYABLEPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.payablePercentage</code> attribute. 
	 * @param value the payablePercentage
	 */
	public void setPayablePercentage(final Double value)
	{
		setPayablePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.payablePercentage</code> attribute. 
	 * @param value the payablePercentage
	 */
	public void setPayablePercentage(final SessionContext ctx, final double value)
	{
		setPayablePercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.payablePercentage</code> attribute. 
	 * @param value the payablePercentage
	 */
	public void setPayablePercentage(final double value)
	{
		setPayablePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.paymentTypeDetails</code> attribute.
	 * @return the paymentTypeDetails
	 */
	public PaymentTypeDetails getPaymentTypeDetails(final SessionContext ctx)
	{
		return (PaymentTypeDetails)getProperty( ctx, PAYMENTTYPEDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.paymentTypeDetails</code> attribute.
	 * @return the paymentTypeDetails
	 */
	public PaymentTypeDetails getPaymentTypeDetails()
	{
		return getPaymentTypeDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.paymentTypeDetails</code> attribute. 
	 * @param value the paymentTypeDetails
	 */
	public void setPaymentTypeDetails(final SessionContext ctx, final PaymentTypeDetails value)
	{
		PAYMENTTYPEDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.paymentTypeDetails</code> attribute. 
	 * @param value the paymentTypeDetails
	 */
	public void setPaymentTypeDetails(final PaymentTypeDetails value)
	{
		setPaymentTypeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.settlementSchedule</code> attribute.
	 * @return the settlementSchedule
	 */
	public EnumerationValue getSettlementSchedule(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SETTLEMENTSCHEDULE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RatePaymentDetail.settlementSchedule</code> attribute.
	 * @return the settlementSchedule
	 */
	public EnumerationValue getSettlementSchedule()
	{
		return getSettlementSchedule( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.settlementSchedule</code> attribute. 
	 * @param value the settlementSchedule
	 */
	public void setSettlementSchedule(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SETTLEMENTSCHEDULE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RatePaymentDetail.settlementSchedule</code> attribute. 
	 * @param value the settlementSchedule
	 */
	public void setSettlementSchedule(final EnumerationValue value)
	{
		setSettlementSchedule( getSession().getSessionContext(), value );
	}
	
}
