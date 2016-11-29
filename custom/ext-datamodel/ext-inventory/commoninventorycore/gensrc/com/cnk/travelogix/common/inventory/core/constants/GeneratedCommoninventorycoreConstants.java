/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedCommoninventorycoreConstants
{
	public static final String EXTENSIONNAME = "commoninventorycore";
	public static class TC
	{
		public static final String ABSTRACTINVENTORYDEFINITION = "AbstractInventoryDefinition".intern();
		public static final String ABSTRACTINVENTORYDETAIL = "AbstractInventoryDetail".intern();
		public static final String ABSTRACTINVENTORYREQUEST = "AbstractInventoryRequest".intern();
		public static final String ABSTRACTPRODUCTINVENTORYDEFINITION = "AbstractProductInventoryDefinition".intern();
		public static final String APPLIEDON = "AppliedOn".intern();
		public static final String ASSOCIATEDCOMPANIES = "AssociatedCompanies".intern();
		public static final String ASSOCIATEINVENTORY = "AssociateInventory".intern();
		public static final String CHANGEREQUESTCUTOFFSANDCHARGES = "ChangeRequestCutOffsAndCharges".intern();
		public static final String CHANGEREQUESTPENALTYCHARGES = "ChangeRequestPenaltyCharges".intern();
		public static final String COMPANYINVENTORYRESTRICTION = "CompanyInventoryRestriction".intern();
		public static final String CUTOFFFORFREESALE = "CutOffForFreeSale".intern();
		public static final String CUTOFFSANDCHARGES = "CutOffsAndCharges".intern();
		public static final String DEFINEDBY = "DefinedBy".intern();
		public static final String FREEOFCOSTSEATSORTICKETS = "FreeOfCostSeatsOrTickets".intern();
		public static final String INITIALINVREQSUPPLIERDETAIL = "InitialInvReqSupplierDetail".intern();
		public static final String INVENTORYAVAILFOR = "InventoryAvailFor".intern();
		public static final String INVENTORYPAYMENTADVICE = "InventoryPaymentAdvice".intern();
		public static final String INVENTORYTYPE = "InventoryType".intern();
		public static final String NAMINGLISTCUTOFFS = "NamingListCutOffs".intern();
		public static final String OVERBOOKINGLIMIT = "OverBookingLimit".intern();
		public static final String PACKAGECATEGORY = "PackageCategory".intern();
		public static final String PAYMENTDETAILSVMPD = "PaymentDetailsVmpd".intern();
		public static final String PAYMENTINFORMATION = "PaymentInformation".intern();
		public static final String PAYMENTSCHEDULE = "PaymentSchedule".intern();
		public static final String PENALTYCHANGESFOR = "PenaltyChangesFor".intern();
		public static final String PREPAYMENTDETAIL = "PrePaymentDetail".intern();
		public static final String RANGE = "Range".intern();
		public static final String REQUESTSTATUS = "RequestStatus".intern();
		public static final String SETTLETYPE = "SettleType".intern();
		public static final String TYPEOFLIST = "TypeOfList".intern();
		public static final String VALIDTYPE = "ValidType".intern();
	}
	public static class Attributes
	{
		public static class Media
		{
			public static final String ABSTRACTINVENTORYDEFINITION = "abstractInventoryDefinition".intern();
			public static final String INVENTORYPAYMENTADVICE = "inventoryPaymentAdvice".intern();
		}
		public static class OperationDuration
		{
			public static final String SUPPLIERNAME = "supplierName".intern();
		}
		public static class PickupAndDropOff
		{
			public static final String SUPPLIERNAME = "supplierName".intern();
			public static final String VEHICLEDETAILS = "vehicleDetails".intern();
		}
		public static class VersionDetail
		{
			public static final String INVENTORYREQUEST = "inventoryRequest".intern();
			public static final String INVENTORYREQUESTPOS = "inventoryRequestPOS".intern();
		}
	}
	public static class Enumerations
	{
		public static class AppliedOn
		{
			public static final String PRIOR_TO_TRAVEL = "PRIOR_TO_TRAVEL".intern();
			public static final String AFTER_BOOKING_DATE = "AFTER_BOOKING_DATE".intern();
		}
		public static class DefinedBy
		{
			public static final String DAYS = "DAYS".intern();
			public static final String HOURS = "HOURS".intern();
		}
		public static class InventoryAvailFor
		{
			public static final String STANDALONE = "STANDALONE".intern();
			public static final String COMBINATION = "COMBINATION".intern();
			public static final String HOLIDAY = "HOLIDAY".intern();
		}
		public static class InventoryType
		{
			public static final String FREESALE = "FREESALE".intern();
			public static final String PREPAID = "PREPAID".intern();
			public static final String POSTPAID = "POSTPAID".intern();
		}
		public static class PackageCategory
		{
			public static final String STANDARD = "STANDARD".intern();
			public static final String SUPERIOR = "SUPERIOR".intern();
			public static final String DELUXE = "DELUXE".intern();
			public static final String LUXURY = "LUXURY".intern();
		}
		public static class PenaltyChangesFor
		{
			public static final String NAME_CHANGE = "NAME_CHANGE".intern();
			public static final String DATE_CHANGE = "DATE_CHANGE".intern();
			public static final String ROUTE_CHANGE = "ROUTE_CHANGE".intern();
		}
		public static class Range
		{
			public static final String ABOVE = "ABOVE".intern();
			public static final String BETWEEN = "BETWEEN".intern();
		}
		public static class RequestStatus
		{
			public static final String SENT_TO_SUPPLIER = "SENT_TO_SUPPLIER".intern();
			public static final String SAVED_IN_SYSTEM = "SAVED_IN_SYSTEM".intern();
			public static final String CANCELLED = "CANCELLED".intern();
		}
		public static class SettleType
		{
			public static final String COMPANY = "COMPANY".intern();
			public static final String SUPPLIER = "SUPPLIER".intern();
		}
		public static class TypeOfList
		{
			public static final String FINAL = "FINAL".intern();
			public static final String PRELIMINARY = "PRELIMINARY".intern();
		}
		public static class ValidType
		{
			public static final String AJITOURDATES = "AJITOURDATES".intern();
			public static final String SPECIFICTOURDATES = "SPECIFICTOURDATES".intern();
		}
	}
	public static class Relations
	{
		public static final String ABSTRACTINVENTORYDEFINITIONTOCOMPANIES = "AbstractInventoryDefinitionToCompanies".intern();
		public static final String ABSTRACTINVENTORYDEFINITIONTOLISTCUTOFFS = "AbstractInventoryDefinitionToListCutOffs".intern();
		public static final String ABSTRACTINVENTORYDEFINITIONTOMEDIA = "AbstractInventoryDefinitionToMedia".intern();
		public static final String ABSTRACTINVENTORYDEFINITIONTOPAYMENTSCHEDULE = "AbstractInventoryDefinitionToPaymentSchedule".intern();
		public static final String ABSTRACTINVENTORYREQUESTTOABSTRACTINVENTORYDEFINITION = "AbstractInventoryRequestToAbstractInventoryDefinition".intern();
		public static final String ABSTRACTPRODUCTINVENTORYDEFINITIONTOASSOCIATEINVENTORY = "AbstractProductInventoryDefinitionToAssociateInventory".intern();
		public static final String CHANGEREQUESTPENALTYCHARGESTOCHANGEREQUESTCUTOFFSANDCHARGES = "ChangeRequestPenaltyChargesToChangeRequestCutOffsAndCharges".intern();
		public static final String INVENTORYPAYMENTADVICETOMEDIAS = "InventoryPaymentAdviceToMedias".intern();
		public static final String INVENTORYPAYMENTADVICETOPREPAYMENT = "InventoryPaymentAdviceToPrePayment".intern();
		public static final String INVENTORYPAYMENTADVICETOVMPDPAYMENTDETAILS = "InventoryPaymentAdviceToVmpdPaymentDetails".intern();
		public static final String INVENTORYREQUESTTOCOMPANYINVENTORYRESTRICTION = "InventoryRequestToCompanyInventoryRestriction".intern();
		public static final String INVENTORYREQUESTTOVERSIONDETAIL = "InventoryRequestToVersionDetail".intern();
	}
	
	protected GeneratedCommoninventorycoreConstants()
	{
		// private constructor
	}
	
	
}
