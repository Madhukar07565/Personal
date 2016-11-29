/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operations.jalo;

import com.cnk.travelogix.operations.constants.OperationssecureportaladdonConstants;
import com.cnk.travelogix.operations.jalo.restrictions.CMSSecurePortalRestriction;
import de.hybris.platform.basecommerce.jalo.site.BaseSite;
import de.hybris.platform.cms2.jalo.site.CMSSite;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>OperationssecureportaladdonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOperationssecureportaladdonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("requiresAuthentication", AttributeMode.INITIAL);
		tmp.put("enableRegistration", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.cms2.jalo.site.CMSSite", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CMSSecurePortalRestriction createCMSSecurePortalRestriction(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OperationssecureportaladdonConstants.TC.CMSSECUREPORTALRESTRICTION );
			return (CMSSecurePortalRestriction)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CMSSecurePortalRestriction : "+e.getMessage(), 0 );
		}
	}
	
	public CMSSecurePortalRestriction createCMSSecurePortalRestriction(final Map attributeValues)
	{
		return createCMSSecurePortalRestriction( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.enableRegistration</code> attribute.
	 * @return the enableRegistration - Indicates if the website supports registration request.
	 */
	public Boolean isEnableRegistration(final SessionContext ctx, final CMSSite item)
	{
		return (Boolean)item.getProperty( ctx, OperationssecureportaladdonConstants.Attributes.CMSSite.ENABLEREGISTRATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.enableRegistration</code> attribute.
	 * @return the enableRegistration - Indicates if the website supports registration request.
	 */
	public Boolean isEnableRegistration(final CMSSite item)
	{
		return isEnableRegistration( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.enableRegistration</code> attribute. 
	 * @return the enableRegistration - Indicates if the website supports registration request.
	 */
	public boolean isEnableRegistrationAsPrimitive(final SessionContext ctx, final CMSSite item)
	{
		Boolean value = isEnableRegistration( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.enableRegistration</code> attribute. 
	 * @return the enableRegistration - Indicates if the website supports registration request.
	 */
	public boolean isEnableRegistrationAsPrimitive(final CMSSite item)
	{
		return isEnableRegistrationAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.enableRegistration</code> attribute. 
	 * @param value the enableRegistration - Indicates if the website supports registration request.
	 */
	public void setEnableRegistration(final SessionContext ctx, final CMSSite item, final Boolean value)
	{
		item.setProperty(ctx, OperationssecureportaladdonConstants.Attributes.CMSSite.ENABLEREGISTRATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.enableRegistration</code> attribute. 
	 * @param value the enableRegistration - Indicates if the website supports registration request.
	 */
	public void setEnableRegistration(final CMSSite item, final Boolean value)
	{
		setEnableRegistration( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.enableRegistration</code> attribute. 
	 * @param value the enableRegistration - Indicates if the website supports registration request.
	 */
	public void setEnableRegistration(final SessionContext ctx, final CMSSite item, final boolean value)
	{
		setEnableRegistration( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.enableRegistration</code> attribute. 
	 * @param value the enableRegistration - Indicates if the website supports registration request.
	 */
	public void setEnableRegistration(final CMSSite item, final boolean value)
	{
		setEnableRegistration( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return OperationssecureportaladdonConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.requiresAuthentication</code> attribute.
	 * @return the requiresAuthentication - Indicates if the website requires authentication or not.
	 */
	public Boolean isRequiresAuthentication(final SessionContext ctx, final CMSSite item)
	{
		return (Boolean)item.getProperty( ctx, OperationssecureportaladdonConstants.Attributes.CMSSite.REQUIRESAUTHENTICATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.requiresAuthentication</code> attribute.
	 * @return the requiresAuthentication - Indicates if the website requires authentication or not.
	 */
	public Boolean isRequiresAuthentication(final CMSSite item)
	{
		return isRequiresAuthentication( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.requiresAuthentication</code> attribute. 
	 * @return the requiresAuthentication - Indicates if the website requires authentication or not.
	 */
	public boolean isRequiresAuthenticationAsPrimitive(final SessionContext ctx, final CMSSite item)
	{
		Boolean value = isRequiresAuthentication( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CMSSite.requiresAuthentication</code> attribute. 
	 * @return the requiresAuthentication - Indicates if the website requires authentication or not.
	 */
	public boolean isRequiresAuthenticationAsPrimitive(final CMSSite item)
	{
		return isRequiresAuthenticationAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.requiresAuthentication</code> attribute. 
	 * @param value the requiresAuthentication - Indicates if the website requires authentication or not.
	 */
	public void setRequiresAuthentication(final SessionContext ctx, final CMSSite item, final Boolean value)
	{
		item.setProperty(ctx, OperationssecureportaladdonConstants.Attributes.CMSSite.REQUIRESAUTHENTICATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.requiresAuthentication</code> attribute. 
	 * @param value the requiresAuthentication - Indicates if the website requires authentication or not.
	 */
	public void setRequiresAuthentication(final CMSSite item, final Boolean value)
	{
		setRequiresAuthentication( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.requiresAuthentication</code> attribute. 
	 * @param value the requiresAuthentication - Indicates if the website requires authentication or not.
	 */
	public void setRequiresAuthentication(final SessionContext ctx, final CMSSite item, final boolean value)
	{
		setRequiresAuthentication( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CMSSite.requiresAuthentication</code> attribute. 
	 * @param value the requiresAuthentication - Indicates if the website requires authentication or not.
	 */
	public void setRequiresAuthentication(final CMSSite item, final boolean value)
	{
		setRequiresAuthentication( getSession().getSessionContext(), item, value );
	}
	
}
