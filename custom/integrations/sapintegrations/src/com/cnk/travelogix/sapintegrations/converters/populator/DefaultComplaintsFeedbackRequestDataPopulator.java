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
package com.cnk.travelogix.sapintegrations.converters.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaints;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaintsHeader;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaintsItems;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZifTerpComplaintsPartners;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZttTerpComplaintsItems;
import com.cnk.travelogix.custom.zif.erp.ws.complaints.feedback.ZttTerpComplaintsPartners;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsDataRequest;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsHeaderData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsItemsData;
import com.cnk.travelogix.sapintegrations.zif.erp.ws.complaints.feedback.data.ZifTerpComplaintsPartnersData;


/**
 *
 */
public class DefaultComplaintsFeedbackRequestDataPopulator implements Populator<ZifTerpComplaintsDataRequest, ZifTerpComplaints>
{
	private final Logger LOG = Logger.getLogger(getClass());

	@Override
	public void populate(final ZifTerpComplaintsDataRequest source, final ZifTerpComplaints target) throws ConversionException
	{
		try
		{
			final ZifTerpComplaintsHeader complaintsHeader = new ZifTerpComplaintsHeader();
			if (source.getCompHeader() != null)
			{
				final ZifTerpComplaintsHeaderData complaintsHeaderData = source.getCompHeader();

				complaintsHeader.setCategory(complaintsHeaderData.getCategory());
				complaintsHeader.setCode(complaintsHeaderData.getCode());
				complaintsHeader.setCodegruppe(complaintsHeaderData.getCodegruppe());
				complaintsHeader.setDescription(complaintsHeaderData.getDescription());
				complaintsHeader.setKatalogart(complaintsHeaderData.getKatalogart());
				complaintsHeader.setNotes(complaintsHeaderData.getNotes());
				complaintsHeader.setProcessType(complaintsHeaderData.getProcessType());
				complaintsHeader.setReferenceDocumentNo(complaintsHeaderData.getReferenceDocumentNo());
				complaintsHeader.setServiceOrg(complaintsHeaderData.getServiceOrg());
				complaintsHeader.setServiceOrgResp(complaintsHeaderData.getServiceOrgResp());
				complaintsHeader.setUniqid(complaintsHeaderData.getUniqid());
			}
			target.setCompHeader(complaintsHeader);

			final ZttTerpComplaintsItems complaintsItems = new ZttTerpComplaintsItems();
			if (source.getCompItem() != null)
			{
				final List<ZifTerpComplaintsItemsData> srcComplaintsItemsDataLst = source.getCompItem().getItem();
				final List<ZifTerpComplaintsItems> targetComplaintsItemsLst = complaintsItems.getItem();
				for (final ZifTerpComplaintsItemsData zifTerpComplaintsItemsData : srcComplaintsItemsDataLst)
				{
					final ZifTerpComplaintsItems item = new ZifTerpComplaintsItems();
					item.setCategory(zifTerpComplaintsItemsData.getCategory());
					item.setItemNumber(zifTerpComplaintsItemsData.getItemNumber());
					item.setMaterial(zifTerpComplaintsItemsData.getMaterial());
					targetComplaintsItemsLst.add(item);
				}
			}
			target.setCompItem(complaintsItems);

			final ZttTerpComplaintsPartners targetComplaintsPartners = new ZttTerpComplaintsPartners();
			if (source.getCompPartners() != null)
			{
				final List<ZifTerpComplaintsPartnersData> srcComplaintsPartnersData = source.getCompPartners().getItem();
				final List<ZifTerpComplaintsPartners> targetPartners = targetComplaintsPartners.getItem();
				for (final ZifTerpComplaintsPartnersData zifTerpComplaintsPartnersData : srcComplaintsPartnersData)
				{
					final ZifTerpComplaintsPartners targetPartner = new ZifTerpComplaintsPartners();
					targetPartner.setItmNumber(zifTerpComplaintsPartnersData.getItmNumber());
					targetPartner.setPartnerFunction(zifTerpComplaintsPartnersData.getPartnerFunction());
					targetPartner.setPartnNumb(zifTerpComplaintsPartnersData.getPartnNumb());
					targetPartners.add(targetPartner);
				}

			}
			target.setCompPartners(targetComplaintsPartners);
		}
		catch (final Exception e)
		{
			LOG.error(e.getMessage(), e);
		}
	}
}
