/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.RoomAncillary;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BreakfastSubAncillary}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBreakfastSubAncillary extends RoomAncillary
{
	/** Qualifier of the <code>BreakfastSubAncillary.numberOfAdult</code> attribute **/
	public static final String NUMBEROFADULT = "numberOfAdult";
	/** Qualifier of the <code>BreakfastSubAncillary.numberOfChild</code> attribute **/
	public static final String NUMBEROFCHILD = "numberOfChild";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(RoomAncillary.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NUMBEROFADULT, AttributeMode.INITIAL);
		tmp.put(NUMBEROFCHILD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BreakfastSubAncillary.numberOfAdult</code> attribute.
	 * @return the numberOfAdult
	 */
	public String getNumberOfAdult(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BreakfastSubAncillary.numberOfAdult</code> attribute.
	 * @return the numberOfAdult
	 */
	public String getNumberOfAdult()
	{
		return getNumberOfAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BreakfastSubAncillary.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult
	 */
	public void setNumberOfAdult(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BreakfastSubAncillary.numberOfAdult</code> attribute. 
	 * @param value the numberOfAdult
	 */
	public void setNumberOfAdult(final String value)
	{
		setNumberOfAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BreakfastSubAncillary.numberOfChild</code> attribute.
	 * @return the numberOfChild
	 */
	public String getNumberOfChild(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBEROFCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BreakfastSubAncillary.numberOfChild</code> attribute.
	 * @return the numberOfChild
	 */
	public String getNumberOfChild()
	{
		return getNumberOfChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BreakfastSubAncillary.numberOfChild</code> attribute. 
	 * @param value the numberOfChild
	 */
	public void setNumberOfChild(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBEROFCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BreakfastSubAncillary.numberOfChild</code> attribute. 
	 * @param value the numberOfChild
	 */
	public void setNumberOfChild(final String value)
	{
		setNumberOfChild( getSession().getSessionContext(), value );
	}
	
}
