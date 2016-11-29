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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.AwardInfo AwardInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAwardInfo extends GenericItem
{
	/** Qualifier of the <code>AwardInfo.awardCategory</code> attribute **/
	public static final String AWARDCATEGORY = "awardCategory";
	/** Qualifier of the <code>AwardInfo.awardName</code> attribute **/
	public static final String AWARDNAME = "awardName";
	/** Qualifier of the <code>AwardInfo.additionalActivityInfoAwards</code> attribute **/
	public static final String ADDITIONALACTIVITYINFOAWARDS = "additionalActivityInfoAwards";
	/** Qualifier of the <code>AwardInfo.nominees</code> attribute **/
	public static final String NOMINEES = "nominees";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADDITIONALACTIVITYINFOAWARDS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAwardInfo> ADDITIONALACTIVITYINFOAWARDSHANDLER = new BidirectionalOneToManyHandler<GeneratedAwardInfo>(
	ActivityproductmasterscoreConstants.TC.AWARDINFO,
	false,
	"additionalActivityInfoAwards",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n NOMINEES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<GeneralDescription> NOMINEESHANDLER = new OneToManyHandler<GeneralDescription>(
	ActivityproductmasterscoreConstants.TC.GENERALDESCRIPTIONINFO,
	false,
	"awardInfoNominees",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AWARDCATEGORY, AttributeMode.INITIAL);
		tmp.put(AWARDNAME, AttributeMode.INITIAL);
		tmp.put(ADDITIONALACTIVITYINFOAWARDS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AwardInfo.additionalActivityInfoAwards</code> attribute.
	 * @return the additionalActivityInfoAwards
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoAwards(final SessionContext ctx)
	{
		return (AdditionalActivityInfo)getProperty( ctx, ADDITIONALACTIVITYINFOAWARDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AwardInfo.additionalActivityInfoAwards</code> attribute.
	 * @return the additionalActivityInfoAwards
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoAwards()
	{
		return getAdditionalActivityInfoAwards( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AwardInfo.additionalActivityInfoAwards</code> attribute. 
	 * @param value the additionalActivityInfoAwards
	 */
	public void setAdditionalActivityInfoAwards(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ADDITIONALACTIVITYINFOAWARDSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AwardInfo.additionalActivityInfoAwards</code> attribute. 
	 * @param value the additionalActivityInfoAwards
	 */
	public void setAdditionalActivityInfoAwards(final AdditionalActivityInfo value)
	{
		setAdditionalActivityInfoAwards( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AwardInfo.awardCategory</code> attribute.
	 * @return the awardCategory - Award Category
	 */
	public String getAwardCategory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AWARDCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AwardInfo.awardCategory</code> attribute.
	 * @return the awardCategory - Award Category
	 */
	public String getAwardCategory()
	{
		return getAwardCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AwardInfo.awardCategory</code> attribute. 
	 * @param value the awardCategory - Award Category
	 */
	public void setAwardCategory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AWARDCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AwardInfo.awardCategory</code> attribute. 
	 * @param value the awardCategory - Award Category
	 */
	public void setAwardCategory(final String value)
	{
		setAwardCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AwardInfo.awardName</code> attribute.
	 * @return the awardName - Award Name
	 */
	public String getAwardName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AWARDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AwardInfo.awardName</code> attribute.
	 * @return the awardName - Award Name
	 */
	public String getAwardName()
	{
		return getAwardName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AwardInfo.awardName</code> attribute. 
	 * @param value the awardName - Award Name
	 */
	public void setAwardName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AWARDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AwardInfo.awardName</code> attribute. 
	 * @param value the awardName - Award Name
	 */
	public void setAwardName(final String value)
	{
		setAwardName( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADDITIONALACTIVITYINFOAWARDSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AwardInfo.nominees</code> attribute.
	 * @return the nominees
	 */
	public Collection<GeneralDescription> getNominees(final SessionContext ctx)
	{
		return NOMINEESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AwardInfo.nominees</code> attribute.
	 * @return the nominees
	 */
	public Collection<GeneralDescription> getNominees()
	{
		return getNominees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AwardInfo.nominees</code> attribute. 
	 * @param value the nominees
	 */
	public void setNominees(final SessionContext ctx, final Collection<GeneralDescription> value)
	{
		NOMINEESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AwardInfo.nominees</code> attribute. 
	 * @param value the nominees
	 */
	public void setNominees(final Collection<GeneralDescription> value)
	{
		setNominees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to nominees. 
	 * @param value the item to add to nominees
	 */
	public void addToNominees(final SessionContext ctx, final GeneralDescription value)
	{
		NOMINEESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to nominees. 
	 * @param value the item to add to nominees
	 */
	public void addToNominees(final GeneralDescription value)
	{
		addToNominees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from nominees. 
	 * @param value the item to remove from nominees
	 */
	public void removeFromNominees(final SessionContext ctx, final GeneralDescription value)
	{
		NOMINEESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from nominees. 
	 * @param value the item to remove from nominees
	 */
	public void removeFromNominees(final GeneralDescription value)
	{
		removeFromNominees( getSession().getSessionContext(), value );
	}
	
}
