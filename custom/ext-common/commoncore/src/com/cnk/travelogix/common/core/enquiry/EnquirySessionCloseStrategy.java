package com.cnk.travelogix.common.core.enquiry;

import de.hybris.platform.core.model.order.CartModel;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.web.DefaultSessionCloseStrategy;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.core.enquiry.services.EnquiryService;
import com.cnk.travelogix.common.core.enquiry.services.EnquiryService.EnquiryFlowState;
import com.cnk.travelogix.common.core.model.BaseEnquiryModel;
import com.cnk.travelogix.common.core.model.EnquiryWebFormModel;


public class EnquirySessionCloseStrategy extends DefaultSessionCloseStrategy
{
	private static final Logger LOG = Logger.getLogger(EnquirySessionCloseStrategy.class.getName());

	private ModelService modelService;

	/**
	 * @param enquiryService
	 *           the enquiryService to set
	 */
	@Required
	public void setEnquiryService(final EnquiryService enquiryService)
	{
		this.enquiryService = enquiryService;
	}

	private EnquiryService enquiryService;

	/**
	 * @param modelService
	 *           the modelService to set
	 */
	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	public void closeSessionInHttpSession(final HttpSession httpSession)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("closeSessionInHttpSession(HttpSession) - start");
		}
		try
		{
			// Below method comes from de.hybris.platform.servicelayer.web.SessionFilter
			// FIXME Is this method session specific or not. If it's not local view might come to rescue.
			final JaloSession jaloSession = (JaloSession) httpSession.getAttribute("jalosession");
			// FIXME Q: Is there any process for session cart cleaning? Is this the correct invocation?
			if (jaloSession != null && jaloSession.hasCart())
			{
				final CartModel cart = modelService.get(jaloSession.getCart());
				if (null != cart)
				{
					final BaseEnquiryModel enquiryModel = new EnquiryWebFormModel(); // FIXME Q: What should the exact model be used here?
					enquiryService.createEnquiry(enquiryModel, EnquiryFlowState.AT_DROPSOUT);
				}
			}
		}
		catch (final Exception e)
		{
			LOG.error("closeSessionInHttpSession(HttpSession) - exception ignored", e);
		}
		finally
		{
			super.closeSessionInHttpSession(httpSession);
		}
		if (LOG.isDebugEnabled())
		{
			LOG.debug("closeSessionInHttpSession(HttpSession) - end");
		}
	}
}