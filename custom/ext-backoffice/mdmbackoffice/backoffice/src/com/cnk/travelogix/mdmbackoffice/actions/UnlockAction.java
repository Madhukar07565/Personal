/**
 * Action id for lockedBy attribute of SalesOffice type
 */

package com.cnk.travelogix.mdmbackoffice.actions;


import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.user.UserService;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.mdmbackoffice.services.LockUnlockService;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationEvent;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationUtils;
import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;
import com.hybris.cockpitng.core.impl.NotificationStack;
import com.hybris.cockpitng.dataaccess.facades.object.ObjectFacade;
import com.hybris.cockpitng.dataaccess.facades.object.exceptions.ObjectSavingException;
import com.hybris.cockpitng.engine.impl.AbstractComponentWidgetAdapterAware;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 * Unlock Action
 */
public class UnlockAction extends AbstractComponentWidgetAdapterAware implements CockpitAction
{
	private static final Logger LOG = Logger.getLogger(UnlockAction.class.getName());
	public static final String SOCKET_INPUT = "selecedObjectforunlock";
	public static final String SOCKET_OUTPUT = "selecedObjectafterunlock";

	public LockUnlockService getLockUnlockService()
	{
		return (LockUnlockService) BackofficeSpringUtil.getBean("lockUnlockService");
	}

	public NotificationStack getNotificationStack()
	{
		return (NotificationStack) BackofficeSpringUtil.getBean("notificationStack");
	}

	public ObjectFacade getObjectFacade()
	{
		return (ObjectFacade) BackofficeSpringUtil.getBean("objectFacade");
	}

	public UserService getUserFacade()
	{
		return (UserService) BackofficeSpringUtil.getBean("userService");
	}

	@Override
	public ActionResult perform(final ActionContext ctx)
	{
		final Object data = ctx.getData();
		try
		{
			final EmployeeModel user = (EmployeeModel) getUserFacade().getCurrentUser();
			getLockUnlockService().unlock(data, user);
		}
		catch (final ObjectSavingException e)
		{
			LOG.error(e);
			showFailureNotification(data);
			return new ActionResult(ActionResult.ERROR);
		}
		final ActionResult result = new ActionResult(ActionResult.SUCCESS);
		result.setData(data);
		sendConfiguredOutput(data);
		return result;
	}

	protected void showSuccessNotification(final String successMessage)
	{
		if (!(StringUtils.isNotEmpty(successMessage)))
		{
			return;
		}
		final String id = getNotificationStack().getFailId();
		final NotificationEvent.Type type = NotificationEvent.Type.SUCCESS;
		NotificationUtils.notifyUserVia(successMessage, type, id, new Object[]
		{ type });
	}

	protected void showFailureNotification(final Object object)
	{
		final NotificationEvent.Type type = NotificationEvent.Type.FAILURE;
		NotificationUtils.notifyUserVia("Failed to Lock", type, getNotificationStack().getFailId(), new Object[]
		{ object });
	}


	protected void sendConfiguredOutput(final Object newInstance)
	{
		this.sendOutput(SOCKET_OUTPUT, newInstance);
	}

	@Override
	public void initializeDefaultEventListeners()
	{
		this.addSocketInputEventListener(SOCKET_OUTPUT, event -> this.sendOutput(SOCKET_OUTPUT, event.getData()));
	}

	@Override
	public boolean canPerform(final ActionContext ctx)
	{
		final EmployeeModel user = (EmployeeModel) getUserFacade().getCurrentUser();
		return getLockUnlockService().canUnlock(ctx.getData(), user);
	}

	@Override
	public boolean needsConfirmation(final ActionContext ctx)
	{
		return true;
	}

	@Override
	public String getConfirmationMessage(final ActionContext ctx)
	{
		return "Are you sure?";
	}
}
