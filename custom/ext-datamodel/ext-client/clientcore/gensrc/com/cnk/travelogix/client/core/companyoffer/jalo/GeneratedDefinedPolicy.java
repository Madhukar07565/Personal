/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.DefinedPolicy DefinedPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDefinedPolicy extends AbstractDynamicPolicy
{
	/** Qualifier of the <code>DefinedPolicy.nights</code> attribute **/
	public static final String NIGHTS = "nights";
	/** Qualifier of the <code>DefinedPolicy.priceApplicableOn</code> attribute **/
	public static final String PRICEAPPLICABLEON = "priceApplicableOn";
	/** Qualifier of the <code>DefinedPolicy.travelogixPolicyDefinedPolicy</code> attribute **/
	public static final String TRAVELOGIXPOLICYDEFINEDPOLICY = "travelogixPolicyDefinedPolicy";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXPOLICYDEFINEDPOLICY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDefinedPolicy> TRAVELOGIXPOLICYDEFINEDPOLICYHANDLER = new BidirectionalOneToManyHandler<GeneratedDefinedPolicy>(
	ClientcoreConstants.TC.DEFINEDPOLICY,
	false,
	"travelogixPolicyDefinedPolicy",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDynamicPolicy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NIGHTS, AttributeMode.INITIAL);
		tmp.put(PRICEAPPLICABLEON, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXPOLICYDEFINEDPOLICY, AttributeMode.INITIAL);
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
		TRAVELOGIXPOLICYDEFINEDPOLICYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefinedPolicy.nights</code> attribute.
	 * @return the nights
	 */
	public Integer getNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefinedPolicy.nights</code> attribute.
	 * @return the nights
	 */
	public Integer getNights()
	{
		return getNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefinedPolicy.nights</code> attribute. 
	 * @return the nights
	 */
	public int getNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefinedPolicy.nights</code> attribute. 
	 * @return the nights
	 */
	public int getNightsAsPrimitive()
	{
		return getNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefinedPolicy.nights</code> attribute. 
	 * @param value the nights
	 */
	public void setNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefinedPolicy.nights</code> attribute. 
	 * @param value the nights
	 */
	public void setNights(final Integer value)
	{
		setNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefinedPolicy.nights</code> attribute. 
	 * @param value the nights
	 */
	public void setNights(final SessionContext ctx, final int value)
	{
		setNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefinedPolicy.nights</code> attribute. 
	 * @param value the nights
	 */
	public void setNights(final int value)
	{
		setNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefinedPolicy.priceApplicableOn</code> attribute.
	 * @return the priceApplicableOn
	 */
	public EnumerationValue getPriceApplicableOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICEAPPLICABLEON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefinedPolicy.priceApplicableOn</code> attribute.
	 * @return the priceApplicableOn
	 */
	public EnumerationValue getPriceApplicableOn()
	{
		return getPriceApplicableOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefinedPolicy.priceApplicableOn</code> attribute. 
	 * @param value the priceApplicableOn
	 */
	public void setPriceApplicableOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICEAPPLICABLEON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefinedPolicy.priceApplicableOn</code> attribute. 
	 * @param value the priceApplicableOn
	 */
	public void setPriceApplicableOn(final EnumerationValue value)
	{
		setPriceApplicableOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefinedPolicy.travelogixPolicyDefinedPolicy</code> attribute.
	 * @return the travelogixPolicyDefinedPolicy
	 */
	public TravelogixPolicy getTravelogixPolicyDefinedPolicy(final SessionContext ctx)
	{
		return (TravelogixPolicy)getProperty( ctx, TRAVELOGIXPOLICYDEFINEDPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DefinedPolicy.travelogixPolicyDefinedPolicy</code> attribute.
	 * @return the travelogixPolicyDefinedPolicy
	 */
	public TravelogixPolicy getTravelogixPolicyDefinedPolicy()
	{
		return getTravelogixPolicyDefinedPolicy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefinedPolicy.travelogixPolicyDefinedPolicy</code> attribute. 
	 * @param value the travelogixPolicyDefinedPolicy
	 */
	public void setTravelogixPolicyDefinedPolicy(final SessionContext ctx, final TravelogixPolicy value)
	{
		TRAVELOGIXPOLICYDEFINEDPOLICYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DefinedPolicy.travelogixPolicyDefinedPolicy</code> attribute. 
	 * @param value the travelogixPolicyDefinedPolicy
	 */
	public void setTravelogixPolicyDefinedPolicy(final TravelogixPolicy value)
	{
		setTravelogixPolicyDefinedPolicy( getSession().getSessionContext(), value );
	}
	
}
