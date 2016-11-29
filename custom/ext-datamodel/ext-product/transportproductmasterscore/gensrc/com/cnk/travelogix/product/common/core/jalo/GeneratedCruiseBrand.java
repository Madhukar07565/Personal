/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.AbstractCruiseItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.CruiseBrand CruiseBrand}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseBrand extends AbstractCruiseItem
{
	/** Qualifier of the <code>CruiseBrand.cruiseBrandDetails</code> attribute **/
	public static final String CRUISEBRANDDETAILS = "cruiseBrandDetails";
	/** Qualifier of the <code>CruiseBrand.brandName</code> attribute **/
	public static final String BRANDNAME = "brandName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCruiseItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CRUISEBRANDDETAILS, AttributeMode.INITIAL);
		tmp.put(BRANDNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseBrand.brandName</code> attribute.
	 * @return the brandName - Brand Name
	 */
	public String getBrandName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseBrand.brandName</code> attribute.
	 * @return the brandName - Brand Name
	 */
	public String getBrandName()
	{
		return getBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseBrand.brandName</code> attribute. 
	 * @param value the brandName - Brand Name
	 */
	public void setBrandName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseBrand.brandName</code> attribute. 
	 * @param value the brandName - Brand Name
	 */
	public void setBrandName(final String value)
	{
		setBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseBrand.cruiseBrandDetails</code> attribute.
	 * @return the cruiseBrandDetails - Cruise Brands details
	 */
	public String getCruiseBrandDetails(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseBrand.getCruiseBrandDetails requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, CRUISEBRANDDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseBrand.cruiseBrandDetails</code> attribute.
	 * @return the cruiseBrandDetails - Cruise Brands details
	 */
	public String getCruiseBrandDetails()
	{
		return getCruiseBrandDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseBrand.cruiseBrandDetails</code> attribute. 
	 * @return the localized cruiseBrandDetails - Cruise Brands details
	 */
	public Map<Language,String> getAllCruiseBrandDetails(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,CRUISEBRANDDETAILS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseBrand.cruiseBrandDetails</code> attribute. 
	 * @return the localized cruiseBrandDetails - Cruise Brands details
	 */
	public Map<Language,String> getAllCruiseBrandDetails()
	{
		return getAllCruiseBrandDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseBrand.cruiseBrandDetails</code> attribute. 
	 * @param value the cruiseBrandDetails - Cruise Brands details
	 */
	public void setCruiseBrandDetails(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseBrand.setCruiseBrandDetails requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CRUISEBRANDDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseBrand.cruiseBrandDetails</code> attribute. 
	 * @param value the cruiseBrandDetails - Cruise Brands details
	 */
	public void setCruiseBrandDetails(final String value)
	{
		setCruiseBrandDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseBrand.cruiseBrandDetails</code> attribute. 
	 * @param value the cruiseBrandDetails - Cruise Brands details
	 */
	public void setAllCruiseBrandDetails(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,CRUISEBRANDDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseBrand.cruiseBrandDetails</code> attribute. 
	 * @param value the cruiseBrandDetails - Cruise Brands details
	 */
	public void setAllCruiseBrandDetails(final Map<Language,String> value)
	{
		setAllCruiseBrandDetails( getSession().getSessionContext(), value );
	}
	
}
