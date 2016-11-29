/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.GeneralCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierRemittanceCommercial;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierRemittanceCommercialRecord SupplierRemittanceCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierRemittanceCommercialRecord extends GeneralCommercialRecord
{
	/** Qualifier of the <code>SupplierRemittanceCommercialRecord.remittanceCommercial</code> attribute **/
	public static final String REMITTANCECOMMERCIAL = "remittanceCommercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n REMITTANCECOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierRemittanceCommercialRecord> REMITTANCECOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierRemittanceCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERREMITTANCECOMMERCIALRECORD,
	false,
	"remittanceCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(GeneralCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(REMITTANCECOMMERCIAL, AttributeMode.INITIAL);
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
		REMITTANCECOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRemittanceCommercialRecord.remittanceCommercial</code> attribute.
	 * @return the remittanceCommercial
	 */
	public SupplierRemittanceCommercial getRemittanceCommercial(final SessionContext ctx)
	{
		return (SupplierRemittanceCommercial)getProperty( ctx, REMITTANCECOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRemittanceCommercialRecord.remittanceCommercial</code> attribute.
	 * @return the remittanceCommercial
	 */
	public SupplierRemittanceCommercial getRemittanceCommercial()
	{
		return getRemittanceCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRemittanceCommercialRecord.remittanceCommercial</code> attribute. 
	 * @param value the remittanceCommercial
	 */
	public void setRemittanceCommercial(final SessionContext ctx, final SupplierRemittanceCommercial value)
	{
		REMITTANCECOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRemittanceCommercialRecord.remittanceCommercial</code> attribute. 
	 * @param value the remittanceCommercial
	 */
	public void setRemittanceCommercial(final SupplierRemittanceCommercial value)
	{
		setRemittanceCommercial( getSession().getSessionContext(), value );
	}
	
}
