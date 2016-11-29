/**
 *
 */
package com.cnk.travelogix.common.core.enquiry.services.impl;

import de.hybris.platform.commerceservices.enums.SiteChannel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.config.ConfigurationService;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.common.core.enquiry.facade.EnquirySupplierFacade;
import com.cnk.travelogix.common.core.enquiry.services.EnquiryService;
import com.cnk.travelogix.common.core.event.CnkGenericEvent;
import com.cnk.travelogix.common.core.event.strategy.EnquiryAfterCreationEventStrategy;
import com.cnk.travelogix.common.core.event.strategy.EnquiryBeforeCreationEventStrategy;
import com.cnk.travelogix.common.core.model.BaseEnquiryModel;
import com.cnk.travelogix.common.core.model.UserJourneyPhoneModel;

import jersey.repackaged.com.google.common.base.Preconditions;


/**
 * @author i318043
 *
 */
public class DefaultEnquiryService implements EnquiryService
{
	/**
	 *
	 */
	private static final String CONFIGKEY_PROXY_ENQUIRY_ENABLED_FOR_CREATION = "commoncore.enquiry.proxy-enquiry-enabled-for-creation";

	private static final Logger LOG = Logger.getLogger(DefaultEnquiryService.class);

	private ConfigurationService configurationService;

	/**
	 * @param configurationService
	 *           the configurationService to set
	 */
	@Required
	public void setConfigurationService(final ConfigurationService configurationService)
	{
		this.configurationService = configurationService;
	}

	private EventService eventService;

	/**
	 * @param eventService
	 *           the eventService to set
	 */
	@Required
	public void setEventService(final EventService eventService)
	{
		this.eventService = eventService;
	}

	private ModelService modelService;

	/**
	 * @param modelService
	 */
	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	private UserService userService;

	/**
	 * @param userService
	 *           the userService to set
	 */
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	private BaseSiteService baseSiteService;

	/**
	 * @param baseSiteService
	 *           the baseSiteService to set
	 */
	@Required
	public void setBaseSiteService(final BaseSiteService baseSiteService)
	{
		this.baseSiteService = baseSiteService;
	}

	private EnquirySupplierFacade enquirySupplierFacade;

