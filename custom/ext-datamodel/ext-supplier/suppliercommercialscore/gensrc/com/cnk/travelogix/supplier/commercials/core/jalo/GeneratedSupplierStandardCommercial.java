/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialDefinition;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierAdvanceCommercial;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierStandardCommercialRecord;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierStandardCommercial SupplierStandardCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierStandardCommercial extends AbstractCommercialDefinition
{
	/** Qualifier of the <code>SupplierStandardCommercial.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>SupplierStandardCommercial.standardRecord</code> attribute **/
	public static final String STANDARDRECORD = "standardRecord";
	/** Qualifier of the <code>SupplierStandardCommercial.advCommercial</code> attribute **/
	public static final String ADVCOMMERCIAL = "advCommercial";
	/** Relation ordering override parameter constants for StdComm2AdvComm from ((suppliercommercialscore))*/
	protected static String STDCOMM2ADVCOMM_SRC_ORDERED = "relation.StdComm2AdvComm.source.ordered";
	protected static String STDCOMM2ADVCOMM_TGT_ORDERED = "relation.StdComm2AdvComm.target.ordered";
	/** Relation disable markmodifed parameter constants for StdComm2AdvComm from ((suppliercommercialscore))*/
	protected static String STDCOMM2ADVCOMM_MARKMODIFIED = "relation.StdComm2AdvComm.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n STANDARDRECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierStandardCommercialRecord> STANDARDRECORDHANDLER = new OneToManyHandler<SupplierStandardCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERSTANDARDCOMMERCIALRECORD,
	true,
	"standardCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierStandardCommercial.advCommercial</code> attribute.
	 * @return the advCommercial
	 */
	public Set<SupplierAdvanceCommercial> getAdvCommercial(final SessionContext ctx)
	{
		final List<SupplierAdvanceCommercial> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			"SupplierAdvanceCommercial",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierAdvanceCommercial>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierStandardCommercial.advCommercial</code> attribute.
	 * @return the advCommercial
	 */
	public Set<SupplierAdvanceCommercial> getAdvCommercial()
	{
		return getAdvCommercial( getSession().getSessionContext() );
	}
	
	public long getAdvCommercialCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			"SupplierAdvanceCommercial",
			null
		);
	}
	
	public long getAdvCommercialCount()
	{
		return getAdvCommercialCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierStandardCommercial.advCommercial</code> attribute. 
	 * @param value the advCommercial
	 */
	public void setAdvCommercial(final SessionContext ctx, final Set<SupplierAdvanceCommercial> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(STDCOMM2ADVCOMM_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierStandardCommercial.advCommercial</code> attribute. 
	 * @param value the advCommercial
	 */
	public void setAdvCommercial(final Set<SupplierAdvanceCommercial> value)
	{
		setAdvCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advCommercial. 
	 * @param value the item to add to advCommercial
	 */
	public void addToAdvCommercial(final SessionContext ctx, final SupplierAdvanceCommercial value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STDCOMM2ADVCOMM_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advCommercial. 
	 * @param value the item to add to advCommercial
	 */
	public void addToAdvCommercial(final SupplierAdvanceCommercial value)
	{
		addToAdvCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advCommercial. 
	 * @param value the item to remove from advCommercial
	 */
	public void removeFromAdvCommercial(final SessionContext ctx, final SupplierAdvanceCommercial value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STDCOMM2ADVCOMM_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advCommercial. 
	 * @param value the item to remove from advCommercial
	 */
	public void removeFromAdvCommercial(final SupplierAdvanceCommercial value)
	{
		removeFromAdvCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierStandardCommercial.standardRecord</code> attribute.
	 * @return the standardRecord
	 */
	public Set<SupplierStandardCommercialRecord> getStandardRecord(final SessionContext ctx)
	{
		return (Set<SupplierStandardCommercialRecord>)STANDARDRECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierStandardCommercial.standardRecord</code> attribute.
	 * @return the standardRecord
	 */
	public Set<SupplierStandardCommercialRecord> getStandardRecord()
	{
		return getStandardRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierStandardCommercial.standardRecord</code> attribute. 
	 * @param value the standardRecord
	 */
	public void setStandardRecord(final SessionContext ctx, final Set<SupplierStandardCommercialRecord> value)
	{
		STANDARDRECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierStandardCommercial.standardRecord</code> attribute. 
	 * @param value the standardRecord
	 */
	public void setStandardRecord(final Set<SupplierStandardCommercialRecord> value)
	{
		setStandardRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to standardRecord. 
	 * @param value the item to add to standardRecord
	 */
	public void addToStandardRecord(final SessionContext ctx, final SupplierStandardCommercialRecord value)
	{
		STANDARDRECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to standardRecord. 
	 * @param value the item to add to standardRecord
	 */
	public void addToStandardRecord(final SupplierStandardCommercialRecord value)
	{
		addToStandardRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from standardRecord. 
	 * @param value the item to remove from standardRecord
	 */
	public void removeFromStandardRecord(final SessionContext ctx, final SupplierStandardCommercialRecord value)
	{
		STANDARDRECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from standardRecord. 
	 * @param value the item to remove from standardRecord
	 */
	public void removeFromStandardRecord(final SupplierStandardCommercialRecord value)
	{
		removeFromStandardRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierStandardCommercial.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierStandardCommercial.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierStandardCommercial.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierStandardCommercial.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
