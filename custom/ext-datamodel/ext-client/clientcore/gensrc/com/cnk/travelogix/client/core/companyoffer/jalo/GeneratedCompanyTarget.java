/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.CompanyTarget CompanyTarget}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyTarget extends GenericItem
{
	/** Qualifier of the <code>CompanyTarget.targetValue</code> attribute **/
	public static final String TARGETVALUE = "targetValue";
	/** Qualifier of the <code>CompanyTarget.targetType</code> attribute **/
	public static final String TARGETTYPE = "targetType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TARGETVALUE, AttributeMode.INITIAL);
		tmp.put(TARGETTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyTarget.targetType</code> attribute.
	 * @return the targetType
	 */
	public EnumerationValue getTargetType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TARGETTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyTarget.targetType</code> attribute.
	 * @return the targetType
	 */
	public EnumerationValue getTargetType()
	{
		return getTargetType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyTarget.targetType</code> attribute. 
	 * @param value the targetType
	 */
	public void setTargetType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TARGETTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyTarget.targetType</code> attribute. 
	 * @param value the targetType
	 */
	public void setTargetType(final EnumerationValue value)
	{
		setTargetType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyTarget.targetValue</code> attribute.
	 * @return the targetValue
	 */
	public Integer getTargetValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TARGETVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyTarget.targetValue</code> attribute.
	 * @return the targetValue
	 */
	public Integer getTargetValue()
	{
		return getTargetValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyTarget.targetValue</code> attribute. 
	 * @return the targetValue
	 */
	public int getTargetValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTargetValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyTarget.targetValue</code> attribute. 
	 * @return the targetValue
	 */
	public int getTargetValueAsPrimitive()
	{
		return getTargetValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyTarget.targetValue</code> attribute. 
	 * @param value the targetValue
	 */
	public void setTargetValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TARGETVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyTarget.targetValue</code> attribute. 
	 * @param value the targetValue
	 */
	public void setTargetValue(final Integer value)
	{
		setTargetValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyTarget.targetValue</code> attribute. 
	 * @param value the targetValue
	 */
	public void setTargetValue(final SessionContext ctx, final int value)
	{
		setTargetValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyTarget.targetValue</code> attribute. 
	 * @param value the targetValue
	 */
	public void setTargetValue(final int value)
	{
		setTargetValue( getSession().getSessionContext(), value );
	}
	
}
