/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.HealthAndSafety HealthAndSafety}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHealthAndSafety extends GenericItem
{
	/** Qualifier of the <code>HealthAndSafety.healthAndSafetyCategory</code> attribute **/
	public static final String HEALTHANDSAFETYCATEGORY = "healthAndSafetyCategory";
	/** Qualifier of the <code>HealthAndSafety.healthAndSafetyName</code> attribute **/
	public static final String HEALTHANDSAFETYNAME = "healthAndSafetyName";
	/** Qualifier of the <code>HealthAndSafety.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>HealthAndSafety.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>HealthAndSafety.lastUpdate</code> attribute **/
	public static final String LASTUPDATE = "lastUpdate";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(HEALTHANDSAFETYCATEGORY, AttributeMode.INITIAL);
		tmp.put(HEALTHANDSAFETYNAME, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(LASTUPDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.healthAndSafetyCategory</code> attribute.
	 * @return the healthAndSafetyCategory - Health And Safety Category
	 */
	public EnumerationValue getHealthAndSafetyCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, HEALTHANDSAFETYCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.healthAndSafetyCategory</code> attribute.
	 * @return the healthAndSafetyCategory - Health And Safety Category
	 */
	public EnumerationValue getHealthAndSafetyCategory()
	{
		return getHealthAndSafetyCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.healthAndSafetyCategory</code> attribute. 
	 * @param value the healthAndSafetyCategory - Health And Safety Category
	 */
	public void setHealthAndSafetyCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, HEALTHANDSAFETYCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.healthAndSafetyCategory</code> attribute. 
	 * @param value the healthAndSafetyCategory - Health And Safety Category
	 */
	public void setHealthAndSafetyCategory(final EnumerationValue value)
	{
		setHealthAndSafetyCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.healthAndSafetyName</code> attribute.
	 * @return the healthAndSafetyName - Health And Safety Name
	 */
	public String getHealthAndSafetyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEALTHANDSAFETYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.healthAndSafetyName</code> attribute.
	 * @return the healthAndSafetyName - Health And Safety Name
	 */
	public String getHealthAndSafetyName()
	{
		return getHealthAndSafetyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.healthAndSafetyName</code> attribute. 
	 * @param value the healthAndSafetyName - Health And Safety Name
	 */
	public void setHealthAndSafetyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEALTHANDSAFETYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.healthAndSafetyName</code> attribute. 
	 * @param value the healthAndSafetyName - Health And Safety Name
	 */
	public void setHealthAndSafetyName(final String value)
	{
		setHealthAndSafetyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.lastUpdate</code> attribute.
	 * @return the lastUpdate - LastUpdate
	 */
	public Date getLastUpdate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, LASTUPDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.lastUpdate</code> attribute.
	 * @return the lastUpdate - LastUpdate
	 */
	public Date getLastUpdate()
	{
		return getLastUpdate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.lastUpdate</code> attribute. 
	 * @param value the lastUpdate - LastUpdate
	 */
	public void setLastUpdate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, LASTUPDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.lastUpdate</code> attribute. 
	 * @param value the lastUpdate - LastUpdate
	 */
	public void setLastUpdate(final Date value)
	{
		setLastUpdate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.remarks</code> attribute.
	 * @return the remarks - Remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.remarks</code> attribute.
	 * @return the remarks - Remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.remarks</code> attribute. 
	 * @param value the remarks - Remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.remarks</code> attribute. 
	 * @param value the remarks - Remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.value</code> attribute.
	 * @return the value - Value
	 */
	public String getValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HealthAndSafety.value</code> attribute.
	 * @return the value - Value
	 */
	public String getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HealthAndSafety.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final String value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
