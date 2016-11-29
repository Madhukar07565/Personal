/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AbstractCriteria;
import com.cnk.travelogix.client.config.core.jalo.TriggerEvent;
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
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.QuotationCriteria QuotationCriteria}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedQuotationCriteria extends AbstractCriteria
{
	/** Qualifier of the <code>QuotationCriteria.triggerEvent</code> attribute **/
	public static final String TRIGGEREVENT = "triggerEvent";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRIGGEREVENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedQuotationCriteria> TRIGGEREVENTHANDLER = new BidirectionalOneToManyHandler<GeneratedQuotationCriteria>(
	ClientconfigConstants.TC.QUOTATIONCRITERIA,
	false,
	"triggerEvent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCriteria.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TRIGGEREVENT, AttributeMode.INITIAL);
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
		TRIGGEREVENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuotationCriteria.triggerEvent</code> attribute.
	 * @return the triggerEvent
	 */
	public TriggerEvent getTriggerEvent(final SessionContext ctx)
	{
		return (TriggerEvent)getProperty( ctx, TRIGGEREVENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>QuotationCriteria.triggerEvent</code> attribute.
	 * @return the triggerEvent
	 */
	public TriggerEvent getTriggerEvent()
	{
		return getTriggerEvent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuotationCriteria.triggerEvent</code> attribute. 
	 * @param value the triggerEvent
	 */
	public void setTriggerEvent(final SessionContext ctx, final TriggerEvent value)
	{
		TRIGGEREVENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>QuotationCriteria.triggerEvent</code> attribute. 
	 * @param value the triggerEvent
	 */
	public void setTriggerEvent(final TriggerEvent value)
	{
		setTriggerEvent( getSession().getSessionContext(), value );
	}
	
}
