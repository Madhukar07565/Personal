/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.serviceorder.jalo;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.serviceorder.jalo.PaymentAdvice;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.serviceorder.jalo.PaymentDetails PaymentDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentDetails extends GenericItem
{
	/** Qualifier of the <code>PaymentDetails.paymentAdvice</code> attribute **/
	public static final String PAYMENTADVICE = "paymentAdvice";
	/** Qualifier of the <code>PaymentDetails.remittanceCurrency</code> attribute **/
	public static final String REMITTANCECURRENCY = "remittanceCurrency";
	/** Qualifier of the <code>PaymentDetails.roe</code> attribute **/
	public static final String ROE = "roe";
	/** Qualifier of the <code>PaymentDetails.amountToBeRemitted</code> attribute **/
	public static final String AMOUNTTOBEREMITTED = "amountToBeRemitted";
	/** Qualifier of the <code>PaymentDetails.remittanceCharges</code> attribute **/
	public static final String REMITTANCECHARGES = "remittanceCharges";
	/** Qualifier of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute **/
	public static final String TOTALAMOUNTTOBEREMITTED = "totalAmountToBeRemitted";
	/** Qualifier of the <code>PaymentDetails.paymentTypeInfo</code> attribute **/
	public static final String PAYMENTTYPEINFO = "paymentTypeInfo";
	/** Qualifier of the <code>PaymentDetails.paymentReferenceNumber</code> attribute **/
	public static final String PAYMENTREFERENCENUMBER = "paymentReferenceNumber";
	/** Qualifier of the <code>PaymentDetails.sapReferenceNumber</code> attribute **/
	public static final String SAPREFERENCENUMBER = "sapReferenceNumber";
	/** Qualifier of the <code>PaymentDetails.dateOfPayment</code> attribute **/
	public static final String DATEOFPAYMENT = "dateOfPayment";
	/** Qualifier of the <code>PaymentDetails.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAYMENTADVICE, AttributeMode.INITIAL);
		tmp.put(REMITTANCECURRENCY, AttributeMode.INITIAL);
		tmp.put(ROE, AttributeMode.INITIAL);
		tmp.put(AMOUNTTOBEREMITTED, AttributeMode.INITIAL);
		tmp.put(REMITTANCECHARGES, AttributeMode.INITIAL);
		tmp.put(TOTALAMOUNTTOBEREMITTED, AttributeMode.INITIAL);
		tmp.put(PAYMENTTYPEINFO, AttributeMode.INITIAL);
		tmp.put(PAYMENTREFERENCENUMBER, AttributeMode.INITIAL);
		tmp.put(SAPREFERENCENUMBER, AttributeMode.INITIAL);
		tmp.put(DATEOFPAYMENT, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.amountToBeRemitted</code> attribute.
	 * @return the amountToBeRemitted
	 */
	public Double getAmountToBeRemitted(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNTTOBEREMITTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.amountToBeRemitted</code> attribute.
	 * @return the amountToBeRemitted
	 */
	public Double getAmountToBeRemitted()
	{
		return getAmountToBeRemitted( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.amountToBeRemitted</code> attribute. 
	 * @return the amountToBeRemitted
	 */
	public double getAmountToBeRemittedAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmountToBeRemitted( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.amountToBeRemitted</code> attribute. 
	 * @return the amountToBeRemitted
	 */
	public double getAmountToBeRemittedAsPrimitive()
	{
		return getAmountToBeRemittedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.amountToBeRemitted</code> attribute. 
	 * @param value the amountToBeRemitted
	 */
	public void setAmountToBeRemitted(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNTTOBEREMITTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.amountToBeRemitted</code> attribute. 
	 * @param value the amountToBeRemitted
	 */
	public void setAmountToBeRemitted(final Double value)
	{
		setAmountToBeRemitted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.amountToBeRemitted</code> attribute. 
	 * @param value the amountToBeRemitted
	 */
	public void setAmountToBeRemitted(final SessionContext ctx, final double value)
	{
		setAmountToBeRemitted( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.amountToBeRemitted</code> attribute. 
	 * @param value the amountToBeRemitted
	 */
	public void setAmountToBeRemitted(final double value)
	{
		setAmountToBeRemitted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.dateOfPayment</code> attribute.
	 * @return the dateOfPayment
	 */
	public Date getDateOfPayment(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.dateOfPayment</code> attribute.
	 * @return the dateOfPayment
	 */
	public Date getDateOfPayment()
	{
		return getDateOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.dateOfPayment</code> attribute. 
	 * @param value the dateOfPayment
	 */
	public void setDateOfPayment(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.dateOfPayment</code> attribute. 
	 * @param value the dateOfPayment
	 */
	public void setDateOfPayment(final Date value)
	{
		setDateOfPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.paymentAdvice</code> attribute.
	 * @return the paymentAdvice
	 */
	public PaymentAdvice getPaymentAdvice(final SessionContext ctx)
	{
		return (PaymentAdvice)getProperty( ctx, PAYMENTADVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.paymentAdvice</code> attribute.
	 * @return the paymentAdvice
	 */
	public PaymentAdvice getPaymentAdvice()
	{
		return getPaymentAdvice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.paymentAdvice</code> attribute. 
	 * @param value the paymentAdvice
	 */
	public void setPaymentAdvice(final SessionContext ctx, final PaymentAdvice value)
	{
		setProperty(ctx, PAYMENTADVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.paymentAdvice</code> attribute. 
	 * @param value the paymentAdvice
	 */
	public void setPaymentAdvice(final PaymentAdvice value)
	{
		setPaymentAdvice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.paymentReferenceNumber</code> attribute.
	 * @return the paymentReferenceNumber
	 */
	public String getPaymentReferenceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTREFERENCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.paymentReferenceNumber</code> attribute.
	 * @return the paymentReferenceNumber
	 */
	public String getPaymentReferenceNumber()
	{
		return getPaymentReferenceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.paymentReferenceNumber</code> attribute. 
	 * @param value the paymentReferenceNumber
	 */
	public void setPaymentReferenceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTREFERENCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.paymentReferenceNumber</code> attribute. 
	 * @param value the paymentReferenceNumber
	 */
	public void setPaymentReferenceNumber(final String value)
	{
		setPaymentReferenceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.paymentTypeInfo</code> attribute.
	 * @return the paymentTypeInfo
	 */
	public PaymentInfo getPaymentTypeInfo(final SessionContext ctx)
	{
		return (PaymentInfo)getProperty( ctx, PAYMENTTYPEINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.paymentTypeInfo</code> attribute.
	 * @return the paymentTypeInfo
	 */
	public PaymentInfo getPaymentTypeInfo()
	{
		return getPaymentTypeInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.paymentTypeInfo</code> attribute. 
	 * @param value the paymentTypeInfo
	 */
	public void setPaymentTypeInfo(final SessionContext ctx, final PaymentInfo value)
	{
		setProperty(ctx, PAYMENTTYPEINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.paymentTypeInfo</code> attribute. 
	 * @param value the paymentTypeInfo
	 */
	public void setPaymentTypeInfo(final PaymentInfo value)
	{
		setPaymentTypeInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.remittanceCharges</code> attribute.
	 * @return the remittanceCharges
	 */
	public Double getRemittanceCharges(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, REMITTANCECHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.remittanceCharges</code> attribute.
	 * @return the remittanceCharges
	 */
	public Double getRemittanceCharges()
	{
		return getRemittanceCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.remittanceCharges</code> attribute. 
	 * @return the remittanceCharges
	 */
	public double getRemittanceChargesAsPrimitive(final SessionContext ctx)
	{
		Double value = getRemittanceCharges( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.remittanceCharges</code> attribute. 
	 * @return the remittanceCharges
	 */
	public double getRemittanceChargesAsPrimitive()
	{
		return getRemittanceChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.remittanceCharges</code> attribute. 
	 * @param value the remittanceCharges
	 */
	public void setRemittanceCharges(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, REMITTANCECHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.remittanceCharges</code> attribute. 
	 * @param value the remittanceCharges
	 */
	public void setRemittanceCharges(final Double value)
	{
		setRemittanceCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.remittanceCharges</code> attribute. 
	 * @param value the remittanceCharges
	 */
	public void setRemittanceCharges(final SessionContext ctx, final double value)
	{
		setRemittanceCharges( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.remittanceCharges</code> attribute. 
	 * @param value the remittanceCharges
	 */
	public void setRemittanceCharges(final double value)
	{
		setRemittanceCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.remittanceCurrency</code> attribute.
	 * @return the remittanceCurrency
	 */
	public Currency getRemittanceCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, REMITTANCECURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.remittanceCurrency</code> attribute.
	 * @return the remittanceCurrency
	 */
	public Currency getRemittanceCurrency()
	{
		return getRemittanceCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.remittanceCurrency</code> attribute. 
	 * @param value the remittanceCurrency
	 */
	public void setRemittanceCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, REMITTANCECURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.remittanceCurrency</code> attribute. 
	 * @param value the remittanceCurrency
	 */
	public void setRemittanceCurrency(final Currency value)
	{
		setRemittanceCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.roe</code> attribute.
	 * @return the roe
	 */
	public Double getRoe(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ROE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.roe</code> attribute.
	 * @return the roe
	 */
	public Double getRoe()
	{
		return getRoe( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.roe</code> attribute. 
	 * @return the roe
	 */
	public double getRoeAsPrimitive(final SessionContext ctx)
	{
		Double value = getRoe( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.roe</code> attribute. 
	 * @return the roe
	 */
	public double getRoeAsPrimitive()
	{
		return getRoeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ROE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final Double value)
	{
		setRoe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final SessionContext ctx, final double value)
	{
		setRoe( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final double value)
	{
		setRoe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.sapReferenceNumber</code> attribute.
	 * @return the sapReferenceNumber
	 */
	public String getSapReferenceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPREFERENCENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.sapReferenceNumber</code> attribute.
	 * @return the sapReferenceNumber
	 */
	public String getSapReferenceNumber()
	{
		return getSapReferenceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.sapReferenceNumber</code> attribute. 
	 * @param value the sapReferenceNumber
	 */
	public void setSapReferenceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPREFERENCENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.sapReferenceNumber</code> attribute. 
	 * @param value the sapReferenceNumber
	 */
	public void setSapReferenceNumber(final String value)
	{
		setSapReferenceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute.
	 * @return the totalAmountToBeRemitted
	 */
	public Double getTotalAmountToBeRemitted(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALAMOUNTTOBEREMITTED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute.
	 * @return the totalAmountToBeRemitted
	 */
	public Double getTotalAmountToBeRemitted()
	{
		return getTotalAmountToBeRemitted( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute. 
	 * @return the totalAmountToBeRemitted
	 */
	public double getTotalAmountToBeRemittedAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalAmountToBeRemitted( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute. 
	 * @return the totalAmountToBeRemitted
	 */
	public double getTotalAmountToBeRemittedAsPrimitive()
	{
		return getTotalAmountToBeRemittedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute. 
	 * @param value the totalAmountToBeRemitted
	 */
	public void setTotalAmountToBeRemitted(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALAMOUNTTOBEREMITTED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute. 
	 * @param value the totalAmountToBeRemitted
	 */
	public void setTotalAmountToBeRemitted(final Double value)
	{
		setTotalAmountToBeRemitted( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute. 
	 * @param value the totalAmountToBeRemitted
	 */
	public void setTotalAmountToBeRemitted(final SessionContext ctx, final double value)
	{
		setTotalAmountToBeRemitted( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetails.totalAmountToBeRemitted</code> attribute. 
	 * @param value the totalAmountToBeRemitted
	 */
	public void setTotalAmountToBeRemitted(final double value)
	{
		setTotalAmountToBeRemitted( getSession().getSessionContext(), value );
	}
	
}
