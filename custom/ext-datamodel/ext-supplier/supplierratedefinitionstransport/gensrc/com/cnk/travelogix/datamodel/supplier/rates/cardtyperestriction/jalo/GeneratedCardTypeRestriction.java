/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.cardtyperestriction.jalo;

import com.cnk.travelogix.masterdata.core.financials.jalo.Bank;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.promotions.jalo.AbstractPromotionRestriction;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.cardtyperestriction.jalo.CardTypeRestriction CardTypeRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCardTypeRestriction extends AbstractPromotionRestriction
{
	/** Qualifier of the <code>CardTypeRestriction.creditCardType</code> attribute **/
	public static final String CREDITCARDTYPE = "creditCardType";
	/** Qualifier of the <code>CardTypeRestriction.cardSubType</code> attribute **/
	public static final String CARDSUBTYPE = "cardSubType";
	/** Qualifier of the <code>CardTypeRestriction.cardType</code> attribute **/
	public static final String CARDTYPE = "cardType";
	/** Qualifier of the <code>CardTypeRestriction.bank</code> attribute **/
	public static final String BANK = "bank";
	/** Qualifier of the <code>CardTypeRestriction.included</code> attribute **/
	public static final String INCLUDED = "included";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPromotionRestriction.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CREDITCARDTYPE, AttributeMode.INITIAL);
		tmp.put(CARDSUBTYPE, AttributeMode.INITIAL);
		tmp.put(CARDTYPE, AttributeMode.INITIAL);
		tmp.put(BANK, AttributeMode.INITIAL);
		tmp.put(INCLUDED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank(final SessionContext ctx)
	{
		return (Bank)getProperty( ctx, BANK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.bank</code> attribute.
	 * @return the bank
	 */
	public Bank getBank()
	{
		return getBank( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final SessionContext ctx, final Bank value)
	{
		setProperty(ctx, BANK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.bank</code> attribute. 
	 * @param value the bank
	 */
	public void setBank(final Bank value)
	{
		setBank( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.cardSubType</code> attribute.
	 * @return the cardSubType
	 */
	public EnumerationValue getCardSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARDSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.cardSubType</code> attribute.
	 * @return the cardSubType
	 */
	public EnumerationValue getCardSubType()
	{
		return getCardSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.cardSubType</code> attribute. 
	 * @param value the cardSubType
	 */
	public void setCardSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARDSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.cardSubType</code> attribute. 
	 * @param value the cardSubType
	 */
	public void setCardSubType(final EnumerationValue value)
	{
		setCardSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.cardType</code> attribute.
	 * @return the cardType
	 */
	public EnumerationValue getCardType()
	{
		return getCardType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.cardType</code> attribute. 
	 * @param value the cardType
	 */
	public void setCardType(final EnumerationValue value)
	{
		setCardType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.creditCardType</code> attribute.
	 * @return the creditCardType
	 */
	public EnumerationValue getCreditCardType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CREDITCARDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.creditCardType</code> attribute.
	 * @return the creditCardType
	 */
	public EnumerationValue getCreditCardType()
	{
		return getCreditCardType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.creditCardType</code> attribute. 
	 * @param value the creditCardType
	 */
	public void setCreditCardType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CREDITCARDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.creditCardType</code> attribute. 
	 * @param value the creditCardType
	 */
	public void setCreditCardType(final EnumerationValue value)
	{
		setCreditCardType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.included</code> attribute.
	 * @return the included
	 */
	public Boolean isIncluded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.included</code> attribute.
	 * @return the included
	 */
	public Boolean isIncluded()
	{
		return isIncluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.included</code> attribute. 
	 * @return the included
	 */
	public boolean isIncludedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncluded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CardTypeRestriction.included</code> attribute. 
	 * @return the included
	 */
	public boolean isIncludedAsPrimitive()
	{
		return isIncludedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.included</code> attribute. 
	 * @param value the included
	 */
	public void setIncluded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.included</code> attribute. 
	 * @param value the included
	 */
	public void setIncluded(final Boolean value)
	{
		setIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.included</code> attribute. 
	 * @param value the included
	 */
	public void setIncluded(final SessionContext ctx, final boolean value)
	{
		setIncluded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CardTypeRestriction.included</code> attribute. 
	 * @param value the included
	 */
	public void setIncluded(final boolean value)
	{
		setIncluded( getSession().getSessionContext(), value );
	}
	
}
