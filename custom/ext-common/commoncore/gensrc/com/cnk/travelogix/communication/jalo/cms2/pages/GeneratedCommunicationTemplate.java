/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.communication.jalo.cms2.pages;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.acceleratorservices.jalo.cms2.pages.EmailPageTemplate;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.communication.jalo.cms2.pages.CommunicationTemplate CommunicationTemplate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommunicationTemplate extends EmailPageTemplate
{
	/** Qualifier of the <code>CommunicationTemplate.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>CommunicationTemplate.activeFrom</code> attribute **/
	public static final String ACTIVEFROM = "activeFrom";
	/** Qualifier of the <code>CommunicationTemplate.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>CommunicationTemplate.templateType</code> attribute **/
	public static final String TEMPLATETYPE = "templateType";
	/** Qualifier of the <code>CommunicationTemplate.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>CommunicationTemplate.sbu</code> attribute **/
	public static final String SBU = "sbu";
	/** Qualifier of the <code>CommunicationTemplate.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>CommunicationTemplate.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>CommunicationTemplate.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>CommunicationTemplate.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>CommunicationTemplate.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>CommunicationTemplate.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>CommunicationTemplate.process</code> attribute **/
	public static final String PROCESS = "process";
	/** Qualifier of the <code>CommunicationTemplate.functions</code> attribute **/
	public static final String FUNCTIONS = "functions";
	/** Qualifier of the <code>CommunicationTemplate.scenarios</code> attribute **/
	public static final String SCENARIOS = "scenarios";
	/** Qualifier of the <code>CommunicationTemplate.rules</code> attribute **/
	public static final String RULES = "rules";
	/** Qualifier of the <code>CommunicationTemplate.version</code> attribute **/
	public static final String VERSION = "version";
	/** Qualifier of the <code>CommunicationTemplate.site</code> attribute **/
	public static final String SITE = "site";
	/** Qualifier of the <code>CommunicationTemplate.incommingCommunicationType</code> attribute **/
	public static final String INCOMMINGCOMMUNICATIONTYPE = "incommingCommunicationType";
	/** Qualifier of the <code>CommunicationTemplate.communicationTo</code> attribute **/
	public static final String COMMUNICATIONTO = "communicationTo";
	/** Qualifier of the <code>CommunicationTemplate.communicationType</code> attribute **/
	public static final String COMMUNICATIONTYPE = "communicationType";
	/** Qualifier of the <code>CommunicationTemplate.clone</code> attribute **/
	public static final String CLONE = "clone";
	/** Qualifier of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute **/
	public static final String SAVEFORMWORKFLOW = "saveFormWorkflow";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(EmailPageTemplate.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(ACTIVEFROM, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(TEMPLATETYPE, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(SBU, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(PROCESS, AttributeMode.INITIAL);
		tmp.put(FUNCTIONS, AttributeMode.INITIAL);
		tmp.put(SCENARIOS, AttributeMode.INITIAL);
		tmp.put(RULES, AttributeMode.INITIAL);
		tmp.put(VERSION, AttributeMode.INITIAL);
		tmp.put(SITE, AttributeMode.INITIAL);
		tmp.put(INCOMMINGCOMMUNICATIONTYPE, AttributeMode.INITIAL);
		tmp.put(COMMUNICATIONTO, AttributeMode.INITIAL);
		tmp.put(COMMUNICATIONTYPE, AttributeMode.INITIAL);
		tmp.put(CLONE, AttributeMode.INITIAL);
		tmp.put(SAVEFORMWORKFLOW, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom()
	{
		return getActiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Date value)
	{
		setActiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.bu</code> attribute.
	 * @return the bu
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.bu</code> attribute.
	 * @return the bu
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.bu</code> attribute. 
	 * @param value the bu
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.bu</code> attribute. 
	 * @param value the bu
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.client</code> attribute.
	 * @return the client
	 */
	public String getClient(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.client</code> attribute.
	 * @return the client
	 */
	public String getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final String value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.clone</code> attribute.
	 * @return the clone
	 */
	public Boolean isClone(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CLONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.clone</code> attribute.
	 * @return the clone
	 */
	public Boolean isClone()
	{
		return isClone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.clone</code> attribute. 
	 * @return the clone
	 */
	public boolean isCloneAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isClone( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.clone</code> attribute. 
	 * @return the clone
	 */
	public boolean isCloneAsPrimitive()
	{
		return isCloneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.clone</code> attribute. 
	 * @param value the clone
	 */
	public void setClone(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CLONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.clone</code> attribute. 
	 * @param value the clone
	 */
	public void setClone(final Boolean value)
	{
		setClone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.clone</code> attribute. 
	 * @param value the clone
	 */
	public void setClone(final SessionContext ctx, final boolean value)
	{
		setClone( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.clone</code> attribute. 
	 * @param value the clone
	 */
	public void setClone(final boolean value)
	{
		setClone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.communicationTo</code> attribute.
	 * @return the communicationTo
	 */
	public EnumerationValue getCommunicationTo(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMUNICATIONTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.communicationTo</code> attribute.
	 * @return the communicationTo
	 */
	public EnumerationValue getCommunicationTo()
	{
		return getCommunicationTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.communicationTo</code> attribute. 
	 * @param value the communicationTo
	 */
	public void setCommunicationTo(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMUNICATIONTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.communicationTo</code> attribute. 
	 * @param value the communicationTo
	 */
	public void setCommunicationTo(final EnumerationValue value)
	{
		setCommunicationTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.communicationType</code> attribute.
	 * @return the communicationType
	 */
	public EnumerationValue getCommunicationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMUNICATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.communicationType</code> attribute.
	 * @return the communicationType
	 */
	public EnumerationValue getCommunicationType()
	{
		return getCommunicationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.communicationType</code> attribute. 
	 * @param value the communicationType
	 */
	public void setCommunicationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMUNICATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.communicationType</code> attribute. 
	 * @param value the communicationType
	 */
	public void setCommunicationType(final EnumerationValue value)
	{
		setCommunicationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.functions</code> attribute.
	 * @return the functions
	 */
	public String getFunctions(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FUNCTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.functions</code> attribute.
	 * @return the functions
	 */
	public String getFunctions()
	{
		return getFunctions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.functions</code> attribute. 
	 * @param value the functions
	 */
	public void setFunctions(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FUNCTIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.functions</code> attribute. 
	 * @param value the functions
	 */
	public void setFunctions(final String value)
	{
		setFunctions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.incommingCommunicationType</code> attribute.
	 * @return the incommingCommunicationType
	 */
	public EnumerationValue getIncommingCommunicationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INCOMMINGCOMMUNICATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.incommingCommunicationType</code> attribute.
	 * @return the incommingCommunicationType
	 */
	public EnumerationValue getIncommingCommunicationType()
	{
		return getIncommingCommunicationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.incommingCommunicationType</code> attribute. 
	 * @param value the incommingCommunicationType
	 */
	public void setIncommingCommunicationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INCOMMINGCOMMUNICATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.incommingCommunicationType</code> attribute. 
	 * @param value the incommingCommunicationType
	 */
	public void setIncommingCommunicationType(final EnumerationValue value)
	{
		setIncommingCommunicationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.market</code> attribute.
	 * @return the market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.market</code> attribute.
	 * @return the market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.market</code> attribute. 
	 * @param value the market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.market</code> attribute. 
	 * @param value the market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.process</code> attribute.
	 * @return the process
	 */
	public String getProcess(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.process</code> attribute.
	 * @return the process
	 */
	public String getProcess()
	{
		return getProcess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.process</code> attribute. 
	 * @param value the process
	 */
	public void setProcess(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROCESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.process</code> attribute. 
	 * @param value the process
	 */
	public void setProcess(final String value)
	{
		setProcess( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.rules</code> attribute.
	 * @return the rules
	 */
	public String getRules(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RULES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.rules</code> attribute.
	 * @return the rules
	 */
	public String getRules()
	{
		return getRules( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.rules</code> attribute. 
	 * @param value the rules
	 */
	public void setRules(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RULES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.rules</code> attribute. 
	 * @param value the rules
	 */
	public void setRules(final String value)
	{
		setRules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute.
	 * @return the saveFormWorkflow
	 */
	public Boolean isSaveFormWorkflow(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SAVEFORMWORKFLOW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute.
	 * @return the saveFormWorkflow
	 */
	public Boolean isSaveFormWorkflow()
	{
		return isSaveFormWorkflow( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute. 
	 * @return the saveFormWorkflow
	 */
	public boolean isSaveFormWorkflowAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSaveFormWorkflow( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute. 
	 * @return the saveFormWorkflow
	 */
	public boolean isSaveFormWorkflowAsPrimitive()
	{
		return isSaveFormWorkflowAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute. 
	 * @param value the saveFormWorkflow
	 */
	public void setSaveFormWorkflow(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SAVEFORMWORKFLOW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute. 
	 * @param value the saveFormWorkflow
	 */
	public void setSaveFormWorkflow(final Boolean value)
	{
		setSaveFormWorkflow( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute. 
	 * @param value the saveFormWorkflow
	 */
	public void setSaveFormWorkflow(final SessionContext ctx, final boolean value)
	{
		setSaveFormWorkflow( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.saveFormWorkflow</code> attribute. 
	 * @param value the saveFormWorkflow
	 */
	public void setSaveFormWorkflow(final boolean value)
	{
		setSaveFormWorkflow( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.sbu</code> attribute.
	 * @return the sbu
	 */
	public StrategicBusinessUnit getSbu(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, SBU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.sbu</code> attribute.
	 * @return the sbu
	 */
	public StrategicBusinessUnit getSbu()
	{
		return getSbu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.sbu</code> attribute. 
	 * @param value the sbu
	 */
	public void setSbu(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		setProperty(ctx, SBU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.sbu</code> attribute. 
	 * @param value the sbu
	 */
	public void setSbu(final StrategicBusinessUnit value)
	{
		setSbu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.scenarios</code> attribute.
	 * @return the scenarios
	 */
	public String getScenarios(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SCENARIOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.scenarios</code> attribute.
	 * @return the scenarios
	 */
	public String getScenarios()
	{
		return getScenarios( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.scenarios</code> attribute. 
	 * @param value the scenarios
	 */
	public void setScenarios(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SCENARIOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.scenarios</code> attribute. 
	 * @param value the scenarios
	 */
	public void setScenarios(final String value)
	{
		setScenarios( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.site</code> attribute.
	 * @return the site
	 */
	public CMSSite getSite(final SessionContext ctx)
	{
		return (CMSSite)getProperty( ctx, SITE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.site</code> attribute.
	 * @return the site
	 */
	public CMSSite getSite()
	{
		return getSite( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.site</code> attribute. 
	 * @param value the site
	 */
	public void setSite(final SessionContext ctx, final CMSSite value)
	{
		setProperty(ctx, SITE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.site</code> attribute. 
	 * @param value the site
	 */
	public void setSite(final CMSSite value)
	{
		setSite( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.source</code> attribute.
	 * @return the source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.source</code> attribute.
	 * @return the source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.source</code> attribute. 
	 * @param value the source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.templateType</code> attribute.
	 * @return the templateType
	 */
	public EnumerationValue getTemplateType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TEMPLATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.templateType</code> attribute.
	 * @return the templateType
	 */
	public EnumerationValue getTemplateType()
	{
		return getTemplateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.templateType</code> attribute. 
	 * @param value the templateType
	 */
	public void setTemplateType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TEMPLATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.templateType</code> attribute. 
	 * @param value the templateType
	 */
	public void setTemplateType(final EnumerationValue value)
	{
		setTemplateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.version</code> attribute.
	 * @return the version
	 */
	public VersionDetail getVersion(final SessionContext ctx)
	{
		return (VersionDetail)getProperty( ctx, VERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommunicationTemplate.version</code> attribute.
	 * @return the version
	 */
	public VersionDetail getVersion()
	{
		return getVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.version</code> attribute. 
	 * @param value the version
	 */
	public void setVersion(final SessionContext ctx, final VersionDetail value)
	{
		setProperty(ctx, VERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommunicationTemplate.version</code> attribute. 
	 * @param value the version
	 */
	public void setVersion(final VersionDetail value)
	{
		setVersion( getSession().getSessionContext(), value );
	}
	
}
