/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestPenaltyCharges;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AccoPenaltyChargesForAmendments AccoPenaltyChargesForAmendments}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoPenaltyChargesForAmendments extends ChangeRequestPenaltyCharges
{
	/** Qualifier of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute **/
	public static final String FARECHARGESAPPLIEDTOINVENTORYUTILIZATION = "fareChargesAppliedToInventoryUtilization";
	/** Qualifier of the <code>AccoPenaltyChargesForAmendments.accoSupplierAdvanceDefinition</code> attribute **/
	public static final String ACCOSUPPLIERADVANCEDEFINITION = "accoSupplierAdvanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoPenaltyChargesForAmendments> ACCOSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoPenaltyChargesForAmendments>(
	AccoinventorycoreConstants.TC.ACCOPENALTYCHARGESFORAMENDMENTS,
	false,
	"accoSupplierAdvanceDefinition",
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
		tmp.put(ACCOSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesForAmendments.accoSupplierAdvanceDefinition</code> attribute.
	 * @return the accoSupplierAdvanceDefinition
	 */
	public AccoSupplierAdvanceDefinition getAccoSupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AccoSupplierAdvanceDefinition)getProperty( ctx, ACCOSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesForAmendments.accoSupplierAdvanceDefinition</code> attribute.
	 * @return the accoSupplierAdvanceDefinition
	 */
	public AccoSupplierAdvanceDefinition getAccoSupplierAdvanceDefinition()
	{
		return getAccoSupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesForAmendments.accoSupplierAdvanceDefinition</code> attribute. 
	 * @param value the accoSupplierAdvanceDefinition
	 */
	public void setAccoSupplierAdvanceDefinition(final SessionContext ctx, final AccoSupplierAdvanceDefinition value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesForAmendments.accoSupplierAdvanceDefinition</code> attribute. 
	 * @param value the accoSupplierAdvanceDefinition
	 */
	public void setAccoSupplierAdvanceDefinition(final AccoSupplierAdvanceDefinition value)
	{
		setAccoSupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOSUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute.
	 * @return the fareChargesAppliedToInventoryUtilization - Room Category
	 */
	public Boolean isFareChargesAppliedToInventoryUtilization(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FARECHARGESAPPLIEDTOINVENTORYUTILIZATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute.
	 * @return the fareChargesAppliedToInventoryUtilization - Room Category
	 */
	public Boolean isFareChargesAppliedToInventoryUtilization()
	{
		return isFareChargesAppliedToInventoryUtilization( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @return the fareChargesAppliedToInventoryUtilization - Room Category
	 */
	public boolean isFareChargesAppliedToInventoryUtilizationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFareChargesAppliedToInventoryUtilization( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @return the fareChargesAppliedToInventoryUtilization - Room Category
	 */
	public boolean isFareChargesAppliedToInventoryUtilizationAsPrimitive()
	{
		return isFareChargesAppliedToInventoryUtilizationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization - Room Category
	 */
	public void setFareChargesAppliedToInventoryUtilization(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FARECHARGESAPPLIEDTOINVENTORYUTILIZATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization - Room Category
	 */
	public void setFareChargesAppliedToInventoryUtilization(final Boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization - Room Category
	 */
	public void setFareChargesAppliedToInventoryUtilization(final SessionContext ctx, final boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesForAmendments.fareChargesAppliedToInventoryUtilization</code> attribute. 
	 * @param value the fareChargesAppliedToInventoryUtilization - Room Category
	 */
	public void setFareChargesAppliedToInventoryUtilization(final boolean value)
	{
		setFareChargesAppliedToInventoryUtilization( getSession().getSessionContext(), value );
	}
	
}
