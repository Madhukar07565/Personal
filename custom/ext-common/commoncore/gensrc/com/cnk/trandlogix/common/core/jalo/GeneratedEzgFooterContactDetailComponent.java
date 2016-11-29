/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.trandlogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.trandlogix.common.core.jalo.EzgFooterContactDetailComponent EzgFooterContactDetailComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEzgFooterContactDetailComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>EzgFooterContactDetailComponent.shopping</code> attribute **/
	public static final String SHOPPING = "shopping";
	/** Qualifier of the <code>EzgFooterContactDetailComponent.view</code> attribute **/
	public static final String VIEW = "view";
	/** Qualifier of the <code>EzgFooterContactDetailComponent.select</code> attribute **/
	public static final String SELECT = "select";
	/** Qualifier of the <code>EzgFooterContactDetailComponent.compare</code> attribute **/
	public static final String COMPARE = "compare";
	/** Qualifier of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute **/
	public static final String WISHLIST = "wishlist";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SHOPPING, AttributeMode.INITIAL);
		tmp.put(VIEW, AttributeMode.INITIAL);
		tmp.put(SELECT, AttributeMode.INITIAL);
		tmp.put(COMPARE, AttributeMode.INITIAL);
		tmp.put(WISHLIST, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.compare</code> attribute.
	 * @return the compare
	 */
	public Boolean isCompare(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMPARE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.compare</code> attribute.
	 * @return the compare
	 */
	public Boolean isCompare()
	{
		return isCompare( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.compare</code> attribute. 
	 * @return the compare
	 */
	public boolean isCompareAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCompare( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.compare</code> attribute. 
	 * @return the compare
	 */
	public boolean isCompareAsPrimitive()
	{
		return isCompareAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.compare</code> attribute. 
	 * @param value the compare
	 */
	public void setCompare(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMPARE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.compare</code> attribute. 
	 * @param value the compare
	 */
	public void setCompare(final Boolean value)
	{
		setCompare( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.compare</code> attribute. 
	 * @param value the compare
	 */
	public void setCompare(final SessionContext ctx, final boolean value)
	{
		setCompare( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.compare</code> attribute. 
	 * @param value the compare
	 */
	public void setCompare(final boolean value)
	{
		setCompare( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.select</code> attribute.
	 * @return the select
	 */
	public Boolean isSelect(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SELECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.select</code> attribute.
	 * @return the select
	 */
	public Boolean isSelect()
	{
		return isSelect( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.select</code> attribute. 
	 * @return the select
	 */
	public boolean isSelectAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSelect( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.select</code> attribute. 
	 * @return the select
	 */
	public boolean isSelectAsPrimitive()
	{
		return isSelectAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.select</code> attribute. 
	 * @param value the select
	 */
	public void setSelect(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SELECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.select</code> attribute. 
	 * @param value the select
	 */
	public void setSelect(final Boolean value)
	{
		setSelect( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.select</code> attribute. 
	 * @param value the select
	 */
	public void setSelect(final SessionContext ctx, final boolean value)
	{
		setSelect( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.select</code> attribute. 
	 * @param value the select
	 */
	public void setSelect(final boolean value)
	{
		setSelect( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.shopping</code> attribute.
	 * @return the shopping
	 */
	public Boolean isShopping(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SHOPPING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.shopping</code> attribute.
	 * @return the shopping
	 */
	public Boolean isShopping()
	{
		return isShopping( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.shopping</code> attribute. 
	 * @return the shopping
	 */
	public boolean isShoppingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isShopping( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.shopping</code> attribute. 
	 * @return the shopping
	 */
	public boolean isShoppingAsPrimitive()
	{
		return isShoppingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.shopping</code> attribute. 
	 * @param value the shopping
	 */
	public void setShopping(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SHOPPING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.shopping</code> attribute. 
	 * @param value the shopping
	 */
	public void setShopping(final Boolean value)
	{
		setShopping( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.shopping</code> attribute. 
	 * @param value the shopping
	 */
	public void setShopping(final SessionContext ctx, final boolean value)
	{
		setShopping( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.shopping</code> attribute. 
	 * @param value the shopping
	 */
	public void setShopping(final boolean value)
	{
		setShopping( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.view</code> attribute.
	 * @return the view
	 */
	public Boolean isView(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, VIEW);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.view</code> attribute.
	 * @return the view
	 */
	public Boolean isView()
	{
		return isView( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.view</code> attribute. 
	 * @return the view
	 */
	public boolean isViewAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isView( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.view</code> attribute. 
	 * @return the view
	 */
	public boolean isViewAsPrimitive()
	{
		return isViewAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.view</code> attribute. 
	 * @param value the view
	 */
	public void setView(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, VIEW,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.view</code> attribute. 
	 * @param value the view
	 */
	public void setView(final Boolean value)
	{
		setView( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.view</code> attribute. 
	 * @param value the view
	 */
	public void setView(final SessionContext ctx, final boolean value)
	{
		setView( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.view</code> attribute. 
	 * @param value the view
	 */
	public void setView(final boolean value)
	{
		setView( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute.
	 * @return the wishlist
	 */
	public Boolean isWishlist(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, WISHLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute.
	 * @return the wishlist
	 */
	public Boolean isWishlist()
	{
		return isWishlist( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute. 
	 * @return the wishlist
	 */
	public boolean isWishlistAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isWishlist( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute. 
	 * @return the wishlist
	 */
	public boolean isWishlistAsPrimitive()
	{
		return isWishlistAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute. 
	 * @param value the wishlist
	 */
	public void setWishlist(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, WISHLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute. 
	 * @param value the wishlist
	 */
	public void setWishlist(final Boolean value)
	{
		setWishlist( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute. 
	 * @param value the wishlist
	 */
	public void setWishlist(final SessionContext ctx, final boolean value)
	{
		setWishlist( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EzgFooterContactDetailComponent.wishlist</code> attribute. 
	 * @param value the wishlist
	 */
	public void setWishlist(final boolean value)
	{
		setWishlist( getSession().getSessionContext(), value );
	}
	
}
