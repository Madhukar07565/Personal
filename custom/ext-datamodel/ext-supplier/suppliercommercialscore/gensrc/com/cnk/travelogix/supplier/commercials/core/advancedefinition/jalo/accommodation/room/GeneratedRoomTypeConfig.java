/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.room;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.room.RoomTypeConfig RoomTypeConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomTypeConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>RoomTypeConfig.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>RoomTypeConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link OneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoSupplierAdvanceDefinition> ADVANCEDEFINITIONHANDLER = new OneToManyHandler<AccoSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.ACCOSUPPLIERADVANCEDEFINITION,
	false,
	"roomTypes",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAdvDefConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<AccoSupplierAdvanceDefinition> getAdvanceDefinition(final SessionContext ctx)
	{
		return ADVANCEDEFINITIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<AccoSupplierAdvanceDefinition> getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final Collection<AccoSupplierAdvanceDefinition> value)
	{
		ADVANCEDEFINITIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final Collection<AccoSupplierAdvanceDefinition> value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final SessionContext ctx, final AccoSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final AccoSupplierAdvanceDefinition value)
	{
		addToAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final SessionContext ctx, final AccoSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final AccoSupplierAdvanceDefinition value)
	{
		removeFromAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeConfig.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomTypeConfig.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeConfig.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomTypeConfig.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
}
