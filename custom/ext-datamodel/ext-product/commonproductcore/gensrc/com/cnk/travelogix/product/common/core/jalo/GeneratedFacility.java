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
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Facility Facility}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFacility extends GenericItem
{
	/** Qualifier of the <code>Facility.facilityName</code> attribute **/
	public static final String FACILITYNAME = "facilityName";
	/** Qualifier of the <code>Facility.facilityCategory</code> attribute **/
	public static final String FACILITYCATEGORY = "facilityCategory";
	/** Qualifier of the <code>Facility.facilityType</code> attribute **/
	public static final String FACILITYTYPE = "facilityType";
	/** Qualifier of the <code>Facility.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Facility.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FACILITYNAME, AttributeMode.INITIAL);
		tmp.put(FACILITYCATEGORY, AttributeMode.INITIAL);
		tmp.put(FACILITYTYPE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final StandardDateRange value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFacility.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFacility.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.facilityCategory</code> attribute.
	 * @return the facilityCategory - Facility Category
	 */
	public EnumerationValue getFacilityCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FACILITYCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.facilityCategory</code> attribute.
	 * @return the facilityCategory - Facility Category
	 */
	public EnumerationValue getFacilityCategory()
	{
		return getFacilityCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.facilityCategory</code> attribute. 
	 * @param value the facilityCategory - Facility Category
	 */
	public void setFacilityCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FACILITYCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.facilityCategory</code> attribute. 
	 * @param value the facilityCategory - Facility Category
	 */
	public void setFacilityCategory(final EnumerationValue value)
	{
		setFacilityCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.facilityName</code> attribute.
	 * @return the facilityName - Facility Name
	 */
	public String getFacilityName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFacility.getFacilityName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, FACILITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.facilityName</code> attribute.
	 * @return the facilityName - Facility Name
	 */
	public String getFacilityName()
	{
		return getFacilityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.facilityName</code> attribute. 
	 * @return the localized facilityName - Facility Name
	 */
	public Map<Language,String> getAllFacilityName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,FACILITYNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.facilityName</code> attribute. 
	 * @return the localized facilityName - Facility Name
	 */
	public Map<Language,String> getAllFacilityName()
	{
		return getAllFacilityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.facilityName</code> attribute. 
	 * @param value the facilityName - Facility Name
	 */
	public void setFacilityName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFacility.setFacilityName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, FACILITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.facilityName</code> attribute. 
	 * @param value the facilityName - Facility Name
	 */
	public void setFacilityName(final String value)
	{
		setFacilityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.facilityName</code> attribute. 
	 * @param value the facilityName - Facility Name
	 */
	public void setAllFacilityName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,FACILITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.facilityName</code> attribute. 
	 * @param value the facilityName - Facility Name
	 */
	public void setAllFacilityName(final Map<Language,String> value)
	{
		setAllFacilityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.facilityType</code> attribute.
	 * @return the facilityType - Facility Type
	 */
	public EnumerationValue getFacilityType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FACILITYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Facility.facilityType</code> attribute.
	 * @return the facilityType - Facility Type
	 */
	public EnumerationValue getFacilityType()
	{
		return getFacilityType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.facilityType</code> attribute. 
	 * @param value the facilityType - Facility Type
	 */
	public void setFacilityType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FACILITYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Facility.facilityType</code> attribute. 
	 * @param value the facilityType - Facility Type
	 */
	public void setFacilityType(final EnumerationValue value)
	{
		setFacilityType( getSession().getSessionContext(), value );
	}
	
}
