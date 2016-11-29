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
package com.cnk.travelogix.suppliers.air.service;

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

/**
 * @author I077988
 */
public interface SupplierAirService {

    /**
     * @param request
     *            AirLowFareSearchRequest
     * @return AirLowFareSearchResponse
     */
    public AirLowFareSearchResponseWrapper otaAirLowFareSearchSync(final AirLowFareSearchRequest request);

    /**
     * @param requestWrapper
     *            AirPriceRequestWrapper
     * @return AirPriceResponseWrapper
     */
    public AirPriceResponseWrapper otaAirPrice(final AirPriceRequestWrapper requestWrapper);

    /**
     * @param requestWrapper
     *            AirPriceRequestWrapper
     * @return AirPriceResponseWrapper
     */
    public AirPriceResponseWrapper otaAirRePrice(final AirPriceRequestWrapper requestWrapper);

    /**
     * @param requestWrapperData
     *            AirDemandTicketRequestWrapper
     * @return AirDemandTicketResponseWrapper
     */
    public AirDemandTicketResponseWrapper otaAirDemandTicket(final AirDemandTicketRequestWrapper requestWrapperData);

    /**
     * @param request
     *            AirReadRequestWrapper
     * @return AirBookResponseWrapper
     */
    public AirBookResponseWrapper otaListBookings(final AirReadRequestWrapper request);

    /**
     * @param requestWrapper
     * @return AirPriceResponseWrapper
     */
    public AirPriceResponseWrapper otaAirPriceSell(final AirPriceRequestWrapper requestWrapper);

    /**
     * @param requestWrapperData
     * @return AirBookResponseWrapper
     */
    public AirBookResponseWrapper otaRetrievePNR(final AirReadRequestWrapper requestWrapperData);

    /**
     * @param requestWrapper
     * @return AirBookResponseWrapper
     */
    public AirBookResponseWrapper otaAirBook(final AirBookRequestWrapper requestWrapper);

    /**
     * @param airSeatMapRequestWrapper
     * @return AirSeatMapResponseWrapper
     */
    public AirSeatMapResponseWrapper otaAirSeatMap(final AirSeatMapRequestWrapper airSeatMapRequestWrapper);

    /**
     * @param request
     *            AirAvailRequestWrapper
     * @return AirAvailResponseWrapper
     */
    public AirAvailResponseWrapper otaGetAvailability(final AirAvailRequestWrapper request);

    /**
     * @param requestWrapper
     * @return AirCancelResponseWrapper
     */
    public AirCancelResponseWrapper otaAirCancel(final AirCancellRequestWrapper requestWrapper);

    /**
     * @param requestWrapper
     * @return AirCancelResponseWrapper
     */
    public AirCancelResponseWrapper otaAirCancelSplitPNR(final AirCancellRequestWrapper requestWrapper);

    /**
     * @param request
     * @return MessageQueueResponse
     */
    public MessageQueueResponseWrapper otaMessageQueue(MessageQueueRequestWrapper request);

    /**
     * @param requestWrapper
     * @return AirRuleResponseWrapper
     */
    public AirRuleResponseWrapper otaAirFareRules(AirRulesRequestWrapper requestWrapper);

    /**
     * @param request
     * @return AirBookResponseWrapper
     */
    public AirBookResponseWrapper otaAirBookModifyUpdatePNR(final AirBookModifyRequestWrapper request);

    /**
     * @param request
     * @return AirRemoveMessageQueueResponse
     */
    public AirRemoveMessageQueueResponseWrapper otaRemoveMessageQueue(final AirRemoveMessageQueueRequestWrapper request);

    /**
     * @param request
     * @return AirPushSSRResponseWrapper
     */
    public AirPushSSRResponseWrapper otaAirBookModifySellBySSR(final AirPushSSRRequestWrapper request);

    /**
     * @param request
     * @return AirPushSeatResponseWrapper
     */
    public AirPushSeatResponseWrapper otaAirBookModifyAssignSeat(final AirPushSeatRequestWrapper request);

    /**
     * @param request AirGetSSRequestWrapper
     * @return AirGetSSResponseWrapper
     */
    public AirGetSSResponseWrapper otaAirGetSSR(final AirGetSSRRequestWrapper request);

}
