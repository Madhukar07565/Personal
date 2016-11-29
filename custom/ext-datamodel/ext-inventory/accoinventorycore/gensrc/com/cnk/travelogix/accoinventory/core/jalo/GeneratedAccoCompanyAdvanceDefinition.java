/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AccoCompanyPenaltyCharges;
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
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AccoCompanyAdvanceDefinition AccoCompanyAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoCompanyAdvanceDefinition extends GenericItem
{
	/** Qualifier of the <code>AccoCompanyAdvanceDefinition.blockOutDates</code> attribute **/
	public static final String BLOCKOUTDATES = "blockOutDates";
	/** Qualifier of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute **/
	public static final String OVERBOOKINGALLOWED = "overBookingAllowed";
	/** Qualifier of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute **/
	public static final String MINIMUMNUMBEROFNIGHTS = "minimumNumberOfNights";
	/** Qualifier of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute **/
	public static final String MAXIMUMNUMBEROFNIGHTS = "maximumNumberOfNights";
	/** Qualifier of the <code>AccoCompanyAdvanceDefinition.penaltyCharges</code> attribute **/
	public static final String PENALTYCHARGES = "penaltyCharges";
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoCompanyPenaltyCharges> PENALTYCHARGESHANDLER = new OneToManyHandler<AccoCompanyPenaltyCharges>(
	AccoinventorycoreConstants.TC.ACCOCOMPANYPENALTYCHARGES,
	false,
	"accoCompanyAdvanceDefinition",
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
		tmp.put(MINIMUMNUMBEROFNIGHTS, AttributeMode.INITIAL);
		tmp.put(MAXIMUMNUMBEROFNIGHTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block Out Dates
	 */
	public Set<StandardDateRange> getBlockOutDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, BLOCKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block Out Dates
	 */
	public Set<StandardDateRange> getBlockOutDates()
	{
		return getBlockOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block Out Dates
	 */
	public void setBlockOutDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, BLOCKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block Out Dates
	 */
	public void setBlockOutDates(final Set<StandardDateRange> value)
	{
		setBlockOutDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute.
	 * @return the maximumNumberOfNights - Maximum Number Of Nights
	 */
	public Integer getMaximumNumberOfNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXIMUMNUMBEROFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute.
	 * @return the maximumNumberOfNights - Maximum Number Of Nights
	 */
	public Integer getMaximumNumberOfNights()
	{
		return getMaximumNumberOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute. 
	 * @return the maximumNumberOfNights - Maximum Number Of Nights
	 */
	public int getMaximumNumberOfNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaximumNumberOfNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute. 
	 * @return the maximumNumberOfNights - Maximum Number Of Nights
	 */
	public int getMaximumNumberOfNightsAsPrimitive()
	{
		return getMaximumNumberOfNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute. 
	 * @param value the maximumNumberOfNights - Maximum Number Of Nights
	 */
	public void setMaximumNumberOfNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXIMUMNUMBEROFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute. 
	 * @param value the maximumNumberOfNights - Maximum Number Of Nights
	 */
	public void setMaximumNumberOfNights(final Integer value)
	{
		setMaximumNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute. 
	 * @param value the maximumNumberOfNights - Maximum Number Of Nights
	 */
	public void setMaximumNumberOfNights(final SessionContext ctx, final int value)
	{
		setMaximumNumberOfNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.maximumNumberOfNights</code> attribute. 
	 * @param value the maximumNumberOfNights - Maximum Number Of Nights
	 */
	public void setMaximumNumberOfNights(final int value)
	{
		setMaximumNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute.
	 * @return the minimumNumberOfNights - Minimum Number Of Nights
	 */
	public Integer getMinimumNumberOfNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINIMUMNUMBEROFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute.
	 * @return the minimumNumberOfNights - Minimum Number Of Nights
	 */
	public Integer getMinimumNumberOfNights()
	{
		return getMinimumNumberOfNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute. 
	 * @return the minimumNumberOfNights - Minimum Number Of Nights
	 */
	public int getMinimumNumberOfNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumNumberOfNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute. 
	 * @return the minimumNumberOfNights - Minimum Number Of Nights
	 */
	public int getMinimumNumberOfNightsAsPrimitive()
	{
		return getMinimumNumberOfNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute. 
	 * @param value the minimumNumberOfNights - Minimum Number Of Nights
	 */
	public void setMinimumNumberOfNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINIMUMNUMBEROFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute. 
	 * @param value the minimumNumberOfNights - Minimum Number Of Nights
	 */
	public void setMinimumNumberOfNights(final Integer value)
	{
		setMinimumNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute. 
	 * @param value the minimumNumberOfNights - Minimum Number Of Nights
	 */
	public void setMinimumNumberOfNights(final SessionContext ctx, final int value)
	{
		setMinimumNumberOfNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.minimumNumberOfNights</code> attribute. 
	 * @param value the minimumNumberOfNights - Minimum Number Of Nights
	 */
	public void setMinimumNumberOfNights(final int value)
	{
		setMinimumNumberOfNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute.
	 * @return the overBookingAllowed - Over Booking Allowed
	 */
	public Boolean isOverBookingAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OVERBOOKINGALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute.
	 * @return the overBookingAllowed - Over Booking Allowed
	 */
	public Boolean isOverBookingAllowed()
	{
		return isOverBookingAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @return the overBookingAllowed - Over Booking Allowed
	 */
	public boolean isOverBookingAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOverBookingAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @return the overBookingAllowed - Over Booking Allowed
	 */
	public boolean isOverBookingAllowedAsPrimitive()
	{
		return isOverBookingAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over Booking Allowed
	 */
	public void setOverBookingAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OVERBOOKINGALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over Booking Allowed
	 */
	public void setOverBookingAllowed(final Boolean value)
	{
		setOverBookingAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over Booking Allowed
	 */
	public void setOverBookingAllowed(final SessionContext ctx, final boolean value)
	{
		setOverBookingAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over Booking Allowed
	 */
	public void setOverBookingAllowed(final boolean value)
	{
		setOverBookingAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<AccoCompanyPenaltyCharges> getPenaltyCharges(final SessionContext ctx)
	{
		return PENALTYCHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<AccoCompanyPenaltyCharges> getPenaltyCharges()
	{
		return getPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final SessionContext ctx, final Collection<AccoCompanyPenaltyCharges> value)
	{
		PENALTYCHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final Collection<AccoCompanyPenaltyCharges> value)
	{
		setPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final SessionContext ctx, final AccoCompanyPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final AccoCompanyPenaltyCharges value)
	{
		addToPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final SessionContext ctx, final AccoCompanyPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final AccoCompanyPenaltyCharges value)
	{
		removeFromPenaltyCharges( getSession().getSessionContext(), value );
	}
	
}
