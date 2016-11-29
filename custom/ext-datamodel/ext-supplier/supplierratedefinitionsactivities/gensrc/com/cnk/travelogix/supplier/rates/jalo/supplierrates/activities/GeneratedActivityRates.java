/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRateDetailDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRates ActivityRates}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityRates extends GenericItem
{
	/** Qualifier of the <code>ActivityRates.costPerType</code> attribute **/
	public static final String COSTPERTYPE = "costPerType";
	/** Qualifier of the <code>ActivityRates.paxType</code> attribute **/
	public static final String PAXTYPE = "paxType";
	/** Qualifier of the <code>ActivityRates.ageDetail</code> attribute **/
	public static final String AGEDETAIL = "ageDetail";
	/** Qualifier of the <code>ActivityRates.ticketType</code> attribute **/
	public static final String TICKETTYPE = "ticketType";
	/** Qualifier of the <code>ActivityRates.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>ActivityRates.payOnArrival</code> attribute **/
	public static final String PAYONARRIVAL = "payOnArrival";
	/** Qualifier of the <code>ActivityRates.supplierRateDef</code> attribute **/
	public static final String SUPPLIERRATEDEF = "supplierRateDef";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERRATEDEF's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedActivityRates> SUPPLIERRATEDEFHANDLER = new BidirectionalOneToManyHandler<GeneratedActivityRates>(
	SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYRATES,
	false,
	"supplierRateDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COSTPERTYPE, AttributeMode.INITIAL);
		tmp.put(PAXTYPE, AttributeMode.INITIAL);
		tmp.put(AGEDETAIL, AttributeMode.INITIAL);
		tmp.put(TICKETTYPE, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(PAYONARRIVAL, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATEDEF, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.ageDetail</code> attribute.
	 * @return the ageDetail
	 */
	public AgeDetail getAgeDetail(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, AGEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.ageDetail</code> attribute.
	 * @return the ageDetail
	 */
	public AgeDetail getAgeDetail()
	{
		return getAgeDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.ageDetail</code> attribute. 
	 * @param value the ageDetail
	 */
	public void setAgeDetail(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, AGEDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.ageDetail</code> attribute. 
	 * @param value the ageDetail
	 */
	public void setAgeDetail(final AgeDetail value)
	{
		setAgeDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.costPerType</code> attribute.
	 * @return the costPerType
	 */
	public EnumerationValue getCostPerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COSTPERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.costPerType</code> attribute.
	 * @return the costPerType
	 */
	public EnumerationValue getCostPerType()
	{
		return getCostPerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.costPerType</code> attribute. 
	 * @param value the costPerType
	 */
	public void setCostPerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COSTPERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.costPerType</code> attribute. 
	 * @param value the costPerType
	 */
	public void setCostPerType(final EnumerationValue value)
	{
		setCostPerType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SUPPLIERRATEDEFHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.paxType</code> attribute.
	 * @return the paxType
	 */
	public EnumerationValue getPaxType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAXTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.paxType</code> attribute.
	 * @return the paxType
	 */
	public EnumerationValue getPaxType()
	{
		return getPaxType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.paxType</code> attribute. 
	 * @param value the paxType
	 */
	public void setPaxType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAXTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.paxType</code> attribute. 
	 * @param value the paxType
	 */
	public void setPaxType(final EnumerationValue value)
	{
		setPaxType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYONARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival()
	{
		return isPayOnArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayOnArrival( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive()
	{
		return isPayOnArrivalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYONARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final Boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final boolean value)
	{
		setPayOnArrival( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive()
	{
		return getPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final Double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final double value)
	{
		setPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.supplierRateDef</code> attribute.
	 * @return the supplierRateDef
	 */
	public ActivityRateDetailDefinition getSupplierRateDef(final SessionContext ctx)
	{
		return (ActivityRateDetailDefinition)getProperty( ctx, SUPPLIERRATEDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.supplierRateDef</code> attribute.
	 * @return the supplierRateDef
	 */
	public ActivityRateDetailDefinition getSupplierRateDef()
	{
		return getSupplierRateDef( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.supplierRateDef</code> attribute. 
	 * @param value the supplierRateDef
	 */
	public void setSupplierRateDef(final SessionContext ctx, final ActivityRateDetailDefinition value)
	{
		SUPPLIERRATEDEFHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.supplierRateDef</code> attribute. 
	 * @param value the supplierRateDef
	 */
	public void setSupplierRateDef(final ActivityRateDetailDefinition value)
	{
		setSupplierRateDef( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.ticketType</code> attribute.
	 * @return the ticketType
	 */
	public EnumerationValue getTicketType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TICKETTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRates.ticketType</code> attribute.
	 * @return the ticketType
	 */
	public EnumerationValue getTicketType()
	{
		return getTicketType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.ticketType</code> attribute. 
	 * @param value the ticketType
	 */
	public void setTicketType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TICKETTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRates.ticketType</code> attribute. 
	 * @param value the ticketType
	 */
	public void setTicketType(final EnumerationValue value)
	{
		setTicketType( getSession().getSessionContext(), value );
	}
	
}
