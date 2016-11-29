/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.jalo.OverBookingLimit;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseCompanyPenaltyCharges;
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
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.CruiseSupplierAdvanceDefinition CruiseSupplierAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseSupplierAdvanceDefinition extends GenericItem
{
	/** Qualifier of the <code>CruiseSupplierAdvanceDefinition.blockOutDates</code> attribute **/
	public static final String BLOCKOUTDATES = "blockOutDates";
	/** Qualifier of the <code>CruiseSupplierAdvanceDefinition.penaltyCharges</code> attribute **/
	public static final String PENALTYCHARGES = "penaltyCharges";
	/** Qualifier of the <code>CruiseSupplierAdvanceDefinition.overBookingLimits</code> attribute **/
	public static final String OVERBOOKINGLIMITS = "overBookingLimits";
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruiseCompanyPenaltyCharges> PENALTYCHARGESHANDLER = new OneToManyHandler<CruiseCompanyPenaltyCharges>(
	TransportinventorycoreConstants.TC.CRUISECOMPANYPENALTYCHARGES,
	false,
	"supplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OVERBOOKINGLIMITS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OverBookingLimit> OVERBOOKINGLIMITSHANDLER = new OneToManyHandler<OverBookingLimit>(
	CommoninventorycoreConstants.TC.OVERBOOKINGLIMIT,
	true,
	"cruiseInventory",
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
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSupplierAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block out dates
	 */
	public Set<StandardDateRange> getBlockOutDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, BLOCKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSupplierAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Block out dates
	 */
	public Set<StandardDateRange> getBlockOutDates()
	{
		return getBlockOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSupplierAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block out dates
	 */
	public void setBlockOutDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, BLOCKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSupplierAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Block out dates
	 */
	public void setBlockOutDates(final Set<StandardDateRange> value)
	{
		setBlockOutDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSupplierAdvanceDefinition.overBookingLimits</code> attribute.
	 * @return the overBookingLimits
	 */
	public Collection<OverBookingLimit> getOverBookingLimits(final SessionContext ctx)
	{
		return OVERBOOKINGLIMITSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSupplierAdvanceDefinition.overBookingLimits</code> attribute.
	 * @return the overBookingLimits
	 */
	public Collection<OverBookingLimit> getOverBookingLimits()
	{
		return getOverBookingLimits( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSupplierAdvanceDefinition.overBookingLimits</code> attribute. 
	 * @param value the overBookingLimits
	 */
	public void setOverBookingLimits(final SessionContext ctx, final Collection<OverBookingLimit> value)
	{
		OVERBOOKINGLIMITSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSupplierAdvanceDefinition.overBookingLimits</code> attribute. 
	 * @param value the overBookingLimits
	 */
	public void setOverBookingLimits(final Collection<OverBookingLimit> value)
	{
		setOverBookingLimits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to overBookingLimits. 
	 * @param value the item to add to overBookingLimits
	 */
	public void addToOverBookingLimits(final SessionContext ctx, final OverBookingLimit value)
	{
		OVERBOOKINGLIMITSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to overBookingLimits. 
	 * @param value the item to add to overBookingLimits
	 */
	public void addToOverBookingLimits(final OverBookingLimit value)
	{
		addToOverBookingLimits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from overBookingLimits. 
	 * @param value the item to remove from overBookingLimits
	 */
	public void removeFromOverBookingLimits(final SessionContext ctx, final OverBookingLimit value)
	{
		OVERBOOKINGLIMITSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from overBookingLimits. 
	 * @param value the item to remove from overBookingLimits
	 */
	public void removeFromOverBookingLimits(final OverBookingLimit value)
	{
		removeFromOverBookingLimits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<CruiseCompanyPenaltyCharges> getPenaltyCharges(final SessionContext ctx)
	{
		return PENALTYCHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<CruiseCompanyPenaltyCharges> getPenaltyCharges()
	{
		return getPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final SessionContext ctx, final Collection<CruiseCompanyPenaltyCharges> value)
	{
		PENALTYCHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final Collection<CruiseCompanyPenaltyCharges> value)
	{
		setPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final SessionContext ctx, final CruiseCompanyPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final CruiseCompanyPenaltyCharges value)
	{
		addToPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final SessionContext ctx, final CruiseCompanyPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final CruiseCompanyPenaltyCharges value)
	{
		removeFromPenaltyCharges( getSession().getSessionContext(), value );
	}
	
}
