/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRateAdvDefinition ActivityRateAdvDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityRateAdvDefinition extends AbstractRateAdvDefinition
{
	/** Qualifier of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute **/
	public static final String VOUCHERINFORMATION = "voucherInformation";
	/** Qualifier of the <code>ActivityRateAdvDefinition.operatorName</code> attribute **/
	public static final String OPERATORNAME = "operatorName";
	/** Qualifier of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute **/
	public static final String OPERATORDETAILS = "operatorDetails";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateAdvDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VOUCHERINFORMATION, AttributeMode.INITIAL);
		tmp.put(OPERATORNAME, AttributeMode.INITIAL);
		tmp.put(OPERATORDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute.
	 * @return the operatorDetails
	 */
	public String getOperatorDetails(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityRateAdvDefinition.getOperatorDetails requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, OPERATORDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute.
	 * @return the operatorDetails
	 */
	public String getOperatorDetails()
	{
		return getOperatorDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute. 
	 * @return the localized operatorDetails
	 */
	public Map<Language,String> getAllOperatorDetails(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,OPERATORDETAILS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute. 
	 * @return the localized operatorDetails
	 */
	public Map<Language,String> getAllOperatorDetails()
	{
		return getAllOperatorDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute. 
	 * @param value the operatorDetails
	 */
	public void setOperatorDetails(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityRateAdvDefinition.setOperatorDetails requires a session language", 0 );
		}
		setLocalizedProperty(ctx, OPERATORDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute. 
	 * @param value the operatorDetails
	 */
	public void setOperatorDetails(final String value)
	{
		setOperatorDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute. 
	 * @param value the operatorDetails
	 */
	public void setAllOperatorDetails(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,OPERATORDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.operatorDetails</code> attribute. 
	 * @param value the operatorDetails
	 */
	public void setAllOperatorDetails(final Map<Language,String> value)
	{
		setAllOperatorDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.operatorName</code> attribute.
	 * @return the operatorName
	 */
	public EnumerationValue getOperatorName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OPERATORNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.operatorName</code> attribute.
	 * @return the operatorName
	 */
	public EnumerationValue getOperatorName()
	{
		return getOperatorName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.operatorName</code> attribute. 
	 * @param value the operatorName
	 */
	public void setOperatorName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OPERATORNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.operatorName</code> attribute. 
	 * @param value the operatorName
	 */
	public void setOperatorName(final EnumerationValue value)
	{
		setOperatorName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute.
	 * @return the voucherInformation
	 */
	public String getVoucherInformation(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityRateAdvDefinition.getVoucherInformation requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VOUCHERINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute.
	 * @return the voucherInformation
	 */
	public String getVoucherInformation()
	{
		return getVoucherInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute. 
	 * @return the localized voucherInformation
	 */
	public Map<Language,String> getAllVoucherInformation(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VOUCHERINFORMATION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute. 
	 * @return the localized voucherInformation
	 */
	public Map<Language,String> getAllVoucherInformation()
	{
		return getAllVoucherInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute. 
	 * @param value the voucherInformation
	 */
	public void setVoucherInformation(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedActivityRateAdvDefinition.setVoucherInformation requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VOUCHERINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute. 
	 * @param value the voucherInformation
	 */
	public void setVoucherInformation(final String value)
	{
		setVoucherInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute. 
	 * @param value the voucherInformation
	 */
	public void setAllVoucherInformation(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VOUCHERINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityRateAdvDefinition.voucherInformation</code> attribute. 
	 * @param value the voucherInformation
	 */
	public void setAllVoucherInformation(final Map<Language,String> value)
	{
		setAllVoucherInformation( getSession().getSessionContext(), value );
	}
	
}
