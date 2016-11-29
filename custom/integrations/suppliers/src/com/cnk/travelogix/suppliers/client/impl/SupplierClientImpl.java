/**
 * @author I077988
 */
package com.cnk.travelogix.suppliers.client.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.cnk.travelogix.suppliers.client.SupplierClient;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRQ;
import com.coxandkings.integ.suppl.accointerface.AccoInterfaceRS;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

/**
 * @author I077988
 */
public class SupplierClientImpl implements SupplierClient {

    private static final Logger LOG = LoggerFactory.getLogger(SupplierClientImpl.class);

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public AirInterfaceRS postForAirInterface(final String url, final AirInterfaceRQ airInterfaceRQ) {
	LOG.info("#postForAirInterface - Start");
	LOG.debug("#postForAirInterface - URL::{}", url);
	final AirInterfaceRS postForObject = restTemplate.postForObject(url, airInterfaceRQ, AirInterfaceRS.class);
	LOG.info("#postForAirInterface - Finish");
	return postForObject;
    }

    @Override
    public AccoInterfaceRS postForAccoInterface(final String url, final AccoInterfaceRQ accoInterfaceRQ) {
	LOG.info("#postForAccoInterface - Start");
	LOG.debug("#postForAccoInterface - URL::{}", url);
	final AccoInterfaceRS postForObject = restTemplate.postForObject(url, accoInterfaceRQ, AccoInterfaceRS.class);
	LOG.info("#postForAccoInterface - Finish");
	return postForObject;
    }
}
