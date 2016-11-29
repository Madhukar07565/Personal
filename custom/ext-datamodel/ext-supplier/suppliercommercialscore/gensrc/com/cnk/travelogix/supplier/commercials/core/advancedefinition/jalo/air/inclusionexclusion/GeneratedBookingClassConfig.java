/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.AirSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.BookingClassConfig BookingClassesConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBookingClassConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>BookingClassesConfig.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>BookingClassesConfig.rbd</code> attribute **/
	public static final String RBD = "rbd";
	/** Qualifier of the <code>BookingClassesConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBookingClassConfig> ADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedBookingClassConfig>(
	SuppliercommercialscoreConstants.TC.BOOKINGCLASSESCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAdvDefConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(RBD, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClassesConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AirSupplierAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (AirSupplierAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClassesConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AirSupplierAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClassesConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final AirSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClassesConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final AirSupplierAdvanceDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClassesConfig.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClassesConfig.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClassesConfig.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClassesConfig.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClassesConfig.rbd</code> attribute.
	 * @return the rbd
	 */
	public EnumerationValue getRbd(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RBD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClassesConfig.rbd</code> attribute.
	 * @return the rbd
	 */
	public EnumerationValue getRbd()
	{
		return getRbd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClassesConfig.rbd</code> attribute. 
	 * @param value the rbd
	 */
	public void setRbd(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RBD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClassesConfig.rbd</code> attribute. 
	 * @param value the rbd
	 */
	public void setRbd(final EnumerationValue value)
	{
		setRbd( getSession().getSessionContext(), value );
	}
	
}
