/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.MonthlyWeather MonthlyWeather}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMonthlyWeather extends GenericItem
{
	/** Qualifier of the <code>MonthlyWeather.destinationWeather</code> attribute **/
	public static final String DESTINATIONWEATHER = "destinationWeather";
	/** Qualifier of the <code>MonthlyWeather.minTemp</code> attribute **/
	public static final String MINTEMP = "minTemp";
	/** Qualifier of the <code>MonthlyWeather.maxTemp</code> attribute **/
	public static final String MAXTEMP = "maxTemp";
	/** Qualifier of the <code>MonthlyWeather.month</code> attribute **/
	public static final String MONTH = "month";
	/** Qualifier of the <code>MonthlyWeather.activityProduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityProduct";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMonthlyWeather> ACTIVITYPRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedMonthlyWeather>(
	ActivityproductmasterscoreConstants.TC.MONTHLYWEATHER,
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
		tmp.put(DESTINATIONWEATHER, AttributeMode.INITIAL);
		tmp.put(MINTEMP, AttributeMode.INITIAL);
		tmp.put(MAXTEMP, AttributeMode.INITIAL);
		tmp.put(MONTH, AttributeMode.INITIAL);
		tmp.put(ACTIVITYPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, ACTIVITYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.activityProduct</code> attribute.
	 * @return the activityProduct
	 */
	public ActivityProduct getActivityProduct()
	{
		return getActivityProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.activityProduct</code> attribute. 
	 * @param value the activityProduct
	 */
	public void setActivityProduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.activityProduct</code> attribute. 
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
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.destinationWeather</code> attribute.
	 * @return the destinationWeather - Destination Weather
	 */
	public String getDestinationWeather(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESTINATIONWEATHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.destinationWeather</code> attribute.
	 * @return the destinationWeather - Destination Weather
	 */
	public String getDestinationWeather()
	{
		return getDestinationWeather( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.destinationWeather</code> attribute. 
	 * @param value the destinationWeather - Destination Weather
	 */
	public void setDestinationWeather(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESTINATIONWEATHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.destinationWeather</code> attribute. 
	 * @param value the destinationWeather - Destination Weather
	 */
	public void setDestinationWeather(final String value)
	{
		setDestinationWeather( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.maxTemp</code> attribute.
	 * @return the maxTemp - Maximum Temperature.
	 */
	public String getMaxTemp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MAXTEMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.maxTemp</code> attribute.
	 * @return the maxTemp - Maximum Temperature.
	 */
	public String getMaxTemp()
	{
		return getMaxTemp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.maxTemp</code> attribute. 
	 * @param value the maxTemp - Maximum Temperature.
	 */
	public void setMaxTemp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MAXTEMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.maxTemp</code> attribute. 
	 * @param value the maxTemp - Maximum Temperature.
	 */
	public void setMaxTemp(final String value)
	{
		setMaxTemp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.minTemp</code> attribute.
	 * @return the minTemp - Minimum Temperature.
	 */
	public String getMinTemp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MINTEMP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.minTemp</code> attribute.
	 * @return the minTemp - Minimum Temperature.
	 */
	public String getMinTemp()
	{
		return getMinTemp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.minTemp</code> attribute. 
	 * @param value the minTemp - Minimum Temperature.
	 */
	public void setMinTemp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MINTEMP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.minTemp</code> attribute. 
	 * @param value the minTemp - Minimum Temperature.
	 */
	public void setMinTemp(final String value)
	{
		setMinTemp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.month</code> attribute.
	 * @return the month - Month
	 */
	public EnumerationValue getMonth(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MONTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MonthlyWeather.month</code> attribute.
	 * @return the month - Month
	 */
	public EnumerationValue getMonth()
	{
		return getMonth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.month</code> attribute. 
	 * @param value the month - Month
	 */
	public void setMonth(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MONTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MonthlyWeather.month</code> attribute. 
	 * @param value the month - Month
	 */
	public void setMonth(final EnumerationValue value)
	{
		setMonth( getSession().getSessionContext(), value );
	}
	
}
