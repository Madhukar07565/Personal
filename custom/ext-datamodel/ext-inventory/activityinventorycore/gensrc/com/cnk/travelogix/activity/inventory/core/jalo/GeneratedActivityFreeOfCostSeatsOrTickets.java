/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.FreeOfCostSeatsOrTickets;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.activity.inventory.core.jalo.ActivityFreeOfCostSeatsOrTickets ActivityFreeOfCostSeatsOrTickets}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityFreeOfCostSeatsOrTickets extends FreeOfCostSeatsOrTickets
{
	/** Qualifier of the <code>ActivityFreeOfCostSeatsOrTickets.priceComponent</code> attribute **/
	public static final String PRICECOMPONENT = "priceComponent";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(FreeOfCostSeatsOrTickets.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRICECOMPONENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityFreeOfCostSeatsOrTickets.priceComponent</code> attribute.
	 * @return the priceComponent - Price Component
	 */
	public EnumerationValue getPriceComponent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityFreeOfCostSeatsOrTickets.priceComponent</code> attribute.
	 * @return the priceComponent - Price Component
	 */
	public EnumerationValue getPriceComponent()
	{
		return getPriceComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityFreeOfCostSeatsOrTickets.priceComponent</code> attribute. 
	 * @param value the priceComponent - Price Component
	 */
	public void setPriceComponent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityFreeOfCostSeatsOrTickets.priceComponent</code> attribute. 
	 * @param value the priceComponent - Price Component
	 */
	public void setPriceComponent(final EnumerationValue value)
	{
		setPriceComponent( getSession().getSessionContext(), value );
	}
	
}
