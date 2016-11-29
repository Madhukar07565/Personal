/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.ClientCompanyCommercialDetail;
import com.cnk.travelogix.client.commercials.core.jalo.definition.AbstractClientCompanyAdvanceDefinition;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialDefinition;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial AbstractCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractCompanyCommercial extends AbstractCommercialDefinition
{
	/** Qualifier of the <code>AbstractCompanyCommercial.uid</code> attribute **/
	public static final String UID = "uid";
	/** Qualifier of the <code>AbstractCompanyCommercial.companyFareComponent</code> attribute **/
	public static final String COMPANYFARECOMPONENT = "companyFareComponent";
	/** Qualifier of the <code>AbstractCompanyCommercial.companyCurrency</code> attribute **/
	public static final String COMPANYCURRENCY = "companyCurrency";
	/** Qualifier of the <code>AbstractCompanyCommercial.companyAmount</code> attribute **/
	public static final String COMPANYAMOUNT = "companyAmount";
	/** Qualifier of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute **/
	public static final String COMPANYPERCENTAGE = "companyPercentage";
	/** Qualifier of the <code>AbstractCompanyCommercial.clientFareComponent</code> attribute **/
	public static final String CLIENTFARECOMPONENT = "clientFareComponent";
	/** Qualifier of the <code>AbstractCompanyCommercial.clientCurrency</code> attribute **/
	public static final String CLIENTCURRENCY = "clientCurrency";
	/** Qualifier of the <code>AbstractCompanyCommercial.clientAmount</code> attribute **/
	public static final String CLIENTAMOUNT = "clientAmount";
	/** Qualifier of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute **/
	public static final String CLIENTPERCENTAGE = "clientPercentage";
	/** Qualifier of the <code>AbstractCompanyCommercial.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>AbstractCompanyCommercial.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>AbstractCompanyCommercial.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/** Qualifier of the <code>AbstractCompanyCommercial.rateType</code> attribute **/
	public static final String RATETYPE = "rateType";
	/** Qualifier of the <code>AbstractCompanyCommercial.slabType</code> attribute **/
	public static final String SLABTYPE = "slabType";
	/** Qualifier of the <code>AbstractCompanyCommercial.clientCompanyCommercial</code> attribute **/
	public static final String CLIENTCOMPANYCOMMERCIAL = "clientCompanyCommercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENTCOMPANYCOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractCompanyCommercial> CLIENTCOMPANYCOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractCompanyCommercial>(
	ClientcommercialsConstants.TC.ABSTRACTCOMPANYCOMMERCIAL,
	false,
	"clientCompanyCommercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(UID, AttributeMode.INITIAL);
		tmp.put(COMPANYFARECOMPONENT, AttributeMode.INITIAL);
		tmp.put(COMPANYCURRENCY, AttributeMode.INITIAL);
		tmp.put(COMPANYAMOUNT, AttributeMode.INITIAL);
		tmp.put(COMPANYPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(CLIENTFARECOMPONENT, AttributeMode.INITIAL);
		tmp.put(CLIENTCURRENCY, AttributeMode.INITIAL);
		tmp.put(CLIENTAMOUNT, AttributeMode.INITIAL);
		tmp.put(CLIENTPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		tmp.put(RATETYPE, AttributeMode.INITIAL);
		tmp.put(SLABTYPE, AttributeMode.INITIAL);
		tmp.put(CLIENTCOMPANYCOMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AbstractClientCompanyAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (AbstractClientCompanyAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AbstractClientCompanyAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final AbstractClientCompanyAdvanceDefinition value)
	{
		setProperty(ctx, ADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final AbstractClientCompanyAdvanceDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientAmount</code> attribute.
	 * @return the clientAmount
	 */
	public Double getClientAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CLIENTAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientAmount</code> attribute.
	 * @return the clientAmount
	 */
	public Double getClientAmount()
	{
		return getClientAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientAmount</code> attribute. 
	 * @return the clientAmount
	 */
	public double getClientAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getClientAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientAmount</code> attribute. 
	 * @return the clientAmount
	 */
	public double getClientAmountAsPrimitive()
	{
		return getClientAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientAmount</code> attribute. 
	 * @param value the clientAmount
	 */
	public void setClientAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CLIENTAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientAmount</code> attribute. 
	 * @param value the clientAmount
	 */
	public void setClientAmount(final Double value)
	{
		setClientAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientAmount</code> attribute. 
	 * @param value the clientAmount
	 */
	public void setClientAmount(final SessionContext ctx, final double value)
	{
		setClientAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientAmount</code> attribute. 
	 * @param value the clientAmount
	 */
	public void setClientAmount(final double value)
	{
		setClientAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientCompanyCommercial</code> attribute.
	 * @return the clientCompanyCommercial
	 */
	public ClientCompanyCommercialDetail getClientCompanyCommercial(final SessionContext ctx)
	{
		return (ClientCompanyCommercialDetail)getProperty( ctx, CLIENTCOMPANYCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientCompanyCommercial</code> attribute.
	 * @return the clientCompanyCommercial
	 */
	public ClientCompanyCommercialDetail getClientCompanyCommercial()
	{
		return getClientCompanyCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientCompanyCommercial</code> attribute. 
	 * @param value the clientCompanyCommercial
	 */
	public void setClientCompanyCommercial(final SessionContext ctx, final ClientCompanyCommercialDetail value)
	{
		CLIENTCOMPANYCOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientCompanyCommercial</code> attribute. 
	 * @param value the clientCompanyCommercial
	 */
	public void setClientCompanyCommercial(final ClientCompanyCommercialDetail value)
	{
		setClientCompanyCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientCurrency</code> attribute.
	 * @return the clientCurrency
	 */
	public Currency getClientCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CLIENTCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientCurrency</code> attribute.
	 * @return the clientCurrency
	 */
	public Currency getClientCurrency()
	{
		return getClientCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientCurrency</code> attribute. 
	 * @param value the clientCurrency
	 */
	public void setClientCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CLIENTCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientCurrency</code> attribute. 
	 * @param value the clientCurrency
	 */
	public void setClientCurrency(final Currency value)
	{
		setClientCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientFareComponent</code> attribute.
	 * @return the clientFareComponent
	 */
	public EnumerationValue getClientFareComponent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTFARECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientFareComponent</code> attribute.
	 * @return the clientFareComponent
	 */
	public EnumerationValue getClientFareComponent()
	{
		return getClientFareComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientFareComponent</code> attribute. 
	 * @param value the clientFareComponent
	 */
	public void setClientFareComponent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTFARECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientFareComponent</code> attribute. 
	 * @param value the clientFareComponent
	 */
	public void setClientFareComponent(final EnumerationValue value)
	{
		setClientFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute.
	 * @return the clientPercentage
	 */
	public Double getClientPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CLIENTPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute.
	 * @return the clientPercentage
	 */
	public Double getClientPercentage()
	{
		return getClientPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute. 
	 * @return the clientPercentage
	 */
	public double getClientPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getClientPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute. 
	 * @return the clientPercentage
	 */
	public double getClientPercentageAsPrimitive()
	{
		return getClientPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute. 
	 * @param value the clientPercentage
	 */
	public void setClientPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CLIENTPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute. 
	 * @param value the clientPercentage
	 */
	public void setClientPercentage(final Double value)
	{
		setClientPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute. 
	 * @param value the clientPercentage
	 */
	public void setClientPercentage(final SessionContext ctx, final double value)
	{
		setClientPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.clientPercentage</code> attribute. 
	 * @param value the clientPercentage
	 */
	public void setClientPercentage(final double value)
	{
		setClientPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyAmount</code> attribute.
	 * @return the companyAmount
	 */
	public Double getCompanyAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMPANYAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyAmount</code> attribute.
	 * @return the companyAmount
	 */
	public Double getCompanyAmount()
	{
		return getCompanyAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyAmount</code> attribute. 
	 * @return the companyAmount
	 */
	public double getCompanyAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getCompanyAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyAmount</code> attribute. 
	 * @return the companyAmount
	 */
	public double getCompanyAmountAsPrimitive()
	{
		return getCompanyAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyAmount</code> attribute. 
	 * @param value the companyAmount
	 */
	public void setCompanyAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMPANYAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyAmount</code> attribute. 
	 * @param value the companyAmount
	 */
	public void setCompanyAmount(final Double value)
	{
		setCompanyAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyAmount</code> attribute. 
	 * @param value the companyAmount
	 */
	public void setCompanyAmount(final SessionContext ctx, final double value)
	{
		setCompanyAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyAmount</code> attribute. 
	 * @param value the companyAmount
	 */
	public void setCompanyAmount(final double value)
	{
		setCompanyAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyCurrency</code> attribute.
	 * @return the companyCurrency
	 */
	public Currency getCompanyCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, COMPANYCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyCurrency</code> attribute.
	 * @return the companyCurrency
	 */
	public Currency getCompanyCurrency()
	{
		return getCompanyCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyCurrency</code> attribute. 
	 * @param value the companyCurrency
	 */
	public void setCompanyCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, COMPANYCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyCurrency</code> attribute. 
	 * @param value the companyCurrency
	 */
	public void setCompanyCurrency(final Currency value)
	{
		setCompanyCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyFareComponent</code> attribute.
	 * @return the companyFareComponent
	 */
	public EnumerationValue getCompanyFareComponent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYFARECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyFareComponent</code> attribute.
	 * @return the companyFareComponent
	 */
	public EnumerationValue getCompanyFareComponent()
	{
		return getCompanyFareComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyFareComponent</code> attribute. 
	 * @param value the companyFareComponent
	 */
	public void setCompanyFareComponent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYFARECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyFareComponent</code> attribute. 
	 * @param value the companyFareComponent
	 */
	public void setCompanyFareComponent(final EnumerationValue value)
	{
		setCompanyFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute.
	 * @return the companyPercentage
	 */
	public Double getCompanyPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMPANYPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute.
	 * @return the companyPercentage
	 */
	public Double getCompanyPercentage()
	{
		return getCompanyPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute. 
	 * @return the companyPercentage
	 */
	public double getCompanyPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getCompanyPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute. 
	 * @return the companyPercentage
	 */
	public double getCompanyPercentageAsPrimitive()
	{
		return getCompanyPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute. 
	 * @param value the companyPercentage
	 */
	public void setCompanyPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMPANYPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute. 
	 * @param value the companyPercentage
	 */
	public void setCompanyPercentage(final Double value)
	{
		setCompanyPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute. 
	 * @param value the companyPercentage
	 */
	public void setCompanyPercentage(final SessionContext ctx, final double value)
	{
		setCompanyPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.companyPercentage</code> attribute. 
	 * @param value the companyPercentage
	 */
	public void setCompanyPercentage(final double value)
	{
		setCompanyPercentage( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTCOMPANYCOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.rateType</code> attribute.
	 * @return the rateType
	 */
	public RateType getRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, RATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.rateType</code> attribute.
	 * @return the rateType
	 */
	public RateType getRateType()
	{
		return getRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.rateType</code> attribute. 
	 * @param value the rateType
	 */
	public void setRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, RATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.rateType</code> attribute. 
	 * @param value the rateType
	 */
	public void setRateType(final RateType value)
	{
		setRateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType()
	{
		return getSlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final EnumerationValue value)
	{
		setSlabType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.uid</code> attribute.
	 * @return the uid
	 */
	public String getUid()
	{
		return getUid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.uid</code> attribute. 
	 * @param value the uid
	 */
	public void setUid(final String value)
	{
		setUid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractCompanyCommercial.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractCompanyCommercial.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
