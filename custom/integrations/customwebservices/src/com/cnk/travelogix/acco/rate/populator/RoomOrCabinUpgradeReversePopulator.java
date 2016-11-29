package com.cnk.travelogix.acco.rate.populator;

import com.cnk.travelogix.datamodel.supplier.rates.roomorcabinupgrade.model.RoomOrCabinUpgradeModel;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.rate.acco.data.RoomOrCabinUpgradeData;
import com.cnk.travelogix.supplier.rates.enums.MealPlanType;
import com.cnk.travelogix.supplier.rates.enums.UpgradeToType;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

public class RoomOrCabinUpgradeReversePopulator implements Populator<RoomOrCabinUpgradeData, RoomOrCabinUpgradeModel>{

	@Override
	public void populate(RoomOrCabinUpgradeData source, RoomOrCabinUpgradeModel target) throws ConversionException {

		target.setMinPaxOrNight(source.getMinPaxOrNight());
		target.setRoomCategory(RoomCategory.valueOf(source.getRoomCategory()));
		target.setRoomType(RoomType.valueOf(source.getRoomType()));
		target.setUpgrade(UpgradeToType.valueOf(source.getUpgrade()));
		target.setUpgradeRoomCategoryTo(RoomCategory.valueOf(source.getRoomCategory()));
		target.setUpgradeRoomType(RoomType.valueOf(source.getUpgradeRoomType()));
		//target.setUpgradeMealPlan(source.getUpgradeMealPlanType());
		target.setUpgradeMealPlan(MealPlanType.valueOf(source.getUpgradeMealPlanType()));
		target.setOfferInclusion(source.getOfferInclusion());
	}

}
