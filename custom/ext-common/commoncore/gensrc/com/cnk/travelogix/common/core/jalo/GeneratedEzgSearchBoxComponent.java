/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.acceleratorcms.jalo.components.SearchBoxComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.SearchBoxComponent EzgSearchBoxComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEzgSearchBoxComponent extends SearchBoxComponent
{
	/** Qualifier of the <code>EzgSearchBoxComponent.cssStyle</code> attribute **/
	public static final String CSSSTYLE = "cssStyle";
	/** Qualifier of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute **/
	public static final String SHOWSEARCHICON = "showSearchIcon";
	/** Qualifier of the <code>EzgSearchBoxComponent.pageType</code> attribute **/
	public static final String PAGETYPE = "pageType";
	/** Qualifier of the <code>EzgSearchBoxComponent.searchPlaceholder</code> attribute **/
	public static final String SEARCHPLACEHOLDER = "searchPlaceholder";
	/** Qualifier of the <code>EzgSearchBoxComponent.displayCity</code> attribute **/
	public static final String DISPLAYCITY = "displayCity";
	/** Qualifier of the <code>EzgSearchBoxComponent.displayChain</code> attribute **/
	public static final String DISPLAYCHAIN = "displayChain";
	/** Qualifier of the <code>EzgSearchBoxComponent.displayArea</code> attribute **/
	public static final String DISPLAYAREA = "displayArea";
	/** Qualifier of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute **/
	public static final String DISPLAYLANDMARK = "displayLandMark";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SearchBoxComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CSSSTYLE, AttributeMode.INITIAL);
		tmp.put(SHOWSEARCHICON, AttributeMode.INITIAL);
		tmp.put(PAGETYPE, AttributeMode.INITIAL);
		tmp.put(SEARCHPLACEHOLDER, AttributeMode.INITIAL);
		tmp.put(DISPLAYCITY, AttributeMode.INITIAL);
		tmp.put(DISPLAYCHAIN, AttributeMode.INITIAL);
		tmp.put(DISPLAYAREA, AttributeMode.INITIAL);
		tmp.put(DISPLAYLANDMARK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.cssStyle</code> attribute.
	 * @return the cssStyle
	 */
	public String getCssStyle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CSSSTYLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.cssStyle</code> attribute.
	 * @return the cssStyle
	 */
	public String getCssStyle()
	{
		return getCssStyle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.cssStyle</code> attribute. 
	 * @param value the cssStyle
	 */
	public void setCssStyle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CSSSTYLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.cssStyle</code> attribute. 
	 * @param value the cssStyle
	 */
	public void setCssStyle(final String value)
	{
		setCssStyle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayArea</code> attribute.
	 * @return the displayArea - Determines if we auto suggest area data
	 */
	public Boolean isDisplayArea(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYAREA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayArea</code> attribute.
	 * @return the displayArea - Determines if we auto suggest area data
	 */
	public Boolean isDisplayArea()
	{
		return isDisplayArea( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayArea</code> attribute. 
	 * @return the displayArea - Determines if we auto suggest area data
	 */
	public boolean isDisplayAreaAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayArea( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayArea</code> attribute. 
	 * @return the displayArea - Determines if we auto suggest area data
	 */
	public boolean isDisplayAreaAsPrimitive()
	{
		return isDisplayAreaAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayArea</code> attribute. 
	 * @param value the displayArea - Determines if we auto suggest area data
	 */
	public void setDisplayArea(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYAREA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayArea</code> attribute. 
	 * @param value the displayArea - Determines if we auto suggest area data
	 */
	public void setDisplayArea(final Boolean value)
	{
		setDisplayArea( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayArea</code> attribute. 
	 * @param value the displayArea - Determines if we auto suggest area data
	 */
	public void setDisplayArea(final SessionContext ctx, final boolean value)
	{
		setDisplayArea( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayArea</code> attribute. 
	 * @param value the displayArea - Determines if we auto suggest area data
	 */
	public void setDisplayArea(final boolean value)
	{
		setDisplayArea( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayChain</code> attribute.
	 * @return the displayChain - Determines if we auto suggest chain data
	 */
	public Boolean isDisplayChain(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYCHAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayChain</code> attribute.
	 * @return the displayChain - Determines if we auto suggest chain data
	 */
	public Boolean isDisplayChain()
	{
		return isDisplayChain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayChain</code> attribute. 
	 * @return the displayChain - Determines if we auto suggest chain data
	 */
	public boolean isDisplayChainAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayChain( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayChain</code> attribute. 
	 * @return the displayChain - Determines if we auto suggest chain data
	 */
	public boolean isDisplayChainAsPrimitive()
	{
		return isDisplayChainAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayChain</code> attribute. 
	 * @param value the displayChain - Determines if we auto suggest chain data
	 */
	public void setDisplayChain(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYCHAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayChain</code> attribute. 
	 * @param value the displayChain - Determines if we auto suggest chain data
	 */
	public void setDisplayChain(final Boolean value)
	{
		setDisplayChain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayChain</code> attribute. 
	 * @param value the displayChain - Determines if we auto suggest chain data
	 */
	public void setDisplayChain(final SessionContext ctx, final boolean value)
	{
		setDisplayChain( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayChain</code> attribute. 
	 * @param value the displayChain - Determines if we auto suggest chain data
	 */
	public void setDisplayChain(final boolean value)
	{
		setDisplayChain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayCity</code> attribute.
	 * @return the displayCity - Determines if we auto suggest city data
	 */
	public Boolean isDisplayCity(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYCITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayCity</code> attribute.
	 * @return the displayCity - Determines if we auto suggest city data
	 */
	public Boolean isDisplayCity()
	{
		return isDisplayCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayCity</code> attribute. 
	 * @return the displayCity - Determines if we auto suggest city data
	 */
	public boolean isDisplayCityAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayCity( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayCity</code> attribute. 
	 * @return the displayCity - Determines if we auto suggest city data
	 */
	public boolean isDisplayCityAsPrimitive()
	{
		return isDisplayCityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayCity</code> attribute. 
	 * @param value the displayCity - Determines if we auto suggest city data
	 */
	public void setDisplayCity(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYCITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayCity</code> attribute. 
	 * @param value the displayCity - Determines if we auto suggest city data
	 */
	public void setDisplayCity(final Boolean value)
	{
		setDisplayCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayCity</code> attribute. 
	 * @param value the displayCity - Determines if we auto suggest city data
	 */
	public void setDisplayCity(final SessionContext ctx, final boolean value)
	{
		setDisplayCity( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayCity</code> attribute. 
	 * @param value the displayCity - Determines if we auto suggest city data
	 */
	public void setDisplayCity(final boolean value)
	{
		setDisplayCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute.
	 * @return the displayLandMark - Determines if we auto suggest landmark data
	 */
	public Boolean isDisplayLandMark(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DISPLAYLANDMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute.
	 * @return the displayLandMark - Determines if we auto suggest landmark data
	 */
	public Boolean isDisplayLandMark()
	{
		return isDisplayLandMark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute. 
	 * @return the displayLandMark - Determines if we auto suggest landmark data
	 */
	public boolean isDisplayLandMarkAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDisplayLandMark( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute. 
	 * @return the displayLandMark - Determines if we auto suggest landmark data
	 */
	public boolean isDisplayLandMarkAsPrimitive()
	{
		return isDisplayLandMarkAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute. 
	 * @param value the displayLandMark - Determines if we auto suggest landmark data
	 */
	public void setDisplayLandMark(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DISPLAYLANDMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute. 
	 * @param value the displayLandMark - Determines if we auto suggest landmark data
	 */
	public void setDisplayLandMark(final Boolean value)
	{
		setDisplayLandMark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute. 
	 * @param value the displayLandMark - Determines if we auto suggest landmark data
	 */
	public void setDisplayLandMark(final SessionContext ctx, final boolean value)
	{
		setDisplayLandMark( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.displayLandMark</code> attribute. 
	 * @param value the displayLandMark - Determines if we auto suggest landmark data
	 */
	public void setDisplayLandMark(final boolean value)
	{
		setDisplayLandMark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.pageType</code> attribute.
	 * @return the pageType
	 */
	public EnumerationValue getPageType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAGETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.pageType</code> attribute.
	 * @return the pageType
	 */
	public EnumerationValue getPageType()
	{
		return getPageType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.pageType</code> attribute. 
	 * @param value the pageType
	 */
	public void setPageType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAGETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.pageType</code> attribute. 
	 * @param value the pageType
	 */
	public void setPageType(final EnumerationValue value)
	{
		setPageType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.searchPlaceholder</code> attribute.
	 * @return the searchPlaceholder
	 */
	public String getSearchPlaceholder(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEARCHPLACEHOLDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.searchPlaceholder</code> attribute.
	 * @return the searchPlaceholder
	 */
	public String getSearchPlaceholder()
	{
		return getSearchPlaceholder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.searchPlaceholder</code> attribute. 
	 * @param value the searchPlaceholder
	 */
	public void setSearchPlaceholder(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEARCHPLACEHOLDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.searchPlaceholder</code> attribute. 
	 * @param value the searchPlaceholder
	 */
	public void setSearchPlaceholder(final String value)
	{
		setSearchPlaceholder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute.
	 * @return the showSearchIcon
	 */
	public Boolean isShowSearchIcon(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHOWSEARCHICON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute.
	 * @return the showSearchIcon
	 */
	public Boolean isShowSearchIcon()
	{
		return isShowSearchIcon( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute. 
	 * @return the showSearchIcon
	 */
	public boolean isShowSearchIconAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShowSearchIcon( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute. 
	 * @return the showSearchIcon
	 */
	public boolean isShowSearchIconAsPrimitive()
	{
		return isShowSearchIconAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute. 
	 * @param value the showSearchIcon
	 */
	public void setShowSearchIcon(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHOWSEARCHICON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute. 
	 * @param value the showSearchIcon
	 */
	public void setShowSearchIcon(final Boolean value)
	{
		setShowSearchIcon( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute. 
	 * @param value the showSearchIcon
	 */
	public void setShowSearchIcon(final SessionContext ctx, final boolean value)
	{
		setShowSearchIcon( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgSearchBoxComponent.showSearchIcon</code> attribute. 
	 * @param value the showSearchIcon
	 */
	public void setShowSearchIcon(final boolean value)
	{
		setShowSearchIcon( getSession().getSessionContext(), value );
	}
	
}
