/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.AdvanceApplicability;
import com.cnk.travelogix.client.core.jalo.ClientPaymentOption;
import com.cnk.travelogix.client.core.mid.jalo.MerchantIdentificationDetails;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.AcquirerInfo AcquirerInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAcquirerInfo extends GenericItem
{
	/** Qualifier of the <code>AcquirerInfo.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute **/
	public static final String CLIENTMSFFEEVALUE = "clientMSFFeeValue";
	/** Qualifier of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute **/
	public static final String CLIENTMSFFEEPERCENTAGE = "clientMSFFeePercentage";
	/** Qualifier of the <code>AcquirerInfo.cardTypes</code> attribute **/
	public static final String CARDTYPES = "cardTypes";
	/** Qualifier of the <code>AcquirerInfo.advanceApplicability</code> attribute **/
	public static final String ADVANCEAPPLICABILITY = "advanceApplicability";
	/** Qualifier of the <code>AcquirerInfo.paymentOptions</code> attribute **/
	public static final String PAYMENTOPTIONS = "paymentOptions";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PAYMENTOPTIONS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAcquirerInfo> PAYMENTOPTIONSHANDLER = new BidirectionalOneToManyHandler<GeneratedAcquirerInfo>(
	ClientcoreConstants.TC.ACQUIRERINFO,
	false,
	"paymentOptions",
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
		tmp.put(CLIENTMSFFEEVALUE, AttributeMode.INITIAL);
		tmp.put(CLIENTMSFFEEPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(CARDTYPES, AttributeMode.INITIAL);
		tmp.put(ADVANCEAPPLICABILITY, AttributeMode.INITIAL);
		tmp.put(PAYMENTOPTIONS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.advanceApplicability</code> attribute.
	 * @return the advanceApplicability - Advance Applicability
	 */
	public AdvanceApplicability getAdvanceApplicability(final SessionContext ctx)
	{
		return (AdvanceApplicability)getProperty( ctx, ADVANCEAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.advanceApplicability</code> attribute.
	 * @return the advanceApplicability - Advance Applicability
	 */
	public AdvanceApplicability getAdvanceApplicability()
	{
		return getAdvanceApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability - Advance Applicability
	 */
	public void setAdvanceApplicability(final SessionContext ctx, final AdvanceApplicability value)
	{
		setProperty(ctx, ADVANCEAPPLICABILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability - Advance Applicability
	 */
	public void setAdvanceApplicability(final AdvanceApplicability value)
	{
		setAdvanceApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.cardTypes</code> attribute.
	 * @return the cardTypes - Card Types
	 */
	public EnumerationValue getCardTypes(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARDTYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.cardTypes</code> attribute.
	 * @return the cardTypes - Card Types
	 */
	public EnumerationValue getCardTypes()
	{
		return getCardTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.cardTypes</code> attribute. 
	 * @param value the cardTypes - Card Types
	 */
	public void setCardTypes(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARDTYPES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.cardTypes</code> attribute. 
	 * @param value the cardTypes - Card Types
	 */
	public void setCardTypes(final EnumerationValue value)
	{
		setCardTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute.
	 * @return the clientMSFFeePercentage - Client MSF Fee Percentage
	 */
	public Double getClientMSFFeePercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CLIENTMSFFEEPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute.
	 * @return the clientMSFFeePercentage - Client MSF Fee Percentage
	 */
	public Double getClientMSFFeePercentage()
	{
		return getClientMSFFeePercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute. 
	 * @return the clientMSFFeePercentage - Client MSF Fee Percentage
	 */
	public double getClientMSFFeePercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getClientMSFFeePercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute. 
	 * @return the clientMSFFeePercentage - Client MSF Fee Percentage
	 */
	public double getClientMSFFeePercentageAsPrimitive()
	{
		return getClientMSFFeePercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute. 
	 * @param value the clientMSFFeePercentage - Client MSF Fee Percentage
	 */
	public void setClientMSFFeePercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CLIENTMSFFEEPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute. 
	 * @param value the clientMSFFeePercentage - Client MSF Fee Percentage
	 */
	public void setClientMSFFeePercentage(final Double value)
	{
		setClientMSFFeePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute. 
	 * @param value the clientMSFFeePercentage - Client MSF Fee Percentage
	 */
	public void setClientMSFFeePercentage(final SessionContext ctx, final double value)
	{
		setClientMSFFeePercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.clientMSFFeePercentage</code> attribute. 
	 * @param value the clientMSFFeePercentage - Client MSF Fee Percentage
	 */
	public void setClientMSFFeePercentage(final double value)
	{
		setClientMSFFeePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute.
	 * @return the clientMSFFeeValue - Client MSF Fee Value
	 */
	public Double getClientMSFFeeValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CLIENTMSFFEEVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute.
	 * @return the clientMSFFeeValue - Client MSF Fee Value
	 */
	public Double getClientMSFFeeValue()
	{
		return getClientMSFFeeValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute. 
	 * @return the clientMSFFeeValue - Client MSF Fee Value
	 */
	public double getClientMSFFeeValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getClientMSFFeeValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute. 
	 * @return the clientMSFFeeValue - Client MSF Fee Value
	 */
	public double getClientMSFFeeValueAsPrimitive()
	{
		return getClientMSFFeeValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute. 
	 * @param value the clientMSFFeeValue - Client MSF Fee Value
	 */
	public void setClientMSFFeeValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CLIENTMSFFEEVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute. 
	 * @param value the clientMSFFeeValue - Client MSF Fee Value
	 */
	public void setClientMSFFeeValue(final Double value)
	{
		setClientMSFFeeValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute. 
	 * @param value the clientMSFFeeValue - Client MSF Fee Value
	 */
	public void setClientMSFFeeValue(final SessionContext ctx, final double value)
	{
		setClientMSFFeeValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.clientMSFFeeValue</code> attribute. 
	 * @param value the clientMSFFeeValue - Client MSF Fee Value
	 */
	public void setClientMSFFeeValue(final double value)
	{
		setClientMSFFeeValue( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PAYMENTOPTIONSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.paymentOptions</code> attribute.
	 * @return the paymentOptions
	 */
	public ClientPaymentOption getPaymentOptions(final SessionContext ctx)
	{
		return (ClientPaymentOption)getProperty( ctx, PAYMENTOPTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.paymentOptions</code> attribute.
	 * @return the paymentOptions
	 */
	public ClientPaymentOption getPaymentOptions()
	{
		return getPaymentOptions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.paymentOptions</code> attribute. 
	 * @param value the paymentOptions
	 */
	public void setPaymentOptions(final SessionContext ctx, final ClientPaymentOption value)
	{
		PAYMENTOPTIONSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.paymentOptions</code> attribute. 
	 * @param value the paymentOptions
	 */
	public void setPaymentOptions(final ClientPaymentOption value)
	{
		setPaymentOptions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.supplier</code> attribute.
	 * @return the supplier - Supplier
	 */
	public MerchantIdentificationDetails getSupplier(final SessionContext ctx)
	{
		return (MerchantIdentificationDetails)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AcquirerInfo.supplier</code> attribute.
	 * @return the supplier - Supplier
	 */
	public MerchantIdentificationDetails getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.supplier</code> attribute. 
	 * @param value the supplier - Supplier
	 */
	public void setSupplier(final SessionContext ctx, final MerchantIdentificationDetails value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AcquirerInfo.supplier</code> attribute. 
	 * @param value the supplier - Supplier
	 */
	public void setSupplier(final MerchantIdentificationDetails value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
}
