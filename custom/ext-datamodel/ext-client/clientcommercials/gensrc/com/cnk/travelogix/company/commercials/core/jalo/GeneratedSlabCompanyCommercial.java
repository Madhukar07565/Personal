/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.StandardDateRange;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.SlabCompanyCommercial SlabCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSlabCompanyCommercial extends AbstractCompanyCommercial
{
	/** Qualifier of the <code>SlabCompanyCommercial.cumulative</code> attribute **/
	public static final String CUMULATIVE = "cumulative";
	/** Qualifier of the <code>SlabCompanyCommercial.targetPeriod</code> attribute **/
	public static final String TARGETPERIOD = "targetPeriod";
	/** Qualifier of the <code>SlabCompanyCommercial.fromValue</code> attribute **/
	public static final String FROMVALUE = "fromValue";
	/** Qualifier of the <code>SlabCompanyCommercial.toValue</code> attribute **/
	public static final String TOVALUE = "toValue";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CUMULATIVE, AttributeMode.INITIAL);
		tmp.put(TARGETPERIOD, AttributeMode.INITIAL);
		tmp.put(FROMVALUE, AttributeMode.INITIAL);
		tmp.put(TOVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.cumulative</code> attribute.
	 * @return the cumulative
	 */
	public Boolean isCumulative(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CUMULATIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.cumulative</code> attribute.
	 * @return the cumulative
	 */
	public Boolean isCumulative()
	{
		return isCumulative( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.cumulative</code> attribute. 
	 * @return the cumulative
	 */
	public boolean isCumulativeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCumulative( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.cumulative</code> attribute. 
	 * @return the cumulative
	 */
	public boolean isCumulativeAsPrimitive()
	{
		return isCumulativeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.cumulative</code> attribute. 
	 * @param value the cumulative
	 */
	public void setCumulative(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CUMULATIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.cumulative</code> attribute. 
	 * @param value the cumulative
	 */
	public void setCumulative(final Boolean value)
	{
		setCumulative( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.cumulative</code> attribute. 
	 * @param value the cumulative
	 */
	public void setCumulative(final SessionContext ctx, final boolean value)
	{
		setCumulative( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.cumulative</code> attribute. 
	 * @param value the cumulative
	 */
	public void setCumulative(final boolean value)
	{
		setCumulative( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.fromValue</code> attribute.
	 * @return the fromValue
	 */
	public BigDecimal getFromValue(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, FROMVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.fromValue</code> attribute.
	 * @return the fromValue
	 */
	public BigDecimal getFromValue()
	{
		return getFromValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, FROMVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final BigDecimal value)
	{
		setFromValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.targetPeriod</code> attribute.
	 * @return the targetPeriod
	 */
	public StandardDateRange getTargetPeriod(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, TARGETPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.targetPeriod</code> attribute.
	 * @return the targetPeriod
	 */
	public StandardDateRange getTargetPeriod()
	{
		return getTargetPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.targetPeriod</code> attribute. 
	 * @param value the targetPeriod
	 */
	public void setTargetPeriod(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, TARGETPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.targetPeriod</code> attribute. 
	 * @param value the targetPeriod
	 */
	public void setTargetPeriod(final StandardDateRange value)
	{
		setTargetPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.toValue</code> attribute.
	 * @return the toValue
	 */
	public BigDecimal getToValue(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, TOVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCompanyCommercial.toValue</code> attribute.
	 * @return the toValue
	 */
	public BigDecimal getToValue()
	{
		return getToValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.toValue</code> attribute. 
	 * @param value the toValue
	 */
	public void setToValue(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, TOVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCompanyCommercial.toValue</code> attribute. 
	 * @param value the toValue
	 */
	public void setToValue(final BigDecimal value)
	{
		setToValue( getSession().getSessionContext(), value );
	}
	
}
