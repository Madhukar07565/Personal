/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.amenity.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.amenity.jalo.AmenityType AmenityType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAmenityType extends AbstractCommonMasterType
{
	/** Qualifier of the <code>AmenityType.definition</code> attribute **/
	public static final String DEFINITION = "definition";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommonMasterType.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmenityType.definition</code> attribute.
	 * @return the definition
	 */
	public String getDefinition(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAmenityType.getDefinition requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmenityType.definition</code> attribute.
	 * @return the definition
	 */
	public String getDefinition()
	{
		return getDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmenityType.definition</code> attribute. 
	 * @return the localized definition
	 */
	public Map<Language,String> getAllDefinition(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DEFINITION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AmenityType.definition</code> attribute. 
	 * @return the localized definition
	 */
	public Map<Language,String> getAllDefinition()
	{
		return getAllDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmenityType.definition</code> attribute. 
	 * @param value the definition
	 */
	public void setDefinition(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAmenityType.setDefinition requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmenityType.definition</code> attribute. 
	 * @param value the definition
	 */
	public void setDefinition(final String value)
	{
		setDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmenityType.definition</code> attribute. 
	 * @param value the definition
	 */
	public void setAllDefinition(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AmenityType.definition</code> attribute. 
	 * @param value the definition
	 */
	public void setAllDefinition(final Map<Language,String> value)
	{
		setAllDefinition( getSession().getSessionContext(), value );
	}
	
}
