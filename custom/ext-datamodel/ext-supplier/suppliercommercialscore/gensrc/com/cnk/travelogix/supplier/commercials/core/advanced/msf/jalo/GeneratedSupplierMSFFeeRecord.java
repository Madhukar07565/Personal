/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.msf.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierMSFFeeCommercial;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.payment.PaymentMode;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.msf.jalo.SupplierMSFFeeRecord SupplierMSFFeeRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierMSFFeeRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>SupplierMSFFeeRecord.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>SupplierMSFFeeRecord.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>SupplierMSFFeeRecord.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute **/
	public static final String SERVICETAXAPPLIED = "serviceTaxApplied";
	/** Qualifier of the <code>SupplierMSFFeeRecord.transactionType</code> attribute **/
	public static final String TRANSACTIONTYPE = "transactionType";
	/** Qualifier of the <code>SupplierMSFFeeRecord.typeOfMSFCharges</code> attribute **/
	public static final String TYPEOFMSFCHARGES = "typeOfMSFCharges";
	/** Qualifier of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute **/
	public static final String PERCENTAGEVALUE = "percentageValue";
	/** Qualifier of the <code>SupplierMSFFeeRecord.amountValue</code> attribute **/
	public static final String AMOUNTVALUE = "amountValue";
	/** Qualifier of the <code>SupplierMSFFeeRecord.typesOfPayment</code> attribute **/
	public static final String TYPESOFPAYMENT = "typesOfPayment";
	/** Qualifier of the <code>SupplierMSFFeeRecord.cardTypes</code> attribute **/
	public static final String CARDTYPES = "cardTypes";
	/** Qualifier of the <code>SupplierMSFFeeRecord.msfeeCommercial</code> attribute **/
	public static final String MSFEECOMMERCIAL = "msfeeCommercial";
	/**
	* {@link OneToManyHandler} for handling 1:n TYPESOFPAYMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PaymentMode> TYPESOFPAYMENTHANDLER = new OneToManyHandler<PaymentMode>(
	CoreConstants.TC.PAYMENTMODE,
	false,
	"fees",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CARDTYPES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> CARDTYPESHANDLER = new OneToManyHandler<EnumerationValue>(
	CoreConstants.TC.CREDITCARDTYPE,
	false,
	"fees",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MSFEECOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierMSFFeeRecord> MSFEECOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierMSFFeeRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERMSFFEERECORD,
	false,
	"msfeeCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(SERVICETAXAPPLIED, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONTYPE, AttributeMode.INITIAL);
		tmp.put(TYPEOFMSFCHARGES, AttributeMode.INITIAL);
		tmp.put(PERCENTAGEVALUE, AttributeMode.INITIAL);
		tmp.put(AMOUNTVALUE, AttributeMode.INITIAL);
		tmp.put(MSFEECOMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.amount</code> attribute.
	 * @return the amount
	 */
	public Boolean isAmount(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.amount</code> attribute.
	 * @return the amount
	 */
	public Boolean isAmount()
	{
		return isAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.amount</code> attribute. 
	 * @return the amount
	 */
	public boolean isAmountAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAmount( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.amount</code> attribute. 
	 * @return the amount
	 */
	public boolean isAmountAsPrimitive()
	{
		return isAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Boolean value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final boolean value)
	{
		setAmount( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final boolean value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.amountValue</code> attribute.
	 * @return the amountValue
	 */
	public Double getAmountValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.amountValue</code> attribute.
	 * @return the amountValue
	 */
	public Double getAmountValue()
	{
		return getAmountValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.amountValue</code> attribute. 
	 * @return the amountValue
	 */
	public double getAmountValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmountValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.amountValue</code> attribute. 
	 * @return the amountValue
	 */
	public double getAmountValueAsPrimitive()
	{
		return getAmountValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.amountValue</code> attribute. 
	 * @param value the amountValue
	 */
	public void setAmountValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.amountValue</code> attribute. 
	 * @param value the amountValue
	 */
	public void setAmountValue(final Double value)
	{
		setAmountValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.amountValue</code> attribute. 
	 * @param value the amountValue
	 */
	public void setAmountValue(final SessionContext ctx, final double value)
	{
		setAmountValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.amountValue</code> attribute. 
	 * @param value the amountValue
	 */
	public void setAmountValue(final double value)
	{
		setAmountValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.cardTypes</code> attribute.
	 * @return the cardTypes
	 */
	public Set<EnumerationValue> getCardTypes(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)CARDTYPESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.cardTypes</code> attribute.
	 * @return the cardTypes
	 */
	public Set<EnumerationValue> getCardTypes()
	{
		return getCardTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.cardTypes</code> attribute. 
	 * @param value the cardTypes
	 */
	public void setCardTypes(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		CARDTYPESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.cardTypes</code> attribute. 
	 * @param value the cardTypes
	 */
	public void setCardTypes(final Set<EnumerationValue> value)
	{
		setCardTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cardTypes. 
	 * @param value the item to add to cardTypes
	 */
	public void addToCardTypes(final SessionContext ctx, final EnumerationValue value)
	{
		CARDTYPESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cardTypes. 
	 * @param value the item to add to cardTypes
	 */
	public void addToCardTypes(final EnumerationValue value)
	{
		addToCardTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cardTypes. 
	 * @param value the item to remove from cardTypes
	 */
	public void removeFromCardTypes(final SessionContext ctx, final EnumerationValue value)
	{
		CARDTYPESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cardTypes. 
	 * @param value the item to remove from cardTypes
	 */
	public void removeFromCardTypes(final EnumerationValue value)
	{
		removeFromCardTypes( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MSFEECOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.msfeeCommercial</code> attribute.
	 * @return the msfeeCommercial
	 */
	public SupplierMSFFeeCommercial getMsfeeCommercial(final SessionContext ctx)
	{
		return (SupplierMSFFeeCommercial)getProperty( ctx, MSFEECOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.msfeeCommercial</code> attribute.
	 * @return the msfeeCommercial
	 */
	public SupplierMSFFeeCommercial getMsfeeCommercial()
	{
		return getMsfeeCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.msfeeCommercial</code> attribute. 
	 * @param value the msfeeCommercial
	 */
	public void setMsfeeCommercial(final SessionContext ctx, final SupplierMSFFeeCommercial value)
	{
		MSFEECOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.msfeeCommercial</code> attribute. 
	 * @param value the msfeeCommercial
	 */
	public void setMsfeeCommercial(final SupplierMSFFeeCommercial value)
	{
		setMsfeeCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage()
	{
		return isPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPercentage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive()
	{
		return isPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final boolean value)
	{
		setPercentage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute.
	 * @return the percentageValue
	 */
	public Double getPercentageValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGEVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute.
	 * @return the percentageValue
	 */
	public Double getPercentageValue()
	{
		return getPercentageValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute. 
	 * @return the percentageValue
	 */
	public double getPercentageValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentageValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute. 
	 * @return the percentageValue
	 */
	public double getPercentageValueAsPrimitive()
	{
		return getPercentageValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute. 
	 * @param value the percentageValue
	 */
	public void setPercentageValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGEVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute. 
	 * @param value the percentageValue
	 */
	public void setPercentageValue(final Double value)
	{
		setPercentageValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute. 
	 * @param value the percentageValue
	 */
	public void setPercentageValue(final SessionContext ctx, final double value)
	{
		setPercentageValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.percentageValue</code> attribute. 
	 * @param value the percentageValue
	 */
	public void setPercentageValue(final double value)
	{
		setPercentageValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute.
	 * @return the serviceTaxApplied
	 */
	public Boolean isServiceTaxApplied(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SERVICETAXAPPLIED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute.
	 * @return the serviceTaxApplied
	 */
	public Boolean isServiceTaxApplied()
	{
		return isServiceTaxApplied( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute. 
	 * @return the serviceTaxApplied
	 */
	public boolean isServiceTaxAppliedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isServiceTaxApplied( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute. 
	 * @return the serviceTaxApplied
	 */
	public boolean isServiceTaxAppliedAsPrimitive()
	{
		return isServiceTaxAppliedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute. 
	 * @param value the serviceTaxApplied
	 */
	public void setServiceTaxApplied(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SERVICETAXAPPLIED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute. 
	 * @param value the serviceTaxApplied
	 */
	public void setServiceTaxApplied(final Boolean value)
	{
		setServiceTaxApplied( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute. 
	 * @param value the serviceTaxApplied
	 */
	public void setServiceTaxApplied(final SessionContext ctx, final boolean value)
	{
		setServiceTaxApplied( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.serviceTaxApplied</code> attribute. 
	 * @param value the serviceTaxApplied
	 */
	public void setServiceTaxApplied(final boolean value)
	{
		setServiceTaxApplied( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.transactionType</code> attribute.
	 * @return the transactionType
	 */
	public EnumerationValue getTransactionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRANSACTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.transactionType</code> attribute.
	 * @return the transactionType
	 */
	public EnumerationValue getTransactionType()
	{
		return getTransactionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.transactionType</code> attribute. 
	 * @param value the transactionType
	 */
	public void setTransactionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRANSACTIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.transactionType</code> attribute. 
	 * @param value the transactionType
	 */
	public void setTransactionType(final EnumerationValue value)
	{
		setTransactionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.typeOfMSFCharges</code> attribute.
	 * @return the typeOfMSFCharges
	 */
	public EnumerationValue getTypeOfMSFCharges(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFMSFCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.typeOfMSFCharges</code> attribute.
	 * @return the typeOfMSFCharges
	 */
	public EnumerationValue getTypeOfMSFCharges()
	{
		return getTypeOfMSFCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.typeOfMSFCharges</code> attribute. 
	 * @param value the typeOfMSFCharges
	 */
	public void setTypeOfMSFCharges(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFMSFCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.typeOfMSFCharges</code> attribute. 
	 * @param value the typeOfMSFCharges
	 */
	public void setTypeOfMSFCharges(final EnumerationValue value)
	{
		setTypeOfMSFCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.typesOfPayment</code> attribute.
	 * @return the typesOfPayment
	 */
	public Set<PaymentMode> getTypesOfPayment(final SessionContext ctx)
	{
		return (Set<PaymentMode>)TYPESOFPAYMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeRecord.typesOfPayment</code> attribute.
	 * @return the typesOfPayment
	 */
	public Set<PaymentMode> getTypesOfPayment()
	{
		return getTypesOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.typesOfPayment</code> attribute. 
	 * @param value the typesOfPayment
	 */
	public void setTypesOfPayment(final SessionContext ctx, final Set<PaymentMode> value)
	{
		TYPESOFPAYMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeRecord.typesOfPayment</code> attribute. 
	 * @param value the typesOfPayment
	 */
	public void setTypesOfPayment(final Set<PaymentMode> value)
	{
		setTypesOfPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to typesOfPayment. 
	 * @param value the item to add to typesOfPayment
	 */
	public void addToTypesOfPayment(final SessionContext ctx, final PaymentMode value)
	{
		TYPESOFPAYMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to typesOfPayment. 
	 * @param value the item to add to typesOfPayment
	 */
	public void addToTypesOfPayment(final PaymentMode value)
	{
		addToTypesOfPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from typesOfPayment. 
	 * @param value the item to remove from typesOfPayment
	 */
	public void removeFromTypesOfPayment(final SessionContext ctx, final PaymentMode value)
	{
		TYPESOFPAYMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from typesOfPayment. 
	 * @param value the item to remove from typesOfPayment
	 */
	public void removeFromTypesOfPayment(final PaymentMode value)
	{
		removeFromTypesOfPayment( getSession().getSessionContext(), value );
	}
	
}
