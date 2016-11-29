/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo.receipts;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.receipts.TravelogixInvoices;
import com.cnk.travelogix.common.core.jalo.receipts.TravelogixRemarks;
import com.cnk.travelogix.supplier.core.supplier.jalo.ROEDetails;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.Order;
import de.hybris.platform.jalo.order.payment.PaymentInfo;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.payment.jalo.PaymentTransaction;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.receipts.TravelogixPaymentReceipt TravelogixPaymentReceipt}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixPaymentReceipt extends GenericItem
{
	/** Qualifier of the <code>TravelogixPaymentReceipt.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TravelogixPaymentReceipt.POS</code> attribute **/
	public static final String POS = "POS";
	/** Qualifier of the <code>TravelogixPaymentReceipt.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>TravelogixPaymentReceipt.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>TravelogixPaymentReceipt.receiptType</code> attribute **/
	public static final String RECEIPTTYPE = "receiptType";
	/** Qualifier of the <code>TravelogixPaymentReceipt.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>TravelogixPaymentReceipt.roe</code> attribute **/
	public static final String ROE = "roe";
	/** Qualifier of the <code>TravelogixPaymentReceipt.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute **/
	public static final String UNAPPLIEDAMOUNT = "unappliedAmount";
	/** Qualifier of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute **/
	public static final String FUNCTIONALAMOUNT = "functionalAmount";
	/** Qualifier of the <code>TravelogixPaymentReceipt.createdBy</code> attribute **/
	public static final String CREATEDBY = "createdBy";
	/** Qualifier of the <code>TravelogixPaymentReceipt.inFavourOf</code> attribute **/
	public static final String INFAVOUROF = "inFavourOf";
	/** Qualifier of the <code>TravelogixPaymentReceipt.paymentMethod</code> attribute **/
	public static final String PAYMENTMETHOD = "paymentMethod";
	/** Qualifier of the <code>TravelogixPaymentReceipt.paymentInfo</code> attribute **/
	public static final String PAYMENTINFO = "paymentInfo";
	/** Qualifier of the <code>TravelogixPaymentReceipt.travelogixRemarksList</code> attribute **/
	public static final String TRAVELOGIXREMARKSLIST = "travelogixRemarksList";
	/** Qualifier of the <code>TravelogixPaymentReceipt.paymentTransaction</code> attribute **/
	public static final String PAYMENTTRANSACTION = "paymentTransaction";
	/** Qualifier of the <code>TravelogixPaymentReceipt.transactionRerenceNo</code> attribute **/
	public static final String TRANSACTIONRERENCENO = "transactionRerenceNo";
	/** Qualifier of the <code>TravelogixPaymentReceipt.transactionDate</code> attribute **/
	public static final String TRANSACTIONDATE = "transactionDate";
	/** Qualifier of the <code>TravelogixPaymentReceipt.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>TravelogixPaymentReceipt.order</code> attribute **/
	public static final String ORDER = "order";
	/** Qualifier of the <code>TravelogixPaymentReceipt.invoices</code> attribute **/
	public static final String INVOICES = "invoices";
	/** Relation ordering override parameter constants for TravelogixInvoice2TravelogixPaymentReceipt from ((commoncore))*/
	protected static String TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_SRC_ORDERED = "relation.TravelogixInvoice2TravelogixPaymentReceipt.source.ordered";
	protected static String TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_TGT_ORDERED = "relation.TravelogixInvoice2TravelogixPaymentReceipt.target.ordered";
	/** Relation disable markmodifed parameter constants for TravelogixInvoice2TravelogixPaymentReceipt from ((commoncore))*/
	protected static String TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_MARKMODIFIED = "relation.TravelogixInvoice2TravelogixPaymentReceipt.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ORDER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTravelogixPaymentReceipt> ORDERHANDLER = new BidirectionalOneToManyHandler<GeneratedTravelogixPaymentReceipt>(
	CommonCoreConstants.TC.TRAVELOGIXPAYMENTRECEIPT,
	false,
	"order",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(POS, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(RECEIPTTYPE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(ROE, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(UNAPPLIEDAMOUNT, AttributeMode.INITIAL);
		tmp.put(FUNCTIONALAMOUNT, AttributeMode.INITIAL);
		tmp.put(CREATEDBY, AttributeMode.INITIAL);
		tmp.put(INFAVOUROF, AttributeMode.INITIAL);
		tmp.put(PAYMENTMETHOD, AttributeMode.INITIAL);
		tmp.put(PAYMENTINFO, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXREMARKSLIST, AttributeMode.INITIAL);
		tmp.put(PAYMENTTRANSACTION, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONRERENCENO, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONDATE, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(ORDER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.code</code> attribute.
	 * @return the code
	 */
	public Integer getCode(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.code</code> attribute.
	 * @return the code
	 */
	public Integer getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.code</code> attribute. 
	 * @return the code
	 */
	public int getCodeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCode( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.code</code> attribute. 
	 * @return the code
	 */
	public int getCodeAsPrimitive()
	{
		return getCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final Integer value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final int value)
	{
		setCode( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final int value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.createdBy</code> attribute.
	 * @return the createdBy
	 */
	public Employee getCreatedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, CREATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.createdBy</code> attribute.
	 * @return the createdBy
	 */
	public Employee getCreatedBy()
	{
		return getCreatedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.createdBy</code> attribute. 
	 * @param value the createdBy
	 */
	public void setCreatedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, CREATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.createdBy</code> attribute. 
	 * @param value the createdBy
	 */
	public void setCreatedBy(final Employee value)
	{
		setCreatedBy( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ORDERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute.
	 * @return the functionalAmount
	 */
	public Double getFunctionalAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, FUNCTIONALAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute.
	 * @return the functionalAmount
	 */
	public Double getFunctionalAmount()
	{
		return getFunctionalAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute. 
	 * @return the functionalAmount
	 */
	public double getFunctionalAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getFunctionalAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute. 
	 * @return the functionalAmount
	 */
	public double getFunctionalAmountAsPrimitive()
	{
		return getFunctionalAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute. 
	 * @param value the functionalAmount
	 */
	public void setFunctionalAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, FUNCTIONALAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute. 
	 * @param value the functionalAmount
	 */
	public void setFunctionalAmount(final Double value)
	{
		setFunctionalAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute. 
	 * @param value the functionalAmount
	 */
	public void setFunctionalAmount(final SessionContext ctx, final double value)
	{
		setFunctionalAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.functionalAmount</code> attribute. 
	 * @param value the functionalAmount
	 */
	public void setFunctionalAmount(final double value)
	{
		setFunctionalAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.inFavourOf</code> attribute.
	 * @return the inFavourOf
	 */
	public String getInFavourOf(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INFAVOUROF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.inFavourOf</code> attribute.
	 * @return the inFavourOf
	 */
	public String getInFavourOf()
	{
		return getInFavourOf( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.inFavourOf</code> attribute. 
	 * @param value the inFavourOf
	 */
	public void setInFavourOf(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INFAVOUROF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.inFavourOf</code> attribute. 
	 * @param value the inFavourOf
	 */
	public void setInFavourOf(final String value)
	{
		setInFavourOf( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.invoices</code> attribute.
	 * @return the invoices
	 */
	public Collection<TravelogixInvoices> getInvoices(final SessionContext ctx)
	{
		final List<TravelogixInvoices> items = getLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			"TravelogixInvoice",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.invoices</code> attribute.
	 * @return the invoices
	 */
	public Collection<TravelogixInvoices> getInvoices()
	{
		return getInvoices( getSession().getSessionContext() );
	}
	
	public long getInvoicesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			"TravelogixInvoice",
			null
		);
	}
	
	public long getInvoicesCount()
	{
		return getInvoicesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.invoices</code> attribute. 
	 * @param value the invoices
	 */
	public void setInvoices(final SessionContext ctx, final Collection<TravelogixInvoices> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.invoices</code> attribute. 
	 * @param value the invoices
	 */
	public void setInvoices(final Collection<TravelogixInvoices> value)
	{
		setInvoices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to invoices. 
	 * @param value the item to add to invoices
	 */
	public void addToInvoices(final SessionContext ctx, final TravelogixInvoices value)
	{
		addLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to invoices. 
	 * @param value the item to add to invoices
	 */
	public void addToInvoices(final TravelogixInvoices value)
	{
		addToInvoices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from invoices. 
	 * @param value the item to remove from invoices
	 */
	public void removeFromInvoices(final SessionContext ctx, final TravelogixInvoices value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from invoices. 
	 * @param value the item to remove from invoices
	 */
	public void removeFromInvoices(final TravelogixInvoices value)
	{
		removeFromInvoices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.order</code> attribute.
	 * @return the order
	 */
	public Order getOrder(final SessionContext ctx)
	{
		return (Order)getProperty( ctx, ORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.order</code> attribute.
	 * @return the order
	 */
	public Order getOrder()
	{
		return getOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.order</code> attribute. 
	 * @param value the order
	 */
	public void setOrder(final SessionContext ctx, final Order value)
	{
		ORDERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.order</code> attribute. 
	 * @param value the order
	 */
	public void setOrder(final Order value)
	{
		setOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.paymentInfo</code> attribute.
	 * @return the paymentInfo
	 */
	public PaymentInfo getPaymentInfo(final SessionContext ctx)
	{
		return (PaymentInfo)getProperty( ctx, PAYMENTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.paymentInfo</code> attribute.
	 * @return the paymentInfo
	 */
	public PaymentInfo getPaymentInfo()
	{
		return getPaymentInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.paymentInfo</code> attribute. 
	 * @param value the paymentInfo
	 */
	public void setPaymentInfo(final SessionContext ctx, final PaymentInfo value)
	{
		setProperty(ctx, PAYMENTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.paymentInfo</code> attribute. 
	 * @param value the paymentInfo
	 */
	public void setPaymentInfo(final PaymentInfo value)
	{
		setPaymentInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.paymentMethod</code> attribute.
	 * @return the paymentMethod
	 */
	public EnumerationValue getPaymentMethod(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTMETHOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.paymentMethod</code> attribute.
	 * @return the paymentMethod
	 */
	public EnumerationValue getPaymentMethod()
	{
		return getPaymentMethod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.paymentMethod</code> attribute. 
	 * @param value the paymentMethod
	 */
	public void setPaymentMethod(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTMETHOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.paymentMethod</code> attribute. 
	 * @param value the paymentMethod
	 */
	public void setPaymentMethod(final EnumerationValue value)
	{
		setPaymentMethod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.paymentTransaction</code> attribute.
	 * @return the paymentTransaction
	 */
	public PaymentTransaction getPaymentTransaction(final SessionContext ctx)
	{
		return (PaymentTransaction)getProperty( ctx, PAYMENTTRANSACTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.paymentTransaction</code> attribute.
	 * @return the paymentTransaction
	 */
	public PaymentTransaction getPaymentTransaction()
	{
		return getPaymentTransaction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.paymentTransaction</code> attribute. 
	 * @param value the paymentTransaction
	 */
	public void setPaymentTransaction(final SessionContext ctx, final PaymentTransaction value)
	{
		setProperty(ctx, PAYMENTTRANSACTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.paymentTransaction</code> attribute. 
	 * @param value the paymentTransaction
	 */
	public void setPaymentTransaction(final PaymentTransaction value)
	{
		setPaymentTransaction( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.POS</code> attribute.
	 * @return the POS
	 */
	public String getPOS(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.POS</code> attribute.
	 * @return the POS
	 */
	public String getPOS()
	{
		return getPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.POS</code> attribute. 
	 * @param value the POS
	 */
	public void setPOS(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.POS</code> attribute. 
	 * @param value the POS
	 */
	public void setPOS(final String value)
	{
		setPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.receiptType</code> attribute.
	 * @return the receiptType
	 */
	public EnumerationValue getReceiptType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECEIPTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.receiptType</code> attribute.
	 * @return the receiptType
	 */
	public EnumerationValue getReceiptType()
	{
		return getReceiptType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.receiptType</code> attribute. 
	 * @param value the receiptType
	 */
	public void setReceiptType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECEIPTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.receiptType</code> attribute. 
	 * @param value the receiptType
	 */
	public void setReceiptType(final EnumerationValue value)
	{
		setReceiptType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.roe</code> attribute.
	 * @return the roe
	 */
	public ROEDetails getRoe(final SessionContext ctx)
	{
		return (ROEDetails)getProperty( ctx, ROE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.roe</code> attribute.
	 * @return the roe
	 */
	public ROEDetails getRoe()
	{
		return getRoe( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final SessionContext ctx, final ROEDetails value)
	{
		setProperty(ctx, ROE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final ROEDetails value)
	{
		setRoe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.transactionDate</code> attribute.
	 * @return the transactionDate
	 */
	public Date getTransactionDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TRANSACTIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.transactionDate</code> attribute.
	 * @return the transactionDate
	 */
	public Date getTransactionDate()
	{
		return getTransactionDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.transactionDate</code> attribute. 
	 * @param value the transactionDate
	 */
	public void setTransactionDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TRANSACTIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.transactionDate</code> attribute. 
	 * @param value the transactionDate
	 */
	public void setTransactionDate(final Date value)
	{
		setTransactionDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.transactionRerenceNo</code> attribute.
	 * @return the transactionRerenceNo
	 */
	public String getTransactionRerenceNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRANSACTIONRERENCENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.transactionRerenceNo</code> attribute.
	 * @return the transactionRerenceNo
	 */
	public String getTransactionRerenceNo()
	{
		return getTransactionRerenceNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.transactionRerenceNo</code> attribute. 
	 * @param value the transactionRerenceNo
	 */
	public void setTransactionRerenceNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRANSACTIONRERENCENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.transactionRerenceNo</code> attribute. 
	 * @param value the transactionRerenceNo
	 */
	public void setTransactionRerenceNo(final String value)
	{
		setTransactionRerenceNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.travelogixRemarksList</code> attribute.
	 * @return the travelogixRemarksList
	 */
	public List<TravelogixRemarks> getTravelogixRemarksList(final SessionContext ctx)
	{
		List<TravelogixRemarks> coll = (List<TravelogixRemarks>)getProperty( ctx, TRAVELOGIXREMARKSLIST);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.travelogixRemarksList</code> attribute.
	 * @return the travelogixRemarksList
	 */
	public List<TravelogixRemarks> getTravelogixRemarksList()
	{
		return getTravelogixRemarksList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.travelogixRemarksList</code> attribute. 
	 * @param value the travelogixRemarksList
	 */
	public void setTravelogixRemarksList(final SessionContext ctx, final List<TravelogixRemarks> value)
	{
		setProperty(ctx, TRAVELOGIXREMARKSLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.travelogixRemarksList</code> attribute. 
	 * @param value the travelogixRemarksList
	 */
	public void setTravelogixRemarksList(final List<TravelogixRemarks> value)
	{
		setTravelogixRemarksList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute.
	 * @return the unappliedAmount
	 */
	public Double getUnappliedAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, UNAPPLIEDAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute.
	 * @return the unappliedAmount
	 */
	public Double getUnappliedAmount()
	{
		return getUnappliedAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute. 
	 * @return the unappliedAmount
	 */
	public double getUnappliedAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getUnappliedAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute. 
	 * @return the unappliedAmount
	 */
	public double getUnappliedAmountAsPrimitive()
	{
		return getUnappliedAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute. 
	 * @param value the unappliedAmount
	 */
	public void setUnappliedAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, UNAPPLIEDAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute. 
	 * @param value the unappliedAmount
	 */
	public void setUnappliedAmount(final Double value)
	{
		setUnappliedAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute. 
	 * @param value the unappliedAmount
	 */
	public void setUnappliedAmount(final SessionContext ctx, final double value)
	{
		setUnappliedAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPaymentReceipt.unappliedAmount</code> attribute. 
	 * @param value the unappliedAmount
	 */
	public void setUnappliedAmount(final double value)
	{
		setUnappliedAmount( getSession().getSessionContext(), value );
	}
	
}