	/**
	 * @param enquirySupplierFacade
	 *           the enquirySupplierFacade to set
	 */
	@Required
	public void setEnquirySupplierFacade(final EnquirySupplierFacade enquirySupplierFacade)
	{
		this.enquirySupplierFacade = enquirySupplierFacade;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.core.service.EnquiryService#createEnquiry(com.cnk.travelogix.common.core.model.
	 * BaseEnquiryModel, com.cnk.travelogix.common.core.service.EnquiryService.FlowState)
	 */
	@Override
	public void createEnquiry(final BaseEnquiryModel enquiryModel, final EnquiryFlowState state)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("createEnquiry(BaseEnquiryModel, EnquiryFlowState) - start - Enquiry flow state is " + state.name());
		}

		try
		{
			if (EnquiryFlowState.AT_PROCEED_FOR_BOOKING.equals(state))
			{
				doProceedForBooking(enquiryModel, state);
			}
			else if (EnquiryFlowState.AT_DROPSOUT.equals(state))
			{
				doDropsout(enquiryModel, state);
			}
			else if (EnquiryFlowState.MT_OTHERS.equals(state))
			{
				doOthers(enquiryModel, state);
			}
		}
		catch (final Exception e)
		{
			LOG.error("createEnquiry(BaseEnquiryModel, EnquiryFlowState) - exception", e);
		}

		if (LOG.isDebugEnabled())
		{
			LOG.debug("createEnquiry(BaseEnquiryModel, EnquiryFlowState) - end");
		}
	}

	/**
	 * @param enquiryModel
	 * @param state
	 */
	private void doCreateEnquiry(final BaseEnquiryModel enquiryModel, final EnquiryFlowState state)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("doCreateEnquiry(BaseEnquiryModel, EnquiryFlowState) - start - Enquiry flow state = " + state.name()); //$NON-NLS-1$
		}

		if (LOG.isDebugEnabled())
		{
			LOG.debug("doCreateEnquiry(BaseEnquiryModel, EnquiryFlowState) - emit beforeEvent"); //$NON-NLS-1$
		}

		final Map<String, Object> payloads = new HashMap<>();
		payloads.clear();
		payloads.put(EnquiryBeforeCreationEventStrategy.ENQUIRY_MODEL, enquiryModel);
		payloads.put(EnquiryBeforeCreationEventStrategy.FLOW_STATE, state);
		final CnkGenericEvent beforeEvent = new CnkGenericEvent(EnquiryBeforeCreationEventStrategy.class, payloads);
		eventService.publishEvent(beforeEvent);

		if (LOG.isDebugEnabled())
		{
			LOG.debug("doCreateEnquiry(BaseEnquiryModel, EnquiryFlowState) - it's going to save enquiryModel"); //$NON-NLS-1$
		}

		modelService.save(enquiryModel);

		if (LOG.isDebugEnabled())
		{
			LOG.debug("doCreateEnquiry(BaseEnquiryModel, EnquiryFlowState) - emit afterEvent"); //$NON-NLS-1$
		}

		payloads.clear();
		payloads.put(EnquiryAfterCreationEventStrategy.ENQUIRY_MODEL, enquiryModel);
		payloads.put(EnquiryAfterCreationEventStrategy.FLOW_STATE, state);
		final CnkGenericEvent afterEvent = new CnkGenericEvent(EnquiryAfterCreationEventStrategy.class, payloads);
		eventService.publishEvent(afterEvent);

		if (LOG.isDebugEnabled())
		{
			LOG.debug("doCreateEnquiry(BaseEnquiryModel, EnquiryFlowState) - end"); //$NON-NLS-1$
		}
	}

	private void doProceedForBooking(final BaseEnquiryModel enquiryModel, final EnquiryFlowState state)
	{
		final boolean isProxyEnquiryEnabledForCreation = isProxyEnquiryEnabledForCreation();

		if (LOG.isDebugEnabled())
		{
			LOG.debug("doProceedForBooking(BaseEnquiryModel, EnquiryFlowState) - isProxyEnquiryEnabledForCreation=" //$NON-NLS-1$
					+ isProxyEnquiryEnabledForCreation);
		}

		if (!isProxyEnquiryEnabledForCreation)
		{
			return;
		}
		final UserModel currentUser = userService.getCurrentUser();
		fillBasicInfo(enquiryModel, currentUser);
		doCreateEnquiry(enquiryModel, state);
	}

	private void doDropsout(final BaseEnquiryModel enquiryModel, final EnquiryFlowState state)
	{
		UserModel currentUser = userService.getCurrentUser();
		if (null != currentUser && (isB2BChannel() || isAlreadyLogin(currentUser)))
		{
			fillBasicInfo(enquiryModel, currentUser);
			doCreateEnquiry(enquiryModel, state);
		}
		else if ((currentUser = getCustomerFromCookie()) != null)
		{
			fillBasicInfo(enquiryModel, currentUser);
			doCreateEnquiry(enquiryModel, state);
		}
		else
		{
			enquirySupplierFacade.triggerDisplayExitForm();
		}
	}

	private boolean isB2BChannel()
	{
		return SiteChannel.B2B.equals(baseSiteService.getCurrentBaseSite().getChannel());
	}

	/**
	 * @return the history customer based on the cookie info
	 */
	private UserModel getCustomerFromCookie()
	{
		// FIXME Is the cookie used? If yes where the process is located?
		return null;
	}

	@Override
	public boolean isAlreadyLogin(final UserModel currentUser)
	{
		return userService.isMemberOfGroup(currentUser, userService.getUserGroupForUID("customer"));
	}

	private void doOthers(final BaseEnquiryModel enquiryModel, final EnquiryFlowState state)
	{
		final UserModel currentUser = userService.getCurrentUser();
		fillBasicInfo(enquiryModel, currentUser);
		// FIXME Q: what's the product info here?
		doCreateEnquiry(enquiryModel, state);
	}

	private void fillBasicInfo(final BaseEnquiryModel enquiryModel, final UserModel currentUser)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("fillBasicInfo(BaseEnquiryModel, UserModel) - start"); //$NON-NLS-1$
		}

		enquiryModel.setGroupId(UUID.randomUUID().toString());
		enquiryModel.setItemId(UUID.randomUUID().toString());
		enquiryModel.setSubmitter(userService.getAdminUser());
		final SiteChannel channel = baseSiteService.getCurrentBaseSite().getChannel();
		if (LOG.isDebugEnabled())
		{
			LOG.debug("fillBasicInfo(BaseEnquiryModel, UserModel) - the current channel is " + channel.getCode()); //$NON-NLS-1$
		}
		enquiryModel.setSiteChannel(channel);
		final String errMsg = "Only CustomerModel is applicable to BaseEnquiryModel.customer! Actual type is "
				+ currentUser.getClass().getName();
		Preconditions.checkArgument(currentUser instanceof CustomerModel, errMsg);
		final CustomerModel customer = (CustomerModel) currentUser;
		enquiryModel.setCustomer(customer);
		enquiryModel.setTitle((customer.getTitle() == null) ? "N/A" : customer.getTitle().getName());
		if (StringUtils.isBlank(enquiryModel.getFirstName()) || StringUtils.isBlank(enquiryModel.getLastName()))
		{
			fillNames(enquiryModel, customer);
		}

		if (null == enquiryModel.getMobileNo() || null == enquiryModel.getMobileNo().getCountryCode())
		{
			fillMobileInfo(enquiryModel, customer);
		}

		if (StringUtils.isBlank(enquiryModel.getEmail()))
		{
			enquiryModel.setEmail(customer.getContactEmail());
		}

		if (LOG.isDebugEnabled())
		{
			LOG.debug("fillBasicInfo(BaseEnquiryModel, UserModel) - end"); //$NON-NLS-1$
		}
	}

	/**
	 * @param enquiryModel
	 * @param customer
	 */
	@SuppressWarnings("boxing")
	private void fillMobileInfo(final BaseEnquiryModel enquiryModel, final CustomerModel customer)
	{
		if (null == enquiryModel.getMobileNo())
		{
			// FIXME Account team will provide more info on this later
			final UserJourneyPhoneModel dummyPhoneModel = new UserJourneyPhoneModel();
			dummyPhoneModel.setCountryCode(0);
			dummyPhoneModel.setNumber(0L);
			enquiryModel.setMobileNo(dummyPhoneModel);
		}
		else if (null == enquiryModel.getMobileNo().getCountryCode())
		{
			// FIXME country code for the phone should be provided automatically here
			enquiryModel.getMobileNo().setCountryCode(new Integer(0));
		}
		if (enquiryModel.getMobileNo().getNumber() == null)
		{
			// FIXME 0L is used to local test only but actually data check function should work here
			enquiryModel.getMobileNo().setNumber(0L);
		}
	}

	/**
	 * @param enquiryModel
	 * @param customer
	 */
	private void fillNames(final BaseEnquiryModel enquiryModel, final CustomerModel customer)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("fillNames(BaseEnquiryModel, CustomerModel) - start"); //$NON-NLS-1$
		}

		if (StringUtils.isBlank(customer.getName()))
		{
			enquiryModel.setFirstName("N/A");
			enquiryModel.setMiddleName("N/A");
			enquiryModel.setLastName("N/A");
		}
		else
		{
			final String[] names = customer.getName().trim().split("\\W");
			if (names.length == 1)
			{
				enquiryModel.setFirstName(names[0]);
				enquiryModel.setLastName("N/A");
			}
			else if (names.length == 2)
			{
				enquiryModel.setFirstName(names[0]);
				enquiryModel.setLastName(names[names.length - 1]);
			}
			else if (names.length > 2)
			{
				final String middleName = IntStream.range(1, names.length - 1).mapToObj(i -> names[i])
						.collect(Collectors.joining(" "));
				enquiryModel.setMiddleName(middleName);
			}
		}

		if (LOG.isDebugEnabled())
		{
			final String nameLogTemplate = "fillNames(BaseEnquiryModel, CustomerModel) - names - first(%s), middle(%s), last(%s)";
			LOG.debug(String.format(nameLogTemplate, enquiryModel.getFirstName(), enquiryModel.getMiddleName(),
					enquiryModel.getLastName())); //$NON-NLS-1$
		}

		if (LOG.isDebugEnabled())
		{
			LOG.debug("fillNames(BaseEnquiryModel, CustomerModel) - end"); //$NON-NLS-1$
		}
	}

	private boolean isProxyEnquiryEnabledForCreation()
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("isProxyEnquiryEnabledForCreation() - start"); //$NON-NLS-1$
		}

		final boolean isProxyEnabled = configurationService.getConfiguration()
				.getBoolean(CONFIGKEY_PROXY_ENQUIRY_ENABLED_FOR_CREATION, false);

		if (LOG.isDebugEnabled())
		{
			LOG.debug("isProxyEnquiryEnabledForCreation() - end - final evaluation is " + isProxyEnabled); //$NON-NLS-1$
		}
		return isProxyEnabled;
	}

}
