/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.MiscellaneousInfo;
import com.cnk.travelogix.product.common.core.jalo.TravelogixRuleType;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.MiscellaneousRestriction MiscellaneousRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMiscellaneousRestriction extends GenericItem
{
	/** Qualifier of the <code>MiscellaneousRestriction.allow</code> attribute **/
	public static final String ALLOW = "allow";
	/** Qualifier of the <code>MiscellaneousRestriction.note</code> attribute **/
	public static final String NOTE = "note";
	/** Qualifier of the <code>MiscellaneousRestriction.descriptionRestriction</code> attribute **/
	public static final String DESCRIPTIONRESTRICTION = "descriptionRestriction";
	/** Qualifier of the <code>MiscellaneousRestriction.miscellaneousInfo</code> attribute **/
	public static final String MISCELLANEOUSINFO = "miscellaneousInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MISCELLANEOUSINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMiscellaneousRestriction> MISCELLANEOUSINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedMiscellaneousRestriction>(
	ActivityproductmasterscoreConstants.TC.MISCELLANEOUSRESTRICTION,
	false,
	"miscellaneousInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ALLOW, AttributeMode.INITIAL);
		tmp.put(NOTE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTIONRESTRICTION, AttributeMode.INITIAL);
		tmp.put(MISCELLANEOUSINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.allow</code> attribute.
	 * @return the allow - Allow.
	 */
	public Boolean isAllow(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ALLOW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.allow</code> attribute.
	 * @return the allow - Allow.
	 */
	public Boolean isAllow()
	{
		return isAllow( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.allow</code> attribute. 
	 * @return the allow - Allow.
	 */
	public boolean isAllowAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAllow( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.allow</code> attribute. 
	 * @return the allow - Allow.
	 */
	public boolean isAllowAsPrimitive()
	{
		return isAllowAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.allow</code> attribute. 
	 * @param value the allow - Allow.
	 */
	public void setAllow(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ALLOW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.allow</code> attribute. 
	 * @param value the allow - Allow.
	 */
	public void setAllow(final Boolean value)
	{
		setAllow( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.allow</code> attribute. 
	 * @param value the allow - Allow.
	 */
	public void setAllow(final SessionContext ctx, final boolean value)
	{
		setAllow( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.allow</code> attribute. 
	 * @param value the allow - Allow.
	 */
	public void setAllow(final boolean value)
	{
		setAllow( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MISCELLANEOUSINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.descriptionRestriction</code> attribute.
	 * @return the descriptionRestriction - Description Restriction.
	 */
	public TravelogixRuleType getDescriptionRestriction(final SessionContext ctx)
	{
		return (TravelogixRuleType)getProperty( ctx, DESCRIPTIONRESTRICTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.descriptionRestriction</code> attribute.
	 * @return the descriptionRestriction - Description Restriction.
	 */
	public TravelogixRuleType getDescriptionRestriction()
	{
		return getDescriptionRestriction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.descriptionRestriction</code> attribute. 
	 * @param value the descriptionRestriction - Description Restriction.
	 */
	public void setDescriptionRestriction(final SessionContext ctx, final TravelogixRuleType value)
	{
		setProperty(ctx, DESCRIPTIONRESTRICTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.descriptionRestriction</code> attribute. 
	 * @param value the descriptionRestriction - Description Restriction.
	 */
	public void setDescriptionRestriction(final TravelogixRuleType value)
	{
		setDescriptionRestriction( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.miscellaneousInfo</code> attribute.
	 * @return the miscellaneousInfo
	 */
	public MiscellaneousInfo getMiscellaneousInfo(final SessionContext ctx)
	{
		return (MiscellaneousInfo)getProperty( ctx, MISCELLANEOUSINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.miscellaneousInfo</code> attribute.
	 * @return the miscellaneousInfo
	 */
	public MiscellaneousInfo getMiscellaneousInfo()
	{
		return getMiscellaneousInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.miscellaneousInfo</code> attribute. 
	 * @param value the miscellaneousInfo
	 */
	public void setMiscellaneousInfo(final SessionContext ctx, final MiscellaneousInfo value)
	{
		MISCELLANEOUSINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.miscellaneousInfo</code> attribute. 
	 * @param value the miscellaneousInfo
	 */
	public void setMiscellaneousInfo(final MiscellaneousInfo value)
	{
		setMiscellaneousInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.note</code> attribute.
	 * @return the note - Note.
	 */
	public String getNote(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMiscellaneousRestriction.getNote requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.note</code> attribute.
	 * @return the note - Note.
	 */
	public String getNote()
	{
		return getNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.note</code> attribute. 
	 * @return the localized note - Note.
	 */
	public Map<Language,String> getAllNote(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NOTE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MiscellaneousRestriction.note</code> attribute. 
	 * @return the localized note - Note.
	 */
	public Map<Language,String> getAllNote()
	{
		return getAllNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.note</code> attribute. 
	 * @param value the note - Note.
	 */
	public void setNote(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedMiscellaneousRestriction.setNote requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NOTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.note</code> attribute. 
	 * @param value the note - Note.
	 */
	public void setNote(final String value)
	{
		setNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.note</code> attribute. 
	 * @param value the note - Note.
	 */
	public void setAllNote(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NOTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MiscellaneousRestriction.note</code> attribute. 
	 * @param value the note - Note.
	 */
	public void setAllNote(final Map<Language,String> value)
	{
		setAllNote( getSession().getSessionContext(), value );
	}
	
}
