/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInvSupplierAdvanceDefinition;
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
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AirPCCCredentialInf AirPCCCredentialInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirPCCCredentialInf extends GenericItem
{
	/** Qualifier of the <code>AirPCCCredentialInfo.ticketOwner</code> attribute **/
	public static final String TICKETOWNER = "ticketOwner";
	/** Qualifier of the <code>AirPCCCredentialInfo.booking</code> attribute **/
	public static final String BOOKING = "booking";
	/** Qualifier of the <code>AirPCCCredentialInfo.ticketing</code> attribute **/
	public static final String TICKETING = "ticketing";
	/** Qualifier of the <code>AirPCCCredentialInfo.gds</code> attribute **/
	public static final String GDS = "gds";
	/** Qualifier of the <code>AirPCCCredentialInfo.loginId</code> attribute **/
	public static final String LOGINID = "loginId";
	/** Qualifier of the <code>AirPCCCredentialInfo.airInventorySupplierAdvanceDefinition</code> attribute **/
	public static final String AIRINVENTORYSUPPLIERADVANCEDEFINITION = "airInventorySupplierAdvanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRINVENTORYSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAirPCCCredentialInf> AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAirPCCCredentialInf>(
	TransportinventorycoreConstants.TC.AIRPCCCREDENTIALINFO,
	false,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TICKETOWNER, AttributeMode.INITIAL);
		tmp.put(BOOKING, AttributeMode.INITIAL);
		tmp.put(TICKETING, AttributeMode.INITIAL);
		tmp.put(GDS, AttributeMode.INITIAL);
		tmp.put(LOGINID, AttributeMode.INITIAL);
		tmp.put(AIRINVENTORYSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AirInvSupplierAdvanceDefinition)getProperty( ctx, AIRINVENTORYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition()
	{
		return getAirInventorySupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final AirInvSupplierAdvanceDefinition value)
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final AirInvSupplierAdvanceDefinition value)
	{
		setAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.booking</code> attribute.
	 * @return the booking - Booking
	 */
	public Boolean isBooking(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BOOKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.booking</code> attribute.
	 * @return the booking - Booking
	 */
	public Boolean isBooking()
	{
		return isBooking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.booking</code> attribute. 
	 * @return the booking - Booking
	 */
	public boolean isBookingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBooking( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.booking</code> attribute. 
	 * @return the booking - Booking
	 */
	public boolean isBookingAsPrimitive()
	{
		return isBookingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.booking</code> attribute. 
	 * @param value the booking - Booking
	 */
	public void setBooking(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BOOKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.booking</code> attribute. 
	 * @param value the booking - Booking
	 */
	public void setBooking(final Boolean value)
	{
		setBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.booking</code> attribute. 
	 * @param value the booking - Booking
	 */
	public void setBooking(final SessionContext ctx, final boolean value)
	{
		setBooking( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.booking</code> attribute. 
	 * @param value the booking - Booking
	 */
	public void setBooking(final boolean value)
	{
		setBooking( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.gds</code> attribute.
	 * @return the gds - Inventory Advance Definitions Supplier GDS Details
	 */
	public Boolean isGds(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, GDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.gds</code> attribute.
	 * @return the gds - Inventory Advance Definitions Supplier GDS Details
	 */
	public Boolean isGds()
	{
		return isGds( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.gds</code> attribute. 
	 * @return the gds - Inventory Advance Definitions Supplier GDS Details
	 */
	public boolean isGdsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isGds( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.gds</code> attribute. 
	 * @return the gds - Inventory Advance Definitions Supplier GDS Details
	 */
	public boolean isGdsAsPrimitive()
	{
		return isGdsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.gds</code> attribute. 
	 * @param value the gds - Inventory Advance Definitions Supplier GDS Details
	 */
	public void setGds(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, GDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.gds</code> attribute. 
	 * @param value the gds - Inventory Advance Definitions Supplier GDS Details
	 */
	public void setGds(final Boolean value)
	{
		setGds( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.gds</code> attribute. 
	 * @param value the gds - Inventory Advance Definitions Supplier GDS Details
	 */
	public void setGds(final SessionContext ctx, final boolean value)
	{
		setGds( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.gds</code> attribute. 
	 * @param value the gds - Inventory Advance Definitions Supplier GDS Details
	 */
	public void setGds(final boolean value)
	{
		setGds( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.loginId</code> attribute.
	 * @return the loginId - Air Inventory Definitions Supplier Current Login Id
	 */
	public String getLoginId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOGINID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.loginId</code> attribute.
	 * @return the loginId - Air Inventory Definitions Supplier Current Login Id
	 */
	public String getLoginId()
	{
		return getLoginId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.loginId</code> attribute. 
	 * @param value the loginId - Air Inventory Definitions Supplier Current Login Id
	 */
	public void setLoginId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOGINID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.loginId</code> attribute. 
	 * @param value the loginId - Air Inventory Definitions Supplier Current Login Id
	 */
	public void setLoginId(final String value)
	{
		setLoginId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.ticketing</code> attribute.
	 * @return the ticketing - Ticketing
	 */
	public Boolean isTicketing(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TICKETING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.ticketing</code> attribute.
	 * @return the ticketing - Ticketing
	 */
	public Boolean isTicketing()
	{
		return isTicketing( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.ticketing</code> attribute. 
	 * @return the ticketing - Ticketing
	 */
	public boolean isTicketingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTicketing( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.ticketing</code> attribute. 
	 * @return the ticketing - Ticketing
	 */
	public boolean isTicketingAsPrimitive()
	{
		return isTicketingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.ticketing</code> attribute. 
	 * @param value the ticketing - Ticketing
	 */
	public void setTicketing(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TICKETING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.ticketing</code> attribute. 
	 * @param value the ticketing - Ticketing
	 */
	public void setTicketing(final Boolean value)
	{
		setTicketing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.ticketing</code> attribute. 
	 * @param value the ticketing - Ticketing
	 */
	public void setTicketing(final SessionContext ctx, final boolean value)
	{
		setTicketing( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.ticketing</code> attribute. 
	 * @param value the ticketing - Ticketing
	 */
	public void setTicketing(final boolean value)
	{
		setTicketing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.ticketOwner</code> attribute.
	 * @return the ticketOwner - Credential Information Owner Details
	 */
	public EnumerationValue getTicketOwner(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TICKETOWNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirPCCCredentialInfo.ticketOwner</code> attribute.
	 * @return the ticketOwner - Credential Information Owner Details
	 */
	public EnumerationValue getTicketOwner()
	{
		return getTicketOwner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.ticketOwner</code> attribute. 
	 * @param value the ticketOwner - Credential Information Owner Details
	 */
	public void setTicketOwner(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TICKETOWNER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirPCCCredentialInfo.ticketOwner</code> attribute. 
	 * @param value the ticketOwner - Credential Information Owner Details
	 */
	public void setTicketOwner(final EnumerationValue value)
	{
		setTicketOwner( getSession().getSessionContext(), value );
	}
	
}
