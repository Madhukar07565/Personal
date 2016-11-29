/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.CompanyPolicyCabinClass CompanyPolicyCabinClass}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyPolicyCabinClass extends GenericItem
{
	/** Qualifier of the <code>CompanyPolicyCabinClass.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>CompanyPolicyCabinClass.rbds</code> attribute **/
	public static final String RBDS = "rbds";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(RBDS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyCabinClass.cabinClass</code> attribute.
	 * @return the cabinClass - Company Policy Cabin Class
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyCabinClass.cabinClass</code> attribute.
	 * @return the cabinClass - Company Policy Cabin Class
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyCabinClass.cabinClass</code> attribute. 
	 * @param value the cabinClass - Company Policy Cabin Class
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyCabinClass.cabinClass</code> attribute. 
	 * @param value the cabinClass - Company Policy Cabin Class
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyCabinClass.rbds</code> attribute.
	 * @return the rbds - Company Policy rbds
	 */
	public List<EnumerationValue> getRbds(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, RBDS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyCabinClass.rbds</code> attribute.
	 * @return the rbds - Company Policy rbds
	 */
	public List<EnumerationValue> getRbds()
	{
		return getRbds( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyCabinClass.rbds</code> attribute. 
	 * @param value the rbds - Company Policy rbds
	 */
	public void setRbds(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, RBDS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyCabinClass.rbds</code> attribute. 
	 * @param value the rbds - Company Policy rbds
	 */
	public void setRbds(final List<EnumerationValue> value)
	{
		setRbds( getSession().getSessionContext(), value );
	}
	
}
