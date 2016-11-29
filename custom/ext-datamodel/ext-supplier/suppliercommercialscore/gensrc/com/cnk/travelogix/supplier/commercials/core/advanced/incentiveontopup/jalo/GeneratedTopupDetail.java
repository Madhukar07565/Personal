/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo;

import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo.SupplierIncentiveOnTopupRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.order.payment.PaymentMode;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo.TopupDetail TopupDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTopupDetail extends GenericItem
{
	/** Qualifier of the <code>TopupDetail.modeOfPayment</code> attribute **/
	public static final String MODEOFPAYMENT = "modeOfPayment";
	/** Qualifier of the <code>TopupDetail.bank</code> attribute **/
	public static final String BANK = "bank";
	/** Qualifier of the <code>TopupDetail.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>TopupDetail.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>TopupDetail.incentivePercentage</code> attribute **/
	public static final String INCENTIVEPERCENTAGE = "incentivePercentage";
	/** Qualifier of the <code>TopupDetail.commercial</code> attribute **/
	public static final String COMMERCIAL = "commercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTopupDetail> COMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedTopupDetail>(
	SuppliercommercialscoreConstants.TC.TOPUPDETAIL,
	false,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MODEOFPAYMENT, AttributeMode.INITIAL);
		tmp.put(BANK, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(INCENTIVEPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(COMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank()
	{
		return getBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final Bank value)
	{
		setBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierIncentiveOnTopupRecord getCommercial(final SessionContext ctx)
	{
		return (SupplierIncentiveOnTopupRecord)getProperty( ctx, COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierIncentiveOnTopupRecord getCommercial()
	{
		return getCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SessionContext ctx, final SupplierIncentiveOnTopupRecord value)
	{
		COMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SupplierIncentiveOnTopupRecord value)
	{
		setCommercial( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.incentivePercentage</code> attribute.
	 * @return the incentivePercentage
	 */
	public Double getIncentivePercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, INCENTIVEPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.incentivePercentage</code> attribute.
	 * @return the incentivePercentage
	 */
	public Double getIncentivePercentage()
	{
		return getIncentivePercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.incentivePercentage</code> attribute. 
	 * @return the incentivePercentage
	 */
	public double getIncentivePercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getIncentivePercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.incentivePercentage</code> attribute. 
	 * @return the incentivePercentage
	 */
	public double getIncentivePercentageAsPrimitive()
	{
		return getIncentivePercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.incentivePercentage</code> attribute. 
	 * @param value the incentivePercentage
	 */
	public void setIncentivePercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, INCENTIVEPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.incentivePercentage</code> attribute. 
	 * @param value the incentivePercentage
	 */
	public void setIncentivePercentage(final Double value)
	{
		setIncentivePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.incentivePercentage</code> attribute. 
	 * @param value the incentivePercentage
	 */
	public void setIncentivePercentage(final SessionContext ctx, final double value)
	{
		setIncentivePercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.incentivePercentage</code> attribute. 
	 * @param value the incentivePercentage
	 */
	public void setIncentivePercentage(final double value)
	{
		setIncentivePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.modeOfPayment</code> attribute.
	 * @return the modeOfPayment
	 */
	public PaymentMode getModeOfPayment(final SessionContext ctx)
	{
		return (PaymentMode)getProperty( ctx, MODEOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TopupDetail.modeOfPayment</code> attribute.
	 * @return the modeOfPayment
	 */
	public PaymentMode getModeOfPayment()
	{
		return getModeOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment
	 */
	public void setModeOfPayment(final SessionContext ctx, final PaymentMode value)
	{
		setProperty(ctx, MODEOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TopupDetail.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment
	 */
	public void setModeOfPayment(final PaymentMode value)
	{
		setModeOfPayment( getSession().getSessionContext(), value );
	}
	
}
