/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.AirAssociateInventory;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import com.cnk.travelogix.common.inventory.core.jalo.NamingListCutOffs;
import com.cnk.travelogix.common.inventory.jalo.OverBookingLimit;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail;
import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AbstractAirCompanySpecificInventory;
import com.cnk.travelogix.transport.inventory.core.jalo.AbstractCruiseCompanySpecificInventory;
import com.cnk.travelogix.transport.inventory.core.jalo.AirClientInventoryDistribution;
import com.cnk.travelogix.transport.inventory.core.jalo.AirCompanyAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.AirCouponIndentRequestBusinessProcess;
import com.cnk.travelogix.transport.inventory.core.jalo.AirCutoffAndCharges;
import com.cnk.travelogix.transport.inventory.core.jalo.AirFreeOfCostSeatsOrTickets;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInvSupplierAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInventoryDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInventoryGrid;
import com.cnk.travelogix.transport.inventory.core.jalo.AirOtherCompanyInventoryDistribution;
import com.cnk.travelogix.transport.inventory.core.jalo.AirPCCCredentialInf;
import com.cnk.travelogix.transport.inventory.core.jalo.AirPenaltyChargesForAmendments;
import com.cnk.travelogix.transport.inventory.core.jalo.AirWithinCompanyInventoryDistribution;
import com.cnk.travelogix.transport.inventory.core.jalo.CompanyUpgradeCharges;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseClientInventoryDistribution;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseCompanyAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseCompanyPenaltyCharges;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseInventoryDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseOtherCompanyInventoryDistribution;
import com.cnk.travelogix.transport.inventory.core.jalo.CruisePenaltyCharges;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseSupplierAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseWithinCompanyInventoryDistribution;
import com.cnk.travelogix.transport.inventory.core.jalo.FareRulesAndTermsAndConditions;
import com.cnk.travelogix.transport.inventory.core.jalo.PolicyDetail;
import com.cnk.travelogix.transport.inventory.core.jalo.TaxComponentSpecificDetail;
import com.cnk.travelogix.transport.inventory.core.jalo.TicketingCutOffDays;
import com.cnk.travelogix.transport.inventory.core.jalo.TravelogixPolicyDetail;
import com.cnk.travelogix.transport.inventory.core.jalo.UpgradeCharges;
import com.cnk.travelogix.transportinventory.core.jalo.AbstractCouponDetail;
import com.cnk.travelogix.transportinventory.core.jalo.AbstractCruiseInventoryDetail;
import com.cnk.travelogix.transportinventory.core.jalo.AirCompanyPenaltyCharges;
import com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentCommission;
import com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentRequest;
import com.cnk.travelogix.transportinventory.core.jalo.AirInventoryDetail;
import com.cnk.travelogix.transportinventory.core.jalo.AirPenaltyChargesRelease;
import com.cnk.travelogix.transportinventory.core.jalo.AirlineInventoryRequest;
import com.cnk.travelogix.transportinventory.core.jalo.Booklet;
import com.cnk.travelogix.transportinventory.core.jalo.CouponPriceRow;
import com.cnk.travelogix.transportinventory.core.jalo.CruiseCutOffsAndCharges;
import com.cnk.travelogix.transportinventory.core.jalo.CruiseInventoryDetail;
import com.cnk.travelogix.transportinventory.core.jalo.CruiseInventoryRequest;
import com.cnk.travelogix.transportinventory.core.jalo.ECoupon;
import com.cnk.travelogix.transportinventory.core.jalo.InclusionExclusion;
import com.cnk.travelogix.transportinventory.core.jalo.ItineraryInfo;
import com.cnk.travelogix.transportinventory.core.jalo.ItineraryInventoryInfo;
import com.cnk.travelogix.transportinventory.core.jalo.MultiCitySpecificDatesJourney;
import com.cnk.travelogix.transportinventory.core.jalo.OnwordSpecificDatesJourney;
import com.cnk.travelogix.transportinventory.core.jalo.OnwordTravelRangeJourney;
import com.cnk.travelogix.transportinventory.core.jalo.PaperCoupon;
import com.cnk.travelogix.transportinventory.core.jalo.ReturnSpecificDatesJourney;
import com.cnk.travelogix.transportinventory.core.jalo.ReturnTravelRangeJourney;
import com.cnk.travelogix.transportinventory.core.jalo.UnsecuredCreditPaymentDetails;
import com.cnk.travelogix.transportinventory.core.jalo.VMPDPaymentDetails;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.order.price.Tax;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type <code>TransportinventorycoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportinventorycoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n TAXES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TaxComponentSpecificDetail> TAXTOTAXCOMPONENTSPECIFICDETAILTAXESHANDLER = new OneToManyHandler<TaxComponentSpecificDetail>(
	TransportinventorycoreConstants.TC.TAXCOMPONENTSPECIFICDETAIL,
	true,
	"taxes",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/** Relation ordering override parameter constants for AirInventorySupplierAdvanceDefinitionToPolicy from ((transportinventorycore))*/
	protected static String AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_SRC_ORDERED = "relation.AirInventorySupplierAdvanceDefinitionToPolicy.source.ordered";
	protected static String AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_TGT_ORDERED = "relation.AirInventorySupplierAdvanceDefinitionToPolicy.target.ordered";
	/** Relation disable markmodifed parameter constants for AirInventorySupplierAdvanceDefinitionToPolicy from ((transportinventorycore))*/
	protected static String AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_MARKMODIFIED = "relation.AirInventorySupplierAdvanceDefinitionToPolicy.markmodified";
	/** Relation ordering override parameter constants for TaxComponentSpecificDetailToFareComponent from ((transportinventorycore))*/
	protected static String TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_SRC_ORDERED = "relation.TaxComponentSpecificDetailToFareComponent.source.ordered";
	protected static String TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_TGT_ORDERED = "relation.TaxComponentSpecificDetailToFareComponent.target.ordered";
	/** Relation disable markmodifed parameter constants for TaxComponentSpecificDetailToFareComponent from ((transportinventorycore))*/
	protected static String TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_MARKMODIFIED = "relation.TaxComponentSpecificDetailToFareComponent.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("paxType", AttributeMode.INITIAL);
		tmp.put("airInventoryDefinition", AttributeMode.INITIAL);
		tmp.put("upgradeCharges", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.price.Tax", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("airInventorySupplierAdvanceDefinition", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.common.inventory.core.jalo.NamingListCutOffs", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("airCouponIndentRequest", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cruiseInventory", AttributeMode.INITIAL);
		tmp.put("airInventorySupplierAdvanceDefinition", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.common.inventory.jalo.OverBookingLimit", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cruiseInventoryDetail", AttributeMode.INITIAL);
		tmp.put("abstractCruiseCompanySpecificInventory", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractCruiseCompanySpecificInventory</code> attribute.
	 * @return the abstractCruiseCompanySpecificInventory
	 */
	public AbstractCruiseCompanySpecificInventory getAbstractCruiseCompanySpecificInventory(final SessionContext ctx, final AssociateInventory item)
	{
		return (AbstractCruiseCompanySpecificInventory)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.AssociateInventory.ABSTRACTCRUISECOMPANYSPECIFICINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.abstractCruiseCompanySpecificInventory</code> attribute.
	 * @return the abstractCruiseCompanySpecificInventory
	 */
	public AbstractCruiseCompanySpecificInventory getAbstractCruiseCompanySpecificInventory(final AssociateInventory item)
	{
		return getAbstractCruiseCompanySpecificInventory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractCruiseCompanySpecificInventory</code> attribute. 
	 * @param value the abstractCruiseCompanySpecificInventory
	 */
	public void setAbstractCruiseCompanySpecificInventory(final SessionContext ctx, final AssociateInventory item, final AbstractCruiseCompanySpecificInventory value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.AssociateInventory.ABSTRACTCRUISECOMPANYSPECIFICINVENTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.abstractCruiseCompanySpecificInventory</code> attribute. 
	 * @param value the abstractCruiseCompanySpecificInventory
	 */
	public void setAbstractCruiseCompanySpecificInventory(final AssociateInventory item, final AbstractCruiseCompanySpecificInventory value)
	{
		setAbstractCruiseCompanySpecificInventory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.airCouponIndentRequest</code> attribute.
	 * @return the airCouponIndentRequest
	 */
	public AirCouponIndentRequest getAirCouponIndentRequest(final SessionContext ctx, final AbstractPaymentDetail item)
	{
		return (AirCouponIndentRequest)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.AbstractPaymentDetail.AIRCOUPONINDENTREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.airCouponIndentRequest</code> attribute.
	 * @return the airCouponIndentRequest
	 */
	public AirCouponIndentRequest getAirCouponIndentRequest(final AbstractPaymentDetail item)
	{
		return getAirCouponIndentRequest( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.airCouponIndentRequest</code> attribute. 
	 * @param value the airCouponIndentRequest
	 */
	public void setAirCouponIndentRequest(final SessionContext ctx, final AbstractPaymentDetail item, final AirCouponIndentRequest value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.AbstractPaymentDetail.AIRCOUPONINDENTREQUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.airCouponIndentRequest</code> attribute. 
	 * @param value the airCouponIndentRequest
	 */
	public void setAirCouponIndentRequest(final AbstractPaymentDetail item, final AirCouponIndentRequest value)
	{
		setAirCouponIndentRequest( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.airInventoryDefinition</code> attribute.
	 * @return the airInventoryDefinition
	 */
	public AirInventoryDefinition getAirInventoryDefinition(final SessionContext ctx, final Tax item)
	{
		return (AirInventoryDefinition)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.Tax.AIRINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.airInventoryDefinition</code> attribute.
	 * @return the airInventoryDefinition
	 */
	public AirInventoryDefinition getAirInventoryDefinition(final Tax item)
	{
		return getAirInventoryDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.airInventoryDefinition</code> attribute. 
	 * @param value the airInventoryDefinition
	 */
	public void setAirInventoryDefinition(final SessionContext ctx, final Tax item, final AirInventoryDefinition value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.Tax.AIRINVENTORYDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.airInventoryDefinition</code> attribute. 
	 * @param value the airInventoryDefinition
	 */
	public void setAirInventoryDefinition(final Tax item, final AirInventoryDefinition value)
	{
		setAirInventoryDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final NamingListCutOffs item)
	{
		return (AirInvSupplierAdvanceDefinition)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.NamingListCutOffs.AIRINVENTORYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final NamingListCutOffs item)
	{
		return getAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final NamingListCutOffs item, final AirInvSupplierAdvanceDefinition value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.NamingListCutOffs.AIRINVENTORYSUPPLIERADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final NamingListCutOffs item, final AirInvSupplierAdvanceDefinition value)
	{
		setAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final OverBookingLimit item)
	{
		return (AirInvSupplierAdvanceDefinition)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.OverBookingLimit.AIRINVENTORYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final OverBookingLimit item)
	{
		return getAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final OverBookingLimit item, final AirInvSupplierAdvanceDefinition value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.OverBookingLimit.AIRINVENTORYSUPPLIERADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final OverBookingLimit item, final AirInvSupplierAdvanceDefinition value)
	{
		setAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public Collection<AirInvSupplierAdvanceDefinition> getAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final TravelogixPolicy item)
	{
		final List<AirInvSupplierAdvanceDefinition> items = item.getLinkedItems( 
			ctx,
			false,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			"AirInventorySupplierAdvanceDefinition",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public Collection<AirInvSupplierAdvanceDefinition> getAirInventorySupplierAdvanceDefinition(final TravelogixPolicy item)
	{
		return getAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), item );
	}
	
	public long getAirInventorySupplierAdvanceDefinitionCount(final SessionContext ctx, final TravelogixPolicy item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			"AirInventorySupplierAdvanceDefinition",
			null
		);
	}
	
	public long getAirInventorySupplierAdvanceDefinitionCount(final TravelogixPolicy item)
	{
		return getAirInventorySupplierAdvanceDefinitionCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final TravelogixPolicy item, final Collection<AirInvSupplierAdvanceDefinition> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final TravelogixPolicy item, final Collection<AirInvSupplierAdvanceDefinition> value)
	{
		setAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airInventorySupplierAdvanceDefinition. 
	 * @param value the item to add to airInventorySupplierAdvanceDefinition
	 */
	public void addToAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final TravelogixPolicy item, final AirInvSupplierAdvanceDefinition value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airInventorySupplierAdvanceDefinition. 
	 * @param value the item to add to airInventorySupplierAdvanceDefinition
	 */
	public void addToAirInventorySupplierAdvanceDefinition(final TravelogixPolicy item, final AirInvSupplierAdvanceDefinition value)
	{
		addToAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airInventorySupplierAdvanceDefinition. 
	 * @param value the item to remove from airInventorySupplierAdvanceDefinition
	 */
	public void removeFromAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final TravelogixPolicy item, final AirInvSupplierAdvanceDefinition value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TransportinventorycoreConstants.Relations.AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(AIRINVENTORYSUPPLIERADVANCEDEFINITIONTOPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airInventorySupplierAdvanceDefinition. 
	 * @param value the item to remove from airInventorySupplierAdvanceDefinition
	 */
	public void removeFromAirInventorySupplierAdvanceDefinition(final TravelogixPolicy item, final AirInvSupplierAdvanceDefinition value)
	{
		removeFromAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	public AbstractAirCompanySpecificInventory createAbstractAirCompanySpecificInventory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.ABSTRACTAIRCOMPANYSPECIFICINVENTORY );
			return (AbstractAirCompanySpecificInventory)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AbstractAirCompanySpecificInventory : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractAirCompanySpecificInventory createAbstractAirCompanySpecificInventory(final Map attributeValues)
	{
		return createAbstractAirCompanySpecificInventory( getSession().getSessionContext(), attributeValues );
	}
	
	public AbstractCouponDetail createAbstractCouponDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.ABSTRACTCOUPONDETAIL );
			return (AbstractCouponDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AbstractCouponDetail : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractCouponDetail createAbstractCouponDetail(final Map attributeValues)
	{
		return createAbstractCouponDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public AbstractCruiseInventoryDetail createAbstractCruiseInventoryDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.ABSTRACTCRUISEINVENTORYDETAIL );
			return (AbstractCruiseInventoryDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AbstractCruiseInventoryDetail : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractCruiseInventoryDetail createAbstractCruiseInventoryDetail(final Map attributeValues)
	{
		return createAbstractCruiseInventoryDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public AirAssociateInventory createAirAssociateInventory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRASSOCIATEINVENTORY );
			return (AirAssociateInventory)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirAssociateInventory : "+e.getMessage(), 0 );
		}
	}
	
	public AirAssociateInventory createAirAssociateInventory(final Map attributeValues)
	{
		return createAirAssociateInventory( getSession().getSessionContext(), attributeValues );
	}
	
	public AirClientInventoryDistribution createAirClientInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRCLIENTINVENTORYDISTRIBUTION );
			return (AirClientInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirClientInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public AirClientInventoryDistribution createAirClientInventoryDistribution(final Map attributeValues)
	{
		return createAirClientInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public AirCompanyAdvanceDefinition createAirCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRCOMPANYADVANCEDEFINITION );
			return (AirCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AirCompanyAdvanceDefinition createAirCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createAirCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AirCompanyPenaltyCharges createAirCompanyPenaltyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRCOMPANYPENALTYCHARGES );
			return (AirCompanyPenaltyCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirCompanyPenaltyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public AirCompanyPenaltyCharges createAirCompanyPenaltyCharges(final Map attributeValues)
	{
		return createAirCompanyPenaltyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public AirCouponIndentCommission createAirCouponIndentCommission(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRCOUPONINDENTCOMMISSION );
			return (AirCouponIndentCommission)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirCouponIndentCommission : "+e.getMessage(), 0 );
		}
	}
	
	public AirCouponIndentCommission createAirCouponIndentCommission(final Map attributeValues)
	{
		return createAirCouponIndentCommission( getSession().getSessionContext(), attributeValues );
	}
	
	public AirCouponIndentRequest createAirCouponIndentRequest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRCOUPONINDENTREQUEST );
			return (AirCouponIndentRequest)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirCouponIndentRequest : "+e.getMessage(), 0 );
		}
	}
	
	public AirCouponIndentRequest createAirCouponIndentRequest(final Map attributeValues)
	{
		return createAirCouponIndentRequest( getSession().getSessionContext(), attributeValues );
	}
	
	public AirCouponIndentRequestBusinessProcess createAirCouponIndentRequestBusinessProcess(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRCOUPONINDENTREQUESTBUSINESSPROCESS );
			return (AirCouponIndentRequestBusinessProcess)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirCouponIndentRequestBusinessProcess : "+e.getMessage(), 0 );
		}
	}
	
	public AirCouponIndentRequestBusinessProcess createAirCouponIndentRequestBusinessProcess(final Map attributeValues)
	{
		return createAirCouponIndentRequestBusinessProcess( getSession().getSessionContext(), attributeValues );
	}
	
	public AirCutoffAndCharges createAirCutoffAndCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRCUTOFFANDCHARGES );
			return (AirCutoffAndCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirCutoffAndCharges : "+e.getMessage(), 0 );
		}
	}
	
	public AirCutoffAndCharges createAirCutoffAndCharges(final Map attributeValues)
	{
		return createAirCutoffAndCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public AirFreeOfCostSeatsOrTickets createAirFreeOfCostSeatsOrTickets(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRFREEOFCOSTSEATSORTICKETS );
			return (AirFreeOfCostSeatsOrTickets)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirFreeOfCostSeatsOrTickets : "+e.getMessage(), 0 );
		}
	}
	
	public AirFreeOfCostSeatsOrTickets createAirFreeOfCostSeatsOrTickets(final Map attributeValues)
	{
		return createAirFreeOfCostSeatsOrTickets( getSession().getSessionContext(), attributeValues );
	}
	
	public AirInventoryDefinition createAirInventoryDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRINVENTORYDEFINITION );
			return (AirInventoryDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirInventoryDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AirInventoryDefinition createAirInventoryDefinition(final Map attributeValues)
	{
		return createAirInventoryDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AirInventoryDetail createAirInventoryDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRINVENTORYDETAIL );
			return (AirInventoryDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirInventoryDetail : "+e.getMessage(), 0 );
		}
	}
	
	public AirInventoryDetail createAirInventoryDetail(final Map attributeValues)
	{
		return createAirInventoryDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public AirInventoryGrid createAirInventoryGrid(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRINVENTORYGRID );
			return (AirInventoryGrid)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirInventoryGrid : "+e.getMessage(), 0 );
		}
	}
	
	public AirInventoryGrid createAirInventoryGrid(final Map attributeValues)
	{
		return createAirInventoryGrid( getSession().getSessionContext(), attributeValues );
	}
	
	public AirInvSupplierAdvanceDefinition createAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRINVENTORYSUPPLIERADVANCEDEFINITION );
			return (AirInvSupplierAdvanceDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirInventorySupplierAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AirInvSupplierAdvanceDefinition createAirInventorySupplierAdvanceDefinition(final Map attributeValues)
	{
		return createAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AirlineInventoryRequest createAirlineInventoryRequest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRLINEINVENTORYREQUEST );
			return (AirlineInventoryRequest)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirlineInventoryRequest : "+e.getMessage(), 0 );
		}
	}
	
	public AirlineInventoryRequest createAirlineInventoryRequest(final Map attributeValues)
	{
		return createAirlineInventoryRequest( getSession().getSessionContext(), attributeValues );
	}
	
	public AirOtherCompanyInventoryDistribution createAirOtherCompanyInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIROTHERCOMPANYINVENTORYDISTRIBUTION );
			return (AirOtherCompanyInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirOtherCompanyInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public AirOtherCompanyInventoryDistribution createAirOtherCompanyInventoryDistribution(final Map attributeValues)
	{
		return createAirOtherCompanyInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public AirPCCCredentialInf createAirPCCCredentialInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRPCCCREDENTIALINFO );
			return (AirPCCCredentialInf)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirPCCCredentialInfo : "+e.getMessage(), 0 );
		}
	}
	
	public AirPCCCredentialInf createAirPCCCredentialInfo(final Map attributeValues)
	{
		return createAirPCCCredentialInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public AirPenaltyChargesForAmendments createAirPenaltyChargesForAmendments(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRPENALTYCHARGESFORAMENDMENTS );
			return (AirPenaltyChargesForAmendments)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirPenaltyChargesForAmendments : "+e.getMessage(), 0 );
		}
	}
	
	public AirPenaltyChargesForAmendments createAirPenaltyChargesForAmendments(final Map attributeValues)
	{
		return createAirPenaltyChargesForAmendments( getSession().getSessionContext(), attributeValues );
	}
	
	public AirPenaltyChargesRelease createAirPenaltyChargesRelease(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRPENALTYCHARGESRELEASE );
			return (AirPenaltyChargesRelease)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirPenaltyChargesRelease : "+e.getMessage(), 0 );
		}
	}
	
	public AirPenaltyChargesRelease createAirPenaltyChargesRelease(final Map attributeValues)
	{
		return createAirPenaltyChargesRelease( getSession().getSessionContext(), attributeValues );
	}
	
	public AirWithinCompanyInventoryDistribution createAirWithinCompanyInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.AIRWITHINCOMPANYINVENTORYDISTRIBUTION );
			return (AirWithinCompanyInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating AirWithinCompanyInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public AirWithinCompanyInventoryDistribution createAirWithinCompanyInventoryDistribution(final Map attributeValues)
	{
		return createAirWithinCompanyInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public Booklet createBooklet(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.BOOKLET );
			return (Booklet)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Booklet : "+e.getMessage(), 0 );
		}
	}
	
	public Booklet createBooklet(final Map attributeValues)
	{
		return createBooklet( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyUpgradeCharges createCompanyUpgradeCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.COMPANYUPGRADECHARGES );
			return (CompanyUpgradeCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CompanyUpgradeCharges : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyUpgradeCharges createCompanyUpgradeCharges(final Map attributeValues)
	{
		return createCompanyUpgradeCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public CouponPriceRow createCouponPriceRow(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.COUPONPRICEROW );
			return (CouponPriceRow)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CouponPriceRow : "+e.getMessage(), 0 );
		}
	}
	
	public CouponPriceRow createCouponPriceRow(final Map attributeValues)
	{
		return createCouponPriceRow( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseClientInventoryDistribution createCruiseClientInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISECLIENTINVENTORYDISTRIBUTION );
			return (CruiseClientInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseClientInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseClientInventoryDistribution createCruiseClientInventoryDistribution(final Map attributeValues)
	{
		return createCruiseClientInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseCompanyAdvanceDefinition createCruiseCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISECOMPANYADVANCEDEFINITION );
			return (CruiseCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseCompanyAdvanceDefinition createCruiseCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createCruiseCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseCompanyPenaltyCharges createCruiseCompanyPenaltyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISECOMPANYPENALTYCHARGES );
			return (CruiseCompanyPenaltyCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseCompanyPenaltyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseCompanyPenaltyCharges createCruiseCompanyPenaltyCharges(final Map attributeValues)
	{
		return createCruiseCompanyPenaltyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseCutOffsAndCharges createCruiseCutOffsAndCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISECUTOFFSANDCHARGES );
			return (CruiseCutOffsAndCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseCutOffsAndCharges : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseCutOffsAndCharges createCruiseCutOffsAndCharges(final Map attributeValues)
	{
		return createCruiseCutOffsAndCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseInventoryDefinition createCruiseInventoryDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISEINVENTORYDEFINITION );
			return (CruiseInventoryDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseInventoryDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseInventoryDefinition createCruiseInventoryDefinition(final Map attributeValues)
	{
		return createCruiseInventoryDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseInventoryDetail createCruiseInventoryDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISEINVENTORYDETAIL );
			return (CruiseInventoryDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseInventoryDetail : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseInventoryDetail createCruiseInventoryDetail(final Map attributeValues)
	{
		return createCruiseInventoryDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseInventoryRequest createCruiseInventoryRequest(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISEINVENTORYREQUEST );
			return (CruiseInventoryRequest)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseInventoryRequest : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseInventoryRequest createCruiseInventoryRequest(final Map attributeValues)
	{
		return createCruiseInventoryRequest( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseOtherCompanyInventoryDistribution createCruiseOtherCompanyInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISEOTHERCOMPANYINVENTORYDISTRIBUTION );
			return (CruiseOtherCompanyInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseOtherCompanyInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseOtherCompanyInventoryDistribution createCruiseOtherCompanyInventoryDistribution(final Map attributeValues)
	{
		return createCruiseOtherCompanyInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public CruisePenaltyCharges createCruisePenaltyCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISEPENALTYCHARGES );
			return (CruisePenaltyCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruisePenaltyCharges : "+e.getMessage(), 0 );
		}
	}
	
	public CruisePenaltyCharges createCruisePenaltyCharges(final Map attributeValues)
	{
		return createCruisePenaltyCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseSupplierAdvanceDefinition createCruiseSupplierAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISESUPPLIERADVANCEDEFINITION );
			return (CruiseSupplierAdvanceDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseSupplierAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseSupplierAdvanceDefinition createCruiseSupplierAdvanceDefinition(final Map attributeValues)
	{
		return createCruiseSupplierAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseWithinCompanyInventoryDistribution createCruiseWithinCompanyInventoryDistribution(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.CRUISEWITHINCOMPANYINVENTORYDISTRIBUTION );
			return (CruiseWithinCompanyInventoryDistribution)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseWithinCompanyInventoryDistribution : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseWithinCompanyInventoryDistribution createCruiseWithinCompanyInventoryDistribution(final Map attributeValues)
	{
		return createCruiseWithinCompanyInventoryDistribution( getSession().getSessionContext(), attributeValues );
	}
	
	public ECoupon createECoupon(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.ECOUPON );
			return (ECoupon)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ECoupon : "+e.getMessage(), 0 );
		}
	}
	
	public ECoupon createECoupon(final Map attributeValues)
	{
		return createECoupon( getSession().getSessionContext(), attributeValues );
	}
	
	public FareRulesAndTermsAndConditions createFareRulesAndTermsAndConditions(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.FARERULESANDTERMSANDCONDITIONS );
			return (FareRulesAndTermsAndConditions)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating FareRulesAndTermsAndConditions : "+e.getMessage(), 0 );
		}
	}
	
	public FareRulesAndTermsAndConditions createFareRulesAndTermsAndConditions(final Map attributeValues)
	{
		return createFareRulesAndTermsAndConditions( getSession().getSessionContext(), attributeValues );
	}
	
	public InclusionExclusion createInclusionExclusion(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.INCLUSIONEXCLUSION );
			return (InclusionExclusion)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating InclusionExclusion : "+e.getMessage(), 0 );
		}
	}
	
	public InclusionExclusion createInclusionExclusion(final Map attributeValues)
	{
		return createInclusionExclusion( getSession().getSessionContext(), attributeValues );
	}
	
	public ItineraryInfo createItineraryInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.ITINERARYINFO );
			return (ItineraryInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ItineraryInfo : "+e.getMessage(), 0 );
		}
	}
	
	public ItineraryInfo createItineraryInfo(final Map attributeValues)
	{
		return createItineraryInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public ItineraryInventoryInfo createItineraryInventoryInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.ITINERARYINVENTORYINFO );
			return (ItineraryInventoryInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ItineraryInventoryInfo : "+e.getMessage(), 0 );
		}
	}
	
	public ItineraryInventoryInfo createItineraryInventoryInfo(final Map attributeValues)
	{
		return createItineraryInventoryInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public MultiCitySpecificDatesJourney createMultiCitySpecificDatesJourney(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.MULTICITYSPECIFICDATESJOURNEY );
			return (MultiCitySpecificDatesJourney)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MultiCitySpecificDatesJourney : "+e.getMessage(), 0 );
		}
	}
	
	public MultiCitySpecificDatesJourney createMultiCitySpecificDatesJourney(final Map attributeValues)
	{
		return createMultiCitySpecificDatesJourney( getSession().getSessionContext(), attributeValues );
	}
	
	public OnwordSpecificDatesJourney createOnwordSpecificDatesJourney(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.ONWORDSPECIFICDATESJOURNEY );
			return (OnwordSpecificDatesJourney)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OnwordSpecificDatesJourney : "+e.getMessage(), 0 );
		}
	}
	
	public OnwordSpecificDatesJourney createOnwordSpecificDatesJourney(final Map attributeValues)
	{
		return createOnwordSpecificDatesJourney( getSession().getSessionContext(), attributeValues );
	}
	
	public OnwordTravelRangeJourney createOnwordTravelRangeJourney(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.ONWORDTRAVELRANGEJOURNEY );
			return (OnwordTravelRangeJourney)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OnwordTravelRangeJourney : "+e.getMessage(), 0 );
		}
	}
	
	public OnwordTravelRangeJourney createOnwordTravelRangeJourney(final Map attributeValues)
	{
		return createOnwordTravelRangeJourney( getSession().getSessionContext(), attributeValues );
	}
	
	public PaperCoupon createPaperCoupon(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.PAPERCOUPON );
			return (PaperCoupon)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PaperCoupon : "+e.getMessage(), 0 );
		}
	}
	
	public PaperCoupon createPaperCoupon(final Map attributeValues)
	{
		return createPaperCoupon( getSession().getSessionContext(), attributeValues );
	}
	
	public PolicyDetail createPolicyDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.POLICYDETAIL );
			return (PolicyDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating PolicyDetail : "+e.getMessage(), 0 );
		}
	}
	
	public PolicyDetail createPolicyDetail(final Map attributeValues)
	{
		return createPolicyDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public ReturnSpecificDatesJourney createReturnSpecificDatesJourney(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.RETURNSPECIFICDATESJOURNEY );
			return (ReturnSpecificDatesJourney)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ReturnSpecificDatesJourney : "+e.getMessage(), 0 );
		}
	}
	
	public ReturnSpecificDatesJourney createReturnSpecificDatesJourney(final Map attributeValues)
	{
		return createReturnSpecificDatesJourney( getSession().getSessionContext(), attributeValues );
	}
	
	public ReturnTravelRangeJourney createReturnTravelRangeJourney(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.RETURNTRAVELRANGEJOURNEY );
			return (ReturnTravelRangeJourney)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ReturnTravelRangeJourney : "+e.getMessage(), 0 );
		}
	}
	
	public ReturnTravelRangeJourney createReturnTravelRangeJourney(final Map attributeValues)
	{
		return createReturnTravelRangeJourney( getSession().getSessionContext(), attributeValues );
	}
	
	public TaxComponentSpecificDetail createTaxComponentSpecificDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.TAXCOMPONENTSPECIFICDETAIL );
			return (TaxComponentSpecificDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TaxComponentSpecificDetail : "+e.getMessage(), 0 );
		}
	}
	
	public TaxComponentSpecificDetail createTaxComponentSpecificDetail(final Map attributeValues)
	{
		return createTaxComponentSpecificDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public TicketingCutOffDays createTicketingCutOffDays(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.TICKETINGCUTOFFDAYS );
			return (TicketingCutOffDays)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TicketingCutOffDays : "+e.getMessage(), 0 );
		}
	}
	
	public TicketingCutOffDays createTicketingCutOffDays(final Map attributeValues)
	{
		return createTicketingCutOffDays( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelogixPolicyDetail createTravelogixPolicyDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.TRAVELOGIXPOLICYDETAIL );
			return (TravelogixPolicyDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating TravelogixPolicyDetail : "+e.getMessage(), 0 );
		}
	}
	
	public TravelogixPolicyDetail createTravelogixPolicyDetail(final Map attributeValues)
	{
		return createTravelogixPolicyDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public UnsecuredCreditPaymentDetails createUnsecuredCreditPaymentDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.UNSECUREDCREDITPAYMENTDETAILS );
			return (UnsecuredCreditPaymentDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating UnsecuredCreditPaymentDetails : "+e.getMessage(), 0 );
		}
	}
	
	public UnsecuredCreditPaymentDetails createUnsecuredCreditPaymentDetails(final Map attributeValues)
	{
		return createUnsecuredCreditPaymentDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public UpgradeCharges createUpgradeCharges(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.UPGRADECHARGES );
			return (UpgradeCharges)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating UpgradeCharges : "+e.getMessage(), 0 );
		}
	}
	
	public UpgradeCharges createUpgradeCharges(final Map attributeValues)
	{
		return createUpgradeCharges( getSession().getSessionContext(), attributeValues );
	}
	
	public VMPDPaymentDetails createVMPDPaymentDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TransportinventorycoreConstants.TC.VMPDPAYMENTDETAILS );
			return (VMPDPaymentDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating VMPDPaymentDetails : "+e.getMessage(), 0 );
		}
	}
	
	public VMPDPaymentDetails createVMPDPaymentDetails(final Map attributeValues)
	{
		return createVMPDPaymentDetails( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.cruiseInventory</code> attribute.
	 * @return the cruiseInventory
	 */
	public CruiseSupplierAdvanceDefinition getCruiseInventory(final SessionContext ctx, final OverBookingLimit item)
	{
		return (CruiseSupplierAdvanceDefinition)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.OverBookingLimit.CRUISEINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OverBookingLimit.cruiseInventory</code> attribute.
	 * @return the cruiseInventory
	 */
	public CruiseSupplierAdvanceDefinition getCruiseInventory(final OverBookingLimit item)
	{
		return getCruiseInventory( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.cruiseInventory</code> attribute. 
	 * @param value the cruiseInventory
	 */
	public void setCruiseInventory(final SessionContext ctx, final OverBookingLimit item, final CruiseSupplierAdvanceDefinition value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.OverBookingLimit.CRUISEINVENTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OverBookingLimit.cruiseInventory</code> attribute. 
	 * @param value the cruiseInventory
	 */
	public void setCruiseInventory(final OverBookingLimit item, final CruiseSupplierAdvanceDefinition value)
	{
		setCruiseInventory( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.cruiseInventoryDetail</code> attribute.
	 * @return the cruiseInventoryDetail
	 */
	public CruiseInventoryDetail getCruiseInventoryDetail(final SessionContext ctx, final AssociateInventory item)
	{
		return (CruiseInventoryDetail)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.AssociateInventory.CRUISEINVENTORYDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociateInventory.cruiseInventoryDetail</code> attribute.
	 * @return the cruiseInventoryDetail
	 */
	public CruiseInventoryDetail getCruiseInventoryDetail(final AssociateInventory item)
	{
		return getCruiseInventoryDetail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.cruiseInventoryDetail</code> attribute. 
	 * @param value the cruiseInventoryDetail
	 */
	public void setCruiseInventoryDetail(final SessionContext ctx, final AssociateInventory item, final CruiseInventoryDetail value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.AssociateInventory.CRUISEINVENTORYDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociateInventory.cruiseInventoryDetail</code> attribute. 
	 * @param value the cruiseInventoryDetail
	 */
	public void setCruiseInventoryDetail(final AssociateInventory item, final CruiseInventoryDetail value)
	{
		setCruiseInventoryDetail( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TransportinventorycoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.paxType</code> attribute.
	 * @return the paxType - Pax Type on which tax is applied
	 */
	public EnumerationValue getPaxType(final SessionContext ctx, final Tax item)
	{
		return (EnumerationValue)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.Tax.PAXTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.paxType</code> attribute.
	 * @return the paxType - Pax Type on which tax is applied
	 */
	public EnumerationValue getPaxType(final Tax item)
	{
		return getPaxType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.paxType</code> attribute. 
	 * @param value the paxType - Pax Type on which tax is applied
	 */
	public void setPaxType(final SessionContext ctx, final Tax item, final EnumerationValue value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.Tax.PAXTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.paxType</code> attribute. 
	 * @param value the paxType - Pax Type on which tax is applied
	 */
	public void setPaxType(final Tax item, final EnumerationValue value)
	{
		setPaxType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareComponent.taxComponentSpecificDetail</code> attribute.
	 * @return the taxComponentSpecificDetail
	 */
	public Collection<TaxComponentSpecificDetail> getTaxComponentSpecificDetail(final SessionContext ctx, final FareComponent item)
	{
		final List<TaxComponentSpecificDetail> items = item.getLinkedItems( 
			ctx,
			false,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			"TaxComponentSpecificDetail",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareComponent.taxComponentSpecificDetail</code> attribute.
	 * @return the taxComponentSpecificDetail
	 */
	public Collection<TaxComponentSpecificDetail> getTaxComponentSpecificDetail(final FareComponent item)
	{
		return getTaxComponentSpecificDetail( getSession().getSessionContext(), item );
	}
	
	public long getTaxComponentSpecificDetailCount(final SessionContext ctx, final FareComponent item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			"TaxComponentSpecificDetail",
			null
		);
	}
	
	public long getTaxComponentSpecificDetailCount(final FareComponent item)
	{
		return getTaxComponentSpecificDetailCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareComponent.taxComponentSpecificDetail</code> attribute. 
	 * @param value the taxComponentSpecificDetail
	 */
	public void setTaxComponentSpecificDetail(final SessionContext ctx, final FareComponent item, final Collection<TaxComponentSpecificDetail> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareComponent.taxComponentSpecificDetail</code> attribute. 
	 * @param value the taxComponentSpecificDetail
	 */
	public void setTaxComponentSpecificDetail(final FareComponent item, final Collection<TaxComponentSpecificDetail> value)
	{
		setTaxComponentSpecificDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxComponentSpecificDetail. 
	 * @param value the item to add to taxComponentSpecificDetail
	 */
	public void addToTaxComponentSpecificDetail(final SessionContext ctx, final FareComponent item, final TaxComponentSpecificDetail value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxComponentSpecificDetail. 
	 * @param value the item to add to taxComponentSpecificDetail
	 */
	public void addToTaxComponentSpecificDetail(final FareComponent item, final TaxComponentSpecificDetail value)
	{
		addToTaxComponentSpecificDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxComponentSpecificDetail. 
	 * @param value the item to remove from taxComponentSpecificDetail
	 */
	public void removeFromTaxComponentSpecificDetail(final SessionContext ctx, final FareComponent item, final TaxComponentSpecificDetail value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxComponentSpecificDetail. 
	 * @param value the item to remove from taxComponentSpecificDetail
	 */
	public void removeFromTaxComponentSpecificDetail(final FareComponent item, final TaxComponentSpecificDetail value)
	{
		removeFromTaxComponentSpecificDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.taxes</code> attribute.
	 * @return the taxes
	 */
	public Collection<TaxComponentSpecificDetail> getTaxes(final SessionContext ctx, final Tax item)
	{
		return TAXTOTAXCOMPONENTSPECIFICDETAILTAXESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.taxes</code> attribute.
	 * @return the taxes
	 */
	public Collection<TaxComponentSpecificDetail> getTaxes(final Tax item)
	{
		return getTaxes( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final SessionContext ctx, final Tax item, final Collection<TaxComponentSpecificDetail> value)
	{
		TAXTOTAXCOMPONENTSPECIFICDETAILTAXESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final Tax item, final Collection<TaxComponentSpecificDetail> value)
	{
		setTaxes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxes. 
	 * @param value the item to add to taxes
	 */
	public void addToTaxes(final SessionContext ctx, final Tax item, final TaxComponentSpecificDetail value)
	{
		TAXTOTAXCOMPONENTSPECIFICDETAILTAXESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxes. 
	 * @param value the item to add to taxes
	 */
	public void addToTaxes(final Tax item, final TaxComponentSpecificDetail value)
	{
		addToTaxes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxes. 
	 * @param value the item to remove from taxes
	 */
	public void removeFromTaxes(final SessionContext ctx, final Tax item, final TaxComponentSpecificDetail value)
	{
		TAXTOTAXCOMPONENTSPECIFICDETAILTAXESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxes. 
	 * @param value the item to remove from taxes
	 */
	public void removeFromTaxes(final Tax item, final TaxComponentSpecificDetail value)
	{
		removeFromTaxes( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.upgradeCharges</code> attribute.
	 * @return the upgradeCharges
	 */
	public UpgradeCharges getUpgradeCharges(final SessionContext ctx, final Tax item)
	{
		return (UpgradeCharges)item.getProperty( ctx, TransportinventorycoreConstants.Attributes.Tax.UPGRADECHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tax.upgradeCharges</code> attribute.
	 * @return the upgradeCharges
	 */
	public UpgradeCharges getUpgradeCharges(final Tax item)
	{
		return getUpgradeCharges( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.upgradeCharges</code> attribute. 
	 * @param value the upgradeCharges
	 */
	public void setUpgradeCharges(final SessionContext ctx, final Tax item, final UpgradeCharges value)
	{
		item.setProperty(ctx, TransportinventorycoreConstants.Attributes.Tax.UPGRADECHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tax.upgradeCharges</code> attribute. 
	 * @param value the upgradeCharges
	 */
	public void setUpgradeCharges(final Tax item, final UpgradeCharges value)
	{
		setUpgradeCharges( getSession().getSessionContext(), item, value );
	}
	
}
