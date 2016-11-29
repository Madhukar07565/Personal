/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.trandlogix.common.core.jalo;

import com.cnk.trandlogix.common.core.jalo.EzgNavigationNodeComponent;
import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.trandlogix.common.core.jalo.EzgNavigationBarComponent EzgNavigationBarComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEzgNavigationBarComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>EzgNavigationBarComponent.showSize</code> attribute **/
	public static final String SHOWSIZE = "showSize";
	/** Qualifier of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute **/
	public static final String ISFORHOMEPAGE = "isForHomePage";
	/** Qualifier of the <code>EzgNavigationBarComponent.ezgNavigationNodeComponents</code> attribute **/
	public static final String EZGNAVIGATIONNODECOMPONENTS = "ezgNavigationNodeComponents";
	/** Relation ordering override parameter constants for EzgNaveNodeForNavigationBar from ((commoncore))*/
	protected static String EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED = "relation.EzgNaveNodeForNavigationBar.source.ordered";
	protected static String EZGNAVENODEFORNAVIGATIONBAR_TGT_ORDERED = "relation.EzgNaveNodeForNavigationBar.target.ordered";
	/** Relation disable markmodifed parameter constants for EzgNaveNodeForNavigationBar from ((commoncore))*/
	protected static String EZGNAVENODEFORNAVIGATIONBAR_MARKMODIFIED = "relation.EzgNaveNodeForNavigationBar.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SHOWSIZE, AttributeMode.INITIAL);
		tmp.put(ISFORHOMEPAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.ezgNavigationNodeComponents</code> attribute.
	 * @return the ezgNavigationNodeComponents
	 */
	public List<EzgNavigationNodeComponent> getEzgNavigationNodeComponents(final SessionContext ctx)
	{
		final List<EzgNavigationNodeComponent> items = getLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			"EzgNavigationNodeComponent",
			null,
			Utilities.getRelationOrderingOverride(EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.ezgNavigationNodeComponents</code> attribute.
	 * @return the ezgNavigationNodeComponents
	 */
	public List<EzgNavigationNodeComponent> getEzgNavigationNodeComponents()
	{
		return getEzgNavigationNodeComponents( getSession().getSessionContext() );
	}
	
	public long getEzgNavigationNodeComponentsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			"EzgNavigationNodeComponent",
			null
		);
	}
	
	public long getEzgNavigationNodeComponentsCount()
	{
		return getEzgNavigationNodeComponentsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.ezgNavigationNodeComponents</code> attribute. 
	 * @param value the ezgNavigationNodeComponents
	 */
	public void setEzgNavigationNodeComponents(final SessionContext ctx, final List<EzgNavigationNodeComponent> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			null,
			value,
			Utilities.getRelationOrderingOverride(EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGNAVENODEFORNAVIGATIONBAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.ezgNavigationNodeComponents</code> attribute. 
	 * @param value the ezgNavigationNodeComponents
	 */
	public void setEzgNavigationNodeComponents(final List<EzgNavigationNodeComponent> value)
	{
		setEzgNavigationNodeComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ezgNavigationNodeComponents. 
	 * @param value the item to add to ezgNavigationNodeComponents
	 */
	public void addToEzgNavigationNodeComponents(final SessionContext ctx, final EzgNavigationNodeComponent value)
	{
		addLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGNAVENODEFORNAVIGATIONBAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ezgNavigationNodeComponents. 
	 * @param value the item to add to ezgNavigationNodeComponents
	 */
	public void addToEzgNavigationNodeComponents(final EzgNavigationNodeComponent value)
	{
		addToEzgNavigationNodeComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ezgNavigationNodeComponents. 
	 * @param value the item to remove from ezgNavigationNodeComponents
	 */
	public void removeFromEzgNavigationNodeComponents(final SessionContext ctx, final EzgNavigationNodeComponent value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.EZGNAVENODEFORNAVIGATIONBAR,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EZGNAVENODEFORNAVIGATIONBAR_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGNAVENODEFORNAVIGATIONBAR_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ezgNavigationNodeComponents. 
	 * @param value the item to remove from ezgNavigationNodeComponents
	 */
	public void removeFromEzgNavigationNodeComponents(final EzgNavigationNodeComponent value)
	{
		removeFromEzgNavigationNodeComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute.
	 * @return the isForHomePage
	 */
	public Boolean isIsForHomePage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISFORHOMEPAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute.
	 * @return the isForHomePage
	 */
	public Boolean isIsForHomePage()
	{
		return isIsForHomePage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute. 
	 * @return the isForHomePage
	 */
	public boolean isIsForHomePageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsForHomePage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute. 
	 * @return the isForHomePage
	 */
	public boolean isIsForHomePageAsPrimitive()
	{
		return isIsForHomePageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute. 
	 * @param value the isForHomePage
	 */
	public void setIsForHomePage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISFORHOMEPAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute. 
	 * @param value the isForHomePage
	 */
	public void setIsForHomePage(final Boolean value)
	{
		setIsForHomePage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute. 
	 * @param value the isForHomePage
	 */
	public void setIsForHomePage(final SessionContext ctx, final boolean value)
	{
		setIsForHomePage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.isForHomePage</code> attribute. 
	 * @param value the isForHomePage
	 */
	public void setIsForHomePage(final boolean value)
	{
		setIsForHomePage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.showSize</code> attribute.
	 * @return the showSize
	 */
	public Integer getShowSize(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SHOWSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.showSize</code> attribute.
	 * @return the showSize
	 */
	public Integer getShowSize()
	{
		return getShowSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.showSize</code> attribute. 
	 * @return the showSize
	 */
	public int getShowSizeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getShowSize( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgNavigationBarComponent.showSize</code> attribute. 
	 * @return the showSize
	 */
	public int getShowSizeAsPrimitive()
	{
		return getShowSizeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.showSize</code> attribute. 
	 * @param value the showSize
	 */
	public void setShowSize(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SHOWSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.showSize</code> attribute. 
	 * @param value the showSize
	 */
	public void setShowSize(final Integer value)
	{
		setShowSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.showSize</code> attribute. 
	 * @param value the showSize
	 */
	public void setShowSize(final SessionContext ctx, final int value)
	{
		setShowSize( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgNavigationBarComponent.showSize</code> attribute. 
	 * @param value the showSize
	 */
	public void setShowSize(final int value)
	{
		setShowSize( getSession().getSessionContext(), value );
	}
	
}
