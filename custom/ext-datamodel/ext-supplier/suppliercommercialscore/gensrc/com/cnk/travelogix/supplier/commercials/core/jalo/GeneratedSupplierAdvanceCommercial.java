/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierStandardCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierAdvanceCommercial SupplierAdvanceCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierAdvanceCommercial extends SupplierStandardCommercial
{
	/** Qualifier of the <code>SupplierAdvanceCommercial.standardCommercial</code> attribute **/
	public static final String STANDARDCOMMERCIAL = "standardCommercial";
	/** Relation ordering override parameter constants for StdComm2AdvComm from ((suppliercommercialscore))*/
	protected static String STDCOMM2ADVCOMM_SRC_ORDERED = "relation.StdComm2AdvComm.source.ordered";
	protected static String STDCOMM2ADVCOMM_TGT_ORDERED = "relation.StdComm2AdvComm.target.ordered";
	/** Relation disable markmodifed parameter constants for StdComm2AdvComm from ((suppliercommercialscore))*/
	protected static String STDCOMM2ADVCOMM_MARKMODIFIED = "relation.StdComm2AdvComm.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SupplierStandardCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAdvanceCommercial.standardCommercial</code> attribute.
	 * @return the standardCommercial
	 */
	public Set<SupplierStandardCommercial> getStandardCommercial(final SessionContext ctx)
	{
		final List<SupplierStandardCommercial> items = getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			"SupplierStandardCommercial",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierStandardCommercial>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAdvanceCommercial.standardCommercial</code> attribute.
	 * @return the standardCommercial
	 */
	public Set<SupplierStandardCommercial> getStandardCommercial()
	{
		return getStandardCommercial( getSession().getSessionContext() );
	}
	
	public long getStandardCommercialCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			"SupplierStandardCommercial",
			null
		);
	}
	
	public long getStandardCommercialCount()
	{
		return getStandardCommercialCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAdvanceCommercial.standardCommercial</code> attribute. 
	 * @param value the standardCommercial
	 */
	public void setStandardCommercial(final SessionContext ctx, final Set<SupplierStandardCommercial> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(STDCOMM2ADVCOMM_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAdvanceCommercial.standardCommercial</code> attribute. 
	 * @param value the standardCommercial
	 */
	public void setStandardCommercial(final Set<SupplierStandardCommercial> value)
	{
		setStandardCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to standardCommercial. 
	 * @param value the item to add to standardCommercial
	 */
	public void addToStandardCommercial(final SessionContext ctx, final SupplierStandardCommercial value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STDCOMM2ADVCOMM_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to standardCommercial. 
	 * @param value the item to add to standardCommercial
	 */
	public void addToStandardCommercial(final SupplierStandardCommercial value)
	{
		addToStandardCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from standardCommercial. 
	 * @param value the item to remove from standardCommercial
	 */
	public void removeFromStandardCommercial(final SessionContext ctx, final SupplierStandardCommercial value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.STDCOMM2ADVCOMM,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(STDCOMM2ADVCOMM_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from standardCommercial. 
	 * @param value the item to remove from standardCommercial
	 */
	public void removeFromStandardCommercial(final SupplierStandardCommercial value)
	{
		removeFromStandardCommercial( getSession().getSessionContext(), value );
	}
	
}
