/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.GeneralCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierGeneralCommercial;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierGeneralCommercialRecord SupplierGeneralCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierGeneralCommercialRecord extends GeneralCommercialRecord
{
	/** Qualifier of the <code>SupplierGeneralCommercialRecord.generalCommercial</code> attribute **/
	public static final String GENERALCOMMERCIAL = "generalCommercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n GENERALCOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierGeneralCommercialRecord> GENERALCOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierGeneralCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERGENERALCOMMERCIALRECORD,
	false,
	"generalCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(GeneralCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENERALCOMMERCIAL, AttributeMode.INITIAL);
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
		GENERALCOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierGeneralCommercialRecord.generalCommercial</code> attribute.
	 * @return the generalCommercial
	 */
	public SupplierGeneralCommercial getGeneralCommercial(final SessionContext ctx)
	{
		return (SupplierGeneralCommercial)getProperty( ctx, GENERALCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierGeneralCommercialRecord.generalCommercial</code> attribute.
	 * @return the generalCommercial
	 */
	public SupplierGeneralCommercial getGeneralCommercial()
	{
		return getGeneralCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierGeneralCommercialRecord.generalCommercial</code> attribute. 
	 * @param value the generalCommercial
	 */
	public void setGeneralCommercial(final SessionContext ctx, final SupplierGeneralCommercial value)
	{
		GENERALCOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierGeneralCommercialRecord.generalCommercial</code> attribute. 
	 * @param value the generalCommercial
	 */
	public void setGeneralCommercial(final SupplierGeneralCommercial value)
	{
		setGeneralCommercial( getSession().getSessionContext(), value );
	}
	
}
