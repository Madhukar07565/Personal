/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo;

import com.cnk.travelogix.orgstructure.core.iata.jalo.IATAAgency;
import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.FOCRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.FlightFOCRecord FlightFOCRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightFOCRecord extends FOCRecord
{
	/** Qualifier of the <code>FlightFOCRecord.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>FlightFOCRecord.focTicket</code> attribute **/
	public static final String FOCTICKET = "focTicket";
	/** Qualifier of the <code>FlightFOCRecord.rbd</code> attribute **/
	public static final String RBD = "rbd";
	/** Qualifier of the <code>FlightFOCRecord.noOfTickets</code> attribute **/
	public static final String NOOFTICKETS = "noOfTickets";
	/** Qualifier of the <code>FlightFOCRecord.iataNumber</code> attribute **/
	public static final String IATANUMBER = "iataNumber";
	/** Qualifier of the <code>FlightFOCRecord.focCabinClass</code> attribute **/
	public static final String FOCCABINCLASS = "focCabinClass";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(FOCRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(FOCTICKET, AttributeMode.INITIAL);
		tmp.put(RBD, AttributeMode.INITIAL);
		tmp.put(NOOFTICKETS, AttributeMode.INITIAL);
		tmp.put(IATANUMBER, AttributeMode.INITIAL);
		tmp.put(FOCCABINCLASS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.focCabinClass</code> attribute.
	 * @return the focCabinClass
	 */
	public EnumerationValue getFocCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FOCCABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.focCabinClass</code> attribute.
	 * @return the focCabinClass
	 */
	public EnumerationValue getFocCabinClass()
	{
		return getFocCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.focCabinClass</code> attribute. 
	 * @param value the focCabinClass
	 */
	public void setFocCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FOCCABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.focCabinClass</code> attribute. 
	 * @param value the focCabinClass
	 */
	public void setFocCabinClass(final EnumerationValue value)
	{
		setFocCabinClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.focTicket</code> attribute.
	 * @return the focTicket
	 */
	public Boolean isFocTicket(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FOCTICKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.focTicket</code> attribute.
	 * @return the focTicket
	 */
	public Boolean isFocTicket()
	{
		return isFocTicket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.focTicket</code> attribute. 
	 * @return the focTicket
	 */
	public boolean isFocTicketAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFocTicket( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.focTicket</code> attribute. 
	 * @return the focTicket
	 */
	public boolean isFocTicketAsPrimitive()
	{
		return isFocTicketAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.focTicket</code> attribute. 
	 * @param value the focTicket
	 */
	public void setFocTicket(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FOCTICKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.focTicket</code> attribute. 
	 * @param value the focTicket
	 */
	public void setFocTicket(final Boolean value)
	{
		setFocTicket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.focTicket</code> attribute. 
	 * @param value the focTicket
	 */
	public void setFocTicket(final SessionContext ctx, final boolean value)
	{
		setFocTicket( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.focTicket</code> attribute. 
	 * @param value the focTicket
	 */
	public void setFocTicket(final boolean value)
	{
		setFocTicket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.iataNumber</code> attribute.
	 * @return the iataNumber
	 */
	public IATAAgency getIataNumber(final SessionContext ctx)
	{
		return (IATAAgency)getProperty( ctx, IATANUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.iataNumber</code> attribute.
	 * @return the iataNumber
	 */
	public IATAAgency getIataNumber()
	{
		return getIataNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.iataNumber</code> attribute. 
	 * @param value the iataNumber
	 */
	public void setIataNumber(final SessionContext ctx, final IATAAgency value)
	{
		setProperty(ctx, IATANUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.iataNumber</code> attribute. 
	 * @param value the iataNumber
	 */
	public void setIataNumber(final IATAAgency value)
	{
		setIataNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.noOfTickets</code> attribute.
	 * @return the noOfTickets
	 */
	public Integer getNoOfTickets(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFTICKETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.noOfTickets</code> attribute.
	 * @return the noOfTickets
	 */
	public Integer getNoOfTickets()
	{
		return getNoOfTickets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.noOfTickets</code> attribute. 
	 * @return the noOfTickets
	 */
	public int getNoOfTicketsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfTickets( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.noOfTickets</code> attribute. 
	 * @return the noOfTickets
	 */
	public int getNoOfTicketsAsPrimitive()
	{
		return getNoOfTicketsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.noOfTickets</code> attribute. 
	 * @param value the noOfTickets
	 */
	public void setNoOfTickets(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFTICKETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.noOfTickets</code> attribute. 
	 * @param value the noOfTickets
	 */
	public void setNoOfTickets(final Integer value)
	{
		setNoOfTickets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.noOfTickets</code> attribute. 
	 * @param value the noOfTickets
	 */
	public void setNoOfTickets(final SessionContext ctx, final int value)
	{
		setNoOfTickets( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.noOfTickets</code> attribute. 
	 * @param value the noOfTickets
	 */
	public void setNoOfTickets(final int value)
	{
		setNoOfTickets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.rbd</code> attribute.
	 * @return the rbd
	 */
	public EnumerationValue getRbd(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RBD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightFOCRecord.rbd</code> attribute.
	 * @return the rbd
	 */
	public EnumerationValue getRbd()
	{
		return getRbd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.rbd</code> attribute. 
	 * @param value the rbd
	 */
	public void setRbd(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RBD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightFOCRecord.rbd</code> attribute. 
	 * @param value the rbd
	 */
	public void setRbd(final EnumerationValue value)
	{
		setRbd( getSession().getSessionContext(), value );
	}
	
}
