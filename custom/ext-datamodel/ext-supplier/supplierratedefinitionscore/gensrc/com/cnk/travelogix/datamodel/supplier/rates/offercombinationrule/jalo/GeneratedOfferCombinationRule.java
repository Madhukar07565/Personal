/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.offercombinationrule.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.offercombinationrule.jalo.OfferCombinationRule OfferCombinationRule}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOfferCombinationRule extends GenericItem
{
	/** Qualifier of the <code>OfferCombinationRule.offerName</code> attribute **/
	public static final String OFFERNAME = "offerName";
	/** Qualifier of the <code>OfferCombinationRule.combinedOffer</code> attribute **/
	public static final String COMBINEDOFFER = "combinedOffer";
	/** Qualifier of the <code>OfferCombinationRule.combinationAllowed</code> attribute **/
	public static final String COMBINATIONALLOWED = "combinationAllowed";
	/** Qualifier of the <code>OfferCombinationRule.rateAdvDefinitions</code> attribute **/
	public static final String RATEADVDEFINITIONS = "rateAdvDefinitions";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RATEADVDEFINITIONS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOfferCombinationRule> RATEADVDEFINITIONSHANDLER = new BidirectionalOneToManyHandler<GeneratedOfferCombinationRule>(
	SupplierratedefinitionscoreConstants.TC.OFFERCOMBINATIONRULE,
	false,
	"rateAdvDefinitions",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OFFERNAME, AttributeMode.INITIAL);
		tmp.put(COMBINEDOFFER, AttributeMode.INITIAL);
		tmp.put(COMBINATIONALLOWED, AttributeMode.INITIAL);
		tmp.put(RATEADVDEFINITIONS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.combinationAllowed</code> attribute.
	 * @return the combinationAllowed
	 */
	public Boolean isCombinationAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMBINATIONALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.combinationAllowed</code> attribute.
	 * @return the combinationAllowed
	 */
	public Boolean isCombinationAllowed()
	{
		return isCombinationAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.combinationAllowed</code> attribute. 
	 * @return the combinationAllowed
	 */
	public boolean isCombinationAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCombinationAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.combinationAllowed</code> attribute. 
	 * @return the combinationAllowed
	 */
	public boolean isCombinationAllowedAsPrimitive()
	{
		return isCombinationAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.combinationAllowed</code> attribute. 
	 * @param value the combinationAllowed
	 */
	public void setCombinationAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMBINATIONALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.combinationAllowed</code> attribute. 
	 * @param value the combinationAllowed
	 */
	public void setCombinationAllowed(final Boolean value)
	{
		setCombinationAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.combinationAllowed</code> attribute. 
	 * @param value the combinationAllowed
	 */
	public void setCombinationAllowed(final SessionContext ctx, final boolean value)
	{
		setCombinationAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.combinationAllowed</code> attribute. 
	 * @param value the combinationAllowed
	 */
	public void setCombinationAllowed(final boolean value)
	{
		setCombinationAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.combinedOffer</code> attribute.
	 * @return the combinedOffer
	 */
	public AbstractTravelogixSupplierOffer getCombinedOffer(final SessionContext ctx)
	{
		return (AbstractTravelogixSupplierOffer)getProperty( ctx, COMBINEDOFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.combinedOffer</code> attribute.
	 * @return the combinedOffer
	 */
	public AbstractTravelogixSupplierOffer getCombinedOffer()
	{
		return getCombinedOffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.combinedOffer</code> attribute. 
	 * @param value the combinedOffer
	 */
	public void setCombinedOffer(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		setProperty(ctx, COMBINEDOFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.combinedOffer</code> attribute. 
	 * @param value the combinedOffer
	 */
	public void setCombinedOffer(final AbstractTravelogixSupplierOffer value)
	{
		setCombinedOffer( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RATEADVDEFINITIONSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.offerName</code> attribute.
	 * @return the offerName
	 */
	public AbstractTravelogixSupplierOffer getOfferName(final SessionContext ctx)
	{
		return (AbstractTravelogixSupplierOffer)getProperty( ctx, OFFERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.offerName</code> attribute.
	 * @return the offerName
	 */
	public AbstractTravelogixSupplierOffer getOfferName()
	{
		return getOfferName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setOfferName(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		setProperty(ctx, OFFERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setOfferName(final AbstractTravelogixSupplierOffer value)
	{
		setOfferName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.rateAdvDefinitions</code> attribute.
	 * @return the rateAdvDefinitions
	 */
	public AbstractRateAdvDefinition getRateAdvDefinitions(final SessionContext ctx)
	{
		return (AbstractRateAdvDefinition)getProperty( ctx, RATEADVDEFINITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfferCombinationRule.rateAdvDefinitions</code> attribute.
	 * @return the rateAdvDefinitions
	 */
	public AbstractRateAdvDefinition getRateAdvDefinitions()
	{
		return getRateAdvDefinitions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.rateAdvDefinitions</code> attribute. 
	 * @param value the rateAdvDefinitions
	 */
	public void setRateAdvDefinitions(final SessionContext ctx, final AbstractRateAdvDefinition value)
	{
		RATEADVDEFINITIONSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfferCombinationRule.rateAdvDefinitions</code> attribute. 
	 * @param value the rateAdvDefinitions
	 */
	public void setRateAdvDefinitions(final AbstractRateAdvDefinition value)
	{
		setRateAdvDefinitions( getSession().getSessionContext(), value );
	}
	
}
