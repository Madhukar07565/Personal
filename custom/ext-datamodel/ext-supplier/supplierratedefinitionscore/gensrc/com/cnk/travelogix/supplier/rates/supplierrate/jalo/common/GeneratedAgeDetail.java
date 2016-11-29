/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail AgeDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAgeDetail extends GenericItem
{
	/** Qualifier of the <code>AgeDetail.toAge</code> attribute **/
	public static final String TOAGE = "toAge";
	/** Qualifier of the <code>AgeDetail.fromAge</code> attribute **/
	public static final String FROMAGE = "fromAge";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TOAGE, AttributeMode.INITIAL);
		tmp.put(FROMAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AgeDetail.fromAge</code> attribute.
	 * @return the fromAge
	 */
	public Integer getFromAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AgeDetail.fromAge</code> attribute.
	 * @return the fromAge
	 */
	public Integer getFromAge()
	{
		return getFromAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AgeDetail.fromAge</code> attribute. 
	 * @return the fromAge
	 */
	public int getFromAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AgeDetail.fromAge</code> attribute. 
	 * @return the fromAge
	 */
	public int getFromAgeAsPrimitive()
	{
		return getFromAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AgeDetail.fromAge</code> attribute. 
	 * @param value the fromAge
	 */
	public void setFromAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AgeDetail.fromAge</code> attribute. 
	 * @param value the fromAge
	 */
	public void setFromAge(final Integer value)
	{
		setFromAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AgeDetail.fromAge</code> attribute. 
	 * @param value the fromAge
	 */
	public void setFromAge(final SessionContext ctx, final int value)
	{
		setFromAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AgeDetail.fromAge</code> attribute. 
	 * @param value the fromAge
	 */
	public void setFromAge(final int value)
	{
		setFromAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AgeDetail.toAge</code> attribute.
	 * @return the toAge
	 */
	public Integer getToAge(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AgeDetail.toAge</code> attribute.
	 * @return the toAge
	 */
	public Integer getToAge()
	{
		return getToAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AgeDetail.toAge</code> attribute. 
	 * @return the toAge
	 */
	public int getToAgeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToAge( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AgeDetail.toAge</code> attribute. 
	 * @return the toAge
	 */
	public int getToAgeAsPrimitive()
	{
		return getToAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AgeDetail.toAge</code> attribute. 
	 * @param value the toAge
	 */
	public void setToAge(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AgeDetail.toAge</code> attribute. 
	 * @param value the toAge
	 */
	public void setToAge(final Integer value)
	{
		setToAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AgeDetail.toAge</code> attribute. 
	 * @param value the toAge
	 */
	public void setToAge(final SessionContext ctx, final int value)
	{
		setToAge( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AgeDetail.toAge</code> attribute. 
	 * @param value the toAge
	 */
	public void setToAge(final int value)
	{
		setToAge( getSession().getSessionContext(), value );
	}
	
}
