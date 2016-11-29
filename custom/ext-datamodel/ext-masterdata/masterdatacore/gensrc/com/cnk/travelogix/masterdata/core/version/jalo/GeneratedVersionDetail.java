/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.masterdata.core.version.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail VersionDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVersionDetail extends GenericItem
{
	/** Qualifier of the <code>VersionDetail.version</code> attribute **/
	public static final String VERSION = "version";
	/** Qualifier of the <code>VersionDetail.versionDate</code> attribute **/
	public static final String VERSIONDATE = "versionDate";
	/** Qualifier of the <code>VersionDetail.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>VersionDetail.versionRemark</code> attribute **/
	public static final String VERSIONREMARK = "versionRemark";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(VERSION, AttributeMode.INITIAL);
		tmp.put(VERSIONDATE, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(VERSIONREMARK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.type</code> attribute.
	 * @return the type - Version Date
	 */
	public ComposedType getType(final SessionContext ctx)
	{
		return (ComposedType)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.type</code> attribute.
	 * @return the type - Version Date
	 */
	public ComposedType getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.type</code> attribute. 
	 * @param value the type - Version Date
	 */
	protected void setType(final SessionContext ctx, final ComposedType value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+TYPE+"' is not changeable", 0 );
		}
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.type</code> attribute. 
	 * @param value the type - Version Date
	 */
	protected void setType(final ComposedType value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.version</code> attribute.
	 * @return the version - Version
	 */
	public Double getVersion(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.version</code> attribute.
	 * @return the version - Version
	 */
	public Double getVersion()
	{
		return getVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.version</code> attribute. 
	 * @return the version - Version
	 */
	public double getVersionAsPrimitive(final SessionContext ctx)
	{
		Double value = getVersion( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.version</code> attribute. 
	 * @return the version - Version
	 */
	public double getVersionAsPrimitive()
	{
		return getVersionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.version</code> attribute. 
	 * @param value the version - Version
	 */
	public void setVersion(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.version</code> attribute. 
	 * @param value the version - Version
	 */
	public void setVersion(final Double value)
	{
		setVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.version</code> attribute. 
	 * @param value the version - Version
	 */
	public void setVersion(final SessionContext ctx, final double value)
	{
		setVersion( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.version</code> attribute. 
	 * @param value the version - Version
	 */
	public void setVersion(final double value)
	{
		setVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.versionDate</code> attribute.
	 * @return the versionDate - Version Date
	 */
	public Date getVersionDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VERSIONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.versionDate</code> attribute.
	 * @return the versionDate - Version Date
	 */
	public Date getVersionDate()
	{
		return getVersionDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.versionDate</code> attribute. 
	 * @param value the versionDate - Version Date
	 */
	public void setVersionDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VERSIONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.versionDate</code> attribute. 
	 * @param value the versionDate - Version Date
	 */
	public void setVersionDate(final Date value)
	{
		setVersionDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.versionRemark</code> attribute.
	 * @return the versionRemark - Version Remark
	 */
	public String getVersionRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VERSIONREMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VersionDetail.versionRemark</code> attribute.
	 * @return the versionRemark - Version Remark
	 */
	public String getVersionRemark()
	{
		return getVersionRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.versionRemark</code> attribute. 
	 * @param value the versionRemark - Version Remark
	 */
	public void setVersionRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VERSIONREMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VersionDetail.versionRemark</code> attribute. 
	 * @param value the versionRemark - Version Remark
	 */
	public void setVersionRemark(final String value)
	{
		setVersionRemark( getSession().getSessionContext(), value );
	}
	
}
