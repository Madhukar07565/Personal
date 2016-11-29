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
 * Generated class for type {@link com.cnk.travelogix.supplier.masterdata.core.policy.AccoDynamicPolicy AccoDynamicPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoDynamicPolicy extends AbstractDynamicPolicy
{
	/** Qualifier of the <code>AccoDynamicPolicy.chargeNight</code> attribute **/
	public static final String CHARGENIGHT = "chargeNight";
	/** Qualifier of the <code>AccoDynamicPolicy.perRoom</code> attribute **/
	public static final String PERROOM = "perRoom";
	/** Qualifier of the <code>AccoDynamicPolicy.perPerson</code> attribute **/
	public static final String PERPERSON = "perPerson";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDynamicPolicy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CHARGENIGHT, AttributeMode.INITIAL);
		tmp.put(PERROOM, AttributeMode.INITIAL);
		tmp.put(PERPERSON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.chargeNight</code> attribute.
	 * @return the chargeNight
	 */
	public Double getChargeNight(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CHARGENIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.chargeNight</code> attribute.
	 * @return the chargeNight
	 */
	public Double getChargeNight()
	{
		return getChargeNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.chargeNight</code> attribute. 
	 * @return the chargeNight
	 */
	public double getChargeNightAsPrimitive(final SessionContext ctx)
	{
		Double value = getChargeNight( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.chargeNight</code> attribute. 
	 * @return the chargeNight
	 */
	public double getChargeNightAsPrimitive()
	{
		return getChargeNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.chargeNight</code> attribute. 
	 * @param value the chargeNight
	 */
	public void setChargeNight(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CHARGENIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.chargeNight</code> attribute. 
	 * @param value the chargeNight
	 */
	public void setChargeNight(final Double value)
	{
		setChargeNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.chargeNight</code> attribute. 
	 * @param value the chargeNight
	 */
	public void setChargeNight(final SessionContext ctx, final double value)
	{
		setChargeNight( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.chargeNight</code> attribute. 
	 * @param value the chargeNight
	 */
	public void setChargeNight(final double value)
	{
		setChargeNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.perPerson</code> attribute.
	 * @return the perPerson
	 */
	public Boolean isPerPerson(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERPERSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.perPerson</code> attribute.
	 * @return the perPerson
	 */
	public Boolean isPerPerson()
	{
		return isPerPerson( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.perPerson</code> attribute. 
	 * @return the perPerson
	 */
	public boolean isPerPersonAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerPerson( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.perPerson</code> attribute. 
	 * @return the perPerson
	 */
	public boolean isPerPersonAsPrimitive()
	{
		return isPerPersonAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERPERSON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final Boolean value)
	{
		setPerPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final SessionContext ctx, final boolean value)
	{
		setPerPerson( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final boolean value)
	{
		setPerPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.perRoom</code> attribute.
	 * @return the perRoom
	 */
	public Boolean isPerRoom(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERROOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.perRoom</code> attribute.
	 * @return the perRoom
	 */
	public Boolean isPerRoom()
	{
		return isPerRoom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.perRoom</code> attribute. 
	 * @return the perRoom
	 */
	public boolean isPerRoomAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerRoom( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoDynamicPolicy.perRoom</code> attribute. 
	 * @return the perRoom
	 */
	public boolean isPerRoomAsPrimitive()
	{
		return isPerRoomAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.perRoom</code> attribute. 
	 * @param value the perRoom
	 */
	public void setPerRoom(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERROOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.perRoom</code> attribute. 
	 * @param value the perRoom
	 */
	public void setPerRoom(final Boolean value)
	{
		setPerRoom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.perRoom</code> attribute. 
	 * @param value the perRoom
	 */
	public void setPerRoom(final SessionContext ctx, final boolean value)
	{
		setPerRoom( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoDynamicPolicy.perRoom</code> attribute. 
	 * @param value the perRoom
	 */
	public void setPerRoom(final boolean value)
	{
		setPerRoom( getSession().getSessionContext(), value );
	}
	
}
