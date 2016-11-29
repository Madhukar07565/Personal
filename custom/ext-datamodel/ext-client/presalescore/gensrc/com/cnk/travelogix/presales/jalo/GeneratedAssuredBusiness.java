/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.AdvanceParameter;
import com.cnk.travelogix.presales.jalo.AssuredBusinessTargetProductVolume;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.AssuredBusiness AssuredBusiness}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssuredBusiness extends GenericItem
{
	/** Qualifier of the <code>AssuredBusiness.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>AssuredBusiness.totalTravelExpectedSales</code> attribute **/
	public static final String TOTALTRAVELEXPECTEDSALES = "totalTravelExpectedSales";
	/** Qualifier of the <code>AssuredBusiness.assuredBusinessId</code> attribute **/
	public static final String ASSUREDBUSINESSID = "assuredBusinessId";
	/** Qualifier of the <code>AssuredBusiness.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>AssuredBusiness.clientSubCategory</code> attribute **/
	public static final String CLIENTSUBCATEGORY = "clientSubCategory";
	/** Qualifier of the <code>AssuredBusiness.clientCategory</code> attribute **/
	public static final String CLIENTCATEGORY = "clientCategory";
	/** Qualifier of the <code>AssuredBusiness.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>AssuredBusiness.clientName</code> attribute **/
	public static final String CLIENTNAME = "clientName";
	/** Qualifier of the <code>AssuredBusiness.typeOfAssociation</code> attribute **/
	public static final String TYPEOFASSOCIATION = "typeOfAssociation";
	/** Qualifier of the <code>AssuredBusiness.parentAssociation</code> attribute **/
	public static final String PARENTASSOCIATION = "parentAssociation";
	/** Qualifier of the <code>AssuredBusiness.transactional</code> attribute **/
	public static final String TRANSACTIONAL = "transactional";
	/** Qualifier of the <code>AssuredBusiness.clientCommercials</code> attribute **/
	public static final String CLIENTCOMMERCIALS = "clientCommercials";
	/** Qualifier of the <code>AssuredBusiness.settlement</code> attribute **/
	public static final String SETTLEMENT = "settlement";
	/** Qualifier of the <code>AssuredBusiness.noOfLevels</code> attribute **/
	public static final String NOOFLEVELS = "noOfLevels";
	/** Qualifier of the <code>AssuredBusiness.hierarchy</code> attribute **/
	public static final String HIERARCHY = "hierarchy";
	/** Qualifier of the <code>AssuredBusiness.pointOfSale</code> attribute **/
	public static final String POINTOFSALE = "pointOfSale";
	/** Qualifier of the <code>AssuredBusiness.targetProductWiseSales</code> attribute **/
	public static final String TARGETPRODUCTWISESALES = "targetProductWiseSales";
	/** Qualifier of the <code>AssuredBusiness.targetTotalSales</code> attribute **/
	public static final String TARGETTOTALSALES = "targetTotalSales";
	/** Qualifier of the <code>AssuredBusiness.targetSalesforAllProducts</code> attribute **/
	public static final String TARGETSALESFORALLPRODUCTS = "targetSalesforAllProducts";
	/** Qualifier of the <code>AssuredBusiness.targetSales</code> attribute **/
	public static final String TARGETSALES = "targetSales";
	/** Qualifier of the <code>AssuredBusiness.advanceParameter</code> attribute **/
	public static final String ADVANCEPARAMETER = "advanceParameter";
	/** Qualifier of the <code>AssuredBusiness.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>AssuredBusiness.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>AssuredBusiness.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>AssuredBusiness.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>AssuredBusiness.targetProductvolumes</code> attribute **/
	public static final String TARGETPRODUCTVOLUMES = "targetProductvolumes";
	/**
	* {@link OneToManyHandler} for handling 1:n TARGETPRODUCTVOLUMES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssuredBusinessTargetProductVolume> TARGETPRODUCTVOLUMESHANDLER = new OneToManyHandler<AssuredBusinessTargetProductVolume>(
	PresalescoreConstants.TC.ASSUREDBUSINESSTARGETPRODUCTVOLUME,
	false,
	"assuredBusiness",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(TOTALTRAVELEXPECTEDSALES, AttributeMode.INITIAL);
		tmp.put(ASSUREDBUSINESSID, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		tmp.put(CLIENTSUBCATEGORY, AttributeMode.INITIAL);
		tmp.put(CLIENTCATEGORY, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(CLIENTNAME, AttributeMode.INITIAL);
		tmp.put(TYPEOFASSOCIATION, AttributeMode.INITIAL);
		tmp.put(PARENTASSOCIATION, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONAL, AttributeMode.INITIAL);
		tmp.put(CLIENTCOMMERCIALS, AttributeMode.INITIAL);
		tmp.put(SETTLEMENT, AttributeMode.INITIAL);
		tmp.put(NOOFLEVELS, AttributeMode.INITIAL);
		tmp.put(HIERARCHY, AttributeMode.INITIAL);
		tmp.put(POINTOFSALE, AttributeMode.INITIAL);
		tmp.put(TARGETPRODUCTWISESALES, AttributeMode.INITIAL);
		tmp.put(TARGETTOTALSALES, AttributeMode.INITIAL);
		tmp.put(TARGETSALESFORALLPRODUCTS, AttributeMode.INITIAL);
		tmp.put(TARGETSALES, AttributeMode.INITIAL);
		tmp.put(ADVANCEPARAMETER, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.advanceParameter</code> attribute.
	 * @return the advanceParameter
	 */
	public AdvanceParameter getAdvanceParameter(final SessionContext ctx)
	{
		return (AdvanceParameter)getProperty( ctx, ADVANCEPARAMETER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.advanceParameter</code> attribute.
	 * @return the advanceParameter
	 */
	public AdvanceParameter getAdvanceParameter()
	{
		return getAdvanceParameter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.advanceParameter</code> attribute. 
	 * @param value the advanceParameter
	 */
	public void setAdvanceParameter(final SessionContext ctx, final AdvanceParameter value)
	{
		setProperty(ctx, ADVANCEPARAMETER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.advanceParameter</code> attribute. 
	 * @param value the advanceParameter
	 */
	public void setAdvanceParameter(final AdvanceParameter value)
	{
		setAdvanceParameter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.assuredBusinessId</code> attribute.
	 * @return the assuredBusinessId - Id for assured business
	 */
	public String getAssuredBusinessId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ASSUREDBUSINESSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.assuredBusinessId</code> attribute.
	 * @return the assuredBusinessId - Id for assured business
	 */
	public String getAssuredBusinessId()
	{
		return getAssuredBusinessId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.assuredBusinessId</code> attribute. 
	 * @param value the assuredBusinessId - Id for assured business
	 */
	public void setAssuredBusinessId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ASSUREDBUSINESSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.assuredBusinessId</code> attribute. 
	 * @param value the assuredBusinessId - Id for assured business
	 */
	public void setAssuredBusinessId(final String value)
	{
		setAssuredBusinessId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientCategory</code> attribute.
	 * @return the clientCategory
	 */
	public EnumerationValue getClientCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientCategory</code> attribute.
	 * @return the clientCategory
	 */
	public EnumerationValue getClientCategory()
	{
		return getClientCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientCategory</code> attribute. 
	 * @param value the clientCategory
	 */
	public void setClientCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientCategory</code> attribute. 
	 * @param value the clientCategory
	 */
	public void setClientCategory(final EnumerationValue value)
	{
		setClientCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientCommercials</code> attribute.
	 * @return the clientCommercials
	 */
	public Boolean isClientCommercials(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CLIENTCOMMERCIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientCommercials</code> attribute.
	 * @return the clientCommercials
	 */
	public Boolean isClientCommercials()
	{
		return isClientCommercials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientCommercials</code> attribute. 
	 * @return the clientCommercials
	 */
	public boolean isClientCommercialsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isClientCommercials( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientCommercials</code> attribute. 
	 * @return the clientCommercials
	 */
	public boolean isClientCommercialsAsPrimitive()
	{
		return isClientCommercialsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CLIENTCOMMERCIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final Boolean value)
	{
		setClientCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final SessionContext ctx, final boolean value)
	{
		setClientCommercials( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final boolean value)
	{
		setClientCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientName</code> attribute.
	 * @return the clientName
	 */
	public String getClientName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientName</code> attribute.
	 * @return the clientName
	 */
	public String getClientName()
	{
		return getClientName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final String value)
	{
		setClientName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientSubCategory</code> attribute.
	 * @return the clientSubCategory
	 */
	public EnumerationValue getClientSubCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTSUBCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientSubCategory</code> attribute.
	 * @return the clientSubCategory
	 */
	public EnumerationValue getClientSubCategory()
	{
		return getClientSubCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientSubCategory</code> attribute. 
	 * @param value the clientSubCategory
	 */
	public void setClientSubCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTSUBCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientSubCategory</code> attribute. 
	 * @param value the clientSubCategory
	 */
	public void setClientSubCategory(final EnumerationValue value)
	{
		setClientSubCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientType</code> attribute.
	 * @return the clientType - ClientType
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.clientType</code> attribute.
	 * @return the clientType - ClientType
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientType</code> attribute. 
	 * @param value the clientType - ClientType
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.clientType</code> attribute. 
	 * @param value the clientType - ClientType
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.currency</code> attribute.
	 * @return the currency - currency type of AssuredBusiness
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.currency</code> attribute.
	 * @return the currency - currency type of AssuredBusiness
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.currency</code> attribute. 
	 * @param value the currency - currency type of AssuredBusiness
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.currency</code> attribute. 
	 * @param value the currency - currency type of AssuredBusiness
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.hierarchy</code> attribute.
	 * @return the hierarchy
	 */
	public Integer getHierarchy(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, HIERARCHY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.hierarchy</code> attribute.
	 * @return the hierarchy
	 */
	public Integer getHierarchy()
	{
		return getHierarchy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.hierarchy</code> attribute. 
	 * @return the hierarchy
	 */
	public int getHierarchyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getHierarchy( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.hierarchy</code> attribute. 
	 * @return the hierarchy
	 */
	public int getHierarchyAsPrimitive()
	{
		return getHierarchyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.hierarchy</code> attribute. 
	 * @param value the hierarchy
	 */
	public void setHierarchy(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, HIERARCHY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.hierarchy</code> attribute. 
	 * @param value the hierarchy
	 */
	public void setHierarchy(final Integer value)
	{
		setHierarchy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.hierarchy</code> attribute. 
	 * @param value the hierarchy
	 */
	public void setHierarchy(final SessionContext ctx, final int value)
	{
		setHierarchy( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.hierarchy</code> attribute. 
	 * @param value the hierarchy
	 */
	public void setHierarchy(final int value)
	{
		setHierarchy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.market</code> attribute.
	 * @return the market - Market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, MARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.market</code> attribute. 
	 * @param value the market - Market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.noOfLevels</code> attribute.
	 * @return the noOfLevels
	 */
	public String getNoOfLevels(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFLEVELS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.noOfLevels</code> attribute.
	 * @return the noOfLevels
	 */
	public String getNoOfLevels()
	{
		return getNoOfLevels( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.noOfLevels</code> attribute. 
	 * @param value the noOfLevels
	 */
	public void setNoOfLevels(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFLEVELS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.noOfLevels</code> attribute. 
	 * @param value the noOfLevels
	 */
	public void setNoOfLevels(final String value)
	{
		setNoOfLevels( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.parentAssociation</code> attribute.
	 * @return the parentAssociation
	 */
	public String getParentAssociation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PARENTASSOCIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.parentAssociation</code> attribute.
	 * @return the parentAssociation
	 */
	public String getParentAssociation()
	{
		return getParentAssociation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.parentAssociation</code> attribute. 
	 * @param value the parentAssociation
	 */
	public void setParentAssociation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PARENTASSOCIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.parentAssociation</code> attribute. 
	 * @param value the parentAssociation
	 */
	public void setParentAssociation(final String value)
	{
		setParentAssociation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public EnumerationValue getPointOfSale(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, POINTOFSALE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public EnumerationValue getPointOfSale()
	{
		return getPointOfSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, POINTOFSALE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final EnumerationValue value)
	{
		setPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.settlement</code> attribute.
	 * @return the settlement
	 */
	public Boolean isSettlement(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.settlement</code> attribute.
	 * @return the settlement
	 */
	public Boolean isSettlement()
	{
		return isSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.settlement</code> attribute. 
	 * @return the settlement
	 */
	public boolean isSettlementAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSettlement( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.settlement</code> attribute. 
	 * @return the settlement
	 */
	public boolean isSettlementAsPrimitive()
	{
		return isSettlementAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final Boolean value)
	{
		setSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final SessionContext ctx, final boolean value)
	{
		setSettlement( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final boolean value)
	{
		setSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetProductvolumes</code> attribute.
	 * @return the targetProductvolumes
	 */
	public Collection<AssuredBusinessTargetProductVolume> getTargetProductvolumes(final SessionContext ctx)
	{
		return TARGETPRODUCTVOLUMESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetProductvolumes</code> attribute.
	 * @return the targetProductvolumes
	 */
	public Collection<AssuredBusinessTargetProductVolume> getTargetProductvolumes()
	{
		return getTargetProductvolumes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetProductvolumes</code> attribute. 
	 * @param value the targetProductvolumes
	 */
	public void setTargetProductvolumes(final SessionContext ctx, final Collection<AssuredBusinessTargetProductVolume> value)
	{
		TARGETPRODUCTVOLUMESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetProductvolumes</code> attribute. 
	 * @param value the targetProductvolumes
	 */
	public void setTargetProductvolumes(final Collection<AssuredBusinessTargetProductVolume> value)
	{
		setTargetProductvolumes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to targetProductvolumes. 
	 * @param value the item to add to targetProductvolumes
	 */
	public void addToTargetProductvolumes(final SessionContext ctx, final AssuredBusinessTargetProductVolume value)
	{
		TARGETPRODUCTVOLUMESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to targetProductvolumes. 
	 * @param value the item to add to targetProductvolumes
	 */
	public void addToTargetProductvolumes(final AssuredBusinessTargetProductVolume value)
	{
		addToTargetProductvolumes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from targetProductvolumes. 
	 * @param value the item to remove from targetProductvolumes
	 */
	public void removeFromTargetProductvolumes(final SessionContext ctx, final AssuredBusinessTargetProductVolume value)
	{
		TARGETPRODUCTVOLUMESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from targetProductvolumes. 
	 * @param value the item to remove from targetProductvolumes
	 */
	public void removeFromTargetProductvolumes(final AssuredBusinessTargetProductVolume value)
	{
		removeFromTargetProductvolumes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetProductWiseSales</code> attribute.
	 * @return the targetProductWiseSales
	 */
	public Boolean isTargetProductWiseSales(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TARGETPRODUCTWISESALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetProductWiseSales</code> attribute.
	 * @return the targetProductWiseSales
	 */
	public Boolean isTargetProductWiseSales()
	{
		return isTargetProductWiseSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetProductWiseSales</code> attribute. 
	 * @return the targetProductWiseSales
	 */
	public boolean isTargetProductWiseSalesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTargetProductWiseSales( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetProductWiseSales</code> attribute. 
	 * @return the targetProductWiseSales
	 */
	public boolean isTargetProductWiseSalesAsPrimitive()
	{
		return isTargetProductWiseSalesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetProductWiseSales</code> attribute. 
	 * @param value the targetProductWiseSales
	 */
	public void setTargetProductWiseSales(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TARGETPRODUCTWISESALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetProductWiseSales</code> attribute. 
	 * @param value the targetProductWiseSales
	 */
	public void setTargetProductWiseSales(final Boolean value)
	{
		setTargetProductWiseSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetProductWiseSales</code> attribute. 
	 * @param value the targetProductWiseSales
	 */
	public void setTargetProductWiseSales(final SessionContext ctx, final boolean value)
	{
		setTargetProductWiseSales( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetProductWiseSales</code> attribute. 
	 * @param value the targetProductWiseSales
	 */
	public void setTargetProductWiseSales(final boolean value)
	{
		setTargetProductWiseSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetSales</code> attribute.
	 * @return the targetSales
	 */
	public BigDecimal getTargetSales(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, TARGETSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetSales</code> attribute.
	 * @return the targetSales
	 */
	public BigDecimal getTargetSales()
	{
		return getTargetSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetSales</code> attribute. 
	 * @param value the targetSales
	 */
	public void setTargetSales(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, TARGETSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetSales</code> attribute. 
	 * @param value the targetSales
	 */
	public void setTargetSales(final BigDecimal value)
	{
		setTargetSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetSalesforAllProducts</code> attribute.
	 * @return the targetSalesforAllProducts
	 */
	public BigDecimal getTargetSalesforAllProducts(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, TARGETSALESFORALLPRODUCTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetSalesforAllProducts</code> attribute.
	 * @return the targetSalesforAllProducts
	 */
	public BigDecimal getTargetSalesforAllProducts()
	{
		return getTargetSalesforAllProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetSalesforAllProducts</code> attribute. 
	 * @param value the targetSalesforAllProducts
	 */
	public void setTargetSalesforAllProducts(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, TARGETSALESFORALLPRODUCTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetSalesforAllProducts</code> attribute. 
	 * @param value the targetSalesforAllProducts
	 */
	public void setTargetSalesforAllProducts(final BigDecimal value)
	{
		setTargetSalesforAllProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetTotalSales</code> attribute.
	 * @return the targetTotalSales
	 */
	public Boolean isTargetTotalSales(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TARGETTOTALSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetTotalSales</code> attribute.
	 * @return the targetTotalSales
	 */
	public Boolean isTargetTotalSales()
	{
		return isTargetTotalSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetTotalSales</code> attribute. 
	 * @return the targetTotalSales
	 */
	public boolean isTargetTotalSalesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTargetTotalSales( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.targetTotalSales</code> attribute. 
	 * @return the targetTotalSales
	 */
	public boolean isTargetTotalSalesAsPrimitive()
	{
		return isTargetTotalSalesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetTotalSales</code> attribute. 
	 * @param value the targetTotalSales
	 */
	public void setTargetTotalSales(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TARGETTOTALSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetTotalSales</code> attribute. 
	 * @param value the targetTotalSales
	 */
	public void setTargetTotalSales(final Boolean value)
	{
		setTargetTotalSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetTotalSales</code> attribute. 
	 * @param value the targetTotalSales
	 */
	public void setTargetTotalSales(final SessionContext ctx, final boolean value)
	{
		setTargetTotalSales( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.targetTotalSales</code> attribute. 
	 * @param value the targetTotalSales
	 */
	public void setTargetTotalSales(final boolean value)
	{
		setTargetTotalSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.totalTravelExpectedSales</code> attribute.
	 * @return the totalTravelExpectedSales - totalTravelExpectedSales for AssuredBusiness
	 */
	public BigDecimal getTotalTravelExpectedSales(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, TOTALTRAVELEXPECTEDSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.totalTravelExpectedSales</code> attribute.
	 * @return the totalTravelExpectedSales - totalTravelExpectedSales for AssuredBusiness
	 */
	public BigDecimal getTotalTravelExpectedSales()
	{
		return getTotalTravelExpectedSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.totalTravelExpectedSales</code> attribute. 
	 * @param value the totalTravelExpectedSales - totalTravelExpectedSales for AssuredBusiness
	 */
	public void setTotalTravelExpectedSales(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, TOTALTRAVELEXPECTEDSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.totalTravelExpectedSales</code> attribute. 
	 * @param value the totalTravelExpectedSales - totalTravelExpectedSales for AssuredBusiness
	 */
	public void setTotalTravelExpectedSales(final BigDecimal value)
	{
		setTotalTravelExpectedSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.transactional</code> attribute.
	 * @return the transactional
	 */
	public Boolean isTransactional(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.transactional</code> attribute.
	 * @return the transactional
	 */
	public Boolean isTransactional()
	{
		return isTransactional( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.transactional</code> attribute. 
	 * @return the transactional
	 */
	public boolean isTransactionalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactional( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.transactional</code> attribute. 
	 * @return the transactional
	 */
	public boolean isTransactionalAsPrimitive()
	{
		return isTransactionalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final Boolean value)
	{
		setTransactional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final SessionContext ctx, final boolean value)
	{
		setTransactional( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final boolean value)
	{
		setTransactional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.typeOfAssociation</code> attribute.
	 * @return the typeOfAssociation
	 */
	public EnumerationValue getTypeOfAssociation(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFASSOCIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.typeOfAssociation</code> attribute.
	 * @return the typeOfAssociation
	 */
	public EnumerationValue getTypeOfAssociation()
	{
		return getTypeOfAssociation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.typeOfAssociation</code> attribute. 
	 * @param value the typeOfAssociation
	 */
	public void setTypeOfAssociation(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFASSOCIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.typeOfAssociation</code> attribute. 
	 * @param value the typeOfAssociation
	 */
	public void setTypeOfAssociation(final EnumerationValue value)
	{
		setTypeOfAssociation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusiness.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusiness.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
