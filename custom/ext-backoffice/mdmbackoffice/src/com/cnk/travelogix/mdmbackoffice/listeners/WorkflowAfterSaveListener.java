package com.cnk.travelogix.mdmbackoffice.listeners;

import de.hybris.platform.core.PK;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.user.UserService;
import de.hybris.platform.tx.AfterSaveEvent;
import de.hybris.platform.tx.AfterSaveListener;
import de.hybris.platform.workflow.WorkflowProcessingService;
import de.hybris.platform.workflow.WorkflowService;
import de.hybris.platform.workflow.WorkflowTemplateService;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowModel;
import de.hybris.platform.workflow.model.WorkflowTemplateModel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;


/**
 * Work flow listner
 *
 */
public class WorkflowAfterSaveListener implements AfterSaveListener
{
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

	private static final Logger LOG = Logger.getLogger(WorkflowAfterSaveListener.class);

	@Override
	public void afterSave(final Collection<AfterSaveEvent> events)
	{


		for (final AfterSaveEvent event : events)
		{
			final int type = event.getType();
			if (AfterSaveEvent.UPDATE == type)
			{
				final PK pk = event.getPk();
				final Integer pkCode = Integer.valueOf(pk.getTypeCode());

				final Set<Integer> modelsPKSet = workflowMap.keySet();

				if (modelsPKSet.contains(pkCode))
				{
					final List workflowsList = (List) workflowMap.get(pkCode);
					startTheWorkFlow(workflowsList, pk);
				}
			}
		}

	}


	protected void startTheWorkFlow(final List workflowsList, final PK pk)
	{
		if (!workflowsList.isEmpty())
		{
			final String templateName = workflowsList.get(0).toString();
			final WorkflowTemplateModel workflowTemplate = this.workflowTemplateService.getWorkflowTemplateForCode(templateName);
			final ItemModel itemModel = modelService.get(pk);
			final ApprovalWorkFlowStatus workFlowStatus = (ApprovalWorkFlowStatus) getworkFlowStatus(itemModel);
			if (workFlowStatus.getCode().equals(ApprovalWorkFlowStatus.SUBMIT.getCode()))
			{
				final WorkflowModel workflow = this.workflowService.createWorkflow(workflowTemplate, itemModel,
						userService.getUserForUID(workflowTemplate.getOwner().getUid()));
				setworkFlowStatus(itemModel); // After work flow is created status is set to QC_Pending.
				modelService.save(itemModel);
				for (final WorkflowActionModel action : workflow.getActions())
				{
					modelService.save(action);
				}
				this.workflowProcessingService.startWorkflow(workflow);
				LOG.info("*********** workflow started ************* ");
			}
		}
	}

	public Object getworkFlowStatus(final ItemModel item)
	{
		Method method = null;
		try
		{
			method = item.getClass().getMethod("getWorkFlowStatus");
		}
		catch (NoSuchMethodException | SecurityException exception)
		{
			LOG.error("NoSuchMethodException : " + exception);
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

	public void setworkFlowStatus(final ItemModel item)
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
				method.invoke(item, ApprovalWorkFlowStatus.QC_PENDING);
			}
		}
		catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
		{
			LOG.error(e);
		}

	}

	@Required
	public void setModelService(final ModelService modelService)
	{
		this.modelService = modelService;
	}

	@Required
	public void setWorkflowMap(final Map workflowMap)
	{
		this.workflowMap = workflowMap;
	}
}