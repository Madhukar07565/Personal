/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AbstractAirCompanySpecificInventory;
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
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.AirAssociateInventory AirAssociateInventory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirAssociateInventory extends AssociateInventory
{
	/** Qualifier of the <code>AirAssociateInventory.abstractAirCompanySpecificInventory</code> attribute **/
	public static final String ABSTRACTAIRCOMPANYSPECIFICINVENTORY = "abstractAirCompanySpecificInventory";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTAIRCOMPANYSPECIFICINVENTORY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirAssociateInventory> ABSTRACTAIRCOMPANYSPECIFICINVENTORYHANDLER = new BidirectionalOneToManyHandler<GeneratedAirAssociateInventory>(
	TransportinventorycoreConstants.TC.AIRASSOCIATEINVENTORY,
	false,
	"abstractAirCompanySpecificInventory",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AssociateInventory.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ABSTRACTAIRCOMPANYSPECIFICINVENTORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirAssociateInventory.abstractAirCompanySpecificInventory</code> attribute.
	 * @return the abstractAirCompanySpecificInventory
	 */
	public AbstractAirCompanySpecificInventory getAbstractAirCompanySpecificInventory(final SessionContext ctx)
	{
		return (AbstractAirCompanySpecificInventory)getProperty( ctx, ABSTRACTAIRCOMPANYSPECIFICINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirAssociateInventory.abstractAirCompanySpecificInventory</code> attribute.
	 * @return the abstractAirCompanySpecificInventory
	 */
	public AbstractAirCompanySpecificInventory getAbstractAirCompanySpecificInventory()
	{
		return getAbstractAirCompanySpecificInventory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirAssociateInventory.abstractAirCompanySpecificInventory</code> attribute. 
	 * @param value the abstractAirCompanySpecificInventory
	 */
	public void setAbstractAirCompanySpecificInventory(final SessionContext ctx, final AbstractAirCompanySpecificInventory value)
	{
		ABSTRACTAIRCOMPANYSPECIFICINVENTORYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirAssociateInventory.abstractAirCompanySpecificInventory</code> attribute. 
	 * @param value the abstractAirCompanySpecificInventory
	 */
	public void setAbstractAirCompanySpecificInventory(final AbstractAirCompanySpecificInventory value)
	{
		setAbstractAirCompanySpecificInventory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSTRACTAIRCOMPANYSPECIFICINVENTORYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
