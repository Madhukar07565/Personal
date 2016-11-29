/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.core.supplier.jalo;

import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.ROE;
import de.hybris.platform.jalo.GenericItem;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.core.supplier.jalo.ROEDetails ROEDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedROEDetails extends GenericItem
{
	/** Qualifier of the <code>ROEDetails.fromCurrency</code> attribute **/
	public static final String FROMCURRENCY = "fromCurrency";
	/** Qualifier of the <code>ROEDetails.toCurrency</code> attribute **/
	public static final String TOCURRENCY = "toCurrency";
	/** Qualifier of the <code>ROEDetails.roe</code> attribute **/
	public static final String ROE = "roe";
	/** Qualifier of the <code>ROEDetails.buyingROE</code> attribute **/
	public static final String BUYINGROE = "buyingROE";
	/** Qualifier of the <code>ROEDetails.sellingROE</code> attribute **/
	public static final String SELLINGROE = "sellingROE";
	/** Qualifier of the <code>ROEDetails.meanROE</code> attribute **/
	public static final String MEANROE = "meanROE";
	/** Qualifier of the <code>ROEDetails.roeies</code> attribute **/
	public static final String ROEIES = "roeies";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ROEIES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedROEDetails> ROEIESHANDLER = new BidirectionalOneToManyHandler<GeneratedROEDetails>(
	SuppliercoreConstants.TC.ROEDETAILS,
	false,
	"roeies",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FROMCURRENCY, AttributeMode.INITIAL);
		tmp.put(TOCURRENCY, AttributeMode.INITIAL);
		tmp.put(ROE, AttributeMode.INITIAL);
		tmp.put(BUYINGROE, AttributeMode.INITIAL);
		tmp.put(SELLINGROE, AttributeMode.INITIAL);
		tmp.put(MEANROE, AttributeMode.INITIAL);
		tmp.put(ROEIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.buyingROE</code> attribute.
	 * @return the buyingROE
	 */
	public Double getBuyingROE(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, BUYINGROE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.buyingROE</code> attribute.
	 * @return the buyingROE
	 */
	public Double getBuyingROE()
	{
		return getBuyingROE( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.buyingROE</code> attribute. 
	 * @return the buyingROE
	 */
	public double getBuyingROEAsPrimitive(final SessionContext ctx)
	{
		Double value = getBuyingROE( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.buyingROE</code> attribute. 
	 * @return the buyingROE
	 */
	public double getBuyingROEAsPrimitive()
	{
		return getBuyingROEAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.buyingROE</code> attribute. 
	 * @param value the buyingROE
	 */
	public void setBuyingROE(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, BUYINGROE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.buyingROE</code> attribute. 
	 * @param value the buyingROE
	 */
	public void setBuyingROE(final Double value)
	{
		setBuyingROE( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.buyingROE</code> attribute. 
	 * @param value the buyingROE
	 */
	public void setBuyingROE(final SessionContext ctx, final double value)
	{
		setBuyingROE( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.buyingROE</code> attribute. 
	 * @param value the buyingROE
	 */
	public void setBuyingROE(final double value)
	{
		setBuyingROE( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ROEIESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.fromCurrency</code> attribute.
	 * @return the fromCurrency
	 */
	public Currency getFromCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, FROMCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.fromCurrency</code> attribute.
	 * @return the fromCurrency
	 */
	public Currency getFromCurrency()
	{
		return getFromCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.fromCurrency</code> attribute. 
	 * @param value the fromCurrency
	 */
	public void setFromCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, FROMCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.fromCurrency</code> attribute. 
	 * @param value the fromCurrency
	 */
	public void setFromCurrency(final Currency value)
	{
		setFromCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.meanROE</code> attribute.
	 * @return the meanROE
	 */
	public Double getMeanROE(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MEANROE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.meanROE</code> attribute.
	 * @return the meanROE
	 */
	public Double getMeanROE()
	{
		return getMeanROE( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.meanROE</code> attribute. 
	 * @return the meanROE
	 */
	public double getMeanROEAsPrimitive(final SessionContext ctx)
	{
		Double value = getMeanROE( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.meanROE</code> attribute. 
	 * @return the meanROE
	 */
	public double getMeanROEAsPrimitive()
	{
		return getMeanROEAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.meanROE</code> attribute. 
	 * @param value the meanROE
	 */
	public void setMeanROE(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MEANROE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.meanROE</code> attribute. 
	 * @param value the meanROE
	 */
	public void setMeanROE(final Double value)
	{
		setMeanROE( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.meanROE</code> attribute. 
	 * @param value the meanROE
	 */
	public void setMeanROE(final SessionContext ctx, final double value)
	{
		setMeanROE( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.meanROE</code> attribute. 
	 * @param value the meanROE
	 */
	public void setMeanROE(final double value)
	{
		setMeanROE( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.roe</code> attribute.
	 * @return the roe
	 */
	public Double getRoe(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ROE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.roe</code> attribute.
	 * @return the roe
	 */
	public Double getRoe()
	{
		return getRoe( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.roe</code> attribute. 
	 * @return the roe
	 */
	public double getRoeAsPrimitive(final SessionContext ctx)
	{
		Double value = getRoe( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.roe</code> attribute. 
	 * @return the roe
	 */
	public double getRoeAsPrimitive()
	{
		return getRoeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ROE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final Double value)
	{
		setRoe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final SessionContext ctx, final double value)
	{
		setRoe( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.roe</code> attribute. 
	 * @param value the roe
	 */
	public void setRoe(final double value)
	{
		setRoe( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.roeies</code> attribute.
	 * @return the roeies
	 */
	public ROE getRoeies(final SessionContext ctx)
	{
		return (ROE)getProperty( ctx, ROEIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.roeies</code> attribute.
	 * @return the roeies
	 */
	public ROE getRoeies()
	{
		return getRoeies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.roeies</code> attribute. 
	 * @param value the roeies
	 */
	public void setRoeies(final SessionContext ctx, final ROE value)
	{
		ROEIESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.roeies</code> attribute. 
	 * @param value the roeies
	 */
	public void setRoeies(final ROE value)
	{
		setRoeies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.sellingROE</code> attribute.
	 * @return the sellingROE
	 */
	public Double getSellingROE(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, SELLINGROE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.sellingROE</code> attribute.
	 * @return the sellingROE
	 */
	public Double getSellingROE()
	{
		return getSellingROE( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.sellingROE</code> attribute. 
	 * @return the sellingROE
	 */
	public double getSellingROEAsPrimitive(final SessionContext ctx)
	{
		Double value = getSellingROE( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.sellingROE</code> attribute. 
	 * @return the sellingROE
	 */
	public double getSellingROEAsPrimitive()
	{
		return getSellingROEAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.sellingROE</code> attribute. 
	 * @param value the sellingROE
	 */
	public void setSellingROE(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, SELLINGROE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.sellingROE</code> attribute. 
	 * @param value the sellingROE
	 */
	public void setSellingROE(final Double value)
	{
		setSellingROE( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.sellingROE</code> attribute. 
	 * @param value the sellingROE
	 */
	public void setSellingROE(final SessionContext ctx, final double value)
	{
		setSellingROE( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.sellingROE</code> attribute. 
	 * @param value the sellingROE
	 */
	public void setSellingROE(final double value)
	{
		setSellingROE( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.toCurrency</code> attribute.
	 * @return the toCurrency
	 */
	public Currency getToCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, TOCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROEDetails.toCurrency</code> attribute.
	 * @return the toCurrency
	 */
	public Currency getToCurrency()
	{
		return getToCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.toCurrency</code> attribute. 
	 * @param value the toCurrency
	 */
	public void setToCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, TOCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROEDetails.toCurrency</code> attribute. 
	 * @param value the toCurrency
	 */
	public void setToCurrency(final Currency value)
	{
		setToCurrency( getSession().getSessionContext(), value );
	}
	
}
