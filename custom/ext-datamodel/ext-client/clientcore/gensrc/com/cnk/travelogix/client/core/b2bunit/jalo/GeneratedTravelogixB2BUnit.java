/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.b2bunit.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.dealcode.jalo.CorporateDealCodes;
import com.cnk.travelogix.client.core.affiliation.jalo.AffiliationInformation;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.ConsortiumMember;
import com.cnk.travelogix.client.core.jalo.CorporateTraveller;
import com.cnk.travelogix.client.core.kyc.jalo.KYCInformation;
import com.cnk.travelogix.client.core.mid.jalo.MerchantIdentificationDetails;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.fiancials.jalo.ServiceTaxDetails;
import com.cnk.travelogix.masterdata.core.jalo.BankAccountDetail;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.masterdata.core.staff.jalo.StaffInformation;
import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesOffice;
import de.hybris.platform.b2b.jalo.B2BCustomer;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit TravelogixB2BUnit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixB2BUnit extends B2BUnit
{
	/** Qualifier of the <code>TravelogixB2BUnit.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>TravelogixB2BUnit.clientCommercials</code> attribute **/
	public static final String CLIENTCOMMERCIALS = "clientCommercials";
	/** Qualifier of the <code>TravelogixB2BUnit.transactional</code> attribute **/
	public static final String TRANSACTIONAL = "transactional";
	/** Qualifier of the <code>TravelogixB2BUnit.defaultCurrency</code> attribute **/
	public static final String DEFAULTCURRENCY = "defaultCurrency";
	/** Qualifier of the <code>TravelogixB2BUnit.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>TravelogixB2BUnit.settlement</code> attribute **/
	public static final String SETTLEMENT = "settlement";
	/** Qualifier of the <code>TravelogixB2BUnit.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>TravelogixB2BUnit.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>TravelogixB2BUnit.reportingSaleOfficeType</code> attribute **/
	public static final String REPORTINGSALEOFFICETYPE = "reportingSaleOfficeType";
	/** Qualifier of the <code>TravelogixB2BUnit.trvlClientType</code> attribute **/
	public static final String TRVLCLIENTTYPE = "trvlClientType";
	/** Qualifier of the <code>TravelogixB2BUnit.reportingSaleOffice</code> attribute **/
	public static final String REPORTINGSALEOFFICE = "reportingSaleOffice";
	/** Qualifier of the <code>TravelogixB2BUnit.reportingFranchisee</code> attribute **/
	public static final String REPORTINGFRANCHISEE = "reportingFranchisee";
	/** Qualifier of the <code>TravelogixB2BUnit.clientSubCategory</code> attribute **/
	public static final String CLIENTSUBCATEGORY = "clientSubCategory";
	/** Qualifier of the <code>TravelogixB2BUnit.clientCategory</code> attribute **/
	public static final String CLIENTCATEGORY = "clientCategory";
	/** Qualifier of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute **/
	public static final String AUTOEMAILINVOICE = "autoEmailInvoice";
	/** Qualifier of the <code>TravelogixB2BUnit.clientGroupCompany</code> attribute **/
	public static final String CLIENTGROUPCOMPANY = "clientGroupCompany";
	/** Qualifier of the <code>TravelogixB2BUnit.financeControlId</code> attribute **/
	public static final String FINANCECONTROLID = "financeControlId";
	/** Qualifier of the <code>TravelogixB2BUnit.establishedIn</code> attribute **/
	public static final String ESTABLISHEDIN = "establishedIn";
	/** Qualifier of the <code>TravelogixB2BUnit.noOfOutLets</code> attribute **/
	public static final String NOOFOUTLETS = "noOfOutLets";
	/** Qualifier of the <code>TravelogixB2BUnit.modeOfRegistration</code> attribute **/
	public static final String MODEOFREGISTRATION = "modeOfRegistration";
	/** Qualifier of the <code>TravelogixB2BUnit.companyType</code> attribute **/
	public static final String COMPANYTYPE = "companyType";
	/** Qualifier of the <code>TravelogixB2BUnit.typeOfAssociation</code> attribute **/
	public static final String TYPEOFASSOCIATION = "typeOfAssociation";
	/** Qualifier of the <code>TravelogixB2BUnit.kycInformation</code> attribute **/
	public static final String KYCINFORMATION = "kycInformation";
	/** Qualifier of the <code>TravelogixB2BUnit.serviceTaxDetails</code> attribute **/
	public static final String SERVICETAXDETAILS = "serviceTaxDetails";
	/** Qualifier of the <code>TravelogixB2BUnit.contractValidityFrom</code> attribute **/
	public static final String CONTRACTVALIDITYFROM = "contractValidityFrom";
	/** Qualifier of the <code>TravelogixB2BUnit.contractValidityTo</code> attribute **/
	public static final String CONTRACTVALIDITYTO = "contractValidityTo";
	/** Qualifier of the <code>TravelogixB2BUnit.leadId</code> attribute **/
	public static final String LEADID = "leadId";
	/** Qualifier of the <code>TravelogixB2BUnit.customers</code> attribute **/
	public static final String CUSTOMERS = "customers";
	/** Qualifier of the <code>TravelogixB2BUnit.merchantIdentificationDetails</code> attribute **/
	public static final String MERCHANTIDENTIFICATIONDETAILS = "merchantIdentificationDetails";
	/** Qualifier of the <code>TravelogixB2BUnit.staffInformation</code> attribute **/
	public static final String STAFFINFORMATION = "staffInformation";
	/** Qualifier of the <code>TravelogixB2BUnit.affiliationInformation</code> attribute **/
	public static final String AFFILIATIONINFORMATION = "affiliationInformation";
	/** Qualifier of the <code>TravelogixB2BUnit.bankAccountDetail</code> attribute **/
	public static final String BANKACCOUNTDETAIL = "bankAccountDetail";
	/** Qualifier of the <code>TravelogixB2BUnit.dealCodes</code> attribute **/
	public static final String DEALCODES = "dealCodes";
	/** Qualifier of the <code>TravelogixB2BUnit.travelPolicies</code> attribute **/
	public static final String TRAVELPOLICIES = "travelPolicies";
	/** Qualifier of the <code>TravelogixB2BUnit.consortiumMembers</code> attribute **/
	public static final String CONSORTIUMMEMBERS = "consortiumMembers";
	/** Qualifier of the <code>TravelogixB2BUnit.corporateTravellers</code> attribute **/
	public static final String CORPORATETRAVELLERS = "corporateTravellers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n GROUPCOMPANY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTravelogixB2BUnit> GROUPCOMPANYHANDLER = new BidirectionalOneToManyHandler<GeneratedTravelogixB2BUnit>(
	OrgstructurecoreConstants.TC.GROUPCOMPANY,
	false,
	"groupCompany",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MERCHANTIDENTIFICATIONDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTravelogixB2BUnit> MERCHANTIDENTIFICATIONDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedTravelogixB2BUnit>(
	ClientcoreConstants.TC.TRAVELOGIXB2BUNIT,
	false,
	"merchantIdentificationDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n STAFFINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StaffInformation> STAFFINFORMATIONHANDLER = new OneToManyHandler<StaffInformation>(
	MasterdatacoreConstants.TC.STAFFINFORMATION,
	true,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n AFFILIATIONINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AffiliationInformation> AFFILIATIONINFORMATIONHANDLER = new OneToManyHandler<AffiliationInformation>(
	ClientcoreConstants.TC.AFFILIATIONINFORMATION,
	true,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BANKACCOUNTDETAIL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BankAccountDetail> BANKACCOUNTDETAILHANDLER = new OneToManyHandler<BankAccountDetail>(
	MasterdatacoreConstants.TC.BANKACCOUNTDETAIL,
	true,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DEALCODES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CorporateDealCodes> DEALCODESHANDLER = new OneToManyHandler<CorporateDealCodes>(
	ClientconfigConstants.TC.CORPORATEDEALCODES,
	false,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELPOLICIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> TRAVELPOLICIESHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CONSORTIUMMEMBERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ConsortiumMember> CONSORTIUMMEMBERSHANDLER = new OneToManyHandler<ConsortiumMember>(
	ClientcoreConstants.TC.CONSORTIUMMEMBER,
	false,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CORPORATETRAVELLERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CorporateTraveller> CORPORATETRAVELLERSHANDLER = new OneToManyHandler<CorporateTraveller>(
	ClientcoreConstants.TC.CORPORATETRAVELLER,
	false,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(B2BUnit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(CLIENTCOMMERCIALS, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONAL, AttributeMode.INITIAL);
		tmp.put(DEFAULTCURRENCY, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(SETTLEMENT, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(REPORTINGSALEOFFICETYPE, AttributeMode.INITIAL);
		tmp.put(TRVLCLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(REPORTINGSALEOFFICE, AttributeMode.INITIAL);
		tmp.put(REPORTINGFRANCHISEE, AttributeMode.INITIAL);
		tmp.put(CLIENTSUBCATEGORY, AttributeMode.INITIAL);
		tmp.put(CLIENTCATEGORY, AttributeMode.INITIAL);
		tmp.put(AUTOEMAILINVOICE, AttributeMode.INITIAL);
		tmp.put(CLIENTGROUPCOMPANY, AttributeMode.INITIAL);
		tmp.put(FINANCECONTROLID, AttributeMode.INITIAL);
		tmp.put(ESTABLISHEDIN, AttributeMode.INITIAL);
		tmp.put(NOOFOUTLETS, AttributeMode.INITIAL);
		tmp.put(MODEOFREGISTRATION, AttributeMode.INITIAL);
		tmp.put(COMPANYTYPE, AttributeMode.INITIAL);
		tmp.put(TYPEOFASSOCIATION, AttributeMode.INITIAL);
		tmp.put(KYCINFORMATION, AttributeMode.INITIAL);
		tmp.put(SERVICETAXDETAILS, AttributeMode.INITIAL);
		tmp.put(CONTRACTVALIDITYFROM, AttributeMode.INITIAL);
		tmp.put(CONTRACTVALIDITYTO, AttributeMode.INITIAL);
		tmp.put(LEADID, AttributeMode.INITIAL);
		tmp.put(CUSTOMERS, AttributeMode.INITIAL);
		tmp.put(MERCHANTIDENTIFICATIONDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.affiliationInformation</code> attribute.
	 * @return the affiliationInformation
	 */
	public Set<AffiliationInformation> getAffiliationInformation(final SessionContext ctx)
	{
		return (Set<AffiliationInformation>)AFFILIATIONINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.affiliationInformation</code> attribute.
	 * @return the affiliationInformation
	 */
	public Set<AffiliationInformation> getAffiliationInformation()
	{
		return getAffiliationInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.affiliationInformation</code> attribute. 
	 * @param value the affiliationInformation
	 */
	public void setAffiliationInformation(final SessionContext ctx, final Set<AffiliationInformation> value)
	{
		AFFILIATIONINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.affiliationInformation</code> attribute. 
	 * @param value the affiliationInformation
	 */
	public void setAffiliationInformation(final Set<AffiliationInformation> value)
	{
		setAffiliationInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to affiliationInformation. 
	 * @param value the item to add to affiliationInformation
	 */
	public void addToAffiliationInformation(final SessionContext ctx, final AffiliationInformation value)
	{
		AFFILIATIONINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to affiliationInformation. 
	 * @param value the item to add to affiliationInformation
	 */
	public void addToAffiliationInformation(final AffiliationInformation value)
	{
		addToAffiliationInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from affiliationInformation. 
	 * @param value the item to remove from affiliationInformation
	 */
	public void removeFromAffiliationInformation(final SessionContext ctx, final AffiliationInformation value)
	{
		AFFILIATIONINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from affiliationInformation. 
	 * @param value the item to remove from affiliationInformation
	 */
	public void removeFromAffiliationInformation(final AffiliationInformation value)
	{
		removeFromAffiliationInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute.
	 * @return the autoEmailInvoice
	 */
	public Boolean isAutoEmailInvoice(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, AUTOEMAILINVOICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute.
	 * @return the autoEmailInvoice
	 */
	public Boolean isAutoEmailInvoice()
	{
		return isAutoEmailInvoice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute. 
	 * @return the autoEmailInvoice
	 */
	public boolean isAutoEmailInvoiceAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAutoEmailInvoice( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute. 
	 * @return the autoEmailInvoice
	 */
	public boolean isAutoEmailInvoiceAsPrimitive()
	{
		return isAutoEmailInvoiceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute. 
	 * @param value the autoEmailInvoice
	 */
	public void setAutoEmailInvoice(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, AUTOEMAILINVOICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute. 
	 * @param value the autoEmailInvoice
	 */
	public void setAutoEmailInvoice(final Boolean value)
	{
		setAutoEmailInvoice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute. 
	 * @param value the autoEmailInvoice
	 */
	public void setAutoEmailInvoice(final SessionContext ctx, final boolean value)
	{
		setAutoEmailInvoice( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.autoEmailInvoice</code> attribute. 
	 * @param value the autoEmailInvoice
	 */
	public void setAutoEmailInvoice(final boolean value)
	{
		setAutoEmailInvoice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.bankAccountDetail</code> attribute.
	 * @return the bankAccountDetail
	 */
	public Set<BankAccountDetail> getBankAccountDetail(final SessionContext ctx)
	{
		return (Set<BankAccountDetail>)BANKACCOUNTDETAILHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.bankAccountDetail</code> attribute.
	 * @return the bankAccountDetail
	 */
	public Set<BankAccountDetail> getBankAccountDetail()
	{
		return getBankAccountDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.bankAccountDetail</code> attribute. 
	 * @param value the bankAccountDetail
	 */
	public void setBankAccountDetail(final SessionContext ctx, final Set<BankAccountDetail> value)
	{
		BANKACCOUNTDETAILHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.bankAccountDetail</code> attribute. 
	 * @param value the bankAccountDetail
	 */
	public void setBankAccountDetail(final Set<BankAccountDetail> value)
	{
		setBankAccountDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankAccountDetail. 
	 * @param value the item to add to bankAccountDetail
	 */
	public void addToBankAccountDetail(final SessionContext ctx, final BankAccountDetail value)
	{
		BANKACCOUNTDETAILHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankAccountDetail. 
	 * @param value the item to add to bankAccountDetail
	 */
	public void addToBankAccountDetail(final BankAccountDetail value)
	{
		addToBankAccountDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankAccountDetail. 
	 * @param value the item to remove from bankAccountDetail
	 */
	public void removeFromBankAccountDetail(final SessionContext ctx, final BankAccountDetail value)
	{
		BANKACCOUNTDETAILHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankAccountDetail. 
	 * @param value the item to remove from bankAccountDetail
	 */
	public void removeFromBankAccountDetail(final BankAccountDetail value)
	{
		removeFromBankAccountDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientCategory</code> attribute.
	 * @return the clientCategory
	 */
	public EnumerationValue getClientCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientCategory</code> attribute.
	 * @return the clientCategory
	 */
	public EnumerationValue getClientCategory()
	{
		return getClientCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientCategory</code> attribute. 
	 * @param value the clientCategory
	 */
	public void setClientCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientCategory</code> attribute. 
	 * @param value the clientCategory
	 */
	public void setClientCategory(final EnumerationValue value)
	{
		setClientCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientCommercials</code> attribute.
	 * @return the clientCommercials
	 */
	public Boolean isClientCommercials(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CLIENTCOMMERCIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientCommercials</code> attribute.
	 * @return the clientCommercials
	 */
	public Boolean isClientCommercials()
	{
		return isClientCommercials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientCommercials</code> attribute. 
	 * @return the clientCommercials
	 */
	public boolean isClientCommercialsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isClientCommercials( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientCommercials</code> attribute. 
	 * @return the clientCommercials
	 */
	public boolean isClientCommercialsAsPrimitive()
	{
		return isClientCommercialsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CLIENTCOMMERCIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final Boolean value)
	{
		setClientCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final SessionContext ctx, final boolean value)
	{
		setClientCommercials( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final boolean value)
	{
		setClientCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientGroupCompany</code> attribute.
	 * @return the clientGroupCompany
	 */
	public EnumerationValue getClientGroupCompany(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTGROUPCOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientGroupCompany</code> attribute.
	 * @return the clientGroupCompany
	 */
	public EnumerationValue getClientGroupCompany()
	{
		return getClientGroupCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientGroupCompany</code> attribute. 
	 * @param value the clientGroupCompany
	 */
	public void setClientGroupCompany(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTGROUPCOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientGroupCompany</code> attribute. 
	 * @param value the clientGroupCompany
	 */
	public void setClientGroupCompany(final EnumerationValue value)
	{
		setClientGroupCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientSubCategory</code> attribute.
	 * @return the clientSubCategory
	 */
	public EnumerationValue getClientSubCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTSUBCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientSubCategory</code> attribute.
	 * @return the clientSubCategory
	 */
	public EnumerationValue getClientSubCategory()
	{
		return getClientSubCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientSubCategory</code> attribute. 
	 * @param value the clientSubCategory
	 */
	public void setClientSubCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTSUBCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientSubCategory</code> attribute. 
	 * @param value the clientSubCategory
	 */
	public void setClientSubCategory(final EnumerationValue value)
	{
		setClientSubCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.companyMarket</code> attribute.
	 * @return the companyMarket - Company Market
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.companyMarket</code> attribute. 
	 * @param value the companyMarket - Company Market
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.companyType</code> attribute.
	 * @return the companyType
	 */
	public EnumerationValue getCompanyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.companyType</code> attribute.
	 * @return the companyType
	 */
	public EnumerationValue getCompanyType()
	{
		return getCompanyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.companyType</code> attribute. 
	 * @param value the companyType
	 */
	public void setCompanyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.companyType</code> attribute. 
	 * @param value the companyType
	 */
	public void setCompanyType(final EnumerationValue value)
	{
		setCompanyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.consortiumMembers</code> attribute.
	 * @return the consortiumMembers
	 */
	public Collection<ConsortiumMember> getConsortiumMembers(final SessionContext ctx)
	{
		return CONSORTIUMMEMBERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.consortiumMembers</code> attribute.
	 * @return the consortiumMembers
	 */
	public Collection<ConsortiumMember> getConsortiumMembers()
	{
		return getConsortiumMembers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.consortiumMembers</code> attribute. 
	 * @param value the consortiumMembers
	 */
	public void setConsortiumMembers(final SessionContext ctx, final Collection<ConsortiumMember> value)
	{
		CONSORTIUMMEMBERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.consortiumMembers</code> attribute. 
	 * @param value the consortiumMembers
	 */
	public void setConsortiumMembers(final Collection<ConsortiumMember> value)
	{
		setConsortiumMembers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to consortiumMembers. 
	 * @param value the item to add to consortiumMembers
	 */
	public void addToConsortiumMembers(final SessionContext ctx, final ConsortiumMember value)
	{
		CONSORTIUMMEMBERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to consortiumMembers. 
	 * @param value the item to add to consortiumMembers
	 */
	public void addToConsortiumMembers(final ConsortiumMember value)
	{
		addToConsortiumMembers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from consortiumMembers. 
	 * @param value the item to remove from consortiumMembers
	 */
	public void removeFromConsortiumMembers(final SessionContext ctx, final ConsortiumMember value)
	{
		CONSORTIUMMEMBERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from consortiumMembers. 
	 * @param value the item to remove from consortiumMembers
	 */
	public void removeFromConsortiumMembers(final ConsortiumMember value)
	{
		removeFromConsortiumMembers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.contractValidityFrom</code> attribute.
	 * @return the contractValidityFrom
	 */
	public Date getContractValidityFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONTRACTVALIDITYFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.contractValidityFrom</code> attribute.
	 * @return the contractValidityFrom
	 */
	public Date getContractValidityFrom()
	{
		return getContractValidityFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.contractValidityFrom</code> attribute. 
	 * @param value the contractValidityFrom
	 */
	public void setContractValidityFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONTRACTVALIDITYFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.contractValidityFrom</code> attribute. 
	 * @param value the contractValidityFrom
	 */
	public void setContractValidityFrom(final Date value)
	{
		setContractValidityFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.contractValidityTo</code> attribute.
	 * @return the contractValidityTo
	 */
	public Date getContractValidityTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONTRACTVALIDITYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.contractValidityTo</code> attribute.
	 * @return the contractValidityTo
	 */
	public Date getContractValidityTo()
	{
		return getContractValidityTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.contractValidityTo</code> attribute. 
	 * @param value the contractValidityTo
	 */
	public void setContractValidityTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONTRACTVALIDITYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.contractValidityTo</code> attribute. 
	 * @param value the contractValidityTo
	 */
	public void setContractValidityTo(final Date value)
	{
		setContractValidityTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.corporateTravellers</code> attribute.
	 * @return the corporateTravellers
	 */
	public Collection<CorporateTraveller> getCorporateTravellers(final SessionContext ctx)
	{
		return CORPORATETRAVELLERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.corporateTravellers</code> attribute.
	 * @return the corporateTravellers
	 */
	public Collection<CorporateTraveller> getCorporateTravellers()
	{
		return getCorporateTravellers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.corporateTravellers</code> attribute. 
	 * @param value the corporateTravellers
	 */
	public void setCorporateTravellers(final SessionContext ctx, final Collection<CorporateTraveller> value)
	{
		CORPORATETRAVELLERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.corporateTravellers</code> attribute. 
	 * @param value the corporateTravellers
	 */
	public void setCorporateTravellers(final Collection<CorporateTraveller> value)
	{
		setCorporateTravellers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to corporateTravellers. 
	 * @param value the item to add to corporateTravellers
	 */
	public void addToCorporateTravellers(final SessionContext ctx, final CorporateTraveller value)
	{
		CORPORATETRAVELLERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to corporateTravellers. 
	 * @param value the item to add to corporateTravellers
	 */
	public void addToCorporateTravellers(final CorporateTraveller value)
	{
		addToCorporateTravellers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from corporateTravellers. 
	 * @param value the item to remove from corporateTravellers
	 */
	public void removeFromCorporateTravellers(final SessionContext ctx, final CorporateTraveller value)
	{
		CORPORATETRAVELLERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from corporateTravellers. 
	 * @param value the item to remove from corporateTravellers
	 */
	public void removeFromCorporateTravellers(final CorporateTraveller value)
	{
		removeFromCorporateTravellers( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		GROUPCOMPANYHANDLER.newInstance(ctx, allAttributes);
		MERCHANTIDENTIFICATIONDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.customers</code> attribute.
	 * @return the customers
	 */
	public B2BCustomer getCustomers(final SessionContext ctx)
	{
		return (B2BCustomer)getProperty( ctx, CUSTOMERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.customers</code> attribute.
	 * @return the customers
	 */
	public B2BCustomer getCustomers()
	{
		return getCustomers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.customers</code> attribute. 
	 * @param value the customers
	 */
	public void setCustomers(final SessionContext ctx, final B2BCustomer value)
	{
		setProperty(ctx, CUSTOMERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.customers</code> attribute. 
	 * @param value the customers
	 */
	public void setCustomers(final B2BCustomer value)
	{
		setCustomers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.dealCodes</code> attribute.
	 * @return the dealCodes
	 */
	public Collection<CorporateDealCodes> getDealCodes(final SessionContext ctx)
	{
		return DEALCODESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.dealCodes</code> attribute.
	 * @return the dealCodes
	 */
	public Collection<CorporateDealCodes> getDealCodes()
	{
		return getDealCodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.dealCodes</code> attribute. 
	 * @param value the dealCodes
	 */
	public void setDealCodes(final SessionContext ctx, final Collection<CorporateDealCodes> value)
	{
		DEALCODESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.dealCodes</code> attribute. 
	 * @param value the dealCodes
	 */
	public void setDealCodes(final Collection<CorporateDealCodes> value)
	{
		setDealCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealCodes. 
	 * @param value the item to add to dealCodes
	 */
	public void addToDealCodes(final SessionContext ctx, final CorporateDealCodes value)
	{
		DEALCODESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dealCodes. 
	 * @param value the item to add to dealCodes
	 */
	public void addToDealCodes(final CorporateDealCodes value)
	{
		addToDealCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealCodes. 
	 * @param value the item to remove from dealCodes
	 */
	public void removeFromDealCodes(final SessionContext ctx, final CorporateDealCodes value)
	{
		DEALCODESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dealCodes. 
	 * @param value the item to remove from dealCodes
	 */
	public void removeFromDealCodes(final CorporateDealCodes value)
	{
		removeFromDealCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.defaultCurrency</code> attribute.
	 * @return the defaultCurrency
	 */
	public Currency getDefaultCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, DEFAULTCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.defaultCurrency</code> attribute.
	 * @return the defaultCurrency
	 */
	public Currency getDefaultCurrency()
	{
		return getDefaultCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.defaultCurrency</code> attribute. 
	 * @param value the defaultCurrency
	 */
	public void setDefaultCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, DEFAULTCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.defaultCurrency</code> attribute. 
	 * @param value the defaultCurrency
	 */
	public void setDefaultCurrency(final Currency value)
	{
		setDefaultCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.establishedIn</code> attribute.
	 * @return the establishedIn
	 */
	public Date getEstablishedIn(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ESTABLISHEDIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.establishedIn</code> attribute.
	 * @return the establishedIn
	 */
	public Date getEstablishedIn()
	{
		return getEstablishedIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.establishedIn</code> attribute. 
	 * @param value the establishedIn
	 */
	public void setEstablishedIn(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ESTABLISHEDIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.establishedIn</code> attribute. 
	 * @param value the establishedIn
	 */
	public void setEstablishedIn(final Date value)
	{
		setEstablishedIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.financeControlId</code> attribute.
	 * @return the financeControlId
	 */
	public String getFinanceControlId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FINANCECONTROLID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.financeControlId</code> attribute.
	 * @return the financeControlId
	 */
	public String getFinanceControlId()
	{
		return getFinanceControlId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.financeControlId</code> attribute. 
	 * @param value the financeControlId
	 */
	public void setFinanceControlId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FINANCECONTROLID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.financeControlId</code> attribute. 
	 * @param value the financeControlId
	 */
	public void setFinanceControlId(final String value)
	{
		setFinanceControlId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.kycInformation</code> attribute.
	 * @return the kycInformation
	 */
	public KYCInformation getKycInformation(final SessionContext ctx)
	{
		return (KYCInformation)getProperty( ctx, KYCINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.kycInformation</code> attribute.
	 * @return the kycInformation
	 */
	public KYCInformation getKycInformation()
	{
		return getKycInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.kycInformation</code> attribute. 
	 * @param value the kycInformation
	 */
	public void setKycInformation(final SessionContext ctx, final KYCInformation value)
	{
		new PartOfHandler<KYCInformation>()
		{
			@Override
			protected KYCInformation doGetValue(final SessionContext ctx)
			{
				return getKycInformation( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final KYCInformation _value)
			{
				final KYCInformation value = _value;
				setProperty(ctx, KYCINFORMATION,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.kycInformation</code> attribute. 
	 * @param value the kycInformation
	 */
	public void setKycInformation(final KYCInformation value)
	{
		setKycInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.leadId</code> attribute.
	 * @return the leadId
	 */
	public String getLeadId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LEADID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.leadId</code> attribute.
	 * @return the leadId
	 */
	public String getLeadId()
	{
		return getLeadId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.leadId</code> attribute. 
	 * @param value the leadId
	 */
	public void setLeadId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LEADID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.leadId</code> attribute. 
	 * @param value the leadId
	 */
	public void setLeadId(final String value)
	{
		setLeadId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.merchantIdentificationDetails</code> attribute.
	 * @return the merchantIdentificationDetails
	 */
	public MerchantIdentificationDetails getMerchantIdentificationDetails(final SessionContext ctx)
	{
		return (MerchantIdentificationDetails)getProperty( ctx, MERCHANTIDENTIFICATIONDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.merchantIdentificationDetails</code> attribute.
	 * @return the merchantIdentificationDetails
	 */
	public MerchantIdentificationDetails getMerchantIdentificationDetails()
	{
		return getMerchantIdentificationDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.merchantIdentificationDetails</code> attribute. 
	 * @param value the merchantIdentificationDetails
	 */
	public void setMerchantIdentificationDetails(final SessionContext ctx, final MerchantIdentificationDetails value)
	{
		MERCHANTIDENTIFICATIONDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.merchantIdentificationDetails</code> attribute. 
	 * @param value the merchantIdentificationDetails
	 */
	public void setMerchantIdentificationDetails(final MerchantIdentificationDetails value)
	{
		setMerchantIdentificationDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.modeOfRegistration</code> attribute.
	 * @return the modeOfRegistration
	 */
	public EnumerationValue getModeOfRegistration(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFREGISTRATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.modeOfRegistration</code> attribute.
	 * @return the modeOfRegistration
	 */
	public EnumerationValue getModeOfRegistration()
	{
		return getModeOfRegistration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.modeOfRegistration</code> attribute. 
	 * @param value the modeOfRegistration
	 */
	public void setModeOfRegistration(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFREGISTRATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.modeOfRegistration</code> attribute. 
	 * @param value the modeOfRegistration
	 */
	public void setModeOfRegistration(final EnumerationValue value)
	{
		setModeOfRegistration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.noOfOutLets</code> attribute.
	 * @return the noOfOutLets
	 */
	public String getNoOfOutLets(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFOUTLETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.noOfOutLets</code> attribute.
	 * @return the noOfOutLets
	 */
	public String getNoOfOutLets()
	{
		return getNoOfOutLets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.noOfOutLets</code> attribute. 
	 * @param value the noOfOutLets
	 */
	public void setNoOfOutLets(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFOUTLETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.noOfOutLets</code> attribute. 
	 * @param value the noOfOutLets
	 */
	public void setNoOfOutLets(final String value)
	{
		setNoOfOutLets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixB2BUnit.getReason requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reason</code> attribute. 
	 * @return the localized reason
	 */
	public Map<Language,String> getAllReason(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REASON,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reason</code> attribute. 
	 * @return the localized reason
	 */
	public Map<Language,String> getAllReason()
	{
		return getAllReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixB2BUnit.setReason requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setAllReason(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setAllReason(final Map<Language,String> value)
	{
		setAllReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixB2BUnit.getRemarks requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.remarks</code> attribute. 
	 * @return the localized remarks
	 */
	public Map<Language,String> getAllRemarks(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REMARKS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.remarks</code> attribute. 
	 * @return the localized remarks
	 */
	public Map<Language,String> getAllRemarks()
	{
		return getAllRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixB2BUnit.setRemarks requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setAllRemarks(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setAllRemarks(final Map<Language,String> value)
	{
		setAllRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reportingFranchisee</code> attribute.
	 * @return the reportingFranchisee
	 */
	public B2BUnit getReportingFranchisee(final SessionContext ctx)
	{
		return (B2BUnit)getProperty( ctx, REPORTINGFRANCHISEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reportingFranchisee</code> attribute.
	 * @return the reportingFranchisee
	 */
	public B2BUnit getReportingFranchisee()
	{
		return getReportingFranchisee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reportingFranchisee</code> attribute. 
	 * @param value the reportingFranchisee
	 */
	public void setReportingFranchisee(final SessionContext ctx, final B2BUnit value)
	{
		setProperty(ctx, REPORTINGFRANCHISEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reportingFranchisee</code> attribute. 
	 * @param value the reportingFranchisee
	 */
	public void setReportingFranchisee(final B2BUnit value)
	{
		setReportingFranchisee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reportingSaleOffice</code> attribute.
	 * @return the reportingSaleOffice
	 */
	public SalesOffice getReportingSaleOffice(final SessionContext ctx)
	{
		return (SalesOffice)getProperty( ctx, REPORTINGSALEOFFICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reportingSaleOffice</code> attribute.
	 * @return the reportingSaleOffice
	 */
	public SalesOffice getReportingSaleOffice()
	{
		return getReportingSaleOffice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reportingSaleOffice</code> attribute. 
	 * @param value the reportingSaleOffice
	 */
	public void setReportingSaleOffice(final SessionContext ctx, final SalesOffice value)
	{
		setProperty(ctx, REPORTINGSALEOFFICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reportingSaleOffice</code> attribute. 
	 * @param value the reportingSaleOffice
	 */
	public void setReportingSaleOffice(final SalesOffice value)
	{
		setReportingSaleOffice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reportingSaleOfficeType</code> attribute.
	 * @return the reportingSaleOfficeType
	 */
	public EnumerationValue getReportingSaleOfficeType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, REPORTINGSALEOFFICETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.reportingSaleOfficeType</code> attribute.
	 * @return the reportingSaleOfficeType
	 */
	public EnumerationValue getReportingSaleOfficeType()
	{
		return getReportingSaleOfficeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reportingSaleOfficeType</code> attribute. 
	 * @param value the reportingSaleOfficeType
	 */
	public void setReportingSaleOfficeType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, REPORTINGSALEOFFICETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.reportingSaleOfficeType</code> attribute. 
	 * @param value the reportingSaleOfficeType
	 */
	public void setReportingSaleOfficeType(final EnumerationValue value)
	{
		setReportingSaleOfficeType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.serviceTaxDetails</code> attribute.
	 * @return the serviceTaxDetails
	 */
	public ServiceTaxDetails getServiceTaxDetails(final SessionContext ctx)
	{
		return (ServiceTaxDetails)getProperty( ctx, SERVICETAXDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.serviceTaxDetails</code> attribute.
	 * @return the serviceTaxDetails
	 */
	public ServiceTaxDetails getServiceTaxDetails()
	{
		return getServiceTaxDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.serviceTaxDetails</code> attribute. 
	 * @param value the serviceTaxDetails
	 */
	public void setServiceTaxDetails(final SessionContext ctx, final ServiceTaxDetails value)
	{
		new PartOfHandler<ServiceTaxDetails>()
		{
			@Override
			protected ServiceTaxDetails doGetValue(final SessionContext ctx)
			{
				return getServiceTaxDetails( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final ServiceTaxDetails _value)
			{
				final ServiceTaxDetails value = _value;
				setProperty(ctx, SERVICETAXDETAILS,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.serviceTaxDetails</code> attribute. 
	 * @param value the serviceTaxDetails
	 */
	public void setServiceTaxDetails(final ServiceTaxDetails value)
	{
		setServiceTaxDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.settlement</code> attribute.
	 * @return the settlement
	 */
	public Boolean isSettlement(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.settlement</code> attribute.
	 * @return the settlement
	 */
	public Boolean isSettlement()
	{
		return isSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.settlement</code> attribute. 
	 * @return the settlement
	 */
	public boolean isSettlementAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSettlement( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.settlement</code> attribute. 
	 * @return the settlement
	 */
	public boolean isSettlementAsPrimitive()
	{
		return isSettlementAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final Boolean value)
	{
		setSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final SessionContext ctx, final boolean value)
	{
		setSettlement( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final boolean value)
	{
		setSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public Set<StaffInformation> getStaffInformation(final SessionContext ctx)
	{
		return (Set<StaffInformation>)STAFFINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.staffInformation</code> attribute.
	 * @return the staffInformation
	 */
	public Set<StaffInformation> getStaffInformation()
	{
		return getStaffInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final SessionContext ctx, final Set<StaffInformation> value)
	{
		STAFFINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.staffInformation</code> attribute. 
	 * @param value the staffInformation
	 */
	public void setStaffInformation(final Set<StaffInformation> value)
	{
		setStaffInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to staffInformation. 
	 * @param value the item to add to staffInformation
	 */
	public void addToStaffInformation(final SessionContext ctx, final StaffInformation value)
	{
		STAFFINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to staffInformation. 
	 * @param value the item to add to staffInformation
	 */
	public void addToStaffInformation(final StaffInformation value)
	{
		addToStaffInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from staffInformation. 
	 * @param value the item to remove from staffInformation
	 */
	public void removeFromStaffInformation(final SessionContext ctx, final StaffInformation value)
	{
		STAFFINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from staffInformation. 
	 * @param value the item to remove from staffInformation
	 */
	public void removeFromStaffInformation(final StaffInformation value)
	{
		removeFromStaffInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.transactional</code> attribute.
	 * @return the transactional
	 */
	public Boolean isTransactional(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.transactional</code> attribute.
	 * @return the transactional
	 */
	public Boolean isTransactional()
	{
		return isTransactional( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.transactional</code> attribute. 
	 * @return the transactional
	 */
	public boolean isTransactionalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactional( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.transactional</code> attribute. 
	 * @return the transactional
	 */
	public boolean isTransactionalAsPrimitive()
	{
		return isTransactionalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final Boolean value)
	{
		setTransactional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final SessionContext ctx, final boolean value)
	{
		setTransactional( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final boolean value)
	{
		setTransactional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.travelPolicies</code> attribute.
	 * @return the travelPolicies
	 */
	public Collection<TravelogixPolicy> getTravelPolicies(final SessionContext ctx)
	{
		return TRAVELPOLICIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.travelPolicies</code> attribute.
	 * @return the travelPolicies
	 */
	public Collection<TravelogixPolicy> getTravelPolicies()
	{
		return getTravelPolicies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.travelPolicies</code> attribute. 
	 * @param value the travelPolicies
	 */
	public void setTravelPolicies(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		TRAVELPOLICIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.travelPolicies</code> attribute. 
	 * @param value the travelPolicies
	 */
	public void setTravelPolicies(final Collection<TravelogixPolicy> value)
	{
		setTravelPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelPolicies. 
	 * @param value the item to add to travelPolicies
	 */
	public void addToTravelPolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		TRAVELPOLICIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelPolicies. 
	 * @param value the item to add to travelPolicies
	 */
	public void addToTravelPolicies(final TravelogixPolicy value)
	{
		addToTravelPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelPolicies. 
	 * @param value the item to remove from travelPolicies
	 */
	public void removeFromTravelPolicies(final SessionContext ctx, final TravelogixPolicy value)
	{
		TRAVELPOLICIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelPolicies. 
	 * @param value the item to remove from travelPolicies
	 */
	public void removeFromTravelPolicies(final TravelogixPolicy value)
	{
		removeFromTravelPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.trvlClientType</code> attribute.
	 * @return the trvlClientType
	 */
	public EnumerationValue getTrvlClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRVLCLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.trvlClientType</code> attribute.
	 * @return the trvlClientType
	 */
	public EnumerationValue getTrvlClientType()
	{
		return getTrvlClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.trvlClientType</code> attribute. 
	 * @param value the trvlClientType
	 */
	public void setTrvlClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRVLCLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.trvlClientType</code> attribute. 
	 * @param value the trvlClientType
	 */
	public void setTrvlClientType(final EnumerationValue value)
	{
		setTrvlClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.typeOfAssociation</code> attribute.
	 * @return the typeOfAssociation
	 */
	public EnumerationValue getTypeOfAssociation(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFASSOCIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.typeOfAssociation</code> attribute.
	 * @return the typeOfAssociation
	 */
	public EnumerationValue getTypeOfAssociation()
	{
		return getTypeOfAssociation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.typeOfAssociation</code> attribute. 
	 * @param value the typeOfAssociation
	 */
	public void setTypeOfAssociation(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFASSOCIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.typeOfAssociation</code> attribute. 
	 * @param value the typeOfAssociation
	 */
	public void setTypeOfAssociation(final EnumerationValue value)
	{
		setTypeOfAssociation( getSession().getSessionContext(), value );
	}
	
}
