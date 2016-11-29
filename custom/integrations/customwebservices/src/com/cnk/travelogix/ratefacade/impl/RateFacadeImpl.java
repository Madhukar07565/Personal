package com.cnk.travelogix.ratefacade.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.cnk.travelogix.acco.rate.populator.AccoRateDetailDefinitionReversePopulator;
import com.cnk.travelogix.acco.rate.populator.AccoSurchargeSuppDetailReversePopulator;
import com.cnk.travelogix.acco.rate.populator.AccomodationRateDefinitionReversePopulator;
import com.cnk.travelogix.acco.rate.populator.AccomodationSupplierRateReversePopulator;
import com.cnk.travelogix.acco.rate.populator.AncillaryDiscountReversePopulator;
import com.cnk.travelogix.acco.rate.populator.AncillaryFOCReversePopulator;
import com.cnk.travelogix.acco.rate.populator.ComplimentaryReversePopulator;
import com.cnk.travelogix.acco.rate.populator.DiscountLongStayReversePopulator;
import com.cnk.travelogix.acco.rate.populator.DiscountOnFreeNightReversePopulator;
import com.cnk.travelogix.acco.rate.populator.DiscountOnNightReversePopulator;
import com.cnk.travelogix.acco.rate.populator.DiscountOnPaxReversePopulator;
import com.cnk.travelogix.acco.rate.populator.DiscountOnRateReversePopulator;
import com.cnk.travelogix.acco.rate.populator.DiscountOnRoomOrCabinReversePopulator;
import com.cnk.travelogix.acco.rate.populator.DiscountPerAgeReversePopulator;
import com.cnk.travelogix.acco.rate.populator.FOCOfferReversePopulator;
import com.cnk.travelogix.acco.rate.populator.FullPrePaymentReversePopulator;
import com.cnk.travelogix.acco.rate.populator.PassengerLevelSurchargeDetailReversePopulator;
import com.cnk.travelogix.acco.rate.populator.RatePaymentDetailReversePopulator;
import com.cnk.travelogix.acco.rate.populator.RoomOrCabinUpgradeReversePopulator;
import com.cnk.travelogix.datamodel.supplier.rates.ancillarydiscount.model.AncillaryDiscountModel;
import com.cnk.travelogix.datamodel.supplier.rates.ancillaryfOC.model.AncillaryFOCModel;
import com.cnk.travelogix.datamodel.supplier.rates.complimentary.model.ComplimentaryModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountlongstay.model.DiscountLongStayModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonfreenight.model.DiscountOnFreeNightModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonnight.model.DiscountOnNightModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonpax.model.DiscountOnPaxModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonrate.model.DiscountOnRateModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountonroomorcabin.model.DiscountOnRoomOrCabinModel;
import com.cnk.travelogix.datamodel.supplier.rates.discountperage.model.DiscountPerAgeModel;
import com.cnk.travelogix.datamodel.supplier.rates.fOCoffer.model.FOCOfferModel;
import com.cnk.travelogix.datamodel.supplier.rates.roomorcabinupgrade.model.RoomOrCabinUpgradeModel;
import com.cnk.travelogix.masterdata.core.category.model.ProductCategorySubTypeModel;
import com.cnk.travelogix.masterdata.core.enums.ClientType;
import com.cnk.travelogix.masterdata.core.enums.PaxType;
import com.cnk.travelogix.masterdata.core.enums.RoomCategory;
import com.cnk.travelogix.masterdata.core.enums.RoomType;
import com.cnk.travelogix.masterdata.core.proucts.model.RateTypeModel;
import com.cnk.travelogix.rate.acco.data.AbstractTravelogixSupplierOfferData;
import com.cnk.travelogix.rate.acco.data.AccoRateDetailDefinitionData;
import com.cnk.travelogix.rate.acco.data.AccoSurchargeSuppDetailData;
import com.cnk.travelogix.rate.acco.data.AccommodationRateDefinitionData;
import com.cnk.travelogix.rate.acco.data.AccomodationSupplierRateData;
import com.cnk.travelogix.rate.acco.data.AncillaryDiscountData;
import com.cnk.travelogix.rate.acco.data.AncillaryFOCData;
import com.cnk.travelogix.rate.acco.data.ComplimentaryData;
import com.cnk.travelogix.rate.acco.data.DiscountLongStayData;
import com.cnk.travelogix.rate.acco.data.DiscountOnFreeNightData;
import com.cnk.travelogix.rate.acco.data.DiscountOnNightData;
import com.cnk.travelogix.rate.acco.data.DiscountOnPaxData;
import com.cnk.travelogix.rate.acco.data.DiscountOnRateData;
import com.cnk.travelogix.rate.acco.data.DiscountOnRoomOrCabinData;
import com.cnk.travelogix.rate.acco.data.DiscountPerAgeData;
import com.cnk.travelogix.rate.acco.data.FOCOfferData;
import com.cnk.travelogix.rate.acco.data.FullPrePaymentData;
import com.cnk.travelogix.rate.acco.data.PartPrePaymentData;
import com.cnk.travelogix.rate.acco.data.PassengerLevelSurchargeDetailData;
import com.cnk.travelogix.rate.acco.data.RatePaymentDetailData;
import com.cnk.travelogix.rate.acco.data.RoomOrCabinUpgradeData;
import com.cnk.travelogix.rate.acco.data.SeasonDetailData;
import com.cnk.travelogix.rate.acco.data.TaxData;
import com.cnk.travelogix.rate.acco.data.UpdateRateResponseData;
import com.cnk.travelogix.rate.facade.RateFacade;
import com.cnk.travelogix.supplier.core.market.model.SupplierMarketModel;
import com.cnk.travelogix.supplier.core.supplier.model.SupplierModel;
import com.cnk.travelogix.supplier.masters.core.enums.RatesDefinedForType;
import com.cnk.travelogix.supplier.masters.core.enums.SeasonType;
import com.cnk.travelogix.supplier.rates.enums.DiscountCalculatedOnType;
import com.cnk.travelogix.supplier.rates.enums.MealPlanType;
import com.cnk.travelogix.supplier.rates.enums.PriceApplicabilityType;
import com.cnk.travelogix.supplier.rates.enums.RateApplicabilityType;
import com.cnk.travelogix.supplier.rates.enums.RateFor;
import com.cnk.travelogix.supplier.rates.enums.UpgradeToType;
import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationRateDefinitionModel;
import com.cnk.travelogix.supplier.rates.model.supplierrates.accommodation.AccommodationSupplierRateModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.accommodation.AccoRateDetailDefinitionModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.accommodation.AccoSurchargeSuppDetailModel;
//import com.cnk.travelogix.supplier.rates.supplierrate.model.common.FullPrePaymentModel;
//import com.cnk.travelogix.supplier.rates.supplierrate.model.common.PartPrePaymentModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.PassengerLevelSurchargeDetailModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.RatePaymentDetailModel;
import com.cnk.travelogix.supplier.rates.supplierrate.model.common.SeasonDetailModel;
import com.cnk.travelogix.supplier.updaterate.service.impl.DefaultUpdateRateService;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.order.price.TaxModel;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.ModelNotFoundException;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.util.StandardDateRange;

