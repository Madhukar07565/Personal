/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.sales.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesOffice;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.sales.jalo.SalesGroup SalesGroup}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSalesGroup extends AbstractOrganization
{
	/** Qualifier of the <code>SalesGroup.salesOffices</code> attribute **/
	public static final String SALESOFFICES = "salesOffices";
	/** Relation ordering override parameter constants for SalesOffice2SalesGroup from ((orgstructurecore))*/
	protected static String SALESOFFICE2SALESGROUP_SRC_ORDERED = "relation.SalesOffice2SalesGroup.source.ordered";
	protected static String SALESOFFICE2SALESGROUP_TGT_ORDERED = "relation.SalesOffice2SalesGroup.target.ordered";
	/** Relation disable markmodifed parameter constants for SalesOffice2SalesGroup from ((orgstructurecore))*/
	protected static String SALESOFFICE2SALESGROUP_MARKMODIFIED = "relation.SalesOffice2SalesGroup.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOrganization.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesGroup.salesOffices</code> attribute.
	 * @return the salesOffices
	 */
	public Set<SalesOffice> getSalesOffices(final SessionContext ctx)
	{
		final List<SalesOffice> items = getLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			"SalesOffice",
			null,
			false,
			false
		);
		return new LinkedHashSet<SalesOffice>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesGroup.salesOffices</code> attribute.
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
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			"SalesOffice",
			null
		);
	}
	
	public long getSalesOfficesCount()
	{
		return getSalesOfficesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesGroup.salesOffices</code> attribute. 
	 * @param value the salesOffices
	 */
	public void setSalesOffices(final SessionContext ctx, final Set<SalesOffice> value)
	{
		setLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2SALESGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesGroup.salesOffices</code> attribute. 
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
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2SALESGROUP_MARKMODIFIED)
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
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2SALESGROUP_MARKMODIFIED)
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
	
}
