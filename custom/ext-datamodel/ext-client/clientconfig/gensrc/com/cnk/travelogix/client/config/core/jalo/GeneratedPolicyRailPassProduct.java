/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.PolicyRailPassProduct PolicyRailPassProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPolicyRailPassProduct extends GenericItem
{
	/** Qualifier of the <code>PolicyRailPassProduct.noOfDays</code> attribute **/
	public static final String NOOFDAYS = "noOfDays";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NOOFDAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailPassProduct.noOfDays</code> attribute.
	 * @return the noOfDays - Rail Pass Validity Days
	 */
	public Integer getNoOfDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailPassProduct.noOfDays</code> attribute.
	 * @return the noOfDays - Rail Pass Validity Days
	 */
	public Integer getNoOfDays()
	{
		return getNoOfDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailPassProduct.noOfDays</code> attribute. 
	 * @return the noOfDays - Rail Pass Validity Days
	 */
	public int getNoOfDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyRailPassProduct.noOfDays</code> attribute. 
	 * @return the noOfDays - Rail Pass Validity Days
	 */
	public int getNoOfDaysAsPrimitive()
	{
		return getNoOfDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailPassProduct.noOfDays</code> attribute. 
	 * @param value the noOfDays - Rail Pass Validity Days
	 */
	public void setNoOfDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailPassProduct.noOfDays</code> attribute. 
	 * @param value the noOfDays - Rail Pass Validity Days
	 */
	public void setNoOfDays(final Integer value)
	{
		setNoOfDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailPassProduct.noOfDays</code> attribute. 
	 * @param value the noOfDays - Rail Pass Validity Days
	 */
	public void setNoOfDays(final SessionContext ctx, final int value)
	{
		setNoOfDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyRailPassProduct.noOfDays</code> attribute. 
	 * @param value the noOfDays - Rail Pass Validity Days
	 */
	public void setNoOfDays(final int value)
	{
		setNoOfDays( getSession().getSessionContext(), value );
	}
	
}
