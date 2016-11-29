/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.dealcode.jalo.CorporateDealCodes;
import com.cnk.travelogix.client.config.core.jalo.DocumentHandlingConfigMaster;
import com.cnk.travelogix.client.config.core.jalo.KPIInfo;
import com.cnk.travelogix.client.config.core.jalo.MLMDistribution;
import com.cnk.travelogix.client.config.core.jalo.RoomLevel;
import com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentMasterConfig;
import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig;
import com.cnk.travelogix.client.core.affiliation.jalo.AffiliationInformation;
import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.client.core.clienttype.jalo.TravelogixClientType;
import com.cnk.travelogix.client.core.companyoffer.jalo.BlockOutDate;
import com.cnk.travelogix.client.core.companyoffer.jalo.BookingDateValidity;
import com.cnk.travelogix.client.core.companyoffer.jalo.ClientDetails;
import com.cnk.travelogix.client.core.companyoffer.jalo.CodeDetailsRedemption;
import com.cnk.travelogix.client.core.companyoffer.jalo.CombineOffer;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyBankDetails;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyDetails;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanySlabType;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyTarget;
import com.cnk.travelogix.client.core.companyoffer.jalo.CreditCardLastThreeDigitType;
import com.cnk.travelogix.client.core.companyoffer.jalo.DateRange;
import com.cnk.travelogix.client.core.companyoffer.jalo.DeactivateOffer;
import com.cnk.travelogix.client.core.companyoffer.jalo.DefinedPolicy;
import com.cnk.travelogix.client.core.companyoffer.jalo.FixedCompanyOfferValueType;
import com.cnk.travelogix.client.core.companyoffer.jalo.FreeOrDiscountedOfferType;
import com.cnk.travelogix.client.core.companyoffer.jalo.OfferEligibilityCondition;
import com.cnk.travelogix.client.core.companyoffer.jalo.OfferProduct;
import com.cnk.travelogix.client.core.companyoffer.jalo.Passenger;
import com.cnk.travelogix.client.core.companyoffer.jalo.RedemptionCompanyOffers;
import com.cnk.travelogix.client.core.companyoffer.jalo.Retention;
import com.cnk.travelogix.client.core.companyoffer.jalo.TravelDateValidity;
import com.cnk.travelogix.client.core.companyoffer.jalo.UploadCodeDetails;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.BusinessInformation;
import com.cnk.travelogix.client.core.corporate.jalo.CostCentre;
import com.cnk.travelogix.client.core.corporate.jalo.Designation;
import com.cnk.travelogix.client.core.corporate.jalo.Project;
import com.cnk.travelogix.client.core.corporate.jalo.TravelogixCorporateUnit;
import com.cnk.travelogix.client.core.corporate.policy.jalo.CorporateTravelPolicy;
import com.cnk.travelogix.client.core.jalo.AcquirerInfo;
import com.cnk.travelogix.client.core.jalo.AdvanceApplicability;
import com.cnk.travelogix.client.core.jalo.BookingClientDetail;
import com.cnk.travelogix.client.core.jalo.BookingCriteria;
import com.cnk.travelogix.client.core.jalo.CategoriesAndProductLevelApplicability;
import com.cnk.travelogix.client.core.jalo.ClientPaidPaymentDetail;
import com.cnk.travelogix.client.core.jalo.ClientPaidProductDetail;
import com.cnk.travelogix.client.core.jalo.ClientPaymentOption;
import com.cnk.travelogix.client.core.jalo.ClientTier;
import com.cnk.travelogix.client.core.jalo.ConsortiumMember;
import com.cnk.travelogix.client.core.jalo.CorporateTraveller;
import com.cnk.travelogix.client.core.jalo.FlightNumber;
import com.cnk.travelogix.client.core.jalo.PaidProductRanking;
import com.cnk.travelogix.client.core.jalo.PassiveBookingDetail;
import com.cnk.travelogix.client.core.jalo.RetentionThreshold;
import com.cnk.travelogix.client.core.jalo.RoomLevelApplicability;
import com.cnk.travelogix.client.core.jalo.SupplierRateTypeAndCode;
import com.cnk.travelogix.client.core.jalo.SurchargeLevelApplicability;
import com.cnk.travelogix.client.core.kyc.jalo.KYCInformation;
import com.cnk.travelogix.client.core.kyc.jalo.KYCReqDocument;
import com.cnk.travelogix.client.core.mid.jalo.MerchantIdentificationDetails;
import com.cnk.travelogix.client.core.traveller.general.jalo.EmergencyContact;
import com.cnk.travelogix.client.core.traveller.general.jalo.FriendDetail;
import com.cnk.travelogix.client.core.traveller.general.jalo.LoyalityProgramInformation;
import com.cnk.travelogix.client.core.traveller.general.jalo.PassportDetails;
import com.cnk.travelogix.client.core.traveller.general.jalo.ProfileInformation;
import com.cnk.travelogix.client.core.traveller.general.jalo.VisaDetails;
import com.cnk.travelogix.client.core.traveller.jalo.B2CTravellerProfile;
import com.cnk.travelogix.client.core.traveller.jalo.CorporateTravellerProfile;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.AirlineDetail;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.CarPreference;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.FlightPrefernce;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.HotelPreference;
import com.cnk.travelogix.client.core.traveller.prefernce.jalo.Preference;
import com.cnk.travelogix.client.core.usergroup.jalo.TravelogixUserGroup;
import com.cnk.travelogix.client.masters.core.constants.ClientmastercoreConstants;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.masterdata.core.department.jalo.Department;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.jalo.BankAccountDetail;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.CombinationProduct;
import com.cnk.travelogix.product.common.core.jalo.Interest;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import com.cnk.travelogix.supplier.masterdata.core.bookingconfig.BookingConfiguration;
import de.hybris.platform.b2b.jalo.B2BCustomer;
import de.hybris.platform.b2b.jalo.B2BUserGroup;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LItem;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.security.PrincipalGroup;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>ClientcoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientcoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n LOGINPARAMETERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> B2BCUSTOMER2LOGINPARAMETERSLOGINPARAMETERSHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.LOGINPARAMETERS,
	true,
	"b2bCustomer",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n USERGROUPS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<UserGroup> B2BCUSTOMERTOUSERGROUPUSERGROUPSHANDLER = new OneToManyHandler<UserGroup>(
	CoreConstants.TC.USERGROUP,
	false,
	"b2bCustomer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/** Relation ordering override parameter constants for CMSSite2Principal from ((clientcore))*/
	protected static String CMSSITE2PRINCIPAL_SRC_ORDERED = "relation.CMSSite2Principal.source.ordered";
	protected static String CMSSITE2PRINCIPAL_TGT_ORDERED = "relation.CMSSite2Principal.target.ordered";
	/** Relation disable markmodifed parameter constants for CMSSite2Principal from ((clientcore))*/
	protected static String CMSSITE2PRINCIPAL_MARKMODIFIED = "relation.CMSSite2Principal.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n KPIOPTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<KPIInfo> PRINCIPAL2KPIINFOKPIOPTIONSHANDLER = new OneToManyHandler<KPIInfo>(
	ClientconfigConstants.TC.KPIINFO,
	false,
	"principals",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MLMDISTRIBUTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<MLMDistribution> MLMDISTRIBUTION2PRINCIPALMLMDISTRIBUTIONSHANDLER = new OneToManyHandler<MLMDistribution>(
	ClientconfigConstants.TC.MLMDISTRIBUTION,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PAYMENTOPTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ClientPaymentOption> PRINCIPALTOCLIENTPAYMENTOPTIONPAYMENTOPTIONSHANDLER = new OneToManyHandler<ClientPaymentOption>(
	ClientcoreConstants.TC.CLIENTPAYMENTOPTION,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PARTPAYMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PartPaymentMasterConfig> PRINCIPALTOPARTPAYMENTMASTERCONFIGPARTPAYMENTSHANDLER = new OneToManyHandler<PartPaymentMasterConfig>(
	ClientconfigConstants.TC.PARTPAYMENTMASTERCONFIG,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TIMELIMITS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TimeLimitMasterConfig> PRINCIPALTOTIMELIMITMASTERCONFIGTIMELIMITSHANDLER = new OneToManyHandler<TimeLimitMasterConfig>(
	ClientconfigConstants.TC.TIMELIMITMASTERCONFIG,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DOCUMENTHANDLINGMASTERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DocumentHandlingConfigMaster> PRINCIPALTODOCUMENTHANDLINGCONFIGMASTERDOCUMENTHANDLINGMASTERSHANDLER = new OneToManyHandler<DocumentHandlingConfigMaster>(
	ClientconfigConstants.TC.DOCUMENTHANDLINGCONFIGMASTER,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COMBINATIONPRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CombinationProduct> PRINCIPALTOCOMBINATIONPRODUCTCOMBINATIONPRODUCTSHANDLER = new OneToManyHandler<CombinationProduct>(
	CommonproductcoreConstants.TC.COMBINATIONPRODUCT,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RETENTIONTHRESHOLDS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RetentionThreshold> PRINCIPALTORETENTIONTHRESHOLDRETENTIONTHRESHOLDSHANDLER = new OneToManyHandler<RetentionThreshold>(
	ClientcoreConstants.TC.RETENTIONTHRESHOLD,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PAIDPRODUCTRANKINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PaidProductRanking> PRINCIPALTOPAIDPRODUCTRANKINGPAIDPRODUCTRANKINGSHANDLER = new OneToManyHandler<PaidProductRanking>(
	ClientcoreConstants.TC.PAIDPRODUCTRANKING,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PASSIVEBOOKINGDETAILSFORFLIGHTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PassiveBookingDetail> PRINCIPALTOPASSIVEBOOKINGDETAILPASSIVEBOOKINGDETAILSFORFLIGHTSHANDLER = new OneToManyHandler<PassiveBookingDetail>(
	ClientcoreConstants.TC.PASSIVEBOOKINGDETAIL,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/** Relation ordering override parameter constants for TravelogixClientType2Market from ((clientcore))*/
	protected static String TRAVELOGIXCLIENTTYPE2MARKET_SRC_ORDERED = "relation.TravelogixClientType2Market.source.ordered";
	protected static String TRAVELOGIXCLIENTTYPE2MARKET_TGT_ORDERED = "relation.TravelogixClientType2Market.target.ordered";
	/** Relation disable markmodifed parameter constants for TravelogixClientType2Market from ((clientcore))*/
	protected static String TRAVELOGIXCLIENTTYPE2MARKET_MARKMODIFIED = "relation.TravelogixClientType2Market.markmodified";
	/** Relation ordering override parameter constants for TravelogixClientType2Currency from ((clientcore))*/
	protected static String TRAVELOGIXCLIENTTYPE2CURRENCY_SRC_ORDERED = "relation.TravelogixClientType2Currency.source.ordered";
	protected static String TRAVELOGIXCLIENTTYPE2CURRENCY_TGT_ORDERED = "relation.TravelogixClientType2Currency.target.ordered";
	/** Relation disable markmodifed parameter constants for TravelogixClientType2Currency from ((clientcore))*/
	protected static String TRAVELOGIXCLIENTTYPE2CURRENCY_MARKMODIFIED = "relation.TravelogixClientType2Currency.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n DEFINEDTRAVELOGIXDEFINEDPOLICY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DefinedPolicy> TRAVELOGIXPOLICY2DEFINEDPOLICYDEFINEDTRAVELOGIXDEFINEDPOLICYHANDLER = new OneToManyHandler<DefinedPolicy>(
	ClientcoreConstants.TC.DEFINEDPOLICY,
	false,
	"travelogixPolicyDefinedPolicy",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ROOMLEVELELIGIBILITYCONDITION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RoomLevel> ELIGIBILITYCONDITION2ROOMLEVELROOMLEVELELIGIBILITYCONDITIONHANDLER = new OneToManyHandler<RoomLevel>(
	ClientconfigConstants.TC.ROOMLEVEL,
	false,
	"eligibilityConditionRoomLevel",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("loginEmail", AttributeMode.INITIAL);
		tmp.put("loginPhoneNo", AttributeMode.INITIAL);
		tmp.put("loginValidation", AttributeMode.INITIAL);
		tmp.put("branch", AttributeMode.INITIAL);
		tmp.put("designation", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.b2b.jalo.B2BCustomer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("workFlowStatus", AttributeMode.INITIAL);
		tmp.put("lockedBy", AttributeMode.INITIAL);
		tmp.put("companyMarket", AttributeMode.INITIAL);
		tmp.put("active", AttributeMode.INITIAL);
		tmp.put("effectiveFrom", AttributeMode.INITIAL);
		tmp.put("reason", AttributeMode.INITIAL);
		tmp.put("remarks", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.b2b.jalo.B2BUserGroup", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("remark", AttributeMode.INITIAL);
		tmp.put("pointOfSales", AttributeMode.INITIAL);
		tmp.put("showRateOf", AttributeMode.INITIAL);
		tmp.put("defaultSortOrder", AttributeMode.INITIAL);
		tmp.put("enabledOnlineCancellation", AttributeMode.INITIAL);
		tmp.put("enabledOnlineAmendment", AttributeMode.INITIAL);
		tmp.put("displayOptions", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.security.Principal", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travelogixClientType", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("b2bCustomer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travelogixB2BUnit", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("affiliationInformation", AttributeMode.INITIAL);
		tmp.put("travellerProfile", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travelogixB2BUnit", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.jalo.BankAccountDetail", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travelogixCorporateUnit", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.department.jalo.Department", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travelogixCorporateUnitDoc", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travelogixCorporateUnitGrade", AttributeMode.INITIAL);
		tmp.put("corporateTravelPolicy", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travelogixCorporateUnitBookingInfo", AttributeMode.INITIAL);
		tmp.put("travelogixCorporateUnitEmpInfo", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("corporateTravelPolicy", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("corporateTravelPolicy", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.c2l.jalo.Location", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("corporateTravelPolicy", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.c2l.Country", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travellerProfile", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Address", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("b2cTravellerProfile", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.Interest", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("b2cTravellerProfile", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("flightPrefernce", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.enumeration.EnumerationValue", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("principals", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.config.core.jalo.KPIInfo", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("client", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.config.core.jalo.MLMDistribution", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("bookingsupplier", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.core.supplier.jalo.Supplier", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("inclusion", AttributeMode.INITIAL);
		tmp.put("exclusion", AttributeMode.INITIAL);
		tmp.put("productCompanyOffers", AttributeMode.INITIAL);
		tmp.put("exclProductCompanyOffers", AttributeMode.INITIAL);
		tmp.put("exclProductRedemptionCompanyOffers", AttributeMode.INITIAL);
		tmp.put("productRedemptionCompanyOffers", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("redempCompOfferSuppCred", AttributeMode.INITIAL);
		tmp.put("companyOfferSupplierCredentials", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("companyOfferTravelogixCancePolicy", AttributeMode.INITIAL);
		tmp.put("companyOfferTravelogixAmenPolicy", AttributeMode.INITIAL);
		tmp.put("companyOfferTravelogixPaymPolicy", AttributeMode.INITIAL);
		tmp.put("companyOfferTravelogixBookPolicy", AttributeMode.INITIAL);
		tmp.put("redemptionCompOffers", AttributeMode.INITIAL);
		tmp.put("travelogixB2BUnit", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("eligibilityConditionRoomLevel", AttributeMode.INITIAL);
		tmp.put("freeRoomLevels", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.config.core.jalo.RoomLevel", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("client", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.config.core.partpayment.jalo.PartPaymentMasterConfig", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("client", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("client", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.config.core.jalo.DocumentHandlingConfigMaster", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("client", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.CombinationProduct", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("travelogixB2BUnit", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.config.core.dealcode.jalo.CorporateDealCodes", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("b2bCustomer", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.UserGroup", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.active</code> attribute.
	 * @return the active - Active
	 */
	public Boolean isActive(final SessionContext ctx, final B2BUserGroup item)
	{
		return (Boolean)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BUserGroup.ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.active</code> attribute.
	 * @return the active - Active
	 */
	public Boolean isActive(final B2BUserGroup item)
	{
		return isActive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.active</code> attribute. 
	 * @return the active - Active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx, final B2BUserGroup item)
	{
		Boolean value = isActive( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.active</code> attribute. 
	 * @return the active - Active
	 */
	public boolean isActiveAsPrimitive(final B2BUserGroup item)
	{
		return isActiveAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.active</code> attribute. 
	 * @param value the active - Active
	 */
	public void setActive(final SessionContext ctx, final B2BUserGroup item, final Boolean value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BUserGroup.ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.active</code> attribute. 
	 * @param value the active - Active
	 */
	public void setActive(final B2BUserGroup item, final Boolean value)
	{
		setActive( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.active</code> attribute. 
	 * @param value the active - Active
	 */
	public void setActive(final SessionContext ctx, final B2BUserGroup item, final boolean value)
	{
		setActive( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.active</code> attribute. 
	 * @param value the active - Active
	 */
	public void setActive(final B2BUserGroup item, final boolean value)
	{
		setActive( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.affiliationInformation</code> attribute.
	 * @return the affiliationInformation
	 */
	public AffiliationInformation getAffiliationInformation(final SessionContext ctx, final Media item)
	{
		return (AffiliationInformation)item.getProperty( ctx, ClientcoreConstants.Attributes.Media.AFFILIATIONINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.affiliationInformation</code> attribute.
	 * @return the affiliationInformation
	 */
	public AffiliationInformation getAffiliationInformation(final Media item)
	{
		return getAffiliationInformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.affiliationInformation</code> attribute. 
	 * @param value the affiliationInformation
	 */
	public void setAffiliationInformation(final SessionContext ctx, final Media item, final AffiliationInformation value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Media.AFFILIATIONINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.affiliationInformation</code> attribute. 
	 * @param value the affiliationInformation
	 */
	public void setAffiliationInformation(final Media item, final AffiliationInformation value)
	{
		setAffiliationInformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginParameters.b2bCustomer</code> attribute.
	 * @return the b2bCustomer
	 */
	public B2BCustomer getB2bCustomer(final SessionContext ctx, final EnumerationValue item)
	{
		return (B2BCustomer)item.getProperty( ctx, ClientcoreConstants.Attributes.LoginParameters.B2BCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginParameters.b2bCustomer</code> attribute.
	 * @return the b2bCustomer
	 */
	public B2BCustomer getB2bCustomer(final EnumerationValue item)
	{
		return getB2bCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginParameters.b2bCustomer</code> attribute. 
	 * @param value the b2bCustomer
	 */
	public void setB2bCustomer(final SessionContext ctx, final EnumerationValue item, final B2BCustomer value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.LoginParameters.B2BCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginParameters.b2bCustomer</code> attribute. 
	 * @param value the b2bCustomer
	 */
	public void setB2bCustomer(final EnumerationValue item, final B2BCustomer value)
	{
		setB2bCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.b2bCustomer</code> attribute.
	 * @return the b2bCustomer
	 */
	public B2BCustomer getB2bCustomer(final SessionContext ctx, final UserGroup item)
	{
		return (B2BCustomer)item.getProperty( ctx, ClientcoreConstants.Attributes.UserGroup.B2BCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserGroup.b2bCustomer</code> attribute.
	 * @return the b2bCustomer
	 */
	public B2BCustomer getB2bCustomer(final UserGroup item)
	{
		return getB2bCustomer( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.b2bCustomer</code> attribute. 
	 * @param value the b2bCustomer
	 */
	public void setB2bCustomer(final SessionContext ctx, final UserGroup item, final B2BCustomer value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.UserGroup.B2BCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserGroup.b2bCustomer</code> attribute. 
	 * @param value the b2bCustomer
	 */
	public void setB2bCustomer(final UserGroup item, final B2BCustomer value)
	{
		setB2bCustomer( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interest.b2cTravellerProfile</code> attribute.
	 * @return the b2cTravellerProfile
	 */
	public B2CTravellerProfile getB2cTravellerProfile(final SessionContext ctx, final Interest item)
	{
		return (B2CTravellerProfile)item.getProperty( ctx, ClientcoreConstants.Attributes.Interest.B2CTRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Interest.b2cTravellerProfile</code> attribute.
	 * @return the b2cTravellerProfile
	 */
	public B2CTravellerProfile getB2cTravellerProfile(final Interest item)
	{
		return getB2cTravellerProfile( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interest.b2cTravellerProfile</code> attribute. 
	 * @param value the b2cTravellerProfile
	 */
	public void setB2cTravellerProfile(final SessionContext ctx, final Interest item, final B2CTravellerProfile value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Interest.B2CTRAVELLERPROFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Interest.b2cTravellerProfile</code> attribute. 
	 * @param value the b2cTravellerProfile
	 */
	public void setB2cTravellerProfile(final Interest item, final B2CTravellerProfile value)
	{
		setB2cTravellerProfile( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Identity.b2cTravellerProfile</code> attribute.
	 * @return the b2cTravellerProfile
	 */
	public B2CTravellerProfile getB2cTravellerProfile(final SessionContext ctx, final EnumerationValue item)
	{
		return (B2CTravellerProfile)item.getProperty( ctx, ClientcoreConstants.Attributes.Identity.B2CTRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Identity.b2cTravellerProfile</code> attribute.
	 * @return the b2cTravellerProfile
	 */
	public B2CTravellerProfile getB2cTravellerProfile(final EnumerationValue item)
	{
		return getB2cTravellerProfile( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Identity.b2cTravellerProfile</code> attribute. 
	 * @param value the b2cTravellerProfile
	 */
	public void setB2cTravellerProfile(final SessionContext ctx, final EnumerationValue item, final B2CTravellerProfile value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Identity.B2CTRAVELLERPROFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Identity.b2cTravellerProfile</code> attribute. 
	 * @param value the b2cTravellerProfile
	 */
	public void setB2cTravellerProfile(final EnumerationValue item, final B2CTravellerProfile value)
	{
		setB2cTravellerProfile( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.bookingsupplier</code> attribute.
	 * @return the bookingsupplier
	 */
	public BookingConfiguration getBookingsupplier(final SessionContext ctx, final Supplier item)
	{
		return (BookingConfiguration)item.getProperty( ctx, ClientcoreConstants.Attributes.Supplier.BOOKINGSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.bookingsupplier</code> attribute.
	 * @return the bookingsupplier
	 */
	public BookingConfiguration getBookingsupplier(final Supplier item)
	{
		return getBookingsupplier( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.bookingsupplier</code> attribute. 
	 * @param value the bookingsupplier
	 */
	public void setBookingsupplier(final SessionContext ctx, final Supplier item, final BookingConfiguration value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Supplier.BOOKINGSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.bookingsupplier</code> attribute. 
	 * @param value the bookingsupplier
	 */
	public void setBookingsupplier(final Supplier item, final BookingConfiguration value)
	{
		setBookingsupplier( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.branch</code> attribute.
	 * @return the branch
	 */
	public EnumerationValue getBranch(final SessionContext ctx, final B2BCustomer item)
	{
		return (EnumerationValue)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BCustomer.BRANCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.branch</code> attribute.
	 * @return the branch
	 */
	public EnumerationValue getBranch(final B2BCustomer item)
	{
		return getBranch( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.branch</code> attribute. 
	 * @param value the branch
	 */
	public void setBranch(final SessionContext ctx, final B2BCustomer item, final EnumerationValue value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BCustomer.BRANCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.branch</code> attribute. 
	 * @param value the branch
	 */
	public void setBranch(final B2BCustomer item, final EnumerationValue value)
	{
		setBranch( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx, final MLMDistribution item)
	{
		return (Principal)item.getProperty( ctx, ClientcoreConstants.Attributes.MLMDistribution.CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MLMDistribution.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final MLMDistribution item)
	{
		return getClient( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final MLMDistribution item, final Principal value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.MLMDistribution.CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MLMDistribution.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final MLMDistribution item, final Principal value)
	{
		setClient( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx, final PartPaymentMasterConfig item)
	{
		return (Principal)item.getProperty( ctx, ClientcoreConstants.Attributes.PartPaymentMasterConfig.CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PartPaymentMasterConfig.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final PartPaymentMasterConfig item)
	{
		return getClient( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final PartPaymentMasterConfig item, final Principal value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.PartPaymentMasterConfig.CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PartPaymentMasterConfig.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final PartPaymentMasterConfig item, final Principal value)
	{
		setClient( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx, final TimeLimitMasterConfig item)
	{
		return (Principal)item.getProperty( ctx, ClientcoreConstants.Attributes.TimeLimitMasterConfig.CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final TimeLimitMasterConfig item)
	{
		return getClient( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final TimeLimitMasterConfig item, final Principal value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.TimeLimitMasterConfig.CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final TimeLimitMasterConfig item, final Principal value)
	{
		setClient( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx, final DocumentHandlingConfigMaster item)
	{
		return (Principal)item.getProperty( ctx, ClientcoreConstants.Attributes.DocumentHandlingConfigMaster.CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DocumentHandlingConfigMaster.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final DocumentHandlingConfigMaster item)
	{
		return getClient( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final DocumentHandlingConfigMaster item, final Principal value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.DocumentHandlingConfigMaster.CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DocumentHandlingConfigMaster.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final DocumentHandlingConfigMaster item, final Principal value)
	{
		setClient( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx, final CombinationProduct item)
	{
		return (Principal)item.getProperty( ctx, ClientcoreConstants.Attributes.CombinationProduct.CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombinationProduct.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final CombinationProduct item)
	{
		return getClient( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final CombinationProduct item, final Principal value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.CombinationProduct.CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombinationProduct.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final CombinationProduct item, final Principal value)
	{
		setClient( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.cmsSites</code> attribute.
	 * @return the cmsSites
	 */
	public Collection<CMSSite> getCmsSites(final SessionContext ctx, final Principal item)
	{
		final List<CMSSite> items = item.getLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			"CMSSite",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.cmsSites</code> attribute.
	 * @return the cmsSites
	 */
	public Collection<CMSSite> getCmsSites(final Principal item)
	{
		return getCmsSites( getSession().getSessionContext(), item );
	}
	
	public long getCmsSitesCount(final SessionContext ctx, final Principal item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			"CMSSite",
			null
		);
	}
	
	public long getCmsSitesCount(final Principal item)
	{
		return getCmsSitesCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.cmsSites</code> attribute. 
	 * @param value the cmsSites
	 */
	public void setCmsSites(final SessionContext ctx, final Principal item, final Collection<CMSSite> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CMSSITE2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.cmsSites</code> attribute. 
	 * @param value the cmsSites
	 */
	public void setCmsSites(final Principal item, final Collection<CMSSite> value)
	{
		setCmsSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cmsSites. 
	 * @param value the item to add to cmsSites
	 */
	public void addToCmsSites(final SessionContext ctx, final Principal item, final CMSSite value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CMSSITE2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cmsSites. 
	 * @param value the item to add to cmsSites
	 */
	public void addToCmsSites(final Principal item, final CMSSite value)
	{
		addToCmsSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cmsSites. 
	 * @param value the item to remove from cmsSites
	 */
	public void removeFromCmsSites(final SessionContext ctx, final Principal item, final CMSSite value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CMSSITE2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cmsSites. 
	 * @param value the item to remove from cmsSites
	 */
	public void removeFromCmsSites(final Principal item, final CMSSite value)
	{
		removeFromCmsSites( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.combinationProducts</code> attribute.
	 * @return the combinationProducts
	 */
	public Collection<CombinationProduct> getCombinationProducts(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOCOMBINATIONPRODUCTCOMBINATIONPRODUCTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.combinationProducts</code> attribute.
	 * @return the combinationProducts
	 */
	public Collection<CombinationProduct> getCombinationProducts(final Principal item)
	{
		return getCombinationProducts( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.combinationProducts</code> attribute. 
	 * @param value the combinationProducts
	 */
	public void setCombinationProducts(final SessionContext ctx, final Principal item, final Collection<CombinationProduct> value)
	{
		PRINCIPALTOCOMBINATIONPRODUCTCOMBINATIONPRODUCTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.combinationProducts</code> attribute. 
	 * @param value the combinationProducts
	 */
	public void setCombinationProducts(final Principal item, final Collection<CombinationProduct> value)
	{
		setCombinationProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to combinationProducts. 
	 * @param value the item to add to combinationProducts
	 */
	public void addToCombinationProducts(final SessionContext ctx, final Principal item, final CombinationProduct value)
	{
		PRINCIPALTOCOMBINATIONPRODUCTCOMBINATIONPRODUCTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to combinationProducts. 
	 * @param value the item to add to combinationProducts
	 */
	public void addToCombinationProducts(final Principal item, final CombinationProduct value)
	{
		addToCombinationProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from combinationProducts. 
	 * @param value the item to remove from combinationProducts
	 */
	public void removeFromCombinationProducts(final SessionContext ctx, final Principal item, final CombinationProduct value)
	{
		PRINCIPALTOCOMBINATIONPRODUCTCOMBINATIONPRODUCTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from combinationProducts. 
	 * @param value the item to remove from combinationProducts
	 */
	public void removeFromCombinationProducts(final Principal item, final CombinationProduct value)
	{
		removeFromCombinationProducts( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket(final SessionContext ctx, final B2BUserGroup item)
	{
		return (Market)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BUserGroup.COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket(final B2BUserGroup item)
	{
		return getCompanyMarket( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final SessionContext ctx, final B2BUserGroup item, final Market value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BUserGroup.COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final B2BUserGroup item, final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.companyOfferSupplierCredentials</code> attribute.
	 * @return the companyOfferSupplierCredentials
	 */
	public CompanyOffers getCompanyOfferSupplierCredentials(final SessionContext ctx, final SupplierCredentials item)
	{
		return (CompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.SupplierCredentials.COMPANYOFFERSUPPLIERCREDENTIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.companyOfferSupplierCredentials</code> attribute.
	 * @return the companyOfferSupplierCredentials
	 */
	public CompanyOffers getCompanyOfferSupplierCredentials(final SupplierCredentials item)
	{
		return getCompanyOfferSupplierCredentials( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.companyOfferSupplierCredentials</code> attribute. 
	 * @param value the companyOfferSupplierCredentials
	 */
	public void setCompanyOfferSupplierCredentials(final SessionContext ctx, final SupplierCredentials item, final CompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.SupplierCredentials.COMPANYOFFERSUPPLIERCREDENTIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.companyOfferSupplierCredentials</code> attribute. 
	 * @param value the companyOfferSupplierCredentials
	 */
	public void setCompanyOfferSupplierCredentials(final SupplierCredentials item, final CompanyOffers value)
	{
		setCompanyOfferSupplierCredentials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.companyOfferTravelogixAmenPolicy</code> attribute.
	 * @return the companyOfferTravelogixAmenPolicy
	 */
	public CompanyOffers getCompanyOfferTravelogixAmenPolicy(final SessionContext ctx, final TravelogixPolicy item)
	{
		return (CompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.TravelogixPolicy.COMPANYOFFERTRAVELOGIXAMENPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.companyOfferTravelogixAmenPolicy</code> attribute.
	 * @return the companyOfferTravelogixAmenPolicy
	 */
	public CompanyOffers getCompanyOfferTravelogixAmenPolicy(final TravelogixPolicy item)
	{
		return getCompanyOfferTravelogixAmenPolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.companyOfferTravelogixAmenPolicy</code> attribute. 
	 * @param value the companyOfferTravelogixAmenPolicy
	 */
	public void setCompanyOfferTravelogixAmenPolicy(final SessionContext ctx, final TravelogixPolicy item, final CompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.TravelogixPolicy.COMPANYOFFERTRAVELOGIXAMENPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.companyOfferTravelogixAmenPolicy</code> attribute. 
	 * @param value the companyOfferTravelogixAmenPolicy
	 */
	public void setCompanyOfferTravelogixAmenPolicy(final TravelogixPolicy item, final CompanyOffers value)
	{
		setCompanyOfferTravelogixAmenPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.companyOfferTravelogixBookPolicy</code> attribute.
	 * @return the companyOfferTravelogixBookPolicy
	 */
	public CompanyOffers getCompanyOfferTravelogixBookPolicy(final SessionContext ctx, final TravelogixPolicy item)
	{
		return (CompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.TravelogixPolicy.COMPANYOFFERTRAVELOGIXBOOKPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.companyOfferTravelogixBookPolicy</code> attribute.
	 * @return the companyOfferTravelogixBookPolicy
	 */
	public CompanyOffers getCompanyOfferTravelogixBookPolicy(final TravelogixPolicy item)
	{
		return getCompanyOfferTravelogixBookPolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.companyOfferTravelogixBookPolicy</code> attribute. 
	 * @param value the companyOfferTravelogixBookPolicy
	 */
	public void setCompanyOfferTravelogixBookPolicy(final SessionContext ctx, final TravelogixPolicy item, final CompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.TravelogixPolicy.COMPANYOFFERTRAVELOGIXBOOKPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.companyOfferTravelogixBookPolicy</code> attribute. 
	 * @param value the companyOfferTravelogixBookPolicy
	 */
	public void setCompanyOfferTravelogixBookPolicy(final TravelogixPolicy item, final CompanyOffers value)
	{
		setCompanyOfferTravelogixBookPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.companyOfferTravelogixCancePolicy</code> attribute.
	 * @return the companyOfferTravelogixCancePolicy
	 */
	public CompanyOffers getCompanyOfferTravelogixCancePolicy(final SessionContext ctx, final TravelogixPolicy item)
	{
		return (CompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.TravelogixPolicy.COMPANYOFFERTRAVELOGIXCANCEPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.companyOfferTravelogixCancePolicy</code> attribute.
	 * @return the companyOfferTravelogixCancePolicy
	 */
	public CompanyOffers getCompanyOfferTravelogixCancePolicy(final TravelogixPolicy item)
	{
		return getCompanyOfferTravelogixCancePolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.companyOfferTravelogixCancePolicy</code> attribute. 
	 * @param value the companyOfferTravelogixCancePolicy
	 */
	public void setCompanyOfferTravelogixCancePolicy(final SessionContext ctx, final TravelogixPolicy item, final CompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.TravelogixPolicy.COMPANYOFFERTRAVELOGIXCANCEPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.companyOfferTravelogixCancePolicy</code> attribute. 
	 * @param value the companyOfferTravelogixCancePolicy
	 */
	public void setCompanyOfferTravelogixCancePolicy(final TravelogixPolicy item, final CompanyOffers value)
	{
		setCompanyOfferTravelogixCancePolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.companyOfferTravelogixPaymPolicy</code> attribute.
	 * @return the companyOfferTravelogixPaymPolicy
	 */
	public CompanyOffers getCompanyOfferTravelogixPaymPolicy(final SessionContext ctx, final TravelogixPolicy item)
	{
		return (CompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.TravelogixPolicy.COMPANYOFFERTRAVELOGIXPAYMPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.companyOfferTravelogixPaymPolicy</code> attribute.
	 * @return the companyOfferTravelogixPaymPolicy
	 */
	public CompanyOffers getCompanyOfferTravelogixPaymPolicy(final TravelogixPolicy item)
	{
		return getCompanyOfferTravelogixPaymPolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.companyOfferTravelogixPaymPolicy</code> attribute. 
	 * @param value the companyOfferTravelogixPaymPolicy
	 */
	public void setCompanyOfferTravelogixPaymPolicy(final SessionContext ctx, final TravelogixPolicy item, final CompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.TravelogixPolicy.COMPANYOFFERTRAVELOGIXPAYMPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.companyOfferTravelogixPaymPolicy</code> attribute. 
	 * @param value the companyOfferTravelogixPaymPolicy
	 */
	public void setCompanyOfferTravelogixPaymPolicy(final TravelogixPolicy item, final CompanyOffers value)
	{
		setCompanyOfferTravelogixPaymPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grade.corporateTravelPolicy</code> attribute.
	 * @return the corporateTravelPolicy
	 */
	public CorporateTravelPolicy getCorporateTravelPolicy(final SessionContext ctx, final EnumerationValue item)
	{
		return (CorporateTravelPolicy)item.getProperty( ctx, ClientcoreConstants.Attributes.Grade.CORPORATETRAVELPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grade.corporateTravelPolicy</code> attribute.
	 * @return the corporateTravelPolicy
	 */
	public CorporateTravelPolicy getCorporateTravelPolicy(final EnumerationValue item)
	{
		return getCorporateTravelPolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Grade.corporateTravelPolicy</code> attribute. 
	 * @param value the corporateTravelPolicy
	 */
	public void setCorporateTravelPolicy(final SessionContext ctx, final EnumerationValue item, final CorporateTravelPolicy value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Grade.CORPORATETRAVELPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Grade.corporateTravelPolicy</code> attribute. 
	 * @param value the corporateTravelPolicy
	 */
	public void setCorporateTravelPolicy(final EnumerationValue item, final CorporateTravelPolicy value)
	{
		setCorporateTravelPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.corporateTravelPolicy</code> attribute.
	 * @return the corporateTravelPolicy
	 */
	public CorporateTravelPolicy getCorporateTravelPolicy(final SessionContext ctx, final VersionDetail item)
	{
		return (CorporateTravelPolicy)item.getProperty( ctx, ClientcoreConstants.Attributes.VersionDetail.CORPORATETRAVELPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.corporateTravelPolicy</code> attribute.
	 * @return the corporateTravelPolicy
	 */
	public CorporateTravelPolicy getCorporateTravelPolicy(final VersionDetail item)
	{
		return getCorporateTravelPolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.corporateTravelPolicy</code> attribute. 
	 * @param value the corporateTravelPolicy
	 */
	public void setCorporateTravelPolicy(final SessionContext ctx, final VersionDetail item, final CorporateTravelPolicy value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.VersionDetail.CORPORATETRAVELPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.corporateTravelPolicy</code> attribute. 
	 * @param value the corporateTravelPolicy
	 */
	public void setCorporateTravelPolicy(final VersionDetail item, final CorporateTravelPolicy value)
	{
		setCorporateTravelPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.corporateTravelPolicy</code> attribute.
	 * @return the corporateTravelPolicy
	 */
	public CorporateTravelPolicy getCorporateTravelPolicy(final SessionContext ctx, final Location item)
	{
		return (CorporateTravelPolicy)item.getProperty( ctx, ClientcoreConstants.Attributes.Location.CORPORATETRAVELPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Location.corporateTravelPolicy</code> attribute.
	 * @return the corporateTravelPolicy
	 */
	public CorporateTravelPolicy getCorporateTravelPolicy(final Location item)
	{
		return getCorporateTravelPolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.corporateTravelPolicy</code> attribute. 
	 * @param value the corporateTravelPolicy
	 */
	public void setCorporateTravelPolicy(final SessionContext ctx, final Location item, final CorporateTravelPolicy value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Location.CORPORATETRAVELPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Location.corporateTravelPolicy</code> attribute. 
	 * @param value the corporateTravelPolicy
	 */
	public void setCorporateTravelPolicy(final Location item, final CorporateTravelPolicy value)
	{
		setCorporateTravelPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.corporateTravelPolicy</code> attribute.
	 * @return the corporateTravelPolicy
	 */
	public CorporateTravelPolicy getCorporateTravelPolicy(final SessionContext ctx, final Country item)
	{
		return (CorporateTravelPolicy)item.getProperty( ctx, ClientcoreConstants.Attributes.Country.CORPORATETRAVELPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.corporateTravelPolicy</code> attribute.
	 * @return the corporateTravelPolicy
	 */
	public CorporateTravelPolicy getCorporateTravelPolicy(final Country item)
	{
		return getCorporateTravelPolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.corporateTravelPolicy</code> attribute. 
	 * @param value the corporateTravelPolicy
	 */
	public void setCorporateTravelPolicy(final SessionContext ctx, final Country item, final CorporateTravelPolicy value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Country.CORPORATETRAVELPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.corporateTravelPolicy</code> attribute. 
	 * @param value the corporateTravelPolicy
	 */
	public void setCorporateTravelPolicy(final Country item, final CorporateTravelPolicy value)
	{
		setCorporateTravelPolicy( getSession().getSessionContext(), item, value );
	}
	
	public AcquirerInfo createAcquirerInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.ACQUIRERINFO );
			return (AcquirerInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AcquirerInfo : "+e.getMessage(), 0 );
		}
	}
	
	public AcquirerInfo createAcquirerInfo(final Map attributeValues)
	{
		return createAcquirerInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public AdvanceApplicability createAdvanceApplicability(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.ADVANCEAPPLICABILITY );
			return (AdvanceApplicability)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AdvanceApplicability : "+e.getMessage(), 0 );
		}
	}
	
	public AdvanceApplicability createAdvanceApplicability(final Map attributeValues)
	{
		return createAdvanceApplicability( getSession().getSessionContext(), attributeValues );
	}
	
	public AffiliationInformation createAffiliationInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.AFFILIATIONINFORMATION );
			return (AffiliationInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AffiliationInformation : "+e.getMessage(), 0 );
		}
	}
	
	public AffiliationInformation createAffiliationInformation(final Map attributeValues)
	{
		return createAffiliationInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public AirlineDetail createAirlineDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.AIRLINEDETAIL );
			return (AirlineDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AirlineDetail : "+e.getMessage(), 0 );
		}
	}
	
	public AirlineDetail createAirlineDetail(final Map attributeValues)
	{
		return createAirlineDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public B2CTravellerProfile createB2CTravellerProfile(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.B2CTRAVELLERPROFILE );
			return (B2CTravellerProfile)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating B2CTravellerProfile : "+e.getMessage(), 0 );
		}
	}
	
	public B2CTravellerProfile createB2CTravellerProfile(final Map attributeValues)
	{
		return createB2CTravellerProfile( getSession().getSessionContext(), attributeValues );
	}
	
	public BlockOutDate createBlockOutDate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.BLOCKOUTDATE );
			return (BlockOutDate)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BlockOutDate : "+e.getMessage(), 0 );
		}
	}
	
	public BlockOutDate createBlockOutDate(final Map attributeValues)
	{
		return createBlockOutDate( getSession().getSessionContext(), attributeValues );
	}
	
	public BookingClientDetail createBookingClientDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.BOOKINGCLIENTDETAIL );
			return (BookingClientDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BookingClientDetail : "+e.getMessage(), 0 );
		}
	}
	
	public BookingClientDetail createBookingClientDetail(final Map attributeValues)
	{
		return createBookingClientDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public BookingConfiguration createBookingConfiguration(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.BOOKINGCONFIGURATION );
			return (BookingConfiguration)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BookingConfiguration : "+e.getMessage(), 0 );
		}
	}
	
	public BookingConfiguration createBookingConfiguration(final Map attributeValues)
	{
		return createBookingConfiguration( getSession().getSessionContext(), attributeValues );
	}
	
	public BookingCriteria createBookingCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.BOOKINGCRITERIA );
			return (BookingCriteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BookingCriteria : "+e.getMessage(), 0 );
		}
	}
	
	public BookingCriteria createBookingCriteria(final Map attributeValues)
	{
		return createBookingCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public BookingDateValidity createBookingDateValidity(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.BOOKINGDATEVALIDITY );
			return (BookingDateValidity)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BookingDateValidity : "+e.getMessage(), 0 );
		}
	}
	
	public BookingDateValidity createBookingDateValidity(final Map attributeValues)
	{
		return createBookingDateValidity( getSession().getSessionContext(), attributeValues );
	}
	
	public BusinessInformation createBusinessInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.BUSINESSINFORMATION );
			return (BusinessInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BusinessInformation : "+e.getMessage(), 0 );
		}
	}
	
	public BusinessInformation createBusinessInformation(final Map attributeValues)
	{
		return createBusinessInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public CarPreference createCarPreference(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CARPREFERENCE );
			return (CarPreference)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CarPreference : "+e.getMessage(), 0 );
		}
	}
	
	public CarPreference createCarPreference(final Map attributeValues)
	{
		return createCarPreference( getSession().getSessionContext(), attributeValues );
	}
	
	public CategoriesAndProductLevelApplicability createCategoriesAndProductLevelApplicability(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CATEGORIESANDPRODUCTLEVELAPPLICABILITY );
			return (CategoriesAndProductLevelApplicability)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CategoriesAndProductLevelApplicability : "+e.getMessage(), 0 );
		}
	}
	
	public CategoriesAndProductLevelApplicability createCategoriesAndProductLevelApplicability(final Map attributeValues)
	{
		return createCategoriesAndProductLevelApplicability( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientDetails createClientDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CLIENTDETAILS );
			return (ClientDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ClientDetails createClientDetails(final Map attributeValues)
	{
		return createClientDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientPaidPaymentDetail createClientPaidPaymentDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CLIENTPAIDPAYMENTDETAIL );
			return (ClientPaidPaymentDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientPaidPaymentDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ClientPaidPaymentDetail createClientPaidPaymentDetail(final Map attributeValues)
	{
		return createClientPaidPaymentDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientPaidProductDetail createClientPaidProductDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CLIENTPAIDPRODUCTDETAIL );
			return (ClientPaidProductDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientPaidProductDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ClientPaidProductDetail createClientPaidProductDetail(final Map attributeValues)
	{
		return createClientPaidProductDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientPaymentOption createClientPaymentOption(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CLIENTPAYMENTOPTION );
			return (ClientPaymentOption)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientPaymentOption : "+e.getMessage(), 0 );
		}
	}
	
	public ClientPaymentOption createClientPaymentOption(final Map attributeValues)
	{
		return createClientPaymentOption( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientTier createClientTier(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CLIENTTIER );
			return (ClientTier)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientTier : "+e.getMessage(), 0 );
		}
	}
	
	public ClientTier createClientTier(final Map attributeValues)
	{
		return createClientTier( getSession().getSessionContext(), attributeValues );
	}
	
	public CodeDetailsRedemption createCodeDetailsRedemption(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CODEDETAILSREDEMPTION );
			return (CodeDetailsRedemption)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CodeDetailsRedemption : "+e.getMessage(), 0 );
		}
	}
	
	public CodeDetailsRedemption createCodeDetailsRedemption(final Map attributeValues)
	{
		return createCodeDetailsRedemption( getSession().getSessionContext(), attributeValues );
	}
	
	public CombineOffer createCombineOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.COMBINEOFFER );
			return (CombineOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CombineOffer : "+e.getMessage(), 0 );
		}
	}
	
	public CombineOffer createCombineOffer(final Map attributeValues)
	{
		return createCombineOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyBankDetails createCompanyBankDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.COMPANYBANKDETAILS );
			return (CompanyBankDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyBankDetails : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyBankDetails createCompanyBankDetails(final Map attributeValues)
	{
		return createCompanyBankDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyDetails createCompanyDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.COMPANYDETAILS );
			return (CompanyDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyDetails : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyDetails createCompanyDetails(final Map attributeValues)
	{
		return createCompanyDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyOffers createCompanyOffers(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.COMPANYOFFERS );
			return (CompanyOffers)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyOffers : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyOffers createCompanyOffers(final Map attributeValues)
	{
		return createCompanyOffers( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanySlabType createCompanySlabType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.COMPANYSLABTYPE );
			return (CompanySlabType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanySlabType : "+e.getMessage(), 0 );
		}
	}
	
	public CompanySlabType createCompanySlabType(final Map attributeValues)
	{
		return createCompanySlabType( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyTarget createCompanyTarget(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.COMPANYTARGET );
			return (CompanyTarget)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyTarget : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyTarget createCompanyTarget(final Map attributeValues)
	{
		return createCompanyTarget( getSession().getSessionContext(), attributeValues );
	}
	
	public ConsortiumMember createConsortiumMember(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CONSORTIUMMEMBER );
			return (ConsortiumMember)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ConsortiumMember : "+e.getMessage(), 0 );
		}
	}
	
	public ConsortiumMember createConsortiumMember(final Map attributeValues)
	{
		return createConsortiumMember( getSession().getSessionContext(), attributeValues );
	}
	
	public CorporateTraveller createCorporateTraveller(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CORPORATETRAVELLER );
			return (CorporateTraveller)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CorporateTraveller : "+e.getMessage(), 0 );
		}
	}
	
	public CorporateTraveller createCorporateTraveller(final Map attributeValues)
	{
		return createCorporateTraveller( getSession().getSessionContext(), attributeValues );
	}
	
	public CorporateTravellerProfile createCorporateTravellerProfile(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CORPORATETRAVELLERPROFILE );
			return (CorporateTravellerProfile)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CorporateTravellerProfile : "+e.getMessage(), 0 );
		}
	}
	
	public CorporateTravellerProfile createCorporateTravellerProfile(final Map attributeValues)
	{
		return createCorporateTravellerProfile( getSession().getSessionContext(), attributeValues );
	}
	
	public CorporateTravelPolicy createCorporateTravelPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CORPORATETRAVELPOLICY );
			return (CorporateTravelPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CorporateTravelPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public CorporateTravelPolicy createCorporateTravelPolicy(final Map attributeValues)
	{
		return createCorporateTravelPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public CostCentre createCostCentre(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.COSTCENTRE );
			return (CostCentre)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CostCentre : "+e.getMessage(), 0 );
		}
	}
	
	public CostCentre createCostCentre(final Map attributeValues)
	{
		return createCostCentre( getSession().getSessionContext(), attributeValues );
	}
	
	public CreditCardLastThreeDigitType createCreditCardLastThreeDigitType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.CREDITCARDLASTTHREEDIGITTYPE );
			return (CreditCardLastThreeDigitType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CreditCardLastThreeDigitType : "+e.getMessage(), 0 );
		}
	}
	
	public CreditCardLastThreeDigitType createCreditCardLastThreeDigitType(final Map attributeValues)
	{
		return createCreditCardLastThreeDigitType( getSession().getSessionContext(), attributeValues );
	}
	
	public DateRange createDateRange(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.DATERANGE );
			return (DateRange)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DateRange : "+e.getMessage(), 0 );
		}
	}
	
	public DateRange createDateRange(final Map attributeValues)
	{
		return createDateRange( getSession().getSessionContext(), attributeValues );
	}
	
	public DeactivateOffer createDeactivateOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.DEACTIVATEOFFER );
			return (DeactivateOffer)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DeactivateOffer : "+e.getMessage(), 0 );
		}
	}
	
	public DeactivateOffer createDeactivateOffer(final Map attributeValues)
	{
		return createDeactivateOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public DefinedPolicy createDefinedPolicy(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.DEFINEDPOLICY );
			return (DefinedPolicy)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DefinedPolicy : "+e.getMessage(), 0 );
		}
	}
	
	public DefinedPolicy createDefinedPolicy(final Map attributeValues)
	{
		return createDefinedPolicy( getSession().getSessionContext(), attributeValues );
	}
	
	public Designation createDesignation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.DESIGNATION );
			return (Designation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Designation : "+e.getMessage(), 0 );
		}
	}
	
	public Designation createDesignation(final Map attributeValues)
	{
		return createDesignation( getSession().getSessionContext(), attributeValues );
	}
	
	public EmergencyContact createEmergencyContact(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.EMERGENCYCONTACT );
			return (EmergencyContact)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating EmergencyContact : "+e.getMessage(), 0 );
		}
	}
	
	public EmergencyContact createEmergencyContact(final Map attributeValues)
	{
		return createEmergencyContact( getSession().getSessionContext(), attributeValues );
	}
	
	public FixedCompanyOfferValueType createFixedCompanyOfferValueType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.FIXEDCOMPANYOFFERVALUETYPE );
			return (FixedCompanyOfferValueType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FixedCompanyOfferValueType : "+e.getMessage(), 0 );
		}
	}
	
	public FixedCompanyOfferValueType createFixedCompanyOfferValueType(final Map attributeValues)
	{
		return createFixedCompanyOfferValueType( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightNumber createFlightNumber(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.FLIGHTNUMBER );
			return (FlightNumber)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightNumber : "+e.getMessage(), 0 );
		}
	}
	
	public FlightNumber createFlightNumber(final Map attributeValues)
	{
		return createFlightNumber( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightPrefernce createFlightPrefernce(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.FLIGHTPREFERNCE );
			return (FlightPrefernce)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightPrefernce : "+e.getMessage(), 0 );
		}
	}
	
	public FlightPrefernce createFlightPrefernce(final Map attributeValues)
	{
		return createFlightPrefernce( getSession().getSessionContext(), attributeValues );
	}
	
	public FreeOrDiscountedOfferType createFreeOrDiscountedOfferType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.FREEORDISCOUNTEDOFFERTYPE );
			return (FreeOrDiscountedOfferType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FreeOrDiscountedOfferType : "+e.getMessage(), 0 );
		}
	}
	
	public FreeOrDiscountedOfferType createFreeOrDiscountedOfferType(final Map attributeValues)
	{
		return createFreeOrDiscountedOfferType( getSession().getSessionContext(), attributeValues );
	}
	
	public FriendDetail createFriendDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.FRIENDDETAIL );
			return (FriendDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FriendDetail : "+e.getMessage(), 0 );
		}
	}
	
	public FriendDetail createFriendDetail(final Map attributeValues)
	{
		return createFriendDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public HotelPreference createHotelPreference(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.HOTELPREFERENCE );
			return (HotelPreference)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HotelPreference : "+e.getMessage(), 0 );
		}
	}
	
	public HotelPreference createHotelPreference(final Map attributeValues)
	{
		return createHotelPreference( getSession().getSessionContext(), attributeValues );
	}
	
	public KYCInformation createKycInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.KYCINFORMATION );
			return (KYCInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating KycInformation : "+e.getMessage(), 0 );
		}
	}
	
	public KYCInformation createKycInformation(final Map attributeValues)
	{
		return createKycInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public KYCReqDocument createKYCReqDocument(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.KYCREQDOCUMENT );
			return (KYCReqDocument)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating KYCReqDocument : "+e.getMessage(), 0 );
		}
	}
	
	public KYCReqDocument createKYCReqDocument(final Map attributeValues)
	{
		return createKYCReqDocument( getSession().getSessionContext(), attributeValues );
	}
	
	public LoyalityProgramInformation createLoyalityProgramInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.LOYALITYPROGRAMINFORMATION );
			return (LoyalityProgramInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating LoyalityProgramInformation : "+e.getMessage(), 0 );
		}
	}
	
	public LoyalityProgramInformation createLoyalityProgramInformation(final Map attributeValues)
	{
		return createLoyalityProgramInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public MerchantIdentificationDetails createMerchantIdentificationDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.MERCHANTIDENTIFICATIONDETAILS );
			return (MerchantIdentificationDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MerchantIdentificationDetails : "+e.getMessage(), 0 );
		}
	}
	
	public MerchantIdentificationDetails createMerchantIdentificationDetails(final Map attributeValues)
	{
		return createMerchantIdentificationDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public OfferEligibilityCondition createOfferEligibilityCondition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.OFFERELIGIBILITYCONDITION );
			return (OfferEligibilityCondition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OfferEligibilityCondition : "+e.getMessage(), 0 );
		}
	}
	
	public OfferEligibilityCondition createOfferEligibilityCondition(final Map attributeValues)
	{
		return createOfferEligibilityCondition( getSession().getSessionContext(), attributeValues );
	}
	
	public OfferProduct createOfferProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.OFFERPRODUCT );
			return (OfferProduct)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OfferProduct : "+e.getMessage(), 0 );
		}
	}
	
	public OfferProduct createOfferProduct(final Map attributeValues)
	{
		return createOfferProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public PaidProductRanking createPaidProductRanking(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.PAIDPRODUCTRANKING );
			return (PaidProductRanking)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PaidProductRanking : "+e.getMessage(), 0 );
		}
	}
	
	public PaidProductRanking createPaidProductRanking(final Map attributeValues)
	{
		return createPaidProductRanking( getSession().getSessionContext(), attributeValues );
	}
	
	public Passenger createPassenger(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.PASSENGER );
			return (Passenger)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Passenger : "+e.getMessage(), 0 );
		}
	}
	
	public Passenger createPassenger(final Map attributeValues)
	{
		return createPassenger( getSession().getSessionContext(), attributeValues );
	}
	
	public PassiveBookingDetail createPassiveBookingDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.PASSIVEBOOKINGDETAIL );
			return (PassiveBookingDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PassiveBookingDetail : "+e.getMessage(), 0 );
		}
	}
	
	public PassiveBookingDetail createPassiveBookingDetail(final Map attributeValues)
	{
		return createPassiveBookingDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public PassportDetails createPassportDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.PASSPORTDETAILS );
			return (PassportDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PassportDetails : "+e.getMessage(), 0 );
		}
	}
	
	public PassportDetails createPassportDetails(final Map attributeValues)
	{
		return createPassportDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public Preference createPreference(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.PREFERENCE );
			return (Preference)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Preference : "+e.getMessage(), 0 );
		}
	}
	
	public Preference createPreference(final Map attributeValues)
	{
		return createPreference( getSession().getSessionContext(), attributeValues );
	}
	
	public ProfileInformation createProfileInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.PROFILEINFORMATION );
			return (ProfileInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ProfileInformation : "+e.getMessage(), 0 );
		}
	}
	
	public ProfileInformation createProfileInformation(final Map attributeValues)
	{
		return createProfileInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public Project createProject(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.PROJECT );
			return (Project)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Project : "+e.getMessage(), 0 );
		}
	}
	
	public Project createProject(final Map attributeValues)
	{
		return createProject( getSession().getSessionContext(), attributeValues );
	}
	
	public RedemptionCompanyOffers createRedemptionCompanyOffers(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.REDEMPTIONCOMPANYOFFERS );
			return (RedemptionCompanyOffers)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RedemptionCompanyOffers : "+e.getMessage(), 0 );
		}
	}
	
	public RedemptionCompanyOffers createRedemptionCompanyOffers(final Map attributeValues)
	{
		return createRedemptionCompanyOffers( getSession().getSessionContext(), attributeValues );
	}
	
	public Retention createRetention(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.RETENTION );
			return (Retention)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Retention : "+e.getMessage(), 0 );
		}
	}
	
	public Retention createRetention(final Map attributeValues)
	{
		return createRetention( getSession().getSessionContext(), attributeValues );
	}
	
	public RetentionThreshold createRetentionThreshold(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.RETENTIONTHRESHOLD );
			return (RetentionThreshold)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RetentionThreshold : "+e.getMessage(), 0 );
		}
	}
	
	public RetentionThreshold createRetentionThreshold(final Map attributeValues)
	{
		return createRetentionThreshold( getSession().getSessionContext(), attributeValues );
	}
	
	public RoomLevelApplicability createRoomLevelApplicability(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.ROOMLEVELAPPLICABILITY );
			return (RoomLevelApplicability)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RoomLevelApplicability : "+e.getMessage(), 0 );
		}
	}
	
	public RoomLevelApplicability createRoomLevelApplicability(final Map attributeValues)
	{
		return createRoomLevelApplicability( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierRateTypeAndCode createSupplierRateTypeAndCode(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.SUPPLIERRATETYPEANDCODE );
			return (SupplierRateTypeAndCode)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierRateTypeAndCode : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierRateTypeAndCode createSupplierRateTypeAndCode(final Map attributeValues)
	{
		return createSupplierRateTypeAndCode( getSession().getSessionContext(), attributeValues );
	}
	
	public SurchargeLevelApplicability createSurchargeLevelApplicability(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.SURCHARGELEVELAPPLICABILITY );
			return (SurchargeLevelApplicability)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SurchargeLevelApplicability : "+e.getMessage(), 0 );
		}
	}
	
	public SurchargeLevelApplicability createSurchargeLevelApplicability(final Map attributeValues)
	{
		return createSurchargeLevelApplicability( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelDateValidity createTravelDateValidity(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.TRAVELDATEVALIDITY );
			return (TravelDateValidity)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelDateValidity : "+e.getMessage(), 0 );
		}
	}
	
	public TravelDateValidity createTravelDateValidity(final Map attributeValues)
	{
		return createTravelDateValidity( getSession().getSessionContext(), attributeValues );
	}
	
	public ProfileInformation createTravellerFamilyDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.TRAVELLERFAMILYDETAILS );
			return (ProfileInformation)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravellerFamilyDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ProfileInformation createTravellerFamilyDetails(final Map attributeValues)
	{
		return createTravellerFamilyDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public TravellerProfile createTravellerProfile(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.TRAVELLERPROFILE );
			return (TravellerProfile)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravellerProfile : "+e.getMessage(), 0 );
		}
	}
	
	public TravellerProfile createTravellerProfile(final Map attributeValues)
	{
		return createTravellerProfile( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelogixB2BUnit createTravelogixB2BUnit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.TRAVELOGIXB2BUNIT );
			return (TravelogixB2BUnit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelogixB2BUnit : "+e.getMessage(), 0 );
		}
	}
	
	public TravelogixB2BUnit createTravelogixB2BUnit(final Map attributeValues)
	{
		return createTravelogixB2BUnit( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelogixClientType createTravelogixClientType(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.TRAVELOGIXCLIENTTYPE );
			return (TravelogixClientType)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelogixClientType : "+e.getMessage(), 0 );
		}
	}
	
	public TravelogixClientType createTravelogixClientType(final Map attributeValues)
	{
		return createTravelogixClientType( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelogixCorporateUnit createTravelogixCorporateUnit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.TRAVELOGIXCORPORATEUNIT );
			return (TravelogixCorporateUnit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelogixCorporateUnit : "+e.getMessage(), 0 );
		}
	}
	
	public TravelogixCorporateUnit createTravelogixCorporateUnit(final Map attributeValues)
	{
		return createTravelogixCorporateUnit( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelogixUserGroup createTravelogixUserGroup(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.TRAVELOGIXUSERGROUP );
			return (TravelogixUserGroup)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelogixUserGroup : "+e.getMessage(), 0 );
		}
	}
	
	public TravelogixUserGroup createTravelogixUserGroup(final Map attributeValues)
	{
		return createTravelogixUserGroup( getSession().getSessionContext(), attributeValues );
	}
	
	public UploadCodeDetails createUploadCodeDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.UPLOADCODEDETAILS );
			return (UploadCodeDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating UploadCodeDetails : "+e.getMessage(), 0 );
		}
	}
	
	public UploadCodeDetails createUploadCodeDetails(final Map attributeValues)
	{
		return createUploadCodeDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public VisaDetails createVisaDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcoreConstants.TC.VISADETAILS );
			return (VisaDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating VisaDetails : "+e.getMessage(), 0 );
		}
	}
	
	public VisaDetails createVisaDetails(final Map attributeValues)
	{
		return createVisaDetails( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.defaultSortOrder</code> attribute.
	 * @return the defaultSortOrder
	 */
	public EnumerationValue getDefaultSortOrder(final SessionContext ctx, final Principal item)
	{
		return (EnumerationValue)item.getProperty( ctx, ClientcoreConstants.Attributes.Principal.DEFAULTSORTORDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.defaultSortOrder</code> attribute.
	 * @return the defaultSortOrder
	 */
	public EnumerationValue getDefaultSortOrder(final Principal item)
	{
		return getDefaultSortOrder( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.defaultSortOrder</code> attribute. 
	 * @param value the defaultSortOrder
	 */
	public void setDefaultSortOrder(final SessionContext ctx, final Principal item, final EnumerationValue value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Principal.DEFAULTSORTORDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.defaultSortOrder</code> attribute. 
	 * @param value the defaultSortOrder
	 */
	public void setDefaultSortOrder(final Principal item, final EnumerationValue value)
	{
		setDefaultSortOrder( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.definedTravelogixDefinedPolicy</code> attribute.
	 * @return the definedTravelogixDefinedPolicy
	 */
	public Collection<DefinedPolicy> getDefinedTravelogixDefinedPolicy(final SessionContext ctx, final TravelogixPolicy item)
	{
		return TRAVELOGIXPOLICY2DEFINEDPOLICYDEFINEDTRAVELOGIXDEFINEDPOLICYHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.definedTravelogixDefinedPolicy</code> attribute.
	 * @return the definedTravelogixDefinedPolicy
	 */
	public Collection<DefinedPolicy> getDefinedTravelogixDefinedPolicy(final TravelogixPolicy item)
	{
		return getDefinedTravelogixDefinedPolicy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.definedTravelogixDefinedPolicy</code> attribute. 
	 * @param value the definedTravelogixDefinedPolicy
	 */
	public void setDefinedTravelogixDefinedPolicy(final SessionContext ctx, final TravelogixPolicy item, final Collection<DefinedPolicy> value)
	{
		TRAVELOGIXPOLICY2DEFINEDPOLICYDEFINEDTRAVELOGIXDEFINEDPOLICYHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.definedTravelogixDefinedPolicy</code> attribute. 
	 * @param value the definedTravelogixDefinedPolicy
	 */
	public void setDefinedTravelogixDefinedPolicy(final TravelogixPolicy item, final Collection<DefinedPolicy> value)
	{
		setDefinedTravelogixDefinedPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to definedTravelogixDefinedPolicy. 
	 * @param value the item to add to definedTravelogixDefinedPolicy
	 */
	public void addToDefinedTravelogixDefinedPolicy(final SessionContext ctx, final TravelogixPolicy item, final DefinedPolicy value)
	{
		TRAVELOGIXPOLICY2DEFINEDPOLICYDEFINEDTRAVELOGIXDEFINEDPOLICYHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to definedTravelogixDefinedPolicy. 
	 * @param value the item to add to definedTravelogixDefinedPolicy
	 */
	public void addToDefinedTravelogixDefinedPolicy(final TravelogixPolicy item, final DefinedPolicy value)
	{
		addToDefinedTravelogixDefinedPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from definedTravelogixDefinedPolicy. 
	 * @param value the item to remove from definedTravelogixDefinedPolicy
	 */
	public void removeFromDefinedTravelogixDefinedPolicy(final SessionContext ctx, final TravelogixPolicy item, final DefinedPolicy value)
	{
		TRAVELOGIXPOLICY2DEFINEDPOLICYDEFINEDTRAVELOGIXDEFINEDPOLICYHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from definedTravelogixDefinedPolicy. 
	 * @param value the item to remove from definedTravelogixDefinedPolicy
	 */
	public void removeFromDefinedTravelogixDefinedPolicy(final TravelogixPolicy item, final DefinedPolicy value)
	{
		removeFromDefinedTravelogixDefinedPolicy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation(final SessionContext ctx, final B2BCustomer item)
	{
		return (String)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BCustomer.DESIGNATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation(final B2BCustomer item)
	{
		return getDesignation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final SessionContext ctx, final B2BCustomer item, final String value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BCustomer.DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final B2BCustomer item, final String value)
	{
		setDesignation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.displayOptions</code> attribute.
	 * @return the displayOptions
	 */
	public Collection<EnumerationValue> getDisplayOptions(final SessionContext ctx, final Principal item)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)item.getProperty( ctx, ClientcoreConstants.Attributes.Principal.DISPLAYOPTIONS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.displayOptions</code> attribute.
	 * @return the displayOptions
	 */
	public Collection<EnumerationValue> getDisplayOptions(final Principal item)
	{
		return getDisplayOptions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.displayOptions</code> attribute. 
	 * @param value the displayOptions
	 */
	public void setDisplayOptions(final SessionContext ctx, final Principal item, final Collection<EnumerationValue> value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Principal.DISPLAYOPTIONS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.displayOptions</code> attribute. 
	 * @param value the displayOptions
	 */
	public void setDisplayOptions(final Principal item, final Collection<EnumerationValue> value)
	{
		setDisplayOptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.documentHandlingMasters</code> attribute.
	 * @return the documentHandlingMasters
	 */
	public Collection<DocumentHandlingConfigMaster> getDocumentHandlingMasters(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTODOCUMENTHANDLINGCONFIGMASTERDOCUMENTHANDLINGMASTERSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.documentHandlingMasters</code> attribute.
	 * @return the documentHandlingMasters
	 */
	public Collection<DocumentHandlingConfigMaster> getDocumentHandlingMasters(final Principal item)
	{
		return getDocumentHandlingMasters( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.documentHandlingMasters</code> attribute. 
	 * @param value the documentHandlingMasters
	 */
	public void setDocumentHandlingMasters(final SessionContext ctx, final Principal item, final Collection<DocumentHandlingConfigMaster> value)
	{
		PRINCIPALTODOCUMENTHANDLINGCONFIGMASTERDOCUMENTHANDLINGMASTERSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.documentHandlingMasters</code> attribute. 
	 * @param value the documentHandlingMasters
	 */
	public void setDocumentHandlingMasters(final Principal item, final Collection<DocumentHandlingConfigMaster> value)
	{
		setDocumentHandlingMasters( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to documentHandlingMasters. 
	 * @param value the item to add to documentHandlingMasters
	 */
	public void addToDocumentHandlingMasters(final SessionContext ctx, final Principal item, final DocumentHandlingConfigMaster value)
	{
		PRINCIPALTODOCUMENTHANDLINGCONFIGMASTERDOCUMENTHANDLINGMASTERSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to documentHandlingMasters. 
	 * @param value the item to add to documentHandlingMasters
	 */
	public void addToDocumentHandlingMasters(final Principal item, final DocumentHandlingConfigMaster value)
	{
		addToDocumentHandlingMasters( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from documentHandlingMasters. 
	 * @param value the item to remove from documentHandlingMasters
	 */
	public void removeFromDocumentHandlingMasters(final SessionContext ctx, final Principal item, final DocumentHandlingConfigMaster value)
	{
		PRINCIPALTODOCUMENTHANDLINGCONFIGMASTERDOCUMENTHANDLINGMASTERSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from documentHandlingMasters. 
	 * @param value the item to remove from documentHandlingMasters
	 */
	public void removeFromDocumentHandlingMasters(final Principal item, final DocumentHandlingConfigMaster value)
	{
		removeFromDocumentHandlingMasters( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective From
	 */
	public Date getEffectiveFrom(final SessionContext ctx, final B2BUserGroup item)
	{
		return (Date)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BUserGroup.EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective From
	 */
	public Date getEffectiveFrom(final B2BUserGroup item)
	{
		return getEffectiveFrom( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective From
	 */
	public void setEffectiveFrom(final SessionContext ctx, final B2BUserGroup item, final Date value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BUserGroup.EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective From
	 */
	public void setEffectiveFrom(final B2BUserGroup item, final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevel.eligibilityConditionRoomLevel</code> attribute.
	 * @return the eligibilityConditionRoomLevel
	 */
	public EnumerationValue getEligibilityConditionRoomLevel(final SessionContext ctx, final RoomLevel item)
	{
		return (EnumerationValue)item.getProperty( ctx, ClientcoreConstants.Attributes.RoomLevel.ELIGIBILITYCONDITIONROOMLEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevel.eligibilityConditionRoomLevel</code> attribute.
	 * @return the eligibilityConditionRoomLevel
	 */
	public EnumerationValue getEligibilityConditionRoomLevel(final RoomLevel item)
	{
		return getEligibilityConditionRoomLevel( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevel.eligibilityConditionRoomLevel</code> attribute. 
	 * @param value the eligibilityConditionRoomLevel
	 */
	public void setEligibilityConditionRoomLevel(final SessionContext ctx, final RoomLevel item, final EnumerationValue value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.RoomLevel.ELIGIBILITYCONDITIONROOMLEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevel.eligibilityConditionRoomLevel</code> attribute. 
	 * @param value the eligibilityConditionRoomLevel
	 */
	public void setEligibilityConditionRoomLevel(final RoomLevel item, final EnumerationValue value)
	{
		setEligibilityConditionRoomLevel( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.enabledOnlineAmendment</code> attribute.
	 * @return the enabledOnlineAmendment
	 */
	public Boolean isEnabledOnlineAmendment(final SessionContext ctx, final Principal item)
	{
		return (Boolean)item.getProperty( ctx, ClientcoreConstants.Attributes.Principal.ENABLEDONLINEAMENDMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.enabledOnlineAmendment</code> attribute.
	 * @return the enabledOnlineAmendment
	 */
	public Boolean isEnabledOnlineAmendment(final Principal item)
	{
		return isEnabledOnlineAmendment( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.enabledOnlineAmendment</code> attribute. 
	 * @return the enabledOnlineAmendment
	 */
	public boolean isEnabledOnlineAmendmentAsPrimitive(final SessionContext ctx, final Principal item)
	{
		Boolean value = isEnabledOnlineAmendment( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.enabledOnlineAmendment</code> attribute. 
	 * @return the enabledOnlineAmendment
	 */
	public boolean isEnabledOnlineAmendmentAsPrimitive(final Principal item)
	{
		return isEnabledOnlineAmendmentAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.enabledOnlineAmendment</code> attribute. 
	 * @param value the enabledOnlineAmendment
	 */
	public void setEnabledOnlineAmendment(final SessionContext ctx, final Principal item, final Boolean value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Principal.ENABLEDONLINEAMENDMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.enabledOnlineAmendment</code> attribute. 
	 * @param value the enabledOnlineAmendment
	 */
	public void setEnabledOnlineAmendment(final Principal item, final Boolean value)
	{
		setEnabledOnlineAmendment( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.enabledOnlineAmendment</code> attribute. 
	 * @param value the enabledOnlineAmendment
	 */
	public void setEnabledOnlineAmendment(final SessionContext ctx, final Principal item, final boolean value)
	{
		setEnabledOnlineAmendment( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.enabledOnlineAmendment</code> attribute. 
	 * @param value the enabledOnlineAmendment
	 */
	public void setEnabledOnlineAmendment(final Principal item, final boolean value)
	{
		setEnabledOnlineAmendment( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.enabledOnlineCancellation</code> attribute.
	 * @return the enabledOnlineCancellation
	 */
	public Boolean isEnabledOnlineCancellation(final SessionContext ctx, final Principal item)
	{
		return (Boolean)item.getProperty( ctx, ClientcoreConstants.Attributes.Principal.ENABLEDONLINECANCELLATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.enabledOnlineCancellation</code> attribute.
	 * @return the enabledOnlineCancellation
	 */
	public Boolean isEnabledOnlineCancellation(final Principal item)
	{
		return isEnabledOnlineCancellation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.enabledOnlineCancellation</code> attribute. 
	 * @return the enabledOnlineCancellation
	 */
	public boolean isEnabledOnlineCancellationAsPrimitive(final SessionContext ctx, final Principal item)
	{
		Boolean value = isEnabledOnlineCancellation( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.enabledOnlineCancellation</code> attribute. 
	 * @return the enabledOnlineCancellation
	 */
	public boolean isEnabledOnlineCancellationAsPrimitive(final Principal item)
	{
		return isEnabledOnlineCancellationAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.enabledOnlineCancellation</code> attribute. 
	 * @param value the enabledOnlineCancellation
	 */
	public void setEnabledOnlineCancellation(final SessionContext ctx, final Principal item, final Boolean value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Principal.ENABLEDONLINECANCELLATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.enabledOnlineCancellation</code> attribute. 
	 * @param value the enabledOnlineCancellation
	 */
	public void setEnabledOnlineCancellation(final Principal item, final Boolean value)
	{
		setEnabledOnlineCancellation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.enabledOnlineCancellation</code> attribute. 
	 * @param value the enabledOnlineCancellation
	 */
	public void setEnabledOnlineCancellation(final SessionContext ctx, final Principal item, final boolean value)
	{
		setEnabledOnlineCancellation( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.enabledOnlineCancellation</code> attribute. 
	 * @param value the enabledOnlineCancellation
	 */
	public void setEnabledOnlineCancellation(final Principal item, final boolean value)
	{
		setEnabledOnlineCancellation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.exclProductCompanyOffers</code> attribute.
	 * @return the exclProductCompanyOffers
	 */
	public CompanyOffers getExclProductCompanyOffers(final SessionContext ctx, final Product item)
	{
		return (CompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.Product.EXCLPRODUCTCOMPANYOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.exclProductCompanyOffers</code> attribute.
	 * @return the exclProductCompanyOffers
	 */
	public CompanyOffers getExclProductCompanyOffers(final Product item)
	{
		return getExclProductCompanyOffers( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.exclProductCompanyOffers</code> attribute. 
	 * @param value the exclProductCompanyOffers
	 */
	public void setExclProductCompanyOffers(final SessionContext ctx, final Product item, final CompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Product.EXCLPRODUCTCOMPANYOFFERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.exclProductCompanyOffers</code> attribute. 
	 * @param value the exclProductCompanyOffers
	 */
	public void setExclProductCompanyOffers(final Product item, final CompanyOffers value)
	{
		setExclProductCompanyOffers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.exclProductRedemptionCompanyOffers</code> attribute.
	 * @return the exclProductRedemptionCompanyOffers
	 */
	public RedemptionCompanyOffers getExclProductRedemptionCompanyOffers(final SessionContext ctx, final Product item)
	{
		return (RedemptionCompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.Product.EXCLPRODUCTREDEMPTIONCOMPANYOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.exclProductRedemptionCompanyOffers</code> attribute.
	 * @return the exclProductRedemptionCompanyOffers
	 */
	public RedemptionCompanyOffers getExclProductRedemptionCompanyOffers(final Product item)
	{
		return getExclProductRedemptionCompanyOffers( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.exclProductRedemptionCompanyOffers</code> attribute. 
	 * @param value the exclProductRedemptionCompanyOffers
	 */
	public void setExclProductRedemptionCompanyOffers(final SessionContext ctx, final Product item, final RedemptionCompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Product.EXCLPRODUCTREDEMPTIONCOMPANYOFFERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.exclProductRedemptionCompanyOffers</code> attribute. 
	 * @param value the exclProductRedemptionCompanyOffers
	 */
	public void setExclProductRedemptionCompanyOffers(final Product item, final RedemptionCompanyOffers value)
	{
		setExclProductRedemptionCompanyOffers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.exclusion</code> attribute.
	 * @return the exclusion
	 */
	public BookingConfiguration getExclusion(final SessionContext ctx, final Product item)
	{
		return (BookingConfiguration)item.getProperty( ctx, ClientcoreConstants.Attributes.Product.EXCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.exclusion</code> attribute.
	 * @return the exclusion
	 */
	public BookingConfiguration getExclusion(final Product item)
	{
		return getExclusion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.exclusion</code> attribute. 
	 * @param value the exclusion
	 */
	public void setExclusion(final SessionContext ctx, final Product item, final BookingConfiguration value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Product.EXCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.exclusion</code> attribute. 
	 * @param value the exclusion
	 */
	public void setExclusion(final Product item, final BookingConfiguration value)
	{
		setExclusion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpecialRequest.flightPrefernce</code> attribute.
	 * @return the flightPrefernce
	 */
	public FlightPrefernce getFlightPrefernce(final SessionContext ctx, final EnumerationValue item)
	{
		return (FlightPrefernce)item.getProperty( ctx, ClientcoreConstants.Attributes.SpecialRequest.FLIGHTPREFERNCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SpecialRequest.flightPrefernce</code> attribute.
	 * @return the flightPrefernce
	 */
	public FlightPrefernce getFlightPrefernce(final EnumerationValue item)
	{
		return getFlightPrefernce( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpecialRequest.flightPrefernce</code> attribute. 
	 * @param value the flightPrefernce
	 */
	public void setFlightPrefernce(final SessionContext ctx, final EnumerationValue item, final FlightPrefernce value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.SpecialRequest.FLIGHTPREFERNCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SpecialRequest.flightPrefernce</code> attribute. 
	 * @param value the flightPrefernce
	 */
	public void setFlightPrefernce(final EnumerationValue item, final FlightPrefernce value)
	{
		setFlightPrefernce( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevel.freeRoomLevels</code> attribute.
	 * @return the freeRoomLevels
	 */
	public FreeOrDiscountedOfferType getFreeRoomLevels(final SessionContext ctx, final RoomLevel item)
	{
		return (FreeOrDiscountedOfferType)item.getProperty( ctx, ClientcoreConstants.Attributes.RoomLevel.FREEROOMLEVELS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevel.freeRoomLevels</code> attribute.
	 * @return the freeRoomLevels
	 */
	public FreeOrDiscountedOfferType getFreeRoomLevels(final RoomLevel item)
	{
		return getFreeRoomLevels( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevel.freeRoomLevels</code> attribute. 
	 * @param value the freeRoomLevels
	 */
	public void setFreeRoomLevels(final SessionContext ctx, final RoomLevel item, final FreeOrDiscountedOfferType value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.RoomLevel.FREEROOMLEVELS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevel.freeRoomLevels</code> attribute. 
	 * @param value the freeRoomLevels
	 */
	public void setFreeRoomLevels(final RoomLevel item, final FreeOrDiscountedOfferType value)
	{
		setFreeRoomLevels( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return ClientcoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public BookingConfiguration getInclusion(final SessionContext ctx, final Product item)
	{
		return (BookingConfiguration)item.getProperty( ctx, ClientcoreConstants.Attributes.Product.INCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public BookingConfiguration getInclusion(final Product item)
	{
		return getInclusion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final Product item, final BookingConfiguration value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Product.INCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final Product item, final BookingConfiguration value)
	{
		setInclusion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.kpiOptions</code> attribute.
	 * @return the kpiOptions
	 */
	public Collection<KPIInfo> getKpiOptions(final SessionContext ctx, final Principal item)
	{
		return PRINCIPAL2KPIINFOKPIOPTIONSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.kpiOptions</code> attribute.
	 * @return the kpiOptions
	 */
	public Collection<KPIInfo> getKpiOptions(final Principal item)
	{
		return getKpiOptions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.kpiOptions</code> attribute. 
	 * @param value the kpiOptions
	 */
	public void setKpiOptions(final SessionContext ctx, final Principal item, final Collection<KPIInfo> value)
	{
		PRINCIPAL2KPIINFOKPIOPTIONSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.kpiOptions</code> attribute. 
	 * @param value the kpiOptions
	 */
	public void setKpiOptions(final Principal item, final Collection<KPIInfo> value)
	{
		setKpiOptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kpiOptions. 
	 * @param value the item to add to kpiOptions
	 */
	public void addToKpiOptions(final SessionContext ctx, final Principal item, final KPIInfo value)
	{
		PRINCIPAL2KPIINFOKPIOPTIONSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kpiOptions. 
	 * @param value the item to add to kpiOptions
	 */
	public void addToKpiOptions(final Principal item, final KPIInfo value)
	{
		addToKpiOptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kpiOptions. 
	 * @param value the item to remove from kpiOptions
	 */
	public void removeFromKpiOptions(final SessionContext ctx, final Principal item, final KPIInfo value)
	{
		PRINCIPAL2KPIINFOKPIOPTIONSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kpiOptions. 
	 * @param value the item to remove from kpiOptions
	 */
	public void removeFromKpiOptions(final Principal item, final KPIInfo value)
	{
		removeFromKpiOptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.lockedBy</code> attribute.
	 * @return the lockedBy - The User Who Changed the status.
	 */
	public Employee getLockedBy(final SessionContext ctx, final B2BUserGroup item)
	{
		return (Employee)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BUserGroup.LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.lockedBy</code> attribute.
	 * @return the lockedBy - The User Who Changed the status.
	 */
	public Employee getLockedBy(final B2BUserGroup item)
	{
		return getLockedBy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.lockedBy</code> attribute. 
	 * @param value the lockedBy - The User Who Changed the status.
	 */
	public void setLockedBy(final SessionContext ctx, final B2BUserGroup item, final Employee value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BUserGroup.LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.lockedBy</code> attribute. 
	 * @param value the lockedBy - The User Who Changed the status.
	 */
	public void setLockedBy(final B2BUserGroup item, final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.loginEmail</code> attribute.
	 * @return the loginEmail
	 */
	public String getLoginEmail(final SessionContext ctx, final B2BCustomer item)
	{
		return (String)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BCustomer.LOGINEMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.loginEmail</code> attribute.
	 * @return the loginEmail
	 */
	public String getLoginEmail(final B2BCustomer item)
	{
		return getLoginEmail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.loginEmail</code> attribute. 
	 * @param value the loginEmail
	 */
	public void setLoginEmail(final SessionContext ctx, final B2BCustomer item, final String value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BCustomer.LOGINEMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.loginEmail</code> attribute. 
	 * @param value the loginEmail
	 */
	public void setLoginEmail(final B2BCustomer item, final String value)
	{
		setLoginEmail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.loginParameters</code> attribute.
	 * @return the loginParameters
	 */
	public Set<EnumerationValue> getLoginParameters(final SessionContext ctx, final B2BCustomer item)
	{
		return (Set<EnumerationValue>)B2BCUSTOMER2LOGINPARAMETERSLOGINPARAMETERSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.loginParameters</code> attribute.
	 * @return the loginParameters
	 */
	public Set<EnumerationValue> getLoginParameters(final B2BCustomer item)
	{
		return getLoginParameters( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.loginParameters</code> attribute. 
	 * @param value the loginParameters
	 */
	public void setLoginParameters(final SessionContext ctx, final B2BCustomer item, final Set<EnumerationValue> value)
	{
		B2BCUSTOMER2LOGINPARAMETERSLOGINPARAMETERSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.loginParameters</code> attribute. 
	 * @param value the loginParameters
	 */
	public void setLoginParameters(final B2BCustomer item, final Set<EnumerationValue> value)
	{
		setLoginParameters( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to loginParameters. 
	 * @param value the item to add to loginParameters
	 */
	public void addToLoginParameters(final SessionContext ctx, final B2BCustomer item, final EnumerationValue value)
	{
		B2BCUSTOMER2LOGINPARAMETERSLOGINPARAMETERSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to loginParameters. 
	 * @param value the item to add to loginParameters
	 */
	public void addToLoginParameters(final B2BCustomer item, final EnumerationValue value)
	{
		addToLoginParameters( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from loginParameters. 
	 * @param value the item to remove from loginParameters
	 */
	public void removeFromLoginParameters(final SessionContext ctx, final B2BCustomer item, final EnumerationValue value)
	{
		B2BCUSTOMER2LOGINPARAMETERSLOGINPARAMETERSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from loginParameters. 
	 * @param value the item to remove from loginParameters
	 */
	public void removeFromLoginParameters(final B2BCustomer item, final EnumerationValue value)
	{
		removeFromLoginParameters( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.loginPhoneNo</code> attribute.
	 * @return the loginPhoneNo
	 */
	public String getLoginPhoneNo(final SessionContext ctx, final B2BCustomer item)
	{
		return (String)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BCustomer.LOGINPHONENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.loginPhoneNo</code> attribute.
	 * @return the loginPhoneNo
	 */
	public String getLoginPhoneNo(final B2BCustomer item)
	{
		return getLoginPhoneNo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.loginPhoneNo</code> attribute. 
	 * @param value the loginPhoneNo
	 */
	public void setLoginPhoneNo(final SessionContext ctx, final B2BCustomer item, final String value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BCustomer.LOGINPHONENO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.loginPhoneNo</code> attribute. 
	 * @param value the loginPhoneNo
	 */
	public void setLoginPhoneNo(final B2BCustomer item, final String value)
	{
		setLoginPhoneNo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.loginValidation</code> attribute.
	 * @return the loginValidation
	 */
	public EnumerationValue getLoginValidation(final SessionContext ctx, final B2BCustomer item)
	{
		return (EnumerationValue)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BCustomer.LOGINVALIDATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.loginValidation</code> attribute.
	 * @return the loginValidation
	 */
	public EnumerationValue getLoginValidation(final B2BCustomer item)
	{
		return getLoginValidation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.loginValidation</code> attribute. 
	 * @param value the loginValidation
	 */
	public void setLoginValidation(final SessionContext ctx, final B2BCustomer item, final EnumerationValue value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BCustomer.LOGINVALIDATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.loginValidation</code> attribute. 
	 * @param value the loginValidation
	 */
	public void setLoginValidation(final B2BCustomer item, final EnumerationValue value)
	{
		setLoginValidation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.mlmDistributions</code> attribute.
	 * @return the mlmDistributions
	 */
	public Collection<MLMDistribution> getMlmDistributions(final SessionContext ctx, final Principal item)
	{
		return MLMDISTRIBUTION2PRINCIPALMLMDISTRIBUTIONSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.mlmDistributions</code> attribute.
	 * @return the mlmDistributions
	 */
	public Collection<MLMDistribution> getMlmDistributions(final Principal item)
	{
		return getMlmDistributions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.mlmDistributions</code> attribute. 
	 * @param value the mlmDistributions
	 */
	public void setMlmDistributions(final SessionContext ctx, final Principal item, final Collection<MLMDistribution> value)
	{
		MLMDISTRIBUTION2PRINCIPALMLMDISTRIBUTIONSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.mlmDistributions</code> attribute. 
	 * @param value the mlmDistributions
	 */
	public void setMlmDistributions(final Principal item, final Collection<MLMDistribution> value)
	{
		setMlmDistributions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mlmDistributions. 
	 * @param value the item to add to mlmDistributions
	 */
	public void addToMlmDistributions(final SessionContext ctx, final Principal item, final MLMDistribution value)
	{
		MLMDISTRIBUTION2PRINCIPALMLMDISTRIBUTIONSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to mlmDistributions. 
	 * @param value the item to add to mlmDistributions
	 */
	public void addToMlmDistributions(final Principal item, final MLMDistribution value)
	{
		addToMlmDistributions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mlmDistributions. 
	 * @param value the item to remove from mlmDistributions
	 */
	public void removeFromMlmDistributions(final SessionContext ctx, final Principal item, final MLMDistribution value)
	{
		MLMDISTRIBUTION2PRINCIPALMLMDISTRIBUTIONSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from mlmDistributions. 
	 * @param value the item to remove from mlmDistributions
	 */
	public void removeFromMlmDistributions(final Principal item, final MLMDistribution value)
	{
		removeFromMlmDistributions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.paidProductRankings</code> attribute.
	 * @return the paidProductRankings
	 */
	public Collection<PaidProductRanking> getPaidProductRankings(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOPAIDPRODUCTRANKINGPAIDPRODUCTRANKINGSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.paidProductRankings</code> attribute.
	 * @return the paidProductRankings
	 */
	public Collection<PaidProductRanking> getPaidProductRankings(final Principal item)
	{
		return getPaidProductRankings( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.paidProductRankings</code> attribute. 
	 * @param value the paidProductRankings
	 */
	public void setPaidProductRankings(final SessionContext ctx, final Principal item, final Collection<PaidProductRanking> value)
	{
		PRINCIPALTOPAIDPRODUCTRANKINGPAIDPRODUCTRANKINGSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.paidProductRankings</code> attribute. 
	 * @param value the paidProductRankings
	 */
	public void setPaidProductRankings(final Principal item, final Collection<PaidProductRanking> value)
	{
		setPaidProductRankings( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paidProductRankings. 
	 * @param value the item to add to paidProductRankings
	 */
	public void addToPaidProductRankings(final SessionContext ctx, final Principal item, final PaidProductRanking value)
	{
		PRINCIPALTOPAIDPRODUCTRANKINGPAIDPRODUCTRANKINGSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paidProductRankings. 
	 * @param value the item to add to paidProductRankings
	 */
	public void addToPaidProductRankings(final Principal item, final PaidProductRanking value)
	{
		addToPaidProductRankings( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paidProductRankings. 
	 * @param value the item to remove from paidProductRankings
	 */
	public void removeFromPaidProductRankings(final SessionContext ctx, final Principal item, final PaidProductRanking value)
	{
		PRINCIPALTOPAIDPRODUCTRANKINGPAIDPRODUCTRANKINGSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paidProductRankings. 
	 * @param value the item to remove from paidProductRankings
	 */
	public void removeFromPaidProductRankings(final Principal item, final PaidProductRanking value)
	{
		removeFromPaidProductRankings( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.partPayments</code> attribute.
	 * @return the partPayments
	 */
	public Collection<PartPaymentMasterConfig> getPartPayments(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOPARTPAYMENTMASTERCONFIGPARTPAYMENTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.partPayments</code> attribute.
	 * @return the partPayments
	 */
	public Collection<PartPaymentMasterConfig> getPartPayments(final Principal item)
	{
		return getPartPayments( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.partPayments</code> attribute. 
	 * @param value the partPayments
	 */
	public void setPartPayments(final SessionContext ctx, final Principal item, final Collection<PartPaymentMasterConfig> value)
	{
		PRINCIPALTOPARTPAYMENTMASTERCONFIGPARTPAYMENTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.partPayments</code> attribute. 
	 * @param value the partPayments
	 */
	public void setPartPayments(final Principal item, final Collection<PartPaymentMasterConfig> value)
	{
		setPartPayments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to partPayments. 
	 * @param value the item to add to partPayments
	 */
	public void addToPartPayments(final SessionContext ctx, final Principal item, final PartPaymentMasterConfig value)
	{
		PRINCIPALTOPARTPAYMENTMASTERCONFIGPARTPAYMENTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to partPayments. 
	 * @param value the item to add to partPayments
	 */
	public void addToPartPayments(final Principal item, final PartPaymentMasterConfig value)
	{
		addToPartPayments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from partPayments. 
	 * @param value the item to remove from partPayments
	 */
	public void removeFromPartPayments(final SessionContext ctx, final Principal item, final PartPaymentMasterConfig value)
	{
		PRINCIPALTOPARTPAYMENTMASTERCONFIGPARTPAYMENTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from partPayments. 
	 * @param value the item to remove from partPayments
	 */
	public void removeFromPartPayments(final Principal item, final PartPaymentMasterConfig value)
	{
		removeFromPartPayments( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.passiveBookingDetailsForFlights</code> attribute.
	 * @return the passiveBookingDetailsForFlights
	 */
	public Collection<PassiveBookingDetail> getPassiveBookingDetailsForFlights(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOPASSIVEBOOKINGDETAILPASSIVEBOOKINGDETAILSFORFLIGHTSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.passiveBookingDetailsForFlights</code> attribute.
	 * @return the passiveBookingDetailsForFlights
	 */
	public Collection<PassiveBookingDetail> getPassiveBookingDetailsForFlights(final Principal item)
	{
		return getPassiveBookingDetailsForFlights( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.passiveBookingDetailsForFlights</code> attribute. 
	 * @param value the passiveBookingDetailsForFlights
	 */
	public void setPassiveBookingDetailsForFlights(final SessionContext ctx, final Principal item, final Collection<PassiveBookingDetail> value)
	{
		PRINCIPALTOPASSIVEBOOKINGDETAILPASSIVEBOOKINGDETAILSFORFLIGHTSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.passiveBookingDetailsForFlights</code> attribute. 
	 * @param value the passiveBookingDetailsForFlights
	 */
	public void setPassiveBookingDetailsForFlights(final Principal item, final Collection<PassiveBookingDetail> value)
	{
		setPassiveBookingDetailsForFlights( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passiveBookingDetailsForFlights. 
	 * @param value the item to add to passiveBookingDetailsForFlights
	 */
	public void addToPassiveBookingDetailsForFlights(final SessionContext ctx, final Principal item, final PassiveBookingDetail value)
	{
		PRINCIPALTOPASSIVEBOOKINGDETAILPASSIVEBOOKINGDETAILSFORFLIGHTSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passiveBookingDetailsForFlights. 
	 * @param value the item to add to passiveBookingDetailsForFlights
	 */
	public void addToPassiveBookingDetailsForFlights(final Principal item, final PassiveBookingDetail value)
	{
		addToPassiveBookingDetailsForFlights( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passiveBookingDetailsForFlights. 
	 * @param value the item to remove from passiveBookingDetailsForFlights
	 */
	public void removeFromPassiveBookingDetailsForFlights(final SessionContext ctx, final Principal item, final PassiveBookingDetail value)
	{
		PRINCIPALTOPASSIVEBOOKINGDETAILPASSIVEBOOKINGDETAILSFORFLIGHTSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passiveBookingDetailsForFlights. 
	 * @param value the item to remove from passiveBookingDetailsForFlights
	 */
	public void removeFromPassiveBookingDetailsForFlights(final Principal item, final PassiveBookingDetail value)
	{
		removeFromPassiveBookingDetailsForFlights( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.paymentOptions</code> attribute.
	 * @return the paymentOptions
	 */
	public Collection<ClientPaymentOption> getPaymentOptions(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOCLIENTPAYMENTOPTIONPAYMENTOPTIONSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.paymentOptions</code> attribute.
	 * @return the paymentOptions
	 */
	public Collection<ClientPaymentOption> getPaymentOptions(final Principal item)
	{
		return getPaymentOptions( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.paymentOptions</code> attribute. 
	 * @param value the paymentOptions
	 */
	public void setPaymentOptions(final SessionContext ctx, final Principal item, final Collection<ClientPaymentOption> value)
	{
		PRINCIPALTOCLIENTPAYMENTOPTIONPAYMENTOPTIONSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.paymentOptions</code> attribute. 
	 * @param value the paymentOptions
	 */
	public void setPaymentOptions(final Principal item, final Collection<ClientPaymentOption> value)
	{
		setPaymentOptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentOptions. 
	 * @param value the item to add to paymentOptions
	 */
	public void addToPaymentOptions(final SessionContext ctx, final Principal item, final ClientPaymentOption value)
	{
		PRINCIPALTOCLIENTPAYMENTOPTIONPAYMENTOPTIONSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentOptions. 
	 * @param value the item to add to paymentOptions
	 */
	public void addToPaymentOptions(final Principal item, final ClientPaymentOption value)
	{
		addToPaymentOptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentOptions. 
	 * @param value the item to remove from paymentOptions
	 */
	public void removeFromPaymentOptions(final SessionContext ctx, final Principal item, final ClientPaymentOption value)
	{
		PRINCIPALTOCLIENTPAYMENTOPTIONPAYMENTOPTIONSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentOptions. 
	 * @param value the item to remove from paymentOptions
	 */
	public void removeFromPaymentOptions(final Principal item, final ClientPaymentOption value)
	{
		removeFromPaymentOptions( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.pointOfSales</code> attribute.
	 * @return the pointOfSales
	 */
	public Collection<PointOfSale> getPointOfSales(final SessionContext ctx, final Principal item)
	{
		Collection<PointOfSale> coll = (Collection<PointOfSale>)item.getProperty( ctx, ClientcoreConstants.Attributes.Principal.POINTOFSALES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.pointOfSales</code> attribute.
	 * @return the pointOfSales
	 */
	public Collection<PointOfSale> getPointOfSales(final Principal item)
	{
		return getPointOfSales( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.pointOfSales</code> attribute. 
	 * @param value the pointOfSales
	 */
	public void setPointOfSales(final SessionContext ctx, final Principal item, final Collection<PointOfSale> value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Principal.POINTOFSALES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.pointOfSales</code> attribute. 
	 * @param value the pointOfSales
	 */
	public void setPointOfSales(final Principal item, final Collection<PointOfSale> value)
	{
		setPointOfSales( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.principals</code> attribute.
	 * @return the principals
	 */
	public Set<Principal> getPrincipals(final SessionContext ctx, final CMSSite item)
	{
		final List<Principal> items = item.getLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			"Principal",
			null,
			false,
			false
		);
		return new LinkedHashSet<Principal>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.principals</code> attribute.
	 * @return the principals
	 */
	public Set<Principal> getPrincipals(final CMSSite item)
	{
		return getPrincipals( getSession().getSessionContext(), item );
	}
	
	public long getPrincipalsCount(final SessionContext ctx, final CMSSite item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			"Principal",
			null
		);
	}
	
	public long getPrincipalsCount(final CMSSite item)
	{
		return getPrincipalsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.principals</code> attribute. 
	 * @param value the principals
	 */
	public void setPrincipals(final SessionContext ctx, final CMSSite item, final Set<Principal> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CMSSITE2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.principals</code> attribute. 
	 * @param value the principals
	 */
	public void setPrincipals(final CMSSite item, final Set<Principal> value)
	{
		setPrincipals( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to principals. 
	 * @param value the item to add to principals
	 */
	public void addToPrincipals(final SessionContext ctx, final CMSSite item, final Principal value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CMSSITE2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to principals. 
	 * @param value the item to add to principals
	 */
	public void addToPrincipals(final CMSSite item, final Principal value)
	{
		addToPrincipals( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from principals. 
	 * @param value the item to remove from principals
	 */
	public void removeFromPrincipals(final SessionContext ctx, final CMSSite item, final Principal value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.CMSSITE2PRINCIPAL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CMSSITE2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from principals. 
	 * @param value the item to remove from principals
	 */
	public void removeFromPrincipals(final CMSSite item, final Principal value)
	{
		removeFromPrincipals( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.principals</code> attribute.
	 * @return the principals
	 */
	public Principal getPrincipals(final SessionContext ctx, final KPIInfo item)
	{
		return (Principal)item.getProperty( ctx, ClientcoreConstants.Attributes.KPIInfo.PRINCIPALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIInfo.principals</code> attribute.
	 * @return the principals
	 */
	public Principal getPrincipals(final KPIInfo item)
	{
		return getPrincipals( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.principals</code> attribute. 
	 * @param value the principals
	 */
	public void setPrincipals(final SessionContext ctx, final KPIInfo item, final Principal value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.KPIInfo.PRINCIPALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIInfo.principals</code> attribute. 
	 * @param value the principals
	 */
	public void setPrincipals(final KPIInfo item, final Principal value)
	{
		setPrincipals( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productCompanyOffers</code> attribute.
	 * @return the productCompanyOffers
	 */
	public CompanyOffers getProductCompanyOffers(final SessionContext ctx, final Product item)
	{
		return (CompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.Product.PRODUCTCOMPANYOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productCompanyOffers</code> attribute.
	 * @return the productCompanyOffers
	 */
	public CompanyOffers getProductCompanyOffers(final Product item)
	{
		return getProductCompanyOffers( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productCompanyOffers</code> attribute. 
	 * @param value the productCompanyOffers
	 */
	public void setProductCompanyOffers(final SessionContext ctx, final Product item, final CompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Product.PRODUCTCOMPANYOFFERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productCompanyOffers</code> attribute. 
	 * @param value the productCompanyOffers
	 */
	public void setProductCompanyOffers(final Product item, final CompanyOffers value)
	{
		setProductCompanyOffers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productRedemptionCompanyOffers</code> attribute.
	 * @return the productRedemptionCompanyOffers
	 */
	public RedemptionCompanyOffers getProductRedemptionCompanyOffers(final SessionContext ctx, final Product item)
	{
		return (RedemptionCompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.Product.PRODUCTREDEMPTIONCOMPANYOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productRedemptionCompanyOffers</code> attribute.
	 * @return the productRedemptionCompanyOffers
	 */
	public RedemptionCompanyOffers getProductRedemptionCompanyOffers(final Product item)
	{
		return getProductRedemptionCompanyOffers( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productRedemptionCompanyOffers</code> attribute. 
	 * @param value the productRedemptionCompanyOffers
	 */
	public void setProductRedemptionCompanyOffers(final SessionContext ctx, final Product item, final RedemptionCompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Product.PRODUCTREDEMPTIONCOMPANYOFFERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productRedemptionCompanyOffers</code> attribute. 
	 * @param value the productRedemptionCompanyOffers
	 */
	public void setProductRedemptionCompanyOffers(final Product item, final RedemptionCompanyOffers value)
	{
		setProductRedemptionCompanyOffers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.reason</code> attribute.
	 * @return the reason - Reason
	 */
	public EnumerationValue getReason(final SessionContext ctx, final B2BUserGroup item)
	{
		return (EnumerationValue)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BUserGroup.REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.reason</code> attribute.
	 * @return the reason - Reason
	 */
	public EnumerationValue getReason(final B2BUserGroup item)
	{
		return getReason( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.reason</code> attribute. 
	 * @param value the reason - Reason
	 */
	public void setReason(final SessionContext ctx, final B2BUserGroup item, final EnumerationValue value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BUserGroup.REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.reason</code> attribute. 
	 * @param value the reason - Reason
	 */
	public void setReason(final B2BUserGroup item, final EnumerationValue value)
	{
		setReason( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.redempCompOfferSuppCred</code> attribute.
	 * @return the redempCompOfferSuppCred
	 */
	public RedemptionCompanyOffers getRedempCompOfferSuppCred(final SessionContext ctx, final SupplierCredentials item)
	{
		return (RedemptionCompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.SupplierCredentials.REDEMPCOMPOFFERSUPPCRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCredentials.redempCompOfferSuppCred</code> attribute.
	 * @return the redempCompOfferSuppCred
	 */
	public RedemptionCompanyOffers getRedempCompOfferSuppCred(final SupplierCredentials item)
	{
		return getRedempCompOfferSuppCred( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.redempCompOfferSuppCred</code> attribute. 
	 * @param value the redempCompOfferSuppCred
	 */
	public void setRedempCompOfferSuppCred(final SessionContext ctx, final SupplierCredentials item, final RedemptionCompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.SupplierCredentials.REDEMPCOMPOFFERSUPPCRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCredentials.redempCompOfferSuppCred</code> attribute. 
	 * @param value the redempCompOfferSuppCred
	 */
	public void setRedempCompOfferSuppCred(final SupplierCredentials item, final RedemptionCompanyOffers value)
	{
		setRedempCompOfferSuppCred( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.redemptionCompOffers</code> attribute.
	 * @return the redemptionCompOffers
	 */
	public RedemptionCompanyOffers getRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy item)
	{
		return (RedemptionCompanyOffers)item.getProperty( ctx, ClientcoreConstants.Attributes.TravelogixPolicy.REDEMPTIONCOMPOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.redemptionCompOffers</code> attribute.
	 * @return the redemptionCompOffers
	 */
	public RedemptionCompanyOffers getRedemptionCompOffers(final TravelogixPolicy item)
	{
		return getRedemptionCompOffers( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.redemptionCompOffers</code> attribute. 
	 * @param value the redemptionCompOffers
	 */
	public void setRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy item, final RedemptionCompanyOffers value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.TravelogixPolicy.REDEMPTIONCOMPOFFERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.redemptionCompOffers</code> attribute. 
	 * @param value the redemptionCompOffers
	 */
	public void setRedemptionCompOffers(final TravelogixPolicy item, final RedemptionCompanyOffers value)
	{
		setRedemptionCompOffers( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.remark</code> attribute.
	 * @return the remark
	 */
	public String getRemark(final SessionContext ctx, final Principal item)
	{
		return (String)item.getProperty( ctx, ClientcoreConstants.Attributes.Principal.REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.remark</code> attribute.
	 * @return the remark
	 */
	public String getRemark(final Principal item)
	{
		return getRemark( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.remark</code> attribute. 
	 * @param value the remark
	 */
	public void setRemark(final SessionContext ctx, final Principal item, final String value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Principal.REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.remark</code> attribute. 
	 * @param value the remark
	 */
	public void setRemark(final Principal item, final String value)
	{
		setRemark( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.remarks</code> attribute.
	 * @return the remarks - Remarks
	 */
	public String getRemarks(final SessionContext ctx, final B2BUserGroup item)
	{
		return (String)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BUserGroup.REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.remarks</code> attribute.
	 * @return the remarks - Remarks
	 */
	public String getRemarks(final B2BUserGroup item)
	{
		return getRemarks( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.remarks</code> attribute. 
	 * @param value the remarks - Remarks
	 */
	public void setRemarks(final SessionContext ctx, final B2BUserGroup item, final String value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BUserGroup.REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.remarks</code> attribute. 
	 * @param value the remarks - Remarks
	 */
	public void setRemarks(final B2BUserGroup item, final String value)
	{
		setRemarks( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.retentionThresholds</code> attribute.
	 * @return the retentionThresholds
	 */
	public Collection<RetentionThreshold> getRetentionThresholds(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTORETENTIONTHRESHOLDRETENTIONTHRESHOLDSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.retentionThresholds</code> attribute.
	 * @return the retentionThresholds
	 */
	public Collection<RetentionThreshold> getRetentionThresholds(final Principal item)
	{
		return getRetentionThresholds( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.retentionThresholds</code> attribute. 
	 * @param value the retentionThresholds
	 */
	public void setRetentionThresholds(final SessionContext ctx, final Principal item, final Collection<RetentionThreshold> value)
	{
		PRINCIPALTORETENTIONTHRESHOLDRETENTIONTHRESHOLDSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.retentionThresholds</code> attribute. 
	 * @param value the retentionThresholds
	 */
	public void setRetentionThresholds(final Principal item, final Collection<RetentionThreshold> value)
	{
		setRetentionThresholds( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to retentionThresholds. 
	 * @param value the item to add to retentionThresholds
	 */
	public void addToRetentionThresholds(final SessionContext ctx, final Principal item, final RetentionThreshold value)
	{
		PRINCIPALTORETENTIONTHRESHOLDRETENTIONTHRESHOLDSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to retentionThresholds. 
	 * @param value the item to add to retentionThresholds
	 */
	public void addToRetentionThresholds(final Principal item, final RetentionThreshold value)
	{
		addToRetentionThresholds( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from retentionThresholds. 
	 * @param value the item to remove from retentionThresholds
	 */
	public void removeFromRetentionThresholds(final SessionContext ctx, final Principal item, final RetentionThreshold value)
	{
		PRINCIPALTORETENTIONTHRESHOLDRETENTIONTHRESHOLDSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from retentionThresholds. 
	 * @param value the item to remove from retentionThresholds
	 */
	public void removeFromRetentionThresholds(final Principal item, final RetentionThreshold value)
	{
		removeFromRetentionThresholds( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EligibilityCondition.roomLevelEligibilityCondition</code> attribute.
	 * @return the roomLevelEligibilityCondition
	 */
	public Collection<RoomLevel> getRoomLevelEligibilityCondition(final SessionContext ctx, final EnumerationValue item)
	{
		return ELIGIBILITYCONDITION2ROOMLEVELROOMLEVELELIGIBILITYCONDITIONHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EligibilityCondition.roomLevelEligibilityCondition</code> attribute.
	 * @return the roomLevelEligibilityCondition
	 */
	public Collection<RoomLevel> getRoomLevelEligibilityCondition(final EnumerationValue item)
	{
		return getRoomLevelEligibilityCondition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EligibilityCondition.roomLevelEligibilityCondition</code> attribute. 
	 * @param value the roomLevelEligibilityCondition
	 */
	public void setRoomLevelEligibilityCondition(final SessionContext ctx, final EnumerationValue item, final Collection<RoomLevel> value)
	{
		ELIGIBILITYCONDITION2ROOMLEVELROOMLEVELELIGIBILITYCONDITIONHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EligibilityCondition.roomLevelEligibilityCondition</code> attribute. 
	 * @param value the roomLevelEligibilityCondition
	 */
	public void setRoomLevelEligibilityCondition(final EnumerationValue item, final Collection<RoomLevel> value)
	{
		setRoomLevelEligibilityCondition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomLevelEligibilityCondition. 
	 * @param value the item to add to roomLevelEligibilityCondition
	 */
	public void addToRoomLevelEligibilityCondition(final SessionContext ctx, final EnumerationValue item, final RoomLevel value)
	{
		ELIGIBILITYCONDITION2ROOMLEVELROOMLEVELELIGIBILITYCONDITIONHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomLevelEligibilityCondition. 
	 * @param value the item to add to roomLevelEligibilityCondition
	 */
	public void addToRoomLevelEligibilityCondition(final EnumerationValue item, final RoomLevel value)
	{
		addToRoomLevelEligibilityCondition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomLevelEligibilityCondition. 
	 * @param value the item to remove from roomLevelEligibilityCondition
	 */
	public void removeFromRoomLevelEligibilityCondition(final SessionContext ctx, final EnumerationValue item, final RoomLevel value)
	{
		ELIGIBILITYCONDITION2ROOMLEVELROOMLEVELELIGIBILITYCONDITIONHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomLevelEligibilityCondition. 
	 * @param value the item to remove from roomLevelEligibilityCondition
	 */
	public void removeFromRoomLevelEligibilityCondition(final EnumerationValue item, final RoomLevel value)
	{
		removeFromRoomLevelEligibilityCondition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.showRateOf</code> attribute.
	 * @return the showRateOf
	 */
	public EnumerationValue getShowRateOf(final SessionContext ctx, final Principal item)
	{
		return (EnumerationValue)item.getProperty( ctx, ClientcoreConstants.Attributes.Principal.SHOWRATEOF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.showRateOf</code> attribute.
	 * @return the showRateOf
	 */
	public EnumerationValue getShowRateOf(final Principal item)
	{
		return getShowRateOf( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.showRateOf</code> attribute. 
	 * @param value the showRateOf
	 */
	public void setShowRateOf(final SessionContext ctx, final Principal item, final EnumerationValue value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Principal.SHOWRATEOF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.showRateOf</code> attribute. 
	 * @param value the showRateOf
	 */
	public void setShowRateOf(final Principal item, final EnumerationValue value)
	{
		setShowRateOf( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.timeLimits</code> attribute.
	 * @return the timeLimits
	 */
	public Collection<TimeLimitMasterConfig> getTimeLimits(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOTIMELIMITMASTERCONFIGTIMELIMITSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.timeLimits</code> attribute.
	 * @return the timeLimits
	 */
	public Collection<TimeLimitMasterConfig> getTimeLimits(final Principal item)
	{
		return getTimeLimits( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.timeLimits</code> attribute. 
	 * @param value the timeLimits
	 */
	public void setTimeLimits(final SessionContext ctx, final Principal item, final Collection<TimeLimitMasterConfig> value)
	{
		PRINCIPALTOTIMELIMITMASTERCONFIGTIMELIMITSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.timeLimits</code> attribute. 
	 * @param value the timeLimits
	 */
	public void setTimeLimits(final Principal item, final Collection<TimeLimitMasterConfig> value)
	{
		setTimeLimits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to timeLimits. 
	 * @param value the item to add to timeLimits
	 */
	public void addToTimeLimits(final SessionContext ctx, final Principal item, final TimeLimitMasterConfig value)
	{
		PRINCIPALTOTIMELIMITMASTERCONFIGTIMELIMITSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to timeLimits. 
	 * @param value the item to add to timeLimits
	 */
	public void addToTimeLimits(final Principal item, final TimeLimitMasterConfig value)
	{
		addToTimeLimits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from timeLimits. 
	 * @param value the item to remove from timeLimits
	 */
	public void removeFromTimeLimits(final SessionContext ctx, final Principal item, final TimeLimitMasterConfig value)
	{
		PRINCIPALTOTIMELIMITMASTERCONFIGTIMELIMITSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from timeLimits. 
	 * @param value the item to remove from timeLimits
	 */
	public void removeFromTimeLimits(final Principal item, final TimeLimitMasterConfig value)
	{
		removeFromTimeLimits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx, final Media item)
	{
		return (TravellerProfile)item.getProperty( ctx, ClientcoreConstants.Attributes.Media.TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final Media item)
	{
		return getTravellerProfile( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final Media item, final TravellerProfile value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Media.TRAVELLERPROFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final Media item, final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx, final Address item)
	{
		return (TravellerProfile)item.getProperty( ctx, ClientcoreConstants.Attributes.Address.TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Address.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final Address item)
	{
		return getTravellerProfile( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final Address item, final TravellerProfile value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Address.TRAVELLERPROFILE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Address.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final Address item, final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final SessionContext ctx, final StaffInformation item)
	{
		return (TravelogixB2BUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.StaffInformation.TRAVELOGIXB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StaffInformation.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final StaffInformation item)
	{
		return getTravelogixB2BUnit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final SessionContext ctx, final StaffInformation item, final TravelogixB2BUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.StaffInformation.TRAVELOGIXB2BUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StaffInformation.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final StaffInformation item, final TravelogixB2BUnit value)
	{
		setTravelogixB2BUnit( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final SessionContext ctx, final GenericItem item)
	{
		return (TravelogixB2BUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.BankAccountDetail.TRAVELOGIXB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankAccountDetail.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final BankAccountDetail item)
	{
		return getTravelogixB2BUnit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final SessionContext ctx, final GenericItem item, final TravelogixB2BUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.BankAccountDetail.TRAVELOGIXB2BUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankAccountDetail.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final BankAccountDetail item, final TravelogixB2BUnit value)
	{
		setTravelogixB2BUnit( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final SessionContext ctx, final TravelogixPolicy item)
	{
		return (TravelogixB2BUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.TravelogixPolicy.TRAVELOGIXB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final TravelogixPolicy item)
	{
		return getTravelogixB2BUnit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final SessionContext ctx, final TravelogixPolicy item, final TravelogixB2BUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.TravelogixPolicy.TRAVELOGIXB2BUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final TravelogixPolicy item, final TravelogixB2BUnit value)
	{
		setTravelogixB2BUnit( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateDealCodes.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final SessionContext ctx, final CorporateDealCodes item)
	{
		return (TravelogixB2BUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.CorporateDealCodes.TRAVELOGIXB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateDealCodes.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final CorporateDealCodes item)
	{
		return getTravelogixB2BUnit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateDealCodes.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final SessionContext ctx, final CorporateDealCodes item, final TravelogixB2BUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.CorporateDealCodes.TRAVELOGIXB2BUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateDealCodes.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final CorporateDealCodes item, final TravelogixB2BUnit value)
	{
		setTravelogixB2BUnit( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.travelogixClientType</code> attribute.
	 * @return the travelogixClientType
	 */
	public Set<TravelogixClientType> getTravelogixClientType(final SessionContext ctx, final Market item)
	{
		final List<TravelogixClientType> items = item.getLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			"TravelogixClientType",
			null,
			false,
			false
		);
		return new LinkedHashSet<TravelogixClientType>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.travelogixClientType</code> attribute.
	 * @return the travelogixClientType
	 */
	public Set<TravelogixClientType> getTravelogixClientType(final Market item)
	{
		return getTravelogixClientType( getSession().getSessionContext(), item );
	}
	
	public long getTravelogixClientTypeCount(final SessionContext ctx, final Market item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			"TravelogixClientType",
			null
		);
	}
	
	public long getTravelogixClientTypeCount(final Market item)
	{
		return getTravelogixClientTypeCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.travelogixClientType</code> attribute. 
	 * @param value the travelogixClientType
	 */
	public void setTravelogixClientType(final SessionContext ctx, final Market item, final Set<TravelogixClientType> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2MARKET_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.travelogixClientType</code> attribute. 
	 * @param value the travelogixClientType
	 */
	public void setTravelogixClientType(final Market item, final Set<TravelogixClientType> value)
	{
		setTravelogixClientType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixClientType. 
	 * @param value the item to add to travelogixClientType
	 */
	public void addToTravelogixClientType(final SessionContext ctx, final Market item, final TravelogixClientType value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2MARKET_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixClientType. 
	 * @param value the item to add to travelogixClientType
	 */
	public void addToTravelogixClientType(final Market item, final TravelogixClientType value)
	{
		addToTravelogixClientType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixClientType. 
	 * @param value the item to remove from travelogixClientType
	 */
	public void removeFromTravelogixClientType(final SessionContext ctx, final Market item, final TravelogixClientType value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2MARKET_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixClientType. 
	 * @param value the item to remove from travelogixClientType
	 */
	public void removeFromTravelogixClientType(final Market item, final TravelogixClientType value)
	{
		removeFromTravelogixClientType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Currency.travelogixClientType</code> attribute.
	 * @return the travelogixClientType
	 */
	public Set<TravelogixClientType> getTravelogixClientType(final SessionContext ctx, final Currency item)
	{
		final List<TravelogixClientType> items = item.getLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			"TravelogixClientType",
			null,
			false,
			false
		);
		return new LinkedHashSet<TravelogixClientType>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Currency.travelogixClientType</code> attribute.
	 * @return the travelogixClientType
	 */
	public Set<TravelogixClientType> getTravelogixClientType(final Currency item)
	{
		return getTravelogixClientType( getSession().getSessionContext(), item );
	}
	
	public long getTravelogixClientTypeCount(final SessionContext ctx, final Currency item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			"TravelogixClientType",
			null
		);
	}
	
	public long getTravelogixClientTypeCount(final Currency item)
	{
		return getTravelogixClientTypeCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Currency.travelogixClientType</code> attribute. 
	 * @param value the travelogixClientType
	 */
	public void setTravelogixClientType(final SessionContext ctx, final Currency item, final Set<TravelogixClientType> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2CURRENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Currency.travelogixClientType</code> attribute. 
	 * @param value the travelogixClientType
	 */
	public void setTravelogixClientType(final Currency item, final Set<TravelogixClientType> value)
	{
		setTravelogixClientType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixClientType. 
	 * @param value the item to add to travelogixClientType
	 */
	public void addToTravelogixClientType(final SessionContext ctx, final Currency item, final TravelogixClientType value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2CURRENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixClientType. 
	 * @param value the item to add to travelogixClientType
	 */
	public void addToTravelogixClientType(final Currency item, final TravelogixClientType value)
	{
		addToTravelogixClientType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixClientType. 
	 * @param value the item to remove from travelogixClientType
	 */
	public void removeFromTravelogixClientType(final SessionContext ctx, final Currency item, final TravelogixClientType value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2CURRENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixClientType. 
	 * @param value the item to remove from travelogixClientType
	 */
	public void removeFromTravelogixClientType(final Currency item, final TravelogixClientType value)
	{
		removeFromTravelogixClientType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DistributionChannel.travelogixClientType</code> attribute.
	 * @return the travelogixClientType
	 */
	public TravelogixClientType getTravelogixClientType(final SessionContext ctx, final DistributionChannel item)
	{
		return (TravelogixClientType)item.getProperty( ctx, ClientcoreConstants.Attributes.DistributionChannel.TRAVELOGIXCLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DistributionChannel.travelogixClientType</code> attribute.
	 * @return the travelogixClientType
	 */
	public TravelogixClientType getTravelogixClientType(final DistributionChannel item)
	{
		return getTravelogixClientType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DistributionChannel.travelogixClientType</code> attribute. 
	 * @param value the travelogixClientType
	 */
	public void setTravelogixClientType(final SessionContext ctx, final DistributionChannel item, final TravelogixClientType value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.DistributionChannel.TRAVELOGIXCLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DistributionChannel.travelogixClientType</code> attribute. 
	 * @param value the travelogixClientType
	 */
	public void setTravelogixClientType(final DistributionChannel item, final TravelogixClientType value)
	{
		setTravelogixClientType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit(final SessionContext ctx, final Department item)
	{
		return (TravelogixCorporateUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.Department.TRAVELOGIXCORPORATEUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit(final Department item)
	{
		return getTravelogixCorporateUnit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final SessionContext ctx, final Department item, final TravelogixCorporateUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Department.TRAVELOGIXCORPORATEUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final Department item, final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnit( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Information.travelogixCorporateUnitBookingInfo</code> attribute.
	 * @return the travelogixCorporateUnitBookingInfo
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnitBookingInfo(final SessionContext ctx, final EnumerationValue item)
	{
		return (TravelogixCorporateUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.Information.TRAVELOGIXCORPORATEUNITBOOKINGINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Information.travelogixCorporateUnitBookingInfo</code> attribute.
	 * @return the travelogixCorporateUnitBookingInfo
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnitBookingInfo(final EnumerationValue item)
	{
		return getTravelogixCorporateUnitBookingInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Information.travelogixCorporateUnitBookingInfo</code> attribute. 
	 * @param value the travelogixCorporateUnitBookingInfo
	 */
	public void setTravelogixCorporateUnitBookingInfo(final SessionContext ctx, final EnumerationValue item, final TravelogixCorporateUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Information.TRAVELOGIXCORPORATEUNITBOOKINGINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Information.travelogixCorporateUnitBookingInfo</code> attribute. 
	 * @param value the travelogixCorporateUnitBookingInfo
	 */
	public void setTravelogixCorporateUnitBookingInfo(final EnumerationValue item, final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnitBookingInfo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDocument.travelogixCorporateUnitDoc</code> attribute.
	 * @return the travelogixCorporateUnitDoc
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnitDoc(final SessionContext ctx, final EnumerationValue item)
	{
		return (TravelogixCorporateUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.ClientDocument.TRAVELOGIXCORPORATEUNITDOC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDocument.travelogixCorporateUnitDoc</code> attribute.
	 * @return the travelogixCorporateUnitDoc
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnitDoc(final EnumerationValue item)
	{
		return getTravelogixCorporateUnitDoc( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDocument.travelogixCorporateUnitDoc</code> attribute. 
	 * @param value the travelogixCorporateUnitDoc
	 */
	public void setTravelogixCorporateUnitDoc(final SessionContext ctx, final EnumerationValue item, final TravelogixCorporateUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.ClientDocument.TRAVELOGIXCORPORATEUNITDOC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDocument.travelogixCorporateUnitDoc</code> attribute. 
	 * @param value the travelogixCorporateUnitDoc
	 */
	public void setTravelogixCorporateUnitDoc(final EnumerationValue item, final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnitDoc( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Information.travelogixCorporateUnitEmpInfo</code> attribute.
	 * @return the travelogixCorporateUnitEmpInfo
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnitEmpInfo(final SessionContext ctx, final EnumerationValue item)
	{
		return (TravelogixCorporateUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.Information.TRAVELOGIXCORPORATEUNITEMPINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Information.travelogixCorporateUnitEmpInfo</code> attribute.
	 * @return the travelogixCorporateUnitEmpInfo
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnitEmpInfo(final EnumerationValue item)
	{
		return getTravelogixCorporateUnitEmpInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Information.travelogixCorporateUnitEmpInfo</code> attribute. 
	 * @param value the travelogixCorporateUnitEmpInfo
	 */
	public void setTravelogixCorporateUnitEmpInfo(final SessionContext ctx, final EnumerationValue item, final TravelogixCorporateUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Information.TRAVELOGIXCORPORATEUNITEMPINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Information.travelogixCorporateUnitEmpInfo</code> attribute. 
	 * @param value the travelogixCorporateUnitEmpInfo
	 */
	public void setTravelogixCorporateUnitEmpInfo(final EnumerationValue item, final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnitEmpInfo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grade.travelogixCorporateUnitGrade</code> attribute.
	 * @return the travelogixCorporateUnitGrade
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnitGrade(final SessionContext ctx, final EnumerationValue item)
	{
		return (TravelogixCorporateUnit)item.getProperty( ctx, ClientcoreConstants.Attributes.Grade.TRAVELOGIXCORPORATEUNITGRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Grade.travelogixCorporateUnitGrade</code> attribute.
	 * @return the travelogixCorporateUnitGrade
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnitGrade(final EnumerationValue item)
	{
		return getTravelogixCorporateUnitGrade( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Grade.travelogixCorporateUnitGrade</code> attribute. 
	 * @param value the travelogixCorporateUnitGrade
	 */
	public void setTravelogixCorporateUnitGrade(final SessionContext ctx, final EnumerationValue item, final TravelogixCorporateUnit value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.Grade.TRAVELOGIXCORPORATEUNITGRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Grade.travelogixCorporateUnitGrade</code> attribute. 
	 * @param value the travelogixCorporateUnitGrade
	 */
	public void setTravelogixCorporateUnitGrade(final EnumerationValue item, final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnitGrade( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.usergroups</code> attribute.
	 * @return the usergroups
	 */
	public Collection<UserGroup> getUsergroups(final SessionContext ctx, final B2BCustomer item)
	{
		return B2BCUSTOMERTOUSERGROUPUSERGROUPSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BCustomer.usergroups</code> attribute.
	 * @return the usergroups
	 */
	public Collection<UserGroup> getUsergroups(final B2BCustomer item)
	{
		return getUsergroups( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.usergroups</code> attribute. 
	 * @param value the usergroups
	 */
	public void setUsergroups(final SessionContext ctx, final B2BCustomer item, final Collection<UserGroup> value)
	{
		B2BCUSTOMERTOUSERGROUPUSERGROUPSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BCustomer.usergroups</code> attribute. 
	 * @param value the usergroups
	 */
	public void setUsergroups(final B2BCustomer item, final Collection<UserGroup> value)
	{
		setUsergroups( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to usergroups. 
	 * @param value the item to add to usergroups
	 */
	public void addToUsergroups(final SessionContext ctx, final B2BCustomer item, final UserGroup value)
	{
		B2BCUSTOMERTOUSERGROUPUSERGROUPSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to usergroups. 
	 * @param value the item to add to usergroups
	 */
	public void addToUsergroups(final B2BCustomer item, final UserGroup value)
	{
		addToUsergroups( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from usergroups. 
	 * @param value the item to remove from usergroups
	 */
	public void removeFromUsergroups(final SessionContext ctx, final B2BCustomer item, final UserGroup value)
	{
		B2BCUSTOMERTOUSERGROUPUSERGROUPSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from usergroups. 
	 * @param value the item to remove from usergroups
	 */
	public void removeFromUsergroups(final B2BCustomer item, final UserGroup value)
	{
		removeFromUsergroups( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx, final B2BUserGroup item)
	{
		return (EnumerationValue)item.getProperty( ctx, ClientcoreConstants.Attributes.B2BUserGroup.WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>B2BUserGroup.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final B2BUserGroup item)
	{
		return getWorkFlowStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final B2BUserGroup item, final EnumerationValue value)
	{
		item.setProperty(ctx, ClientcoreConstants.Attributes.B2BUserGroup.WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>B2BUserGroup.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final B2BUserGroup item, final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), item, value );
	}
	
}
