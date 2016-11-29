/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.contact.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.contacts.jalo.AbstractContactDetails;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.contact.jalo.EContactInfo EContactInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEContactInfo extends AbstractContactDetails
{
	/** Qualifier of the <code>EContactInfo.emailType</code> attribute **/
	public static final String EMAILTYPE = "emailType";
	/** Qualifier of the <code>EContactInfo.emailAddress</code> attribute **/
	public static final String EMAILADDRESS = "emailAddress";
	/** Qualifier of the <code>EContactInfo.website</code> attribute **/
	public static final String WEBSITE = "website";
	/** Qualifier of the <code>EContactInfo.newsletterRequired</code> attribute **/
	public static final String NEWSLETTERREQUIRED = "newsletterRequired";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractContactDetails.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EMAILTYPE, AttributeMode.INITIAL);
		tmp.put(EMAILADDRESS, AttributeMode.INITIAL);
		tmp.put(WEBSITE, AttributeMode.INITIAL);
		tmp.put(NEWSLETTERREQUIRED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.emailAddress</code> attribute.
	 * @return the emailAddress
	 */
	public String getEmailAddress(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.emailAddress</code> attribute.
	 * @return the emailAddress
	 */
	public String getEmailAddress()
	{
		return getEmailAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.emailAddress</code> attribute. 
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.emailAddress</code> attribute. 
	 * @param value the emailAddress
	 */
	public void setEmailAddress(final String value)
	{
		setEmailAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.emailType</code> attribute.
	 * @return the emailType
	 */
	public EnumerationValue getEmailType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, EMAILTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.emailType</code> attribute.
	 * @return the emailType
	 */
	public EnumerationValue getEmailType()
	{
		return getEmailType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.emailType</code> attribute. 
	 * @param value the emailType
	 */
	public void setEmailType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, EMAILTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.emailType</code> attribute. 
	 * @param value the emailType
	 */
	public void setEmailType(final EnumerationValue value)
	{
		setEmailType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.newsletterRequired</code> attribute.
	 * @return the newsletterRequired
	 */
	public Boolean isNewsletterRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NEWSLETTERREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.newsletterRequired</code> attribute.
	 * @return the newsletterRequired
	 */
	public Boolean isNewsletterRequired()
	{
		return isNewsletterRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.newsletterRequired</code> attribute. 
	 * @return the newsletterRequired
	 */
	public boolean isNewsletterRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNewsletterRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.newsletterRequired</code> attribute. 
	 * @return the newsletterRequired
	 */
	public boolean isNewsletterRequiredAsPrimitive()
	{
		return isNewsletterRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.newsletterRequired</code> attribute. 
	 * @param value the newsletterRequired
	 */
	public void setNewsletterRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NEWSLETTERREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.newsletterRequired</code> attribute. 
	 * @param value the newsletterRequired
	 */
	public void setNewsletterRequired(final Boolean value)
	{
		setNewsletterRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.newsletterRequired</code> attribute. 
	 * @param value the newsletterRequired
	 */
	public void setNewsletterRequired(final SessionContext ctx, final boolean value)
	{
		setNewsletterRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.newsletterRequired</code> attribute. 
	 * @param value the newsletterRequired
	 */
	public void setNewsletterRequired(final boolean value)
	{
		setNewsletterRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.website</code> attribute.
	 * @return the website
	 */
	public String getWebsite(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEBSITE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EContactInfo.website</code> attribute.
	 * @return the website
	 */
	public String getWebsite()
	{
		return getWebsite( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.website</code> attribute. 
	 * @param value the website
	 */
	public void setWebsite(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEBSITE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EContactInfo.website</code> attribute. 
	 * @param value the website
	 */
	public void setWebsite(final String value)
	{
		setWebsite( getSession().getSessionContext(), value );
	}
	
}
