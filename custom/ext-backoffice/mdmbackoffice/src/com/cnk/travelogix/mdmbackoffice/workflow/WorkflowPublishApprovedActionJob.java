/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.workflow;


import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;

import org.apache.log4j.Logger;

import com.cnk.travelogix.ccintegrationfacade.consumer.CCIntegrationConsumer;
import com.cnk.travelogix.ccintegrationfacade.dto.CCIntegrationDto;
import com.cnk.travelogix.ccintegrationfacade.exception.CCIntegrationException;
import com.cnk.travelogix.masterdata.core.enums.ApprovalWorkFlowStatus;
import com.cnk.travelogix.product.transport.masters.core.model.AirRouteModel;
import com.cnk.travelogix.product.transport.masters.core.model.RouteConnectionModel;


/**
 * To Publish Work flow Action
 *
 */
public class WorkflowPublishApprovedActionJob extends AbstractWorkflowSubmitActionJob
{

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger.getLogger(WorkflowPublishApprovedActionJob.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob#perform(de.hybris.platform.workflow.model.
	 * WorkflowActionModel)
	 */
	@Override
	public WorkflowDecisionModel perform(final WorkflowActionModel action)
	{
		final ItemModel itemModel = getSubmitRequest(action);

		try
		{

			CCIntegrationConsumer.consumeFacade(new CCIntegrationDto(itemModel));
			setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.PUBLISH);

			if (itemModel instanceof AirRouteModel)
			{
				final AirRouteModel airRouteModel = (AirRouteModel) itemModel;
				validateSectorStatus(airRouteModel);
			}
			getModelService().save(itemModel);
			LOGGER.debug("Workflow for  " + itemModel.getItemtype() + " is Approved. Item Published.");

		}
		catch (final CCIntegrationException e)
		{
			setworkFlowStatus(itemModel, ApprovalWorkFlowStatus.DRAFT);
			LOGGER.error("WorkflowPublishActionJob : perform : ERROR : " + e);
		}

		for (final WorkflowDecisionModel decision : action.getDecisions())
		{
			return decision;
		}
		return null;

	}

	private static void validateSectorStatus(final AirRouteModel airRouteModel)
	{
		final RouteConnectionModel routeConnection = airRouteModel.getSectors();
		if (routeConnection != null)
		{
			final Boolean status = routeConnection.getActive();
			if (status != null && !status.booleanValue())
			{
				airRouteModel.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
			}
			else
			{
				airRouteModel.setApprovalStatus(ArticleApprovalStatus.APPROVED);
			}
		}
	}
}
