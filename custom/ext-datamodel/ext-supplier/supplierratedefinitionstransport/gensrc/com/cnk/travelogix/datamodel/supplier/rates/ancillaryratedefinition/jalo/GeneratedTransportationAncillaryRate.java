/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AbstractAncillaryRateDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.TransportationAncillaryRate TransportationAncillaryRate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationAncillaryRate extends AbstractAncillaryRateDetail
{
	/** Qualifier of the <code>TransportationAncillaryRate.ancillaryCategory</code> attribute **/
	public static final String ANCILLARYCATEGORY = "ancillaryCategory";
	/** Qualifier of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute **/
	public static final String MINIMUMDAYSFROM = "minimumDaysFrom";
	/** Qualifier of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute **/
	public static final String MINIMUMDAYSTO = "minimumDaysTo";
	/** Qualifier of the <code>TransportationAncillaryRate.minimumHoursFrom</code> attribute **/
	public static final String MINIMUMHOURSFROM = "minimumHoursFrom";
	/** Qualifier of the <code>TransportationAncillaryRate.rateCalculationCriteria</code> attribute **/
	public static final String RATECALCULATIONCRITERIA = "rateCalculationCriteria";
	/** Qualifier of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute **/
	public static final String EXTRADAYPRICE = "extraDayPrice";
	/** Qualifier of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute **/
	public static final String CUSTOMERLIABILITIES = "customerLiabilities";
	/** Qualifier of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute **/
	public static final String WAIVEDCUSTOMERLIABILITIES = "waivedCustomerLiabilities";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAncillaryRateDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ANCILLARYCATEGORY, AttributeMode.INITIAL);
		tmp.put(MINIMUMDAYSFROM, AttributeMode.INITIAL);
		tmp.put(MINIMUMDAYSTO, AttributeMode.INITIAL);
		tmp.put(MINIMUMHOURSFROM, AttributeMode.INITIAL);
		tmp.put(RATECALCULATIONCRITERIA, AttributeMode.INITIAL);
		tmp.put(EXTRADAYPRICE, AttributeMode.INITIAL);
		tmp.put(CUSTOMERLIABILITIES, AttributeMode.INITIAL);
		tmp.put(WAIVEDCUSTOMERLIABILITIES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.ancillaryCategory</code> attribute.
	 * @return the ancillaryCategory
	 */
	public EnumerationValue getAncillaryCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ANCILLARYCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.ancillaryCategory</code> attribute.
	 * @return the ancillaryCategory
	 */
	public EnumerationValue getAncillaryCategory()
	{
		return getAncillaryCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.ancillaryCategory</code> attribute. 
	 * @param value the ancillaryCategory
	 */
	public void setAncillaryCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ANCILLARYCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.ancillaryCategory</code> attribute. 
	 * @param value the ancillaryCategory
	 */
	public void setAncillaryCategory(final EnumerationValue value)
	{
		setAncillaryCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute.
	 * @return the customerLiabilities
	 */
	public Integer getCustomerLiabilities(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTransportationAncillaryRate.getCustomerLiabilities requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, CUSTOMERLIABILITIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute.
	 * @return the customerLiabilities
	 */
	public Integer getCustomerLiabilities()
	{
		return getCustomerLiabilities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @return the customerLiabilities
	 */
	public int getCustomerLiabilitiesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCustomerLiabilities( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @return the customerLiabilities
	 */
	public int getCustomerLiabilitiesAsPrimitive()
	{
		return getCustomerLiabilitiesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @return the localized customerLiabilities
	 */
	public Map<Language,Integer> getAllCustomerLiabilities(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,CUSTOMERLIABILITIES,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @return the localized customerLiabilities
	 */
	public Map<Language,Integer> getAllCustomerLiabilities()
	{
		return getAllCustomerLiabilities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @param value the customerLiabilities
	 */
	public void setCustomerLiabilities(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTransportationAncillaryRate.setCustomerLiabilities requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CUSTOMERLIABILITIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @param value the customerLiabilities
	 */
	public void setCustomerLiabilities(final Integer value)
	{
		setCustomerLiabilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @param value the customerLiabilities
	 */
	public void setCustomerLiabilities(final SessionContext ctx, final int value)
	{
		setCustomerLiabilities( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @param value the customerLiabilities
	 */
	public void setCustomerLiabilities(final int value)
	{
		setCustomerLiabilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @param value the customerLiabilities
	 */
	public void setAllCustomerLiabilities(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,CUSTOMERLIABILITIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.customerLiabilities</code> attribute. 
	 * @param value the customerLiabilities
	 */
	public void setAllCustomerLiabilities(final Map<Language,Integer> value)
	{
		setAllCustomerLiabilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute.
	 * @return the extraDayPrice
	 */
	public Double getExtraDayPrice(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, EXTRADAYPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute.
	 * @return the extraDayPrice
	 */
	public Double getExtraDayPrice()
	{
		return getExtraDayPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute. 
	 * @return the extraDayPrice
	 */
	public double getExtraDayPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getExtraDayPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute. 
	 * @return the extraDayPrice
	 */
	public double getExtraDayPriceAsPrimitive()
	{
		return getExtraDayPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute. 
	 * @param value the extraDayPrice
	 */
	public void setExtraDayPrice(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, EXTRADAYPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute. 
	 * @param value the extraDayPrice
	 */
	public void setExtraDayPrice(final Double value)
	{
		setExtraDayPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute. 
	 * @param value the extraDayPrice
	 */
	public void setExtraDayPrice(final SessionContext ctx, final double value)
	{
		setExtraDayPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.extraDayPrice</code> attribute. 
	 * @param value the extraDayPrice
	 */
	public void setExtraDayPrice(final double value)
	{
		setExtraDayPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute.
	 * @return the minimumDaysFrom
	 */
	public Integer getMinimumDaysFrom(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTransportationAncillaryRate.getMinimumDaysFrom requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, MINIMUMDAYSFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute.
	 * @return the minimumDaysFrom
	 */
	public Integer getMinimumDaysFrom()
	{
		return getMinimumDaysFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @return the minimumDaysFrom
	 */
	public int getMinimumDaysFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumDaysFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @return the minimumDaysFrom
	 */
	public int getMinimumDaysFromAsPrimitive()
	{
		return getMinimumDaysFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @return the localized minimumDaysFrom
	 */
	public Map<Language,Integer> getAllMinimumDaysFrom(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,MINIMUMDAYSFROM,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @return the localized minimumDaysFrom
	 */
	public Map<Language,Integer> getAllMinimumDaysFrom()
	{
		return getAllMinimumDaysFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @param value the minimumDaysFrom
	 */
	public void setMinimumDaysFrom(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTransportationAncillaryRate.setMinimumDaysFrom requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MINIMUMDAYSFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @param value the minimumDaysFrom
	 */
	public void setMinimumDaysFrom(final Integer value)
	{
		setMinimumDaysFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @param value the minimumDaysFrom
	 */
	public void setMinimumDaysFrom(final SessionContext ctx, final int value)
	{
		setMinimumDaysFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @param value the minimumDaysFrom
	 */
	public void setMinimumDaysFrom(final int value)
	{
		setMinimumDaysFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @param value the minimumDaysFrom
	 */
	public void setAllMinimumDaysFrom(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,MINIMUMDAYSFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysFrom</code> attribute. 
	 * @param value the minimumDaysFrom
	 */
	public void setAllMinimumDaysFrom(final Map<Language,Integer> value)
	{
		setAllMinimumDaysFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute.
	 * @return the minimumDaysTo
	 */
	public Integer getMinimumDaysTo(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTransportationAncillaryRate.getMinimumDaysTo requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, MINIMUMDAYSTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute.
	 * @return the minimumDaysTo
	 */
	public Integer getMinimumDaysTo()
	{
		return getMinimumDaysTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @return the minimumDaysTo
	 */
	public int getMinimumDaysToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinimumDaysTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @return the minimumDaysTo
	 */
	public int getMinimumDaysToAsPrimitive()
	{
		return getMinimumDaysToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @return the localized minimumDaysTo
	 */
	public Map<Language,Integer> getAllMinimumDaysTo(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,MINIMUMDAYSTO,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @return the localized minimumDaysTo
	 */
	public Map<Language,Integer> getAllMinimumDaysTo()
	{
		return getAllMinimumDaysTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setMinimumDaysTo(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTransportationAncillaryRate.setMinimumDaysTo requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MINIMUMDAYSTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setMinimumDaysTo(final Integer value)
	{
		setMinimumDaysTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setMinimumDaysTo(final SessionContext ctx, final int value)
	{
		setMinimumDaysTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setMinimumDaysTo(final int value)
	{
		setMinimumDaysTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setAllMinimumDaysTo(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,MINIMUMDAYSTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumDaysTo</code> attribute. 
	 * @param value the minimumDaysTo
	 */
	public void setAllMinimumDaysTo(final Map<Language,Integer> value)
	{
		setAllMinimumDaysTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumHoursFrom</code> attribute.
	 * @return the minimumHoursFrom
	 */
	public Date getMinimumHoursFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, MINIMUMHOURSFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.minimumHoursFrom</code> attribute.
	 * @return the minimumHoursFrom
	 */
	public Date getMinimumHoursFrom()
	{
		return getMinimumHoursFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumHoursFrom</code> attribute. 
	 * @param value the minimumHoursFrom
	 */
	public void setMinimumHoursFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, MINIMUMHOURSFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.minimumHoursFrom</code> attribute. 
	 * @param value the minimumHoursFrom
	 */
	public void setMinimumHoursFrom(final Date value)
	{
		setMinimumHoursFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.rateCalculationCriteria</code> attribute.
	 * @return the rateCalculationCriteria
	 */
	public EnumerationValue getRateCalculationCriteria(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATECALCULATIONCRITERIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.rateCalculationCriteria</code> attribute.
	 * @return the rateCalculationCriteria
	 */
	public EnumerationValue getRateCalculationCriteria()
	{
		return getRateCalculationCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.rateCalculationCriteria</code> attribute. 
	 * @param value the rateCalculationCriteria
	 */
	public void setRateCalculationCriteria(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATECALCULATIONCRITERIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.rateCalculationCriteria</code> attribute. 
	 * @param value the rateCalculationCriteria
	 */
	public void setRateCalculationCriteria(final EnumerationValue value)
	{
		setRateCalculationCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute.
	 * @return the waivedCustomerLiabilities
	 */
	public Integer getWaivedCustomerLiabilities(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTransportationAncillaryRate.getWaivedCustomerLiabilities requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, WAIVEDCUSTOMERLIABILITIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute.
	 * @return the waivedCustomerLiabilities
	 */
	public Integer getWaivedCustomerLiabilities()
	{
		return getWaivedCustomerLiabilities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @return the waivedCustomerLiabilities
	 */
	public int getWaivedCustomerLiabilitiesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getWaivedCustomerLiabilities( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @return the waivedCustomerLiabilities
	 */
	public int getWaivedCustomerLiabilitiesAsPrimitive()
	{
		return getWaivedCustomerLiabilitiesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @return the localized waivedCustomerLiabilities
	 */
	public Map<Language,Integer> getAllWaivedCustomerLiabilities(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,WAIVEDCUSTOMERLIABILITIES,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @return the localized waivedCustomerLiabilities
	 */
	public Map<Language,Integer> getAllWaivedCustomerLiabilities()
	{
		return getAllWaivedCustomerLiabilities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @param value the waivedCustomerLiabilities
	 */
	public void setWaivedCustomerLiabilities(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTransportationAncillaryRate.setWaivedCustomerLiabilities requires a session language", 0 );
		}
		setLocalizedProperty(ctx, WAIVEDCUSTOMERLIABILITIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @param value the waivedCustomerLiabilities
	 */
	public void setWaivedCustomerLiabilities(final Integer value)
	{
		setWaivedCustomerLiabilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @param value the waivedCustomerLiabilities
	 */
	public void setWaivedCustomerLiabilities(final SessionContext ctx, final int value)
	{
		setWaivedCustomerLiabilities( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @param value the waivedCustomerLiabilities
	 */
	public void setWaivedCustomerLiabilities(final int value)
	{
		setWaivedCustomerLiabilities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @param value the waivedCustomerLiabilities
	 */
	public void setAllWaivedCustomerLiabilities(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,WAIVEDCUSTOMERLIABILITIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationAncillaryRate.waivedCustomerLiabilities</code> attribute. 
	 * @param value the waivedCustomerLiabilities
	 */
	public void setAllWaivedCustomerLiabilities(final Map<Language,Integer> value)
	{
		setAllWaivedCustomerLiabilities( getSession().getSessionContext(), value );
	}
	
}
