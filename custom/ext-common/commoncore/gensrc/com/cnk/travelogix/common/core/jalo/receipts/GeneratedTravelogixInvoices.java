/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo.receipts;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.receipts.ReceiptDetails;
import com.cnk.travelogix.common.core.jalo.receipts.TravelogixPaymentReceipt;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.OrderEntry;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.receipts.TravelogixInvoices TravelogixInvoice}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixInvoices extends GenericItem
{
	/** Qualifier of the <code>TravelogixInvoice.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TravelogixInvoice.invoiceParticulars</code> attribute **/
	public static final String INVOICEPARTICULARS = "invoiceParticulars";
	/** Qualifier of the <code>TravelogixInvoice.TotalCost</code> attribute **/
	public static final String TOTALCOST = "TotalCost";
	/** Qualifier of the <code>TravelogixInvoice.outstandingAmount</code> attribute **/
	public static final String OUTSTANDINGAMOUNT = "outstandingAmount";
	/** Qualifier of the <code>TravelogixInvoice.bookingRefNo</code> attribute **/
	public static final String BOOKINGREFNO = "bookingRefNo";
	/** Qualifier of the <code>TravelogixInvoice.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>TravelogixInvoice.receiptDetails</code> attribute **/
	public static final String RECEIPTDETAILS = "receiptDetails";
	/** Qualifier of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute **/
	public static final String TOTALAPPLIEDAMOUNT = "totalAppliedAmount";
	/** Qualifier of the <code>TravelogixInvoice.receipts</code> attribute **/
	public static final String RECEIPTS = "receipts";
	/** Relation ordering override parameter constants for TravelogixInvoice2TravelogixPaymentReceipt from ((commoncore))*/
	protected static String TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_SRC_ORDERED = "relation.TravelogixInvoice2TravelogixPaymentReceipt.source.ordered";
	protected static String TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_TGT_ORDERED = "relation.TravelogixInvoice2TravelogixPaymentReceipt.target.ordered";
	/** Relation disable markmodifed parameter constants for TravelogixInvoice2TravelogixPaymentReceipt from ((commoncore))*/
	protected static String TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_MARKMODIFIED = "relation.TravelogixInvoice2TravelogixPaymentReceipt.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(INVOICEPARTICULARS, AttributeMode.INITIAL);
		tmp.put(TOTALCOST, AttributeMode.INITIAL);
		tmp.put(OUTSTANDINGAMOUNT, AttributeMode.INITIAL);
		tmp.put(BOOKINGREFNO, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		tmp.put(RECEIPTDETAILS, AttributeMode.INITIAL);
		tmp.put(TOTALAPPLIEDAMOUNT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.bookingRefNo</code> attribute.
	 * @return the bookingRefNo - Booking Reference Number
	 */
	public String getBookingRefNo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BOOKINGREFNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.bookingRefNo</code> attribute.
	 * @return the bookingRefNo - Booking Reference Number
	 */
	public String getBookingRefNo()
	{
		return getBookingRefNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.bookingRefNo</code> attribute. 
	 * @param value the bookingRefNo - Booking Reference Number
	 */
	public void setBookingRefNo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BOOKINGREFNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.bookingRefNo</code> attribute. 
	 * @param value the bookingRefNo - Booking Reference Number
	 */
	public void setBookingRefNo(final String value)
	{
		setBookingRefNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.client</code> attribute.
	 * @return the client - Booking Reference Number
	 */
	public User getClient(final SessionContext ctx)
	{
		return (User)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.client</code> attribute.
	 * @return the client - Booking Reference Number
	 */
	public User getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.client</code> attribute. 
	 * @param value the client - Booking Reference Number
	 */
	public void setClient(final SessionContext ctx, final User value)
	{
		setProperty(ctx, CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.client</code> attribute. 
	 * @param value the client - Booking Reference Number
	 */
	public void setClient(final User value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.code</code> attribute.
	 * @return the code - Invoice No.
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.code</code> attribute.
	 * @return the code - Invoice No.
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.code</code> attribute. 
	 * @param value the code - Invoice No.
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.code</code> attribute. 
	 * @param value the code - Invoice No.
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.invoiceParticulars</code> attribute.
	 * @return the invoiceParticulars - Invoice Particulars
	 */
	public OrderEntry getInvoiceParticulars(final SessionContext ctx)
	{
		return (OrderEntry)getProperty( ctx, INVOICEPARTICULARS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.invoiceParticulars</code> attribute.
	 * @return the invoiceParticulars - Invoice Particulars
	 */
	public OrderEntry getInvoiceParticulars()
	{
		return getInvoiceParticulars( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.invoiceParticulars</code> attribute. 
	 * @param value the invoiceParticulars - Invoice Particulars
	 */
	public void setInvoiceParticulars(final SessionContext ctx, final OrderEntry value)
	{
		setProperty(ctx, INVOICEPARTICULARS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.invoiceParticulars</code> attribute. 
	 * @param value the invoiceParticulars - Invoice Particulars
	 */
	public void setInvoiceParticulars(final OrderEntry value)
	{
		setInvoiceParticulars( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.outstandingAmount</code> attribute.
	 * @return the outstandingAmount - Outstanding Amount
	 */
	public Double getOutstandingAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, OUTSTANDINGAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.outstandingAmount</code> attribute.
	 * @return the outstandingAmount - Outstanding Amount
	 */
	public Double getOutstandingAmount()
	{
		return getOutstandingAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.outstandingAmount</code> attribute. 
	 * @return the outstandingAmount - Outstanding Amount
	 */
	public double getOutstandingAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getOutstandingAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.outstandingAmount</code> attribute. 
	 * @return the outstandingAmount - Outstanding Amount
	 */
	public double getOutstandingAmountAsPrimitive()
	{
		return getOutstandingAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.outstandingAmount</code> attribute. 
	 * @param value the outstandingAmount - Outstanding Amount
	 */
	public void setOutstandingAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, OUTSTANDINGAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.outstandingAmount</code> attribute. 
	 * @param value the outstandingAmount - Outstanding Amount
	 */
	public void setOutstandingAmount(final Double value)
	{
		setOutstandingAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.outstandingAmount</code> attribute. 
	 * @param value the outstandingAmount - Outstanding Amount
	 */
	public void setOutstandingAmount(final SessionContext ctx, final double value)
	{
		setOutstandingAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.outstandingAmount</code> attribute. 
	 * @param value the outstandingAmount - Outstanding Amount
	 */
	public void setOutstandingAmount(final double value)
	{
		setOutstandingAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.receiptDetails</code> attribute.
	 * @return the receiptDetails - Booking Reference Number
	 */
	public ReceiptDetails getReceiptDetails(final SessionContext ctx)
	{
		return (ReceiptDetails)getProperty( ctx, RECEIPTDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.receiptDetails</code> attribute.
	 * @return the receiptDetails - Booking Reference Number
	 */
	public ReceiptDetails getReceiptDetails()
	{
		return getReceiptDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.receiptDetails</code> attribute. 
	 * @param value the receiptDetails - Booking Reference Number
	 */
	public void setReceiptDetails(final SessionContext ctx, final ReceiptDetails value)
	{
		setProperty(ctx, RECEIPTDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.receiptDetails</code> attribute. 
	 * @param value the receiptDetails - Booking Reference Number
	 */
	public void setReceiptDetails(final ReceiptDetails value)
	{
		setReceiptDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.receipts</code> attribute.
	 * @return the receipts
	 */
	public Collection<TravelogixPaymentReceipt> getReceipts(final SessionContext ctx)
	{
		final List<TravelogixPaymentReceipt> items = getLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			"TravelogixPaymentReceipt",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.receipts</code> attribute.
	 * @return the receipts
	 */
	public Collection<TravelogixPaymentReceipt> getReceipts()
	{
		return getReceipts( getSession().getSessionContext() );
	}
	
	public long getReceiptsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			"TravelogixPaymentReceipt",
			null
		);
	}
	
	public long getReceiptsCount()
	{
		return getReceiptsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.receipts</code> attribute. 
	 * @param value the receipts
	 */
	public void setReceipts(final SessionContext ctx, final Collection<TravelogixPaymentReceipt> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.receipts</code> attribute. 
	 * @param value the receipts
	 */
	public void setReceipts(final Collection<TravelogixPaymentReceipt> value)
	{
		setReceipts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to receipts. 
	 * @param value the item to add to receipts
	 */
	public void addToReceipts(final SessionContext ctx, final TravelogixPaymentReceipt value)
	{
		addLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to receipts. 
	 * @param value the item to add to receipts
	 */
	public void addToReceipts(final TravelogixPaymentReceipt value)
	{
		addToReceipts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from receipts. 
	 * @param value the item to remove from receipts
	 */
	public void removeFromReceipts(final SessionContext ctx, final TravelogixPaymentReceipt value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXINVOICE2TRAVELOGIXPAYMENTRECEIPT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from receipts. 
	 * @param value the item to remove from receipts
	 */
	public void removeFromReceipts(final TravelogixPaymentReceipt value)
	{
		removeFromReceipts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute.
	 * @return the totalAppliedAmount
	 */
	public Double getTotalAppliedAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALAPPLIEDAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute.
	 * @return the totalAppliedAmount
	 */
	public Double getTotalAppliedAmount()
	{
		return getTotalAppliedAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute. 
	 * @return the totalAppliedAmount
	 */
	public double getTotalAppliedAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalAppliedAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute. 
	 * @return the totalAppliedAmount
	 */
	public double getTotalAppliedAmountAsPrimitive()
	{
		return getTotalAppliedAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute. 
	 * @param value the totalAppliedAmount
	 */
	public void setTotalAppliedAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALAPPLIEDAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute. 
	 * @param value the totalAppliedAmount
	 */
	public void setTotalAppliedAmount(final Double value)
	{
		setTotalAppliedAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute. 
	 * @param value the totalAppliedAmount
	 */
	public void setTotalAppliedAmount(final SessionContext ctx, final double value)
	{
		setTotalAppliedAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.totalAppliedAmount</code> attribute. 
	 * @param value the totalAppliedAmount
	 */
	public void setTotalAppliedAmount(final double value)
	{
		setTotalAppliedAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.TotalCost</code> attribute.
	 * @return the TotalCost - Total Cost Of All Items
	 */
	public Double getTotalCost(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALCOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.TotalCost</code> attribute.
	 * @return the TotalCost - Total Cost Of All Items
	 */
	public Double getTotalCost()
	{
		return getTotalCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.TotalCost</code> attribute. 
	 * @return the TotalCost - Total Cost Of All Items
	 */
	public double getTotalCostAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalCost( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixInvoice.TotalCost</code> attribute. 
	 * @return the TotalCost - Total Cost Of All Items
	 */
	public double getTotalCostAsPrimitive()
	{
		return getTotalCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.TotalCost</code> attribute. 
	 * @param value the TotalCost - Total Cost Of All Items
	 */
	public void setTotalCost(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALCOST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.TotalCost</code> attribute. 
	 * @param value the TotalCost - Total Cost Of All Items
	 */
	public void setTotalCost(final Double value)
	{
		setTotalCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.TotalCost</code> attribute. 
	 * @param value the TotalCost - Total Cost Of All Items
	 */
	public void setTotalCost(final SessionContext ctx, final double value)
	{
		setTotalCost( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixInvoice.TotalCost</code> attribute. 
	 * @param value the TotalCost - Total Cost Of All Items
	 */
	public void setTotalCost(final double value)
	{
		setTotalCost( getSession().getSessionContext(), value );
	}
	
}
