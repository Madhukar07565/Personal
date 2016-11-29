/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.CompanyUpgradeCharges;
import com.cnk.travelogix.transportinventory.core.jalo.AirCompanyPenaltyCharges;
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
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AirCompanyAdvanceDefinition AirCompanyAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirCompanyAdvanceDefinition extends GenericItem
{
	/** Qualifier of the <code>AirCompanyAdvanceDefinition.blockOutDates</code> attribute **/
	public static final String BLOCKOUTDATES = "blockOutDates";
	/** Qualifier of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute **/
	public static final String OVERBOOKINGALLOWED = "overBookingAllowed";
	/** Qualifier of the <code>AirCompanyAdvanceDefinition.upgradeCharges</code> attribute **/
	public static final String UPGRADECHARGES = "upgradeCharges";
	/** Qualifier of the <code>AirCompanyAdvanceDefinition.penaltyCharges</code> attribute **/
	public static final String PENALTYCHARGES = "penaltyCharges";
	/**
	* {@link OneToManyHandler} for handling 1:n UPGRADECHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CompanyUpgradeCharges> UPGRADECHARGESHANDLER = new OneToManyHandler<CompanyUpgradeCharges>(
	TransportinventorycoreConstants.TC.COMPANYUPGRADECHARGES,
	false,
	"airCompanyAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirCompanyPenaltyCharges> PENALTYCHARGESHANDLER = new OneToManyHandler<AirCompanyPenaltyCharges>(
	TransportinventorycoreConstants.TC.AIRCOMPANYPENALTYCHARGES,
	false,
	"airCompanyAdvanceDefinition",
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
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block out dates
	 */
	public Set<StandardDateRange> getBlockOutDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, BLOCKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block out dates
	 */
	public Set<StandardDateRange> getBlockOutDates()
	{
		return getBlockOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block out dates
	 */
	public void setBlockOutDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, BLOCKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block out dates
	 */
	public void setBlockOutDates(final Set<StandardDateRange> value)
	{
		setBlockOutDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute.
	 * @return the overBookingAllowed - Over booking allowed
	 */
	public Boolean isOverBookingAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OVERBOOKINGALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute.
	 * @return the overBookingAllowed - Over booking allowed
	 */
	public Boolean isOverBookingAllowed()
	{
		return isOverBookingAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @return the overBookingAllowed - Over booking allowed
	 */
	public boolean isOverBookingAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOverBookingAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @return the overBookingAllowed - Over booking allowed
	 */
	public boolean isOverBookingAllowedAsPrimitive()
	{
		return isOverBookingAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over booking allowed
	 */
	public void setOverBookingAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OVERBOOKINGALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over booking allowed
	 */
	public void setOverBookingAllowed(final Boolean value)
	{
		setOverBookingAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over booking allowed
	 */
	public void setOverBookingAllowed(final SessionContext ctx, final boolean value)
	{
		setOverBookingAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.overBookingAllowed</code> attribute. 
	 * @param value the overBookingAllowed - Over booking allowed
	 */
	public void setOverBookingAllowed(final boolean value)
	{
		setOverBookingAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<AirCompanyPenaltyCharges> getPenaltyCharges(final SessionContext ctx)
	{
		return PENALTYCHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<AirCompanyPenaltyCharges> getPenaltyCharges()
	{
		return getPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final SessionContext ctx, final Collection<AirCompanyPenaltyCharges> value)
	{
		PENALTYCHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final Collection<AirCompanyPenaltyCharges> value)
	{
		setPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final SessionContext ctx, final AirCompanyPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final AirCompanyPenaltyCharges value)
	{
		addToPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final SessionContext ctx, final AirCompanyPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final AirCompanyPenaltyCharges value)
	{
		removeFromPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.upgradeCharges</code> attribute.
	 * @return the upgradeCharges
	 */
	public Collection<CompanyUpgradeCharges> getUpgradeCharges(final SessionContext ctx)
	{
		return UPGRADECHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyAdvanceDefinition.upgradeCharges</code> attribute.
	 * @return the upgradeCharges
	 */
	public Collection<CompanyUpgradeCharges> getUpgradeCharges()
	{
		return getUpgradeCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.upgradeCharges</code> attribute. 
	 * @param value the upgradeCharges
	 */
	public void setUpgradeCharges(final SessionContext ctx, final Collection<CompanyUpgradeCharges> value)
	{
		UPGRADECHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyAdvanceDefinition.upgradeCharges</code> attribute. 
	 * @param value the upgradeCharges
	 */
	public void setUpgradeCharges(final Collection<CompanyUpgradeCharges> value)
	{
		setUpgradeCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to upgradeCharges. 
	 * @param value the item to add to upgradeCharges
	 */
	public void addToUpgradeCharges(final SessionContext ctx, final CompanyUpgradeCharges value)
	{
		UPGRADECHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to upgradeCharges. 
	 * @param value the item to add to upgradeCharges
	 */
	public void addToUpgradeCharges(final CompanyUpgradeCharges value)
	{
		addToUpgradeCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from upgradeCharges. 
	 * @param value the item to remove from upgradeCharges
	 */
	public void removeFromUpgradeCharges(final SessionContext ctx, final CompanyUpgradeCharges value)
	{
		UPGRADECHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from upgradeCharges. 
	 * @param value the item to remove from upgradeCharges
	 */
	public void removeFromUpgradeCharges(final CompanyUpgradeCharges value)
	{
		removeFromUpgradeCharges( getSession().getSessionContext(), value );
	}
	
}
