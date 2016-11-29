/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.CommonPolicyCharges;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.PolicyFixedCharges PolicyFixedCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPolicyFixedCharges extends GenericItem
{
	/** Qualifier of the <code>PolicyFixedCharges.bufferPeriod</code> attribute **/
	public static final String BUFFERPERIOD = "bufferPeriod";
	/** Qualifier of the <code>PolicyFixedCharges.commonPolicyCharges</code> attribute **/
	public static final String COMMONPOLICYCHARGES = "commonPolicyCharges";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BUFFERPERIOD, AttributeMode.INITIAL);
		tmp.put(COMMONPOLICYCHARGES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyFixedCharges.bufferPeriod</code> attribute.
	 * @return the bufferPeriod - Policy buffer Period
	 */
	public Integer getBufferPeriod(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BUFFERPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyFixedCharges.bufferPeriod</code> attribute.
	 * @return the bufferPeriod - Policy buffer Period
	 */
	public Integer getBufferPeriod()
	{
		return getBufferPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyFixedCharges.bufferPeriod</code> attribute. 
	 * @return the bufferPeriod - Policy buffer Period
	 */
	public int getBufferPeriodAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBufferPeriod( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyFixedCharges.bufferPeriod</code> attribute. 
	 * @return the bufferPeriod - Policy buffer Period
	 */
	public int getBufferPeriodAsPrimitive()
	{
		return getBufferPeriodAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyFixedCharges.bufferPeriod</code> attribute. 
	 * @param value the bufferPeriod - Policy buffer Period
	 */
	public void setBufferPeriod(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BUFFERPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyFixedCharges.bufferPeriod</code> attribute. 
	 * @param value the bufferPeriod - Policy buffer Period
	 */
	public void setBufferPeriod(final Integer value)
	{
		setBufferPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyFixedCharges.bufferPeriod</code> attribute. 
	 * @param value the bufferPeriod - Policy buffer Period
	 */
	public void setBufferPeriod(final SessionContext ctx, final int value)
	{
		setBufferPeriod( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyFixedCharges.bufferPeriod</code> attribute. 
	 * @param value the bufferPeriod - Policy buffer Period
	 */
	public void setBufferPeriod(final int value)
	{
		setBufferPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyFixedCharges.commonPolicyCharges</code> attribute.
	 * @return the commonPolicyCharges - Common Policy Charges
	 */
	public CommonPolicyCharges getCommonPolicyCharges(final SessionContext ctx)
	{
		return (CommonPolicyCharges)getProperty( ctx, COMMONPOLICYCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyFixedCharges.commonPolicyCharges</code> attribute.
	 * @return the commonPolicyCharges - Common Policy Charges
	 */
	public CommonPolicyCharges getCommonPolicyCharges()
	{
		return getCommonPolicyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyFixedCharges.commonPolicyCharges</code> attribute. 
	 * @param value the commonPolicyCharges - Common Policy Charges
	 */
	public void setCommonPolicyCharges(final SessionContext ctx, final CommonPolicyCharges value)
	{
		setProperty(ctx, COMMONPOLICYCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyFixedCharges.commonPolicyCharges</code> attribute. 
	 * @param value the commonPolicyCharges - Common Policy Charges
	 */
	public void setCommonPolicyCharges(final CommonPolicyCharges value)
	{
		setCommonPolicyCharges( getSession().getSessionContext(), value );
	}
	
}
