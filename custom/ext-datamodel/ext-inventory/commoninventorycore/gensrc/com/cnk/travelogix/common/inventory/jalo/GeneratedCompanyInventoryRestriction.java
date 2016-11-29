/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.client.core.clienttype.jalo.TravelogixClientType;
import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.jalo.AbstractInventoryRequest;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import de.hybris.platform.b2b.jalo.B2BUserGroup;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.jalo.CompanyInventoryRestriction CompanyInventoryRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyInventoryRestriction extends GenericItem
{
	/** Qualifier of the <code>CompanyInventoryRestriction.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>CompanyInventoryRestriction.sbu</code> attribute **/
	public static final String SBU = "sbu";
	/** Qualifier of the <code>CompanyInventoryRestriction.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>CompanyInventoryRestriction.clientGroup</code> attribute **/
	public static final String CLIENTGROUP = "clientGroup";
	/** Qualifier of the <code>CompanyInventoryRestriction.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>CompanyInventoryRestriction.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>CompanyInventoryRestriction.settlewith</code> attribute **/
	public static final String SETTLEWITH = "settlewith";
	/** Qualifier of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute **/
	public static final String COMPANIESINVENTORYREQUESTPOS = "companiesInventoryRequestPOS";
	/** Qualifier of the <code>CompanyInventoryRestriction.companiesInventoryRequest</code> attribute **/
	public static final String COMPANIESINVENTORYREQUEST = "companiesInventoryRequest";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANIESINVENTORYREQUEST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCompanyInventoryRestriction> COMPANIESINVENTORYREQUESTHANDLER = new BidirectionalOneToManyHandler<GeneratedCompanyInventoryRestriction>(
	CommoninventorycoreConstants.TC.COMPANYINVENTORYRESTRICTION,
	false,
	"companiesInventoryRequest",
	"companiesInventoryRequestPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(SBU, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(CLIENTGROUP, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		tmp.put(SETTLEWITH, AttributeMode.INITIAL);
		tmp.put(COMPANIESINVENTORYREQUESTPOS, AttributeMode.INITIAL);
		tmp.put(COMPANIESINVENTORYREQUEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.bu</code> attribute.
	 * @return the bu - Business Unit
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.bu</code> attribute.
	 * @return the bu - Business Unit
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.bu</code> attribute. 
	 * @param value the bu - Business Unit
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.bu</code> attribute. 
	 * @param value the bu - Business Unit
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.client</code> attribute.
	 * @return the client - B2Bunit
	 */
	public TravelogixB2BUnit getClient(final SessionContext ctx)
	{
		return (TravelogixB2BUnit)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.client</code> attribute.
	 * @return the client - B2Bunit
	 */
	public TravelogixB2BUnit getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.client</code> attribute. 
	 * @param value the client - B2Bunit
	 */
	public void setClient(final SessionContext ctx, final TravelogixB2BUnit value)
	{
		setProperty(ctx, CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.client</code> attribute. 
	 * @param value the client - B2Bunit
	 */
	public void setClient(final TravelogixB2BUnit value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.clientGroup</code> attribute.
	 * @return the clientGroup - B2B UserGroup
	 */
	public B2BUserGroup getClientGroup(final SessionContext ctx)
	{
		return (B2BUserGroup)getProperty( ctx, CLIENTGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.clientGroup</code> attribute.
	 * @return the clientGroup - B2B UserGroup
	 */
	public B2BUserGroup getClientGroup()
	{
		return getClientGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.clientGroup</code> attribute. 
	 * @param value the clientGroup - B2B UserGroup
	 */
	public void setClientGroup(final SessionContext ctx, final B2BUserGroup value)
	{
		setProperty(ctx, CLIENTGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.clientGroup</code> attribute. 
	 * @param value the clientGroup - B2B UserGroup
	 */
	public void setClientGroup(final B2BUserGroup value)
	{
		setClientGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.clientType</code> attribute.
	 * @return the clientType - Client Type
	 */
	public TravelogixClientType getClientType(final SessionContext ctx)
	{
		return (TravelogixClientType)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.clientType</code> attribute.
	 * @return the clientType - Client Type
	 */
	public TravelogixClientType getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.clientType</code> attribute. 
	 * @param value the clientType - Client Type
	 */
	public void setClientType(final SessionContext ctx, final TravelogixClientType value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.clientType</code> attribute. 
	 * @param value the clientType - Client Type
	 */
	public void setClientType(final TravelogixClientType value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.companiesInventoryRequest</code> attribute.
	 * @return the companiesInventoryRequest
	 */
	public AbstractInventoryRequest getCompaniesInventoryRequest(final SessionContext ctx)
	{
		return (AbstractInventoryRequest)getProperty( ctx, COMPANIESINVENTORYREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.companiesInventoryRequest</code> attribute.
	 * @return the companiesInventoryRequest
	 */
	public AbstractInventoryRequest getCompaniesInventoryRequest()
	{
		return getCompaniesInventoryRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.companiesInventoryRequest</code> attribute. 
	 * @param value the companiesInventoryRequest
	 */
	public void setCompaniesInventoryRequest(final SessionContext ctx, final AbstractInventoryRequest value)
	{
		COMPANIESINVENTORYREQUESTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.companiesInventoryRequest</code> attribute. 
	 * @param value the companiesInventoryRequest
	 */
	public void setCompaniesInventoryRequest(final AbstractInventoryRequest value)
	{
		setCompaniesInventoryRequest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute.
	 * @return the companiesInventoryRequestPOS
	 */
	 Integer getCompaniesInventoryRequestPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, COMPANIESINVENTORYREQUESTPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute.
	 * @return the companiesInventoryRequestPOS
	 */
	 Integer getCompaniesInventoryRequestPOS()
	{
		return getCompaniesInventoryRequestPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute. 
	 * @return the companiesInventoryRequestPOS
	 */
	 int getCompaniesInventoryRequestPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCompaniesInventoryRequestPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute. 
	 * @return the companiesInventoryRequestPOS
	 */
	 int getCompaniesInventoryRequestPOSAsPrimitive()
	{
		return getCompaniesInventoryRequestPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute. 
	 * @param value the companiesInventoryRequestPOS
	 */
	 void setCompaniesInventoryRequestPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, COMPANIESINVENTORYREQUESTPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute. 
	 * @param value the companiesInventoryRequestPOS
	 */
	 void setCompaniesInventoryRequestPOS(final Integer value)
	{
		setCompaniesInventoryRequestPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute. 
	 * @param value the companiesInventoryRequestPOS
	 */
	 void setCompaniesInventoryRequestPOS(final SessionContext ctx, final int value)
	{
		setCompaniesInventoryRequestPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.companiesInventoryRequestPOS</code> attribute. 
	 * @param value the companiesInventoryRequestPOS
	 */
	 void setCompaniesInventoryRequestPOS(final int value)
	{
		setCompaniesInventoryRequestPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.company</code> attribute.
	 * @return the company - Company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.company</code> attribute.
	 * @return the company - Company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.company</code> attribute. 
	 * @param value the company - Company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.company</code> attribute. 
	 * @param value the company - Company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANIESINVENTORYREQUESTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.sbu</code> attribute.
	 * @return the sbu - Stratergic Business Unit
	 */
	public StrategicBusinessUnit getSbu(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, SBU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.sbu</code> attribute.
	 * @return the sbu - Stratergic Business Unit
	 */
	public StrategicBusinessUnit getSbu()
	{
		return getSbu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.sbu</code> attribute. 
	 * @param value the sbu - Stratergic Business Unit
	 */
	public void setSbu(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		setProperty(ctx, SBU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.sbu</code> attribute. 
	 * @param value the sbu - Stratergic Business Unit
	 */
	public void setSbu(final StrategicBusinessUnit value)
	{
		setSbu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.settlewith</code> attribute.
	 * @return the settlewith - Settle With
	 */
	public EnumerationValue getSettlewith(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SETTLEWITH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyInventoryRestriction.settlewith</code> attribute.
	 * @return the settlewith - Settle With
	 */
	public EnumerationValue getSettlewith()
	{
		return getSettlewith( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.settlewith</code> attribute. 
	 * @param value the settlewith - Settle With
	 */
	public void setSettlewith(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SETTLEWITH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyInventoryRestriction.settlewith</code> attribute. 
	 * @param value the settlewith - Settle With
	 */
	public void setSettlewith(final EnumerationValue value)
	{
		setSettlewith( getSession().getSessionContext(), value );
	}
	
}
