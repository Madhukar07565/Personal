/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.GuideSurchargeDetail GuideSurchargeDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGuideSurchargeDetail extends GenericItem
{
	/** Qualifier of the <code>GuideSurchargeDetail.slabTo</code> attribute **/
	public static final String SLABTO = "slabTo";
	/** Qualifier of the <code>GuideSurchargeDetail.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>GuideSurchargeDetail.specialSkills</code> attribute **/
	public static final String SPECIALSKILLS = "specialSkills";
	/** Qualifier of the <code>GuideSurchargeDetail.slabFrom</code> attribute **/
	public static final String SLABFROM = "slabFrom";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SLABTO, AttributeMode.INITIAL);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(SPECIALSKILLS, AttributeMode.INITIAL);
		tmp.put(SLABFROM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.slabFrom</code> attribute.
	 * @return the slabFrom
	 */
	public Integer getSlabFrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SLABFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.slabFrom</code> attribute.
	 * @return the slabFrom
	 */
	public Integer getSlabFrom()
	{
		return getSlabFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.slabFrom</code> attribute. 
	 * @return the slabFrom
	 */
	public int getSlabFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSlabFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.slabFrom</code> attribute. 
	 * @return the slabFrom
	 */
	public int getSlabFromAsPrimitive()
	{
		return getSlabFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.slabFrom</code> attribute. 
	 * @param value the slabFrom
	 */
	public void setSlabFrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SLABFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.slabFrom</code> attribute. 
	 * @param value the slabFrom
	 */
	public void setSlabFrom(final Integer value)
	{
		setSlabFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.slabFrom</code> attribute. 
	 * @param value the slabFrom
	 */
	public void setSlabFrom(final SessionContext ctx, final int value)
	{
		setSlabFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.slabFrom</code> attribute. 
	 * @param value the slabFrom
	 */
	public void setSlabFrom(final int value)
	{
		setSlabFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.slabTo</code> attribute.
	 * @return the slabTo
	 */
	public Integer getSlabTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SLABTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.slabTo</code> attribute.
	 * @return the slabTo
	 */
	public Integer getSlabTo()
	{
		return getSlabTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.slabTo</code> attribute. 
	 * @return the slabTo
	 */
	public int getSlabToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSlabTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.slabTo</code> attribute. 
	 * @return the slabTo
	 */
	public int getSlabToAsPrimitive()
	{
		return getSlabToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.slabTo</code> attribute. 
	 * @param value the slabTo
	 */
	public void setSlabTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SLABTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.slabTo</code> attribute. 
	 * @param value the slabTo
	 */
	public void setSlabTo(final Integer value)
	{
		setSlabTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.slabTo</code> attribute. 
	 * @param value the slabTo
	 */
	public void setSlabTo(final SessionContext ctx, final int value)
	{
		setSlabTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.slabTo</code> attribute. 
	 * @param value the slabTo
	 */
	public void setSlabTo(final int value)
	{
		setSlabTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.specialSkills</code> attribute.
	 * @return the specialSkills
	 */
	public EnumerationValue getSpecialSkills(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SPECIALSKILLS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GuideSurchargeDetail.specialSkills</code> attribute.
	 * @return the specialSkills
	 */
	public EnumerationValue getSpecialSkills()
	{
		return getSpecialSkills( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.specialSkills</code> attribute. 
	 * @param value the specialSkills
	 */
	public void setSpecialSkills(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SPECIALSKILLS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GuideSurchargeDetail.specialSkills</code> attribute. 
	 * @param value the specialSkills
	 */
	public void setSpecialSkills(final EnumerationValue value)
	{
		setSpecialSkills( getSession().getSessionContext(), value );
	}
	
}
