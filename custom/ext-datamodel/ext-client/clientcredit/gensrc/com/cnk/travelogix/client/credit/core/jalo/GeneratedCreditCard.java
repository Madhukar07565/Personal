/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.core.jalo.BankInformation;
import com.cnk.travelogix.client.credit.core.jalo.ClientCreditDetails;
import com.cnk.travelogix.client.credit.core.jalo.CreditLimitInfo;
import com.cnk.travelogix.client.credit.core.jalo.ThresholdInformation;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.CreditCard CreditCard}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCreditCard extends GenericItem
{
	/** Qualifier of the <code>CreditCard.creditCardNumber</code> attribute **/
	public static final String CREDITCARDNUMBER = "creditCardNumber";
	/** Qualifier of the <code>CreditCard.cardholderName</code> attribute **/
	public static final String CARDHOLDERNAME = "cardholderName";
	/** Qualifier of the <code>CreditCard.ccExpiryDate</code> attribute **/
	public static final String CCEXPIRYDATE = "ccExpiryDate";
	/** Qualifier of the <code>CreditCard.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>CreditCard.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>CreditCard.bankInformation</code> attribute **/
	public static final String BANKINFORMATION = "bankInformation";
	/** Qualifier of the <code>CreditCard.thresholdInfo</code> attribute **/
	public static final String THRESHOLDINFO = "thresholdInfo";
	/** Qualifier of the <code>CreditCard.creditLimitInfo</code> attribute **/
	public static final String CREDITLIMITINFO = "creditLimitInfo";
	/** Qualifier of the <code>CreditCard.clientCreditDetails</code> attribute **/
	public static final String CLIENTCREDITDETAILS = "clientCreditDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENTCREDITDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCreditCard> CLIENTCREDITDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedCreditCard>(
	ClientcreditConstants.TC.CREDITCARD,
	false,
	"clientCreditDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CREDITCARDNUMBER, AttributeMode.INITIAL);
		tmp.put(CARDHOLDERNAME, AttributeMode.INITIAL);
		tmp.put(CCEXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(BANKINFORMATION, AttributeMode.INITIAL);
		tmp.put(THRESHOLDINFO, AttributeMode.INITIAL);
		tmp.put(CREDITLIMITINFO, AttributeMode.INITIAL);
		tmp.put(CLIENTCREDITDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.bankInformation</code> attribute.
	 * @return the bankInformation - Bank Information
	 */
	public BankInformation getBankInformation(final SessionContext ctx)
	{
		return (BankInformation)getProperty( ctx, BANKINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.bankInformation</code> attribute.
	 * @return the bankInformation - Bank Information
	 */
	public BankInformation getBankInformation()
	{
		return getBankInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.bankInformation</code> attribute. 
	 * @param value the bankInformation - Bank Information
	 */
	public void setBankInformation(final SessionContext ctx, final BankInformation value)
	{
		setProperty(ctx, BANKINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.bankInformation</code> attribute. 
	 * @param value the bankInformation - Bank Information
	 */
	public void setBankInformation(final BankInformation value)
	{
		setBankInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.cardholderName</code> attribute.
	 * @return the cardholderName - CardHolderName
	 */
	public String getCardholderName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CARDHOLDERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.cardholderName</code> attribute.
	 * @return the cardholderName - CardHolderName
	 */
	public String getCardholderName()
	{
		return getCardholderName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.cardholderName</code> attribute. 
	 * @param value the cardholderName - CardHolderName
	 */
	public void setCardholderName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CARDHOLDERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.cardholderName</code> attribute. 
	 * @param value the cardholderName - CardHolderName
	 */
	public void setCardholderName(final String value)
	{
		setCardholderName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.ccExpiryDate</code> attribute.
	 * @return the ccExpiryDate - CCExpiryDate
	 */
	public Date getCcExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CCEXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.ccExpiryDate</code> attribute.
	 * @return the ccExpiryDate - CCExpiryDate
	 */
	public Date getCcExpiryDate()
	{
		return getCcExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.ccExpiryDate</code> attribute. 
	 * @param value the ccExpiryDate - CCExpiryDate
	 */
	public void setCcExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CCEXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.ccExpiryDate</code> attribute. 
	 * @param value the ccExpiryDate - CCExpiryDate
	 */
	public void setCcExpiryDate(final Date value)
	{
		setCcExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails(final SessionContext ctx)
	{
		return (ClientCreditDetails)getProperty( ctx, CLIENTCREDITDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails()
	{
		return getClientCreditDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final SessionContext ctx, final ClientCreditDetails value)
	{
		CLIENTCREDITDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final ClientCreditDetails value)
	{
		setClientCreditDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.continent</code> attribute.
	 * @return the continent - Continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.continent</code> attribute.
	 * @return the continent - Continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.continent</code> attribute. 
	 * @param value the continent - Continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.continent</code> attribute. 
	 * @param value the continent - Continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTCREDITDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.creditCardNumber</code> attribute.
	 * @return the creditCardNumber - CreditCardNumber
	 */
	public String getCreditCardNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREDITCARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.creditCardNumber</code> attribute.
	 * @return the creditCardNumber - CreditCardNumber
	 */
	public String getCreditCardNumber()
	{
		return getCreditCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.creditCardNumber</code> attribute. 
	 * @param value the creditCardNumber - CreditCardNumber
	 */
	public void setCreditCardNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREDITCARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.creditCardNumber</code> attribute. 
	 * @param value the creditCardNumber - CreditCardNumber
	 */
	public void setCreditCardNumber(final String value)
	{
		setCreditCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.creditLimitInfo</code> attribute.
	 * @return the creditLimitInfo - Credit LimitInfo
	 */
	public CreditLimitInfo getCreditLimitInfo(final SessionContext ctx)
	{
		return (CreditLimitInfo)getProperty( ctx, CREDITLIMITINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.creditLimitInfo</code> attribute.
	 * @return the creditLimitInfo - Credit LimitInfo
	 */
	public CreditLimitInfo getCreditLimitInfo()
	{
		return getCreditLimitInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.creditLimitInfo</code> attribute. 
	 * @param value the creditLimitInfo - Credit LimitInfo
	 */
	public void setCreditLimitInfo(final SessionContext ctx, final CreditLimitInfo value)
	{
		setProperty(ctx, CREDITLIMITINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.creditLimitInfo</code> attribute. 
	 * @param value the creditLimitInfo - Credit LimitInfo
	 */
	public void setCreditLimitInfo(final CreditLimitInfo value)
	{
		setCreditLimitInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.thresholdInfo</code> attribute.
	 * @return the thresholdInfo - Threshold Information
	 */
	public ThresholdInformation getThresholdInfo(final SessionContext ctx)
	{
		return (ThresholdInformation)getProperty( ctx, THRESHOLDINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CreditCard.thresholdInfo</code> attribute.
	 * @return the thresholdInfo - Threshold Information
	 */
	public ThresholdInformation getThresholdInfo()
	{
		return getThresholdInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.thresholdInfo</code> attribute. 
	 * @param value the thresholdInfo - Threshold Information
	 */
	public void setThresholdInfo(final SessionContext ctx, final ThresholdInformation value)
	{
		setProperty(ctx, THRESHOLDINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CreditCard.thresholdInfo</code> attribute. 
	 * @param value the thresholdInfo - Threshold Information
	 */
	public void setThresholdInfo(final ThresholdInformation value)
	{
		setThresholdInfo( getSession().getSessionContext(), value );
	}
	
}
