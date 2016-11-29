/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ShipAccomadationDetails ShipAccomadationDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShipAccomadationDetails extends GenericItem
{
	/** Qualifier of the <code>ShipAccomadationDetails.guest</code> attribute **/
	public static final String GUEST = "guest";
	/** Qualifier of the <code>ShipAccomadationDetails.cabinsTotal</code> attribute **/
	public static final String CABINSTOTAL = "cabinsTotal";
	/** Qualifier of the <code>ShipAccomadationDetails.cabins</code> attribute **/
	public static final String CABINS = "cabins";
	/** Qualifier of the <code>ShipAccomadationDetails.crew</code> attribute **/
	public static final String CREW = "crew";
	/** Qualifier of the <code>ShipAccomadationDetails.noOfWheelchairsAccessibleCabins</code> attribute **/
	public static final String NOOFWHEELCHAIRSACCESSIBLECABINS = "noOfWheelchairsAccessibleCabins";
	/** Qualifier of the <code>ShipAccomadationDetails.noOfCabinsWithPrivateBalconies</code> attribute **/
	public static final String NOOFCABINSWITHPRIVATEBALCONIES = "noOfCabinsWithPrivateBalconies";
	/** Qualifier of the <code>ShipAccomadationDetails.noOfDecks</code> attribute **/
	public static final String NOOFDECKS = "noOfDecks";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(GUEST, AttributeMode.INITIAL);
		tmp.put(CABINSTOTAL, AttributeMode.INITIAL);
		tmp.put(CABINS, AttributeMode.INITIAL);
		tmp.put(CREW, AttributeMode.INITIAL);
		tmp.put(NOOFWHEELCHAIRSACCESSIBLECABINS, AttributeMode.INITIAL);
		tmp.put(NOOFCABINSWITHPRIVATEBALCONIES, AttributeMode.INITIAL);
		tmp.put(NOOFDECKS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.cabins</code> attribute.
	 * @return the cabins - Cabins
	 */
	public String getCabins(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CABINS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.cabins</code> attribute.
	 * @return the cabins - Cabins
	 */
	public String getCabins()
	{
		return getCabins( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.cabins</code> attribute. 
	 * @param value the cabins - Cabins
	 */
	public void setCabins(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CABINS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.cabins</code> attribute. 
	 * @param value the cabins - Cabins
	 */
	public void setCabins(final String value)
	{
		setCabins( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.cabinsTotal</code> attribute.
	 * @return the cabinsTotal - Cabins Total
	 */
	public String getCabinsTotal(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CABINSTOTAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.cabinsTotal</code> attribute.
	 * @return the cabinsTotal - Cabins Total
	 */
	public String getCabinsTotal()
	{
		return getCabinsTotal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.cabinsTotal</code> attribute. 
	 * @param value the cabinsTotal - Cabins Total
	 */
	public void setCabinsTotal(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CABINSTOTAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.cabinsTotal</code> attribute. 
	 * @param value the cabinsTotal - Cabins Total
	 */
	public void setCabinsTotal(final String value)
	{
		setCabinsTotal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.crew</code> attribute.
	 * @return the crew - Crew
	 */
	public String getCrew(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CREW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.crew</code> attribute.
	 * @return the crew - Crew
	 */
	public String getCrew()
	{
		return getCrew( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.crew</code> attribute. 
	 * @param value the crew - Crew
	 */
	public void setCrew(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CREW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.crew</code> attribute. 
	 * @param value the crew - Crew
	 */
	public void setCrew(final String value)
	{
		setCrew( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.guest</code> attribute.
	 * @return the guest - Guest
	 */
	public String getGuest(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.guest</code> attribute.
	 * @return the guest - Guest
	 */
	public String getGuest()
	{
		return getGuest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.guest</code> attribute. 
	 * @param value the guest - Guest
	 */
	public void setGuest(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.guest</code> attribute. 
	 * @param value the guest - Guest
	 */
	public void setGuest(final String value)
	{
		setGuest( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.noOfCabinsWithPrivateBalconies</code> attribute.
	 * @return the noOfCabinsWithPrivateBalconies - No Of Cabins With Private Balconies
	 */
	public String getNoOfCabinsWithPrivateBalconies(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFCABINSWITHPRIVATEBALCONIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.noOfCabinsWithPrivateBalconies</code> attribute.
	 * @return the noOfCabinsWithPrivateBalconies - No Of Cabins With Private Balconies
	 */
	public String getNoOfCabinsWithPrivateBalconies()
	{
		return getNoOfCabinsWithPrivateBalconies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.noOfCabinsWithPrivateBalconies</code> attribute. 
	 * @param value the noOfCabinsWithPrivateBalconies - No Of Cabins With Private Balconies
	 */
	public void setNoOfCabinsWithPrivateBalconies(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFCABINSWITHPRIVATEBALCONIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.noOfCabinsWithPrivateBalconies</code> attribute. 
	 * @param value the noOfCabinsWithPrivateBalconies - No Of Cabins With Private Balconies
	 */
	public void setNoOfCabinsWithPrivateBalconies(final String value)
	{
		setNoOfCabinsWithPrivateBalconies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.noOfDecks</code> attribute.
	 * @return the noOfDecks - No Of Decks
	 */
	public String getNoOfDecks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFDECKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.noOfDecks</code> attribute.
	 * @return the noOfDecks - No Of Decks
	 */
	public String getNoOfDecks()
	{
		return getNoOfDecks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.noOfDecks</code> attribute. 
	 * @param value the noOfDecks - No Of Decks
	 */
	public void setNoOfDecks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFDECKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.noOfDecks</code> attribute. 
	 * @param value the noOfDecks - No Of Decks
	 */
	public void setNoOfDecks(final String value)
	{
		setNoOfDecks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.noOfWheelchairsAccessibleCabins</code> attribute.
	 * @return the noOfWheelchairsAccessibleCabins - No Of Wheel Chairs Accessible Cabins
	 */
	public String getNoOfWheelchairsAccessibleCabins(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFWHEELCHAIRSACCESSIBLECABINS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipAccomadationDetails.noOfWheelchairsAccessibleCabins</code> attribute.
	 * @return the noOfWheelchairsAccessibleCabins - No Of Wheel Chairs Accessible Cabins
	 */
	public String getNoOfWheelchairsAccessibleCabins()
	{
		return getNoOfWheelchairsAccessibleCabins( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.noOfWheelchairsAccessibleCabins</code> attribute. 
	 * @param value the noOfWheelchairsAccessibleCabins - No Of Wheel Chairs Accessible Cabins
	 */
	public void setNoOfWheelchairsAccessibleCabins(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFWHEELCHAIRSACCESSIBLECABINS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipAccomadationDetails.noOfWheelchairsAccessibleCabins</code> attribute. 
	 * @param value the noOfWheelchairsAccessibleCabins - No Of Wheel Chairs Accessible Cabins
	 */
	public void setNoOfWheelchairsAccessibleCabins(final String value)
	{
		setNoOfWheelchairsAccessibleCabins( getSession().getSessionContext(), value );
	}
	
}
