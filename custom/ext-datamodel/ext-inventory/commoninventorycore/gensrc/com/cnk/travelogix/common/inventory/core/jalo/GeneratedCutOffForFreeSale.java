/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.CutOffForFreeSale CutOffForFreeSale}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCutOffForFreeSale extends GenericItem
{
	/** Qualifier of the <code>CutOffForFreeSale.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>CutOffForFreeSale.releaseDayOrHrs</code> attribute **/
	public static final String RELEASEDAYORHRS = "releaseDayOrHrs";
	/** Qualifier of the <code>CutOffForFreeSale.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(RELEASEDAYORHRS, AttributeMode.INITIAL);
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffForFreeSale.appliedOn</code> attribute.
	 * @return the appliedOn - Applied On.
	 */
	public EnumerationValue getAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffForFreeSale.appliedOn</code> attribute.
	 * @return the appliedOn - Applied On.
	 */
	public EnumerationValue getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffForFreeSale.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied On.
	 */
	public void setAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffForFreeSale.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied On.
	 */
	public void setAppliedOn(final EnumerationValue value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffForFreeSale.definedBy</code> attribute.
	 * @return the definedBy - Defined By
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffForFreeSale.definedBy</code> attribute.
	 * @return the definedBy - Defined By
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffForFreeSale.definedBy</code> attribute. 
	 * @param value the definedBy - Defined By
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffForFreeSale.definedBy</code> attribute. 
	 * @param value the definedBy - Defined By
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffForFreeSale.releaseDayOrHrs</code> attribute.
	 * @return the releaseDayOrHrs - Release Day Or Hrs
	 */
	public String getReleaseDayOrHrs(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RELEASEDAYORHRS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CutOffForFreeSale.releaseDayOrHrs</code> attribute.
	 * @return the releaseDayOrHrs - Release Day Or Hrs
	 */
	public String getReleaseDayOrHrs()
	{
		return getReleaseDayOrHrs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffForFreeSale.releaseDayOrHrs</code> attribute. 
	 * @param value the releaseDayOrHrs - Release Day Or Hrs
	 */
	public void setReleaseDayOrHrs(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RELEASEDAYORHRS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CutOffForFreeSale.releaseDayOrHrs</code> attribute. 
	 * @param value the releaseDayOrHrs - Release Day Or Hrs
	 */
	public void setReleaseDayOrHrs(final String value)
	{
		setReleaseDayOrHrs( getSession().getSessionContext(), value );
	}
	
}
