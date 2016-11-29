/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProductSubType;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.Attraction;
import com.cnk.travelogix.product.activity.masters.core.jalo.DiningInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.Entertainment;
import com.cnk.travelogix.product.activity.masters.core.jalo.Guide;
import com.cnk.travelogix.product.activity.masters.core.jalo.SeatingInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion Inclusion}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedInclusion extends GenericItem
{
	/** Qualifier of the <code>Inclusion.activityProductSubTypeInclusions</code> attribute **/
	public static final String ACTIVITYPRODUCTSUBTYPEINCLUSIONS = "activityProductSubTypeInclusions";
	/** Qualifier of the <code>Inclusion.inclusiveForGuides</code> attribute **/
	public static final String INCLUSIVEFORGUIDES = "inclusiveForGuides";
	/** Qualifier of the <code>Inclusion.attractions</code> attribute **/
	public static final String ATTRACTIONS = "attractions";
	/** Qualifier of the <code>Inclusion.inclusiveDinings</code> attribute **/
	public static final String INCLUSIVEDININGS = "inclusiveDinings";
	/** Qualifier of the <code>Inclusion.entertainments</code> attribute **/
	public static final String ENTERTAINMENTS = "entertainments";
	/** Qualifier of the <code>Inclusion.otherInfo</code> attribute **/
	public static final String OTHERINFO = "otherInfo";
	/** Qualifier of the <code>Inclusion.seatingInfo</code> attribute **/
	public static final String SEATINGINFO = "seatingInfo";
	/** Qualifier of the <code>Inclusion.typeOfInclusionActivites</code> attribute **/
	public static final String TYPEOFINCLUSIONACTIVITES = "typeOfInclusionActivites";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCTSUBTYPEINCLUSIONS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedInclusion> ACTIVITYPRODUCTSUBTYPEINCLUSIONSHANDLER = new BidirectionalOneToManyHandler<GeneratedInclusion>(
	ActivityproductmasterscoreConstants.TC.INCLUSION,
	false,
	"activityProductSubTypeInclusions",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INCLUSIVEFORGUIDES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Guide> INCLUSIVEFORGUIDESHANDLER = new OneToManyHandler<Guide>(
	ActivityproductmasterscoreConstants.TC.GUIDE,
	false,
	"inclusionGuides",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ATTRACTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Attraction> ATTRACTIONSHANDLER = new OneToManyHandler<Attraction>(
	ActivityproductmasterscoreConstants.TC.ATTRACTION,
	false,
	"inclusionAttractions",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INCLUSIVEDININGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DiningInfo> INCLUSIVEDININGSHANDLER = new OneToManyHandler<DiningInfo>(
	ActivityproductmasterscoreConstants.TC.DININGINFO,
	false,
	"inclusion",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ENTERTAINMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Entertainment> ENTERTAINMENTSHANDLER = new OneToManyHandler<Entertainment>(
	ActivityproductmasterscoreConstants.TC.ENTERTAINMENT,
	false,
	"inclusionEntertainments",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OTHERINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AdditionalActivityInfo> OTHERINFOHANDLER = new OneToManyHandler<AdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"inclusion",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SEATINGINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SeatingInfo> SEATINGINFOHANDLER = new OneToManyHandler<SeatingInfo>(
	ActivityproductmasterscoreConstants.TC.SEATINGINFO,
	false,
	"inclusionSeatingInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TYPEOFINCLUSIONACTIVITES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AdditionalActivityInfo> TYPEOFINCLUSIONACTIVITESHANDLER = new OneToManyHandler<AdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"inclusionTypeOfInclusionActivites",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ACTIVITYPRODUCTSUBTYPEINCLUSIONS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.activityProductSubTypeInclusions</code> attribute.
	 * @return the activityProductSubTypeInclusions
	 */
	public ActivityProductSubType getActivityProductSubTypeInclusions(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, ACTIVITYPRODUCTSUBTYPEINCLUSIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.activityProductSubTypeInclusions</code> attribute.
	 * @return the activityProductSubTypeInclusions
	 */
	public ActivityProductSubType getActivityProductSubTypeInclusions()
	{
		return getActivityProductSubTypeInclusions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.activityProductSubTypeInclusions</code> attribute. 
	 * @param value the activityProductSubTypeInclusions
	 */
	public void setActivityProductSubTypeInclusions(final SessionContext ctx, final ActivityProductSubType value)
	{
		ACTIVITYPRODUCTSUBTYPEINCLUSIONSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.activityProductSubTypeInclusions</code> attribute. 
	 * @param value the activityProductSubTypeInclusions
	 */
	public void setActivityProductSubTypeInclusions(final ActivityProductSubType value)
	{
		setActivityProductSubTypeInclusions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.attractions</code> attribute.
	 * @return the attractions
	 */
	public Collection<Attraction> getAttractions(final SessionContext ctx)
	{
		return ATTRACTIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.attractions</code> attribute.
	 * @return the attractions
	 */
	public Collection<Attraction> getAttractions()
	{
		return getAttractions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.attractions</code> attribute. 
	 * @param value the attractions
	 */
	public void setAttractions(final SessionContext ctx, final Collection<Attraction> value)
	{
		ATTRACTIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.attractions</code> attribute. 
	 * @param value the attractions
	 */
	public void setAttractions(final Collection<Attraction> value)
	{
		setAttractions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to attractions. 
	 * @param value the item to add to attractions
	 */
	public void addToAttractions(final SessionContext ctx, final Attraction value)
	{
		ATTRACTIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to attractions. 
	 * @param value the item to add to attractions
	 */
	public void addToAttractions(final Attraction value)
	{
		addToAttractions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from attractions. 
	 * @param value the item to remove from attractions
	 */
	public void removeFromAttractions(final SessionContext ctx, final Attraction value)
	{
		ATTRACTIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from attractions. 
	 * @param value the item to remove from attractions
	 */
	public void removeFromAttractions(final Attraction value)
	{
		removeFromAttractions( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTSUBTYPEINCLUSIONSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.entertainments</code> attribute.
	 * @return the entertainments
	 */
	public Collection<Entertainment> getEntertainments(final SessionContext ctx)
	{
		return ENTERTAINMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.entertainments</code> attribute.
	 * @return the entertainments
	 */
	public Collection<Entertainment> getEntertainments()
	{
		return getEntertainments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.entertainments</code> attribute. 
	 * @param value the entertainments
	 */
	public void setEntertainments(final SessionContext ctx, final Collection<Entertainment> value)
	{
		ENTERTAINMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.entertainments</code> attribute. 
	 * @param value the entertainments
	 */
	public void setEntertainments(final Collection<Entertainment> value)
	{
		setEntertainments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entertainments. 
	 * @param value the item to add to entertainments
	 */
	public void addToEntertainments(final SessionContext ctx, final Entertainment value)
	{
		ENTERTAINMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entertainments. 
	 * @param value the item to add to entertainments
	 */
	public void addToEntertainments(final Entertainment value)
	{
		addToEntertainments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entertainments. 
	 * @param value the item to remove from entertainments
	 */
	public void removeFromEntertainments(final SessionContext ctx, final Entertainment value)
	{
		ENTERTAINMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entertainments. 
	 * @param value the item to remove from entertainments
	 */
	public void removeFromEntertainments(final Entertainment value)
	{
		removeFromEntertainments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.inclusiveDinings</code> attribute.
	 * @return the inclusiveDinings
	 */
	public Collection<DiningInfo> getInclusiveDinings(final SessionContext ctx)
	{
		return INCLUSIVEDININGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.inclusiveDinings</code> attribute.
	 * @return the inclusiveDinings
	 */
	public Collection<DiningInfo> getInclusiveDinings()
	{
		return getInclusiveDinings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.inclusiveDinings</code> attribute. 
	 * @param value the inclusiveDinings
	 */
	public void setInclusiveDinings(final SessionContext ctx, final Collection<DiningInfo> value)
	{
		INCLUSIVEDININGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.inclusiveDinings</code> attribute. 
	 * @param value the inclusiveDinings
	 */
	public void setInclusiveDinings(final Collection<DiningInfo> value)
	{
		setInclusiveDinings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusiveDinings. 
	 * @param value the item to add to inclusiveDinings
	 */
	public void addToInclusiveDinings(final SessionContext ctx, final DiningInfo value)
	{
		INCLUSIVEDININGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusiveDinings. 
	 * @param value the item to add to inclusiveDinings
	 */
	public void addToInclusiveDinings(final DiningInfo value)
	{
		addToInclusiveDinings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusiveDinings. 
	 * @param value the item to remove from inclusiveDinings
	 */
	public void removeFromInclusiveDinings(final SessionContext ctx, final DiningInfo value)
	{
		INCLUSIVEDININGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusiveDinings. 
	 * @param value the item to remove from inclusiveDinings
	 */
	public void removeFromInclusiveDinings(final DiningInfo value)
	{
		removeFromInclusiveDinings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.inclusiveForGuides</code> attribute.
	 * @return the inclusiveForGuides
	 */
	public Collection<Guide> getInclusiveForGuides(final SessionContext ctx)
	{
		return INCLUSIVEFORGUIDESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.inclusiveForGuides</code> attribute.
	 * @return the inclusiveForGuides
	 */
	public Collection<Guide> getInclusiveForGuides()
	{
		return getInclusiveForGuides( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.inclusiveForGuides</code> attribute. 
	 * @param value the inclusiveForGuides
	 */
	public void setInclusiveForGuides(final SessionContext ctx, final Collection<Guide> value)
	{
		INCLUSIVEFORGUIDESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.inclusiveForGuides</code> attribute. 
	 * @param value the inclusiveForGuides
	 */
	public void setInclusiveForGuides(final Collection<Guide> value)
	{
		setInclusiveForGuides( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusiveForGuides. 
	 * @param value the item to add to inclusiveForGuides
	 */
	public void addToInclusiveForGuides(final SessionContext ctx, final Guide value)
	{
		INCLUSIVEFORGUIDESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inclusiveForGuides. 
	 * @param value the item to add to inclusiveForGuides
	 */
	public void addToInclusiveForGuides(final Guide value)
	{
		addToInclusiveForGuides( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusiveForGuides. 
	 * @param value the item to remove from inclusiveForGuides
	 */
	public void removeFromInclusiveForGuides(final SessionContext ctx, final Guide value)
	{
		INCLUSIVEFORGUIDESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inclusiveForGuides. 
	 * @param value the item to remove from inclusiveForGuides
	 */
	public void removeFromInclusiveForGuides(final Guide value)
	{
		removeFromInclusiveForGuides( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.otherInfo</code> attribute.
	 * @return the otherInfo
	 */
	public Collection<AdditionalActivityInfo> getOtherInfo(final SessionContext ctx)
	{
		return OTHERINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.otherInfo</code> attribute.
	 * @return the otherInfo
	 */
	public Collection<AdditionalActivityInfo> getOtherInfo()
	{
		return getOtherInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.otherInfo</code> attribute. 
	 * @param value the otherInfo
	 */
	public void setOtherInfo(final SessionContext ctx, final Collection<AdditionalActivityInfo> value)
	{
		OTHERINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.otherInfo</code> attribute. 
	 * @param value the otherInfo
	 */
	public void setOtherInfo(final Collection<AdditionalActivityInfo> value)
	{
		setOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherInfo. 
	 * @param value the item to add to otherInfo
	 */
	public void addToOtherInfo(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		OTHERINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherInfo. 
	 * @param value the item to add to otherInfo
	 */
	public void addToOtherInfo(final AdditionalActivityInfo value)
	{
		addToOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherInfo. 
	 * @param value the item to remove from otherInfo
	 */
	public void removeFromOtherInfo(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		OTHERINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherInfo. 
	 * @param value the item to remove from otherInfo
	 */
	public void removeFromOtherInfo(final AdditionalActivityInfo value)
	{
		removeFromOtherInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.seatingInfo</code> attribute.
	 * @return the seatingInfo
	 */
	public Collection<SeatingInfo> getSeatingInfo(final SessionContext ctx)
	{
		return SEATINGINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.seatingInfo</code> attribute.
	 * @return the seatingInfo
	 */
	public Collection<SeatingInfo> getSeatingInfo()
	{
		return getSeatingInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.seatingInfo</code> attribute. 
	 * @param value the seatingInfo
	 */
	public void setSeatingInfo(final SessionContext ctx, final Collection<SeatingInfo> value)
	{
		SEATINGINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.seatingInfo</code> attribute. 
	 * @param value the seatingInfo
	 */
	public void setSeatingInfo(final Collection<SeatingInfo> value)
	{
		setSeatingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seatingInfo. 
	 * @param value the item to add to seatingInfo
	 */
	public void addToSeatingInfo(final SessionContext ctx, final SeatingInfo value)
	{
		SEATINGINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seatingInfo. 
	 * @param value the item to add to seatingInfo
	 */
	public void addToSeatingInfo(final SeatingInfo value)
	{
		addToSeatingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seatingInfo. 
	 * @param value the item to remove from seatingInfo
	 */
	public void removeFromSeatingInfo(final SessionContext ctx, final SeatingInfo value)
	{
		SEATINGINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seatingInfo. 
	 * @param value the item to remove from seatingInfo
	 */
	public void removeFromSeatingInfo(final SeatingInfo value)
	{
		removeFromSeatingInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.typeOfInclusionActivites</code> attribute.
	 * @return the typeOfInclusionActivites
	 */
	public Collection<AdditionalActivityInfo> getTypeOfInclusionActivites(final SessionContext ctx)
	{
		return TYPEOFINCLUSIONACTIVITESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Inclusion.typeOfInclusionActivites</code> attribute.
	 * @return the typeOfInclusionActivites
	 */
	public Collection<AdditionalActivityInfo> getTypeOfInclusionActivites()
	{
		return getTypeOfInclusionActivites( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.typeOfInclusionActivites</code> attribute. 
	 * @param value the typeOfInclusionActivites
	 */
	public void setTypeOfInclusionActivites(final SessionContext ctx, final Collection<AdditionalActivityInfo> value)
	{
		TYPEOFINCLUSIONACTIVITESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Inclusion.typeOfInclusionActivites</code> attribute. 
	 * @param value the typeOfInclusionActivites
	 */
	public void setTypeOfInclusionActivites(final Collection<AdditionalActivityInfo> value)
	{
		setTypeOfInclusionActivites( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to typeOfInclusionActivites. 
	 * @param value the item to add to typeOfInclusionActivites
	 */
	public void addToTypeOfInclusionActivites(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		TYPEOFINCLUSIONACTIVITESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to typeOfInclusionActivites. 
	 * @param value the item to add to typeOfInclusionActivites
	 */
	public void addToTypeOfInclusionActivites(final AdditionalActivityInfo value)
	{
		addToTypeOfInclusionActivites( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from typeOfInclusionActivites. 
	 * @param value the item to remove from typeOfInclusionActivites
	 */
	public void removeFromTypeOfInclusionActivites(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		TYPEOFINCLUSIONACTIVITESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from typeOfInclusionActivites. 
	 * @param value the item to remove from typeOfInclusionActivites
	 */
	public void removeFromTypeOfInclusionActivites(final AdditionalActivityInfo value)
	{
		removeFromTypeOfInclusionActivites( getSession().getSessionContext(), value );
	}
	
}
