/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo.SupplierTerminationFeeCommercialRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierTerminationFeeCommercial SupplierTerminationFeeCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierTerminationFeeCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierTerminationFeeCommercial.terminationFeeRecord</code> attribute **/
	public static final String TERMINATIONFEERECORD = "terminationFeeRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n TERMINATIONFEERECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierTerminationFeeCommercialRecord> TERMINATIONFEERECORDHANDLER = new OneToManyHandler<SupplierTerminationFeeCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERTERMINATIONFEECOMMERCIALRECORD,
	true,
	"terminationFeeCommercial",
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
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercial.terminationFeeRecord</code> attribute.
	 * @return the terminationFeeRecord
	 */
	public Set<SupplierTerminationFeeCommercialRecord> getTerminationFeeRecord(final SessionContext ctx)
	{
		return (Set<SupplierTerminationFeeCommercialRecord>)TERMINATIONFEERECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierTerminationFeeCommercial.terminationFeeRecord</code> attribute.
	 * @return the terminationFeeRecord
	 */
	public Set<SupplierTerminationFeeCommercialRecord> getTerminationFeeRecord()
	{
		return getTerminationFeeRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercial.terminationFeeRecord</code> attribute. 
	 * @param value the terminationFeeRecord
	 */
	public void setTerminationFeeRecord(final SessionContext ctx, final Set<SupplierTerminationFeeCommercialRecord> value)
	{
		TERMINATIONFEERECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierTerminationFeeCommercial.terminationFeeRecord</code> attribute. 
	 * @param value the terminationFeeRecord
	 */
	public void setTerminationFeeRecord(final Set<SupplierTerminationFeeCommercialRecord> value)
	{
		setTerminationFeeRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to terminationFeeRecord. 
	 * @param value the item to add to terminationFeeRecord
	 */
	public void addToTerminationFeeRecord(final SessionContext ctx, final SupplierTerminationFeeCommercialRecord value)
	{
		TERMINATIONFEERECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to terminationFeeRecord. 
	 * @param value the item to add to terminationFeeRecord
	 */
	public void addToTerminationFeeRecord(final SupplierTerminationFeeCommercialRecord value)
	{
		addToTerminationFeeRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from terminationFeeRecord. 
	 * @param value the item to remove from terminationFeeRecord
	 */
	public void removeFromTerminationFeeRecord(final SessionContext ctx, final SupplierTerminationFeeCommercialRecord value)
	{
		TERMINATIONFEERECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from terminationFeeRecord. 
	 * @param value the item to remove from terminationFeeRecord
	 */
	public void removeFromTerminationFeeRecord(final SupplierTerminationFeeCommercialRecord value)
	{
		removeFromTerminationFeeRecord( getSession().getSessionContext(), value );
	}
	
}
