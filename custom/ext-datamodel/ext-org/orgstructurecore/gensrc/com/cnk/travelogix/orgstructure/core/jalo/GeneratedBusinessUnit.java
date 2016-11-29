/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesOffice;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit BusinessUnit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusinessUnit extends AbstractOrganization
{
	/** Qualifier of the <code>BusinessUnit.strategicBusinessUnit</code> attribute **/
	public static final String STRATEGICBUSINESSUNIT = "strategicBusinessUnit";
	/** Qualifier of the <code>BusinessUnit.markets</code> attribute **/
	public static final String MARKETS = "markets";
	/** Qualifier of the <code>BusinessUnit.salesOffices</code> attribute **/
	public static final String SALESOFFICES = "salesOffices";
	/** Relation ordering override parameter constants for SalesOffice2BU from ((orgstructurecore))*/
	protected static String SALESOFFICE2BU_SRC_ORDERED = "relation.SalesOffice2BU.source.ordered";
	protected static String SALESOFFICE2BU_TGT_ORDERED = "relation.SalesOffice2BU.target.ordered";
	/** Relation disable markmodifed parameter constants for SalesOffice2BU from ((orgstructurecore))*/
	protected static String SALESOFFICE2BU_MARKMODIFIED = "relation.SalesOffice2BU.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STRATEGICBUSINESSUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBusinessUnit> STRATEGICBUSINESSUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedBusinessUnit>(
	OrgstructurecoreConstants.TC.BUSINESSUNIT,
	false,
	"strategicBusinessUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MARKETS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Market> MARKETSHANDLER = new OneToManyHandler<Market>(
	OrgstructurecoreConstants.TC.MARKET,
	false,
	"businessUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOrganization.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STRATEGICBUSINESSUNIT, AttributeMode.INITIAL);
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
		STRATEGICBUSINESSUNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessUnit.markets</code> attribute.
	 * @return the markets
	 */
	public Set<Market> getMarkets(final SessionContext ctx)
	{
		return (Set<Market>)MARKETSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessUnit.markets</code> attribute.
	 * @return the markets
	 */
	public Set<Market> getMarkets()
	{
		return getMarkets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessUnit.markets</code> attribute. 
	 * @param value the markets
	 */
	public void setMarkets(final SessionContext ctx, final Set<Market> value)
	{
		MARKETSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessUnit.markets</code> attribute. 
	 * @param value the markets
	 */
	public void setMarkets(final Set<Market> value)
	{
		setMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to markets. 
	 * @param value the item to add to markets
	 */
	public void addToMarkets(final SessionContext ctx, final Market value)
	{
		MARKETSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to markets. 
	 * @param value the item to add to markets
	 */
	public void addToMarkets(final Market value)
	{
		addToMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from markets. 
	 * @param value the item to remove from markets
	 */
	public void removeFromMarkets(final SessionContext ctx, final Market value)
	{
		MARKETSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from markets. 
	 * @param value the item to remove from markets
	 */
	public void removeFromMarkets(final Market value)
	{
		removeFromMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessUnit.salesOffices</code> attribute.
	 * @return the salesOffices
	 */
	public Set<SalesOffice> getSalesOffices(final SessionContext ctx)
	{
		final List<SalesOffice> items = getLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			"SalesOffice",
			null,
			false,
			false
		);
		return new LinkedHashSet<SalesOffice>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessUnit.salesOffices</code> attribute.
	 * @return the salesOffices
	 */
	public Set<SalesOffice> getSalesOffices()
	{
		return getSalesOffices( getSession().getSessionContext() );
	}
	
	public long getSalesOfficesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			"SalesOffice",
			null
		);
	}
	
	public long getSalesOfficesCount()
	{
		return getSalesOfficesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessUnit.salesOffices</code> attribute. 
	 * @param value the salesOffices
	 */
	public void setSalesOffices(final SessionContext ctx, final Set<SalesOffice> value)
	{
		setLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2BU_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessUnit.salesOffices</code> attribute. 
	 * @param value the salesOffices
	 */
	public void setSalesOffices(final Set<SalesOffice> value)
	{
		setSalesOffices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesOffices. 
	 * @param value the item to add to salesOffices
	 */
	public void addToSalesOffices(final SessionContext ctx, final SalesOffice value)
	{
		addLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2BU_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesOffices. 
	 * @param value the item to add to salesOffices
	 */
	public void addToSalesOffices(final SalesOffice value)
	{
		addToSalesOffices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesOffices. 
	 * @param value the item to remove from salesOffices
	 */
	public void removeFromSalesOffices(final SessionContext ctx, final SalesOffice value)
	{
		removeLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2BU_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesOffices. 
	 * @param value the item to remove from salesOffices
	 */
	public void removeFromSalesOffices(final SalesOffice value)
	{
		removeFromSalesOffices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessUnit.strategicBusinessUnit</code> attribute.
	 * @return the strategicBusinessUnit
	 */
	public StrategicBusinessUnit getStrategicBusinessUnit(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, STRATEGICBUSINESSUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessUnit.strategicBusinessUnit</code> attribute.
	 * @return the strategicBusinessUnit
	 */
	public StrategicBusinessUnit getStrategicBusinessUnit()
	{
		return getStrategicBusinessUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessUnit.strategicBusinessUnit</code> attribute. 
	 * @param value the strategicBusinessUnit
	 */
	public void setStrategicBusinessUnit(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		STRATEGICBUSINESSUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessUnit.strategicBusinessUnit</code> attribute. 
	 * @param value the strategicBusinessUnit
	 */
	public void setStrategicBusinessUnit(final StrategicBusinessUnit value)
	{
		setStrategicBusinessUnit( getSession().getSessionContext(), value );
	}
	
}
