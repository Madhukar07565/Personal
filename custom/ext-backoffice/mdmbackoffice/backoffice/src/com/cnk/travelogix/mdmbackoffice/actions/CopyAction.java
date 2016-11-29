/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.actions;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;

import java.util.Map;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.cnk.travelogix.mdmbackoffice.services.CopyActionStratergy;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationEvent;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationUtils;
import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;
import com.hybris.cockpitng.core.impl.NotificationStack;
import com.hybris.cockpitng.engine.impl.AbstractComponentWidgetAdapterAware;
import com.hybris.cockpitng.util.BackofficeSpringUtil;


/**
 *
 */
public class CopyAction extends AbstractComponentWidgetAdapterAware implements CockpitAction<Object, Object>
{
	private static final Logger LOG = Logger.getLogger(LockedByAction.class);
	public static final String SOCKET_INPUT = "copyObject";
	public static final String SOCKET_OUTPUT = "copiedObject";


	@Resource
	private ModelService modelService;

	@Resource
	private Map<String, CopyActionStratergy> copyActionMap;

	public NotificationStack getNotificationStack()
	{
		return (NotificationStack) BackofficeSpringUtil.getBean("notificationStack");
	}

	public ModelService getModelService()
	{
		return modelService;
	}

	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Override
	public ActionResult perform(final ActionContext ctx)
	{
		final Object data = ctx.getData();
		final ItemModel model = (ItemModel) data;
		ItemModel clone = modelService.clone(model, model.getClass());
		if (copyActionMap.get(clone.getItemtype()) != null)
		{
			clone = (ItemModel) copyActionMap.get(clone.getItemtype()).postCopyAction(clone, model);
		}
		final ActionResult result = new ActionResult(ActionResult.SUCCESS);
		result.setData(clone);
		showSuccessNotification("Copied Successfully, You can Start Editing");
		sendConfiguredOutput(clone);
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
}
