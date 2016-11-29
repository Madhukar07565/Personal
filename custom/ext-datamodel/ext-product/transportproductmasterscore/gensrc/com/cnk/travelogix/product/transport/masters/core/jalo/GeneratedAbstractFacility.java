/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.AbstractFacility AbstractFacility}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractFacility extends GenericItem
{
	/** Qualifier of the <code>AbstractFacility.facilityType</code> attribute **/
	public static final String FACILITYTYPE = "facilityType";
	/** Qualifier of the <code>AbstractFacility.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>AbstractFacility.facilityName</code> attribute **/
	public static final String FACILITYNAME = "facilityName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FACILITYTYPE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(FACILITYNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractFacility.description</code> attribute.
	 * @return the description - Facility Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractFacility.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractFacility.description</code> attribute.
	 * @return the description - Facility Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractFacility.description</code> attribute. 
	 * @return the localized description - Facility Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractFacility.description</code> attribute. 
	 * @return the localized description - Facility Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractFacility.description</code> attribute. 
	 * @param value the description - Facility Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractFacility.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractFacility.description</code> attribute. 
	 * @param value the description - Facility Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractFacility.description</code> attribute. 
	 * @param value the description - Facility Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractFacility.description</code> attribute. 
	 * @param value the description - Facility Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractFacility.facilityName</code> attribute.
	 * @return the facilityName - Facility Name
	 */
	public String getFacilityName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FACILITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractFacility.facilityName</code> attribute.
	 * @return the facilityName - Facility Name
	 */
	public String getFacilityName()
	{
		return getFacilityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractFacility.facilityName</code> attribute. 
	 * @param value the facilityName - Facility Name
	 */
	public void setFacilityName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FACILITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractFacility.facilityName</code> attribute. 
	 * @param value the facilityName - Facility Name
	 */
	public void setFacilityName(final String value)
	{
		setFacilityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractFacility.facilityType</code> attribute.
	 * @return the facilityType - Facility Type
	 */
	public EnumerationValue getFacilityType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FACILITYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractFacility.facilityType</code> attribute.
	 * @return the facilityType - Facility Type
	 */
	public EnumerationValue getFacilityType()
	{
		return getFacilityType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractFacility.facilityType</code> attribute. 
	 * @param value the facilityType - Facility Type
	 */
	public void setFacilityType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FACILITYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractFacility.facilityType</code> attribute. 
	 * @param value the facilityType - Facility Type
	 */
	public void setFacilityType(final EnumerationValue value)
	{
		setFacilityType( getSession().getSessionContext(), value );
	}
	
}
