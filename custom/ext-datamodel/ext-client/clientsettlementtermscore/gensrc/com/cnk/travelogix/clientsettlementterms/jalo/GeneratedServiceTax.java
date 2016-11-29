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
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.clientsettlementterms.jalo.ServiceTax ServiceTax}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedServiceTax extends GenericItem
{
	/** Qualifier of the <code>ServiceTax.fromDate</code> attribute **/
	public static final String FROMDATE = "fromDate";
	/** Qualifier of the <code>ServiceTax.toDate</code> attribute **/
	public static final String TODATE = "toDate";
	/** Qualifier of the <code>ServiceTax.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>ServiceTax.commercialPayable</code> attribute **/
	public static final String COMMERCIALPAYABLE = "commercialPayable";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIALPAYABLE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedServiceTax> COMMERCIALPAYABLEHANDLER = new BidirectionalOneToManyHandler<GeneratedServiceTax>(
	ClientsettlementtermscoreConstants.TC.SERVICETAX,
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
		tmp.put(FROMDATE, AttributeMode.INITIAL);
		tmp.put(TODATE, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(COMMERCIALPAYABLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTax.commercialPayable</code> attribute.
	 * @return the commercialPayable
	 */
	public CommercialPayable getCommercialPayable(final SessionContext ctx)
	{
		return (CommercialPayable)getProperty( ctx, COMMERCIALPAYABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTax.commercialPayable</code> attribute.
	 * @return the commercialPayable
	 */
	public CommercialPayable getCommercialPayable()
	{
		return getCommercialPayable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTax.commercialPayable</code> attribute. 
	 * @param value the commercialPayable
	 */
	public void setCommercialPayable(final SessionContext ctx, final CommercialPayable value)
	{
		COMMERCIALPAYABLEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTax.commercialPayable</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>ServiceTax.fromDate</code> attribute.
	 * @return the fromDate - Service From Date
	 */
	public Date getFromDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FROMDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTax.fromDate</code> attribute.
	 * @return the fromDate - Service From Date
	 */
	public Date getFromDate()
	{
		return getFromDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTax.fromDate</code> attribute. 
	 * @param value the fromDate - Service From Date
	 */
	public void setFromDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FROMDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTax.fromDate</code> attribute. 
	 * @param value the fromDate - Service From Date
	 */
	public void setFromDate(final Date value)
	{
		setFromDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTax.percentage</code> attribute.
	 * @return the percentage - Percentage
	 */
	public BigDecimal getPercentage(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTax.percentage</code> attribute.
	 * @return the percentage - Percentage
	 */
	public BigDecimal getPercentage()
	{
		return getPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTax.percentage</code> attribute. 
	 * @param value the percentage - Percentage
	 */
	public void setPercentage(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTax.percentage</code> attribute. 
	 * @param value the percentage - Percentage
	 */
	public void setPercentage(final BigDecimal value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTax.toDate</code> attribute.
	 * @return the toDate - Service To Date
	 */
	public Date getToDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ServiceTax.toDate</code> attribute.
	 * @return the toDate - Service To Date
	 */
	public Date getToDate()
	{
		return getToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTax.toDate</code> attribute. 
	 * @param value the toDate - Service To Date
	 */
	public void setToDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ServiceTax.toDate</code> attribute. 
	 * @param value the toDate - Service To Date
	 */
	public void setToDate(final Date value)
	{
		setToDate( getSession().getSessionContext(), value );
	}
	
}
