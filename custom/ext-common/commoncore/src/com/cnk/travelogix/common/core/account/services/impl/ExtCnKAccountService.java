/**
 *
 */
package com.cnk.travelogix.common.core.account.services.impl;

import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.store.services.BaseStoreService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.cnk.travelogix.client.config.core.login.model.LoginConfigModel;
import com.cnk.travelogix.client.core.clienttype.model.TravelogixClientTypeModel;
import com.cnk.travelogix.common.core.account.services.CnKAccountService;


/**
 * @author i322561
 *
 */
public class ExtCnKAccountService implements CnKAccountService
{
	private static final String LOGINCONFIG_QUERY = "select {pk} from {" + LoginConfigModel._TYPECODE + "} where {"
			+ LoginConfigModel.ENTITYNAME + "} =?clientType";

	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;
	@Resource(name = "baseStoreService")
	private BaseStoreService baseStoreService;

	@Override
	public LoginConfigModel getLoginConfig()
	{
		final TravelogixClientTypeModel travelogixClientType = baseStoreService.getCurrentBaseStore().getTravelogixClientType();

		if (travelogixClientType != null)
		{
			final Map<String, String> queryParams = new HashMap<String, String>();
			queryParams.put("clientType", travelogixClientType.getPk().getLongValueAsString());
			final List<LoginConfigModel> loginConfig = flexibleSearchService
					.<LoginConfigModel> search(LOGINCONFIG_QUERY, queryParams).getResult();
			if (loginConfig != null && loginConfig.size() != 0)
			{
				return loginConfig.get(0);
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}
}
