/**
 *
 */
package com.cnk.travelogix.communication.strategies;

import com.cnk.travelogix.communication.model.cms2.pages.CommunicationTemplateModel;


/**
 * @author I319924
 *
 */
public interface CloneCommunicationTemplateStrategy
{
	CommunicationTemplateModel clone(final CommunicationTemplateModel original);
}
