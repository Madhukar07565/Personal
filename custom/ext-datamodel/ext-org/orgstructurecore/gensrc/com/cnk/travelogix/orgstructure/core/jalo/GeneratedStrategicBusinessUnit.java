/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
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
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit StrategicBusinessUnit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStrategicBusinessUnit extends AbstractOrganization
{
	/** Qualifier of the <code>StrategicBusinessUnit.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>StrategicBusinessUnit.businessUnits</code> attribute **/
	public static final String BUSINESSUNITS = "businessUnits";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStrategicBusinessUnit> COMPANYHANDLER = new BidirectionalOneToManyHandler<GeneratedStrategicBusinessUnit>(
	OrgstructurecoreConstants.TC.STRATEGICBUSINESSUNIT,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BUSINESSUNITS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusinessUnit> BUSINESSUNITSHANDLER = new OneToManyHandler<BusinessUnit>(
	OrgstructurecoreConstants.TC.BUSINESSUNIT,
	false,
	"strategicBusinessUnit",
	null,
	false,
	true,
	CollectionType.SET
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
	 * <i>Generated method</i> - Getter of the <code>StrategicBusinessUnit.businessUnits</code> attribute.
	 * @return the businessUnits
	 */
	public Set<BusinessUnit> getBusinessUnits(final SessionContext ctx)
	{
		return (Set<BusinessUnit>)BUSINESSUNITSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StrategicBusinessUnit.businessUnits</code> attribute.
	 * @return the businessUnits
	 */
	public Set<BusinessUnit> getBusinessUnits()
	{
		return getBusinessUnits( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StrategicBusinessUnit.businessUnits</code> attribute. 
	 * @param value the businessUnits
	 */
	public void setBusinessUnits(final SessionContext ctx, final Set<BusinessUnit> value)
	{
		BUSINESSUNITSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StrategicBusinessUnit.businessUnits</code> attribute. 
	 * @param value the businessUnits
	 */
	public void setBusinessUnits(final Set<BusinessUnit> value)
	{
		setBusinessUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessUnits. 
	 * @param value the item to add to businessUnits
	 */
	public void addToBusinessUnits(final SessionContext ctx, final BusinessUnit value)
	{
		BUSINESSUNITSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessUnits. 
	 * @param value the item to add to businessUnits
	 */
	public void addToBusinessUnits(final BusinessUnit value)
	{
		addToBusinessUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessUnits. 
	 * @param value the item to remove from businessUnits
	 */
	public void removeFromBusinessUnits(final SessionContext ctx, final BusinessUnit value)
	{
		BUSINESSUNITSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessUnits. 
	 * @param value the item to remove from businessUnits
	 */
	public void removeFromBusinessUnits(final BusinessUnit value)
	{
		removeFromBusinessUnits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StrategicBusinessUnit.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StrategicBusinessUnit.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StrategicBusinessUnit.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		COMPANYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StrategicBusinessUnit.company</code> attribute. 
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
	
}
