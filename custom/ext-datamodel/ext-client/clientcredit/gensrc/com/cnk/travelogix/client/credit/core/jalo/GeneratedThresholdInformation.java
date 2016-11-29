/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.ThresholdInformation ThresholdInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedThresholdInformation extends GenericItem
{
	/** Qualifier of the <code>ThresholdInformation.thresholdIn</code> attribute **/
	public static final String THRESHOLDIN = "thresholdIn";
	/** Qualifier of the <code>ThresholdInformation.thresholdValue</code> attribute **/
	public static final String THRESHOLDVALUE = "thresholdValue";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(THRESHOLDIN, AttributeMode.INITIAL);
		tmp.put(THRESHOLDVALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ThresholdInformation.thresholdIn</code> attribute.
	 * @return the thresholdIn - Threshold In for credit limit
	 */
	public EnumerationValue getThresholdIn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ThresholdInformation.thresholdIn</code> attribute.
	 * @return the thresholdIn - Threshold In for credit limit
	 */
	public EnumerationValue getThresholdIn()
	{
		return getThresholdIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ThresholdInformation.thresholdIn</code> attribute. 
	 * @param value the thresholdIn - Threshold In for credit limit
	 */
	public void setThresholdIn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ThresholdInformation.thresholdIn</code> attribute. 
	 * @param value the thresholdIn - Threshold In for credit limit
	 */
	public void setThresholdIn(final EnumerationValue value)
	{
		setThresholdIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ThresholdInformation.thresholdValue</code> attribute.
	 * @return the thresholdValue - Threshold value for credit limit
	 */
	public BigDecimal getThresholdValue(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, THRESHOLDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ThresholdInformation.thresholdValue</code> attribute.
	 * @return the thresholdValue - Threshold value for credit limit
	 */
	public BigDecimal getThresholdValue()
	{
		return getThresholdValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ThresholdInformation.thresholdValue</code> attribute. 
	 * @param value the thresholdValue - Threshold value for credit limit
	 */
	public void setThresholdValue(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, THRESHOLDVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ThresholdInformation.thresholdValue</code> attribute. 
	 * @param value the thresholdValue - Threshold value for credit limit
	 */
	public void setThresholdValue(final BigDecimal value)
	{
		setThresholdValue( getSession().getSessionContext(), value );
	}
	
}
