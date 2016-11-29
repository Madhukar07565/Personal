/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.SlabCompanyCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.SignUpBonusCompanyCommercial SignUpBonusCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSignUpBonusCompanyCommercial extends AbstractCompanyCommercial
{
	/** Qualifier of the <code>SignUpBonusCompanyCommercial.slab</code> attribute **/
	public static final String SLAB = "slab";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SLAB, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignUpBonusCompanyCommercial.slab</code> attribute.
	 * @return the slab
	 */
	public SlabCompanyCommercial getSlab(final SessionContext ctx)
	{
		return (SlabCompanyCommercial)getProperty( ctx, SLAB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignUpBonusCompanyCommercial.slab</code> attribute.
	 * @return the slab
	 */
	public SlabCompanyCommercial getSlab()
	{
		return getSlab( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignUpBonusCompanyCommercial.slab</code> attribute. 
	 * @param value the slab
	 */
	public void setSlab(final SessionContext ctx, final SlabCompanyCommercial value)
	{
		setProperty(ctx, SLAB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignUpBonusCompanyCommercial.slab</code> attribute. 
	 * @param value the slab
	 */
	public void setSlab(final SlabCompanyCommercial value)
	{
		setSlab( getSession().getSessionContext(), value );
	}
	
}
