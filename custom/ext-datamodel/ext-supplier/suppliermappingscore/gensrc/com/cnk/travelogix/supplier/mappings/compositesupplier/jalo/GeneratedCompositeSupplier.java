/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.compositesupplier.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import com.cnk.travelogix.supplier.mappings.enablers.jalo.SupplierEnablersMapping;
import com.cnk.travelogix.supplier.mappings.jalo.AbstractSupplierMapping;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.compositesupplier.jalo.CompositeSupplier CompositeSupplier}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompositeSupplier extends AbstractSupplierMapping
{
	/** Qualifier of the <code>CompositeSupplier.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>CompositeSupplier.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>CompositeSupplier.enablersMappings</code> attribute **/
	public static final String ENABLERSMAPPINGS = "enablersMappings";
	/**
	* {@link OneToManyHandler} for handling 1:n ENABLERSMAPPINGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierEnablersMapping> ENABLERSMAPPINGSHANDLER = new OneToManyHandler<SupplierEnablersMapping>(
	SuppliermappingscoreConstants.TC.SUPPLIERENABLERSMAPPING,
	true,
	"compositeSupplier",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierMapping.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompositeSupplier.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompositeSupplier.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompositeSupplier.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompositeSupplier.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompositeSupplier.enablersMappings</code> attribute.
	 * @return the enablersMappings
	 */
	public Collection<SupplierEnablersMapping> getEnablersMappings(final SessionContext ctx)
	{
		return ENABLERSMAPPINGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompositeSupplier.enablersMappings</code> attribute.
	 * @return the enablersMappings
	 */
	public Collection<SupplierEnablersMapping> getEnablersMappings()
	{
		return getEnablersMappings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompositeSupplier.enablersMappings</code> attribute. 
	 * @param value the enablersMappings
	 */
	public void setEnablersMappings(final SessionContext ctx, final Collection<SupplierEnablersMapping> value)
	{
		ENABLERSMAPPINGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompositeSupplier.enablersMappings</code> attribute. 
	 * @param value the enablersMappings
	 */
	public void setEnablersMappings(final Collection<SupplierEnablersMapping> value)
	{
		setEnablersMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to enablersMappings. 
	 * @param value the item to add to enablersMappings
	 */
	public void addToEnablersMappings(final SessionContext ctx, final SupplierEnablersMapping value)
	{
		ENABLERSMAPPINGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to enablersMappings. 
	 * @param value the item to add to enablersMappings
	 */
	public void addToEnablersMappings(final SupplierEnablersMapping value)
	{
		addToEnablersMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from enablersMappings. 
	 * @param value the item to remove from enablersMappings
	 */
	public void removeFromEnablersMappings(final SessionContext ctx, final SupplierEnablersMapping value)
	{
		ENABLERSMAPPINGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from enablersMappings. 
	 * @param value the item to remove from enablersMappings
	 */
	public void removeFromEnablersMappings(final SupplierEnablersMapping value)
	{
		removeFromEnablersMappings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompositeSupplier.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompositeSupplier.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompositeSupplier.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompositeSupplier.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
}
