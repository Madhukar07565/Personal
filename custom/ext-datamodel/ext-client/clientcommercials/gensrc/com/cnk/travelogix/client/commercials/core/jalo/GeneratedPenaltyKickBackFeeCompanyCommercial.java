/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.Criteria;
import com.cnk.travelogix.company.commercials.core.jalo.Penalty;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.commercials.core.jalo.PenaltyKickBackFeeCompanyCommercial PenaltyKickBackFeeCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPenaltyKickBackFeeCompanyCommercial extends AbstractCompanyCommercial
{
	/** Qualifier of the <code>PenaltyKickBackFeeCompanyCommercial.criterias</code> attribute **/
	public static final String CRITERIAS = "criterias";
	/** Qualifier of the <code>PenaltyKickBackFeeCompanyCommercial.penalties</code> attribute **/
	public static final String PENALTIES = "penalties";
	/**
	* {@link OneToManyHandler} for handling 1:n CRITERIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Criteria> CRITERIASHANDLER = new OneToManyHandler<Criteria>(
	ClientcommercialsConstants.TC.CRITERIA,
	false,
	"penaltyKickBackFee",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PENALTIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Penalty> PENALTIESHANDLER = new OneToManyHandler<Penalty>(
	ClientcommercialsConstants.TC.PENALTY,
	false,
	"penaltyKickBackFee",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyKickBackFeeCompanyCommercial.criterias</code> attribute.
	 * @return the criterias
	 */
	public Collection<Criteria> getCriterias(final SessionContext ctx)
	{
		return CRITERIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyKickBackFeeCompanyCommercial.criterias</code> attribute.
	 * @return the criterias
	 */
	public Collection<Criteria> getCriterias()
	{
		return getCriterias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyKickBackFeeCompanyCommercial.criterias</code> attribute. 
	 * @param value the criterias
	 */
	public void setCriterias(final SessionContext ctx, final Collection<Criteria> value)
	{
		CRITERIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyKickBackFeeCompanyCommercial.criterias</code> attribute. 
	 * @param value the criterias
	 */
	public void setCriterias(final Collection<Criteria> value)
	{
		setCriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to criterias. 
	 * @param value the item to add to criterias
	 */
	public void addToCriterias(final SessionContext ctx, final Criteria value)
	{
		CRITERIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to criterias. 
	 * @param value the item to add to criterias
	 */
	public void addToCriterias(final Criteria value)
	{
		addToCriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from criterias. 
	 * @param value the item to remove from criterias
	 */
	public void removeFromCriterias(final SessionContext ctx, final Criteria value)
	{
		CRITERIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from criterias. 
	 * @param value the item to remove from criterias
	 */
	public void removeFromCriterias(final Criteria value)
	{
		removeFromCriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyKickBackFeeCompanyCommercial.penalties</code> attribute.
	 * @return the penalties
	 */
	public Collection<Penalty> getPenalties(final SessionContext ctx)
	{
		return PENALTIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyKickBackFeeCompanyCommercial.penalties</code> attribute.
	 * @return the penalties
	 */
	public Collection<Penalty> getPenalties()
	{
		return getPenalties( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyKickBackFeeCompanyCommercial.penalties</code> attribute. 
	 * @param value the penalties
	 */
	public void setPenalties(final SessionContext ctx, final Collection<Penalty> value)
	{
		PENALTIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyKickBackFeeCompanyCommercial.penalties</code> attribute. 
	 * @param value the penalties
	 */
	public void setPenalties(final Collection<Penalty> value)
	{
		setPenalties( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penalties. 
	 * @param value the item to add to penalties
	 */
	public void addToPenalties(final SessionContext ctx, final Penalty value)
	{
		PENALTIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to penalties. 
	 * @param value the item to add to penalties
	 */
	public void addToPenalties(final Penalty value)
	{
		addToPenalties( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penalties. 
	 * @param value the item to remove from penalties
	 */
	public void removeFromPenalties(final SessionContext ctx, final Penalty value)
	{
		PENALTIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from penalties. 
	 * @param value the item to remove from penalties
	 */
	public void removeFromPenalties(final Penalty value)
	{
		removeFromPenalties( getSession().getSessionContext(), value );
	}
	
}
