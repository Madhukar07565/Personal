/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.b2c.services.jalo;

import com.cnk.travelogix.b2c.services.constants.B2cservicesConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>B2cservicesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedB2cservicesManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("tAndC", AttributeMode.INITIAL);
		tmp.put("socialId", AttributeMode.INITIAL);
		tmp.put("socialType", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	@Override
	public String getName()
	{
		return B2cservicesConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.socialId</code> attribute.
	 * @return the socialId
	 */
	public String getSocialId(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, B2cservicesConstants.Attributes.Customer.SOCIALID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.socialId</code> attribute.
	 * @return the socialId
	 */
	public String getSocialId(final Customer item)
	{
		return getSocialId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.socialId</code> attribute. 
	 * @param value the socialId
	 */
	public void setSocialId(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, B2cservicesConstants.Attributes.Customer.SOCIALID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.socialId</code> attribute. 
	 * @param value the socialId
	 */
	public void setSocialId(final Customer item, final String value)
	{
		setSocialId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.socialType</code> attribute.
	 * @return the socialType
	 */
	public EnumerationValue getSocialType(final SessionContext ctx, final Customer item)
	{
		return (EnumerationValue)item.getProperty( ctx, B2cservicesConstants.Attributes.Customer.SOCIALTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.socialType</code> attribute.
	 * @return the socialType
	 */
	public EnumerationValue getSocialType(final Customer item)
	{
		return getSocialType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.socialType</code> attribute. 
	 * @param value the socialType
	 */
	public void setSocialType(final SessionContext ctx, final Customer item, final EnumerationValue value)
	{
		item.setProperty(ctx, B2cservicesConstants.Attributes.Customer.SOCIALTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.socialType</code> attribute. 
	 * @param value the socialType
	 */
	public void setSocialType(final Customer item, final EnumerationValue value)
	{
		setSocialType( getSession().getSessionContext(), item, value );
	}
	
}
