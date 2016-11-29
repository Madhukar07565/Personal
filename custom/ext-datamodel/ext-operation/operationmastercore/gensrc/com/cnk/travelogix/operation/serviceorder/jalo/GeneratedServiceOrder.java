/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.serviceorder.jalo;

import com.cnk.travelogix.common.core.jalo.SupplierPriceDetails;
import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.serviceorder.jalo.PaymentAdvice;
import com.cnk.travelogix.operation.serviceorder.jalo.ServiceOrder;
import com.cnk.travelogix.operation.serviceorder.jalo.SupplierInvoice;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.serviceorder.jalo.ServiceOrder ServiceOrder}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedServiceOrder extends GenericItem
{
	/** Qualifier of the <code>ServiceOrder.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ServiceOrder.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>ServiceOrder.fso</code> attribute **/
	public static final String FSO = "fso";
	/** Qualifier of the <code>ServiceOrder.versionNumber</code> attribute **/
	public static final String VERSIONNUMBER = "versionNumber";
	/** Qualifier of the <code>ServiceOrder.serviceOrderStatus</code> attribute **/
	public static final String SERVICEORDERSTATUS = "serviceOrderStatus";
	/** Qualifier of the <code>ServiceOrder.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>ServiceOrder.travelCompletionDate</code> attribute **/
	public static final String TRAVELCOMPLETIONDATE = "travelCompletionDate";
	/** Qualifier of the <code>ServiceOrder.pricingDetails</code> attribute **/
	public static final String PRICINGDETAILS = "pricingDetails";
	/** Qualifier of the <code>ServiceOrder.paymentStatus</code> attribute **/
	public static final String PAYMENTSTATUS = "paymentStatus";
	/** Qualifier of the <code>ServiceOrder.orderEntry</code> attribute **/
	public static final String ORDERENTRY = "orderEntry";
	/** Qualifier of the <code>ServiceOrder.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>ServiceOrder.supplierInvoice</code> attribute **/
	public static final String SUPPLIERINVOICE = "supplierInvoice";
	/** Qualifier of the <code>ServiceOrder.paymentAdvice</code> attribute **/
	public static final String PAYMENTADVICE = "paymentAdvice";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERINVOICE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedServiceOrder> SUPPLIERINVOICEHANDLER = new BidirectionalOneToManyHandler<GeneratedServiceOrder>(
	OperationmastercoreConstants.TC.SERVICEORDER,
	false,
	"supplierInvoice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PAYMENTADVICE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedServiceOrder> PAYMENTADVICEHANDLER = new BidirectionalOneToManyHandler<GeneratedServiceOrder>(
	OperationmastercoreConstants.TC.SERVICEORDER,
	false,
	"paymentAdvice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(FSO, AttributeMode.INITIAL);
		tmp.put(VERSIONNUMBER, AttributeMode.INITIAL);
		tmp.put(SERVICEORDERSTATUS, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(TRAVELCOMPLETIONDATE, AttributeMode.INITIAL);
		tmp.put(PRICINGDETAILS, AttributeMode.INITIAL);
		tmp.put(PAYMENTSTATUS, AttributeMode.INITIAL);
		tmp.put(ORDERENTRY, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERINVOICE, AttributeMode.INITIAL);
		tmp.put(PAYMENTADVICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SUPPLIERINVOICEHANDLER.newInstance(ctx, allAttributes);
		PAYMENTADVICEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.fso</code> attribute.
	 * @return the fso
	 */
	public ServiceOrder getFso(final SessionContext ctx)
	{
		return (ServiceOrder)getProperty( ctx, FSO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.fso</code> attribute.
	 * @return the fso
	 */
	public ServiceOrder getFso()
	{
		return getFso( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.fso</code> attribute. 
	 * @param value the fso
	 */
	public void setFso(final SessionContext ctx, final ServiceOrder value)
	{
		setProperty(ctx, FSO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.fso</code> attribute. 
	 * @param value the fso
	 */
	public void setFso(final ServiceOrder value)
	{
		setFso( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.orderEntry</code> attribute.
	 * @return the orderEntry
	 */
	public AbstractOrderEntry getOrderEntry(final SessionContext ctx)
	{
		return (AbstractOrderEntry)getProperty( ctx, ORDERENTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.orderEntry</code> attribute.
	 * @return the orderEntry
	 */
	public AbstractOrderEntry getOrderEntry()
	{
		return getOrderEntry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.orderEntry</code> attribute. 
	 * @param value the orderEntry
	 */
	public void setOrderEntry(final SessionContext ctx, final AbstractOrderEntry value)
	{
		setProperty(ctx, ORDERENTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.orderEntry</code> attribute. 
	 * @param value the orderEntry
	 */
	public void setOrderEntry(final AbstractOrderEntry value)
	{
		setOrderEntry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.paymentAdvice</code> attribute.
	 * @return the paymentAdvice
	 */
	public PaymentAdvice getPaymentAdvice(final SessionContext ctx)
	{
		return (PaymentAdvice)getProperty( ctx, PAYMENTADVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.paymentAdvice</code> attribute.
	 * @return the paymentAdvice
	 */
	public PaymentAdvice getPaymentAdvice()
	{
		return getPaymentAdvice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.paymentAdvice</code> attribute. 
	 * @param value the paymentAdvice
	 */
	public void setPaymentAdvice(final SessionContext ctx, final PaymentAdvice value)
	{
		PAYMENTADVICEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.paymentAdvice</code> attribute. 
	 * @param value the paymentAdvice
	 */
	public void setPaymentAdvice(final PaymentAdvice value)
	{
		setPaymentAdvice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.paymentStatus</code> attribute.
	 * @return the paymentStatus
	 */
	public EnumerationValue getPaymentStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.paymentStatus</code> attribute.
	 * @return the paymentStatus
	 */
	public EnumerationValue getPaymentStatus()
	{
		return getPaymentStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.paymentStatus</code> attribute. 
	 * @param value the paymentStatus
	 */
	public void setPaymentStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.paymentStatus</code> attribute. 
	 * @param value the paymentStatus
	 */
	public void setPaymentStatus(final EnumerationValue value)
	{
		setPaymentStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.pricingDetails</code> attribute.
	 * @return the pricingDetails
	 */
	public SupplierPriceDetails getPricingDetails(final SessionContext ctx)
	{
		return (SupplierPriceDetails)getProperty( ctx, PRICINGDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.pricingDetails</code> attribute.
	 * @return the pricingDetails
	 */
	public SupplierPriceDetails getPricingDetails()
	{
		return getPricingDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.pricingDetails</code> attribute. 
	 * @param value the pricingDetails
	 */
	public void setPricingDetails(final SessionContext ctx, final SupplierPriceDetails value)
	{
		setProperty(ctx, PRICINGDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.pricingDetails</code> attribute. 
	 * @param value the pricingDetails
	 */
	public void setPricingDetails(final SupplierPriceDetails value)
	{
		setPricingDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.serviceOrderStatus</code> attribute.
	 * @return the serviceOrderStatus
	 */
	public EnumerationValue getServiceOrderStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SERVICEORDERSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.serviceOrderStatus</code> attribute.
	 * @return the serviceOrderStatus
	 */
	public EnumerationValue getServiceOrderStatus()
	{
		return getServiceOrderStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.serviceOrderStatus</code> attribute. 
	 * @param value the serviceOrderStatus
	 */
	public void setServiceOrderStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SERVICEORDERSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.serviceOrderStatus</code> attribute. 
	 * @param value the serviceOrderStatus
	 */
	public void setServiceOrderStatus(final EnumerationValue value)
	{
		setServiceOrderStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.supplierInvoice</code> attribute.
	 * @return the supplierInvoice
	 */
	public SupplierInvoice getSupplierInvoice(final SessionContext ctx)
	{
		return (SupplierInvoice)getProperty( ctx, SUPPLIERINVOICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.supplierInvoice</code> attribute.
	 * @return the supplierInvoice
	 */
	public SupplierInvoice getSupplierInvoice()
	{
		return getSupplierInvoice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.supplierInvoice</code> attribute. 
	 * @param value the supplierInvoice
	 */
	public void setSupplierInvoice(final SessionContext ctx, final SupplierInvoice value)
	{
		SUPPLIERINVOICEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.supplierInvoice</code> attribute. 
	 * @param value the supplierInvoice
	 */
	public void setSupplierInvoice(final SupplierInvoice value)
	{
		setSupplierInvoice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.travelCompletionDate</code> attribute.
	 * @return the travelCompletionDate
	 */
	public Date getTravelCompletionDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TRAVELCOMPLETIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.travelCompletionDate</code> attribute.
	 * @return the travelCompletionDate
	 */
	public Date getTravelCompletionDate()
	{
		return getTravelCompletionDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.travelCompletionDate</code> attribute. 
	 * @param value the travelCompletionDate
	 */
	public void setTravelCompletionDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TRAVELCOMPLETIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.travelCompletionDate</code> attribute. 
	 * @param value the travelCompletionDate
	 */
	public void setTravelCompletionDate(final Date value)
	{
		setTravelCompletionDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.versionNumber</code> attribute.
	 * @return the versionNumber
	 */
	public Double getVersionNumber(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VERSIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.versionNumber</code> attribute.
	 * @return the versionNumber
	 */
	public Double getVersionNumber()
	{
		return getVersionNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.versionNumber</code> attribute. 
	 * @return the versionNumber
	 */
	public double getVersionNumberAsPrimitive(final SessionContext ctx)
	{
		Double value = getVersionNumber( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceOrder.versionNumber</code> attribute. 
	 * @return the versionNumber
	 */
	public double getVersionNumberAsPrimitive()
	{
		return getVersionNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.versionNumber</code> attribute. 
	 * @param value the versionNumber
	 */
	public void setVersionNumber(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VERSIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.versionNumber</code> attribute. 
	 * @param value the versionNumber
	 */
	public void setVersionNumber(final Double value)
	{
		setVersionNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.versionNumber</code> attribute. 
	 * @param value the versionNumber
	 */
	public void setVersionNumber(final SessionContext ctx, final double value)
	{
		setVersionNumber( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceOrder.versionNumber</code> attribute. 
	 * @param value the versionNumber
	 */
	public void setVersionNumber(final double value)
	{
		setVersionNumber( getSession().getSessionContext(), value );
	}
	
}
