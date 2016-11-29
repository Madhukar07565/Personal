/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.AwardInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.MiscellaneousInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.ShowInfo;
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
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.GeneralDescription GeneralDescriptionInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGeneralDescription extends GenericItem
{
	/** Qualifier of the <code>GeneralDescriptionInfo.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>GeneralDescriptionInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>GeneralDescriptionInfo.miscellaneousInfo</code> attribute **/
	public static final String MISCELLANEOUSINFO = "miscellaneousInfo";
	/** Qualifier of the <code>GeneralDescriptionInfo.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/** Qualifier of the <code>GeneralDescriptionInfo.additionalActivityInfoPerformerInfo</code> attribute **/
	public static final String ADDITIONALACTIVITYINFOPERFORMERINFO = "additionalActivityInfoPerformerInfo";
	/** Qualifier of the <code>GeneralDescriptionInfo.additionalActivityInfoOtherInfo</code> attribute **/
	public static final String ADDITIONALACTIVITYINFOOTHERINFO = "additionalActivityInfoOtherInfo";
	/** Qualifier of the <code>GeneralDescriptionInfo.awardInfoNominees</code> attribute **/
	public static final String AWARDINFONOMINEES = "awardInfoNominees";
	/** Qualifier of the <code>GeneralDescriptionInfo.ahowInfoCastCrewInfo</code> attribute **/
	public static final String AHOWINFOCASTCREWINFO = "ahowInfoCastCrewInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MISCELLANEOUSINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGeneralDescription> MISCELLANEOUSINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedGeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"miscellaneousInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGeneralDescription> ACTIVITYPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedGeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADDITIONALACTIVITYINFOPERFORMERINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGeneralDescription> ADDITIONALACTIVITYINFOPERFORMERINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedGeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"additionalActivityInfoPerformerInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADDITIONALACTIVITYINFOOTHERINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGeneralDescription> ADDITIONALACTIVITYINFOOTHERINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedGeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"additionalActivityInfoOtherInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AWARDINFONOMINEES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGeneralDescription> AWARDINFONOMINEESHANDLER = new BidirectionalOneToManyHandler<GeneratedGeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"awardInfoNominees",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AHOWINFOCASTCREWINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGeneralDescription> AHOWINFOCASTCREWINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedGeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"ahowInfoCastCrewInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(MISCELLANEOUSINFO, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCT, AttributeMode.INITIAL);
		tmp.put(ADDITIONALACTIVITYINFOPERFORMERINFO, AttributeMode.INITIAL);
		tmp.put(ADDITIONALACTIVITYINFOOTHERINFO, AttributeMode.INITIAL);
		tmp.put(AWARDINFONOMINEES, AttributeMode.INITIAL);
		tmp.put(AHOWINFOCASTCREWINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.additionalActivityInfoOtherInfo</code> attribute.
	 * @return the additionalActivityInfoOtherInfo
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoOtherInfo(final SessionContext ctx)
	{
		return (AdditionalActivityInfo)getProperty( ctx, ADDITIONALACTIVITYINFOOTHERINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.additionalActivityInfoOtherInfo</code> attribute.
	 * @return the additionalActivityInfoOtherInfo
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoOtherInfo()
	{
		return getAdditionalActivityInfoOtherInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.additionalActivityInfoOtherInfo</code> attribute. 
	 * @param value the additionalActivityInfoOtherInfo
	 */
	public void setAdditionalActivityInfoOtherInfo(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ADDITIONALACTIVITYINFOOTHERINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.additionalActivityInfoOtherInfo</code> attribute. 
	 * @param value the additionalActivityInfoOtherInfo
	 */
	public void setAdditionalActivityInfoOtherInfo(final AdditionalActivityInfo value)
	{
		setAdditionalActivityInfoOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.additionalActivityInfoPerformerInfo</code> attribute.
	 * @return the additionalActivityInfoPerformerInfo
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoPerformerInfo(final SessionContext ctx)
	{
		return (AdditionalActivityInfo)getProperty( ctx, ADDITIONALACTIVITYINFOPERFORMERINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.additionalActivityInfoPerformerInfo</code> attribute.
	 * @return the additionalActivityInfoPerformerInfo
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoPerformerInfo()
	{
		return getAdditionalActivityInfoPerformerInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.additionalActivityInfoPerformerInfo</code> attribute. 
	 * @param value the additionalActivityInfoPerformerInfo
	 */
	public void setAdditionalActivityInfoPerformerInfo(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ADDITIONALACTIVITYINFOPERFORMERINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.additionalActivityInfoPerformerInfo</code> attribute. 
	 * @param value the additionalActivityInfoPerformerInfo
	 */
	public void setAdditionalActivityInfoPerformerInfo(final AdditionalActivityInfo value)
	{
		setAdditionalActivityInfoPerformerInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.ahowInfoCastCrewInfo</code> attribute.
	 * @return the ahowInfoCastCrewInfo
	 */
	public ShowInfo getAhowInfoCastCrewInfo(final SessionContext ctx)
	{
		return (ShowInfo)getProperty( ctx, AHOWINFOCASTCREWINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.ahowInfoCastCrewInfo</code> attribute.
	 * @return the ahowInfoCastCrewInfo
	 */
	public ShowInfo getAhowInfoCastCrewInfo()
	{
		return getAhowInfoCastCrewInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.ahowInfoCastCrewInfo</code> attribute. 
	 * @param value the ahowInfoCastCrewInfo
	 */
	public void setAhowInfoCastCrewInfo(final SessionContext ctx, final ShowInfo value)
	{
		AHOWINFOCASTCREWINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.ahowInfoCastCrewInfo</code> attribute. 
	 * @param value the ahowInfoCastCrewInfo
	 */
	public void setAhowInfoCastCrewInfo(final ShowInfo value)
	{
		setAhowInfoCastCrewInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.awardInfoNominees</code> attribute.
	 * @return the awardInfoNominees
	 */
	public AwardInfo getAwardInfoNominees(final SessionContext ctx)
	{
		return (AwardInfo)getProperty( ctx, AWARDINFONOMINEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.awardInfoNominees</code> attribute.
	 * @return the awardInfoNominees
	 */
	public AwardInfo getAwardInfoNominees()
	{
		return getAwardInfoNominees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.awardInfoNominees</code> attribute. 
	 * @param value the awardInfoNominees
	 */
	public void setAwardInfoNominees(final SessionContext ctx, final AwardInfo value)
	{
		AWARDINFONOMINEESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.awardInfoNominees</code> attribute. 
	 * @param value the awardInfoNominees
	 */
	public void setAwardInfoNominees(final AwardInfo value)
	{
		setAwardInfoNominees( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MISCELLANEOUSINFOHANDLER.newInstance(ctx, allAttributes);
		ACTIVITYPRODUCTHANDLER.newInstance(ctx, allAttributes);
		ADDITIONALACTIVITYINFOPERFORMERINFOHANDLER.newInstance(ctx, allAttributes);
		ADDITIONALACTIVITYINFOOTHERINFOHANDLER.newInstance(ctx, allAttributes);
		AWARDINFONOMINEESHANDLER.newInstance(ctx, allAttributes);
		AHOWINFOCASTCREWINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGeneralDescription.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGeneralDescription.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.miscellaneousInfo</code> attribute.
	 * @return the miscellaneousInfo
	 */
	public MiscellaneousInfo getMiscellaneousInfo(final SessionContext ctx)
	{
		return (MiscellaneousInfo)getProperty( ctx, MISCELLANEOUSINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.miscellaneousInfo</code> attribute.
	 * @return the miscellaneousInfo
	 */
	public MiscellaneousInfo getMiscellaneousInfo()
	{
		return getMiscellaneousInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.miscellaneousInfo</code> attribute. 
	 * @param value the miscellaneousInfo
	 */
	public void setMiscellaneousInfo(final SessionContext ctx, final MiscellaneousInfo value)
	{
		MISCELLANEOUSINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.miscellaneousInfo</code> attribute. 
	 * @param value the miscellaneousInfo
	 */
	public void setMiscellaneousInfo(final MiscellaneousInfo value)
	{
		setMiscellaneousInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGeneralDescription.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralDescriptionInfo.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedGeneralDescription.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralDescriptionInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}
