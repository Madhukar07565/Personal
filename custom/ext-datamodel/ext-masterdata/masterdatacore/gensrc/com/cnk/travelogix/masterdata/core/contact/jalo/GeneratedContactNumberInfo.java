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
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.contact.jalo.ContactNumberInfo ContactNumberInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedContactNumberInfo extends AbstractContactDetails
{
	/** Qualifier of the <code>ContactNumberInfo.contactType</code> attribute **/
	public static final String CONTACTTYPE = "contactType";
	/** Qualifier of the <code>ContactNumberInfo.medium</code> attribute **/
	public static final String MEDIUM = "medium";
	/** Qualifier of the <code>ContactNumberInfo.contactNumber</code> attribute **/
	public static final String CONTACTNUMBER = "contactNumber";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractContactDetails.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTACTTYPE, AttributeMode.INITIAL);
		tmp.put(MEDIUM, AttributeMode.INITIAL);
		tmp.put(CONTACTNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactNumberInfo.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactNumberInfo.contactNumber</code> attribute.
	 * @return the contactNumber
	 */
	public String getContactNumber()
	{
		return getContactNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactNumberInfo.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactNumberInfo.contactNumber</code> attribute. 
	 * @param value the contactNumber
	 */
	public void setContactNumber(final String value)
	{
		setContactNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactNumberInfo.contactType</code> attribute.
	 * @return the contactType
	 */
	public EnumerationValue getContactType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CONTACTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactNumberInfo.contactType</code> attribute.
	 * @return the contactType
	 */
	public EnumerationValue getContactType()
	{
		return getContactType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactNumberInfo.contactType</code> attribute. 
	 * @param value the contactType
	 */
	public void setContactType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CONTACTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactNumberInfo.contactType</code> attribute. 
	 * @param value the contactType
	 */
	public void setContactType(final EnumerationValue value)
	{
		setContactType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactNumberInfo.medium</code> attribute.
	 * @return the medium
	 */
	public EnumerationValue getMedium(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEDIUM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContactNumberInfo.medium</code> attribute.
	 * @return the medium
	 */
	public EnumerationValue getMedium()
	{
		return getMedium( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactNumberInfo.medium</code> attribute. 
	 * @param value the medium
	 */
	public void setMedium(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEDIUM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContactNumberInfo.medium</code> attribute. 
	 * @param value the medium
	 */
	public void setMedium(final EnumerationValue value)
	{
		setMedium( getSession().getSessionContext(), value );
	}
	
}
