/**
 *
 */
package com.cnk.travelogix.orgstructure.core.dynamicattribute.handler;

import de.hybris.platform.core.Registry;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;
import de.hybris.platform.servicelayer.user.UserService;


/**
 * Get current User dynamically
 */
public class CurrentUserDynamicAttributeHandler extends AbstractDynamicAttributeHandler<UserModel, ItemModel>
{

	public UserService getUserService()
	{
		return Registry.getApplicationContext().getBean("userService", UserService.class);
	}


	@Override
	public UserModel get(final ItemModel model)
	{
		return getUserService().getCurrentUser();
	}
}
