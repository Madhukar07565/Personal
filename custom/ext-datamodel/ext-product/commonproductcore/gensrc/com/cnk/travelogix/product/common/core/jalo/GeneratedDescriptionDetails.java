/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.DescriptionDetails DescriptionDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDescriptionDetails extends GenericItem
{
	/** Qualifier of the <code>DescriptionDetails.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>DescriptionDetails.fromToDate</code> attribute **/
	public static final String FROMTODATE = "fromToDate";
	/** Qualifier of the <code>DescriptionDetails.source</code> attribute **/
	public static final String SOURCE = "source";
	/** Qualifier of the <code>DescriptionDetails.productShortDescription</code> attribute **/
	public static final String PRODUCTSHORTDESCRIPTION = "productShortDescription";
	/** Qualifier of the <code>DescriptionDetails.productLongDescription</code> attribute **/
	public static final String PRODUCTLONGDESCRIPTION = "productLongDescription";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCTSHORTDESCRIPTION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDescriptionDetails> PRODUCTSHORTDESCRIPTIONHANDLER = new BidirectionalOneToManyHandler<GeneratedDescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	false,
	"productShortDescription",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCTLONGDESCRIPTION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDescriptionDetails> PRODUCTLONGDESCRIPTIONHANDLER = new BidirectionalOneToManyHandler<GeneratedDescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	false,
	"productLongDescription",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(FROMTODATE, AttributeMode.INITIAL);
		tmp.put(SOURCE, AttributeMode.INITIAL);
		tmp.put(PRODUCTSHORTDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PRODUCTLONGDESCRIPTION, AttributeMode.INITIAL);
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
		PRODUCTSHORTDESCRIPTIONHANDLER.newInstance(ctx, allAttributes);
		PRODUCTLONGDESCRIPTIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDescriptionDetails.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDescriptionDetails.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.fromToDate</code> attribute.
	 * @return the fromToDate - From Date
	 */
	public StandardDateRange getFromToDate(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, FROMTODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.fromToDate</code> attribute.
	 * @return the fromToDate - From Date
	 */
	public StandardDateRange getFromToDate()
	{
		return getFromToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.fromToDate</code> attribute. 
	 * @param value the fromToDate - From Date
	 */
	public void setFromToDate(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, FROMTODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.fromToDate</code> attribute. 
	 * @param value the fromToDate - From Date
	 */
	public void setFromToDate(final StandardDateRange value)
	{
		setFromToDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.productLongDescription</code> attribute.
	 * @return the productLongDescription
	 */
	public Product getProductLongDescription(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCTLONGDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.productLongDescription</code> attribute.
	 * @return the productLongDescription
	 */
	public Product getProductLongDescription()
	{
		return getProductLongDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.productLongDescription</code> attribute. 
	 * @param value the productLongDescription
	 */
	public void setProductLongDescription(final SessionContext ctx, final Product value)
	{
		PRODUCTLONGDESCRIPTIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.productLongDescription</code> attribute. 
	 * @param value the productLongDescription
	 */
	public void setProductLongDescription(final Product value)
	{
		setProductLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.productShortDescription</code> attribute.
	 * @return the productShortDescription
	 */
	public Product getProductShortDescription(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCTSHORTDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.productShortDescription</code> attribute.
	 * @return the productShortDescription
	 */
	public Product getProductShortDescription()
	{
		return getProductShortDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.productShortDescription</code> attribute. 
	 * @param value the productShortDescription
	 */
	public void setProductShortDescription(final SessionContext ctx, final Product value)
	{
		PRODUCTSHORTDESCRIPTIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.productShortDescription</code> attribute. 
	 * @param value the productShortDescription
	 */
	public void setProductShortDescription(final Product value)
	{
		setProductShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.source</code> attribute.
	 * @return the source - Source
	 */
	public String getSource(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOURCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DescriptionDetails.source</code> attribute.
	 * @return the source - Source
	 */
	public String getSource()
	{
		return getSource( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.source</code> attribute. 
	 * @param value the source - Source
	 */
	public void setSource(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOURCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DescriptionDetails.source</code> attribute. 
	 * @param value the source - Source
	 */
	public void setSource(final String value)
	{
		setSource( getSession().getSessionContext(), value );
	}
	
}
