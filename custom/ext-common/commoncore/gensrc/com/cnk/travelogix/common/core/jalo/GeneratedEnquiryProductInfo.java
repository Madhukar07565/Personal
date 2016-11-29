/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.BaseEnquiryProductSpecific;
import com.cnk.travelogix.common.core.jalo.UserJourneyProductInfo;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem EnquiryProductInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEnquiryProductInfo extends UserJourneyProductInfo
{
	/** Qualifier of the <code>EnquiryProductInfo.productSpecific</code> attribute **/
	public static final String PRODUCTSPECIFIC = "productSpecific";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(UserJourneyProductInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTSPECIFIC, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductInfo.productSpecific</code> attribute.
	 * @return the productSpecific
	 */
	public BaseEnquiryProductSpecific getProductSpecific(final SessionContext ctx)
	{
		return (BaseEnquiryProductSpecific)getProperty( ctx, PRODUCTSPECIFIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EnquiryProductInfo.productSpecific</code> attribute.
	 * @return the productSpecific
	 */
	public BaseEnquiryProductSpecific getProductSpecific()
	{
		return getProductSpecific( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductInfo.productSpecific</code> attribute. 
	 * @param value the productSpecific
	 */
	public void setProductSpecific(final SessionContext ctx, final BaseEnquiryProductSpecific value)
	{
		new PartOfHandler<BaseEnquiryProductSpecific>()
		{
			@Override
			protected BaseEnquiryProductSpecific doGetValue(final SessionContext ctx)
			{
				return getProductSpecific( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final BaseEnquiryProductSpecific _value)
			{
				final BaseEnquiryProductSpecific value = _value;
				setProperty(ctx, PRODUCTSPECIFIC,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EnquiryProductInfo.productSpecific</code> attribute. 
	 * @param value the productSpecific
	 */
	public void setProductSpecific(final BaseEnquiryProductSpecific value)
	{
		setProductSpecific( getSession().getSessionContext(), value );
	}
	
}
