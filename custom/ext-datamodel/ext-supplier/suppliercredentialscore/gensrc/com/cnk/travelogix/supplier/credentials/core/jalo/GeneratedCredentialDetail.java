/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.credentials.core.jalo;

import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.credentials.core.jalo.CredentialDetail CredentialDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCredentialDetail extends GenericItem
{
	/** Qualifier of the <code>CredentialDetail.credentials</code> attribute **/
	public static final String CREDENTIALS = "credentials";
	/** Qualifier of the <code>CredentialDetail.totalNumberOfConnection</code> attribute **/
	public static final String TOTALNUMBEROFCONNECTION = "totalNumberOfConnection";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CREDENTIALS, AttributeMode.INITIAL);
		tmp.put(TOTALNUMBEROFCONNECTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CredentialDetail.credentials</code> attribute.
	 * @return the credentials
	 */
	public Map<EnumerationValue,String> getAllCredentials(final SessionContext ctx)
	{
		Map<EnumerationValue,String> map = (Map<EnumerationValue,String>)getProperty( ctx, CREDENTIALS);
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CredentialDetail.credentials</code> attribute.
	 * @return the credentials
	 */
	public Map<EnumerationValue,String> getAllCredentials()
	{
		return getAllCredentials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CredentialDetail.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setAllCredentials(final SessionContext ctx, final Map<EnumerationValue,String> value)
	{
		setProperty(ctx, CREDENTIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CredentialDetail.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setAllCredentials(final Map<EnumerationValue,String> value)
	{
		setAllCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CredentialDetail.totalNumberOfConnection</code> attribute.
	 * @return the totalNumberOfConnection
	 */
	public Integer getTotalNumberOfConnection(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTALNUMBEROFCONNECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CredentialDetail.totalNumberOfConnection</code> attribute.
	 * @return the totalNumberOfConnection
	 */
	public Integer getTotalNumberOfConnection()
	{
		return getTotalNumberOfConnection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CredentialDetail.totalNumberOfConnection</code> attribute. 
	 * @return the totalNumberOfConnection
	 */
	public int getTotalNumberOfConnectionAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotalNumberOfConnection( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CredentialDetail.totalNumberOfConnection</code> attribute. 
	 * @return the totalNumberOfConnection
	 */
	public int getTotalNumberOfConnectionAsPrimitive()
	{
		return getTotalNumberOfConnectionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CredentialDetail.totalNumberOfConnection</code> attribute. 
	 * @param value the totalNumberOfConnection
	 */
	public void setTotalNumberOfConnection(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTALNUMBEROFCONNECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CredentialDetail.totalNumberOfConnection</code> attribute. 
	 * @param value the totalNumberOfConnection
	 */
	public void setTotalNumberOfConnection(final Integer value)
	{
		setTotalNumberOfConnection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CredentialDetail.totalNumberOfConnection</code> attribute. 
	 * @param value the totalNumberOfConnection
	 */
	public void setTotalNumberOfConnection(final SessionContext ctx, final int value)
	{
		setTotalNumberOfConnection( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CredentialDetail.totalNumberOfConnection</code> attribute. 
	 * @param value the totalNumberOfConnection
	 */
	public void setTotalNumberOfConnection(final int value)
	{
		setTotalNumberOfConnection( getSession().getSessionContext(), value );
	}
	
}
