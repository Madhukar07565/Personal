/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.ClientCompanyCommercialDetail;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.MarkUpCompanyCommercial MarkUpCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMarkUpCompanyCommercial extends AbstractCompanyCommercial
{
	/** Qualifier of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute **/
	public static final String COMPANYMINSELLINGPRICE = "companyMinSellingPrice";
	/** Qualifier of the <code>MarkUpCompanyCommercial.companyMinSellingCurrency</code> attribute **/
	public static final String COMPANYMINSELLINGCURRENCY = "companyMinSellingCurrency";
	/** Qualifier of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute **/
	public static final String CLIENTMINSELLINGPRICE = "clientMinSellingPrice";
	/** Qualifier of the <code>MarkUpCompanyCommercial.clientMinSellingCurrency</code> attribute **/
	public static final String CLIENTMINSELLINGCURRENCY = "clientMinSellingCurrency";
	/** Qualifier of the <code>MarkUpCompanyCommercial.clientCompanyCommercialDetail</code> attribute **/
	public static final String CLIENTCOMPANYCOMMERCIALDETAIL = "clientCompanyCommercialDetail";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENTCOMPANYCOMMERCIALDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMarkUpCompanyCommercial> CLIENTCOMPANYCOMMERCIALDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedMarkUpCompanyCommercial>(
	ClientcommercialsConstants.TC.MARKUPCOMPANYCOMMERCIAL,
	false,
	"clientCompanyCommercialDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPANYMINSELLINGPRICE, AttributeMode.INITIAL);
		tmp.put(COMPANYMINSELLINGCURRENCY, AttributeMode.INITIAL);
		tmp.put(CLIENTMINSELLINGPRICE, AttributeMode.INITIAL);
		tmp.put(CLIENTMINSELLINGCURRENCY, AttributeMode.INITIAL);
		tmp.put(CLIENTCOMPANYCOMMERCIALDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.clientCompanyCommercialDetail</code> attribute.
	 * @return the clientCompanyCommercialDetail
	 */
	public ClientCompanyCommercialDetail getClientCompanyCommercialDetail(final SessionContext ctx)
	{
		return (ClientCompanyCommercialDetail)getProperty( ctx, CLIENTCOMPANYCOMMERCIALDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.clientCompanyCommercialDetail</code> attribute.
	 * @return the clientCompanyCommercialDetail
	 */
	public ClientCompanyCommercialDetail getClientCompanyCommercialDetail()
	{
		return getClientCompanyCommercialDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.clientCompanyCommercialDetail</code> attribute. 
	 * @param value the clientCompanyCommercialDetail
	 */
	public void setClientCompanyCommercialDetail(final SessionContext ctx, final ClientCompanyCommercialDetail value)
	{
		CLIENTCOMPANYCOMMERCIALDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.clientCompanyCommercialDetail</code> attribute. 
	 * @param value the clientCompanyCommercialDetail
	 */
	public void setClientCompanyCommercialDetail(final ClientCompanyCommercialDetail value)
	{
		setClientCompanyCommercialDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.clientMinSellingCurrency</code> attribute.
	 * @return the clientMinSellingCurrency
	 */
	public Currency getClientMinSellingCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CLIENTMINSELLINGCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.clientMinSellingCurrency</code> attribute.
	 * @return the clientMinSellingCurrency
	 */
	public Currency getClientMinSellingCurrency()
	{
		return getClientMinSellingCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.clientMinSellingCurrency</code> attribute. 
	 * @param value the clientMinSellingCurrency
	 */
	public void setClientMinSellingCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CLIENTMINSELLINGCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.clientMinSellingCurrency</code> attribute. 
	 * @param value the clientMinSellingCurrency
	 */
	public void setClientMinSellingCurrency(final Currency value)
	{
		setClientMinSellingCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute.
	 * @return the clientMinSellingPrice
	 */
	public Double getClientMinSellingPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CLIENTMINSELLINGPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute.
	 * @return the clientMinSellingPrice
	 */
	public Double getClientMinSellingPrice()
	{
		return getClientMinSellingPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute. 
	 * @return the clientMinSellingPrice
	 */
	public double getClientMinSellingPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getClientMinSellingPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute. 
	 * @return the clientMinSellingPrice
	 */
	public double getClientMinSellingPriceAsPrimitive()
	{
		return getClientMinSellingPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute. 
	 * @param value the clientMinSellingPrice
	 */
	public void setClientMinSellingPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CLIENTMINSELLINGPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute. 
	 * @param value the clientMinSellingPrice
	 */
	public void setClientMinSellingPrice(final Double value)
	{
		setClientMinSellingPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute. 
	 * @param value the clientMinSellingPrice
	 */
	public void setClientMinSellingPrice(final SessionContext ctx, final double value)
	{
		setClientMinSellingPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.clientMinSellingPrice</code> attribute. 
	 * @param value the clientMinSellingPrice
	 */
	public void setClientMinSellingPrice(final double value)
	{
		setClientMinSellingPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.companyMinSellingCurrency</code> attribute.
	 * @return the companyMinSellingCurrency
	 */
	public Currency getCompanyMinSellingCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, COMPANYMINSELLINGCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.companyMinSellingCurrency</code> attribute.
	 * @return the companyMinSellingCurrency
	 */
	public Currency getCompanyMinSellingCurrency()
	{
		return getCompanyMinSellingCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.companyMinSellingCurrency</code> attribute. 
	 * @param value the companyMinSellingCurrency
	 */
	public void setCompanyMinSellingCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, COMPANYMINSELLINGCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.companyMinSellingCurrency</code> attribute. 
	 * @param value the companyMinSellingCurrency
	 */
	public void setCompanyMinSellingCurrency(final Currency value)
	{
		setCompanyMinSellingCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute.
	 * @return the companyMinSellingPrice
	 */
	public Double getCompanyMinSellingPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, COMPANYMINSELLINGPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute.
	 * @return the companyMinSellingPrice
	 */
	public Double getCompanyMinSellingPrice()
	{
		return getCompanyMinSellingPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute. 
	 * @return the companyMinSellingPrice
	 */
	public double getCompanyMinSellingPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getCompanyMinSellingPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute. 
	 * @return the companyMinSellingPrice
	 */
	public double getCompanyMinSellingPriceAsPrimitive()
	{
		return getCompanyMinSellingPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute. 
	 * @param value the companyMinSellingPrice
	 */
	public void setCompanyMinSellingPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, COMPANYMINSELLINGPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute. 
	 * @param value the companyMinSellingPrice
	 */
	public void setCompanyMinSellingPrice(final Double value)
	{
		setCompanyMinSellingPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute. 
	 * @param value the companyMinSellingPrice
	 */
	public void setCompanyMinSellingPrice(final SessionContext ctx, final double value)
	{
		setCompanyMinSellingPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MarkUpCompanyCommercial.companyMinSellingPrice</code> attribute. 
	 * @param value the companyMinSellingPrice
	 */
	public void setCompanyMinSellingPrice(final double value)
	{
		setCompanyMinSellingPrice( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTCOMPANYCOMMERCIALDETAILHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
