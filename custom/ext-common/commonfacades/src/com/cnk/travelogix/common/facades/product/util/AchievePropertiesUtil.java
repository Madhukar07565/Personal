/**
 *
 */
package com.cnk.travelogix.common.facades.product.util;

import de.hybris.platform.util.Config;



/**
 * @author i313890
 *
 */
public class AchievePropertiesUtil
{
	public static String getProperties(final String name)
	{
		return Config.getParameter(name);
	}
}
