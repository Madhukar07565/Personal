/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.trandlogix.common.core.jalo;

import com.cnk.trandlogix.common.core.jalo.EzgNavigationBarComponent;
import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.trandlogix.common.core.jalo.EzgNavigationNodeComponent EzgNavigationNodeComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEzgNavigationNodeComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute **/
	public static final String DEFAULTSEL = "defaultSel";
	/** Qualifier of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute **/
	public static final String ORDERNUMBER = "orderNumber";
	/** Qualifier of the <code>EzgNavigationNodeComponent.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>EzgNavigationNodeComponent.ezgNavigationBarComponent</code> attribute **/
	public static final String EZGNAVIGATIONBARCOMPONENT = "ezgNavigationBarComponent";
	/** Relation ordering override parameter constants for EzgNaveNodeForNavigationBar from ((commoncore))*/
	protected static String EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED = "relation.EzgNaveNodeForNavigationBar.source.ordered";
	protected static String EZGNAVENODEFORNAVIGATIONBAR_TGT_ORDERED = "relation.EzgNaveNodeForNavigationBar.target.ordered";
	/** Relation disable markmodifed parameter constants for EzgNaveNodeForNavigationBar from ((commoncore))*/
	protected static String EZGNAVENODEFORNAVIGATIONBAR_MARKMODIFIED = "relation.EzgNaveNodeForNavigationBar.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DEFAULTSEL, AttributeMode.INITIAL);
		tmp.put(ORDERNUMBER, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute.
	 * @return the defaultSel
	 */
	public Boolean isDefaultSel(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DEFAULTSEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute.
	 * @return the defaultSel
	 */
	public Boolean isDefaultSel()
	{
		return isDefaultSel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute. 
	 * @return the defaultSel
	 */
	public boolean isDefaultSelAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDefaultSel( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute. 
	 * @return the defaultSel
	 */
	public boolean isDefaultSelAsPrimitive()
	{
		return isDefaultSelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute. 
	 * @param value the defaultSel
	 */
	public void setDefaultSel(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DEFAULTSEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute. 
	 * @param value the defaultSel
	 */
	public void setDefaultSel(final Boolean value)
	{
		setDefaultSel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute. 
	 * @param value the defaultSel
	 */
	public void setDefaultSel(final SessionContext ctx, final boolean value)
	{
		setDefaultSel( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.defaultSel</code> attribute. 
	 * @param value the defaultSel
	 */
	public void setDefaultSel(final boolean value)
	{
		setDefaultSel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.ezgNavigationBarComponent</code> attribute.
	 * @return the ezgNavigationBarComponent
	 */
	public Collection<EzgNavigationBarComponent> getEzgNavigationBarComponent(final SessionContext ctx)
	{
		final List<EzgNavigationBarComponent> items = getLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			"EzgNavigationBarComponent",
			null,
			Utilities.getRelationOrderingOverride(EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.ezgNavigationBarComponent</code> attribute.
	 * @return the ezgNavigationBarComponent
	 */
	public Collection<EzgNavigationBarComponent> getEzgNavigationBarComponent()
	{
		return getEzgNavigationBarComponent( getSession().getSessionContext() );
	}
	
	public long getEzgNavigationBarComponentCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			"EzgNavigationBarComponent",
			null
		);
	}
	
	public long getEzgNavigationBarComponentCount()
	{
		return getEzgNavigationBarComponentCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.ezgNavigationBarComponent</code> attribute. 
	 * @param value the ezgNavigationBarComponent
	 */
	public void setEzgNavigationBarComponent(final SessionContext ctx, final Collection<EzgNavigationBarComponent> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			null,
			value,
			Utilities.getRelationOrderingOverride(EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGNAVENODEFORNAVIGATIONBAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.ezgNavigationBarComponent</code> attribute. 
	 * @param value the ezgNavigationBarComponent
	 */
	public void setEzgNavigationBarComponent(final Collection<EzgNavigationBarComponent> value)
	{
		setEzgNavigationBarComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ezgNavigationBarComponent. 
	 * @param value the item to add to ezgNavigationBarComponent
	 */
	public void addToEzgNavigationBarComponent(final SessionContext ctx, final EzgNavigationBarComponent value)
	{
		addLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGNAVENODEFORNAVIGATIONBAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ezgNavigationBarComponent. 
	 * @param value the item to add to ezgNavigationBarComponent
	 */
	public void addToEzgNavigationBarComponent(final EzgNavigationBarComponent value)
	{
		addToEzgNavigationBarComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ezgNavigationBarComponent. 
	 * @param value the item to remove from ezgNavigationBarComponent
	 */
	public void removeFromEzgNavigationBarComponent(final SessionContext ctx, final EzgNavigationBarComponent value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGNAVENODEFORNAVIGATIONBAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ezgNavigationBarComponent. 
	 * @param value the item to remove from ezgNavigationBarComponent
	 */
	public void removeFromEzgNavigationBarComponent(final EzgNavigationBarComponent value)
	{
		removeFromEzgNavigationBarComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute.
	 * @return the orderNumber
	 */
	public Integer getOrderNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ORDERNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute.
	 * @return the orderNumber
	 */
	public Integer getOrderNumber()
	{
		return getOrderNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute. 
	 * @return the orderNumber
	 */
	public int getOrderNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getOrderNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute. 
	 * @return the orderNumber
	 */
	public int getOrderNumberAsPrimitive()
	{
		return getOrderNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute. 
	 * @param value the orderNumber
	 */
	public void setOrderNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ORDERNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute. 
	 * @param value the orderNumber
	 */
	public void setOrderNumber(final Integer value)
	{
		setOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute. 
	 * @param value the orderNumber
	 */
	public void setOrderNumber(final SessionContext ctx, final int value)
	{
		setOrderNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.orderNumber</code> attribute. 
	 * @param value the orderNumber
	 */
	public void setOrderNumber(final int value)
	{
		setOrderNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.value</code> attribute.
	 * @return the value
	 */
	public String getValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationNodeComponent.value</code> attribute.
	 * @return the value
	 */
	public String getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationNodeComponent.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final String value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
