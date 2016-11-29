/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirCompanyAdvanceDefinition;
import com.cnk.travelogix.transportinventory.core.jalo.AirPenaltyChargesRelease;
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
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.AirCompanyPenaltyCharges AirCompanyPenaltyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirCompanyPenaltyCharges extends AirPenaltyChargesRelease
{
	/** Qualifier of the <code>AirCompanyPenaltyCharges.airCompanyAdvanceDefinition</code> attribute **/
	public static final String AIRCOMPANYADVANCEDEFINITION = "airCompanyAdvanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRCOMPANYADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirCompanyPenaltyCharges> AIRCOMPANYADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAirCompanyPenaltyCharges>(
	TransportinventorycoreConstants.TC.AIRCOMPANYPENALTYCHARGES,
	false,
	"airCompanyAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AirPenaltyChargesRelease.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(AIRCOMPANYADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyPenaltyCharges.airCompanyAdvanceDefinition</code> attribute.
	 * @return the airCompanyAdvanceDefinition
	 */
	public AirCompanyAdvanceDefinition getAirCompanyAdvanceDefinition(final SessionContext ctx)
	{
		return (AirCompanyAdvanceDefinition)getProperty( ctx, AIRCOMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirCompanyPenaltyCharges.airCompanyAdvanceDefinition</code> attribute.
	 * @return the airCompanyAdvanceDefinition
	 */
	public AirCompanyAdvanceDefinition getAirCompanyAdvanceDefinition()
	{
		return getAirCompanyAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyPenaltyCharges.airCompanyAdvanceDefinition</code> attribute. 
	 * @param value the airCompanyAdvanceDefinition
	 */
	public void setAirCompanyAdvanceDefinition(final SessionContext ctx, final AirCompanyAdvanceDefinition value)
	{
		AIRCOMPANYADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirCompanyPenaltyCharges.airCompanyAdvanceDefinition</code> attribute. 
	 * @param value the airCompanyAdvanceDefinition
	 */
	public void setAirCompanyAdvanceDefinition(final AirCompanyAdvanceDefinition value)
	{
		setAirCompanyAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRCOMPANYADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
