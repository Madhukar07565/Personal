/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.trandlogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.EzgBgGroundBannerComponent;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.trandlogix.common.core.jalo.EzgRotatingImagesComponent EzgRotatingImagesComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEzgRotatingImagesComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>EzgRotatingImagesComponent.timeout</code> attribute **/
	public static final String TIMEOUT = "timeout";
	/** Qualifier of the <code>EzgRotatingImagesComponent.tabSize</code> attribute **/
	public static final String TABSIZE = "tabSize";
	/** Qualifier of the <code>EzgRotatingImagesComponent.effect</code> attribute **/
	public static final String EFFECT = "effect";
	/** Qualifier of the <code>EzgRotatingImagesComponent.banners</code> attribute **/
	public static final String BANNERS = "banners";
	/** Relation ordering override parameter constants for EzgBannersForRotatingComponent from ((commoncore))*/
	protected static String EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED = "relation.EzgBannersForRotatingComponent.source.ordered";
	protected static String EZGBANNERSFORROTATINGCOMPONENT_TGT_ORDERED = "relation.EzgBannersForRotatingComponent.target.ordered";
	/** Relation disable markmodifed parameter constants for EzgBannersForRotatingComponent from ((commoncore))*/
	protected static String EZGBANNERSFORROTATINGCOMPONENT_MARKMODIFIED = "relation.EzgBannersForRotatingComponent.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TIMEOUT, AttributeMode.INITIAL);
		tmp.put(TABSIZE, AttributeMode.INITIAL);
		tmp.put(EFFECT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.banners</code> attribute.
	 * @return the banners
	 */
	public List<EzgBgGroundBannerComponent> getBanners(final SessionContext ctx)
	{
		final List<EzgBgGroundBannerComponent> items = getLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			"EzgBgGroundBannerComponent",
			null,
			Utilities.getRelationOrderingOverride(EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED, true),
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.banners</code> attribute.
	 * @return the banners
	 */
	public List<EzgBgGroundBannerComponent> getBanners()
	{
		return getBanners( getSession().getSessionContext() );
	}
	
	public long getBannersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			"EzgBgGroundBannerComponent",
			null
		);
	}
	
	public long getBannersCount()
	{
		return getBannersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.banners</code> attribute. 
	 * @param value the banners
	 */
	public void setBanners(final SessionContext ctx, final List<EzgBgGroundBannerComponent> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			null,
			value,
			Utilities.getRelationOrderingOverride(EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGBANNERSFORROTATINGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.banners</code> attribute. 
	 * @param value the banners
	 */
	public void setBanners(final List<EzgBgGroundBannerComponent> value)
	{
		setBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to banners. 
	 * @param value the item to add to banners
	 */
	public void addToBanners(final SessionContext ctx, final EzgBgGroundBannerComponent value)
	{
		addLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGBANNERSFORROTATINGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to banners. 
	 * @param value the item to add to banners
	 */
	public void addToBanners(final EzgBgGroundBannerComponent value)
	{
		addToBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from banners. 
	 * @param value the item to remove from banners
	 */
	public void removeFromBanners(final SessionContext ctx, final EzgBgGroundBannerComponent value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CommonCoreConstants.Relations.EZGBANNERSFORROTATINGCOMPONENT,
			null,
			Collections.singletonList(value),
			Utilities.getRelationOrderingOverride(EZGBANNERSFORROTATINGCOMPONENT_SRC_ORDERED, true),
			false,
			Utilities.getMarkModifiedOverride(EZGBANNERSFORROTATINGCOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from banners. 
	 * @param value the item to remove from banners
	 */
	public void removeFromBanners(final EzgBgGroundBannerComponent value)
	{
		removeFromBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.effect</code> attribute.
	 * @return the effect
	 */
	public EnumerationValue getEffect(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, EFFECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.effect</code> attribute.
	 * @return the effect
	 */
	public EnumerationValue getEffect()
	{
		return getEffect( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.effect</code> attribute. 
	 * @param value the effect
	 */
	public void setEffect(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, EFFECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.effect</code> attribute. 
	 * @param value the effect
	 */
	public void setEffect(final EnumerationValue value)
	{
		setEffect( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.tabSize</code> attribute.
	 * @return the tabSize
	 */
	public Integer getTabSize(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TABSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.tabSize</code> attribute.
	 * @return the tabSize
	 */
	public Integer getTabSize()
	{
		return getTabSize( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.tabSize</code> attribute. 
	 * @return the tabSize
	 */
	public int getTabSizeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTabSize( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.tabSize</code> attribute. 
	 * @return the tabSize
	 */
	public int getTabSizeAsPrimitive()
	{
		return getTabSizeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.tabSize</code> attribute. 
	 * @param value the tabSize
	 */
	public void setTabSize(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TABSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.tabSize</code> attribute. 
	 * @param value the tabSize
	 */
	public void setTabSize(final Integer value)
	{
		setTabSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.tabSize</code> attribute. 
	 * @param value the tabSize
	 */
	public void setTabSize(final SessionContext ctx, final int value)
	{
		setTabSize( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.tabSize</code> attribute. 
	 * @param value the tabSize
	 */
	public void setTabSize(final int value)
	{
		setTabSize( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.timeout</code> attribute.
	 * @return the timeout
	 */
	public Integer getTimeout(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIMEOUT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.timeout</code> attribute.
	 * @return the timeout
	 */
	public Integer getTimeout()
	{
		return getTimeout( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.timeout</code> attribute. 
	 * @return the timeout
	 */
	public int getTimeoutAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTimeout( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgRotatingImagesComponent.timeout</code> attribute. 
	 * @return the timeout
	 */
	public int getTimeoutAsPrimitive()
	{
		return getTimeoutAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.timeout</code> attribute. 
	 * @param value the timeout
	 */
	public void setTimeout(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIMEOUT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.timeout</code> attribute. 
	 * @param value the timeout
	 */
	public void setTimeout(final Integer value)
	{
		setTimeout( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.timeout</code> attribute. 
	 * @param value the timeout
	 */
	public void setTimeout(final SessionContext ctx, final int value)
	{
		setTimeout( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgRotatingImagesComponent.timeout</code> attribute. 
	 * @param value the timeout
	 */
	public void setTimeout(final int value)
	{
		setTimeout( getSession().getSessionContext(), value );
	}
	
}
