/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.NonPrimaryTraveller;
import com.cnk.travelogix.common.core.jalo.Traveller;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem AccommodationTraveller}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccommodationTraveller extends Traveller
{
	/** Qualifier of the <code>AccommodationTraveller.specialRequest</code> attribute **/
	public static final String SPECIALREQUEST = "specialRequest";
	/** Qualifier of the <code>AccommodationTraveller.nonPrimaryTravellerList</code> attribute **/
	public static final String NONPRIMARYTRAVELLERLIST = "nonPrimaryTravellerList";
	/**
	* {@link OneToManyHandler} for handling 1:n NONPRIMARYTRAVELLERLIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<NonPrimaryTraveller> NONPRIMARYTRAVELLERLISTHANDLER = new OneToManyHandler<NonPrimaryTraveller>(
	CommonCoreConstants.TC.NONPRIMARYTRAVELLER,
	false,
	"accommodationTraveller",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Traveller.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SPECIALREQUEST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationTraveller.nonPrimaryTravellerList</code> attribute.
	 * @return the nonPrimaryTravellerList
	 */
	public List<NonPrimaryTraveller> getNonPrimaryTravellerList(final SessionContext ctx)
	{
		return (List<NonPrimaryTraveller>)NONPRIMARYTRAVELLERLISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationTraveller.nonPrimaryTravellerList</code> attribute.
	 * @return the nonPrimaryTravellerList
	 */
	public List<NonPrimaryTraveller> getNonPrimaryTravellerList()
	{
		return getNonPrimaryTravellerList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationTraveller.nonPrimaryTravellerList</code> attribute. 
	 * @param value the nonPrimaryTravellerList
	 */
	public void setNonPrimaryTravellerList(final SessionContext ctx, final List<NonPrimaryTraveller> value)
	{
		NONPRIMARYTRAVELLERLISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationTraveller.nonPrimaryTravellerList</code> attribute. 
	 * @param value the nonPrimaryTravellerList
	 */
	public void setNonPrimaryTravellerList(final List<NonPrimaryTraveller> value)
	{
		setNonPrimaryTravellerList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to nonPrimaryTravellerList. 
	 * @param value the item to add to nonPrimaryTravellerList
	 */
	public void addToNonPrimaryTravellerList(final SessionContext ctx, final NonPrimaryTraveller value)
	{
		NONPRIMARYTRAVELLERLISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to nonPrimaryTravellerList. 
	 * @param value the item to add to nonPrimaryTravellerList
	 */
	public void addToNonPrimaryTravellerList(final NonPrimaryTraveller value)
	{
		addToNonPrimaryTravellerList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from nonPrimaryTravellerList. 
	 * @param value the item to remove from nonPrimaryTravellerList
	 */
	public void removeFromNonPrimaryTravellerList(final SessionContext ctx, final NonPrimaryTraveller value)
	{
		NONPRIMARYTRAVELLERLISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from nonPrimaryTravellerList. 
	 * @param value the item to remove from nonPrimaryTravellerList
	 */
	public void removeFromNonPrimaryTravellerList(final NonPrimaryTraveller value)
	{
		removeFromNonPrimaryTravellerList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationTraveller.specialRequest</code> attribute.
	 * @return the specialRequest
	 */
	public String getSpecialRequest(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SPECIALREQUEST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationTraveller.specialRequest</code> attribute.
	 * @return the specialRequest
	 */
	public String getSpecialRequest()
	{
		return getSpecialRequest( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationTraveller.specialRequest</code> attribute. 
	 * @param value the specialRequest
	 */
	public void setSpecialRequest(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SPECIALREQUEST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationTraveller.specialRequest</code> attribute. 
	 * @param value the specialRequest
	 */
	public void setSpecialRequest(final String value)
	{
		setSpecialRequest( getSession().getSessionContext(), value );
	}
	
}
