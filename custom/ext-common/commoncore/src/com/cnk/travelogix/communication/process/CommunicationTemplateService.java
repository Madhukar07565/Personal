package com.cnk.travelogix.communication.process;

import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;


/**
 *
 */
public class CommunicationTemplateService
{
	private static final Logger LOG = Logger.getLogger(CommunicationTemplateService.class);
	private static final String FIND_TEMPLATE = "select {uid} from {CommunicationTemplate} where {uid}=?uid ";



	@Resource
	private FlexibleSearchService flexibleSearchService;

	public CommunicationTemplateModel findTemplate(final String uid)
	{
		final FlexibleSearchQuery query = new FlexibleSearchQuery(FIND_TEMPLATE);
		query.addQueryParameter("uid", uid);

		if (getFlexibleSearchService().search(query).getResult().size() > 1)
		{
			LOG.error("More then One template Found !!! Returned First One");
		}
		if (getFlexibleSearchService().search(query).getResult().size() == 0)
		{
			LOG.error("No template Found");
			return null;
		}

		return (CommunicationTemplateModel) getFlexibleSearchService().search(query).getResult().get(0);
	}

	/**
	 * @return the flexibleSearchService
	 */
	public FlexibleSearchService getFlexibleSearchService()
	{
		return flexibleSearchService;
	}

	/**
	 * @param flexibleSearchService
	 *           the flexibleSearchService to set
	 */
	public void setFlexibleSearchService(final FlexibleSearchService flexibleSearchService)
	{
		this.flexibleSearchService = flexibleSearchService;
	}
}
