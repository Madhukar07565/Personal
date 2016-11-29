/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestPenaltyCharges;
import com.cnk.travelogix.common.inventory.core.jalo.CutOffsAndCharges;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestCutOffsAndCharges ChangeRequestCutOffsAndCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedChangeRequestCutOffsAndCharges extends CutOffsAndCharges
{
	/** Qualifier of the <code>ChangeRequestCutOffsAndCharges.priceComponent</code> attribute **/
	public static final String PRICECOMPONENT = "priceComponent";
	/** Qualifier of the <code>ChangeRequestCutOffsAndCharges.changeRequestPenaltyCharges</code> attribute **/
	public static final String CHANGEREQUESTPENALTYCHARGES = "changeRequestPenaltyCharges";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CHANGEREQUESTPENALTYCHARGES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedChangeRequestCutOffsAndCharges> CHANGEREQUESTPENALTYCHARGESHANDLER = new BidirectionalOneToManyHandler<GeneratedChangeRequestCutOffsAndCharges>(
	CommoninventorycoreConstants.TC.CHANGEREQUESTCUTOFFSANDCHARGES,
	false,
	"changeRequestPenaltyCharges",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CutOffsAndCharges.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRICECOMPONENT, AttributeMode.INITIAL);
		tmp.put(CHANGEREQUESTPENALTYCHARGES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestCutOffsAndCharges.changeRequestPenaltyCharges</code> attribute.
	 * @return the changeRequestPenaltyCharges
	 */
	public ChangeRequestPenaltyCharges getChangeRequestPenaltyCharges(final SessionContext ctx)
	{
		return (ChangeRequestPenaltyCharges)getProperty( ctx, CHANGEREQUESTPENALTYCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestCutOffsAndCharges.changeRequestPenaltyCharges</code> attribute.
	 * @return the changeRequestPenaltyCharges
	 */
	public ChangeRequestPenaltyCharges getChangeRequestPenaltyCharges()
	{
		return getChangeRequestPenaltyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestCutOffsAndCharges.changeRequestPenaltyCharges</code> attribute. 
	 * @param value the changeRequestPenaltyCharges
	 */
	public void setChangeRequestPenaltyCharges(final SessionContext ctx, final ChangeRequestPenaltyCharges value)
	{
		CHANGEREQUESTPENALTYCHARGESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestCutOffsAndCharges.changeRequestPenaltyCharges</code> attribute. 
	 * @param value the changeRequestPenaltyCharges
	 */
	public void setChangeRequestPenaltyCharges(final ChangeRequestPenaltyCharges value)
	{
		setChangeRequestPenaltyCharges( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CHANGEREQUESTPENALTYCHARGESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestCutOffsAndCharges.priceComponent</code> attribute.
	 * @return the priceComponent - Price Component
	 */
	public EnumerationValue getPriceComponent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestCutOffsAndCharges.priceComponent</code> attribute.
	 * @return the priceComponent - Price Component
	 */
	public EnumerationValue getPriceComponent()
	{
		return getPriceComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestCutOffsAndCharges.priceComponent</code> attribute. 
	 * @param value the priceComponent - Price Component
	 */
	public void setPriceComponent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestCutOffsAndCharges.priceComponent</code> attribute. 
	 * @param value the priceComponent - Price Component
	 */
	public void setPriceComponent(final EnumerationValue value)
	{
		setPriceComponent( getSession().getSessionContext(), value );
	}
	
}
