/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.acco.inventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoInventoryDetail;
import com.cnk.travelogix.accoinventory.core.jalo.AccoInventoryDefinition;
import com.cnk.travelogix.accoinventory.core.jalo.AccommodationInventoryRequest;
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem AccoInventoryGrid}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoInventoryGrid extends GenericItem
{
	/** Qualifier of the <code>AccoInventoryGrid.gridId</code> attribute **/
	public static final String GRIDID = "gridId";
	/** Qualifier of the <code>AccoInventoryGrid.accoInventoryRequest</code> attribute **/
	public static final String ACCOINVENTORYREQUEST = "accoInventoryRequest";
	/** Qualifier of the <code>AccoInventoryGrid.inventoryDetails</code> attribute **/
	public static final String INVENTORYDETAILS = "inventoryDetails";
	/** Qualifier of the <code>AccoInventoryGrid.accoInventoryDefinition</code> attribute **/
	public static final String ACCOINVENTORYDEFINITION = "accoInventoryDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOINVENTORYREQUEST's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoInventoryGrid> ACCOINVENTORYREQUESTHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoInventoryGrid>(
	AccoinventorycoreConstants.TC.ACCOINVENTORYGRID,
	false,
	"accoInventoryRequest",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractAccoInventoryDetail> INVENTORYDETAILSHANDLER = new OneToManyHandler<AbstractAccoInventoryDetail>(
	AccoinventorycoreConstants.TC.ABSTRACTACCOINVENTORYDETAIL,
	false,
	"accoInventoryGrid",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoInventoryGrid> ACCOINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoInventoryGrid>(
	AccoinventorycoreConstants.TC.ACCOINVENTORYGRID,
	false,
	"accoInventoryDefinition",
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
		tmp.put(ACCOINVENTORYREQUEST, AttributeMode.INITIAL);
		tmp.put(ACCOINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.accoInventoryDefinition</code> attribute.
	 * @return the accoInventoryDefinition
	 */
	public AccoInventoryDefinition getAccoInventoryDefinition(final SessionContext ctx)
	{
		return (AccoInventoryDefinition)getProperty( ctx, ACCOINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.accoInventoryDefinition</code> attribute.
	 * @return the accoInventoryDefinition
	 */
	public AccoInventoryDefinition getAccoInventoryDefinition()
	{
		return getAccoInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.accoInventoryDefinition</code> attribute. 
	 * @param value the accoInventoryDefinition
	 */
	public void setAccoInventoryDefinition(final SessionContext ctx, final AccoInventoryDefinition value)
	{
		ACCOINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.accoInventoryDefinition</code> attribute. 
	 * @param value the accoInventoryDefinition
	 */
	public void setAccoInventoryDefinition(final AccoInventoryDefinition value)
	{
		setAccoInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.accoInventoryRequest</code> attribute.
	 * @return the accoInventoryRequest
	 */
	public AccommodationInventoryRequest getAccoInventoryRequest(final SessionContext ctx)
	{
		return (AccommodationInventoryRequest)getProperty( ctx, ACCOINVENTORYREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.accoInventoryRequest</code> attribute.
	 * @return the accoInventoryRequest
	 */
	public AccommodationInventoryRequest getAccoInventoryRequest()
	{
		return getAccoInventoryRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.accoInventoryRequest</code> attribute. 
	 * @param value the accoInventoryRequest
	 */
	public void setAccoInventoryRequest(final SessionContext ctx, final AccommodationInventoryRequest value)
	{
		ACCOINVENTORYREQUESTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.accoInventoryRequest</code> attribute. 
	 * @param value the accoInventoryRequest
	 */
	public void setAccoInventoryRequest(final AccommodationInventoryRequest value)
	{
		setAccoInventoryRequest( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOINVENTORYREQUESTHANDLER.newInstance(ctx, allAttributes);
		ACCOINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.gridId</code> attribute.
	 * @return the gridId - Grid Id
	 */
	public Integer getGridId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, GRIDID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.gridId</code> attribute.
	 * @return the gridId - Grid Id
	 */
	public Integer getGridId()
	{
		return getGridId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.gridId</code> attribute. 
	 * @return the gridId - Grid Id
	 */
	public int getGridIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getGridId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.gridId</code> attribute. 
	 * @return the gridId - Grid Id
	 */
	public int getGridIdAsPrimitive()
	{
		return getGridIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.gridId</code> attribute. 
	 * @param value the gridId - Grid Id
	 */
	public void setGridId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, GRIDID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.gridId</code> attribute. 
	 * @param value the gridId - Grid Id
	 */
	public void setGridId(final Integer value)
	{
		setGridId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.gridId</code> attribute. 
	 * @param value the gridId - Grid Id
	 */
	public void setGridId(final SessionContext ctx, final int value)
	{
		setGridId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.gridId</code> attribute. 
	 * @param value the gridId - Grid Id
	 */
	public void setGridId(final int value)
	{
		setGridId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AbstractAccoInventoryDetail> getInventoryDetails(final SessionContext ctx)
	{
		return INVENTORYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryGrid.inventoryDetails</code> attribute.
	 * @return the inventoryDetails
	 */
	public Collection<AbstractAccoInventoryDetail> getInventoryDetails()
	{
		return getInventoryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final SessionContext ctx, final Collection<AbstractAccoInventoryDetail> value)
	{
		INVENTORYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryGrid.inventoryDetails</code> attribute. 
	 * @param value the inventoryDetails
	 */
	public void setInventoryDetails(final Collection<AbstractAccoInventoryDetail> value)
	{
		setInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final SessionContext ctx, final AbstractAccoInventoryDetail value)
	{
		INVENTORYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryDetails. 
	 * @param value the item to add to inventoryDetails
	 */
	public void addToInventoryDetails(final AbstractAccoInventoryDetail value)
	{
		addToInventoryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final SessionContext ctx, final AbstractAccoInventoryDetail value)
	{
		INVENTORYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryDetails. 
	 * @param value the item to remove from inventoryDetails
	 */
	public void removeFromInventoryDetails(final AbstractAccoInventoryDetail value)
	{
		removeFromInventoryDetails( getSession().getSessionContext(), value );
	}
	
}
