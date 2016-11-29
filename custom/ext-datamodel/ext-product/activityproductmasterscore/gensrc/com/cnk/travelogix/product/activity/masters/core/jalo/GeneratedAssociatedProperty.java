/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contacts.jalo.ContactDetails;
import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import com.cnk.travelogix.product.common.core.jalo.Route;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.AssociatedProperty AssociatedProperty}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssociatedProperty extends GenericItem
{
	/** Qualifier of the <code>AssociatedProperty.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>AssociatedProperty.associatedAccoProduct</code> attribute **/
	public static final String ASSOCIATEDACCOPRODUCT = "associatedAccoProduct";
	/** Qualifier of the <code>AssociatedProperty.contacts</code> attribute **/
	public static final String CONTACTS = "contacts";
	/** Qualifier of the <code>AssociatedProperty.routes</code> attribute **/
	public static final String ROUTES = "routes";
	/**
	* {@link OneToManyHandler} for handling 1:n CONTACTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ContactDetails> CONTACTSHANDLER = new OneToManyHandler<ContactDetails>(
	MasterdatacoreConstants.TC.CONTACTDETAILS,
	false,
	"associatedProperty",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ROUTES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Route> ROUTESHANDLER = new OneToManyHandler<Route>(
	CommonproductcoreConstants.TC.ROUTE,
	false,
	"associatedProperty",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(ASSOCIATEDACCOPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProperty.address</code> attribute.
	 * @return the address - Address.
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProperty.address</code> attribute.
	 * @return the address - Address.
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProperty.address</code> attribute. 
	 * @param value the address - Address.
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProperty.address</code> attribute. 
	 * @param value the address - Address.
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProperty.associatedAccoProduct</code> attribute.
	 * @return the associatedAccoProduct - Associated Acco product
	 */
	public Accommodation getAssociatedAccoProduct(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, ASSOCIATEDACCOPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProperty.associatedAccoProduct</code> attribute.
	 * @return the associatedAccoProduct - Associated Acco product
	 */
	public Accommodation getAssociatedAccoProduct()
	{
		return getAssociatedAccoProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProperty.associatedAccoProduct</code> attribute. 
	 * @param value the associatedAccoProduct - Associated Acco product
	 */
	public void setAssociatedAccoProduct(final SessionContext ctx, final Accommodation value)
	{
		setProperty(ctx, ASSOCIATEDACCOPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProperty.associatedAccoProduct</code> attribute. 
	 * @param value the associatedAccoProduct - Associated Acco product
	 */
	public void setAssociatedAccoProduct(final Accommodation value)
	{
		setAssociatedAccoProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProperty.contacts</code> attribute.
	 * @return the contacts
	 */
	public Collection<ContactDetails> getContacts(final SessionContext ctx)
	{
		return CONTACTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProperty.contacts</code> attribute.
	 * @return the contacts
	 */
	public Collection<ContactDetails> getContacts()
	{
		return getContacts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProperty.contacts</code> attribute. 
	 * @param value the contacts
	 */
	public void setContacts(final SessionContext ctx, final Collection<ContactDetails> value)
	{
		CONTACTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProperty.contacts</code> attribute. 
	 * @param value the contacts
	 */
	public void setContacts(final Collection<ContactDetails> value)
	{
		setContacts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contacts. 
	 * @param value the item to add to contacts
	 */
	public void addToContacts(final SessionContext ctx, final ContactDetails value)
	{
		CONTACTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to contacts. 
	 * @param value the item to add to contacts
	 */
	public void addToContacts(final ContactDetails value)
	{
		addToContacts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contacts. 
	 * @param value the item to remove from contacts
	 */
	public void removeFromContacts(final SessionContext ctx, final ContactDetails value)
	{
		CONTACTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from contacts. 
	 * @param value the item to remove from contacts
	 */
	public void removeFromContacts(final ContactDetails value)
	{
		removeFromContacts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProperty.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<Route> getRoutes(final SessionContext ctx)
	{
		return ROUTESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedProperty.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<Route> getRoutes()
	{
		return getRoutes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProperty.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final SessionContext ctx, final Collection<Route> value)
	{
		ROUTESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedProperty.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final Collection<Route> value)
	{
		setRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final SessionContext ctx, final Route value)
	{
		ROUTESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final Route value)
	{
		addToRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final SessionContext ctx, final Route value)
	{
		ROUTESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final Route value)
	{
		removeFromRoutes( getSession().getSessionContext(), value );
	}
	
}
