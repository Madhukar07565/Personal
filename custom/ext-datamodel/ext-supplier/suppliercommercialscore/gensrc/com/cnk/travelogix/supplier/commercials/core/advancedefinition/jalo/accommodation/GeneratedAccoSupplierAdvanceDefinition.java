/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.nationality.ClientNationalityConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.room.RoomCategoryConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.room.RoomTypeConfig;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition AccoSupplierAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoSupplierAdvanceDefinition extends SupplierCommercialAdvanceDefinition
{
	/** Qualifier of the <code>AccoSupplierAdvanceDefinition.roomCategories</code> attribute **/
	public static final String ROOMCATEGORIES = "roomCategories";
	/** Qualifier of the <code>AccoSupplierAdvanceDefinition.roomTypes</code> attribute **/
	public static final String ROOMTYPES = "roomTypes";
	/** Qualifier of the <code>AccoSupplierAdvanceDefinition.clientNationalities</code> attribute **/
	public static final String CLIENTNATIONALITIES = "clientNationalities";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ROOMCATEGORIES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoSupplierAdvanceDefinition> ROOMCATEGORIESHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.ACCOSUPPLIERADVANCEDEFINITION,
	false,
	"roomCategories",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ROOMTYPES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoSupplierAdvanceDefinition> ROOMTYPESHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.ACCOSUPPLIERADVANCEDEFINITION,
	false,
	"roomTypes",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENTNATIONALITIES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoSupplierAdvanceDefinition> CLIENTNATIONALITIESHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.ACCOSUPPLIERADVANCEDEFINITION,
	false,
	"clientNationalities",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SupplierCommercialAdvanceDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ROOMCATEGORIES, AttributeMode.INITIAL);
		tmp.put(ROOMTYPES, AttributeMode.INITIAL);
		tmp.put(CLIENTNATIONALITIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.clientNationalities</code> attribute.
	 * @return the clientNationalities
	 */
	public ClientNationalityConfig getClientNationalities(final SessionContext ctx)
	{
		return (ClientNationalityConfig)getProperty( ctx, CLIENTNATIONALITIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.clientNationalities</code> attribute.
	 * @return the clientNationalities
	 */
	public ClientNationalityConfig getClientNationalities()
	{
		return getClientNationalities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.clientNationalities</code> attribute. 
	 * @param value the clientNationalities
	 */
	public void setClientNationalities(final SessionContext ctx, final ClientNationalityConfig value)
	{
		CLIENTNATIONALITIESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.clientNationalities</code> attribute. 
	 * @param value the clientNationalities
	 */
	public void setClientNationalities(final ClientNationalityConfig value)
	{
		setClientNationalities( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ROOMCATEGORIESHANDLER.newInstance(ctx, allAttributes);
		ROOMTYPESHANDLER.newInstance(ctx, allAttributes);
		CLIENTNATIONALITIESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.roomCategories</code> attribute.
	 * @return the roomCategories
	 */
	public RoomCategoryConfig getRoomCategories(final SessionContext ctx)
	{
		return (RoomCategoryConfig)getProperty( ctx, ROOMCATEGORIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.roomCategories</code> attribute.
	 * @return the roomCategories
	 */
	public RoomCategoryConfig getRoomCategories()
	{
		return getRoomCategories( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.roomCategories</code> attribute. 
	 * @param value the roomCategories
	 */
	public void setRoomCategories(final SessionContext ctx, final RoomCategoryConfig value)
	{
		ROOMCATEGORIESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.roomCategories</code> attribute. 
	 * @param value the roomCategories
	 */
	public void setRoomCategories(final RoomCategoryConfig value)
	{
		setRoomCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.roomTypes</code> attribute.
	 * @return the roomTypes
	 */
	public RoomTypeConfig getRoomTypes(final SessionContext ctx)
	{
		return (RoomTypeConfig)getProperty( ctx, ROOMTYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoSupplierAdvanceDefinition.roomTypes</code> attribute.
	 * @return the roomTypes
	 */
	public RoomTypeConfig getRoomTypes()
	{
		return getRoomTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.roomTypes</code> attribute. 
	 * @param value the roomTypes
	 */
	public void setRoomTypes(final SessionContext ctx, final RoomTypeConfig value)
	{
		ROOMTYPESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoSupplierAdvanceDefinition.roomTypes</code> attribute. 
	 * @param value the roomTypes
	 */
	public void setRoomTypes(final RoomTypeConfig value)
	{
		setRoomTypes( getSession().getSessionContext(), value );
	}
	
}
