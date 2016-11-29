/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierAdvanceCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierGeneralCommercialRecord;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierGeneralCommercial SupplierGeneralCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierGeneralCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierGeneralCommercial.generalRecord</code> attribute **/
	public static final String GENERALRECORD = "generalRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n GENERALRECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierGeneralCommercialRecord> GENERALRECORDHANDLER = new OneToManyHandler<SupplierGeneralCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERGENERALCOMMERCIALRECORD,
	true,
	"generalCommercial",
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
	 * <i>Generated method</i> - Getter of the <code>SupplierGeneralCommercial.generalRecord</code> attribute.
	 * @return the generalRecord
	 */
	public Set<SupplierGeneralCommercialRecord> getGeneralRecord(final SessionContext ctx)
	{
		return (Set<SupplierGeneralCommercialRecord>)GENERALRECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierGeneralCommercial.generalRecord</code> attribute.
	 * @return the generalRecord
	 */
	public Set<SupplierGeneralCommercialRecord> getGeneralRecord()
	{
		return getGeneralRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierGeneralCommercial.generalRecord</code> attribute. 
	 * @param value the generalRecord
	 */
	public void setGeneralRecord(final SessionContext ctx, final Set<SupplierGeneralCommercialRecord> value)
	{
		GENERALRECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierGeneralCommercial.generalRecord</code> attribute. 
	 * @param value the generalRecord
	 */
	public void setGeneralRecord(final Set<SupplierGeneralCommercialRecord> value)
	{
		setGeneralRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to generalRecord. 
	 * @param value the item to add to generalRecord
	 */
	public void addToGeneralRecord(final SessionContext ctx, final SupplierGeneralCommercialRecord value)
	{
		GENERALRECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to generalRecord. 
	 * @param value the item to add to generalRecord
	 */
	public void addToGeneralRecord(final SupplierGeneralCommercialRecord value)
	{
		addToGeneralRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from generalRecord. 
	 * @param value the item to remove from generalRecord
	 */
	public void removeFromGeneralRecord(final SessionContext ctx, final SupplierGeneralCommercialRecord value)
	{
		GENERALRECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from generalRecord. 
	 * @param value the item to remove from generalRecord
	 */
	public void removeFromGeneralRecord(final SupplierGeneralCommercialRecord value)
	{
		removeFromGeneralRecord( getSession().getSessionContext(), value );
	}
	
}
