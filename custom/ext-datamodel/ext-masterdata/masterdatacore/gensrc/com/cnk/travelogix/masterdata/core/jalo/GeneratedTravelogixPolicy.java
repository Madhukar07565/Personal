/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy TravelogixPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixPolicy extends AbstractTravelogixItem
{
	/** Qualifier of the <code>TravelogixPolicy.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>TravelogixPolicy.policyType</code> attribute **/
	public static final String POLICYTYPE = "policyType";
	/** Qualifier of the <code>TravelogixPolicy.policyCategory</code> attribute **/
	public static final String POLICYCATEGORY = "policyCategory";
	/** Qualifier of the <code>TravelogixPolicy.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>TravelogixPolicy.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>TravelogixPolicy.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>TravelogixPolicy.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>TravelogixPolicy.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>TravelogixPolicy.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(POLICYTYPE, AttributeMode.INITIAL);
		tmp.put(POLICYCATEGORY, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixPolicy.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixPolicy.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixPolicy.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixPolicy.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.policyCategory</code> attribute.
	 * @return the policyCategory
	 */
	public EnumerationValue getPolicyCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, POLICYCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.policyCategory</code> attribute.
	 * @return the policyCategory
	 */
	public EnumerationValue getPolicyCategory()
	{
		return getPolicyCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.policyCategory</code> attribute. 
	 * @param value the policyCategory
	 */
	public void setPolicyCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, POLICYCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.policyCategory</code> attribute. 
	 * @param value the policyCategory
	 */
	public void setPolicyCategory(final EnumerationValue value)
	{
		setPolicyCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.policyType</code> attribute.
	 * @return the policyType
	 */
	public EnumerationValue getPolicyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, POLICYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.policyType</code> attribute.
	 * @return the policyType
	 */
	public EnumerationValue getPolicyType()
	{
		return getPolicyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.policyType</code> attribute. 
	 * @param value the policyType
	 */
	public void setPolicyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, POLICYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.policyType</code> attribute. 
	 * @param value the policyType
	 */
	public void setPolicyType(final EnumerationValue value)
	{
		setPolicyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Collection<Category> getProductCategory(final SessionContext ctx)
	{
		Collection<Category> coll = (Collection<Category>)getProperty( ctx, PRODUCTCATEGORY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.productCategory</code> attribute.
	 * @return the productCategory
	 */
	public Collection<Category> getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final SessionContext ctx, final Collection<Category> value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.productCategory</code> attribute. 
	 * @param value the productCategory
	 */
	public void setProductCategory(final Collection<Category> value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
