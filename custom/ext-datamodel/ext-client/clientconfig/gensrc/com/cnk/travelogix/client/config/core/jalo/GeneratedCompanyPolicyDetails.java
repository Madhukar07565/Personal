/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.CompanyPolicyDetails CompanyPolicyDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyPolicyDetails extends GenericItem
{
	/** Qualifier of the <code>CompanyPolicyDetails.companyPolicyType</code> attribute **/
	public static final String COMPANYPOLICYTYPE = "companyPolicyType";
	/** Qualifier of the <code>CompanyPolicyDetails.companyPolicyCategory</code> attribute **/
	public static final String COMPANYPOLICYCATEGORY = "companyPolicyCategory";
	/** Qualifier of the <code>CompanyPolicyDetails.companyPolicyName</code> attribute **/
	public static final String COMPANYPOLICYNAME = "companyPolicyName";
	/** Qualifier of the <code>CompanyPolicyDetails.PolicyDescription</code> attribute **/
	public static final String POLICYDESCRIPTION = "PolicyDescription";
	/** Qualifier of the <code>CompanyPolicyDetails.companyPolicyId</code> attribute **/
	public static final String COMPANYPOLICYID = "companyPolicyId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANYPOLICYTYPE, AttributeMode.INITIAL);
		tmp.put(COMPANYPOLICYCATEGORY, AttributeMode.INITIAL);
		tmp.put(COMPANYPOLICYNAME, AttributeMode.INITIAL);
		tmp.put(POLICYDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(COMPANYPOLICYID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.companyPolicyCategory</code> attribute.
	 * @return the companyPolicyCategory - Company Policy Category
	 */
	public EnumerationValue getCompanyPolicyCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYPOLICYCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.companyPolicyCategory</code> attribute.
	 * @return the companyPolicyCategory - Company Policy Category
	 */
	public EnumerationValue getCompanyPolicyCategory()
	{
		return getCompanyPolicyCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.companyPolicyCategory</code> attribute. 
	 * @param value the companyPolicyCategory - Company Policy Category
	 */
	public void setCompanyPolicyCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYPOLICYCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.companyPolicyCategory</code> attribute. 
	 * @param value the companyPolicyCategory - Company Policy Category
	 */
	public void setCompanyPolicyCategory(final EnumerationValue value)
	{
		setCompanyPolicyCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.companyPolicyId</code> attribute.
	 * @return the companyPolicyId - Company Policy Id
	 */
	public String getCompanyPolicyId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYPOLICYID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.companyPolicyId</code> attribute.
	 * @return the companyPolicyId - Company Policy Id
	 */
	public String getCompanyPolicyId()
	{
		return getCompanyPolicyId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.companyPolicyId</code> attribute. 
	 * @param value the companyPolicyId - Company Policy Id
	 */
	public void setCompanyPolicyId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYPOLICYID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.companyPolicyId</code> attribute. 
	 * @param value the companyPolicyId - Company Policy Id
	 */
	public void setCompanyPolicyId(final String value)
	{
		setCompanyPolicyId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.companyPolicyName</code> attribute.
	 * @return the companyPolicyName - Company Policy Name
	 */
	public String getCompanyPolicyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COMPANYPOLICYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.companyPolicyName</code> attribute.
	 * @return the companyPolicyName - Company Policy Name
	 */
	public String getCompanyPolicyName()
	{
		return getCompanyPolicyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.companyPolicyName</code> attribute. 
	 * @param value the companyPolicyName - Company Policy Name
	 */
	public void setCompanyPolicyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COMPANYPOLICYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.companyPolicyName</code> attribute. 
	 * @param value the companyPolicyName - Company Policy Name
	 */
	public void setCompanyPolicyName(final String value)
	{
		setCompanyPolicyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.companyPolicyType</code> attribute.
	 * @return the companyPolicyType - Company Policy Type
	 */
	public EnumerationValue getCompanyPolicyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYPOLICYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.companyPolicyType</code> attribute.
	 * @return the companyPolicyType - Company Policy Type
	 */
	public EnumerationValue getCompanyPolicyType()
	{
		return getCompanyPolicyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.companyPolicyType</code> attribute. 
	 * @param value the companyPolicyType - Company Policy Type
	 */
	public void setCompanyPolicyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYPOLICYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.companyPolicyType</code> attribute. 
	 * @param value the companyPolicyType - Company Policy Type
	 */
	public void setCompanyPolicyType(final EnumerationValue value)
	{
		setCompanyPolicyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.PolicyDescription</code> attribute.
	 * @return the PolicyDescription - Policy Description
	 */
	public Media getPolicyDescription(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, POLICYDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyPolicyDetails.PolicyDescription</code> attribute.
	 * @return the PolicyDescription - Policy Description
	 */
	public Media getPolicyDescription()
	{
		return getPolicyDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.PolicyDescription</code> attribute. 
	 * @param value the PolicyDescription - Policy Description
	 */
	public void setPolicyDescription(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, POLICYDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyPolicyDetails.PolicyDescription</code> attribute. 
	 * @param value the PolicyDescription - Policy Description
	 */
	public void setPolicyDescription(final Media value)
	{
		setPolicyDescription( getSession().getSessionContext(), value );
	}
	
}
