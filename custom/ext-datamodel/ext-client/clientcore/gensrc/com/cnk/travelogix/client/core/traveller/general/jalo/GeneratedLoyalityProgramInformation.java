/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.general.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.general.jalo.LoyalityProgramInformation LoyalityProgramInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLoyalityProgramInformation extends GenericItem
{
	/** Qualifier of the <code>LoyalityProgramInformation.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>LoyalityProgramInformation.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>LoyalityProgramInformation.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>LoyalityProgramInformation.nameOnCard</code> attribute **/
	public static final String NAMEONCARD = "nameOnCard";
	/** Qualifier of the <code>LoyalityProgramInformation.memborShipNumber</code> attribute **/
	public static final String MEMBORSHIPNUMBER = "memborShipNumber";
	/** Qualifier of the <code>LoyalityProgramInformation.memberShipLevel</code> attribute **/
	public static final String MEMBERSHIPLEVEL = "memberShipLevel";
	/** Qualifier of the <code>LoyalityProgramInformation.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>LoyalityProgramInformation.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>LoyalityProgramInformation.programName</code> attribute **/
	public static final String PROGRAMNAME = "programName";
	/** Qualifier of the <code>LoyalityProgramInformation.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedLoyalityProgramInformation> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedLoyalityProgramInformation>(
	ClientcoreConstants.TC.LOYALITYPROGRAMINFORMATION,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(NAMEONCARD, AttributeMode.INITIAL);
		tmp.put(MEMBORSHIPNUMBER, AttributeMode.INITIAL);
		tmp.put(MEMBERSHIPLEVEL, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(PROGRAMNAME, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.memberShipLevel</code> attribute.
	 * @return the memberShipLevel
	 */
	public String getMemberShipLevel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEMBERSHIPLEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.memberShipLevel</code> attribute.
	 * @return the memberShipLevel
	 */
	public String getMemberShipLevel()
	{
		return getMemberShipLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.memberShipLevel</code> attribute. 
	 * @param value the memberShipLevel
	 */
	public void setMemberShipLevel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEMBERSHIPLEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.memberShipLevel</code> attribute. 
	 * @param value the memberShipLevel
	 */
	public void setMemberShipLevel(final String value)
	{
		setMemberShipLevel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.memborShipNumber</code> attribute.
	 * @return the memborShipNumber
	 */
	public String getMemborShipNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEMBORSHIPNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.memborShipNumber</code> attribute.
	 * @return the memborShipNumber
	 */
	public String getMemborShipNumber()
	{
		return getMemborShipNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.memborShipNumber</code> attribute. 
	 * @param value the memborShipNumber
	 */
	public void setMemborShipNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEMBORSHIPNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.memborShipNumber</code> attribute. 
	 * @param value the memborShipNumber
	 */
	public void setMemborShipNumber(final String value)
	{
		setMemborShipNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.nameOnCard</code> attribute.
	 * @return the nameOnCard
	 */
	public String getNameOnCard(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAMEONCARD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.nameOnCard</code> attribute.
	 * @return the nameOnCard
	 */
	public String getNameOnCard()
	{
		return getNameOnCard( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.nameOnCard</code> attribute. 
	 * @param value the nameOnCard
	 */
	public void setNameOnCard(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAMEONCARD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.nameOnCard</code> attribute. 
	 * @param value the nameOnCard
	 */
	public void setNameOnCard(final String value)
	{
		setNameOnCard( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.programName</code> attribute.
	 * @return the programName
	 */
	public EnumerationValue getProgramName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PROGRAMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.programName</code> attribute.
	 * @return the programName
	 */
	public EnumerationValue getProgramName()
	{
		return getProgramName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.programName</code> attribute. 
	 * @param value the programName
	 */
	public void setProgramName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PROGRAMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.programName</code> attribute. 
	 * @param value the programName
	 */
	public void setProgramName(final EnumerationValue value)
	{
		setProgramName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoyalityProgramInformation.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoyalityProgramInformation.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
