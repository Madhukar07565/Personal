/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.PaymentSchedule PaymentSchedule}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentSchedule extends GenericItem
{
	/** Qualifier of the <code>PaymentSchedule.paymentType</code> attribute **/
	public static final String PAYMENTTYPE = "paymentType";
	/** Qualifier of the <code>PaymentSchedule.percentageAmount</code> attribute **/
	public static final String PERCENTAGEAMOUNT = "percentageAmount";
	/** Qualifier of the <code>PaymentSchedule.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>PaymentSchedule.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>PaymentSchedule.paymentDueDate</code> attribute **/
	public static final String PAYMENTDUEDATE = "paymentDueDate";
	/** Qualifier of the <code>PaymentSchedule.paymentStatus</code> attribute **/
	public static final String PAYMENTSTATUS = "paymentStatus";
	/** Qualifier of the <code>PaymentSchedule.actualAmount</code> attribute **/
	public static final String ACTUALAMOUNT = "actualAmount";
	/** Qualifier of the <code>PaymentSchedule.balance</code> attribute **/
	public static final String BALANCE = "balance";
	/** Qualifier of the <code>PaymentSchedule.paymentAdviceNumber</code> attribute **/
	public static final String PAYMENTADVICENUMBER = "paymentAdviceNumber";
	/** Qualifier of the <code>PaymentSchedule.daysBeforeTravel</code> attribute **/
	public static final String DAYSBEFORETRAVEL = "daysBeforeTravel";
	/** Qualifier of the <code>PaymentSchedule.abstractInventoryDefinition</code> attribute **/
	public static final String ABSTRACTINVENTORYDEFINITION = "abstractInventoryDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPaymentSchedule> ABSTRACTINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedPaymentSchedule>(
	CommoninventorycoreConstants.TC.PAYMENTSCHEDULE,
	false,
	"abstractInventoryDefinition",
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
		tmp.put(PERCENTAGEAMOUNT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(PAYMENTDUEDATE, AttributeMode.INITIAL);
		tmp.put(PAYMENTSTATUS, AttributeMode.INITIAL);
		tmp.put(ACTUALAMOUNT, AttributeMode.INITIAL);
		tmp.put(BALANCE, AttributeMode.INITIAL);
		tmp.put(PAYMENTADVICENUMBER, AttributeMode.INITIAL);
		tmp.put(DAYSBEFORETRAVEL, AttributeMode.INITIAL);
		tmp.put(ABSTRACTINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.abstractInventoryDefinition</code> attribute.
	 * @return the abstractInventoryDefinition
	 */
	public AbstractInventoryDefinition getAbstractInventoryDefinition(final SessionContext ctx)
	{
		return (AbstractInventoryDefinition)getProperty( ctx, ABSTRACTINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.abstractInventoryDefinition</code> attribute.
	 * @return the abstractInventoryDefinition
	 */
	public AbstractInventoryDefinition getAbstractInventoryDefinition()
	{
		return getAbstractInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.abstractInventoryDefinition</code> attribute. 
	 * @param value the abstractInventoryDefinition
	 */
	public void setAbstractInventoryDefinition(final SessionContext ctx, final AbstractInventoryDefinition value)
	{
		ABSTRACTINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.abstractInventoryDefinition</code> attribute. 
	 * @param value the abstractInventoryDefinition
	 */
	public void setAbstractInventoryDefinition(final AbstractInventoryDefinition value)
	{
		setAbstractInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.actualAmount</code> attribute.
	 * @return the actualAmount - To show Actual Amount Paid.
	 */
	public Double getActualAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ACTUALAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.actualAmount</code> attribute.
	 * @return the actualAmount - To show Actual Amount Paid.
	 */
	public Double getActualAmount()
	{
		return getActualAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.actualAmount</code> attribute. 
	 * @return the actualAmount - To show Actual Amount Paid.
	 */
	public double getActualAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getActualAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.actualAmount</code> attribute. 
	 * @return the actualAmount - To show Actual Amount Paid.
	 */
	public double getActualAmountAsPrimitive()
	{
		return getActualAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.actualAmount</code> attribute. 
	 * @param value the actualAmount - To show Actual Amount Paid.
	 */
	public void setActualAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ACTUALAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.actualAmount</code> attribute. 
	 * @param value the actualAmount - To show Actual Amount Paid.
	 */
	public void setActualAmount(final Double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.actualAmount</code> attribute. 
	 * @param value the actualAmount - To show Actual Amount Paid.
	 */
	public void setActualAmount(final SessionContext ctx, final double value)
	{
		setActualAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.actualAmount</code> attribute. 
	 * @param value the actualAmount - To show Actual Amount Paid.
	 */
	public void setActualAmount(final double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.balance</code> attribute.
	 * @return the balance - Balance
	 */
	public Double getBalance(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, BALANCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.balance</code> attribute.
	 * @return the balance - Balance
	 */
	public Double getBalance()
	{
		return getBalance( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.balance</code> attribute. 
	 * @return the balance - Balance
	 */
	public double getBalanceAsPrimitive(final SessionContext ctx)
	{
		Double value = getBalance( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.balance</code> attribute. 
	 * @return the balance - Balance
	 */
	public double getBalanceAsPrimitive()
	{
		return getBalanceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.balance</code> attribute. 
	 * @param value the balance - Balance
	 */
	public void setBalance(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, BALANCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.balance</code> attribute. 
	 * @param value the balance - Balance
	 */
	public void setBalance(final Double value)
	{
		setBalance( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.balance</code> attribute. 
	 * @param value the balance - Balance
	 */
	public void setBalance(final SessionContext ctx, final double value)
	{
		setBalance( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.balance</code> attribute. 
	 * @param value the balance - Balance
	 */
	public void setBalance(final double value)
	{
		setBalance( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSTRACTINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.currency</code> attribute.
	 * @return the currency - To show currency.
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.currency</code> attribute.
	 * @return the currency - To show currency.
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.currency</code> attribute. 
	 * @param value the currency - To show currency.
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.currency</code> attribute. 
	 * @param value the currency - To show currency.
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.daysBeforeTravel</code> attribute.
	 * @return the daysBeforeTravel - Days Before Travel.
	 */
	public Long getDaysBeforeTravel(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, DAYSBEFORETRAVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.daysBeforeTravel</code> attribute.
	 * @return the daysBeforeTravel - Days Before Travel.
	 */
	public Long getDaysBeforeTravel()
	{
		return getDaysBeforeTravel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.daysBeforeTravel</code> attribute. 
	 * @return the daysBeforeTravel - Days Before Travel.
	 */
	public long getDaysBeforeTravelAsPrimitive(final SessionContext ctx)
	{
		Long value = getDaysBeforeTravel( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.daysBeforeTravel</code> attribute. 
	 * @return the daysBeforeTravel - Days Before Travel.
	 */
	public long getDaysBeforeTravelAsPrimitive()
	{
		return getDaysBeforeTravelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.daysBeforeTravel</code> attribute. 
	 * @param value the daysBeforeTravel - Days Before Travel.
	 */
	public void setDaysBeforeTravel(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, DAYSBEFORETRAVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.daysBeforeTravel</code> attribute. 
	 * @param value the daysBeforeTravel - Days Before Travel.
	 */
	public void setDaysBeforeTravel(final Long value)
	{
		setDaysBeforeTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.daysBeforeTravel</code> attribute. 
	 * @param value the daysBeforeTravel - Days Before Travel.
	 */
	public void setDaysBeforeTravel(final SessionContext ctx, final long value)
	{
		setDaysBeforeTravel( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.daysBeforeTravel</code> attribute. 
	 * @param value the daysBeforeTravel - Days Before Travel.
	 */
	public void setDaysBeforeTravel(final long value)
	{
		setDaysBeforeTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.paymentAdviceNumber</code> attribute.
	 * @return the paymentAdviceNumber - To show payment advice no.
	 */
	public String getPaymentAdviceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTADVICENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.paymentAdviceNumber</code> attribute.
	 * @return the paymentAdviceNumber - To show payment advice no.
	 */
	public String getPaymentAdviceNumber()
	{
		return getPaymentAdviceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.paymentAdviceNumber</code> attribute. 
	 * @param value the paymentAdviceNumber - To show payment advice no.
	 */
	public void setPaymentAdviceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTADVICENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.paymentAdviceNumber</code> attribute. 
	 * @param value the paymentAdviceNumber - To show payment advice no.
	 */
	public void setPaymentAdviceNumber(final String value)
	{
		setPaymentAdviceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.paymentDueDate</code> attribute.
	 * @return the paymentDueDate - To show Payment Due Date.
	 */
	public Date getPaymentDueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PAYMENTDUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.paymentDueDate</code> attribute.
	 * @return the paymentDueDate - To show Payment Due Date.
	 */
	public Date getPaymentDueDate()
	{
		return getPaymentDueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.paymentDueDate</code> attribute. 
	 * @param value the paymentDueDate - To show Payment Due Date.
	 */
	public void setPaymentDueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PAYMENTDUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.paymentDueDate</code> attribute. 
	 * @param value the paymentDueDate - To show Payment Due Date.
	 */
	public void setPaymentDueDate(final Date value)
	{
		setPaymentDueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.paymentStatus</code> attribute.
	 * @return the paymentStatus - To show payment status.
	 */
	public EnumerationValue getPaymentStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.paymentStatus</code> attribute.
	 * @return the paymentStatus - To show payment status.
	 */
	public EnumerationValue getPaymentStatus()
	{
		return getPaymentStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.paymentStatus</code> attribute. 
	 * @param value the paymentStatus - To show payment status.
	 */
	public void setPaymentStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.paymentStatus</code> attribute. 
	 * @param value the paymentStatus - To show payment status.
	 */
	public void setPaymentStatus(final EnumerationValue value)
	{
		setPaymentStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.paymentType</code> attribute.
	 * @return the paymentType - To show Payment Type.
	 */
	public EnumerationValue getPaymentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.paymentType</code> attribute.
	 * @return the paymentType - To show Payment Type.
	 */
	public EnumerationValue getPaymentType()
	{
		return getPaymentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.paymentType</code> attribute. 
	 * @param value the paymentType - To show Payment Type.
	 */
	public void setPaymentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.paymentType</code> attribute. 
	 * @param value the paymentType - To show Payment Type.
	 */
	public void setPaymentType(final EnumerationValue value)
	{
		setPaymentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.percentageAmount</code> attribute.
	 * @return the percentageAmount - To show percentage Amount.
	 */
	public Double getPercentageAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGEAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.percentageAmount</code> attribute.
	 * @return the percentageAmount - To show percentage Amount.
	 */
	public Double getPercentageAmount()
	{
		return getPercentageAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.percentageAmount</code> attribute. 
	 * @return the percentageAmount - To show percentage Amount.
	 */
	public double getPercentageAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentageAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.percentageAmount</code> attribute. 
	 * @return the percentageAmount - To show percentage Amount.
	 */
	public double getPercentageAmountAsPrimitive()
	{
		return getPercentageAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - To show percentage Amount.
	 */
	public void setPercentageAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGEAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - To show percentage Amount.
	 */
	public void setPercentageAmount(final Double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - To show percentage Amount.
	 */
	public void setPercentageAmount(final SessionContext ctx, final double value)
	{
		setPercentageAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.percentageAmount</code> attribute. 
	 * @param value the percentageAmount - To show percentage Amount.
	 */
	public void setPercentageAmount(final double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.remark</code> attribute.
	 * @return the remark - To show remark.
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentSchedule.remark</code> attribute.
	 * @return the remark - To show remark.
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.remark</code> attribute. 
	 * @param value the remark - To show remark.
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentSchedule.remark</code> attribute. 
	 * @param value the remark - To show remark.
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
}
