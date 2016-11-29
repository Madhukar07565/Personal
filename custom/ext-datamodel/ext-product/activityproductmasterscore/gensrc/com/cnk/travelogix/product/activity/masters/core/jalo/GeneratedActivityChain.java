/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.ActivityChain ActivityChain}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityChain extends GenericItem
{
	/** Qualifier of the <code>ActivityChain.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ActivityChain.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ActivityChain.displayName</code> attribute **/
	public static final String DISPLAYNAME = "displayName";
	/** Qualifier of the <code>ActivityChain.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>ActivityChain.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>ActivityChain.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>ActivityChain.url</code> attribute **/
	public static final String URL = "url";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DISPLAYNAME, AttributeMode.INITIAL);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(URL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		new PartOfHandler<Address>()
		{
			@Override
			protected Address doGetValue(final SessionContext ctx)
			{
				return getAddress( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Address _value)
			{
				final Address value = _value;
				setProperty(ctx, ADDRESS,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityChain.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.description</code> attribute. 
	 * @return the localized description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityChain.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.description</code> attribute. 
	 * @param value the description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.displayName</code> attribute.
	 * @return the displayName
	 */
	public String getDisplayName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityChain.getDisplayName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DISPLAYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.displayName</code> attribute.
	 * @return the displayName
	 */
	public String getDisplayName()
	{
		return getDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.displayName</code> attribute. 
	 * @return the localized displayName
	 */
	public Map<Language,String> getAllDisplayName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DISPLAYNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.displayName</code> attribute. 
	 * @return the localized displayName
	 */
	public Map<Language,String> getAllDisplayName()
	{
		return getAllDisplayName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.displayName</code> attribute. 
	 * @param value the displayName
	 */
	public void setDisplayName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityChain.setDisplayName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.displayName</code> attribute. 
	 * @param value the displayName
	 */
	public void setDisplayName(final String value)
	{
		setDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.displayName</code> attribute. 
	 * @param value the displayName
	 */
	public void setAllDisplayName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DISPLAYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.displayName</code> attribute. 
	 * @param value the displayName
	 */
	public void setAllDisplayName(final Map<Language,String> value)
	{
		setAllDisplayName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.url</code> attribute.
	 * @return the url
	 */
	public String getUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, URL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityChain.url</code> attribute.
	 * @return the url
	 */
	public String getUrl()
	{
		return getUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, URL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityChain.url</code> attribute. 
	 * @param value the url
	 */
	public void setUrl(final String value)
	{
		setUrl( getSession().getSessionContext(), value );
	}
	
}
