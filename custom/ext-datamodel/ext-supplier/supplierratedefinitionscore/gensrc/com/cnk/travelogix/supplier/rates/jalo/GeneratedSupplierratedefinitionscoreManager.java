/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.ancillarydiscount.jalo.AncillaryDiscount;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryfOC.jalo.AncillaryFOC;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryofferrate.jalo.AncillaryOfferRate;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.AncillaryRateDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.complimentary.jalo.Complimentary;
import com.cnk.travelogix.datamodel.supplier.rates.dateRange.jalo.DateRangeRestriction;
import com.cnk.travelogix.datamodel.supplier.rates.discountlongstay.jalo.DiscountLongStay;
import com.cnk.travelogix.datamodel.supplier.rates.discountonfreenight.jalo.DiscountOnFreeNight;
import com.cnk.travelogix.datamodel.supplier.rates.discountonnight.jalo.DiscountOnNight;
import com.cnk.travelogix.datamodel.supplier.rates.discountonpax.jalo.DiscountOnPax;
import com.cnk.travelogix.datamodel.supplier.rates.discountonrate.jalo.DiscountOnRate;
import com.cnk.travelogix.datamodel.supplier.rates.discountonroomorcabin.jalo.DiscountOnRoomOrCabin;
import com.cnk.travelogix.datamodel.supplier.rates.discountperage.jalo.DiscountPerAge;
import com.cnk.travelogix.datamodel.supplier.rates.fOCoffer.jalo.FOCOffer;
import com.cnk.travelogix.datamodel.supplier.rates.offercombinationrule.jalo.OfferCombinationRule;
import com.cnk.travelogix.datamodel.supplier.rates.offerrateproduct.jalo.OfferRateProduct;
import com.cnk.travelogix.datamodel.supplier.rates.roomorcabinupgrade.jalo.RoomOrCabinUpgrade;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import com.cnk.travelogix.supplier.mappings.market.jalo.MarketMapping;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.jalo.AbstractSupplierRate;
import com.cnk.travelogix.supplier.rates.jalo.DiscretionaryBranchHead;
import com.cnk.travelogix.supplier.rates.jalo.DiscretionaryDiscount;
import com.cnk.travelogix.supplier.rates.jalo.DiscretionaryProductHead;
import com.cnk.travelogix.supplier.rates.jalo.DiscretionarySalesHead;
import com.cnk.travelogix.supplier.rates.jalo.Incentive;
import com.cnk.travelogix.supplier.rates.jalo.IncentiveBranchHead;
import com.cnk.travelogix.supplier.rates.jalo.IncentiveSalesHead;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.CommonRateAdvDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AbstractAncillaryRateDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeRateDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.PassengerLevelSurchargeDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.PaymentTypeDetails;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RatePaymentDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RateRestriction;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RateVoucherNote;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SeasonDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SupplierAncillaryRate;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition;
import de.hybris.platform.europe1.jalo.PDTRow;
import de.hybris.platform.europe1.jalo.TaxRow;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Region;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.security.PrincipalGroup;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>SupplierratedefinitionscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierratedefinitionscoreManager extends Extension
{
	/** Relation ordering override parameter constants for TaxRow2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String TAXROW2FARECOMPONENTRELATION_SRC_ORDERED = "relation.TaxRow2FareComponentRelation.source.ordered";
	protected static String TAXROW2FARECOMPONENTRELATION_TGT_ORDERED = "relation.TaxRow2FareComponentRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for TaxRow2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String TAXROW2FARECOMPONENTRELATION_MARKMODIFIED = "relation.TaxRow2FareComponentRelation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n COMPANYRATEINVRESTRICTION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RateRestriction> COMPANYRATEINVRESTRICTION2MARKETMAPPINGCOMPANYRATEINVRESTRICTIONHANDLER = new OneToManyHandler<RateRestriction>(
	SupplierratedefinitionscoreConstants.TC.COMPANYRATEINVRESTRICTION,
	false,
	"marketMapping",
	null,
	false,
	true,
	CollectionType.SET
	);
	/** Relation ordering override parameter constants for AbsSupplierRate2MediaRel from ((supplierratedefinitionscore))*/
	protected static String ABSSUPPLIERRATE2MEDIAREL_SRC_ORDERED = "relation.AbsSupplierRate2MediaRel.source.ordered";
	protected static String ABSSUPPLIERRATE2MEDIAREL_TGT_ORDERED = "relation.AbsSupplierRate2MediaRel.target.ordered";
	/** Relation disable markmodifed parameter constants for AbsSupplierRate2MediaRel from ((supplierratedefinitionscore))*/
	protected static String ABSSUPPLIERRATE2MEDIAREL_MARKMODIFIED = "relation.AbsSupplierRate2MediaRel.markmodified";
	/** Relation ordering override parameter constants for SupplierAncRate2MediaRelation from ((supplierratedefinitionscore))*/
	protected static String SUPPLIERANCRATE2MEDIARELATION_SRC_ORDERED = "relation.SupplierAncRate2MediaRelation.source.ordered";
	protected static String SUPPLIERANCRATE2MEDIARELATION_TGT_ORDERED = "relation.SupplierAncRate2MediaRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierAncRate2MediaRelation from ((supplierratedefinitionscore))*/
	protected static String SUPPLIERANCRATE2MEDIARELATION_MARKMODIFIED = "relation.SupplierAncRate2MediaRelation.markmodified";
	/** Relation ordering override parameter constants for AbstractAncillaryRateDetail2TravelogixPolicyRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_SRC_ORDERED = "relation.AbstractAncillaryRateDetail2TravelogixPolicyRelation.source.ordered";
	protected static String ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_TGT_ORDERED = "relation.AbstractAncillaryRateDetail2TravelogixPolicyRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractAncillaryRateDetail2TravelogixPolicyRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_MARKMODIFIED = "relation.AbstractAncillaryRateDetail2TravelogixPolicyRelation.markmodified";
	/** Relation ordering override parameter constants for AbstractRateDefinition2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_SRC_ORDERED = "relation.AbstractRateDefinition2FareComponentRelation.source.ordered";
	protected static String ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_TGT_ORDERED = "relation.AbstractRateDefinition2FareComponentRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractRateDefinition2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_MARKMODIFIED = "relation.AbstractRateDefinition2FareComponentRelation.markmodified";
	/** Relation ordering override parameter constants for AbstractTravelogixSupplier2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_SRC_ORDERED = "relation.AbstractTravelogixSupplier2FareComponentRelation.source.ordered";
	protected static String ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_TGT_ORDERED = "relation.AbstractTravelogixSupplier2FareComponentRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractTravelogixSupplier2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_MARKMODIFIED = "relation.AbstractTravelogixSupplier2FareComponentRelation.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n DISCRETIONARYDISCOUNTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DiscretionaryDiscount> USERGROUP2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER = new OneToManyHandler<DiscretionaryDiscount>(
	SupplierratedefinitionscoreConstants.TC.DISCRETIONARYDISCOUNT,
	false,
	"userGroup",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INCENTIVES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Incentive> USERGROUP2INCENTIVEINCENTIVESHANDLER = new OneToManyHandler<Incentive>(
	SupplierratedefinitionscoreConstants.TC.INCENTIVE,
	false,
	"userGroup",
	null,
	false,
	true,
	CollectionType.SET
	);
	/** Relation ordering override parameter constants for Employee2Employee from ((supplierratedefinitionscore))*/
	protected static String EMPLOYEE2EMPLOYEE_SRC_ORDERED = "relation.Employee2Employee.source.ordered";
	protected static String EMPLOYEE2EMPLOYEE_TGT_ORDERED = "relation.Employee2Employee.target.ordered";
	/** Relation disable markmodifed parameter constants for Employee2Employee from ((supplierratedefinitionscore))*/
	protected static String EMPLOYEE2EMPLOYEE_MARKMODIFIED = "relation.Employee2Employee.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n INCENTIVES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Incentive> EMPLOYEE2INCENTIVEINCENTIVESHANDLER = new OneToManyHandler<Incentive>(
	SupplierratedefinitionscoreConstants.TC.INCENTIVE,
	false,
	"employee",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DISCRETIONARYDISCOUNTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DiscretionaryDiscount> EMPLOYEE2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER = new OneToManyHandler<DiscretionaryDiscount>(
	SupplierratedefinitionscoreConstants.TC.DISCRETIONARYDISCOUNT,
	false,
	"employee",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("taxType", AttributeMode.INITIAL);
		tmp.put("taxRate", AttributeMode.INITIAL);
		tmp.put("taxCalculationOn", AttributeMode.INITIAL);
		tmp.put("city", AttributeMode.INITIAL);
		tmp.put("country", AttributeMode.INITIAL);
		tmp.put("state", AttributeMode.INITIAL);
		tmp.put("payOnArrival", AttributeMode.INITIAL);
		tmp.put("applicableForChild", AttributeMode.INITIAL);
		tmp.put("applicableForAdult", AttributeMode.INITIAL);
		tmp.put("applicableForInfant", AttributeMode.INITIAL);
		tmp.put("supplierRate", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.europe1.jalo.TaxRow", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.abstractAncillaryRateDetail</code> attribute.
	 * @return the abstractAncillaryRateDetail
	 */
	public Collection<AbstractAncillaryRateDetail> getAbstractAncillaryRateDetail(final SessionContext ctx, final TravelogixPolicy item)
	{
		final List<AbstractAncillaryRateDetail> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			"AbstractAncillaryRateDetail",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.abstractAncillaryRateDetail</code> attribute.
	 * @return the abstractAncillaryRateDetail
	 */
	public Collection<AbstractAncillaryRateDetail> getAbstractAncillaryRateDetail(final TravelogixPolicy item)
	{
		return getAbstractAncillaryRateDetail( getSession().getSessionContext(), item );
	}
	
	public long getAbstractAncillaryRateDetailCount(final SessionContext ctx, final TravelogixPolicy item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			"AbstractAncillaryRateDetail",
			null
		);
	}
	
	public long getAbstractAncillaryRateDetailCount(final TravelogixPolicy item)
	{
		return getAbstractAncillaryRateDetailCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.abstractAncillaryRateDetail</code> attribute. 
	 * @param value the abstractAncillaryRateDetail
	 */
	public void setAbstractAncillaryRateDetail(final SessionContext ctx, final TravelogixPolicy item, final Collection<AbstractAncillaryRateDetail> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.abstractAncillaryRateDetail</code> attribute. 
	 * @param value the abstractAncillaryRateDetail
	 */
	public void setAbstractAncillaryRateDetail(final TravelogixPolicy item, final Collection<AbstractAncillaryRateDetail> value)
	{
		setAbstractAncillaryRateDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractAncillaryRateDetail. 
	 * @param value the item to add to abstractAncillaryRateDetail
	 */
	public void addToAbstractAncillaryRateDetail(final SessionContext ctx, final TravelogixPolicy item, final AbstractAncillaryRateDetail value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractAncillaryRateDetail. 
	 * @param value the item to add to abstractAncillaryRateDetail
	 */
	public void addToAbstractAncillaryRateDetail(final TravelogixPolicy item, final AbstractAncillaryRateDetail value)
	{
		addToAbstractAncillaryRateDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractAncillaryRateDetail. 
	 * @param value the item to remove from abstractAncillaryRateDetail
	 */
	public void removeFromAbstractAncillaryRateDetail(final SessionContext ctx, final TravelogixPolicy item, final AbstractAncillaryRateDetail value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2TRAVELOGIXPOLICYRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractAncillaryRateDetail. 
	 * @param value the item to remove from abstractAncillaryRateDetail
	 */
	public void removeFromAbstractAncillaryRateDetail(final TravelogixPolicy item, final AbstractAncillaryRateDetail value)
	{
		removeFromAbstractAncillaryRateDetail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareComponent.abstractRateDefinition</code> attribute.
	 * @return the abstractRateDefinition
	 */
	public Set<AbstractRateDefinition> getAbstractRateDefinition(final SessionContext ctx, final FareComponent item)
	{
		final List<AbstractRateDefinition> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			"AbstractRateDefinition",
			null,
			false,
			false
		);
		return new LinkedHashSet<AbstractRateDefinition>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareComponent.abstractRateDefinition</code> attribute.
	 * @return the abstractRateDefinition
	 */
	public Set<AbstractRateDefinition> getAbstractRateDefinition(final FareComponent item)
	{
		return getAbstractRateDefinition( getSession().getSessionContext(), item );
	}
	
	public long getAbstractRateDefinitionCount(final SessionContext ctx, final FareComponent item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			"AbstractRateDefinition",
			null
		);
	}
	
	public long getAbstractRateDefinitionCount(final FareComponent item)
	{
		return getAbstractRateDefinitionCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareComponent.abstractRateDefinition</code> attribute. 
	 * @param value the abstractRateDefinition
	 */
	public void setAbstractRateDefinition(final SessionContext ctx, final FareComponent item, final Set<AbstractRateDefinition> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareComponent.abstractRateDefinition</code> attribute. 
	 * @param value the abstractRateDefinition
	 */
	public void setAbstractRateDefinition(final FareComponent item, final Set<AbstractRateDefinition> value)
	{
		setAbstractRateDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractRateDefinition. 
	 * @param value the item to add to abstractRateDefinition
	 */
	public void addToAbstractRateDefinition(final SessionContext ctx, final FareComponent item, final AbstractRateDefinition value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractRateDefinition. 
	 * @param value the item to add to abstractRateDefinition
	 */
	public void addToAbstractRateDefinition(final FareComponent item, final AbstractRateDefinition value)
	{
		addToAbstractRateDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractRateDefinition. 
	 * @param value the item to remove from abstractRateDefinition
	 */
	public void removeFromAbstractRateDefinition(final SessionContext ctx, final FareComponent item, final AbstractRateDefinition value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTRATEDEFINITION2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractRateDefinition. 
	 * @param value the item to remove from abstractRateDefinition
	 */
	public void removeFromAbstractRateDefinition(final FareComponent item, final AbstractRateDefinition value)
	{
		removeFromAbstractRateDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareComponent.abstractTravelogixSupplierOffer</code> attribute.
	 * @return the abstractTravelogixSupplierOffer
	 */
	public Set<AbstractTravelogixSupplierOffer> getAbstractTravelogixSupplierOffer(final SessionContext ctx, final FareComponent item)
	{
		final List<AbstractTravelogixSupplierOffer> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			"AbstractTravelogixSupplierOffer",
			null,
			false,
			false
		);
		return new LinkedHashSet<AbstractTravelogixSupplierOffer>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareComponent.abstractTravelogixSupplierOffer</code> attribute.
	 * @return the abstractTravelogixSupplierOffer
	 */
	public Set<AbstractTravelogixSupplierOffer> getAbstractTravelogixSupplierOffer(final FareComponent item)
	{
		return getAbstractTravelogixSupplierOffer( getSession().getSessionContext(), item );
	}
	
	public long getAbstractTravelogixSupplierOfferCount(final SessionContext ctx, final FareComponent item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			"AbstractTravelogixSupplierOffer",
			null
		);
	}
	
	public long getAbstractTravelogixSupplierOfferCount(final FareComponent item)
	{
		return getAbstractTravelogixSupplierOfferCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareComponent.abstractTravelogixSupplierOffer</code> attribute. 
	 * @param value the abstractTravelogixSupplierOffer
	 */
	public void setAbstractTravelogixSupplierOffer(final SessionContext ctx, final FareComponent item, final Set<AbstractTravelogixSupplierOffer> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareComponent.abstractTravelogixSupplierOffer</code> attribute. 
	 * @param value the abstractTravelogixSupplierOffer
	 */
	public void setAbstractTravelogixSupplierOffer(final FareComponent item, final Set<AbstractTravelogixSupplierOffer> value)
	{
		setAbstractTravelogixSupplierOffer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractTravelogixSupplierOffer. 
	 * @param value the item to add to abstractTravelogixSupplierOffer
	 */
	public void addToAbstractTravelogixSupplierOffer(final SessionContext ctx, final FareComponent item, final AbstractTravelogixSupplierOffer value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractTravelogixSupplierOffer. 
	 * @param value the item to add to abstractTravelogixSupplierOffer
	 */
	public void addToAbstractTravelogixSupplierOffer(final FareComponent item, final AbstractTravelogixSupplierOffer value)
	{
		addToAbstractTravelogixSupplierOffer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractTravelogixSupplierOffer. 
	 * @param value the item to remove from abstractTravelogixSupplierOffer
	 */
	public void removeFromAbstractTravelogixSupplierOffer(final SessionContext ctx, final FareComponent item, final AbstractTravelogixSupplierOffer value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractTravelogixSupplierOffer. 
	 * @param value the item to remove from abstractTravelogixSupplierOffer
	 */
	public void removeFromAbstractTravelogixSupplierOffer(final FareComponent item, final AbstractTravelogixSupplierOffer value)
	{
		removeFromAbstractTravelogixSupplierOffer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForAdult</code> attribute.
	 * @return the applicableForAdult
	 */
	public Boolean isApplicableForAdult(final SessionContext ctx, final TaxRow item)
	{
		return (Boolean)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.APPLICABLEFORADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForAdult</code> attribute.
	 * @return the applicableForAdult
	 */
	public Boolean isApplicableForAdult(final TaxRow item)
	{
		return isApplicableForAdult( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForAdult</code> attribute. 
	 * @return the applicableForAdult
	 */
	public boolean isApplicableForAdultAsPrimitive(final SessionContext ctx, final TaxRow item)
	{
		Boolean value = isApplicableForAdult( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForAdult</code> attribute. 
	 * @return the applicableForAdult
	 */
	public boolean isApplicableForAdultAsPrimitive(final TaxRow item)
	{
		return isApplicableForAdultAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForAdult</code> attribute. 
	 * @param value the applicableForAdult
	 */
	public void setApplicableForAdult(final SessionContext ctx, final TaxRow item, final Boolean value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.APPLICABLEFORADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForAdult</code> attribute. 
	 * @param value the applicableForAdult
	 */
	public void setApplicableForAdult(final TaxRow item, final Boolean value)
	{
		setApplicableForAdult( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForAdult</code> attribute. 
	 * @param value the applicableForAdult
	 */
	public void setApplicableForAdult(final SessionContext ctx, final TaxRow item, final boolean value)
	{
		setApplicableForAdult( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForAdult</code> attribute. 
	 * @param value the applicableForAdult
	 */
	public void setApplicableForAdult(final TaxRow item, final boolean value)
	{
		setApplicableForAdult( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForChild</code> attribute.
	 * @return the applicableForChild
	 */
	public Boolean isApplicableForChild(final SessionContext ctx, final TaxRow item)
	{
		return (Boolean)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.APPLICABLEFORCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForChild</code> attribute.
	 * @return the applicableForChild
	 */
	public Boolean isApplicableForChild(final TaxRow item)
	{
		return isApplicableForChild( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForChild</code> attribute. 
	 * @return the applicableForChild
	 */
	public boolean isApplicableForChildAsPrimitive(final SessionContext ctx, final TaxRow item)
	{
		Boolean value = isApplicableForChild( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForChild</code> attribute. 
	 * @return the applicableForChild
	 */
	public boolean isApplicableForChildAsPrimitive(final TaxRow item)
	{
		return isApplicableForChildAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForChild</code> attribute. 
	 * @param value the applicableForChild
	 */
	public void setApplicableForChild(final SessionContext ctx, final TaxRow item, final Boolean value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.APPLICABLEFORCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForChild</code> attribute. 
	 * @param value the applicableForChild
	 */
	public void setApplicableForChild(final TaxRow item, final Boolean value)
	{
		setApplicableForChild( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForChild</code> attribute. 
	 * @param value the applicableForChild
	 */
	public void setApplicableForChild(final SessionContext ctx, final TaxRow item, final boolean value)
	{
		setApplicableForChild( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForChild</code> attribute. 
	 * @param value the applicableForChild
	 */
	public void setApplicableForChild(final TaxRow item, final boolean value)
	{
		setApplicableForChild( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForInfant</code> attribute.
	 * @return the applicableForInfant
	 */
	public Boolean isApplicableForInfant(final SessionContext ctx, final TaxRow item)
	{
		return (Boolean)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.APPLICABLEFORINFANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForInfant</code> attribute.
	 * @return the applicableForInfant
	 */
	public Boolean isApplicableForInfant(final TaxRow item)
	{
		return isApplicableForInfant( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForInfant</code> attribute. 
	 * @return the applicableForInfant
	 */
	public boolean isApplicableForInfantAsPrimitive(final SessionContext ctx, final TaxRow item)
	{
		Boolean value = isApplicableForInfant( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.applicableForInfant</code> attribute. 
	 * @return the applicableForInfant
	 */
	public boolean isApplicableForInfantAsPrimitive(final TaxRow item)
	{
		return isApplicableForInfantAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForInfant</code> attribute. 
	 * @param value the applicableForInfant
	 */
	public void setApplicableForInfant(final SessionContext ctx, final TaxRow item, final Boolean value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.APPLICABLEFORINFANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForInfant</code> attribute. 
	 * @param value the applicableForInfant
	 */
	public void setApplicableForInfant(final TaxRow item, final Boolean value)
	{
		setApplicableForInfant( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForInfant</code> attribute. 
	 * @param value the applicableForInfant
	 */
	public void setApplicableForInfant(final SessionContext ctx, final TaxRow item, final boolean value)
	{
		setApplicableForInfant( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.applicableForInfant</code> attribute. 
	 * @param value the applicableForInfant
	 */
	public void setApplicableForInfant(final TaxRow item, final boolean value)
	{
		setApplicableForInfant( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx, final TaxRow item)
	{
		return (City)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final TaxRow item)
	{
		return getCity( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final TaxRow item, final City value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final TaxRow item, final City value)
	{
		setCity( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.companyRateInvRestriction</code> attribute.
	 * @return the companyRateInvRestriction
	 */
	public Set<RateRestriction> getCompanyRateInvRestriction(final SessionContext ctx, final MarketMapping item)
	{
		return (Set<RateRestriction>)COMPANYRATEINVRESTRICTION2MARKETMAPPINGCOMPANYRATEINVRESTRICTIONHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarketMapping.companyRateInvRestriction</code> attribute.
	 * @return the companyRateInvRestriction
	 */
	public Set<RateRestriction> getCompanyRateInvRestriction(final MarketMapping item)
	{
		return getCompanyRateInvRestriction( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.companyRateInvRestriction</code> attribute. 
	 * @param value the companyRateInvRestriction
	 */
	public void setCompanyRateInvRestriction(final SessionContext ctx, final MarketMapping item, final Set<RateRestriction> value)
	{
		COMPANYRATEINVRESTRICTION2MARKETMAPPINGCOMPANYRATEINVRESTRICTIONHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarketMapping.companyRateInvRestriction</code> attribute. 
	 * @param value the companyRateInvRestriction
	 */
	public void setCompanyRateInvRestriction(final MarketMapping item, final Set<RateRestriction> value)
	{
		setCompanyRateInvRestriction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyRateInvRestriction. 
	 * @param value the item to add to companyRateInvRestriction
	 */
	public void addToCompanyRateInvRestriction(final SessionContext ctx, final MarketMapping item, final RateRestriction value)
	{
		COMPANYRATEINVRESTRICTION2MARKETMAPPINGCOMPANYRATEINVRESTRICTIONHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyRateInvRestriction. 
	 * @param value the item to add to companyRateInvRestriction
	 */
	public void addToCompanyRateInvRestriction(final MarketMapping item, final RateRestriction value)
	{
		addToCompanyRateInvRestriction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyRateInvRestriction. 
	 * @param value the item to remove from companyRateInvRestriction
	 */
	public void removeFromCompanyRateInvRestriction(final SessionContext ctx, final MarketMapping item, final RateRestriction value)
	{
		COMPANYRATEINVRESTRICTION2MARKETMAPPINGCOMPANYRATEINVRESTRICTIONHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyRateInvRestriction. 
	 * @param value the item to remove from companyRateInvRestriction
	 */
	public void removeFromCompanyRateInvRestriction(final MarketMapping item, final RateRestriction value)
	{
		removeFromCompanyRateInvRestriction( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx, final TaxRow item)
	{
		return (Country)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final TaxRow item)
	{
		return getCountry( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final TaxRow item, final Country value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final TaxRow item, final Country value)
	{
		setCountry( getSession().getSessionContext(), item, value );
	}
	
	public AgeDetail createAgeDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.AGEDETAIL );
			return (AgeDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AgeDetail : "+e.getMessage(), 0 );
		}
	}
	
	public AgeDetail createAgeDetail(final Map attributeValues)
	{
		return createAgeDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public AncillaryDiscount createAncillaryDiscount(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.ANCILLARYDISCOUNT );
			return (AncillaryDiscount)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AncillaryDiscount : "+e.getMessage(), 0 );
		}
	}
	
	public AncillaryDiscount createAncillaryDiscount(final Map attributeValues)
	{
		return createAncillaryDiscount( getSession().getSessionContext(), attributeValues );
	}
	
	public AncillaryFOC createAncillaryFOC(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.ANCILLARYFOC );
			return (AncillaryFOC)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AncillaryFOC : "+e.getMessage(), 0 );
		}
	}
	
	public AncillaryFOC createAncillaryFOC(final Map attributeValues)
	{
		return createAncillaryFOC( getSession().getSessionContext(), attributeValues );
	}
	
	public AncillaryOfferRate createAncillaryOfferRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.ANCILLARYOFFERRATE );
			return (AncillaryOfferRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AncillaryOfferRate : "+e.getMessage(), 0 );
		}
	}
	
	public AncillaryOfferRate createAncillaryOfferRate(final Map attributeValues)
	{
		return createAncillaryOfferRate( getSession().getSessionContext(), attributeValues );
	}
	
	public AncillaryRateDefinition createAncillaryRateDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.ANCILLARYRATEDEFINITION );
			return (AncillaryRateDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AncillaryRateDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AncillaryRateDefinition createAncillaryRateDefinition(final Map attributeValues)
	{
		return createAncillaryRateDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ChildAgeDetail createChildAgeDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.CHILDAGEDETAIL );
			return (ChildAgeDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ChildAgeDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ChildAgeDetail createChildAgeDetail(final Map attributeValues)
	{
		return createChildAgeDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public ChildAgeRateDetail createChildAgeRateDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.CHILDAGERATEDETAIL );
			return (ChildAgeRateDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ChildAgeRateDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ChildAgeRateDetail createChildAgeRateDetail(final Map attributeValues)
	{
		return createChildAgeRateDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public CommonRateAdvDefinition createCommonRateAdvDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.COMMONRATEADVDEFINITION );
			return (CommonRateAdvDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommonRateAdvDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public CommonRateAdvDefinition createCommonRateAdvDefinition(final Map attributeValues)
	{
		return createCommonRateAdvDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public RateRestriction createCompanyRateInvRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.COMPANYRATEINVRESTRICTION );
			return (RateRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyRateInvRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public RateRestriction createCompanyRateInvRestriction(final Map attributeValues)
	{
		return createCompanyRateInvRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public Complimentary createComplimentary(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.COMPLIMENTARY );
			return (Complimentary)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Complimentary : "+e.getMessage(), 0 );
		}
	}
	
	public Complimentary createComplimentary(final Map attributeValues)
	{
		return createComplimentary( getSession().getSessionContext(), attributeValues );
	}
	
	public DateRangeRestriction createDateRangeRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION );
			return (DateRangeRestriction)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DateRangeRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public DateRangeRestriction createDateRangeRestriction(final Map attributeValues)
	{
		return createDateRangeRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountLongStay createDiscountLongStay(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCOUNTLONGSTAY );
			return (DiscountLongStay)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscountLongStay : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountLongStay createDiscountLongStay(final Map attributeValues)
	{
		return createDiscountLongStay( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountOnFreeNight createDiscountOnFreeNight(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCOUNTONFREENIGHT );
			return (DiscountOnFreeNight)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscountOnFreeNight : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountOnFreeNight createDiscountOnFreeNight(final Map attributeValues)
	{
		return createDiscountOnFreeNight( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountOnNight createDiscountOnNight(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCOUNTONNIGHT );
			return (DiscountOnNight)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscountOnNight : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountOnNight createDiscountOnNight(final Map attributeValues)
	{
		return createDiscountOnNight( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountOnPax createDiscountOnPax(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCOUNTONPAX );
			return (DiscountOnPax)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscountOnPax : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountOnPax createDiscountOnPax(final Map attributeValues)
	{
		return createDiscountOnPax( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountOnRate createDiscountOnRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCOUNTONRATE );
			return (DiscountOnRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscountOnRate : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountOnRate createDiscountOnRate(final Map attributeValues)
	{
		return createDiscountOnRate( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountOnRoomOrCabin createDiscountOnRoomOrCabin(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCOUNTONROOMORCABIN );
			return (DiscountOnRoomOrCabin)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscountOnRoomOrCabin : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountOnRoomOrCabin createDiscountOnRoomOrCabin(final Map attributeValues)
	{
		return createDiscountOnRoomOrCabin( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscountPerAge createDiscountPerAge(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCOUNTPERAGE );
			return (DiscountPerAge)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscountPerAge : "+e.getMessage(), 0 );
		}
	}
	
	public DiscountPerAge createDiscountPerAge(final Map attributeValues)
	{
		return createDiscountPerAge( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscretionaryBranchHead createDiscretionaryBranchHead(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCRETIONARYBRANCHHEAD );
			return (DiscretionaryBranchHead)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscretionaryBranchHead : "+e.getMessage(), 0 );
		}
	}
	
	public DiscretionaryBranchHead createDiscretionaryBranchHead(final Map attributeValues)
	{
		return createDiscretionaryBranchHead( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscretionaryDiscount createDiscretionaryDiscount(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCRETIONARYDISCOUNT );
			return (DiscretionaryDiscount)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscretionaryDiscount : "+e.getMessage(), 0 );
		}
	}
	
	public DiscretionaryDiscount createDiscretionaryDiscount(final Map attributeValues)
	{
		return createDiscretionaryDiscount( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscretionaryProductHead createDiscretionaryProductHead(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCRETIONARYPRODUCTHEAD );
			return (DiscretionaryProductHead)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscretionaryProductHead : "+e.getMessage(), 0 );
		}
	}
	
	public DiscretionaryProductHead createDiscretionaryProductHead(final Map attributeValues)
	{
		return createDiscretionaryProductHead( getSession().getSessionContext(), attributeValues );
	}
	
	public DiscretionarySalesHead createDiscretionarySalesHead(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.DISCRETIONARYSALESHEAD );
			return (DiscretionarySalesHead)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DiscretionarySalesHead : "+e.getMessage(), 0 );
		}
	}
	
	public DiscretionarySalesHead createDiscretionarySalesHead(final Map attributeValues)
	{
		return createDiscretionarySalesHead( getSession().getSessionContext(), attributeValues );
	}
	
	public FOCOffer createFOCOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.FOCOFFER );
			return (FOCOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FOCOffer : "+e.getMessage(), 0 );
		}
	}
	
	public FOCOffer createFOCOffer(final Map attributeValues)
	{
		return createFOCOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public Incentive createIncentive(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.INCENTIVE );
			return (Incentive)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Incentive : "+e.getMessage(), 0 );
		}
	}
	
	public Incentive createIncentive(final Map attributeValues)
	{
		return createIncentive( getSession().getSessionContext(), attributeValues );
	}
	
	public IncentiveBranchHead createIncentiveBranchHead(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.INCENTIVEBRANCHHEAD );
			return (IncentiveBranchHead)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IncentiveBranchHead : "+e.getMessage(), 0 );
		}
	}
	
	public IncentiveBranchHead createIncentiveBranchHead(final Map attributeValues)
	{
		return createIncentiveBranchHead( getSession().getSessionContext(), attributeValues );
	}
	
	public IncentiveSalesHead createIncentiveSalesHead(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.INCENTIVESALESHEAD );
			return (IncentiveSalesHead)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IncentiveSalesHead : "+e.getMessage(), 0 );
		}
	}
	
	public IncentiveSalesHead createIncentiveSalesHead(final Map attributeValues)
	{
		return createIncentiveSalesHead( getSession().getSessionContext(), attributeValues );
	}
	
	public OfferCombinationRule createOfferCombinationRule(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.OFFERCOMBINATIONRULE );
			return (OfferCombinationRule)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OfferCombinationRule : "+e.getMessage(), 0 );
		}
	}
	
	public OfferCombinationRule createOfferCombinationRule(final Map attributeValues)
	{
		return createOfferCombinationRule( getSession().getSessionContext(), attributeValues );
	}
	
	public OfferRateProduct createOfferRateProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.OFFERRATEPRODUCT );
			return (OfferRateProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OfferRateProduct : "+e.getMessage(), 0 );
		}
	}
	
	public OfferRateProduct createOfferRateProduct(final Map attributeValues)
	{
		return createOfferRateProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public PassengerLevelSurchargeDetail createPassengerLevelSurchargeDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.PASSENGERLEVELSURCHARGEDETAIL );
			return (PassengerLevelSurchargeDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PassengerLevelSurchargeDetail : "+e.getMessage(), 0 );
		}
	}
	
	public PassengerLevelSurchargeDetail createPassengerLevelSurchargeDetail(final Map attributeValues)
	{
		return createPassengerLevelSurchargeDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentTypeDetails createPaymentTypeDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.PAYMENTTYPEDETAILS );
			return (PaymentTypeDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PaymentTypeDetails : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentTypeDetails createPaymentTypeDetails(final Map attributeValues)
	{
		return createPaymentTypeDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public RatePaymentDetail createRatePaymentDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.RATEPAYMENTDETAIL );
			return (RatePaymentDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RatePaymentDetail : "+e.getMessage(), 0 );
		}
	}
	
	public RatePaymentDetail createRatePaymentDetail(final Map attributeValues)
	{
		return createRatePaymentDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public RateVoucherNote createRateVoucherNote(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.RATEVOUCHERNOTE );
			return (RateVoucherNote)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RateVoucherNote : "+e.getMessage(), 0 );
		}
	}
	
	public RateVoucherNote createRateVoucherNote(final Map attributeValues)
	{
		return createRateVoucherNote( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomOrCabinUpgrade createRoomOrCabinUpgrade(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.ROOMORCABINUPGRADE );
			return (RoomOrCabinUpgrade)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomOrCabinUpgrade : "+e.getMessage(), 0 );
		}
	}
	
	public RoomOrCabinUpgrade createRoomOrCabinUpgrade(final Map attributeValues)
	{
		return createRoomOrCabinUpgrade( getSession().getSessionContext(), attributeValues );
	}
	
	public SeasonDetail createSeasonDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.SEASONDETAIL );
			return (SeasonDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SeasonDetail : "+e.getMessage(), 0 );
		}
	}
	
	public SeasonDetail createSeasonDetail(final Map attributeValues)
	{
		return createSeasonDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierAncillaryRate createSupplierAncillaryRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscoreConstants.TC.SUPPLIERANCILLARYRATE );
			return (SupplierAncillaryRate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierAncillaryRate : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierAncillaryRate createSupplierAncillaryRate(final Map attributeValues)
	{
		return createSupplierAncillaryRate( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.DiscretionaryDiscounts</code> attribute.
	 * @return the DiscretionaryDiscounts
	 */
	public Set<DiscretionaryDiscount> getDiscretionaryDiscounts(final SessionContext ctx, final UserGroup item)
	{
		return (Set<DiscretionaryDiscount>)USERGROUP2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.DiscretionaryDiscounts</code> attribute.
	 * @return the DiscretionaryDiscounts
	 */
	public Set<DiscretionaryDiscount> getDiscretionaryDiscounts(final UserGroup item)
	{
		return getDiscretionaryDiscounts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.DiscretionaryDiscounts</code> attribute. 
	 * @param value the DiscretionaryDiscounts
	 */
	public void setDiscretionaryDiscounts(final SessionContext ctx, final UserGroup item, final Set<DiscretionaryDiscount> value)
	{
		USERGROUP2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.DiscretionaryDiscounts</code> attribute. 
	 * @param value the DiscretionaryDiscounts
	 */
	public void setDiscretionaryDiscounts(final UserGroup item, final Set<DiscretionaryDiscount> value)
	{
		setDiscretionaryDiscounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to DiscretionaryDiscounts. 
	 * @param value the item to add to DiscretionaryDiscounts
	 */
	public void addToDiscretionaryDiscounts(final SessionContext ctx, final UserGroup item, final DiscretionaryDiscount value)
	{
		USERGROUP2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to DiscretionaryDiscounts. 
	 * @param value the item to add to DiscretionaryDiscounts
	 */
	public void addToDiscretionaryDiscounts(final UserGroup item, final DiscretionaryDiscount value)
	{
		addToDiscretionaryDiscounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from DiscretionaryDiscounts. 
	 * @param value the item to remove from DiscretionaryDiscounts
	 */
	public void removeFromDiscretionaryDiscounts(final SessionContext ctx, final UserGroup item, final DiscretionaryDiscount value)
	{
		USERGROUP2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from DiscretionaryDiscounts. 
	 * @param value the item to remove from DiscretionaryDiscounts
	 */
	public void removeFromDiscretionaryDiscounts(final UserGroup item, final DiscretionaryDiscount value)
	{
		removeFromDiscretionaryDiscounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.DiscretionaryDiscounts</code> attribute.
	 * @return the DiscretionaryDiscounts
	 */
	public Set<DiscretionaryDiscount> getDiscretionaryDiscounts(final SessionContext ctx, final Employee item)
	{
		return (Set<DiscretionaryDiscount>)EMPLOYEE2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.DiscretionaryDiscounts</code> attribute.
	 * @return the DiscretionaryDiscounts
	 */
	public Set<DiscretionaryDiscount> getDiscretionaryDiscounts(final Employee item)
	{
		return getDiscretionaryDiscounts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.DiscretionaryDiscounts</code> attribute. 
	 * @param value the DiscretionaryDiscounts
	 */
	public void setDiscretionaryDiscounts(final SessionContext ctx, final Employee item, final Set<DiscretionaryDiscount> value)
	{
		EMPLOYEE2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.DiscretionaryDiscounts</code> attribute. 
	 * @param value the DiscretionaryDiscounts
	 */
	public void setDiscretionaryDiscounts(final Employee item, final Set<DiscretionaryDiscount> value)
	{
		setDiscretionaryDiscounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to DiscretionaryDiscounts. 
	 * @param value the item to add to DiscretionaryDiscounts
	 */
	public void addToDiscretionaryDiscounts(final SessionContext ctx, final Employee item, final DiscretionaryDiscount value)
	{
		EMPLOYEE2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to DiscretionaryDiscounts. 
	 * @param value the item to add to DiscretionaryDiscounts
	 */
	public void addToDiscretionaryDiscounts(final Employee item, final DiscretionaryDiscount value)
	{
		addToDiscretionaryDiscounts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from DiscretionaryDiscounts. 
	 * @param value the item to remove from DiscretionaryDiscounts
	 */
	public void removeFromDiscretionaryDiscounts(final SessionContext ctx, final Employee item, final DiscretionaryDiscount value)
	{
		EMPLOYEE2DISCRETIONARYDISCOUNTDISCRETIONARYDISCOUNTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from DiscretionaryDiscounts. 
	 * @param value the item to remove from DiscretionaryDiscounts
	 */
	public void removeFromDiscretionaryDiscounts(final Employee item, final DiscretionaryDiscount value)
	{
		removeFromDiscretionaryDiscounts( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SupplierratedefinitionscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.heads</code> attribute.
	 * @return the heads
	 */
	public Collection<Employee> getHeads(final SessionContext ctx, final Employee item)
	{
		final List<Employee> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			"Employee",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.heads</code> attribute.
	 * @return the heads
	 */
	public Collection<Employee> getHeads(final Employee item)
	{
		return getHeads( getSession().getSessionContext(), item );
	}
	
	public long getHeadsCount(final SessionContext ctx, final Employee item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			"Employee",
			null
		);
	}
	
	public long getHeadsCount(final Employee item)
	{
		return getHeadsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.heads</code> attribute. 
	 * @param value the heads
	 */
	public void setHeads(final SessionContext ctx, final Employee item, final Collection<Employee> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2EMPLOYEE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.heads</code> attribute. 
	 * @param value the heads
	 */
	public void setHeads(final Employee item, final Collection<Employee> value)
	{
		setHeads( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to heads. 
	 * @param value the item to add to heads
	 */
	public void addToHeads(final SessionContext ctx, final Employee item, final Employee value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2EMPLOYEE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to heads. 
	 * @param value the item to add to heads
	 */
	public void addToHeads(final Employee item, final Employee value)
	{
		addToHeads( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from heads. 
	 * @param value the item to remove from heads
	 */
	public void removeFromHeads(final SessionContext ctx, final Employee item, final Employee value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2EMPLOYEE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from heads. 
	 * @param value the item to remove from heads
	 */
	public void removeFromHeads(final Employee item, final Employee value)
	{
		removeFromHeads( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.incentives</code> attribute.
	 * @return the incentives
	 */
	public Set<Incentive> getIncentives(final SessionContext ctx, final UserGroup item)
	{
		return (Set<Incentive>)USERGROUP2INCENTIVEINCENTIVESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.incentives</code> attribute.
	 * @return the incentives
	 */
	public Set<Incentive> getIncentives(final UserGroup item)
	{
		return getIncentives( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.incentives</code> attribute. 
	 * @param value the incentives
	 */
	public void setIncentives(final SessionContext ctx, final UserGroup item, final Set<Incentive> value)
	{
		USERGROUP2INCENTIVEINCENTIVESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.incentives</code> attribute. 
	 * @param value the incentives
	 */
	public void setIncentives(final UserGroup item, final Set<Incentive> value)
	{
		setIncentives( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to incentives. 
	 * @param value the item to add to incentives
	 */
	public void addToIncentives(final SessionContext ctx, final UserGroup item, final Incentive value)
	{
		USERGROUP2INCENTIVEINCENTIVESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to incentives. 
	 * @param value the item to add to incentives
	 */
	public void addToIncentives(final UserGroup item, final Incentive value)
	{
		addToIncentives( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from incentives. 
	 * @param value the item to remove from incentives
	 */
	public void removeFromIncentives(final SessionContext ctx, final UserGroup item, final Incentive value)
	{
		USERGROUP2INCENTIVEINCENTIVESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from incentives. 
	 * @param value the item to remove from incentives
	 */
	public void removeFromIncentives(final UserGroup item, final Incentive value)
	{
		removeFromIncentives( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.incentives</code> attribute.
	 * @return the incentives
	 */
	public Set<Incentive> getIncentives(final SessionContext ctx, final Employee item)
	{
		return (Set<Incentive>)EMPLOYEE2INCENTIVEINCENTIVESHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.incentives</code> attribute.
	 * @return the incentives
	 */
	public Set<Incentive> getIncentives(final Employee item)
	{
		return getIncentives( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.incentives</code> attribute. 
	 * @param value the incentives
	 */
	public void setIncentives(final SessionContext ctx, final Employee item, final Set<Incentive> value)
	{
		EMPLOYEE2INCENTIVEINCENTIVESHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.incentives</code> attribute. 
	 * @param value the incentives
	 */
	public void setIncentives(final Employee item, final Set<Incentive> value)
	{
		setIncentives( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to incentives. 
	 * @param value the item to add to incentives
	 */
	public void addToIncentives(final SessionContext ctx, final Employee item, final Incentive value)
	{
		EMPLOYEE2INCENTIVEINCENTIVESHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to incentives. 
	 * @param value the item to add to incentives
	 */
	public void addToIncentives(final Employee item, final Incentive value)
	{
		addToIncentives( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from incentives. 
	 * @param value the item to remove from incentives
	 */
	public void removeFromIncentives(final SessionContext ctx, final Employee item, final Incentive value)
	{
		EMPLOYEE2INCENTIVEINCENTIVESHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from incentives. 
	 * @param value the item to remove from incentives
	 */
	public void removeFromIncentives(final Employee item, final Incentive value)
	{
		removeFromIncentives( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final SessionContext ctx, final TaxRow item)
	{
		return (Boolean)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.PAYONARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final TaxRow item)
	{
		return isPayOnArrival( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final SessionContext ctx, final TaxRow item)
	{
		Boolean value = isPayOnArrival( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final TaxRow item)
	{
		return isPayOnArrivalAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final TaxRow item, final Boolean value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.PAYONARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final TaxRow item, final Boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final TaxRow item, final boolean value)
	{
		setPayOnArrival( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final TaxRow item, final boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public Set<FareComponent> getPriceComponent(final SessionContext ctx, final TaxRow item)
	{
		final List<FareComponent> items = item.getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			"FareComponent",
			null,
			false,
			false
		);
		return new LinkedHashSet<FareComponent>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public Set<FareComponent> getPriceComponent(final TaxRow item)
	{
		return getPriceComponent( getSession().getSessionContext(), item );
	}
	
	public long getPriceComponentCount(final SessionContext ctx, final TaxRow item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			"FareComponent",
			null
		);
	}
	
	public long getPriceComponentCount(final TaxRow item)
	{
		return getPriceComponentCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final SessionContext ctx, final TaxRow item, final Set<FareComponent> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXROW2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final TaxRow item, final Set<FareComponent> value)
	{
		setPriceComponent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to priceComponent. 
	 * @param value the item to add to priceComponent
	 */
	public void addToPriceComponent(final SessionContext ctx, final TaxRow item, final FareComponent value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXROW2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to priceComponent. 
	 * @param value the item to add to priceComponent
	 */
	public void addToPriceComponent(final TaxRow item, final FareComponent value)
	{
		addToPriceComponent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from priceComponent. 
	 * @param value the item to remove from priceComponent
	 */
	public void removeFromPriceComponent(final SessionContext ctx, final TaxRow item, final FareComponent value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXROW2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from priceComponent. 
	 * @param value the item to remove from priceComponent
	 */
	public void removeFromPriceComponent(final TaxRow item, final FareComponent value)
	{
		removeFromPriceComponent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.salesOfficers</code> attribute.
	 * @return the salesOfficers
	 */
	public Collection<Employee> getSalesOfficers(final SessionContext ctx, final Employee item)
	{
		final List<Employee> items = item.getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			"Employee",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employee.salesOfficers</code> attribute.
	 * @return the salesOfficers
	 */
	public Collection<Employee> getSalesOfficers(final Employee item)
	{
		return getSalesOfficers( getSession().getSessionContext(), item );
	}
	
	public long getSalesOfficersCount(final SessionContext ctx, final Employee item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			"Employee",
			null
		);
	}
	
	public long getSalesOfficersCount(final Employee item)
	{
		return getSalesOfficersCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.salesOfficers</code> attribute. 
	 * @param value the salesOfficers
	 */
	public void setSalesOfficers(final SessionContext ctx, final Employee item, final Collection<Employee> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2EMPLOYEE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employee.salesOfficers</code> attribute. 
	 * @param value the salesOfficers
	 */
	public void setSalesOfficers(final Employee item, final Collection<Employee> value)
	{
		setSalesOfficers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesOfficers. 
	 * @param value the item to add to salesOfficers
	 */
	public void addToSalesOfficers(final SessionContext ctx, final Employee item, final Employee value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2EMPLOYEE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesOfficers. 
	 * @param value the item to add to salesOfficers
	 */
	public void addToSalesOfficers(final Employee item, final Employee value)
	{
		addToSalesOfficers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesOfficers. 
	 * @param value the item to remove from salesOfficers
	 */
	public void removeFromSalesOfficers(final SessionContext ctx, final Employee item, final Employee value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.EMPLOYEE2EMPLOYEE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(EMPLOYEE2EMPLOYEE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesOfficers. 
	 * @param value the item to remove from salesOfficers
	 */
	public void removeFromSalesOfficers(final Employee item, final Employee value)
	{
		removeFromSalesOfficers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.state</code> attribute.
	 * @return the state
	 */
	public Region getState(final SessionContext ctx, final TaxRow item)
	{
		return (Region)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.STATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.state</code> attribute.
	 * @return the state
	 */
	public Region getState(final TaxRow item)
	{
		return getState( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final SessionContext ctx, final TaxRow item, final Region value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.STATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.state</code> attribute. 
	 * @param value the state
	 */
	public void setState(final TaxRow item, final Region value)
	{
		setState( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.supplierAncillaryRate</code> attribute.
	 * @return the supplierAncillaryRate
	 */
	public Collection<SupplierAncillaryRate> getSupplierAncillaryRate(final SessionContext ctx, final Media item)
	{
		final List<SupplierAncillaryRate> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			"SupplierAncillaryRate",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.supplierAncillaryRate</code> attribute.
	 * @return the supplierAncillaryRate
	 */
	public Collection<SupplierAncillaryRate> getSupplierAncillaryRate(final Media item)
	{
		return getSupplierAncillaryRate( getSession().getSessionContext(), item );
	}
	
	public long getSupplierAncillaryRateCount(final SessionContext ctx, final Media item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			"SupplierAncillaryRate",
			null
		);
	}
	
	public long getSupplierAncillaryRateCount(final Media item)
	{
		return getSupplierAncillaryRateCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.supplierAncillaryRate</code> attribute. 
	 * @param value the supplierAncillaryRate
	 */
	public void setSupplierAncillaryRate(final SessionContext ctx, final Media item, final Collection<SupplierAncillaryRate> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERANCRATE2MEDIARELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.supplierAncillaryRate</code> attribute. 
	 * @param value the supplierAncillaryRate
	 */
	public void setSupplierAncillaryRate(final Media item, final Collection<SupplierAncillaryRate> value)
	{
		setSupplierAncillaryRate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierAncillaryRate. 
	 * @param value the item to add to supplierAncillaryRate
	 */
	public void addToSupplierAncillaryRate(final SessionContext ctx, final Media item, final SupplierAncillaryRate value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERANCRATE2MEDIARELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierAncillaryRate. 
	 * @param value the item to add to supplierAncillaryRate
	 */
	public void addToSupplierAncillaryRate(final Media item, final SupplierAncillaryRate value)
	{
		addToSupplierAncillaryRate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierAncillaryRate. 
	 * @param value the item to remove from supplierAncillaryRate
	 */
	public void removeFromSupplierAncillaryRate(final SessionContext ctx, final Media item, final SupplierAncillaryRate value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERANCRATE2MEDIARELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierAncillaryRate. 
	 * @param value the item to remove from supplierAncillaryRate
	 */
	public void removeFromSupplierAncillaryRate(final Media item, final SupplierAncillaryRate value)
	{
		removeFromSupplierAncillaryRate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public AbstractSupplierRate getSupplierRate(final SessionContext ctx, final TaxRow item)
	{
		return (AbstractSupplierRate)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.SUPPLIERRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public AbstractSupplierRate getSupplierRate(final TaxRow item)
	{
		return getSupplierRate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final SessionContext ctx, final TaxRow item, final AbstractSupplierRate value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.SUPPLIERRATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final TaxRow item, final AbstractSupplierRate value)
	{
		setSupplierRate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public Collection<AbstractSupplierRate> getSupplierRate(final SessionContext ctx, final Media item)
	{
		final List<AbstractSupplierRate> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			"AbstractSupplierRate",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public Collection<AbstractSupplierRate> getSupplierRate(final Media item)
	{
		return getSupplierRate( getSession().getSessionContext(), item );
	}
	
	public long getSupplierRateCount(final SessionContext ctx, final Media item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			"AbstractSupplierRate",
			null
		);
	}
	
	public long getSupplierRateCount(final Media item)
	{
		return getSupplierRateCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final SessionContext ctx, final Media item, final Collection<AbstractSupplierRate> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSSUPPLIERRATE2MEDIAREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final Media item, final Collection<AbstractSupplierRate> value)
	{
		setSupplierRate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierRate. 
	 * @param value the item to add to supplierRate
	 */
	public void addToSupplierRate(final SessionContext ctx, final Media item, final AbstractSupplierRate value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSSUPPLIERRATE2MEDIAREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierRate. 
	 * @param value the item to add to supplierRate
	 */
	public void addToSupplierRate(final Media item, final AbstractSupplierRate value)
	{
		addToSupplierRate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierRate. 
	 * @param value the item to remove from supplierRate
	 */
	public void removeFromSupplierRate(final SessionContext ctx, final Media item, final AbstractSupplierRate value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSSUPPLIERRATE2MEDIAREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSSUPPLIERRATE2MEDIAREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierRate. 
	 * @param value the item to remove from supplierRate
	 */
	public void removeFromSupplierRate(final Media item, final AbstractSupplierRate value)
	{
		removeFromSupplierRate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.taxCalculationOn</code> attribute.
	 * @return the taxCalculationOn
	 */
	public RateType getTaxCalculationOn(final SessionContext ctx, final TaxRow item)
	{
		return (RateType)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.TAXCALCULATIONON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.taxCalculationOn</code> attribute.
	 * @return the taxCalculationOn
	 */
	public RateType getTaxCalculationOn(final TaxRow item)
	{
		return getTaxCalculationOn( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.taxCalculationOn</code> attribute. 
	 * @param value the taxCalculationOn
	 */
	public void setTaxCalculationOn(final SessionContext ctx, final TaxRow item, final RateType value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.TAXCALCULATIONON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.taxCalculationOn</code> attribute. 
	 * @param value the taxCalculationOn
	 */
	public void setTaxCalculationOn(final TaxRow item, final RateType value)
	{
		setTaxCalculationOn( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.taxRate</code> attribute.
	 * @return the taxRate
	 */
	public EnumerationValue getTaxRate(final SessionContext ctx, final TaxRow item)
	{
		return (EnumerationValue)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.TAXRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.taxRate</code> attribute.
	 * @return the taxRate
	 */
	public EnumerationValue getTaxRate(final TaxRow item)
	{
		return getTaxRate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.taxRate</code> attribute. 
	 * @param value the taxRate
	 */
	public void setTaxRate(final SessionContext ctx, final TaxRow item, final EnumerationValue value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.TAXRATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.taxRate</code> attribute. 
	 * @param value the taxRate
	 */
	public void setTaxRate(final TaxRow item, final EnumerationValue value)
	{
		setTaxRate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareComponent.taxRow</code> attribute.
	 * @return the taxRow
	 */
	public Set<TaxRow> getTaxRow(final SessionContext ctx, final FareComponent item)
	{
		final List<TaxRow> items = item.getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			"TaxRow",
			null,
			false,
			false
		);
		return new LinkedHashSet<TaxRow>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareComponent.taxRow</code> attribute.
	 * @return the taxRow
	 */
	public Set<TaxRow> getTaxRow(final FareComponent item)
	{
		return getTaxRow( getSession().getSessionContext(), item );
	}
	
	public long getTaxRowCount(final SessionContext ctx, final FareComponent item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			"TaxRow",
			null
		);
	}
	
	public long getTaxRowCount(final FareComponent item)
	{
		return getTaxRowCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareComponent.taxRow</code> attribute. 
	 * @param value the taxRow
	 */
	public void setTaxRow(final SessionContext ctx, final FareComponent item, final Set<TaxRow> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXROW2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareComponent.taxRow</code> attribute. 
	 * @param value the taxRow
	 */
	public void setTaxRow(final FareComponent item, final Set<TaxRow> value)
	{
		setTaxRow( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxRow. 
	 * @param value the item to add to taxRow
	 */
	public void addToTaxRow(final SessionContext ctx, final FareComponent item, final TaxRow value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXROW2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxRow. 
	 * @param value the item to add to taxRow
	 */
	public void addToTaxRow(final FareComponent item, final TaxRow value)
	{
		addToTaxRow( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxRow. 
	 * @param value the item to remove from taxRow
	 */
	public void removeFromTaxRow(final SessionContext ctx, final FareComponent item, final TaxRow value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.TAXROW2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXROW2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxRow. 
	 * @param value the item to remove from taxRow
	 */
	public void removeFromTaxRow(final FareComponent item, final TaxRow value)
	{
		removeFromTaxRow( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.taxType</code> attribute.
	 * @return the taxType
	 */
	public EnumerationValue getTaxType(final SessionContext ctx, final TaxRow item)
	{
		return (EnumerationValue)item.getProperty( ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.TAXTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxRow.taxType</code> attribute.
	 * @return the taxType
	 */
	public EnumerationValue getTaxType(final TaxRow item)
	{
		return getTaxType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.taxType</code> attribute. 
	 * @param value the taxType
	 */
	public void setTaxType(final SessionContext ctx, final TaxRow item, final EnumerationValue value)
	{
		item.setProperty(ctx, SupplierratedefinitionscoreConstants.Attributes.TaxRow.TAXTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxRow.taxType</code> attribute. 
	 * @param value the taxType
	 */
	public void setTaxType(final TaxRow item, final EnumerationValue value)
	{
		setTaxType( getSession().getSessionContext(), item, value );
	}
	
}
