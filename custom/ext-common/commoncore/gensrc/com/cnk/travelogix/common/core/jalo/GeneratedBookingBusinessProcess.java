/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.order.AbstractOrderEntry;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.orderprocessing.jalo.OrderProcess;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.processengine.jalo.BusinessProcess BookingBusinessProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBookingBusinessProcess extends BusinessProcess
{
	/** Qualifier of the <code>BookingBusinessProcess.orderEntries</code> attribute **/
	public static final String ORDERENTRIES = "orderEntries";
	/** Qualifier of the <code>BookingBusinessProcess.done</code> attribute **/
	public static final String DONE = "done";
	/** Qualifier of the <code>BookingBusinessProcess.parentProcess</code> attribute **/
	public static final String PARENTPROCESS = "parentProcess";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PARENTPROCESS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBookingBusinessProcess> PARENTPROCESSHANDLER = new BidirectionalOneToManyHandler<GeneratedBookingBusinessProcess>(
	CommonCoreConstants.TC.BOOKINGBUSINESSPROCESS,
	false,
	"parentProcess",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ORDERENTRIES, AttributeMode.INITIAL);
		tmp.put(DONE, AttributeMode.INITIAL);
		tmp.put(PARENTPROCESS, AttributeMode.INITIAL);
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
		PARENTPROCESSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingBusinessProcess.done</code> attribute.
	 * @return the done - Mark process as done
	 */
	public Boolean isDone(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingBusinessProcess.done</code> attribute.
	 * @return the done - Mark process as done
	 */
	public Boolean isDone()
	{
		return isDone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingBusinessProcess.done</code> attribute. 
	 * @return the done - Mark process as done
	 */
	public boolean isDoneAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDone( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingBusinessProcess.done</code> attribute. 
	 * @return the done - Mark process as done
	 */
	public boolean isDoneAsPrimitive()
	{
		return isDoneAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingBusinessProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingBusinessProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final Boolean value)
	{
		setDone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingBusinessProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final SessionContext ctx, final boolean value)
	{
		setDone( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingBusinessProcess.done</code> attribute. 
	 * @param value the done - Mark process as done
	 */
	public void setDone(final boolean value)
	{
		setDone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingBusinessProcess.orderEntries</code> attribute.
	 * @return the orderEntries
	 */
	public List<AbstractOrderEntry> getOrderEntries(final SessionContext ctx)
	{
		List<AbstractOrderEntry> coll = (List<AbstractOrderEntry>)getProperty( ctx, ORDERENTRIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingBusinessProcess.orderEntries</code> attribute.
	 * @return the orderEntries
	 */
	public List<AbstractOrderEntry> getOrderEntries()
	{
		return getOrderEntries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingBusinessProcess.orderEntries</code> attribute. 
	 * @param value the orderEntries
	 */
	public void setOrderEntries(final SessionContext ctx, final List<AbstractOrderEntry> value)
	{
		setProperty(ctx, ORDERENTRIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingBusinessProcess.orderEntries</code> attribute. 
	 * @param value the orderEntries
	 */
	public void setOrderEntries(final List<AbstractOrderEntry> value)
	{
		setOrderEntries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingBusinessProcess.parentProcess</code> attribute.
	 * @return the parentProcess
	 */
	public OrderProcess getParentProcess(final SessionContext ctx)
	{
		return (OrderProcess)getProperty( ctx, PARENTPROCESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingBusinessProcess.parentProcess</code> attribute.
	 * @return the parentProcess
	 */
	public OrderProcess getParentProcess()
	{
		return getParentProcess( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingBusinessProcess.parentProcess</code> attribute. 
	 * @param value the parentProcess
	 */
	public void setParentProcess(final SessionContext ctx, final OrderProcess value)
	{
		PARENTPROCESSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingBusinessProcess.parentProcess</code> attribute. 
	 * @param value the parentProcess
	 */
	public void setParentProcess(final OrderProcess value)
	{
		setParentProcess( getSession().getSessionContext(), value );
	}
	
}
