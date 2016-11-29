/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.passenger;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.AirSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.passenger.SupCommAdvDefPassengerConfig SupCommAdvDefPassengerConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupCommAdvDefPassengerConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>SupCommAdvDefPassengerConfig.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>SupCommAdvDefPassengerConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link OneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AirSupplierAdvanceDefinition> ADVANCEDEFINITIONHANDLER = new OneToManyHandler<AirSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.AIRSUPPLIERADVANCEDEFINITION,
	false,
	"passengerTypes",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAdvDefConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupCommAdvDefPassengerConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<AirSupplierAdvanceDefinition> getAdvanceDefinition(final SessionContext ctx)
	{
		return ADVANCEDEFINITIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupCommAdvDefPassengerConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<AirSupplierAdvanceDefinition> getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupCommAdvDefPassengerConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final Collection<AirSupplierAdvanceDefinition> value)
	{
		ADVANCEDEFINITIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupCommAdvDefPassengerConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final Collection<AirSupplierAdvanceDefinition> value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final SessionContext ctx, final AirSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final AirSupplierAdvanceDefinition value)
	{
		addToAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final SessionContext ctx, final AirSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final AirSupplierAdvanceDefinition value)
	{
		removeFromAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupCommAdvDefPassengerConfig.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupCommAdvDefPassengerConfig.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupCommAdvDefPassengerConfig.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupCommAdvDefPassengerConfig.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
}
