/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.settlementterms.jalo;

import com.cnk.travelogix.client.settlementterms.constants.ClientsettlementtermscoreConstants;
import com.cnk.travelogix.clientsettlementterms.jalo.AbstractClientCommercial;
import com.cnk.travelogix.clientsettlementterms.jalo.AbstractClientSettlement;
import com.cnk.travelogix.clientsettlementterms.jalo.ClientSettlement;
import com.cnk.travelogix.clientsettlementterms.jalo.CommercialPayable;
import com.cnk.travelogix.clientsettlementterms.jalo.CommercialReceivable;
import com.cnk.travelogix.clientsettlementterms.jalo.OtherCommercialHead;
import com.cnk.travelogix.clientsettlementterms.jalo.ProductDetails;
import com.cnk.travelogix.clientsettlementterms.jalo.ServiceTax;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ClientsettlementtermscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientsettlementtermscoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CLIENTSETTLEMENTTERMS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ClientSettlement> PRINCIPALTOCLIENTSETTLEMENTCLIENTSETTLEMENTTERMSHANDLER = new OneToManyHandler<ClientSettlement>(
	ClientsettlementtermscoreConstants.TC.CLIENTSETTLEMENT,
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
		tmp.put("abstractClientCommercial", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
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
	 * <i>Generated method</i> - Getter of the <code>Product.abstractClientCommercial</code> attribute.
	 * @return the abstractClientCommercial
	 */
	public AbstractClientCommercial getAbstractClientCommercial(final SessionContext ctx, final Product item)
	{
		return (AbstractClientCommercial)item.getProperty( ctx, ClientsettlementtermscoreConstants.Attributes.Product.ABSTRACTCLIENTCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.abstractClientCommercial</code> attribute.
	 * @return the abstractClientCommercial
	 */
	public AbstractClientCommercial getAbstractClientCommercial(final Product item)
	{
		return getAbstractClientCommercial( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.abstractClientCommercial</code> attribute. 
	 * @param value the abstractClientCommercial
	 */
	public void setAbstractClientCommercial(final SessionContext ctx, final Product item, final AbstractClientCommercial value)
	{
		item.setProperty(ctx, ClientsettlementtermscoreConstants.Attributes.Product.ABSTRACTCLIENTCOMMERCIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.abstractClientCommercial</code> attribute. 
	 * @param value the abstractClientCommercial
	 */
	public void setAbstractClientCommercial(final Product item, final AbstractClientCommercial value)
	{
		setAbstractClientCommercial( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.clientSettlementTerms</code> attribute.
	 * @return the clientSettlementTerms
	 */
	public Collection<ClientSettlement> getClientSettlementTerms(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOCLIENTSETTLEMENTCLIENTSETTLEMENTTERMSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.clientSettlementTerms</code> attribute.
	 * @return the clientSettlementTerms
	 */
	public Collection<ClientSettlement> getClientSettlementTerms(final Principal item)
	{
		return getClientSettlementTerms( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.clientSettlementTerms</code> attribute. 
	 * @param value the clientSettlementTerms
	 */
	public void setClientSettlementTerms(final SessionContext ctx, final Principal item, final Collection<ClientSettlement> value)
	{
		PRINCIPALTOCLIENTSETTLEMENTCLIENTSETTLEMENTTERMSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.clientSettlementTerms</code> attribute. 
	 * @param value the clientSettlementTerms
	 */
	public void setClientSettlementTerms(final Principal item, final Collection<ClientSettlement> value)
	{
		setClientSettlementTerms( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientSettlementTerms. 
	 * @param value the item to add to clientSettlementTerms
	 */
	public void addToClientSettlementTerms(final SessionContext ctx, final Principal item, final ClientSettlement value)
	{
		PRINCIPALTOCLIENTSETTLEMENTCLIENTSETTLEMENTTERMSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientSettlementTerms. 
	 * @param value the item to add to clientSettlementTerms
	 */
	public void addToClientSettlementTerms(final Principal item, final ClientSettlement value)
	{
		addToClientSettlementTerms( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientSettlementTerms. 
	 * @param value the item to remove from clientSettlementTerms
	 */
	public void removeFromClientSettlementTerms(final SessionContext ctx, final Principal item, final ClientSettlement value)
	{
		PRINCIPALTOCLIENTSETTLEMENTCLIENTSETTLEMENTTERMSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientSettlementTerms. 
	 * @param value the item to remove from clientSettlementTerms
	 */
	public void removeFromClientSettlementTerms(final Principal item, final ClientSettlement value)
	{
		removeFromClientSettlementTerms( getSession().getSessionContext(), item, value );
	}
	
	public AbstractClientCommercial createAbstractClientCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientsettlementtermscoreConstants.TC.ABSTRACTCLIENTCOMMERCIAL );
			return (AbstractClientCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractClientCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractClientCommercial createAbstractClientCommercial(final Map attributeValues)
	{
		return createAbstractClientCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public AbstractClientSettlement createAbstractClientSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientsettlementtermscoreConstants.TC.ABSTRACTCLIENTSETTLEMENT );
			return (AbstractClientSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AbstractClientSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public AbstractClientSettlement createAbstractClientSettlement(final Map attributeValues)
	{
		return createAbstractClientSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	public ProductDetails createBalanceDetails(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientsettlementtermscoreConstants.TC.BALANCEDETAILS );
			return (ProductDetails)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BalanceDetails : "+e.getMessage(), 0 );
		}
	}
	
	public ProductDetails createBalanceDetails(final Map attributeValues)
	{
		return createBalanceDetails( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientSettlement createClientSettlement(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientsettlementtermscoreConstants.TC.CLIENTSETTLEMENT );
			return (ClientSettlement)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientSettlement : "+e.getMessage(), 0 );
		}
	}
	
	public ClientSettlement createClientSettlement(final Map attributeValues)
	{
		return createClientSettlement( getSession().getSessionContext(), attributeValues );
	}
	
	public CommercialPayable createCommercialPayable(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientsettlementtermscoreConstants.TC.COMMERCIALPAYABLE );
			return (CommercialPayable)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommercialPayable : "+e.getMessage(), 0 );
		}
	}
	
	public CommercialPayable createCommercialPayable(final Map attributeValues)
	{
		return createCommercialPayable( getSession().getSessionContext(), attributeValues );
	}
	
	public CommercialReceivable createCommercialReceivable(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientsettlementtermscoreConstants.TC.COMMERCIALRECEIVABLE );
			return (CommercialReceivable)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CommercialReceivable : "+e.getMessage(), 0 );
		}
	}
	
	public CommercialReceivable createCommercialReceivable(final Map attributeValues)
	{
		return createCommercialReceivable( getSession().getSessionContext(), attributeValues );
	}
	
	public OtherCommercialHead createOtherCommercialHead(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientsettlementtermscoreConstants.TC.OTHERCOMMERCIALHEAD );
			return (OtherCommercialHead)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OtherCommercialHead : "+e.getMessage(), 0 );
		}
	}
	
	public OtherCommercialHead createOtherCommercialHead(final Map attributeValues)
	{
		return createOtherCommercialHead( getSession().getSessionContext(), attributeValues );
	}
	
	public ServiceTax createServiceTax(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientsettlementtermscoreConstants.TC.SERVICETAX );
			return (ServiceTax)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ServiceTax : "+e.getMessage(), 0 );
		}
	}
	
	public ServiceTax createServiceTax(final Map attributeValues)
	{
		return createServiceTax( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return ClientsettlementtermscoreConstants.EXTENSIONNAME;
	}
	
}
