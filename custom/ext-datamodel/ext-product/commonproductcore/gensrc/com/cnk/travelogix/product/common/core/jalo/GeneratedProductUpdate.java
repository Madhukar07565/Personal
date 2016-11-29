/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.DescriptionDetails;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ProductUpdate ProductUpdate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductUpdate extends DescriptionDetails
{
	/** Qualifier of the <code>ProductUpdate.updateType</code> attribute **/
	public static final String UPDATETYPE = "updateType";
	/** Qualifier of the <code>ProductUpdate.descriptionType</code> attribute **/
	public static final String DESCRIPTIONTYPE = "descriptionType";
	/** Qualifier of the <code>ProductUpdate.sendToCustomer</code> attribute **/
	public static final String SENDTOCUSTOMER = "sendToCustomer";
	/** Qualifier of the <code>ProductUpdate.showOnVoucher</code> attribute **/
	public static final String SHOWONVOUCHER = "showOnVoucher";
	/** Qualifier of the <code>ProductUpdate.modeOfCommunication</code> attribute **/
	public static final String MODEOFCOMMUNICATION = "modeOfCommunication";
	/** Qualifier of the <code>ProductUpdate.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedProductUpdate> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedProductUpdate>(
	CommonproductcoreConstants.TC.PRODUCTUPDATE,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(DescriptionDetails.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(UPDATETYPE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTIONTYPE, AttributeMode.INITIAL);
		tmp.put(SENDTOCUSTOMER, AttributeMode.INITIAL);
		tmp.put(SHOWONVOUCHER, AttributeMode.INITIAL);
		tmp.put(MODEOFCOMMUNICATION, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
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
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.descriptionType</code> attribute.
	 * @return the descriptionType - Description Type
	 */
	public EnumerationValue getDescriptionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DESCRIPTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.descriptionType</code> attribute.
	 * @return the descriptionType - Description Type
	 */
	public EnumerationValue getDescriptionType()
	{
		return getDescriptionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.descriptionType</code> attribute. 
	 * @param value the descriptionType - Description Type
	 */
	public void setDescriptionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DESCRIPTIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.descriptionType</code> attribute. 
	 * @param value the descriptionType - Description Type
	 */
	public void setDescriptionType(final EnumerationValue value)
	{
		setDescriptionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.modeOfCommunication</code> attribute.
	 * @return the modeOfCommunication - Mode Of Communication
	 */
	public EnumerationValue getModeOfCommunication(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFCOMMUNICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.modeOfCommunication</code> attribute.
	 * @return the modeOfCommunication - Mode Of Communication
	 */
	public EnumerationValue getModeOfCommunication()
	{
		return getModeOfCommunication( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.modeOfCommunication</code> attribute. 
	 * @param value the modeOfCommunication - Mode Of Communication
	 */
	public void setModeOfCommunication(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFCOMMUNICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.modeOfCommunication</code> attribute. 
	 * @param value the modeOfCommunication - Mode Of Communication
	 */
	public void setModeOfCommunication(final EnumerationValue value)
	{
		setModeOfCommunication( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.sendToCustomer</code> attribute.
	 * @return the sendToCustomer - Send To Customer
	 */
	public Boolean isSendToCustomer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SENDTOCUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.sendToCustomer</code> attribute.
	 * @return the sendToCustomer - Send To Customer
	 */
	public Boolean isSendToCustomer()
	{
		return isSendToCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.sendToCustomer</code> attribute. 
	 * @return the sendToCustomer - Send To Customer
	 */
	public boolean isSendToCustomerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSendToCustomer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.sendToCustomer</code> attribute. 
	 * @return the sendToCustomer - Send To Customer
	 */
	public boolean isSendToCustomerAsPrimitive()
	{
		return isSendToCustomerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.sendToCustomer</code> attribute. 
	 * @param value the sendToCustomer - Send To Customer
	 */
	public void setSendToCustomer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SENDTOCUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.sendToCustomer</code> attribute. 
	 * @param value the sendToCustomer - Send To Customer
	 */
	public void setSendToCustomer(final Boolean value)
	{
		setSendToCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.sendToCustomer</code> attribute. 
	 * @param value the sendToCustomer - Send To Customer
	 */
	public void setSendToCustomer(final SessionContext ctx, final boolean value)
	{
		setSendToCustomer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.sendToCustomer</code> attribute. 
	 * @param value the sendToCustomer - Send To Customer
	 */
	public void setSendToCustomer(final boolean value)
	{
		setSendToCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.showOnVoucher</code> attribute.
	 * @return the showOnVoucher - Show On Voucher
	 */
	public Boolean isShowOnVoucher(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHOWONVOUCHER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.showOnVoucher</code> attribute.
	 * @return the showOnVoucher - Show On Voucher
	 */
	public Boolean isShowOnVoucher()
	{
		return isShowOnVoucher( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.showOnVoucher</code> attribute. 
	 * @return the showOnVoucher - Show On Voucher
	 */
	public boolean isShowOnVoucherAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShowOnVoucher( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.showOnVoucher</code> attribute. 
	 * @return the showOnVoucher - Show On Voucher
	 */
	public boolean isShowOnVoucherAsPrimitive()
	{
		return isShowOnVoucherAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.showOnVoucher</code> attribute. 
	 * @param value the showOnVoucher - Show On Voucher
	 */
	public void setShowOnVoucher(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHOWONVOUCHER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.showOnVoucher</code> attribute. 
	 * @param value the showOnVoucher - Show On Voucher
	 */
	public void setShowOnVoucher(final Boolean value)
	{
		setShowOnVoucher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.showOnVoucher</code> attribute. 
	 * @param value the showOnVoucher - Show On Voucher
	 */
	public void setShowOnVoucher(final SessionContext ctx, final boolean value)
	{
		setShowOnVoucher( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.showOnVoucher</code> attribute. 
	 * @param value the showOnVoucher - Show On Voucher
	 */
	public void setShowOnVoucher(final boolean value)
	{
		setShowOnVoucher( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.updateType</code> attribute.
	 * @return the updateType - Update Type
	 */
	public EnumerationValue getUpdateType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPDATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductUpdate.updateType</code> attribute.
	 * @return the updateType - Update Type
	 */
	public EnumerationValue getUpdateType()
	{
		return getUpdateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.updateType</code> attribute. 
	 * @param value the updateType - Update Type
	 */
	public void setUpdateType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPDATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductUpdate.updateType</code> attribute. 
	 * @param value the updateType - Update Type
	 */
	public void setUpdateType(final EnumerationValue value)
	{
		setUpdateType( getSession().getSessionContext(), value );
	}
	
}
