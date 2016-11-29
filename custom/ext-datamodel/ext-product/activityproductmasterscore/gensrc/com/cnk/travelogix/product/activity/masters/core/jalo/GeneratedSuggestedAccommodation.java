/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.SuggestedAccommodation SuggestedAccommodation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSuggestedAccommodation extends GenericItem
{
	/** Qualifier of the <code>SuggestedAccommodation.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>SuggestedAccommodation.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>SuggestedAccommodation.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>SuggestedAccommodation.productName</code> attribute **/
	public static final String PRODUCTNAME = "productName";
	/** Qualifier of the <code>SuggestedAccommodation.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSuggestedAccommodation> ACTIVITYPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedSuggestedAccommodation>(
	ActivityproductmasterscoreConstants.TC.SUGGESTEDACCOMMODATION,
	false,
	"activityProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PRODUCTNAME, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final ActivityProduct value)
	{
		setActivityProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.city</code> attribute.
	 * @return the city - City.
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.city</code> attribute.
	 * @return the city - City.
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.city</code> attribute. 
	 * @param value the city - City.
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.city</code> attribute. 
	 * @param value the city - City.
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.country</code> attribute.
	 * @return the country - Country.
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.country</code> attribute.
	 * @return the country - Country.
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.country</code> attribute. 
	 * @param value the country - Country.
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.country</code> attribute. 
	 * @param value the country - Country.
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACTIVITYPRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSuggestedAccommodation.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.description</code> attribute.
	 * @return the description - Description.
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.description</code> attribute. 
	 * @return the localized description - Description.
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.description</code> attribute. 
	 * @return the localized description - Description.
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedSuggestedAccommodation.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.description</code> attribute. 
	 * @param value the description - Description.
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.productName</code> attribute.
	 * @return the productName - Product Name
	 */
	public Accommodation getProductName(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, PRODUCTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SuggestedAccommodation.productName</code> attribute.
	 * @return the productName - Product Name
	 */
	public Accommodation getProductName()
	{
		return getProductName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.productName</code> attribute. 
	 * @param value the productName - Product Name
	 */
	public void setProductName(final SessionContext ctx, final Accommodation value)
	{
		setProperty(ctx, PRODUCTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SuggestedAccommodation.productName</code> attribute. 
	 * @param value the productName - Product Name
	 */
	public void setProductName(final Accommodation value)
	{
		setProductName( getSession().getSessionContext(), value );
	}
	
}
