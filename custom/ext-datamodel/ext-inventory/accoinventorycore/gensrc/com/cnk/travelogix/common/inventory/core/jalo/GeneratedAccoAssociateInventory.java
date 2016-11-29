/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoCompanySpecificInventory;
import com.cnk.travelogix.common.inventory.core.jalo.AssociateInventory;
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
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.AccoAssociateInventory AccoAssociateInventory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoAssociateInventory extends AssociateInventory
{
	/** Qualifier of the <code>AccoAssociateInventory.accoCompanySpecificInventory</code> attribute **/
	public static final String ACCOCOMPANYSPECIFICINVENTORY = "accoCompanySpecificInventory";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOCOMPANYSPECIFICINVENTORY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoAssociateInventory> ACCOCOMPANYSPECIFICINVENTORYHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoAssociateInventory>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AssociateInventory.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACCOCOMPANYSPECIFICINVENTORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoAssociateInventory.accoCompanySpecificInventory</code> attribute.
	 * @return the accoCompanySpecificInventory
	 */
	public AbstractAccoCompanySpecificInventory getAccoCompanySpecificInventory(final SessionContext ctx)
	{
		return (AbstractAccoCompanySpecificInventory)getProperty( ctx, ACCOCOMPANYSPECIFICINVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoAssociateInventory.accoCompanySpecificInventory</code> attribute.
	 * @return the accoCompanySpecificInventory
	 */
	public AbstractAccoCompanySpecificInventory getAccoCompanySpecificInventory()
	{
		return getAccoCompanySpecificInventory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoAssociateInventory.accoCompanySpecificInventory</code> attribute. 
	 * @param value the accoCompanySpecificInventory
	 */
	public void setAccoCompanySpecificInventory(final SessionContext ctx, final AbstractAccoCompanySpecificInventory value)
	{
		ACCOCOMPANYSPECIFICINVENTORYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoAssociateInventory.accoCompanySpecificInventory</code> attribute. 
	 * @param value the accoCompanySpecificInventory
	 */
	public void setAccoCompanySpecificInventory(final AbstractAccoCompanySpecificInventory value)
	{
		setAccoCompanySpecificInventory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOCOMPANYSPECIFICINVENTORYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
