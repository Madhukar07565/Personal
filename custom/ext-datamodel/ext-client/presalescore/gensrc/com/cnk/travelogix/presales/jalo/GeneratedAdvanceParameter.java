/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.Continent;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.AdvanceParameter AdvanceParameter}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAdvanceParameter extends GenericItem
{
	/** Qualifier of the <code>AdvanceParameter.continent</code> attribute **/
	public static final String CONTINENT = "continent";
	/** Qualifier of the <code>AdvanceParameter.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>AdvanceParameter.include</code> attribute **/
	public static final String INCLUDE = "include";
	/** Qualifier of the <code>AdvanceParameter.exclude</code> attribute **/
	public static final String EXCLUDE = "exclude";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CONTINENT, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(INCLUDE, AttributeMode.INITIAL);
		tmp.put(EXCLUDE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.continent</code> attribute.
	 * @return the continent - Continent
	 */
	public Continent getContinent(final SessionContext ctx)
	{
		return (Continent)getProperty( ctx, CONTINENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.continent</code> attribute.
	 * @return the continent - Continent
	 */
	public Continent getContinent()
	{
		return getContinent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.continent</code> attribute. 
	 * @param value the continent - Continent
	 */
	public void setContinent(final SessionContext ctx, final Continent value)
	{
		setProperty(ctx, CONTINENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.continent</code> attribute. 
	 * @param value the continent - Continent
	 */
	public void setContinent(final Continent value)
	{
		setContinent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.country</code> attribute.
	 * @return the country - Country
	 */
	public List<Country> getCountry(final SessionContext ctx)
	{
		List<Country> coll = (List<Country>)getProperty( ctx, COUNTRY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.country</code> attribute.
	 * @return the country - Country
	 */
	public List<Country> getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final List<Country> value)
	{
		setProperty(ctx, COUNTRY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final List<Country> value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.exclude</code> attribute.
	 * @return the exclude - Country
	 */
	public Boolean isExclude(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EXCLUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.exclude</code> attribute.
	 * @return the exclude - Country
	 */
	public Boolean isExclude()
	{
		return isExclude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.exclude</code> attribute. 
	 * @return the exclude - Country
	 */
	public boolean isExcludeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isExclude( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.exclude</code> attribute. 
	 * @return the exclude - Country
	 */
	public boolean isExcludeAsPrimitive()
	{
		return isExcludeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.exclude</code> attribute. 
	 * @param value the exclude - Country
	 */
	public void setExclude(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EXCLUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.exclude</code> attribute. 
	 * @param value the exclude - Country
	 */
	public void setExclude(final Boolean value)
	{
		setExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.exclude</code> attribute. 
	 * @param value the exclude - Country
	 */
	public void setExclude(final SessionContext ctx, final boolean value)
	{
		setExclude( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.exclude</code> attribute. 
	 * @param value the exclude - Country
	 */
	public void setExclude(final boolean value)
	{
		setExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.include</code> attribute.
	 * @return the include - Country
	 */
	public Boolean isInclude(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.include</code> attribute.
	 * @return the include - Country
	 */
	public Boolean isInclude()
	{
		return isInclude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.include</code> attribute. 
	 * @return the include - Country
	 */
	public boolean isIncludeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInclude( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceParameter.include</code> attribute. 
	 * @return the include - Country
	 */
	public boolean isIncludeAsPrimitive()
	{
		return isIncludeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.include</code> attribute. 
	 * @param value the include - Country
	 */
	public void setInclude(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.include</code> attribute. 
	 * @param value the include - Country
	 */
	public void setInclude(final Boolean value)
	{
		setInclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.include</code> attribute. 
	 * @param value the include - Country
	 */
	public void setInclude(final SessionContext ctx, final boolean value)
	{
		setInclude( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceParameter.include</code> attribute. 
	 * @param value the include - Country
	 */
	public void setInclude(final boolean value)
	{
		setInclude( getSession().getSessionContext(), value );
	}
	
}
