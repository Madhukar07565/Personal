/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.BookingDateValidity;
import com.cnk.travelogix.client.core.companyoffer.jalo.CodeDetailsRedemption;
import com.cnk.travelogix.client.core.companyoffer.jalo.OfferEligibilityCondition;
import com.cnk.travelogix.client.core.companyoffer.jalo.TravelDateValidity;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.RedemptionCompanyOffers RedemptionCompanyOffers}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRedemptionCompanyOffers extends GenericItem
{
	/** Qualifier of the <code>RedemptionCompanyOffers.codeDetails</code> attribute **/
	public static final String CODEDETAILS = "codeDetails";
	/** Qualifier of the <code>RedemptionCompanyOffers.redemptionOfferId</code> attribute **/
	public static final String REDEMPTIONOFFERID = "redemptionOfferId";
	/** Qualifier of the <code>RedemptionCompanyOffers.offerInclusionNote</code> attribute **/
	public static final String OFFERINCLUSIONNOTE = "offerInclusionNote";
	/** Qualifier of the <code>RedemptionCompanyOffers.offerExclusionNote</code> attribute **/
	public static final String OFFEREXCLUSIONNOTE = "offerExclusionNote";
	/** Qualifier of the <code>RedemptionCompanyOffers.voucherDetails</code> attribute **/
	public static final String VOUCHERDETAILS = "voucherDetails";
	/** Qualifier of the <code>RedemptionCompanyOffers.internalDetails</code> attribute **/
	public static final String INTERNALDETAILS = "internalDetails";
	/** Qualifier of the <code>RedemptionCompanyOffers.externalDetails</code> attribute **/
	public static final String EXTERNALDETAILS = "externalDetails";
	/** Qualifier of the <code>RedemptionCompanyOffers.bookingDateRedempOffers</code> attribute **/
	public static final String BOOKINGDATEREDEMPOFFERS = "bookingDateRedempOffers";
	/** Qualifier of the <code>RedemptionCompanyOffers.travelDateRedempOffers</code> attribute **/
	public static final String TRAVELDATEREDEMPOFFERS = "travelDateRedempOffers";
	/** Qualifier of the <code>RedemptionCompanyOffers.eligibilityConditionRedempCompOffers</code> attribute **/
	public static final String ELIGIBILITYCONDITIONREDEMPCOMPOFFERS = "eligibilityConditionRedempCompOffers";
	/** Qualifier of the <code>RedemptionCompanyOffers.suppCredRedemptionOfferComp</code> attribute **/
	public static final String SUPPCREDREDEMPTIONOFFERCOMP = "suppCredRedemptionOfferComp";
	/** Qualifier of the <code>RedemptionCompanyOffers.policyRedemptionCompOffers</code> attribute **/
	public static final String POLICYREDEMPTIONCOMPOFFERS = "policyRedemptionCompOffers";
	/** Qualifier of the <code>RedemptionCompanyOffers.policyBookingRedemptionCompOffers</code> attribute **/
	public static final String POLICYBOOKINGREDEMPTIONCOMPOFFERS = "policyBookingRedemptionCompOffers";
	/** Qualifier of the <code>RedemptionCompanyOffers.policyAmenRedemptionCompOffers</code> attribute **/
	public static final String POLICYAMENREDEMPTIONCOMPOFFERS = "policyAmenRedemptionCompOffers";
	/** Qualifier of the <code>RedemptionCompanyOffers.policyPaymentRedemptionCompOffers</code> attribute **/
	public static final String POLICYPAYMENTREDEMPTIONCOMPOFFERS = "policyPaymentRedemptionCompOffers";
	/** Qualifier of the <code>RedemptionCompanyOffers.exclusionProducts</code> attribute **/
	public static final String EXCLUSIONPRODUCTS = "exclusionProducts";
	/** Qualifier of the <code>RedemptionCompanyOffers.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKINGDATEREDEMPOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BookingDateValidity> BOOKINGDATEREDEMPOFFERSHANDLER = new OneToManyHandler<BookingDateValidity>(
	ClientcoreConstants.TC.BOOKINGDATEVALIDITY,
	false,
	"redempOffersBookingDateValidity",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELDATEREDEMPOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelDateValidity> TRAVELDATEREDEMPOFFERSHANDLER = new OneToManyHandler<TravelDateValidity>(
	ClientcoreConstants.TC.TRAVELDATEVALIDITY,
	false,
	"redempOffersValidity",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ELIGIBILITYCONDITIONREDEMPCOMPOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OfferEligibilityCondition> ELIGIBILITYCONDITIONREDEMPCOMPOFFERSHANDLER = new OneToManyHandler<OfferEligibilityCondition>(
	ClientcoreConstants.TC.OFFERELIGIBILITYCONDITION,
	false,
	"redempCompOffersligibilityCondition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPCREDREDEMPTIONOFFERCOMP's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierCredentials> SUPPCREDREDEMPTIONOFFERCOMPHANDLER = new OneToManyHandler<SupplierCredentials>(
	SuppliercredentialscoreConstants.TC.SUPPLIERCREDENTIALS,
	false,
	"redempCompOfferSuppCred",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYREDEMPTIONCOMPOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> POLICYREDEMPTIONCOMPOFFERSHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"redemptionCompOffers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYBOOKINGREDEMPTIONCOMPOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> POLICYBOOKINGREDEMPTIONCOMPOFFERSHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"redemptionCompOffers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYAMENREDEMPTIONCOMPOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> POLICYAMENREDEMPTIONCOMPOFFERSHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"redemptionCompOffers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYPAYMENTREDEMPTIONCOMPOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixPolicy> POLICYPAYMENTREDEMPTIONCOMPOFFERSHANDLER = new OneToManyHandler<TravelogixPolicy>(
	MasterdatacoreConstants.TC.TRAVELOGIXPOLICY,
	false,
	"redemptionCompOffers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EXCLUSIONPRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> EXCLUSIONPRODUCTSHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"exclProductRedemptionCompanyOffers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> PRODUCTSHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	false,
	"productRedemptionCompanyOffers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODEDETAILS, AttributeMode.INITIAL);
		tmp.put(REDEMPTIONOFFERID, AttributeMode.INITIAL);
		tmp.put(OFFERINCLUSIONNOTE, AttributeMode.INITIAL);
		tmp.put(OFFEREXCLUSIONNOTE, AttributeMode.INITIAL);
		tmp.put(VOUCHERDETAILS, AttributeMode.INITIAL);
		tmp.put(INTERNALDETAILS, AttributeMode.INITIAL);
		tmp.put(EXTERNALDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.bookingDateRedempOffers</code> attribute.
	 * @return the bookingDateRedempOffers
	 */
	public Collection<BookingDateValidity> getBookingDateRedempOffers(final SessionContext ctx)
	{
		return BOOKINGDATEREDEMPOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.bookingDateRedempOffers</code> attribute.
	 * @return the bookingDateRedempOffers
	 */
	public Collection<BookingDateValidity> getBookingDateRedempOffers()
	{
		return getBookingDateRedempOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.bookingDateRedempOffers</code> attribute. 
	 * @param value the bookingDateRedempOffers
	 */
	public void setBookingDateRedempOffers(final SessionContext ctx, final Collection<BookingDateValidity> value)
	{
		BOOKINGDATEREDEMPOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.bookingDateRedempOffers</code> attribute. 
	 * @param value the bookingDateRedempOffers
	 */
	public void setBookingDateRedempOffers(final Collection<BookingDateValidity> value)
	{
		setBookingDateRedempOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingDateRedempOffers. 
	 * @param value the item to add to bookingDateRedempOffers
	 */
	public void addToBookingDateRedempOffers(final SessionContext ctx, final BookingDateValidity value)
	{
		BOOKINGDATEREDEMPOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingDateRedempOffers. 
	 * @param value the item to add to bookingDateRedempOffers
	 */
	public void addToBookingDateRedempOffers(final BookingDateValidity value)
	{
		addToBookingDateRedempOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingDateRedempOffers. 
	 * @param value the item to remove from bookingDateRedempOffers
	 */
	public void removeFromBookingDateRedempOffers(final SessionContext ctx, final BookingDateValidity value)
	{
		BOOKINGDATEREDEMPOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingDateRedempOffers. 
	 * @param value the item to remove from bookingDateRedempOffers
	 */
	public void removeFromBookingDateRedempOffers(final BookingDateValidity value)
	{
		removeFromBookingDateRedempOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.codeDetails</code> attribute.
	 * @return the codeDetails
	 */
	public CodeDetailsRedemption getCodeDetails(final SessionContext ctx)
	{
		return (CodeDetailsRedemption)getProperty( ctx, CODEDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.codeDetails</code> attribute.
	 * @return the codeDetails
	 */
	public CodeDetailsRedemption getCodeDetails()
	{
		return getCodeDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.codeDetails</code> attribute. 
	 * @param value the codeDetails
	 */
	public void setCodeDetails(final SessionContext ctx, final CodeDetailsRedemption value)
	{
		setProperty(ctx, CODEDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.codeDetails</code> attribute. 
	 * @param value the codeDetails
	 */
	public void setCodeDetails(final CodeDetailsRedemption value)
	{
		setCodeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.eligibilityConditionRedempCompOffers</code> attribute.
	 * @return the eligibilityConditionRedempCompOffers
	 */
	public Collection<OfferEligibilityCondition> getEligibilityConditionRedempCompOffers(final SessionContext ctx)
	{
		return ELIGIBILITYCONDITIONREDEMPCOMPOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.eligibilityConditionRedempCompOffers</code> attribute.
	 * @return the eligibilityConditionRedempCompOffers
	 */
	public Collection<OfferEligibilityCondition> getEligibilityConditionRedempCompOffers()
	{
		return getEligibilityConditionRedempCompOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.eligibilityConditionRedempCompOffers</code> attribute. 
	 * @param value the eligibilityConditionRedempCompOffers
	 */
	public void setEligibilityConditionRedempCompOffers(final SessionContext ctx, final Collection<OfferEligibilityCondition> value)
	{
		ELIGIBILITYCONDITIONREDEMPCOMPOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.eligibilityConditionRedempCompOffers</code> attribute. 
	 * @param value the eligibilityConditionRedempCompOffers
	 */
	public void setEligibilityConditionRedempCompOffers(final Collection<OfferEligibilityCondition> value)
	{
		setEligibilityConditionRedempCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eligibilityConditionRedempCompOffers. 
	 * @param value the item to add to eligibilityConditionRedempCompOffers
	 */
	public void addToEligibilityConditionRedempCompOffers(final SessionContext ctx, final OfferEligibilityCondition value)
	{
		ELIGIBILITYCONDITIONREDEMPCOMPOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to eligibilityConditionRedempCompOffers. 
	 * @param value the item to add to eligibilityConditionRedempCompOffers
	 */
	public void addToEligibilityConditionRedempCompOffers(final OfferEligibilityCondition value)
	{
		addToEligibilityConditionRedempCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eligibilityConditionRedempCompOffers. 
	 * @param value the item to remove from eligibilityConditionRedempCompOffers
	 */
	public void removeFromEligibilityConditionRedempCompOffers(final SessionContext ctx, final OfferEligibilityCondition value)
	{
		ELIGIBILITYCONDITIONREDEMPCOMPOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from eligibilityConditionRedempCompOffers. 
	 * @param value the item to remove from eligibilityConditionRedempCompOffers
	 */
	public void removeFromEligibilityConditionRedempCompOffers(final OfferEligibilityCondition value)
	{
		removeFromEligibilityConditionRedempCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.exclusionProducts</code> attribute.
	 * @return the exclusionProducts
	 */
	public Collection<Product> getExclusionProducts(final SessionContext ctx)
	{
		return EXCLUSIONPRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.exclusionProducts</code> attribute.
	 * @return the exclusionProducts
	 */
	public Collection<Product> getExclusionProducts()
	{
		return getExclusionProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.exclusionProducts</code> attribute. 
	 * @param value the exclusionProducts
	 */
	public void setExclusionProducts(final SessionContext ctx, final Collection<Product> value)
	{
		EXCLUSIONPRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.exclusionProducts</code> attribute. 
	 * @param value the exclusionProducts
	 */
	public void setExclusionProducts(final Collection<Product> value)
	{
		setExclusionProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exclusionProducts. 
	 * @param value the item to add to exclusionProducts
	 */
	public void addToExclusionProducts(final SessionContext ctx, final Product value)
	{
		EXCLUSIONPRODUCTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to exclusionProducts. 
	 * @param value the item to add to exclusionProducts
	 */
	public void addToExclusionProducts(final Product value)
	{
		addToExclusionProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exclusionProducts. 
	 * @param value the item to remove from exclusionProducts
	 */
	public void removeFromExclusionProducts(final SessionContext ctx, final Product value)
	{
		EXCLUSIONPRODUCTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from exclusionProducts. 
	 * @param value the item to remove from exclusionProducts
	 */
	public void removeFromExclusionProducts(final Product value)
	{
		removeFromExclusionProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.externalDetails</code> attribute.
	 * @return the externalDetails
	 */
	public String getExternalDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXTERNALDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.externalDetails</code> attribute.
	 * @return the externalDetails
	 */
	public String getExternalDetails()
	{
		return getExternalDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.externalDetails</code> attribute. 
	 * @param value the externalDetails
	 */
	public void setExternalDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXTERNALDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.externalDetails</code> attribute. 
	 * @param value the externalDetails
	 */
	public void setExternalDetails(final String value)
	{
		setExternalDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.internalDetails</code> attribute.
	 * @return the internalDetails
	 */
	public String getInternalDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERNALDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.internalDetails</code> attribute.
	 * @return the internalDetails
	 */
	public String getInternalDetails()
	{
		return getInternalDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.internalDetails</code> attribute. 
	 * @param value the internalDetails
	 */
	public void setInternalDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERNALDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.internalDetails</code> attribute. 
	 * @param value the internalDetails
	 */
	public void setInternalDetails(final String value)
	{
		setInternalDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.offerExclusionNote</code> attribute.
	 * @return the offerExclusionNote
	 */
	public String getOfferExclusionNote(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFEREXCLUSIONNOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.offerExclusionNote</code> attribute.
	 * @return the offerExclusionNote
	 */
	public String getOfferExclusionNote()
	{
		return getOfferExclusionNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.offerExclusionNote</code> attribute. 
	 * @param value the offerExclusionNote
	 */
	public void setOfferExclusionNote(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFEREXCLUSIONNOTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.offerExclusionNote</code> attribute. 
	 * @param value the offerExclusionNote
	 */
	public void setOfferExclusionNote(final String value)
	{
		setOfferExclusionNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.offerInclusionNote</code> attribute.
	 * @return the offerInclusionNote
	 */
	public String getOfferInclusionNote(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFERINCLUSIONNOTE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.offerInclusionNote</code> attribute.
	 * @return the offerInclusionNote
	 */
	public String getOfferInclusionNote()
	{
		return getOfferInclusionNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.offerInclusionNote</code> attribute. 
	 * @param value the offerInclusionNote
	 */
	public void setOfferInclusionNote(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFERINCLUSIONNOTE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.offerInclusionNote</code> attribute. 
	 * @param value the offerInclusionNote
	 */
	public void setOfferInclusionNote(final String value)
	{
		setOfferInclusionNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.policyAmenRedemptionCompOffers</code> attribute.
	 * @return the policyAmenRedemptionCompOffers
	 */
	public Collection<TravelogixPolicy> getPolicyAmenRedemptionCompOffers(final SessionContext ctx)
	{
		return POLICYAMENREDEMPTIONCOMPOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.policyAmenRedemptionCompOffers</code> attribute.
	 * @return the policyAmenRedemptionCompOffers
	 */
	public Collection<TravelogixPolicy> getPolicyAmenRedemptionCompOffers()
	{
		return getPolicyAmenRedemptionCompOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.policyAmenRedemptionCompOffers</code> attribute. 
	 * @param value the policyAmenRedemptionCompOffers
	 */
	public void setPolicyAmenRedemptionCompOffers(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		POLICYAMENREDEMPTIONCOMPOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.policyAmenRedemptionCompOffers</code> attribute. 
	 * @param value the policyAmenRedemptionCompOffers
	 */
	public void setPolicyAmenRedemptionCompOffers(final Collection<TravelogixPolicy> value)
	{
		setPolicyAmenRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyAmenRedemptionCompOffers. 
	 * @param value the item to add to policyAmenRedemptionCompOffers
	 */
	public void addToPolicyAmenRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYAMENREDEMPTIONCOMPOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyAmenRedemptionCompOffers. 
	 * @param value the item to add to policyAmenRedemptionCompOffers
	 */
	public void addToPolicyAmenRedemptionCompOffers(final TravelogixPolicy value)
	{
		addToPolicyAmenRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyAmenRedemptionCompOffers. 
	 * @param value the item to remove from policyAmenRedemptionCompOffers
	 */
	public void removeFromPolicyAmenRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYAMENREDEMPTIONCOMPOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyAmenRedemptionCompOffers. 
	 * @param value the item to remove from policyAmenRedemptionCompOffers
	 */
	public void removeFromPolicyAmenRedemptionCompOffers(final TravelogixPolicy value)
	{
		removeFromPolicyAmenRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.policyBookingRedemptionCompOffers</code> attribute.
	 * @return the policyBookingRedemptionCompOffers
	 */
	public Collection<TravelogixPolicy> getPolicyBookingRedemptionCompOffers(final SessionContext ctx)
	{
		return POLICYBOOKINGREDEMPTIONCOMPOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.policyBookingRedemptionCompOffers</code> attribute.
	 * @return the policyBookingRedemptionCompOffers
	 */
	public Collection<TravelogixPolicy> getPolicyBookingRedemptionCompOffers()
	{
		return getPolicyBookingRedemptionCompOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.policyBookingRedemptionCompOffers</code> attribute. 
	 * @param value the policyBookingRedemptionCompOffers
	 */
	public void setPolicyBookingRedemptionCompOffers(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		POLICYBOOKINGREDEMPTIONCOMPOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.policyBookingRedemptionCompOffers</code> attribute. 
	 * @param value the policyBookingRedemptionCompOffers
	 */
	public void setPolicyBookingRedemptionCompOffers(final Collection<TravelogixPolicy> value)
	{
		setPolicyBookingRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyBookingRedemptionCompOffers. 
	 * @param value the item to add to policyBookingRedemptionCompOffers
	 */
	public void addToPolicyBookingRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYBOOKINGREDEMPTIONCOMPOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyBookingRedemptionCompOffers. 
	 * @param value the item to add to policyBookingRedemptionCompOffers
	 */
	public void addToPolicyBookingRedemptionCompOffers(final TravelogixPolicy value)
	{
		addToPolicyBookingRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyBookingRedemptionCompOffers. 
	 * @param value the item to remove from policyBookingRedemptionCompOffers
	 */
	public void removeFromPolicyBookingRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYBOOKINGREDEMPTIONCOMPOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyBookingRedemptionCompOffers. 
	 * @param value the item to remove from policyBookingRedemptionCompOffers
	 */
	public void removeFromPolicyBookingRedemptionCompOffers(final TravelogixPolicy value)
	{
		removeFromPolicyBookingRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.policyPaymentRedemptionCompOffers</code> attribute.
	 * @return the policyPaymentRedemptionCompOffers
	 */
	public Collection<TravelogixPolicy> getPolicyPaymentRedemptionCompOffers(final SessionContext ctx)
	{
		return POLICYPAYMENTREDEMPTIONCOMPOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.policyPaymentRedemptionCompOffers</code> attribute.
	 * @return the policyPaymentRedemptionCompOffers
	 */
	public Collection<TravelogixPolicy> getPolicyPaymentRedemptionCompOffers()
	{
		return getPolicyPaymentRedemptionCompOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.policyPaymentRedemptionCompOffers</code> attribute. 
	 * @param value the policyPaymentRedemptionCompOffers
	 */
	public void setPolicyPaymentRedemptionCompOffers(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		POLICYPAYMENTREDEMPTIONCOMPOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.policyPaymentRedemptionCompOffers</code> attribute. 
	 * @param value the policyPaymentRedemptionCompOffers
	 */
	public void setPolicyPaymentRedemptionCompOffers(final Collection<TravelogixPolicy> value)
	{
		setPolicyPaymentRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyPaymentRedemptionCompOffers. 
	 * @param value the item to add to policyPaymentRedemptionCompOffers
	 */
	public void addToPolicyPaymentRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYPAYMENTREDEMPTIONCOMPOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyPaymentRedemptionCompOffers. 
	 * @param value the item to add to policyPaymentRedemptionCompOffers
	 */
	public void addToPolicyPaymentRedemptionCompOffers(final TravelogixPolicy value)
	{
		addToPolicyPaymentRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyPaymentRedemptionCompOffers. 
	 * @param value the item to remove from policyPaymentRedemptionCompOffers
	 */
	public void removeFromPolicyPaymentRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYPAYMENTREDEMPTIONCOMPOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyPaymentRedemptionCompOffers. 
	 * @param value the item to remove from policyPaymentRedemptionCompOffers
	 */
	public void removeFromPolicyPaymentRedemptionCompOffers(final TravelogixPolicy value)
	{
		removeFromPolicyPaymentRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.policyRedemptionCompOffers</code> attribute.
	 * @return the policyRedemptionCompOffers
	 */
	public Collection<TravelogixPolicy> getPolicyRedemptionCompOffers(final SessionContext ctx)
	{
		return POLICYREDEMPTIONCOMPOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.policyRedemptionCompOffers</code> attribute.
	 * @return the policyRedemptionCompOffers
	 */
	public Collection<TravelogixPolicy> getPolicyRedemptionCompOffers()
	{
		return getPolicyRedemptionCompOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.policyRedemptionCompOffers</code> attribute. 
	 * @param value the policyRedemptionCompOffers
	 */
	public void setPolicyRedemptionCompOffers(final SessionContext ctx, final Collection<TravelogixPolicy> value)
	{
		POLICYREDEMPTIONCOMPOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.policyRedemptionCompOffers</code> attribute. 
	 * @param value the policyRedemptionCompOffers
	 */
	public void setPolicyRedemptionCompOffers(final Collection<TravelogixPolicy> value)
	{
		setPolicyRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyRedemptionCompOffers. 
	 * @param value the item to add to policyRedemptionCompOffers
	 */
	public void addToPolicyRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYREDEMPTIONCOMPOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyRedemptionCompOffers. 
	 * @param value the item to add to policyRedemptionCompOffers
	 */
	public void addToPolicyRedemptionCompOffers(final TravelogixPolicy value)
	{
		addToPolicyRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyRedemptionCompOffers. 
	 * @param value the item to remove from policyRedemptionCompOffers
	 */
	public void removeFromPolicyRedemptionCompOffers(final SessionContext ctx, final TravelogixPolicy value)
	{
		POLICYREDEMPTIONCOMPOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyRedemptionCompOffers. 
	 * @param value the item to remove from policyRedemptionCompOffers
	 */
	public void removeFromPolicyRedemptionCompOffers(final TravelogixPolicy value)
	{
		removeFromPolicyRedemptionCompOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts(final SessionContext ctx)
	{
		return PRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<Product> value)
	{
		PRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Collection<Product> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final Product value)
	{
		PRODUCTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final Product value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final Product value)
	{
		PRODUCTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final Product value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.redemptionOfferId</code> attribute.
	 * @return the redemptionOfferId
	 */
	public String getRedemptionOfferId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REDEMPTIONOFFERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.redemptionOfferId</code> attribute.
	 * @return the redemptionOfferId
	 */
	public String getRedemptionOfferId()
	{
		return getRedemptionOfferId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.redemptionOfferId</code> attribute. 
	 * @param value the redemptionOfferId
	 */
	public void setRedemptionOfferId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REDEMPTIONOFFERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.redemptionOfferId</code> attribute. 
	 * @param value the redemptionOfferId
	 */
	public void setRedemptionOfferId(final String value)
	{
		setRedemptionOfferId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.suppCredRedemptionOfferComp</code> attribute.
	 * @return the suppCredRedemptionOfferComp
	 */
	public Collection<SupplierCredentials> getSuppCredRedemptionOfferComp(final SessionContext ctx)
	{
		return SUPPCREDREDEMPTIONOFFERCOMPHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.suppCredRedemptionOfferComp</code> attribute.
	 * @return the suppCredRedemptionOfferComp
	 */
	public Collection<SupplierCredentials> getSuppCredRedemptionOfferComp()
	{
		return getSuppCredRedemptionOfferComp( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.suppCredRedemptionOfferComp</code> attribute. 
	 * @param value the suppCredRedemptionOfferComp
	 */
	public void setSuppCredRedemptionOfferComp(final SessionContext ctx, final Collection<SupplierCredentials> value)
	{
		SUPPCREDREDEMPTIONOFFERCOMPHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.suppCredRedemptionOfferComp</code> attribute. 
	 * @param value the suppCredRedemptionOfferComp
	 */
	public void setSuppCredRedemptionOfferComp(final Collection<SupplierCredentials> value)
	{
		setSuppCredRedemptionOfferComp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppCredRedemptionOfferComp. 
	 * @param value the item to add to suppCredRedemptionOfferComp
	 */
	public void addToSuppCredRedemptionOfferComp(final SessionContext ctx, final SupplierCredentials value)
	{
		SUPPCREDREDEMPTIONOFFERCOMPHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppCredRedemptionOfferComp. 
	 * @param value the item to add to suppCredRedemptionOfferComp
	 */
	public void addToSuppCredRedemptionOfferComp(final SupplierCredentials value)
	{
		addToSuppCredRedemptionOfferComp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppCredRedemptionOfferComp. 
	 * @param value the item to remove from suppCredRedemptionOfferComp
	 */
	public void removeFromSuppCredRedemptionOfferComp(final SessionContext ctx, final SupplierCredentials value)
	{
		SUPPCREDREDEMPTIONOFFERCOMPHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppCredRedemptionOfferComp. 
	 * @param value the item to remove from suppCredRedemptionOfferComp
	 */
	public void removeFromSuppCredRedemptionOfferComp(final SupplierCredentials value)
	{
		removeFromSuppCredRedemptionOfferComp( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.travelDateRedempOffers</code> attribute.
	 * @return the travelDateRedempOffers
	 */
	public Collection<TravelDateValidity> getTravelDateRedempOffers(final SessionContext ctx)
	{
		return TRAVELDATEREDEMPOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.travelDateRedempOffers</code> attribute.
	 * @return the travelDateRedempOffers
	 */
	public Collection<TravelDateValidity> getTravelDateRedempOffers()
	{
		return getTravelDateRedempOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.travelDateRedempOffers</code> attribute. 
	 * @param value the travelDateRedempOffers
	 */
	public void setTravelDateRedempOffers(final SessionContext ctx, final Collection<TravelDateValidity> value)
	{
		TRAVELDATEREDEMPOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.travelDateRedempOffers</code> attribute. 
	 * @param value the travelDateRedempOffers
	 */
	public void setTravelDateRedempOffers(final Collection<TravelDateValidity> value)
	{
		setTravelDateRedempOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDateRedempOffers. 
	 * @param value the item to add to travelDateRedempOffers
	 */
	public void addToTravelDateRedempOffers(final SessionContext ctx, final TravelDateValidity value)
	{
		TRAVELDATEREDEMPOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDateRedempOffers. 
	 * @param value the item to add to travelDateRedempOffers
	 */
	public void addToTravelDateRedempOffers(final TravelDateValidity value)
	{
		addToTravelDateRedempOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDateRedempOffers. 
	 * @param value the item to remove from travelDateRedempOffers
	 */
	public void removeFromTravelDateRedempOffers(final SessionContext ctx, final TravelDateValidity value)
	{
		TRAVELDATEREDEMPOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDateRedempOffers. 
	 * @param value the item to remove from travelDateRedempOffers
	 */
	public void removeFromTravelDateRedempOffers(final TravelDateValidity value)
	{
		removeFromTravelDateRedempOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.voucherDetails</code> attribute.
	 * @return the voucherDetails
	 */
	public String getVoucherDetails(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VOUCHERDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RedemptionCompanyOffers.voucherDetails</code> attribute.
	 * @return the voucherDetails
	 */
	public String getVoucherDetails()
	{
		return getVoucherDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.voucherDetails</code> attribute. 
	 * @param value the voucherDetails
	 */
	public void setVoucherDetails(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VOUCHERDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RedemptionCompanyOffers.voucherDetails</code> attribute. 
	 * @param value the voucherDetails
	 */
	public void setVoucherDetails(final String value)
	{
		setVoucherDetails( getSession().getSessionContext(), value );
	}
	
}
