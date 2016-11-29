/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.suppliers.air.service.impl;

import de.hybris.platform.servicelayer.config.ConfigurationService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cnk.travelogix.suppliers.air.converter.AirAvailConverter;
import com.cnk.travelogix.suppliers.air.converter.AirBookConverter;
import com.cnk.travelogix.suppliers.air.converter.AirCancelConverter;
import com.cnk.travelogix.suppliers.air.converter.AirDemandTicketConverter;
import com.cnk.travelogix.suppliers.air.converter.AirGetSSRConverter;
import com.cnk.travelogix.suppliers.air.converter.AirListBookingsConverter;
import com.cnk.travelogix.suppliers.air.converter.AirLowFareSearchConverter;
import com.cnk.travelogix.suppliers.air.converter.AirPriceConverter;
import com.cnk.travelogix.suppliers.air.converter.AirPushSSRConverter;
import com.cnk.travelogix.suppliers.air.converter.AirPushSeatConverter;
import com.cnk.travelogix.suppliers.air.converter.AirRePriceConverter;
import com.cnk.travelogix.suppliers.air.converter.AirRemoveMessageQueueConverter;
import com.cnk.travelogix.suppliers.air.converter.AirRetrievePNRConverter;
import com.cnk.travelogix.suppliers.air.converter.AirRulesConverter;
import com.cnk.travelogix.suppliers.air.converter.AirSeatMapConverter;
import com.cnk.travelogix.suppliers.air.converter.AirSellConverter;
import com.cnk.travelogix.suppliers.air.converter.AirSplitPNRConverter;
import com.cnk.travelogix.suppliers.air.converter.AirUpdatePNRConverter;
import com.cnk.travelogix.suppliers.air.converter.GetPNRFromQueueConverter;
import com.cnk.travelogix.suppliers.air.data.AirAvailRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirAvailResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirBookModifyRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirBookRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirCancelResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirCancellRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirDemandTicketRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirDemandTicketResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirGetSSRRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirGetSSResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchRequest;
import com.cnk.travelogix.suppliers.air.data.AirLowFareSearchResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPriceRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPriceResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPushSSRRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPushSSRResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPushSeatRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPushSeatResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirReadRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirRemoveMessageQueueRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirRemoveMessageQueueResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirRuleResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirRulesRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirSeatMapRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.AirSeatMapResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.MessageQueueRequestWrapper;
import com.cnk.travelogix.suppliers.air.data.MessageQueueResponseWrapper;
import com.cnk.travelogix.suppliers.air.service.SupplierAirService;
import com.cnk.travelogix.suppliers.client.SupplierClient;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRQ;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

/**
 * @author I077988
 */
public class SupplierAirServiceImpl implements SupplierAirService {

    private static final Logger LOG = LoggerFactory.getLogger(SupplierAirServiceImpl.class);

    @Autowired
    private SupplierClient supplierClient;
    @Autowired
    private ConfigurationService configurationService;

    @Autowired
    private AirSellConverter airSellConverter;
    @Autowired
    private AirBookConverter airBookConverter;

    @Autowired
    private AirPriceConverter airPriceConverter;
    @Autowired
    private AirAvailConverter airAvailConverter;
    @Autowired
    private AirRulesConverter airRulesConverter;
    @Autowired
    private AirCancelConverter airCancelConverter;
    @Autowired
    private AirGetSSRConverter airGetSSRConverter;
    @Autowired
    private AirPushSSRConverter airPushSSRConverter;
    @Autowired
    private AirSeatMapConverter airSeatMapConverter;
    @Autowired
    private AirRePriceConverter airRePriceConverter;
    @Autowired
    private AirPushSeatConverter airPushSeatConverter;
    @Autowired
    private AirSplitPNRConverter airSplitPNRConverter;
    @Autowired
    private AirUpdatePNRConverter airUpdatePNRConverter;
    @Autowired
    private AirRetrievePNRConverter airRetrievePNRConverter;
    @Autowired
    private AirListBookingsConverter airListBookingsConverter;
    @Autowired
    private AirDemandTicketConverter airDemandTicketConverter;
    @Autowired
    private GetPNRFromQueueConverter getPNRFromQueueConverter;
    @Autowired
    private AirLowFareSearchConverter airLowFareSearchConverter;
    @Autowired
    private AirRemoveMessageQueueConverter airRemoveMessageQueueConverter;

    @Override
    public AirLowFareSearchResponseWrapper otaAirLowFareSearchSync(final AirLowFareSearchRequest request) {
	LOG.info("#otaAirLowFareSearchSync - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirLowFareSearchSync.url");
	final AirInterfaceRQ airInterfaceRQ = airLowFareSearchConverter.toOTAAirLowFareSearchRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirLowFareSearchResponseWrapper response = airLowFareSearchConverter.fromOTAAirLowFareSearchRS(airInterfaceRS);
	LOG.info("#otaAirLowFareSearchSync - Finish");
	return response;
    }

