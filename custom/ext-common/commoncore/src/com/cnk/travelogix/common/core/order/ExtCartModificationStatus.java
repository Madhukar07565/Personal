/**
 *
 */
package com.cnk.travelogix.common.core.order;

import de.hybris.platform.commerceservices.order.CommerceCartModificationStatus;


/**
 * @author i323801
 *
 */
public interface ExtCartModificationStatus extends CommerceCartModificationStatus
{
	String PRICE_REDUCED = "priceReduced";
	String PRICE_CHANGED_MORE_THAN_THREASHOLD = "moreThanThreshold";
	String PRICE_CHANGED_LESS_THAN_THREASHOLD = "LESSThanThreshold";
}
