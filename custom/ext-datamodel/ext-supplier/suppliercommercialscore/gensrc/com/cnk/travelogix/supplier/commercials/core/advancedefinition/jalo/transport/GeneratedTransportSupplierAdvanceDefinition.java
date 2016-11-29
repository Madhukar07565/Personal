/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.transport;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.transport.VehicleConfig;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.transport.TransportSupplierAdvanceDefinition TransportSupplierAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportSupplierAdvanceDefinition extends SupplierCommercialAdvanceDefinition
{
	/** Qualifier of the <code>TransportSupplierAdvanceDefinition.paymentType</code> attribute **/
	public static final String PAYMENTTYPE = "paymentType";
	/** Qualifier of the <code>TransportSupplierAdvanceDefinition.rateApplicableFor</code> attribute **/
	public static final String RATEAPPLICABLEFOR = "rateApplicableFor";
	/** Qualifier of the <code>TransportSupplierAdvanceDefinition.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>TransportSupplierAdvanceDefinition.vehicles</code> attribute **/
	public static final String VEHICLES = "vehicles";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n VEHICLES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTransportSupplierAdvanceDefinition> VEHICLESHANDLER = new BidirectionalOneToManyHandler<GeneratedTransportSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.TRANSPORTSUPPLIERADVANCEDEFINITION,
	false,
	"vehicles",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SupplierCommercialAdvanceDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PAYMENTTYPE, AttributeMode.INITIAL);
		tmp.put(RATEAPPLICABLEFOR, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(VEHICLES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportSupplierAdvanceDefinition.category</code> attribute.
	 * @return the category - defines category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportSupplierAdvanceDefinition.category</code> attribute.
	 * @return the category - defines category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportSupplierAdvanceDefinition.category</code> attribute. 
	 * @param value the category - defines category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportSupplierAdvanceDefinition.category</code> attribute. 
	 * @param value the category - defines category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		VEHICLESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportSupplierAdvanceDefinition.paymentType</code> attribute.
	 * @return the paymentType
	 */
	public EnumerationValue getPaymentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAYMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportSupplierAdvanceDefinition.paymentType</code> attribute.
	 * @return the paymentType
	 */
	public EnumerationValue getPaymentType()
	{
		return getPaymentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportSupplierAdvanceDefinition.paymentType</code> attribute. 
	 * @param value the paymentType
	 */
	public void setPaymentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAYMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportSupplierAdvanceDefinition.paymentType</code> attribute. 
	 * @param value the paymentType
	 */
	public void setPaymentType(final EnumerationValue value)
	{
		setPaymentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportSupplierAdvanceDefinition.rateApplicableFor</code> attribute.
	 * @return the rateApplicableFor - rates applicable for details
	 */
	public EnumerationValue getRateApplicableFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATEAPPLICABLEFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportSupplierAdvanceDefinition.rateApplicableFor</code> attribute.
	 * @return the rateApplicableFor - rates applicable for details
	 */
	public EnumerationValue getRateApplicableFor()
	{
		return getRateApplicableFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportSupplierAdvanceDefinition.rateApplicableFor</code> attribute. 
	 * @param value the rateApplicableFor - rates applicable for details
	 */
	public void setRateApplicableFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATEAPPLICABLEFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportSupplierAdvanceDefinition.rateApplicableFor</code> attribute. 
	 * @param value the rateApplicableFor - rates applicable for details
	 */
	public void setRateApplicableFor(final EnumerationValue value)
	{
		setRateApplicableFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportSupplierAdvanceDefinition.vehicles</code> attribute.
	 * @return the vehicles
	 */
	public VehicleConfig getVehicles(final SessionContext ctx)
	{
		return (VehicleConfig)getProperty( ctx, VEHICLES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportSupplierAdvanceDefinition.vehicles</code> attribute.
	 * @return the vehicles
	 */
	public VehicleConfig getVehicles()
	{
		return getVehicles( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportSupplierAdvanceDefinition.vehicles</code> attribute. 
	 * @param value the vehicles
	 */
	public void setVehicles(final SessionContext ctx, final VehicleConfig value)
	{
		VEHICLESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportSupplierAdvanceDefinition.vehicles</code> attribute. 
	 * @param value the vehicles
	 */
	public void setVehicles(final VehicleConfig value)
	{
		setVehicles( getSession().getSessionContext(), value );
	}
	
}
