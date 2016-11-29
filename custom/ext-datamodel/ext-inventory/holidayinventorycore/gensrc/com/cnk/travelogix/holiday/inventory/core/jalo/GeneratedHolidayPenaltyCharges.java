/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.holiday.inventory.core.jalo;

import com.cnk.travelogix.holiday.inventory.core.constants.HolidayinventorycoreConstants;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayCutOffAndCharges;
import com.cnk.travelogix.holiday.inventory.core.jalo.HolidayInvSupplierAdvanceDefinition;
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
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.holiday.inventory.core.jalo.HolidayPenaltyCharges HolidayPenaltyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedHolidayPenaltyCharges extends GenericItem
{
	/** Qualifier of the <code>HolidayPenaltyCharges.validateForType</code> attribute **/
	public static final String VALIDATEFORTYPE = "validateForType";
	/** Qualifier of the <code>HolidayPenaltyCharges.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>HolidayPenaltyCharges.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	/** Qualifier of the <code>HolidayPenaltyCharges.thresholdAppliedOn</code> attribute **/
	public static final String THRESHOLDAPPLIEDON = "thresholdAppliedOn";
	/** Qualifier of the <code>HolidayPenaltyCharges.HolidayInvSupplierAdvanceDefinition</code> attribute **/
	public static final String HOLIDAYINVSUPPLIERADVANCEDEFINITION = "HolidayInvSupplierAdvanceDefinition";
	/** Qualifier of the <code>HolidayPenaltyCharges.charges</code> attribute **/
	public static final String CHARGES = "charges";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOLIDAYINVSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedHolidayPenaltyCharges> HOLIDAYINVSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedHolidayPenaltyCharges>(
	HolidayinventorycoreConstants.TC.HOLIDAYPENALTYCHARGES,
	false,
	"HolidayInvSupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<HolidayCutOffAndCharges> CHARGESHANDLER = new OneToManyHandler<HolidayCutOffAndCharges>(
	HolidayinventorycoreConstants.TC.HOLIDAYCUTOFFANDCHARGES,
	false,
	"holidayPenaltyCharges",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VALIDATEFORTYPE, AttributeMode.INITIAL);
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		tmp.put(THRESHOLDAPPLIEDON, AttributeMode.INITIAL);
		tmp.put(HOLIDAYINVSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.appliedOn</code> attribute.
	 * @return the appliedOn - Applied on
	 */
	public EnumerationValue getAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.appliedOn</code> attribute.
	 * @return the appliedOn - Applied on
	 */
	public EnumerationValue getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied on
	 */
	public void setAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied on
	 */
	public void setAppliedOn(final EnumerationValue value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.charges</code> attribute.
	 * @return the charges
	 */
	public Collection<HolidayCutOffAndCharges> getCharges(final SessionContext ctx)
	{
		return CHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.charges</code> attribute.
	 * @return the charges
	 */
	public Collection<HolidayCutOffAndCharges> getCharges()
	{
		return getCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.charges</code> attribute. 
	 * @param value the charges
	 */
	public void setCharges(final SessionContext ctx, final Collection<HolidayCutOffAndCharges> value)
	{
		CHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.charges</code> attribute. 
	 * @param value the charges
	 */
	public void setCharges(final Collection<HolidayCutOffAndCharges> value)
	{
		setCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to charges. 
	 * @param value the item to add to charges
	 */
	public void addToCharges(final SessionContext ctx, final HolidayCutOffAndCharges value)
	{
		CHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to charges. 
	 * @param value the item to add to charges
	 */
	public void addToCharges(final HolidayCutOffAndCharges value)
	{
		addToCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from charges. 
	 * @param value the item to remove from charges
	 */
	public void removeFromCharges(final SessionContext ctx, final HolidayCutOffAndCharges value)
	{
		CHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from charges. 
	 * @param value the item to remove from charges
	 */
	public void removeFromCharges(final HolidayCutOffAndCharges value)
	{
		removeFromCharges( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		HOLIDAYINVSUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.definedBy</code> attribute.
	 * @return the definedBy - Holiday Defined By
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.definedBy</code> attribute.
	 * @return the definedBy - Holiday Defined By
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.definedBy</code> attribute. 
	 * @param value the definedBy - Holiday Defined By
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.definedBy</code> attribute. 
	 * @param value the definedBy - Holiday Defined By
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.HolidayInvSupplierAdvanceDefinition</code> attribute.
	 * @return the HolidayInvSupplierAdvanceDefinition
	 */
	public HolidayInvSupplierAdvanceDefinition getHolidayInvSupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (HolidayInvSupplierAdvanceDefinition)getProperty( ctx, HOLIDAYINVSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.HolidayInvSupplierAdvanceDefinition</code> attribute.
	 * @return the HolidayInvSupplierAdvanceDefinition
	 */
	public HolidayInvSupplierAdvanceDefinition getHolidayInvSupplierAdvanceDefinition()
	{
		return getHolidayInvSupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.HolidayInvSupplierAdvanceDefinition</code> attribute. 
	 * @param value the HolidayInvSupplierAdvanceDefinition
	 */
	public void setHolidayInvSupplierAdvanceDefinition(final SessionContext ctx, final HolidayInvSupplierAdvanceDefinition value)
	{
		HOLIDAYINVSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.HolidayInvSupplierAdvanceDefinition</code> attribute. 
	 * @param value the HolidayInvSupplierAdvanceDefinition
	 */
	public void setHolidayInvSupplierAdvanceDefinition(final HolidayInvSupplierAdvanceDefinition value)
	{
		setHolidayInvSupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.thresholdAppliedOn</code> attribute.
	 * @return the thresholdAppliedOn - Threshold applicable on
	 */
	public EnumerationValue getThresholdAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDAPPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.thresholdAppliedOn</code> attribute.
	 * @return the thresholdAppliedOn - Threshold applicable on
	 */
	public EnumerationValue getThresholdAppliedOn()
	{
		return getThresholdAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.thresholdAppliedOn</code> attribute. 
	 * @param value the thresholdAppliedOn - Threshold applicable on
	 */
	public void setThresholdAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDAPPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.thresholdAppliedOn</code> attribute. 
	 * @param value the thresholdAppliedOn - Threshold applicable on
	 */
	public void setThresholdAppliedOn(final EnumerationValue value)
	{
		setThresholdAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.validateForType</code> attribute.
	 * @return the validateForType - Type of package
	 */
	public EnumerationValue getValidateForType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VALIDATEFORTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>HolidayPenaltyCharges.validateForType</code> attribute.
	 * @return the validateForType - Type of package
	 */
	public EnumerationValue getValidateForType()
	{
		return getValidateForType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.validateForType</code> attribute. 
	 * @param value the validateForType - Type of package
	 */
	public void setValidateForType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VALIDATEFORTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>HolidayPenaltyCharges.validateForType</code> attribute. 
	 * @param value the validateForType - Type of package
	 */
	public void setValidateForType(final EnumerationValue value)
	{
		setValidateForType( getSession().getSessionContext(), value );
	}
	
}
