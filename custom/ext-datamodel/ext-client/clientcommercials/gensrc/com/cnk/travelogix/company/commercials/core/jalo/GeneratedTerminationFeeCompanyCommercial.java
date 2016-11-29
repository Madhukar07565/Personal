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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.TerminationFeeCompanyCommercial TerminationFeeCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTerminationFeeCompanyCommercial extends AbstractCompanyCommercial
{
	/** Qualifier of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute **/
	public static final String INTREST = "intrest";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(INTREST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute.
	 * @return the intrest
	 */
	public Double getIntrest(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, INTREST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute.
	 * @return the intrest
	 */
	public Double getIntrest()
	{
		return getIntrest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute. 
	 * @return the intrest
	 */
	public double getIntrestAsPrimitive(final SessionContext ctx)
	{
		Double value = getIntrest( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute. 
	 * @return the intrest
	 */
	public double getIntrestAsPrimitive()
	{
		return getIntrestAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute. 
	 * @param value the intrest
	 */
	public void setIntrest(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, INTREST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute. 
	 * @param value the intrest
	 */
	public void setIntrest(final Double value)
	{
		setIntrest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute. 
	 * @param value the intrest
	 */
	public void setIntrest(final SessionContext ctx, final double value)
	{
		setIntrest( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TerminationFeeCompanyCommercial.intrest</code> attribute. 
	 * @param value the intrest
	 */
	public void setIntrest(final double value)
	{
		setIntrest( getSession().getSessionContext(), value );
	}
	
}
