/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.AbstractAncillaryRateDeviations AbstractTransportationRateRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractAncillaryRateDeviations extends GenericItem
{
	/** Qualifier of the <code>AbstractTransportationRateRestriction.included</code> attribute **/
	public static final String INCLUDED = "included";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUDED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTransportationRateRestriction.included</code> attribute.
	 * @return the included
	 */
	public Boolean isIncluded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTransportationRateRestriction.included</code> attribute.
	 * @return the included
	 */
	public Boolean isIncluded()
	{
		return isIncluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTransportationRateRestriction.included</code> attribute. 
	 * @return the included
	 */
	public boolean isIncludedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncluded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTransportationRateRestriction.included</code> attribute. 
	 * @return the included
	 */
	public boolean isIncludedAsPrimitive()
	{
		return isIncludedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTransportationRateRestriction.included</code> attribute. 
	 * @param value the included
	 */
	public void setIncluded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTransportationRateRestriction.included</code> attribute. 
	 * @param value the included
	 */
	public void setIncluded(final Boolean value)
	{
		setIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTransportationRateRestriction.included</code> attribute. 
	 * @param value the included
	 */
	public void setIncluded(final SessionContext ctx, final boolean value)
	{
		setIncluded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTransportationRateRestriction.included</code> attribute. 
	 * @param value the included
	 */
	public void setIncluded(final boolean value)
	{
		setIncluded( getSession().getSessionContext(), value );
	}
	
}
