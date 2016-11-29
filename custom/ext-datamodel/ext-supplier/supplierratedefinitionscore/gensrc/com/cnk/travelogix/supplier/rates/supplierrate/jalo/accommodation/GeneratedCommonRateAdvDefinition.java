/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.CommonRateAdvDefinition CommonRateAdvDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommonRateAdvDefinition extends AbstractRateAdvDefinition
{
	/** Qualifier of the <code>CommonRateAdvDefinition.rateApplicabilityType</code> attribute **/
	public static final String RATEAPPLICABILITYTYPE = "rateApplicabilityType";
	/** Qualifier of the <code>CommonRateAdvDefinition.packageName</code> attribute **/
	public static final String PACKAGENAME = "packageName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateAdvDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RATEAPPLICABILITYTYPE, AttributeMode.INITIAL);
		tmp.put(PACKAGENAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonRateAdvDefinition.packageName</code> attribute.
	 * @return the packageName
	 */
	public String getPackageName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PACKAGENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonRateAdvDefinition.packageName</code> attribute.
	 * @return the packageName
	 */
	public String getPackageName()
	{
		return getPackageName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonRateAdvDefinition.packageName</code> attribute. 
	 * @param value the packageName
	 */
	public void setPackageName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PACKAGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonRateAdvDefinition.packageName</code> attribute. 
	 * @param value the packageName
	 */
	public void setPackageName(final String value)
	{
		setPackageName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonRateAdvDefinition.rateApplicabilityType</code> attribute.
	 * @return the rateApplicabilityType
	 */
	public Set<EnumerationValue> getRateApplicabilityType(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, RATEAPPLICABILITYTYPE);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonRateAdvDefinition.rateApplicabilityType</code> attribute.
	 * @return the rateApplicabilityType
	 */
	public Set<EnumerationValue> getRateApplicabilityType()
	{
		return getRateApplicabilityType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonRateAdvDefinition.rateApplicabilityType</code> attribute. 
	 * @param value the rateApplicabilityType
	 */
	public void setRateApplicabilityType(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, RATEAPPLICABILITYTYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonRateAdvDefinition.rateApplicabilityType</code> attribute. 
	 * @param value the rateApplicabilityType
	 */
	public void setRateApplicabilityType(final Set<EnumerationValue> value)
	{
		setRateApplicabilityType( getSession().getSessionContext(), value );
	}
	
}