/**
 * This facade class manages Rate related functionalities
 * 
 * @author I077322
 * 
 */
public class RateFacadeImpl implements RateFacade {

	private static final Logger LOG = Logger.getLogger(RateFacadeImpl.class);

	@Resource(name = "flexibleSearchService")
	private FlexibleSearchService flexibleSearchService;

	@Resource(name = "defaultUpdateRateService")
	private DefaultUpdateRateService defaultUpdateRateService;

	@Resource(name = "modelService")
	ModelService modelService;

	@Resource(name = "accomodationSupplierRate")
	AccomodationSupplierRateReversePopulator accomodationSupplierRate;

	@Resource(name = "accomodationRateDefinition")
	AccomodationRateDefinitionReversePopulator accomodationRateDefinitionReversePopulator;

	@Resource(name = "accoRateDetailDefinition")
	AccoRateDetailDefinitionReversePopulator accoRateDetailDefinitionReversePopulator;

	@Resource(name = "accoSurchargeSuppDetail")
	AccoSurchargeSuppDetailReversePopulator accoSurchargeSuppDetailReversePopulator;
	@Resource(name = "fullPrePayment")
	FullPrePaymentReversePopulator fullPrePaymentReversePopulator;

	@Resource(name = "passengerLevelSurchargeDetail")
	PassengerLevelSurchargeDetailReversePopulator passengerLevelSurchargeDetailPopulator;

	@Resource(name = "complimentary")
	ComplimentaryReversePopulator complimentaryReversePopulator;
	@Resource(name = "fOCOffer")
	FOCOfferReversePopulator fOCOfferReversePopulator;

	@Resource(name = "ancillaryDiscount")
	AncillaryDiscountReversePopulator ancillaryDiscountReversePopulator;

	@Resource(name = "ancillaryFOC")
	AncillaryFOCReversePopulator ancillaryFOCReversePopulator;
	@Resource(name = "discountOnRate")
	DiscountOnRateReversePopulator discountOnRateReversePopulator;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;

	@Resource(name = "catalogVersionService")
	CatalogVersionService catalogVersionService;
	@Resource(name = "discountPerAge")
	DiscountPerAgeReversePopulator discountPerAgeReversePopulator;
	@Resource(name = "discountLongStay")
	DiscountLongStayReversePopulator discountLongStayReversePopulator;

	@Resource(name = "discountOnNight")
	DiscountOnNightReversePopulator discountOnNightReversePopulator;

	@Resource(name = "discountOnFreeNight")
	DiscountOnFreeNightReversePopulator discountOnFreeNightReversePopulator;

	@Resource(name = "discountOnRoomOrCabin")
	DiscountOnRoomOrCabinReversePopulator discountOnRoomOrCabinReversePopulator;

	@Resource(name = "discountOnPax")
	DiscountOnPaxReversePopulator discountOnPaxReversePopulator;

	@Resource(name = "roomOrCabinUpgrade")
	RoomOrCabinUpgradeReversePopulator roomOrCabinUpgradeReversePopulator;

	@Resource(name = "ratePaymentPopulator")
	RatePaymentDetailReversePopulator ratePaymentDetailReversePopulator;

	@Resource(name = "ratePaymentDetailReverseConverter")
	private Converter<RatePaymentDetailData, RatePaymentDetailModel> ratePaymentDetailReverseConverter;

