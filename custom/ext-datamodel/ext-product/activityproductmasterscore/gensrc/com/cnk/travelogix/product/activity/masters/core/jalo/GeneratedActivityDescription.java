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
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.ActivityDescription ActivityDescription}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityDescription extends GenericItem
{
	/** Qualifier of the <code>ActivityDescription.fromToDate</code> attribute **/
	public static final String FROMTODATE = "fromToDate";
	/** Qualifier of the <code>ActivityDescription.shortDescription</code> attribute **/
	public static final String SHORTDESCRIPTION = "shortDescription";
	/** Qualifier of the <code>ActivityDescription.longDescription</code> attribute **/
	public static final String LONGDESCRIPTION = "longDescription";
	/** Qualifier of the <code>ActivityDescription.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/** Qualifier of the <code>ActivityDescription.activityProductSubTypeActivityDescription</code> attribute **/
	public static final String ACTIVITYPRODUCTSUBTYPEACTIVITYDESCRIPTION = "activityProductSubTypeActivityDescription";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedActivityDescription> ACTIVITYPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedActivityDescription>(
	ActivityproductmasterscoreConstants.TC.ACTIVITYDESCRIPTION,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCTSUBTYPEACTIVITYDESCRIPTION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedActivityDescription> ACTIVITYPRODUCTSUBTYPEACTIVITYDESCRIPTIONHANDLER = new BidirectionalOneToManyHandler<GeneratedActivityDescription>(
	ActivityproductmasterscoreConstants.TC.ACTIVITYDESCRIPTION,
	false,
	"activityProductSubTypeActivityDescription",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FROMTODATE, AttributeMode.INITIAL);
		tmp.put(SHORTDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(LONGDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCT, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCTSUBTYPEACTIVITYDESCRIPTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.activityProductSubTypeActivityDescription</code> attribute.
	 * @return the activityProductSubTypeActivityDescription
	 */
	public ActivityProductSubType getActivityProductSubTypeActivityDescription(final SessionContext ctx)
	{
		return (ActivityProductSubType)getProperty( ctx, ACTIVITYPRODUCTSUBTYPEACTIVITYDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.activityProductSubTypeActivityDescription</code> attribute.
	 * @return the activityProductSubTypeActivityDescription
	 */
	public ActivityProductSubType getActivityProductSubTypeActivityDescription()
	{
		return getActivityProductSubTypeActivityDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.activityProductSubTypeActivityDescription</code> attribute. 
	 * @param value the activityProductSubTypeActivityDescription
	 */
	public void setActivityProductSubTypeActivityDescription(final SessionContext ctx, final ActivityProductSubType value)
	{
		ACTIVITYPRODUCTSUBTYPEACTIVITYDESCRIPTIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.activityProductSubTypeActivityDescription</code> attribute. 
	 * @param value the activityProductSubTypeActivityDescription
	 */
	public void setActivityProductSubTypeActivityDescription(final ActivityProductSubType value)
	{
		setActivityProductSubTypeActivityDescription( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTHANDLER.newInstance(ctx, allAttributes);
		ACTIVITYPRODUCTSUBTYPEACTIVITYDESCRIPTIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.fromToDate</code> attribute.
	 * @return the fromToDate - From and To Date
	 */
	public StandardDateRange getFromToDate(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, FROMTODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.fromToDate</code> attribute.
	 * @return the fromToDate - From and To Date
	 */
	public StandardDateRange getFromToDate()
	{
		return getFromToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.fromToDate</code> attribute. 
	 * @param value the fromToDate - From and To Date
	 */
	public void setFromToDate(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, FROMTODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.fromToDate</code> attribute. 
	 * @param value the fromToDate - From and To Date
	 */
	public void setFromToDate(final StandardDateRange value)
	{
		setFromToDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.longDescription</code> attribute.
	 * @return the longDescription - Long Description
	 */
	public String getLongDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityDescription.getLongDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LONGDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.longDescription</code> attribute.
	 * @return the longDescription - Long Description
	 */
	public String getLongDescription()
	{
		return getLongDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.longDescription</code> attribute. 
	 * @return the localized longDescription - Long Description
	 */
	public Map<Language,String> getAllLongDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LONGDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.longDescription</code> attribute. 
	 * @return the localized longDescription - Long Description
	 */
	public Map<Language,String> getAllLongDescription()
	{
		return getAllLongDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.longDescription</code> attribute. 
	 * @param value the longDescription - Long Description
	 */
	public void setLongDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityDescription.setLongDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LONGDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.longDescription</code> attribute. 
	 * @param value the longDescription - Long Description
	 */
	public void setLongDescription(final String value)
	{
		setLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.longDescription</code> attribute. 
	 * @param value the longDescription - Long Description
	 */
	public void setAllLongDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LONGDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.longDescription</code> attribute. 
	 * @param value the longDescription - Long Description
	 */
	public void setAllLongDescription(final Map<Language,String> value)
	{
		setAllLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.shortDescription</code> attribute.
	 * @return the shortDescription - Short Description
	 */
	public String getShortDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityDescription.getShortDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SHORTDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.shortDescription</code> attribute.
	 * @return the shortDescription - Short Description
	 */
	public String getShortDescription()
	{
		return getShortDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.shortDescription</code> attribute. 
	 * @return the localized shortDescription - Short Description
	 */
	public Map<Language,String> getAllShortDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SHORTDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDescription.shortDescription</code> attribute. 
	 * @return the localized shortDescription - Short Description
	 */
	public Map<Language,String> getAllShortDescription()
	{
		return getAllShortDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.shortDescription</code> attribute. 
	 * @param value the shortDescription - Short Description
	 */
	public void setShortDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityDescription.setShortDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SHORTDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.shortDescription</code> attribute. 
	 * @param value the shortDescription - Short Description
	 */
	public void setShortDescription(final String value)
	{
		setShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.shortDescription</code> attribute. 
	 * @param value the shortDescription - Short Description
	 */
	public void setAllShortDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SHORTDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDescription.shortDescription</code> attribute. 
	 * @param value the shortDescription - Short Description
	 */
	public void setAllShortDescription(final Map<Language,String> value)
	{
		setAllShortDescription( getSession().getSessionContext(), value );
	}
	
}
