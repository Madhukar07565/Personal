/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.trandlogix.common.core.jalo.EzgRotatingImagesComponent;
import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.EzgBannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.EzgBgGroundBannerComponent EzgBgGroundBannerComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEzgBgGroundBannerComponent extends EzgBannerComponent
{
	/** Qualifier of the <code>EzgBgGroundBannerComponent.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>EzgBgGroundBannerComponent.content</code> attribute **/
	public static final String CONTENT = "content";
	/** Qualifier of the <code>EzgBgGroundBannerComponent.rotatingComponent</code> attribute **/
	public static final String ROTATINGCOMPONENT = "rotatingComponent";
	/** Relation ordering override parameter constants for EzgBannersForRotatingComponent from ((commoncore))*/
	protected static String EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED = "relation.EzgBannersForRotatingComponent.source.ordered";
	protected static String EZGBANNERSFORROTATINGCOMPONENT_TGT_ORDERED = "relation.EzgBannersForRotatingComponent.target.ordered";
	/** Relation disable markmodifed parameter constants for EzgBannersForRotatingComponent from ((commoncore))*/
	protected static String EZGBANNERSFORROTATINGCOMPONENT_MARKMODIFIED = "relation.EzgBannersForRotatingComponent.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(EzgBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgBgGroundBannerComponent.content</code> attribute.
	 * @return the content
	 */
	public String getContent(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgBgGroundBannerComponent.content</code> attribute.
	 * @return the content
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgBgGroundBannerComponent.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgBgGroundBannerComponent.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgBgGroundBannerComponent.rotatingComponent</code> attribute.
	 * @return the rotatingComponent
	 */
	public Collection<EzgRotatingImagesComponent> getRotatingComponent(final SessionContext ctx)
	{
		final List<EzgRotatingImagesComponent> items = getLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			"EzgRotatingImagesComponent",
			null,
			Utilities.getRelationOrderingOverride(EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgBgGroundBannerComponent.rotatingComponent</code> attribute.
	 * @return the rotatingComponent
	 */
	public Collection<EzgRotatingImagesComponent> getRotatingComponent()
	{
		return getRotatingComponent( getSession().getSessionContext() );
	}
	
	public long getRotatingComponentCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			"EzgRotatingImagesComponent",
			null
		);
	}
	
	public long getRotatingComponentCount()
	{
		return getRotatingComponentCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgBgGroundBannerComponent.rotatingComponent</code> attribute. 
	 * @param value the rotatingComponent
	 */
	public void setRotatingComponent(final SessionContext ctx, final Collection<EzgRotatingImagesComponent> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			null,
			value,
			Utilities.getRelationOrderingOverride(EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGBANNERSFORROTATINGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgBgGroundBannerComponent.rotatingComponent</code> attribute. 
	 * @param value the rotatingComponent
	 */
	public void setRotatingComponent(final Collection<EzgRotatingImagesComponent> value)
	{
		setRotatingComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rotatingComponent. 
	 * @param value the item to add to rotatingComponent
	 */
	public void addToRotatingComponent(final SessionContext ctx, final EzgRotatingImagesComponent value)
	{
		addLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGBANNERSFORROTATINGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rotatingComponent. 
	 * @param value the item to add to rotatingComponent
	 */
	public void addToRotatingComponent(final EzgRotatingImagesComponent value)
	{
		addToRotatingComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rotatingComponent. 
	 * @param value the item to remove from rotatingComponent
	 */
	public void removeFromRotatingComponent(final SessionContext ctx, final EzgRotatingImagesComponent value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGBANNERSFORROTATINGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rotatingComponent. 
	 * @param value the item to remove from rotatingComponent
	 */
	public void removeFromRotatingComponent(final EzgRotatingImagesComponent value)
	{
		removeFromRotatingComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgBgGroundBannerComponent.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgBgGroundBannerComponent.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgBgGroundBannerComponent.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgBgGroundBannerComponent.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
