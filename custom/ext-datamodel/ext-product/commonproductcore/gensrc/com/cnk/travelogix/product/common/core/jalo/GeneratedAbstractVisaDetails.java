/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.AbstractVisaDetails AbstractVisaDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractVisaDetails extends GenericItem
{
	/** Qualifier of the <code>AbstractVisaDetails.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>AbstractVisaDetails.ProductCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "ProductCategorySubType";
	/** Qualifier of the <code>AbstractVisaDetails.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>AbstractVisaDetails.duration</code> attribute **/
	public static final String DURATION = "duration";
	/** Qualifier of the <code>AbstractVisaDetails.entryType</code> attribute **/
	public static final String ENTRYTYPE = "entryType";
	/** Qualifier of the <code>AbstractVisaDetails.purposeOfTravel</code> attribute **/
	public static final String PURPOSEOFTRAVEL = "purposeOfTravel";
	/** Qualifier of the <code>AbstractVisaDetails.passportIssedIn</code> attribute **/
	public static final String PASSPORTISSEDIN = "passportIssedIn";
	/** Qualifier of the <code>AbstractVisaDetails.whereAreYouLocated</code> attribute **/
	public static final String WHEREAREYOULOCATED = "whereAreYouLocated";
	/** Qualifier of the <code>AbstractVisaDetails.citizenShip</code> attribute **/
	public static final String CITIZENSHIP = "citizenShip";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(DURATION, AttributeMode.INITIAL);
		tmp.put(ENTRYTYPE, AttributeMode.INITIAL);
		tmp.put(PURPOSEOFTRAVEL, AttributeMode.INITIAL);
		tmp.put(PASSPORTISSEDIN, AttributeMode.INITIAL);
		tmp.put(WHEREAREYOULOCATED, AttributeMode.INITIAL);
		tmp.put(CITIZENSHIP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.citizenShip</code> attribute.
	 * @return the citizenShip - Citizenship
	 */
	public Country getCitizenShip(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, CITIZENSHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.citizenShip</code> attribute.
	 * @return the citizenShip - Citizenship
	 */
	public Country getCitizenShip()
	{
		return getCitizenShip( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.citizenShip</code> attribute. 
	 * @param value the citizenShip - Citizenship
	 */
	public void setCitizenShip(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, CITIZENSHIP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.citizenShip</code> attribute. 
	 * @param value the citizenShip - Citizenship
	 */
	public void setCitizenShip(final Country value)
	{
		setCitizenShip( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.country</code> attribute.
	 * @return the country - Country for which Visa is.
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.country</code> attribute.
	 * @return the country - Country for which Visa is.
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.country</code> attribute. 
	 * @param value the country - Country for which Visa is.
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.country</code> attribute. 
	 * @param value the country - Country for which Visa is.
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.duration</code> attribute.
	 * @return the duration - Duration of Visa
	 */
	public String getDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.duration</code> attribute.
	 * @return the duration - Duration of Visa
	 */
	public String getDuration()
	{
		return getDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.duration</code> attribute. 
	 * @param value the duration - Duration of Visa
	 */
	public void setDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.duration</code> attribute. 
	 * @param value the duration - Duration of Visa
	 */
	public void setDuration(final String value)
	{
		setDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.entryType</code> attribute.
	 * @return the entryType - Entry type
	 */
	public EnumerationValue getEntryType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENTRYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.entryType</code> attribute.
	 * @return the entryType - Entry type
	 */
	public EnumerationValue getEntryType()
	{
		return getEntryType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.entryType</code> attribute. 
	 * @param value the entryType - Entry type
	 */
	public void setEntryType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENTRYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.entryType</code> attribute. 
	 * @param value the entryType - Entry type
	 */
	public void setEntryType(final EnumerationValue value)
	{
		setEntryType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.passportIssedIn</code> attribute.
	 * @return the passportIssedIn - Country in which passport issued
	 */
	public Country getPassportIssedIn(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, PASSPORTISSEDIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.passportIssedIn</code> attribute.
	 * @return the passportIssedIn - Country in which passport issued
	 */
	public Country getPassportIssedIn()
	{
		return getPassportIssedIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.passportIssedIn</code> attribute. 
	 * @param value the passportIssedIn - Country in which passport issued
	 */
	public void setPassportIssedIn(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, PASSPORTISSEDIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.passportIssedIn</code> attribute. 
	 * @param value the passportIssedIn - Country in which passport issued
	 */
	public void setPassportIssedIn(final Country value)
	{
		setPassportIssedIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.productCategory</code> attribute.
	 * @return the productCategory - Product category
	 */
	public Category getProductCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.productCategory</code> attribute.
	 * @return the productCategory - Product category
	 */
	public Category getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.productCategory</code> attribute. 
	 * @param value the productCategory - Product category
	 */
	public void setProductCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.productCategory</code> attribute. 
	 * @param value the productCategory - Product category
	 */
	public void setProductCategory(final Category value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.ProductCategorySubType</code> attribute.
	 * @return the ProductCategorySubType - Product category sub type
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.ProductCategorySubType</code> attribute.
	 * @return the ProductCategorySubType - Product category sub type
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.ProductCategorySubType</code> attribute. 
	 * @param value the ProductCategorySubType - Product category sub type
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.ProductCategorySubType</code> attribute. 
	 * @param value the ProductCategorySubType - Product category sub type
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.purposeOfTravel</code> attribute.
	 * @return the purposeOfTravel - Purpose of travel
	 */
	public EnumerationValue getPurposeOfTravel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PURPOSEOFTRAVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.purposeOfTravel</code> attribute.
	 * @return the purposeOfTravel - Purpose of travel
	 */
	public EnumerationValue getPurposeOfTravel()
	{
		return getPurposeOfTravel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.purposeOfTravel</code> attribute. 
	 * @param value the purposeOfTravel - Purpose of travel
	 */
	public void setPurposeOfTravel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PURPOSEOFTRAVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.purposeOfTravel</code> attribute. 
	 * @param value the purposeOfTravel - Purpose of travel
	 */
	public void setPurposeOfTravel(final EnumerationValue value)
	{
		setPurposeOfTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.whereAreYouLocated</code> attribute.
	 * @return the whereAreYouLocated - Country where your located.
	 */
	public Country getWhereAreYouLocated(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, WHEREAREYOULOCATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractVisaDetails.whereAreYouLocated</code> attribute.
	 * @return the whereAreYouLocated - Country where your located.
	 */
	public Country getWhereAreYouLocated()
	{
		return getWhereAreYouLocated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.whereAreYouLocated</code> attribute. 
	 * @param value the whereAreYouLocated - Country where your located.
	 */
	public void setWhereAreYouLocated(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, WHEREAREYOULOCATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractVisaDetails.whereAreYouLocated</code> attribute. 
	 * @param value the whereAreYouLocated - Country where your located.
	 */
	public void setWhereAreYouLocated(final Country value)
	{
		setWhereAreYouLocated( getSession().getSessionContext(), value );
	}
	
}
