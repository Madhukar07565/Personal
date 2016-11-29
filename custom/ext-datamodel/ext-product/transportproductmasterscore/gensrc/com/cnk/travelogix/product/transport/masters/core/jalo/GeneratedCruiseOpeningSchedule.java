/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.storelocator.jalo.OpeningSchedule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.CruiseOpeningSchedule CruiseOpeningSchedule}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseOpeningSchedule extends OpeningSchedule
{
	/** Qualifier of the <code>CruiseOpeningSchedule.operationalPeriod</code> attribute **/
	public static final String OPERATIONALPERIOD = "operationalPeriod";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(OpeningSchedule.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(OPERATIONALPERIOD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseOpeningSchedule.operationalPeriod</code> attribute.
	 * @return the operationalPeriod - OperationalDay
	 */
	public EnumerationValue getOperationalPeriod(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OPERATIONALPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseOpeningSchedule.operationalPeriod</code> attribute.
	 * @return the operationalPeriod - OperationalDay
	 */
	public EnumerationValue getOperationalPeriod()
	{
		return getOperationalPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseOpeningSchedule.operationalPeriod</code> attribute. 
	 * @param value the operationalPeriod - OperationalDay
	 */
	public void setOperationalPeriod(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OPERATIONALPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseOpeningSchedule.operationalPeriod</code> attribute. 
	 * @param value the operationalPeriod - OperationalDay
	 */
	public void setOperationalPeriod(final EnumerationValue value)
	{
		setOperationalPeriod( getSession().getSessionContext(), value );
	}
	
}
