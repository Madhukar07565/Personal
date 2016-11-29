package com.cnk.travelogix.suppliers.events;

import com.cnk.travelogix.suppliers.model.SendFileStatusProcessModel;

import de.hybris.platform.commerceservices.event.AbstractSiteEventListener;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.site.BaseSiteService;
import de.hybris.platform.store.services.BaseStoreService;

/*
 * The listener interface for receiving CheckFileStatusEvent events. The class
 * that is interested in processing a CheckFileStatusEvent event implements this
 * interface, and the object created with that class is registered with a
 * component using the component's <code>add CheckFileStatusEventListener
 * <code> method. When the CheckFileStatusEvent event occurs, that object's
 * appropriate method is invoked.
 *
 * @author I323673
 */
public class CheckFileStatusEventListener extends AbstractSiteEventListener<CheckFileStatusEvent> {

	/** The Constant CREATE_NOVEDAD_EMAIL_PROCESS. */
	private static final String SEND_FILE_STATUS_PROCESS = "sendFileStatusProcess";

	/** The business process service. */
	private BusinessProcessService businessProcessService;

	/** The base site service. */
	private BaseSiteService baseSiteService;

	/** The base store service. */
	private BaseStoreService baseStoreService;

	/** The common i18 n service. */
	private CommonI18NService commonI18NService;

	/** The model service. */
	private ModelService modelService;

	/** The user service. */
	private UserService userService;

	/**
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.commerceservices.event.AbstractSiteEventListener#
	 *      onSiteEvent(de.hybris.platform.servicelayer.
	 *      event.events.AbstractEvent)
	 */
	@Override
	protected void onSiteEvent(final CheckFileStatusEvent checkFileStatusEvent) {
		final SendFileStatusProcessModel sendFileStatusProcessModel = getBusinessProcessService().createProcess(
				SEND_FILE_STATUS_PROCESS + "-" + System.currentTimeMillis() + "-" + Math.random(),
				SEND_FILE_STATUS_PROCESS);
		sendFileStatusProcessModel.setEmail(checkFileStatusEvent.getEmailId());
		sendFileStatusProcessModel.setSite(baseSiteService.getCurrentBaseSite());
		sendFileStatusProcessModel.setStore(getBaseStoreService().getCurrentBaseStore());
		sendFileStatusProcessModel.setLanguage(getCommonI18NService().getCurrentLanguage());
		getModelService().save(sendFileStatusProcessModel);
		getBusinessProcessService().startProcess(sendFileStatusProcessModel);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see de.hybris.platform.commerceservices.event.AbstractSiteEventListener#
	 *      shouldHandleEvent(de.hybris.platform.
	 *      servicelayer.event.events.AbstractEvent)
	 */
	@Override
	protected boolean shouldHandleEvent(final CheckFileStatusEvent arg0) {
		return true;
	}

	/**
	 * Gets the business process service.
	 *
	 * @return the business process service
	 */
	public BusinessProcessService getBusinessProcessService() {
		return businessProcessService;
	}

	/**
	 * Sets the business process service.
	 *
	 * @param businessProcessService
	 *            the new business process service
	 */
	public void setBusinessProcessService(BusinessProcessService businessProcessService) {
		this.businessProcessService = businessProcessService;
	}

	/**
	 * Gets the base site service.
	 *
	 * @return the base site service
	 */
	public BaseSiteService getBaseSiteService() {
		return baseSiteService;
	}

	/**
	 * Sets the base site service.
	 *
	 * @param baseSiteService
	 *            the new base site service
	 */
	public void setBaseSiteService(BaseSiteService baseSiteService) {
		this.baseSiteService = baseSiteService;
	}

	/**
	 * Gets the base store service.
	 *
	 * @return the base store service
	 */
	public BaseStoreService getBaseStoreService() {
		return baseStoreService;
	}

	/**
	 * Sets the base store service.
	 *
	 * @param baseStoreService
	 *            the new base store service
	 */
	public void setBaseStoreService(BaseStoreService baseStoreService) {
		this.baseStoreService = baseStoreService;
	}

	/**
	 * Gets the common i18 n service.
	 *
	 * @return the common i18 n service
	 */
	public CommonI18NService getCommonI18NService() {
		return commonI18NService;
	}

	/**
	 * Sets the common i18 n service.
	 *
	 * @param commonI18NService
	 *            the new common i18 n service
	 */
	public void setCommonI18NService(CommonI18NService commonI18NService) {
		this.commonI18NService = commonI18NService;
	}

	/**
	 * Gets the model service.
	 *
	 * @return the model service
	 */
	public ModelService getModelService() {
		return modelService;
	}

	/**
	 * Sets the model service.
	 *
	 * @param modelService
	 *            the new model service
	 */
	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}

	/**
	 * Gets the user service.
	 *
	 * @return the user service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user service.
	 *
	 * @param userService
	 *            the new user service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
