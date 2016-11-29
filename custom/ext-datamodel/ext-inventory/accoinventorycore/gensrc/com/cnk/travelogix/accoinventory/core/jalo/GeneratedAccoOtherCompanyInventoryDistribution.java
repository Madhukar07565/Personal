/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AbstractAccoCompanySpecificInventory;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AccoOtherCompanyInventoryDistribution AccoOtherCompanyInventoryDistribution}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoOtherCompanyInventoryDistribution extends AbstractAccoCompanySpecificInventory
{
	/** Qualifier of the <code>AccoOtherCompanyInventoryDistribution.distributionToCompany</code> attribute **/
	public static final String DISTRIBUTIONTOCOMPANY = "distributionToCompany";
	/** Qualifier of the <code>AccoOtherCompanyInventoryDistribution.companies</code> attribute **/
	public static final String COMPANIES = "companies";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAccoCompanySpecificInventory.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DISTRIBUTIONTOCOMPANY, AttributeMode.INITIAL);
		tmp.put(COMPANIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoOtherCompanyInventoryDistribution.companies</code> attribute.
	 * @return the companies - Collection of Companies
	 */
	public List<Company> getCompanies(final SessionContext ctx)
	{
		List<Company> coll = (List<Company>)getProperty( ctx, COMPANIES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoOtherCompanyInventoryDistribution.companies</code> attribute.
	 * @return the companies - Collection of Companies
	 */
	public List<Company> getCompanies()
	{
		return getCompanies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoOtherCompanyInventoryDistribution.companies</code> attribute. 
	 * @param value the companies - Collection of Companies
	 */
	public void setCompanies(final SessionContext ctx, final List<Company> value)
	{
		setProperty(ctx, COMPANIES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoOtherCompanyInventoryDistribution.companies</code> attribute. 
	 * @param value the companies - Collection of Companies
	 */
	public void setCompanies(final List<Company> value)
	{
		setCompanies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoOtherCompanyInventoryDistribution.distributionToCompany</code> attribute.
	 * @return the distributionToCompany - Distribution To Company
	 */
	public Company getDistributionToCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, DISTRIBUTIONTOCOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoOtherCompanyInventoryDistribution.distributionToCompany</code> attribute.
	 * @return the distributionToCompany - Distribution To Company
	 */
	public Company getDistributionToCompany()
	{
		return getDistributionToCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoOtherCompanyInventoryDistribution.distributionToCompany</code> attribute. 
	 * @param value the distributionToCompany - Distribution To Company
	 */
	public void setDistributionToCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, DISTRIBUTIONTOCOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoOtherCompanyInventoryDistribution.distributionToCompany</code> attribute. 
	 * @param value the distributionToCompany - Distribution To Company
	 */
	public void setDistributionToCompany(final Company value)
	{
		setDistributionToCompany( getSession().getSessionContext(), value );
	}
	
}
