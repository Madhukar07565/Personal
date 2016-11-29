package com.cnk.travelogix.suppliers.task;

import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cnk.travelogix.sapintegrations.facade.CCServicesFacade;
import com.cnk.travelogix.suppliers.air.data.PricedItinerary;
import de.hybris.platform.core.Registry;

public class UpdatePriceInfoTask implements Callable<PricedItinerary> {
	private PricedItinerary pricingInfo;
	private Logger LOG = LoggerFactory.getLogger(getClass());
	
	public UpdatePriceInfoTask(PricedItinerary pricingInfo) {
		this.pricingInfo = pricingInfo;
	}
	@Override
	public PricedItinerary call() throws Exception {
		PricedItinerary info = getAirItineraryPricingInfo();
		try{
			//TODO : call CC service here and update the priceinfo.
		}catch(Exception e) {
			LOG.error(e.getMessage());
		}
		
		return info;
	}
	public PricedItinerary getAirItineraryPricingInfo() {
		return this.pricingInfo;
	}
	public CCServicesFacade getCcServicesFacade() {
		return (CCServicesFacade)Registry.getApplicationContext().getBean("ccServicesFacade");
	}
}
