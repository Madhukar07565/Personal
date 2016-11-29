/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AssociatedSupplier;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AssociatedCredentials AssociatedCredentials}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssociatedCredentials extends GenericItem
{
	/** Qualifier of the <code>AssociatedCredentials.enabled</code> attribute **/
	public static final String ENABLED = "enabled";
	/** Qualifier of the <code>AssociatedCredentials.credential</code> attribute **/
	public static final String CREDENTIAL = "credential";
	/** Qualifier of the <code>AssociatedCredentials.suppliers</code> attribute **/
	public static final String SUPPLIERS = "suppliers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAssociatedCredentials> SUPPLIERSHANDLER = new BidirectionalOneToManyHandler<GeneratedAssociatedCredentials>(
	ClientconfigConstants.TC.ASSOCIATEDCREDENTIALS,
	false,
	"suppliers",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ENABLED, AttributeMode.INITIAL);
		tmp.put(CREDENTIAL, AttributeMode.INITIAL);
		tmp.put(SUPPLIERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SUPPLIERSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCredentials.credential</code> attribute.
	 * @return the credential
	 */
	public SupplierCredentials getCredential(final SessionContext ctx)
	{
		return (SupplierCredentials)getProperty( ctx, CREDENTIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCredentials.credential</code> attribute.
	 * @return the credential
	 */
	public SupplierCredentials getCredential()
	{
		return getCredential( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCredentials.credential</code> attribute. 
	 * @param value the credential
	 */
	public void setCredential(final SessionContext ctx, final SupplierCredentials value)
	{
		setProperty(ctx, CREDENTIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCredentials.credential</code> attribute. 
	 * @param value the credential
	 */
	public void setCredential(final SupplierCredentials value)
	{
		setCredential( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCredentials.enabled</code> attribute.
	 * @return the enabled
	 */
	public Boolean isEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCredentials.enabled</code> attribute.
	 * @return the enabled
	 */
	public Boolean isEnabled()
	{
		return isEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCredentials.enabled</code> attribute. 
	 * @return the enabled
	 */
	public boolean isEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCredentials.enabled</code> attribute. 
	 * @return the enabled
	 */
	public boolean isEnabledAsPrimitive()
	{
		return isEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCredentials.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCredentials.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final Boolean value)
	{
		setEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCredentials.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final SessionContext ctx, final boolean value)
	{
		setEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCredentials.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final boolean value)
	{
		setEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCredentials.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public AssociatedSupplier getSuppliers(final SessionContext ctx)
	{
		return (AssociatedSupplier)getProperty( ctx, SUPPLIERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCredentials.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public AssociatedSupplier getSuppliers()
	{
		return getSuppliers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCredentials.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final SessionContext ctx, final AssociatedSupplier value)
	{
		SUPPLIERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCredentials.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final AssociatedSupplier value)
	{
		setSuppliers( getSession().getSessionContext(), value );
	}
	
}
