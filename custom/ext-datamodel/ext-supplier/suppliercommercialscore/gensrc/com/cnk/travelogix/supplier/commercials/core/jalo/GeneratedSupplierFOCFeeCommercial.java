/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.SupplierFOCCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierAdvanceCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierFOCFeeCommercial SupplierFOCCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierFOCFeeCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierFOCCommercial.focCommercialRecord</code> attribute **/
	public static final String FOCCOMMERCIALRECORD = "focCommercialRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n FOCCOMMERCIALRECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierFOCCommercialRecord> FOCCOMMERCIALRECORDHANDLER = new OneToManyHandler<SupplierFOCCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERFOCCOMMERCIALRECORD,
	true,
	"focCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SupplierAdvanceCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercial.focCommercialRecord</code> attribute.
	 * @return the focCommercialRecord
	 */
	public Set<SupplierFOCCommercialRecord> getFocCommercialRecord(final SessionContext ctx)
	{
		return (Set<SupplierFOCCommercialRecord>)FOCCOMMERCIALRECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierFOCCommercial.focCommercialRecord</code> attribute.
	 * @return the focCommercialRecord
	 */
	public Set<SupplierFOCCommercialRecord> getFocCommercialRecord()
	{
		return getFocCommercialRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercial.focCommercialRecord</code> attribute. 
	 * @param value the focCommercialRecord
	 */
	public void setFocCommercialRecord(final SessionContext ctx, final Set<SupplierFOCCommercialRecord> value)
	{
		FOCCOMMERCIALRECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierFOCCommercial.focCommercialRecord</code> attribute. 
	 * @param value the focCommercialRecord
	 */
	public void setFocCommercialRecord(final Set<SupplierFOCCommercialRecord> value)
	{
		setFocCommercialRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to focCommercialRecord. 
	 * @param value the item to add to focCommercialRecord
	 */
	public void addToFocCommercialRecord(final SessionContext ctx, final SupplierFOCCommercialRecord value)
	{
		FOCCOMMERCIALRECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to focCommercialRecord. 
	 * @param value the item to add to focCommercialRecord
	 */
	public void addToFocCommercialRecord(final SupplierFOCCommercialRecord value)
	{
		addToFocCommercialRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from focCommercialRecord. 
	 * @param value the item to remove from focCommercialRecord
	 */
	public void removeFromFocCommercialRecord(final SessionContext ctx, final SupplierFOCCommercialRecord value)
	{
		FOCCOMMERCIALRECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from focCommercialRecord. 
	 * @param value the item to remove from focCommercialRecord
	 */
	public void removeFromFocCommercialRecord(final SupplierFOCCommercialRecord value)
	{
		removeFromFocCommercialRecord( getSession().getSessionContext(), value );
	}
	
}
