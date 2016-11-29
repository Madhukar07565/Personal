/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.msf.jalo.SupplierMSFFeeRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierMSFFeeCommercial SupplierMSFFeeCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierMSFFeeCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierMSFFeeCommercial.msfeeRecord</code> attribute **/
	public static final String MSFEERECORD = "msfeeRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n MSFEERECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierMSFFeeRecord> MSFEERECORDHANDLER = new OneToManyHandler<SupplierMSFFeeRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERMSFFEERECORD,
	true,
	"msfeeCommercial",
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
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeCommercial.msfeeRecord</code> attribute.
	 * @return the msfeeRecord
	 */
	public Set<SupplierMSFFeeRecord> getMsfeeRecord(final SessionContext ctx)
	{
		return (Set<SupplierMSFFeeRecord>)MSFEERECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierMSFFeeCommercial.msfeeRecord</code> attribute.
	 * @return the msfeeRecord
	 */
	public Set<SupplierMSFFeeRecord> getMsfeeRecord()
	{
		return getMsfeeRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeCommercial.msfeeRecord</code> attribute. 
	 * @param value the msfeeRecord
	 */
	public void setMsfeeRecord(final SessionContext ctx, final Set<SupplierMSFFeeRecord> value)
	{
		MSFEERECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierMSFFeeCommercial.msfeeRecord</code> attribute. 
	 * @param value the msfeeRecord
	 */
	public void setMsfeeRecord(final Set<SupplierMSFFeeRecord> value)
	{
		setMsfeeRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to msfeeRecord. 
	 * @param value the item to add to msfeeRecord
	 */
	public void addToMsfeeRecord(final SessionContext ctx, final SupplierMSFFeeRecord value)
	{
		MSFEERECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to msfeeRecord. 
	 * @param value the item to add to msfeeRecord
	 */
	public void addToMsfeeRecord(final SupplierMSFFeeRecord value)
	{
		addToMsfeeRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from msfeeRecord. 
	 * @param value the item to remove from msfeeRecord
	 */
	public void removeFromMsfeeRecord(final SessionContext ctx, final SupplierMSFFeeRecord value)
	{
		MSFEERECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from msfeeRecord. 
	 * @param value the item to remove from msfeeRecord
	 */
	public void removeFromMsfeeRecord(final SupplierMSFFeeRecord value)
	{
		removeFromMsfeeRecord( getSession().getSessionContext(), value );
	}
	
}