    @Override
    public AirPriceResponseWrapper otaAirPriceSell(final AirPriceRequestWrapper requestWrapper) {
	LOG.info("#otaAirPriceSell - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirPriceSell.url");
	final AirInterfaceRQ airInterfaceRQ = airSellConverter.toOTAAirSellRQ(requestWrapper);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirPriceResponseWrapper response = airSellConverter.fromOTAAirSellRS(airInterfaceRS);
	LOG.info("#otaAirPriceSell - Finish");
	return response;
    }

    @Override
    public AirPriceResponseWrapper otaAirPrice(final AirPriceRequestWrapper requestWrapper) {
	LOG.info("#otaAirPrice - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirPrice.url");
	final AirInterfaceRQ airInterfaceRQ = airPriceConverter.toOTAAirPriceRQ(requestWrapper);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirPriceResponseWrapper response = airPriceConverter.fromOTAAirPriceRS(airInterfaceRS);
	LOG.info("#otaAirPrice - Finish");
	return response;
    }

    @Override
    public AirBookResponseWrapper otaAirBook(final AirBookRequestWrapper requestWrapper) {
	LOG.info("#otaAirBook - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirBook.url");
	final AirInterfaceRQ airInterfaceRQ = airBookConverter.toOTAAirBookRQ(requestWrapper);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirBookResponseWrapper response = airBookConverter.fromOTAAirBookRS(airInterfaceRS);
	LOG.info("#otaAirBook - Finish");
	return response;
    }

    @Override
    public AirSeatMapResponseWrapper otaAirSeatMap(final AirSeatMapRequestWrapper requestWrapperData) {
	LOG.info("#otaAirSeatMap - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirSeatMap.url");
	final AirInterfaceRQ airInterfaceRQ = airSeatMapConverter.otaAirSeatMapRQ(requestWrapperData);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirSeatMapResponseWrapper response = airSeatMapConverter.fromOTAAirSeatMapRS(airInterfaceRS);
	LOG.info("#otaAirSeatMap - Finish");
	return response;
    }

    @Override
    public AirBookResponseWrapper otaAirBookModifyUpdatePNR(AirBookModifyRequestWrapper request) {
	LOG.info("#otaAirBookModifyUpdatePNR - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirBookModifyUpdatePNR.url");
	final AirInterfaceRQ airInterfaceRQ = airUpdatePNRConverter.toOTAAirBookModifyRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	AirBookResponseWrapper response = airUpdatePNRConverter.fromOTAAirBookModifyRS(airInterfaceRS);
	LOG.info("#otaAirBookModifyUpdatePNR - Finish");
	return response;
    }

    @Override
    public AirDemandTicketResponseWrapper otaAirDemandTicket(final AirDemandTicketRequestWrapper requestWrapperData) {
	LOG.info("#otaAirDemandTicket - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirIssueTicket.url");
	final AirInterfaceRQ airInterfaceRQ = airDemandTicketConverter.toOTAAirDemandTicketRQ(requestWrapperData);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirDemandTicketResponseWrapper response = airDemandTicketConverter.fromOTAAirDemandTicketRS(airInterfaceRS);
	LOG.info("#otaAirDemandTicket - Finish");
	return response;
    }

    @Override
    public AirBookResponseWrapper otaRetrievePNR(final AirReadRequestWrapper requestWrapperData) {
	LOG.info("#otaRetrievePNR - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaRetrievePNR.url");
	final AirInterfaceRQ airInterfaceRQ = airRetrievePNRConverter.toOTAReadRQ(requestWrapperData);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirBookResponseWrapper response = airRetrievePNRConverter.fromOTAAirBookRS(airInterfaceRS);
	LOG.info("#otaRetrievePNR - Finish");
	return response;
    }

    @Override
    public AirCancelResponseWrapper otaAirCancelSplitPNR(final AirCancellRequestWrapper requestWrapper) {
	LOG.info("#otaAirCancelSplitPNR - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirCancelSplitPNR.url");
	final AirInterfaceRQ airInterfaceRQ = airSplitPNRConverter.toOTAAirSplitRQ(requestWrapper);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirCancelResponseWrapper response = airSplitPNRConverter.fromOTAAirSplitRS(airInterfaceRS);
	LOG.info("#otaAirCancelSplitPNR - Finish");
	return response;
    }

    @Override
    public AirCancelResponseWrapper otaAirCancel(final AirCancellRequestWrapper requestWrapper) {
	LOG.info("#otaAirCancel - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirCancel.url");
	final AirInterfaceRQ airInterfaceRQ = airCancelConverter.toOTACancelRQ(requestWrapper);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	AirCancelResponseWrapper response = airCancelConverter.fromOTACancelRS(airInterfaceRS);
	LOG.info("#otaAirCancel - Finish");
	return response;
    }

