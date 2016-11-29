/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.NamingListCutOffs;
import com.cnk.travelogix.common.inventory.jalo.OverBookingLimit;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirFreeOfCostSeatsOrTickets;
import com.cnk.travelogix.transport.inventory.core.jalo.AirPCCCredentialInf;
import com.cnk.travelogix.transport.inventory.core.jalo.AirPenaltyChargesForAmendments;
import com.cnk.travelogix.transport.inventory.core.jalo.FareRulesAndTermsAndConditions;
import com.cnk.travelogix.transport.inventory.core.jalo.TicketingCutOffDays;
import com.cnk.travelogix.transport.inventory.core.jalo.TravelogixPolicyDetail;
import com.cnk.travelogix.transport.inventory.core.jalo.UpgradeCharges;
import com.cnk.travelogix.transportinventory.core.jalo.AirPenaltyChargesRelease;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AirInvSupplierAdvanceDefinition AirInventorySupplierAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirInvSupplierAdvanceDefinition extends GenericItem
{
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.salesDates</code> attribute **/
	public static final String SALESDATES = "salesDates";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.blockOutDates</code> attribute **/
	public static final String BLOCKOUTDATES = "blockOutDates";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.fareBasis</code> attribute **/
	public static final String FAREBASIS = "fareBasis";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.tourOrDealCode</code> attribute **/
	public static final String TOURORDEALCODE = "tourOrDealCode";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.ticketingCutOffDays</code> attribute **/
	public static final String TICKETINGCUTOFFDAYS = "ticketingCutOffDays";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.airFreeOfCostSeatsOrTickets</code> attribute **/
	public static final String AIRFREEOFCOSTSEATSORTICKETS = "airFreeOfCostSeatsOrTickets";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.namingCutoffs</code> attribute **/
	public static final String NAMINGCUTOFFS = "namingCutoffs";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.overBookingLimit</code> attribute **/
	public static final String OVERBOOKINGLIMIT = "overBookingLimit";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.pccInfo</code> attribute **/
	public static final String PCCINFO = "pccInfo";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.staticpolicies</code> attribute **/
	public static final String STATICPOLICIES = "staticpolicies";
	/** Relation ordering override parameter constants for AirInventorySupplierAdvanceDefinitionToPolicy from ((transportinventorycore))*/
	protected static String AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_SRC_ORDERED = "relation.AirInventorySupplierAdvanceDefinitionToPolicy.source.ordered";
	protected static String AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_TGT_ORDERED = "relation.AirInventorySupplierAdvanceDefinitionToPolicy.target.ordered";
	/** Relation disable markmodifed parameter constants for AirInventorySupplierAdvanceDefinitionToPolicy from ((transportinventorycore))*/
	protected static String AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_MARKMODIFIED = "relation.AirInventorySupplierAdvanceDefinitionToPolicy.markmodified";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.cancellationPolicies</code> attribute **/
	public static final String CANCELLATIONPOLICIES = "cancellationPolicies";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.amendmentPolicies</code> attribute **/
	public static final String AMENDMENTPOLICIES = "amendmentPolicies";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.definedFareRulesOrTermsAndConditions</code> attribute **/
	public static final String DEFINEDFARERULESORTERMSANDCONDITIONS = "definedFareRulesOrTermsAndConditions";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.penaltyCharges</code> attribute **/
	public static final String PENALTYCHARGES = "penaltyCharges";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute **/
	public static final String CHANGEREQUESTPENALTYCHARGES = "changeRequestPenaltyCharges";
	/** Qualifier of the <code>AirInventorySupplierAdvanceDefinition.upgradeCharges</code> attribute **/
	public static final String UPGRADECHARGES = "upgradeCharges";
	/**
	* {@link OneToManyHandler} for handling 1:n NAMINGCUTOFFS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<NamingListCutOffs> NAMINGCUTOFFSHANDLER = new OneToManyHandler<NamingListCutOffs>(
	CommoninventorycoreConstants.TC.NAMINGLISTCUTOFFS,
	true,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OVERBOOKINGLIMIT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OverBookingLimit> OVERBOOKINGLIMITHANDLER = new OneToManyHandler<OverBookingLimit>(
	CommoninventorycoreConstants.TC.OVERBOOKINGLIMIT,
	false,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PCCINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirPCCCredentialInf> PCCINFOHANDLER = new OneToManyHandler<AirPCCCredentialInf>(
	TransportinventorycoreConstants.TC.AIRPCCCREDENTIALINFO,
	true,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CANCELLATIONPOLICIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicyDetail> CANCELLATIONPOLICIESHANDLER = new OneToManyHandler<TravelogixPolicyDetail>(
	TransportinventorycoreConstants.TC.TRAVELOGIXPOLICYDETAIL,
	false,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n AMENDMENTPOLICIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicyDetail> AMENDMENTPOLICIESHANDLER = new OneToManyHandler<TravelogixPolicyDetail>(
	TransportinventorycoreConstants.TC.TRAVELOGIXPOLICYDETAIL,
	false,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DEFINEDFARERULESORTERMSANDCONDITIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FareRulesAndTermsAndConditions> DEFINEDFARERULESORTERMSANDCONDITIONSHANDLER = new OneToManyHandler<FareRulesAndTermsAndConditions>(
	TransportinventorycoreConstants.TC.FARERULESANDTERMSANDCONDITIONS,
	false,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirPenaltyChargesRelease> PENALTYCHARGESHANDLER = new OneToManyHandler<AirPenaltyChargesRelease>(
	TransportinventorycoreConstants.TC.AIRPENALTYCHARGESRELEASE,
	true,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CHANGEREQUESTPENALTYCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirPenaltyChargesForAmendments> CHANGEREQUESTPENALTYCHARGESHANDLER = new OneToManyHandler<AirPenaltyChargesForAmendments>(
	TransportinventorycoreConstants.TC.AIRPENALTYCHARGESFORAMENDMENTS,
	true,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n UPGRADECHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<UpgradeCharges> UPGRADECHARGESHANDLER = new OneToManyHandler<UpgradeCharges>(
	TransportinventorycoreConstants.TC.UPGRADECHARGES,
	true,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALESDATES, AttributeMode.INITIAL);
		tmp.put(BLOCKOUTDATES, AttributeMode.INITIAL);
		tmp.put(FAREBASIS, AttributeMode.INITIAL);
		tmp.put(TOURORDEALCODE, AttributeMode.INITIAL);
		tmp.put(TICKETINGCUTOFFDAYS, AttributeMode.INITIAL);
		tmp.put(AIRFREEOFCOSTSEATSORTICKETS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.airFreeOfCostSeatsOrTickets</code> attribute.
	 * @return the airFreeOfCostSeatsOrTickets - Air Free Of Cost Seats Or Tickets
	 */
	public AirFreeOfCostSeatsOrTickets getAirFreeOfCostSeatsOrTickets(final SessionContext ctx)
	{
		return (AirFreeOfCostSeatsOrTickets)getProperty( ctx, AIRFREEOFCOSTSEATSORTICKETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.airFreeOfCostSeatsOrTickets</code> attribute.
	 * @return the airFreeOfCostSeatsOrTickets - Air Free Of Cost Seats Or Tickets
	 */
	public AirFreeOfCostSeatsOrTickets getAirFreeOfCostSeatsOrTickets()
	{
		return getAirFreeOfCostSeatsOrTickets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.airFreeOfCostSeatsOrTickets</code> attribute. 
	 * @param value the airFreeOfCostSeatsOrTickets - Air Free Of Cost Seats Or Tickets
	 */
	public void setAirFreeOfCostSeatsOrTickets(final SessionContext ctx, final AirFreeOfCostSeatsOrTickets value)
	{
		setProperty(ctx, AIRFREEOFCOSTSEATSORTICKETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.airFreeOfCostSeatsOrTickets</code> attribute. 
	 * @param value the airFreeOfCostSeatsOrTickets - Air Free Of Cost Seats Or Tickets
	 */
	public void setAirFreeOfCostSeatsOrTickets(final AirFreeOfCostSeatsOrTickets value)
	{
		setAirFreeOfCostSeatsOrTickets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.amendmentPolicies</code> attribute.
	 * @return the amendmentPolicies
	 */
	public Collection<TravelogixPolicyDetail> getAmendmentPolicies(final SessionContext ctx)
	{
		return AMENDMENTPOLICIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.amendmentPolicies</code> attribute.
	 * @return the amendmentPolicies
	 */
	public Collection<TravelogixPolicyDetail> getAmendmentPolicies()
	{
		return getAmendmentPolicies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.amendmentPolicies</code> attribute. 
	 * @param value the amendmentPolicies
	 */
	public void setAmendmentPolicies(final SessionContext ctx, final Collection<TravelogixPolicyDetail> value)
	{
		AMENDMENTPOLICIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.amendmentPolicies</code> attribute. 
	 * @param value the amendmentPolicies
	 */
	public void setAmendmentPolicies(final Collection<TravelogixPolicyDetail> value)
	{
		setAmendmentPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to amendmentPolicies. 
	 * @param value the item to add to amendmentPolicies
	 */
	public void addToAmendmentPolicies(final SessionContext ctx, final TravelogixPolicyDetail value)
	{
		AMENDMENTPOLICIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to amendmentPolicies. 
	 * @param value the item to add to amendmentPolicies
	 */
	public void addToAmendmentPolicies(final TravelogixPolicyDetail value)
	{
		addToAmendmentPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from amendmentPolicies. 
	 * @param value the item to remove from amendmentPolicies
	 */
	public void removeFromAmendmentPolicies(final SessionContext ctx, final TravelogixPolicyDetail value)
	{
		AMENDMENTPOLICIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from amendmentPolicies. 
	 * @param value the item to remove from amendmentPolicies
	 */
	public void removeFromAmendmentPolicies(final TravelogixPolicyDetail value)
	{
		removeFromAmendmentPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - block out dates
	 */
	public Set<StandardDateRange> getBlockOutDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, BLOCKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.blockOutDates</code> attribute.
	 * @return the blockOutDates - block out dates
	 */
	public Set<StandardDateRange> getBlockOutDates()
	{
		return getBlockOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - block out dates
	 */
	public void setBlockOutDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, BLOCKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.blockOutDates</code> attribute. 
	 * @param value the blockOutDates - block out dates
	 */
	public void setBlockOutDates(final Set<StandardDateRange> value)
	{
		setBlockOutDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.cancellationPolicies</code> attribute.
	 * @return the cancellationPolicies
	 */
	public Collection<TravelogixPolicyDetail> getCancellationPolicies(final SessionContext ctx)
	{
		return CANCELLATIONPOLICIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.cancellationPolicies</code> attribute.
	 * @return the cancellationPolicies
	 */
	public Collection<TravelogixPolicyDetail> getCancellationPolicies()
	{
		return getCancellationPolicies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.cancellationPolicies</code> attribute. 
	 * @param value the cancellationPolicies
	 */
	public void setCancellationPolicies(final SessionContext ctx, final Collection<TravelogixPolicyDetail> value)
	{
		CANCELLATIONPOLICIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.cancellationPolicies</code> attribute. 
	 * @param value the cancellationPolicies
	 */
	public void setCancellationPolicies(final Collection<TravelogixPolicyDetail> value)
	{
		setCancellationPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cancellationPolicies. 
	 * @param value the item to add to cancellationPolicies
	 */
	public void addToCancellationPolicies(final SessionContext ctx, final TravelogixPolicyDetail value)
	{
		CANCELLATIONPOLICIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cancellationPolicies. 
	 * @param value the item to add to cancellationPolicies
	 */
	public void addToCancellationPolicies(final TravelogixPolicyDetail value)
	{
		addToCancellationPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cancellationPolicies. 
	 * @param value the item to remove from cancellationPolicies
	 */
	public void removeFromCancellationPolicies(final SessionContext ctx, final TravelogixPolicyDetail value)
	{
		CANCELLATIONPOLICIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cancellationPolicies. 
	 * @param value the item to remove from cancellationPolicies
	 */
	public void removeFromCancellationPolicies(final TravelogixPolicyDetail value)
	{
		removeFromCancellationPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute.
	 * @return the changeRequestPenaltyCharges
	 */
	public Collection<AirPenaltyChargesForAmendments> getChangeRequestPenaltyCharges(final SessionContext ctx)
	{
		return CHANGEREQUESTPENALTYCHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute.
	 * @return the changeRequestPenaltyCharges
	 */
	public Collection<AirPenaltyChargesForAmendments> getChangeRequestPenaltyCharges()
	{
		return getChangeRequestPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute. 
	 * @param value the changeRequestPenaltyCharges
	 */
	public void setChangeRequestPenaltyCharges(final SessionContext ctx, final Collection<AirPenaltyChargesForAmendments> value)
	{
		CHANGEREQUESTPENALTYCHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.changeRequestPenaltyCharges</code> attribute. 
	 * @param value the changeRequestPenaltyCharges
	 */
	public void setChangeRequestPenaltyCharges(final Collection<AirPenaltyChargesForAmendments> value)
	{
		setChangeRequestPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to changeRequestPenaltyCharges. 
	 * @param value the item to add to changeRequestPenaltyCharges
	 */
	public void addToChangeRequestPenaltyCharges(final SessionContext ctx, final AirPenaltyChargesForAmendments value)
	{
		CHANGEREQUESTPENALTYCHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to changeRequestPenaltyCharges. 
	 * @param value the item to add to changeRequestPenaltyCharges
	 */
	public void addToChangeRequestPenaltyCharges(final AirPenaltyChargesForAmendments value)
	{
		addToChangeRequestPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from changeRequestPenaltyCharges. 
	 * @param value the item to remove from changeRequestPenaltyCharges
	 */
	public void removeFromChangeRequestPenaltyCharges(final SessionContext ctx, final AirPenaltyChargesForAmendments value)
	{
		CHANGEREQUESTPENALTYCHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from changeRequestPenaltyCharges. 
	 * @param value the item to remove from changeRequestPenaltyCharges
	 */
	public void removeFromChangeRequestPenaltyCharges(final AirPenaltyChargesForAmendments value)
	{
		removeFromChangeRequestPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.definedFareRulesOrTermsAndConditions</code> attribute.
	 * @return the definedFareRulesOrTermsAndConditions
	 */
	public Collection<FareRulesAndTermsAndConditions> getDefinedFareRulesOrTermsAndConditions(final SessionContext ctx)
	{
		return DEFINEDFARERULESORTERMSANDCONDITIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.definedFareRulesOrTermsAndConditions</code> attribute.
	 * @return the definedFareRulesOrTermsAndConditions
	 */
	public Collection<FareRulesAndTermsAndConditions> getDefinedFareRulesOrTermsAndConditions()
	{
		return getDefinedFareRulesOrTermsAndConditions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.definedFareRulesOrTermsAndConditions</code> attribute. 
	 * @param value the definedFareRulesOrTermsAndConditions
	 */
	public void setDefinedFareRulesOrTermsAndConditions(final SessionContext ctx, final Collection<FareRulesAndTermsAndConditions> value)
	{
		DEFINEDFARERULESORTERMSANDCONDITIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.definedFareRulesOrTermsAndConditions</code> attribute. 
	 * @param value the definedFareRulesOrTermsAndConditions
	 */
	public void setDefinedFareRulesOrTermsAndConditions(final Collection<FareRulesAndTermsAndConditions> value)
	{
		setDefinedFareRulesOrTermsAndConditions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to definedFareRulesOrTermsAndConditions. 
	 * @param value the item to add to definedFareRulesOrTermsAndConditions
	 */
	public void addToDefinedFareRulesOrTermsAndConditions(final SessionContext ctx, final FareRulesAndTermsAndConditions value)
	{
		DEFINEDFARERULESORTERMSANDCONDITIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to definedFareRulesOrTermsAndConditions. 
	 * @param value the item to add to definedFareRulesOrTermsAndConditions
	 */
	public void addToDefinedFareRulesOrTermsAndConditions(final FareRulesAndTermsAndConditions value)
	{
		addToDefinedFareRulesOrTermsAndConditions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from definedFareRulesOrTermsAndConditions. 
	 * @param value the item to remove from definedFareRulesOrTermsAndConditions
	 */
	public void removeFromDefinedFareRulesOrTermsAndConditions(final SessionContext ctx, final FareRulesAndTermsAndConditions value)
	{
		DEFINEDFARERULESORTERMSANDCONDITIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from definedFareRulesOrTermsAndConditions. 
	 * @param value the item to remove from definedFareRulesOrTermsAndConditions
	 */
	public void removeFromDefinedFareRulesOrTermsAndConditions(final FareRulesAndTermsAndConditions value)
	{
		removeFromDefinedFareRulesOrTermsAndConditions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.fareBasis</code> attribute.
	 * @return the fareBasis - fare basis
	 */
	public String getFareBasis(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAREBASIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.fareBasis</code> attribute.
	 * @return the fareBasis - fare basis
	 */
	public String getFareBasis()
	{
		return getFareBasis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.fareBasis</code> attribute. 
	 * @param value the fareBasis - fare basis
	 */
	public void setFareBasis(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAREBASIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.fareBasis</code> attribute. 
	 * @param value the fareBasis - fare basis
	 */
	public void setFareBasis(final String value)
	{
		setFareBasis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.namingCutoffs</code> attribute.
	 * @return the namingCutoffs
	 */
	public Collection<NamingListCutOffs> getNamingCutoffs(final SessionContext ctx)
	{
		return NAMINGCUTOFFSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.namingCutoffs</code> attribute.
	 * @return the namingCutoffs
	 */
	public Collection<NamingListCutOffs> getNamingCutoffs()
	{
		return getNamingCutoffs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.namingCutoffs</code> attribute. 
	 * @param value the namingCutoffs
	 */
	public void setNamingCutoffs(final SessionContext ctx, final Collection<NamingListCutOffs> value)
	{
		NAMINGCUTOFFSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.namingCutoffs</code> attribute. 
	 * @param value the namingCutoffs
	 */
	public void setNamingCutoffs(final Collection<NamingListCutOffs> value)
	{
		setNamingCutoffs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to namingCutoffs. 
	 * @param value the item to add to namingCutoffs
	 */
	public void addToNamingCutoffs(final SessionContext ctx, final NamingListCutOffs value)
	{
		NAMINGCUTOFFSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to namingCutoffs. 
	 * @param value the item to add to namingCutoffs
	 */
	public void addToNamingCutoffs(final NamingListCutOffs value)
	{
		addToNamingCutoffs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from namingCutoffs. 
	 * @param value the item to remove from namingCutoffs
	 */
	public void removeFromNamingCutoffs(final SessionContext ctx, final NamingListCutOffs value)
	{
		NAMINGCUTOFFSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from namingCutoffs. 
	 * @param value the item to remove from namingCutoffs
	 */
	public void removeFromNamingCutoffs(final NamingListCutOffs value)
	{
		removeFromNamingCutoffs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.overBookingLimit</code> attribute.
	 * @return the overBookingLimit
	 */
	public Collection<OverBookingLimit> getOverBookingLimit(final SessionContext ctx)
	{
		return OVERBOOKINGLIMITHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.overBookingLimit</code> attribute.
	 * @return the overBookingLimit
	 */
	public Collection<OverBookingLimit> getOverBookingLimit()
	{
		return getOverBookingLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.overBookingLimit</code> attribute. 
	 * @param value the overBookingLimit
	 */
	public void setOverBookingLimit(final SessionContext ctx, final Collection<OverBookingLimit> value)
	{
		OVERBOOKINGLIMITHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.overBookingLimit</code> attribute. 
	 * @param value the overBookingLimit
	 */
	public void setOverBookingLimit(final Collection<OverBookingLimit> value)
	{
		setOverBookingLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to overBookingLimit. 
	 * @param value the item to add to overBookingLimit
	 */
	public void addToOverBookingLimit(final SessionContext ctx, final OverBookingLimit value)
	{
		OVERBOOKINGLIMITHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to overBookingLimit. 
	 * @param value the item to add to overBookingLimit
	 */
	public void addToOverBookingLimit(final OverBookingLimit value)
	{
		addToOverBookingLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from overBookingLimit. 
	 * @param value the item to remove from overBookingLimit
	 */
	public void removeFromOverBookingLimit(final SessionContext ctx, final OverBookingLimit value)
	{
		OVERBOOKINGLIMITHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from overBookingLimit. 
	 * @param value the item to remove from overBookingLimit
	 */
	public void removeFromOverBookingLimit(final OverBookingLimit value)
	{
		removeFromOverBookingLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.pccInfo</code> attribute.
	 * @return the pccInfo
	 */
	public Collection<AirPCCCredentialInf> getPccInfo(final SessionContext ctx)
	{
		return PCCINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.pccInfo</code> attribute.
	 * @return the pccInfo
	 */
	public Collection<AirPCCCredentialInf> getPccInfo()
	{
		return getPccInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.pccInfo</code> attribute. 
	 * @param value the pccInfo
	 */
	public void setPccInfo(final SessionContext ctx, final Collection<AirPCCCredentialInf> value)
	{
		PCCINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.pccInfo</code> attribute. 
	 * @param value the pccInfo
	 */
	public void setPccInfo(final Collection<AirPCCCredentialInf> value)
	{
		setPccInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pccInfo. 
	 * @param value the item to add to pccInfo
	 */
	public void addToPccInfo(final SessionContext ctx, final AirPCCCredentialInf value)
	{
		PCCINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pccInfo. 
	 * @param value the item to add to pccInfo
	 */
	public void addToPccInfo(final AirPCCCredentialInf value)
	{
		addToPccInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pccInfo. 
	 * @param value the item to remove from pccInfo
	 */
	public void removeFromPccInfo(final SessionContext ctx, final AirPCCCredentialInf value)
	{
		PCCINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pccInfo. 
	 * @param value the item to remove from pccInfo
	 */
	public void removeFromPccInfo(final AirPCCCredentialInf value)
	{
		removeFromPccInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<AirPenaltyChargesRelease> getPenaltyCharges(final SessionContext ctx)
	{
		return PENALTYCHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.penaltyCharges</code> attribute.
	 * @return the penaltyCharges
	 */
	public Collection<AirPenaltyChargesRelease> getPenaltyCharges()
	{
		return getPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final SessionContext ctx, final Collection<AirPenaltyChargesRelease> value)
	{
		PENALTYCHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.penaltyCharges</code> attribute. 
	 * @param value the penaltyCharges
	 */
	public void setPenaltyCharges(final Collection<AirPenaltyChargesRelease> value)
	{
		setPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final SessionContext ctx, final AirPenaltyChargesRelease value)
	{
		PENALTYCHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyCharges. 
	 * @param value the item to add to penaltyCharges
	 */
	public void addToPenaltyCharges(final AirPenaltyChargesRelease value)
	{
		addToPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final SessionContext ctx, final AirPenaltyChargesRelease value)
	{
		PENALTYCHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyCharges. 
	 * @param value the item to remove from penaltyCharges
	 */
	public void removeFromPenaltyCharges(final AirPenaltyChargesRelease value)
	{
		removeFromPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.salesDates</code> attribute.
	 * @return the salesDates - sales dates
	 */
	public Set<StandardDateRange> getSalesDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, SALESDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.salesDates</code> attribute.
	 * @return the salesDates - sales dates
	 */
	public Set<StandardDateRange> getSalesDates()
	{
		return getSalesDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.salesDates</code> attribute. 
	 * @param value the salesDates - sales dates
	 */
	public void setSalesDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, SALESDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.salesDates</code> attribute. 
	 * @param value the salesDates - sales dates
	 */
	public void setSalesDates(final Set<StandardDateRange> value)
	{
		setSalesDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.staticpolicies</code> attribute.
	 * @return the staticpolicies
	 */
	public Collection<TravelogixPolicy> getStaticpolicies(final SessionContext ctx)
	{
		final List<TravelogixPolicy> items = getLinkedItems( 
			ctx,
			true,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			"TravelogixPolicy",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.staticpolicies</code> attribute.
	 * @return the staticpolicies
	 */
	public Collection<TravelogixPolicy> getStaticpolicies()
	{
		return getStaticpolicies( getSession().getSessionContext() );
	}
	
	public long getStaticpoliciesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			"TravelogixPolicy",
			null
		);
	}
	
	public long getStaticpoliciesCount()
	{
		return getStaticpoliciesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.staticpolicies</code> attribute. 
	 * @param value the staticpolicies
	 */
	public void setStaticpolicies(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.staticpolicies</code> attribute. 
	 * @param value the staticpolicies
	 */
	public void setStaticpolicies(final Collection<TravelogixPolicy> value)
	{
		setStaticpolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to staticpolicies. 
	 * @param value the item to add to staticpolicies
	 */
	public void addToStaticpolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to staticpolicies. 
	 * @param value the item to add to staticpolicies
	 */
	public void addToStaticpolicies(final TravelogixPolicy value)
	{
		addToStaticpolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from staticpolicies. 
	 * @param value the item to remove from staticpolicies
	 */
	public void removeFromStaticpolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from staticpolicies. 
	 * @param value the item to remove from staticpolicies
	 */
	public void removeFromStaticpolicies(final TravelogixPolicy value)
	{
		removeFromStaticpolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.ticketingCutOffDays</code> attribute.
	 * @return the ticketingCutOffDays - Ticketing Cut Off Days
	 */
	public TicketingCutOffDays getTicketingCutOffDays(final SessionContext ctx)
	{
		return (TicketingCutOffDays)getProperty( ctx, TICKETINGCUTOFFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.ticketingCutOffDays</code> attribute.
	 * @return the ticketingCutOffDays - Ticketing Cut Off Days
	 */
	public TicketingCutOffDays getTicketingCutOffDays()
	{
		return getTicketingCutOffDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.ticketingCutOffDays</code> attribute. 
	 * @param value the ticketingCutOffDays - Ticketing Cut Off Days
	 */
	public void setTicketingCutOffDays(final SessionContext ctx, final TicketingCutOffDays value)
	{
		setProperty(ctx, TICKETINGCUTOFFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.ticketingCutOffDays</code> attribute. 
	 * @param value the ticketingCutOffDays - Ticketing Cut Off Days
	 */
	public void setTicketingCutOffDays(final TicketingCutOffDays value)
	{
		setTicketingCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.tourOrDealCode</code> attribute.
	 * @return the tourOrDealCode - tourOrDealCode
	 */
	public String getTourOrDealCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOURORDEALCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.tourOrDealCode</code> attribute.
	 * @return the tourOrDealCode - tourOrDealCode
	 */
	public String getTourOrDealCode()
	{
		return getTourOrDealCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.tourOrDealCode</code> attribute. 
	 * @param value the tourOrDealCode - tourOrDealCode
	 */
	public void setTourOrDealCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOURORDEALCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.tourOrDealCode</code> attribute. 
	 * @param value the tourOrDealCode - tourOrDealCode
	 */
	public void setTourOrDealCode(final String value)
	{
		setTourOrDealCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.upgradeCharges</code> attribute.
	 * @return the upgradeCharges
	 */
	public Collection<UpgradeCharges> getUpgradeCharges(final SessionContext ctx)
	{
		return UPGRADECHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventorySupplierAdvanceDefinition.upgradeCharges</code> attribute.
	 * @return the upgradeCharges
	 */
	public Collection<UpgradeCharges> getUpgradeCharges()
	{
		return getUpgradeCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.upgradeCharges</code> attribute. 
	 * @param value the upgradeCharges
	 */
	public void setUpgradeCharges(final SessionContext ctx, final Collection<UpgradeCharges> value)
	{
		UPGRADECHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventorySupplierAdvanceDefinition.upgradeCharges</code> attribute. 
	 * @param value the upgradeCharges
	 */
	public void setUpgradeCharges(final Collection<UpgradeCharges> value)
	{
		setUpgradeCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to upgradeCharges. 
	 * @param value the item to add to upgradeCharges
	 */
	public void addToUpgradeCharges(final SessionContext ctx, final UpgradeCharges value)
	{
		UPGRADECHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to upgradeCharges. 
	 * @param value the item to add to upgradeCharges
	 */
	public void addToUpgradeCharges(final UpgradeCharges value)
	{
		addToUpgradeCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from upgradeCharges. 
	 * @param value the item to remove from upgradeCharges
	 */
	public void removeFromUpgradeCharges(final SessionContext ctx, final UpgradeCharges value)
	{
		UPGRADECHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from upgradeCharges. 
	 * @param value the item to remove from upgradeCharges
	 */
	public void removeFromUpgradeCharges(final UpgradeCharges value)
	{
		removeFromUpgradeCharges( getSession().getSessionContext(), value );
	}
	
}
