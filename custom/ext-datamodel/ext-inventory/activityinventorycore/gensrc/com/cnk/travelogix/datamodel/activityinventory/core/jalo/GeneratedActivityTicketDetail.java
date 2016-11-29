/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.activityinventory.core.jalo;

import com.cnk.travelogix.activity.inventory.core.constants.ActivityinventorycoreConstants;
import com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityInventoryDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.activityinventory.core.jalo.ActivityTicketDetail ActivityTicketDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityTicketDetail extends ActivityInventoryDetail
{
	/** Qualifier of the <code>ActivityTicketDetail.ticketType</code> attribute **/
	public static final String TICKETTYPE = "ticketType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ActivityInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TICKETTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityTicketDetail.ticketType</code> attribute.
	 * @return the ticketType - Ticket Type
	 */
	public EnumerationValue getTicketType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TICKETTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityTicketDetail.ticketType</code> attribute.
	 * @return the ticketType - Ticket Type
	 */
	public EnumerationValue getTicketType()
	{
		return getTicketType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityTicketDetail.ticketType</code> attribute. 
	 * @param value the ticketType - Ticket Type
	 */
	public void setTicketType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TICKETTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityTicketDetail.ticketType</code> attribute. 
	 * @param value the ticketType - Ticket Type
	 */
	public void setTicketType(final EnumerationValue value)
	{
		setTicketType( getSession().getSessionContext(), value );
	}
	
}
