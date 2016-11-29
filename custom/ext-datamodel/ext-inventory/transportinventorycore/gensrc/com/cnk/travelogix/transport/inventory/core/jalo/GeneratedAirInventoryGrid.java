/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInventoryDefinition;
import com.cnk.travelogix.transportinventory.core.jalo.AbstractAirInventoryDetail;
import com.cnk.travelogix.transportinventory.core.jalo.AirlineInventoryRequest;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem AirInventoryGrid}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirInventoryGrid extends GenericItem
{
	/** Qualifier of the <code>AirInventoryGrid.gridId</code> attribute **/
	public static final String GRIDID = "gridId";
	/** Qualifier of the <code>AirInventoryGrid.inventoryDetails</code> attribute **/
	public static final String INVENTORYDETAILS = "inventoryDetails";
	/** Qualifier of the <code>AirInventoryGrid.airlineInventoryRequest</code> attribute **/
	public static final String AIRLINEINVENTORYREQUEST = "airlineInventoryRequest";
	/** Qualifier of the <code>AirInventoryGrid.airInventoryDefinition</code> attribute **/
	public static final String AIRINVENTORYDEFINITION = "airInventoryDefinition";
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractAirInventoryDetail> INVENTORYDETAILSHANDLER = new OneToManyHandler<AbstractAirInventoryDetail>(
	TransportinventorycoreConstants.TC.ABSTRACTAIRINVENTORYDETAIL,
	false,
	"airInventoryGrid",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRLINEINVENTORYREQUEST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirInventoryGrid> AIRLINEINVENTORYREQUESTHANDLER = new BidirectionalOneToManyHandler<GeneratedAirInventoryGrid>(
	TransportinventorycoreConstants.TC.AIRINVENTORYGRID,
	false,
	"airlineInventoryRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirInventoryGrid> AIRINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAirInventoryGrid>(
	TransportinventorycoreConstants.TC.AIRINVENTORYGRID,
	false,
	"airInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(GRIDID, AttributeMode.INITIAL);
		tmp.put(AIRLINEINVENTORYREQUEST, AttributeMode.INITIAL);
		tmp.put(AIRINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.airInventoryDefinition</code> attribute.
	 * @return the airInventoryDefinition
	 */
	public AirInventoryDefinition getAirInventoryDefinition(final SessionContext ctx)
	{
		return (AirInventoryDefinition)getProperty( ctx, AIRINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.airInventoryDefinition</code> attribute.
	 * @return the airInventoryDefinition
	 */
	public AirInventoryDefinition getAirInventoryDefinition()
	{
		return getAirInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.airInventoryDefinition</code> attribute. 
	 * @param value the airInventoryDefinition
	 */
	public void setAirInventoryDefinition(final SessionContext ctx, final AirInventoryDefinition value)
	{
		AIRINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.airInventoryDefinition</code> attribute. 
	 * @param value the airInventoryDefinition
	 */
	public void setAirInventoryDefinition(final AirInventoryDefinition value)
	{
		setAirInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.airlineInventoryRequest</code> attribute.
	 * @return the airlineInventoryRequest
	 */
	public AirlineInventoryRequest getAirlineInventoryRequest(final SessionContext ctx)
	{
		return (AirlineInventoryRequest)getProperty( ctx, AIRLINEINVENTORYREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.airlineInventoryRequest</code> attribute.
	 * @return the airlineInventoryRequest
	 */
	public AirlineInventoryRequest getAirlineInventoryRequest()
	{
		return getAirlineInventoryRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.airlineInventoryRequest</code> attribute. 
	 * @param value the airlineInventoryRequest
	 */
	public void setAirlineInventoryRequest(final SessionContext ctx, final AirlineInventoryRequest value)
	{
		AIRLINEINVENTORYREQUESTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.airlineInventoryRequest</code> attribute. 
	 * @param value the airlineInventoryRequest
	 */
	public void setAirlineInventoryRequest(final AirlineInventoryRequest value)
	{
		setAirlineInventoryRequest( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRLINEINVENTORYREQUESTHANDLER.newInstance(ctx, allAttributes);
		AIRINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.gridId</code> attribute.
	 * @return the gridId - Grid Id
	 */
	public Integer getGridId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, GRIDID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.gridId</code> attribute.
	 * @return the gridId - Grid Id
	 */
	public Integer getGridId()
	{
		return getGridId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.gridId</code> attribute. 
	 * @return the gridId - Grid Id
	 */
	public int getGridIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getGridId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.gridId</code> attribute. 
	 * @return the gridId - Grid Id
	 */
	public int getGridIdAsPrimitive()
	{
		return getGridIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.gridId</code> attribute. 
	 * @param value the gridId - Grid Id
	 */
	public void setGridId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, GRIDID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.gridId</code> attribute. 
	 * @param value the gridId - Grid Id
	 */
	public void setGridId(final Integer value)
	{
		setGridId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.gridId</code> attribute. 
	 * @param value the gridId - Grid Id
	 */
	public void setGridId(final SessionContext ctx, final int value)
	{
		setGridId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.gridId</code> attribute. 
	 * @param value the gridId - Grid Id
	 */
	public void setGridId(final int value)
	{
		setGridId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AbstractAirInventoryDetail> getInventoryDetails(final SessionContext ctx)
	{
		return INVENTORYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirInventoryGrid.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AbstractAirInventoryDetail> getInventoryDetails()
	{
		return getInventoryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final SessionContext ctx, final Collection<AbstractAirInventoryDetail> value)
	{
		INVENTORYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirInventoryGrid.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final Collection<AbstractAirInventoryDetail> value)
	{
		setInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final SessionContext ctx, final AbstractAirInventoryDetail value)
	{
		INVENTORYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final AbstractAirInventoryDetail value)
	{
		addToInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final SessionContext ctx, final AbstractAirInventoryDetail value)
	{
		INVENTORYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final AbstractAirInventoryDetail value)
	{
		removeFromInventoryDetails( getSession().getSessionContext(), value );
	}
	
}
