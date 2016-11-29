/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.iata.jalo.AbstractIATAItem;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail;
import com.cnk.travelogix.masterdata.core.proucts.jalo.BusOperator;
import com.cnk.travelogix.masterdata.core.proucts.jalo.BusRoute;
import com.cnk.travelogix.orgstructure.core.iata.jalo.IATAAgency;
import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.AccoFOCRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.FOCRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.FlightFOCRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.SupplierFOCCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo.SupplierIncentiveOnTopupRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo.TopupDetail;
import com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo.LookToBookRatio;
import com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo.SupplierLookToBookCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.msf.jalo.SupplierMSFFeeRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo.DynamicFeeConfig;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo.SupplierOtherFeeCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.paymentadvice.jalo.PaymentAdviceForOtherFee;
import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo.PenaltyCriteria;
import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo.SupplierPenaltyKickBackCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo.SignupBonusCriteria;
import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo.SupplierSignUpBonusCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo.ReturnOfPayable;
import com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo.SupplierTerminationFeeCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.nationality.ClientNationalityConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.room.RoomCategoryConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.room.RoomTypeConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.activity.ActivitySupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.AirSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.flight.inclusionexclusion.FlightNumbersConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.flight.inclusionexclusion.FlightTimingsConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.AirTravelDestinationConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.BookingClassConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.DealCodeConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.FareBasisConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.TravelDestinationConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.holidays.HolidaySupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.passenger.SupCommAdvDefPassengerConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.transport.TransportSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.transport.VehicleConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.validity.CommercialsValidity;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialDefinition;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.BusProductInfo;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialProductInfo;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialRateTypeDetail;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialValueRange;
import com.cnk.travelogix.supplier.commercials.core.jalo.FixValues;
import com.cnk.travelogix.supplier.commercials.core.jalo.FixedCommercialValue;
import com.cnk.travelogix.supplier.commercials.core.jalo.GeneralCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.RailProductInfo;
import com.cnk.travelogix.supplier.commercials.core.jalo.SlabCommercialValue;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierAdvanceCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierFOCFeeCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierGeneralCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierGeneralCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierIncentiveOnTopupCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierLookToBookCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierMSFFeeCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierOtherFeeCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierPenaltyKickbackCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierRemittanceCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierRemittanceCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierSignUpBonusCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierStandardCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierStandardCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierTerminationFeeCommercial;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.cronjob.jalo.Trigger;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.order.payment.PaymentMode;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>SuppliercommercialscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSuppliercommercialscoreManager extends Extension
{
	/** Relation ordering override parameter constants for SupComlDef2SupMarketRel from ((suppliercommercialscore))*/
	protected static String SUPCOMLDEF2SUPMARKETREL_SRC_ORDERED = "relation.SupComlDef2SupMarketRel.source.ordered";
	protected static String SUPCOMLDEF2SUPMARKETREL_TGT_ORDERED = "relation.SupComlDef2SupMarketRel.target.ordered";
	/** Relation disable markmodifed parameter constants for SupComlDef2SupMarketRel from ((suppliercommercialscore))*/
	protected static String SUPCOMLDEF2SUPMARKETREL_MARKMODIFIED = "relation.SupComlDef2SupMarketRel.markmodified";
	/** Relation ordering override parameter constants for Commercial2Product from ((suppliercommercialscore))*/
	protected static String COMMERCIAL2PRODUCT_SRC_ORDERED = "relation.Commercial2Product.source.ordered";
	protected static String COMMERCIAL2PRODUCT_TGT_ORDERED = "relation.Commercial2Product.target.ordered";
	/** Relation disable markmodifed parameter constants for Commercial2Product from ((suppliercommercialscore))*/
	protected static String COMMERCIAL2PRODUCT_MARKMODIFIED = "relation.Commercial2Product.markmodified";
	/** Relation ordering override parameter constants for GeneralCommercial2Principal from ((suppliercommercialscore))*/
	protected static String GENERALCOMMERCIAL2PRINCIPAL_SRC_ORDERED = "relation.GeneralCommercial2Principal.source.ordered";
	protected static String GENERALCOMMERCIAL2PRINCIPAL_TGT_ORDERED = "relation.GeneralCommercial2Principal.target.ordered";
	/** Relation disable markmodifed parameter constants for GeneralCommercial2Principal from ((suppliercommercialscore))*/
	protected static String GENERALCOMMERCIAL2PRINCIPAL_MARKMODIFIED = "relation.GeneralCommercial2Principal.markmodified";
	/** Relation ordering override parameter constants for genCom2IATAAgency from ((suppliercommercialscore))*/
	protected static String GENCOM2IATAAGENCY_SRC_ORDERED = "relation.genCom2IATAAgency.source.ordered";
	protected static String GENCOM2IATAAGENCY_TGT_ORDERED = "relation.genCom2IATAAgency.target.ordered";
	/** Relation disable markmodifed parameter constants for genCom2IATAAgency from ((suppliercommercialscore))*/
	protected static String GENCOM2IATAAGENCY_MARKMODIFIED = "relation.genCom2IATAAgency.markmodified";
	/** Relation ordering override parameter constants for Commercial2TravelogixPolicy from ((suppliercommercialscore))*/
	protected static String COMMERCIAL2TRAVELOGIXPOLICY_SRC_ORDERED = "relation.Commercial2TravelogixPolicy.source.ordered";
	protected static String COMMERCIAL2TRAVELOGIXPOLICY_TGT_ORDERED = "relation.Commercial2TravelogixPolicy.target.ordered";
	/** Relation disable markmodifed parameter constants for Commercial2TravelogixPolicy from ((suppliercommercialscore))*/
	protected static String COMMERCIAL2TRAVELOGIXPOLICY_MARKMODIFIED = "relation.Commercial2TravelogixPolicy.markmodified";
	/** Relation ordering override parameter constants for OtherFee2ProdCatSubType from ((suppliercommercialscore))*/
	protected static String OTHERFEE2PRODCATSUBTYPE_SRC_ORDERED = "relation.OtherFee2ProdCatSubType.source.ordered";
	protected static String OTHERFEE2PRODCATSUBTYPE_TGT_ORDERED = "relation.OtherFee2ProdCatSubType.target.ordered";
	/** Relation disable markmodifed parameter constants for OtherFee2ProdCatSubType from ((suppliercommercialscore))*/
	protected static String OTHERFEE2PRODCATSUBTYPE_MARKMODIFIED = "relation.OtherFee2ProdCatSubType.markmodified";
	/** Relation ordering override parameter constants for Credential2AdvcenceDefinition from ((suppliercommercialscore))*/
	protected static String CREDENTIAL2ADVCENCEDEFINITION_SRC_ORDERED = "relation.Credential2AdvcenceDefinition.source.ordered";
	protected static String CREDENTIAL2ADVCENCEDEFINITION_TGT_ORDERED = "relation.Credential2AdvcenceDefinition.target.ordered";
	/** Relation disable markmodifed parameter constants for Credential2AdvcenceDefinition from ((suppliercommercialscore))*/
	protected static String CREDENTIAL2ADVCENCEDEFINITION_MARKMODIFIED = "relation.Credential2AdvcenceDefinition.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("commercialRecord", AttributeMode.INITIAL);
		tmp.put("paymentAdvice", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("busProduct", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.proucts.jalo.BusRoute", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("busProduct", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.proucts.jalo.BusOperator", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("commercialProductInfo", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Country", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("commercial", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cronjob.jalo.Trigger", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("fees", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.order.payment.PaymentMode", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("fees", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("paymentAdvice", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<SupplierCommercialAdvanceDefinition> getAdvanceDefinition(final SessionContext ctx, final SupplierCredentials item)
	{
		final List<SupplierCommercialAdvanceDefinition> items = item.getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			"SupplierCommercialAdvanceDefinition",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<SupplierCommercialAdvanceDefinition> getAdvanceDefinition(final SupplierCredentials item)
	{
		return getAdvanceDefinition( getSession().getSessionContext(), item );
	}
	
	public long getAdvanceDefinitionCount(final SessionContext ctx, final SupplierCredentials item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			"SupplierCommercialAdvanceDefinition",
			null
		);
	}
	
	public long getAdvanceDefinitionCount(final SupplierCredentials item)
	{
		return getAdvanceDefinitionCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final SupplierCredentials item, final Collection<SupplierCommercialAdvanceDefinition> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDENTIAL2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SupplierCredentials item, final Collection<SupplierCommercialAdvanceDefinition> value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final SessionContext ctx, final SupplierCredentials item, final SupplierCommercialAdvanceDefinition value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDENTIAL2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final SupplierCredentials item, final SupplierCommercialAdvanceDefinition value)
	{
		addToAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final SessionContext ctx, final SupplierCredentials item, final SupplierCommercialAdvanceDefinition value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDENTIAL2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final SupplierCredentials item, final SupplierCommercialAdvanceDefinition value)
	{
		removeFromAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusRoute.busProduct</code> attribute.
	 * @return the busProduct
	 */
	public BusProductInfo getBusProduct(final SessionContext ctx, final BusRoute item)
	{
		return (BusProductInfo)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.BusRoute.BUSPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusRoute.busProduct</code> attribute.
	 * @return the busProduct
	 */
	public BusProductInfo getBusProduct(final BusRoute item)
	{
		return getBusProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusRoute.busProduct</code> attribute. 
	 * @param value the busProduct
	 */
	public void setBusProduct(final SessionContext ctx, final BusRoute item, final BusProductInfo value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.BusRoute.BUSPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusRoute.busProduct</code> attribute. 
	 * @param value the busProduct
	 */
	public void setBusProduct(final BusRoute item, final BusProductInfo value)
	{
		setBusProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusOperator.busProduct</code> attribute.
	 * @return the busProduct
	 */
	public BusProductInfo getBusProduct(final SessionContext ctx, final BusOperator item)
	{
		return (BusProductInfo)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.BusOperator.BUSPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusOperator.busProduct</code> attribute.
	 * @return the busProduct
	 */
	public BusProductInfo getBusProduct(final BusOperator item)
	{
		return getBusProduct( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusOperator.busProduct</code> attribute. 
	 * @param value the busProduct
	 */
	public void setBusProduct(final SessionContext ctx, final BusOperator item, final BusProductInfo value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.BusOperator.BUSPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusOperator.busProduct</code> attribute. 
	 * @param value the busProduct
	 */
	public void setBusProduct(final BusOperator item, final BusProductInfo value)
	{
		setBusProduct( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierIncentiveOnTopupRecord getCommercial(final SessionContext ctx, final Trigger item)
	{
		return (SupplierIncentiveOnTopupRecord)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.Trigger.COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Trigger.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierIncentiveOnTopupRecord getCommercial(final Trigger item)
	{
		return getCommercial( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SessionContext ctx, final Trigger item, final SupplierIncentiveOnTopupRecord value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.Trigger.COMMERCIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Trigger.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final Trigger item, final SupplierIncentiveOnTopupRecord value)
	{
		setCommercial( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.commercialDefinitions</code> attribute.
	 * @return the commercialDefinitions
	 */
	public Set<AbstractCommercialDefinition> getCommercialDefinitions(final SessionContext ctx, final SupplierMarket item)
	{
		final List<AbstractCommercialDefinition> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			"AbstractCommercialDefinition",
			null,
			false,
			false
		);
		return new LinkedHashSet<AbstractCommercialDefinition>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.commercialDefinitions</code> attribute.
	 * @return the commercialDefinitions
	 */
	public Set<AbstractCommercialDefinition> getCommercialDefinitions(final SupplierMarket item)
	{
		return getCommercialDefinitions( getSession().getSessionContext(), item );
	}
	
	public long getCommercialDefinitionsCount(final SessionContext ctx, final SupplierMarket item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			"AbstractCommercialDefinition",
			null
		);
	}
	
	public long getCommercialDefinitionsCount(final SupplierMarket item)
	{
		return getCommercialDefinitionsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.commercialDefinitions</code> attribute. 
	 * @param value the commercialDefinitions
	 */
	public void setCommercialDefinitions(final SessionContext ctx, final SupplierMarket item, final Set<AbstractCommercialDefinition> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPCOMLDEF2SUPMARKETREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.commercialDefinitions</code> attribute. 
	 * @param value the commercialDefinitions
	 */
	public void setCommercialDefinitions(final SupplierMarket item, final Set<AbstractCommercialDefinition> value)
	{
		setCommercialDefinitions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialDefinitions. 
	 * @param value the item to add to commercialDefinitions
	 */
	public void addToCommercialDefinitions(final SessionContext ctx, final SupplierMarket item, final AbstractCommercialDefinition value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPCOMLDEF2SUPMARKETREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialDefinitions. 
	 * @param value the item to add to commercialDefinitions
	 */
	public void addToCommercialDefinitions(final SupplierMarket item, final AbstractCommercialDefinition value)
	{
		addToCommercialDefinitions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialDefinitions. 
	 * @param value the item to remove from commercialDefinitions
	 */
	public void removeFromCommercialDefinitions(final SessionContext ctx, final SupplierMarket item, final AbstractCommercialDefinition value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SUPCOMLDEF2SUPMARKETREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPCOMLDEF2SUPMARKETREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialDefinitions. 
	 * @param value the item to remove from commercialDefinitions
	 */
	public void removeFromCommercialDefinitions(final SupplierMarket item, final AbstractCommercialDefinition value)
	{
		removeFromCommercialDefinitions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.commercialProductInfo</code> attribute.
	 * @return the commercialProductInfo
	 */
	public RailProductInfo getCommercialProductInfo(final SessionContext ctx, final Country item)
	{
		return (RailProductInfo)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.Country.COMMERCIALPRODUCTINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.commercialProductInfo</code> attribute.
	 * @return the commercialProductInfo
	 */
	public RailProductInfo getCommercialProductInfo(final Country item)
	{
		return getCommercialProductInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.commercialProductInfo</code> attribute. 
	 * @param value the commercialProductInfo
	 */
	public void setCommercialProductInfo(final SessionContext ctx, final Country item, final RailProductInfo value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.Country.COMMERCIALPRODUCTINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.commercialProductInfo</code> attribute. 
	 * @param value the commercialProductInfo
	 */
	public void setCommercialProductInfo(final Country item, final RailProductInfo value)
	{
		setCommercialProductInfo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.commercialRecod</code> attribute.
	 * @return the commercialRecod
	 */
	public Collection<AbstractCommercialRecord> getCommercialRecod(final SessionContext ctx, final Product item)
	{
		final List<AbstractCommercialRecord> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			"AbstractCommercialRecord",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.commercialRecod</code> attribute.
	 * @return the commercialRecod
	 */
	public Collection<AbstractCommercialRecord> getCommercialRecod(final Product item)
	{
		return getCommercialRecod( getSession().getSessionContext(), item );
	}
	
	public long getCommercialRecodCount(final SessionContext ctx, final Product item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			"AbstractCommercialRecord",
			null
		);
	}
	
	public long getCommercialRecodCount(final Product item)
	{
		return getCommercialRecodCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.commercialRecod</code> attribute. 
	 * @param value the commercialRecod
	 */
	public void setCommercialRecod(final SessionContext ctx, final Product item, final Collection<AbstractCommercialRecord> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.commercialRecod</code> attribute. 
	 * @param value the commercialRecod
	 */
	public void setCommercialRecod(final Product item, final Collection<AbstractCommercialRecord> value)
	{
		setCommercialRecod( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialRecod. 
	 * @param value the item to add to commercialRecod
	 */
	public void addToCommercialRecod(final SessionContext ctx, final Product item, final AbstractCommercialRecord value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialRecod. 
	 * @param value the item to add to commercialRecod
	 */
	public void addToCommercialRecod(final Product item, final AbstractCommercialRecord value)
	{
		addToCommercialRecod( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialRecod. 
	 * @param value the item to remove from commercialRecod
	 */
	public void removeFromCommercialRecod(final SessionContext ctx, final Product item, final AbstractCommercialRecord value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2PRODUCT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2PRODUCT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialRecod. 
	 * @param value the item to remove from commercialRecod
	 */
	public void removeFromCommercialRecod(final Product item, final AbstractCommercialRecord value)
	{
		removeFromCommercialRecod( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.commercialRecord</code> attribute.
	 * @return the commercialRecord
	 */
	public AbstractCommercialRecord getCommercialRecord(final SessionContext ctx, final Media item)
	{
		return (AbstractCommercialRecord)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.Media.COMMERCIALRECORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.commercialRecord</code> attribute.
	 * @return the commercialRecord
	 */
	public AbstractCommercialRecord getCommercialRecord(final Media item)
	{
		return getCommercialRecord( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.commercialRecord</code> attribute. 
	 * @param value the commercialRecord
	 */
	public void setCommercialRecord(final SessionContext ctx, final Media item, final AbstractCommercialRecord value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.Media.COMMERCIALRECORD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.commercialRecord</code> attribute. 
	 * @param value the commercialRecord
	 */
	public void setCommercialRecord(final Media item, final AbstractCommercialRecord value)
	{
		setCommercialRecord( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.commercialRecord</code> attribute.
	 * @return the commercialRecord
	 */
	public Set<AbstractCommercialRecord> getCommercialRecord(final SessionContext ctx, final TravelogixPolicy item)
	{
		final List<AbstractCommercialRecord> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			"AbstractCommercialRecord",
			null,
			false,
			false
		);
		return new LinkedHashSet<AbstractCommercialRecord>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.commercialRecord</code> attribute.
	 * @return the commercialRecord
	 */
	public Set<AbstractCommercialRecord> getCommercialRecord(final TravelogixPolicy item)
	{
		return getCommercialRecord( getSession().getSessionContext(), item );
	}
	
	public long getCommercialRecordCount(final SessionContext ctx, final TravelogixPolicy item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			"AbstractCommercialRecord",
			null
		);
	}
	
	public long getCommercialRecordCount(final TravelogixPolicy item)
	{
		return getCommercialRecordCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.commercialRecord</code> attribute. 
	 * @param value the commercialRecord
	 */
	public void setCommercialRecord(final SessionContext ctx, final TravelogixPolicy item, final Set<AbstractCommercialRecord> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2TRAVELOGIXPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.commercialRecord</code> attribute. 
	 * @param value the commercialRecord
	 */
	public void setCommercialRecord(final TravelogixPolicy item, final Set<AbstractCommercialRecord> value)
	{
		setCommercialRecord( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialRecord. 
	 * @param value the item to add to commercialRecord
	 */
	public void addToCommercialRecord(final SessionContext ctx, final TravelogixPolicy item, final AbstractCommercialRecord value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2TRAVELOGIXPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialRecord. 
	 * @param value the item to add to commercialRecord
	 */
	public void addToCommercialRecord(final TravelogixPolicy item, final AbstractCommercialRecord value)
	{
		addToCommercialRecord( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialRecord. 
	 * @param value the item to remove from commercialRecord
	 */
	public void removeFromCommercialRecord(final SessionContext ctx, final TravelogixPolicy item, final AbstractCommercialRecord value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.COMMERCIAL2TRAVELOGIXPOLICY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMMERCIAL2TRAVELOGIXPOLICY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialRecord. 
	 * @param value the item to remove from commercialRecord
	 */
	public void removeFromCommercialRecord(final TravelogixPolicy item, final AbstractCommercialRecord value)
	{
		removeFromCommercialRecord( getSession().getSessionContext(), item, value );
	}
	
	public AbstractCommercialDefinition createAbstractCommercialDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.ABSTRACTCOMMERCIALDEFINITION );
			return (AbstractCommercialDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractCommercialDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractCommercialDefinition createAbstractCommercialDefinition(final Map attributeValues)
	{
		return createAbstractCommercialDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoFOCRecord createAccoFOCRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.ACCOFOCRECORD );
			return (AccoFOCRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoFOCRecord : "+e.getMessage(), 0 );
		}
	}
	
	public AccoFOCRecord createAccoFOCRecord(final Map attributeValues)
	{
		return createAccoFOCRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public AccoSupplierAdvanceDefinition createAccoSupplierAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.ACCOSUPPLIERADVANCEDEFINITION );
			return (AccoSupplierAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoSupplierAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AccoSupplierAdvanceDefinition createAccoSupplierAdvanceDefinition(final Map attributeValues)
	{
		return createAccoSupplierAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivitySupplierAdvanceDefinition createActivitySupplierAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.ACTIVITYSUPPLIERADVANCEDEFINITION );
			return (ActivitySupplierAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivitySupplierAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public ActivitySupplierAdvanceDefinition createActivitySupplierAdvanceDefinition(final Map attributeValues)
	{
		return createActivitySupplierAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AirSupplierAdvanceDefinition createAirSupplierAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.AIRSUPPLIERADVANCEDEFINITION );
			return (AirSupplierAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AirSupplierAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AirSupplierAdvanceDefinition createAirSupplierAdvanceDefinition(final Map attributeValues)
	{
		return createAirSupplierAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public AirTravelDestinationConfig createAirTravelDestinationConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.AIRTRAVELDESTINATIONCONFIG );
			return (AirTravelDestinationConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AirTravelDestinationConfig : "+e.getMessage(), 0 );
		}
	}
	
	public AirTravelDestinationConfig createAirTravelDestinationConfig(final Map attributeValues)
	{
		return createAirTravelDestinationConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public BookingClassConfig createBookingClassesConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.BOOKINGCLASSESCONFIG );
			return (BookingClassConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BookingClassesConfig : "+e.getMessage(), 0 );
		}
	}
	
	public BookingClassConfig createBookingClassesConfig(final Map attributeValues)
	{
		return createBookingClassesConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public BusProductInfo createBusProductInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.BUSPRODUCTINFO );
			return (BusProductInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BusProductInfo : "+e.getMessage(), 0 );
		}
	}
	
	public BusProductInfo createBusProductInfo(final Map attributeValues)
	{
		return createBusProductInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientNationalityConfig createClientNationalityConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.CLIENTNATIONALITYCONFIG );
			return (ClientNationalityConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientNationalityConfig : "+e.getMessage(), 0 );
		}
	}
	
	public ClientNationalityConfig createClientNationalityConfig(final Map attributeValues)
	{
		return createClientNationalityConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public CommercialProductInfo createCommercialProductInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.COMMERCIALPRODUCTINFO );
			return (CommercialProductInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommercialProductInfo : "+e.getMessage(), 0 );
		}
	}
	
	public CommercialProductInfo createCommercialProductInfo(final Map attributeValues)
	{
		return createCommercialProductInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public CommercialRateTypeDetail createCommercialRateTypeDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.COMMERCIALRATETYPEDETAIL );
			return (CommercialRateTypeDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommercialRateTypeDetail : "+e.getMessage(), 0 );
		}
	}
	
	public CommercialRateTypeDetail createCommercialRateTypeDetail(final Map attributeValues)
	{
		return createCommercialRateTypeDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public CommercialsValidity createCommercialsValidityConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.COMMERCIALSVALIDITYCONFIG );
			return (CommercialsValidity)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommercialsValidityConfig : "+e.getMessage(), 0 );
		}
	}
	
	public CommercialsValidity createCommercialsValidityConfig(final Map attributeValues)
	{
		return createCommercialsValidityConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public CommercialValueRange createCommercialValueRange(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.COMMERCIALVALUERANGE );
			return (CommercialValueRange)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommercialValueRange : "+e.getMessage(), 0 );
		}
	}
	
	public CommercialValueRange createCommercialValueRange(final Map attributeValues)
	{
		return createCommercialValueRange( getSession().getSessionContext(), attributeValues );
	}
	
	public DealCodeConfig createDealCodeConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.DEALCODECONFIG );
			return (DealCodeConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DealCodeConfig : "+e.getMessage(), 0 );
		}
	}
	
	public DealCodeConfig createDealCodeConfig(final Map attributeValues)
	{
		return createDealCodeConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public DynamicFeeConfig createDynamicFeeConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.DYNAMICFEECONFIG );
			return (DynamicFeeConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DynamicFeeConfig : "+e.getMessage(), 0 );
		}
	}
	
	public DynamicFeeConfig createDynamicFeeConfig(final Map attributeValues)
	{
		return createDynamicFeeConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public FareBasisConfig createFareClassesConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.FARECLASSESCONFIG );
			return (FareBasisConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FareClassesConfig : "+e.getMessage(), 0 );
		}
	}
	
	public FareBasisConfig createFareClassesConfig(final Map attributeValues)
	{
		return createFareClassesConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public FixedCommercialValue createFixedCommercialValue(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.FIXEDCOMMERCIALVALUE );
			return (FixedCommercialValue)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FixedCommercialValue : "+e.getMessage(), 0 );
		}
	}
	
	public FixedCommercialValue createFixedCommercialValue(final Map attributeValues)
	{
		return createFixedCommercialValue( getSession().getSessionContext(), attributeValues );
	}
	
	public FixValues createFixValues(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.FIXVALUES );
			return (FixValues)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FixValues : "+e.getMessage(), 0 );
		}
	}
	
	public FixValues createFixValues(final Map attributeValues)
	{
		return createFixValues( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightFOCRecord createFlightFOCRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.FLIGHTFOCRECORD );
			return (FlightFOCRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightFOCRecord : "+e.getMessage(), 0 );
		}
	}
	
	public FlightFOCRecord createFlightFOCRecord(final Map attributeValues)
	{
		return createFlightFOCRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightNumbersConfig createFlightNumbersConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.FLIGHTNUMBERSCONFIG );
			return (FlightNumbersConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightNumbersConfig : "+e.getMessage(), 0 );
		}
	}
	
	public FlightNumbersConfig createFlightNumbersConfig(final Map attributeValues)
	{
		return createFlightNumbersConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightTimingsConfig createFlightTimingsConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.FLIGHTTIMINGSCONFIG );
			return (FlightTimingsConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightTimingsConfig : "+e.getMessage(), 0 );
		}
	}
	
	public FlightTimingsConfig createFlightTimingsConfig(final Map attributeValues)
	{
		return createFlightTimingsConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public FOCRecord createFOCRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.FOCRECORD );
			return (FOCRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FOCRecord : "+e.getMessage(), 0 );
		}
	}
	
	public FOCRecord createFOCRecord(final Map attributeValues)
	{
		return createFOCRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public GeneralCommercialRecord createGeneralCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.GENERALCOMMERCIALRECORD );
			return (GeneralCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating GeneralCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public GeneralCommercialRecord createGeneralCommercialRecord(final Map attributeValues)
	{
		return createGeneralCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidaySupplierAdvanceDefinition createHolidaySupplierAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.HOLIDAYSUPPLIERADVANCEDEFINITION );
			return (HolidaySupplierAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidaySupplierAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public HolidaySupplierAdvanceDefinition createHolidaySupplierAdvanceDefinition(final Map attributeValues)
	{
		return createHolidaySupplierAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public LookToBookRatio createLookToBookRatio(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.LOOKTOBOOKRATIO );
			return (LookToBookRatio)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating LookToBookRatio : "+e.getMessage(), 0 );
		}
	}
	
	public LookToBookRatio createLookToBookRatio(final Map attributeValues)
	{
		return createLookToBookRatio( getSession().getSessionContext(), attributeValues );
	}
	
	public PaymentAdviceForOtherFee createPaymentAdviceForOtherFee(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.PAYMENTADVICEFOROTHERFEE );
			return (PaymentAdviceForOtherFee)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PaymentAdviceForOtherFee : "+e.getMessage(), 0 );
		}
	}
	
	public PaymentAdviceForOtherFee createPaymentAdviceForOtherFee(final Map attributeValues)
	{
		return createPaymentAdviceForOtherFee( getSession().getSessionContext(), attributeValues );
	}
	
	public PenaltyCriteria createPenaltyCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.PENALTYCRITERIA );
			return (PenaltyCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PenaltyCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public PenaltyCriteria createPenaltyCriteria(final Map attributeValues)
	{
		return createPenaltyCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public RailProductInfo createRailProductInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.RAILPRODUCTINFO );
			return (RailProductInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RailProductInfo : "+e.getMessage(), 0 );
		}
	}
	
	public RailProductInfo createRailProductInfo(final Map attributeValues)
	{
		return createRailProductInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public ReturnOfPayable createReturnOfPayable(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.RETURNOFPAYABLE );
			return (ReturnOfPayable)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ReturnOfPayable : "+e.getMessage(), 0 );
		}
	}
	
	public ReturnOfPayable createReturnOfPayable(final Map attributeValues)
	{
		return createReturnOfPayable( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomCategoryConfig createRoomCategoryConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.ROOMCATEGORYCONFIG );
			return (RoomCategoryConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomCategoryConfig : "+e.getMessage(), 0 );
		}
	}
	
	public RoomCategoryConfig createRoomCategoryConfig(final Map attributeValues)
	{
		return createRoomCategoryConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomTypeConfig createRoomTypeConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.ROOMTYPECONFIG );
			return (RoomTypeConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomTypeConfig : "+e.getMessage(), 0 );
		}
	}
	
	public RoomTypeConfig createRoomTypeConfig(final Map attributeValues)
	{
		return createRoomTypeConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public SignupBonusCriteria createSignupBonusCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SIGNUPBONUSCRITERIA );
			return (SignupBonusCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SignupBonusCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public SignupBonusCriteria createSignupBonusCriteria(final Map attributeValues)
	{
		return createSignupBonusCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public SlabCommercialValue createSlabCommercialValue(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SLABCOMMERCIALVALUE );
			return (SlabCommercialValue)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SlabCommercialValue : "+e.getMessage(), 0 );
		}
	}
	
	public SlabCommercialValue createSlabCommercialValue(final Map attributeValues)
	{
		return createSlabCommercialValue( getSession().getSessionContext(), attributeValues );
	}
	
	public SupCommAdvDefPassengerConfig createSupCommAdvDefPassengerConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPCOMMADVDEFPASSENGERCONFIG );
			return (SupCommAdvDefPassengerConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupCommAdvDefPassengerConfig : "+e.getMessage(), 0 );
		}
	}
	
	public SupCommAdvDefPassengerConfig createSupCommAdvDefPassengerConfig(final Map attributeValues)
	{
		return createSupCommAdvDefPassengerConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierAdvanceCommercial createSupplierAdvanceCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERADVANCECOMMERCIAL );
			return (SupplierAdvanceCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierAdvanceCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierAdvanceCommercial createSupplierAdvanceCommercial(final Map attributeValues)
	{
		return createSupplierAdvanceCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierFOCFeeCommercial createSupplierFOCCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERFOCCOMMERCIAL );
			return (SupplierFOCFeeCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierFOCCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierFOCFeeCommercial createSupplierFOCCommercial(final Map attributeValues)
	{
		return createSupplierFOCCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierFOCCommercialRecord createSupplierFOCCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERFOCCOMMERCIALRECORD );
			return (SupplierFOCCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierFOCCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierFOCCommercialRecord createSupplierFOCCommercialRecord(final Map attributeValues)
	{
		return createSupplierFOCCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierGeneralCommercial createSupplierGeneralCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERGENERALCOMMERCIAL );
			return (SupplierGeneralCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierGeneralCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierGeneralCommercial createSupplierGeneralCommercial(final Map attributeValues)
	{
		return createSupplierGeneralCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierGeneralCommercialRecord createSupplierGeneralCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERGENERALCOMMERCIALRECORD );
			return (SupplierGeneralCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierGeneralCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierGeneralCommercialRecord createSupplierGeneralCommercialRecord(final Map attributeValues)
	{
		return createSupplierGeneralCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierIncentiveOnTopupCommercial createSupplierIncentiveOnTopupCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERINCENTIVEONTOPUPCOMMERCIAL );
			return (SupplierIncentiveOnTopupCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierIncentiveOnTopupCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierIncentiveOnTopupCommercial createSupplierIncentiveOnTopupCommercial(final Map attributeValues)
	{
		return createSupplierIncentiveOnTopupCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierIncentiveOnTopupRecord createSupplierIncentiveOnTopupRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERINCENTIVEONTOPUPRECORD );
			return (SupplierIncentiveOnTopupRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierIncentiveOnTopupRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierIncentiveOnTopupRecord createSupplierIncentiveOnTopupRecord(final Map attributeValues)
	{
		return createSupplierIncentiveOnTopupRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierLookToBookCommercial createSupplierLookToBookCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERLOOKTOBOOKCOMMERCIAL );
			return (SupplierLookToBookCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierLookToBookCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierLookToBookCommercial createSupplierLookToBookCommercial(final Map attributeValues)
	{
		return createSupplierLookToBookCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierLookToBookCommercialRecord createSupplierLookToBookCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERLOOKTOBOOKCOMMERCIALRECORD );
			return (SupplierLookToBookCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierLookToBookCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierLookToBookCommercialRecord createSupplierLookToBookCommercialRecord(final Map attributeValues)
	{
		return createSupplierLookToBookCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierMSFFeeCommercial createSupplierMSFFeeCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERMSFFEECOMMERCIAL );
			return (SupplierMSFFeeCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierMSFFeeCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierMSFFeeCommercial createSupplierMSFFeeCommercial(final Map attributeValues)
	{
		return createSupplierMSFFeeCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierMSFFeeRecord createSupplierMSFFeeRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERMSFFEERECORD );
			return (SupplierMSFFeeRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierMSFFeeRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierMSFFeeRecord createSupplierMSFFeeRecord(final Map attributeValues)
	{
		return createSupplierMSFFeeRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierOtherFeeCommercial createSupplierOtherFeeCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIEROTHERFEECOMMERCIAL );
			return (SupplierOtherFeeCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierOtherFeeCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierOtherFeeCommercial createSupplierOtherFeeCommercial(final Map attributeValues)
	{
		return createSupplierOtherFeeCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierOtherFeeCommercialRecord createSupplierOtherFeeCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIEROTHERFEECOMMERCIALRECORD );
			return (SupplierOtherFeeCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierOtherFeeCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierOtherFeeCommercialRecord createSupplierOtherFeeCommercialRecord(final Map attributeValues)
	{
		return createSupplierOtherFeeCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierPenaltyKickbackCommercial createSupplierPenaltyKickbackCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERPENALTYKICKBACKCOMMERCIAL );
			return (SupplierPenaltyKickbackCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierPenaltyKickbackCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierPenaltyKickbackCommercial createSupplierPenaltyKickbackCommercial(final Map attributeValues)
	{
		return createSupplierPenaltyKickbackCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierPenaltyKickBackCommercialRecord createSupplierPenaltyKickBackCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERPENALTYKICKBACKCOMMERCIALRECORD );
			return (SupplierPenaltyKickBackCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierPenaltyKickBackCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierPenaltyKickBackCommercialRecord createSupplierPenaltyKickBackCommercialRecord(final Map attributeValues)
	{
		return createSupplierPenaltyKickBackCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierRemittanceCommercial createSupplierRemittanceCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERREMITTANCECOMMERCIAL );
			return (SupplierRemittanceCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierRemittanceCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierRemittanceCommercial createSupplierRemittanceCommercial(final Map attributeValues)
	{
		return createSupplierRemittanceCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierRemittanceCommercialRecord createSupplierRemittanceCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERREMITTANCECOMMERCIALRECORD );
			return (SupplierRemittanceCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierRemittanceCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierRemittanceCommercialRecord createSupplierRemittanceCommercialRecord(final Map attributeValues)
	{
		return createSupplierRemittanceCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierSignUpBonusCommercial createSupplierSignUpBonusCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERSIGNUPBONUSCOMMERCIAL );
			return (SupplierSignUpBonusCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierSignUpBonusCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierSignUpBonusCommercial createSupplierSignUpBonusCommercial(final Map attributeValues)
	{
		return createSupplierSignUpBonusCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierSignUpBonusCommercialRecord createSupplierSignUpBonusCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERSIGNUPBONUSCOMMERCIALRECORD );
			return (SupplierSignUpBonusCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierSignUpBonusCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierSignUpBonusCommercialRecord createSupplierSignUpBonusCommercialRecord(final Map attributeValues)
	{
		return createSupplierSignUpBonusCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierStandardCommercial createSupplierStandardCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERSTANDARDCOMMERCIAL );
			return (SupplierStandardCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierStandardCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierStandardCommercial createSupplierStandardCommercial(final Map attributeValues)
	{
		return createSupplierStandardCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierStandardCommercialRecord createSupplierStandardCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERSTANDARDCOMMERCIALRECORD );
			return (SupplierStandardCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierStandardCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierStandardCommercialRecord createSupplierStandardCommercialRecord(final Map attributeValues)
	{
		return createSupplierStandardCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierTerminationFeeCommercial createSupplierTerminationFeeCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERTERMINATIONFEECOMMERCIAL );
			return (SupplierTerminationFeeCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierTerminationFeeCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierTerminationFeeCommercial createSupplierTerminationFeeCommercial(final Map attributeValues)
	{
		return createSupplierTerminationFeeCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierTerminationFeeCommercialRecord createSupplierTerminationFeeCommercialRecord(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.SUPPLIERTERMINATIONFEECOMMERCIALRECORD );
			return (SupplierTerminationFeeCommercialRecord)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierTerminationFeeCommercialRecord : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierTerminationFeeCommercialRecord createSupplierTerminationFeeCommercialRecord(final Map attributeValues)
	{
		return createSupplierTerminationFeeCommercialRecord( getSession().getSessionContext(), attributeValues );
	}
	
	public TopupDetail createTopupDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.TOPUPDETAIL );
			return (TopupDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TopupDetail : "+e.getMessage(), 0 );
		}
	}
	
	public TopupDetail createTopupDetail(final Map attributeValues)
	{
		return createTopupDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportSupplierAdvanceDefinition createTransportSupplierAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.TRANSPORTSUPPLIERADVANCEDEFINITION );
			return (TransportSupplierAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportSupplierAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public TransportSupplierAdvanceDefinition createTransportSupplierAdvanceDefinition(final Map attributeValues)
	{
		return createTransportSupplierAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelDestinationConfig createTravelDestinationConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.TRAVELDESTINATIONCONFIG );
			return (TravelDestinationConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelDestinationConfig : "+e.getMessage(), 0 );
		}
	}
	
	public TravelDestinationConfig createTravelDestinationConfig(final Map attributeValues)
	{
		return createTravelDestinationConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public VehicleConfig createVehicleConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercommercialscoreConstants.TC.VEHICLECONFIG );
			return (VehicleConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating VehicleConfig : "+e.getMessage(), 0 );
		}
	}
	
	public VehicleConfig createVehicleConfig(final Map attributeValues)
	{
		return createVehicleConfig( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentMode.fees</code> attribute.
	 * @return the fees
	 */
	public SupplierMSFFeeRecord getFees(final SessionContext ctx, final PaymentMode item)
	{
		return (SupplierMSFFeeRecord)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.PaymentMode.FEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentMode.fees</code> attribute.
	 * @return the fees
	 */
	public SupplierMSFFeeRecord getFees(final PaymentMode item)
	{
		return getFees( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentMode.fees</code> attribute. 
	 * @param value the fees
	 */
	public void setFees(final SessionContext ctx, final PaymentMode item, final SupplierMSFFeeRecord value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.PaymentMode.FEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentMode.fees</code> attribute. 
	 * @param value the fees
	 */
	public void setFees(final PaymentMode item, final SupplierMSFFeeRecord value)
	{
		setFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardType.fees</code> attribute.
	 * @return the fees
	 */
	public SupplierMSFFeeRecord getFees(final SessionContext ctx, final EnumerationValue item)
	{
		return (SupplierMSFFeeRecord)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.CreditCardType.FEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCardType.fees</code> attribute.
	 * @return the fees
	 */
	public SupplierMSFFeeRecord getFees(final EnumerationValue item)
	{
		return getFees( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardType.fees</code> attribute. 
	 * @param value the fees
	 */
	public void setFees(final SessionContext ctx, final EnumerationValue item, final SupplierMSFFeeRecord value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.CreditCardType.FEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCardType.fees</code> attribute. 
	 * @param value the fees
	 */
	public void setFees(final EnumerationValue item, final SupplierMSFFeeRecord value)
	{
		setFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IATAAgency.gencommercials</code> attribute.
	 * @return the gencommercials
	 */
	public Set<GeneralCommercialRecord> getGencommercials(final SessionContext ctx, final IATAAgency item)
	{
		final List<GeneralCommercialRecord> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			"GeneralCommercialRecord",
			null,
			false,
			false
		);
		return new LinkedHashSet<GeneralCommercialRecord>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>IATAAgency.gencommercials</code> attribute.
	 * @return the gencommercials
	 */
	public Set<GeneralCommercialRecord> getGencommercials(final IATAAgency item)
	{
		return getGencommercials( getSession().getSessionContext(), item );
	}
	
	public long getGencommercialsCount(final SessionContext ctx, final IATAAgency item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			"GeneralCommercialRecord",
			null
		);
	}
	
	public long getGencommercialsCount(final IATAAgency item)
	{
		return getGencommercialsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IATAAgency.gencommercials</code> attribute. 
	 * @param value the gencommercials
	 */
	public void setGencommercials(final SessionContext ctx, final IATAAgency item, final Set<GeneralCommercialRecord> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOM2IATAAGENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>IATAAgency.gencommercials</code> attribute. 
	 * @param value the gencommercials
	 */
	public void setGencommercials(final IATAAgency item, final Set<GeneralCommercialRecord> value)
	{
		setGencommercials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to gencommercials. 
	 * @param value the item to add to gencommercials
	 */
	public void addToGencommercials(final SessionContext ctx, final IATAAgency item, final GeneralCommercialRecord value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOM2IATAAGENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to gencommercials. 
	 * @param value the item to add to gencommercials
	 */
	public void addToGencommercials(final IATAAgency item, final GeneralCommercialRecord value)
	{
		addToGencommercials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from gencommercials. 
	 * @param value the item to remove from gencommercials
	 */
	public void removeFromGencommercials(final SessionContext ctx, final IATAAgency item, final GeneralCommercialRecord value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOM2IATAAGENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from gencommercials. 
	 * @param value the item to remove from gencommercials
	 */
	public void removeFromGencommercials(final IATAAgency item, final GeneralCommercialRecord value)
	{
		removeFromGencommercials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.generalCommercials</code> attribute.
	 * @return the generalCommercials
	 */
	public Set<GeneralCommercialRecord> getGeneralCommercials(final SessionContext ctx, final Principal item)
	{
		final List<GeneralCommercialRecord> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			"GeneralCommercialRecord",
			null,
			false,
			false
		);
		return new LinkedHashSet<GeneralCommercialRecord>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.generalCommercials</code> attribute.
	 * @return the generalCommercials
	 */
	public Set<GeneralCommercialRecord> getGeneralCommercials(final Principal item)
	{
		return getGeneralCommercials( getSession().getSessionContext(), item );
	}
	
	public long getGeneralCommercialsCount(final SessionContext ctx, final Principal item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			"GeneralCommercialRecord",
			null
		);
	}
	
	public long getGeneralCommercialsCount(final Principal item)
	{
		return getGeneralCommercialsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.generalCommercials</code> attribute. 
	 * @param value the generalCommercials
	 */
	public void setGeneralCommercials(final SessionContext ctx, final Principal item, final Set<GeneralCommercialRecord> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(GENERALCOMMERCIAL2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.generalCommercials</code> attribute. 
	 * @param value the generalCommercials
	 */
	public void setGeneralCommercials(final Principal item, final Set<GeneralCommercialRecord> value)
	{
		setGeneralCommercials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to generalCommercials. 
	 * @param value the item to add to generalCommercials
	 */
	public void addToGeneralCommercials(final SessionContext ctx, final Principal item, final GeneralCommercialRecord value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENERALCOMMERCIAL2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to generalCommercials. 
	 * @param value the item to add to generalCommercials
	 */
	public void addToGeneralCommercials(final Principal item, final GeneralCommercialRecord value)
	{
		addToGeneralCommercials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from generalCommercials. 
	 * @param value the item to remove from generalCommercials
	 */
	public void removeFromGeneralCommercials(final SessionContext ctx, final Principal item, final GeneralCommercialRecord value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENERALCOMMERCIAL2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from generalCommercials. 
	 * @param value the item to remove from generalCommercials
	 */
	public void removeFromGeneralCommercials(final Principal item, final GeneralCommercialRecord value)
	{
		removeFromGeneralCommercials( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SuppliercommercialscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategorySubType.otherFees</code> attribute.
	 * @return the otherFees
	 */
	public Collection<SupplierOtherFeeCommercialRecord> getOtherFees(final SessionContext ctx, final ProductCategorySubType item)
	{
		final List<SupplierOtherFeeCommercialRecord> items = item.getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			"SupplierOtherFeeCommercialRecord",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategorySubType.otherFees</code> attribute.
	 * @return the otherFees
	 */
	public Collection<SupplierOtherFeeCommercialRecord> getOtherFees(final ProductCategorySubType item)
	{
		return getOtherFees( getSession().getSessionContext(), item );
	}
	
	public long getOtherFeesCount(final SessionContext ctx, final ProductCategorySubType item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			"SupplierOtherFeeCommercialRecord",
			null
		);
	}
	
	public long getOtherFeesCount(final ProductCategorySubType item)
	{
		return getOtherFeesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategorySubType.otherFees</code> attribute. 
	 * @param value the otherFees
	 */
	public void setOtherFees(final SessionContext ctx, final ProductCategorySubType item, final Collection<SupplierOtherFeeCommercialRecord> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(OTHERFEE2PRODCATSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategorySubType.otherFees</code> attribute. 
	 * @param value the otherFees
	 */
	public void setOtherFees(final ProductCategorySubType item, final Collection<SupplierOtherFeeCommercialRecord> value)
	{
		setOtherFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherFees. 
	 * @param value the item to add to otherFees
	 */
	public void addToOtherFees(final SessionContext ctx, final ProductCategorySubType item, final SupplierOtherFeeCommercialRecord value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(OTHERFEE2PRODCATSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherFees. 
	 * @param value the item to add to otherFees
	 */
	public void addToOtherFees(final ProductCategorySubType item, final SupplierOtherFeeCommercialRecord value)
	{
		addToOtherFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherFees. 
	 * @param value the item to remove from otherFees
	 */
	public void removeFromOtherFees(final SessionContext ctx, final ProductCategorySubType item, final SupplierOtherFeeCommercialRecord value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.OTHERFEE2PRODCATSUBTYPE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(OTHERFEE2PRODCATSUBTYPE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherFees. 
	 * @param value the item to remove from otherFees
	 */
	public void removeFromOtherFees(final ProductCategorySubType item, final SupplierOtherFeeCommercialRecord value)
	{
		removeFromOtherFees( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.paymentAdvice</code> attribute.
	 * @return the paymentAdvice
	 */
	public PaymentAdviceForOtherFee getPaymentAdvice(final SessionContext ctx, final Media item)
	{
		return (PaymentAdviceForOtherFee)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.Media.PAYMENTADVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.paymentAdvice</code> attribute.
	 * @return the paymentAdvice
	 */
	public PaymentAdviceForOtherFee getPaymentAdvice(final Media item)
	{
		return getPaymentAdvice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.paymentAdvice</code> attribute. 
	 * @param value the paymentAdvice
	 */
	public void setPaymentAdvice(final SessionContext ctx, final Media item, final PaymentAdviceForOtherFee value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.Media.PAYMENTADVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.paymentAdvice</code> attribute. 
	 * @param value the paymentAdvice
	 */
	public void setPaymentAdvice(final Media item, final PaymentAdviceForOtherFee value)
	{
		setPaymentAdvice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.paymentAdvice</code> attribute.
	 * @return the paymentAdvice
	 */
	public PaymentAdviceForOtherFee getPaymentAdvice(final SessionContext ctx, final AbstractPaymentDetail item)
	{
		return (PaymentAdviceForOtherFee)item.getProperty( ctx, SuppliercommercialscoreConstants.Attributes.AbstractPaymentDetail.PAYMENTADVICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractPaymentDetail.paymentAdvice</code> attribute.
	 * @return the paymentAdvice
	 */
	public PaymentAdviceForOtherFee getPaymentAdvice(final AbstractPaymentDetail item)
	{
		return getPaymentAdvice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.paymentAdvice</code> attribute. 
	 * @param value the paymentAdvice
	 */
	public void setPaymentAdvice(final SessionContext ctx, final AbstractPaymentDetail item, final PaymentAdviceForOtherFee value)
	{
		item.setProperty(ctx, SuppliercommercialscoreConstants.Attributes.AbstractPaymentDetail.PAYMENTADVICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractPaymentDetail.paymentAdvice</code> attribute. 
	 * @param value the paymentAdvice
	 */
	public void setPaymentAdvice(final AbstractPaymentDetail item, final PaymentAdviceForOtherFee value)
	{
		setPaymentAdvice( getSession().getSessionContext(), item, value );
	}
	
}
