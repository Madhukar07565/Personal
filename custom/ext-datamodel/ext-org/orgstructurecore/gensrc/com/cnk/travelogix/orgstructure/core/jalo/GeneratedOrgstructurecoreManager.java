/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.jalo;

import com.cnk.travelogix.masterdata.core.department.jalo.Department;
import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.iata.jalo.IATAAgency;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.GroupCompany;
import com.cnk.travelogix.orgstructure.core.jalo.GroupOfCompanies;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import com.cnk.travelogix.orgstructure.core.kyc.jalo.KYCRequirement;
import com.cnk.travelogix.orgstructure.core.revenuerecognition.jalo.RevenueRecognitionConfig;
import com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel;
import com.cnk.travelogix.orgstructure.core.sales.jalo.Division;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesGroup;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesOffice;
import de.hybris.platform.catalog.jalo.Catalog;
import de.hybris.platform.catalog.jalo.Company;
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
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
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
 * Generated class for type <code>OrgstructurecoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOrgstructurecoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n STRATEGICBUSINESSUNITS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<StrategicBusinessUnit> COMPANY2SBUSTRATEGICBUSINESSUNITSHANDLER = new OneToManyHandler<StrategicBusinessUnit>(
	OrgstructurecoreConstants.TC.STRATEGICBUSINESSUNIT,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n REVRECCONFIGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RevenueRecognitionConfig> COMPANY2REVRECCONFREVRECCONFIGSHANDLER = new OneToManyHandler<RevenueRecognitionConfig>(
	OrgstructurecoreConstants.TC.REVENUERECOGNITIONCONFIG,
	true,
	"company",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DISTRIBUTIONCHANNELS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DistributionChannel> DISTRIBUTIONCHANNEL2COMPANYDISTRIBUTIONCHANNELSHANDLER = new OneToManyHandler<DistributionChannel>(
	OrgstructurecoreConstants.TC.DISTRIBUTIONCHANNEL,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MARKET's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Market> COMPANY2MARKETMARKETHANDLER = new OneToManyHandler<Market>(
	OrgstructurecoreConstants.TC.MARKET,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/** Relation ordering override parameter constants for Market2CountryRel from ((orgstructurecore))*/
	protected static String MARKET2COUNTRYREL_SRC_ORDERED = "relation.Market2CountryRel.source.ordered";
	protected static String MARKET2COUNTRYREL_TGT_ORDERED = "relation.Market2CountryRel.target.ordered";
	/** Relation disable markmodifed parameter constants for Market2CountryRel from ((orgstructurecore))*/
	protected static String MARKET2COUNTRYREL_MARKMODIFIED = "relation.Market2CountryRel.markmodified";
	/** Relation ordering override parameter constants for KYCRequirement2KYCDocument from ((orgstructurecore))*/
	protected static String KYCREQUIREMENT2KYCDOCUMENT_SRC_ORDERED = "relation.KYCRequirement2KYCDocument.source.ordered";
	protected static String KYCREQUIREMENT2KYCDOCUMENT_TGT_ORDERED = "relation.KYCRequirement2KYCDocument.target.ordered";
	/** Relation disable markmodifed parameter constants for KYCRequirement2KYCDocument from ((orgstructurecore))*/
	protected static String KYCREQUIREMENT2KYCDOCUMENT_MARKMODIFIED = "relation.KYCRequirement2KYCDocument.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("groupCompany", AttributeMode.INITIAL);
		tmp.put("fiscalStart", AttributeMode.INITIAL);
		tmp.put("fiscalEnd", AttributeMode.INITIAL);
		tmp.put("taxHeads", AttributeMode.INITIAL);
		tmp.put("currency", AttributeMode.INITIAL);
		tmp.put("telephone", AttributeMode.INITIAL);
		tmp.put("fax", AttributeMode.INITIAL);
		tmp.put("email", AttributeMode.INITIAL);
		tmp.put("websiteUrl", AttributeMode.INITIAL);
		tmp.put("approvalStatus", AttributeMode.INITIAL);
		tmp.put("activeFrom", AttributeMode.INITIAL);
		tmp.put("activeTo", AttributeMode.INITIAL);
		tmp.put("lockedBy", AttributeMode.INITIAL);
		tmp.put("backendType", AttributeMode.INITIAL);
		tmp.put("workFlowStatus", AttributeMode.INITIAL);
		tmp.put("subscriberAccountRef", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.catalog.jalo.Company", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("department", AttributeMode.INITIAL);
		tmp.put("clientFinanceCode", AttributeMode.INITIAL);
		tmp.put("costCentreCode", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.department.jalo.Department", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("company", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.catalog.jalo.Catalog", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>Company.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom(final SessionContext ctx, final Company item)
	{
		return (Date)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.ACTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom(final Company item)
	{
		return getActiveFrom( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final SessionContext ctx, final Company item, final Date value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.ACTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Company item, final Date value)
	{
		setActiveFrom( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.activeTo</code> attribute.
	 * @return the activeTo
	 */
	public Date getActiveTo(final SessionContext ctx, final Company item)
	{
		return (Date)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.ACTIVETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.activeTo</code> attribute.
	 * @return the activeTo
	 */
	public Date getActiveTo(final Company item)
	{
		return getActiveTo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.activeTo</code> attribute. 
	 * @param value the activeTo
	 */
	public void setActiveTo(final SessionContext ctx, final Company item, final Date value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.ACTIVETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.activeTo</code> attribute. 
	 * @param value the activeTo
	 */
	public void setActiveTo(final Company item, final Date value)
	{
		setActiveTo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus(final SessionContext ctx, final Company item)
	{
		return (EnumerationValue)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.APPROVALSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus(final Company item)
	{
		return getApprovalStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final SessionContext ctx, final Company item, final EnumerationValue value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.APPROVALSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final Company item, final EnumerationValue value)
	{
		setApprovalStatus( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.backendType</code> attribute.
	 * @return the backendType
	 */
	public EnumerationValue getBackendType(final SessionContext ctx, final Company item)
	{
		return (EnumerationValue)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.BACKENDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.backendType</code> attribute.
	 * @return the backendType
	 */
	public EnumerationValue getBackendType(final Company item)
	{
		return getBackendType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.backendType</code> attribute. 
	 * @param value the backendType
	 */
	public void setBackendType(final SessionContext ctx, final Company item, final EnumerationValue value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.BACKENDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.backendType</code> attribute. 
	 * @param value the backendType
	 */
	public void setBackendType(final Company item, final EnumerationValue value)
	{
		setBackendType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.clientFinanceCode</code> attribute.
	 * @return the clientFinanceCode
	 */
	public String getClientFinanceCode(final SessionContext ctx, final Department item)
	{
		return (String)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Department.CLIENTFINANCECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.clientFinanceCode</code> attribute.
	 * @return the clientFinanceCode
	 */
	public String getClientFinanceCode(final Department item)
	{
		return getClientFinanceCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.clientFinanceCode</code> attribute. 
	 * @param value the clientFinanceCode
	 */
	public void setClientFinanceCode(final SessionContext ctx, final Department item, final String value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Department.CLIENTFINANCECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.clientFinanceCode</code> attribute. 
	 * @param value the clientFinanceCode
	 */
	public void setClientFinanceCode(final Department item, final String value)
	{
		setClientFinanceCode( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Catalog.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx, final Catalog item)
	{
		return (Company)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Catalog.COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Catalog.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final Catalog item)
	{
		return getCompany( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Catalog.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Catalog item, final Company value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Catalog.COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Catalog.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Catalog item, final Company value)
	{
		setCompany( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.companyMarkets</code> attribute.
	 * @return the companyMarkets
	 */
	public Set<Market> getCompanyMarkets(final SessionContext ctx, final Country item)
	{
		final List<Market> items = item.getLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			"Market",
			null,
			false,
			false
		);
		return new LinkedHashSet<Market>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Country.companyMarkets</code> attribute.
	 * @return the companyMarkets
	 */
	public Set<Market> getCompanyMarkets(final Country item)
	{
		return getCompanyMarkets( getSession().getSessionContext(), item );
	}
	
	public long getCompanyMarketsCount(final SessionContext ctx, final Country item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			"Market",
			null
		);
	}
	
	public long getCompanyMarketsCount(final Country item)
	{
		return getCompanyMarketsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.companyMarkets</code> attribute. 
	 * @param value the companyMarkets
	 */
	public void setCompanyMarkets(final SessionContext ctx, final Country item, final Set<Market> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MARKET2COUNTRYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Country.companyMarkets</code> attribute. 
	 * @param value the companyMarkets
	 */
	public void setCompanyMarkets(final Country item, final Set<Market> value)
	{
		setCompanyMarkets( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyMarkets. 
	 * @param value the item to add to companyMarkets
	 */
	public void addToCompanyMarkets(final SessionContext ctx, final Country item, final Market value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MARKET2COUNTRYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyMarkets. 
	 * @param value the item to add to companyMarkets
	 */
	public void addToCompanyMarkets(final Country item, final Market value)
	{
		addToCompanyMarkets( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyMarkets. 
	 * @param value the item to remove from companyMarkets
	 */
	public void removeFromCompanyMarkets(final SessionContext ctx, final Country item, final Market value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MARKET2COUNTRYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyMarkets. 
	 * @param value the item to remove from companyMarkets
	 */
	public void removeFromCompanyMarkets(final Country item, final Market value)
	{
		removeFromCompanyMarkets( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.costCentreCode</code> attribute.
	 * @return the costCentreCode
	 */
	public EnumerationValue getCostCentreCode(final SessionContext ctx, final Department item)
	{
		return (EnumerationValue)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Department.COSTCENTRECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.costCentreCode</code> attribute.
	 * @return the costCentreCode
	 */
	public EnumerationValue getCostCentreCode(final Department item)
	{
		return getCostCentreCode( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.costCentreCode</code> attribute. 
	 * @param value the costCentreCode
	 */
	public void setCostCentreCode(final SessionContext ctx, final Department item, final EnumerationValue value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Department.COSTCENTRECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.costCentreCode</code> attribute. 
	 * @param value the costCentreCode
	 */
	public void setCostCentreCode(final Department item, final EnumerationValue value)
	{
		setCostCentreCode( getSession().getSessionContext(), item, value );
	}
	
	public BusinessUnit createBusinessUnit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.BUSINESSUNIT );
			return (BusinessUnit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BusinessUnit : "+e.getMessage(), 0 );
		}
	}
	
	public BusinessUnit createBusinessUnit(final Map attributeValues)
	{
		return createBusinessUnit( getSession().getSessionContext(), attributeValues );
	}
	
	public DistributionChannel createDistributionChannel(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.DISTRIBUTIONCHANNEL );
			return (DistributionChannel)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating DistributionChannel : "+e.getMessage(), 0 );
		}
	}
	
	public DistributionChannel createDistributionChannel(final Map attributeValues)
	{
		return createDistributionChannel( getSession().getSessionContext(), attributeValues );
	}
	
	public Division createDivision(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.DIVISION );
			return (Division)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Division : "+e.getMessage(), 0 );
		}
	}
	
	public Division createDivision(final Map attributeValues)
	{
		return createDivision( getSession().getSessionContext(), attributeValues );
	}
	
	public GroupCompany createGroupCompany(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.GROUPCOMPANY );
			return (GroupCompany)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating GroupCompany : "+e.getMessage(), 0 );
		}
	}
	
	public GroupCompany createGroupCompany(final Map attributeValues)
	{
		return createGroupCompany( getSession().getSessionContext(), attributeValues );
	}
	
	public GroupOfCompanies createGroupOfCompanies(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.GROUPOFCOMPANIES );
			return (GroupOfCompanies)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating GroupOfCompanies : "+e.getMessage(), 0 );
		}
	}
	
	public GroupOfCompanies createGroupOfCompanies(final Map attributeValues)
	{
		return createGroupOfCompanies( getSession().getSessionContext(), attributeValues );
	}
	
	public IATAAgency createIATAAgency(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.IATAAGENCY );
			return (IATAAgency)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating IATAAgency : "+e.getMessage(), 0 );
		}
	}
	
	public IATAAgency createIATAAgency(final Map attributeValues)
	{
		return createIATAAgency( getSession().getSessionContext(), attributeValues );
	}
	
	public KYCRequirement createKYCRequirement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.KYCREQUIREMENT );
			return (KYCRequirement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating KYCRequirement : "+e.getMessage(), 0 );
		}
	}
	
	public KYCRequirement createKYCRequirement(final Map attributeValues)
	{
		return createKYCRequirement( getSession().getSessionContext(), attributeValues );
	}
	
	public Market createMarket(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.MARKET );
			return (Market)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Market : "+e.getMessage(), 0 );
		}
	}
	
	public Market createMarket(final Map attributeValues)
	{
		return createMarket( getSession().getSessionContext(), attributeValues );
	}
	
	public RevenueRecognitionConfig createRevenueRecognitionConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.REVENUERECOGNITIONCONFIG );
			return (RevenueRecognitionConfig)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating RevenueRecognitionConfig : "+e.getMessage(), 0 );
		}
	}
	
	public RevenueRecognitionConfig createRevenueRecognitionConfig(final Map attributeValues)
	{
		return createRevenueRecognitionConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public SalesGroup createSalesGroup(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.SALESGROUP );
			return (SalesGroup)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SalesGroup : "+e.getMessage(), 0 );
		}
	}
	
	public SalesGroup createSalesGroup(final Map attributeValues)
	{
		return createSalesGroup( getSession().getSessionContext(), attributeValues );
	}
	
	public SalesOffice createSalesOffice(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.SALESOFFICE );
			return (SalesOffice)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SalesOffice : "+e.getMessage(), 0 );
		}
	}
	
	public SalesOffice createSalesOffice(final Map attributeValues)
	{
		return createSalesOffice( getSession().getSessionContext(), attributeValues );
	}
	
	public StrategicBusinessUnit createStrategicBusinessUnit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OrgstructurecoreConstants.TC.STRATEGICBUSINESSUNIT );
			return (StrategicBusinessUnit)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating StrategicBusinessUnit : "+e.getMessage(), 0 );
		}
	}
	
	public StrategicBusinessUnit createStrategicBusinessUnit(final Map attributeValues)
	{
		return createStrategicBusinessUnit( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx, final Company item)
	{
		return (Currency)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final Company item)
	{
		return getCurrency( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Company item, final Currency value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Company item, final Currency value)
	{
		setCurrency( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.department</code> attribute.
	 * @return the department
	 */
	public String getDepartment(final SessionContext ctx, final Department item)
	{
		return (String)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Department.DEPARTMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Department.department</code> attribute.
	 * @return the department
	 */
	public String getDepartment(final Department item)
	{
		return getDepartment( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Department item, final String value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Department.DEPARTMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Department.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Department item, final String value)
	{
		setDepartment( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.distributionChannels</code> attribute.
	 * @return the distributionChannels
	 */
	public Collection<DistributionChannel> getDistributionChannels(final SessionContext ctx, final Company item)
	{
		return DISTRIBUTIONCHANNEL2COMPANYDISTRIBUTIONCHANNELSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.distributionChannels</code> attribute.
	 * @return the distributionChannels
	 */
	public Collection<DistributionChannel> getDistributionChannels(final Company item)
	{
		return getDistributionChannels( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.distributionChannels</code> attribute. 
	 * @param value the distributionChannels
	 */
	public void setDistributionChannels(final SessionContext ctx, final Company item, final Collection<DistributionChannel> value)
	{
		DISTRIBUTIONCHANNEL2COMPANYDISTRIBUTIONCHANNELSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.distributionChannels</code> attribute. 
	 * @param value the distributionChannels
	 */
	public void setDistributionChannels(final Company item, final Collection<DistributionChannel> value)
	{
		setDistributionChannels( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributionChannels. 
	 * @param value the item to add to distributionChannels
	 */
	public void addToDistributionChannels(final SessionContext ctx, final Company item, final DistributionChannel value)
	{
		DISTRIBUTIONCHANNEL2COMPANYDISTRIBUTIONCHANNELSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to distributionChannels. 
	 * @param value the item to add to distributionChannels
	 */
	public void addToDistributionChannels(final Company item, final DistributionChannel value)
	{
		addToDistributionChannels( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributionChannels. 
	 * @param value the item to remove from distributionChannels
	 */
	public void removeFromDistributionChannels(final SessionContext ctx, final Company item, final DistributionChannel value)
	{
		DISTRIBUTIONCHANNEL2COMPANYDISTRIBUTIONCHANNELSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from distributionChannels. 
	 * @param value the item to remove from distributionChannels
	 */
	public void removeFromDistributionChannels(final Company item, final DistributionChannel value)
	{
		removeFromDistributionChannels( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx, final Company item)
	{
		return (String)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final Company item)
	{
		return getEmail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final Company item, final String value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final Company item, final String value)
	{
		setEmail( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.fax</code> attribute.
	 * @return the fax
	 */
	public String getFax(final SessionContext ctx, final Company item)
	{
		return (String)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.FAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.fax</code> attribute.
	 * @return the fax
	 */
	public String getFax(final Company item)
	{
		return getFax( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.fax</code> attribute. 
	 * @param value the fax
	 */
	public void setFax(final SessionContext ctx, final Company item, final String value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.FAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.fax</code> attribute. 
	 * @param value the fax
	 */
	public void setFax(final Company item, final String value)
	{
		setFax( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.fiscalEnd</code> attribute.
	 * @return the fiscalEnd
	 */
	public EnumerationValue getFiscalEnd(final SessionContext ctx, final Company item)
	{
		return (EnumerationValue)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.FISCALEND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.fiscalEnd</code> attribute.
	 * @return the fiscalEnd
	 */
	public EnumerationValue getFiscalEnd(final Company item)
	{
		return getFiscalEnd( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.fiscalEnd</code> attribute. 
	 * @param value the fiscalEnd
	 */
	public void setFiscalEnd(final SessionContext ctx, final Company item, final EnumerationValue value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.FISCALEND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.fiscalEnd</code> attribute. 
	 * @param value the fiscalEnd
	 */
	public void setFiscalEnd(final Company item, final EnumerationValue value)
	{
		setFiscalEnd( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.fiscalStart</code> attribute.
	 * @return the fiscalStart
	 */
	public EnumerationValue getFiscalStart(final SessionContext ctx, final Company item)
	{
		return (EnumerationValue)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.FISCALSTART);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.fiscalStart</code> attribute.
	 * @return the fiscalStart
	 */
	public EnumerationValue getFiscalStart(final Company item)
	{
		return getFiscalStart( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.fiscalStart</code> attribute. 
	 * @param value the fiscalStart
	 */
	public void setFiscalStart(final SessionContext ctx, final Company item, final EnumerationValue value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.FISCALSTART,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.fiscalStart</code> attribute. 
	 * @param value the fiscalStart
	 */
	public void setFiscalStart(final Company item, final EnumerationValue value)
	{
		setFiscalStart( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return OrgstructurecoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.groupCompany</code> attribute.
	 * @return the groupCompany - Group Company
	 */
	public GroupCompany getGroupCompany(final SessionContext ctx, final Company item)
	{
		return (GroupCompany)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.GROUPCOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.groupCompany</code> attribute.
	 * @return the groupCompany - Group Company
	 */
	public GroupCompany getGroupCompany(final Company item)
	{
		return getGroupCompany( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.groupCompany</code> attribute. 
	 * @param value the groupCompany - Group Company
	 */
	public void setGroupCompany(final SessionContext ctx, final Company item, final GroupCompany value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.GROUPCOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.groupCompany</code> attribute. 
	 * @param value the groupCompany - Group Company
	 */
	public void setGroupCompany(final Company item, final GroupCompany value)
	{
		setGroupCompany( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCDocumentType.kycRequirement</code> attribute.
	 * @return the kycRequirement
	 */
	public Set<KYCRequirement> getKycRequirement(final SessionContext ctx, final EnumerationValue item)
	{
		final List<KYCRequirement> items = item.getLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			"KYCRequirement",
			null,
			false,
			false
		);
		return new LinkedHashSet<KYCRequirement>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCDocumentType.kycRequirement</code> attribute.
	 * @return the kycRequirement
	 */
	public Set<KYCRequirement> getKycRequirement(final EnumerationValue item)
	{
		return getKycRequirement( getSession().getSessionContext(), item );
	}
	
	public long getKycRequirementCount(final SessionContext ctx, final EnumerationValue item)
	{
		return item.getLinkedItemsCount(
			ctx,
			false,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			"KYCRequirement",
			null
		);
	}
	
	public long getKycRequirementCount(final EnumerationValue item)
	{
		return getKycRequirementCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCDocumentType.kycRequirement</code> attribute. 
	 * @param value the kycRequirement
	 */
	public void setKycRequirement(final SessionContext ctx, final EnumerationValue item, final Set<KYCRequirement> value)
	{
		item.setLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(KYCREQUIREMENT2KYCDOCUMENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCDocumentType.kycRequirement</code> attribute. 
	 * @param value the kycRequirement
	 */
	public void setKycRequirement(final EnumerationValue item, final Set<KYCRequirement> value)
	{
		setKycRequirement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycRequirement. 
	 * @param value the item to add to kycRequirement
	 */
	public void addToKycRequirement(final SessionContext ctx, final EnumerationValue item, final KYCRequirement value)
	{
		item.addLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(KYCREQUIREMENT2KYCDOCUMENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycRequirement. 
	 * @param value the item to add to kycRequirement
	 */
	public void addToKycRequirement(final EnumerationValue item, final KYCRequirement value)
	{
		addToKycRequirement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycRequirement. 
	 * @param value the item to remove from kycRequirement
	 */
	public void removeFromKycRequirement(final SessionContext ctx, final EnumerationValue item, final KYCRequirement value)
	{
		item.removeLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(KYCREQUIREMENT2KYCDOCUMENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycRequirement. 
	 * @param value the item to remove from kycRequirement
	 */
	public void removeFromKycRequirement(final EnumerationValue item, final KYCRequirement value)
	{
		removeFromKycRequirement( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx, final Company item)
	{
		return (Employee)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final Company item)
	{
		return getLockedBy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Company item, final Employee value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Company item, final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.market</code> attribute.
	 * @return the market
	 */
	public Collection<Market> getMarket(final SessionContext ctx, final Company item)
	{
		return COMPANY2MARKETMARKETHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.market</code> attribute.
	 * @return the market
	 */
	public Collection<Market> getMarket(final Company item)
	{
		return getMarket( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.market</code> attribute. 
	 * @param value the market
	 */
	public void setMarket(final SessionContext ctx, final Company item, final Collection<Market> value)
	{
		COMPANY2MARKETMARKETHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.market</code> attribute. 
	 * @param value the market
	 */
	public void setMarket(final Company item, final Collection<Market> value)
	{
		setMarket( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to market. 
	 * @param value the item to add to market
	 */
	public void addToMarket(final SessionContext ctx, final Company item, final Market value)
	{
		COMPANY2MARKETMARKETHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to market. 
	 * @param value the item to add to market
	 */
	public void addToMarket(final Company item, final Market value)
	{
		addToMarket( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from market. 
	 * @param value the item to remove from market
	 */
	public void removeFromMarket(final SessionContext ctx, final Company item, final Market value)
	{
		COMPANY2MARKETMARKETHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from market. 
	 * @param value the item to remove from market
	 */
	public void removeFromMarket(final Company item, final Market value)
	{
		removeFromMarket( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.revRecConfigs</code> attribute.
	 * @return the revRecConfigs
	 */
	public Set<RevenueRecognitionConfig> getRevRecConfigs(final SessionContext ctx, final Company item)
	{
		return (Set<RevenueRecognitionConfig>)COMPANY2REVRECCONFREVRECCONFIGSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.revRecConfigs</code> attribute.
	 * @return the revRecConfigs
	 */
	public Set<RevenueRecognitionConfig> getRevRecConfigs(final Company item)
	{
		return getRevRecConfigs( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.revRecConfigs</code> attribute. 
	 * @param value the revRecConfigs
	 */
	public void setRevRecConfigs(final SessionContext ctx, final Company item, final Set<RevenueRecognitionConfig> value)
	{
		COMPANY2REVRECCONFREVRECCONFIGSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.revRecConfigs</code> attribute. 
	 * @param value the revRecConfigs
	 */
	public void setRevRecConfigs(final Company item, final Set<RevenueRecognitionConfig> value)
	{
		setRevRecConfigs( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to revRecConfigs. 
	 * @param value the item to add to revRecConfigs
	 */
	public void addToRevRecConfigs(final SessionContext ctx, final Company item, final RevenueRecognitionConfig value)
	{
		COMPANY2REVRECCONFREVRECCONFIGSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to revRecConfigs. 
	 * @param value the item to add to revRecConfigs
	 */
	public void addToRevRecConfigs(final Company item, final RevenueRecognitionConfig value)
	{
		addToRevRecConfigs( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from revRecConfigs. 
	 * @param value the item to remove from revRecConfigs
	 */
	public void removeFromRevRecConfigs(final SessionContext ctx, final Company item, final RevenueRecognitionConfig value)
	{
		COMPANY2REVRECCONFREVRECCONFIGSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from revRecConfigs. 
	 * @param value the item to remove from revRecConfigs
	 */
	public void removeFromRevRecConfigs(final Company item, final RevenueRecognitionConfig value)
	{
		removeFromRevRecConfigs( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.strategicBusinessUnits</code> attribute.
	 * @return the strategicBusinessUnits
	 */
	public Set<StrategicBusinessUnit> getStrategicBusinessUnits(final SessionContext ctx, final Company item)
	{
		return (Set<StrategicBusinessUnit>)COMPANY2SBUSTRATEGICBUSINESSUNITSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.strategicBusinessUnits</code> attribute.
	 * @return the strategicBusinessUnits
	 */
	public Set<StrategicBusinessUnit> getStrategicBusinessUnits(final Company item)
	{
		return getStrategicBusinessUnits( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.strategicBusinessUnits</code> attribute. 
	 * @param value the strategicBusinessUnits
	 */
	public void setStrategicBusinessUnits(final SessionContext ctx, final Company item, final Set<StrategicBusinessUnit> value)
	{
		COMPANY2SBUSTRATEGICBUSINESSUNITSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.strategicBusinessUnits</code> attribute. 
	 * @param value the strategicBusinessUnits
	 */
	public void setStrategicBusinessUnits(final Company item, final Set<StrategicBusinessUnit> value)
	{
		setStrategicBusinessUnits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to strategicBusinessUnits. 
	 * @param value the item to add to strategicBusinessUnits
	 */
	public void addToStrategicBusinessUnits(final SessionContext ctx, final Company item, final StrategicBusinessUnit value)
	{
		COMPANY2SBUSTRATEGICBUSINESSUNITSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to strategicBusinessUnits. 
	 * @param value the item to add to strategicBusinessUnits
	 */
	public void addToStrategicBusinessUnits(final Company item, final StrategicBusinessUnit value)
	{
		addToStrategicBusinessUnits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from strategicBusinessUnits. 
	 * @param value the item to remove from strategicBusinessUnits
	 */
	public void removeFromStrategicBusinessUnits(final SessionContext ctx, final Company item, final StrategicBusinessUnit value)
	{
		COMPANY2SBUSTRATEGICBUSINESSUNITSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from strategicBusinessUnits. 
	 * @param value the item to remove from strategicBusinessUnits
	 */
	public void removeFromStrategicBusinessUnits(final Company item, final StrategicBusinessUnit value)
	{
		removeFromStrategicBusinessUnits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.subscriberAccountRef</code> attribute.
	 * @return the subscriberAccountRef
	 */
	public String getSubscriberAccountRef(final SessionContext ctx, final Company item)
	{
		return (String)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.SUBSCRIBERACCOUNTREF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.subscriberAccountRef</code> attribute.
	 * @return the subscriberAccountRef
	 */
	public String getSubscriberAccountRef(final Company item)
	{
		return getSubscriberAccountRef( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.subscriberAccountRef</code> attribute. 
	 * @param value the subscriberAccountRef
	 */
	public void setSubscriberAccountRef(final SessionContext ctx, final Company item, final String value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.SUBSCRIBERACCOUNTREF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.subscriberAccountRef</code> attribute. 
	 * @param value the subscriberAccountRef
	 */
	public void setSubscriberAccountRef(final Company item, final String value)
	{
		setSubscriberAccountRef( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.taxHeads</code> attribute.
	 * @return the taxHeads
	 */
	public Map<EnumerationValue,String> getAllTaxHeads(final SessionContext ctx, final Company item)
	{
		Map<EnumerationValue,String> map = (Map<EnumerationValue,String>)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.TAXHEADS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.taxHeads</code> attribute.
	 * @return the taxHeads
	 */
	public Map<EnumerationValue,String> getAllTaxHeads(final Company item)
	{
		return getAllTaxHeads( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.taxHeads</code> attribute. 
	 * @param value the taxHeads
	 */
	public void setAllTaxHeads(final SessionContext ctx, final Company item, final Map<EnumerationValue,String> value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.TAXHEADS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.taxHeads</code> attribute. 
	 * @param value the taxHeads
	 */
	public void setAllTaxHeads(final Company item, final Map<EnumerationValue,String> value)
	{
		setAllTaxHeads( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone(final SessionContext ctx, final Company item)
	{
		return (String)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.TELEPHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone(final Company item)
	{
		return getTelephone( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final SessionContext ctx, final Company item, final String value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.TELEPHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final Company item, final String value)
	{
		setTelephone( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.websiteUrl</code> attribute.
	 * @return the websiteUrl
	 */
	public String getWebsiteUrl(final SessionContext ctx, final Company item)
	{
		return (String)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.WEBSITEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.websiteUrl</code> attribute.
	 * @return the websiteUrl
	 */
	public String getWebsiteUrl(final Company item)
	{
		return getWebsiteUrl( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.websiteUrl</code> attribute. 
	 * @param value the websiteUrl
	 */
	public void setWebsiteUrl(final SessionContext ctx, final Company item, final String value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.WEBSITEURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.websiteUrl</code> attribute. 
	 * @param value the websiteUrl
	 */
	public void setWebsiteUrl(final Company item, final String value)
	{
		setWebsiteUrl( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx, final Company item)
	{
		return (EnumerationValue)item.getProperty( ctx, OrgstructurecoreConstants.Attributes.Company.WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Company.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final Company item)
	{
		return getWorkFlowStatus( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final Company item, final EnumerationValue value)
	{
		item.setProperty(ctx, OrgstructurecoreConstants.Attributes.Company.WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Company.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final Company item, final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), item, value );
	}
	
}
