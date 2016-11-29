/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo.PenaltyCriteria;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierPenaltyKickbackCommercial;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo.SupplierPenaltyKickBackCommercialRecord SupplierPenaltyKickBackCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierPenaltyKickBackCommercialRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>SupplierPenaltyKickBackCommercialRecord.criterias</code> attribute **/
	public static final String CRITERIAS = "criterias";
	/** Qualifier of the <code>SupplierPenaltyKickBackCommercialRecord.penaltyKickbackCommercial</code> attribute **/
	public static final String PENALTYKICKBACKCOMMERCIAL = "penaltyKickbackCommercial";
	/**
	* {@link OneToManyHandler} for handling 1:n CRITERIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PenaltyCriteria> CRITERIASHANDLER = new OneToManyHandler<PenaltyCriteria>(
	SuppliercommercialscoreConstants.TC.PENALTYCRITERIA,
	true,
	"commercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PENALTYKICKBACKCOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierPenaltyKickBackCommercialRecord> PENALTYKICKBACKCOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierPenaltyKickBackCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERPENALTYKICKBACKCOMMERCIALRECORD,
	false,
	"penaltyKickbackCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PENALTYKICKBACKCOMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PENALTYKICKBACKCOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPenaltyKickBackCommercialRecord.criterias</code> attribute.
	 * @return the criterias
	 */
	public Set<PenaltyCriteria> getCriterias(final SessionContext ctx)
	{
		return (Set<PenaltyCriteria>)CRITERIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPenaltyKickBackCommercialRecord.criterias</code> attribute.
	 * @return the criterias
	 */
	public Set<PenaltyCriteria> getCriterias()
	{
		return getCriterias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPenaltyKickBackCommercialRecord.criterias</code> attribute. 
	 * @param value the criterias
	 */
	public void setCriterias(final SessionContext ctx, final Set<PenaltyCriteria> value)
	{
		CRITERIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPenaltyKickBackCommercialRecord.criterias</code> attribute. 
	 * @param value the criterias
	 */
	public void setCriterias(final Set<PenaltyCriteria> value)
	{
		setCriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to criterias. 
	 * @param value the item to add to criterias
	 */
	public void addToCriterias(final SessionContext ctx, final PenaltyCriteria value)
	{
		CRITERIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to criterias. 
	 * @param value the item to add to criterias
	 */
	public void addToCriterias(final PenaltyCriteria value)
	{
		addToCriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from criterias. 
	 * @param value the item to remove from criterias
	 */
	public void removeFromCriterias(final SessionContext ctx, final PenaltyCriteria value)
	{
		CRITERIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from criterias. 
	 * @param value the item to remove from criterias
	 */
	public void removeFromCriterias(final PenaltyCriteria value)
	{
		removeFromCriterias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPenaltyKickBackCommercialRecord.penaltyKickbackCommercial</code> attribute.
	 * @return the penaltyKickbackCommercial
	 */
	public SupplierPenaltyKickbackCommercial getPenaltyKickbackCommercial(final SessionContext ctx)
	{
		return (SupplierPenaltyKickbackCommercial)getProperty( ctx, PENALTYKICKBACKCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierPenaltyKickBackCommercialRecord.penaltyKickbackCommercial</code> attribute.
	 * @return the penaltyKickbackCommercial
	 */
	public SupplierPenaltyKickbackCommercial getPenaltyKickbackCommercial()
	{
		return getPenaltyKickbackCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPenaltyKickBackCommercialRecord.penaltyKickbackCommercial</code> attribute. 
	 * @param value the penaltyKickbackCommercial
	 */
	public void setPenaltyKickbackCommercial(final SessionContext ctx, final SupplierPenaltyKickbackCommercial value)
	{
		PENALTYKICKBACKCOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierPenaltyKickBackCommercialRecord.penaltyKickbackCommercial</code> attribute. 
	 * @param value the penaltyKickbackCommercial
	 */
	public void setPenaltyKickbackCommercial(final SupplierPenaltyKickbackCommercial value)
	{
		setPenaltyKickbackCommercial( getSession().getSessionContext(), value );
	}
	
}
