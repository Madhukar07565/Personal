/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.clienttype.jalo.TravelogixClientType;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.ClientTier ClientTier}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientTier extends TravelogixClientType
{
	/** Qualifier of the <code>ClientTier.tierNumber</code> attribute **/
	public static final String TIERNUMBER = "tierNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TravelogixClientType.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TIERNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientTier.tierNumber</code> attribute.
	 * @return the tierNumber
	 */
	public Integer getTierNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientTier.tierNumber</code> attribute.
	 * @return the tierNumber
	 */
	public Integer getTierNumber()
	{
		return getTierNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientTier.tierNumber</code> attribute. 
	 * @return the tierNumber
	 */
	public int getTierNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTierNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientTier.tierNumber</code> attribute. 
	 * @return the tierNumber
	 */
	public int getTierNumberAsPrimitive()
	{
		return getTierNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientTier.tierNumber</code> attribute. 
	 * @param value the tierNumber
	 */
	public void setTierNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientTier.tierNumber</code> attribute. 
	 * @param value the tierNumber
	 */
	public void setTierNumber(final Integer value)
	{
		setTierNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientTier.tierNumber</code> attribute. 
	 * @param value the tierNumber
	 */
	public void setTierNumber(final SessionContext ctx, final int value)
	{
		setTierNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientTier.tierNumber</code> attribute. 
	 * @param value the tierNumber
	 */
	public void setTierNumber(final int value)
	{
		setTierNumber( getSession().getSessionContext(), value );
	}
	
}
