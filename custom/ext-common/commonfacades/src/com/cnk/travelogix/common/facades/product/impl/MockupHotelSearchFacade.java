/**
 *
 */
package com.cnk.travelogix.common.facades.product.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import com.cnk.travelogix.common.facades.product.CnkProductSearchFacade;
import com.cnk.travelogix.common.facades.product.data.BasePageableSearchData;
import com.cnk.travelogix.common.facades.product.data.CnkProductSearchPageData;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.util.CnkBeanUtil;
import com.thoughtworks.xstream.XStream;


/**
 * @author i313879
 *
 */
public class MockupHotelSearchFacade implements CnkProductSearchFacade<HotelData>
{

	private static final Logger LOG = Logger.getLogger(MockupHotelSearchFacade.class);

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProduct(com.cnk.travelogix.common.facades
	 * .product.data.BasePageableSearchData)
	 */
	@Override
	public CnkProductSearchPageData searchProduct(final BasePageableSearchData searchParameters)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(searchParameters));
		}
		return buildMockupSearchPageData(searchParameters);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(com.cnk.travelogix.common
	 * .facades.product.data.BasePageableSearchData)
	 */
	@Override
	public HotelData searchProductDetail(final BasePageableSearchData searchParameters)
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug(CnkBeanUtil.getString(searchParameters));
		}
		return buildHotel(searchParameters.getProductId());
	}

	private CnkProductSearchPageData buildMockupSearchPageData(final BasePageableSearchData searchData)
	{
		try
		{
			final CnkProductSearchPageData result = new CnkProductSearchPageData();
			final XStream xstream = new XStream();
			final InputStream xml1 = getClass().getResourceAsStream("/commonfacades/test/hotelData1.xml");
			final HotelData hotel1 = (HotelData) xstream.fromXML(xml1);

			final InputStream xml2 = getClass().getResourceAsStream("/commonfacades/test/hotelData2.xml");
			final HotelData hotel2 = (HotelData) xstream.fromXML(xml2);

			final InputStream xml3 = getClass().getResourceAsStream("/commonfacades/test/hotelData3.xml");
			final HotelData hotel3 = (HotelData) xstream.fromXML(xml3);

			result.setBreadcrumbs(Collections.EMPTY_LIST);
			final List<HotelData> resultHotels = new ArrayList();
			resultHotels.add(hotel1);
			resultHotels.add(hotel2);
			resultHotels.add(hotel3);
			result.setResult(resultHotels);
			result.setBestPriceRecommend(resultHotels);
			result.setPageNum(searchData.getPageNum());
			final double totalPage = Math.ceil((double) resultHotels.size() / (double) searchData.getPageSize());
			result.setTotalPage(Double.valueOf(totalPage).intValue());
			result.setTotalSize(resultHotels.size());
			result.setStartAtPrice(3000);
			//final int pageNumber = searchData.getPageNum();
			//final int pageSize = searchData.getPageSize();
			//			int fromIndex = 0;
			//			int toIndex = pageSize;
			//			if (pageNumber > 1)
			//			{
			//				fromIndex = (pageNumber - 1) * pageSize;
			//				if (pageNumber == totalPage)
			//				{
			//					toIndex = result.getResult().size();
			//				}
			//				else
			//				{
			//					toIndex = (pageNumber + 1) * pageSize;
			//				}
			//			}
			//			final List returnReuslt = result.getResult().subList(fromIndex, toIndex);
			//			result.setResult(returnReuslt);
			return result;
		}
		catch (final Exception e)
		{
			e.printStackTrace();
			return new CnkProductSearchPageData();
		}
	}

	private HotelData buildHotel(final String productId)
	{
		InputStream xml1 = null;
		try
		{
			//TODO: remove the hardcord for demo code Start
			if (productId.equals("hotel_001"))
			{
				xml1 = getClass().getResourceAsStream("/commonfacades/test/hotelData1.xml");
			}
			else if (productId.equals("hotel_002"))
			{
				xml1 = getClass().getResourceAsStream("/commonfacades/test/hotelData2.xml");
			}
			else if (productId.equals("hotel_003"))
			{
				xml1 = getClass().getResourceAsStream("/commonfacades/test/hotelData3.xml");
			}
			// remove the hardcord for demo code End

			final XStream xstream = new XStream();

			final HotelData result = (HotelData) xstream.fromXML(xml1);
			return result;
		}
		catch (final Exception e)
		{
			return new HotelData();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.common.facades.product.CnkProductSearchFacade#searchProductDetail(java.lang.String)
	 */
	@Override
	public HotelData searchProductDetail(final String productId)
	{
		return buildHotel(productId);
	}
}
