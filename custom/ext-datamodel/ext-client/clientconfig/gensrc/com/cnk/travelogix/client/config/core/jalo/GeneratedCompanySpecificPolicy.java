/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.CommonPolicyCharges;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.CompanySpecificPolicy CompanySpecificPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanySpecificPolicy extends GenericItem
{
	/** Qualifier of the <code>CompanySpecificPolicy.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	/** Qualifier of the <code>CompanySpecificPolicy.chargesFrom</code> attribute **/
	public static final String CHARGESFROM = "chargesFrom";
	/** Qualifier of the <code>CompanySpecificPolicy.chargesTo</code> attribute **/
	public static final String CHARGESTO = "chargesTo";
	/** Qualifier of the <code>CompanySpecificPolicy.nightCharge</code> attribute **/
	public static final String NIGHTCHARGE = "nightCharge";
	/** Qualifier of the <code>CompanySpecificPolicy.noofNights</code> attribute **/
	public static final String NOOFNIGHTS = "noofNights";
	/** Qualifier of the <code>CompanySpecificPolicy.commonPolicyCharges</code> attribute **/
	public static final String COMMONPOLICYCHARGES = "commonPolicyCharges";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		tmp.put(CHARGESFROM, AttributeMode.INITIAL);
		tmp.put(CHARGESTO, AttributeMode.INITIAL);
		tmp.put(NIGHTCHARGE, AttributeMode.INITIAL);
		tmp.put(NOOFNIGHTS, AttributeMode.INITIAL);
		tmp.put(COMMONPOLICYCHARGES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.appliedOn</code> attribute.
	 * @return the appliedOn - Policy appliedOn
	 */
	public EnumerationValue getAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.appliedOn</code> attribute.
	 * @return the appliedOn - Policy appliedOn
	 */
	public EnumerationValue getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.appliedOn</code> attribute. 
	 * @param value the appliedOn - Policy appliedOn
	 */
	public void setAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.appliedOn</code> attribute. 
	 * @param value the appliedOn - Policy appliedOn
	 */
	public void setAppliedOn(final EnumerationValue value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.chargesFrom</code> attribute.
	 * @return the chargesFrom - Policy Charges From
	 */
	public Integer getChargesFrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CHARGESFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.chargesFrom</code> attribute.
	 * @return the chargesFrom - Policy Charges From
	 */
	public Integer getChargesFrom()
	{
		return getChargesFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.chargesFrom</code> attribute. 
	 * @return the chargesFrom - Policy Charges From
	 */
	public int getChargesFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getChargesFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.chargesFrom</code> attribute. 
	 * @return the chargesFrom - Policy Charges From
	 */
	public int getChargesFromAsPrimitive()
	{
		return getChargesFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.chargesFrom</code> attribute. 
	 * @param value the chargesFrom - Policy Charges From
	 */
	public void setChargesFrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CHARGESFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.chargesFrom</code> attribute. 
	 * @param value the chargesFrom - Policy Charges From
	 */
	public void setChargesFrom(final Integer value)
	{
		setChargesFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.chargesFrom</code> attribute. 
	 * @param value the chargesFrom - Policy Charges From
	 */
	public void setChargesFrom(final SessionContext ctx, final int value)
	{
		setChargesFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.chargesFrom</code> attribute. 
	 * @param value the chargesFrom - Policy Charges From
	 */
	public void setChargesFrom(final int value)
	{
		setChargesFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.chargesTo</code> attribute.
	 * @return the chargesTo - Policy Charges To
	 */
	public Integer getChargesTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, CHARGESTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.chargesTo</code> attribute.
	 * @return the chargesTo - Policy Charges To
	 */
	public Integer getChargesTo()
	{
		return getChargesTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.chargesTo</code> attribute. 
	 * @return the chargesTo - Policy Charges To
	 */
	public int getChargesToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getChargesTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.chargesTo</code> attribute. 
	 * @return the chargesTo - Policy Charges To
	 */
	public int getChargesToAsPrimitive()
	{
		return getChargesToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.chargesTo</code> attribute. 
	 * @param value the chargesTo - Policy Charges To
	 */
	public void setChargesTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, CHARGESTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.chargesTo</code> attribute. 
	 * @param value the chargesTo - Policy Charges To
	 */
	public void setChargesTo(final Integer value)
	{
		setChargesTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.chargesTo</code> attribute. 
	 * @param value the chargesTo - Policy Charges To
	 */
	public void setChargesTo(final SessionContext ctx, final int value)
	{
		setChargesTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.chargesTo</code> attribute. 
	 * @param value the chargesTo - Policy Charges To
	 */
	public void setChargesTo(final int value)
	{
		setChargesTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.commonPolicyCharges</code> attribute.
	 * @return the commonPolicyCharges - Common PolicyCharges
	 */
	public CommonPolicyCharges getCommonPolicyCharges(final SessionContext ctx)
	{
		return (CommonPolicyCharges)getProperty( ctx, COMMONPOLICYCHARGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.commonPolicyCharges</code> attribute.
	 * @return the commonPolicyCharges - Common PolicyCharges
	 */
	public CommonPolicyCharges getCommonPolicyCharges()
	{
		return getCommonPolicyCharges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.commonPolicyCharges</code> attribute. 
	 * @param value the commonPolicyCharges - Common PolicyCharges
	 */
	public void setCommonPolicyCharges(final SessionContext ctx, final CommonPolicyCharges value)
	{
		setProperty(ctx, COMMONPOLICYCHARGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.commonPolicyCharges</code> attribute. 
	 * @param value the commonPolicyCharges - Common PolicyCharges
	 */
	public void setCommonPolicyCharges(final CommonPolicyCharges value)
	{
		setCommonPolicyCharges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.nightCharge</code> attribute.
	 * @return the nightCharge - Policy night Charges
	 */
	public Boolean isNightCharge(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NIGHTCHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.nightCharge</code> attribute.
	 * @return the nightCharge - Policy night Charges
	 */
	public Boolean isNightCharge()
	{
		return isNightCharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.nightCharge</code> attribute. 
	 * @return the nightCharge - Policy night Charges
	 */
	public boolean isNightChargeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNightCharge( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.nightCharge</code> attribute. 
	 * @return the nightCharge - Policy night Charges
	 */
	public boolean isNightChargeAsPrimitive()
	{
		return isNightChargeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.nightCharge</code> attribute. 
	 * @param value the nightCharge - Policy night Charges
	 */
	public void setNightCharge(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NIGHTCHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.nightCharge</code> attribute. 
	 * @param value the nightCharge - Policy night Charges
	 */
	public void setNightCharge(final Boolean value)
	{
		setNightCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.nightCharge</code> attribute. 
	 * @param value the nightCharge - Policy night Charges
	 */
	public void setNightCharge(final SessionContext ctx, final boolean value)
	{
		setNightCharge( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.nightCharge</code> attribute. 
	 * @param value the nightCharge - Policy night Charges
	 */
	public void setNightCharge(final boolean value)
	{
		setNightCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.noofNights</code> attribute.
	 * @return the noofNights - Policy Charges no of Nights
	 */
	public Integer getNoofNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.noofNights</code> attribute.
	 * @return the noofNights - Policy Charges no of Nights
	 */
	public Integer getNoofNights()
	{
		return getNoofNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.noofNights</code> attribute. 
	 * @return the noofNights - Policy Charges no of Nights
	 */
	public int getNoofNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoofNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanySpecificPolicy.noofNights</code> attribute. 
	 * @return the noofNights - Policy Charges no of Nights
	 */
	public int getNoofNightsAsPrimitive()
	{
		return getNoofNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.noofNights</code> attribute. 
	 * @param value the noofNights - Policy Charges no of Nights
	 */
	public void setNoofNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.noofNights</code> attribute. 
	 * @param value the noofNights - Policy Charges no of Nights
	 */
	public void setNoofNights(final Integer value)
	{
		setNoofNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.noofNights</code> attribute. 
	 * @param value the noofNights - Policy Charges no of Nights
	 */
	public void setNoofNights(final SessionContext ctx, final int value)
	{
		setNoofNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanySpecificPolicy.noofNights</code> attribute. 
	 * @param value the noofNights - Policy Charges no of Nights
	 */
	public void setNoofNights(final int value)
	{
		setNoofNights( getSession().getSessionContext(), value );
	}
	
}
