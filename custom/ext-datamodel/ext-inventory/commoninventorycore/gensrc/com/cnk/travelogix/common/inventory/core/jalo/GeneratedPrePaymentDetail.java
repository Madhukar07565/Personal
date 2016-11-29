/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.InventoryPaymentAdvice;
import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
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
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.PrePaymentDetail PrePaymentDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPrePaymentDetail extends GenericItem
{
	/** Qualifier of the <code>PrePaymentDetail.typeOfPayment</code> attribute **/
	public static final String TYPEOFPAYMENT = "typeOfPayment";
	/** Qualifier of the <code>PrePaymentDetail.modeOfPayment</code> attribute **/
	public static final String MODEOFPAYMENT = "modeOfPayment";
	/** Qualifier of the <code>PrePaymentDetail.drawnOn</code> attribute **/
	public static final String DRAWNON = "drawnOn";
	/** Qualifier of the <code>PrePaymentDetail.paymentRefNo</code> attribute **/
	public static final String PAYMENTREFNO = "paymentRefNo";
	/** Qualifier of the <code>PrePaymentDetail.finSystemRefNo</code> attribute **/
	public static final String FINSYSTEMREFNO = "finSystemRefNo";
	/** Qualifier of the <code>PrePaymentDetail.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>PrePaymentDetail.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>PrePaymentDetail.amountPending</code> attribute **/
	public static final String AMOUNTPENDING = "amountPending";
	/** Qualifier of the <code>PrePaymentDetail.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>PrePaymentDetail.partPayment</code> attribute **/
	public static final String PARTPAYMENT = "partPayment";
	/** Qualifier of the <code>PrePaymentDetail.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute **/
	public static final String INVENTORYPAYMENTADVICEPOS = "inventoryPaymentAdvicePOS";
	/** Qualifier of the <code>PrePaymentDetail.inventoryPaymentAdvice</code> attribute **/
	public static final String INVENTORYPAYMENTADVICE = "inventoryPaymentAdvice";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INVENTORYPAYMENTADVICE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPrePaymentDetail> INVENTORYPAYMENTADVICEHANDLER = new BidirectionalOneToManyHandler<GeneratedPrePaymentDetail>(
	CommoninventorycoreConstants.TC.PREPAYMENTDETAIL,
	false,
	"inventoryPaymentAdvice",
	"inventoryPaymentAdvicePOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TYPEOFPAYMENT, AttributeMode.INITIAL);
		tmp.put(MODEOFPAYMENT, AttributeMode.INITIAL);
		tmp.put(DRAWNON, AttributeMode.INITIAL);
		tmp.put(PAYMENTREFNO, AttributeMode.INITIAL);
		tmp.put(FINSYSTEMREFNO, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(AMOUNTPENDING, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(PARTPAYMENT, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(INVENTORYPAYMENTADVICEPOS, AttributeMode.INITIAL);
		tmp.put(INVENTORYPAYMENTADVICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public BigDecimal getAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public BigDecimal getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final BigDecimal value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.amountPending</code> attribute.
	 * @return the amountPending - Amount Pending
	 */
	public BigDecimal getAmountPending(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, AMOUNTPENDING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.amountPending</code> attribute.
	 * @return the amountPending - Amount Pending
	 */
	public BigDecimal getAmountPending()
	{
		return getAmountPending( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.amountPending</code> attribute. 
	 * @param value the amountPending - Amount Pending
	 */
	public void setAmountPending(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, AMOUNTPENDING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.amountPending</code> attribute. 
	 * @param value the amountPending - Amount Pending
	 */
	public void setAmountPending(final BigDecimal value)
	{
		setAmountPending( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INVENTORYPAYMENTADVICEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.date</code> attribute.
	 * @return the date - Date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.date</code> attribute.
	 * @return the date - Date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.date</code> attribute. 
	 * @param value the date - Date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.date</code> attribute. 
	 * @param value the date - Date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.drawnOn</code> attribute.
	 * @return the drawnOn - Drawn on
	 */
	public Bank getDrawnOn(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, DRAWNON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.drawnOn</code> attribute.
	 * @return the drawnOn - Drawn on
	 */
	public Bank getDrawnOn()
	{
		return getDrawnOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.drawnOn</code> attribute. 
	 * @param value the drawnOn - Drawn on
	 */
	public void setDrawnOn(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, DRAWNON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.drawnOn</code> attribute. 
	 * @param value the drawnOn - Drawn on
	 */
	public void setDrawnOn(final Bank value)
	{
		setDrawnOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.finSystemRefNo</code> attribute.
	 * @return the finSystemRefNo - Finance system reference number
	 */
	public String getFinSystemRefNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FINSYSTEMREFNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.finSystemRefNo</code> attribute.
	 * @return the finSystemRefNo - Finance system reference number
	 */
	public String getFinSystemRefNo()
	{
		return getFinSystemRefNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.finSystemRefNo</code> attribute. 
	 * @param value the finSystemRefNo - Finance system reference number
	 */
	public void setFinSystemRefNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FINSYSTEMREFNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.finSystemRefNo</code> attribute. 
	 * @param value the finSystemRefNo - Finance system reference number
	 */
	public void setFinSystemRefNo(final String value)
	{
		setFinSystemRefNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.inventoryPaymentAdvice</code> attribute.
	 * @return the inventoryPaymentAdvice
	 */
	public InventoryPaymentAdvice getInventoryPaymentAdvice(final SessionContext ctx)
	{
		return (InventoryPaymentAdvice)getProperty( ctx, INVENTORYPAYMENTADVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.inventoryPaymentAdvice</code> attribute.
	 * @return the inventoryPaymentAdvice
	 */
	public InventoryPaymentAdvice getInventoryPaymentAdvice()
	{
		return getInventoryPaymentAdvice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.inventoryPaymentAdvice</code> attribute. 
	 * @param value the inventoryPaymentAdvice
	 */
	public void setInventoryPaymentAdvice(final SessionContext ctx, final InventoryPaymentAdvice value)
	{
		INVENTORYPAYMENTADVICEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.inventoryPaymentAdvice</code> attribute. 
	 * @param value the inventoryPaymentAdvice
	 */
	public void setInventoryPaymentAdvice(final InventoryPaymentAdvice value)
	{
		setInventoryPaymentAdvice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute.
	 * @return the inventoryPaymentAdvicePOS
	 */
	 Integer getInventoryPaymentAdvicePOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, INVENTORYPAYMENTADVICEPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute.
	 * @return the inventoryPaymentAdvicePOS
	 */
	 Integer getInventoryPaymentAdvicePOS()
	{
		return getInventoryPaymentAdvicePOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute. 
	 * @return the inventoryPaymentAdvicePOS
	 */
	 int getInventoryPaymentAdvicePOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getInventoryPaymentAdvicePOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute. 
	 * @return the inventoryPaymentAdvicePOS
	 */
	 int getInventoryPaymentAdvicePOSAsPrimitive()
	{
		return getInventoryPaymentAdvicePOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute. 
	 * @param value the inventoryPaymentAdvicePOS
	 */
	 void setInventoryPaymentAdvicePOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, INVENTORYPAYMENTADVICEPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute. 
	 * @param value the inventoryPaymentAdvicePOS
	 */
	 void setInventoryPaymentAdvicePOS(final Integer value)
	{
		setInventoryPaymentAdvicePOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute. 
	 * @param value the inventoryPaymentAdvicePOS
	 */
	 void setInventoryPaymentAdvicePOS(final SessionContext ctx, final int value)
	{
		setInventoryPaymentAdvicePOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.inventoryPaymentAdvicePOS</code> attribute. 
	 * @param value the inventoryPaymentAdvicePOS
	 */
	 void setInventoryPaymentAdvicePOS(final int value)
	{
		setInventoryPaymentAdvicePOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.modeOfPayment</code> attribute.
	 * @return the modeOfPayment - Mode Of Payment
	 */
	public EnumerationValue getModeOfPayment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.modeOfPayment</code> attribute.
	 * @return the modeOfPayment - Mode Of Payment
	 */
	public EnumerationValue getModeOfPayment()
	{
		return getModeOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment - Mode Of Payment
	 */
	public void setModeOfPayment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment - Mode Of Payment
	 */
	public void setModeOfPayment(final EnumerationValue value)
	{
		setModeOfPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.partPayment</code> attribute.
	 * @return the partPayment - Part Payment
	 */
	public Boolean isPartPayment(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PARTPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.partPayment</code> attribute.
	 * @return the partPayment - Part Payment
	 */
	public Boolean isPartPayment()
	{
		return isPartPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.partPayment</code> attribute. 
	 * @return the partPayment - Part Payment
	 */
	public boolean isPartPaymentAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPartPayment( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.partPayment</code> attribute. 
	 * @return the partPayment - Part Payment
	 */
	public boolean isPartPaymentAsPrimitive()
	{
		return isPartPaymentAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.partPayment</code> attribute. 
	 * @param value the partPayment - Part Payment
	 */
	public void setPartPayment(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PARTPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.partPayment</code> attribute. 
	 * @param value the partPayment - Part Payment
	 */
	public void setPartPayment(final Boolean value)
	{
		setPartPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.partPayment</code> attribute. 
	 * @param value the partPayment - Part Payment
	 */
	public void setPartPayment(final SessionContext ctx, final boolean value)
	{
		setPartPayment( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.partPayment</code> attribute. 
	 * @param value the partPayment - Part Payment
	 */
	public void setPartPayment(final boolean value)
	{
		setPartPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.paymentRefNo</code> attribute.
	 * @return the paymentRefNo - Payment Reference Number
	 */
	public String getPaymentRefNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTREFNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.paymentRefNo</code> attribute.
	 * @return the paymentRefNo - Payment Reference Number
	 */
	public String getPaymentRefNo()
	{
		return getPaymentRefNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.paymentRefNo</code> attribute. 
	 * @param value the paymentRefNo - Payment Reference Number
	 */
	public void setPaymentRefNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTREFNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.paymentRefNo</code> attribute. 
	 * @param value the paymentRefNo - Payment Reference Number
	 */
	public void setPaymentRefNo(final String value)
	{
		setPaymentRefNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.typeOfPayment</code> attribute.
	 * @return the typeOfPayment - Type Of Payment
	 */
	public EnumerationValue getTypeOfPayment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PrePaymentDetail.typeOfPayment</code> attribute.
	 * @return the typeOfPayment - Type Of Payment
	 */
	public EnumerationValue getTypeOfPayment()
	{
		return getTypeOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.typeOfPayment</code> attribute. 
	 * @param value the typeOfPayment - Type Of Payment
	 */
	public void setTypeOfPayment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PrePaymentDetail.typeOfPayment</code> attribute. 
	 * @param value the typeOfPayment - Type Of Payment
	 */
	public void setTypeOfPayment(final EnumerationValue value)
	{
		setTypeOfPayment( getSession().getSessionContext(), value );
	}
	
}
