/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.UserJourneyInfo;
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
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem UserJourneyProductInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUserJourneyProductInfo extends GenericItem
{
	/** Qualifier of the <code>UserJourneyProductInfo.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>UserJourneyProductInfo.productDumpValue</code> attribute **/
	public static final String PRODUCTDUMPVALUE = "productDumpValue";
	/** Qualifier of the <code>UserJourneyProductInfo.productDumpApproach</code> attribute **/
	public static final String PRODUCTDUMPAPPROACH = "productDumpApproach";
	/** Qualifier of the <code>UserJourneyProductInfo.journeyInfo</code> attribute **/
	public static final String JOURNEYINFO = "journeyInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n JOURNEYINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedUserJourneyProductInfo> JOURNEYINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedUserJourneyProductInfo>(
	CommonCoreConstants.TC.USERJOURNEYPRODUCTINFO,
	false,
	"journeyInfo",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(PRODUCTDUMPVALUE, AttributeMode.INITIAL);
		tmp.put(PRODUCTDUMPAPPROACH, AttributeMode.INITIAL);
		tmp.put(JOURNEYINFO, AttributeMode.INITIAL);
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
		JOURNEYINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyProductInfo.journeyInfo</code> attribute.
	 * @return the journeyInfo
	 */
	public UserJourneyInfo getJourneyInfo(final SessionContext ctx)
	{
		return (UserJourneyInfo)getProperty( ctx, JOURNEYINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyProductInfo.journeyInfo</code> attribute.
	 * @return the journeyInfo
	 */
	public UserJourneyInfo getJourneyInfo()
	{
		return getJourneyInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyProductInfo.journeyInfo</code> attribute. 
	 * @param value the journeyInfo
	 */
	public void setJourneyInfo(final SessionContext ctx, final UserJourneyInfo value)
	{
		JOURNEYINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyProductInfo.journeyInfo</code> attribute. 
	 * @param value the journeyInfo
	 */
	public void setJourneyInfo(final UserJourneyInfo value)
	{
		setJourneyInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyProductInfo.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyProductInfo.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyProductInfo.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyProductInfo.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyProductInfo.productDumpApproach</code> attribute.
	 * @return the productDumpApproach
	 */
	public String getProductDumpApproach(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTDUMPAPPROACH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyProductInfo.productDumpApproach</code> attribute.
	 * @return the productDumpApproach
	 */
	public String getProductDumpApproach()
	{
		return getProductDumpApproach( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyProductInfo.productDumpApproach</code> attribute. 
	 * @param value the productDumpApproach
	 */
	public void setProductDumpApproach(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTDUMPAPPROACH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyProductInfo.productDumpApproach</code> attribute. 
	 * @param value the productDumpApproach
	 */
	public void setProductDumpApproach(final String value)
	{
		setProductDumpApproach( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyProductInfo.productDumpValue</code> attribute.
	 * @return the productDumpValue
	 */
	public String getProductDumpValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTDUMPVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyProductInfo.productDumpValue</code> attribute.
	 * @return the productDumpValue
	 */
	public String getProductDumpValue()
	{
		return getProductDumpValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyProductInfo.productDumpValue</code> attribute. 
	 * @param value the productDumpValue
	 */
	public void setProductDumpValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTDUMPVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyProductInfo.productDumpValue</code> attribute. 
	 * @param value the productDumpValue
	 */
	public void setProductDumpValue(final String value)
	{
		setProductDumpValue( getSession().getSessionContext(), value );
	}
	
}
