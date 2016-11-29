package com.cnk.travelogix.mdmbackoffice.actions;

import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;
import com.cnk.travelogix.product.transport.masters.core.model.AirRouteModel;
import com.cnk.travelogix.supplier.credentials.core.indents.model.TicketCappingIndentModel;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationEvent;
import com.hybris.backoffice.widgets.notificationarea.event.NotificationUtils;
import com.hybris.cockpitng.actions.ActionContext;
import com.hybris.cockpitng.actions.ActionResult;
import com.hybris.cockpitng.actions.CockpitAction;


/**
 * Submit Action for Workflow
 */
public class SubmitAction implements CockpitAction<ItemModel, String>
{
	private static final Logger LOG = Logger.getLogger(SubmitAction.class.getName());

	@Resource
	private EventService eventService;

	@Autowired
	private WorkflowService workflowService;

	@Resource
	private Map workflowMap;

	@Resource
	private WorkflowTemplateService workflowTemplateService;

	@Resource
	private WorkflowProcessingService workflowProcessingService;

	@Resource
	private UserService userService;

	@Resource
	private ModelService modelService;

	@Override
	public ActionResult<String> perform(final ActionContext<ItemModel> actionContex)
	{
		LOG.info("######" + actionContex.getLabel("action.submit.start") + " ######");

		final ItemModel itemModel = actionContex.getData();
		final String code = itemModel.getItemtype();

		final List workflowsList = (List) workflowMap.get(code);

		if (isWorkFlowAvailableForThisItem(code) && !workflowsList.isEmpty()
				&& ApprovalWorkFlowStatus.DRAFT.getCode().equals(getworkFlowStatus(itemModel).toString())
				&& startTheWorkFlow(workflowsList, itemModel.getPk()).booleanValue())
		{
			NotificationUtils.notifyUser(actionContex.getLabel("action.submit.success"), NotificationEvent.Type.SUCCESS);
			return new ActionResult(ActionResult.SUCCESS, itemModel);
		}
		//Messagebox.show(itemModel + " (" + ActionResult.ERROR + ")");
		LOG.info("######" + actionContex.getLabel("action.submit.failed") + actionContex.getClass() + " ######");
		NotificationUtils.notifyUser(actionContex.getLabel("action.submit.failed"), NotificationEvent.Type.FAILURE);
		return new ActionResult(ActionResult.ERROR);
	}

	protected Boolean startTheWorkFlow(final List workflowsList, final PK pk)
	{
		Boolean flag = Boolean.FALSE;

		final String templateCode = workflowsList.get(0).toString();

		final WorkflowTemplateModel workflowTemplate = this.workflowTemplateService.getWorkflowTemplateForCode(templateCode);

		if (workflowTemplate.getCode().equals(templateCode))
		{

			final ItemModel itemModel = modelService.get(pk);

			setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.SUBMIT);

			final ApprovalWorkFlowStatus workFlowStatus = (ApprovalWorkFlowStatus) getworkFlowStatus(itemModel);

			if (workFlowStatus.getCode().equals(ApprovalWorkFlowStatus.SUBMIT.getCode()))
			{
				final WorkflowModel workflow = this.workflowService.createWorkflow(workflowTemplate, itemModel,
						userService.getUserForUID(workflowTemplate.getOwner().getUid()));

				if (itemModel instanceof AirRouteModel || itemModel instanceof TicketCappingIndentModel)
				{
					setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.SUPERVISOR_APPROVAL);
				}
				else
				{
					setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.QC_PENDING); // After work flow is created status is set to QC_Pending.
				}

				for (final WorkflowActionModel action : workflow.getActions())
				{
					modelService.save(action);
				}
				this.workflowProcessingService.startWorkflow(workflow);

				flag = Boolean.TRUE;

				LOG.info("*********** workflow started ************* ");
			}
		}
		else
		{
			LOG.info("*********** Missing work flow template ************* ");
		}

		return flag;
	}


	protected boolean isWorkFlowAvailableForThisItem(final String code)
	{

		final Set<String> modelsPKSet = workflowMap.keySet();

		return modelsPKSet.contains(code);
	}

	protected Object getworkFlowStatus(final ItemModel item)
	{
		Method method = null;
		try
		{
			method = item.getClass().getMethod("getWorkFlowStatus");
		}
		catch (NoSuchMethodException | SecurityException e1)
		{
			LOG.error(e1);
		}

		try
		{
			if (method != null)
			{
				return method.invoke(item);
			}
		}
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
		{
			LOG.error(e);
		}
		return null;
	}

	protected void setworkFlowStatus(final ItemModel item, final ApprovalWorkFlowStatus status)
	{
		Method method = null;
		try
		{
			method = item.getClass().getMethod("setWorkFlowStatus", ApprovalWorkFlowStatus.class);
		}
		catch (NoSuchMethodException | SecurityException e1)
		{
			LOG.error(e1);
		}

		try
		{
			if (method != null)
			{
				method.invoke(item, status);
				modelService.save(item);
				modelService.refresh(item);
			}
		}
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
		{
			LOG.error(e);
		}
	}


	@Override
	public boolean canPerform(final ActionContext<ItemModel> ctx)
	{
		return true;
	}

	@Override
	public boolean needsConfirmation(final ActionContext<ItemModel> ctx)
	{
		return false;
	}

	@Override
	public String getConfirmationMessage(final ActionContext<ItemModel> ctx)
	{
		return "Do you want to submit this Item for approval ?";
	}


	/**
	 * @param workflowService
	 *           the workflowService to set
	 */
	public void setWorkflowService(final WorkflowService workflowService)
	{
		this.workflowService = workflowService;
	}



	/**
	 * @param workflowMap
	 *           the workflowMap to set
	 */
	public void setWorkflowMap(final Map workflowMap)
	{
		this.workflowMap = workflowMap;
	}



	/**
	 * @param workflowTemplateService
	 *           the workflowTemplateService to set
	 */
	public void setWorkflowTemplateService(final WorkflowTemplateService workflowTemplateService)
	{
		this.workflowTemplateService = workflowTemplateService;
	}



	/**
	 * @param workflowProcessingService
	 *           the workflowProcessingService to set
	 */
	public void setWorkflowProcessingService(final WorkflowProcessingService workflowProcessingService)
	{
		this.workflowProcessingService = workflowProcessingService;
	}



	/**
	 * @param userService
	 *           the userService to set
	 */
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}



	/**
	 * @param modelService
	 *           the modelService to set
	 */
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}



	public EventService getEventService()
	{
		return eventService;
	}



	public void setEventService(final EventService eventService)
	{
		this.eventService = eventService;
	}



}