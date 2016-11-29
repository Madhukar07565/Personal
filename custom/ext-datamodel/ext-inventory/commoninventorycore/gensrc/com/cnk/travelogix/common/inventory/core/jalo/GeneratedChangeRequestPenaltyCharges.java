/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestCutOffsAndCharges;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.ChangeRequestPenaltyCharges ChangeRequestPenaltyCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedChangeRequestPenaltyCharges extends GenericItem
{
	/** Qualifier of the <code>ChangeRequestPenaltyCharges.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>ChangeRequestPenaltyCharges.penaltyChangesFor</code> attribute **/
	public static final String PENALTYCHANGESFOR = "penaltyChangesFor";
	/** Qualifier of the <code>ChangeRequestPenaltyCharges.changeRequestCutOffsAndCharges</code> attribute **/
	public static final String CHANGEREQUESTCUTOFFSANDCHARGES = "changeRequestCutOffsAndCharges";
	/**
	* {@link OneToManyHandler} for handling 1:n CHANGEREQUESTCUTOFFSANDCHARGES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ChangeRequestCutOffsAndCharges> CHANGEREQUESTCUTOFFSANDCHARGESHANDLER = new OneToManyHandler<ChangeRequestCutOffsAndCharges>(
	CommoninventorycoreConstants.TC.CHANGEREQUESTCUTOFFSANDCHARGES,
	false,
	"changeRequestPenaltyCharges",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(PENALTYCHANGESFOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestPenaltyCharges.changeRequestCutOffsAndCharges</code> attribute.
	 * @return the changeRequestCutOffsAndCharges
	 */
	public Collection<ChangeRequestCutOffsAndCharges> getChangeRequestCutOffsAndCharges(final SessionContext ctx)
	{
		return CHANGEREQUESTCUTOFFSANDCHARGESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestPenaltyCharges.changeRequestCutOffsAndCharges</code> attribute.
	 * @return the changeRequestCutOffsAndCharges
	 */
	public Collection<ChangeRequestCutOffsAndCharges> getChangeRequestCutOffsAndCharges()
	{
		return getChangeRequestCutOffsAndCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestPenaltyCharges.changeRequestCutOffsAndCharges</code> attribute. 
	 * @param value the changeRequestCutOffsAndCharges
	 */
	public void setChangeRequestCutOffsAndCharges(final SessionContext ctx, final Collection<ChangeRequestCutOffsAndCharges> value)
	{
		CHANGEREQUESTCUTOFFSANDCHARGESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestPenaltyCharges.changeRequestCutOffsAndCharges</code> attribute. 
	 * @param value the changeRequestCutOffsAndCharges
	 */
	public void setChangeRequestCutOffsAndCharges(final Collection<ChangeRequestCutOffsAndCharges> value)
	{
		setChangeRequestCutOffsAndCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to changeRequestCutOffsAndCharges. 
	 * @param value the item to add to changeRequestCutOffsAndCharges
	 */
	public void addToChangeRequestCutOffsAndCharges(final SessionContext ctx, final ChangeRequestCutOffsAndCharges value)
	{
		CHANGEREQUESTCUTOFFSANDCHARGESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to changeRequestCutOffsAndCharges. 
	 * @param value the item to add to changeRequestCutOffsAndCharges
	 */
	public void addToChangeRequestCutOffsAndCharges(final ChangeRequestCutOffsAndCharges value)
	{
		addToChangeRequestCutOffsAndCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from changeRequestCutOffsAndCharges. 
	 * @param value the item to remove from changeRequestCutOffsAndCharges
	 */
	public void removeFromChangeRequestCutOffsAndCharges(final SessionContext ctx, final ChangeRequestCutOffsAndCharges value)
	{
		CHANGEREQUESTCUTOFFSANDCHARGESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from changeRequestCutOffsAndCharges. 
	 * @param value the item to remove from changeRequestCutOffsAndCharges
	 */
	public void removeFromChangeRequestCutOffsAndCharges(final ChangeRequestCutOffsAndCharges value)
	{
		removeFromChangeRequestCutOffsAndCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestPenaltyCharges.definedBy</code> attribute.
	 * @return the definedBy - Defined By
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestPenaltyCharges.definedBy</code> attribute.
	 * @return the definedBy - Defined By
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestPenaltyCharges.definedBy</code> attribute. 
	 * @param value the definedBy - Defined By
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestPenaltyCharges.definedBy</code> attribute. 
	 * @param value the definedBy - Defined By
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestPenaltyCharges.penaltyChangesFor</code> attribute.
	 * @return the penaltyChangesFor - Penalty Changes For
	 */
	public EnumerationValue getPenaltyChangesFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PENALTYCHANGESFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChangeRequestPenaltyCharges.penaltyChangesFor</code> attribute.
	 * @return the penaltyChangesFor - Penalty Changes For
	 */
	public EnumerationValue getPenaltyChangesFor()
	{
		return getPenaltyChangesFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestPenaltyCharges.penaltyChangesFor</code> attribute. 
	 * @param value the penaltyChangesFor - Penalty Changes For
	 */
	public void setPenaltyChangesFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PENALTYCHANGESFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChangeRequestPenaltyCharges.penaltyChangesFor</code> attribute. 
	 * @param value the penaltyChangesFor - Penalty Changes For
	 */
	public void setPenaltyChangesFor(final EnumerationValue value)
	{
		setPenaltyChangesFor( getSession().getSessionContext(), value );
	}
	
}
