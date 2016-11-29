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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.PlaceDescription PlaceDescription}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPlaceDescription extends GenericItem
{
	/** Qualifier of the <code>PlaceDescription.placeOfCategory</code> attribute **/
	public static final String PLACEOFCATEGORY = "placeOfCategory";
	/** Qualifier of the <code>PlaceDescription.placeName</code> attribute **/
	public static final String PLACENAME = "placeName";
	/** Qualifier of the <code>PlaceDescription.distanceFromProperty</code> attribute **/
	public static final String DISTANCEFROMPROPERTY = "distanceFromProperty";
	/** Qualifier of the <code>PlaceDescription.distanceUnit</code> attribute **/
	public static final String DISTANCEUNIT = "distanceUnit";
	/** Qualifier of the <code>PlaceDescription.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PLACEOFCATEGORY, AttributeMode.INITIAL);
		tmp.put(PLACENAME, AttributeMode.INITIAL);
		tmp.put(DISTANCEFROMPROPERTY, AttributeMode.INITIAL);
		tmp.put(DISTANCEUNIT, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPlaceDescription.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPlaceDescription.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.distanceFromProperty</code> attribute.
	 * @return the distanceFromProperty - Distance From Property
	 */
	public String getDistanceFromProperty(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTANCEFROMPROPERTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.distanceFromProperty</code> attribute.
	 * @return the distanceFromProperty - Distance From Property
	 */
	public String getDistanceFromProperty()
	{
		return getDistanceFromProperty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.distanceFromProperty</code> attribute. 
	 * @param value the distanceFromProperty - Distance From Property
	 */
	public void setDistanceFromProperty(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTANCEFROMPROPERTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.distanceFromProperty</code> attribute. 
	 * @param value the distanceFromProperty - Distance From Property
	 */
	public void setDistanceFromProperty(final String value)
	{
		setDistanceFromProperty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.distanceUnit</code> attribute.
	 * @return the distanceUnit - Distance Unit
	 */
	public EnumerationValue getDistanceUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISTANCEUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.distanceUnit</code> attribute.
	 * @return the distanceUnit - Distance Unit
	 */
	public EnumerationValue getDistanceUnit()
	{
		return getDistanceUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.distanceUnit</code> attribute. 
	 * @param value the distanceUnit - Distance Unit
	 */
	public void setDistanceUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISTANCEUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.distanceUnit</code> attribute. 
	 * @param value the distanceUnit - Distance Unit
	 */
	public void setDistanceUnit(final EnumerationValue value)
	{
		setDistanceUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.placeName</code> attribute.
	 * @return the placeName - Place Name
	 */
	public String getPlaceName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLACENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.placeName</code> attribute.
	 * @return the placeName - Place Name
	 */
	public String getPlaceName()
	{
		return getPlaceName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.placeName</code> attribute. 
	 * @param value the placeName - Place Name
	 */
	public void setPlaceName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLACENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.placeName</code> attribute. 
	 * @param value the placeName - Place Name
	 */
	public void setPlaceName(final String value)
	{
		setPlaceName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.placeOfCategory</code> attribute.
	 * @return the placeOfCategory - Place Category
	 */
	public EnumerationValue getPlaceOfCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PLACEOFCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PlaceDescription.placeOfCategory</code> attribute.
	 * @return the placeOfCategory - Place Category
	 */
	public EnumerationValue getPlaceOfCategory()
	{
		return getPlaceOfCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.placeOfCategory</code> attribute. 
	 * @param value the placeOfCategory - Place Category
	 */
	public void setPlaceOfCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PLACEOFCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PlaceDescription.placeOfCategory</code> attribute. 
	 * @param value the placeOfCategory - Place Category
	 */
	public void setPlaceOfCategory(final EnumerationValue value)
	{
		setPlaceOfCategory( getSession().getSessionContext(), value );
	}
	
}
