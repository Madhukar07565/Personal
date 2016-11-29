/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
import com.cnk.travelogix.product.activity.masters.core.jalo.AwardInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.Entertainment;
import com.cnk.travelogix.product.activity.masters.core.jalo.GeneralDescription;
import com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion;
import com.cnk.travelogix.product.activity.masters.core.jalo.Participant;
import com.cnk.travelogix.product.activity.masters.core.jalo.ShowInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.SpaInfo;
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
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo AdditionalActivityInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAdditionalActivityInfo extends GenericItem
{
	/** Qualifier of the <code>AdditionalActivityInfo.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>AdditionalActivityInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>AdditionalActivityInfo.typeOfInfo</code> attribute **/
	public static final String TYPEOFINFO = "typeOfInfo";
	/** Qualifier of the <code>AdditionalActivityInfo.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/** Qualifier of the <code>AdditionalActivityInfo.activityProductSubTypeAdditionalInfos</code> attribute **/
	public static final String ACTIVITYPRODUCTSUBTYPEADDITIONALINFOS = "activityProductSubTypeAdditionalInfos";
	/** Qualifier of the <code>AdditionalActivityInfo.inclusion</code> attribute **/
	public static final String INCLUSION = "inclusion";
	/** Qualifier of the <code>AdditionalActivityInfo.inclusionTypeOfInclusionActivites</code> attribute **/
	public static final String INCLUSIONTYPEOFINCLUSIONACTIVITES = "inclusionTypeOfInclusionActivites";
	/** Qualifier of the <code>AdditionalActivityInfo.entertainment</code> attribute **/
	public static final String ENTERTAINMENT = "entertainment";
	/** Qualifier of the <code>AdditionalActivityInfo.participants</code> attribute **/
	public static final String PARTICIPANTS = "participants";
	/** Qualifier of the <code>AdditionalActivityInfo.awards</code> attribute **/
	public static final String AWARDS = "awards";
	/** Qualifier of the <code>AdditionalActivityInfo.performerInfo</code> attribute **/
	public static final String PERFORMERINFO = "performerInfo";
	/** Qualifier of the <code>AdditionalActivityInfo.otherInfo</code> attribute **/
	public static final String OTHERINFO = "otherInfo";
	/** Qualifier of the <code>AdditionalActivityInfo.showInfo</code> attribute **/
	public static final String SHOWINFO = "showInfo";
	/** Qualifier of the <code>AdditionalActivityInfo.spaInfo</code> attribute **/
	public static final String SPAINFO = "spaInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo> ACTIVITYPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCTSUBTYPEADDITIONALINFOS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo> ACTIVITYPRODUCTSUBTYPEADDITIONALINFOSHANDLER = new BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"activityProductSubTypeAdditionalInfos",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INCLUSION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo> INCLUSIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"inclusion",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INCLUSIONTYPEOFINCLUSIONACTIVITES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo> INCLUSIONTYPEOFINCLUSIONACTIVITESHANDLER = new BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"inclusionTypeOfInclusionActivites",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ENTERTAINMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo> ENTERTAINMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedAdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"entertainment",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PARTICIPANTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Participant> PARTICIPANTSHANDLER = new OneToManyHandler<Participant>(
	ActivityproductmasterscoreConstants.TC.PARTICIPANT,
	false,
	"additionalActivityInfoParticipant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n AWARDS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AwardInfo> AWARDSHANDLER = new OneToManyHandler<AwardInfo>(
	ActivityproductmasterscoreConstants.TC.AWARDINFO,
	false,
	"additionalActivityInfoAwards",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PERFORMERINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<GeneralDescription> PERFORMERINFOHANDLER = new OneToManyHandler<GeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"additionalActivityInfoPerformerInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OTHERINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<GeneralDescription> OTHERINFOHANDLER = new OneToManyHandler<GeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"additionalActivityInfoOtherInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SHOWINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ShowInfo> SHOWINFOHANDLER = new OneToManyHandler<ShowInfo>(
	ActivityproductmasterscoreConstants.TC.SHOWINFO,
	false,
	"additionalActivityInfoShowInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SPAINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SpaInfo> SPAINFOHANDLER = new OneToManyHandler<SpaInfo>(
	ActivityproductmasterscoreConstants.TC.SPAINFO,
	false,
	"additionalActivityInfoSpaInfo",
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
		tmp.put(TYPEOFINFO, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCT, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCTSUBTYPEADDITIONALINFOS, AttributeMode.INITIAL);
		tmp.put(INCLUSION, AttributeMode.INITIAL);
		tmp.put(INCLUSIONTYPEOFINCLUSIONACTIVITES, AttributeMode.INITIAL);
		tmp.put(ENTERTAINMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.activityProductSubTypeAdditionalInfos</code> attribute.
	 * @return the activityProductSubTypeAdditionalInfos
	 */
	public ActivityProductSubType getActivityProductSubTypeAdditionalInfos(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, ACTIVITYPRODUCTSUBTYPEADDITIONALINFOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.activityProductSubTypeAdditionalInfos</code> attribute.
	 * @return the activityProductSubTypeAdditionalInfos
	 */
	public ActivityProductSubType getActivityProductSubTypeAdditionalInfos()
	{
		return getActivityProductSubTypeAdditionalInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.activityProductSubTypeAdditionalInfos</code> attribute. 
	 * @param value the activityProductSubTypeAdditionalInfos
	 */
	public void setActivityProductSubTypeAdditionalInfos(final SessionContext ctx, final ActivityProductSubType value)
	{
		ACTIVITYPRODUCTSUBTYPEADDITIONALINFOSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.activityProductSubTypeAdditionalInfos</code> attribute. 
	 * @param value the activityProductSubTypeAdditionalInfos
	 */
	public void setActivityProductSubTypeAdditionalInfos(final ActivityProductSubType value)
	{
		setActivityProductSubTypeAdditionalInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.awards</code> attribute.
	 * @return the awards
	 */
	public Collection<AwardInfo> getAwards(final SessionContext ctx)
	{
		return AWARDSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.awards</code> attribute.
	 * @return the awards
	 */
	public Collection<AwardInfo> getAwards()
	{
		return getAwards( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.awards</code> attribute. 
	 * @param value the awards
	 */
	public void setAwards(final SessionContext ctx, final Collection<AwardInfo> value)
	{
		AWARDSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.awards</code> attribute. 
	 * @param value the awards
	 */
	public void setAwards(final Collection<AwardInfo> value)
	{
		setAwards( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to awards. 
	 * @param value the item to add to awards
	 */
	public void addToAwards(final SessionContext ctx, final AwardInfo value)
	{
		AWARDSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to awards. 
	 * @param value the item to add to awards
	 */
	public void addToAwards(final AwardInfo value)
	{
		addToAwards( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from awards. 
	 * @param value the item to remove from awards
	 */
	public void removeFromAwards(final SessionContext ctx, final AwardInfo value)
	{
		AWARDSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from awards. 
	 * @param value the item to remove from awards
	 */
	public void removeFromAwards(final AwardInfo value)
	{
		removeFromAwards( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTHANDLER.newInstance(ctx, allAttributes);
		ACTIVITYPRODUCTSUBTYPEADDITIONALINFOSHANDLER.newInstance(ctx, allAttributes);
		INCLUSIONHANDLER.newInstance(ctx, allAttributes);
		INCLUSIONTYPEOFINCLUSIONACTIVITESHANDLER.newInstance(ctx, allAttributes);
		ENTERTAINMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.description</code> attribute.
	 * @return the description - Name
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAdditionalActivityInfo.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.description</code> attribute.
	 * @return the description - Name
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.description</code> attribute. 
	 * @return the localized description - Name
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.description</code> attribute. 
	 * @return the localized description - Name
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.description</code> attribute. 
	 * @param value the description - Name
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAdditionalActivityInfo.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.description</code> attribute. 
	 * @param value the description - Name
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.description</code> attribute. 
	 * @param value the description - Name
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.description</code> attribute. 
	 * @param value the description - Name
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.entertainment</code> attribute.
	 * @return the entertainment
	 */
	public Entertainment getEntertainment(final SessionContext ctx)
	{
		return (Entertainment)getProperty( ctx, ENTERTAINMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.entertainment</code> attribute.
	 * @return the entertainment
	 */
	public Entertainment getEntertainment()
	{
		return getEntertainment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.entertainment</code> attribute. 
	 * @param value the entertainment
	 */
	public void setEntertainment(final SessionContext ctx, final Entertainment value)
	{
		ENTERTAINMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.entertainment</code> attribute. 
	 * @param value the entertainment
	 */
	public void setEntertainment(final Entertainment value)
	{
		setEntertainment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Inclusion getInclusion(final SessionContext ctx)
	{
		return (Inclusion)getProperty( ctx, INCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Inclusion getInclusion()
	{
		return getInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final Inclusion value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.inclusionTypeOfInclusionActivites</code> attribute.
	 * @return the inclusionTypeOfInclusionActivites
	 */
	public Inclusion getInclusionTypeOfInclusionActivites(final SessionContext ctx)
	{
		return (Inclusion)getProperty( ctx, INCLUSIONTYPEOFINCLUSIONACTIVITES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.inclusionTypeOfInclusionActivites</code> attribute.
	 * @return the inclusionTypeOfInclusionActivites
	 */
	public Inclusion getInclusionTypeOfInclusionActivites()
	{
		return getInclusionTypeOfInclusionActivites( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.inclusionTypeOfInclusionActivites</code> attribute. 
	 * @param value the inclusionTypeOfInclusionActivites
	 */
	public void setInclusionTypeOfInclusionActivites(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONTYPEOFINCLUSIONACTIVITESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.inclusionTypeOfInclusionActivites</code> attribute. 
	 * @param value the inclusionTypeOfInclusionActivites
	 */
	public void setInclusionTypeOfInclusionActivites(final Inclusion value)
	{
		setInclusionTypeOfInclusionActivites( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAdditionalActivityInfo.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAdditionalActivityInfo.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.otherInfo</code> attribute.
	 * @return the otherInfo
	 */
	public Collection<GeneralDescription> getOtherInfo(final SessionContext ctx)
	{
		return OTHERINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.otherInfo</code> attribute.
	 * @return the otherInfo
	 */
	public Collection<GeneralDescription> getOtherInfo()
	{
		return getOtherInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.otherInfo</code> attribute. 
	 * @param value the otherInfo
	 */
	public void setOtherInfo(final SessionContext ctx, final Collection<GeneralDescription> value)
	{
		OTHERINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.otherInfo</code> attribute. 
	 * @param value the otherInfo
	 */
	public void setOtherInfo(final Collection<GeneralDescription> value)
	{
		setOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherInfo. 
	 * @param value the item to add to otherInfo
	 */
	public void addToOtherInfo(final SessionContext ctx, final GeneralDescription value)
	{
		OTHERINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherInfo. 
	 * @param value the item to add to otherInfo
	 */
	public void addToOtherInfo(final GeneralDescription value)
	{
		addToOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherInfo. 
	 * @param value the item to remove from otherInfo
	 */
	public void removeFromOtherInfo(final SessionContext ctx, final GeneralDescription value)
	{
		OTHERINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherInfo. 
	 * @param value the item to remove from otherInfo
	 */
	public void removeFromOtherInfo(final GeneralDescription value)
	{
		removeFromOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.participants</code> attribute.
	 * @return the participants
	 */
	public Collection<Participant> getParticipants(final SessionContext ctx)
	{
		return PARTICIPANTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.participants</code> attribute.
	 * @return the participants
	 */
	public Collection<Participant> getParticipants()
	{
		return getParticipants( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.participants</code> attribute. 
	 * @param value the participants
	 */
	public void setParticipants(final SessionContext ctx, final Collection<Participant> value)
	{
		PARTICIPANTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.participants</code> attribute. 
	 * @param value the participants
	 */
	public void setParticipants(final Collection<Participant> value)
	{
		setParticipants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to participants. 
	 * @param value the item to add to participants
	 */
	public void addToParticipants(final SessionContext ctx, final Participant value)
	{
		PARTICIPANTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to participants. 
	 * @param value the item to add to participants
	 */
	public void addToParticipants(final Participant value)
	{
		addToParticipants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from participants. 
	 * @param value the item to remove from participants
	 */
	public void removeFromParticipants(final SessionContext ctx, final Participant value)
	{
		PARTICIPANTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from participants. 
	 * @param value the item to remove from participants
	 */
	public void removeFromParticipants(final Participant value)
	{
		removeFromParticipants( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.performerInfo</code> attribute.
	 * @return the performerInfo
	 */
	public Collection<GeneralDescription> getPerformerInfo(final SessionContext ctx)
	{
		return PERFORMERINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.performerInfo</code> attribute.
	 * @return the performerInfo
	 */
	public Collection<GeneralDescription> getPerformerInfo()
	{
		return getPerformerInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.performerInfo</code> attribute. 
	 * @param value the performerInfo
	 */
	public void setPerformerInfo(final SessionContext ctx, final Collection<GeneralDescription> value)
	{
		PERFORMERINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.performerInfo</code> attribute. 
	 * @param value the performerInfo
	 */
	public void setPerformerInfo(final Collection<GeneralDescription> value)
	{
		setPerformerInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to performerInfo. 
	 * @param value the item to add to performerInfo
	 */
	public void addToPerformerInfo(final SessionContext ctx, final GeneralDescription value)
	{
		PERFORMERINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to performerInfo. 
	 * @param value the item to add to performerInfo
	 */
	public void addToPerformerInfo(final GeneralDescription value)
	{
		addToPerformerInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from performerInfo. 
	 * @param value the item to remove from performerInfo
	 */
	public void removeFromPerformerInfo(final SessionContext ctx, final GeneralDescription value)
	{
		PERFORMERINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from performerInfo. 
	 * @param value the item to remove from performerInfo
	 */
	public void removeFromPerformerInfo(final GeneralDescription value)
	{
		removeFromPerformerInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.showInfo</code> attribute.
	 * @return the showInfo
	 */
	public Collection<ShowInfo> getShowInfo(final SessionContext ctx)
	{
		return SHOWINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.showInfo</code> attribute.
	 * @return the showInfo
	 */
	public Collection<ShowInfo> getShowInfo()
	{
		return getShowInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.showInfo</code> attribute. 
	 * @param value the showInfo
	 */
	public void setShowInfo(final SessionContext ctx, final Collection<ShowInfo> value)
	{
		SHOWINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.showInfo</code> attribute. 
	 * @param value the showInfo
	 */
	public void setShowInfo(final Collection<ShowInfo> value)
	{
		setShowInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to showInfo. 
	 * @param value the item to add to showInfo
	 */
	public void addToShowInfo(final SessionContext ctx, final ShowInfo value)
	{
		SHOWINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to showInfo. 
	 * @param value the item to add to showInfo
	 */
	public void addToShowInfo(final ShowInfo value)
	{
		addToShowInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from showInfo. 
	 * @param value the item to remove from showInfo
	 */
	public void removeFromShowInfo(final SessionContext ctx, final ShowInfo value)
	{
		SHOWINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from showInfo. 
	 * @param value the item to remove from showInfo
	 */
	public void removeFromShowInfo(final ShowInfo value)
	{
		removeFromShowInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.spaInfo</code> attribute.
	 * @return the spaInfo
	 */
	public Collection<SpaInfo> getSpaInfo(final SessionContext ctx)
	{
		return SPAINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.spaInfo</code> attribute.
	 * @return the spaInfo
	 */
	public Collection<SpaInfo> getSpaInfo()
	{
		return getSpaInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.spaInfo</code> attribute. 
	 * @param value the spaInfo
	 */
	public void setSpaInfo(final SessionContext ctx, final Collection<SpaInfo> value)
	{
		SPAINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.spaInfo</code> attribute. 
	 * @param value the spaInfo
	 */
	public void setSpaInfo(final Collection<SpaInfo> value)
	{
		setSpaInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to spaInfo. 
	 * @param value the item to add to spaInfo
	 */
	public void addToSpaInfo(final SessionContext ctx, final SpaInfo value)
	{
		SPAINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to spaInfo. 
	 * @param value the item to add to spaInfo
	 */
	public void addToSpaInfo(final SpaInfo value)
	{
		addToSpaInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from spaInfo. 
	 * @param value the item to remove from spaInfo
	 */
	public void removeFromSpaInfo(final SessionContext ctx, final SpaInfo value)
	{
		SPAINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from spaInfo. 
	 * @param value the item to remove from spaInfo
	 */
	public void removeFromSpaInfo(final SpaInfo value)
	{
		removeFromSpaInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.typeOfInfo</code> attribute.
	 * @return the typeOfInfo - TypeOfInformation.
	 */
	public TravelogixRuleType getTypeOfInfo(final SessionContext ctx)
	{
		return (TravelogixRuleType)getProperty( ctx, TYPEOFINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdditionalActivityInfo.typeOfInfo</code> attribute.
	 * @return the typeOfInfo - TypeOfInformation.
	 */
	public TravelogixRuleType getTypeOfInfo()
	{
		return getTypeOfInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.typeOfInfo</code> attribute. 
	 * @param value the typeOfInfo - TypeOfInformation.
	 */
	public void setTypeOfInfo(final SessionContext ctx, final TravelogixRuleType value)
	{
		setProperty(ctx, TYPEOFINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdditionalActivityInfo.typeOfInfo</code> attribute. 
	 * @param value the typeOfInfo - TypeOfInformation.
	 */
	public void setTypeOfInfo(final TravelogixRuleType value)
	{
		setTypeOfInfo( getSession().getSessionContext(), value );
	}
	
}
