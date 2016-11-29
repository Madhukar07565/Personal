/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo.SupplierLookToBookCommercialRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierLookToBookCommercial SupplierLookToBookCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierLookToBookCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierLookToBookCommercial.lookToBookRecord</code> attribute **/
	public static final String LOOKTOBOOKRECORD = "lookToBookRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n LOOKTOBOOKRECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierLookToBookCommercialRecord> LOOKTOBOOKRECORDHANDLER = new OneToManyHandler<SupplierLookToBookCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERLOOKTOBOOKCOMMERCIALRECORD,
	true,
	"lookToBookCommercial",
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
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercial.lookToBookRecord</code> attribute.
	 * @return the lookToBookRecord
	 */
	public Set<SupplierLookToBookCommercialRecord> getLookToBookRecord(final SessionContext ctx)
	{
		return (Set<SupplierLookToBookCommercialRecord>)LOOKTOBOOKRECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercial.lookToBookRecord</code> attribute.
	 * @return the lookToBookRecord
	 */
	public Set<SupplierLookToBookCommercialRecord> getLookToBookRecord()
	{
		return getLookToBookRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercial.lookToBookRecord</code> attribute. 
	 * @param value the lookToBookRecord
	 */
	public void setLookToBookRecord(final SessionContext ctx, final Set<SupplierLookToBookCommercialRecord> value)
	{
		LOOKTOBOOKRECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercial.lookToBookRecord</code> attribute. 
	 * @param value the lookToBookRecord
	 */
	public void setLookToBookRecord(final Set<SupplierLookToBookCommercialRecord> value)
	{
		setLookToBookRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to lookToBookRecord. 
	 * @param value the item to add to lookToBookRecord
	 */
	public void addToLookToBookRecord(final SessionContext ctx, final SupplierLookToBookCommercialRecord value)
	{
		LOOKTOBOOKRECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to lookToBookRecord. 
	 * @param value the item to add to lookToBookRecord
	 */
	public void addToLookToBookRecord(final SupplierLookToBookCommercialRecord value)
	{
		addToLookToBookRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from lookToBookRecord. 
	 * @param value the item to remove from lookToBookRecord
	 */
	public void removeFromLookToBookRecord(final SessionContext ctx, final SupplierLookToBookCommercialRecord value)
	{
		LOOKTOBOOKRECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from lookToBookRecord. 
	 * @param value the item to remove from lookToBookRecord
	 */
	public void removeFromLookToBookRecord(final SupplierLookToBookCommercialRecord value)
	{
		removeFromLookToBookRecord( getSession().getSessionContext(), value );
	}
	
}
