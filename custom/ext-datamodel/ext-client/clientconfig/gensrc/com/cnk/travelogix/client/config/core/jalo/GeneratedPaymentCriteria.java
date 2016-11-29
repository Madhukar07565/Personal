/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.TriggerEvent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.PaymentCriteria PaymentCriteria}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentCriteria extends GenericItem
{
	/** Qualifier of the <code>PaymentCriteria.modeOfPayment</code> attribute **/
	public static final String MODEOFPAYMENT = "modeOfPayment";
	/** Qualifier of the <code>PaymentCriteria.criteriaName</code> attribute **/
	public static final String CRITERIANAME = "criteriaName";
	/** Qualifier of the <code>PaymentCriteria.approvalRequired</code> attribute **/
	public static final String APPROVALREQUIRED = "approvalRequired";
	/** Qualifier of the <code>PaymentCriteria.paymentRealization</code> attribute **/
	public static final String PAYMENTREALIZATION = "paymentRealization";
	/** Qualifier of the <code>PaymentCriteria.triggerEvent</code> attribute **/
	public static final String TRIGGEREVENT = "triggerEvent";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRIGGEREVENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPaymentCriteria> TRIGGEREVENTHANDLER = new BidirectionalOneToManyHandler<GeneratedPaymentCriteria>(
	ClientconfigConstants.TC.PAYMENTCRITERIA,
	false,
	"triggerEvent",
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
		tmp.put(CRITERIANAME, AttributeMode.INITIAL);
		tmp.put(APPROVALREQUIRED, AttributeMode.INITIAL);
		tmp.put(PAYMENTREALIZATION, AttributeMode.INITIAL);
		tmp.put(TRIGGEREVENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.approvalRequired</code> attribute.
	 * @return the approvalRequired
	 */
	public Boolean isApprovalRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, APPROVALREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.approvalRequired</code> attribute.
	 * @return the approvalRequired
	 */
	public Boolean isApprovalRequired()
	{
		return isApprovalRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.approvalRequired</code> attribute. 
	 * @return the approvalRequired
	 */
	public boolean isApprovalRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isApprovalRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.approvalRequired</code> attribute. 
	 * @return the approvalRequired
	 */
	public boolean isApprovalRequiredAsPrimitive()
	{
		return isApprovalRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, APPROVALREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final Boolean value)
	{
		setApprovalRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final SessionContext ctx, final boolean value)
	{
		setApprovalRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.approvalRequired</code> attribute. 
	 * @param value the approvalRequired
	 */
	public void setApprovalRequired(final boolean value)
	{
		setApprovalRequired( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRIGGEREVENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.criteriaName</code> attribute.
	 * @return the criteriaName - Client Document Handling Criteria Name
	 */
	public EnumerationValue getCriteriaName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CRITERIANAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.criteriaName</code> attribute.
	 * @return the criteriaName - Client Document Handling Criteria Name
	 */
	public EnumerationValue getCriteriaName()
	{
		return getCriteriaName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.criteriaName</code> attribute. 
	 * @param value the criteriaName - Client Document Handling Criteria Name
	 */
	public void setCriteriaName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CRITERIANAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.criteriaName</code> attribute. 
	 * @param value the criteriaName - Client Document Handling Criteria Name
	 */
	public void setCriteriaName(final EnumerationValue value)
	{
		setCriteriaName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.modeOfPayment</code> attribute.
	 * @return the modeOfPayment - Client Document Handling Mode Of Payment
	 */
	public EnumerationValue getModeOfPayment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFPAYMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.modeOfPayment</code> attribute.
	 * @return the modeOfPayment - Client Document Handling Mode Of Payment
	 */
	public EnumerationValue getModeOfPayment()
	{
		return getModeOfPayment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment - Client Document Handling Mode Of Payment
	 */
	public void setModeOfPayment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFPAYMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.modeOfPayment</code> attribute. 
	 * @param value the modeOfPayment - Client Document Handling Mode Of Payment
	 */
	public void setModeOfPayment(final EnumerationValue value)
	{
		setModeOfPayment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.paymentRealization</code> attribute.
	 * @return the paymentRealization
	 */
	public Boolean isPaymentRealization(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYMENTREALIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.paymentRealization</code> attribute.
	 * @return the paymentRealization
	 */
	public Boolean isPaymentRealization()
	{
		return isPaymentRealization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.paymentRealization</code> attribute. 
	 * @return the paymentRealization
	 */
	public boolean isPaymentRealizationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPaymentRealization( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.paymentRealization</code> attribute. 
	 * @return the paymentRealization
	 */
	public boolean isPaymentRealizationAsPrimitive()
	{
		return isPaymentRealizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.paymentRealization</code> attribute. 
	 * @param value the paymentRealization
	 */
	public void setPaymentRealization(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYMENTREALIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.paymentRealization</code> attribute. 
	 * @param value the paymentRealization
	 */
	public void setPaymentRealization(final Boolean value)
	{
		setPaymentRealization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.paymentRealization</code> attribute. 
	 * @param value the paymentRealization
	 */
	public void setPaymentRealization(final SessionContext ctx, final boolean value)
	{
		setPaymentRealization( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.paymentRealization</code> attribute. 
	 * @param value the paymentRealization
	 */
	public void setPaymentRealization(final boolean value)
	{
		setPaymentRealization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.triggerEvent</code> attribute.
	 * @return the triggerEvent
	 */
	public TriggerEvent getTriggerEvent(final SessionContext ctx)
	{
		return (TriggerEvent)getProperty( ctx, TRIGGEREVENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentCriteria.triggerEvent</code> attribute.
	 * @return the triggerEvent
	 */
	public TriggerEvent getTriggerEvent()
	{
		return getTriggerEvent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.triggerEvent</code> attribute. 
	 * @param value the triggerEvent
	 */
	public void setTriggerEvent(final SessionContext ctx, final TriggerEvent value)
	{
		TRIGGEREVENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentCriteria.triggerEvent</code> attribute. 
	 * @param value the triggerEvent
	 */
	public void setTriggerEvent(final TriggerEvent value)
	{
		setTriggerEvent( getSession().getSessionContext(), value );
	}
	
}
