/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RatePaymentDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.PaymentTypeDetails PaymentTypeDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentTypeDetails extends GenericItem
{
	/** Qualifier of the <code>PaymentTypeDetails.paymentType</code> attribute **/
	public static final String PAYMENTTYPE = "paymentType";
	/** Qualifier of the <code>PaymentTypeDetails.prepaymentType</code> attribute **/
	public static final String PREPAYMENTTYPE = "prepaymentType";
	/** Qualifier of the <code>PaymentTypeDetails.rateDefinition</code> attribute **/
	public static final String RATEDEFINITION = "rateDefinition";
	/** Qualifier of the <code>PaymentTypeDetails.ratePaymentDetails</code> attribute **/
	public static final String RATEPAYMENTDETAILS = "ratePaymentDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RATEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPaymentTypeDetails> RATEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedPaymentTypeDetails>(
	SupplierratedefinitionscoreConstants.TC.PAYMENTTYPEDETAILS,
	false,
	"rateDefinition",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RATEPAYMENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RatePaymentDetail> RATEPAYMENTDETAILSHANDLER = new OneToManyHandler<RatePaymentDetail>(
	SupplierratedefinitionscoreConstants.TC.RATEPAYMENTDETAIL,
	false,
	"paymentTypeDetails",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAYMENTTYPE, AttributeMode.INITIAL);
		tmp.put(PREPAYMENTTYPE, AttributeMode.INITIAL);
		tmp.put(RATEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RATEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTypeDetails.paymentType</code> attribute.
	 * @return the paymentType
	 */
	public EnumerationValue getPaymentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTypeDetails.paymentType</code> attribute.
	 * @return the paymentType
	 */
	public EnumerationValue getPaymentType()
	{
		return getPaymentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTypeDetails.paymentType</code> attribute. 
	 * @param value the paymentType
	 */
	public void setPaymentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTypeDetails.paymentType</code> attribute. 
	 * @param value the paymentType
	 */
	public void setPaymentType(final EnumerationValue value)
	{
		setPaymentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTypeDetails.prepaymentType</code> attribute.
	 * @return the prepaymentType
	 */
	public EnumerationValue getPrepaymentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PREPAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTypeDetails.prepaymentType</code> attribute.
	 * @return the prepaymentType
	 */
	public EnumerationValue getPrepaymentType()
	{
		return getPrepaymentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTypeDetails.prepaymentType</code> attribute. 
	 * @param value the prepaymentType
	 */
	public void setPrepaymentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PREPAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTypeDetails.prepaymentType</code> attribute. 
	 * @param value the prepaymentType
	 */
	public void setPrepaymentType(final EnumerationValue value)
	{
		setPrepaymentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTypeDetails.rateDefinition</code> attribute.
	 * @return the rateDefinition
	 */
	public AbstractRateDefinition getRateDefinition(final SessionContext ctx)
	{
		return (AbstractRateDefinition)getProperty( ctx, RATEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTypeDetails.rateDefinition</code> attribute.
	 * @return the rateDefinition
	 */
	public AbstractRateDefinition getRateDefinition()
	{
		return getRateDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTypeDetails.rateDefinition</code> attribute. 
	 * @param value the rateDefinition
	 */
	public void setRateDefinition(final SessionContext ctx, final AbstractRateDefinition value)
	{
		RATEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTypeDetails.rateDefinition</code> attribute. 
	 * @param value the rateDefinition
	 */
	public void setRateDefinition(final AbstractRateDefinition value)
	{
		setRateDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTypeDetails.ratePaymentDetails</code> attribute.
	 * @return the ratePaymentDetails
	 */
	public Set<RatePaymentDetail> getRatePaymentDetails(final SessionContext ctx)
	{
		return (Set<RatePaymentDetail>)RATEPAYMENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentTypeDetails.ratePaymentDetails</code> attribute.
	 * @return the ratePaymentDetails
	 */
	public Set<RatePaymentDetail> getRatePaymentDetails()
	{
		return getRatePaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTypeDetails.ratePaymentDetails</code> attribute. 
	 * @param value the ratePaymentDetails
	 */
	public void setRatePaymentDetails(final SessionContext ctx, final Set<RatePaymentDetail> value)
	{
		RATEPAYMENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentTypeDetails.ratePaymentDetails</code> attribute. 
	 * @param value the ratePaymentDetails
	 */
	public void setRatePaymentDetails(final Set<RatePaymentDetail> value)
	{
		setRatePaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ratePaymentDetails. 
	 * @param value the item to add to ratePaymentDetails
	 */
	public void addToRatePaymentDetails(final SessionContext ctx, final RatePaymentDetail value)
	{
		RATEPAYMENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ratePaymentDetails. 
	 * @param value the item to add to ratePaymentDetails
	 */
	public void addToRatePaymentDetails(final RatePaymentDetail value)
	{
		addToRatePaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ratePaymentDetails. 
	 * @param value the item to remove from ratePaymentDetails
	 */
	public void removeFromRatePaymentDetails(final SessionContext ctx, final RatePaymentDetail value)
	{
		RATEPAYMENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ratePaymentDetails. 
	 * @param value the item to remove from ratePaymentDetails
	 */
	public void removeFromRatePaymentDetails(final RatePaymentDetail value)
	{
		removeFromRatePaymentDetails( getSession().getSessionContext(), value );
	}
	
}
