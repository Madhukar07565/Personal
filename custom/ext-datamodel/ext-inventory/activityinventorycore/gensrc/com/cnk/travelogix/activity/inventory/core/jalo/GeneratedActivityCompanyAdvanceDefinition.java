/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.activity.inventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.activity.inventory.core.jalo.ActivityCompanyPenaltyCharges;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.activity.inventory.core.jalo.ActivityCompanyAdvanceDefinition ActivityCompanyAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityCompanyAdvanceDefinition extends GenericItem
{
	/** Qualifier of the <code>ActivityCompanyAdvanceDefinition.blockOutDates</code> attribute **/
	public static final String BLOCKOUTDATES = "blockOutDates";
	/** Qualifier of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute **/
	public static final String OVERBOOKINGALLOWED = "overBookingAllowed";
	/** Qualifier of the <code>ActivityCompanyAdvanceDefinition.penaltyCharges</code> attribute **/
	public static final String PENALTYCHARGES = "penaltyCharges";
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityCompanyPenaltyCharges> PENALTYCHARGESHANDLER = new OneToManyHandler<ActivityCompanyPenaltyCharges>(
	ActivityinventorycoreConstants.TC.ACTIVITYCOMPANYPENALTYCHARGES,
	false,
	"activityCompanyAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BLOCKOUTDATES, AttributeMode.INITIAL);
		tmp.put(OVERBOOKINGALLOWED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block Out Dates
	 */
	public StandardDateRange getBlockOutDates(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, BLOCKOUTDATES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block Out Dates
	 */
	public StandardDateRange getBlockOutDates()
	{
		return getBlockOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block Out Dates
	 */
	public void setBlockOutDates(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, BLOCKOUTDATES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block Out Dates
	 */
	public void setBlockOutDates(final StandardDateRange value)
	{
		setBlockOutDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute.
	 * @return the overBookingAllowed - Over Booking Allowed
	 */
	public Boolean isOverBookingAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OVERBOOKINGALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute.
	 * @return the overBookingAllowed - Over Booking Allowed
	 */
	public Boolean isOverBookingAllowed()
	{
		return isOverBookingAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @return the overBookingAllowed - Over Booking Allowed
	 */
	public boolean isOverBookingAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOverBookingAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @return the overBookingAllowed - Over Booking Allowed
	 */
	public boolean isOverBookingAllowedAsPrimitive()
	{
		return isOverBookingAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over Booking Allowed
	 */
	public void setOverBookingAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OVERBOOKINGALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over Booking Allowed
	 */
	public void setOverBookingAllowed(final Boolean value)
	{
		setOverBookingAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over Booking Allowed
	 */
	public void setOverBookingAllowed(final SessionContext ctx, final boolean value)
	{
		setOverBookingAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over Booking Allowed
	 */
	public void setOverBookingAllowed(final boolean value)
	{
		setOverBookingAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<ActivityCompanyPenaltyCharges> getPenaltyCharges(final SessionContext ctx)
	{
		return PENALTYCHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityCompanyAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<ActivityCompanyPenaltyCharges> getPenaltyCharges()
	{
		return getPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final SessionContext ctx, final Collection<ActivityCompanyPenaltyCharges> value)
	{
		PENALTYCHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityCompanyAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final Collection<ActivityCompanyPenaltyCharges> value)
	{
		setPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final SessionContext ctx, final ActivityCompanyPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final ActivityCompanyPenaltyCharges value)
	{
		addToPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final SessionContext ctx, final ActivityCompanyPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final ActivityCompanyPenaltyCharges value)
	{
		removeFromPenaltyCharges( getSession().getSessionContext(), value );
	}
	
}
