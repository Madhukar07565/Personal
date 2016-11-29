/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.InventoryPaymentAdvice;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.PaymentDetailsVmpd PaymentDetailsVmpd}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentDetailsVmpd extends GenericItem
{
	/** Qualifier of the <code>PaymentDetailsVmpd.vmpdNumber</code> attribute **/
	public static final String VMPDNUMBER = "vmpdNumber";
	/** Qualifier of the <code>PaymentDetailsVmpd.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>PaymentDetailsVmpd.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>PaymentDetailsVmpd.amountPending</code> attribute **/
	public static final String AMOUNTPENDING = "amountPending";
	/** Qualifier of the <code>PaymentDetailsVmpd.dateOfGeneration</code> attribute **/
	public static final String DATEOFGENERATION = "dateOfGeneration";
	/** Qualifier of the <code>PaymentDetailsVmpd.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute **/
	public static final String INVENTORYPAYMENTADVICEPOS = "inventoryPaymentAdvicePOS";
	/** Qualifier of the <code>PaymentDetailsVmpd.inventoryPaymentAdvice</code> attribute **/
	public static final String INVENTORYPAYMENTADVICE = "inventoryPaymentAdvice";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INVENTORYPAYMENTADVICE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPaymentDetailsVmpd> INVENTORYPAYMENTADVICEHANDLER = new BidirectionalOneToManyHandler<GeneratedPaymentDetailsVmpd>(
	CommoninventorycoreConstants.TC.PAYMENTDETAILSVMPD,
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
		tmp.put(VMPDNUMBER, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(AMOUNTPENDING, AttributeMode.INITIAL);
		tmp.put(DATEOFGENERATION, AttributeMode.INITIAL);
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
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public BigDecimal getAmount(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.amount</code> attribute.
	 * @return the amount - Amount
	 */
	public BigDecimal getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.amount</code> attribute. 
	 * @param value the amount - Amount
	 */
	public void setAmount(final BigDecimal value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.amountPending</code> attribute.
	 * @return the amountPending - Amount Pending
	 */
	public BigDecimal getAmountPending(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, AMOUNTPENDING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.amountPending</code> attribute.
	 * @return the amountPending - Amount Pending
	 */
	public BigDecimal getAmountPending()
	{
		return getAmountPending( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.amountPending</code> attribute. 
	 * @param value the amountPending - Amount Pending
	 */
	public void setAmountPending(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, AMOUNTPENDING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.amountPending</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.dateOfGeneration</code> attribute.
	 * @return the dateOfGeneration - Date Of Generation
	 */
	public Date getDateOfGeneration(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATEOFGENERATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.dateOfGeneration</code> attribute.
	 * @return the dateOfGeneration - Date Of Generation
	 */
	public Date getDateOfGeneration()
	{
		return getDateOfGeneration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.dateOfGeneration</code> attribute. 
	 * @param value the dateOfGeneration - Date Of Generation
	 */
	public void setDateOfGeneration(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATEOFGENERATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.dateOfGeneration</code> attribute. 
	 * @param value the dateOfGeneration - Date Of Generation
	 */
	public void setDateOfGeneration(final Date value)
	{
		setDateOfGeneration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvice</code> attribute.
	 * @return the inventoryPaymentAdvice
	 */
	public InventoryPaymentAdvice getInventoryPaymentAdvice(final SessionContext ctx)
	{
		return (InventoryPaymentAdvice)getProperty( ctx, INVENTORYPAYMENTADVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvice</code> attribute.
	 * @return the inventoryPaymentAdvice
	 */
	public InventoryPaymentAdvice getInventoryPaymentAdvice()
	{
		return getInventoryPaymentAdvice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvice</code> attribute. 
	 * @param value the inventoryPaymentAdvice
	 */
	public void setInventoryPaymentAdvice(final SessionContext ctx, final InventoryPaymentAdvice value)
	{
		INVENTORYPAYMENTADVICEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvice</code> attribute. 
	 * @param value the inventoryPaymentAdvice
	 */
	public void setInventoryPaymentAdvice(final InventoryPaymentAdvice value)
	{
		setInventoryPaymentAdvice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute.
	 * @return the inventoryPaymentAdvicePOS
	 */
	 Integer getInventoryPaymentAdvicePOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, INVENTORYPAYMENTADVICEPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute.
	 * @return the inventoryPaymentAdvicePOS
	 */
	 Integer getInventoryPaymentAdvicePOS()
	{
		return getInventoryPaymentAdvicePOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute. 
	 * @return the inventoryPaymentAdvicePOS
	 */
	 int getInventoryPaymentAdvicePOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getInventoryPaymentAdvicePOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute. 
	 * @return the inventoryPaymentAdvicePOS
	 */
	 int getInventoryPaymentAdvicePOSAsPrimitive()
	{
		return getInventoryPaymentAdvicePOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute. 
	 * @param value the inventoryPaymentAdvicePOS
	 */
	 void setInventoryPaymentAdvicePOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, INVENTORYPAYMENTADVICEPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute. 
	 * @param value the inventoryPaymentAdvicePOS
	 */
	 void setInventoryPaymentAdvicePOS(final Integer value)
	{
		setInventoryPaymentAdvicePOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute. 
	 * @param value the inventoryPaymentAdvicePOS
	 */
	 void setInventoryPaymentAdvicePOS(final SessionContext ctx, final int value)
	{
		setInventoryPaymentAdvicePOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.inventoryPaymentAdvicePOS</code> attribute. 
	 * @param value the inventoryPaymentAdvicePOS
	 */
	 void setInventoryPaymentAdvicePOS(final int value)
	{
		setInventoryPaymentAdvicePOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.vmpdNumber</code> attribute.
	 * @return the vmpdNumber - VMPD number
	 */
	public String getVmpdNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VMPDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentDetailsVmpd.vmpdNumber</code> attribute.
	 * @return the vmpdNumber - VMPD number
	 */
	public String getVmpdNumber()
	{
		return getVmpdNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.vmpdNumber</code> attribute. 
	 * @param value the vmpdNumber - VMPD number
	 */
	public void setVmpdNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VMPDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentDetailsVmpd.vmpdNumber</code> attribute. 
	 * @param value the vmpdNumber - VMPD number
	 */
	public void setVmpdNumber(final String value)
	{
		setVmpdNumber( getSession().getSessionContext(), value );
	}
	
}
