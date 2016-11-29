/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.credentials.core.indents.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.iata.jalo.AirlineIATAItem;
import com.cnk.travelogix.orgstructure.core.iata.jalo.IATAAgency;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.AbstractIndent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.payment.PaymentMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.credentials.core.indents.jalo.TicketCappingIndent TicketCappingIndent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTicketCappingIndent extends AbstractIndent
{
	/** Qualifier of the <code>TicketCappingIndent.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>TicketCappingIndent.airline</code> attribute **/
	public static final String AIRLINE = "airline";
	/** Qualifier of the <code>TicketCappingIndent.gds</code> attribute **/
	public static final String GDS = "gds";
	/** Qualifier of the <code>TicketCappingIndent.ticketCapping</code> attribute **/
	public static final String TICKETCAPPING = "ticketCapping";
	/** Qualifier of the <code>TicketCappingIndent.cappingAmount</code> attribute **/
	public static final String CAPPINGAMOUNT = "cappingAmount";
	/** Qualifier of the <code>TicketCappingIndent.paymentMode</code> attribute **/
	public static final String PAYMENTMODE = "paymentMode";
	/** Qualifier of the <code>TicketCappingIndent.iataAgency</code> attribute **/
	public static final String IATAAGENCY = "iataAgency";
	/** Qualifier of the <code>TicketCappingIndent.paymentRemarks</code> attribute **/
	public static final String PAYMENTREMARKS = "paymentRemarks";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractIndent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(AIRLINE, AttributeMode.INITIAL);
		tmp.put(GDS, AttributeMode.INITIAL);
		tmp.put(TICKETCAPPING, AttributeMode.INITIAL);
		tmp.put(CAPPINGAMOUNT, AttributeMode.INITIAL);
		tmp.put(PAYMENTMODE, AttributeMode.INITIAL);
		tmp.put(IATAAGENCY, AttributeMode.INITIAL);
		tmp.put(PAYMENTREMARKS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.airline</code> attribute.
	 * @return the airline
	 */
	public AirlineIATAItem getAirline(final SessionContext ctx)
	{
		return (AirlineIATAItem)getProperty( ctx, AIRLINE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.airline</code> attribute.
	 * @return the airline
	 */
	public AirlineIATAItem getAirline()
	{
		return getAirline( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.airline</code> attribute. 
	 * @param value the airline
	 */
	public void setAirline(final SessionContext ctx, final AirlineIATAItem value)
	{
		setProperty(ctx, AIRLINE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.airline</code> attribute. 
	 * @param value the airline
	 */
	public void setAirline(final AirlineIATAItem value)
	{
		setAirline( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.cappingAmount</code> attribute.
	 * @return the cappingAmount
	 */
	public Double getCappingAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CAPPINGAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.cappingAmount</code> attribute.
	 * @return the cappingAmount
	 */
	public Double getCappingAmount()
	{
		return getCappingAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.cappingAmount</code> attribute. 
	 * @return the cappingAmount
	 */
	public double getCappingAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getCappingAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.cappingAmount</code> attribute. 
	 * @return the cappingAmount
	 */
	public double getCappingAmountAsPrimitive()
	{
		return getCappingAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.cappingAmount</code> attribute. 
	 * @param value the cappingAmount
	 */
	public void setCappingAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CAPPINGAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.cappingAmount</code> attribute. 
	 * @param value the cappingAmount
	 */
	public void setCappingAmount(final Double value)
	{
		setCappingAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.cappingAmount</code> attribute. 
	 * @param value the cappingAmount
	 */
	public void setCappingAmount(final SessionContext ctx, final double value)
	{
		setCappingAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.cappingAmount</code> attribute. 
	 * @param value the cappingAmount
	 */
	public void setCappingAmount(final double value)
	{
		setCappingAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.gds</code> attribute.
	 * @return the gds
	 */
	public Supplier getGds(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, GDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.gds</code> attribute.
	 * @return the gds
	 */
	public Supplier getGds()
	{
		return getGds( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.gds</code> attribute. 
	 * @param value the gds
	 */
	public void setGds(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, GDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.gds</code> attribute. 
	 * @param value the gds
	 */
	public void setGds(final Supplier value)
	{
		setGds( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.iataAgency</code> attribute.
	 * @return the iataAgency
	 */
	public IATAAgency getIataAgency(final SessionContext ctx)
	{
		return (IATAAgency)getProperty( ctx, IATAAGENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.iataAgency</code> attribute.
	 * @return the iataAgency
	 */
	public IATAAgency getIataAgency()
	{
		return getIataAgency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.iataAgency</code> attribute. 
	 * @param value the iataAgency
	 */
	public void setIataAgency(final SessionContext ctx, final IATAAgency value)
	{
		setProperty(ctx, IATAAGENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.iataAgency</code> attribute. 
	 * @param value the iataAgency
	 */
	public void setIataAgency(final IATAAgency value)
	{
		setIataAgency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.paymentMode</code> attribute.
	 * @return the paymentMode
	 */
	public PaymentMode getPaymentMode(final SessionContext ctx)
	{
		return (PaymentMode)getProperty( ctx, PAYMENTMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.paymentMode</code> attribute.
	 * @return the paymentMode
	 */
	public PaymentMode getPaymentMode()
	{
		return getPaymentMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.paymentMode</code> attribute. 
	 * @param value the paymentMode
	 */
	public void setPaymentMode(final SessionContext ctx, final PaymentMode value)
	{
		setProperty(ctx, PAYMENTMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.paymentMode</code> attribute. 
	 * @param value the paymentMode
	 */
	public void setPaymentMode(final PaymentMode value)
	{
		setPaymentMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.paymentRemarks</code> attribute.
	 * @return the paymentRemarks
	 */
	public String getPaymentRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTREMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.paymentRemarks</code> attribute.
	 * @return the paymentRemarks
	 */
	public String getPaymentRemarks()
	{
		return getPaymentRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.paymentRemarks</code> attribute. 
	 * @param value the paymentRemarks
	 */
	public void setPaymentRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTREMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.paymentRemarks</code> attribute. 
	 * @param value the paymentRemarks
	 */
	public void setPaymentRemarks(final String value)
	{
		setPaymentRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.ticketCapping</code> attribute.
	 * @return the ticketCapping
	 */
	public Integer getTicketCapping(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TICKETCAPPING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.ticketCapping</code> attribute.
	 * @return the ticketCapping
	 */
	public Integer getTicketCapping()
	{
		return getTicketCapping( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.ticketCapping</code> attribute. 
	 * @return the ticketCapping
	 */
	public int getTicketCappingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTicketCapping( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketCappingIndent.ticketCapping</code> attribute. 
	 * @return the ticketCapping
	 */
	public int getTicketCappingAsPrimitive()
	{
		return getTicketCappingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.ticketCapping</code> attribute. 
	 * @param value the ticketCapping
	 */
	public void setTicketCapping(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TICKETCAPPING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.ticketCapping</code> attribute. 
	 * @param value the ticketCapping
	 */
	public void setTicketCapping(final Integer value)
	{
		setTicketCapping( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.ticketCapping</code> attribute. 
	 * @param value the ticketCapping
	 */
	public void setTicketCapping(final SessionContext ctx, final int value)
	{
		setTicketCapping( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketCappingIndent.ticketCapping</code> attribute. 
	 * @param value the ticketCapping
	 */
	public void setTicketCapping(final int value)
	{
		setTicketCapping( getSession().getSessionContext(), value );
	}
	
}
