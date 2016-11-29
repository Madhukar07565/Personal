/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInvSupplierAdvanceDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.FareRulesAndTermsAndConditions FareRulesAndTermsAndConditions}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFareRulesAndTermsAndConditions extends GenericItem
{
	/** Qualifier of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute **/
	public static final String FARERULE = "fareRule";
	/** Qualifier of the <code>FareRulesAndTermsAndConditions.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>FareRulesAndTermsAndConditions.airInventorySupplierAdvanceDefinition</code> attribute **/
	public static final String AIRINVENTORYSUPPLIERADVANCEDEFINITION = "airInventorySupplierAdvanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRINVENTORYSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFareRulesAndTermsAndConditions> AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedFareRulesAndTermsAndConditions>(
	TransportinventorycoreConstants.TC.FARERULESANDTERMSANDCONDITIONS,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FARERULE, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(AIRINVENTORYSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareRulesAndTermsAndConditions.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AirInvSupplierAdvanceDefinition)getProperty( ctx, AIRINVENTORYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareRulesAndTermsAndConditions.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition()
	{
		return getAirInventorySupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareRulesAndTermsAndConditions.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final AirInvSupplierAdvanceDefinition value)
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareRulesAndTermsAndConditions.airInventorySupplierAdvanceDefinition</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>FareRulesAndTermsAndConditions.description</code> attribute.
	 * @return the description - description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareRulesAndTermsAndConditions.description</code> attribute.
	 * @return the description - description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareRulesAndTermsAndConditions.description</code> attribute. 
	 * @param value the description - description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareRulesAndTermsAndConditions.description</code> attribute. 
	 * @param value the description - description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute.
	 * @return the fareRule - fare rules
	 */
	public Boolean isFareRule(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FARERULE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute.
	 * @return the fareRule - fare rules
	 */
	public Boolean isFareRule()
	{
		return isFareRule( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute. 
	 * @return the fareRule - fare rules
	 */
	public boolean isFareRuleAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFareRule( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute. 
	 * @return the fareRule - fare rules
	 */
	public boolean isFareRuleAsPrimitive()
	{
		return isFareRuleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute. 
	 * @param value the fareRule - fare rules
	 */
	public void setFareRule(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FARERULE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute. 
	 * @param value the fareRule - fare rules
	 */
	public void setFareRule(final Boolean value)
	{
		setFareRule( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute. 
	 * @param value the fareRule - fare rules
	 */
	public void setFareRule(final SessionContext ctx, final boolean value)
	{
		setFareRule( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareRulesAndTermsAndConditions.fareRule</code> attribute. 
	 * @param value the fareRule - fare rules
	 */
	public void setFareRule(final boolean value)
	{
		setFareRule( getSession().getSessionContext(), value );
	}
	
}
