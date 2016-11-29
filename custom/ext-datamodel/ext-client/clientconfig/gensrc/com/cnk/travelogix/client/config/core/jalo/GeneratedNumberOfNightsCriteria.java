/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.TriggerEvent;
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
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.NumberOfNightsCriteria NumberOfNightsCriteria}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNumberOfNightsCriteria extends GenericItem
{
	/** Qualifier of the <code>NumberOfNightsCriteria.numberofDays</code> attribute **/
	public static final String NUMBEROFDAYS = "numberofDays";
	/** Qualifier of the <code>NumberOfNightsCriteria.numberOfDaysDetails</code> attribute **/
	public static final String NUMBEROFDAYSDETAILS = "numberOfDaysDetails";
	/** Qualifier of the <code>NumberOfNightsCriteria.triggerEvent</code> attribute **/
	public static final String TRIGGEREVENT = "triggerEvent";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRIGGEREVENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedNumberOfNightsCriteria> TRIGGEREVENTHANDLER = new BidirectionalOneToManyHandler<GeneratedNumberOfNightsCriteria>(
	ClientconfigConstants.TC.NUMBEROFNIGHTSCRITERIA,
	false,
	"triggerEvent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NUMBEROFDAYS, AttributeMode.INITIAL);
		tmp.put(NUMBEROFDAYSDETAILS, AttributeMode.INITIAL);
		tmp.put(TRIGGEREVENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRIGGEREVENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NumberOfNightsCriteria.numberofDays</code> attribute.
	 * @return the numberofDays - Client Document Handling Number Of Days
	 */
	public Integer getNumberofDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NumberOfNightsCriteria.numberofDays</code> attribute.
	 * @return the numberofDays - Client Document Handling Number Of Days
	 */
	public Integer getNumberofDays()
	{
		return getNumberofDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NumberOfNightsCriteria.numberofDays</code> attribute. 
	 * @return the numberofDays - Client Document Handling Number Of Days
	 */
	public int getNumberofDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberofDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NumberOfNightsCriteria.numberofDays</code> attribute. 
	 * @return the numberofDays - Client Document Handling Number Of Days
	 */
	public int getNumberofDaysAsPrimitive()
	{
		return getNumberofDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NumberOfNightsCriteria.numberofDays</code> attribute. 
	 * @param value the numberofDays - Client Document Handling Number Of Days
	 */
	public void setNumberofDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NumberOfNightsCriteria.numberofDays</code> attribute. 
	 * @param value the numberofDays - Client Document Handling Number Of Days
	 */
	public void setNumberofDays(final Integer value)
	{
		setNumberofDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NumberOfNightsCriteria.numberofDays</code> attribute. 
	 * @param value the numberofDays - Client Document Handling Number Of Days
	 */
	public void setNumberofDays(final SessionContext ctx, final int value)
	{
		setNumberofDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NumberOfNightsCriteria.numberofDays</code> attribute. 
	 * @param value the numberofDays - Client Document Handling Number Of Days
	 */
	public void setNumberofDays(final int value)
	{
		setNumberofDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NumberOfNightsCriteria.numberOfDaysDetails</code> attribute.
	 * @return the numberOfDaysDetails - Client Document Handling Number Of Days Details
	 */
	public EnumerationValue getNumberOfDaysDetails(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, NUMBEROFDAYSDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NumberOfNightsCriteria.numberOfDaysDetails</code> attribute.
	 * @return the numberOfDaysDetails - Client Document Handling Number Of Days Details
	 */
	public EnumerationValue getNumberOfDaysDetails()
	{
		return getNumberOfDaysDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NumberOfNightsCriteria.numberOfDaysDetails</code> attribute. 
	 * @param value the numberOfDaysDetails - Client Document Handling Number Of Days Details
	 */
	public void setNumberOfDaysDetails(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, NUMBEROFDAYSDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NumberOfNightsCriteria.numberOfDaysDetails</code> attribute. 
	 * @param value the numberOfDaysDetails - Client Document Handling Number Of Days Details
	 */
	public void setNumberOfDaysDetails(final EnumerationValue value)
	{
		setNumberOfDaysDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NumberOfNightsCriteria.triggerEvent</code> attribute.
	 * @return the triggerEvent
	 */
	public TriggerEvent getTriggerEvent(final SessionContext ctx)
	{
		return (TriggerEvent)getProperty( ctx, TRIGGEREVENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NumberOfNightsCriteria.triggerEvent</code> attribute.
	 * @return the triggerEvent
	 */
	public TriggerEvent getTriggerEvent()
	{
		return getTriggerEvent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NumberOfNightsCriteria.triggerEvent</code> attribute. 
	 * @param value the triggerEvent
	 */
	public void setTriggerEvent(final SessionContext ctx, final TriggerEvent value)
	{
		TRIGGEREVENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NumberOfNightsCriteria.triggerEvent</code> attribute. 
	 * @param value the triggerEvent
	 */
	public void setTriggerEvent(final TriggerEvent value)
	{
		setTriggerEvent( getSession().getSessionContext(), value );
	}
	
}
