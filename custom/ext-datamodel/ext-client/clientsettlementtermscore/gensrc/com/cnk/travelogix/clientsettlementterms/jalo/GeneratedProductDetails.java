/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.clientsettlementterms.jalo;

import com.cnk.travelogix.client.settlementterms.constants.ClientsettlementtermscoreConstants;
import com.cnk.travelogix.clientsettlementterms.jalo.CommercialPayable;
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
 * Generated class for type {@link com.cnk.travelogix.clientsettlementterms.jalo.ProductDetails BalanceDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProductDetails extends GenericItem
{
	/** Qualifier of the <code>BalanceDetails.balanceAmountPercentage</code> attribute **/
	public static final String BALANCEAMOUNTPERCENTAGE = "balanceAmountPercentage";
	/** Qualifier of the <code>BalanceDetails.payInDays</code> attribute **/
	public static final String PAYINDAYS = "payInDays";
	/** Qualifier of the <code>BalanceDetails.commercialPayable</code> attribute **/
	public static final String COMMERCIALPAYABLE = "commercialPayable";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIALPAYABLE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedProductDetails> COMMERCIALPAYABLEHANDLER = new BidirectionalOneToManyHandler<GeneratedProductDetails>(
	ClientsettlementtermscoreConstants.TC.BALANCEDETAILS,
	false,
	"commercialPayable",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BALANCEAMOUNTPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(PAYINDAYS, AttributeMode.INITIAL);
		tmp.put(COMMERCIALPAYABLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.balanceAmountPercentage</code> attribute.
	 * @return the balanceAmountPercentage - Balance Amount
	 */
	public Integer getBalanceAmountPercentage(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BALANCEAMOUNTPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.balanceAmountPercentage</code> attribute.
	 * @return the balanceAmountPercentage - Balance Amount
	 */
	public Integer getBalanceAmountPercentage()
	{
		return getBalanceAmountPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.balanceAmountPercentage</code> attribute. 
	 * @return the balanceAmountPercentage - Balance Amount
	 */
	public int getBalanceAmountPercentageAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBalanceAmountPercentage( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.balanceAmountPercentage</code> attribute. 
	 * @return the balanceAmountPercentage - Balance Amount
	 */
	public int getBalanceAmountPercentageAsPrimitive()
	{
		return getBalanceAmountPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.balanceAmountPercentage</code> attribute. 
	 * @param value the balanceAmountPercentage - Balance Amount
	 */
	public void setBalanceAmountPercentage(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BALANCEAMOUNTPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.balanceAmountPercentage</code> attribute. 
	 * @param value the balanceAmountPercentage - Balance Amount
	 */
	public void setBalanceAmountPercentage(final Integer value)
	{
		setBalanceAmountPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.balanceAmountPercentage</code> attribute. 
	 * @param value the balanceAmountPercentage - Balance Amount
	 */
	public void setBalanceAmountPercentage(final SessionContext ctx, final int value)
	{
		setBalanceAmountPercentage( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.balanceAmountPercentage</code> attribute. 
	 * @param value the balanceAmountPercentage - Balance Amount
	 */
	public void setBalanceAmountPercentage(final int value)
	{
		setBalanceAmountPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.commercialPayable</code> attribute.
	 * @return the commercialPayable
	 */
	public CommercialPayable getCommercialPayable(final SessionContext ctx)
	{
		return (CommercialPayable)getProperty( ctx, COMMERCIALPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.commercialPayable</code> attribute.
	 * @return the commercialPayable
	 */
	public CommercialPayable getCommercialPayable()
	{
		return getCommercialPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.commercialPayable</code> attribute. 
	 * @param value the commercialPayable
	 */
	public void setCommercialPayable(final SessionContext ctx, final CommercialPayable value)
	{
		COMMERCIALPAYABLEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.commercialPayable</code> attribute. 
	 * @param value the commercialPayable
	 */
	public void setCommercialPayable(final CommercialPayable value)
	{
		setCommercialPayable( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMERCIALPAYABLEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.payInDays</code> attribute.
	 * @return the payInDays - Pay In Days
	 */
	public Integer getPayInDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PAYINDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.payInDays</code> attribute.
	 * @return the payInDays - Pay In Days
	 */
	public Integer getPayInDays()
	{
		return getPayInDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.payInDays</code> attribute. 
	 * @return the payInDays - Pay In Days
	 */
	public int getPayInDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPayInDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BalanceDetails.payInDays</code> attribute. 
	 * @return the payInDays - Pay In Days
	 */
	public int getPayInDaysAsPrimitive()
	{
		return getPayInDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.payInDays</code> attribute. 
	 * @param value the payInDays - Pay In Days
	 */
	public void setPayInDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PAYINDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.payInDays</code> attribute. 
	 * @param value the payInDays - Pay In Days
	 */
	public void setPayInDays(final Integer value)
	{
		setPayInDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.payInDays</code> attribute. 
	 * @param value the payInDays - Pay In Days
	 */
	public void setPayInDays(final SessionContext ctx, final int value)
	{
		setPayInDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BalanceDetails.payInDays</code> attribute. 
	 * @param value the payInDays - Pay In Days
	 */
	public void setPayInDays(final int value)
	{
		setPayInDays( getSession().getSessionContext(), value );
	}
	
}
