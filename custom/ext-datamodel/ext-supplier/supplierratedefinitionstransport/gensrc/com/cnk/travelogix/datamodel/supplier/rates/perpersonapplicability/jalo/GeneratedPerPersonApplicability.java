/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.perpersonapplicability.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.abstractpriceapplicability.jalo.AbstractPriceApplicability;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.perpersonapplicability.jalo.PerPersonApplicability PerPersonApplicability}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPerPersonApplicability extends AbstractPriceApplicability
{
	/** Qualifier of the <code>PerPersonApplicability.rate</code> attribute **/
	public static final String RATE = "rate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPriceApplicability.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PerPersonApplicability.rate</code> attribute.
	 * @return the rate
	 */
	public Double getRate(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PerPersonApplicability.rate</code> attribute.
	 * @return the rate
	 */
	public Double getRate()
	{
		return getRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PerPersonApplicability.rate</code> attribute. 
	 * @return the rate
	 */
	public double getRateAsPrimitive(final SessionContext ctx)
	{
		Double value = getRate( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PerPersonApplicability.rate</code> attribute. 
	 * @return the rate
	 */
	public double getRateAsPrimitive()
	{
		return getRateAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PerPersonApplicability.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PerPersonApplicability.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final Double value)
	{
		setRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PerPersonApplicability.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final SessionContext ctx, final double value)
	{
		setRate( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PerPersonApplicability.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final double value)
	{
		setRate( getSession().getSessionContext(), value );
	}
	
}
