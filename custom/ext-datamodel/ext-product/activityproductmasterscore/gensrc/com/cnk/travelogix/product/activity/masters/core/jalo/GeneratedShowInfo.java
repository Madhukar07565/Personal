/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.GeneralDescription;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.ShowInfo ShowInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShowInfo extends GenericItem
{
	/** Qualifier of the <code>ShowInfo.languageAvailable</code> attribute **/
	public static final String LANGUAGEAVAILABLE = "languageAvailable";
	/** Qualifier of the <code>ShowInfo.languageName</code> attribute **/
	public static final String LANGUAGENAME = "languageName";
	/** Qualifier of the <code>ShowInfo.performedBy</code> attribute **/
	public static final String PERFORMEDBY = "performedBy";
	/** Qualifier of the <code>ShowInfo.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ShowInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>ShowInfo.castCrewInfo</code> attribute **/
	public static final String CASTCREWINFO = "castCrewInfo";
	/** Qualifier of the <code>ShowInfo.additionalActivityInfoShowInfo</code> attribute **/
	public static final String ADDITIONALACTIVITYINFOSHOWINFO = "additionalActivityInfoShowInfo";
	/**
	* {@link OneToManyHandler} for handling 1:n CASTCREWINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<GeneralDescription> CASTCREWINFOHANDLER = new OneToManyHandler<GeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"ahowInfoCastCrewInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADDITIONALACTIVITYINFOSHOWINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedShowInfo> ADDITIONALACTIVITYINFOSHOWINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedShowInfo>(
	ActivityproductmasterscoreConstants.TC.SHOWINFO,
	false,
	"additionalActivityInfoShowInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LANGUAGEAVAILABLE, AttributeMode.INITIAL);
		tmp.put(LANGUAGENAME, AttributeMode.INITIAL);
		tmp.put(PERFORMEDBY, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(ADDITIONALACTIVITYINFOSHOWINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.additionalActivityInfoShowInfo</code> attribute.
	 * @return the additionalActivityInfoShowInfo
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoShowInfo(final SessionContext ctx)
	{
		return (AdditionalActivityInfo)getProperty( ctx, ADDITIONALACTIVITYINFOSHOWINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.additionalActivityInfoShowInfo</code> attribute.
	 * @return the additionalActivityInfoShowInfo
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoShowInfo()
	{
		return getAdditionalActivityInfoShowInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.additionalActivityInfoShowInfo</code> attribute. 
	 * @param value the additionalActivityInfoShowInfo
	 */
	public void setAdditionalActivityInfoShowInfo(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ADDITIONALACTIVITYINFOSHOWINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.additionalActivityInfoShowInfo</code> attribute. 
	 * @param value the additionalActivityInfoShowInfo
	 */
	public void setAdditionalActivityInfoShowInfo(final AdditionalActivityInfo value)
	{
		setAdditionalActivityInfoShowInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.castCrewInfo</code> attribute.
	 * @return the castCrewInfo
	 */
	public Collection<GeneralDescription> getCastCrewInfo(final SessionContext ctx)
	{
		return CASTCREWINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.castCrewInfo</code> attribute.
	 * @return the castCrewInfo
	 */
	public Collection<GeneralDescription> getCastCrewInfo()
	{
		return getCastCrewInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.castCrewInfo</code> attribute. 
	 * @param value the castCrewInfo
	 */
	public void setCastCrewInfo(final SessionContext ctx, final Collection<GeneralDescription> value)
	{
		CASTCREWINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.castCrewInfo</code> attribute. 
	 * @param value the castCrewInfo
	 */
	public void setCastCrewInfo(final Collection<GeneralDescription> value)
	{
		setCastCrewInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to castCrewInfo. 
	 * @param value the item to add to castCrewInfo
	 */
	public void addToCastCrewInfo(final SessionContext ctx, final GeneralDescription value)
	{
		CASTCREWINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to castCrewInfo. 
	 * @param value the item to add to castCrewInfo
	 */
	public void addToCastCrewInfo(final GeneralDescription value)
	{
		addToCastCrewInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from castCrewInfo. 
	 * @param value the item to remove from castCrewInfo
	 */
	public void removeFromCastCrewInfo(final SessionContext ctx, final GeneralDescription value)
	{
		CASTCREWINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from castCrewInfo. 
	 * @param value the item to remove from castCrewInfo
	 */
	public void removeFromCastCrewInfo(final GeneralDescription value)
	{
		removeFromCastCrewInfo( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADDITIONALACTIVITYINFOSHOWINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.description</code> attribute.
	 * @return the description - description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.description</code> attribute.
	 * @return the description - description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.description</code> attribute. 
	 * @param value the description - description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.description</code> attribute. 
	 * @param value the description - description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.languageAvailable</code> attribute.
	 * @return the languageAvailable - Language available
	 */
	public Boolean isLanguageAvailable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, LANGUAGEAVAILABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.languageAvailable</code> attribute.
	 * @return the languageAvailable - Language available
	 */
	public Boolean isLanguageAvailable()
	{
		return isLanguageAvailable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.languageAvailable</code> attribute. 
	 * @return the languageAvailable - Language available
	 */
	public boolean isLanguageAvailableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isLanguageAvailable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.languageAvailable</code> attribute. 
	 * @return the languageAvailable - Language available
	 */
	public boolean isLanguageAvailableAsPrimitive()
	{
		return isLanguageAvailableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.languageAvailable</code> attribute. 
	 * @param value the languageAvailable - Language available
	 */
	public void setLanguageAvailable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, LANGUAGEAVAILABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.languageAvailable</code> attribute. 
	 * @param value the languageAvailable - Language available
	 */
	public void setLanguageAvailable(final Boolean value)
	{
		setLanguageAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.languageAvailable</code> attribute. 
	 * @param value the languageAvailable - Language available
	 */
	public void setLanguageAvailable(final SessionContext ctx, final boolean value)
	{
		setLanguageAvailable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.languageAvailable</code> attribute. 
	 * @param value the languageAvailable - Language available
	 */
	public void setLanguageAvailable(final boolean value)
	{
		setLanguageAvailable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.languageName</code> attribute.
	 * @return the languageName - Language name
	 */
	public Language getLanguageName(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.languageName</code> attribute.
	 * @return the languageName - Language name
	 */
	public Language getLanguageName()
	{
		return getLanguageName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.languageName</code> attribute. 
	 * @param value the languageName - Language name
	 */
	public void setLanguageName(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.languageName</code> attribute. 
	 * @param value the languageName - Language name
	 */
	public void setLanguageName(final Language value)
	{
		setLanguageName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.name</code> attribute.
	 * @return the name - name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.name</code> attribute.
	 * @return the name - name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.name</code> attribute. 
	 * @param value the name - name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.name</code> attribute. 
	 * @param value the name - name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.performedBy</code> attribute.
	 * @return the performedBy - performedBy
	 */
	public String getPerformedBy(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PERFORMEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShowInfo.performedBy</code> attribute.
	 * @return the performedBy - performedBy
	 */
	public String getPerformedBy()
	{
		return getPerformedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.performedBy</code> attribute. 
	 * @param value the performedBy - performedBy
	 */
	public void setPerformedBy(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PERFORMEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShowInfo.performedBy</code> attribute. 
	 * @param value the performedBy - performedBy
	 */
	public void setPerformedBy(final String value)
	{
		setPerformedBy( getSession().getSessionContext(), value );
	}
	
}
