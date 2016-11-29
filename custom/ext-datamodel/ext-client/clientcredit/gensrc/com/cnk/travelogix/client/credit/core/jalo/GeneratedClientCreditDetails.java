/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.core.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.core.jalo.BankGuarantee;
import com.cnk.travelogix.client.credit.core.jalo.Barter;
import com.cnk.travelogix.client.credit.core.jalo.CreditCard;
import com.cnk.travelogix.client.credit.core.jalo.ProductInformationforCredit;
import com.cnk.travelogix.client.credit.core.jalo.SecurityDeposit;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.core.jalo.ClientCreditDetails ClientCreditDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientCreditDetails extends GenericItem
{
	/** Qualifier of the <code>ClientCreditDetails.clientTransactionOn</code> attribute **/
	public static final String CLIENTTRANSACTIONON = "clientTransactionOn";
	/** Qualifier of the <code>ClientCreditDetails.creditType</code> attribute **/
	public static final String CREDITTYPE = "creditType";
	/** Qualifier of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute **/
	public static final String ISLIMITEDUNSECUREDCREDIT = "isLimitedUnsecuredCredit";
	/** Qualifier of the <code>ClientCreditDetails.modeOfSecurity</code> attribute **/
	public static final String MODEOFSECURITY = "modeOfSecurity";
	/** Qualifier of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute **/
	public static final String ISCREDITLIMITBYBRANCHORPRODUCT = "isCreditLimitBybranchOrProduct";
	/** Qualifier of the <code>ClientCreditDetails.barter</code> attribute **/
	public static final String BARTER = "barter";
	/** Qualifier of the <code>ClientCreditDetails.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>ClientCreditDetails.clientCreditMedia</code> attribute **/
	public static final String CLIENTCREDITMEDIA = "clientCreditMedia";
	/** Qualifier of the <code>ClientCreditDetails.bankGuaranteeInfo</code> attribute **/
	public static final String BANKGUARANTEEINFO = "bankGuaranteeInfo";
	/** Qualifier of the <code>ClientCreditDetails.securityDeposit</code> attribute **/
	public static final String SECURITYDEPOSIT = "securityDeposit";
	/** Qualifier of the <code>ClientCreditDetails.productInfo</code> attribute **/
	public static final String PRODUCTINFO = "productInfo";
	/** Qualifier of the <code>ClientCreditDetails.creditCardInfo</code> attribute **/
	public static final String CREDITCARDINFO = "creditCardInfo";
	/**
	* {@link OneToManyHandler} for handling 1:n CLIENTCREDITMEDIA's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> CLIENTCREDITMEDIAHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	false,
	"clientCreditDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BANKGUARANTEEINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BankGuarantee> BANKGUARANTEEINFOHANDLER = new OneToManyHandler<BankGuarantee>(
	ClientcreditConstants.TC.BANKGUARANTEE,
	false,
	"clientCreditDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SECURITYDEPOSIT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SecurityDeposit> SECURITYDEPOSITHANDLER = new OneToManyHandler<SecurityDeposit>(
	ClientcreditConstants.TC.SECURITYDEPOSIT,
	false,
	"clientCreditDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductInformationforCredit> PRODUCTINFOHANDLER = new OneToManyHandler<ProductInformationforCredit>(
	ClientcreditConstants.TC.PRODUCTINFORMATIONFORCREDIT,
	false,
	"clientCreditDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CREDITCARDINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CreditCard> CREDITCARDINFOHANDLER = new OneToManyHandler<CreditCard>(
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
		tmp.put(CLIENTTRANSACTIONON, AttributeMode.INITIAL);
		tmp.put(CREDITTYPE, AttributeMode.INITIAL);
		tmp.put(ISLIMITEDUNSECUREDCREDIT, AttributeMode.INITIAL);
		tmp.put(MODEOFSECURITY, AttributeMode.INITIAL);
		tmp.put(ISCREDITLIMITBYBRANCHORPRODUCT, AttributeMode.INITIAL);
		tmp.put(BARTER, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.bankGuaranteeInfo</code> attribute.
	 * @return the bankGuaranteeInfo
	 */
	public Collection<BankGuarantee> getBankGuaranteeInfo(final SessionContext ctx)
	{
		return BANKGUARANTEEINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.bankGuaranteeInfo</code> attribute.
	 * @return the bankGuaranteeInfo
	 */
	public Collection<BankGuarantee> getBankGuaranteeInfo()
	{
		return getBankGuaranteeInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.bankGuaranteeInfo</code> attribute. 
	 * @param value the bankGuaranteeInfo
	 */
	public void setBankGuaranteeInfo(final SessionContext ctx, final Collection<BankGuarantee> value)
	{
		BANKGUARANTEEINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.bankGuaranteeInfo</code> attribute. 
	 * @param value the bankGuaranteeInfo
	 */
	public void setBankGuaranteeInfo(final Collection<BankGuarantee> value)
	{
		setBankGuaranteeInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankGuaranteeInfo. 
	 * @param value the item to add to bankGuaranteeInfo
	 */
	public void addToBankGuaranteeInfo(final SessionContext ctx, final BankGuarantee value)
	{
		BANKGUARANTEEINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankGuaranteeInfo. 
	 * @param value the item to add to bankGuaranteeInfo
	 */
	public void addToBankGuaranteeInfo(final BankGuarantee value)
	{
		addToBankGuaranteeInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankGuaranteeInfo. 
	 * @param value the item to remove from bankGuaranteeInfo
	 */
	public void removeFromBankGuaranteeInfo(final SessionContext ctx, final BankGuarantee value)
	{
		BANKGUARANTEEINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankGuaranteeInfo. 
	 * @param value the item to remove from bankGuaranteeInfo
	 */
	public void removeFromBankGuaranteeInfo(final BankGuarantee value)
	{
		removeFromBankGuaranteeInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.barter</code> attribute.
	 * @return the barter - Barter
	 */
	public Barter getBarter(final SessionContext ctx)
	{
		return (Barter)getProperty( ctx, BARTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.barter</code> attribute.
	 * @return the barter - Barter
	 */
	public Barter getBarter()
	{
		return getBarter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.barter</code> attribute. 
	 * @param value the barter - Barter
	 */
	public void setBarter(final SessionContext ctx, final Barter value)
	{
		setProperty(ctx, BARTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.barter</code> attribute. 
	 * @param value the barter - Barter
	 */
	public void setBarter(final Barter value)
	{
		setBarter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.clientCreditMedia</code> attribute.
	 * @return the clientCreditMedia
	 */
	public Collection<Media> getClientCreditMedia(final SessionContext ctx)
	{
		return CLIENTCREDITMEDIAHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.clientCreditMedia</code> attribute.
	 * @return the clientCreditMedia
	 */
	public Collection<Media> getClientCreditMedia()
	{
		return getClientCreditMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.clientCreditMedia</code> attribute. 
	 * @param value the clientCreditMedia
	 */
	public void setClientCreditMedia(final SessionContext ctx, final Collection<Media> value)
	{
		CLIENTCREDITMEDIAHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.clientCreditMedia</code> attribute. 
	 * @param value the clientCreditMedia
	 */
	public void setClientCreditMedia(final Collection<Media> value)
	{
		setClientCreditMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientCreditMedia. 
	 * @param value the item to add to clientCreditMedia
	 */
	public void addToClientCreditMedia(final SessionContext ctx, final Media value)
	{
		CLIENTCREDITMEDIAHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientCreditMedia. 
	 * @param value the item to add to clientCreditMedia
	 */
	public void addToClientCreditMedia(final Media value)
	{
		addToClientCreditMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientCreditMedia. 
	 * @param value the item to remove from clientCreditMedia
	 */
	public void removeFromClientCreditMedia(final SessionContext ctx, final Media value)
	{
		CLIENTCREDITMEDIAHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientCreditMedia. 
	 * @param value the item to remove from clientCreditMedia
	 */
	public void removeFromClientCreditMedia(final Media value)
	{
		removeFromClientCreditMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.clientTransactionOn</code> attribute.
	 * @return the clientTransactionOn - Client transaction of type credit
	 */
	public EnumerationValue getClientTransactionOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTRANSACTIONON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.clientTransactionOn</code> attribute.
	 * @return the clientTransactionOn - Client transaction of type credit
	 */
	public EnumerationValue getClientTransactionOn()
	{
		return getClientTransactionOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.clientTransactionOn</code> attribute. 
	 * @param value the clientTransactionOn - Client transaction of type credit
	 */
	public void setClientTransactionOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTRANSACTIONON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.clientTransactionOn</code> attribute. 
	 * @param value the clientTransactionOn - Client transaction of type credit
	 */
	public void setClientTransactionOn(final EnumerationValue value)
	{
		setClientTransactionOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.creditCardInfo</code> attribute.
	 * @return the creditCardInfo
	 */
	public Collection<CreditCard> getCreditCardInfo(final SessionContext ctx)
	{
		return CREDITCARDINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.creditCardInfo</code> attribute.
	 * @return the creditCardInfo
	 */
	public Collection<CreditCard> getCreditCardInfo()
	{
		return getCreditCardInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.creditCardInfo</code> attribute. 
	 * @param value the creditCardInfo
	 */
	public void setCreditCardInfo(final SessionContext ctx, final Collection<CreditCard> value)
	{
		CREDITCARDINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.creditCardInfo</code> attribute. 
	 * @param value the creditCardInfo
	 */
	public void setCreditCardInfo(final Collection<CreditCard> value)
	{
		setCreditCardInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to creditCardInfo. 
	 * @param value the item to add to creditCardInfo
	 */
	public void addToCreditCardInfo(final SessionContext ctx, final CreditCard value)
	{
		CREDITCARDINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to creditCardInfo. 
	 * @param value the item to add to creditCardInfo
	 */
	public void addToCreditCardInfo(final CreditCard value)
	{
		addToCreditCardInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from creditCardInfo. 
	 * @param value the item to remove from creditCardInfo
	 */
	public void removeFromCreditCardInfo(final SessionContext ctx, final CreditCard value)
	{
		CREDITCARDINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from creditCardInfo. 
	 * @param value the item to remove from creditCardInfo
	 */
	public void removeFromCreditCardInfo(final CreditCard value)
	{
		removeFromCreditCardInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.creditType</code> attribute.
	 * @return the creditType - Credit type
	 */
	public EnumerationValue getCreditType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CREDITTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.creditType</code> attribute.
	 * @return the creditType - Credit type
	 */
	public EnumerationValue getCreditType()
	{
		return getCreditType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.creditType</code> attribute. 
	 * @param value the creditType - Credit type
	 */
	public void setCreditType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CREDITTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.creditType</code> attribute. 
	 * @param value the creditType - Credit type
	 */
	public void setCreditType(final EnumerationValue value)
	{
		setCreditType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute.
	 * @return the isCreditLimitBybranchOrProduct - CreditLimitBybranch/Product
	 */
	public Boolean isIsCreditLimitBybranchOrProduct(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISCREDITLIMITBYBRANCHORPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute.
	 * @return the isCreditLimitBybranchOrProduct - CreditLimitBybranch/Product
	 */
	public Boolean isIsCreditLimitBybranchOrProduct()
	{
		return isIsCreditLimitBybranchOrProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute. 
	 * @return the isCreditLimitBybranchOrProduct - CreditLimitBybranch/Product
	 */
	public boolean isIsCreditLimitBybranchOrProductAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsCreditLimitBybranchOrProduct( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute. 
	 * @return the isCreditLimitBybranchOrProduct - CreditLimitBybranch/Product
	 */
	public boolean isIsCreditLimitBybranchOrProductAsPrimitive()
	{
		return isIsCreditLimitBybranchOrProductAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute. 
	 * @param value the isCreditLimitBybranchOrProduct - CreditLimitBybranch/Product
	 */
	public void setIsCreditLimitBybranchOrProduct(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISCREDITLIMITBYBRANCHORPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute. 
	 * @param value the isCreditLimitBybranchOrProduct - CreditLimitBybranch/Product
	 */
	public void setIsCreditLimitBybranchOrProduct(final Boolean value)
	{
		setIsCreditLimitBybranchOrProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute. 
	 * @param value the isCreditLimitBybranchOrProduct - CreditLimitBybranch/Product
	 */
	public void setIsCreditLimitBybranchOrProduct(final SessionContext ctx, final boolean value)
	{
		setIsCreditLimitBybranchOrProduct( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.isCreditLimitBybranchOrProduct</code> attribute. 
	 * @param value the isCreditLimitBybranchOrProduct - CreditLimitBybranch/Product
	 */
	public void setIsCreditLimitBybranchOrProduct(final boolean value)
	{
		setIsCreditLimitBybranchOrProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute.
	 * @return the isLimitedUnsecuredCredit - Unsecured Credit Card
	 */
	public Boolean isIsLimitedUnsecuredCredit(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISLIMITEDUNSECUREDCREDIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute.
	 * @return the isLimitedUnsecuredCredit - Unsecured Credit Card
	 */
	public Boolean isIsLimitedUnsecuredCredit()
	{
		return isIsLimitedUnsecuredCredit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute. 
	 * @return the isLimitedUnsecuredCredit - Unsecured Credit Card
	 */
	public boolean isIsLimitedUnsecuredCreditAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsLimitedUnsecuredCredit( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute. 
	 * @return the isLimitedUnsecuredCredit - Unsecured Credit Card
	 */
	public boolean isIsLimitedUnsecuredCreditAsPrimitive()
	{
		return isIsLimitedUnsecuredCreditAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute. 
	 * @param value the isLimitedUnsecuredCredit - Unsecured Credit Card
	 */
	public void setIsLimitedUnsecuredCredit(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISLIMITEDUNSECUREDCREDIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute. 
	 * @param value the isLimitedUnsecuredCredit - Unsecured Credit Card
	 */
	public void setIsLimitedUnsecuredCredit(final Boolean value)
	{
		setIsLimitedUnsecuredCredit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute. 
	 * @param value the isLimitedUnsecuredCredit - Unsecured Credit Card
	 */
	public void setIsLimitedUnsecuredCredit(final SessionContext ctx, final boolean value)
	{
		setIsLimitedUnsecuredCredit( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.isLimitedUnsecuredCredit</code> attribute. 
	 * @param value the isLimitedUnsecuredCredit - Unsecured Credit Card
	 */
	public void setIsLimitedUnsecuredCredit(final boolean value)
	{
		setIsLimitedUnsecuredCredit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity - ModeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFSECURITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.modeOfSecurity</code> attribute.
	 * @return the modeOfSecurity - ModeOfSecurity
	 */
	public EnumerationValue getModeOfSecurity()
	{
		return getModeOfSecurity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity - ModeOfSecurity
	 */
	public void setModeOfSecurity(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFSECURITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.modeOfSecurity</code> attribute. 
	 * @param value the modeOfSecurity - ModeOfSecurity
	 */
	public void setModeOfSecurity(final EnumerationValue value)
	{
		setModeOfSecurity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.productInfo</code> attribute.
	 * @return the productInfo
	 */
	public Collection<ProductInformationforCredit> getProductInfo(final SessionContext ctx)
	{
		return PRODUCTINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.productInfo</code> attribute.
	 * @return the productInfo
	 */
	public Collection<ProductInformationforCredit> getProductInfo()
	{
		return getProductInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.productInfo</code> attribute. 
	 * @param value the productInfo
	 */
	public void setProductInfo(final SessionContext ctx, final Collection<ProductInformationforCredit> value)
	{
		PRODUCTINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.productInfo</code> attribute. 
	 * @param value the productInfo
	 */
	public void setProductInfo(final Collection<ProductInformationforCredit> value)
	{
		setProductInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productInfo. 
	 * @param value the item to add to productInfo
	 */
	public void addToProductInfo(final SessionContext ctx, final ProductInformationforCredit value)
	{
		PRODUCTINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productInfo. 
	 * @param value the item to add to productInfo
	 */
	public void addToProductInfo(final ProductInformationforCredit value)
	{
		addToProductInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productInfo. 
	 * @param value the item to remove from productInfo
	 */
	public void removeFromProductInfo(final SessionContext ctx, final ProductInformationforCredit value)
	{
		PRODUCTINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productInfo. 
	 * @param value the item to remove from productInfo
	 */
	public void removeFromProductInfo(final ProductInformationforCredit value)
	{
		removeFromProductInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedClientCreditDetails.getRemark requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.remark</code> attribute.
	 * @return the remark - Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.remark</code> attribute. 
	 * @return the localized remark - Remark
	 */
	public Map<Language,String> getAllRemark(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REMARK,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.remark</code> attribute. 
	 * @return the localized remark - Remark
	 */
	public Map<Language,String> getAllRemark()
	{
		return getAllRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedClientCreditDetails.setRemark requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setAllRemark(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.remark</code> attribute. 
	 * @param value the remark - Remark
	 */
	public void setAllRemark(final Map<Language,String> value)
	{
		setAllRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.securityDeposit</code> attribute.
	 * @return the securityDeposit
	 */
	public Collection<SecurityDeposit> getSecurityDeposit(final SessionContext ctx)
	{
		return SECURITYDEPOSITHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDetails.securityDeposit</code> attribute.
	 * @return the securityDeposit
	 */
	public Collection<SecurityDeposit> getSecurityDeposit()
	{
		return getSecurityDeposit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.securityDeposit</code> attribute. 
	 * @param value the securityDeposit
	 */
	public void setSecurityDeposit(final SessionContext ctx, final Collection<SecurityDeposit> value)
	{
		SECURITYDEPOSITHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDetails.securityDeposit</code> attribute. 
	 * @param value the securityDeposit
	 */
	public void setSecurityDeposit(final Collection<SecurityDeposit> value)
	{
		setSecurityDeposit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to securityDeposit. 
	 * @param value the item to add to securityDeposit
	 */
	public void addToSecurityDeposit(final SessionContext ctx, final SecurityDeposit value)
	{
		SECURITYDEPOSITHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to securityDeposit. 
	 * @param value the item to add to securityDeposit
	 */
	public void addToSecurityDeposit(final SecurityDeposit value)
	{
		addToSecurityDeposit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from securityDeposit. 
	 * @param value the item to remove from securityDeposit
	 */
	public void removeFromSecurityDeposit(final SessionContext ctx, final SecurityDeposit value)
	{
		SECURITYDEPOSITHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from securityDeposit. 
	 * @param value the item to remove from securityDeposit
	 */
	public void removeFromSecurityDeposit(final SecurityDeposit value)
	{
		removeFromSecurityDeposit( getSession().getSessionContext(), value );
	}
	
}
