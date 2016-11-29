/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo.SupplierOtherFeeCommercialRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierOtherFeeCommercial SupplierOtherFeeCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierOtherFeeCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierOtherFeeCommercial.otherFeeRecord</code> attribute **/
	public static final String OTHERFEERECORD = "otherFeeRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n OTHERFEERECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierOtherFeeCommercialRecord> OTHERFEERECORDHANDLER = new OneToManyHandler<SupplierOtherFeeCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIEROTHERFEECOMMERCIALRECORD,
	true,
	"otherFeeCommercial",
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
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercial.otherFeeRecord</code> attribute.
	 * @return the otherFeeRecord
	 */
	public Set<SupplierOtherFeeCommercialRecord> getOtherFeeRecord(final SessionContext ctx)
	{
		return (Set<SupplierOtherFeeCommercialRecord>)OTHERFEERECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOtherFeeCommercial.otherFeeRecord</code> attribute.
	 * @return the otherFeeRecord
	 */
	public Set<SupplierOtherFeeCommercialRecord> getOtherFeeRecord()
	{
		return getOtherFeeRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercial.otherFeeRecord</code> attribute. 
	 * @param value the otherFeeRecord
	 */
	public void setOtherFeeRecord(final SessionContext ctx, final Set<SupplierOtherFeeCommercialRecord> value)
	{
		OTHERFEERECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOtherFeeCommercial.otherFeeRecord</code> attribute. 
	 * @param value the otherFeeRecord
	 */
	public void setOtherFeeRecord(final Set<SupplierOtherFeeCommercialRecord> value)
	{
		setOtherFeeRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherFeeRecord. 
	 * @param value the item to add to otherFeeRecord
	 */
	public void addToOtherFeeRecord(final SessionContext ctx, final SupplierOtherFeeCommercialRecord value)
	{
		OTHERFEERECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to otherFeeRecord. 
	 * @param value the item to add to otherFeeRecord
	 */
	public void addToOtherFeeRecord(final SupplierOtherFeeCommercialRecord value)
	{
		addToOtherFeeRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherFeeRecord. 
	 * @param value the item to remove from otherFeeRecord
	 */
	public void removeFromOtherFeeRecord(final SessionContext ctx, final SupplierOtherFeeCommercialRecord value)
	{
		OTHERFEERECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from otherFeeRecord. 
	 * @param value the item to remove from otherFeeRecord
	 */
	public void removeFromOtherFeeRecord(final SupplierOtherFeeCommercialRecord value)
	{
		removeFromOtherFeeRecord( getSession().getSessionContext(), value );
	}
	
}
