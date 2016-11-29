/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.SpaInfo SpaInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSpaInfo extends GenericItem
{
	/** Qualifier of the <code>SpaInfo.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>SpaInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>SpaInfo.benefit</code> attribute **/
	public static final String BENEFIT = "benefit";
	/** Qualifier of the <code>SpaInfo.recommended</code> attribute **/
	public static final String RECOMMENDED = "recommended";
	/** Qualifier of the <code>SpaInfo.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>SpaInfo.additionalActivityInfoSpaInfo</code> attribute **/
	public static final String ADDITIONALACTIVITYINFOSPAINFO = "additionalActivityInfoSpaInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADDITIONALACTIVITYINFOSPAINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSpaInfo> ADDITIONALACTIVITYINFOSPAINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedSpaInfo>(
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
		tmp.put(BENEFIT, AttributeMode.INITIAL);
		tmp.put(RECOMMENDED, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(ADDITIONALACTIVITYINFOSPAINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.additionalActivityInfoSpaInfo</code> attribute.
	 * @return the additionalActivityInfoSpaInfo
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoSpaInfo(final SessionContext ctx)
	{
		return (AdditionalActivityInfo)getProperty( ctx, ADDITIONALACTIVITYINFOSPAINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.additionalActivityInfoSpaInfo</code> attribute.
	 * @return the additionalActivityInfoSpaInfo
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoSpaInfo()
	{
		return getAdditionalActivityInfoSpaInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.additionalActivityInfoSpaInfo</code> attribute. 
	 * @param value the additionalActivityInfoSpaInfo
	 */
	public void setAdditionalActivityInfoSpaInfo(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ADDITIONALACTIVITYINFOSPAINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.additionalActivityInfoSpaInfo</code> attribute. 
	 * @param value the additionalActivityInfoSpaInfo
	 */
	public void setAdditionalActivityInfoSpaInfo(final AdditionalActivityInfo value)
	{
		setAdditionalActivityInfoSpaInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.benefit</code> attribute.
	 * @return the benefit - how to benefit
	 */
	public String getBenefit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BENEFIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.benefit</code> attribute.
	 * @return the benefit - how to benefit
	 */
	public String getBenefit()
	{
		return getBenefit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.benefit</code> attribute. 
	 * @param value the benefit - how to benefit
	 */
	public void setBenefit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BENEFIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.benefit</code> attribute. 
	 * @param value the benefit - how to benefit
	 */
	public void setBenefit(final String value)
	{
		setBenefit( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADDITIONALACTIVITYINFOSPAINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.description</code> attribute.
	 * @return the description - Service description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.description</code> attribute.
	 * @return the description - Service description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.description</code> attribute. 
	 * @param value the description - Service description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.description</code> attribute. 
	 * @param value the description - Service description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.duration</code> attribute.
	 * @return the duration - Duration
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.duration</code> attribute.
	 * @return the duration - Duration
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.duration</code> attribute. 
	 * @param value the duration - Duration
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.duration</code> attribute. 
	 * @param value the duration - Duration
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.name</code> attribute.
	 * @return the name - Service name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.name</code> attribute.
	 * @return the name - Service name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.name</code> attribute. 
	 * @param value the name - Service name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.name</code> attribute. 
	 * @param value the name - Service name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.recommended</code> attribute.
	 * @return the recommended - Recommended for
	 */
	public String getRecommended(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECOMMENDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpaInfo.recommended</code> attribute.
	 * @return the recommended - Recommended for
	 */
	public String getRecommended()
	{
		return getRecommended( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.recommended</code> attribute. 
	 * @param value the recommended - Recommended for
	 */
	public void setRecommended(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECOMMENDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpaInfo.recommended</code> attribute. 
	 * @param value the recommended - Recommended for
	 */
	public void setRecommended(final String value)
	{
		setRecommended( getSession().getSessionContext(), value );
	}
	
}
