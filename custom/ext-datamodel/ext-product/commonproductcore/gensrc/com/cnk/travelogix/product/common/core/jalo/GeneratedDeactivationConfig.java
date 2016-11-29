/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.DeactivationConfig DeactivationConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDeactivationConfig extends GenericItem
{
	/** Qualifier of the <code>DeactivationConfig.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>DeactivationConfig.validityStartDate</code> attribute **/
	public static final String VALIDITYSTARTDATE = "validityStartDate";
	/** Qualifier of the <code>DeactivationConfig.validityEndDate</code> attribute **/
	public static final String VALIDITYENDDATE = "validityEndDate";
	/** Qualifier of the <code>DeactivationConfig.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>DeactivationConfig.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>DeactivationConfig.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDeactivationConfig> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedDeactivationConfig>(
	CommonproductcoreConstants.TC.DEACTIVATIONCONFIG,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(VALIDITYSTARTDATE, AttributeMode.INITIAL);
		tmp.put(VALIDITYENDDATE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.companyMarket</code> attribute.
	 * @return the companyMarket - To show company Market.
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.companyMarket</code> attribute.
	 * @return the companyMarket - To show company Market.
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.companyMarket</code> attribute. 
	 * @param value the companyMarket - To show company Market.
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.companyMarket</code> attribute. 
	 * @param value the companyMarket - To show company Market.
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.status</code> attribute.
	 * @return the status - Status of market whether active or inactive
	 */
	public Boolean isStatus(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.status</code> attribute.
	 * @return the status - Status of market whether active or inactive
	 */
	public Boolean isStatus()
	{
		return isStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.status</code> attribute. 
	 * @return the status - Status of market whether active or inactive
	 */
	public boolean isStatusAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isStatus( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.status</code> attribute. 
	 * @return the status - Status of market whether active or inactive
	 */
	public boolean isStatusAsPrimitive()
	{
		return isStatusAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.status</code> attribute. 
	 * @param value the status - Status of market whether active or inactive
	 */
	public void setStatus(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.status</code> attribute. 
	 * @param value the status - Status of market whether active or inactive
	 */
	public void setStatus(final Boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.status</code> attribute. 
	 * @param value the status - Status of market whether active or inactive
	 */
	public void setStatus(final SessionContext ctx, final boolean value)
	{
		setStatus( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.status</code> attribute. 
	 * @param value the status - Status of market whether active or inactive
	 */
	public void setStatus(final boolean value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.validityEndDate</code> attribute.
	 * @return the validityEndDate - To show validity End Date.
	 */
	public Date getValidityEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDITYENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.validityEndDate</code> attribute.
	 * @return the validityEndDate - To show validity End Date.
	 */
	public Date getValidityEndDate()
	{
		return getValidityEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.validityEndDate</code> attribute. 
	 * @param value the validityEndDate - To show validity End Date.
	 */
	public void setValidityEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDITYENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.validityEndDate</code> attribute. 
	 * @param value the validityEndDate - To show validity End Date.
	 */
	public void setValidityEndDate(final Date value)
	{
		setValidityEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.validityStartDate</code> attribute.
	 * @return the validityStartDate - To show validity Start Date.
	 */
	public Date getValidityStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDITYSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivationConfig.validityStartDate</code> attribute.
	 * @return the validityStartDate - To show validity Start Date.
	 */
	public Date getValidityStartDate()
	{
		return getValidityStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.validityStartDate</code> attribute. 
	 * @param value the validityStartDate - To show validity Start Date.
	 */
	public void setValidityStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDITYSTARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivationConfig.validityStartDate</code> attribute. 
	 * @param value the validityStartDate - To show validity Start Date.
	 */
	public void setValidityStartDate(final Date value)
	{
		setValidityStartDate( getSession().getSessionContext(), value );
	}
	
}
