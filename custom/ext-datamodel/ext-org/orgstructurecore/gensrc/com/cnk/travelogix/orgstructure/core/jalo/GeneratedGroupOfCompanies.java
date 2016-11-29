/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.jalo.GroupCompany;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.jalo.GroupOfCompanies GroupOfCompanies}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGroupOfCompanies extends AbstractOrganization
{
	/** Qualifier of the <code>GroupOfCompanies.groupCompaies</code> attribute **/
	public static final String GROUPCOMPAIES = "groupCompaies";
	/**
	* {@link OneToManyHandler} for handling 1:n GROUPCOMPAIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<GroupCompany> GROUPCOMPAIESHANDLER = new OneToManyHandler<GroupCompany>(
	OrgstructurecoreConstants.TC.GROUPCOMPANY,
	false,
	"groupOfCompanies",
	null,
	false,
	true,
	CollectionType.SET
	);
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
	 * <i>Generated method</i> - Getter of the <code>GroupOfCompanies.groupCompaies</code> attribute.
	 * @return the groupCompaies
	 */
	public Set<GroupCompany> getGroupCompaies(final SessionContext ctx)
	{
		return (Set<GroupCompany>)GROUPCOMPAIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GroupOfCompanies.groupCompaies</code> attribute.
	 * @return the groupCompaies
	 */
	public Set<GroupCompany> getGroupCompaies()
	{
		return getGroupCompaies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroupOfCompanies.groupCompaies</code> attribute. 
	 * @param value the groupCompaies
	 */
	public void setGroupCompaies(final SessionContext ctx, final Set<GroupCompany> value)
	{
		GROUPCOMPAIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GroupOfCompanies.groupCompaies</code> attribute. 
	 * @param value the groupCompaies
	 */
	public void setGroupCompaies(final Set<GroupCompany> value)
	{
		setGroupCompaies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to groupCompaies. 
	 * @param value the item to add to groupCompaies
	 */
	public void addToGroupCompaies(final SessionContext ctx, final GroupCompany value)
	{
		GROUPCOMPAIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to groupCompaies. 
	 * @param value the item to add to groupCompaies
	 */
	public void addToGroupCompaies(final GroupCompany value)
	{
		addToGroupCompaies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from groupCompaies. 
	 * @param value the item to remove from groupCompaies
	 */
	public void removeFromGroupCompaies(final SessionContext ctx, final GroupCompany value)
	{
		GROUPCOMPAIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from groupCompaies. 
	 * @param value the item to remove from groupCompaies
	 */
	public void removeFromGroupCompaies(final GroupCompany value)
	{
		removeFromGroupCompaies( getSession().getSessionContext(), value );
	}
	
}
