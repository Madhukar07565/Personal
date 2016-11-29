/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.holiday.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.CutOffForFreeSale;
import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayPenaltyCharges;
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
 * Generated class for type {@link com.cnk.travelogix.holiday.inventory.core.jalo.HolidayInvSupplierAdvanceDefinition HolidayInvSupplierAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayInvSupplierAdvanceDefinition extends GenericItem
{
	/** Qualifier of the <code>HolidayInvSupplierAdvanceDefinition.cutOffForFreeSale</code> attribute **/
	public static final String CUTOFFFORFREESALE = "cutOffForFreeSale";
	/** Qualifier of the <code>HolidayInvSupplierAdvanceDefinition.blockOutDates</code> attribute **/
	public static final String BLOCKOUTDATES = "blockOutDates";
	/** Qualifier of the <code>HolidayInvSupplierAdvanceDefinition.penaltyCharges</code> attribute **/
	public static final String PENALTYCHARGES = "penaltyCharges";
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HolidayPenaltyCharges> PENALTYCHARGESHANDLER = new OneToManyHandler<HolidayPenaltyCharges>(
	HolidayinventorycoreConstants.TC.HOLIDAYPENALTYCHARGES,
	false,
	"HolidayInvSupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUTOFFFORFREESALE, AttributeMode.INITIAL);
		tmp.put(BLOCKOUTDATES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInvSupplierAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Cut off definition for inventory
	 */
	public Set<StandardDateRange> getBlockOutDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, BLOCKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInvSupplierAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - Cut off definition for inventory
	 */
	public Set<StandardDateRange> getBlockOutDates()
	{
		return getBlockOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInvSupplierAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Cut off definition for inventory
	 */
	public void setBlockOutDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, BLOCKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInvSupplierAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - Cut off definition for inventory
	 */
	public void setBlockOutDates(final Set<StandardDateRange> value)
	{
		setBlockOutDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInvSupplierAdvanceDefinition.cutOffForFreeSale</code> attribute.
	 * @return the cutOffForFreeSale - Cut off definition for inventory
	 */
	public CutOffForFreeSale getCutOffForFreeSale(final SessionContext ctx)
	{
		return (CutOffForFreeSale)getProperty( ctx, CUTOFFFORFREESALE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInvSupplierAdvanceDefinition.cutOffForFreeSale</code> attribute.
	 * @return the cutOffForFreeSale - Cut off definition for inventory
	 */
	public CutOffForFreeSale getCutOffForFreeSale()
	{
		return getCutOffForFreeSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInvSupplierAdvanceDefinition.cutOffForFreeSale</code> attribute. 
	 * @param value the cutOffForFreeSale - Cut off definition for inventory
	 */
	public void setCutOffForFreeSale(final SessionContext ctx, final CutOffForFreeSale value)
	{
		setProperty(ctx, CUTOFFFORFREESALE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInvSupplierAdvanceDefinition.cutOffForFreeSale</code> attribute. 
	 * @param value the cutOffForFreeSale - Cut off definition for inventory
	 */
	public void setCutOffForFreeSale(final CutOffForFreeSale value)
	{
		setCutOffForFreeSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInvSupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<HolidayPenaltyCharges> getPenaltyCharges(final SessionContext ctx)
	{
		return PENALTYCHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayInvSupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<HolidayPenaltyCharges> getPenaltyCharges()
	{
		return getPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInvSupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final SessionContext ctx, final Collection<HolidayPenaltyCharges> value)
	{
		PENALTYCHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayInvSupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final Collection<HolidayPenaltyCharges> value)
	{
		setPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final SessionContext ctx, final HolidayPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final HolidayPenaltyCharges value)
	{
		addToPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final SessionContext ctx, final HolidayPenaltyCharges value)
	{
		PENALTYCHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final HolidayPenaltyCharges value)
	{
		removeFromPenaltyCharges( getSession().getSessionContext(), value );
	}
	
}
