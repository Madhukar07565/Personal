/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.AccommodationBrand;
import com.cnk.travelogix.product.common.core.jalo.AccommodationChain;
import com.cnk.travelogix.product.common.core.jalo.Affiliation;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.user.Address;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Accommodation Accommodation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccommodation extends Product
{
	/** Qualifier of the <code>Accommodation.chain</code> attribute **/
	public static final String CHAIN = "chain";
	/** Qualifier of the <code>Accommodation.brand</code> attribute **/
	public static final String BRAND = "brand";
	/** Qualifier of the <code>Accommodation.affiliation</code> attribute **/
	public static final String AFFILIATION = "affiliation";
	/** Qualifier of the <code>Accommodation.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>Accommodation.hotelRating</code> attribute **/
	public static final String HOTELRATING = "hotelRating";
	/** Qualifier of the <code>Accommodation.companyRating</code> attribute **/
	public static final String COMPANYRATING = "companyRating";
	/** Qualifier of the <code>Accommodation.ratingDate</code> attribute **/
	public static final String RATINGDATE = "ratingDate";
	/** Qualifier of the <code>Accommodation.totalFloors</code> attribute **/
	public static final String TOTALFLOORS = "totalFloors";
	/** Qualifier of the <code>Accommodation.totalRooms</code> attribute **/
	public static final String TOTALROOMS = "totalRooms";
	/** Qualifier of the <code>Accommodation.recommendedFor</code> attribute **/
	public static final String RECOMMENDEDFOR = "recommendedFor";
	/** Qualifier of the <code>Accommodation.checkinTime</code> attribute **/
	public static final String CHECKINTIME = "checkinTime";
	/** Qualifier of the <code>Accommodation.checkoutTime</code> attribute **/
	public static final String CHECKOUTTIME = "checkoutTime";
	/** Qualifier of the <code>Accommodation.internalRemark</code> attribute **/
	public static final String INTERNALREMARK = "internalRemark";
	/** Qualifier of the <code>Accommodation.hashTags</code> attribute **/
	public static final String HASHTAGS = "hashTags";
	/** Qualifier of the <code>Accommodation.companyRecommended</code> attribute **/
	public static final String COMPANYRECOMMENDED = "companyRecommended";
	/** Qualifier of the <code>Accommodation.mysteryProduct</code> attribute **/
	public static final String MYSTERYPRODUCT = "mysteryProduct";
	/** Qualifier of the <code>Accommodation.resortType</code> attribute **/
	public static final String RESORTTYPE = "resortType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CHAIN, AttributeMode.INITIAL);
		tmp.put(BRAND, AttributeMode.INITIAL);
		tmp.put(AFFILIATION, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(HOTELRATING, AttributeMode.INITIAL);
		tmp.put(COMPANYRATING, AttributeMode.INITIAL);
		tmp.put(RATINGDATE, AttributeMode.INITIAL);
		tmp.put(TOTALFLOORS, AttributeMode.INITIAL);
		tmp.put(TOTALROOMS, AttributeMode.INITIAL);
		tmp.put(RECOMMENDEDFOR, AttributeMode.INITIAL);
		tmp.put(CHECKINTIME, AttributeMode.INITIAL);
		tmp.put(CHECKOUTTIME, AttributeMode.INITIAL);
		tmp.put(INTERNALREMARK, AttributeMode.INITIAL);
		tmp.put(HASHTAGS, AttributeMode.INITIAL);
		tmp.put(COMPANYRECOMMENDED, AttributeMode.INITIAL);
		tmp.put(MYSTERYPRODUCT, AttributeMode.INITIAL);
		tmp.put(RESORTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.address</code> attribute.
	 * @return the address - Address.
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.address</code> attribute.
	 * @return the address - Address.
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.address</code> attribute. 
	 * @param value the address - Address.
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.address</code> attribute. 
	 * @param value the address - Address.
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.affiliation</code> attribute.
	 * @return the affiliation - Affiliation.
	 */
	public Affiliation getAffiliation(final SessionContext ctx)
	{
		return (Affiliation)getProperty( ctx, AFFILIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.affiliation</code> attribute.
	 * @return the affiliation - Affiliation.
	 */
	public Affiliation getAffiliation()
	{
		return getAffiliation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.affiliation</code> attribute. 
	 * @param value the affiliation - Affiliation.
	 */
	public void setAffiliation(final SessionContext ctx, final Affiliation value)
	{
		setProperty(ctx, AFFILIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.affiliation</code> attribute. 
	 * @param value the affiliation - Affiliation.
	 */
	public void setAffiliation(final Affiliation value)
	{
		setAffiliation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.brand</code> attribute.
	 * @return the brand - Brand.
	 */
	public AccommodationBrand getBrand(final SessionContext ctx)
	{
		return (AccommodationBrand)getProperty( ctx, BRAND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.brand</code> attribute.
	 * @return the brand - Brand.
	 */
	public AccommodationBrand getBrand()
	{
		return getBrand( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.brand</code> attribute. 
	 * @param value the brand - Brand.
	 */
	public void setBrand(final SessionContext ctx, final AccommodationBrand value)
	{
		setProperty(ctx, BRAND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.brand</code> attribute. 
	 * @param value the brand - Brand.
	 */
	public void setBrand(final AccommodationBrand value)
	{
		setBrand( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.chain</code> attribute.
	 * @return the chain - To show the Chain.
	 */
	public AccommodationChain getChain(final SessionContext ctx)
	{
		return (AccommodationChain)getProperty( ctx, CHAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.chain</code> attribute.
	 * @return the chain - To show the Chain.
	 */
	public AccommodationChain getChain()
	{
		return getChain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.chain</code> attribute. 
	 * @param value the chain - To show the Chain.
	 */
	public void setChain(final SessionContext ctx, final AccommodationChain value)
	{
		setProperty(ctx, CHAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.chain</code> attribute. 
	 * @param value the chain - To show the Chain.
	 */
	public void setChain(final AccommodationChain value)
	{
		setChain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.checkinTime</code> attribute.
	 * @return the checkinTime - Checkin Time.
	 */
	public String getCheckinTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHECKINTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.checkinTime</code> attribute.
	 * @return the checkinTime - Checkin Time.
	 */
	public String getCheckinTime()
	{
		return getCheckinTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.checkinTime</code> attribute. 
	 * @param value the checkinTime - Checkin Time.
	 */
	public void setCheckinTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHECKINTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.checkinTime</code> attribute. 
	 * @param value the checkinTime - Checkin Time.
	 */
	public void setCheckinTime(final String value)
	{
		setCheckinTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.checkoutTime</code> attribute.
	 * @return the checkoutTime - Checkout Time.
	 */
	public String getCheckoutTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHECKOUTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.checkoutTime</code> attribute.
	 * @return the checkoutTime - Checkout Time.
	 */
	public String getCheckoutTime()
	{
		return getCheckoutTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.checkoutTime</code> attribute. 
	 * @param value the checkoutTime - Checkout Time.
	 */
	public void setCheckoutTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHECKOUTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.checkoutTime</code> attribute. 
	 * @param value the checkoutTime - Checkout Time.
	 */
	public void setCheckoutTime(final String value)
	{
		setCheckoutTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.companyRating</code> attribute.
	 * @return the companyRating - To show Rating.
	 */
	public EnumerationValue getCompanyRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYRATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.companyRating</code> attribute.
	 * @return the companyRating - To show Rating.
	 */
	public EnumerationValue getCompanyRating()
	{
		return getCompanyRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.companyRating</code> attribute. 
	 * @param value the companyRating - To show Rating.
	 */
	public void setCompanyRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYRATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.companyRating</code> attribute. 
	 * @param value the companyRating - To show Rating.
	 */
	public void setCompanyRating(final EnumerationValue value)
	{
		setCompanyRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.companyRecommended</code> attribute.
	 * @return the companyRecommended - companyRecommended
	 */
	public Boolean isCompanyRecommended(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMPANYRECOMMENDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.companyRecommended</code> attribute.
	 * @return the companyRecommended - companyRecommended
	 */
	public Boolean isCompanyRecommended()
	{
		return isCompanyRecommended( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.companyRecommended</code> attribute. 
	 * @return the companyRecommended - companyRecommended
	 */
	public boolean isCompanyRecommendedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCompanyRecommended( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.companyRecommended</code> attribute. 
	 * @return the companyRecommended - companyRecommended
	 */
	public boolean isCompanyRecommendedAsPrimitive()
	{
		return isCompanyRecommendedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.companyRecommended</code> attribute. 
	 * @param value the companyRecommended - companyRecommended
	 */
	public void setCompanyRecommended(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMPANYRECOMMENDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.companyRecommended</code> attribute. 
	 * @param value the companyRecommended - companyRecommended
	 */
	public void setCompanyRecommended(final Boolean value)
	{
		setCompanyRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.companyRecommended</code> attribute. 
	 * @param value the companyRecommended - companyRecommended
	 */
	public void setCompanyRecommended(final SessionContext ctx, final boolean value)
	{
		setCompanyRecommended( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.companyRecommended</code> attribute. 
	 * @param value the companyRecommended - companyRecommended
	 */
	public void setCompanyRecommended(final boolean value)
	{
		setCompanyRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.hashTags</code> attribute.
	 * @return the hashTags - HashTag
	 */
	public Collection<EnumerationValue> getHashTags(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, HASHTAGS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.hashTags</code> attribute.
	 * @return the hashTags - HashTag
	 */
	public Collection<EnumerationValue> getHashTags()
	{
		return getHashTags( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.hashTags</code> attribute. 
	 * @param value the hashTags - HashTag
	 */
	public void setHashTags(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, HASHTAGS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.hashTags</code> attribute. 
	 * @param value the hashTags - HashTag
	 */
	public void setHashTags(final Collection<EnumerationValue> value)
	{
		setHashTags( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.hotelRating</code> attribute.
	 * @return the hotelRating - To show Rating.
	 */
	public EnumerationValue getHotelRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, HOTELRATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.hotelRating</code> attribute.
	 * @return the hotelRating - To show Rating.
	 */
	public EnumerationValue getHotelRating()
	{
		return getHotelRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.hotelRating</code> attribute. 
	 * @param value the hotelRating - To show Rating.
	 */
	public void setHotelRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, HOTELRATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.hotelRating</code> attribute. 
	 * @param value the hotelRating - To show Rating.
	 */
	public void setHotelRating(final EnumerationValue value)
	{
		setHotelRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.internalRemark</code> attribute.
	 * @return the internalRemark - Internal Remark.
	 */
	public String getInternalRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERNALREMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.internalRemark</code> attribute.
	 * @return the internalRemark - Internal Remark.
	 */
	public String getInternalRemark()
	{
		return getInternalRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.internalRemark</code> attribute. 
	 * @param value the internalRemark - Internal Remark.
	 */
	public void setInternalRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERNALREMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.internalRemark</code> attribute. 
	 * @param value the internalRemark - Internal Remark.
	 */
	public void setInternalRemark(final String value)
	{
		setInternalRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.mysteryProduct</code> attribute.
	 * @return the mysteryProduct - Mystery Product
	 */
	public Boolean isMysteryProduct(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MYSTERYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.mysteryProduct</code> attribute.
	 * @return the mysteryProduct - Mystery Product
	 */
	public Boolean isMysteryProduct()
	{
		return isMysteryProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.mysteryProduct</code> attribute. 
	 * @return the mysteryProduct - Mystery Product
	 */
	public boolean isMysteryProductAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMysteryProduct( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.mysteryProduct</code> attribute. 
	 * @return the mysteryProduct - Mystery Product
	 */
	public boolean isMysteryProductAsPrimitive()
	{
		return isMysteryProductAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.mysteryProduct</code> attribute. 
	 * @param value the mysteryProduct - Mystery Product
	 */
	public void setMysteryProduct(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MYSTERYPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.mysteryProduct</code> attribute. 
	 * @param value the mysteryProduct - Mystery Product
	 */
	public void setMysteryProduct(final Boolean value)
	{
		setMysteryProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.mysteryProduct</code> attribute. 
	 * @param value the mysteryProduct - Mystery Product
	 */
	public void setMysteryProduct(final SessionContext ctx, final boolean value)
	{
		setMysteryProduct( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.mysteryProduct</code> attribute. 
	 * @param value the mysteryProduct - Mystery Product
	 */
	public void setMysteryProduct(final boolean value)
	{
		setMysteryProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.ratingDate</code> attribute.
	 * @return the ratingDate - dated
	 */
	public Date getRatingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, RATINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.ratingDate</code> attribute.
	 * @return the ratingDate - dated
	 */
	public Date getRatingDate()
	{
		return getRatingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.ratingDate</code> attribute. 
	 * @param value the ratingDate - dated
	 */
	public void setRatingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, RATINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.ratingDate</code> attribute. 
	 * @param value the ratingDate - dated
	 */
	public void setRatingDate(final Date value)
	{
		setRatingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.recommendedFor</code> attribute.
	 * @return the recommendedFor - Recommended
	 */
	public EnumerationValue getRecommendedFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECOMMENDEDFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.recommendedFor</code> attribute.
	 * @return the recommendedFor - Recommended
	 */
	public EnumerationValue getRecommendedFor()
	{
		return getRecommendedFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.recommendedFor</code> attribute. 
	 * @param value the recommendedFor - Recommended
	 */
	public void setRecommendedFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECOMMENDEDFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.recommendedFor</code> attribute. 
	 * @param value the recommendedFor - Recommended
	 */
	public void setRecommendedFor(final EnumerationValue value)
	{
		setRecommendedFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.resortType</code> attribute.
	 * @return the resortType - Resort Type
	 */
	public EnumerationValue getResortType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RESORTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.resortType</code> attribute.
	 * @return the resortType - Resort Type
	 */
	public EnumerationValue getResortType()
	{
		return getResortType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.resortType</code> attribute. 
	 * @param value the resortType - Resort Type
	 */
	public void setResortType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RESORTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.resortType</code> attribute. 
	 * @param value the resortType - Resort Type
	 */
	public void setResortType(final EnumerationValue value)
	{
		setResortType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.totalFloors</code> attribute.
	 * @return the totalFloors - Total Floors
	 */
	public Integer getTotalFloors(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTALFLOORS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.totalFloors</code> attribute.
	 * @return the totalFloors - Total Floors
	 */
	public Integer getTotalFloors()
	{
		return getTotalFloors( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.totalFloors</code> attribute. 
	 * @return the totalFloors - Total Floors
	 */
	public int getTotalFloorsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotalFloors( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.totalFloors</code> attribute. 
	 * @return the totalFloors - Total Floors
	 */
	public int getTotalFloorsAsPrimitive()
	{
		return getTotalFloorsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.totalFloors</code> attribute. 
	 * @param value the totalFloors - Total Floors
	 */
	public void setTotalFloors(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTALFLOORS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.totalFloors</code> attribute. 
	 * @param value the totalFloors - Total Floors
	 */
	public void setTotalFloors(final Integer value)
	{
		setTotalFloors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.totalFloors</code> attribute. 
	 * @param value the totalFloors - Total Floors
	 */
	public void setTotalFloors(final SessionContext ctx, final int value)
	{
		setTotalFloors( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.totalFloors</code> attribute. 
	 * @param value the totalFloors - Total Floors
	 */
	public void setTotalFloors(final int value)
	{
		setTotalFloors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.totalRooms</code> attribute.
	 * @return the totalRooms - Total Rooms
	 */
	public Integer getTotalRooms(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTALROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.totalRooms</code> attribute.
	 * @return the totalRooms - Total Rooms
	 */
	public Integer getTotalRooms()
	{
		return getTotalRooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.totalRooms</code> attribute. 
	 * @return the totalRooms - Total Rooms
	 */
	public int getTotalRoomsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotalRooms( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Accommodation.totalRooms</code> attribute. 
	 * @return the totalRooms - Total Rooms
	 */
	public int getTotalRoomsAsPrimitive()
	{
		return getTotalRoomsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.totalRooms</code> attribute. 
	 * @param value the totalRooms - Total Rooms
	 */
	public void setTotalRooms(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTALROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.totalRooms</code> attribute. 
	 * @param value the totalRooms - Total Rooms
	 */
	public void setTotalRooms(final Integer value)
	{
		setTotalRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.totalRooms</code> attribute. 
	 * @param value the totalRooms - Total Rooms
	 */
	public void setTotalRooms(final SessionContext ctx, final int value)
	{
		setTotalRooms( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Accommodation.totalRooms</code> attribute. 
	 * @param value the totalRooms - Total Rooms
	 */
	public void setTotalRooms(final int value)
	{
		setTotalRooms( getSession().getSessionContext(), value );
	}
	
}
