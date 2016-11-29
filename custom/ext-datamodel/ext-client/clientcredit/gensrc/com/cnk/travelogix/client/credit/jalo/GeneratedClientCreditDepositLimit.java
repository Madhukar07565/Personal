/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.credit.jalo.ClientCreditDepositLimit ClientCreditDepositLimit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientCreditDepositLimit extends GenericItem
{
	/** Qualifier of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute **/
	public static final String TRANSACTIONONCREDIT = "transactionOnCredit";
	/** Qualifier of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute **/
	public static final String TRANSACTIONONDEPOSIT = "transactionOnDeposit";
	/** Qualifier of the <code>ClientCreditDepositLimit.creditType</code> attribute **/
	public static final String CREDITTYPE = "creditType";
	/** Qualifier of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute **/
	public static final String LIMITBYBRANCHORPRODUCT = "limitByBranchOrProduct";
	/** Qualifier of the <code>ClientCreditDepositLimit.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>ClientCreditDepositLimit.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedClientCreditDepositLimit> CLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedClientCreditDepositLimit>(
	ClientcreditConstants.TC.CLIENTCREDITDEPOSITLIMIT,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
	"clientCreditDepositLimit",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TRANSACTIONONCREDIT, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONONDEPOSIT, AttributeMode.INITIAL);
		tmp.put(CREDITTYPE, AttributeMode.INITIAL);
		tmp.put(LIMITBYBRANCHORPRODUCT, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final Principal value)
	{
		CLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final Principal value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.creditType</code> attribute.
	 * @return the creditType
	 */
	public EnumerationValue getCreditType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CREDITTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.creditType</code> attribute.
	 * @return the creditType
	 */
	public EnumerationValue getCreditType()
	{
		return getCreditType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.creditType</code> attribute. 
	 * @param value the creditType
	 */
	public void setCreditType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CREDITTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.creditType</code> attribute. 
	 * @param value the creditType
	 */
	public void setCreditType(final EnumerationValue value)
	{
		setCreditType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute.
	 * @return the limitByBranchOrProduct
	 */
	public Boolean isLimitByBranchOrProduct(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, LIMITBYBRANCHORPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute.
	 * @return the limitByBranchOrProduct
	 */
	public Boolean isLimitByBranchOrProduct()
	{
		return isLimitByBranchOrProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute. 
	 * @return the limitByBranchOrProduct
	 */
	public boolean isLimitByBranchOrProductAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isLimitByBranchOrProduct( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute. 
	 * @return the limitByBranchOrProduct
	 */
	public boolean isLimitByBranchOrProductAsPrimitive()
	{
		return isLimitByBranchOrProductAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute. 
	 * @param value the limitByBranchOrProduct
	 */
	public void setLimitByBranchOrProduct(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, LIMITBYBRANCHORPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute. 
	 * @param value the limitByBranchOrProduct
	 */
	public void setLimitByBranchOrProduct(final Boolean value)
	{
		setLimitByBranchOrProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute. 
	 * @param value the limitByBranchOrProduct
	 */
	public void setLimitByBranchOrProduct(final SessionContext ctx, final boolean value)
	{
		setLimitByBranchOrProduct( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.limitByBranchOrProduct</code> attribute. 
	 * @param value the limitByBranchOrProduct
	 */
	public void setLimitByBranchOrProduct(final boolean value)
	{
		setLimitByBranchOrProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias(final SessionContext ctx)
	{
		return (Set<Media>)MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.medias</code> attribute.
	 * @return the medias
	 */
	public Set<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Set<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final Set<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final Media value)
	{
		addToMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final Media value)
	{
		removeFromMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute.
	 * @return the transactionOnCredit
	 */
	public Boolean isTransactionOnCredit(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONONCREDIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute.
	 * @return the transactionOnCredit
	 */
	public Boolean isTransactionOnCredit()
	{
		return isTransactionOnCredit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute. 
	 * @return the transactionOnCredit
	 */
	public boolean isTransactionOnCreditAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactionOnCredit( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute. 
	 * @return the transactionOnCredit
	 */
	public boolean isTransactionOnCreditAsPrimitive()
	{
		return isTransactionOnCreditAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute. 
	 * @param value the transactionOnCredit
	 */
	public void setTransactionOnCredit(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONONCREDIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute. 
	 * @param value the transactionOnCredit
	 */
	public void setTransactionOnCredit(final Boolean value)
	{
		setTransactionOnCredit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute. 
	 * @param value the transactionOnCredit
	 */
	public void setTransactionOnCredit(final SessionContext ctx, final boolean value)
	{
		setTransactionOnCredit( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.transactionOnCredit</code> attribute. 
	 * @param value the transactionOnCredit
	 */
	public void setTransactionOnCredit(final boolean value)
	{
		setTransactionOnCredit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute.
	 * @return the transactionOnDeposit
	 */
	public Boolean isTransactionOnDeposit(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONONDEPOSIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute.
	 * @return the transactionOnDeposit
	 */
	public Boolean isTransactionOnDeposit()
	{
		return isTransactionOnDeposit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute. 
	 * @return the transactionOnDeposit
	 */
	public boolean isTransactionOnDepositAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactionOnDeposit( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute. 
	 * @return the transactionOnDeposit
	 */
	public boolean isTransactionOnDepositAsPrimitive()
	{
		return isTransactionOnDepositAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute. 
	 * @param value the transactionOnDeposit
	 */
	public void setTransactionOnDeposit(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONONDEPOSIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute. 
	 * @param value the transactionOnDeposit
	 */
	public void setTransactionOnDeposit(final Boolean value)
	{
		setTransactionOnDeposit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute. 
	 * @param value the transactionOnDeposit
	 */
	public void setTransactionOnDeposit(final SessionContext ctx, final boolean value)
	{
		setTransactionOnDeposit( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientCreditDepositLimit.transactionOnDeposit</code> attribute. 
	 * @param value the transactionOnDeposit
	 */
	public void setTransactionOnDeposit(final boolean value)
	{
		setTransactionOnDeposit( getSession().getSessionContext(), value );
	}
	
}
