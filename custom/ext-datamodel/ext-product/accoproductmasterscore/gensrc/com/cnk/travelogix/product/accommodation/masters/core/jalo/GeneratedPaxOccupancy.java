/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.accommodation.masters.core.jalo;

import com.cnk.travelogix.product.accommodation.masters.core.constants.AccoproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.accommodation.masters.core.jalo.PaxOccupancy PaxOccupancy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaxOccupancy extends GenericItem
{
	/** Qualifier of the <code>PaxOccupancy.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>PaxOccupancy.maxAdults</code> attribute **/
	public static final String MAXADULTS = "maxAdults";
	/** Qualifier of the <code>PaxOccupancy.maxChild</code> attribute **/
	public static final String MAXCHILD = "maxChild";
	/** Qualifier of the <code>PaxOccupancy.maxPax</code> attribute **/
	public static final String MAXPAX = "maxPax";
	/** Qualifier of the <code>PaxOccupancy.roomId</code> attribute **/
	public static final String ROOMID = "roomId";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(MAXADULTS, AttributeMode.INITIAL);
		tmp.put(MAXCHILD, AttributeMode.INITIAL);
		tmp.put(MAXPAX, AttributeMode.INITIAL);
		tmp.put(ROOMID, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.category</code> attribute.
	 * @return the category - Room Category
	 */
	public EnumerationValue getCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.category</code> attribute.
	 * @return the category - Room Category
	 */
	public EnumerationValue getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.category</code> attribute. 
	 * @param value the category - Room Category
	 */
	public void setCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.category</code> attribute. 
	 * @param value the category - Room Category
	 */
	public void setCategory(final EnumerationValue value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxAdults</code> attribute.
	 * @return the maxAdults - Maximum Adults
	 */
	public Integer getMaxAdults(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXADULTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxAdults</code> attribute.
	 * @return the maxAdults - Maximum Adults
	 */
	public Integer getMaxAdults()
	{
		return getMaxAdults( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxAdults</code> attribute. 
	 * @return the maxAdults - Maximum Adults
	 */
	public int getMaxAdultsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxAdults( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxAdults</code> attribute. 
	 * @return the maxAdults - Maximum Adults
	 */
	public int getMaxAdultsAsPrimitive()
	{
		return getMaxAdultsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxAdults</code> attribute. 
	 * @param value the maxAdults - Maximum Adults
	 */
	public void setMaxAdults(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXADULTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxAdults</code> attribute. 
	 * @param value the maxAdults - Maximum Adults
	 */
	public void setMaxAdults(final Integer value)
	{
		setMaxAdults( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxAdults</code> attribute. 
	 * @param value the maxAdults - Maximum Adults
	 */
	public void setMaxAdults(final SessionContext ctx, final int value)
	{
		setMaxAdults( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxAdults</code> attribute. 
	 * @param value the maxAdults - Maximum Adults
	 */
	public void setMaxAdults(final int value)
	{
		setMaxAdults( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxChild</code> attribute.
	 * @return the maxChild - Maximum Child
	 */
	public Integer getMaxChild(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxChild</code> attribute.
	 * @return the maxChild - Maximum Child
	 */
	public Integer getMaxChild()
	{
		return getMaxChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxChild</code> attribute. 
	 * @return the maxChild - Maximum Child
	 */
	public int getMaxChildAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxChild( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxChild</code> attribute. 
	 * @return the maxChild - Maximum Child
	 */
	public int getMaxChildAsPrimitive()
	{
		return getMaxChildAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxChild</code> attribute. 
	 * @param value the maxChild - Maximum Child
	 */
	public void setMaxChild(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxChild</code> attribute. 
	 * @param value the maxChild - Maximum Child
	 */
	public void setMaxChild(final Integer value)
	{
		setMaxChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxChild</code> attribute. 
	 * @param value the maxChild - Maximum Child
	 */
	public void setMaxChild(final SessionContext ctx, final int value)
	{
		setMaxChild( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxChild</code> attribute. 
	 * @param value the maxChild - Maximum Child
	 */
	public void setMaxChild(final int value)
	{
		setMaxChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxPax</code> attribute.
	 * @return the maxPax - Maximum Pax
	 */
	public Integer getMaxPax(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxPax</code> attribute.
	 * @return the maxPax - Maximum Pax
	 */
	public Integer getMaxPax()
	{
		return getMaxPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxPax</code> attribute. 
	 * @return the maxPax - Maximum Pax
	 */
	public int getMaxPaxAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPax( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.maxPax</code> attribute. 
	 * @return the maxPax - Maximum Pax
	 */
	public int getMaxPaxAsPrimitive()
	{
		return getMaxPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxPax</code> attribute. 
	 * @param value the maxPax - Maximum Pax
	 */
	public void setMaxPax(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxPax</code> attribute. 
	 * @param value the maxPax - Maximum Pax
	 */
	public void setMaxPax(final Integer value)
	{
		setMaxPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxPax</code> attribute. 
	 * @param value the maxPax - Maximum Pax
	 */
	public void setMaxPax(final SessionContext ctx, final int value)
	{
		setMaxPax( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.maxPax</code> attribute. 
	 * @param value the maxPax - Maximum Pax
	 */
	public void setMaxPax(final int value)
	{
		setMaxPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.roomId</code> attribute.
	 * @return the roomId - Room ID
	 */
	public String getRoomId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROOMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxOccupancy.roomId</code> attribute.
	 * @return the roomId - Room ID
	 */
	public String getRoomId()
	{
		return getRoomId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.roomId</code> attribute. 
	 * @param value the roomId - Room ID
	 */
	public void setRoomId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROOMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxOccupancy.roomId</code> attribute. 
	 * @param value the roomId - Room ID
	 */
	public void setRoomId(final String value)
	{
		setRoomId( getSession().getSessionContext(), value );
	}
	
}
