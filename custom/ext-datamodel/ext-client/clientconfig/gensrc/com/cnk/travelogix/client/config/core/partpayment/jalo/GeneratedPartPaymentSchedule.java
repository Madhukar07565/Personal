/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.partpayment.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentMasterConfig;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentSchedule PartPaymentSchedule}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPartPaymentSchedule extends GenericItem
{
	/** Qualifier of the <code>PartPaymentSchedule.billingAmountFrom</code> attribute **/
	public static final String BILLINGAMOUNTFROM = "billingAmountFrom";
	/** Qualifier of the <code>PartPaymentSchedule.billingAmountTo</code> attribute **/
	public static final String BILLINGAMOUNTTO = "billingAmountTo";
	/** Qualifier of the <code>PartPaymentSchedule.billingAmountOn</code> attribute **/
	public static final String BILLINGAMOUNTON = "billingAmountOn";
	/** Qualifier of the <code>PartPaymentSchedule.paymentScheduleType</code> attribute **/
	public static final String PAYMENTSCHEDULETYPE = "paymentScheduleType";
	/** Qualifier of the <code>PartPaymentSchedule.refundable</code> attribute **/
	public static final String REFUNDABLE = "refundable";
	/** Qualifier of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute **/
	public static final String DEPOSITINCLUDESWITHFLIGHT = "depositIncludesWithFlight";
	/** Qualifier of the <code>PartPaymentSchedule.days</code> attribute **/
	public static final String DAYS = "days";
	/** Qualifier of the <code>PartPaymentSchedule.paymentDueDateCriteria</code> attribute **/
	public static final String PAYMENTDUEDATECRITERIA = "paymentDueDateCriteria";
	/** Qualifier of the <code>PartPaymentSchedule.hours</code> attribute **/
	public static final String HOURS = "hours";
	/** Qualifier of the <code>PartPaymentSchedule.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>PartPaymentSchedule.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>PartPaymentSchedule.percentageValue</code> attribute **/
	public static final String PERCENTAGEVALUE = "percentageValue";
	/** Qualifier of the <code>PartPaymentSchedule.priceComponent</code> attribute **/
	public static final String PRICECOMPONENT = "priceComponent";
	/** Qualifier of the <code>PartPaymentSchedule.applyLowerValue</code> attribute **/
	public static final String APPLYLOWERVALUE = "applyLowerValue";
	/** Qualifier of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute **/
	public static final String SUPPLIERCANCELLATIONCHARGES = "supplierCancellationCharges";
	/** Qualifier of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute **/
	public static final String COMPANYCANCELLATIONCHARGES = "companyCancellationCharges";
	/** Qualifier of the <code>PartPaymentSchedule.partPaymentMasterConfig</code> attribute **/
	public static final String PARTPAYMENTMASTERCONFIG = "partPaymentMasterConfig";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PARTPAYMENTMASTERCONFIG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPartPaymentSchedule> PARTPAYMENTMASTERCONFIGHANDLER = new BidirectionalOneToManyHandler<GeneratedPartPaymentSchedule>(
	ClientconfigConstants.TC.PARTPAYMENTSCHEDULE,
	false,
	"partPaymentMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BILLINGAMOUNTFROM, AttributeMode.INITIAL);
		tmp.put(BILLINGAMOUNTTO, AttributeMode.INITIAL);
		tmp.put(BILLINGAMOUNTON, AttributeMode.INITIAL);
		tmp.put(PAYMENTSCHEDULETYPE, AttributeMode.INITIAL);
		tmp.put(REFUNDABLE, AttributeMode.INITIAL);
		tmp.put(DEPOSITINCLUDESWITHFLIGHT, AttributeMode.INITIAL);
		tmp.put(DAYS, AttributeMode.INITIAL);
		tmp.put(PAYMENTDUEDATECRITERIA, AttributeMode.INITIAL);
		tmp.put(HOURS, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(PERCENTAGEVALUE, AttributeMode.INITIAL);
		tmp.put(PRICECOMPONENT, AttributeMode.INITIAL);
		tmp.put(APPLYLOWERVALUE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCANCELLATIONCHARGES, AttributeMode.INITIAL);
		tmp.put(COMPANYCANCELLATIONCHARGES, AttributeMode.INITIAL);
		tmp.put(PARTPAYMENTMASTERCONFIG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.applyLowerValue</code> attribute.
	 * @return the applyLowerValue
	 */
	public Boolean isApplyLowerValue(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPLYLOWERVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.applyLowerValue</code> attribute.
	 * @return the applyLowerValue
	 */
	public Boolean isApplyLowerValue()
	{
		return isApplyLowerValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.applyLowerValue</code> attribute. 
	 * @return the applyLowerValue
	 */
	public boolean isApplyLowerValueAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isApplyLowerValue( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.applyLowerValue</code> attribute. 
	 * @return the applyLowerValue
	 */
	public boolean isApplyLowerValueAsPrimitive()
	{
		return isApplyLowerValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.applyLowerValue</code> attribute. 
	 * @param value the applyLowerValue
	 */
	public void setApplyLowerValue(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPLYLOWERVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.applyLowerValue</code> attribute. 
	 * @param value the applyLowerValue
	 */
	public void setApplyLowerValue(final Boolean value)
	{
		setApplyLowerValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.applyLowerValue</code> attribute. 
	 * @param value the applyLowerValue
	 */
	public void setApplyLowerValue(final SessionContext ctx, final boolean value)
	{
		setApplyLowerValue( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.applyLowerValue</code> attribute. 
	 * @param value the applyLowerValue
	 */
	public void setApplyLowerValue(final boolean value)
	{
		setApplyLowerValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.billingAmountFrom</code> attribute.
	 * @return the billingAmountFrom
	 */
	public String getBillingAmountFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLINGAMOUNTFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.billingAmountFrom</code> attribute.
	 * @return the billingAmountFrom
	 */
	public String getBillingAmountFrom()
	{
		return getBillingAmountFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.billingAmountFrom</code> attribute. 
	 * @param value the billingAmountFrom
	 */
	public void setBillingAmountFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLINGAMOUNTFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.billingAmountFrom</code> attribute. 
	 * @param value the billingAmountFrom
	 */
	public void setBillingAmountFrom(final String value)
	{
		setBillingAmountFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.billingAmountOn</code> attribute.
	 * @return the billingAmountOn
	 */
	public EnumerationValue getBillingAmountOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BILLINGAMOUNTON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.billingAmountOn</code> attribute.
	 * @return the billingAmountOn
	 */
	public EnumerationValue getBillingAmountOn()
	{
		return getBillingAmountOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.billingAmountOn</code> attribute. 
	 * @param value the billingAmountOn
	 */
	public void setBillingAmountOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BILLINGAMOUNTON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.billingAmountOn</code> attribute. 
	 * @param value the billingAmountOn
	 */
	public void setBillingAmountOn(final EnumerationValue value)
	{
		setBillingAmountOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.billingAmountTo</code> attribute.
	 * @return the billingAmountTo
	 */
	public String getBillingAmountTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BILLINGAMOUNTTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.billingAmountTo</code> attribute.
	 * @return the billingAmountTo
	 */
	public String getBillingAmountTo()
	{
		return getBillingAmountTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.billingAmountTo</code> attribute. 
	 * @param value the billingAmountTo
	 */
	public void setBillingAmountTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BILLINGAMOUNTTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.billingAmountTo</code> attribute. 
	 * @param value the billingAmountTo
	 */
	public void setBillingAmountTo(final String value)
	{
		setBillingAmountTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute.
	 * @return the companyCancellationCharges
	 */
	public Boolean isCompanyCancellationCharges(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMPANYCANCELLATIONCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute.
	 * @return the companyCancellationCharges
	 */
	public Boolean isCompanyCancellationCharges()
	{
		return isCompanyCancellationCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute. 
	 * @return the companyCancellationCharges
	 */
	public boolean isCompanyCancellationChargesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCompanyCancellationCharges( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute. 
	 * @return the companyCancellationCharges
	 */
	public boolean isCompanyCancellationChargesAsPrimitive()
	{
		return isCompanyCancellationChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute. 
	 * @param value the companyCancellationCharges
	 */
	public void setCompanyCancellationCharges(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMPANYCANCELLATIONCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute. 
	 * @param value the companyCancellationCharges
	 */
	public void setCompanyCancellationCharges(final Boolean value)
	{
		setCompanyCancellationCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute. 
	 * @param value the companyCancellationCharges
	 */
	public void setCompanyCancellationCharges(final SessionContext ctx, final boolean value)
	{
		setCompanyCancellationCharges( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.companyCancellationCharges</code> attribute. 
	 * @param value the companyCancellationCharges
	 */
	public void setCompanyCancellationCharges(final boolean value)
	{
		setCompanyCancellationCharges( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PARTPAYMENTMASTERCONFIGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.days</code> attribute.
	 * @return the days
	 */
	public String getDays(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.days</code> attribute.
	 * @return the days
	 */
	public String getDays()
	{
		return getDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final String value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute.
	 * @return the depositIncludesWithFlight
	 */
	public Boolean isDepositIncludesWithFlight(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DEPOSITINCLUDESWITHFLIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute.
	 * @return the depositIncludesWithFlight
	 */
	public Boolean isDepositIncludesWithFlight()
	{
		return isDepositIncludesWithFlight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute. 
	 * @return the depositIncludesWithFlight
	 */
	public boolean isDepositIncludesWithFlightAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDepositIncludesWithFlight( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute. 
	 * @return the depositIncludesWithFlight
	 */
	public boolean isDepositIncludesWithFlightAsPrimitive()
	{
		return isDepositIncludesWithFlightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute. 
	 * @param value the depositIncludesWithFlight
	 */
	public void setDepositIncludesWithFlight(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DEPOSITINCLUDESWITHFLIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute. 
	 * @param value the depositIncludesWithFlight
	 */
	public void setDepositIncludesWithFlight(final Boolean value)
	{
		setDepositIncludesWithFlight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute. 
	 * @param value the depositIncludesWithFlight
	 */
	public void setDepositIncludesWithFlight(final SessionContext ctx, final boolean value)
	{
		setDepositIncludesWithFlight( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.depositIncludesWithFlight</code> attribute. 
	 * @param value the depositIncludesWithFlight
	 */
	public void setDepositIncludesWithFlight(final boolean value)
	{
		setDepositIncludesWithFlight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.hours</code> attribute.
	 * @return the hours
	 */
	public String getHours(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.hours</code> attribute.
	 * @return the hours
	 */
	public String getHours()
	{
		return getHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.hours</code> attribute. 
	 * @param value the hours
	 */
	public void setHours(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.hours</code> attribute. 
	 * @param value the hours
	 */
	public void setHours(final String value)
	{
		setHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.partPaymentMasterConfig</code> attribute.
	 * @return the partPaymentMasterConfig
	 */
	public PartPaymentMasterConfig getPartPaymentMasterConfig(final SessionContext ctx)
	{
		return (PartPaymentMasterConfig)getProperty( ctx, PARTPAYMENTMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.partPaymentMasterConfig</code> attribute.
	 * @return the partPaymentMasterConfig
	 */
	public PartPaymentMasterConfig getPartPaymentMasterConfig()
	{
		return getPartPaymentMasterConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.partPaymentMasterConfig</code> attribute. 
	 * @param value the partPaymentMasterConfig
	 */
	public void setPartPaymentMasterConfig(final SessionContext ctx, final PartPaymentMasterConfig value)
	{
		PARTPAYMENTMASTERCONFIGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.partPaymentMasterConfig</code> attribute. 
	 * @param value the partPaymentMasterConfig
	 */
	public void setPartPaymentMasterConfig(final PartPaymentMasterConfig value)
	{
		setPartPaymentMasterConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.paymentDueDateCriteria</code> attribute.
	 * @return the paymentDueDateCriteria
	 */
	public EnumerationValue getPaymentDueDateCriteria(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTDUEDATECRITERIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.paymentDueDateCriteria</code> attribute.
	 * @return the paymentDueDateCriteria
	 */
	public EnumerationValue getPaymentDueDateCriteria()
	{
		return getPaymentDueDateCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.paymentDueDateCriteria</code> attribute. 
	 * @param value the paymentDueDateCriteria
	 */
	public void setPaymentDueDateCriteria(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTDUEDATECRITERIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.paymentDueDateCriteria</code> attribute. 
	 * @param value the paymentDueDateCriteria
	 */
	public void setPaymentDueDateCriteria(final EnumerationValue value)
	{
		setPaymentDueDateCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.paymentScheduleType</code> attribute.
	 * @return the paymentScheduleType
	 */
	public EnumerationValue getPaymentScheduleType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTSCHEDULETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.paymentScheduleType</code> attribute.
	 * @return the paymentScheduleType
	 */
	public EnumerationValue getPaymentScheduleType()
	{
		return getPaymentScheduleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.paymentScheduleType</code> attribute. 
	 * @param value the paymentScheduleType
	 */
	public void setPaymentScheduleType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTSCHEDULETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.paymentScheduleType</code> attribute. 
	 * @param value the paymentScheduleType
	 */
	public void setPaymentScheduleType(final EnumerationValue value)
	{
		setPaymentScheduleType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.percentageValue</code> attribute.
	 * @return the percentageValue
	 */
	public Double getPercentageValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGEVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.percentageValue</code> attribute.
	 * @return the percentageValue
	 */
	public Double getPercentageValue()
	{
		return getPercentageValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.percentageValue</code> attribute. 
	 * @return the percentageValue
	 */
	public double getPercentageValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentageValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.percentageValue</code> attribute. 
	 * @return the percentageValue
	 */
	public double getPercentageValueAsPrimitive()
	{
		return getPercentageValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.percentageValue</code> attribute. 
	 * @param value the percentageValue
	 */
	public void setPercentageValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGEVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.percentageValue</code> attribute. 
	 * @param value the percentageValue
	 */
	public void setPercentageValue(final Double value)
	{
		setPercentageValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.percentageValue</code> attribute. 
	 * @param value the percentageValue
	 */
	public void setPercentageValue(final SessionContext ctx, final double value)
	{
		setPercentageValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.percentageValue</code> attribute. 
	 * @param value the percentageValue
	 */
	public void setPercentageValue(final double value)
	{
		setPercentageValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public EnumerationValue getPriceComponent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public EnumerationValue getPriceComponent()
	{
		return getPriceComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final EnumerationValue value)
	{
		setPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REFUNDABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.refundable</code> attribute.
	 * @return the refundable
	 */
	public Boolean isRefundable()
	{
		return isRefundable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRefundable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.refundable</code> attribute. 
	 * @return the refundable
	 */
	public boolean isRefundableAsPrimitive()
	{
		return isRefundableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REFUNDABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final Boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final SessionContext ctx, final boolean value)
	{
		setRefundable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.refundable</code> attribute. 
	 * @param value the refundable
	 */
	public void setRefundable(final boolean value)
	{
		setRefundable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute.
	 * @return the supplierCancellationCharges
	 */
	public Boolean isSupplierCancellationCharges(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SUPPLIERCANCELLATIONCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute.
	 * @return the supplierCancellationCharges
	 */
	public Boolean isSupplierCancellationCharges()
	{
		return isSupplierCancellationCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute. 
	 * @return the supplierCancellationCharges
	 */
	public boolean isSupplierCancellationChargesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSupplierCancellationCharges( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute. 
	 * @return the supplierCancellationCharges
	 */
	public boolean isSupplierCancellationChargesAsPrimitive()
	{
		return isSupplierCancellationChargesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute. 
	 * @param value the supplierCancellationCharges
	 */
	public void setSupplierCancellationCharges(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SUPPLIERCANCELLATIONCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute. 
	 * @param value the supplierCancellationCharges
	 */
	public void setSupplierCancellationCharges(final Boolean value)
	{
		setSupplierCancellationCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute. 
	 * @param value the supplierCancellationCharges
	 */
	public void setSupplierCancellationCharges(final SessionContext ctx, final boolean value)
	{
		setSupplierCancellationCharges( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentSchedule.supplierCancellationCharges</code> attribute. 
	 * @param value the supplierCancellationCharges
	 */
	public void setSupplierCancellationCharges(final boolean value)
	{
		setSupplierCancellationCharges( getSession().getSessionContext(), value );
	}
	
}
