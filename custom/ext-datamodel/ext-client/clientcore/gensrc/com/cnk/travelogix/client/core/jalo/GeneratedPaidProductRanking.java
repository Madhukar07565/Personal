/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.ClientPaidPaymentDetail;
import com.cnk.travelogix.client.core.jalo.ClientPaidProductDetail;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.PaidProductRanking PaidProductRanking}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaidProductRanking extends GenericItem
{
	/** Qualifier of the <code>PaidProductRanking.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>PaidProductRanking.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>PaidProductRanking.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>PaidProductRanking.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>PaidProductRanking.productDetails</code> attribute **/
	public static final String PRODUCTDETAILS = "productDetails";
	/** Qualifier of the <code>PaidProductRanking.paymentDetails</code> attribute **/
	public static final String PAYMENTDETAILS = "paymentDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPaidProductRanking> CLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedPaidProductRanking>(
	ClientcoreConstants.TC.PAIDPRODUCTRANKING,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ClientPaidProductDetail> PRODUCTDETAILSHANDLER = new OneToManyHandler<ClientPaidProductDetail>(
	ClientcoreConstants.TC.CLIENTPAIDPRODUCTDETAIL,
	false,
	"paidProductRanking",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PAYMENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ClientPaidPaymentDetail> PAYMENTDETAILSHANDLER = new OneToManyHandler<ClientPaidPaymentDetail>(
	ClientcoreConstants.TC.CLIENTPAIDPAYMENTDETAIL,
	false,
	"paidProductRanking",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final Principal value)
	{
		CLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final Principal value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.paymentDetails</code> attribute.
	 * @return the paymentDetails
	 */
	public Collection<ClientPaidPaymentDetail> getPaymentDetails(final SessionContext ctx)
	{
		return PAYMENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.paymentDetails</code> attribute.
	 * @return the paymentDetails
	 */
	public Collection<ClientPaidPaymentDetail> getPaymentDetails()
	{
		return getPaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.paymentDetails</code> attribute. 
	 * @param value the paymentDetails
	 */
	public void setPaymentDetails(final SessionContext ctx, final Collection<ClientPaidPaymentDetail> value)
	{
		PAYMENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.paymentDetails</code> attribute. 
	 * @param value the paymentDetails
	 */
	public void setPaymentDetails(final Collection<ClientPaidPaymentDetail> value)
	{
		setPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentDetails. 
	 * @param value the item to add to paymentDetails
	 */
	public void addToPaymentDetails(final SessionContext ctx, final ClientPaidPaymentDetail value)
	{
		PAYMENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentDetails. 
	 * @param value the item to add to paymentDetails
	 */
	public void addToPaymentDetails(final ClientPaidPaymentDetail value)
	{
		addToPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentDetails. 
	 * @param value the item to remove from paymentDetails
	 */
	public void removeFromPaymentDetails(final SessionContext ctx, final ClientPaidPaymentDetail value)
	{
		PAYMENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentDetails. 
	 * @param value the item to remove from paymentDetails
	 */
	public void removeFromPaymentDetails(final ClientPaidPaymentDetail value)
	{
		removeFromPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.productDetails</code> attribute.
	 * @return the productDetails
	 */
	public Collection<ClientPaidProductDetail> getProductDetails(final SessionContext ctx)
	{
		return PRODUCTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.productDetails</code> attribute.
	 * @return the productDetails
	 */
	public Collection<ClientPaidProductDetail> getProductDetails()
	{
		return getProductDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.productDetails</code> attribute. 
	 * @param value the productDetails
	 */
	public void setProductDetails(final SessionContext ctx, final Collection<ClientPaidProductDetail> value)
	{
		PRODUCTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.productDetails</code> attribute. 
	 * @param value the productDetails
	 */
	public void setProductDetails(final Collection<ClientPaidProductDetail> value)
	{
		setProductDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productDetails. 
	 * @param value the item to add to productDetails
	 */
	public void addToProductDetails(final SessionContext ctx, final ClientPaidProductDetail value)
	{
		PRODUCTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productDetails. 
	 * @param value the item to add to productDetails
	 */
	public void addToProductDetails(final ClientPaidProductDetail value)
	{
		addToProductDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productDetails. 
	 * @param value the item to remove from productDetails
	 */
	public void removeFromProductDetails(final SessionContext ctx, final ClientPaidProductDetail value)
	{
		PRODUCTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productDetails. 
	 * @param value the item to remove from productDetails
	 */
	public void removeFromProductDetails(final ClientPaidProductDetail value)
	{
		removeFromProductDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaidProductRanking.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaidProductRanking.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
