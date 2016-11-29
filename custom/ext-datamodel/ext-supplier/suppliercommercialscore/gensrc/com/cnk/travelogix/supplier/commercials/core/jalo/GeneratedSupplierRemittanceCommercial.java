/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierGeneralCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierRemittanceCommercialRecord;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierRemittanceCommercial SupplierRemittanceCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierRemittanceCommercial extends SupplierGeneralCommercial
{
	/** Qualifier of the <code>SupplierRemittanceCommercial.remittanceRecord</code> attribute **/
	public static final String REMITTANCERECORD = "remittanceRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n REMITTANCERECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierRemittanceCommercialRecord> REMITTANCERECORDHANDLER = new OneToManyHandler<SupplierRemittanceCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERREMITTANCECOMMERCIALRECORD,
	true,
	"remittanceCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SupplierGeneralCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRemittanceCommercial.remittanceRecord</code> attribute.
	 * @return the remittanceRecord
	 */
	public Set<SupplierRemittanceCommercialRecord> getRemittanceRecord(final SessionContext ctx)
	{
		return (Set<SupplierRemittanceCommercialRecord>)REMITTANCERECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRemittanceCommercial.remittanceRecord</code> attribute.
	 * @return the remittanceRecord
	 */
	public Set<SupplierRemittanceCommercialRecord> getRemittanceRecord()
	{
		return getRemittanceRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRemittanceCommercial.remittanceRecord</code> attribute. 
	 * @param value the remittanceRecord
	 */
	public void setRemittanceRecord(final SessionContext ctx, final Set<SupplierRemittanceCommercialRecord> value)
	{
		REMITTANCERECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRemittanceCommercial.remittanceRecord</code> attribute. 
	 * @param value the remittanceRecord
	 */
	public void setRemittanceRecord(final Set<SupplierRemittanceCommercialRecord> value)
	{
		setRemittanceRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to remittanceRecord. 
	 * @param value the item to add to remittanceRecord
	 */
	public void addToRemittanceRecord(final SessionContext ctx, final SupplierRemittanceCommercialRecord value)
	{
		REMITTANCERECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to remittanceRecord. 
	 * @param value the item to add to remittanceRecord
	 */
	public void addToRemittanceRecord(final SupplierRemittanceCommercialRecord value)
	{
		addToRemittanceRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from remittanceRecord. 
	 * @param value the item to remove from remittanceRecord
	 */
	public void removeFromRemittanceRecord(final SessionContext ctx, final SupplierRemittanceCommercialRecord value)
	{
		REMITTANCERECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from remittanceRecord. 
	 * @param value the item to remove from remittanceRecord
	 */
	public void removeFromRemittanceRecord(final SupplierRemittanceCommercialRecord value)
	{
		removeFromRemittanceRecord( getSession().getSessionContext(), value );
	}
	
}
