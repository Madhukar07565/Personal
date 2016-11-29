/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo.SupplierIncentiveOnTopupRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierIncentiveOnTopupCommercial SupplierIncentiveOnTopupCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierIncentiveOnTopupCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierIncentiveOnTopupCommercial.incentivetopupRecord</code> attribute **/
	public static final String INCENTIVETOPUPRECORD = "incentivetopupRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n INCENTIVETOPUPRECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierIncentiveOnTopupRecord> INCENTIVETOPUPRECORDHANDLER = new OneToManyHandler<SupplierIncentiveOnTopupRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERINCENTIVEONTOPUPRECORD,
	true,
	"incentivetopupCommercial",
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
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupCommercial.incentivetopupRecord</code> attribute.
	 * @return the incentivetopupRecord
	 */
	public Set<SupplierIncentiveOnTopupRecord> getIncentivetopupRecord(final SessionContext ctx)
	{
		return (Set<SupplierIncentiveOnTopupRecord>)INCENTIVETOPUPRECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupCommercial.incentivetopupRecord</code> attribute.
	 * @return the incentivetopupRecord
	 */
	public Set<SupplierIncentiveOnTopupRecord> getIncentivetopupRecord()
	{
		return getIncentivetopupRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupCommercial.incentivetopupRecord</code> attribute. 
	 * @param value the incentivetopupRecord
	 */
	public void setIncentivetopupRecord(final SessionContext ctx, final Set<SupplierIncentiveOnTopupRecord> value)
	{
		INCENTIVETOPUPRECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupCommercial.incentivetopupRecord</code> attribute. 
	 * @param value the incentivetopupRecord
	 */
	public void setIncentivetopupRecord(final Set<SupplierIncentiveOnTopupRecord> value)
	{
		setIncentivetopupRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to incentivetopupRecord. 
	 * @param value the item to add to incentivetopupRecord
	 */
	public void addToIncentivetopupRecord(final SessionContext ctx, final SupplierIncentiveOnTopupRecord value)
	{
		INCENTIVETOPUPRECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to incentivetopupRecord. 
	 * @param value the item to add to incentivetopupRecord
	 */
	public void addToIncentivetopupRecord(final SupplierIncentiveOnTopupRecord value)
	{
		addToIncentivetopupRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from incentivetopupRecord. 
	 * @param value the item to remove from incentivetopupRecord
	 */
	public void removeFromIncentivetopupRecord(final SessionContext ctx, final SupplierIncentiveOnTopupRecord value)
	{
		INCENTIVETOPUPRECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from incentivetopupRecord. 
	 * @param value the item to remove from incentivetopupRecord
	 */
	public void removeFromIncentivetopupRecord(final SupplierIncentiveOnTopupRecord value)
	{
		removeFromIncentivetopupRecord( getSession().getSessionContext(), value );
	}
	
}
