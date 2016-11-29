/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.clientsettlementterms.jalo;

import com.cnk.travelogix.client.settlementterms.constants.ClientsettlementtermscoreConstants;
import com.cnk.travelogix.clientsettlementterms.jalo.AbstractClientCommercial;
import com.cnk.travelogix.clientsettlementterms.jalo.ProductDetails;
import com.cnk.travelogix.clientsettlementterms.jalo.ServiceTax;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.clientsettlementterms.jalo.CommercialPayable CommercialPayable}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommercialPayable extends AbstractClientCommercial
{
	/** Qualifier of the <code>CommercialPayable.commercialSettlementType</code> attribute **/
	public static final String COMMERCIALSETTLEMENTTYPE = "commercialSettlementType";
	/** Qualifier of the <code>CommercialPayable.initialAmountPercentage</code> attribute **/
	public static final String INITIALAMOUNTPERCENTAGE = "initialAmountPercentage";
	/** Qualifier of the <code>CommercialPayable.standardCommercialType</code> attribute **/
	public static final String STANDARDCOMMERCIALTYPE = "standardCommercialType";
	/** Qualifier of the <code>CommercialPayable.serviceTax</code> attribute **/
	public static final String SERVICETAX = "serviceTax";
	/** Qualifier of the <code>CommercialPayable.balanceDetails</code> attribute **/
	public static final String BALANCEDETAILS = "balanceDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n SERVICETAX's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ServiceTax> SERVICETAXHANDLER = new OneToManyHandler<ServiceTax>(
	ClientsettlementtermscoreConstants.TC.SERVICETAX,
	true,
	"commercialPayable",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BALANCEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductDetails> BALANCEDETAILSHANDLER = new OneToManyHandler<ProductDetails>(
	ClientsettlementtermscoreConstants.TC.BALANCEDETAILS,
	true,
	"commercialPayable",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractClientCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMMERCIALSETTLEMENTTYPE, AttributeMode.INITIAL);
		tmp.put(INITIALAMOUNTPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(STANDARDCOMMERCIALTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.balanceDetails</code> attribute.
	 * @return the balanceDetails
	 */
	public Set<ProductDetails> getBalanceDetails(final SessionContext ctx)
	{
		return (Set<ProductDetails>)BALANCEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.balanceDetails</code> attribute.
	 * @return the balanceDetails
	 */
	public Set<ProductDetails> getBalanceDetails()
	{
		return getBalanceDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.balanceDetails</code> attribute. 
	 * @param value the balanceDetails
	 */
	public void setBalanceDetails(final SessionContext ctx, final Set<ProductDetails> value)
	{
		BALANCEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.balanceDetails</code> attribute. 
	 * @param value the balanceDetails
	 */
	public void setBalanceDetails(final Set<ProductDetails> value)
	{
		setBalanceDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to balanceDetails. 
	 * @param value the item to add to balanceDetails
	 */
	public void addToBalanceDetails(final SessionContext ctx, final ProductDetails value)
	{
		BALANCEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to balanceDetails. 
	 * @param value the item to add to balanceDetails
	 */
	public void addToBalanceDetails(final ProductDetails value)
	{
		addToBalanceDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from balanceDetails. 
	 * @param value the item to remove from balanceDetails
	 */
	public void removeFromBalanceDetails(final SessionContext ctx, final ProductDetails value)
	{
		BALANCEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from balanceDetails. 
	 * @param value the item to remove from balanceDetails
	 */
	public void removeFromBalanceDetails(final ProductDetails value)
	{
		removeFromBalanceDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.commercialSettlementType</code> attribute.
	 * @return the commercialSettlementType - Commercial Settlement Type
	 */
	public EnumerationValue getCommercialSettlementType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALSETTLEMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.commercialSettlementType</code> attribute.
	 * @return the commercialSettlementType - Commercial Settlement Type
	 */
	public EnumerationValue getCommercialSettlementType()
	{
		return getCommercialSettlementType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.commercialSettlementType</code> attribute. 
	 * @param value the commercialSettlementType - Commercial Settlement Type
	 */
	public void setCommercialSettlementType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALSETTLEMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.commercialSettlementType</code> attribute. 
	 * @param value the commercialSettlementType - Commercial Settlement Type
	 */
	public void setCommercialSettlementType(final EnumerationValue value)
	{
		setCommercialSettlementType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.initialAmountPercentage</code> attribute.
	 * @return the initialAmountPercentage - Initial Amount
	 */
	public Integer getInitialAmountPercentage(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, INITIALAMOUNTPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.initialAmountPercentage</code> attribute.
	 * @return the initialAmountPercentage - Initial Amount
	 */
	public Integer getInitialAmountPercentage()
	{
		return getInitialAmountPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.initialAmountPercentage</code> attribute. 
	 * @return the initialAmountPercentage - Initial Amount
	 */
	public int getInitialAmountPercentageAsPrimitive(final SessionContext ctx)
	{
		Integer value = getInitialAmountPercentage( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.initialAmountPercentage</code> attribute. 
	 * @return the initialAmountPercentage - Initial Amount
	 */
	public int getInitialAmountPercentageAsPrimitive()
	{
		return getInitialAmountPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.initialAmountPercentage</code> attribute. 
	 * @param value the initialAmountPercentage - Initial Amount
	 */
	public void setInitialAmountPercentage(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, INITIALAMOUNTPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.initialAmountPercentage</code> attribute. 
	 * @param value the initialAmountPercentage - Initial Amount
	 */
	public void setInitialAmountPercentage(final Integer value)
	{
		setInitialAmountPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.initialAmountPercentage</code> attribute. 
	 * @param value the initialAmountPercentage - Initial Amount
	 */
	public void setInitialAmountPercentage(final SessionContext ctx, final int value)
	{
		setInitialAmountPercentage( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.initialAmountPercentage</code> attribute. 
	 * @param value the initialAmountPercentage - Initial Amount
	 */
	public void setInitialAmountPercentage(final int value)
	{
		setInitialAmountPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.serviceTax</code> attribute.
	 * @return the serviceTax
	 */
	public Set<ServiceTax> getServiceTax(final SessionContext ctx)
	{
		return (Set<ServiceTax>)SERVICETAXHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.serviceTax</code> attribute.
	 * @return the serviceTax
	 */
	public Set<ServiceTax> getServiceTax()
	{
		return getServiceTax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.serviceTax</code> attribute. 
	 * @param value the serviceTax
	 */
	public void setServiceTax(final SessionContext ctx, final Set<ServiceTax> value)
	{
		SERVICETAXHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.serviceTax</code> attribute. 
	 * @param value the serviceTax
	 */
	public void setServiceTax(final Set<ServiceTax> value)
	{
		setServiceTax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to serviceTax. 
	 * @param value the item to add to serviceTax
	 */
	public void addToServiceTax(final SessionContext ctx, final ServiceTax value)
	{
		SERVICETAXHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to serviceTax. 
	 * @param value the item to add to serviceTax
	 */
	public void addToServiceTax(final ServiceTax value)
	{
		addToServiceTax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from serviceTax. 
	 * @param value the item to remove from serviceTax
	 */
	public void removeFromServiceTax(final SessionContext ctx, final ServiceTax value)
	{
		SERVICETAXHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from serviceTax. 
	 * @param value the item to remove from serviceTax
	 */
	public void removeFromServiceTax(final ServiceTax value)
	{
		removeFromServiceTax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.standardCommercialType</code> attribute.
	 * @return the standardCommercialType - Settlement Commercial Type
	 */
	public EnumerationValue getStandardCommercialType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STANDARDCOMMERCIALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialPayable.standardCommercialType</code> attribute.
	 * @return the standardCommercialType - Settlement Commercial Type
	 */
	public EnumerationValue getStandardCommercialType()
	{
		return getStandardCommercialType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.standardCommercialType</code> attribute. 
	 * @param value the standardCommercialType - Settlement Commercial Type
	 */
	public void setStandardCommercialType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STANDARDCOMMERCIALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialPayable.standardCommercialType</code> attribute. 
	 * @param value the standardCommercialType - Settlement Commercial Type
	 */
	public void setStandardCommercialType(final EnumerationValue value)
	{
		setStandardCommercialType( getSession().getSessionContext(), value );
	}
	
}
