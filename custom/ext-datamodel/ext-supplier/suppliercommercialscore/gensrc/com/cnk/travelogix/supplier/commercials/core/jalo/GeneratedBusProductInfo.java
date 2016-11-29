/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.proucts.jalo.BusOperator;
import com.cnk.travelogix.masterdata.core.proucts.jalo.BusRoute;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialProductInfo;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.BusProductInfo BusProductInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusProductInfo extends CommercialProductInfo
{
	/** Qualifier of the <code>BusProductInfo.routes</code> attribute **/
	public static final String ROUTES = "routes";
	/** Qualifier of the <code>BusProductInfo.operators</code> attribute **/
	public static final String OPERATORS = "operators";
	/**
	* {@link OneToManyHandler} for handling 1:n ROUTES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusRoute> ROUTESHANDLER = new OneToManyHandler<BusRoute>(
	MasterdatacoreConstants.TC.BUSROUTE,
	true,
	"busProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OPERATORS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusOperator> OPERATORSHANDLER = new OneToManyHandler<BusOperator>(
	MasterdatacoreConstants.TC.BUSOPERATOR,
	true,
	"busProduct",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CommercialProductInfo.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusProductInfo.operators</code> attribute.
	 * @return the operators
	 */
	public Collection<BusOperator> getOperators(final SessionContext ctx)
	{
		return OPERATORSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusProductInfo.operators</code> attribute.
	 * @return the operators
	 */
	public Collection<BusOperator> getOperators()
	{
		return getOperators( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusProductInfo.operators</code> attribute. 
	 * @param value the operators
	 */
	public void setOperators(final SessionContext ctx, final Collection<BusOperator> value)
	{
		OPERATORSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusProductInfo.operators</code> attribute. 
	 * @param value the operators
	 */
	public void setOperators(final Collection<BusOperator> value)
	{
		setOperators( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to operators. 
	 * @param value the item to add to operators
	 */
	public void addToOperators(final SessionContext ctx, final BusOperator value)
	{
		OPERATORSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to operators. 
	 * @param value the item to add to operators
	 */
	public void addToOperators(final BusOperator value)
	{
		addToOperators( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from operators. 
	 * @param value the item to remove from operators
	 */
	public void removeFromOperators(final SessionContext ctx, final BusOperator value)
	{
		OPERATORSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from operators. 
	 * @param value the item to remove from operators
	 */
	public void removeFromOperators(final BusOperator value)
	{
		removeFromOperators( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusProductInfo.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<BusRoute> getRoutes(final SessionContext ctx)
	{
		return ROUTESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusProductInfo.routes</code> attribute.
	 * @return the routes
	 */
	public Collection<BusRoute> getRoutes()
	{
		return getRoutes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusProductInfo.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final SessionContext ctx, final Collection<BusRoute> value)
	{
		ROUTESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusProductInfo.routes</code> attribute. 
	 * @param value the routes
	 */
	public void setRoutes(final Collection<BusRoute> value)
	{
		setRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final SessionContext ctx, final BusRoute value)
	{
		ROUTESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to routes. 
	 * @param value the item to add to routes
	 */
	public void addToRoutes(final BusRoute value)
	{
		addToRoutes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final SessionContext ctx, final BusRoute value)
	{
		ROUTESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from routes. 
	 * @param value the item to remove from routes
	 */
	public void removeFromRoutes(final BusRoute value)
	{
		removeFromRoutes( getSession().getSessionContext(), value );
	}
	
}
