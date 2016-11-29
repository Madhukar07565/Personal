/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.mappings.enablers.jalo;

import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.mappings.compositesupplier.jalo.CompositeSupplier;
import com.cnk.travelogix.supplier.mappings.core.constants.SuppliermappingscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.mappings.enablers.jalo.SupplierEnablersMapping SupplierEnablersMapping}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierEnablersMapping extends GenericItem
{
	/** Qualifier of the <code>SupplierEnablersMapping.connectivityEnabler</code> attribute **/
	public static final String CONNECTIVITYENABLER = "connectivityEnabler";
	/** Qualifier of the <code>SupplierEnablersMapping.settlementEnabler</code> attribute **/
	public static final String SETTLEMENTENABLER = "settlementEnabler";
	/** Qualifier of the <code>SupplierEnablersMapping.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>SupplierEnablersMapping.activeFrom</code> attribute **/
	public static final String ACTIVEFROM = "activeFrom";
	/** Qualifier of the <code>SupplierEnablersMapping.activeTo</code> attribute **/
	public static final String ACTIVETO = "activeTo";
	/** Qualifier of the <code>SupplierEnablersMapping.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>SupplierEnablersMapping.compositeSupplier</code> attribute **/
	public static final String COMPOSITESUPPLIER = "compositeSupplier";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPOSITESUPPLIER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierEnablersMapping> COMPOSITESUPPLIERHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierEnablersMapping>(
	SuppliermappingscoreConstants.TC.SUPPLIERENABLERSMAPPING,
	false,
	"compositeSupplier",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CONNECTIVITYENABLER, AttributeMode.INITIAL);
		tmp.put(SETTLEMENTENABLER, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(ACTIVEFROM, AttributeMode.INITIAL);
		tmp.put(ACTIVETO, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(COMPOSITESUPPLIER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.activeFrom</code> attribute.
	 * @return the activeFrom
	 */
	public Date getActiveFrom()
	{
		return getActiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.activeFrom</code> attribute. 
	 * @param value the activeFrom
	 */
	public void setActiveFrom(final Date value)
	{
		setActiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.activeTo</code> attribute.
	 * @return the activeTo
	 */
	public Date getActiveTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ACTIVETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.activeTo</code> attribute.
	 * @return the activeTo
	 */
	public Date getActiveTo()
	{
		return getActiveTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.activeTo</code> attribute. 
	 * @param value the activeTo
	 */
	public void setActiveTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ACTIVETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.activeTo</code> attribute. 
	 * @param value the activeTo
	 */
	public void setActiveTo(final Date value)
	{
		setActiveTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.compositeSupplier</code> attribute.
	 * @return the compositeSupplier
	 */
	public CompositeSupplier getCompositeSupplier(final SessionContext ctx)
	{
		return (CompositeSupplier)getProperty( ctx, COMPOSITESUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.compositeSupplier</code> attribute.
	 * @return the compositeSupplier
	 */
	public CompositeSupplier getCompositeSupplier()
	{
		return getCompositeSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.compositeSupplier</code> attribute. 
	 * @param value the compositeSupplier
	 */
	public void setCompositeSupplier(final SessionContext ctx, final CompositeSupplier value)
	{
		COMPOSITESUPPLIERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.compositeSupplier</code> attribute. 
	 * @param value the compositeSupplier
	 */
	public void setCompositeSupplier(final CompositeSupplier value)
	{
		setCompositeSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.connectivityEnabler</code> attribute.
	 * @return the connectivityEnabler
	 */
	public Supplier getConnectivityEnabler(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, CONNECTIVITYENABLER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.connectivityEnabler</code> attribute.
	 * @return the connectivityEnabler
	 */
	public Supplier getConnectivityEnabler()
	{
		return getConnectivityEnabler( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.connectivityEnabler</code> attribute. 
	 * @param value the connectivityEnabler
	 */
	public void setConnectivityEnabler(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, CONNECTIVITYENABLER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.connectivityEnabler</code> attribute. 
	 * @param value the connectivityEnabler
	 */
	public void setConnectivityEnabler(final Supplier value)
	{
		setConnectivityEnabler( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPOSITESUPPLIERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.settlementEnabler</code> attribute.
	 * @return the settlementEnabler
	 */
	public Supplier getSettlementEnabler(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SETTLEMENTENABLER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierEnablersMapping.settlementEnabler</code> attribute.
	 * @return the settlementEnabler
	 */
	public Supplier getSettlementEnabler()
	{
		return getSettlementEnabler( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.settlementEnabler</code> attribute. 
	 * @param value the settlementEnabler
	 */
	public void setSettlementEnabler(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SETTLEMENTENABLER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierEnablersMapping.settlementEnabler</code> attribute. 
	 * @param value the settlementEnabler
	 */
	public void setSettlementEnabler(final Supplier value)
	{
		setSettlementEnabler( getSession().getSessionContext(), value );
	}
	
}
