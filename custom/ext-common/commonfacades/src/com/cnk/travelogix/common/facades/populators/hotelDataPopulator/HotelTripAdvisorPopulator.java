/**
 *
 */
package com.cnk.travelogix.common.facades.populators.hotelDataPopulator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntAccommodation;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntTripAdvisor;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntTripAdvisorExpectation;
import com.cnk.travelogix.common.core.storefront.svcint.dto.acco.SvcIntTripAdvisorReview;
import com.cnk.travelogix.common.facades.product.data.hotel.HotelData;
import com.cnk.travelogix.common.facades.product.data.hotel.ReviewContentData;
import com.cnk.travelogix.common.facades.product.data.hotel.ReviewData;
import com.cnk.travelogix.common.facades.product.data.hotel.TripAdvRatingData;


public class HotelTripAdvisorPopulator implements Populator<SvcIntAccommodation, HotelData>
{
	@Override
	public void populate(final SvcIntAccommodation source, final HotelData target) throws ConversionException
	{
		final SvcIntTripAdvisor tripAdvisorInfo = source.getTripAdvisorInfo();
		if (null != tripAdvisorInfo)
		{
			final ReviewData reviewData = new ReviewData();
			if (null != tripAdvisorInfo.getRating())
			{
				reviewData.setRanking(tripAdvisorInfo.getRating().toString());//set Ranking
			}

			final List<SvcIntTripAdvisorReview> reviewContentDataSource = tripAdvisorInfo.getReviewList();
			final List<ReviewContentData> reviewContentDataTargetList = new ArrayList<>();
			for (final SvcIntTripAdvisorReview svcIntTripAdvisorReview : reviewContentDataSource)
			{
				final ReviewContentData reviewContentData = new ReviewContentData();
				reviewContentData.setTitle(svcIntTripAdvisorReview.getTitle());
				reviewContentData.setAuthor(svcIntTripAdvisorReview.getAuthor());
				if (null != svcIntTripAdvisorReview.getCreationTime())
				{
					reviewContentData.setReviewDate(svcIntTripAdvisorReview.getCreationTime().toString());
				}
				reviewContentData.setContent(svcIntTripAdvisorReview.getComment());
				reviewContentDataTargetList.add(reviewContentData);
			}
			reviewData.setReviewContent(reviewContentDataTargetList);//set reviews
			reviewData.setNumReviews(tripAdvisorInfo.getCountOfReviews());//set review count
			final List<SvcIntTripAdvisorExpectation> tripAdvisorExpRatingList = tripAdvisorInfo.getExpectationList();
			final List<TripAdvRatingData> tripAdvRatingDataList = new ArrayList<TripAdvRatingData>();
			if (CollectionUtils.isNotEmpty(tripAdvRatingDataList))
			{
				for (final SvcIntTripAdvisorExpectation item : tripAdvisorExpRatingList)
				{
					final TripAdvRatingData tripAdvRatingData = new TripAdvRatingData();
					tripAdvRatingData.setRateName(item.getName());
					tripAdvRatingData.setRating(Integer.valueOf(item.getRating().intValue()));
					tripAdvRatingDataList.add(tripAdvRatingData);
				}
			}
			reviewData.setTripAdvisorRates(tripAdvRatingDataList);//set trip advisor
		}
	}
}
