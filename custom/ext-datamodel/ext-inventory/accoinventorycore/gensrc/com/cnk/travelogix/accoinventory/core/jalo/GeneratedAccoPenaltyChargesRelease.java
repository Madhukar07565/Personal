/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AccoCutoffAndCharges;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AccoPenaltyChargesRelease AccoPenaltyChargesRelease}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoPenaltyChargesRelease extends GenericItem
{
	/** Qualifier of the <code>AccoPenaltyChargesRelease.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.mealType</code> attribute **/
	public static final String MEALTYPE = "mealType";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.specificDates</code> attribute **/
	public static final String SPECIFICDATES = "specificDates";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.dateRange</code> attribute **/
	public static final String DATERANGE = "dateRange";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.releaseTime</code> attribute **/
	public static final String RELEASETIME = "releaseTime";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.accoSupplierAdvanceDefinition</code> attribute **/
	public static final String ACCOSUPPLIERADVANCEDEFINITION = "accoSupplierAdvanceDefinition";
	/** Qualifier of the <code>AccoPenaltyChargesRelease.charges</code> attribute **/
	public static final String CHARGES = "charges";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoPenaltyChargesRelease> ACCOSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoPenaltyChargesRelease>(
	AccoinventorycoreConstants.TC.ACCOPENALTYCHARGESRELEASE,
	false,
	"accoSupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoCutoffAndCharges> CHARGESHANDLER = new OneToManyHandler<AccoCutoffAndCharges>(
	AccoinventorycoreConstants.TC.ACCOCUTOFFANDCHARGES,
	false,
	"accoPenaltyChargesRelease",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(MEALTYPE, AttributeMode.INITIAL);
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(SPECIFICDATES, AttributeMode.INITIAL);
		tmp.put(DATERANGE, AttributeMode.INITIAL);
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		tmp.put(RELEASETIME, AttributeMode.INITIAL);
		tmp.put(ACCOSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.accoSupplierAdvanceDefinition</code> attribute.
	 * @return the accoSupplierAdvanceDefinition
	 */
	public AccoSupplierAdvanceDefinition getAccoSupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AccoSupplierAdvanceDefinition)getProperty( ctx, ACCOSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.accoSupplierAdvanceDefinition</code> attribute.
	 * @return the accoSupplierAdvanceDefinition
	 */
	public AccoSupplierAdvanceDefinition getAccoSupplierAdvanceDefinition()
	{
		return getAccoSupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.accoSupplierAdvanceDefinition</code> attribute. 
	 * @param value the accoSupplierAdvanceDefinition
	 */
	public void setAccoSupplierAdvanceDefinition(final SessionContext ctx, final AccoSupplierAdvanceDefinition value)
	{
		ACCOSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.accoSupplierAdvanceDefinition</code> attribute. 
	 * @param value the accoSupplierAdvanceDefinition
	 */
	public void setAccoSupplierAdvanceDefinition(final AccoSupplierAdvanceDefinition value)
	{
		setAccoSupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.appliedOn</code> attribute.
	 * @return the appliedOn - Applied On
	 */
	public EnumerationValue getAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.appliedOn</code> attribute.
	 * @return the appliedOn - Applied On
	 */
	public EnumerationValue getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied On
	 */
	public void setAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied On
	 */
	public void setAppliedOn(final EnumerationValue value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.charges</code> attribute.
	 * @return the charges
	 */
	public Collection<AccoCutoffAndCharges> getCharges(final SessionContext ctx)
	{
		return CHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.charges</code> attribute.
	 * @return the charges
	 */
	public Collection<AccoCutoffAndCharges> getCharges()
	{
		return getCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.charges</code> attribute. 
	 * @param value the charges
	 */
	public void setCharges(final SessionContext ctx, final Collection<AccoCutoffAndCharges> value)
	{
		CHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.charges</code> attribute. 
	 * @param value the charges
	 */
	public void setCharges(final Collection<AccoCutoffAndCharges> value)
	{
		setCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to charges. 
	 * @param value the item to add to charges
	 */
	public void addToCharges(final SessionContext ctx, final AccoCutoffAndCharges value)
	{
		CHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to charges. 
	 * @param value the item to add to charges
	 */
	public void addToCharges(final AccoCutoffAndCharges value)
	{
		addToCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from charges. 
	 * @param value the item to remove from charges
	 */
	public void removeFromCharges(final SessionContext ctx, final AccoCutoffAndCharges value)
	{
		CHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from charges. 
	 * @param value the item to remove from charges
	 */
	public void removeFromCharges(final AccoCutoffAndCharges value)
	{
		removeFromCharges( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOSUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, DATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.dateRange</code> attribute.
	 * @return the dateRange - Date Range
	 */
	public StandardDateRange getDateRange()
	{
		return getDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, DATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.dateRange</code> attribute. 
	 * @param value the dateRange - Date Range
	 */
	public void setDateRange(final StandardDateRange value)
	{
		setDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.definedBy</code> attribute.
	 * @return the definedBy - Defined By
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.definedBy</code> attribute.
	 * @return the definedBy - Defined By
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.definedBy</code> attribute. 
	 * @param value the definedBy - Defined By
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.definedBy</code> attribute. 
	 * @param value the definedBy - Defined By
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.mealType</code> attribute.
	 * @return the mealType - Meal Type
	 */
	public EnumerationValue getMealType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.mealType</code> attribute.
	 * @return the mealType - Meal Type
	 */
	public EnumerationValue getMealType()
	{
		return getMealType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.mealType</code> attribute. 
	 * @param value the mealType - Meal Type
	 */
	public void setMealType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.mealType</code> attribute. 
	 * @param value the mealType - Meal Type
	 */
	public void setMealType(final EnumerationValue value)
	{
		setMealType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.releaseTime</code> attribute.
	 * @return the releaseTime - Applied On
	 */
	public String getReleaseTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RELEASETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.releaseTime</code> attribute.
	 * @return the releaseTime - Applied On
	 */
	public String getReleaseTime()
	{
		return getReleaseTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.releaseTime</code> attribute. 
	 * @param value the releaseTime - Applied On
	 */
	public void setReleaseTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RELEASETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.releaseTime</code> attribute. 
	 * @param value the releaseTime - Applied On
	 */
	public void setReleaseTime(final String value)
	{
		setReleaseTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.roomCategory</code> attribute.
	 * @return the roomCategory - Room Category
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.roomCategory</code> attribute.
	 * @return the roomCategory - Room Category
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.roomCategory</code> attribute. 
	 * @param value the roomCategory - Room Category
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.roomCategory</code> attribute. 
	 * @param value the roomCategory - Room Category
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.roomType</code> attribute.
	 * @return the roomType - Room Type
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.roomType</code> attribute. 
	 * @param value the roomType - Room Type
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.specificDates</code> attribute.
	 * @return the specificDates - Specific Dates
	 */
	public Collection<Date> getSpecificDates(final SessionContext ctx)
	{
		Collection<Date> coll = (Collection<Date>)getProperty( ctx, SPECIFICDATES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoPenaltyChargesRelease.specificDates</code> attribute.
	 * @return the specificDates - Specific Dates
	 */
	public Collection<Date> getSpecificDates()
	{
		return getSpecificDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.specificDates</code> attribute. 
	 * @param value the specificDates - Specific Dates
	 */
	public void setSpecificDates(final SessionContext ctx, final Collection<Date> value)
	{
		setProperty(ctx, SPECIFICDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoPenaltyChargesRelease.specificDates</code> attribute. 
	 * @param value the specificDates - Specific Dates
	 */
	public void setSpecificDates(final Collection<Date> value)
	{
		setSpecificDates( getSession().getSessionContext(), value );
	}
	
}
