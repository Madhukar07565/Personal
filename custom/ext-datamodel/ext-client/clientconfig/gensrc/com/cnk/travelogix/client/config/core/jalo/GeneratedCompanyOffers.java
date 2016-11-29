/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.CompanyOffers PolicyCompanyOffers}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyOffers extends GenericItem
{
	/** Qualifier of the <code>PolicyCompanyOffers.includeorExclude</code> attribute **/
	public static final String INCLUDEOREXCLUDE = "includeorExclude";
	/** Qualifier of the <code>PolicyCompanyOffers.offerType</code> attribute **/
	public static final String OFFERTYPE = "offerType";
	/** Qualifier of the <code>PolicyCompanyOffers.offerSubType</code> attribute **/
	public static final String OFFERSUBTYPE = "offerSubType";
	/** Qualifier of the <code>PolicyCompanyOffers.offerSubName</code> attribute **/
	public static final String OFFERSUBNAME = "offerSubName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUDEOREXCLUDE, AttributeMode.INITIAL);
		tmp.put(OFFERTYPE, AttributeMode.INITIAL);
		tmp.put(OFFERSUBTYPE, AttributeMode.INITIAL);
		tmp.put(OFFERSUBNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.includeorExclude</code> attribute.
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public Boolean isIncludeorExclude(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDEOREXCLUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.includeorExclude</code> attribute.
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public Boolean isIncludeorExclude()
	{
		return isIncludeorExclude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public boolean isIncludeorExcludeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncludeorExclude( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public boolean isIncludeorExcludeAsPrimitive()
	{
		return isIncludeorExcludeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDEOREXCLUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final Boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final SessionContext ctx, final boolean value)
	{
		setIncludeorExclude( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.offerSubName</code> attribute.
	 * @return the offerSubName - Company Policy Offer Sub Name
	 */
	public String getOfferSubName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFERSUBNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.offerSubName</code> attribute.
	 * @return the offerSubName - Company Policy Offer Sub Name
	 */
	public String getOfferSubName()
	{
		return getOfferSubName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.offerSubName</code> attribute. 
	 * @param value the offerSubName - Company Policy Offer Sub Name
	 */
	public void setOfferSubName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFERSUBNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.offerSubName</code> attribute. 
	 * @param value the offerSubName - Company Policy Offer Sub Name
	 */
	public void setOfferSubName(final String value)
	{
		setOfferSubName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.offerSubType</code> attribute.
	 * @return the offerSubType - Company Policy Offer Sub Type
	 */
	public EnumerationValue getOfferSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.offerSubType</code> attribute.
	 * @return the offerSubType - Company Policy Offer Sub Type
	 */
	public EnumerationValue getOfferSubType()
	{
		return getOfferSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.offerSubType</code> attribute. 
	 * @param value the offerSubType - Company Policy Offer Sub Type
	 */
	public void setOfferSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.offerSubType</code> attribute. 
	 * @param value the offerSubType - Company Policy Offer Sub Type
	 */
	public void setOfferSubType(final EnumerationValue value)
	{
		setOfferSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.offerType</code> attribute.
	 * @return the offerType - Company Policy Offer Type
	 */
	public EnumerationValue getOfferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PolicyCompanyOffers.offerType</code> attribute.
	 * @return the offerType - Company Policy Offer Type
	 */
	public EnumerationValue getOfferType()
	{
		return getOfferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.offerType</code> attribute. 
	 * @param value the offerType - Company Policy Offer Type
	 */
	public void setOfferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PolicyCompanyOffers.offerType</code> attribute. 
	 * @param value the offerType - Company Policy Offer Type
	 */
	public void setOfferType(final EnumerationValue value)
	{
		setOfferType( getSession().getSessionContext(), value );
	}
	
}
