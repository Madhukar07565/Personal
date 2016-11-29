/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AbstractAirCompanySpecificInventory;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.AirOtherCompanyInventoryDistribution AirOtherCompanyInventoryDistribution}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAirOtherCompanyInventoryDistribution extends AbstractAirCompanySpecificInventory
{
	/** Qualifier of the <code>AirOtherCompanyInventoryDistribution.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>AirOtherCompanyInventoryDistribution.companies</code> attribute **/
	public static final String COMPANIES = "companies";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAirCompanySpecificInventory.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(COMPANIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirOtherCompanyInventoryDistribution.companies</code> attribute.
	 * @return the companies - Distribution to company
	 */
	public List<Company> getCompanies(final SessionContext ctx)
	{
		List<Company> coll = (List<Company>)getProperty( ctx, COMPANIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirOtherCompanyInventoryDistribution.companies</code> attribute.
	 * @return the companies - Distribution to company
	 */
	public List<Company> getCompanies()
	{
		return getCompanies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirOtherCompanyInventoryDistribution.companies</code> attribute. 
	 * @param value the companies - Distribution to company
	 */
	public void setCompanies(final SessionContext ctx, final List<Company> value)
	{
		setProperty(ctx, COMPANIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirOtherCompanyInventoryDistribution.companies</code> attribute. 
	 * @param value the companies - Distribution to company
	 */
	public void setCompanies(final List<Company> value)
	{
		setCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirOtherCompanyInventoryDistribution.company</code> attribute.
	 * @return the company - company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AirOtherCompanyInventoryDistribution.company</code> attribute.
	 * @return the company - company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirOtherCompanyInventoryDistribution.company</code> attribute. 
	 * @param value the company - company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AirOtherCompanyInventoryDistribution.company</code> attribute. 
	 * @param value the company - company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
}
