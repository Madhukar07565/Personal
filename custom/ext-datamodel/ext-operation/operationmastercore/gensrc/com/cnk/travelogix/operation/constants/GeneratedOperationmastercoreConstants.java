/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedOperationmastercoreConstants
{
	public static final String EXTENSIONNAME = "operationmastercore";
	public static class TC
	{
		public static final String ABSTRACTTDSRULE = "AbstractTDSRule".intern();
		public static final String CLIENTRECONFIRMATIONCONFIG = "ClientReconfirmationConfig".intern();
		public static final String CLIENTTDSRULE = "ClientTDSRule".intern();
		public static final String DOCUMENTSTATUS = "DocumentStatus".intern();
		public static final String PAYMENTADVICE = "PaymentAdvice".intern();
		public static final String PAYMENTADVICESTATUS = "PaymentAdviceStatus".intern();
		public static final String PAYMENTDETAILS = "PaymentDetails".intern();
		public static final String RECONFIRMATIONCONFIG = "ReconfirmationConfig".intern();
		public static final String RECONFIRMATIONINTERVAL = "ReconfirmationInterval".intern();
		public static final String RECONFIRMATIONTRAVELDESTINATION = "ReconfirmationTravelDestination".intern();
		public static final String SERVICEORDER = "ServiceOrder".intern();
		public static final String SERVICEORDERPAYMENTSTATUS = "ServiceOrderPaymentStatus".intern();
		public static final String SERVICEORDERSTATUS = "ServiceOrderStatus".intern();
		public static final String SERVICEORDERTYPE = "ServiceOrderType".intern();
		public static final String SUPPLIERINVOICE = "SupplierInvoice".intern();
		public static final String SUPPLIERLIABILITY = "SupplierLiability".intern();
		public static final String SUPPLIERLIABILITYSTATUS = "SupplierLiabilityStatus".intern();
		public static final String SUPPLIERLIABILITYTYPE = "SupplierLiabilityType".intern();
		public static final String SUPPLIERRECONFIRMATIONCONFIG = "SupplierReconfirmationConfig".intern();
		public static final String SUPPLIERTDSRULE = "SupplierTDSRule".intern();
		public static final String TDSAPPROVALSTATUS = "TDSApprovalStatus".intern();
		public static final String TDSCOMPANYTYPE = "TDSCompanyType".intern();
		public static final String TDSEXEMPTION = "TDSExemption".intern();
		public static final String TDSMASTER = "TDSMaster".intern();
		public static final String TDSTAXCOMPONENT = "TDSTaxComponent".intern();
		public static final String TDSTAXELEMENT = "TDSTaxElement".intern();
		public static final String TIMELIMITBOOKINGPROCESS = "TimeLimitBookingProcess".intern();
		public static final String TODODETAILCOMPONENT = "ToDoDetailComponent".intern();
		public static final String TODOLISTCOMPONENT = "ToDoListComponent".intern();
	}
	public static class Attributes
	{
		public static class AbstractOrderEntry
		{
			public static final String LATESTSERVICEORDER = "latestServiceOrder".intern();
		}
		public static class DocumentSetting
		{
			public static final String ORDER = "order".intern();
		}
		public static class Employee
		{
			public static final String CONTACTEMAIL = "contactEmail".intern();
			public static final String DESIGNATION = "designation".intern();
			public static final String FIRSTNAME = "firstName".intern();
			public static final String FUNCTIONALROLE = "functionalRole".intern();
			public static final String ISMANAGER = "isManager".intern();
			public static final String LASTNAME = "lastName".intern();
			public static final String MIDDLENAME = "middleName".intern();
			public static final String MOBILENUMBER = "mobileNumber".intern();
			public static final String REPORTINGMANAGER = "reportingManager".intern();
			public static final String ROLES = "roles".intern();
			public static final String SECONDARYUSER = "secondaryUser".intern();
		}
		public static class Order
		{
			public static final String DOCRECEIVEDDATE = "docReceivedDate".intern();
			public static final String DOCSTATUS = "docStatus".intern();
			public static final String DOCUMENTSETTINGS = "documentSettings".intern();
			public static final String FINANCIALCONTROLID = "financialControlId".intern();
			public static final String REMARKS = "remarks".intern();
			public static final String TEMPTIMELIMIT = "tempTimeLimit".intern();
			public static final String TIMELIMITMASTERCONFIG = "timeLimitMasterConfig".intern();
		}
		public static class SavedQuery
		{
			public static final String EMPLOYEE = "employee".intern();
		}
		public static class TravelogixPaymentReceipt
		{
			public static final String CLIENT = "client".intern();
		}
	}
	public static class Enumerations
	{
		public static class DocumentStatus
		{
			public static final String PENDING = "PENDING".intern();
			public static final String PENDING_VERIFICATION = "PENDING_VERIFICATION".intern();
			public static final String REJECTED = "REJECTED".intern();
			public static final String VERIFIED = "VERIFIED".intern();
			public static final String PENDING_APPROVAL = "PENDING_APPROVAL".intern();
			public static final String GENERATED = "GENERATED".intern();
		}
		public static class PaymentAdviceStatus
		{
			public static final String PENDING = "PENDING".intern();
		}
		public static class ServiceOrderPaymentStatus
		{
			public static final String PENDING = "PENDING".intern();
			public static final String PARTIALLY_PAID = "PARTIALLY_PAID".intern();
			public static final String FULLY_PAID = "FULLY_PAID".intern();
			public static final String SETTLED = "SETTLED".intern();
			public static final String FULLY_SETTLED = "FULLY_SETTLED".intern();
			public static final String PARTIALLY_SETTLED = "PARTIALLY_SETTLED".intern();
			public static final String UNSETTLED = "UNSETTLED".intern();
			public static final String SETTLED_AGAINST_DEPOSIT = "SETTLED_AGAINST_DEPOSIT".intern();
			public static final String PARTIALLY_SETTLED_AGAINST_DEPOSIT = "PARTIALLY_SETTLED_AGAINST_DEPOSIT".intern();
		}
		public static class ServiceOrderStatus
		{
			public static final String PSO_GENERATED = "PSO_GENERATED".intern();
			public static final String PSO_CANCELLED = "PSO_CANCELLED".intern();
			public static final String FSO_GENERATED = "FSO_GENERATED".intern();
			public static final String FSO_NOT_GENERATED = "FSO_NOT_GENERATED".intern();
			public static final String FSO_CANCELLED = "FSO_CANCELLED".intern();
			public static final String BILL_PASSING_PENDING = "BILL_PASSING_PENDING".intern();
		}
		public static class ServiceOrderType
		{
			public static final String PSO = "PSO".intern();
			public static final String FSO = "FSO".intern();
		}
		public static class SupplierLiabilityStatus
		{
			public static final String PSL_GENERATED = "PSL_GENERATED".intern();
			public static final String PSL_CANCELLED = "PSL_CANCELLED".intern();
			public static final String FSL_GENERATED = "FSL_GENERATED".intern();
			public static final String FSL_NOT_GENERATED = "FSL_NOT_GENERATED".intern();
			public static final String FSL_CANCELLED = "FSL_CANCELLED".intern();
			public static final String BILL_PASSING_PENDING = "BILL_PASSING_PENDING".intern();
		}
		public static class SupplierLiabilityType
		{
			public static final String PSL = "PSL".intern();
			public static final String FSL = "FSL".intern();
		}
		public static class TDSApprovalStatus
		{
			public static final String NOT_SUBMITTED = "NOT_SUBMITTED".intern();
			public static final String PENDING_FOR_APPROVAL = "PENDING_FOR_APPROVAL".intern();
			public static final String REJECTED = "REJECTED".intern();
			public static final String APPROVED = "APPROVED".intern();
		}
		public static class TDSTaxElement
		{
			public static final String AMOUNT = "AMOUNT".intern();
			public static final String MAIN_TDS = "MAIN_TDS".intern();
			public static final String EDU_CESS = "EDU_CESS".intern();
			public static final String HI_EDU_CESS = "HI_EDU_CESS".intern();
			public static final String SURCHARGE = "SURCHARGE".intern();
		}
	}
	public static class Relations
	{
		public static final String ORDER2DOCUMENTSETTINGREL = "Order2DocumentSettingREL".intern();
		public static final String PAYMENTADVICE2SERVICEORDERREL = "PaymentAdvice2ServiceOrderREL".intern();
		public static final String RECONFIRMATIONCONFIG2CLIENTRECONFIRMATIONCONFIGREL = "ReconfirmationConfig2ClientReconfirmationConfigREL".intern();
		public static final String RECONFIRMATIONCONFIG2RECONFIRMATIONINTERVALREL = "ReconfirmationConfig2ReconfirmationIntervalREL".intern();
		public static final String RECONFIRMATIONCONFIG2RECONFIRMATIONTRAVELDESTINATIONREL = "ReconfirmationConfig2ReconfirmationTravelDestinationREL".intern();
		public static final String RECONFIRMATIONCONFIG2SUPPLIERRECONFIRMATIONCONFIGREL = "ReconfirmationConfig2SupplierReconfirmationConfigREL".intern();
		public static final String SUPPLIERINVOICE2SERVICEORDERREL = "SupplierInvoice2ServiceOrderREL".intern();
		public static final String TDSMASTER2ABSTRACTTDSRULEREL = "TDSMaster2AbstractTDSRuleREL".intern();
		public static final String TDSMASTER2TDSCOMPANYTYPEREL = "TDSMaster2TDSCompanyTypeREL".intern();
		public static final String TDSMASTER2TDSEXEMPTIONREL = "TDSMaster2TDSExemptionREL".intern();
		public static final String TDSMASTER2TDSTAXCOMPONENTREL = "TDSMaster2TDSTaxComponentREL".intern();
	}
	
	protected GeneratedOperationmastercoreConstants()
	{
		// private constructor
	}
	
	
}
