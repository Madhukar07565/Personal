/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.Guide Guide}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGuide extends GenericItem
{
	/** Qualifier of the <code>Guide.isDriver</code> attribute **/
	public static final String ISDRIVER = "isDriver";
	/** Qualifier of the <code>Guide.audioCommentryAvailable</code> attribute **/
	public static final String AUDIOCOMMENTRYAVAILABLE = "audioCommentryAvailable";
	/** Qualifier of the <code>Guide.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Guide.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>Guide.inclusionGuides</code> attribute **/
	public static final String INCLUSIONGUIDES = "inclusionGuides";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INCLUSIONGUIDES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGuide> INCLUSIONGUIDESHANDLER = new BidirectionalOneToManyHandler<GeneratedGuide>(
	ActivityproductmasterscoreConstants.TC.GUIDE,
	false,
	"inclusionGuides",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ISDRIVER, AttributeMode.INITIAL);
		tmp.put(AUDIOCOMMENTRYAVAILABLE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(INCLUSIONGUIDES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.audioCommentryAvailable</code> attribute.
	 * @return the audioCommentryAvailable - Audio Commentry Available
	 */
	public Boolean isAudioCommentryAvailable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AUDIOCOMMENTRYAVAILABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.audioCommentryAvailable</code> attribute.
	 * @return the audioCommentryAvailable - Audio Commentry Available
	 */
	public Boolean isAudioCommentryAvailable()
	{
		return isAudioCommentryAvailable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.audioCommentryAvailable</code> attribute. 
	 * @return the audioCommentryAvailable - Audio Commentry Available
	 */
	public boolean isAudioCommentryAvailableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAudioCommentryAvailable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.audioCommentryAvailable</code> attribute. 
	 * @return the audioCommentryAvailable - Audio Commentry Available
	 */
	public boolean isAudioCommentryAvailableAsPrimitive()
	{
		return isAudioCommentryAvailableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.audioCommentryAvailable</code> attribute. 
	 * @param value the audioCommentryAvailable - Audio Commentry Available
	 */
	public void setAudioCommentryAvailable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AUDIOCOMMENTRYAVAILABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.audioCommentryAvailable</code> attribute. 
	 * @param value the audioCommentryAvailable - Audio Commentry Available
	 */
	public void setAudioCommentryAvailable(final Boolean value)
	{
		setAudioCommentryAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.audioCommentryAvailable</code> attribute. 
	 * @param value the audioCommentryAvailable - Audio Commentry Available
	 */
	public void setAudioCommentryAvailable(final SessionContext ctx, final boolean value)
	{
		setAudioCommentryAvailable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.audioCommentryAvailable</code> attribute. 
	 * @param value the audioCommentryAvailable - Audio Commentry Available
	 */
	public void setAudioCommentryAvailable(final boolean value)
	{
		setAudioCommentryAvailable( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		INCLUSIONGUIDESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.inclusionGuides</code> attribute.
	 * @return the inclusionGuides
	 */
	public Inclusion getInclusionGuides(final SessionContext ctx)
	{
		return (Inclusion)getProperty( ctx, INCLUSIONGUIDES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.inclusionGuides</code> attribute.
	 * @return the inclusionGuides
	 */
	public Inclusion getInclusionGuides()
	{
		return getInclusionGuides( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.inclusionGuides</code> attribute. 
	 * @param value the inclusionGuides
	 */
	public void setInclusionGuides(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONGUIDESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.inclusionGuides</code> attribute. 
	 * @param value the inclusionGuides
	 */
	public void setInclusionGuides(final Inclusion value)
	{
		setInclusionGuides( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.isDriver</code> attribute.
	 * @return the isDriver - Is Driver
	 */
	public Boolean isIsDriver(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISDRIVER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.isDriver</code> attribute.
	 * @return the isDriver - Is Driver
	 */
	public Boolean isIsDriver()
	{
		return isIsDriver( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.isDriver</code> attribute. 
	 * @return the isDriver - Is Driver
	 */
	public boolean isIsDriverAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsDriver( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.isDriver</code> attribute. 
	 * @return the isDriver - Is Driver
	 */
	public boolean isIsDriverAsPrimitive()
	{
		return isIsDriverAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.isDriver</code> attribute. 
	 * @param value the isDriver - Is Driver
	 */
	public void setIsDriver(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISDRIVER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.isDriver</code> attribute. 
	 * @param value the isDriver - Is Driver
	 */
	public void setIsDriver(final Boolean value)
	{
		setIsDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.isDriver</code> attribute. 
	 * @param value the isDriver - Is Driver
	 */
	public void setIsDriver(final SessionContext ctx, final boolean value)
	{
		setIsDriver( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.isDriver</code> attribute. 
	 * @param value the isDriver - Is Driver
	 */
	public void setIsDriver(final boolean value)
	{
		setIsDriver( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.language</code> attribute.
	 * @return the language - Language
	 */
	public Collection<Language> getLanguage(final SessionContext ctx)
	{
		Collection<Language> coll = (Collection<Language>)getProperty( ctx, LANGUAGE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Guide.language</code> attribute.
	 * @return the language - Language
	 */
	public Collection<Language> getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.language</code> attribute. 
	 * @param value the language - Language
	 */
	public void setLanguage(final SessionContext ctx, final Collection<Language> value)
	{
		setProperty(ctx, LANGUAGE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Guide.language</code> attribute. 
	 * @param value the language - Language
	 */
	public void setLanguage(final Collection<Language> value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
}
