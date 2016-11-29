/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import de.hybris.platform.cronjob.jalo.Trigger;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.SettlementPeriod SettlementPeriod}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSettlementPeriod extends GenericItem
{
	/** Qualifier of the <code>SettlementPeriod.fromDate</code> attribute **/
	public static final String FROMDATE = "fromDate";
	/** Qualifier of the <code>SettlementPeriod.toDate</code> attribute **/
	public static final String TODATE = "toDate";
	/** Qualifier of the <code>SettlementPeriod.trigger</code> attribute **/
	public static final String TRIGGER = "trigger";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRIGGER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSettlementPeriod> TRIGGERHANDLER = new BidirectionalOneToManyHandler<GeneratedSettlementPeriod>(
	SuppliersettlementtermscoreConstants.TC.SETTLEMENTPERIOD,
	false,
	"trigger",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FROMDATE, AttributeMode.INITIAL);
		tmp.put(TODATE, AttributeMode.INITIAL);
		tmp.put(TRIGGER, AttributeMode.INITIAL);
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
		TRIGGERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SettlementPeriod.fromDate</code> attribute.
	 * @return the fromDate
	 */
	public Date getFromDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FROMDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SettlementPeriod.fromDate</code> attribute.
	 * @return the fromDate
	 */
	public Date getFromDate()
	{
		return getFromDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SettlementPeriod.fromDate</code> attribute. 
	 * @param value the fromDate
	 */
	public void setFromDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FROMDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SettlementPeriod.fromDate</code> attribute. 
	 * @param value the fromDate
	 */
	public void setFromDate(final Date value)
	{
		setFromDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SettlementPeriod.toDate</code> attribute.
	 * @return the toDate
	 */
	public Date getToDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SettlementPeriod.toDate</code> attribute.
	 * @return the toDate
	 */
	public Date getToDate()
	{
		return getToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SettlementPeriod.toDate</code> attribute. 
	 * @param value the toDate
	 */
	public void setToDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SettlementPeriod.toDate</code> attribute. 
	 * @param value the toDate
	 */
	public void setToDate(final Date value)
	{
		setToDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SettlementPeriod.trigger</code> attribute.
	 * @return the trigger
	 */
	public Trigger getTrigger(final SessionContext ctx)
	{
		return (Trigger)getProperty( ctx, TRIGGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SettlementPeriod.trigger</code> attribute.
	 * @return the trigger
	 */
	public Trigger getTrigger()
	{
		return getTrigger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SettlementPeriod.trigger</code> attribute. 
	 * @param value the trigger
	 */
	public void setTrigger(final SessionContext ctx, final Trigger value)
	{
		TRIGGERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SettlementPeriod.trigger</code> attribute. 
	 * @param value the trigger
	 */
	public void setTrigger(final Trigger value)
	{
		setTrigger( getSession().getSessionContext(), value );
	}
	
}
