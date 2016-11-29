/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.masterdata.core.policy;

import com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.masterdata.core.policy.FlightsDynamicPolicy FlightsDynamicPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightsDynamicPolicy extends AbstractDynamicPolicy
{
	/** Qualifier of the <code>FlightsDynamicPolicy.fareTypes</code> attribute **/
	public static final String FARETYPES = "fareTypes";
	/** Qualifier of the <code>FlightsDynamicPolicy.perAdult</code> attribute **/
	public static final String PERADULT = "perAdult";
	/** Qualifier of the <code>FlightsDynamicPolicy.perChild</code> attribute **/
	public static final String PERCHILD = "perChild";
	/** Qualifier of the <code>FlightsDynamicPolicy.perInfant</code> attribute **/
	public static final String PERINFANT = "perInfant";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDynamicPolicy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FARETYPES, AttributeMode.INITIAL);
		tmp.put(PERADULT, AttributeMode.INITIAL);
		tmp.put(PERCHILD, AttributeMode.INITIAL);
		tmp.put(PERINFANT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.fareTypes</code> attribute.
	 * @return the fareTypes
	 */
	public String getFareTypes(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFlightsDynamicPolicy.getFareTypes requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, FARETYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.fareTypes</code> attribute.
	 * @return the fareTypes
	 */
	public String getFareTypes()
	{
		return getFareTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.fareTypes</code> attribute. 
	 * @return the localized fareTypes
	 */
	public Map<Language,String> getAllFareTypes(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,FARETYPES,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.fareTypes</code> attribute. 
	 * @return the localized fareTypes
	 */
	public Map<Language,String> getAllFareTypes()
	{
		return getAllFareTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.fareTypes</code> attribute. 
	 * @param value the fareTypes
	 */
	public void setFareTypes(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedFlightsDynamicPolicy.setFareTypes requires a session language", 0 );
		}
		setLocalizedProperty(ctx, FARETYPES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.fareTypes</code> attribute. 
	 * @param value the fareTypes
	 */
	public void setFareTypes(final String value)
	{
		setFareTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.fareTypes</code> attribute. 
	 * @param value the fareTypes
	 */
	public void setAllFareTypes(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,FARETYPES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.fareTypes</code> attribute. 
	 * @param value the fareTypes
	 */
	public void setAllFareTypes(final Map<Language,String> value)
	{
		setAllFareTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perAdult</code> attribute.
	 * @return the perAdult
	 */
	public Boolean isPerAdult(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perAdult</code> attribute.
	 * @return the perAdult
	 */
	public Boolean isPerAdult()
	{
		return isPerAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perAdult</code> attribute. 
	 * @return the perAdult
	 */
	public boolean isPerAdultAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerAdult( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perAdult</code> attribute. 
	 * @return the perAdult
	 */
	public boolean isPerAdultAsPrimitive()
	{
		return isPerAdultAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final Boolean value)
	{
		setPerAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final SessionContext ctx, final boolean value)
	{
		setPerAdult( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final boolean value)
	{
		setPerAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perChild</code> attribute.
	 * @return the perChild
	 */
	public Boolean isPerChild(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perChild</code> attribute.
	 * @return the perChild
	 */
	public Boolean isPerChild()
	{
		return isPerChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perChild</code> attribute. 
	 * @return the perChild
	 */
	public boolean isPerChildAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerChild( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perChild</code> attribute. 
	 * @return the perChild
	 */
	public boolean isPerChildAsPrimitive()
	{
		return isPerChildAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final Boolean value)
	{
		setPerChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final SessionContext ctx, final boolean value)
	{
		setPerChild( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final boolean value)
	{
		setPerChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perInfant</code> attribute.
	 * @return the perInfant
	 */
	public Boolean isPerInfant(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERINFANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perInfant</code> attribute.
	 * @return the perInfant
	 */
	public Boolean isPerInfant()
	{
		return isPerInfant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perInfant</code> attribute. 
	 * @return the perInfant
	 */
	public boolean isPerInfantAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerInfant( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightsDynamicPolicy.perInfant</code> attribute. 
	 * @return the perInfant
	 */
	public boolean isPerInfantAsPrimitive()
	{
		return isPerInfantAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perInfant</code> attribute. 
	 * @param value the perInfant
	 */
	public void setPerInfant(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERINFANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perInfant</code> attribute. 
	 * @param value the perInfant
	 */
	public void setPerInfant(final Boolean value)
	{
		setPerInfant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perInfant</code> attribute. 
	 * @param value the perInfant
	 */
	public void setPerInfant(final SessionContext ctx, final boolean value)
	{
		setPerInfant( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightsDynamicPolicy.perInfant</code> attribute. 
	 * @param value the perInfant
	 */
	public void setPerInfant(final boolean value)
	{
		setPerInfant( getSession().getSessionContext(), value );
	}
	
}
