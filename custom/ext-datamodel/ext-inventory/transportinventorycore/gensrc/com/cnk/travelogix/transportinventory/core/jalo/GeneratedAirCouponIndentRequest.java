/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.AbstractCouponDetail;
import com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentCommission;
import com.cnk.travelogix.transportinventory.core.jalo.CouponPriceRow;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.AirCouponIndentRequest AirCouponIndentRequest}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirCouponIndentRequest extends AbstractCouponDetail
{
	/** Qualifier of the <code>AirCouponIndentRequest.settlementType</code> attribute **/
	public static final String SETTLEMENTTYPE = "settlementType";
	/** Qualifier of the <code>AirCouponIndentRequest.typesofPayment</code> attribute **/
	public static final String TYPESOFPAYMENT = "typesofPayment";
	/** Qualifier of the <code>AirCouponIndentRequest.credentialNameOrIATAcode</code> attribute **/
	public static final String CREDENTIALNAMEORIATACODE = "credentialNameOrIATAcode";
	/** Qualifier of the <code>AirCouponIndentRequest.netAmountPaidToSupplier</code> attribute **/
	public static final String NETAMOUNTPAIDTOSUPPLIER = "netAmountPaidToSupplier";
	/** Qualifier of the <code>AirCouponIndentRequest.netAmountPayableTosupplier</code> attribute **/
	public static final String NETAMOUNTPAYABLETOSUPPLIER = "netAmountPayableTosupplier";
	/** Qualifier of the <code>AirCouponIndentRequest.airCouponIndentCommission</code> attribute **/
	public static final String AIRCOUPONINDENTCOMMISSION = "airCouponIndentCommission";
	/** Qualifier of the <code>AirCouponIndentRequest.prices</code> attribute **/
	public static final String PRICES = "prices";
	/** Qualifier of the <code>AirCouponIndentRequest.indentRequestpaymentDetails</code> attribute **/
	public static final String INDENTREQUESTPAYMENTDETAILS = "indentRequestpaymentDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n AIRCOUPONINDENTCOMMISSION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirCouponIndentCommission> AIRCOUPONINDENTCOMMISSIONHANDLER = new OneToManyHandler<AirCouponIndentCommission>(
	TransportinventorycoreConstants.TC.AIRCOUPONINDENTCOMMISSION,
	true,
	"airCouponIndentRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRICES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CouponPriceRow> PRICESHANDLER = new OneToManyHandler<CouponPriceRow>(
	TransportinventorycoreConstants.TC.COUPONPRICEROW,
	true,
	"airCouponIndentRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INDENTREQUESTPAYMENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractPaymentDetail> INDENTREQUESTPAYMENTDETAILSHANDLER = new OneToManyHandler<AbstractPaymentDetail>(
	MasterdatacoreConstants.TC.ABSTRACTPAYMENTDETAIL,
	true,
	"airCouponIndentRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCouponDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SETTLEMENTTYPE, AttributeMode.INITIAL);
		tmp.put(TYPESOFPAYMENT, AttributeMode.INITIAL);
		tmp.put(CREDENTIALNAMEORIATACODE, AttributeMode.INITIAL);
		tmp.put(NETAMOUNTPAIDTOSUPPLIER, AttributeMode.INITIAL);
		tmp.put(NETAMOUNTPAYABLETOSUPPLIER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.airCouponIndentCommission</code> attribute.
	 * @return the airCouponIndentCommission
	 */
	public Collection<AirCouponIndentCommission> getAirCouponIndentCommission(final SessionContext ctx)
	{
		return AIRCOUPONINDENTCOMMISSIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.airCouponIndentCommission</code> attribute.
	 * @return the airCouponIndentCommission
	 */
	public Collection<AirCouponIndentCommission> getAirCouponIndentCommission()
	{
		return getAirCouponIndentCommission( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.airCouponIndentCommission</code> attribute. 
	 * @param value the airCouponIndentCommission
	 */
	public void setAirCouponIndentCommission(final SessionContext ctx, final Collection<AirCouponIndentCommission> value)
	{
		AIRCOUPONINDENTCOMMISSIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.airCouponIndentCommission</code> attribute. 
	 * @param value the airCouponIndentCommission
	 */
	public void setAirCouponIndentCommission(final Collection<AirCouponIndentCommission> value)
	{
		setAirCouponIndentCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airCouponIndentCommission. 
	 * @param value the item to add to airCouponIndentCommission
	 */
	public void addToAirCouponIndentCommission(final SessionContext ctx, final AirCouponIndentCommission value)
	{
		AIRCOUPONINDENTCOMMISSIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to airCouponIndentCommission. 
	 * @param value the item to add to airCouponIndentCommission
	 */
	public void addToAirCouponIndentCommission(final AirCouponIndentCommission value)
	{
		addToAirCouponIndentCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airCouponIndentCommission. 
	 * @param value the item to remove from airCouponIndentCommission
	 */
	public void removeFromAirCouponIndentCommission(final SessionContext ctx, final AirCouponIndentCommission value)
	{
		AIRCOUPONINDENTCOMMISSIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from airCouponIndentCommission. 
	 * @param value the item to remove from airCouponIndentCommission
	 */
	public void removeFromAirCouponIndentCommission(final AirCouponIndentCommission value)
	{
		removeFromAirCouponIndentCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.credentialNameOrIATAcode</code> attribute.
	 * @return the credentialNameOrIATAcode
	 */
	public String getCredentialNameOrIATAcode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDENTIALNAMEORIATACODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.credentialNameOrIATAcode</code> attribute.
	 * @return the credentialNameOrIATAcode
	 */
	public String getCredentialNameOrIATAcode()
	{
		return getCredentialNameOrIATAcode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.credentialNameOrIATAcode</code> attribute. 
	 * @param value the credentialNameOrIATAcode
	 */
	public void setCredentialNameOrIATAcode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDENTIALNAMEORIATACODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.credentialNameOrIATAcode</code> attribute. 
	 * @param value the credentialNameOrIATAcode
	 */
	public void setCredentialNameOrIATAcode(final String value)
	{
		setCredentialNameOrIATAcode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.indentRequestpaymentDetails</code> attribute.
	 * @return the indentRequestpaymentDetails
	 */
	public Collection<AbstractPaymentDetail> getIndentRequestpaymentDetails(final SessionContext ctx)
	{
		return INDENTREQUESTPAYMENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.indentRequestpaymentDetails</code> attribute.
	 * @return the indentRequestpaymentDetails
	 */
	public Collection<AbstractPaymentDetail> getIndentRequestpaymentDetails()
	{
		return getIndentRequestpaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.indentRequestpaymentDetails</code> attribute. 
	 * @param value the indentRequestpaymentDetails
	 */
	public void setIndentRequestpaymentDetails(final SessionContext ctx, final Collection<AbstractPaymentDetail> value)
	{
		INDENTREQUESTPAYMENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.indentRequestpaymentDetails</code> attribute. 
	 * @param value the indentRequestpaymentDetails
	 */
	public void setIndentRequestpaymentDetails(final Collection<AbstractPaymentDetail> value)
	{
		setIndentRequestpaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to indentRequestpaymentDetails. 
	 * @param value the item to add to indentRequestpaymentDetails
	 */
	public void addToIndentRequestpaymentDetails(final SessionContext ctx, final AbstractPaymentDetail value)
	{
		INDENTREQUESTPAYMENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to indentRequestpaymentDetails. 
	 * @param value the item to add to indentRequestpaymentDetails
	 */
	public void addToIndentRequestpaymentDetails(final AbstractPaymentDetail value)
	{
		addToIndentRequestpaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from indentRequestpaymentDetails. 
	 * @param value the item to remove from indentRequestpaymentDetails
	 */
	public void removeFromIndentRequestpaymentDetails(final SessionContext ctx, final AbstractPaymentDetail value)
	{
		INDENTREQUESTPAYMENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from indentRequestpaymentDetails. 
	 * @param value the item to remove from indentRequestpaymentDetails
	 */
	public void removeFromIndentRequestpaymentDetails(final AbstractPaymentDetail value)
	{
		removeFromIndentRequestpaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.netAmountPaidToSupplier</code> attribute.
	 * @return the netAmountPaidToSupplier
	 */
	public BigDecimal getNetAmountPaidToSupplier(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, NETAMOUNTPAIDTOSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.netAmountPaidToSupplier</code> attribute.
	 * @return the netAmountPaidToSupplier
	 */
	public BigDecimal getNetAmountPaidToSupplier()
	{
		return getNetAmountPaidToSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.netAmountPaidToSupplier</code> attribute. 
	 * @param value the netAmountPaidToSupplier
	 */
	public void setNetAmountPaidToSupplier(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, NETAMOUNTPAIDTOSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.netAmountPaidToSupplier</code> attribute. 
	 * @param value the netAmountPaidToSupplier
	 */
	public void setNetAmountPaidToSupplier(final BigDecimal value)
	{
		setNetAmountPaidToSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.netAmountPayableTosupplier</code> attribute.
	 * @return the netAmountPayableTosupplier
	 */
	public BigDecimal getNetAmountPayableTosupplier(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, NETAMOUNTPAYABLETOSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.netAmountPayableTosupplier</code> attribute.
	 * @return the netAmountPayableTosupplier
	 */
	public BigDecimal getNetAmountPayableTosupplier()
	{
		return getNetAmountPayableTosupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.netAmountPayableTosupplier</code> attribute. 
	 * @param value the netAmountPayableTosupplier
	 */
	public void setNetAmountPayableTosupplier(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, NETAMOUNTPAYABLETOSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.netAmountPayableTosupplier</code> attribute. 
	 * @param value the netAmountPayableTosupplier
	 */
	public void setNetAmountPayableTosupplier(final BigDecimal value)
	{
		setNetAmountPayableTosupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.prices</code> attribute.
	 * @return the prices
	 */
	public Collection<CouponPriceRow> getPrices(final SessionContext ctx)
	{
		return PRICESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.prices</code> attribute.
	 * @return the prices
	 */
	public Collection<CouponPriceRow> getPrices()
	{
		return getPrices( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.prices</code> attribute. 
	 * @param value the prices
	 */
	public void setPrices(final SessionContext ctx, final Collection<CouponPriceRow> value)
	{
		PRICESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.prices</code> attribute. 
	 * @param value the prices
	 */
	public void setPrices(final Collection<CouponPriceRow> value)
	{
		setPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prices. 
	 * @param value the item to add to prices
	 */
	public void addToPrices(final SessionContext ctx, final CouponPriceRow value)
	{
		PRICESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prices. 
	 * @param value the item to add to prices
	 */
	public void addToPrices(final CouponPriceRow value)
	{
		addToPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prices. 
	 * @param value the item to remove from prices
	 */
	public void removeFromPrices(final SessionContext ctx, final CouponPriceRow value)
	{
		PRICESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prices. 
	 * @param value the item to remove from prices
	 */
	public void removeFromPrices(final CouponPriceRow value)
	{
		removeFromPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.settlementType</code> attribute.
	 * @return the settlementType
	 */
	public EnumerationValue getSettlementType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SETTLEMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.settlementType</code> attribute.
	 * @return the settlementType
	 */
	public EnumerationValue getSettlementType()
	{
		return getSettlementType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.settlementType</code> attribute. 
	 * @param value the settlementType
	 */
	public void setSettlementType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SETTLEMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.settlementType</code> attribute. 
	 * @param value the settlementType
	 */
	public void setSettlementType(final EnumerationValue value)
	{
		setSettlementType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.typesofPayment</code> attribute.
	 * @return the typesofPayment
	 */
	public EnumerationValue getTypesofPayment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPESOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCouponIndentRequest.typesofPayment</code> attribute.
	 * @return the typesofPayment
	 */
	public EnumerationValue getTypesofPayment()
	{
		return getTypesofPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.typesofPayment</code> attribute. 
	 * @param value the typesofPayment
	 */
	public void setTypesofPayment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPESOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCouponIndentRequest.typesofPayment</code> attribute. 
	 * @param value the typesofPayment
	 */
	public void setTypesofPayment(final EnumerationValue value)
	{
		setTypesofPayment( getSession().getSessionContext(), value );
	}
	
}
