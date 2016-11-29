/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig AbstractAdvDefConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractAdvDefConfig extends GenericItem
{
	/** Qualifier of the <code>AbstractAdvDefConfig.exclusion</code> attribute **/
	public static final String EXCLUSION = "exclusion";
	/** Qualifier of the <code>AbstractAdvDefConfig.trigger</code> attribute **/
	public static final String TRIGGER = "trigger";
	/** Qualifier of the <code>AbstractAdvDefConfig.payout</code> attribute **/
	public static final String PAYOUT = "payout";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(EXCLUSION, AttributeMode.INITIAL);
		tmp.put(TRIGGER, AttributeMode.INITIAL);
		tmp.put(PAYOUT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.exclusion</code> attribute.
	 * @return the exclusion - Defines IncExc Type
	 */
	public Boolean isExclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EXCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.exclusion</code> attribute.
	 * @return the exclusion - Defines IncExc Type
	 */
	public Boolean isExclusion()
	{
		return isExclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.exclusion</code> attribute. 
	 * @return the exclusion - Defines IncExc Type
	 */
	public boolean isExclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isExclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.exclusion</code> attribute. 
	 * @return the exclusion - Defines IncExc Type
	 */
	public boolean isExclusionAsPrimitive()
	{
		return isExclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.exclusion</code> attribute. 
	 * @param value the exclusion - Defines IncExc Type
	 */
	public void setExclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EXCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.exclusion</code> attribute. 
	 * @param value the exclusion - Defines IncExc Type
	 */
	public void setExclusion(final Boolean value)
	{
		setExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.exclusion</code> attribute. 
	 * @param value the exclusion - Defines IncExc Type
	 */
	public void setExclusion(final SessionContext ctx, final boolean value)
	{
		setExclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.exclusion</code> attribute. 
	 * @param value the exclusion - Defines IncExc Type
	 */
	public void setExclusion(final boolean value)
	{
		setExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.payout</code> attribute.
	 * @return the payout
	 */
	public Boolean isPayout(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.payout</code> attribute.
	 * @return the payout
	 */
	public Boolean isPayout()
	{
		return isPayout( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.payout</code> attribute. 
	 * @return the payout
	 */
	public boolean isPayoutAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayout( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.payout</code> attribute. 
	 * @return the payout
	 */
	public boolean isPayoutAsPrimitive()
	{
		return isPayoutAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.payout</code> attribute. 
	 * @param value the payout
	 */
	public void setPayout(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.payout</code> attribute. 
	 * @param value the payout
	 */
	public void setPayout(final Boolean value)
	{
		setPayout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.payout</code> attribute. 
	 * @param value the payout
	 */
	public void setPayout(final SessionContext ctx, final boolean value)
	{
		setPayout( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.payout</code> attribute. 
	 * @param value the payout
	 */
	public void setPayout(final boolean value)
	{
		setPayout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.trigger</code> attribute.
	 * @return the trigger
	 */
	public Boolean isTrigger(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRIGGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.trigger</code> attribute.
	 * @return the trigger
	 */
	public Boolean isTrigger()
	{
		return isTrigger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.trigger</code> attribute. 
	 * @return the trigger
	 */
	public boolean isTriggerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTrigger( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAdvDefConfig.trigger</code> attribute. 
	 * @return the trigger
	 */
	public boolean isTriggerAsPrimitive()
	{
		return isTriggerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.trigger</code> attribute. 
	 * @param value the trigger
	 */
	public void setTrigger(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRIGGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.trigger</code> attribute. 
	 * @param value the trigger
	 */
	public void setTrigger(final Boolean value)
	{
		setTrigger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.trigger</code> attribute. 
	 * @param value the trigger
	 */
	public void setTrigger(final SessionContext ctx, final boolean value)
	{
		setTrigger( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAdvDefConfig.trigger</code> attribute. 
	 * @param value the trigger
	 */
	public void setTrigger(final boolean value)
	{
		setTrigger( getSession().getSessionContext(), value );
	}
	
}
