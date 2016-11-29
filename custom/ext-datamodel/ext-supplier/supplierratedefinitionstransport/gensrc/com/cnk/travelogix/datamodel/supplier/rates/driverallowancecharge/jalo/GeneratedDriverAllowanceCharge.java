/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.driverallowancecharge.jalo;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.driverallowancecharge.jalo.DriverAllowanceCharge DriverAllowanceCharge}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDriverAllowanceCharge extends GenericItem
{
	/** Qualifier of the <code>DriverAllowanceCharge.driverAllowanceCalculatedOn</code> attribute **/
	public static final String DRIVERALLOWANCECALCULATEDON = "driverAllowanceCalculatedOn";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DRIVERALLOWANCECALCULATEDON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverAllowanceCharge.driverAllowanceCalculatedOn</code> attribute.
	 * @return the driverAllowanceCalculatedOn
	 */
	public EnumerationValue getDriverAllowanceCalculatedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DRIVERALLOWANCECALCULATEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverAllowanceCharge.driverAllowanceCalculatedOn</code> attribute.
	 * @return the driverAllowanceCalculatedOn
	 */
	public EnumerationValue getDriverAllowanceCalculatedOn()
	{
		return getDriverAllowanceCalculatedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverAllowanceCharge.driverAllowanceCalculatedOn</code> attribute. 
	 * @param value the driverAllowanceCalculatedOn
	 */
	public void setDriverAllowanceCalculatedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DRIVERALLOWANCECALCULATEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverAllowanceCharge.driverAllowanceCalculatedOn</code> attribute. 
	 * @param value the driverAllowanceCalculatedOn
	 */
	public void setDriverAllowanceCalculatedOn(final EnumerationValue value)
	{
		setDriverAllowanceCalculatedOn( getSession().getSessionContext(), value );
	}
	
}
