/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.commercials.core.jalo.definition;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.definition.CompanyClientPCC;
import com.cnk.travelogix.company.commercials.core.jalo.definition.TravelDestination;
import com.cnk.travelogix.company.commercials.core.jalo.definition.Validity;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.commercials.core.jalo.definition.AbstractClientCompanyAdvanceDefinition AbstractClientCompanyAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractClientCompanyAdvanceDefinition extends GenericItem
{
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.validity</code> attribute **/
	public static final String VALIDITY = "validity";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute **/
	public static final String PERBOOKING = "perBooking";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute **/
	public static final String PERPASSENGER = "perPassenger";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.supplierType</code> attribute **/
	public static final String SUPPLIERTYPE = "supplierType";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute **/
	public static final String LOGINCREDENTIAL = "loginCredential";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.companyClientPCC</code> attribute **/
	public static final String COMPANYCLIENTPCC = "companyClientPCC";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.calculationType</code> attribute **/
	public static final String CALCULATIONTYPE = "calculationType";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.netOff</code> attribute **/
	public static final String NETOFF = "netOff";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute **/
	public static final String TRAVELDESTINCLUSION = "travelDestInclusion";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.ancillaries</code> attribute **/
	public static final String ANCILLARIES = "ancillaries";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/** Qualifier of the <code>AbstractClientCompanyAdvanceDefinition.travelDestination</code> attribute **/
	public static final String TRAVELDESTINATION = "travelDestination";
	/**
	* {@link OneToManyHandler} for handling 1:n ANCILLARIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Ancillary> ANCILLARIESHANDLER = new OneToManyHandler<Ancillary>(
	CommonproductcoreConstants.TC.ANCILLARY,
	false,
	"absclntCompanyAdvanceDefinition",
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
	"abstcompclntAdvDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELDESTINATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelDestination> TRAVELDESTINATIONHANDLER = new OneToManyHandler<TravelDestination>(
	ClientcommercialsConstants.TC.TRAVELDESTINATION,
	false,
	"abstcompclntAdvDefTravelDest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VALIDITY, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(PERBOOKING, AttributeMode.INITIAL);
		tmp.put(PERPASSENGER, AttributeMode.INITIAL);
		tmp.put(SUPPLIERTYPE, AttributeMode.INITIAL);
		tmp.put(LOGINCREDENTIAL, AttributeMode.INITIAL);
		tmp.put(COMPANYCLIENTPCC, AttributeMode.INITIAL);
		tmp.put(CALCULATIONTYPE, AttributeMode.INITIAL);
		tmp.put(NETOFF, AttributeMode.INITIAL);
		tmp.put(TRAVELDESTINCLUSION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.ancillaries</code> attribute.
	 * @return the ancillaries
	 */
	public Collection<Ancillary> getAncillaries(final SessionContext ctx)
	{
		return ANCILLARIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.ancillaries</code> attribute.
	 * @return the ancillaries
	 */
	public Collection<Ancillary> getAncillaries()
	{
		return getAncillaries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.ancillaries</code> attribute. 
	 * @param value the ancillaries
	 */
	public void setAncillaries(final SessionContext ctx, final Collection<Ancillary> value)
	{
		ANCILLARIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.ancillaries</code> attribute. 
	 * @param value the ancillaries
	 */
	public void setAncillaries(final Collection<Ancillary> value)
	{
		setAncillaries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ancillaries. 
	 * @param value the item to add to ancillaries
	 */
	public void addToAncillaries(final SessionContext ctx, final Ancillary value)
	{
		ANCILLARIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ancillaries. 
	 * @param value the item to add to ancillaries
	 */
	public void addToAncillaries(final Ancillary value)
	{
		addToAncillaries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ancillaries. 
	 * @param value the item to remove from ancillaries
	 */
	public void removeFromAncillaries(final SessionContext ctx, final Ancillary value)
	{
		ANCILLARIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ancillaries. 
	 * @param value the item to remove from ancillaries
	 */
	public void removeFromAncillaries(final Ancillary value)
	{
		removeFromAncillaries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.calculationType</code> attribute.
	 * @return the calculationType
	 */
	public EnumerationValue getCalculationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CALCULATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.calculationType</code> attribute.
	 * @return the calculationType
	 */
	public EnumerationValue getCalculationType()
	{
		return getCalculationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.calculationType</code> attribute. 
	 * @param value the calculationType
	 */
	public void setCalculationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CALCULATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.calculationType</code> attribute. 
	 * @param value the calculationType
	 */
	public void setCalculationType(final EnumerationValue value)
	{
		setCalculationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.companyClientPCC</code> attribute.
	 * @return the companyClientPCC
	 */
	public CompanyClientPCC getCompanyClientPCC(final SessionContext ctx)
	{
		return (CompanyClientPCC)getProperty( ctx, COMPANYCLIENTPCC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.companyClientPCC</code> attribute.
	 * @return the companyClientPCC
	 */
	public CompanyClientPCC getCompanyClientPCC()
	{
		return getCompanyClientPCC( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.companyClientPCC</code> attribute. 
	 * @param value the companyClientPCC
	 */
	public void setCompanyClientPCC(final SessionContext ctx, final CompanyClientPCC value)
	{
		setProperty(ctx, COMPANYCLIENTPCC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.companyClientPCC</code> attribute. 
	 * @param value the companyClientPCC
	 */
	public void setCompanyClientPCC(final CompanyClientPCC value)
	{
		setCompanyClientPCC( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute.
	 * @return the loginCredential
	 */
	public Boolean isLoginCredential(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, LOGINCREDENTIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute.
	 * @return the loginCredential
	 */
	public Boolean isLoginCredential()
	{
		return isLoginCredential( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute. 
	 * @return the loginCredential
	 */
	public boolean isLoginCredentialAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isLoginCredential( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute. 
	 * @return the loginCredential
	 */
	public boolean isLoginCredentialAsPrimitive()
	{
		return isLoginCredentialAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute. 
	 * @param value the loginCredential
	 */
	public void setLoginCredential(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, LOGINCREDENTIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute. 
	 * @param value the loginCredential
	 */
	public void setLoginCredential(final Boolean value)
	{
		setLoginCredential( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute. 
	 * @param value the loginCredential
	 */
	public void setLoginCredential(final SessionContext ctx, final boolean value)
	{
		setLoginCredential( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.loginCredential</code> attribute. 
	 * @param value the loginCredential
	 */
	public void setLoginCredential(final boolean value)
	{
		setLoginCredential( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.nationality</code> attribute.
	 * @return the nationality
	 */
	public List<Country> getNationality(final SessionContext ctx)
	{
		List<Country> coll = (List<Country>)getProperty( ctx, NATIONALITY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.nationality</code> attribute.
	 * @return the nationality
	 */
	public List<Country> getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final List<Country> value)
	{
		setProperty(ctx, NATIONALITY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final List<Country> value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.netOff</code> attribute.
	 * @return the netOff
	 */
	public EnumerationValue getNetOff(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, NETOFF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.netOff</code> attribute.
	 * @return the netOff
	 */
	public EnumerationValue getNetOff()
	{
		return getNetOff( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.netOff</code> attribute. 
	 * @param value the netOff
	 */
	public void setNetOff(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, NETOFF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.netOff</code> attribute. 
	 * @param value the netOff
	 */
	public void setNetOff(final EnumerationValue value)
	{
		setNetOff( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public List<EnumerationValue> getPassengerType(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, PASSENGERTYPE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public List<EnumerationValue> getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, PASSENGERTYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final List<EnumerationValue> value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute.
	 * @return the perBooking
	 */
	public Boolean isPerBooking(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERBOOKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute.
	 * @return the perBooking
	 */
	public Boolean isPerBooking()
	{
		return isPerBooking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute. 
	 * @return the perBooking
	 */
	public boolean isPerBookingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerBooking( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute. 
	 * @return the perBooking
	 */
	public boolean isPerBookingAsPrimitive()
	{
		return isPerBookingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute. 
	 * @param value the perBooking
	 */
	public void setPerBooking(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERBOOKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute. 
	 * @param value the perBooking
	 */
	public void setPerBooking(final Boolean value)
	{
		setPerBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute. 
	 * @param value the perBooking
	 */
	public void setPerBooking(final SessionContext ctx, final boolean value)
	{
		setPerBooking( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.perBooking</code> attribute. 
	 * @param value the perBooking
	 */
	public void setPerBooking(final boolean value)
	{
		setPerBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute.
	 * @return the perPassenger
	 */
	public Boolean isPerPassenger(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERPASSENGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute.
	 * @return the perPassenger
	 */
	public Boolean isPerPassenger()
	{
		return isPerPassenger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute. 
	 * @return the perPassenger
	 */
	public boolean isPerPassengerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerPassenger( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute. 
	 * @return the perPassenger
	 */
	public boolean isPerPassengerAsPrimitive()
	{
		return isPerPassengerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute. 
	 * @param value the perPassenger
	 */
	public void setPerPassenger(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERPASSENGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute. 
	 * @param value the perPassenger
	 */
	public void setPerPassenger(final Boolean value)
	{
		setPerPassenger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute. 
	 * @param value the perPassenger
	 */
	public void setPerPassenger(final SessionContext ctx, final boolean value)
	{
		setPerPassenger( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.perPassenger</code> attribute. 
	 * @param value the perPassenger
	 */
	public void setPerPassenger(final boolean value)
	{
		setPerPassenger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts(final SessionContext ctx)
	{
		return PRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.products</code> attribute.
	 * @return the products
	 */
	public Collection<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Collection<Product> value)
	{
		PRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.products</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.supplierType</code> attribute.
	 * @return the supplierType
	 */
	public EnumerationValue getSupplierType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLIERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.supplierType</code> attribute.
	 * @return the supplierType
	 */
	public EnumerationValue getSupplierType()
	{
		return getSupplierType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.supplierType</code> attribute. 
	 * @param value the supplierType
	 */
	public void setSupplierType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLIERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.supplierType</code> attribute. 
	 * @param value the supplierType
	 */
	public void setSupplierType(final EnumerationValue value)
	{
		setSupplierType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestination</code> attribute.
	 * @return the travelDestination
	 */
	public Collection<TravelDestination> getTravelDestination(final SessionContext ctx)
	{
		return TRAVELDESTINATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestination</code> attribute.
	 * @return the travelDestination
	 */
	public Collection<TravelDestination> getTravelDestination()
	{
		return getTravelDestination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestination</code> attribute. 
	 * @param value the travelDestination
	 */
	public void setTravelDestination(final SessionContext ctx, final Collection<TravelDestination> value)
	{
		TRAVELDESTINATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestination</code> attribute. 
	 * @param value the travelDestination
	 */
	public void setTravelDestination(final Collection<TravelDestination> value)
	{
		setTravelDestination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDestination. 
	 * @param value the item to add to travelDestination
	 */
	public void addToTravelDestination(final SessionContext ctx, final TravelDestination value)
	{
		TRAVELDESTINATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDestination. 
	 * @param value the item to add to travelDestination
	 */
	public void addToTravelDestination(final TravelDestination value)
	{
		addToTravelDestination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDestination. 
	 * @param value the item to remove from travelDestination
	 */
	public void removeFromTravelDestination(final SessionContext ctx, final TravelDestination value)
	{
		TRAVELDESTINATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDestination. 
	 * @param value the item to remove from travelDestination
	 */
	public void removeFromTravelDestination(final TravelDestination value)
	{
		removeFromTravelDestination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute.
	 * @return the travelDestInclusion
	 */
	public Boolean isTravelDestInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRAVELDESTINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute.
	 * @return the travelDestInclusion
	 */
	public Boolean isTravelDestInclusion()
	{
		return isTravelDestInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute. 
	 * @return the travelDestInclusion
	 */
	public boolean isTravelDestInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTravelDestInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute. 
	 * @return the travelDestInclusion
	 */
	public boolean isTravelDestInclusionAsPrimitive()
	{
		return isTravelDestInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute. 
	 * @param value the travelDestInclusion
	 */
	public void setTravelDestInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRAVELDESTINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute. 
	 * @param value the travelDestInclusion
	 */
	public void setTravelDestInclusion(final Boolean value)
	{
		setTravelDestInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute. 
	 * @param value the travelDestInclusion
	 */
	public void setTravelDestInclusion(final SessionContext ctx, final boolean value)
	{
		setTravelDestInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.travelDestInclusion</code> attribute. 
	 * @param value the travelDestInclusion
	 */
	public void setTravelDestInclusion(final boolean value)
	{
		setTravelDestInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.validity</code> attribute.
	 * @return the validity
	 */
	public Validity getValidity(final SessionContext ctx)
	{
		return (Validity)getProperty( ctx, VALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCompanyAdvanceDefinition.validity</code> attribute.
	 * @return the validity
	 */
	public Validity getValidity()
	{
		return getValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.validity</code> attribute. 
	 * @param value the validity
	 */
	public void setValidity(final SessionContext ctx, final Validity value)
	{
		setProperty(ctx, VALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCompanyAdvanceDefinition.validity</code> attribute. 
	 * @param value the validity
	 */
	public void setValidity(final Validity value)
	{
		setValidity( getSession().getSessionContext(), value );
	}
	
}
