/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.corporate.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.TravelogixCorporateUnit;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.corporate.jalo.Designation Designation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDesignation extends GenericItem
{
	/** Qualifier of the <code>Designation.designation</code> attribute **/
	public static final String DESIGNATION = "designation";
	/** Qualifier of the <code>Designation.grade</code> attribute **/
	public static final String GRADE = "grade";
	/** Qualifier of the <code>Designation.travelogixCorporateUnit</code> attribute **/
	public static final String TRAVELOGIXCORPORATEUNIT = "travelogixCorporateUnit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXCORPORATEUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDesignation> TRAVELOGIXCORPORATEUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedDesignation>(
	ClientcoreConstants.TC.DESIGNATION,
	false,
	"travelogixCorporateUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DESIGNATION, AttributeMode.INITIAL);
		tmp.put(GRADE, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXCORPORATEUNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELOGIXCORPORATEUNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designation.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESIGNATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designation.designation</code> attribute.
	 * @return the designation
	 */
	public String getDesignation()
	{
		return getDesignation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designation.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESIGNATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designation.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final String value)
	{
		setDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designation.grade</code> attribute.
	 * @return the grade
	 */
	public EnumerationValue getGrade(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designation.grade</code> attribute.
	 * @return the grade
	 */
	public EnumerationValue getGrade()
	{
		return getGrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designation.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designation.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final EnumerationValue value)
	{
		setGrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designation.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit(final SessionContext ctx)
	{
		return (TravelogixCorporateUnit)getProperty( ctx, TRAVELOGIXCORPORATEUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Designation.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit()
	{
		return getTravelogixCorporateUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designation.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final SessionContext ctx, final TravelogixCorporateUnit value)
	{
		TRAVELOGIXCORPORATEUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Designation.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnit( getSession().getSessionContext(), value );
	}
	
}
