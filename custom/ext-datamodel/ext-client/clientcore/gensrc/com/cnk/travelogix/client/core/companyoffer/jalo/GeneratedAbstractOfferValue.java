/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.AbstractOfferValue AbstractOfferValue}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractOfferValue extends GenericItem
{
	/** Qualifier of the <code>AbstractOfferValue.priceComponent</code> attribute **/
	public static final String PRICECOMPONENT = "priceComponent";
	/** Qualifier of the <code>AbstractOfferValue.offerApplicableOn</code> attribute **/
	public static final String OFFERAPPLICABLEON = "offerApplicableOn";
	/** Qualifier of the <code>AbstractOfferValue.discountCalculatedOn</code> attribute **/
	public static final String DISCOUNTCALCULATEDON = "discountCalculatedOn";
	/** Qualifier of the <code>AbstractOfferValue.thresholdType</code> attribute **/
	public static final String THRESHOLDTYPE = "thresholdType";
	/** Qualifier of the <code>AbstractOfferValue.discountValue</code> attribute **/
	public static final String DISCOUNTVALUE = "discountValue";
	/** Qualifier of the <code>AbstractOfferValue.offerValueRange</code> attribute **/
	public static final String OFFERVALUERANGE = "offerValueRange";
	/** Qualifier of the <code>AbstractOfferValue.condition</code> attribute **/
	public static final String CONDITION = "condition";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRICECOMPONENT, AttributeMode.INITIAL);
		tmp.put(OFFERAPPLICABLEON, AttributeMode.INITIAL);
		tmp.put(DISCOUNTCALCULATEDON, AttributeMode.INITIAL);
		tmp.put(THRESHOLDTYPE, AttributeMode.INITIAL);
		tmp.put(DISCOUNTVALUE, AttributeMode.INITIAL);
		tmp.put(OFFERVALUERANGE, AttributeMode.INITIAL);
		tmp.put(CONDITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.condition</code> attribute.
	 * @return the condition
	 */
	public EnumerationValue getCondition(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.condition</code> attribute.
	 * @return the condition
	 */
	public EnumerationValue getCondition()
	{
		return getCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.condition</code> attribute. 
	 * @param value the condition
	 */
	public void setCondition(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.condition</code> attribute. 
	 * @param value the condition
	 */
	public void setCondition(final EnumerationValue value)
	{
		setCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISCOUNTCALCULATEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.discountCalculatedOn</code> attribute.
	 * @return the discountCalculatedOn
	 */
	public EnumerationValue getDiscountCalculatedOn()
	{
		return getDiscountCalculatedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISCOUNTCALCULATEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.discountCalculatedOn</code> attribute. 
	 * @param value the discountCalculatedOn
	 */
	public void setDiscountCalculatedOn(final EnumerationValue value)
	{
		setDiscountCalculatedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.discountValue</code> attribute.
	 * @return the discountValue
	 */
	public Double getDiscountValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DISCOUNTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.discountValue</code> attribute.
	 * @return the discountValue
	 */
	public Double getDiscountValue()
	{
		return getDiscountValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.discountValue</code> attribute. 
	 * @return the discountValue
	 */
	public double getDiscountValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getDiscountValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.discountValue</code> attribute. 
	 * @return the discountValue
	 */
	public double getDiscountValueAsPrimitive()
	{
		return getDiscountValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.discountValue</code> attribute. 
	 * @param value the discountValue
	 */
	public void setDiscountValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DISCOUNTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.discountValue</code> attribute. 
	 * @param value the discountValue
	 */
	public void setDiscountValue(final Double value)
	{
		setDiscountValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.discountValue</code> attribute. 
	 * @param value the discountValue
	 */
	public void setDiscountValue(final SessionContext ctx, final double value)
	{
		setDiscountValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.discountValue</code> attribute. 
	 * @param value the discountValue
	 */
	public void setDiscountValue(final double value)
	{
		setDiscountValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.offerApplicableOn</code> attribute.
	 * @return the offerApplicableOn
	 */
	public EnumerationValue getOfferApplicableOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERAPPLICABLEON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.offerApplicableOn</code> attribute.
	 * @return the offerApplicableOn
	 */
	public EnumerationValue getOfferApplicableOn()
	{
		return getOfferApplicableOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.offerApplicableOn</code> attribute. 
	 * @param value the offerApplicableOn
	 */
	public void setOfferApplicableOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERAPPLICABLEON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.offerApplicableOn</code> attribute. 
	 * @param value the offerApplicableOn
	 */
	public void setOfferApplicableOn(final EnumerationValue value)
	{
		setOfferApplicableOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.offerValueRange</code> attribute.
	 * @return the offerValueRange
	 */
	public EnumerationValue getOfferValueRange(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERVALUERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.offerValueRange</code> attribute.
	 * @return the offerValueRange
	 */
	public EnumerationValue getOfferValueRange()
	{
		return getOfferValueRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.offerValueRange</code> attribute. 
	 * @param value the offerValueRange
	 */
	public void setOfferValueRange(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERVALUERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.offerValueRange</code> attribute. 
	 * @param value the offerValueRange
	 */
	public void setOfferValueRange(final EnumerationValue value)
	{
		setOfferValueRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public EnumerationValue getPriceComponent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public EnumerationValue getPriceComponent()
	{
		return getPriceComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final EnumerationValue value)
	{
		setPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.thresholdType</code> attribute.
	 * @return the thresholdType
	 */
	public EnumerationValue getThresholdType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractOfferValue.thresholdType</code> attribute.
	 * @return the thresholdType
	 */
	public EnumerationValue getThresholdType()
	{
		return getThresholdType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.thresholdType</code> attribute. 
	 * @param value the thresholdType
	 */
	public void setThresholdType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractOfferValue.thresholdType</code> attribute. 
	 * @param value the thresholdType
	 */
	public void setThresholdType(final EnumerationValue value)
	{
		setThresholdType( getSession().getSessionContext(), value );
	}
	
}
