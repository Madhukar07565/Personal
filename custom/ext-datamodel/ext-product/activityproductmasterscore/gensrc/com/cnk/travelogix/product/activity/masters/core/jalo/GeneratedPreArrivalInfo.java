/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.activity.masters.core.jalo.DiningTips;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.PreArrivalInfo PreArrivalInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPreArrivalInfo extends GenericItem
{
	/** Qualifier of the <code>PreArrivalInfo.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>PreArrivalInfo.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>PreArrivalInfo.month</code> attribute **/
	public static final String MONTH = "month";
	/** Qualifier of the <code>PreArrivalInfo.monthDescription</code> attribute **/
	public static final String MONTHDESCRIPTION = "monthDescription";
	/** Qualifier of the <code>PreArrivalInfo.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/** Qualifier of the <code>PreArrivalInfo.diningTips</code> attribute **/
	public static final String DININGTIPS = "diningTips";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPreArrivalInfo> ACTIVITYPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedPreArrivalInfo>(
	ActivityproductmasterscoreConstants.TC.PREARRIVALINFO,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DININGTIPS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPreArrivalInfo> DININGTIPSHANDLER = new BidirectionalOneToManyHandler<GeneratedPreArrivalInfo>(
	ActivityproductmasterscoreConstants.TC.PREARRIVALINFO,
	false,
	"diningTips",
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
		tmp.put(MONTH, AttributeMode.INITIAL);
		tmp.put(MONTHDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCT, AttributeMode.INITIAL);
		tmp.put(DININGTIPS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTHANDLER.newInstance(ctx, allAttributes);
		DININGTIPSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPreArrivalInfo.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPreArrivalInfo.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.diningTips</code> attribute.
	 * @return the diningTips
	 */
	public DiningTips getDiningTips(final SessionContext ctx)
	{
		return (DiningTips)getProperty( ctx, DININGTIPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.diningTips</code> attribute.
	 * @return the diningTips
	 */
	public DiningTips getDiningTips()
	{
		return getDiningTips( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.diningTips</code> attribute. 
	 * @param value the diningTips
	 */
	public void setDiningTips(final SessionContext ctx, final DiningTips value)
	{
		DININGTIPSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.diningTips</code> attribute. 
	 * @param value the diningTips
	 */
	public void setDiningTips(final DiningTips value)
	{
		setDiningTips( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.month</code> attribute.
	 * @return the month - Month.
	 */
	public EnumerationValue getMonth(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MONTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.month</code> attribute.
	 * @return the month - Month.
	 */
	public EnumerationValue getMonth()
	{
		return getMonth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.month</code> attribute. 
	 * @param value the month - Month.
	 */
	public void setMonth(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MONTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.month</code> attribute. 
	 * @param value the month - Month.
	 */
	public void setMonth(final EnumerationValue value)
	{
		setMonth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.monthDescription</code> attribute.
	 * @return the monthDescription - Month Description.
	 */
	public String getMonthDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPreArrivalInfo.getMonthDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, MONTHDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.monthDescription</code> attribute.
	 * @return the monthDescription - Month Description.
	 */
	public String getMonthDescription()
	{
		return getMonthDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.monthDescription</code> attribute. 
	 * @return the localized monthDescription - Month Description.
	 */
	public Map<Language,String> getAllMonthDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,MONTHDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.monthDescription</code> attribute. 
	 * @return the localized monthDescription - Month Description.
	 */
	public Map<Language,String> getAllMonthDescription()
	{
		return getAllMonthDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.monthDescription</code> attribute. 
	 * @param value the monthDescription - Month Description.
	 */
	public void setMonthDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPreArrivalInfo.setMonthDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MONTHDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.monthDescription</code> attribute. 
	 * @param value the monthDescription - Month Description.
	 */
	public void setMonthDescription(final String value)
	{
		setMonthDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.monthDescription</code> attribute. 
	 * @param value the monthDescription - Month Description.
	 */
	public void setAllMonthDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,MONTHDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.monthDescription</code> attribute. 
	 * @param value the monthDescription - Month Description.
	 */
	public void setAllMonthDescription(final Map<Language,String> value)
	{
		setAllMonthDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPreArrivalInfo.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.name</code> attribute.
	 * @return the name - Name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PreArrivalInfo.name</code> attribute. 
	 * @return the localized name - Name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPreArrivalInfo.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PreArrivalInfo.name</code> attribute. 
	 * @param value the name - Name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
}
