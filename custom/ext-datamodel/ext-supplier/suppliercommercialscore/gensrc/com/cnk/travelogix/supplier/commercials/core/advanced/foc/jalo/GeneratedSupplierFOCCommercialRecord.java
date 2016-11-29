/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.FOCRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierFOCFeeCommercial;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.SupplierFOCCommercialRecord SupplierFOCCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierFOCCommercialRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute **/
	public static final String PLBAPPLICABLE = "plbApplicable";
	/** Qualifier of the <code>SupplierFOCCommercialRecord.focCommercial</code> attribute **/
	public static final String FOCCOMMERCIAL = "focCommercial";
	/** Qualifier of the <code>SupplierFOCCommercialRecord.focRecords</code> attribute **/
	public static final String FOCRECORDS = "focRecords";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FOCCOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierFOCCommercialRecord> FOCCOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierFOCCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERFOCCOMMERCIALRECORD,
	false,
	"focCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FOCRECORDS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FOCRecord> FOCRECORDSHANDLER = new OneToManyHandler<FOCRecord>(
	SuppliercommercialscoreConstants.TC.FOCRECORD,
	true,
	"focCommercialRecord",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PLBAPPLICABLE, AttributeMode.INITIAL);
		tmp.put(FOCCOMMERCIAL, AttributeMode.INITIAL);
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
		FOCCOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercialRecord.focCommercial</code> attribute.
	 * @return the focCommercial
	 */
	public SupplierFOCFeeCommercial getFocCommercial(final SessionContext ctx)
	{
		return (SupplierFOCFeeCommercial)getProperty( ctx, FOCCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercialRecord.focCommercial</code> attribute.
	 * @return the focCommercial
	 */
	public SupplierFOCFeeCommercial getFocCommercial()
	{
		return getFocCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercialRecord.focCommercial</code> attribute. 
	 * @param value the focCommercial
	 */
	public void setFocCommercial(final SessionContext ctx, final SupplierFOCFeeCommercial value)
	{
		FOCCOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercialRecord.focCommercial</code> attribute. 
	 * @param value the focCommercial
	 */
	public void setFocCommercial(final SupplierFOCFeeCommercial value)
	{
		setFocCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercialRecord.focRecords</code> attribute.
	 * @return the focRecords
	 */
	public Set<FOCRecord> getFocRecords(final SessionContext ctx)
	{
		return (Set<FOCRecord>)FOCRECORDSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercialRecord.focRecords</code> attribute.
	 * @return the focRecords
	 */
	public Set<FOCRecord> getFocRecords()
	{
		return getFocRecords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercialRecord.focRecords</code> attribute. 
	 * @param value the focRecords
	 */
	public void setFocRecords(final SessionContext ctx, final Set<FOCRecord> value)
	{
		FOCRECORDSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercialRecord.focRecords</code> attribute. 
	 * @param value the focRecords
	 */
	public void setFocRecords(final Set<FOCRecord> value)
	{
		setFocRecords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to focRecords. 
	 * @param value the item to add to focRecords
	 */
	public void addToFocRecords(final SessionContext ctx, final FOCRecord value)
	{
		FOCRECORDSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to focRecords. 
	 * @param value the item to add to focRecords
	 */
	public void addToFocRecords(final FOCRecord value)
	{
		addToFocRecords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from focRecords. 
	 * @param value the item to remove from focRecords
	 */
	public void removeFromFocRecords(final SessionContext ctx, final FOCRecord value)
	{
		FOCRECORDSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from focRecords. 
	 * @param value the item to remove from focRecords
	 */
	public void removeFromFocRecords(final FOCRecord value)
	{
		removeFromFocRecords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute.
	 * @return the plbApplicable
	 */
	public Boolean isPlbApplicable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PLBAPPLICABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute.
	 * @return the plbApplicable
	 */
	public Boolean isPlbApplicable()
	{
		return isPlbApplicable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute. 
	 * @return the plbApplicable
	 */
	public boolean isPlbApplicableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPlbApplicable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute. 
	 * @return the plbApplicable
	 */
	public boolean isPlbApplicableAsPrimitive()
	{
		return isPlbApplicableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute. 
	 * @param value the plbApplicable
	 */
	public void setPlbApplicable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PLBAPPLICABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute. 
	 * @param value the plbApplicable
	 */
	public void setPlbApplicable(final Boolean value)
	{
		setPlbApplicable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute. 
	 * @param value the plbApplicable
	 */
	public void setPlbApplicable(final SessionContext ctx, final boolean value)
	{
		setPlbApplicable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercialRecord.plbApplicable</code> attribute. 
	 * @param value the plbApplicable
	 */
	public void setPlbApplicable(final boolean value)
	{
		setPlbApplicable( getSession().getSessionContext(), value );
	}
	
}
