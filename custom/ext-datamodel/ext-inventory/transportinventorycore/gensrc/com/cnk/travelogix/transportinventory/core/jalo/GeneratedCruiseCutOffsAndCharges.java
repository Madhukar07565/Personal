/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.CutOffsAndCharges;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.CruisePenaltyCharges;
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
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.CruiseCutOffsAndCharges CruiseCutOffsAndCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseCutOffsAndCharges extends CutOffsAndCharges
{
	/** Qualifier of the <code>CruiseCutOffsAndCharges.cruisePenaltyCharges</code> attribute **/
	public static final String CRUISEPENALTYCHARGES = "cruisePenaltyCharges";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEPENALTYCHARGES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruiseCutOffsAndCharges> CRUISEPENALTYCHARGESHANDLER = new BidirectionalOneToManyHandler<GeneratedCruiseCutOffsAndCharges>(
	TransportinventorycoreConstants.TC.CRUISECUTOFFSANDCHARGES,
	false,
	"cruisePenaltyCharges",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CutOffsAndCharges.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CRUISEPENALTYCHARGES, AttributeMode.INITIAL);
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
		CRUISEPENALTYCHARGESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseCutOffsAndCharges.cruisePenaltyCharges</code> attribute.
	 * @return the cruisePenaltyCharges
	 */
	public CruisePenaltyCharges getCruisePenaltyCharges(final SessionContext ctx)
	{
		return (CruisePenaltyCharges)getProperty( ctx, CRUISEPENALTYCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseCutOffsAndCharges.cruisePenaltyCharges</code> attribute.
	 * @return the cruisePenaltyCharges
	 */
	public CruisePenaltyCharges getCruisePenaltyCharges()
	{
		return getCruisePenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseCutOffsAndCharges.cruisePenaltyCharges</code> attribute. 
	 * @param value the cruisePenaltyCharges
	 */
	public void setCruisePenaltyCharges(final SessionContext ctx, final CruisePenaltyCharges value)
	{
		CRUISEPENALTYCHARGESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseCutOffsAndCharges.cruisePenaltyCharges</code> attribute. 
	 * @param value the cruisePenaltyCharges
	 */
	public void setCruisePenaltyCharges(final CruisePenaltyCharges value)
	{
		setCruisePenaltyCharges( getSession().getSessionContext(), value );
	}
	
}
