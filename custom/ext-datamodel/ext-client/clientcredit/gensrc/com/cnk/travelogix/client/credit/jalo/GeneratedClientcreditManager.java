/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.credit.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.client.core.clienttype.jalo.TravelogixClientType;
import com.cnk.travelogix.client.credit.constants.ClientcreditConstants;
import com.cnk.travelogix.client.credit.core.jalo.BankGuarantee;
import com.cnk.travelogix.client.credit.core.jalo.BankInformation;
import com.cnk.travelogix.client.credit.core.jalo.Barter;
import com.cnk.travelogix.client.credit.core.jalo.ClientCreditDetails;
import com.cnk.travelogix.client.credit.core.jalo.CreditCard;
import com.cnk.travelogix.client.credit.core.jalo.CreditLimitInfo;
import com.cnk.travelogix.client.credit.core.jalo.ProductInformationforCredit;
import com.cnk.travelogix.client.credit.core.jalo.SecurityDeposit;
import com.cnk.travelogix.client.credit.core.jalo.ThresholdInformation;
import com.cnk.travelogix.client.credit.jalo.BankInfo;
import com.cnk.travelogix.client.credit.jalo.BarterLimit;
import com.cnk.travelogix.client.credit.jalo.ClientCreditDepositLimit;
import com.cnk.travelogix.client.credit.jalo.CreditCardDetail;
import com.cnk.travelogix.client.credit.jalo.LimitByBranchOrProduct;
import com.cnk.travelogix.client.credit.jalo.SecuredBankGuarantee;
import com.cnk.travelogix.client.credit.jalo.SecuredCreditCardLimit;
import com.cnk.travelogix.client.credit.jalo.SecuredCreditDepositLimit;
import com.cnk.travelogix.client.credit.jalo.SecuredDepositLimit;
import com.cnk.travelogix.client.credit.jalo.UnsecuredCreditLimit;
import de.hybris.platform.b2b.jalo.B2BUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ClientcreditManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientcreditManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CREDITDEPOSITLIMITS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ClientCreditDepositLimit> PRINCIPALTOCLIENTCREDITDEPOSITLIMITCREDITDEPOSITLIMITSHANDLER = new OneToManyHandler<ClientCreditDepositLimit>(
	ClientcreditConstants.TC.CLIENTCREDITDEPOSITLIMIT,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("clientCreditLimit", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.core.clienttype.jalo.TravelogixClientType", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("clientCreditLimit", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("clientCreditDetails", AttributeMode.INITIAL);
		tmp.put("clientCreditDepositLimit", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.clientCreditDepositLimit</code> attribute.
	 * @return the clientCreditDepositLimit
	 */
	public ClientCreditDepositLimit getClientCreditDepositLimit(final SessionContext ctx, final Media item)
	{
		return (ClientCreditDepositLimit)item.getProperty( ctx, ClientcreditConstants.Attributes.Media.CLIENTCREDITDEPOSITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.clientCreditDepositLimit</code> attribute.
	 * @return the clientCreditDepositLimit
	 */
	public ClientCreditDepositLimit getClientCreditDepositLimit(final Media item)
	{
		return getClientCreditDepositLimit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.clientCreditDepositLimit</code> attribute. 
	 * @param value the clientCreditDepositLimit
	 */
	public void setClientCreditDepositLimit(final SessionContext ctx, final Media item, final ClientCreditDepositLimit value)
	{
		item.setProperty(ctx, ClientcreditConstants.Attributes.Media.CLIENTCREDITDEPOSITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.clientCreditDepositLimit</code> attribute. 
	 * @param value the clientCreditDepositLimit
	 */
	public void setClientCreditDepositLimit(final Media item, final ClientCreditDepositLimit value)
	{
		setClientCreditDepositLimit( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails(final SessionContext ctx, final Media item)
	{
		return (ClientCreditDetails)item.getProperty( ctx, ClientcreditConstants.Attributes.Media.CLIENTCREDITDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.clientCreditDetails</code> attribute.
	 * @return the clientCreditDetails
	 */
	public ClientCreditDetails getClientCreditDetails(final Media item)
	{
		return getClientCreditDetails( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final SessionContext ctx, final Media item, final ClientCreditDetails value)
	{
		item.setProperty(ctx, ClientcreditConstants.Attributes.Media.CLIENTCREDITDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.clientCreditDetails</code> attribute. 
	 * @param value the clientCreditDetails
	 */
	public void setClientCreditDetails(final Media item, final ClientCreditDetails value)
	{
		setClientCreditDetails( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.clientCreditLimit</code> attribute.
	 * @return the clientCreditLimit
	 */
	public ClientCreditDetails getClientCreditLimit(final SessionContext ctx, final TravelogixClientType item)
	{
		return (ClientCreditDetails)item.getProperty( ctx, ClientcreditConstants.Attributes.TravelogixClientType.CLIENTCREDITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.clientCreditLimit</code> attribute.
	 * @return the clientCreditLimit
	 */
	public ClientCreditDetails getClientCreditLimit(final TravelogixClientType item)
	{
		return getClientCreditLimit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.clientCreditLimit</code> attribute. 
	 * @param value the clientCreditLimit
	 */
	public void setClientCreditLimit(final SessionContext ctx, final TravelogixClientType item, final ClientCreditDetails value)
	{
		item.setProperty(ctx, ClientcreditConstants.Attributes.TravelogixClientType.CLIENTCREDITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.clientCreditLimit</code> attribute. 
	 * @param value the clientCreditLimit
	 */
	public void setClientCreditLimit(final TravelogixClientType item, final ClientCreditDetails value)
	{
		setClientCreditLimit( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientCreditLimit</code> attribute.
	 * @return the clientCreditLimit
	 */
	public ClientCreditDetails getClientCreditLimit(final SessionContext ctx, final TravelogixB2BUnit item)
	{
		return (ClientCreditDetails)item.getProperty( ctx, ClientcreditConstants.Attributes.TravelogixB2BUnit.CLIENTCREDITLIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixB2BUnit.clientCreditLimit</code> attribute.
	 * @return the clientCreditLimit
	 */
	public ClientCreditDetails getClientCreditLimit(final TravelogixB2BUnit item)
	{
		return getClientCreditLimit( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientCreditLimit</code> attribute. 
	 * @param value the clientCreditLimit
	 */
	public void setClientCreditLimit(final SessionContext ctx, final TravelogixB2BUnit item, final ClientCreditDetails value)
	{
		item.setProperty(ctx, ClientcreditConstants.Attributes.TravelogixB2BUnit.CLIENTCREDITLIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixB2BUnit.clientCreditLimit</code> attribute. 
	 * @param value the clientCreditLimit
	 */
	public void setClientCreditLimit(final TravelogixB2BUnit item, final ClientCreditDetails value)
	{
		setClientCreditLimit( getSession().getSessionContext(), item, value );
	}
	
	public BankGuarantee createBankGuarantee(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.BANKGUARANTEE );
			return (BankGuarantee)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BankGuarantee : "+e.getMessage(), 0 );
		}
	}
	
	public BankGuarantee createBankGuarantee(final Map attributeValues)
	{
		return createBankGuarantee( getSession().getSessionContext(), attributeValues );
	}
	
	public BankInfo createBankInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.BANKINFO );
			return (BankInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BankInfo : "+e.getMessage(), 0 );
		}
	}
	
	public BankInfo createBankInfo(final Map attributeValues)
	{
		return createBankInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public BankInformation createBankInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.BANKINFORMATION );
			return (BankInformation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BankInformation : "+e.getMessage(), 0 );
		}
	}
	
	public BankInformation createBankInformation(final Map attributeValues)
	{
		return createBankInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public Barter createBarter(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.BARTER );
			return (Barter)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Barter : "+e.getMessage(), 0 );
		}
	}
	
	public Barter createBarter(final Map attributeValues)
	{
		return createBarter( getSession().getSessionContext(), attributeValues );
	}
	
	public BarterLimit createBarterLimit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.BARTERLIMIT );
			return (BarterLimit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BarterLimit : "+e.getMessage(), 0 );
		}
	}
	
	public BarterLimit createBarterLimit(final Map attributeValues)
	{
		return createBarterLimit( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientCreditDepositLimit createClientCreditDepositLimit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.CLIENTCREDITDEPOSITLIMIT );
			return (ClientCreditDepositLimit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ClientCreditDepositLimit : "+e.getMessage(), 0 );
		}
	}
	
	public ClientCreditDepositLimit createClientCreditDepositLimit(final Map attributeValues)
	{
		return createClientCreditDepositLimit( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientCreditDetails createClientCreditDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.CLIENTCREDITDETAILS );
			return (ClientCreditDetails)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ClientCreditDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ClientCreditDetails createClientCreditDetails(final Map attributeValues)
	{
		return createClientCreditDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public CreditCard createCreditCard(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.CREDITCARD );
			return (CreditCard)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CreditCard : "+e.getMessage(), 0 );
		}
	}
	
	public CreditCard createCreditCard(final Map attributeValues)
	{
		return createCreditCard( getSession().getSessionContext(), attributeValues );
	}
	
	public CreditCardDetail createCreditCardDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.CREDITCARDDETAIL );
			return (CreditCardDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CreditCardDetail : "+e.getMessage(), 0 );
		}
	}
	
	public CreditCardDetail createCreditCardDetail(final Map attributeValues)
	{
		return createCreditCardDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public CreditLimitInfo createCreditLimitInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.CREDITLIMITINFO );
			return (CreditLimitInfo)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CreditLimitInfo : "+e.getMessage(), 0 );
		}
	}
	
	public CreditLimitInfo createCreditLimitInfo(final Map attributeValues)
	{
		return createCreditLimitInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public LimitByBranchOrProduct createLimitByBranchOrProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.LIMITBYBRANCHORPRODUCT );
			return (LimitByBranchOrProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating LimitByBranchOrProduct : "+e.getMessage(), 0 );
		}
	}
	
	public LimitByBranchOrProduct createLimitByBranchOrProduct(final Map attributeValues)
	{
		return createLimitByBranchOrProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductInformationforCredit createProductInformationforCredit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.PRODUCTINFORMATIONFORCREDIT );
			return (ProductInformationforCredit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ProductInformationforCredit : "+e.getMessage(), 0 );
		}
	}
	
	public ProductInformationforCredit createProductInformationforCredit(final Map attributeValues)
	{
		return createProductInformationforCredit( getSession().getSessionContext(), attributeValues );
	}
	
	public SecuredBankGuarantee createSecuredBankGuarantee(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.SECUREDBANKGUARANTEE );
			return (SecuredBankGuarantee)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SecuredBankGuarantee : "+e.getMessage(), 0 );
		}
	}
	
	public SecuredBankGuarantee createSecuredBankGuarantee(final Map attributeValues)
	{
		return createSecuredBankGuarantee( getSession().getSessionContext(), attributeValues );
	}
	
	public SecuredCreditCardLimit createSecuredCreditCardLimit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.SECUREDCREDITCARDLIMIT );
			return (SecuredCreditCardLimit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SecuredCreditCardLimit : "+e.getMessage(), 0 );
		}
	}
	
	public SecuredCreditCardLimit createSecuredCreditCardLimit(final Map attributeValues)
	{
		return createSecuredCreditCardLimit( getSession().getSessionContext(), attributeValues );
	}
	
	public SecuredCreditDepositLimit createSecuredCreditDepositLimit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.SECUREDCREDITDEPOSITLIMIT );
			return (SecuredCreditDepositLimit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SecuredCreditDepositLimit : "+e.getMessage(), 0 );
		}
	}
	
	public SecuredCreditDepositLimit createSecuredCreditDepositLimit(final Map attributeValues)
	{
		return createSecuredCreditDepositLimit( getSession().getSessionContext(), attributeValues );
	}
	
	public SecuredDepositLimit createSecuredDepositLimit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.SECUREDDEPOSITLIMIT );
			return (SecuredDepositLimit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SecuredDepositLimit : "+e.getMessage(), 0 );
		}
	}
	
	public SecuredDepositLimit createSecuredDepositLimit(final Map attributeValues)
	{
		return createSecuredDepositLimit( getSession().getSessionContext(), attributeValues );
	}
	
	public SecurityDeposit createSecurityDeposit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.SECURITYDEPOSIT );
			return (SecurityDeposit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SecurityDeposit : "+e.getMessage(), 0 );
		}
	}
	
	public SecurityDeposit createSecurityDeposit(final Map attributeValues)
	{
		return createSecurityDeposit( getSession().getSessionContext(), attributeValues );
	}
	
	public ThresholdInformation createThresholdInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.THRESHOLDINFORMATION );
			return (ThresholdInformation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ThresholdInformation : "+e.getMessage(), 0 );
		}
	}
	
	public ThresholdInformation createThresholdInformation(final Map attributeValues)
	{
		return createThresholdInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public UnsecuredCreditLimit createUnsecuredCreditLimit(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcreditConstants.TC.UNSECUREDCREDITLIMIT );
			return (UnsecuredCreditLimit)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating UnsecuredCreditLimit : "+e.getMessage(), 0 );
		}
	}
	
	public UnsecuredCreditLimit createUnsecuredCreditLimit(final Map attributeValues)
	{
		return createUnsecuredCreditLimit( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.creditDepositLimits</code> attribute.
	 * @return the creditDepositLimits
	 */
	public Collection<ClientCreditDepositLimit> getCreditDepositLimits(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOCLIENTCREDITDEPOSITLIMITCREDITDEPOSITLIMITSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.creditDepositLimits</code> attribute.
	 * @return the creditDepositLimits
	 */
	public Collection<ClientCreditDepositLimit> getCreditDepositLimits(final Principal item)
	{
		return getCreditDepositLimits( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.creditDepositLimits</code> attribute. 
	 * @param value the creditDepositLimits
	 */
	public void setCreditDepositLimits(final SessionContext ctx, final Principal item, final Collection<ClientCreditDepositLimit> value)
	{
		PRINCIPALTOCLIENTCREDITDEPOSITLIMITCREDITDEPOSITLIMITSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.creditDepositLimits</code> attribute. 
	 * @param value the creditDepositLimits
	 */
	public void setCreditDepositLimits(final Principal item, final Collection<ClientCreditDepositLimit> value)
	{
		setCreditDepositLimits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to creditDepositLimits. 
	 * @param value the item to add to creditDepositLimits
	 */
	public void addToCreditDepositLimits(final SessionContext ctx, final Principal item, final ClientCreditDepositLimit value)
	{
		PRINCIPALTOCLIENTCREDITDEPOSITLIMITCREDITDEPOSITLIMITSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to creditDepositLimits. 
	 * @param value the item to add to creditDepositLimits
	 */
	public void addToCreditDepositLimits(final Principal item, final ClientCreditDepositLimit value)
	{
		addToCreditDepositLimits( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from creditDepositLimits. 
	 * @param value the item to remove from creditDepositLimits
	 */
	public void removeFromCreditDepositLimits(final SessionContext ctx, final Principal item, final ClientCreditDepositLimit value)
	{
		PRINCIPALTOCLIENTCREDITDEPOSITLIMITCREDITDEPOSITLIMITSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from creditDepositLimits. 
	 * @param value the item to remove from creditDepositLimits
	 */
	public void removeFromCreditDepositLimits(final Principal item, final ClientCreditDepositLimit value)
	{
		removeFromCreditDepositLimits( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return ClientcreditConstants.EXTENSIONNAME;
	}
	
}
