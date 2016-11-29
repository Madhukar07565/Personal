/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.supplieroffervalidity.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.cruiserateadvdefinition.jalo.CruiseRateAdvDefinition;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscruiseConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.supplieroffervalidity.jalo.SupplierOfferValidity SupplierOfferValidity}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierOfferValidity extends GenericItem
{
	/** Qualifier of the <code>SupplierOfferValidity.validity</code> attribute **/
	public static final String VALIDITY = "validity";
	/** Qualifier of the <code>SupplierOfferValidity.cruiserateadvdefinition</code> attribute **/
	public static final String CRUISERATEADVDEFINITION = "cruiserateadvdefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISERATEADVDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierOfferValidity> CRUISERATEADVDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierOfferValidity>(
	SupplierratedefinitionscruiseConstants.TC.SUPPLIEROFFERVALIDITY,
	false,
	"cruiserateadvdefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VALIDITY, AttributeMode.INITIAL);
		tmp.put(CRUISERATEADVDEFINITION, AttributeMode.INITIAL);
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
		CRUISERATEADVDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOfferValidity.cruiserateadvdefinition</code> attribute.
	 * @return the cruiserateadvdefinition
	 */
	public CruiseRateAdvDefinition getCruiserateadvdefinition(final SessionContext ctx)
	{
		return (CruiseRateAdvDefinition)getProperty( ctx, CRUISERATEADVDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOfferValidity.cruiserateadvdefinition</code> attribute.
	 * @return the cruiserateadvdefinition
	 */
	public CruiseRateAdvDefinition getCruiserateadvdefinition()
	{
		return getCruiserateadvdefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOfferValidity.cruiserateadvdefinition</code> attribute. 
	 * @param value the cruiserateadvdefinition
	 */
	public void setCruiserateadvdefinition(final SessionContext ctx, final CruiseRateAdvDefinition value)
	{
		CRUISERATEADVDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOfferValidity.cruiserateadvdefinition</code> attribute. 
	 * @param value the cruiserateadvdefinition
	 */
	public void setCruiserateadvdefinition(final CruiseRateAdvDefinition value)
	{
		setCruiserateadvdefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOfferValidity.validity</code> attribute.
	 * @return the validity
	 */
	public StandardDateRange getValidity(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, VALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierOfferValidity.validity</code> attribute.
	 * @return the validity
	 */
	public StandardDateRange getValidity()
	{
		return getValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOfferValidity.validity</code> attribute. 
	 * @param value the validity
	 */
	public void setValidity(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, VALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierOfferValidity.validity</code> attribute. 
	 * @param value the validity
	 */
	public void setValidity(final StandardDateRange value)
	{
		setValidity( getSession().getSessionContext(), value );
	}
	
}
