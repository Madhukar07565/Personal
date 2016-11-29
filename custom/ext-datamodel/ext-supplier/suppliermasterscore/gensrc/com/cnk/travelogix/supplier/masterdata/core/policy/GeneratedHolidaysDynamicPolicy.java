/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.masterdata.core.policy;

import com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.masterdata.core.policy.HolidaysDynamicPolicy HolidaysDynamicPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidaysDynamicPolicy extends AbstractDynamicPolicy
{
	/** Qualifier of the <code>HolidaysDynamicPolicy.perRoom</code> attribute **/
	public static final String PERROOM = "perRoom";
	/** Qualifier of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute **/
	public static final String ALLPAXTYPES = "allPaxTypes";
	/** Qualifier of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute **/
	public static final String ADULTINTWIN = "adultInTwin";
	/** Qualifier of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute **/
	public static final String ADULTINDOUBLE = "adultInDouble";
	/** Qualifier of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute **/
	public static final String CHILDWITHEXTRABED = "childWithExtraBed";
	/** Qualifier of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute **/
	public static final String CHILDWITHNOBED = "childWithNoBed";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDynamicPolicy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PERROOM, AttributeMode.INITIAL);
		tmp.put(ALLPAXTYPES, AttributeMode.INITIAL);
		tmp.put(ADULTINTWIN, AttributeMode.INITIAL);
		tmp.put(ADULTINDOUBLE, AttributeMode.INITIAL);
		tmp.put(CHILDWITHEXTRABED, AttributeMode.INITIAL);
		tmp.put(CHILDWITHNOBED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute.
	 * @return the adultInDouble
	 */
	public Boolean isAdultInDouble(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ADULTINDOUBLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute.
	 * @return the adultInDouble
	 */
	public Boolean isAdultInDouble()
	{
		return isAdultInDouble( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute. 
	 * @return the adultInDouble
	 */
	public boolean isAdultInDoubleAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAdultInDouble( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute. 
	 * @return the adultInDouble
	 */
	public boolean isAdultInDoubleAsPrimitive()
	{
		return isAdultInDoubleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute. 
	 * @param value the adultInDouble
	 */
	public void setAdultInDouble(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ADULTINDOUBLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute. 
	 * @param value the adultInDouble
	 */
	public void setAdultInDouble(final Boolean value)
	{
		setAdultInDouble( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute. 
	 * @param value the adultInDouble
	 */
	public void setAdultInDouble(final SessionContext ctx, final boolean value)
	{
		setAdultInDouble( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.adultInDouble</code> attribute. 
	 * @param value the adultInDouble
	 */
	public void setAdultInDouble(final boolean value)
	{
		setAdultInDouble( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute.
	 * @return the adultInTwin
	 */
	public Boolean isAdultInTwin(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ADULTINTWIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute.
	 * @return the adultInTwin
	 */
	public Boolean isAdultInTwin()
	{
		return isAdultInTwin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute. 
	 * @return the adultInTwin
	 */
	public boolean isAdultInTwinAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAdultInTwin( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute. 
	 * @return the adultInTwin
	 */
	public boolean isAdultInTwinAsPrimitive()
	{
		return isAdultInTwinAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute. 
	 * @param value the adultInTwin
	 */
	public void setAdultInTwin(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ADULTINTWIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute. 
	 * @param value the adultInTwin
	 */
	public void setAdultInTwin(final Boolean value)
	{
		setAdultInTwin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute. 
	 * @param value the adultInTwin
	 */
	public void setAdultInTwin(final SessionContext ctx, final boolean value)
	{
		setAdultInTwin( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.adultInTwin</code> attribute. 
	 * @param value the adultInTwin
	 */
	public void setAdultInTwin(final boolean value)
	{
		setAdultInTwin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute.
	 * @return the allPaxTypes
	 */
	public Boolean isAllPaxTypes(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ALLPAXTYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute.
	 * @return the allPaxTypes
	 */
	public Boolean isAllPaxTypes()
	{
		return isAllPaxTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute. 
	 * @return the allPaxTypes
	 */
	public boolean isAllPaxTypesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAllPaxTypes( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute. 
	 * @return the allPaxTypes
	 */
	public boolean isAllPaxTypesAsPrimitive()
	{
		return isAllPaxTypesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute. 
	 * @param value the allPaxTypes
	 */
	public void setAllPaxTypes(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ALLPAXTYPES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute. 
	 * @param value the allPaxTypes
	 */
	public void setAllPaxTypes(final Boolean value)
	{
		setAllPaxTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute. 
	 * @param value the allPaxTypes
	 */
	public void setAllPaxTypes(final SessionContext ctx, final boolean value)
	{
		setAllPaxTypes( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.allPaxTypes</code> attribute. 
	 * @param value the allPaxTypes
	 */
	public void setAllPaxTypes(final boolean value)
	{
		setAllPaxTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute.
	 * @return the childWithExtraBed
	 */
	public Boolean isChildWithExtraBed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHILDWITHEXTRABED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute.
	 * @return the childWithExtraBed
	 */
	public Boolean isChildWithExtraBed()
	{
		return isChildWithExtraBed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute. 
	 * @return the childWithExtraBed
	 */
	public boolean isChildWithExtraBedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChildWithExtraBed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute. 
	 * @return the childWithExtraBed
	 */
	public boolean isChildWithExtraBedAsPrimitive()
	{
		return isChildWithExtraBedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute. 
	 * @param value the childWithExtraBed
	 */
	public void setChildWithExtraBed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHILDWITHEXTRABED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute. 
	 * @param value the childWithExtraBed
	 */
	public void setChildWithExtraBed(final Boolean value)
	{
		setChildWithExtraBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute. 
	 * @param value the childWithExtraBed
	 */
	public void setChildWithExtraBed(final SessionContext ctx, final boolean value)
	{
		setChildWithExtraBed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.childWithExtraBed</code> attribute. 
	 * @param value the childWithExtraBed
	 */
	public void setChildWithExtraBed(final boolean value)
	{
		setChildWithExtraBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute.
	 * @return the childWithNoBed
	 */
	public Boolean isChildWithNoBed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHILDWITHNOBED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute.
	 * @return the childWithNoBed
	 */
	public Boolean isChildWithNoBed()
	{
		return isChildWithNoBed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute. 
	 * @return the childWithNoBed
	 */
	public boolean isChildWithNoBedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChildWithNoBed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute. 
	 * @return the childWithNoBed
	 */
	public boolean isChildWithNoBedAsPrimitive()
	{
		return isChildWithNoBedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute. 
	 * @param value the childWithNoBed
	 */
	public void setChildWithNoBed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHILDWITHNOBED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute. 
	 * @param value the childWithNoBed
	 */
	public void setChildWithNoBed(final Boolean value)
	{
		setChildWithNoBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute. 
	 * @param value the childWithNoBed
	 */
	public void setChildWithNoBed(final SessionContext ctx, final boolean value)
	{
		setChildWithNoBed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.childWithNoBed</code> attribute. 
	 * @param value the childWithNoBed
	 */
	public void setChildWithNoBed(final boolean value)
	{
		setChildWithNoBed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.perRoom</code> attribute.
	 * @return the perRoom
	 */
	public Boolean isPerRoom(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERROOM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.perRoom</code> attribute.
	 * @return the perRoom
	 */
	public Boolean isPerRoom()
	{
		return isPerRoom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.perRoom</code> attribute. 
	 * @return the perRoom
	 */
	public boolean isPerRoomAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerRoom( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidaysDynamicPolicy.perRoom</code> attribute. 
	 * @return the perRoom
	 */
	public boolean isPerRoomAsPrimitive()
	{
		return isPerRoomAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.perRoom</code> attribute. 
	 * @param value the perRoom
	 */
	public void setPerRoom(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERROOM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.perRoom</code> attribute. 
	 * @param value the perRoom
	 */
	public void setPerRoom(final Boolean value)
	{
		setPerRoom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.perRoom</code> attribute. 
	 * @param value the perRoom
	 */
	public void setPerRoom(final SessionContext ctx, final boolean value)
	{
		setPerRoom( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidaysDynamicPolicy.perRoom</code> attribute. 
	 * @param value the perRoom
	 */
	public void setPerRoom(final boolean value)
	{
		setPerRoom( getSession().getSessionContext(), value );
	}
	
}
