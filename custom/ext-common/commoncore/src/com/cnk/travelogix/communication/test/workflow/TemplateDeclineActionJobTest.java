/**
 *
 */
package com.cnk.travelogix.communication.test.workflow;

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.workflow.model.WorkflowActionModel;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;
import com.cnk.travelogix.communication.workflow.TemplateDeclineActionJob;


/**
 * @author I319924
 *
 */

@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class TemplateDeclineActionJobTest
{

	@InjectMocks
	TemplateDeclineActionJob job = new TemplateDeclineActionJob();

	@Mock
	WorkflowActionModel action;

	/**
	 * Test method for
	 * {@link com.cnk.travelogix.communication.workflow.TemplateDeclineActionJob#perform(de.hybris.platform.workflow.model.WorkflowActionModel)}
	 * .
	 */
	@Test
	public void testPerform()
	{
		final CommunicationTemplateModel template = new CommunicationTemplateModel();
		template.setUid("test");
		final List<ItemModel> list = new ArrayList<ItemModel>();
		list.add(template);
		given(action.getAttachmentItems()).willReturn(list);
		job.perform(action);
		assertTrue(template.getStatus().equals(ArticleApprovalStatus.UNAPPROVED));
	}

}
