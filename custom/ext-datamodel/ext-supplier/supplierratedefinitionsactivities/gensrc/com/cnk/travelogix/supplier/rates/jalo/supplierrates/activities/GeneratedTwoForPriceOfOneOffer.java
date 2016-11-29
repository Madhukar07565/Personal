/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.FreeActivitiesOffer;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.TwoForPriceOfOneOffer TwoForPriceOfOneOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTwoForPriceOfOneOffer extends FreeActivitiesOffer
{
	/** Qualifier of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute **/
	public static final String DISCOUNTVALUE2 = "discountValue2";
	/** Qualifier of the <code>TwoForPriceOfOneOffer.thresholdType2</code> attribute **/
	public static final String THRESHOLDTYPE2 = "thresholdType2";
	/** Qualifier of the <code>TwoForPriceOfOneOffer.priceComponent2</code> attribute **/
	public static final String PRICECOMPONENT2 = "priceComponent2";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(FreeActivitiesOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DISCOUNTVALUE2, AttributeMode.INITIAL);
		tmp.put(THRESHOLDTYPE2, AttributeMode.INITIAL);
		tmp.put(PRICECOMPONENT2, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute.
	 * @return the discountValue2
	 */
	public Double getDiscountValue2(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DISCOUNTVALUE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute.
	 * @return the discountValue2
	 */
	public Double getDiscountValue2()
	{
		return getDiscountValue2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute. 
	 * @return the discountValue2
	 */
	public double getDiscountValue2AsPrimitive(final SessionContext ctx)
	{
		Double value = getDiscountValue2( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute. 
	 * @return the discountValue2
	 */
	public double getDiscountValue2AsPrimitive()
	{
		return getDiscountValue2AsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute. 
	 * @param value the discountValue2
	 */
	public void setDiscountValue2(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DISCOUNTVALUE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute. 
	 * @param value the discountValue2
	 */
	public void setDiscountValue2(final Double value)
	{
		setDiscountValue2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute. 
	 * @param value the discountValue2
	 */
	public void setDiscountValue2(final SessionContext ctx, final double value)
	{
		setDiscountValue2( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TwoForPriceOfOneOffer.discountValue2</code> attribute. 
	 * @param value the discountValue2
	 */
	public void setDiscountValue2(final double value)
	{
		setDiscountValue2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TwoForPriceOfOneOffer.priceComponent2</code> attribute.
	 * @return the priceComponent2
	 */
	public EnumerationValue getPriceComponent2(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICECOMPONENT2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TwoForPriceOfOneOffer.priceComponent2</code> attribute.
	 * @return the priceComponent2
	 */
	public EnumerationValue getPriceComponent2()
	{
		return getPriceComponent2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TwoForPriceOfOneOffer.priceComponent2</code> attribute. 
	 * @param value the priceComponent2
	 */
	public void setPriceComponent2(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICECOMPONENT2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TwoForPriceOfOneOffer.priceComponent2</code> attribute. 
	 * @param value the priceComponent2
	 */
	public void setPriceComponent2(final EnumerationValue value)
	{
		setPriceComponent2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TwoForPriceOfOneOffer.thresholdType2</code> attribute.
	 * @return the thresholdType2
	 */
	public EnumerationValue getThresholdType2(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDTYPE2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TwoForPriceOfOneOffer.thresholdType2</code> attribute.
	 * @return the thresholdType2
	 */
	public EnumerationValue getThresholdType2()
	{
		return getThresholdType2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TwoForPriceOfOneOffer.thresholdType2</code> attribute. 
	 * @param value the thresholdType2
	 */
	public void setThresholdType2(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDTYPE2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TwoForPriceOfOneOffer.thresholdType2</code> attribute. 
	 * @param value the thresholdType2
	 */
	public void setThresholdType2(final EnumerationValue value)
	{
		setThresholdType2( getSession().getSessionContext(), value );
	}
	
}
