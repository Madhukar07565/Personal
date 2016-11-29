/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.TravelogixRuleType;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.RuleInfo RuleInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRuleInfo extends GenericItem
{
	/** Qualifier of the <code>RuleInfo.ruleType</code> attribute **/
	public static final String RULETYPE = "ruleType";
	/** Qualifier of the <code>RuleInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RULETYPE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleInfo.ruleType</code> attribute.
	 * @return the ruleType - Rule Type
	 */
	public TravelogixRuleType getRuleType(final SessionContext ctx)
	{
		return (TravelogixRuleType)getProperty( ctx, RULETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RuleInfo.ruleType</code> attribute.
	 * @return the ruleType - Rule Type
	 */
	public TravelogixRuleType getRuleType()
	{
		return getRuleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleInfo.ruleType</code> attribute. 
	 * @param value the ruleType - Rule Type
	 */
	public void setRuleType(final SessionContext ctx, final TravelogixRuleType value)
	{
		setProperty(ctx, RULETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RuleInfo.ruleType</code> attribute. 
	 * @param value the ruleType - Rule Type
	 */
	public void setRuleType(final TravelogixRuleType value)
	{
		setRuleType( getSession().getSessionContext(), value );
	}
	
}
