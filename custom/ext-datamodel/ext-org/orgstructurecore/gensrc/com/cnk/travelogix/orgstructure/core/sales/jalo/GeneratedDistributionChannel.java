/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.sales.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.sales.jalo.Division;
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
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel DistributionChannel}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDistributionChannel extends AbstractOrganization
{
	/** Qualifier of the <code>DistributionChannel.divisions</code> attribute **/
	public static final String DIVISIONS = "divisions";
	/** Qualifier of the <code>DistributionChannel.company</code> attribute **/
	public static final String COMPANY = "company";
	/**
	* {@link OneToManyHandler} for handling 1:n DIVISIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Division> DIVISIONSHANDLER = new OneToManyHandler<Division>(
	OrgstructurecoreConstants.TC.DIVISION,
	false,
	"distributionChannel",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDistributionChannel> COMPANYHANDLER = new BidirectionalOneToManyHandler<GeneratedDistributionChannel>(
	OrgstructurecoreConstants.TC.DISTRIBUTIONCHANNEL,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOrganization.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DistributionChannel.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DistributionChannel.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DistributionChannel.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		COMPANYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DistributionChannel.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DistributionChannel.divisions</code> attribute.
	 * @return the divisions
	 */
	public Set<Division> getDivisions(final SessionContext ctx)
	{
		return (Set<Division>)DIVISIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DistributionChannel.divisions</code> attribute.
	 * @return the divisions
	 */
	public Set<Division> getDivisions()
	{
		return getDivisions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DistributionChannel.divisions</code> attribute. 
	 * @param value the divisions
	 */
	public void setDivisions(final SessionContext ctx, final Set<Division> value)
	{
		DIVISIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DistributionChannel.divisions</code> attribute. 
	 * @param value the divisions
	 */
	public void setDivisions(final Set<Division> value)
	{
		setDivisions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to divisions. 
	 * @param value the item to add to divisions
	 */
	public void addToDivisions(final SessionContext ctx, final Division value)
	{
		DIVISIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to divisions. 
	 * @param value the item to add to divisions
	 */
	public void addToDivisions(final Division value)
	{
		addToDivisions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from divisions. 
	 * @param value the item to remove from divisions
	 */
	public void removeFromDivisions(final SessionContext ctx, final Division value)
	{
		DIVISIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from divisions. 
	 * @param value the item to remove from divisions
	 */
	public void removeFromDivisions(final Division value)
	{
		removeFromDivisions( getSession().getSessionContext(), value );
	}
	
}
