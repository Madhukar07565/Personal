/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AccoCompanyAdvanceDefinition;
import com.cnk.travelogix.accoinventory.core.jalo.AccoPenaltyChargesRelease;
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
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AccoCompanyPenaltyCharges AccoCompanyPenaltyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoCompanyPenaltyCharges extends AccoPenaltyChargesRelease
{
	/** Qualifier of the <code>AccoCompanyPenaltyCharges.accoCompanyAdvanceDefinition</code> attribute **/
	public static final String ACCOCOMPANYADVANCEDEFINITION = "accoCompanyAdvanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOCOMPANYADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoCompanyPenaltyCharges> ACCOCOMPANYADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoCompanyPenaltyCharges>(
	AccoinventorycoreConstants.TC.ACCOCOMPANYPENALTYCHARGES,
	false,
	"accoCompanyAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AccoPenaltyChargesRelease.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCOCOMPANYADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyPenaltyCharges.accoCompanyAdvanceDefinition</code> attribute.
	 * @return the accoCompanyAdvanceDefinition
	 */
	public AccoCompanyAdvanceDefinition getAccoCompanyAdvanceDefinition(final SessionContext ctx)
	{
		return (AccoCompanyAdvanceDefinition)getProperty( ctx, ACCOCOMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCompanyPenaltyCharges.accoCompanyAdvanceDefinition</code> attribute.
	 * @return the accoCompanyAdvanceDefinition
	 */
	public AccoCompanyAdvanceDefinition getAccoCompanyAdvanceDefinition()
	{
		return getAccoCompanyAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyPenaltyCharges.accoCompanyAdvanceDefinition</code> attribute. 
	 * @param value the accoCompanyAdvanceDefinition
	 */
	public void setAccoCompanyAdvanceDefinition(final SessionContext ctx, final AccoCompanyAdvanceDefinition value)
	{
		ACCOCOMPANYADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCompanyPenaltyCharges.accoCompanyAdvanceDefinition</code> attribute. 
	 * @param value the accoCompanyAdvanceDefinition
	 */
	public void setAccoCompanyAdvanceDefinition(final AccoCompanyAdvanceDefinition value)
	{
		setAccoCompanyAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOCOMPANYADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
