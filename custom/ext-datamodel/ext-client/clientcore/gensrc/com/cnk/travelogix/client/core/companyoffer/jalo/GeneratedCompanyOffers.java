/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.BookingDateValidity;
import com.cnk.travelogix.client.core.companyoffer.jalo.ClientDetails;
import com.cnk.travelogix.client.core.companyoffer.jalo.CombineOffer;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyDetails;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanySlabType;
import com.cnk.travelogix.client.core.companyoffer.jalo.CreditCardLastThreeDigitType;
import com.cnk.travelogix.client.core.companyoffer.jalo.DateRange;
import com.cnk.travelogix.client.core.companyoffer.jalo.DeactivateOffer;
import com.cnk.travelogix.client.core.companyoffer.jalo.FixedCompanyOfferValueType;
import com.cnk.travelogix.client.core.companyoffer.jalo.FreeOrDiscountedOfferType;
import com.cnk.travelogix.client.core.companyoffer.jalo.OfferEligibilityCondition;
import com.cnk.travelogix.client.core.companyoffer.jalo.OfferProduct;
import com.cnk.travelogix.client.core.companyoffer.jalo.RedemptionCompanyOffers;
import com.cnk.travelogix.client.core.companyoffer.jalo.Retention;
import com.cnk.travelogix.client.core.companyoffer.jalo.TravelDateValidity;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import com.cnk.travelogix.supplier.masterdata.core.bookingconfig.BookingConfiguration;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers CompanyOffers}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyOffers extends GenericItem
{
	/** Qualifier of the <code>CompanyOffers.offerID</code> attribute **/
	public static final String OFFERID = "offerID";
	/** Qualifier of the <code>CompanyOffers.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>CompanyOffers.offerName</code> attribute **/
	public static final String OFFERNAME = "offerName";
	/** Qualifier of the <code>CompanyOffers.offerType</code> attribute **/
	public static final String OFFERTYPE = "offerType";
	/** Qualifier of the <code>CompanyOffers.offerSubType</code> attribute **/
	public static final String OFFERSUBTYPE = "offerSubType";
	/** Qualifier of the <code>CompanyOffers.productSubCategory</code> attribute **/
	public static final String PRODUCTSUBCATEGORY = "productSubCategory";
	/** Qualifier of the <code>CompanyOffers.offerApplicability</code> attribute **/
	public static final String OFFERAPPLICABILITY = "offerApplicability";
	/** Qualifier of the <code>CompanyOffers.longDescription</code> attribute **/
	public static final String LONGDESCRIPTION = "longDescription";
	/** Qualifier of the <code>CompanyOffers.redemptionCompanyOffers</code> attribute **/
	public static final String REDEMPTIONCOMPANYOFFERS = "redemptionCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.shortDescription</code> attribute **/
	public static final String SHORTDESCRIPTION = "shortDescription";
	/** Qualifier of the <code>CompanyOffers.fromBookingDate</code> attribute **/
	public static final String FROMBOOKINGDATE = "fromBookingDate";
	/** Qualifier of the <code>CompanyOffers.fromTravelStartDate</code> attribute **/
	public static final String FROMTRAVELSTARTDATE = "fromTravelStartDate";
	/** Qualifier of the <code>CompanyOffers.afterTravelEndDate</code> attribute **/
	public static final String AFTERTRAVELENDDATE = "afterTravelEndDate";
	/** Qualifier of the <code>CompanyOffers.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>CompanyOffers.workingDaysOfWeek</code> attribute **/
	public static final String WORKINGDAYSOFWEEK = "workingDaysOfWeek";
	/** Qualifier of the <code>CompanyOffers.companyOfferValue</code> attribute **/
	public static final String COMPANYOFFERVALUE = "companyOfferValue";
	/** Qualifier of the <code>CompanyOffers.retention</code> attribute **/
	public static final String RETENTION = "retention";
	/** Qualifier of the <code>CompanyOffers.freeDiscountType</code> attribute **/
	public static final String FREEDISCOUNTTYPE = "freeDiscountType";
	/** Qualifier of the <code>CompanyOffers.companySlabType</code> attribute **/
	public static final String COMPANYSLABTYPE = "companySlabType";
	/** Qualifier of the <code>CompanyOffers.lastThreedigit</code> attribute **/
	public static final String LASTTHREEDIGIT = "lastThreedigit";
	/** Qualifier of the <code>CompanyOffers.fixedCompanyOfferValue</code> attribute **/
	public static final String FIXEDCOMPANYOFFERVALUE = "fixedCompanyOfferValue";
	/** Qualifier of the <code>CompanyOffers.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	/** Qualifier of the <code>CompanyOffers.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>CompanyOffers.offerInclusionNote</code> attribute **/
	public static final String OFFERINCLUSIONNOTE = "offerInclusionNote";
	/** Qualifier of the <code>CompanyOffers.offerExclusionNote</code> attribute **/
	public static final String OFFEREXCLUSIONNOTE = "offerExclusionNote";
	/** Qualifier of the <code>CompanyOffers.voucherDetails</code> attribute **/
	public static final String VOUCHERDETAILS = "voucherDetails";
	/** Qualifier of the <code>CompanyOffers.internalDetails</code> attribute **/
	public static final String INTERNALDETAILS = "internalDetails";
	/** Qualifier of the <code>CompanyOffers.externalDetails</code> attribute **/
	public static final String EXTERNALDETAILS = "externalDetails";
	/** Qualifier of the <code>CompanyOffers.deactivateOffer</code> attribute **/
	public static final String DEACTIVATEOFFER = "deactivateOffer";
	/** Qualifier of the <code>CompanyOffers.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>CompanyOffers.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>CompanyOffers.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>CompanyOffers.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>CompanyOffers.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>CompanyOffers.approvalStatus</code> attribute **/
	public static final String APPROVALSTATUS = "approvalStatus";
	/** Qualifier of the <code>CompanyOffers.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>CompanyOffers.offerValidityFromDate</code> attribute **/
	public static final String OFFERVALIDITYFROMDATE = "offerValidityFromDate";
	/** Qualifier of the <code>CompanyOffers.offerValidityToDate</code> attribute **/
	public static final String OFFERVALIDITYTODATE = "offerValidityToDate";
	/** Qualifier of the <code>CompanyOffers.bookingconfigoffer</code> attribute **/
	public static final String BOOKINGCONFIGOFFER = "bookingconfigoffer";
	/** Qualifier of the <code>CompanyOffers.clientCompanyOffers</code> attribute **/
	public static final String CLIENTCOMPANYOFFERS = "clientCompanyOffers";
	/** Relation ordering override parameter constants for CompanyOffers2ClientDetails from ((clientcore))*/
	protected static String COMPANYOFFERS2CLIENTDETAILS_SRC_ORDERED = "relation.CompanyOffers2ClientDetails.source.ordered";
	protected static String COMPANYOFFERS2CLIENTDETAILS_TGT_ORDERED = "relation.CompanyOffers2ClientDetails.target.ordered";
	/** Relation disable markmodifed parameter constants for CompanyOffers2ClientDetails from ((clientcore))*/
	protected static String COMPANYOFFERS2CLIENTDETAILS_MARKMODIFIED = "relation.CompanyOffers2ClientDetails.markmodified";
	/** Qualifier of the <code>CompanyOffers.companyOffersCompany</code> attribute **/
	public static final String COMPANYOFFERSCOMPANY = "companyOffersCompany";
	/** Relation ordering override parameter constants for CompanyOffers2CompanyDetails from ((clientcore))*/
	protected static String COMPANYOFFERS2COMPANYDETAILS_SRC_ORDERED = "relation.CompanyOffers2CompanyDetails.source.ordered";
	protected static String COMPANYOFFERS2COMPANYDETAILS_TGT_ORDERED = "relation.CompanyOffers2CompanyDetails.target.ordered";
	/** Relation disable markmodifed parameter constants for CompanyOffers2CompanyDetails from ((clientcore))*/
	protected static String COMPANYOFFERS2COMPANYDETAILS_MARKMODIFIED = "relation.CompanyOffers2CompanyDetails.markmodified";
	/** Qualifier of the <code>CompanyOffers.companyOffers</code> attribute **/
	public static final String COMPANYOFFERS = "companyOffers";
	/** Relation ordering override parameter constants for CompanyOffers2CompanyOffers from ((clientcore))*/
	protected static String COMPANYOFFERS2COMPANYOFFERS_SRC_ORDERED = "relation.CompanyOffers2CompanyOffers.source.ordered";
	protected static String COMPANYOFFERS2COMPANYOFFERS_TGT_ORDERED = "relation.CompanyOffers2CompanyOffers.target.ordered";
	/** Relation disable markmodifed parameter constants for CompanyOffers2CompanyOffers from ((clientcore))*/
	protected static String COMPANYOFFERS2COMPANYOFFERS_MARKMODIFIED = "relation.CompanyOffers2CompanyOffers.markmodified";
	/** Qualifier of the <code>CompanyOffers.combineOffers</code> attribute **/
	public static final String COMBINEOFFERS = "combineOffers";
	/** Qualifier of the <code>CompanyOffers.bookingDateCompanyOffers</code> attribute **/
	public static final String BOOKINGDATECOMPANYOFFERS = "bookingDateCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.travelDateCompanyOffers</code> attribute **/
	public static final String TRAVELDATECOMPANYOFFERS = "travelDateCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.CombineOfferCompanyOffers</code> attribute **/
	public static final String COMBINEOFFERCOMPANYOFFERS = "CombineOfferCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.offerProductCompanyOffers</code> attribute **/
	public static final String OFFERPRODUCTCOMPANYOFFERS = "offerProductCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.eligibilityConditionCompanyOffers</code> attribute **/
	public static final String ELIGIBILITYCONDITIONCOMPANYOFFERS = "eligibilityConditionCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.supplierCredentialsCompanyOffers</code> attribute **/
	public static final String SUPPLIERCREDENTIALSCOMPANYOFFERS = "supplierCredentialsCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.policyCanceCompanyOffers</code> attribute **/
	public static final String POLICYCANCECOMPANYOFFERS = "policyCanceCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.policyAmenCompanyOffers</code> attribute **/
	public static final String POLICYAMENCOMPANYOFFERS = "policyAmenCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.policyPaymCompanyOffers</code> attribute **/
	public static final String POLICYPAYMCOMPANYOFFERS = "policyPaymCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.policyBookCompanyOffers</code> attribute **/
	public static final String POLICYBOOKCOMPANYOFFERS = "policyBookCompanyOffers";
	/** Qualifier of the <code>CompanyOffers.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Qualifier of the <code>CompanyOffers.exclusionProducts</code> attribute **/
	public static final String EXCLUSIONPRODUCTS = "exclusionProducts";
	/** Qualifier of the <code>CompanyOffers.companyDeactivateOffers</code> attribute **/
	public static final String COMPANYDEACTIVATEOFFERS = "companyDeactivateOffers";
	/** Qualifier of the <code>CompanyOffers.clientDeactivateOffers</code> attribute **/
	public static final String CLIENTDEACTIVATEOFFERS = "clientDeactivateOffers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BOOKINGCONFIGOFFER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCompanyOffers> BOOKINGCONFIGOFFERHANDLER = new BidirectionalOneToManyHandler<GeneratedCompanyOffers>(
	ClientcoreConstants.TC.COMPANYOFFERS,
	false,
	"bookingconfigoffer",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKINGDATECOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BookingDateValidity> BOOKINGDATECOMPANYOFFERSHANDLER = new OneToManyHandler<BookingDateValidity>(
	ClientcoreConstants.TC.BOOKINGDATEVALIDITY,
	false,
	"companyBookingDateValidity",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELDATECOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelDateValidity> TRAVELDATECOMPANYOFFERSHANDLER = new OneToManyHandler<TravelDateValidity>(
	ClientcoreConstants.TC.TRAVELDATEVALIDITY,
	false,
	"companyTravelDateValidity",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COMBINEOFFERCOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CombineOffer> COMBINEOFFERCOMPANYOFFERSHANDLER = new OneToManyHandler<CombineOffer>(
	ClientcoreConstants.TC.COMBINEOFFER,
	false,
	"companyCombineOffer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OFFERPRODUCTCOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OfferProduct> OFFERPRODUCTCOMPANYOFFERSHANDLER = new OneToManyHandler<OfferProduct>(
	ClientcoreConstants.TC.OFFERPRODUCT,
	false,
	"companyOfferProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ELIGIBILITYCONDITIONCOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OfferEligibilityCondition> ELIGIBILITYCONDITIONCOMPANYOFFERSHANDLER = new OneToManyHandler<OfferEligibilityCondition>(
	ClientcoreConstants.TC.OFFERELIGIBILITYCONDITION,
	false,
	"companyOfferEligibilityCondition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERCREDENTIALSCOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierCredentials> SUPPLIERCREDENTIALSCOMPANYOFFERSHANDLER = new OneToManyHandler<SupplierCredentials>(
	SuppliercredentialscoreConstants.TC.SUPPLIERCREDENTIALS,
	false,
	"companyOfferSupplierCredentials",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYCANCECOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> POLICYCANCECOMPANYOFFERSHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"companyOfferTravelogixCancePolicy",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYAMENCOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> POLICYAMENCOMPANYOFFERSHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"companyOfferTravelogixAmenPolicy",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYPAYMCOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> POLICYPAYMCOMPANYOFFERSHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"companyOfferTravelogixPaymPolicy",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYBOOKCOMPANYOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> POLICYBOOKCOMPANYOFFERSHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"companyOfferTravelogixBookPolicy",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> PRODUCTSHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"productCompanyOffers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EXCLUSIONPRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> EXCLUSIONPRODUCTSHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"exclProductCompanyOffers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COMPANYDEACTIVATEOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CompanyDetails> COMPANYDEACTIVATEOFFERSHANDLER = new OneToManyHandler<CompanyDetails>(
	ClientcoreConstants.TC.COMPANYDETAILS,
	false,
	"deactivateOffersCompany",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CLIENTDEACTIVATEOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ClientDetails> CLIENTDEACTIVATEOFFERSHANDLER = new OneToManyHandler<ClientDetails>(
	ClientcoreConstants.TC.CLIENTDETAILS,
	false,
	"deactivateOffersClient",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OFFERID, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		tmp.put(OFFERNAME, AttributeMode.INITIAL);
		tmp.put(OFFERTYPE, AttributeMode.INITIAL);
		tmp.put(OFFERSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCTSUBCATEGORY, AttributeMode.INITIAL);
		tmp.put(OFFERAPPLICABILITY, AttributeMode.INITIAL);
		tmp.put(LONGDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(REDEMPTIONCOMPANYOFFERS, AttributeMode.INITIAL);
		tmp.put(SHORTDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(FROMBOOKINGDATE, AttributeMode.INITIAL);
		tmp.put(FROMTRAVELSTARTDATE, AttributeMode.INITIAL);
		tmp.put(AFTERTRAVELENDDATE, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(WORKINGDAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(COMPANYOFFERVALUE, AttributeMode.INITIAL);
		tmp.put(RETENTION, AttributeMode.INITIAL);
		tmp.put(FREEDISCOUNTTYPE, AttributeMode.INITIAL);
		tmp.put(COMPANYSLABTYPE, AttributeMode.INITIAL);
		tmp.put(LASTTHREEDIGIT, AttributeMode.INITIAL);
		tmp.put(FIXEDCOMPANYOFFERVALUE, AttributeMode.INITIAL);
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(OFFERINCLUSIONNOTE, AttributeMode.INITIAL);
		tmp.put(OFFEREXCLUSIONNOTE, AttributeMode.INITIAL);
		tmp.put(VOUCHERDETAILS, AttributeMode.INITIAL);
		tmp.put(INTERNALDETAILS, AttributeMode.INITIAL);
		tmp.put(EXTERNALDETAILS, AttributeMode.INITIAL);
		tmp.put(DEACTIVATEOFFER, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(APPROVALSTATUS, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(OFFERVALIDITYFROMDATE, AttributeMode.INITIAL);
		tmp.put(OFFERVALIDITYTODATE, AttributeMode.INITIAL);
		tmp.put(BOOKINGCONFIGOFFER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.afterTravelEndDate</code> attribute.
	 * @return the afterTravelEndDate
	 */
	public Date getAfterTravelEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, AFTERTRAVELENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.afterTravelEndDate</code> attribute.
	 * @return the afterTravelEndDate
	 */
	public Date getAfterTravelEndDate()
	{
		return getAfterTravelEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.afterTravelEndDate</code> attribute. 
	 * @param value the afterTravelEndDate
	 */
	public void setAfterTravelEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, AFTERTRAVELENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.afterTravelEndDate</code> attribute. 
	 * @param value the afterTravelEndDate
	 */
	public void setAfterTravelEndDate(final Date value)
	{
		setAfterTravelEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPROVALSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus()
	{
		return getApprovalStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPROVALSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final EnumerationValue value)
	{
		setApprovalStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.bookingconfigoffer</code> attribute.
	 * @return the bookingconfigoffer
	 */
	public BookingConfiguration getBookingconfigoffer(final SessionContext ctx)
	{
		return (BookingConfiguration)getProperty( ctx, BOOKINGCONFIGOFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.bookingconfigoffer</code> attribute.
	 * @return the bookingconfigoffer
	 */
	public BookingConfiguration getBookingconfigoffer()
	{
		return getBookingconfigoffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.bookingconfigoffer</code> attribute. 
	 * @param value the bookingconfigoffer
	 */
	public void setBookingconfigoffer(final SessionContext ctx, final BookingConfiguration value)
	{
		BOOKINGCONFIGOFFERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.bookingconfigoffer</code> attribute. 
	 * @param value the bookingconfigoffer
	 */
	public void setBookingconfigoffer(final BookingConfiguration value)
	{
		setBookingconfigoffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.bookingDateCompanyOffers</code> attribute.
	 * @return the bookingDateCompanyOffers
	 */
	public Collection<BookingDateValidity> getBookingDateCompanyOffers(final SessionContext ctx)
	{
		return BOOKINGDATECOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.bookingDateCompanyOffers</code> attribute.
	 * @return the bookingDateCompanyOffers
	 */
	public Collection<BookingDateValidity> getBookingDateCompanyOffers()
	{
		return getBookingDateCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.bookingDateCompanyOffers</code> attribute. 
	 * @param value the bookingDateCompanyOffers
	 */
	public void setBookingDateCompanyOffers(final SessionContext ctx, final Collection<BookingDateValidity> value)
	{
		BOOKINGDATECOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.bookingDateCompanyOffers</code> attribute. 
	 * @param value the bookingDateCompanyOffers
	 */
	public void setBookingDateCompanyOffers(final Collection<BookingDateValidity> value)
	{
		setBookingDateCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingDateCompanyOffers. 
	 * @param value the item to add to bookingDateCompanyOffers
	 */
	public void addToBookingDateCompanyOffers(final SessionContext ctx, final BookingDateValidity value)
	{
		BOOKINGDATECOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingDateCompanyOffers. 
	 * @param value the item to add to bookingDateCompanyOffers
	 */
	public void addToBookingDateCompanyOffers(final BookingDateValidity value)
	{
		addToBookingDateCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingDateCompanyOffers. 
	 * @param value the item to remove from bookingDateCompanyOffers
	 */
	public void removeFromBookingDateCompanyOffers(final SessionContext ctx, final BookingDateValidity value)
	{
		BOOKINGDATECOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingDateCompanyOffers. 
	 * @param value the item to remove from bookingDateCompanyOffers
	 */
	public void removeFromBookingDateCompanyOffers(final BookingDateValidity value)
	{
		removeFromBookingDateCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.clientCompanyOffers</code> attribute.
	 * @return the clientCompanyOffers
	 */
	public Collection<ClientDetails> getClientCompanyOffers(final SessionContext ctx)
	{
		final List<ClientDetails> items = getLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			"ClientDetails",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.clientCompanyOffers</code> attribute.
	 * @return the clientCompanyOffers
	 */
	public Collection<ClientDetails> getClientCompanyOffers()
	{
		return getClientCompanyOffers( getSession().getSessionContext() );
	}
	
	public long getClientCompanyOffersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			"ClientDetails",
			null
		);
	}
	
	public long getClientCompanyOffersCount()
	{
		return getClientCompanyOffersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.clientCompanyOffers</code> attribute. 
	 * @param value the clientCompanyOffers
	 */
	public void setClientCompanyOffers(final SessionContext ctx, final Collection<ClientDetails> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2CLIENTDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.clientCompanyOffers</code> attribute. 
	 * @param value the clientCompanyOffers
	 */
	public void setClientCompanyOffers(final Collection<ClientDetails> value)
	{
		setClientCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientCompanyOffers. 
	 * @param value the item to add to clientCompanyOffers
	 */
	public void addToClientCompanyOffers(final SessionContext ctx, final ClientDetails value)
	{
		addLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2CLIENTDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientCompanyOffers. 
	 * @param value the item to add to clientCompanyOffers
	 */
	public void addToClientCompanyOffers(final ClientDetails value)
	{
		addToClientCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientCompanyOffers. 
	 * @param value the item to remove from clientCompanyOffers
	 */
	public void removeFromClientCompanyOffers(final SessionContext ctx, final ClientDetails value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2CLIENTDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientCompanyOffers. 
	 * @param value the item to remove from clientCompanyOffers
	 */
	public void removeFromClientCompanyOffers(final ClientDetails value)
	{
		removeFromClientCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.clientDeactivateOffers</code> attribute.
	 * @return the clientDeactivateOffers
	 */
	public Collection<ClientDetails> getClientDeactivateOffers(final SessionContext ctx)
	{
		return CLIENTDEACTIVATEOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.clientDeactivateOffers</code> attribute.
	 * @return the clientDeactivateOffers
	 */
	public Collection<ClientDetails> getClientDeactivateOffers()
	{
		return getClientDeactivateOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.clientDeactivateOffers</code> attribute. 
	 * @param value the clientDeactivateOffers
	 */
	public void setClientDeactivateOffers(final SessionContext ctx, final Collection<ClientDetails> value)
	{
		CLIENTDEACTIVATEOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.clientDeactivateOffers</code> attribute. 
	 * @param value the clientDeactivateOffers
	 */
	public void setClientDeactivateOffers(final Collection<ClientDetails> value)
	{
		setClientDeactivateOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientDeactivateOffers. 
	 * @param value the item to add to clientDeactivateOffers
	 */
	public void addToClientDeactivateOffers(final SessionContext ctx, final ClientDetails value)
	{
		CLIENTDEACTIVATEOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientDeactivateOffers. 
	 * @param value the item to add to clientDeactivateOffers
	 */
	public void addToClientDeactivateOffers(final ClientDetails value)
	{
		addToClientDeactivateOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientDeactivateOffers. 
	 * @param value the item to remove from clientDeactivateOffers
	 */
	public void removeFromClientDeactivateOffers(final SessionContext ctx, final ClientDetails value)
	{
		CLIENTDEACTIVATEOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientDeactivateOffers. 
	 * @param value the item to remove from clientDeactivateOffers
	 */
	public void removeFromClientDeactivateOffers(final ClientDetails value)
	{
		removeFromClientDeactivateOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.CombineOfferCompanyOffers</code> attribute.
	 * @return the CombineOfferCompanyOffers
	 */
	public Collection<CombineOffer> getCombineOfferCompanyOffers(final SessionContext ctx)
	{
		return COMBINEOFFERCOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.CombineOfferCompanyOffers</code> attribute.
	 * @return the CombineOfferCompanyOffers
	 */
	public Collection<CombineOffer> getCombineOfferCompanyOffers()
	{
		return getCombineOfferCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.CombineOfferCompanyOffers</code> attribute. 
	 * @param value the CombineOfferCompanyOffers
	 */
	public void setCombineOfferCompanyOffers(final SessionContext ctx, final Collection<CombineOffer> value)
	{
		COMBINEOFFERCOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.CombineOfferCompanyOffers</code> attribute. 
	 * @param value the CombineOfferCompanyOffers
	 */
	public void setCombineOfferCompanyOffers(final Collection<CombineOffer> value)
	{
		setCombineOfferCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to CombineOfferCompanyOffers. 
	 * @param value the item to add to CombineOfferCompanyOffers
	 */
	public void addToCombineOfferCompanyOffers(final SessionContext ctx, final CombineOffer value)
	{
		COMBINEOFFERCOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to CombineOfferCompanyOffers. 
	 * @param value the item to add to CombineOfferCompanyOffers
	 */
	public void addToCombineOfferCompanyOffers(final CombineOffer value)
	{
		addToCombineOfferCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from CombineOfferCompanyOffers. 
	 * @param value the item to remove from CombineOfferCompanyOffers
	 */
	public void removeFromCombineOfferCompanyOffers(final SessionContext ctx, final CombineOffer value)
	{
		COMBINEOFFERCOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from CombineOfferCompanyOffers. 
	 * @param value the item to remove from CombineOfferCompanyOffers
	 */
	public void removeFromCombineOfferCompanyOffers(final CombineOffer value)
	{
		removeFromCombineOfferCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.combineOffers</code> attribute.
	 * @return the combineOffers
	 */
	public Collection<CompanyOffers> getCombineOffers(final SessionContext ctx)
	{
		final List<CompanyOffers> items = getLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			"CompanyOffers",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.combineOffers</code> attribute.
	 * @return the combineOffers
	 */
	public Collection<CompanyOffers> getCombineOffers()
	{
		return getCombineOffers( getSession().getSessionContext() );
	}
	
	public long getCombineOffersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			"CompanyOffers",
			null
		);
	}
	
	public long getCombineOffersCount()
	{
		return getCombineOffersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.combineOffers</code> attribute. 
	 * @param value the combineOffers
	 */
	public void setCombineOffers(final SessionContext ctx, final Collection<CompanyOffers> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYOFFERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.combineOffers</code> attribute. 
	 * @param value the combineOffers
	 */
	public void setCombineOffers(final Collection<CompanyOffers> value)
	{
		setCombineOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to combineOffers. 
	 * @param value the item to add to combineOffers
	 */
	public void addToCombineOffers(final SessionContext ctx, final CompanyOffers value)
	{
		addLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYOFFERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to combineOffers. 
	 * @param value the item to add to combineOffers
	 */
	public void addToCombineOffers(final CompanyOffers value)
	{
		addToCombineOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from combineOffers. 
	 * @param value the item to remove from combineOffers
	 */
	public void removeFromCombineOffers(final SessionContext ctx, final CompanyOffers value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYOFFERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from combineOffers. 
	 * @param value the item to remove from combineOffers
	 */
	public void removeFromCombineOffers(final CompanyOffers value)
	{
		removeFromCombineOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companyDeactivateOffers</code> attribute.
	 * @return the companyDeactivateOffers
	 */
	public Collection<CompanyDetails> getCompanyDeactivateOffers(final SessionContext ctx)
	{
		return COMPANYDEACTIVATEOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companyDeactivateOffers</code> attribute.
	 * @return the companyDeactivateOffers
	 */
	public Collection<CompanyDetails> getCompanyDeactivateOffers()
	{
		return getCompanyDeactivateOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companyDeactivateOffers</code> attribute. 
	 * @param value the companyDeactivateOffers
	 */
	public void setCompanyDeactivateOffers(final SessionContext ctx, final Collection<CompanyDetails> value)
	{
		COMPANYDEACTIVATEOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companyDeactivateOffers</code> attribute. 
	 * @param value the companyDeactivateOffers
	 */
	public void setCompanyDeactivateOffers(final Collection<CompanyDetails> value)
	{
		setCompanyDeactivateOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyDeactivateOffers. 
	 * @param value the item to add to companyDeactivateOffers
	 */
	public void addToCompanyDeactivateOffers(final SessionContext ctx, final CompanyDetails value)
	{
		COMPANYDEACTIVATEOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyDeactivateOffers. 
	 * @param value the item to add to companyDeactivateOffers
	 */
	public void addToCompanyDeactivateOffers(final CompanyDetails value)
	{
		addToCompanyDeactivateOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyDeactivateOffers. 
	 * @param value the item to remove from companyDeactivateOffers
	 */
	public void removeFromCompanyDeactivateOffers(final SessionContext ctx, final CompanyDetails value)
	{
		COMPANYDEACTIVATEOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyDeactivateOffers. 
	 * @param value the item to remove from companyDeactivateOffers
	 */
	public void removeFromCompanyDeactivateOffers(final CompanyDetails value)
	{
		removeFromCompanyDeactivateOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companyOffers</code> attribute.
	 * @return the companyOffers
	 */
	public Collection<CompanyOffers> getCompanyOffers(final SessionContext ctx)
	{
		final List<CompanyOffers> items = getLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			"CompanyOffers",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companyOffers</code> attribute.
	 * @return the companyOffers
	 */
	public Collection<CompanyOffers> getCompanyOffers()
	{
		return getCompanyOffers( getSession().getSessionContext() );
	}
	
	public long getCompanyOffersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			"CompanyOffers",
			null
		);
	}
	
	public long getCompanyOffersCount()
	{
		return getCompanyOffersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companyOffers</code> attribute. 
	 * @param value the companyOffers
	 */
	public void setCompanyOffers(final SessionContext ctx, final Collection<CompanyOffers> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYOFFERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companyOffers</code> attribute. 
	 * @param value the companyOffers
	 */
	public void setCompanyOffers(final Collection<CompanyOffers> value)
	{
		setCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyOffers. 
	 * @param value the item to add to companyOffers
	 */
	public void addToCompanyOffers(final SessionContext ctx, final CompanyOffers value)
	{
		addLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYOFFERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyOffers. 
	 * @param value the item to add to companyOffers
	 */
	public void addToCompanyOffers(final CompanyOffers value)
	{
		addToCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyOffers. 
	 * @param value the item to remove from companyOffers
	 */
	public void removeFromCompanyOffers(final SessionContext ctx, final CompanyOffers value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYOFFERS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYOFFERS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyOffers. 
	 * @param value the item to remove from companyOffers
	 */
	public void removeFromCompanyOffers(final CompanyOffers value)
	{
		removeFromCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companyOffersCompany</code> attribute.
	 * @return the companyOffersCompany
	 */
	public Collection<CompanyDetails> getCompanyOffersCompany(final SessionContext ctx)
	{
		final List<CompanyDetails> items = getLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			"CompanyDetails",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companyOffersCompany</code> attribute.
	 * @return the companyOffersCompany
	 */
	public Collection<CompanyDetails> getCompanyOffersCompany()
	{
		return getCompanyOffersCompany( getSession().getSessionContext() );
	}
	
	public long getCompanyOffersCompanyCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			"CompanyDetails",
			null
		);
	}
	
	public long getCompanyOffersCompanyCount()
	{
		return getCompanyOffersCompanyCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companyOffersCompany</code> attribute. 
	 * @param value the companyOffersCompany
	 */
	public void setCompanyOffersCompany(final SessionContext ctx, final Collection<CompanyDetails> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companyOffersCompany</code> attribute. 
	 * @param value the companyOffersCompany
	 */
	public void setCompanyOffersCompany(final Collection<CompanyDetails> value)
	{
		setCompanyOffersCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyOffersCompany. 
	 * @param value the item to add to companyOffersCompany
	 */
	public void addToCompanyOffersCompany(final SessionContext ctx, final CompanyDetails value)
	{
		addLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyOffersCompany. 
	 * @param value the item to add to companyOffersCompany
	 */
	public void addToCompanyOffersCompany(final CompanyDetails value)
	{
		addToCompanyOffersCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyOffersCompany. 
	 * @param value the item to remove from companyOffersCompany
	 */
	public void removeFromCompanyOffersCompany(final SessionContext ctx, final CompanyDetails value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyOffersCompany. 
	 * @param value the item to remove from companyOffersCompany
	 */
	public void removeFromCompanyOffersCompany(final CompanyDetails value)
	{
		removeFromCompanyOffersCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companyOfferValue</code> attribute.
	 * @return the companyOfferValue
	 */
	public EnumerationValue getCompanyOfferValue(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYOFFERVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companyOfferValue</code> attribute.
	 * @return the companyOfferValue
	 */
	public EnumerationValue getCompanyOfferValue()
	{
		return getCompanyOfferValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companyOfferValue</code> attribute. 
	 * @param value the companyOfferValue
	 */
	public void setCompanyOfferValue(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYOFFERVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companyOfferValue</code> attribute. 
	 * @param value the companyOfferValue
	 */
	public void setCompanyOfferValue(final EnumerationValue value)
	{
		setCompanyOfferValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companySlabType</code> attribute.
	 * @return the companySlabType
	 */
	public CompanySlabType getCompanySlabType(final SessionContext ctx)
	{
		return (CompanySlabType)getProperty( ctx, COMPANYSLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.companySlabType</code> attribute.
	 * @return the companySlabType
	 */
	public CompanySlabType getCompanySlabType()
	{
		return getCompanySlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companySlabType</code> attribute. 
	 * @param value the companySlabType
	 */
	public void setCompanySlabType(final SessionContext ctx, final CompanySlabType value)
	{
		setProperty(ctx, COMPANYSLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.companySlabType</code> attribute. 
	 * @param value the companySlabType
	 */
	public void setCompanySlabType(final CompanySlabType value)
	{
		setCompanySlabType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.copiedFrom</code> attribute.
	 * @return the copiedFrom
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.copiedFrom</code> attribute.
	 * @return the copiedFrom
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.copiedFrom</code> attribute. 
	 * @param value the copiedFrom
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.copiedFrom</code> attribute. 
	 * @param value the copiedFrom
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BOOKINGCONFIGOFFERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.dateRange</code> attribute.
	 * @return the dateRange
	 */
	public DateRange getDateRange(final SessionContext ctx)
	{
		return (DateRange)getProperty( ctx, DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.dateRange</code> attribute.
	 * @return the dateRange
	 */
	public DateRange getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.dateRange</code> attribute. 
	 * @param value the dateRange
	 */
	public void setDateRange(final SessionContext ctx, final DateRange value)
	{
		setProperty(ctx, DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.dateRange</code> attribute. 
	 * @param value the dateRange
	 */
	public void setDateRange(final DateRange value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.deactivateOffer</code> attribute.
	 * @return the deactivateOffer
	 */
	public DeactivateOffer getDeactivateOffer(final SessionContext ctx)
	{
		return (DeactivateOffer)getProperty( ctx, DEACTIVATEOFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.deactivateOffer</code> attribute.
	 * @return the deactivateOffer
	 */
	public DeactivateOffer getDeactivateOffer()
	{
		return getDeactivateOffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.deactivateOffer</code> attribute. 
	 * @param value the deactivateOffer
	 */
	public void setDeactivateOffer(final SessionContext ctx, final DeactivateOffer value)
	{
		setProperty(ctx, DEACTIVATEOFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.deactivateOffer</code> attribute. 
	 * @param value the deactivateOffer
	 */
	public void setDeactivateOffer(final DeactivateOffer value)
	{
		setDeactivateOffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.eligibilityConditionCompanyOffers</code> attribute.
	 * @return the eligibilityConditionCompanyOffers
	 */
	public Collection<OfferEligibilityCondition> getEligibilityConditionCompanyOffers(final SessionContext ctx)
	{
		return ELIGIBILITYCONDITIONCOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.eligibilityConditionCompanyOffers</code> attribute.
	 * @return the eligibilityConditionCompanyOffers
	 */
	public Collection<OfferEligibilityCondition> getEligibilityConditionCompanyOffers()
	{
		return getEligibilityConditionCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.eligibilityConditionCompanyOffers</code> attribute. 
	 * @param value the eligibilityConditionCompanyOffers
	 */
	public void setEligibilityConditionCompanyOffers(final SessionContext ctx, final Collection<OfferEligibilityCondition> value)
	{
		ELIGIBILITYCONDITIONCOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.eligibilityConditionCompanyOffers</code> attribute. 
	 * @param value the eligibilityConditionCompanyOffers
	 */
	public void setEligibilityConditionCompanyOffers(final Collection<OfferEligibilityCondition> value)
	{
		setEligibilityConditionCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eligibilityConditionCompanyOffers. 
	 * @param value the item to add to eligibilityConditionCompanyOffers
	 */
	public void addToEligibilityConditionCompanyOffers(final SessionContext ctx, final OfferEligibilityCondition value)
	{
		ELIGIBILITYCONDITIONCOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eligibilityConditionCompanyOffers. 
	 * @param value the item to add to eligibilityConditionCompanyOffers
	 */
	public void addToEligibilityConditionCompanyOffers(final OfferEligibilityCondition value)
	{
		addToEligibilityConditionCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eligibilityConditionCompanyOffers. 
	 * @param value the item to remove from eligibilityConditionCompanyOffers
	 */
	public void removeFromEligibilityConditionCompanyOffers(final SessionContext ctx, final OfferEligibilityCondition value)
	{
		ELIGIBILITYCONDITIONCOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eligibilityConditionCompanyOffers. 
	 * @param value the item to remove from eligibilityConditionCompanyOffers
	 */
	public void removeFromEligibilityConditionCompanyOffers(final OfferEligibilityCondition value)
	{
		removeFromEligibilityConditionCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.exclusionProducts</code> attribute.
	 * @return the exclusionProducts
	 */
	public Collection<Product> getExclusionProducts(final SessionContext ctx)
	{
		return EXCLUSIONPRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.exclusionProducts</code> attribute.
	 * @return the exclusionProducts
	 */
	public Collection<Product> getExclusionProducts()
	{
		return getExclusionProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.exclusionProducts</code> attribute. 
	 * @param value the exclusionProducts
	 */
	public void setExclusionProducts(final SessionContext ctx, final Collection<Product> value)
	{
		EXCLUSIONPRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.exclusionProducts</code> attribute. 
	 * @param value the exclusionProducts
	 */
	public void setExclusionProducts(final Collection<Product> value)
	{
		setExclusionProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exclusionProducts. 
	 * @param value the item to add to exclusionProducts
	 */
	public void addToExclusionProducts(final SessionContext ctx, final Product value)
	{
		EXCLUSIONPRODUCTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exclusionProducts. 
	 * @param value the item to add to exclusionProducts
	 */
	public void addToExclusionProducts(final Product value)
	{
		addToExclusionProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exclusionProducts. 
	 * @param value the item to remove from exclusionProducts
	 */
	public void removeFromExclusionProducts(final SessionContext ctx, final Product value)
	{
		EXCLUSIONPRODUCTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exclusionProducts. 
	 * @param value the item to remove from exclusionProducts
	 */
	public void removeFromExclusionProducts(final Product value)
	{
		removeFromExclusionProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.externalDetails</code> attribute.
	 * @return the externalDetails
	 */
	public String getExternalDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXTERNALDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.externalDetails</code> attribute.
	 * @return the externalDetails
	 */
	public String getExternalDetails()
	{
		return getExternalDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.externalDetails</code> attribute. 
	 * @param value the externalDetails
	 */
	public void setExternalDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXTERNALDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.externalDetails</code> attribute. 
	 * @param value the externalDetails
	 */
	public void setExternalDetails(final String value)
	{
		setExternalDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.fixedCompanyOfferValue</code> attribute.
	 * @return the fixedCompanyOfferValue
	 */
	public FixedCompanyOfferValueType getFixedCompanyOfferValue(final SessionContext ctx)
	{
		return (FixedCompanyOfferValueType)getProperty( ctx, FIXEDCOMPANYOFFERVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.fixedCompanyOfferValue</code> attribute.
	 * @return the fixedCompanyOfferValue
	 */
	public FixedCompanyOfferValueType getFixedCompanyOfferValue()
	{
		return getFixedCompanyOfferValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.fixedCompanyOfferValue</code> attribute. 
	 * @param value the fixedCompanyOfferValue
	 */
	public void setFixedCompanyOfferValue(final SessionContext ctx, final FixedCompanyOfferValueType value)
	{
		setProperty(ctx, FIXEDCOMPANYOFFERVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.fixedCompanyOfferValue</code> attribute. 
	 * @param value the fixedCompanyOfferValue
	 */
	public void setFixedCompanyOfferValue(final FixedCompanyOfferValueType value)
	{
		setFixedCompanyOfferValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.freeDiscountType</code> attribute.
	 * @return the freeDiscountType
	 */
	public FreeOrDiscountedOfferType getFreeDiscountType(final SessionContext ctx)
	{
		return (FreeOrDiscountedOfferType)getProperty( ctx, FREEDISCOUNTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.freeDiscountType</code> attribute.
	 * @return the freeDiscountType
	 */
	public FreeOrDiscountedOfferType getFreeDiscountType()
	{
		return getFreeDiscountType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.freeDiscountType</code> attribute. 
	 * @param value the freeDiscountType
	 */
	public void setFreeDiscountType(final SessionContext ctx, final FreeOrDiscountedOfferType value)
	{
		setProperty(ctx, FREEDISCOUNTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.freeDiscountType</code> attribute. 
	 * @param value the freeDiscountType
	 */
	public void setFreeDiscountType(final FreeOrDiscountedOfferType value)
	{
		setFreeDiscountType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.fromBookingDate</code> attribute.
	 * @return the fromBookingDate
	 */
	public Date getFromBookingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FROMBOOKINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.fromBookingDate</code> attribute.
	 * @return the fromBookingDate
	 */
	public Date getFromBookingDate()
	{
		return getFromBookingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.fromBookingDate</code> attribute. 
	 * @param value the fromBookingDate
	 */
	public void setFromBookingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FROMBOOKINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.fromBookingDate</code> attribute. 
	 * @param value the fromBookingDate
	 */
	public void setFromBookingDate(final Date value)
	{
		setFromBookingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.fromTravelStartDate</code> attribute.
	 * @return the fromTravelStartDate
	 */
	public Date getFromTravelStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FROMTRAVELSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.fromTravelStartDate</code> attribute.
	 * @return the fromTravelStartDate
	 */
	public Date getFromTravelStartDate()
	{
		return getFromTravelStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.fromTravelStartDate</code> attribute. 
	 * @param value the fromTravelStartDate
	 */
	public void setFromTravelStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FROMTRAVELSTARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.fromTravelStartDate</code> attribute. 
	 * @param value the fromTravelStartDate
	 */
	public void setFromTravelStartDate(final Date value)
	{
		setFromTravelStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.internalDetails</code> attribute.
	 * @return the internalDetails
	 */
	public String getInternalDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERNALDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.internalDetails</code> attribute.
	 * @return the internalDetails
	 */
	public String getInternalDetails()
	{
		return getInternalDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.internalDetails</code> attribute. 
	 * @param value the internalDetails
	 */
	public void setInternalDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERNALDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.internalDetails</code> attribute. 
	 * @param value the internalDetails
	 */
	public void setInternalDetails(final String value)
	{
		setInternalDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.lastThreedigit</code> attribute.
	 * @return the lastThreedigit
	 */
	public CreditCardLastThreeDigitType getLastThreedigit(final SessionContext ctx)
	{
		return (CreditCardLastThreeDigitType)getProperty( ctx, LASTTHREEDIGIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.lastThreedigit</code> attribute.
	 * @return the lastThreedigit
	 */
	public CreditCardLastThreeDigitType getLastThreedigit()
	{
		return getLastThreedigit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.lastThreedigit</code> attribute. 
	 * @param value the lastThreedigit
	 */
	public void setLastThreedigit(final SessionContext ctx, final CreditCardLastThreeDigitType value)
	{
		setProperty(ctx, LASTTHREEDIGIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.lastThreedigit</code> attribute. 
	 * @param value the lastThreedigit
	 */
	public void setLastThreedigit(final CreditCardLastThreeDigitType value)
	{
		setLastThreedigit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.longDescription</code> attribute.
	 * @return the longDescription
	 */
	public String getLongDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LONGDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.longDescription</code> attribute.
	 * @return the longDescription
	 */
	public String getLongDescription()
	{
		return getLongDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.longDescription</code> attribute. 
	 * @param value the longDescription
	 */
	public void setLongDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LONGDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.longDescription</code> attribute. 
	 * @param value the longDescription
	 */
	public void setLongDescription(final String value)
	{
		setLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerApplicability</code> attribute.
	 * @return the offerApplicability
	 */
	public EnumerationValue getOfferApplicability(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerApplicability</code> attribute.
	 * @return the offerApplicability
	 */
	public EnumerationValue getOfferApplicability()
	{
		return getOfferApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerApplicability</code> attribute. 
	 * @param value the offerApplicability
	 */
	public void setOfferApplicability(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERAPPLICABILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerApplicability</code> attribute. 
	 * @param value the offerApplicability
	 */
	public void setOfferApplicability(final EnumerationValue value)
	{
		setOfferApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerExclusionNote</code> attribute.
	 * @return the offerExclusionNote
	 */
	public String getOfferExclusionNote(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFEREXCLUSIONNOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerExclusionNote</code> attribute.
	 * @return the offerExclusionNote
	 */
	public String getOfferExclusionNote()
	{
		return getOfferExclusionNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerExclusionNote</code> attribute. 
	 * @param value the offerExclusionNote
	 */
	public void setOfferExclusionNote(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFEREXCLUSIONNOTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerExclusionNote</code> attribute. 
	 * @param value the offerExclusionNote
	 */
	public void setOfferExclusionNote(final String value)
	{
		setOfferExclusionNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerID</code> attribute.
	 * @return the offerID
	 */
	public String getOfferID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerID</code> attribute.
	 * @return the offerID
	 */
	public String getOfferID()
	{
		return getOfferID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerID</code> attribute. 
	 * @param value the offerID
	 */
	public void setOfferID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerID</code> attribute. 
	 * @param value the offerID
	 */
	public void setOfferID(final String value)
	{
		setOfferID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerInclusionNote</code> attribute.
	 * @return the offerInclusionNote
	 */
	public String getOfferInclusionNote(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFERINCLUSIONNOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerInclusionNote</code> attribute.
	 * @return the offerInclusionNote
	 */
	public String getOfferInclusionNote()
	{
		return getOfferInclusionNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerInclusionNote</code> attribute. 
	 * @param value the offerInclusionNote
	 */
	public void setOfferInclusionNote(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFERINCLUSIONNOTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerInclusionNote</code> attribute. 
	 * @param value the offerInclusionNote
	 */
	public void setOfferInclusionNote(final String value)
	{
		setOfferInclusionNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerName</code> attribute.
	 * @return the offerName
	 */
	public String getOfferName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerName</code> attribute.
	 * @return the offerName
	 */
	public String getOfferName()
	{
		return getOfferName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setOfferName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setOfferName(final String value)
	{
		setOfferName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerProductCompanyOffers</code> attribute.
	 * @return the offerProductCompanyOffers
	 */
	public Collection<OfferProduct> getOfferProductCompanyOffers(final SessionContext ctx)
	{
		return OFFERPRODUCTCOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerProductCompanyOffers</code> attribute.
	 * @return the offerProductCompanyOffers
	 */
	public Collection<OfferProduct> getOfferProductCompanyOffers()
	{
		return getOfferProductCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerProductCompanyOffers</code> attribute. 
	 * @param value the offerProductCompanyOffers
	 */
	public void setOfferProductCompanyOffers(final SessionContext ctx, final Collection<OfferProduct> value)
	{
		OFFERPRODUCTCOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerProductCompanyOffers</code> attribute. 
	 * @param value the offerProductCompanyOffers
	 */
	public void setOfferProductCompanyOffers(final Collection<OfferProduct> value)
	{
		setOfferProductCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to offerProductCompanyOffers. 
	 * @param value the item to add to offerProductCompanyOffers
	 */
	public void addToOfferProductCompanyOffers(final SessionContext ctx, final OfferProduct value)
	{
		OFFERPRODUCTCOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to offerProductCompanyOffers. 
	 * @param value the item to add to offerProductCompanyOffers
	 */
	public void addToOfferProductCompanyOffers(final OfferProduct value)
	{
		addToOfferProductCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from offerProductCompanyOffers. 
	 * @param value the item to remove from offerProductCompanyOffers
	 */
	public void removeFromOfferProductCompanyOffers(final SessionContext ctx, final OfferProduct value)
	{
		OFFERPRODUCTCOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from offerProductCompanyOffers. 
	 * @param value the item to remove from offerProductCompanyOffers
	 */
	public void removeFromOfferProductCompanyOffers(final OfferProduct value)
	{
		removeFromOfferProductCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerSubType</code> attribute.
	 * @return the offerSubType
	 */
	public EnumerationValue getOfferSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerSubType</code> attribute.
	 * @return the offerSubType
	 */
	public EnumerationValue getOfferSubType()
	{
		return getOfferSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerSubType</code> attribute. 
	 * @param value the offerSubType
	 */
	public void setOfferSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerSubType</code> attribute. 
	 * @param value the offerSubType
	 */
	public void setOfferSubType(final EnumerationValue value)
	{
		setOfferSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerType</code> attribute.
	 * @return the offerType
	 */
	public EnumerationValue getOfferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerType</code> attribute.
	 * @return the offerType
	 */
	public EnumerationValue getOfferType()
	{
		return getOfferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerType</code> attribute. 
	 * @param value the offerType
	 */
	public void setOfferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerType</code> attribute. 
	 * @param value the offerType
	 */
	public void setOfferType(final EnumerationValue value)
	{
		setOfferType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerValidityFromDate</code> attribute.
	 * @return the offerValidityFromDate
	 */
	public Date getOfferValidityFromDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFERVALIDITYFROMDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerValidityFromDate</code> attribute.
	 * @return the offerValidityFromDate
	 */
	public Date getOfferValidityFromDate()
	{
		return getOfferValidityFromDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerValidityFromDate</code> attribute. 
	 * @param value the offerValidityFromDate
	 */
	public void setOfferValidityFromDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFERVALIDITYFROMDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerValidityFromDate</code> attribute. 
	 * @param value the offerValidityFromDate
	 */
	public void setOfferValidityFromDate(final Date value)
	{
		setOfferValidityFromDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerValidityToDate</code> attribute.
	 * @return the offerValidityToDate
	 */
	public Date getOfferValidityToDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFERVALIDITYTODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.offerValidityToDate</code> attribute.
	 * @return the offerValidityToDate
	 */
	public Date getOfferValidityToDate()
	{
		return getOfferValidityToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerValidityToDate</code> attribute. 
	 * @param value the offerValidityToDate
	 */
	public void setOfferValidityToDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFERVALIDITYTODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.offerValidityToDate</code> attribute. 
	 * @param value the offerValidityToDate
	 */
	public void setOfferValidityToDate(final Date value)
	{
		setOfferValidityToDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.policyAmenCompanyOffers</code> attribute.
	 * @return the policyAmenCompanyOffers
	 */
	public Collection<TravelogixPolicy> getPolicyAmenCompanyOffers(final SessionContext ctx)
	{
		return POLICYAMENCOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.policyAmenCompanyOffers</code> attribute.
	 * @return the policyAmenCompanyOffers
	 */
	public Collection<TravelogixPolicy> getPolicyAmenCompanyOffers()
	{
		return getPolicyAmenCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.policyAmenCompanyOffers</code> attribute. 
	 * @param value the policyAmenCompanyOffers
	 */
	public void setPolicyAmenCompanyOffers(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		POLICYAMENCOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.policyAmenCompanyOffers</code> attribute. 
	 * @param value the policyAmenCompanyOffers
	 */
	public void setPolicyAmenCompanyOffers(final Collection<TravelogixPolicy> value)
	{
		setPolicyAmenCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyAmenCompanyOffers. 
	 * @param value the item to add to policyAmenCompanyOffers
	 */
	public void addToPolicyAmenCompanyOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYAMENCOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyAmenCompanyOffers. 
	 * @param value the item to add to policyAmenCompanyOffers
	 */
	public void addToPolicyAmenCompanyOffers(final TravelogixPolicy value)
	{
		addToPolicyAmenCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyAmenCompanyOffers. 
	 * @param value the item to remove from policyAmenCompanyOffers
	 */
	public void removeFromPolicyAmenCompanyOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYAMENCOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyAmenCompanyOffers. 
	 * @param value the item to remove from policyAmenCompanyOffers
	 */
	public void removeFromPolicyAmenCompanyOffers(final TravelogixPolicy value)
	{
		removeFromPolicyAmenCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.policyBookCompanyOffers</code> attribute.
	 * @return the policyBookCompanyOffers
	 */
	public Collection<TravelogixPolicy> getPolicyBookCompanyOffers(final SessionContext ctx)
	{
		return POLICYBOOKCOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.policyBookCompanyOffers</code> attribute.
	 * @return the policyBookCompanyOffers
	 */
	public Collection<TravelogixPolicy> getPolicyBookCompanyOffers()
	{
		return getPolicyBookCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.policyBookCompanyOffers</code> attribute. 
	 * @param value the policyBookCompanyOffers
	 */
	public void setPolicyBookCompanyOffers(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		POLICYBOOKCOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.policyBookCompanyOffers</code> attribute. 
	 * @param value the policyBookCompanyOffers
	 */
	public void setPolicyBookCompanyOffers(final Collection<TravelogixPolicy> value)
	{
		setPolicyBookCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyBookCompanyOffers. 
	 * @param value the item to add to policyBookCompanyOffers
	 */
	public void addToPolicyBookCompanyOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYBOOKCOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyBookCompanyOffers. 
	 * @param value the item to add to policyBookCompanyOffers
	 */
	public void addToPolicyBookCompanyOffers(final TravelogixPolicy value)
	{
		addToPolicyBookCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyBookCompanyOffers. 
	 * @param value the item to remove from policyBookCompanyOffers
	 */
	public void removeFromPolicyBookCompanyOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYBOOKCOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyBookCompanyOffers. 
	 * @param value the item to remove from policyBookCompanyOffers
	 */
	public void removeFromPolicyBookCompanyOffers(final TravelogixPolicy value)
	{
		removeFromPolicyBookCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.policyCanceCompanyOffers</code> attribute.
	 * @return the policyCanceCompanyOffers
	 */
	public Collection<TravelogixPolicy> getPolicyCanceCompanyOffers(final SessionContext ctx)
	{
		return POLICYCANCECOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.policyCanceCompanyOffers</code> attribute.
	 * @return the policyCanceCompanyOffers
	 */
	public Collection<TravelogixPolicy> getPolicyCanceCompanyOffers()
	{
		return getPolicyCanceCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.policyCanceCompanyOffers</code> attribute. 
	 * @param value the policyCanceCompanyOffers
	 */
	public void setPolicyCanceCompanyOffers(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		POLICYCANCECOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.policyCanceCompanyOffers</code> attribute. 
	 * @param value the policyCanceCompanyOffers
	 */
	public void setPolicyCanceCompanyOffers(final Collection<TravelogixPolicy> value)
	{
		setPolicyCanceCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyCanceCompanyOffers. 
	 * @param value the item to add to policyCanceCompanyOffers
	 */
	public void addToPolicyCanceCompanyOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYCANCECOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyCanceCompanyOffers. 
	 * @param value the item to add to policyCanceCompanyOffers
	 */
	public void addToPolicyCanceCompanyOffers(final TravelogixPolicy value)
	{
		addToPolicyCanceCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyCanceCompanyOffers. 
	 * @param value the item to remove from policyCanceCompanyOffers
	 */
	public void removeFromPolicyCanceCompanyOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYCANCECOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyCanceCompanyOffers. 
	 * @param value the item to remove from policyCanceCompanyOffers
	 */
	public void removeFromPolicyCanceCompanyOffers(final TravelogixPolicy value)
	{
		removeFromPolicyCanceCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.policyPaymCompanyOffers</code> attribute.
	 * @return the policyPaymCompanyOffers
	 */
	public Collection<TravelogixPolicy> getPolicyPaymCompanyOffers(final SessionContext ctx)
	{
		return POLICYPAYMCOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.policyPaymCompanyOffers</code> attribute.
	 * @return the policyPaymCompanyOffers
	 */
	public Collection<TravelogixPolicy> getPolicyPaymCompanyOffers()
	{
		return getPolicyPaymCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.policyPaymCompanyOffers</code> attribute. 
	 * @param value the policyPaymCompanyOffers
	 */
	public void setPolicyPaymCompanyOffers(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		POLICYPAYMCOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.policyPaymCompanyOffers</code> attribute. 
	 * @param value the policyPaymCompanyOffers
	 */
	public void setPolicyPaymCompanyOffers(final Collection<TravelogixPolicy> value)
	{
		setPolicyPaymCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyPaymCompanyOffers. 
	 * @param value the item to add to policyPaymCompanyOffers
	 */
	public void addToPolicyPaymCompanyOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYPAYMCOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyPaymCompanyOffers. 
	 * @param value the item to add to policyPaymCompanyOffers
	 */
	public void addToPolicyPaymCompanyOffers(final TravelogixPolicy value)
	{
		addToPolicyPaymCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyPaymCompanyOffers. 
	 * @param value the item to remove from policyPaymCompanyOffers
	 */
	public void removeFromPolicyPaymCompanyOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYPAYMCOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyPaymCompanyOffers. 
	 * @param value the item to remove from policyPaymCompanyOffers
	 */
	public void removeFromPolicyPaymCompanyOffers(final TravelogixPolicy value)
	{
		removeFromPolicyPaymCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts(final SessionContext ctx)
	{
		return PRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<Product> value)
	{
		PRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Collection<Product> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final Product value)
	{
		PRODUCTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final Product value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final Product value)
	{
		PRODUCTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final Product value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.productSubCategory</code> attribute.
	 * @return the productSubCategory
	 */
	public ProductCategorySubType getProductSubCategory(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTSUBCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.productSubCategory</code> attribute.
	 * @return the productSubCategory
	 */
	public ProductCategorySubType getProductSubCategory()
	{
		return getProductSubCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.productSubCategory</code> attribute. 
	 * @param value the productSubCategory
	 */
	public void setProductSubCategory(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTSUBCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.productSubCategory</code> attribute. 
	 * @param value the productSubCategory
	 */
	public void setProductSubCategory(final ProductCategorySubType value)
	{
		setProductSubCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.redemptionCompanyOffers</code> attribute.
	 * @return the redemptionCompanyOffers
	 */
	public RedemptionCompanyOffers getRedemptionCompanyOffers(final SessionContext ctx)
	{
		return (RedemptionCompanyOffers)getProperty( ctx, REDEMPTIONCOMPANYOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.redemptionCompanyOffers</code> attribute.
	 * @return the redemptionCompanyOffers
	 */
	public RedemptionCompanyOffers getRedemptionCompanyOffers()
	{
		return getRedemptionCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.redemptionCompanyOffers</code> attribute. 
	 * @param value the redemptionCompanyOffers
	 */
	public void setRedemptionCompanyOffers(final SessionContext ctx, final RedemptionCompanyOffers value)
	{
		setProperty(ctx, REDEMPTIONCOMPANYOFFERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.redemptionCompanyOffers</code> attribute. 
	 * @param value the redemptionCompanyOffers
	 */
	public void setRedemptionCompanyOffers(final RedemptionCompanyOffers value)
	{
		setRedemptionCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.retention</code> attribute.
	 * @return the retention
	 */
	public Retention getRetention(final SessionContext ctx)
	{
		return (Retention)getProperty( ctx, RETENTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.retention</code> attribute.
	 * @return the retention
	 */
	public Retention getRetention()
	{
		return getRetention( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.retention</code> attribute. 
	 * @param value the retention
	 */
	public void setRetention(final SessionContext ctx, final Retention value)
	{
		setProperty(ctx, RETENTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.retention</code> attribute. 
	 * @param value the retention
	 */
	public void setRetention(final Retention value)
	{
		setRetention( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.shortDescription</code> attribute.
	 * @return the shortDescription
	 */
	public String getShortDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHORTDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.shortDescription</code> attribute.
	 * @return the shortDescription
	 */
	public String getShortDescription()
	{
		return getShortDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.shortDescription</code> attribute. 
	 * @param value the shortDescription
	 */
	public void setShortDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHORTDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.shortDescription</code> attribute. 
	 * @param value the shortDescription
	 */
	public void setShortDescription(final String value)
	{
		setShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.supplierCredentialsCompanyOffers</code> attribute.
	 * @return the supplierCredentialsCompanyOffers
	 */
	public Collection<SupplierCredentials> getSupplierCredentialsCompanyOffers(final SessionContext ctx)
	{
		return SUPPLIERCREDENTIALSCOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.supplierCredentialsCompanyOffers</code> attribute.
	 * @return the supplierCredentialsCompanyOffers
	 */
	public Collection<SupplierCredentials> getSupplierCredentialsCompanyOffers()
	{
		return getSupplierCredentialsCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.supplierCredentialsCompanyOffers</code> attribute. 
	 * @param value the supplierCredentialsCompanyOffers
	 */
	public void setSupplierCredentialsCompanyOffers(final SessionContext ctx, final Collection<SupplierCredentials> value)
	{
		SUPPLIERCREDENTIALSCOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.supplierCredentialsCompanyOffers</code> attribute. 
	 * @param value the supplierCredentialsCompanyOffers
	 */
	public void setSupplierCredentialsCompanyOffers(final Collection<SupplierCredentials> value)
	{
		setSupplierCredentialsCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierCredentialsCompanyOffers. 
	 * @param value the item to add to supplierCredentialsCompanyOffers
	 */
	public void addToSupplierCredentialsCompanyOffers(final SessionContext ctx, final SupplierCredentials value)
	{
		SUPPLIERCREDENTIALSCOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierCredentialsCompanyOffers. 
	 * @param value the item to add to supplierCredentialsCompanyOffers
	 */
	public void addToSupplierCredentialsCompanyOffers(final SupplierCredentials value)
	{
		addToSupplierCredentialsCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierCredentialsCompanyOffers. 
	 * @param value the item to remove from supplierCredentialsCompanyOffers
	 */
	public void removeFromSupplierCredentialsCompanyOffers(final SessionContext ctx, final SupplierCredentials value)
	{
		SUPPLIERCREDENTIALSCOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierCredentialsCompanyOffers. 
	 * @param value the item to remove from supplierCredentialsCompanyOffers
	 */
	public void removeFromSupplierCredentialsCompanyOffers(final SupplierCredentials value)
	{
		removeFromSupplierCredentialsCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.travelDateCompanyOffers</code> attribute.
	 * @return the travelDateCompanyOffers
	 */
	public Collection<TravelDateValidity> getTravelDateCompanyOffers(final SessionContext ctx)
	{
		return TRAVELDATECOMPANYOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.travelDateCompanyOffers</code> attribute.
	 * @return the travelDateCompanyOffers
	 */
	public Collection<TravelDateValidity> getTravelDateCompanyOffers()
	{
		return getTravelDateCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.travelDateCompanyOffers</code> attribute. 
	 * @param value the travelDateCompanyOffers
	 */
	public void setTravelDateCompanyOffers(final SessionContext ctx, final Collection<TravelDateValidity> value)
	{
		TRAVELDATECOMPANYOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.travelDateCompanyOffers</code> attribute. 
	 * @param value the travelDateCompanyOffers
	 */
	public void setTravelDateCompanyOffers(final Collection<TravelDateValidity> value)
	{
		setTravelDateCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDateCompanyOffers. 
	 * @param value the item to add to travelDateCompanyOffers
	 */
	public void addToTravelDateCompanyOffers(final SessionContext ctx, final TravelDateValidity value)
	{
		TRAVELDATECOMPANYOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDateCompanyOffers. 
	 * @param value the item to add to travelDateCompanyOffers
	 */
	public void addToTravelDateCompanyOffers(final TravelDateValidity value)
	{
		addToTravelDateCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDateCompanyOffers. 
	 * @param value the item to remove from travelDateCompanyOffers
	 */
	public void removeFromTravelDateCompanyOffers(final SessionContext ctx, final TravelDateValidity value)
	{
		TRAVELDATECOMPANYOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDateCompanyOffers. 
	 * @param value the item to remove from travelDateCompanyOffers
	 */
	public void removeFromTravelDateCompanyOffers(final TravelDateValidity value)
	{
		removeFromTravelDateCompanyOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.value</code> attribute.
	 * @return the value
	 */
	public String getValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.value</code> attribute.
	 * @return the value
	 */
	public String getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final String value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.voucherDetails</code> attribute.
	 * @return the voucherDetails
	 */
	public String getVoucherDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VOUCHERDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.voucherDetails</code> attribute.
	 * @return the voucherDetails
	 */
	public String getVoucherDetails()
	{
		return getVoucherDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.voucherDetails</code> attribute. 
	 * @param value the voucherDetails
	 */
	public void setVoucherDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VOUCHERDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.voucherDetails</code> attribute. 
	 * @param value the voucherDetails
	 */
	public void setVoucherDetails(final String value)
	{
		setVoucherDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.workingDaysOfWeek</code> attribute.
	 * @return the workingDaysOfWeek
	 */
	public Collection<EnumerationValue> getWorkingDaysOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, WORKINGDAYSOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyOffers.workingDaysOfWeek</code> attribute.
	 * @return the workingDaysOfWeek
	 */
	public Collection<EnumerationValue> getWorkingDaysOfWeek()
	{
		return getWorkingDaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.workingDaysOfWeek</code> attribute. 
	 * @param value the workingDaysOfWeek
	 */
	public void setWorkingDaysOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, WORKINGDAYSOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyOffers.workingDaysOfWeek</code> attribute. 
	 * @param value the workingDaysOfWeek
	 */
	public void setWorkingDaysOfWeek(final Collection<EnumerationValue> value)
	{
		setWorkingDaysOfWeek( getSession().getSessionContext(), value );
	}
	
}
