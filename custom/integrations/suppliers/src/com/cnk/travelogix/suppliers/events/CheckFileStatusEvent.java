/**
 *
 */
package com.cnk.travelogix.suppliers.events;

import de.hybris.platform.basecommerce.model.site.BaseSiteModel;
import de.hybris.platform.commerceservices.event.AbstractCommerceUserEvent;

/*
 * The Class CheckFileStatusEvent.
 *
 * @author I323673
 */
public class CheckFileStatusEvent extends AbstractCommerceUserEvent<BaseSiteModel> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	private String emailId;
	
	private String emailJourney;

	public String getEmailJourney() {
		return emailJourney;
	}

	public void setEmailJourney(String emailJourney) {
		this.emailJourney = emailJourney;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
