/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.timelimit.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitExpiryDetails TimeLimitExpiryDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTimeLimitExpiryDetails extends AbstractTravelogixItem
{
	/** Qualifier of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute **/
	public static final String TIMELIMITCUTOFFVALUE = "timeLimitCutoffValue";
	/** Qualifier of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute **/
	public static final String TIMELIMITSETFOR = "timeLimitSetFor";
	/** Qualifier of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute **/
	public static final String RECONFORMATIONSETFOR = "reconformationSetFor";
	/** Qualifier of the <code>TimeLimitExpiryDetails.timeLimitCutOffInterval</code> attribute **/
	public static final String TIMELIMITCUTOFFINTERVAL = "timeLimitCutOffInterval";
	/** Qualifier of the <code>TimeLimitExpiryDetails.timeLimitSetForInterval</code> attribute **/
	public static final String TIMELIMITSETFORINTERVAL = "timeLimitSetForInterval";
	/** Qualifier of the <code>TimeLimitExpiryDetails.reconfirmationInterval</code> attribute **/
	public static final String RECONFIRMATIONINTERVAL = "reconfirmationInterval";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TIMELIMITCUTOFFVALUE, AttributeMode.INITIAL);
		tmp.put(TIMELIMITSETFOR, AttributeMode.INITIAL);
		tmp.put(RECONFORMATIONSETFOR, AttributeMode.INITIAL);
		tmp.put(TIMELIMITCUTOFFINTERVAL, AttributeMode.INITIAL);
		tmp.put(TIMELIMITSETFORINTERVAL, AttributeMode.INITIAL);
		tmp.put(RECONFIRMATIONINTERVAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.reconfirmationInterval</code> attribute.
	 * @return the reconfirmationInterval
	 */
	public EnumerationValue getReconfirmationInterval(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RECONFIRMATIONINTERVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.reconfirmationInterval</code> attribute.
	 * @return the reconfirmationInterval
	 */
	public EnumerationValue getReconfirmationInterval()
	{
		return getReconfirmationInterval( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.reconfirmationInterval</code> attribute. 
	 * @param value the reconfirmationInterval
	 */
	public void setReconfirmationInterval(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RECONFIRMATIONINTERVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.reconfirmationInterval</code> attribute. 
	 * @param value the reconfirmationInterval
	 */
	public void setReconfirmationInterval(final EnumerationValue value)
	{
		setReconfirmationInterval( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute.
	 * @return the reconformationSetFor
	 */
	public Integer getReconformationSetFor(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RECONFORMATIONSETFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute.
	 * @return the reconformationSetFor
	 */
	public Integer getReconformationSetFor()
	{
		return getReconformationSetFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute. 
	 * @return the reconformationSetFor
	 */
	public int getReconformationSetForAsPrimitive(final SessionContext ctx)
	{
		Integer value = getReconformationSetFor( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute. 
	 * @return the reconformationSetFor
	 */
	public int getReconformationSetForAsPrimitive()
	{
		return getReconformationSetForAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute. 
	 * @param value the reconformationSetFor
	 */
	public void setReconformationSetFor(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RECONFORMATIONSETFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute. 
	 * @param value the reconformationSetFor
	 */
	public void setReconformationSetFor(final Integer value)
	{
		setReconformationSetFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute. 
	 * @param value the reconformationSetFor
	 */
	public void setReconformationSetFor(final SessionContext ctx, final int value)
	{
		setReconformationSetFor( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.reconformationSetFor</code> attribute. 
	 * @param value the reconformationSetFor
	 */
	public void setReconformationSetFor(final int value)
	{
		setReconformationSetFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitCutOffInterval</code> attribute.
	 * @return the timeLimitCutOffInterval
	 */
	public EnumerationValue getTimeLimitCutOffInterval(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TIMELIMITCUTOFFINTERVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitCutOffInterval</code> attribute.
	 * @return the timeLimitCutOffInterval
	 */
	public EnumerationValue getTimeLimitCutOffInterval()
	{
		return getTimeLimitCutOffInterval( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitCutOffInterval</code> attribute. 
	 * @param value the timeLimitCutOffInterval
	 */
	public void setTimeLimitCutOffInterval(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TIMELIMITCUTOFFINTERVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitCutOffInterval</code> attribute. 
	 * @param value the timeLimitCutOffInterval
	 */
	public void setTimeLimitCutOffInterval(final EnumerationValue value)
	{
		setTimeLimitCutOffInterval( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute.
	 * @return the timeLimitCutoffValue
	 */
	public Integer getTimeLimitCutoffValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIMELIMITCUTOFFVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute.
	 * @return the timeLimitCutoffValue
	 */
	public Integer getTimeLimitCutoffValue()
	{
		return getTimeLimitCutoffValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute. 
	 * @return the timeLimitCutoffValue
	 */
	public int getTimeLimitCutoffValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTimeLimitCutoffValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute. 
	 * @return the timeLimitCutoffValue
	 */
	public int getTimeLimitCutoffValueAsPrimitive()
	{
		return getTimeLimitCutoffValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute. 
	 * @param value the timeLimitCutoffValue
	 */
	public void setTimeLimitCutoffValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIMELIMITCUTOFFVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute. 
	 * @param value the timeLimitCutoffValue
	 */
	public void setTimeLimitCutoffValue(final Integer value)
	{
		setTimeLimitCutoffValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute. 
	 * @param value the timeLimitCutoffValue
	 */
	public void setTimeLimitCutoffValue(final SessionContext ctx, final int value)
	{
		setTimeLimitCutoffValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitCutoffValue</code> attribute. 
	 * @param value the timeLimitCutoffValue
	 */
	public void setTimeLimitCutoffValue(final int value)
	{
		setTimeLimitCutoffValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute.
	 * @return the timeLimitSetFor
	 */
	public Integer getTimeLimitSetFor(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TIMELIMITSETFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute.
	 * @return the timeLimitSetFor
	 */
	public Integer getTimeLimitSetFor()
	{
		return getTimeLimitSetFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute. 
	 * @return the timeLimitSetFor
	 */
	public int getTimeLimitSetForAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTimeLimitSetFor( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute. 
	 * @return the timeLimitSetFor
	 */
	public int getTimeLimitSetForAsPrimitive()
	{
		return getTimeLimitSetForAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute. 
	 * @param value the timeLimitSetFor
	 */
	public void setTimeLimitSetFor(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TIMELIMITSETFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute. 
	 * @param value the timeLimitSetFor
	 */
	public void setTimeLimitSetFor(final Integer value)
	{
		setTimeLimitSetFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute. 
	 * @param value the timeLimitSetFor
	 */
	public void setTimeLimitSetFor(final SessionContext ctx, final int value)
	{
		setTimeLimitSetFor( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitSetFor</code> attribute. 
	 * @param value the timeLimitSetFor
	 */
	public void setTimeLimitSetFor(final int value)
	{
		setTimeLimitSetFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitSetForInterval</code> attribute.
	 * @return the timeLimitSetForInterval
	 */
	public EnumerationValue getTimeLimitSetForInterval(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TIMELIMITSETFORINTERVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitExpiryDetails.timeLimitSetForInterval</code> attribute.
	 * @return the timeLimitSetForInterval
	 */
	public EnumerationValue getTimeLimitSetForInterval()
	{
		return getTimeLimitSetForInterval( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitSetForInterval</code> attribute. 
	 * @param value the timeLimitSetForInterval
	 */
	public void setTimeLimitSetForInterval(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TIMELIMITSETFORINTERVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitExpiryDetails.timeLimitSetForInterval</code> attribute. 
	 * @param value the timeLimitSetForInterval
	 */
	public void setTimeLimitSetForInterval(final EnumerationValue value)
	{
		setTimeLimitSetForInterval( getSession().getSessionContext(), value );
	}
	
}
