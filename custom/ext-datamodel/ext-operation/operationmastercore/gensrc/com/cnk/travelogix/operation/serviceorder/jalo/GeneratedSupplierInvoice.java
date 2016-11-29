/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.serviceorder.jalo;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.serviceorder.jalo.ServiceOrder;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.serviceorder.jalo.SupplierInvoice SupplierInvoice}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierInvoice extends GenericItem
{
	/** Qualifier of the <code>SupplierInvoice.invoiceNumber</code> attribute **/
	public static final String INVOICENUMBER = "invoiceNumber";
	/** Qualifier of the <code>SupplierInvoice.invoiceDate</code> attribute **/
	public static final String INVOICEDATE = "invoiceDate";
	/** Qualifier of the <code>SupplierInvoice.invoiceReceivedDate</code> attribute **/
	public static final String INVOICERECEIVEDDATE = "invoiceReceivedDate";
	/** Qualifier of the <code>SupplierInvoice.totalCost</code> attribute **/
	public static final String TOTALCOST = "totalCost";
	/** Qualifier of the <code>SupplierInvoice.totalCommission</code> attribute **/
	public static final String TOTALCOMMISSION = "totalCommission";
	/** Qualifier of the <code>SupplierInvoice.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>SupplierInvoice.serviceOrderAmount</code> attribute **/
	public static final String SERVICEORDERAMOUNT = "serviceOrderAmount";
	/** Qualifier of the <code>SupplierInvoice.netPayable</code> attribute **/
	public static final String NETPAYABLE = "netPayable";
	/** Qualifier of the <code>SupplierInvoice.paymentDueDate</code> attribute **/
	public static final String PAYMENTDUEDATE = "paymentDueDate";
	/** Qualifier of the <code>SupplierInvoice.upload</code> attribute **/
	public static final String UPLOAD = "upload";
	/** Qualifier of the <code>SupplierInvoice.serviceOrder</code> attribute **/
	public static final String SERVICEORDER = "serviceOrder";
	/**
	* {@link OneToManyHandler} for handling 1:n SERVICEORDER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ServiceOrder> SERVICEORDERHANDLER = new OneToManyHandler<ServiceOrder>(
	OperationmastercoreConstants.TC.SERVICEORDER,
	false,
	"supplierInvoice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INVOICENUMBER, AttributeMode.INITIAL);
		tmp.put(INVOICEDATE, AttributeMode.INITIAL);
		tmp.put(INVOICERECEIVEDDATE, AttributeMode.INITIAL);
		tmp.put(TOTALCOST, AttributeMode.INITIAL);
		tmp.put(TOTALCOMMISSION, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(SERVICEORDERAMOUNT, AttributeMode.INITIAL);
		tmp.put(NETPAYABLE, AttributeMode.INITIAL);
		tmp.put(PAYMENTDUEDATE, AttributeMode.INITIAL);
		tmp.put(UPLOAD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.invoiceDate</code> attribute.
	 * @return the invoiceDate
	 */
	public Date getInvoiceDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, INVOICEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.invoiceDate</code> attribute.
	 * @return the invoiceDate
	 */
	public Date getInvoiceDate()
	{
		return getInvoiceDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.invoiceDate</code> attribute. 
	 * @param value the invoiceDate
	 */
	public void setInvoiceDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, INVOICEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.invoiceDate</code> attribute. 
	 * @param value the invoiceDate
	 */
	public void setInvoiceDate(final Date value)
	{
		setInvoiceDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.invoiceNumber</code> attribute.
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INVOICENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.invoiceNumber</code> attribute.
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber()
	{
		return getInvoiceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber
	 */
	public void setInvoiceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INVOICENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.invoiceNumber</code> attribute. 
	 * @param value the invoiceNumber
	 */
	public void setInvoiceNumber(final String value)
	{
		setInvoiceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.invoiceReceivedDate</code> attribute.
	 * @return the invoiceReceivedDate
	 */
	public Date getInvoiceReceivedDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, INVOICERECEIVEDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.invoiceReceivedDate</code> attribute.
	 * @return the invoiceReceivedDate
	 */
	public Date getInvoiceReceivedDate()
	{
		return getInvoiceReceivedDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.invoiceReceivedDate</code> attribute. 
	 * @param value the invoiceReceivedDate
	 */
	public void setInvoiceReceivedDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, INVOICERECEIVEDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.invoiceReceivedDate</code> attribute. 
	 * @param value the invoiceReceivedDate
	 */
	public void setInvoiceReceivedDate(final Date value)
	{
		setInvoiceReceivedDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.netPayable</code> attribute.
	 * @return the netPayable
	 */
	public Double getNetPayable(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.netPayable</code> attribute.
	 * @return the netPayable
	 */
	public Double getNetPayable()
	{
		return getNetPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.netPayable</code> attribute. 
	 * @return the netPayable
	 */
	public double getNetPayableAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetPayable( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.netPayable</code> attribute. 
	 * @return the netPayable
	 */
	public double getNetPayableAsPrimitive()
	{
		return getNetPayableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.netPayable</code> attribute. 
	 * @param value the netPayable
	 */
	public void setNetPayable(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETPAYABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.netPayable</code> attribute. 
	 * @param value the netPayable
	 */
	public void setNetPayable(final Double value)
	{
		setNetPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.netPayable</code> attribute. 
	 * @param value the netPayable
	 */
	public void setNetPayable(final SessionContext ctx, final double value)
	{
		setNetPayable( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.netPayable</code> attribute. 
	 * @param value the netPayable
	 */
	public void setNetPayable(final double value)
	{
		setNetPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.paymentDueDate</code> attribute.
	 * @return the paymentDueDate
	 */
	public Date getPaymentDueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PAYMENTDUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.paymentDueDate</code> attribute.
	 * @return the paymentDueDate
	 */
	public Date getPaymentDueDate()
	{
		return getPaymentDueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.paymentDueDate</code> attribute. 
	 * @param value the paymentDueDate
	 */
	public void setPaymentDueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PAYMENTDUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.paymentDueDate</code> attribute. 
	 * @param value the paymentDueDate
	 */
	public void setPaymentDueDate(final Date value)
	{
		setPaymentDueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.serviceOrder</code> attribute.
	 * @return the serviceOrder
	 */
	public Collection<ServiceOrder> getServiceOrder(final SessionContext ctx)
	{
		return SERVICEORDERHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.serviceOrder</code> attribute.
	 * @return the serviceOrder
	 */
	public Collection<ServiceOrder> getServiceOrder()
	{
		return getServiceOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.serviceOrder</code> attribute. 
	 * @param value the serviceOrder
	 */
	public void setServiceOrder(final SessionContext ctx, final Collection<ServiceOrder> value)
	{
		SERVICEORDERHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.serviceOrder</code> attribute. 
	 * @param value the serviceOrder
	 */
	public void setServiceOrder(final Collection<ServiceOrder> value)
	{
		setServiceOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to serviceOrder. 
	 * @param value the item to add to serviceOrder
	 */
	public void addToServiceOrder(final SessionContext ctx, final ServiceOrder value)
	{
		SERVICEORDERHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to serviceOrder. 
	 * @param value the item to add to serviceOrder
	 */
	public void addToServiceOrder(final ServiceOrder value)
	{
		addToServiceOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from serviceOrder. 
	 * @param value the item to remove from serviceOrder
	 */
	public void removeFromServiceOrder(final SessionContext ctx, final ServiceOrder value)
	{
		SERVICEORDERHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from serviceOrder. 
	 * @param value the item to remove from serviceOrder
	 */
	public void removeFromServiceOrder(final ServiceOrder value)
	{
		removeFromServiceOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.serviceOrderAmount</code> attribute.
	 * @return the serviceOrderAmount
	 */
	public Double getServiceOrderAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, SERVICEORDERAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.serviceOrderAmount</code> attribute.
	 * @return the serviceOrderAmount
	 */
	public Double getServiceOrderAmount()
	{
		return getServiceOrderAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.serviceOrderAmount</code> attribute. 
	 * @return the serviceOrderAmount
	 */
	public double getServiceOrderAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getServiceOrderAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.serviceOrderAmount</code> attribute. 
	 * @return the serviceOrderAmount
	 */
	public double getServiceOrderAmountAsPrimitive()
	{
		return getServiceOrderAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.serviceOrderAmount</code> attribute. 
	 * @param value the serviceOrderAmount
	 */
	public void setServiceOrderAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, SERVICEORDERAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.serviceOrderAmount</code> attribute. 
	 * @param value the serviceOrderAmount
	 */
	public void setServiceOrderAmount(final Double value)
	{
		setServiceOrderAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.serviceOrderAmount</code> attribute. 
	 * @param value the serviceOrderAmount
	 */
	public void setServiceOrderAmount(final SessionContext ctx, final double value)
	{
		setServiceOrderAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.serviceOrderAmount</code> attribute. 
	 * @param value the serviceOrderAmount
	 */
	public void setServiceOrderAmount(final double value)
	{
		setServiceOrderAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.totalCommission</code> attribute.
	 * @return the totalCommission
	 */
	public Double getTotalCommission(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALCOMMISSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.totalCommission</code> attribute.
	 * @return the totalCommission
	 */
	public Double getTotalCommission()
	{
		return getTotalCommission( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.totalCommission</code> attribute. 
	 * @return the totalCommission
	 */
	public double getTotalCommissionAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalCommission( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.totalCommission</code> attribute. 
	 * @return the totalCommission
	 */
	public double getTotalCommissionAsPrimitive()
	{
		return getTotalCommissionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.totalCommission</code> attribute. 
	 * @param value the totalCommission
	 */
	public void setTotalCommission(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALCOMMISSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.totalCommission</code> attribute. 
	 * @param value the totalCommission
	 */
	public void setTotalCommission(final Double value)
	{
		setTotalCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.totalCommission</code> attribute. 
	 * @param value the totalCommission
	 */
	public void setTotalCommission(final SessionContext ctx, final double value)
	{
		setTotalCommission( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.totalCommission</code> attribute. 
	 * @param value the totalCommission
	 */
	public void setTotalCommission(final double value)
	{
		setTotalCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.totalCost</code> attribute.
	 * @return the totalCost
	 */
	public Double getTotalCost(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TOTALCOST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.totalCost</code> attribute.
	 * @return the totalCost
	 */
	public Double getTotalCost()
	{
		return getTotalCost( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.totalCost</code> attribute. 
	 * @return the totalCost
	 */
	public double getTotalCostAsPrimitive(final SessionContext ctx)
	{
		Double value = getTotalCost( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.totalCost</code> attribute. 
	 * @return the totalCost
	 */
	public double getTotalCostAsPrimitive()
	{
		return getTotalCostAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.totalCost</code> attribute. 
	 * @param value the totalCost
	 */
	public void setTotalCost(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TOTALCOST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.totalCost</code> attribute. 
	 * @param value the totalCost
	 */
	public void setTotalCost(final Double value)
	{
		setTotalCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.totalCost</code> attribute. 
	 * @param value the totalCost
	 */
	public void setTotalCost(final SessionContext ctx, final double value)
	{
		setTotalCost( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.totalCost</code> attribute. 
	 * @param value the totalCost
	 */
	public void setTotalCost(final double value)
	{
		setTotalCost( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.upload</code> attribute.
	 * @return the upload
	 */
	public Media getUpload(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, UPLOAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInvoice.upload</code> attribute.
	 * @return the upload
	 */
	public Media getUpload()
	{
		return getUpload( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.upload</code> attribute. 
	 * @param value the upload
	 */
	public void setUpload(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, UPLOAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInvoice.upload</code> attribute. 
	 * @param value the upload
	 */
	public void setUpload(final Media value)
	{
		setUpload( getSession().getSessionContext(), value );
	}
	
}
