/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestPenaltyCharges;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInvSupplierAdvanceDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AirPenaltyChargesForAmendments AirPenaltyChargesForAmendments}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirPenaltyChargesForAmendments extends ChangeRequestPenaltyCharges
{
	/** Qualifier of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute **/
	public static final String FARECHARGESAPPLIEDTOINVENTORYUTILIZATION = "fareChargesAppliedToInventoryUtilization";
	/** Qualifier of the <code>AirPenaltyChargesForAmendments.airInventorySupplierAdvanceDefinition</code> attribute **/
	public static final String AIRINVENTORYSUPPLIERADVANCEDEFINITION = "airInventorySupplierAdvanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRINVENTORYSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirPenaltyChargesForAmendments> AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAirPenaltyChargesForAmendments>(
	TransportinventorycoreConstants.TC.AIRPENALTYCHARGESFORAMENDMENTS,
	false,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ChangeRequestPenaltyCharges.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FARECHARGESAPPLIEDTOINVENTORYUTILIZATION, AttributeMode.INITIAL);
		tmp.put(AIRINVENTORYSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPenaltyChargesForAmendments.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AirInvSupplierAdvanceDefinition)getProperty( ctx, AIRINVENTORYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPenaltyChargesForAmendments.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition()
	{
		return getAirInventorySupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPenaltyChargesForAmendments.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final AirInvSupplierAdvanceDefinition value)
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPenaltyChargesForAmendments.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final AirInvSupplierAdvanceDefinition value)
	{
		setAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute.
	 * @return the fareChargesAppliedToInventoryUtilization
	 */
	public Boolean isFareChargesAppliedToInventoryUtilization(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FARECHARGESAPPLIEDTOINVENTORYUTILIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute.
	 * @return the fareChargesAppliedToInventoryUtilization
	 */
	public Boolean isFareChargesAppliedToInventoryUtilization()
	{
		return isFareChargesAppliedToInventoryUtilization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @return the fareChargesAppliedToInventoryUtilization
	 */
	public boolean isFareChargesAppliedToInventoryUtilizationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFareChargesAppliedToInventoryUtilization( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @return the fareChargesAppliedToInventoryUtilization
	 */
	public boolean isFareChargesAppliedToInventoryUtilizationAsPrimitive()
	{
		return isFareChargesAppliedToInventoryUtilizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization
	 */
	public void setFareChargesAppliedToInventoryUtilization(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FARECHARGESAPPLIEDTOINVENTORYUTILIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization
	 */
	public void setFareChargesAppliedToInventoryUtilization(final Boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization
	 */
	public void setFareChargesAppliedToInventoryUtilization(final SessionContext ctx, final boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization
	 */
	public void setFareChargesAppliedToInventoryUtilization(final boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( getSession().getSessionContext(), value );
	}
	
}
