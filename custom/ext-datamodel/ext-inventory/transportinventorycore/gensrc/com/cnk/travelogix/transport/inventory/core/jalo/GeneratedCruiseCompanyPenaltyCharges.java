/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseSupplierAdvanceDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.CruiseCompanyPenaltyCharges CruiseCompanyPenaltyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseCompanyPenaltyCharges extends GenericItem
{
	/** Qualifier of the <code>CruiseCompanyPenaltyCharges.supplierAdvanceDefinition</code> attribute **/
	public static final String SUPPLIERADVANCEDEFINITION = "supplierAdvanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruiseCompanyPenaltyCharges> SUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedCruiseCompanyPenaltyCharges>(
	TransportinventorycoreConstants.TC.CRUISECOMPANYPENALTYCHARGES,
	false,
	"supplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
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
		SUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseCompanyPenaltyCharges.supplierAdvanceDefinition</code> attribute.
	 * @return the supplierAdvanceDefinition
	 */
	public CruiseSupplierAdvanceDefinition getSupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (CruiseSupplierAdvanceDefinition)getProperty( ctx, SUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseCompanyPenaltyCharges.supplierAdvanceDefinition</code> attribute.
	 * @return the supplierAdvanceDefinition
	 */
	public CruiseSupplierAdvanceDefinition getSupplierAdvanceDefinition()
	{
		return getSupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseCompanyPenaltyCharges.supplierAdvanceDefinition</code> attribute. 
	 * @param value the supplierAdvanceDefinition
	 */
	public void setSupplierAdvanceDefinition(final SessionContext ctx, final CruiseSupplierAdvanceDefinition value)
	{
		SUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseCompanyPenaltyCharges.supplierAdvanceDefinition</code> attribute. 
	 * @param value the supplierAdvanceDefinition
	 */
	public void setSupplierAdvanceDefinition(final CruiseSupplierAdvanceDefinition value)
	{
		setSupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
}
