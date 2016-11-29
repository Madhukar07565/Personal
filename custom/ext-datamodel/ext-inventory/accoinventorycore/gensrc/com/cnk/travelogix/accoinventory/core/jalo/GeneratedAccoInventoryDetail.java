/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoInventoryDetail;
import com.cnk.travelogix.accoinventory.core.jalo.InventoryRoomInfo;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AccoInventoryDetail AccoInventoryDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoInventoryDetail extends AbstractAccoInventoryDetail
{
	/** Qualifier of the <code>AccoInventoryDetail.inventoryAssociation</code> attribute **/
	public static final String INVENTORYASSOCIATION = "inventoryAssociation";
	/** Qualifier of the <code>AccoInventoryDetail.inventoryRoomInfo</code> attribute **/
	public static final String INVENTORYROOMINFO = "inventoryRoomInfo";
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYROOMINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<InventoryRoomInfo> INVENTORYROOMINFOHANDLER = new OneToManyHandler<InventoryRoomInfo>(
	AccoinventorycoreConstants.TC.INVENTORYROOMINFO,
	false,
	"accoInventoryDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAccoInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(INVENTORYASSOCIATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDetail.inventoryAssociation</code> attribute.
	 * @return the inventoryAssociation - inventory association
	 */
	public AssociateInventory getInventoryAssociation(final SessionContext ctx)
	{
		return (AssociateInventory)getProperty( ctx, INVENTORYASSOCIATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDetail.inventoryAssociation</code> attribute.
	 * @return the inventoryAssociation - inventory association
	 */
	public AssociateInventory getInventoryAssociation()
	{
		return getInventoryAssociation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDetail.inventoryAssociation</code> attribute. 
	 * @param value the inventoryAssociation - inventory association
	 */
	public void setInventoryAssociation(final SessionContext ctx, final AssociateInventory value)
	{
		setProperty(ctx, INVENTORYASSOCIATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDetail.inventoryAssociation</code> attribute. 
	 * @param value the inventoryAssociation - inventory association
	 */
	public void setInventoryAssociation(final AssociateInventory value)
	{
		setInventoryAssociation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDetail.inventoryRoomInfo</code> attribute.
	 * @return the inventoryRoomInfo
	 */
	public Collection<InventoryRoomInfo> getInventoryRoomInfo(final SessionContext ctx)
	{
		return INVENTORYROOMINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoInventoryDetail.inventoryRoomInfo</code> attribute.
	 * @return the inventoryRoomInfo
	 */
	public Collection<InventoryRoomInfo> getInventoryRoomInfo()
	{
		return getInventoryRoomInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDetail.inventoryRoomInfo</code> attribute. 
	 * @param value the inventoryRoomInfo
	 */
	public void setInventoryRoomInfo(final SessionContext ctx, final Collection<InventoryRoomInfo> value)
	{
		INVENTORYROOMINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoInventoryDetail.inventoryRoomInfo</code> attribute. 
	 * @param value the inventoryRoomInfo
	 */
	public void setInventoryRoomInfo(final Collection<InventoryRoomInfo> value)
	{
		setInventoryRoomInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryRoomInfo. 
	 * @param value the item to add to inventoryRoomInfo
	 */
	public void addToInventoryRoomInfo(final SessionContext ctx, final InventoryRoomInfo value)
	{
		INVENTORYROOMINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to inventoryRoomInfo. 
	 * @param value the item to add to inventoryRoomInfo
	 */
	public void addToInventoryRoomInfo(final InventoryRoomInfo value)
	{
		addToInventoryRoomInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryRoomInfo. 
	 * @param value the item to remove from inventoryRoomInfo
	 */
	public void removeFromInventoryRoomInfo(final SessionContext ctx, final InventoryRoomInfo value)
	{
		INVENTORYROOMINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from inventoryRoomInfo. 
	 * @param value the item to remove from inventoryRoomInfo
	 */
	public void removeFromInventoryRoomInfo(final InventoryRoomInfo value)
	{
		removeFromInventoryRoomInfo( getSession().getSessionContext(), value );
	}
	
}
