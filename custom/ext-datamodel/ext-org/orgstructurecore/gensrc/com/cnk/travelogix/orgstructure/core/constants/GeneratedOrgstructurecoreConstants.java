/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedOrgstructurecoreConstants
{
	public static final String EXTENSIONNAME = "orgstructurecore";
	public static class TC
	{
		public static final String ABSTRACTORGANIZATION = "AbstractOrganization".intern();
		public static final String BUSINESSUNIT = "BusinessUnit".intern();
		public static final String CLIENTCOMPANYTYPE = "ClientCompanyType".intern();
		public static final String DISTRIBUTIONCHANNEL = "DistributionChannel".intern();
		public static final String DIVISION = "Division".intern();
		public static final String FINANCEBACKENDTYPE = "FinanceBackendType".intern();
		public static final String GROUPCOMPANY = "GroupCompany".intern();
		public static final String GROUPOFCOMPANIES = "GroupOfCompanies".intern();
		public static final String IATAAGENCY = "IATAAgency".intern();
		public static final String KYCDOCUMENTTYPE = "KYCDocumentType".intern();
		public static final String KYCREQUIREMENT = "KYCRequirement".intern();
		public static final String MARKET = "Market".intern();
		public static final String MONTH = "Month".intern();
		public static final String REVENUERECOGNITIONCONFIG = "RevenueRecognitionConfig".intern();
		public static final String REVENUERECOGNITIONTRIGGERTYPE = "RevenueRecognitionTriggerType".intern();
		public static final String SALESGROUP = "SalesGroup".intern();
		public static final String SALESOFFICE = "SalesOffice".intern();
		public static final String STRATEGICBUSINESSUNIT = "StrategicBusinessUnit".intern();
	}
	public static class Attributes
	{
		public static class Catalog
		{
			public static final String COMPANY = "company".intern();
		}
		public static class Company
		{
			public static final String ACTIVEFROM = "activeFrom".intern();
			public static final String ACTIVETO = "activeTo".intern();
			public static final String APPROVALSTATUS = "approvalStatus".intern();
			public static final String BACKENDTYPE = "backendType".intern();
			public static final String CURRENCY = "currency".intern();
			public static final String DISTRIBUTIONCHANNELS = "distributionChannels".intern();
			public static final String EMAIL = "email".intern();
			public static final String FAX = "fax".intern();
			public static final String FISCALEND = "fiscalEnd".intern();
			public static final String FISCALSTART = "fiscalStart".intern();
			public static final String GROUPCOMPANY = "groupCompany".intern();
			public static final String LOCKEDBY = "lockedBy".intern();
			public static final String MARKET = "market".intern();
			public static final String REVRECCONFIGS = "revRecConfigs".intern();
			public static final String STRATEGICBUSINESSUNITS = "strategicBusinessUnits".intern();
			public static final String SUBSCRIBERACCOUNTREF = "subscriberAccountRef".intern();
			public static final String TAXHEADS = "taxHeads".intern();
			public static final String TELEPHONE = "telephone".intern();
			public static final String WEBSITEURL = "websiteUrl".intern();
			public static final String WORKFLOWSTATUS = "workFlowStatus".intern();
		}
		public static class Country
		{
			public static final String COMPANYMARKETS = "companyMarkets".intern();
		}
		public static class Department
		{
			public static final String CLIENTFINANCECODE = "clientFinanceCode".intern();
			public static final String COSTCENTRECODE = "costCentreCode".intern();
			public static final String DEPARTMENT = "department".intern();
		}
		public static class Item
		{
			public static final String CURRENTUSER = "currentUser".intern();
		}
		public static class KYCDocumentType
		{
			public static final String KYCREQUIREMENT = "kycRequirement".intern();
		}
	}
	public static class Enumerations
	{
		public static class ClientCompanyType
		{
			public static final String PUBLIC_LTD = "PUBLIC_LTD".intern();
			public static final String PRIVATE_LTD = "PRIVATE_LTD".intern();
			public static final String PARTNERSHIP_FIRM = "PARTNERSHIP_FIRM".intern();
			public static final String SOLE_TRADER = "SOLE_TRADER".intern();
			public static final String COOPERATIVES = "COOPERATIVES".intern();
			public static final String FRANCHISES = "FRANCHISES".intern();
			public static final String PUBLIC_SECTOR = "PUBLIC_SECTOR".intern();
		}
		public static class FinanceBackendType
		{
			public static final String SAP = "SAP".intern();
			public static final String OTHERS = "OTHERS".intern();
		}
		public static class KYCDocumentType
		{
			public static final String COI = "COI".intern();
			public static final String AOA = "AOA".intern();
			public static final String MOA = "MOA".intern();
			public static final String ROBOD = "ROBOD".intern();
		}
		public static class Month
		{
			public static final String JAN = "JAN".intern();
			public static final String FEB = "FEB".intern();
			public static final String MAR = "MAR".intern();
			public static final String APR = "APR".intern();
			public static final String MAY = "MAY".intern();
			public static final String JUN = "JUN".intern();
			public static final String JUL = "JUL".intern();
			public static final String AUG = "AUG".intern();
			public static final String SEP = "SEP".intern();
			public static final String OCT = "OCT".intern();
			public static final String NOV = "NOV".intern();
			public static final String DEC = "DEC".intern();
		}
		public static class RevenueRecognitionTriggerType
		{
			public static final String TRAVEL = "TRAVEL".intern();
			public static final String TICKETING = "TICKETING".intern();
			public static final String CHECKIN = "CHECKIN".intern();
			public static final String CHECKOUT = "CHECKOUT".intern();
			public static final String SALE = "SALE".intern();
		}
	}
	public static class Relations
	{
		public static final String BU2MARKET = "BU2Market".intern();
		public static final String COMPANY2MARKET = "Company2Market".intern();
		public static final String COMPANY2REVRECCONF = "Company2RevRecConf".intern();
		public static final String COMPANY2SBU = "Company2SBU".intern();
		public static final String DISTRIBUTIONCHANNEL2COMPANY = "DistributionChannel2Company".intern();
		public static final String DISTRIBUTIONCHANNEL2DIVISION = "DistributionChannel2Division".intern();
		public static final String GROUPCOMPANY2COMPANY = "GroupCompany2Company".intern();
		public static final String GROUPOFCOMPANIES2GROUPCOMPANY = "GroupOfCompanies2GroupCompany".intern();
		public static final String KYCREQUIREMENT2KYCDOCUMENT = "KYCRequirement2KYCDocument".intern();
		public static final String MARKET2COUNTRYREL = "Market2CountryRel".intern();
		public static final String MARKET2KYC = "Market2KYC".intern();
		public static final String SALESOFFICE2BU = "SalesOffice2BU".intern();
		public static final String SALESOFFICE2SALESGROUP = "SalesOffice2SalesGroup".intern();
		public static final String SBU2BU = "SBU2BU".intern();
	}
	
	protected GeneratedOrgstructurecoreConstants()
	{
		// private constructor
	}
	
	
}
