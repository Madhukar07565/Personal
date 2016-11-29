/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo.SupplierPenaltyKickBackCommercialRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierPenaltyKickbackCommercial SupplierPenaltyKickbackCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierPenaltyKickbackCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierPenaltyKickbackCommercial.penaltyKickbackRecord</code> attribute **/
	public static final String PENALTYKICKBACKRECORD = "penaltyKickbackRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTYKICKBACKRECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierPenaltyKickBackCommercialRecord> PENALTYKICKBACKRECORDHANDLER = new OneToManyHandler<SupplierPenaltyKickBackCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERPENALTYKICKBACKCOMMERCIALRECORD,
	true,
	"penaltyKickbackCommercial",
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
	 * <i>Generated method</i> - Getter of the <code>SupplierPenaltyKickbackCommercial.penaltyKickbackRecord</code> attribute.
	 * @return the penaltyKickbackRecord
	 */
	public Set<SupplierPenaltyKickBackCommercialRecord> getPenaltyKickbackRecord(final SessionContext ctx)
	{
		return (Set<SupplierPenaltyKickBackCommercialRecord>)PENALTYKICKBACKRECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPenaltyKickbackCommercial.penaltyKickbackRecord</code> attribute.
	 * @return the penaltyKickbackRecord
	 */
	public Set<SupplierPenaltyKickBackCommercialRecord> getPenaltyKickbackRecord()
	{
		return getPenaltyKickbackRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPenaltyKickbackCommercial.penaltyKickbackRecord</code> attribute. 
	 * @param value the penaltyKickbackRecord
	 */
	public void setPenaltyKickbackRecord(final SessionContext ctx, final Set<SupplierPenaltyKickBackCommercialRecord> value)
	{
		PENALTYKICKBACKRECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPenaltyKickbackCommercial.penaltyKickbackRecord</code> attribute. 
	 * @param value the penaltyKickbackRecord
	 */
	public void setPenaltyKickbackRecord(final Set<SupplierPenaltyKickBackCommercialRecord> value)
	{
		setPenaltyKickbackRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyKickbackRecord. 
	 * @param value the item to add to penaltyKickbackRecord
	 */
	public void addToPenaltyKickbackRecord(final SessionContext ctx, final SupplierPenaltyKickBackCommercialRecord value)
	{
		PENALTYKICKBACKRECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penaltyKickbackRecord. 
	 * @param value the item to add to penaltyKickbackRecord
	 */
	public void addToPenaltyKickbackRecord(final SupplierPenaltyKickBackCommercialRecord value)
	{
		addToPenaltyKickbackRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyKickbackRecord. 
	 * @param value the item to remove from penaltyKickbackRecord
	 */
	public void removeFromPenaltyKickbackRecord(final SessionContext ctx, final SupplierPenaltyKickBackCommercialRecord value)
	{
		PENALTYKICKBACKRECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penaltyKickbackRecord. 
	 * @param value the item to remove from penaltyKickbackRecord
	 */
	public void removeFromPenaltyKickbackRecord(final SupplierPenaltyKickBackCommercialRecord value)
	{
		removeFromPenaltyKickbackRecord( getSession().getSessionContext(), value );
	}
	
}
