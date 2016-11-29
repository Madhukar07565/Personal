/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.EzgBannerComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.core.jalo.EzgLogoBannerComponent EzgLogoBannerComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEzgLogoBannerComponent extends EzgBannerComponent
{
	/** Qualifier of the <code>EzgLogoBannerComponent.isoText</code> attribute **/
	public static final String ISOTEXT = "isoText";
	/** Qualifier of the <code>EzgLogoBannerComponent.callNumber</code> attribute **/
	public static final String CALLNUMBER = "callNumber";
	/** Qualifier of the <code>EzgLogoBannerComponent.tollFree</code> attribute **/
	public static final String TOLLFREE = "tollFree";
	/** Qualifier of the <code>EzgLogoBannerComponent.searchWidget</code> attribute **/
	public static final String SEARCHWIDGET = "searchWidget";
	/** Qualifier of the <code>EzgLogoBannerComponent.url</code> attribute **/
	public static final String URL = "url";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(EzgBannerComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ISOTEXT, AttributeMode.INITIAL);
		tmp.put(CALLNUMBER, AttributeMode.INITIAL);
		tmp.put(TOLLFREE, AttributeMode.INITIAL);
		tmp.put(SEARCHWIDGET, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.callNumber</code> attribute.
	 * @return the callNumber
	 */
	public String getCallNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CALLNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.callNumber</code> attribute.
	 * @return the callNumber
	 */
	public String getCallNumber()
	{
		return getCallNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.callNumber</code> attribute. 
	 * @param value the callNumber
	 */
	public void setCallNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CALLNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.callNumber</code> attribute. 
	 * @param value the callNumber
	 */
	public void setCallNumber(final String value)
	{
		setCallNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.isoText</code> attribute.
	 * @return the isoText
	 */
	public String getIsoText(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISOTEXT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.isoText</code> attribute.
	 * @return the isoText
	 */
	public String getIsoText()
	{
		return getIsoText( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.isoText</code> attribute. 
	 * @param value the isoText
	 */
	public void setIsoText(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISOTEXT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.isoText</code> attribute. 
	 * @param value the isoText
	 */
	public void setIsoText(final String value)
	{
		setIsoText( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.searchWidget</code> attribute.
	 * @return the searchWidget
	 */
	public Boolean isSearchWidget(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SEARCHWIDGET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.searchWidget</code> attribute.
	 * @return the searchWidget
	 */
	public Boolean isSearchWidget()
	{
		return isSearchWidget( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.searchWidget</code> attribute. 
	 * @return the searchWidget
	 */
	public boolean isSearchWidgetAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSearchWidget( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.searchWidget</code> attribute. 
	 * @return the searchWidget
	 */
	public boolean isSearchWidgetAsPrimitive()
	{
		return isSearchWidgetAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.searchWidget</code> attribute. 
	 * @param value the searchWidget
	 */
	public void setSearchWidget(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SEARCHWIDGET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.searchWidget</code> attribute. 
	 * @param value the searchWidget
	 */
	public void setSearchWidget(final Boolean value)
	{
		setSearchWidget( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.searchWidget</code> attribute. 
	 * @param value the searchWidget
	 */
	public void setSearchWidget(final SessionContext ctx, final boolean value)
	{
		setSearchWidget( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.searchWidget</code> attribute. 
	 * @param value the searchWidget
	 */
	public void setSearchWidget(final boolean value)
	{
		setSearchWidget( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.tollFree</code> attribute.
	 * @return the tollFree
	 */
	public String getTollFree(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOLLFREE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.tollFree</code> attribute.
	 * @return the tollFree
	 */
	public String getTollFree()
	{
		return getTollFree( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.tollFree</code> attribute. 
	 * @param value the tollFree
	 */
	public void setTollFree(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOLLFREE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.tollFree</code> attribute. 
	 * @param value the tollFree
	 */
	public void setTollFree(final String value)
	{
		setTollFree( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.url</code> attribute.
	 * @return the url
	 */
	public String getUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgLogoBannerComponent.url</code> attribute.
	 * @return the url
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgLogoBannerComponent.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
}
