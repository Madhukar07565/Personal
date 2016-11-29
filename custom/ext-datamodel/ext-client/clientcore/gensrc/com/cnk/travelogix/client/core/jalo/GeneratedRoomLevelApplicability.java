/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.AdvanceApplicability;
import de.hybris.platform.jalo.GenericItem;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.RoomLevelApplicability RoomLevelApplicability}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomLevelApplicability extends GenericItem
{
	/** Qualifier of the <code>RoomLevelApplicability.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>RoomLevelApplicability.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>RoomLevelApplicability.advanceApplicability</code> attribute **/
	public static final String ADVANCEAPPLICABILITY = "advanceApplicability";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEAPPLICABILITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRoomLevelApplicability> ADVANCEAPPLICABILITYHANDLER = new BidirectionalOneToManyHandler<GeneratedRoomLevelApplicability>(
	ClientcoreConstants.TC.ROOMLEVELAPPLICABILITY,
	false,
	"advanceApplicability",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(ADVANCEAPPLICABILITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevelApplicability.advanceApplicability</code> attribute.
	 * @return the advanceApplicability
	 */
	public AdvanceApplicability getAdvanceApplicability(final SessionContext ctx)
	{
		return (AdvanceApplicability)getProperty( ctx, ADVANCEAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevelApplicability.advanceApplicability</code> attribute.
	 * @return the advanceApplicability
	 */
	public AdvanceApplicability getAdvanceApplicability()
	{
		return getAdvanceApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevelApplicability.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability
	 */
	public void setAdvanceApplicability(final SessionContext ctx, final AdvanceApplicability value)
	{
		ADVANCEAPPLICABILITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevelApplicability.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability
	 */
	public void setAdvanceApplicability(final AdvanceApplicability value)
	{
		setAdvanceApplicability( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADVANCEAPPLICABILITYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevelApplicability.roomCategory</code> attribute.
	 * @return the roomCategory - Room Category
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevelApplicability.roomCategory</code> attribute.
	 * @return the roomCategory - Room Category
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevelApplicability.roomCategory</code> attribute. 
	 * @param value the roomCategory - Room Category
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevelApplicability.roomCategory</code> attribute. 
	 * @param value the roomCategory - Room Category
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevelApplicability.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomLevelApplicability.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevelApplicability.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomLevelApplicability.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
}
