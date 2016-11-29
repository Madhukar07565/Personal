/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.CruiseInventoryDefinition;
import com.cnk.travelogix.transportinventory.core.jalo.AbstractCruiseInventoryDetail;
import com.cnk.travelogix.transportinventory.core.jalo.ItineraryInfo;
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
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.CruiseInventoryDetail CruiseInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseInventoryDetail extends AbstractCruiseInventoryDetail
{
	/** Qualifier of the <code>CruiseInventoryDetail.itineraryInfo</code> attribute **/
	public static final String ITINERARYINFO = "itineraryInfo";
	/** Qualifier of the <code>CruiseInventoryDetail.cruiseInventory</code> attribute **/
	public static final String CRUISEINVENTORY = "cruiseInventory";
	/** Qualifier of the <code>CruiseInventoryDetail.inventoryAssociations</code> attribute **/
	public static final String INVENTORYASSOCIATIONS = "inventoryAssociations";
	/**
	* {@link OneToManyHandler} for handling 1:n ITINERARYINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ItineraryInfo> ITINERARYINFOHANDLER = new OneToManyHandler<ItineraryInfo>(
	TransportinventorycoreConstants.TC.ITINERARYINFO,
	false,
	"cruiseInventoryDetails",
	"cruiseInventoryDetailsPOS",
	true,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEINVENTORY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruiseInventoryDetail> CRUISEINVENTORYHANDLER = new BidirectionalOneToManyHandler<GeneratedCruiseInventoryDetail>(
	TransportinventorycoreConstants.TC.CRUISEINVENTORYDETAIL,
	false,
	"cruiseInventory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYASSOCIATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociateInventory> INVENTORYASSOCIATIONSHANDLER = new OneToManyHandler<AssociateInventory>(
	CommoninventorycoreConstants.TC.ASSOCIATEINVENTORY,
	false,
	"cruiseInventoryDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCruiseInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CRUISEINVENTORY, AttributeMode.INITIAL);
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
		CRUISEINVENTORYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDetail.cruiseInventory</code> attribute.
	 * @return the cruiseInventory
	 */
	public CruiseInventoryDefinition getCruiseInventory(final SessionContext ctx)
	{
		return (CruiseInventoryDefinition)getProperty( ctx, CRUISEINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDetail.cruiseInventory</code> attribute.
	 * @return the cruiseInventory
	 */
	public CruiseInventoryDefinition getCruiseInventory()
	{
		return getCruiseInventory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDetail.cruiseInventory</code> attribute. 
	 * @param value the cruiseInventory
	 */
	public void setCruiseInventory(final SessionContext ctx, final CruiseInventoryDefinition value)
	{
		CRUISEINVENTORYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDetail.cruiseInventory</code> attribute. 
	 * @param value the cruiseInventory
	 */
	public void setCruiseInventory(final CruiseInventoryDefinition value)
	{
		setCruiseInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDetail.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AssociateInventory> getInventoryAssociations(final SessionContext ctx)
	{
		return INVENTORYASSOCIATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDetail.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AssociateInventory> getInventoryAssociations()
	{
		return getInventoryAssociations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDetail.inventoryAssociations</code> attribute. 
	 * @param value the inventoryAssociations
	 */
	public void setInventoryAssociations(final SessionContext ctx, final Collection<AssociateInventory> value)
	{
		INVENTORYASSOCIATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDetail.inventoryAssociations</code> attribute. 
	 * @param value the inventoryAssociations
	 */
	public void setInventoryAssociations(final Collection<AssociateInventory> value)
	{
		setInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryAssociations. 
	 * @param value the item to add to inventoryAssociations
	 */
	public void addToInventoryAssociations(final SessionContext ctx, final AssociateInventory value)
	{
		INVENTORYASSOCIATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryAssociations. 
	 * @param value the item to add to inventoryAssociations
	 */
	public void addToInventoryAssociations(final AssociateInventory value)
	{
		addToInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryAssociations. 
	 * @param value the item to remove from inventoryAssociations
	 */
	public void removeFromInventoryAssociations(final SessionContext ctx, final AssociateInventory value)
	{
		INVENTORYASSOCIATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryAssociations. 
	 * @param value the item to remove from inventoryAssociations
	 */
	public void removeFromInventoryAssociations(final AssociateInventory value)
	{
		removeFromInventoryAssociations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDetail.itineraryInfo</code> attribute.
	 * @return the itineraryInfo
	 */
	public Collection<ItineraryInfo> getItineraryInfo(final SessionContext ctx)
	{
		return ITINERARYINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseInventoryDetail.itineraryInfo</code> attribute.
	 * @return the itineraryInfo
	 */
	public Collection<ItineraryInfo> getItineraryInfo()
	{
		return getItineraryInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDetail.itineraryInfo</code> attribute. 
	 * @param value the itineraryInfo
	 */
	public void setItineraryInfo(final SessionContext ctx, final Collection<ItineraryInfo> value)
	{
		ITINERARYINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseInventoryDetail.itineraryInfo</code> attribute. 
	 * @param value the itineraryInfo
	 */
	public void setItineraryInfo(final Collection<ItineraryInfo> value)
	{
		setItineraryInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraryInfo. 
	 * @param value the item to add to itineraryInfo
	 */
	public void addToItineraryInfo(final SessionContext ctx, final ItineraryInfo value)
	{
		ITINERARYINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraryInfo. 
	 * @param value the item to add to itineraryInfo
	 */
	public void addToItineraryInfo(final ItineraryInfo value)
	{
		addToItineraryInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraryInfo. 
	 * @param value the item to remove from itineraryInfo
	 */
	public void removeFromItineraryInfo(final SessionContext ctx, final ItineraryInfo value)
	{
		ITINERARYINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraryInfo. 
	 * @param value the item to remove from itineraryInfo
	 */
	public void removeFromItineraryInfo(final ItineraryInfo value)
	{
		removeFromItineraryInfo( getSession().getSessionContext(), value );
	}
	
}
