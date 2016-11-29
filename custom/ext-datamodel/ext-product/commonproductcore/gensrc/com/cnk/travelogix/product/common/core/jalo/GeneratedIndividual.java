/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.AbstractPriceRetention;
import com.cnk.travelogix.product.common.core.jalo.PriceRetention;
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
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Individual Individual}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedIndividual extends AbstractPriceRetention
{
	/** Qualifier of the <code>Individual.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>Individual.priceRetention</code> attribute **/
	public static final String PRICERETENTION = "priceRetention";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRICERETENTION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedIndividual> PRICERETENTIONHANDLER = new BidirectionalOneToManyHandler<GeneratedIndividual>(
	CommonproductcoreConstants.TC.INDIVIDUAL,
	false,
	"priceRetention",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPriceRetention.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(PRICERETENTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.category</code> attribute.
	 * @return the category - This will be Product Category SubType
	 */
	public ProductCategorySubType getCategory(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.category</code> attribute.
	 * @return the category - This will be Product Category SubType
	 */
	public ProductCategorySubType getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.category</code> attribute. 
	 * @param value the category - This will be Product Category SubType
	 */
	public void setCategory(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.category</code> attribute. 
	 * @param value the category - This will be Product Category SubType
	 */
	public void setCategory(final ProductCategorySubType value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRICERETENTIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.priceRetention</code> attribute.
	 * @return the priceRetention
	 */
	public PriceRetention getPriceRetention(final SessionContext ctx)
	{
		return (PriceRetention)getProperty( ctx, PRICERETENTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Individual.priceRetention</code> attribute.
	 * @return the priceRetention
	 */
	public PriceRetention getPriceRetention()
	{
		return getPriceRetention( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.priceRetention</code> attribute. 
	 * @param value the priceRetention
	 */
	public void setPriceRetention(final SessionContext ctx, final PriceRetention value)
	{
		PRICERETENTIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Individual.priceRetention</code> attribute. 
	 * @param value the priceRetention
	 */
	public void setPriceRetention(final PriceRetention value)
	{
		setPriceRetention( getSession().getSessionContext(), value );
	}
	
}
