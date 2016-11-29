/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoInventoryDetail;
import com.cnk.travelogix.accoinventory.core.jalo.AccoInventoryDefinition;
import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AccoAssociateInventory;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
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
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoCompanySpecificInventory AbstractAccoCompanySpecificInventory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractAccoCompanySpecificInventory extends AbstractAccoInventoryDetail
{
	/** Qualifier of the <code>AbstractAccoCompanySpecificInventory.inventoryAssociations</code> attribute **/
	public static final String INVENTORYASSOCIATIONS = "inventoryAssociations";
	/** Qualifier of the <code>AbstractAccoCompanySpecificInventory.accoInventoryDefinition</code> attribute **/
	public static final String ACCOINVENTORYDEFINITION = "accoInventoryDefinition";
	/** Qualifier of the <code>AbstractAccoCompanySpecificInventory.accoAssociateInventory</code> attribute **/
	public static final String ACCOASSOCIATEINVENTORY = "accoAssociateInventory";
	/**
	* {@link OneToManyHandler} for handling 1:n INVENTORYASSOCIATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociateInventory> INVENTORYASSOCIATIONSHANDLER = new OneToManyHandler<AssociateInventory>(
	CommoninventorycoreConstants.TC.ASSOCIATEINVENTORY,
	false,
	"abstractAccoCompanySpecificInventory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractAccoCompanySpecificInventory> ACCOINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractAccoCompanySpecificInventory>(
	AccoinventorycoreConstants.TC.ABSTRACTACCOCOMPANYSPECIFICINVENTORY,
	false,
	"accoInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ACCOASSOCIATEINVENTORY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoAssociateInventory> ACCOASSOCIATEINVENTORYHANDLER = new OneToManyHandler<AccoAssociateInventory>(
	AccoinventorycoreConstants.TC.ACCOASSOCIATEINVENTORY,
	false,
	"accoCompanySpecificInventory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAccoInventoryDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCOINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoCompanySpecificInventory.accoAssociateInventory</code> attribute.
	 * @return the accoAssociateInventory
	 */
	public Collection<AccoAssociateInventory> getAccoAssociateInventory(final SessionContext ctx)
	{
		return ACCOASSOCIATEINVENTORYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoCompanySpecificInventory.accoAssociateInventory</code> attribute.
	 * @return the accoAssociateInventory
	 */
	public Collection<AccoAssociateInventory> getAccoAssociateInventory()
	{
		return getAccoAssociateInventory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoCompanySpecificInventory.accoAssociateInventory</code> attribute. 
	 * @param value the accoAssociateInventory
	 */
	public void setAccoAssociateInventory(final SessionContext ctx, final Collection<AccoAssociateInventory> value)
	{
		ACCOASSOCIATEINVENTORYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoCompanySpecificInventory.accoAssociateInventory</code> attribute. 
	 * @param value the accoAssociateInventory
	 */
	public void setAccoAssociateInventory(final Collection<AccoAssociateInventory> value)
	{
		setAccoAssociateInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoAssociateInventory. 
	 * @param value the item to add to accoAssociateInventory
	 */
	public void addToAccoAssociateInventory(final SessionContext ctx, final AccoAssociateInventory value)
	{
		ACCOASSOCIATEINVENTORYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoAssociateInventory. 
	 * @param value the item to add to accoAssociateInventory
	 */
	public void addToAccoAssociateInventory(final AccoAssociateInventory value)
	{
		addToAccoAssociateInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoAssociateInventory. 
	 * @param value the item to remove from accoAssociateInventory
	 */
	public void removeFromAccoAssociateInventory(final SessionContext ctx, final AccoAssociateInventory value)
	{
		ACCOASSOCIATEINVENTORYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoAssociateInventory. 
	 * @param value the item to remove from accoAssociateInventory
	 */
	public void removeFromAccoAssociateInventory(final AccoAssociateInventory value)
	{
		removeFromAccoAssociateInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoCompanySpecificInventory.accoInventoryDefinition</code> attribute.
	 * @return the accoInventoryDefinition
	 */
	public AccoInventoryDefinition getAccoInventoryDefinition(final SessionContext ctx)
	{
		return (AccoInventoryDefinition)getProperty( ctx, ACCOINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoCompanySpecificInventory.accoInventoryDefinition</code> attribute.
	 * @return the accoInventoryDefinition
	 */
	public AccoInventoryDefinition getAccoInventoryDefinition()
	{
		return getAccoInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoCompanySpecificInventory.accoInventoryDefinition</code> attribute. 
	 * @param value the accoInventoryDefinition
	 */
	public void setAccoInventoryDefinition(final SessionContext ctx, final AccoInventoryDefinition value)
	{
		ACCOINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoCompanySpecificInventory.accoInventoryDefinition</code> attribute. 
	 * @param value the accoInventoryDefinition
	 */
	public void setAccoInventoryDefinition(final AccoInventoryDefinition value)
	{
		setAccoInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoCompanySpecificInventory.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AssociateInventory> getInventoryAssociations(final SessionContext ctx)
	{
		return INVENTORYASSOCIATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractAccoCompanySpecificInventory.inventoryAssociations</code> attribute.
	 * @return the inventoryAssociations
	 */
	public Collection<AssociateInventory> getInventoryAssociations()
	{
		return getInventoryAssociations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoCompanySpecificInventory.inventoryAssociations</code> attribute. 
	 * @param value the inventoryAssociations
	 */
	public void setInventoryAssociations(final SessionContext ctx, final Collection<AssociateInventory> value)
	{
		INVENTORYASSOCIATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractAccoCompanySpecificInventory.inventoryAssociations</code> attribute. 
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
	
}
