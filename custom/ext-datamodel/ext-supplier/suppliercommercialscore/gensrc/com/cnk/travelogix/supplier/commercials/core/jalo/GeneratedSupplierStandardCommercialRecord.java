/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.GeneralCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierStandardCommercial;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierStandardCommercialRecord SupplierStandardCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierStandardCommercialRecord extends GeneralCommercialRecord
{
	/** Qualifier of the <code>SupplierStandardCommercialRecord.standardCommercial</code> attribute **/
	public static final String STANDARDCOMMERCIAL = "standardCommercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STANDARDCOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierStandardCommercialRecord> STANDARDCOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierStandardCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERSTANDARDCOMMERCIALRECORD,
	false,
	"standardCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(GeneralCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STANDARDCOMMERCIAL, AttributeMode.INITIAL);
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
		STANDARDCOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierStandardCommercialRecord.standardCommercial</code> attribute.
	 * @return the standardCommercial
	 */
	public SupplierStandardCommercial getStandardCommercial(final SessionContext ctx)
	{
		return (SupplierStandardCommercial)getProperty( ctx, STANDARDCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierStandardCommercialRecord.standardCommercial</code> attribute.
	 * @return the standardCommercial
	 */
	public SupplierStandardCommercial getStandardCommercial()
	{
		return getStandardCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierStandardCommercialRecord.standardCommercial</code> attribute. 
	 * @param value the standardCommercial
	 */
	public void setStandardCommercial(final SessionContext ctx, final SupplierStandardCommercial value)
	{
		STANDARDCOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierStandardCommercialRecord.standardCommercial</code> attribute. 
	 * @param value the standardCommercial
	 */
	public void setStandardCommercial(final SupplierStandardCommercial value)
	{
		setStandardCommercial( getSession().getSessionContext(), value );
	}
	
}
