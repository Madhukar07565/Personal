/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.credentials.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.BankPaymentDetail;
import com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.AbstractIndent;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.BankGuarenteeInfo;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.CreditDepositIndent;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.TicketCappingIndent;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SuppliercredentialscoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSuppliercredentialscoreManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CREDENTIALS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierCredentials> SUPPLIER2CREDENTIALSRELCREDENTIALSHANDLER = new OneToManyHandler<SupplierCredentials>(
	SuppliercredentialscoreConstants.TC.SUPPLIERCREDENTIALS,
	false,
	"supplier",
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
		tmp.put("credentials", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.supplier.core.market.jalo.SupplierMarket", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("credentials", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("indent", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.paymentinfo.jalo.BankPaymentDetail", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("indent", AttributeMode.INITIAL);
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
	
	public BankGuarenteeInfo createBankGuarenteeInfo(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercredentialscoreConstants.TC.BANKGUARENTEEINFO );
			return (BankGuarenteeInfo)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BankGuarenteeInfo : "+e.getMessage(), 0 );
		}
	}
	
	public BankGuarenteeInfo createBankGuarenteeInfo(final Map attributeValues)
	{
		return createBankGuarenteeInfo( getSession().getSessionContext(), attributeValues );
	}
	
	public CreditDepositIndent createCreditDepositIndent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercredentialscoreConstants.TC.CREDITDEPOSITINDENT );
			return (CreditDepositIndent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CreditDepositIndent : "+e.getMessage(), 0 );
		}
	}
	
	public CreditDepositIndent createCreditDepositIndent(final Map attributeValues)
	{
		return createCreditDepositIndent( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierCredentials createSupplierCredentials(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercredentialscoreConstants.TC.SUPPLIERCREDENTIALS );
			return (SupplierCredentials)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SupplierCredentials : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierCredentials createSupplierCredentials(final Map attributeValues)
	{
		return createSupplierCredentials( getSession().getSessionContext(), attributeValues );
	}
	
	public TicketCappingIndent createTicketCappingIndent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SuppliercredentialscoreConstants.TC.TICKETCAPPINGINDENT );
			return (TicketCappingIndent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TicketCappingIndent : "+e.getMessage(), 0 );
		}
	}
	
	public TicketCappingIndent createTicketCappingIndent(final Map attributeValues)
	{
		return createTicketCappingIndent( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.credentials</code> attribute.
	 * @return the credentials
	 */
	public SupplierCredentials getCredentials(final SessionContext ctx, final SupplierMarket item)
	{
		return (SupplierCredentials)item.getProperty( ctx, SuppliercredentialscoreConstants.Attributes.SupplierMarket.CREDENTIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMarket.credentials</code> attribute.
	 * @return the credentials
	 */
	public SupplierCredentials getCredentials(final SupplierMarket item)
	{
		return getCredentials( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final SessionContext ctx, final SupplierMarket item, final SupplierCredentials value)
	{
		item.setProperty(ctx, SuppliercredentialscoreConstants.Attributes.SupplierMarket.CREDENTIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMarket.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final SupplierMarket item, final SupplierCredentials value)
	{
		setCredentials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategorySubType.credentials</code> attribute.
	 * @return the credentials
	 */
	public SupplierCredentials getCredentials(final SessionContext ctx, final ProductCategorySubType item)
	{
		return (SupplierCredentials)item.getProperty( ctx, SuppliercredentialscoreConstants.Attributes.ProductCategorySubType.CREDENTIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductCategorySubType.credentials</code> attribute.
	 * @return the credentials
	 */
	public SupplierCredentials getCredentials(final ProductCategorySubType item)
	{
		return getCredentials( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategorySubType.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final SessionContext ctx, final ProductCategorySubType item, final SupplierCredentials value)
	{
		item.setProperty(ctx, SuppliercredentialscoreConstants.Attributes.ProductCategorySubType.CREDENTIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductCategorySubType.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final ProductCategorySubType item, final SupplierCredentials value)
	{
		setCredentials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.credentials</code> attribute.
	 * @return the credentials
	 */
	public Collection<SupplierCredentials> getCredentials(final SessionContext ctx, final Supplier item)
	{
		return SUPPLIER2CREDENTIALSRELCREDENTIALSHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Supplier.credentials</code> attribute.
	 * @return the credentials
	 */
	public Collection<SupplierCredentials> getCredentials(final Supplier item)
	{
		return getCredentials( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final SessionContext ctx, final Supplier item, final Collection<SupplierCredentials> value)
	{
		SUPPLIER2CREDENTIALSRELCREDENTIALSHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Supplier.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final Supplier item, final Collection<SupplierCredentials> value)
	{
		setCredentials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentials. 
	 * @param value the item to add to credentials
	 */
	public void addToCredentials(final SessionContext ctx, final Supplier item, final SupplierCredentials value)
	{
		SUPPLIER2CREDENTIALSRELCREDENTIALSHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentials. 
	 * @param value the item to add to credentials
	 */
	public void addToCredentials(final Supplier item, final SupplierCredentials value)
	{
		addToCredentials( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentials. 
	 * @param value the item to remove from credentials
	 */
	public void removeFromCredentials(final SessionContext ctx, final Supplier item, final SupplierCredentials value)
	{
		SUPPLIER2CREDENTIALSRELCREDENTIALSHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentials. 
	 * @param value the item to remove from credentials
	 */
	public void removeFromCredentials(final Supplier item, final SupplierCredentials value)
	{
		removeFromCredentials( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SuppliercredentialscoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.indent</code> attribute.
	 * @return the indent
	 */
	public AbstractIndent getIndent(final SessionContext ctx, final BankPaymentDetail item)
	{
		return (AbstractIndent)item.getProperty( ctx, SuppliercredentialscoreConstants.Attributes.BankPaymentDetail.INDENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BankPaymentDetail.indent</code> attribute.
	 * @return the indent
	 */
	public AbstractIndent getIndent(final BankPaymentDetail item)
	{
		return getIndent( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.indent</code> attribute. 
	 * @param value the indent
	 */
	public void setIndent(final SessionContext ctx, final BankPaymentDetail item, final AbstractIndent value)
	{
		item.setProperty(ctx, SuppliercredentialscoreConstants.Attributes.BankPaymentDetail.INDENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BankPaymentDetail.indent</code> attribute. 
	 * @param value the indent
	 */
	public void setIndent(final BankPaymentDetail item, final AbstractIndent value)
	{
		setIndent( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.indent</code> attribute.
	 * @return the indent
	 */
	public AbstractIndent getIndent(final SessionContext ctx, final Media item)
	{
		return (AbstractIndent)item.getProperty( ctx, SuppliercredentialscoreConstants.Attributes.Media.INDENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.indent</code> attribute.
	 * @return the indent
	 */
	public AbstractIndent getIndent(final Media item)
	{
		return getIndent( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.indent</code> attribute. 
	 * @param value the indent
	 */
	public void setIndent(final SessionContext ctx, final Media item, final AbstractIndent value)
	{
		item.setProperty(ctx, SuppliercredentialscoreConstants.Attributes.Media.INDENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.indent</code> attribute. 
	 * @param value the indent
	 */
	public void setIndent(final Media item, final AbstractIndent value)
	{
		setIndent( getSession().getSessionContext(), item, value );
	}
	
}
