/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyBankDetails;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.companyoffer.jalo.RedemptionCompanyOffers;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.OfferEligibilityCondition OfferEligibilityCondition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOfferEligibilityCondition extends GenericItem
{
	/** Qualifier of the <code>OfferEligibilityCondition.eligibilityCondition</code> attribute **/
	public static final String ELIGIBILITYCONDITION = "eligibilityCondition";
	/** Qualifier of the <code>OfferEligibilityCondition.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>OfferEligibilityCondition.noOfTimes</code> attribute **/
	public static final String NOOFTIMES = "noOfTimes";
	/** Qualifier of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute **/
	public static final String NOOFTRANSACTIONS = "noOfTransactions";
	/** Qualifier of the <code>OfferEligibilityCondition.maximumNo</code> attribute **/
	public static final String MAXIMUMNO = "maximumNo";
	/** Qualifier of the <code>OfferEligibilityCondition.minimumNo</code> attribute **/
	public static final String MINIMUMNO = "minimumNo";
	/** Qualifier of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute **/
	public static final String NOOFPASSENGERS = "noOfPassengers";
	/** Qualifier of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute **/
	public static final String EVERYNTHPERSON = "everyNthPerson";
	/** Qualifier of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute **/
	public static final String NOOFLASTDIGIT = "noOfLastDigit";
	/** Qualifier of the <code>OfferEligibilityCondition.endingNumber</code> attribute **/
	public static final String ENDINGNUMBER = "endingNumber";
	/** Qualifier of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute **/
	public static final String DIGITOFCREDITCARDNUMBER = "digitOfCreditCardNumber";
	/** Qualifier of the <code>OfferEligibilityCondition.minimumAge</code> attribute **/
	public static final String MINIMUMAGE = "minimumAge";
	/** Qualifier of the <code>OfferEligibilityCondition.maximumAge</code> attribute **/
	public static final String MAXIMUMAGE = "maximumAge";
	/** Qualifier of the <code>OfferEligibilityCondition.ageFrom</code> attribute **/
	public static final String AGEFROM = "ageFrom";
	/** Qualifier of the <code>OfferEligibilityCondition.ageTo</code> attribute **/
	public static final String AGETO = "ageTo";
	/** Qualifier of the <code>OfferEligibilityCondition.fromDate</code> attribute **/
	public static final String FROMDATE = "fromDate";
	/** Qualifier of the <code>OfferEligibilityCondition.toDate</code> attribute **/
	public static final String TODATE = "toDate";
	/** Qualifier of the <code>OfferEligibilityCondition.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>OfferEligibilityCondition.bankDetails</code> attribute **/
	public static final String BANKDETAILS = "bankDetails";
	/** Qualifier of the <code>OfferEligibilityCondition.greaterThan</code> attribute **/
	public static final String GREATERTHAN = "greaterThan";
	/** Qualifier of the <code>OfferEligibilityCondition.equalTo</code> attribute **/
	public static final String EQUALTO = "equalTo";
	/** Qualifier of the <code>OfferEligibilityCondition.companyOfferEligibilityCondition</code> attribute **/
	public static final String COMPANYOFFERELIGIBILITYCONDITION = "companyOfferEligibilityCondition";
	/** Qualifier of the <code>OfferEligibilityCondition.redempCompOffersligibilityCondition</code> attribute **/
	public static final String REDEMPCOMPOFFERSLIGIBILITYCONDITION = "redempCompOffersligibilityCondition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANYOFFERELIGIBILITYCONDITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOfferEligibilityCondition> COMPANYOFFERELIGIBILITYCONDITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedOfferEligibilityCondition>(
	ClientcoreConstants.TC.OFFERELIGIBILITYCONDITION,
	false,
	"companyOfferEligibilityCondition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n REDEMPCOMPOFFERSLIGIBILITYCONDITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOfferEligibilityCondition> REDEMPCOMPOFFERSLIGIBILITYCONDITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedOfferEligibilityCondition>(
	ClientcoreConstants.TC.OFFERELIGIBILITYCONDITION,
	false,
	"redempCompOffersligibilityCondition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ELIGIBILITYCONDITION, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(NOOFTIMES, AttributeMode.INITIAL);
		tmp.put(NOOFTRANSACTIONS, AttributeMode.INITIAL);
		tmp.put(MAXIMUMNO, AttributeMode.INITIAL);
		tmp.put(MINIMUMNO, AttributeMode.INITIAL);
		tmp.put(NOOFPASSENGERS, AttributeMode.INITIAL);
		tmp.put(EVERYNTHPERSON, AttributeMode.INITIAL);
		tmp.put(NOOFLASTDIGIT, AttributeMode.INITIAL);
		tmp.put(ENDINGNUMBER, AttributeMode.INITIAL);
		tmp.put(DIGITOFCREDITCARDNUMBER, AttributeMode.INITIAL);
		tmp.put(MINIMUMAGE, AttributeMode.INITIAL);
		tmp.put(MAXIMUMAGE, AttributeMode.INITIAL);
		tmp.put(AGEFROM, AttributeMode.INITIAL);
		tmp.put(AGETO, AttributeMode.INITIAL);
		tmp.put(FROMDATE, AttributeMode.INITIAL);
		tmp.put(TODATE, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(BANKDETAILS, AttributeMode.INITIAL);
		tmp.put(GREATERTHAN, AttributeMode.INITIAL);
		tmp.put(EQUALTO, AttributeMode.INITIAL);
		tmp.put(COMPANYOFFERELIGIBILITYCONDITION, AttributeMode.INITIAL);
		tmp.put(REDEMPCOMPOFFERSLIGIBILITYCONDITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.ageFrom</code> attribute.
	 * @return the ageFrom
	 */
	public Integer getAgeFrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.ageFrom</code> attribute.
	 * @return the ageFrom
	 */
	public Integer getAgeFrom()
	{
		return getAgeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.ageFrom</code> attribute. 
	 * @return the ageFrom
	 */
	public int getAgeFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAgeFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.ageFrom</code> attribute. 
	 * @return the ageFrom
	 */
	public int getAgeFromAsPrimitive()
	{
		return getAgeFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAgeFrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAgeFrom(final Integer value)
	{
		setAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAgeFrom(final SessionContext ctx, final int value)
	{
		setAgeFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAgeFrom(final int value)
	{
		setAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.ageTo</code> attribute.
	 * @return the ageTo
	 */
	public Integer getAgeTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.ageTo</code> attribute.
	 * @return the ageTo
	 */
	public Integer getAgeTo()
	{
		return getAgeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.ageTo</code> attribute. 
	 * @return the ageTo
	 */
	public int getAgeToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAgeTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.ageTo</code> attribute. 
	 * @return the ageTo
	 */
	public int getAgeToAsPrimitive()
	{
		return getAgeToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAgeTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAgeTo(final Integer value)
	{
		setAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAgeTo(final SessionContext ctx, final int value)
	{
		setAgeTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAgeTo(final int value)
	{
		setAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.bankDetails</code> attribute.
	 * @return the bankDetails
	 */
	public CompanyBankDetails getBankDetails(final SessionContext ctx)
	{
		return (CompanyBankDetails)getProperty( ctx, BANKDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.bankDetails</code> attribute.
	 * @return the bankDetails
	 */
	public CompanyBankDetails getBankDetails()
	{
		return getBankDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.bankDetails</code> attribute. 
	 * @param value the bankDetails
	 */
	public void setBankDetails(final SessionContext ctx, final CompanyBankDetails value)
	{
		setProperty(ctx, BANKDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.bankDetails</code> attribute. 
	 * @param value the bankDetails
	 */
	public void setBankDetails(final CompanyBankDetails value)
	{
		setBankDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.companyOfferEligibilityCondition</code> attribute.
	 * @return the companyOfferEligibilityCondition
	 */
	public CompanyOffers getCompanyOfferEligibilityCondition(final SessionContext ctx)
	{
		return (CompanyOffers)getProperty( ctx, COMPANYOFFERELIGIBILITYCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.companyOfferEligibilityCondition</code> attribute.
	 * @return the companyOfferEligibilityCondition
	 */
	public CompanyOffers getCompanyOfferEligibilityCondition()
	{
		return getCompanyOfferEligibilityCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.companyOfferEligibilityCondition</code> attribute. 
	 * @param value the companyOfferEligibilityCondition
	 */
	public void setCompanyOfferEligibilityCondition(final SessionContext ctx, final CompanyOffers value)
	{
		COMPANYOFFERELIGIBILITYCONDITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.companyOfferEligibilityCondition</code> attribute. 
	 * @param value the companyOfferEligibilityCondition
	 */
	public void setCompanyOfferEligibilityCondition(final CompanyOffers value)
	{
		setCompanyOfferEligibilityCondition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANYOFFERELIGIBILITYCONDITIONHANDLER.newInstance(ctx, allAttributes);
		REDEMPCOMPOFFERSLIGIBILITYCONDITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute.
	 * @return the digitOfCreditCardNumber
	 */
	public Integer getDigitOfCreditCardNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DIGITOFCREDITCARDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute.
	 * @return the digitOfCreditCardNumber
	 */
	public Integer getDigitOfCreditCardNumber()
	{
		return getDigitOfCreditCardNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute. 
	 * @return the digitOfCreditCardNumber
	 */
	public int getDigitOfCreditCardNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDigitOfCreditCardNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute. 
	 * @return the digitOfCreditCardNumber
	 */
	public int getDigitOfCreditCardNumberAsPrimitive()
	{
		return getDigitOfCreditCardNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute. 
	 * @param value the digitOfCreditCardNumber
	 */
	public void setDigitOfCreditCardNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DIGITOFCREDITCARDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute. 
	 * @param value the digitOfCreditCardNumber
	 */
	public void setDigitOfCreditCardNumber(final Integer value)
	{
		setDigitOfCreditCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute. 
	 * @param value the digitOfCreditCardNumber
	 */
	public void setDigitOfCreditCardNumber(final SessionContext ctx, final int value)
	{
		setDigitOfCreditCardNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.digitOfCreditCardNumber</code> attribute. 
	 * @param value the digitOfCreditCardNumber
	 */
	public void setDigitOfCreditCardNumber(final int value)
	{
		setDigitOfCreditCardNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.eligibilityCondition</code> attribute.
	 * @return the eligibilityCondition
	 */
	public EnumerationValue getEligibilityCondition(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ELIGIBILITYCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.eligibilityCondition</code> attribute.
	 * @return the eligibilityCondition
	 */
	public EnumerationValue getEligibilityCondition()
	{
		return getEligibilityCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.eligibilityCondition</code> attribute. 
	 * @param value the eligibilityCondition
	 */
	public void setEligibilityCondition(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ELIGIBILITYCONDITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.eligibilityCondition</code> attribute. 
	 * @param value the eligibilityCondition
	 */
	public void setEligibilityCondition(final EnumerationValue value)
	{
		setEligibilityCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.endingNumber</code> attribute.
	 * @return the endingNumber
	 */
	public Integer getEndingNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ENDINGNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.endingNumber</code> attribute.
	 * @return the endingNumber
	 */
	public Integer getEndingNumber()
	{
		return getEndingNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.endingNumber</code> attribute. 
	 * @return the endingNumber
	 */
	public int getEndingNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEndingNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.endingNumber</code> attribute. 
	 * @return the endingNumber
	 */
	public int getEndingNumberAsPrimitive()
	{
		return getEndingNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.endingNumber</code> attribute. 
	 * @param value the endingNumber
	 */
	public void setEndingNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ENDINGNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.endingNumber</code> attribute. 
	 * @param value the endingNumber
	 */
	public void setEndingNumber(final Integer value)
	{
		setEndingNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.endingNumber</code> attribute. 
	 * @param value the endingNumber
	 */
	public void setEndingNumber(final SessionContext ctx, final int value)
	{
		setEndingNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.endingNumber</code> attribute. 
	 * @param value the endingNumber
	 */
	public void setEndingNumber(final int value)
	{
		setEndingNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.equalTo</code> attribute.
	 * @return the equalTo
	 */
	public Boolean isEqualTo(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EQUALTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.equalTo</code> attribute.
	 * @return the equalTo
	 */
	public Boolean isEqualTo()
	{
		return isEqualTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.equalTo</code> attribute. 
	 * @return the equalTo
	 */
	public boolean isEqualToAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEqualTo( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.equalTo</code> attribute. 
	 * @return the equalTo
	 */
	public boolean isEqualToAsPrimitive()
	{
		return isEqualToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.equalTo</code> attribute. 
	 * @param value the equalTo
	 */
	public void setEqualTo(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EQUALTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.equalTo</code> attribute. 
	 * @param value the equalTo
	 */
	public void setEqualTo(final Boolean value)
	{
		setEqualTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.equalTo</code> attribute. 
	 * @param value the equalTo
	 */
	public void setEqualTo(final SessionContext ctx, final boolean value)
	{
		setEqualTo( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.equalTo</code> attribute. 
	 * @param value the equalTo
	 */
	public void setEqualTo(final boolean value)
	{
		setEqualTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute.
	 * @return the everyNthPerson
	 */
	public Integer getEveryNthPerson(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EVERYNTHPERSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute.
	 * @return the everyNthPerson
	 */
	public Integer getEveryNthPerson()
	{
		return getEveryNthPerson( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute. 
	 * @return the everyNthPerson
	 */
	public int getEveryNthPersonAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEveryNthPerson( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute. 
	 * @return the everyNthPerson
	 */
	public int getEveryNthPersonAsPrimitive()
	{
		return getEveryNthPersonAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute. 
	 * @param value the everyNthPerson
	 */
	public void setEveryNthPerson(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EVERYNTHPERSON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute. 
	 * @param value the everyNthPerson
	 */
	public void setEveryNthPerson(final Integer value)
	{
		setEveryNthPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute. 
	 * @param value the everyNthPerson
	 */
	public void setEveryNthPerson(final SessionContext ctx, final int value)
	{
		setEveryNthPerson( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.everyNthPerson</code> attribute. 
	 * @param value the everyNthPerson
	 */
	public void setEveryNthPerson(final int value)
	{
		setEveryNthPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.fromDate</code> attribute.
	 * @return the fromDate
	 */
	public Date getFromDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FROMDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.fromDate</code> attribute.
	 * @return the fromDate
	 */
	public Date getFromDate()
	{
		return getFromDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.fromDate</code> attribute. 
	 * @param value the fromDate
	 */
	public void setFromDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FROMDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.fromDate</code> attribute. 
	 * @param value the fromDate
	 */
	public void setFromDate(final Date value)
	{
		setFromDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.gender</code> attribute.
	 * @return the gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.gender</code> attribute. 
	 * @param value the gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.greaterThan</code> attribute.
	 * @return the greaterThan
	 */
	public Boolean isGreaterThan(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, GREATERTHAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.greaterThan</code> attribute.
	 * @return the greaterThan
	 */
	public Boolean isGreaterThan()
	{
		return isGreaterThan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.greaterThan</code> attribute. 
	 * @return the greaterThan
	 */
	public boolean isGreaterThanAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isGreaterThan( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.greaterThan</code> attribute. 
	 * @return the greaterThan
	 */
	public boolean isGreaterThanAsPrimitive()
	{
		return isGreaterThanAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.greaterThan</code> attribute. 
	 * @param value the greaterThan
	 */
	public void setGreaterThan(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, GREATERTHAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.greaterThan</code> attribute. 
	 * @param value the greaterThan
	 */
	public void setGreaterThan(final Boolean value)
	{
		setGreaterThan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.greaterThan</code> attribute. 
	 * @param value the greaterThan
	 */
	public void setGreaterThan(final SessionContext ctx, final boolean value)
	{
		setGreaterThan( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.greaterThan</code> attribute. 
	 * @param value the greaterThan
	 */
	public void setGreaterThan(final boolean value)
	{
		setGreaterThan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.maximumAge</code> attribute.
	 * @return the maximumAge
	 */
	public Integer getMaximumAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXIMUMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.maximumAge</code> attribute.
	 * @return the maximumAge
	 */
	public Integer getMaximumAge()
	{
		return getMaximumAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.maximumAge</code> attribute. 
	 * @return the maximumAge
	 */
	public int getMaximumAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaximumAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.maximumAge</code> attribute. 
	 * @return the maximumAge
	 */
	public int getMaximumAgeAsPrimitive()
	{
		return getMaximumAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.maximumAge</code> attribute. 
	 * @param value the maximumAge
	 */
	public void setMaximumAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXIMUMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.maximumAge</code> attribute. 
	 * @param value the maximumAge
	 */
	public void setMaximumAge(final Integer value)
	{
		setMaximumAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.maximumAge</code> attribute. 
	 * @param value the maximumAge
	 */
	public void setMaximumAge(final SessionContext ctx, final int value)
	{
		setMaximumAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.maximumAge</code> attribute. 
	 * @param value the maximumAge
	 */
	public void setMaximumAge(final int value)
	{
		setMaximumAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.maximumNo</code> attribute.
	 * @return the maximumNo
	 */
	public Integer getMaximumNo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXIMUMNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.maximumNo</code> attribute.
	 * @return the maximumNo
	 */
	public Integer getMaximumNo()
	{
		return getMaximumNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.maximumNo</code> attribute. 
	 * @return the maximumNo
	 */
	public int getMaximumNoAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaximumNo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.maximumNo</code> attribute. 
	 * @return the maximumNo
	 */
	public int getMaximumNoAsPrimitive()
	{
		return getMaximumNoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.maximumNo</code> attribute. 
	 * @param value the maximumNo
	 */
	public void setMaximumNo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXIMUMNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.maximumNo</code> attribute. 
	 * @param value the maximumNo
	 */
	public void setMaximumNo(final Integer value)
	{
		setMaximumNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.maximumNo</code> attribute. 
	 * @param value the maximumNo
	 */
	public void setMaximumNo(final SessionContext ctx, final int value)
	{
		setMaximumNo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.maximumNo</code> attribute. 
	 * @param value the maximumNo
	 */
	public void setMaximumNo(final int value)
	{
		setMaximumNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.minimumAge</code> attribute.
	 * @return the minimumAge
	 */
	public Integer getMinimumAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINIMUMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.minimumAge</code> attribute.
	 * @return the minimumAge
	 */
	public Integer getMinimumAge()
	{
		return getMinimumAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.minimumAge</code> attribute. 
	 * @return the minimumAge
	 */
	public int getMinimumAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.minimumAge</code> attribute. 
	 * @return the minimumAge
	 */
	public int getMinimumAgeAsPrimitive()
	{
		return getMinimumAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.minimumAge</code> attribute. 
	 * @param value the minimumAge
	 */
	public void setMinimumAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINIMUMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.minimumAge</code> attribute. 
	 * @param value the minimumAge
	 */
	public void setMinimumAge(final Integer value)
	{
		setMinimumAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.minimumAge</code> attribute. 
	 * @param value the minimumAge
	 */
	public void setMinimumAge(final SessionContext ctx, final int value)
	{
		setMinimumAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.minimumAge</code> attribute. 
	 * @param value the minimumAge
	 */
	public void setMinimumAge(final int value)
	{
		setMinimumAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.minimumNo</code> attribute.
	 * @return the minimumNo
	 */
	public Integer getMinimumNo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINIMUMNO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.minimumNo</code> attribute.
	 * @return the minimumNo
	 */
	public Integer getMinimumNo()
	{
		return getMinimumNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.minimumNo</code> attribute. 
	 * @return the minimumNo
	 */
	public int getMinimumNoAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumNo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.minimumNo</code> attribute. 
	 * @return the minimumNo
	 */
	public int getMinimumNoAsPrimitive()
	{
		return getMinimumNoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.minimumNo</code> attribute. 
	 * @param value the minimumNo
	 */
	public void setMinimumNo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINIMUMNO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.minimumNo</code> attribute. 
	 * @param value the minimumNo
	 */
	public void setMinimumNo(final Integer value)
	{
		setMinimumNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.minimumNo</code> attribute. 
	 * @param value the minimumNo
	 */
	public void setMinimumNo(final SessionContext ctx, final int value)
	{
		setMinimumNo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.minimumNo</code> attribute. 
	 * @param value the minimumNo
	 */
	public void setMinimumNo(final int value)
	{
		setMinimumNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute.
	 * @return the noOfLastDigit
	 */
	public Integer getNoOfLastDigit(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFLASTDIGIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute.
	 * @return the noOfLastDigit
	 */
	public Integer getNoOfLastDigit()
	{
		return getNoOfLastDigit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute. 
	 * @return the noOfLastDigit
	 */
	public int getNoOfLastDigitAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfLastDigit( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute. 
	 * @return the noOfLastDigit
	 */
	public int getNoOfLastDigitAsPrimitive()
	{
		return getNoOfLastDigitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute. 
	 * @param value the noOfLastDigit
	 */
	public void setNoOfLastDigit(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFLASTDIGIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute. 
	 * @param value the noOfLastDigit
	 */
	public void setNoOfLastDigit(final Integer value)
	{
		setNoOfLastDigit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute. 
	 * @param value the noOfLastDigit
	 */
	public void setNoOfLastDigit(final SessionContext ctx, final int value)
	{
		setNoOfLastDigit( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfLastDigit</code> attribute. 
	 * @param value the noOfLastDigit
	 */
	public void setNoOfLastDigit(final int value)
	{
		setNoOfLastDigit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute.
	 * @return the noOfPassengers
	 */
	public Integer getNoOfPassengers(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFPASSENGERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute.
	 * @return the noOfPassengers
	 */
	public Integer getNoOfPassengers()
	{
		return getNoOfPassengers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute. 
	 * @return the noOfPassengers
	 */
	public int getNoOfPassengersAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfPassengers( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute. 
	 * @return the noOfPassengers
	 */
	public int getNoOfPassengersAsPrimitive()
	{
		return getNoOfPassengersAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute. 
	 * @param value the noOfPassengers
	 */
	public void setNoOfPassengers(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFPASSENGERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute. 
	 * @param value the noOfPassengers
	 */
	public void setNoOfPassengers(final Integer value)
	{
		setNoOfPassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute. 
	 * @param value the noOfPassengers
	 */
	public void setNoOfPassengers(final SessionContext ctx, final int value)
	{
		setNoOfPassengers( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfPassengers</code> attribute. 
	 * @param value the noOfPassengers
	 */
	public void setNoOfPassengers(final int value)
	{
		setNoOfPassengers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfTimes</code> attribute.
	 * @return the noOfTimes
	 */
	public Integer getNoOfTimes(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFTIMES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfTimes</code> attribute.
	 * @return the noOfTimes
	 */
	public Integer getNoOfTimes()
	{
		return getNoOfTimes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfTimes</code> attribute. 
	 * @return the noOfTimes
	 */
	public int getNoOfTimesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfTimes( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfTimes</code> attribute. 
	 * @return the noOfTimes
	 */
	public int getNoOfTimesAsPrimitive()
	{
		return getNoOfTimesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfTimes</code> attribute. 
	 * @param value the noOfTimes
	 */
	public void setNoOfTimes(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFTIMES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfTimes</code> attribute. 
	 * @param value the noOfTimes
	 */
	public void setNoOfTimes(final Integer value)
	{
		setNoOfTimes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfTimes</code> attribute. 
	 * @param value the noOfTimes
	 */
	public void setNoOfTimes(final SessionContext ctx, final int value)
	{
		setNoOfTimes( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfTimes</code> attribute. 
	 * @param value the noOfTimes
	 */
	public void setNoOfTimes(final int value)
	{
		setNoOfTimes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute.
	 * @return the noOfTransactions
	 */
	public Integer getNoOfTransactions(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFTRANSACTIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute.
	 * @return the noOfTransactions
	 */
	public Integer getNoOfTransactions()
	{
		return getNoOfTransactions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute. 
	 * @return the noOfTransactions
	 */
	public int getNoOfTransactionsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfTransactions( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute. 
	 * @return the noOfTransactions
	 */
	public int getNoOfTransactionsAsPrimitive()
	{
		return getNoOfTransactionsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute. 
	 * @param value the noOfTransactions
	 */
	public void setNoOfTransactions(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFTRANSACTIONS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute. 
	 * @param value the noOfTransactions
	 */
	public void setNoOfTransactions(final Integer value)
	{
		setNoOfTransactions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute. 
	 * @param value the noOfTransactions
	 */
	public void setNoOfTransactions(final SessionContext ctx, final int value)
	{
		setNoOfTransactions( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.noOfTransactions</code> attribute. 
	 * @param value the noOfTransactions
	 */
	public void setNoOfTransactions(final int value)
	{
		setNoOfTransactions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.redempCompOffersligibilityCondition</code> attribute.
	 * @return the redempCompOffersligibilityCondition
	 */
	public RedemptionCompanyOffers getRedempCompOffersligibilityCondition(final SessionContext ctx)
	{
		return (RedemptionCompanyOffers)getProperty( ctx, REDEMPCOMPOFFERSLIGIBILITYCONDITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.redempCompOffersligibilityCondition</code> attribute.
	 * @return the redempCompOffersligibilityCondition
	 */
	public RedemptionCompanyOffers getRedempCompOffersligibilityCondition()
	{
		return getRedempCompOffersligibilityCondition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.redempCompOffersligibilityCondition</code> attribute. 
	 * @param value the redempCompOffersligibilityCondition
	 */
	public void setRedempCompOffersligibilityCondition(final SessionContext ctx, final RedemptionCompanyOffers value)
	{
		REDEMPCOMPOFFERSLIGIBILITYCONDITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.redempCompOffersligibilityCondition</code> attribute. 
	 * @param value the redempCompOffersligibilityCondition
	 */
	public void setRedempCompOffersligibilityCondition(final RedemptionCompanyOffers value)
	{
		setRedempCompOffersligibilityCondition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.toDate</code> attribute.
	 * @return the toDate
	 */
	public Date getToDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferEligibilityCondition.toDate</code> attribute.
	 * @return the toDate
	 */
	public Date getToDate()
	{
		return getToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.toDate</code> attribute. 
	 * @param value the toDate
	 */
	public void setToDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferEligibilityCondition.toDate</code> attribute. 
	 * @param value the toDate
	 */
	public void setToDate(final Date value)
	{
		setToDate( getSession().getSessionContext(), value );
	}
	
}