	@Override
	public UpdateRateResponseData updateRate(String supplierId, AccomodationSupplierRateData accoSupplierRateData) {
		LOG.info("#updateRate - Start");
		final UpdateRateResponseData response = new UpdateRateResponseData();

		AccommodationSupplierRateModel accommodationSupplierRateModel = defaultUpdateRateService
				.fetchAccommodationSupplierRate(accoSupplierRateData.getProduct(), accoSupplierRateData.getMarket());

		if (null != accommodationSupplierRateModel) {

			if (accoSupplierRateData.getActive()) {
				accommodationSupplierRateModel.setActive(false);
				accomodationSupplierRate.populate(accoSupplierRateData, accommodationSupplierRateModel);
				modelService.save(accommodationSupplierRateModel);
			}

			else {
				AccommodationSupplierRateModel accomodationSupplierRateNewModel = new AccommodationSupplierRateModel();
				accomodationSupplierRate.populate(accoSupplierRateData, accomodationSupplierRateNewModel);
				modelService.save(accomodationSupplierRateNewModel);

				
 
							}
			
			TaxData taxData = accoSupplierRateData.getTax();

			 getTaxData(taxData,accoSupplierRateData);
			 
			 List<SeasonDetailData> seasonDetailDataList = accoSupplierRateData.getSeasonDetails();
				for (SeasonDetailData seasonDetailData : seasonDetailDataList) {

					insertSaveSeasonDetail(accoSupplierRateData, seasonDetailData);

				}
			getAccoRateDefinition(accoSupplierRateData);

		}
		
		
		
		else {

			AccommodationSupplierRateModel accommodationSupplierRateNewModel = modelService
					.create(AccommodationSupplierRateModel.class);
			AccomodationSupplierRateData accomodationSupplierRateData = new AccomodationSupplierRateData();
			accommodationSupplierRateNewModel.setCatalogVersion(getCatalogVersion());
			accommodationSupplierRateNewModel.setProductSubCategory(getProductCatalogSubType("C001ST001"));
		//	accommodationSupplierRateNewModel.setActiveDateRange(getStandardRateRange("19-07-2016", "20-07-2016"));
			accommodationSupplierRateNewModel.setActiveDateRange(new Date("19-07-2016"));
			accommodationSupplierRateNewModel.setCurrency(getCurrencyModel("ETB"));
			accommodationSupplierRateNewModel.setMarket(getSupplierMarket("Indonesia"));
			accommodationSupplierRateNewModel.setSupplier(getSupplier("1234533"));
			accommodationSupplierRateNewModel.setValidity(getStandardRateRange("19-07-2016", "20-07-2016"));
			accomodationSupplierRate.populate(accomodationSupplierRateData, accommodationSupplierRateNewModel);
			modelService.save(accommodationSupplierRateNewModel);

		}

		LOG.info("#updateRate - Finish");
		return response;
	}
	
	
	public void getTaxData(TaxData taxData,AccomodationSupplierRateData accoSupplierRateData)
	{
		if (null != taxData) {

			TaxModel taxModel = defaultUpdateRateService.fetchTaxRow(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), taxData.getValue());

			if (null != taxModel) {

				taxModel.setName(taxData.getName());
				modelService.save(taxModel);
			} else {

				TaxModel taxNewModel = modelService.create(TaxModel.class);

				taxNewModel.setCode(taxData.getCode());
				taxNewModel.setName(taxData.getName());
				taxNewModel.setValue(taxData.getValue());

				modelService.save(taxNewModel);

			}
	}
	}
	
	public void getAccoRateDefinition(AccomodationSupplierRateData accoSupplierRateData)
	{

	List<AccommodationRateDefinitionData> accomRateDefinitionList = accoSupplierRateData
			.getAccomodationRateDefinition();

	for (AccommodationRateDefinitionData accommodationRateDefinitionData : accomRateDefinitionList) {

		AccommodationRateDefinitionModel accommodationRateDefinitionModel = defaultUpdateRateService
				.fetchAccommodationRateDefinition(accoSupplierRateData.getProduct(),
						accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms());

		if (null != accommodationRateDefinitionModel) {

			accomodationRateDefinitionReversePopulator.populate(accommodationRateDefinitionData,
					accommodationRateDefinitionModel);
			modelService.save(accommodationRateDefinitionModel);

		} else {

			AccommodationRateDefinitionModel accommodationRateDefinition = modelService
					.create(AccommodationRateDefinitionModel.class);

			accommodationRateDefinition.setClientType(ClientType.B2B);
			accommodationRateDefinition.setCompanyType(getRateTypeModel("1853"));
			accommodationRateDefinition.setPriceApplicability(PriceApplicabilityType.PER_PERSON);
			accommodationRateDefinition.setRateTypeApplicableFor(RateApplicabilityType.PACKAGE);
			accommodationRateDefinition.setNoOfRooms(accommodationRateDefinitionData.getNoOfRooms());
			accomodationRateDefinitionReversePopulator.populate(accommodationRateDefinitionData,
					accommodationRateDefinition);
			modelService.save(accommodationRateDefinition);
		}

		Collection<FullPrePaymentData> fullPrePaymentDataList = accommodationRateDefinitionData
				.getFullPrePayment();

		for (FullPrePaymentData fullPrePaymentData : fullPrePaymentDataList) {

			RatePaymentDetailData ratePaymentDetailData = fullPrePaymentData.getRatePaymentDetail();

			saveFullPrePaymentData(accoSupplierRateData, accommodationRateDefinitionData,
					fullPrePaymentData, ratePaymentDetailData);
		}

		Collection<PartPrePaymentData> partPrePaymentDataList = accommodationRateDefinitionData
				.getPartPrePayment();

		for (PartPrePaymentData partPrePaymentData : partPrePaymentDataList) {

			List<RatePaymentDetailData> ratePaymentDetailDataList = partPrePaymentData
					.getRatePaymentDetails();
			for (RatePaymentDetailData ratePaymentDetailData : ratePaymentDetailDataList) {

				savePartPrePaymentData(accoSupplierRateData, accommodationRateDefinitionData,
						partPrePaymentData, ratePaymentDetailData);
			}

		}

		Collection<AccoSurchargeSuppDetailData> AccoSurchargeSuppDetailList = accommodationRateDefinitionData
				.getSurcharge();

		for (AccoSurchargeSuppDetailData accoSurchargeSuppDetailData : AccoSurchargeSuppDetailList) {

			saveAccoSurchargeSuppDetailData(accoSupplierRateData, accommodationRateDefinitionData,
					accoSurchargeSuppDetailData);
		}

		List<AccoRateDetailDefinitionData> accoRateDetailDefinitionDataList = accommodationRateDefinitionData
				.getAccoRateDetailDefs();
		for (AccoRateDetailDefinitionData accoRateDetailDefinitionData : accoRateDetailDefinitionDataList) {

			getAccoRateDetailDefinitionData(accoSupplierRateData, accommodationRateDefinitionData,
					accoRateDetailDefinitionData);
		}

	}

}

	public CatalogVersionModel getCatalogVersion() {
		CatalogVersionModel catalogVersionModel = null;
		try {
			catalogVersionModel = catalogVersionService.getCatalogVersion("EZ-IN", "Online");

		} catch (ModelNotFoundException me) {
			LOG.info("Error while searching model" + me.getMessage(), me);
		}
		return catalogVersionModel;
	}

	public StandardDateRange getStandardRateRange(String start, String end) {

		DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		Date startDate = null;
		Date endDate = null;

		try {
			startDate = df.parse(start);
			endDate = df.parse(end);

		} catch (ParseException e) {

			LOG.info("Error while searching get standard range " + e.getMessage(), e);

		}

		StandardDateRange sdr = new StandardDateRange(startDate, endDate);

		return sdr;

	}

	public ProductCategorySubTypeModel getProductCatalogSubType(String code) {
		ProductCategorySubTypeModel productCategorySubTypeModel = null;

		try {
			productCategorySubTypeModel = modelService.create(ProductCategorySubTypeModel.class);
			productCategorySubTypeModel.setCode(code);

			CatalogVersionModel catalogVersionModel = catalogVersionService.getCatalogVersion("EZ-IN", "Online");

			productCategorySubTypeModel.setCatalogVersion(catalogVersionModel);

			searchRestrictionService.disableSearchRestrictions();
			productCategorySubTypeModel = flexibleSearchService.getModelByExample(productCategorySubTypeModel);
			searchRestrictionService.enableSearchRestrictions();

		} catch (ModelNotFoundException me) {
			LOG.info("Error while searching productCategorySubType Model" + me.getMessage(), me);
		}
		return productCategorySubTypeModel;
	}

	public CurrencyModel getCurrencyModel(String isoCode) {
		CurrencyModel currencyModel = null;
		try {
			currencyModel = modelService.create(CurrencyModel.class);

			currencyModel.setIsocode(isoCode);
			searchRestrictionService.disableSearchRestrictions();
			currencyModel = flexibleSearchService.getModelByExample(currencyModel);
			searchRestrictionService.enableSearchRestrictions();
		} catch (ModelNotFoundException mnf) {
			LOG.info("Error while searching currency Model" + mnf.getMessage(), mnf);
		}
		return currencyModel;
	}

	public SupplierMarketModel getSupplierMarket(String code) {
		SupplierMarketModel supplierMarketModel = null;
		try {
			supplierMarketModel = modelService.create(SupplierMarketModel.class);
			supplierMarketModel.setCode(code);

			supplierMarketModel.setCatalogVersion(catalogVersionService.getCatalogVersion("EZ-IN", "Online"));
			searchRestrictionService.disableSearchRestrictions();
			supplierMarketModel = flexibleSearchService.getModelByExample(supplierMarketModel);
			searchRestrictionService.enableSearchRestrictions();
		} catch (ModelNotFoundException mnf) {
			LOG.info("Error while searching currency Model" + mnf.getMessage(), mnf);
		}
		return supplierMarketModel;
	}

	public SupplierModel getSupplier(String code)

	{
		SupplierModel supplierModel = null;
		try {
			supplierModel = modelService.create(SupplierModel.class);
			supplierModel.setCode(code);
			supplierModel.setCatalogVersion(catalogVersionService.getCatalogVersion("EZ-IN", "Online"));
			searchRestrictionService.disableSearchRestrictions();
			supplierModel = flexibleSearchService.getModelByExample(supplierModel);
			searchRestrictionService.enableSearchRestrictions();
		} catch (ModelNotFoundException mnf) {
			LOG.info("Error while searching currency Model" + mnf.getMessage(), mnf);
		}
		return supplierModel;
	}

	public RateTypeModel getRateTypeModel(String code) {

		RateTypeModel rateTypeModel = null;
		try {

			rateTypeModel = modelService.create(RateTypeModel.class);
			rateTypeModel.setCode(code);
			searchRestrictionService.disableSearchRestrictions();
			rateTypeModel = flexibleSearchService.getModelByExample(rateTypeModel);
			searchRestrictionService.enableSearchRestrictions();
		} catch (ModelNotFoundException rtm) {
			LOG.info("Error while searching ratetype Model" + rtm.getMessage(), rtm);
		}
		return rateTypeModel;

	}

	public TaxModel getTaxModel(String code) {
		TaxModel taxModel = null;

		try {

			taxModel = modelService.create(TaxModel.class);
			taxModel.setCode(code);
			searchRestrictionService.disableSearchRestrictions();
			taxModel = flexibleSearchService.getModelByExample(taxModel);
			searchRestrictionService.enableSearchRestrictions();
		} catch (ModelNotFoundException tax) {
			LOG.info("Error while searching tax Model" + tax.getMessage(), tax);
		}
		return taxModel;

	}

	public void getAccoRateDetailDefinitionData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {

		AccoRateDetailDefinitionModel accoRateDetailDefinitionModel = defaultUpdateRateService
				.fetchAccoRateDetailDefinition(accoSupplierRateData.getProduct(), accoSupplierRateData.getMarket(),
						accommodationRateDefinitionData.getNoOfRooms(), accoRateDetailDefinitionData.getMinNight());

		if (null != accoRateDetailDefinitionModel) {
			accoRateDetailDefinitionReversePopulator.populate(accoRateDetailDefinitionData,
					accoRateDetailDefinitionModel);
			modelService.save(accoRateDetailDefinitionModel);
		} else {
			AccoRateDetailDefinitionModel accoRateDetailDefinitionNewModel = modelService
					.create(AccoRateDetailDefinitionModel.class);
			accoRateDetailDefinitionNewModel.setMealPlan(MealPlanType.BB);
			accoRateDetailDefinitionNewModel.setRateDefinedFor(RatesDefinedForType.DAY_USE);
			accoRateDetailDefinitionNewModel.setRateFor(RateFor.HOTEL_PACKAGE);
			modelService.save(accoRateDetailDefinitionNewModel);
		}

		saveDiscountPerAgeData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveDiscountLongStayData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveComplimentaryData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveFocOfferData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveAncillaryFocData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveAncillaryDiscount(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveDiscountOnRateData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveDiscountOnNightData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveDiscountOnFreeNightData(accoSupplierRateData, accommodationRateDefinitionData,
				accoRateDetailDefinitionData);
		saveDiscountOnRoomOrCabinData(accoSupplierRateData, accommodationRateDefinitionData,
				accoRateDetailDefinitionData);
		saveDiscountOnPaxData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);
		saveRoomOrCabinUpgradeData(accoSupplierRateData, accommodationRateDefinitionData, accoRateDetailDefinitionData);

	}

	public void saveAccoSurchargeSuppDetailData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoSurchargeSuppDetailData accoSurchargeSuppDetailData) {
		AccoSurchargeSuppDetailModel accoSurchargeSuppDetailModel = defaultUpdateRateService.fetchAccoSurChargeDetail(
				accoSupplierRateData.getProduct(), accoSupplierRateData.getMarket(),
				accommodationRateDefinitionData.getNoOfRooms(), accoSurchargeSuppDetailData.getSurchargeID());

		if (null != accoSurchargeSuppDetailModel) {
			accoSurchargeSuppDetailReversePopulator.populate(accoSurchargeSuppDetailData, accoSurchargeSuppDetailModel);
			modelService.save(accoSurchargeSuppDetailReversePopulator);

		} else {
			AccoSurchargeSuppDetailModel accoSurchargeSuppDetailNewModel = modelService
					.create(AccoRateDetailDefinitionModel.class);
			accoSurchargeSuppDetailNewModel.setSurchargeId(accoSurchargeSuppDetailData.getSurchargeID());
			accoSurchargeSuppDetailReversePopulator.populate(accoSurchargeSuppDetailData,
					accoSurchargeSuppDetailNewModel);
			modelService.save(accoSurchargeSuppDetailNewModel);

		}

		List<PassengerLevelSurchargeDetailData> passengerLevelSurchargeDetailDataList = accoSurchargeSuppDetailData
				.getPassengerLevelSurchargeDetails();

		for (PassengerLevelSurchargeDetailData passengerLevelSurchargeDetailData : passengerLevelSurchargeDetailDataList) {

			PassengerLevelSurchargeDetailModel passengerLevelSurchargeDetailModel = defaultUpdateRateService
					.fetchPassengerLevelSurChargeDetail(accoSupplierRateData.getProduct(),
							accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
							accoSurchargeSuppDetailData.getSurchargeID(),
							passengerLevelSurchargeDetailData.getAmount());

			if (null != passengerLevelSurchargeDetailModel) {

				passengerLevelSurchargeDetailPopulator.populate(passengerLevelSurchargeDetailData,
						passengerLevelSurchargeDetailModel);

				modelService.save(passengerLevelSurchargeDetailModel);
			} else {
				PassengerLevelSurchargeDetailModel passengerLevelSurchargeDetailNewModel = modelService
						.create(PassengerLevelSurchargeDetailModel.class);
				passengerLevelSurchargeDetailNewModel.setAmount(passengerLevelSurchargeDetailData.getAmount());
				passengerLevelSurchargeDetailNewModel
						.setStdCommissionValue(passengerLevelSurchargeDetailData.getStdCommissionValue());
				passengerLevelSurchargeDetailPopulator.populate(passengerLevelSurchargeDetailData,
						passengerLevelSurchargeDetailNewModel);
				modelService.save(passengerLevelSurchargeDetailNewModel);
			}
		}

	}

	public void saveFullPrePaymentData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData, FullPrePaymentData fullPrePaymentData,
			RatePaymentDetailData ratePaymentDetailData) {

	/*	FullPrePaymentModel fullPrePaymentModel = defaultUpdateRateService.fetchFullPrePayment(
				accoSupplierRateData.getProduct(), accoSupplierRateData.getMarket(),
				accommodationRateDefinitionData.getNoOfRooms(), ratePaymentDetailData.getPayablePercentage());
*/
//		if (null != fullPrePaymentModel) {
//
//			RatePaymentDetailData ratePaymentDetData = fullPrePaymentData.getRatePaymentDetail();
//			ratePaymentDetailReversePopulator.populate(ratePaymentDetData, fullPrePaymentModel.getRatePaymentDetail());
//			modelService.save(fullPrePaymentReversePopulator);
//
//		} else {
//			//FullPrePaymentModel fullPrePaymentNewModel = modelService.create(FullPrePaymentModel.class);
//
////			ratePaymentDetailReversePopulator.populate(fullPrePaymentData.getRatePaymentDetail(),
////					fullPrePaymentNewModel.getRatePaymentDetail());
////
////			modelService.save(fullPrePaymentNewModel);
//		}

	}

	public void savePartPrePaymentData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData, PartPrePaymentData partPrePaymentData,
			RatePaymentDetailData ratePaymentDetailData) {

		/*PartPrePaymentModel partPrePaymentModel = defaultUpdateRateService.fetchPartPrePayment(
				accoSupplierRateData.getProduct(), accoSupplierRateData.getMarket(),
				accommodationRateDefinitionData.getNoOfRooms(), ratePaymentDetailData.getPayablePercentage());

		if (null != partPrePaymentModel) {

			List<RatePaymentDetailData> ratePaymentDetailDataList = partPrePaymentData.getRatePaymentDetails();

			for (RatePaymentDetailData ratePaymentDetData : ratePaymentDetailDataList) {

				Set<RatePaymentDetailModel>   ratePaymentDetailModelList= partPrePaymentModel.getRatePaymentDetails();
				populatePaymentDate(ratePaymentDetailModelList,ratePaymentDetData);

			}
		} else {
			List<RatePaymentDetailModel> ratePaymentDetailList = Converters
					.convertAll(partPrePaymentData.getRatePaymentDetails(), ratePaymentDetailReverseConverter);

			modelService.saveAll(ratePaymentDetailList);
		}*/
	}

	
	public void populatePaymentDate(Set<RatePaymentDetailModel>   ratePaymentDetailModelList,RatePaymentDetailData ratePaymentDetData)
	{
		for (RatePaymentDetailModel ratePaymentDetailModel : ratePaymentDetailModelList) {

			if (ratePaymentDetailModel.getRemarks().equals(ratePaymentDetData.getRemarks())) {
				ratePaymentDetailReversePopulator.populate(ratePaymentDetData, ratePaymentDetailModel);

				modelService.save(ratePaymentDetailModel);
				break;
			}
		}
	}
	public void insertSaveSeasonDetail(AccomodationSupplierRateData accomodationSupplierRateData,
			SeasonDetailData seasonDetailData) {
		SeasonDetailModel seasonDetailModel = defaultUpdateRateService.fetchSeasonDetail2AbsSuppRate(
				accomodationSupplierRateData.getProduct(), accomodationSupplierRateData.getMarket(), "");

		if (null == seasonDetailModel) {
			SeasonDetailModel seasonDetailNewModel = modelService.create(SeasonDetailModel.class);
			seasonDetailNewModel.setSeasonality(SeasonType.HIGH_SEASON.toString());
			modelService.save(seasonDetailNewModel);
		}
	}

	// Discount per age data
	public void saveDiscountPerAgeData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			DiscountPerAgeModel discountPerAgeModel;
			DiscountPerAgeData discountPerAgeData = null;
			if (abstractTravelogixSupplierOfferData instanceof DiscountPerAgeData) {
				discountPerAgeData = (DiscountPerAgeData) abstractTravelogixSupplierOfferData;
			}
			discountPerAgeModel = defaultUpdateRateService.fetchDiscountPerAgeDetail(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != discountPerAgeModel) {
				discountPerAgeReversePopulator.populate(discountPerAgeData, discountPerAgeModel);
				modelService.save(discountPerAgeModel);
			} else {
				DiscountPerAgeModel discountPerAgeNewModel = modelService.create(DiscountPerAgeModel.class);
				discountPerAgeNewModel.setDiscountValue(abstractTravelogixSupplierOfferData.getDiscountValue());
				discountPerAgeReversePopulator.populate(discountPerAgeData, discountPerAgeNewModel);
				modelService.save(discountPerAgeNewModel);
			}

		}
	}

	// Discountlongstaydata
	public void saveDiscountLongStayData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			DiscountLongStayModel discountLongStayModel;
			DiscountLongStayData discountLongStayData = null;
			if (abstractTravelogixSupplierOfferData instanceof DiscountLongStayData) {
				discountLongStayData = (DiscountLongStayData) abstractTravelogixSupplierOfferData;
			}
			discountLongStayModel = defaultUpdateRateService.fetchDiscountLongStay(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != discountLongStayModel) {
				discountLongStayReversePopulator.populate(discountLongStayData, discountLongStayModel);

				modelService.save(discountLongStayModel);
			} else {
				DiscountLongStayModel discountLongStayNewModel = modelService.create(DiscountLongStayModel.class);
				if (null != discountLongStayData) {
					discountLongStayNewModel.setCode(discountLongStayData.getCode());
				
				discountLongStayNewModel.setSupplier(getSupplier("1234533"));

				discountLongStayNewModel.setPassengerType(PaxType.CHILD);
				discountLongStayNewModel.setDiscountCalculatedOn(DiscountCalculatedOnType.LOWEST_RATE);
				discountLongStayNewModel.setDiscountValue(discountLongStayData.getDiscountValue());
				}
				discountLongStayReversePopulator.populate(discountLongStayData, discountLongStayNewModel);
				modelService.save(discountLongStayNewModel);
			}

		}
	}

	// Complimentary Data
	public void saveComplimentaryData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			ComplimentaryModel complimentaryModel;
			ComplimentaryData complimentaryData = null;
			if (abstractTravelogixSupplierOfferData instanceof ComplimentaryData) {
				complimentaryData = (ComplimentaryData) abstractTravelogixSupplierOfferData;
			}
			complimentaryModel = defaultUpdateRateService.fetchComplimentary(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != complimentaryModel) {
				complimentaryReversePopulator.populate(complimentaryData, complimentaryModel);

				modelService.save(complimentaryModel);
			} else {
				ComplimentaryModel complimentaryNewModel = modelService.create(ComplimentaryModel.class);
				if (null != complimentaryData) {
					complimentaryNewModel.setCode(complimentaryData.getCode());
				
				complimentaryNewModel.setSupplier(getSupplier(complimentaryData.getSupplier().getCode()));
				complimentaryNewModel.setPassengerType(PaxType.CHILD);
				}
				complimentaryReversePopulator.populate(complimentaryData, complimentaryNewModel);
				modelService.save(complimentaryNewModel);
			}

		}
	}

	// FocOffer Data
	public void saveAncillaryFocData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			AncillaryFOCModel ancillaryFOCModel;
			AncillaryFOCData ancillaryFOCData = null;
			if (abstractTravelogixSupplierOfferData instanceof AncillaryFOCData) {
				ancillaryFOCData = (AncillaryFOCData) abstractTravelogixSupplierOfferData;
			}
			ancillaryFOCModel = defaultUpdateRateService.fetchAncillaryFOC(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != ancillaryFOCModel) {
				ancillaryFOCReversePopulator.populate(ancillaryFOCData, ancillaryFOCModel);
				modelService.save(ancillaryFOCModel);
			} else {
				AncillaryFOCModel ancillaryFOCNewModel = modelService.create(AncillaryFOCModel.class);
				if (null != ancillaryFOCData) {
					ancillaryFOCNewModel.setCode(ancillaryFOCData.getCode());
				
				ancillaryFOCNewModel.setSupplier(getSupplier(ancillaryFOCData.getSupplier().getCode()));

				ancillaryFOCNewModel.setDiscountValue(ancillaryFOCData.getDiscountValue());
				}
				ancillaryFOCReversePopulator.populate(ancillaryFOCData, ancillaryFOCModel);
				modelService.save(ancillaryFOCNewModel);
			}

		}
	}

	// FocOffer Data
	public void saveFocOfferData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			FOCOfferModel focOfferModel;
			FOCOfferData fOCOfferData = null;
			if (abstractTravelogixSupplierOfferData instanceof FOCOfferData) {
				fOCOfferData = (FOCOfferData) abstractTravelogixSupplierOfferData;
			}
			focOfferModel = defaultUpdateRateService.fetchFocOffer(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != focOfferModel) {
				fOCOfferReversePopulator.populate(fOCOfferData, focOfferModel);
				modelService.save(focOfferModel);
			} else {
				FOCOfferModel fOCOfferNewModel = modelService.create(FOCOfferModel.class);
				if (fOCOfferData != null) {
					fOCOfferNewModel.setCode(fOCOfferData.getCode());
				

				fOCOfferNewModel.setSupplier(getSupplier(fOCOfferData.getSupplier().getCode()));
				fOCOfferNewModel.setPassengerType(PaxType.CHILD);

				fOCOfferNewModel.setDiscountValue(fOCOfferData.getDiscountValue());
				}
				fOCOfferReversePopulator.populate(fOCOfferData, fOCOfferNewModel);
				modelService.save(fOCOfferNewModel);
			}

		}
	}

	// AncillaryDiscount Data
	public void saveAncillaryDiscount(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			AncillaryDiscountModel ancillaryDiscountModel;
			AncillaryDiscountData ancillaryDiscountData = null;
			if (abstractTravelogixSupplierOfferData instanceof AncillaryDiscountData) {
				ancillaryDiscountData = (AncillaryDiscountData) abstractTravelogixSupplierOfferData;
			}
			ancillaryDiscountModel = defaultUpdateRateService.fetchAncillaryDiscount(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != ancillaryDiscountModel) {
				ancillaryDiscountReversePopulator.populate(ancillaryDiscountData, ancillaryDiscountModel);
				modelService.save(ancillaryDiscountModel);
			} else {
				AncillaryDiscountModel ancillaryDiscountNewModel = modelService.create(AncillaryDiscountModel.class);
				if (ancillaryDiscountData != null) {
					ancillaryDiscountNewModel.setCode(ancillaryDiscountData.getCode());
				

				ancillaryDiscountNewModel.setSupplier(getSupplier(ancillaryDiscountData.getSupplier().getCode()));
				ancillaryDiscountNewModel.setBookingCount(ancillaryDiscountData.getBookingCount());
				ancillaryDiscountNewModel.setDiscountedBooking(ancillaryDiscountData.getDiscountedBooking());
				ancillaryDiscountNewModel.setDiscountValue(ancillaryDiscountData.getDiscountValue());
				}
				ancillaryDiscountReversePopulator.populate(ancillaryDiscountData, ancillaryDiscountNewModel);
				modelService.save(ancillaryDiscountNewModel);
			}

		}
	}

	// DiscountOnNight
	public void saveDiscountOnNightData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			DiscountOnNightData discountOnNightData = null;
			DiscountOnNightModel discountOnNightModel;
			if (abstractTravelogixSupplierOfferData instanceof DiscountOnNightData) {
				discountOnNightData = (DiscountOnNightData) abstractTravelogixSupplierOfferData;
			}
			discountOnNightModel = defaultUpdateRateService.fetchDiscountOnNight(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != discountOnNightModel) {
				discountOnNightReversePopulator.populate(discountOnNightData, discountOnNightModel);
				modelService.save(discountOnNightModel);
			} else {
				DiscountOnNightModel discountOnNightNewModel = modelService.create(DiscountOnNightModel.class);
				if (null != discountOnNightData) {
					discountOnNightNewModel.setCode(discountOnNightData.getCode());
				
				discountOnNightNewModel.setSupplier(getSupplier(discountOnNightData.getSupplier().getCode()));
				discountOnNightNewModel.setDiscountCalculatedOn(DiscountCalculatedOnType.LOWEST_RATE);
				discountOnNightNewModel.setDiscountValue(discountOnNightData.getDiscountValue());
				discountOnNightNewModel.setMealPlanForDiscountedNights(MealPlanType.BB);
				discountOnNightNewModel.setNoOfDiscountedNights(discountOnNightData.getNoOfDiscountedNights());
				discountOnNightNewModel.setPassengerType(PaxType.CHILD);
				}
				discountOnNightReversePopulator.populate(discountOnNightData, discountOnNightNewModel);
				modelService.save(discountOnNightNewModel);
			}

		}
	}

	/* DiscountOn RateModel */
	public void saveDiscountOnRateData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			DiscountOnRateModel discountOnRateModel;
			DiscountOnRateData discountOnRateData = null;
			if (abstractTravelogixSupplierOfferData instanceof DiscountOnRateData) {
				discountOnRateData = (DiscountOnRateData) abstractTravelogixSupplierOfferData;
			}
			discountOnRateModel = defaultUpdateRateService.fetchDiscountOnRate(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != discountOnRateModel) {
				discountOnRateReversePopulator.populate(discountOnRateData, discountOnRateModel);
				modelService.save(discountOnRateModel);
			} else {
				DiscountOnRateModel discountOnRateNewModel = modelService.create(DiscountOnRateModel.class);
				if (null != discountOnRateData) {
					discountOnRateNewModel.setCode(discountOnRateData.getCode());
				
				discountOnRateNewModel.setSupplier(getSupplier(discountOnRateData.getSupplier().getCode()));
				discountOnRateNewModel.setDiscountCalculatedOn(DiscountCalculatedOnType.LOWEST_RATE);
				discountOnRateNewModel.setDiscountValue(discountOnRateData.getDiscountValue());
				discountOnRateNewModel.setPassengerType(PaxType.CHILD);
				}
				discountOnRateReversePopulator.populate(discountOnRateData, discountOnRateNewModel);
				modelService.save(discountOnRateNewModel);
			}

		}
	}

	public void saveDiscountOnFreeNightData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			DiscountOnFreeNightData discountOnFreeNightData = null;
			DiscountOnFreeNightModel discountOnFreeNightModel;
			if (abstractTravelogixSupplierOfferData instanceof DiscountOnFreeNightData) {
				discountOnFreeNightData = (DiscountOnFreeNightData) abstractTravelogixSupplierOfferData;
			}
			discountOnFreeNightModel = defaultUpdateRateService.fetchDiscountOnFreeNight(
					accoSupplierRateData.getProduct(), accoSupplierRateData.getMarket(),
					accommodationRateDefinitionData.getNoOfRooms(), accoRateDetailDefinitionData.getMinNight(),
					abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != discountOnFreeNightModel) {
				discountOnFreeNightReversePopulator.populate(discountOnFreeNightData, discountOnFreeNightModel);
				modelService.save(discountOnFreeNightModel);
			} else {
				DiscountOnFreeNightModel discountOnFreeNightNewModel = modelService
						.create(DiscountOnFreeNightModel.class);
				if (null != discountOnFreeNightData) {
					discountOnFreeNightNewModel.setCode(discountOnFreeNightData.getCode());
				
				discountOnFreeNightNewModel.setSupplier(getSupplier(discountOnFreeNightData.getSupplier().getCode()));
				discountOnFreeNightNewModel.setFreeNightCalculatedOn(DiscountCalculatedOnType.LOWEST_RATE);

				discountOnFreeNightNewModel.setMealPlansForFreeNight(MealPlanType.BB);
				discountOnFreeNightNewModel.setNoOfFreeNight(discountOnFreeNightData.getNoOfFreeNights());
				}
				discountOnFreeNightReversePopulator.populate(discountOnFreeNightData, discountOnFreeNightNewModel);
				modelService.save(discountOnFreeNightNewModel);
			}

		}
	}

	public void saveDiscountOnRoomOrCabinData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			DiscountOnRoomOrCabinData discountOnRoomOrCabinData = null;
			DiscountOnRoomOrCabinModel discountOnRoomOrCabinModel;
			if (abstractTravelogixSupplierOfferData instanceof DiscountOnRoomOrCabinData) {
				discountOnRoomOrCabinData = (DiscountOnRoomOrCabinData) abstractTravelogixSupplierOfferData;
			}
			discountOnRoomOrCabinModel = defaultUpdateRateService.fetchDiscountOnRoom(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != discountOnRoomOrCabinModel) {
				discountOnRoomOrCabinReversePopulator.populate(discountOnRoomOrCabinData, discountOnRoomOrCabinModel);
				modelService.save(discountOnRoomOrCabinModel);
			} else {
				DiscountOnRoomOrCabinModel discountOnRoomOrCabinNewModel = modelService
						.create(DiscountOnRoomOrCabinModel.class);
				if (null != discountOnRoomOrCabinData) {
					discountOnRoomOrCabinNewModel.setCode(discountOnRoomOrCabinData.getCode());
					discountOnRoomOrCabinNewModel
							.setSupplier(getSupplier(discountOnRoomOrCabinData.getSupplier().getCode()));
					discountOnRoomOrCabinNewModel.setBookedRoomsCount(discountOnRoomOrCabinData.getBookedRoomsCount());

					discountOnRoomOrCabinNewModel.setDiscountValue(discountOnRoomOrCabinData.getDiscountValue());
					discountOnRoomOrCabinNewModel
							.setDiscountedRoomsCount(discountOnRoomOrCabinData.getDiscountedRoomsCount());
				}
				discountOnRoomOrCabinReversePopulator.populate(discountOnRoomOrCabinData,
						discountOnRoomOrCabinNewModel);
				modelService.save(discountOnRoomOrCabinNewModel);
			}

		}
	}

	public void saveDiscountOnPaxData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			DiscountOnPaxData discountOnPaxData = null;
			DiscountOnPaxModel discountOnPaxModel;
			if (abstractTravelogixSupplierOfferData instanceof DiscountOnPaxData) {
				discountOnPaxData = (DiscountOnPaxData) abstractTravelogixSupplierOfferData;
			}
			discountOnPaxModel = defaultUpdateRateService.fetchDiscountOnPax(accoSupplierRateData.getProduct(),
					accoSupplierRateData.getMarket(), accommodationRateDefinitionData.getNoOfRooms(),
					accoRateDetailDefinitionData.getMinNight(), abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != discountOnPaxModel) {
				discountOnPaxReversePopulator.populate(discountOnPaxData, discountOnPaxModel);
				modelService.save(discountOnPaxModel);
			} else {
				DiscountOnPaxModel discountOnPaxNewModel = modelService.create(DiscountOnPaxModel.class);

				if (null != discountOnPaxData) {
					discountOnPaxNewModel.setCode(discountOnPaxData.getCode());
					discountOnPaxNewModel.setSupplier(getSupplier(discountOnPaxData.getSupplier().getCode()));
					discountOnPaxNewModel.setDiscountValue(discountOnPaxData.getDiscountValue());
					discountOnPaxNewModel.setDiscountedPaxCount(discountOnPaxData.getDiscountedPaxCount());
					discountOnPaxNewModel.setPassengerType(PaxType.CHILD);
					discountOnPaxNewModel.setPaxBookedCount(discountOnPaxData.getPaxBookedCount());
				}

				discountOnPaxReversePopulator.populate(discountOnPaxData, discountOnPaxNewModel);
				modelService.save(discountOnPaxNewModel);
			}

		}
	}

	public void saveRoomOrCabinUpgradeData(AccomodationSupplierRateData accoSupplierRateData,
			AccommodationRateDefinitionData accommodationRateDefinitionData,
			AccoRateDetailDefinitionData accoRateDetailDefinitionData) {
		List<AbstractTravelogixSupplierOfferData> abstractTravelogixSupplierOfferDataList = accoRateDetailDefinitionData
				.getTravelogixSupplierOffer();
		for (AbstractTravelogixSupplierOfferData abstractTravelogixSupplierOfferData : abstractTravelogixSupplierOfferDataList) {
			RoomOrCabinUpgradeData roomOrCabinUpgradeData = null;
			RoomOrCabinUpgradeModel roomOrCabinUpgradeModel;
			if (abstractTravelogixSupplierOfferData instanceof RoomOrCabinUpgradeData) {
				roomOrCabinUpgradeData = (RoomOrCabinUpgradeData) abstractTravelogixSupplierOfferData;
			}
			roomOrCabinUpgradeModel = defaultUpdateRateService.fetchRoomOrCabinUpgrade(
					accoSupplierRateData.getProduct(), accoSupplierRateData.getMarket(),
					accommodationRateDefinitionData.getNoOfRooms(), accoRateDetailDefinitionData.getMinNight(),
					abstractTravelogixSupplierOfferData.getDiscountValue());

			if (null != roomOrCabinUpgradeModel) {
				roomOrCabinUpgradeReversePopulator.populate(roomOrCabinUpgradeData, roomOrCabinUpgradeModel);
				modelService.save(roomOrCabinUpgradeModel);
			} else {
				RoomOrCabinUpgradeModel roomOrCabinUpgradeNewModel = modelService.create(RoomOrCabinUpgradeModel.class);
				if (null != roomOrCabinUpgradeData) {
					roomOrCabinUpgradeNewModel.setCode(roomOrCabinUpgradeData.getCode());
					roomOrCabinUpgradeNewModel.setRoomCategory(RoomCategory.DELUXE);
					roomOrCabinUpgradeNewModel.setRoomType(RoomType.DOUBLE_CABIN);
					roomOrCabinUpgradeNewModel.setSupplier(getSupplier(roomOrCabinUpgradeData.getSupplier().getCode()));
					roomOrCabinUpgradeNewModel.setUpgrade(UpgradeToType.ROOM_TYPE);
				}
				roomOrCabinUpgradeReversePopulator.populate(roomOrCabinUpgradeData, roomOrCabinUpgradeModel);
				modelService.save(roomOrCabinUpgradeModel);
			}

		}
	}

}
