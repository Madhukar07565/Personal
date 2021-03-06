/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AbstractCruiseCompanySpecificInventory;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.CruiseOtherCompanyInventoryDistribution CruiseOtherCompanyInventoryDistribution}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseOtherCompanyInventoryDistribution extends AbstractCruiseCompanySpecificInventory
{
	/** Qualifier of the <code>CruiseOtherCompanyInventoryDistribution.distributionToCompany</code> attribute **/
	public static final String DISTRIBUTIONTOCOMPANY = "distributionToCompany";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCruiseCompanySpecificInventory.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DISTRIBUTIONTOCOMPANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseOtherCompanyInventoryDistribution.distributionToCompany</code> attribute.
	 * @return the distributionToCompany - Distribution to company
	 */
	public CatalogVersion getDistributionToCompany(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, DISTRIBUTIONTOCOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseOtherCompanyInventoryDistribution.distributionToCompany</code> attribute.
	 * @return the distributionToCompany - Distribution to company
	 */
	public CatalogVersion getDistributionToCompany()
	{
		return getDistributionToCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseOtherCompanyInventoryDistribution.distributionToCompany</code> attribute. 
	 * @param value the distributionToCompany - Distribution to company
	 */
	public void setDistributionToCompany(final SessionContext ctx, final CatalogVersion value)
	{
		setProperty(ctx, DISTRIBUTIONTOCOMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseOtherCompanyInventoryDistribution.distributionToCompany</code> attribute. 
	 * @param value the distributionToCompany - Distribution to company
	 */
	public void setDistributionToCompany(final CatalogVersion value)
	{
		setDistributionToCompany( getSession().getSessionContext(), value );
	}
	
}
