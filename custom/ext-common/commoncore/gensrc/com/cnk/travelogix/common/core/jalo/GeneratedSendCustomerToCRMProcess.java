/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess SendCustomerToCRMProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSendCustomerToCRMProcess extends BusinessProcess
{
	/** Qualifier of the <code>SendCustomerToCRMProcess.objectTask</code> attribute **/
	public static final String OBJECTTASK = "objectTask";
	/** Qualifier of the <code>SendCustomerToCRMProcess.legacyBP</code> attribute **/
	public static final String LEGACYBP = "legacyBP";
	/** Qualifier of the <code>SendCustomerToCRMProcess.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>SendCustomerToCRMProcess.bpRole</code> attribute **/
	public static final String BPROLE = "bpRole";
	/** Qualifier of the <code>SendCustomerToCRMProcess.custAccGrp</code> attribute **/
	public static final String CUSTACCGRP = "custAccGrp";
	/** Qualifier of the <code>SendCustomerToCRMProcess.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Qualifier of the <code>SendCustomerToCRMProcess.compCode</code> attribute **/
	public static final String COMPCODE = "compCode";
	/** Qualifier of the <code>SendCustomerToCRMProcess.salesOrg</code> attribute **/
	public static final String SALESORG = "salesOrg";
	/** Qualifier of the <code>SendCustomerToCRMProcess.distChannel</code> attribute **/
	public static final String DISTCHANNEL = "distChannel";
	/** Qualifier of the <code>SendCustomerToCRMProcess.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>SendCustomerToCRMProcess.name1</code> attribute **/
	public static final String NAME1 = "name1";
	/** Qualifier of the <code>SendCustomerToCRMProcess.name2</code> attribute **/
	public static final String NAME2 = "name2";
	/** Qualifier of the <code>SendCustomerToCRMProcess.searchTerm</code> attribute **/
	public static final String SEARCHTERM = "searchTerm";
	/** Qualifier of the <code>SendCustomerToCRMProcess.countryKey</code> attribute **/
	public static final String COUNTRYKEY = "countryKey";
	/** Qualifier of the <code>SendCustomerToCRMProcess.tradePartner</code> attribute **/
	public static final String TRADEPARTNER = "tradePartner";
	/** Qualifier of the <code>SendCustomerToCRMProcess.reccAcc</code> attribute **/
	public static final String RECCACC = "reccAcc";
	/** Qualifier of the <code>SendCustomerToCRMProcess.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>SendCustomerToCRMProcess.pricingProc</code> attribute **/
	public static final String PRICINGPROC = "pricingProc";
	/** Qualifier of the <code>SendCustomerToCRMProcess.custStatGrp</code> attribute **/
	public static final String CUSTSTATGRP = "custStatGrp";
	/** Qualifier of the <code>SendCustomerToCRMProcess.delivPlant</code> attribute **/
	public static final String DELIVPLANT = "delivPlant";
	/** Qualifier of the <code>SendCustomerToCRMProcess.accAssGrp</code> attribute **/
	public static final String ACCASSGRP = "accAssGrp";
	/** Qualifier of the <code>SendCustomerToCRMProcess.planGrp</code> attribute **/
	public static final String PLANGRP = "planGrp";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(OBJECTTASK, AttributeMode.INITIAL);
		tmp.put(LEGACYBP, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(BPROLE, AttributeMode.INITIAL);
		tmp.put(CUSTACCGRP, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		tmp.put(COMPCODE, AttributeMode.INITIAL);
		tmp.put(SALESORG, AttributeMode.INITIAL);
		tmp.put(DISTCHANNEL, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(NAME1, AttributeMode.INITIAL);
		tmp.put(NAME2, AttributeMode.INITIAL);
		tmp.put(SEARCHTERM, AttributeMode.INITIAL);
		tmp.put(COUNTRYKEY, AttributeMode.INITIAL);
		tmp.put(TRADEPARTNER, AttributeMode.INITIAL);
		tmp.put(RECCACC, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(PRICINGPROC, AttributeMode.INITIAL);
		tmp.put(CUSTSTATGRP, AttributeMode.INITIAL);
		tmp.put(DELIVPLANT, AttributeMode.INITIAL);
		tmp.put(ACCASSGRP, AttributeMode.INITIAL);
		tmp.put(PLANGRP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.accAssGrp</code> attribute.
	 * @return the accAssGrp
	 */
	public String getAccAssGrp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACCASSGRP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.accAssGrp</code> attribute.
	 * @return the accAssGrp
	 */
	public String getAccAssGrp()
	{
		return getAccAssGrp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.accAssGrp</code> attribute. 
	 * @param value the accAssGrp
	 */
	public void setAccAssGrp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACCASSGRP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.accAssGrp</code> attribute. 
	 * @param value the accAssGrp
	 */
	public void setAccAssGrp(final String value)
	{
		setAccAssGrp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.bpRole</code> attribute.
	 * @return the bpRole
	 */
	public String getBpRole(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BPROLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.bpRole</code> attribute.
	 * @return the bpRole
	 */
	public String getBpRole()
	{
		return getBpRole( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.bpRole</code> attribute. 
	 * @param value the bpRole
	 */
	public void setBpRole(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BPROLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.bpRole</code> attribute. 
	 * @param value the bpRole
	 */
	public void setBpRole(final String value)
	{
		setBpRole( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.category</code> attribute.
	 * @return the category
	 */
	public String getCategory(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.category</code> attribute.
	 * @return the category
	 */
	public String getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final String value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.compCode</code> attribute.
	 * @return the compCode
	 */
	public String getCompCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.compCode</code> attribute.
	 * @return the compCode
	 */
	public String getCompCode()
	{
		return getCompCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.compCode</code> attribute. 
	 * @param value the compCode
	 */
	public void setCompCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.compCode</code> attribute. 
	 * @param value the compCode
	 */
	public void setCompCode(final String value)
	{
		setCompCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.countryKey</code> attribute.
	 * @return the countryKey
	 */
	public String getCountryKey(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRYKEY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.countryKey</code> attribute.
	 * @return the countryKey
	 */
	public String getCountryKey()
	{
		return getCountryKey( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.countryKey</code> attribute. 
	 * @param value the countryKey
	 */
	public void setCountryKey(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRYKEY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.countryKey</code> attribute. 
	 * @param value the countryKey
	 */
	public void setCountryKey(final String value)
	{
		setCountryKey( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.currency</code> attribute.
	 * @return the currency
	 */
	public String getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final String value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.custAccGrp</code> attribute.
	 * @return the custAccGrp
	 */
	public String getCustAccGrp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTACCGRP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.custAccGrp</code> attribute.
	 * @return the custAccGrp
	 */
	public String getCustAccGrp()
	{
		return getCustAccGrp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.custAccGrp</code> attribute. 
	 * @param value the custAccGrp
	 */
	public void setCustAccGrp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTACCGRP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.custAccGrp</code> attribute. 
	 * @param value the custAccGrp
	 */
	public void setCustAccGrp(final String value)
	{
		setCustAccGrp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.customer</code> attribute.
	 * @return the customer
	 */
	public String getCustomer(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.customer</code> attribute.
	 * @return the customer
	 */
	public String getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final String value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.custStatGrp</code> attribute.
	 * @return the custStatGrp
	 */
	public String getCustStatGrp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTSTATGRP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.custStatGrp</code> attribute.
	 * @return the custStatGrp
	 */
	public String getCustStatGrp()
	{
		return getCustStatGrp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.custStatGrp</code> attribute. 
	 * @param value the custStatGrp
	 */
	public void setCustStatGrp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTSTATGRP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.custStatGrp</code> attribute. 
	 * @param value the custStatGrp
	 */
	public void setCustStatGrp(final String value)
	{
		setCustStatGrp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.delivPlant</code> attribute.
	 * @return the delivPlant
	 */
	public String getDelivPlant(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DELIVPLANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.delivPlant</code> attribute.
	 * @return the delivPlant
	 */
	public String getDelivPlant()
	{
		return getDelivPlant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.delivPlant</code> attribute. 
	 * @param value the delivPlant
	 */
	public void setDelivPlant(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DELIVPLANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.delivPlant</code> attribute. 
	 * @param value the delivPlant
	 */
	public void setDelivPlant(final String value)
	{
		setDelivPlant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISTCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.distChannel</code> attribute.
	 * @return the distChannel
	 */
	public String getDistChannel()
	{
		return getDistChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISTCHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.distChannel</code> attribute. 
	 * @param value the distChannel
	 */
	public void setDistChannel(final String value)
	{
		setDistChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.division</code> attribute.
	 * @return the division
	 */
	public String getDivision(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.division</code> attribute.
	 * @return the division
	 */
	public String getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final String value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.legacyBP</code> attribute.
	 * @return the legacyBP
	 */
	public String getLegacyBP(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LEGACYBP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.legacyBP</code> attribute.
	 * @return the legacyBP
	 */
	public String getLegacyBP()
	{
		return getLegacyBP( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.legacyBP</code> attribute. 
	 * @param value the legacyBP
	 */
	public void setLegacyBP(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LEGACYBP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.legacyBP</code> attribute. 
	 * @param value the legacyBP
	 */
	public void setLegacyBP(final String value)
	{
		setLegacyBP( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.name1</code> attribute.
	 * @return the name1
	 */
	public String getName1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.name1</code> attribute.
	 * @return the name1
	 */
	public String getName1()
	{
		return getName1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.name1</code> attribute. 
	 * @param value the name1
	 */
	public void setName1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.name1</code> attribute. 
	 * @param value the name1
	 */
	public void setName1(final String value)
	{
		setName1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.name2</code> attribute.
	 * @return the name2
	 */
	public String getName2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.name2</code> attribute.
	 * @return the name2
	 */
	public String getName2()
	{
		return getName2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.name2</code> attribute. 
	 * @param value the name2
	 */
	public void setName2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.name2</code> attribute. 
	 * @param value the name2
	 */
	public void setName2(final String value)
	{
		setName2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.objectTask</code> attribute.
	 * @return the objectTask
	 */
	public String getObjectTask(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OBJECTTASK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.objectTask</code> attribute.
	 * @return the objectTask
	 */
	public String getObjectTask()
	{
		return getObjectTask( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.objectTask</code> attribute. 
	 * @param value the objectTask
	 */
	public void setObjectTask(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OBJECTTASK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.objectTask</code> attribute. 
	 * @param value the objectTask
	 */
	public void setObjectTask(final String value)
	{
		setObjectTask( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.planGrp</code> attribute.
	 * @return the planGrp
	 */
	public String getPlanGrp(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLANGRP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.planGrp</code> attribute.
	 * @return the planGrp
	 */
	public String getPlanGrp()
	{
		return getPlanGrp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.planGrp</code> attribute. 
	 * @param value the planGrp
	 */
	public void setPlanGrp(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLANGRP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.planGrp</code> attribute. 
	 * @param value the planGrp
	 */
	public void setPlanGrp(final String value)
	{
		setPlanGrp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.pricingProc</code> attribute.
	 * @return the pricingProc
	 */
	public String getPricingProc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRICINGPROC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.pricingProc</code> attribute.
	 * @return the pricingProc
	 */
	public String getPricingProc()
	{
		return getPricingProc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.pricingProc</code> attribute. 
	 * @param value the pricingProc
	 */
	public void setPricingProc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRICINGPROC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.pricingProc</code> attribute. 
	 * @param value the pricingProc
	 */
	public void setPricingProc(final String value)
	{
		setPricingProc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.reccAcc</code> attribute.
	 * @return the reccAcc
	 */
	public String getReccAcc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECCACC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.reccAcc</code> attribute.
	 * @return the reccAcc
	 */
	public String getReccAcc()
	{
		return getReccAcc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.reccAcc</code> attribute. 
	 * @param value the reccAcc
	 */
	public void setReccAcc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECCACC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.reccAcc</code> attribute. 
	 * @param value the reccAcc
	 */
	public void setReccAcc(final String value)
	{
		setReccAcc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALESORG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.salesOrg</code> attribute.
	 * @return the salesOrg
	 */
	public String getSalesOrg()
	{
		return getSalesOrg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALESORG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.salesOrg</code> attribute. 
	 * @param value the salesOrg
	 */
	public void setSalesOrg(final String value)
	{
		setSalesOrg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.searchTerm</code> attribute.
	 * @return the searchTerm
	 */
	public String getSearchTerm(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEARCHTERM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.searchTerm</code> attribute.
	 * @return the searchTerm
	 */
	public String getSearchTerm()
	{
		return getSearchTerm( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.searchTerm</code> attribute. 
	 * @param value the searchTerm
	 */
	public void setSearchTerm(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEARCHTERM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.searchTerm</code> attribute. 
	 * @param value the searchTerm
	 */
	public void setSearchTerm(final String value)
	{
		setSearchTerm( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.tradePartner</code> attribute.
	 * @return the tradePartner
	 */
	public String getTradePartner(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TRADEPARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SendCustomerToCRMProcess.tradePartner</code> attribute.
	 * @return the tradePartner
	 */
	public String getTradePartner()
	{
		return getTradePartner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.tradePartner</code> attribute. 
	 * @param value the tradePartner
	 */
	public void setTradePartner(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TRADEPARTNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SendCustomerToCRMProcess.tradePartner</code> attribute. 
	 * @param value the tradePartner
	 */
	public void setTradePartner(final String value)
	{
		setTradePartner( getSession().getSessionContext(), value );
	}
	
}
