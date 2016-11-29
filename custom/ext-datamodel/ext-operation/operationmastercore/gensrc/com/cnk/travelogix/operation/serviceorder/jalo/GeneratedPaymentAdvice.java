/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.serviceorder.jalo;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.serviceorder.jalo.ServiceOrder;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.serviceorder.jalo.PaymentAdvice PaymentAdvice}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentAdvice extends GenericItem
{
	/** Qualifier of the <code>PaymentAdvice.paymentAdviceNumber</code> attribute **/
	public static final String PAYMENTADVICENUMBER = "paymentAdviceNumber";
	/** Qualifier of the <code>PaymentAdvice.paymentAdviceStatus</code> attribute **/
	public static final String PAYMENTADVICESTATUS = "paymentAdviceStatus";
	/** Qualifier of the <code>PaymentAdvice.netPayable</code> attribute **/
	public static final String NETPAYABLE = "netPayable";
	/** Qualifier of the <code>PaymentAdvice.amountPayable</code> attribute **/
	public static final String AMOUNTPAYABLE = "amountPayable";
	/** Qualifier of the <code>PaymentAdvice.balanceAmountPayable</code> attribute **/
	public static final String BALANCEAMOUNTPAYABLE = "balanceAmountPayable";
	/** Qualifier of the <code>PaymentAdvice.amountTobePaid</code> attribute **/
	public static final String AMOUNTTOBEPAID = "amountTobePaid";
	/** Qualifier of the <code>PaymentAdvice.modeOfPayment</code> attribute **/
	public static final String MODEOFPAYMENT = "modeOfPayment";
	/** Qualifier of the <code>PaymentAdvice.serviceOrder</code> attribute **/
	public static final String SERVICEORDER = "serviceOrder";
	/**
	* {@link OneToManyHandler} for handling 1:n SERVICEORDER's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ServiceOrder> SERVICEORDERHANDLER = new OneToManyHandler<ServiceOrder>(
	OperationmastercoreConstants.TC.SERVICEORDER,
	false,
	"paymentAdvice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAYMENTADVICENUMBER, AttributeMode.INITIAL);
		tmp.put(PAYMENTADVICESTATUS, AttributeMode.INITIAL);
		tmp.put(NETPAYABLE, AttributeMode.INITIAL);
		tmp.put(AMOUNTPAYABLE, AttributeMode.INITIAL);
		tmp.put(BALANCEAMOUNTPAYABLE, AttributeMode.INITIAL);
		tmp.put(AMOUNTTOBEPAID, AttributeMode.INITIAL);
		tmp.put(MODEOFPAYMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.amountPayable</code> attribute.
	 * @return the amountPayable
	 */
	public Double getAmountPayable(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNTPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.amountPayable</code> attribute.
	 * @return the amountPayable
	 */
	public Double getAmountPayable()
	{
		return getAmountPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.amountPayable</code> attribute. 
	 * @return the amountPayable
	 */
	public double getAmountPayableAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmountPayable( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.amountPayable</code> attribute. 
	 * @return the amountPayable
	 */
	public double getAmountPayableAsPrimitive()
	{
		return getAmountPayableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.amountPayable</code> attribute. 
	 * @param value the amountPayable
	 */
	public void setAmountPayable(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNTPAYABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.amountPayable</code> attribute. 
	 * @param value the amountPayable
	 */
	public void setAmountPayable(final Double value)
	{
		setAmountPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.amountPayable</code> attribute. 
	 * @param value the amountPayable
	 */
	public void setAmountPayable(final SessionContext ctx, final double value)
	{
		setAmountPayable( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.amountPayable</code> attribute. 
	 * @param value the amountPayable
	 */
	public void setAmountPayable(final double value)
	{
		setAmountPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.amountTobePaid</code> attribute.
	 * @return the amountTobePaid
	 */
	public Double getAmountTobePaid(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNTTOBEPAID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.amountTobePaid</code> attribute.
	 * @return the amountTobePaid
	 */
	public Double getAmountTobePaid()
	{
		return getAmountTobePaid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.amountTobePaid</code> attribute. 
	 * @return the amountTobePaid
	 */
	public double getAmountTobePaidAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmountTobePaid( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.amountTobePaid</code> attribute. 
	 * @return the amountTobePaid
	 */
	public double getAmountTobePaidAsPrimitive()
	{
		return getAmountTobePaidAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.amountTobePaid</code> attribute. 
	 * @param value the amountTobePaid
	 */
	public void setAmountTobePaid(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNTTOBEPAID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.amountTobePaid</code> attribute. 
	 * @param value the amountTobePaid
	 */
	public void setAmountTobePaid(final Double value)
	{
		setAmountTobePaid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.amountTobePaid</code> attribute. 
	 * @param value the amountTobePaid
	 */
	public void setAmountTobePaid(final SessionContext ctx, final double value)
	{
		setAmountTobePaid( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.amountTobePaid</code> attribute. 
	 * @param value the amountTobePaid
	 */
	public void setAmountTobePaid(final double value)
	{
		setAmountTobePaid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.balanceAmountPayable</code> attribute.
	 * @return the balanceAmountPayable
	 */
	public Double getBalanceAmountPayable(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, BALANCEAMOUNTPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.balanceAmountPayable</code> attribute.
	 * @return the balanceAmountPayable
	 */
	public Double getBalanceAmountPayable()
	{
		return getBalanceAmountPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.balanceAmountPayable</code> attribute. 
	 * @return the balanceAmountPayable
	 */
	public double getBalanceAmountPayableAsPrimitive(final SessionContext ctx)
	{
		Double value = getBalanceAmountPayable( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.balanceAmountPayable</code> attribute. 
	 * @return the balanceAmountPayable
	 */
	public double getBalanceAmountPayableAsPrimitive()
	{
		return getBalanceAmountPayableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.balanceAmountPayable</code> attribute. 
	 * @param value the balanceAmountPayable
	 */
	public void setBalanceAmountPayable(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, BALANCEAMOUNTPAYABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.balanceAmountPayable</code> attribute. 
	 * @param value the balanceAmountPayable
	 */
	public void setBalanceAmountPayable(final Double value)
	{
		setBalanceAmountPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.balanceAmountPayable</code> attribute. 
	 * @param value the balanceAmountPayable
	 */
	public void setBalanceAmountPayable(final SessionContext ctx, final double value)
	{
		setBalanceAmountPayable( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.balanceAmountPayable</code> attribute. 
	 * @param value the balanceAmountPayable
	 */
	public void setBalanceAmountPayable(final double value)
	{
		setBalanceAmountPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.modeOfPayment</code> attribute.
	 * @return the modeOfPayment
	 */
	public EnumerationValue getModeOfPayment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.modeOfPayment</code> attribute.
	 * @return the modeOfPayment
	 */
	public EnumerationValue getModeOfPayment()
	{
		return getModeOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment
	 */
	public void setModeOfPayment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment
	 */
	public void setModeOfPayment(final EnumerationValue value)
	{
		setModeOfPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.netPayable</code> attribute.
	 * @return the netPayable
	 */
	public Double getNetPayable(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, NETPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.netPayable</code> attribute.
	 * @return the netPayable
	 */
	public Double getNetPayable()
	{
		return getNetPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.netPayable</code> attribute. 
	 * @return the netPayable
	 */
	public double getNetPayableAsPrimitive(final SessionContext ctx)
	{
		Double value = getNetPayable( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.netPayable</code> attribute. 
	 * @return the netPayable
	 */
	public double getNetPayableAsPrimitive()
	{
		return getNetPayableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.netPayable</code> attribute. 
	 * @param value the netPayable
	 */
	public void setNetPayable(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, NETPAYABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.netPayable</code> attribute. 
	 * @param value the netPayable
	 */
	public void setNetPayable(final Double value)
	{
		setNetPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.netPayable</code> attribute. 
	 * @param value the netPayable
	 */
	public void setNetPayable(final SessionContext ctx, final double value)
	{
		setNetPayable( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.netPayable</code> attribute. 
	 * @param value the netPayable
	 */
	public void setNetPayable(final double value)
	{
		setNetPayable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.paymentAdviceNumber</code> attribute.
	 * @return the paymentAdviceNumber
	 */
	public String getPaymentAdviceNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTADVICENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.paymentAdviceNumber</code> attribute.
	 * @return the paymentAdviceNumber
	 */
	public String getPaymentAdviceNumber()
	{
		return getPaymentAdviceNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.paymentAdviceNumber</code> attribute. 
	 * @param value the paymentAdviceNumber
	 */
	public void setPaymentAdviceNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTADVICENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.paymentAdviceNumber</code> attribute. 
	 * @param value the paymentAdviceNumber
	 */
	public void setPaymentAdviceNumber(final String value)
	{
		setPaymentAdviceNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.paymentAdviceStatus</code> attribute.
	 * @return the paymentAdviceStatus
	 */
	public EnumerationValue getPaymentAdviceStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTADVICESTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.paymentAdviceStatus</code> attribute.
	 * @return the paymentAdviceStatus
	 */
	public EnumerationValue getPaymentAdviceStatus()
	{
		return getPaymentAdviceStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.paymentAdviceStatus</code> attribute. 
	 * @param value the paymentAdviceStatus
	 */
	public void setPaymentAdviceStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTADVICESTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.paymentAdviceStatus</code> attribute. 
	 * @param value the paymentAdviceStatus
	 */
	public void setPaymentAdviceStatus(final EnumerationValue value)
	{
		setPaymentAdviceStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.serviceOrder</code> attribute.
	 * @return the serviceOrder
	 */
	public Collection<ServiceOrder> getServiceOrder(final SessionContext ctx)
	{
		return SERVICEORDERHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdvice.serviceOrder</code> attribute.
	 * @return the serviceOrder
	 */
	public Collection<ServiceOrder> getServiceOrder()
	{
		return getServiceOrder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.serviceOrder</code> attribute. 
	 * @param value the serviceOrder
	 */
	public void setServiceOrder(final SessionContext ctx, final Collection<ServiceOrder> value)
	{
		SERVICEORDERHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdvice.serviceOrder</code> attribute. 
	 * @param value the serviceOrder
	 */
	public void setServiceOrder(final Collection<ServiceOrder> value)
	{
		setServiceOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to serviceOrder. 
	 * @param value the item to add to serviceOrder
	 */
	public void addToServiceOrder(final SessionContext ctx, final ServiceOrder value)
	{
		SERVICEORDERHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to serviceOrder. 
	 * @param value the item to add to serviceOrder
	 */
	public void addToServiceOrder(final ServiceOrder value)
	{
		addToServiceOrder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from serviceOrder. 
	 * @param value the item to remove from serviceOrder
	 */
	public void removeFromServiceOrder(final SessionContext ctx, final ServiceOrder value)
	{
		SERVICEORDERHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from serviceOrder. 
	 * @param value the item to remove from serviceOrder
	 */
	public void removeFromServiceOrder(final ServiceOrder value)
	{
		removeFromServiceOrder( getSession().getSessionContext(), value );
	}
	
}
