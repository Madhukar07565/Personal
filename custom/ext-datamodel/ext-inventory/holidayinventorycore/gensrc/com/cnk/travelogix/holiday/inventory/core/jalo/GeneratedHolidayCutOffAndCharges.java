/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.holiday.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.CutOffsAndCharges;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayPenaltyCharges;
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
 * Generated class for type {@link com.cnk.travelogix.holiday.inventory.core.jalo.HolidayCutOffAndCharges HolidayCutOffAndCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayCutOffAndCharges extends CutOffsAndCharges
{
	/** Qualifier of the <code>HolidayCutOffAndCharges.priceComponent</code> attribute **/
	public static final String PRICECOMPONENT = "priceComponent";
	/** Qualifier of the <code>HolidayCutOffAndCharges.applicableOn</code> attribute **/
	public static final String APPLICABLEON = "applicableOn";
	/** Qualifier of the <code>HolidayCutOffAndCharges.holidayPenaltyCharges</code> attribute **/
	public static final String HOLIDAYPENALTYCHARGES = "holidayPenaltyCharges";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOLIDAYPENALTYCHARGES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHolidayCutOffAndCharges> HOLIDAYPENALTYCHARGESHANDLER = new BidirectionalOneToManyHandler<GeneratedHolidayCutOffAndCharges>(
	HolidayinventorycoreConstants.TC.HOLIDAYCUTOFFANDCHARGES,
	false,
	"holidayPenaltyCharges",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CutOffsAndCharges.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRICECOMPONENT, AttributeMode.INITIAL);
		tmp.put(APPLICABLEON, AttributeMode.INITIAL);
		tmp.put(HOLIDAYPENALTYCHARGES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCutOffAndCharges.applicableOn</code> attribute.
	 * @return the applicableOn - Applicable on
	 */
	public EnumerationValue getApplicableOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLICABLEON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCutOffAndCharges.applicableOn</code> attribute.
	 * @return the applicableOn - Applicable on
	 */
	public EnumerationValue getApplicableOn()
	{
		return getApplicableOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCutOffAndCharges.applicableOn</code> attribute. 
	 * @param value the applicableOn - Applicable on
	 */
	public void setApplicableOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLICABLEON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCutOffAndCharges.applicableOn</code> attribute. 
	 * @param value the applicableOn - Applicable on
	 */
	public void setApplicableOn(final EnumerationValue value)
	{
		setApplicableOn( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOLIDAYPENALTYCHARGESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCutOffAndCharges.holidayPenaltyCharges</code> attribute.
	 * @return the holidayPenaltyCharges
	 */
	public HolidayPenaltyCharges getHolidayPenaltyCharges(final SessionContext ctx)
	{
		return (HolidayPenaltyCharges)getProperty( ctx, HOLIDAYPENALTYCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCutOffAndCharges.holidayPenaltyCharges</code> attribute.
	 * @return the holidayPenaltyCharges
	 */
	public HolidayPenaltyCharges getHolidayPenaltyCharges()
	{
		return getHolidayPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCutOffAndCharges.holidayPenaltyCharges</code> attribute. 
	 * @param value the holidayPenaltyCharges
	 */
	public void setHolidayPenaltyCharges(final SessionContext ctx, final HolidayPenaltyCharges value)
	{
		HOLIDAYPENALTYCHARGESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCutOffAndCharges.holidayPenaltyCharges</code> attribute. 
	 * @param value the holidayPenaltyCharges
	 */
	public void setHolidayPenaltyCharges(final HolidayPenaltyCharges value)
	{
		setHolidayPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCutOffAndCharges.priceComponent</code> attribute.
	 * @return the priceComponent - Price 
	 * 						component
	 */
	public EnumerationValue getPriceComponent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayCutOffAndCharges.priceComponent</code> attribute.
	 * @return the priceComponent - Price 
	 * 						component
	 */
	public EnumerationValue getPriceComponent()
	{
		return getPriceComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCutOffAndCharges.priceComponent</code> attribute. 
	 * @param value the priceComponent - Price 
	 * 						component
	 */
	public void setPriceComponent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayCutOffAndCharges.priceComponent</code> attribute. 
	 * @param value the priceComponent - Price 
	 * 						component
	 */
	public void setPriceComponent(final EnumerationValue value)
	{
		setPriceComponent( getSession().getSessionContext(), value );
	}
	
}
