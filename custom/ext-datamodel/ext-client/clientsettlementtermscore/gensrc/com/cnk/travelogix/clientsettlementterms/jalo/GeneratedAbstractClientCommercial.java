/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.clientsettlementterms.jalo;

import com.cnk.travelogix.client.settlementterms.constants.ClientsettlementtermscoreConstants;
import com.cnk.travelogix.clientsettlementterms.jalo.OtherCommercialHead;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.clientsettlementterms.jalo.AbstractClientCommercial AbstractClientCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractClientCommercial extends GenericItem
{
	/** Qualifier of the <code>AbstractClientCommercial.standardCommercial</code> attribute **/
	public static final String STANDARDCOMMERCIAL = "standardCommercial";
	/** Qualifier of the <code>AbstractClientCommercial.otherCommercial</code> attribute **/
	public static final String OTHERCOMMERCIAL = "otherCommercial";
	/** Qualifier of the <code>AbstractClientCommercial.otherCommercialHead</code> attribute **/
	public static final String OTHERCOMMERCIALHEAD = "otherCommercialHead";
	/** Qualifier of the <code>AbstractClientCommercial.settlementSchedule</code> attribute **/
	public static final String SETTLEMENTSCHEDULE = "settlementSchedule";
	/** Qualifier of the <code>AbstractClientCommercial.products</code> attribute **/
	public static final String PRODUCTS = "products";
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Product> PRODUCTSHANDLER = new OneToManyHandler<Product>(
	CoreConstants.TC.PRODUCT,
	true,
	"abstractClientCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STANDARDCOMMERCIAL, AttributeMode.INITIAL);
		tmp.put(OTHERCOMMERCIAL, AttributeMode.INITIAL);
		tmp.put(OTHERCOMMERCIALHEAD, AttributeMode.INITIAL);
		tmp.put(SETTLEMENTSCHEDULE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.otherCommercial</code> attribute.
	 * @return the otherCommercial - Other Commercial
	 */
	public Boolean isOtherCommercial(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OTHERCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.otherCommercial</code> attribute.
	 * @return the otherCommercial - Other Commercial
	 */
	public Boolean isOtherCommercial()
	{
		return isOtherCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.otherCommercial</code> attribute. 
	 * @return the otherCommercial - Other Commercial
	 */
	public boolean isOtherCommercialAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOtherCommercial( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.otherCommercial</code> attribute. 
	 * @return the otherCommercial - Other Commercial
	 */
	public boolean isOtherCommercialAsPrimitive()
	{
		return isOtherCommercialAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.otherCommercial</code> attribute. 
	 * @param value the otherCommercial - Other Commercial
	 */
	public void setOtherCommercial(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OTHERCOMMERCIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.otherCommercial</code> attribute. 
	 * @param value the otherCommercial - Other Commercial
	 */
	public void setOtherCommercial(final Boolean value)
	{
		setOtherCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.otherCommercial</code> attribute. 
	 * @param value the otherCommercial - Other Commercial
	 */
	public void setOtherCommercial(final SessionContext ctx, final boolean value)
	{
		setOtherCommercial( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.otherCommercial</code> attribute. 
	 * @param value the otherCommercial - Other Commercial
	 */
	public void setOtherCommercial(final boolean value)
	{
		setOtherCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.otherCommercialHead</code> attribute.
	 * @return the otherCommercialHead - Other Commercial Head
	 */
	public OtherCommercialHead getOtherCommercialHead(final SessionContext ctx)
	{
		return (OtherCommercialHead)getProperty( ctx, OTHERCOMMERCIALHEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.otherCommercialHead</code> attribute.
	 * @return the otherCommercialHead - Other Commercial Head
	 */
	public OtherCommercialHead getOtherCommercialHead()
	{
		return getOtherCommercialHead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.otherCommercialHead</code> attribute. 
	 * @param value the otherCommercialHead - Other Commercial Head
	 */
	public void setOtherCommercialHead(final SessionContext ctx, final OtherCommercialHead value)
	{
		setProperty(ctx, OTHERCOMMERCIALHEAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.otherCommercialHead</code> attribute. 
	 * @param value the otherCommercialHead - Other Commercial Head
	 */
	public void setOtherCommercialHead(final OtherCommercialHead value)
	{
		setOtherCommercialHead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.products</code> attribute.
	 * @return the products
	 */
	public Set<Product> getProducts(final SessionContext ctx)
	{
		return (Set<Product>)PRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.products</code> attribute.
	 * @return the products
	 */
	public Set<Product> getProducts()
	{
		return getProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final SessionContext ctx, final Set<Product> value)
	{
		PRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.products</code> attribute. 
	 * @param value the products
	 */
	public void setProducts(final Set<Product> value)
	{
		setProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final SessionContext ctx, final Product value)
	{
		PRODUCTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to products. 
	 * @param value the item to add to products
	 */
	public void addToProducts(final Product value)
	{
		addToProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final SessionContext ctx, final Product value)
	{
		PRODUCTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from products. 
	 * @param value the item to remove from products
	 */
	public void removeFromProducts(final Product value)
	{
		removeFromProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.settlementSchedule</code> attribute.
	 * @return the settlementSchedule - Settlement Schedule
	 */
	public EnumerationValue getSettlementSchedule(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SETTLEMENTSCHEDULE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.settlementSchedule</code> attribute.
	 * @return the settlementSchedule - Settlement Schedule
	 */
	public EnumerationValue getSettlementSchedule()
	{
		return getSettlementSchedule( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.settlementSchedule</code> attribute. 
	 * @param value the settlementSchedule - Settlement Schedule
	 */
	public void setSettlementSchedule(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SETTLEMENTSCHEDULE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.settlementSchedule</code> attribute. 
	 * @param value the settlementSchedule - Settlement Schedule
	 */
	public void setSettlementSchedule(final EnumerationValue value)
	{
		setSettlementSchedule( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.standardCommercial</code> attribute.
	 * @return the standardCommercial - Standard Commercial
	 */
	public Boolean isStandardCommercial(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STANDARDCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.standardCommercial</code> attribute.
	 * @return the standardCommercial - Standard Commercial
	 */
	public Boolean isStandardCommercial()
	{
		return isStandardCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.standardCommercial</code> attribute. 
	 * @return the standardCommercial - Standard Commercial
	 */
	public boolean isStandardCommercialAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStandardCommercial( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractClientCommercial.standardCommercial</code> attribute. 
	 * @return the standardCommercial - Standard Commercial
	 */
	public boolean isStandardCommercialAsPrimitive()
	{
		return isStandardCommercialAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.standardCommercial</code> attribute. 
	 * @param value the standardCommercial - Standard Commercial
	 */
	public void setStandardCommercial(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STANDARDCOMMERCIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.standardCommercial</code> attribute. 
	 * @param value the standardCommercial - Standard Commercial
	 */
	public void setStandardCommercial(final Boolean value)
	{
		setStandardCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.standardCommercial</code> attribute. 
	 * @param value the standardCommercial - Standard Commercial
	 */
	public void setStandardCommercial(final SessionContext ctx, final boolean value)
	{
		setStandardCommercial( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractClientCommercial.standardCommercial</code> attribute. 
	 * @param value the standardCommercial - Standard Commercial
	 */
	public void setStandardCommercial(final boolean value)
	{
		setStandardCommercial( getSession().getSessionContext(), value );
	}
	
}
