/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.AssociatedCompanies AssociatedCompanies}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssociatedCompanies extends GenericItem
{
	/** Qualifier of the <code>AssociatedCompanies.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>AssociatedCompanies.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>AssociatedCompanies.sbu</code> attribute **/
	public static final String SBU = "sbu";
	/** Qualifier of the <code>AssociatedCompanies.abstractInventoryDefinition</code> attribute **/
	public static final String ABSTRACTINVENTORYDEFINITION = "abstractInventoryDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAssociatedCompanies> ABSTRACTINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedAssociatedCompanies>(
	CommoninventorycoreConstants.TC.ASSOCIATEDCOMPANIES,
	false,
	"abstractInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(SBU, AttributeMode.INITIAL);
		tmp.put(ABSTRACTINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCompanies.abstractInventoryDefinition</code> attribute.
	 * @return the abstractInventoryDefinition
	 */
	public AbstractInventoryDefinition getAbstractInventoryDefinition(final SessionContext ctx)
	{
		return (AbstractInventoryDefinition)getProperty( ctx, ABSTRACTINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCompanies.abstractInventoryDefinition</code> attribute.
	 * @return the abstractInventoryDefinition
	 */
	public AbstractInventoryDefinition getAbstractInventoryDefinition()
	{
		return getAbstractInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCompanies.abstractInventoryDefinition</code> attribute. 
	 * @param value the abstractInventoryDefinition
	 */
	public void setAbstractInventoryDefinition(final SessionContext ctx, final AbstractInventoryDefinition value)
	{
		ABSTRACTINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCompanies.abstractInventoryDefinition</code> attribute. 
	 * @param value the abstractInventoryDefinition
	 */
	public void setAbstractInventoryDefinition(final AbstractInventoryDefinition value)
	{
		setAbstractInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCompanies.bu</code> attribute.
	 * @return the bu - BU
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCompanies.bu</code> attribute.
	 * @return the bu - BU
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCompanies.bu</code> attribute. 
	 * @param value the bu - BU
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCompanies.bu</code> attribute. 
	 * @param value the bu - BU
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCompanies.catalogVersion</code> attribute.
	 * @return the catalogVersion - Catalog Version
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCompanies.catalogVersion</code> attribute.
	 * @return the catalogVersion - Catalog Version
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCompanies.catalogVersion</code> attribute. 
	 * @param value the catalogVersion - Catalog Version
	 */
	public void setCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		setProperty(ctx, CATALOGVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCompanies.catalogVersion</code> attribute. 
	 * @param value the catalogVersion - Catalog Version
	 */
	public void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSTRACTINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCompanies.sbu</code> attribute.
	 * @return the sbu - SBU
	 */
	public StrategicBusinessUnit getSbu(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, SBU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCompanies.sbu</code> attribute.
	 * @return the sbu - SBU
	 */
	public StrategicBusinessUnit getSbu()
	{
		return getSbu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCompanies.sbu</code> attribute. 
	 * @param value the sbu - SBU
	 */
	public void setSbu(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		setProperty(ctx, SBU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCompanies.sbu</code> attribute. 
	 * @param value the sbu - SBU
	 */
	public void setSbu(final StrategicBusinessUnit value)
	{
		setSbu( getSession().getSessionContext(), value );
	}
	
}
