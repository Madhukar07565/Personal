/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.masterdata.core.policy;

import com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.masterdata.core.policy.CruiseDynamicPolicy CruiseDynamicPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseDynamicPolicy extends AbstractDynamicPolicy
{
	/** Qualifier of the <code>CruiseDynamicPolicy.perPassenger</code> attribute **/
	public static final String PERPASSENGER = "perPassenger";
	/** Qualifier of the <code>CruiseDynamicPolicy.perCabin</code> attribute **/
	public static final String PERCABIN = "perCabin";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDynamicPolicy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PERPASSENGER, AttributeMode.INITIAL);
		tmp.put(PERCABIN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDynamicPolicy.perCabin</code> attribute.
	 * @return the perCabin
	 */
	public Boolean isPerCabin(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCABIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDynamicPolicy.perCabin</code> attribute.
	 * @return the perCabin
	 */
	public Boolean isPerCabin()
	{
		return isPerCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDynamicPolicy.perCabin</code> attribute. 
	 * @return the perCabin
	 */
	public boolean isPerCabinAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerCabin( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDynamicPolicy.perCabin</code> attribute. 
	 * @return the perCabin
	 */
	public boolean isPerCabinAsPrimitive()
	{
		return isPerCabinAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDynamicPolicy.perCabin</code> attribute. 
	 * @param value the perCabin
	 */
	public void setPerCabin(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDynamicPolicy.perCabin</code> attribute. 
	 * @param value the perCabin
	 */
	public void setPerCabin(final Boolean value)
	{
		setPerCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDynamicPolicy.perCabin</code> attribute. 
	 * @param value the perCabin
	 */
	public void setPerCabin(final SessionContext ctx, final boolean value)
	{
		setPerCabin( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDynamicPolicy.perCabin</code> attribute. 
	 * @param value the perCabin
	 */
	public void setPerCabin(final boolean value)
	{
		setPerCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDynamicPolicy.perPassenger</code> attribute.
	 * @return the perPassenger
	 */
	public Boolean isPerPassenger(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERPASSENGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDynamicPolicy.perPassenger</code> attribute.
	 * @return the perPassenger
	 */
	public Boolean isPerPassenger()
	{
		return isPerPassenger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDynamicPolicy.perPassenger</code> attribute. 
	 * @return the perPassenger
	 */
	public boolean isPerPassengerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerPassenger( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseDynamicPolicy.perPassenger</code> attribute. 
	 * @return the perPassenger
	 */
	public boolean isPerPassengerAsPrimitive()
	{
		return isPerPassengerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDynamicPolicy.perPassenger</code> attribute. 
	 * @param value the perPassenger
	 */
	public void setPerPassenger(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERPASSENGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDynamicPolicy.perPassenger</code> attribute. 
	 * @param value the perPassenger
	 */
	public void setPerPassenger(final Boolean value)
	{
		setPerPassenger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDynamicPolicy.perPassenger</code> attribute. 
	 * @param value the perPassenger
	 */
	public void setPerPassenger(final SessionContext ctx, final boolean value)
	{
		setPerPassenger( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseDynamicPolicy.perPassenger</code> attribute. 
	 * @param value the perPassenger
	 */
	public void setPerPassenger(final boolean value)
	{
		setPerPassenger( getSession().getSessionContext(), value );
	}
	
}
