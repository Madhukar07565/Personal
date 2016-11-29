/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.jalo.GroupOfCompanies;
import de.hybris.platform.catalog.constants.CatalogConstants;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.jalo.GroupCompany GroupCompany}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGroupCompany extends AbstractOrganization
{
	/** Qualifier of the <code>GroupCompany.groupOfCompanies</code> attribute **/
	public static final String GROUPOFCOMPANIES = "groupOfCompanies";
	/** Qualifier of the <code>GroupCompany.companies</code> attribute **/
	public static final String COMPANIES = "companies";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n GROUPOFCOMPANIES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedGroupCompany> GROUPOFCOMPANIESHANDLER = new BidirectionalOneToManyHandler<GeneratedGroupCompany>(
	OrgstructurecoreConstants.TC.GROUPCOMPANY,
	false,
	"groupOfCompanies",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COMPANIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Company> COMPANIESHANDLER = new OneToManyHandler<Company>(
	CatalogConstants.TC.COMPANY,
	false,
	"groupCompany",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOrganization.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GROUPOFCOMPANIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroupCompany.companies</code> attribute.
	 * @return the companies
	 */
	public Set<Company> getCompanies(final SessionContext ctx)
	{
		return (Set<Company>)COMPANIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroupCompany.companies</code> attribute.
	 * @return the companies
	 */
	public Set<Company> getCompanies()
	{
		return getCompanies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroupCompany.companies</code> attribute. 
	 * @param value the companies
	 */
	public void setCompanies(final SessionContext ctx, final Set<Company> value)
	{
		COMPANIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroupCompany.companies</code> attribute. 
	 * @param value the companies
	 */
	public void setCompanies(final Set<Company> value)
	{
		setCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companies. 
	 * @param value the item to add to companies
	 */
	public void addToCompanies(final SessionContext ctx, final Company value)
	{
		COMPANIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companies. 
	 * @param value the item to add to companies
	 */
	public void addToCompanies(final Company value)
	{
		addToCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companies. 
	 * @param value the item to remove from companies
	 */
	public void removeFromCompanies(final SessionContext ctx, final Company value)
	{
		COMPANIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companies. 
	 * @param value the item to remove from companies
	 */
	public void removeFromCompanies(final Company value)
	{
		removeFromCompanies( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		GROUPOFCOMPANIESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroupCompany.groupOfCompanies</code> attribute.
	 * @return the groupOfCompanies
	 */
	public GroupOfCompanies getGroupOfCompanies(final SessionContext ctx)
	{
		return (GroupOfCompanies)getProperty( ctx, GROUPOFCOMPANIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroupCompany.groupOfCompanies</code> attribute.
	 * @return the groupOfCompanies
	 */
	public GroupOfCompanies getGroupOfCompanies()
	{
		return getGroupOfCompanies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroupCompany.groupOfCompanies</code> attribute. 
	 * @param value the groupOfCompanies
	 */
	public void setGroupOfCompanies(final SessionContext ctx, final GroupOfCompanies value)
	{
		GROUPOFCOMPANIESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroupCompany.groupOfCompanies</code> attribute. 
	 * @param value the groupOfCompanies
	 */
	public void setGroupOfCompanies(final GroupOfCompanies value)
	{
		setGroupOfCompanies( getSession().getSessionContext(), value );
	}
	
}