    @Override
    public AirRemoveMessageQueueResponseWrapper otaRemoveMessageQueue(final AirRemoveMessageQueueRequestWrapper request) {
	LOG.info("#otaRemoveMessageQueue - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaRemoveMessageQueue.url");
	final AirInterfaceRQ airInterfaceRQ = airRemoveMessageQueueConverter.toOTARemoveMessageQueueRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirRemoveMessageQueueResponseWrapper response = airRemoveMessageQueueConverter.fromOTARemoveMessageQueueRS(airInterfaceRS);
	LOG.info("#otaRemoveMessageQueue - Finish");
	return response;
    }

    @Override
    public MessageQueueResponseWrapper otaMessageQueue(MessageQueueRequestWrapper request) {
	LOG.info("#otaMessageQueue - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaMessageQueue.url");
	final AirInterfaceRQ airInterfaceRQ = getPNRFromQueueConverter.toOTAMessageQueueRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	MessageQueueResponseWrapper response = getPNRFromQueueConverter.fromOTAMessageQueueRS(airInterfaceRS);
	LOG.info("#otaMessageQueue - Finish");
	return response;
    }

    @Override
    public AirRuleResponseWrapper otaAirFareRules(final AirRulesRequestWrapper requestWrapper) {
	LOG.info("#otaAirFareRules - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirFareRules.url");
	final AirInterfaceRQ airInterfaceRQ = airRulesConverter.toOTAAirRulesRQ(requestWrapper);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	AirRuleResponseWrapper airRuleResponseWrapper = airRulesConverter.fromOTAAirRulesRS(airInterfaceRS);
	LOG.info("#otaAirFareRules - Finish");
	return airRuleResponseWrapper;
    }

    @Override
    public AirPriceResponseWrapper otaAirRePrice(final AirPriceRequestWrapper requestWrapper) {
	LOG.info("#otaAirRePrice - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirRePrice.url");
	final AirInterfaceRQ airInterfaceRQ = airRePriceConverter.toOTAAirRePriceRQ(requestWrapper);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirPriceResponseWrapper response = airRePriceConverter.fromOTAAirRePriceRS(airInterfaceRS);
	LOG.info("#otaAirRePrice - Finish");
	return response;
    }

    @Override
    public AirBookResponseWrapper otaListBookings(final AirReadRequestWrapper request) {
	LOG.info("#otaListBookings - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaListBookings.url");
	final AirInterfaceRQ airInterfaceRQ = airListBookingsConverter.toOTAReadRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirBookResponseWrapper response = airListBookingsConverter.fromOTAAirBookRS(airInterfaceRS);
	LOG.info("#otaListBookings - Finish");
	return response;
    }

    @Override
    public AirAvailResponseWrapper otaGetAvailability(final AirAvailRequestWrapper request) {
	LOG.info("#otaGetAvailability - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaGetAvailability.url");
	final AirInterfaceRQ airInterfaceRQ = airAvailConverter.toOTAAirAvailRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirAvailResponseWrapper response = airAvailConverter.fromOTAAirAvailRS(airInterfaceRS);
	LOG.info("#otaGetAvailability - Finish");
	return response;
    }

    @Override
    public AirPushSSRResponseWrapper otaAirBookModifySellBySSR(final AirPushSSRRequestWrapper request) {
	LOG.info("#otaPushSSR - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaGetPushSSR.url");
	final AirInterfaceRQ airInterfaceRQ = airPushSSRConverter.toOTAAirPushSSRRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirPushSSRResponseWrapper response = airPushSSRConverter.fromOTAAirPushSSRRS(airInterfaceRS);
	LOG.info("#otaPushSSR - Finish");
	return response;
    }

    @Override
    public AirPushSeatResponseWrapper otaAirBookModifyAssignSeat(final AirPushSeatRequestWrapper request) {
	LOG.info("#otaPushSeat - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaGetPushSeat.url");
	final AirInterfaceRQ airInterfaceRQ = airPushSeatConverter.toOTAAirPushSeatRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirPushSeatResponseWrapper response = airPushSeatConverter.fromOTAAirPushSeatRS(airInterfaceRS);
	LOG.info("#otaPushSeat - Finish");
	return response;
    }

    @Override
    public AirGetSSResponseWrapper otaAirGetSSR(final AirGetSSRRequestWrapper request) {
	LOG.info("#otaAirGetSSR - Start");
	final String url = configurationService.getConfiguration().getString("supplier.ota.otaAirGetSSR.url");
	final AirInterfaceRQ airInterfaceRQ = airGetSSRConverter.toOTAAirGetSSRQ(request);
	final AirInterfaceRS airInterfaceRS = supplierClient.postForAirInterface(url, airInterfaceRQ);
	final AirGetSSResponseWrapper response = airGetSSRConverter.fromOTAAirGetSSRS(airInterfaceRS);
	LOG.info("#otaAirGetSSR - Finish");
	return response;
    }

}
