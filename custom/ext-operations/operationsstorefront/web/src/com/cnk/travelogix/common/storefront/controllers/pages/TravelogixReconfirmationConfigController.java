/**
 * 
 */
package com.cnk.travelogix.common.storefront.controllers.pages;

import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.pagedata.PageableData;
import de.hybris.platform.commerceservices.search.pagedata.SearchPageData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.common.core.cart.data.SupplierData;
import com.cnk.travelogix.common.storefront.forms.ReconfirmationActivateForm;
import com.cnk.travelogix.common.storefront.forms.ReconfirmationForm;
import com.cnk.travelogix.common.storefront.forms.ReconfirmationSearchForm;
import com.cnk.travelogix.operations.data.ActivateParameterData;
import com.cnk.travelogix.operations.data.ReconfirmationConfigData;
import com.cnk.travelogix.operations.data.ReconfirmationSearchParameterData;
import com.cnk.travelogix.operations.data.TravelogixB2BUnitData;
import com.cnk.travelogix.operations.facades.TravelogixCommonDataFacade;
import com.cnk.travelogix.operations.facades.TravelogixReconfirmationConfigFacade;
import com.google.gson.Gson;


/**
 * Controller for Reconfirmation Configuration page
 * 
 * @author Shivraj
 *
 */

@Controller
@Scope("tenant")
@RequestMapping(value = "/reconfirmation")
public class TravelogixReconfirmationConfigController extends AbstractSearchPageController
{
	@Resource(name = "reconfirmationConfigFacade")
	private TravelogixReconfirmationConfigFacade reconfirmationConfigFacade;

	@Resource(name = "travelogixCommonDataFacade")
	private TravelogixCommonDataFacade travelogixCommonDataFacade;
	private static final Logger LOG = Logger.getLogger(TravelogixReconfirmationConfigController.class);

	private static final String RECONFIGURATION_VIEW_PATH_VARIABLE_PATTERN = "{rcCode:.*}";
	private static final String RECONFIGURATION_DETAIL_PAGE = "reconfirmationConfigPage";
	private static final String RECONFIGURATION_SEARCH_PAGE = "reconfirmationConfigSearchPage";
	private static final String RECONFIGURATION_FORM = "reconfirmationForm";
	
	final Gson gson = new Gson();
	
	private static Map<String, Object> commonAttribute = new HashedMap<>();

	private void init()
	{
		commonAttribute.put("confirmationFor", gson.toJson(reconfirmationConfigFacade.getConfirmationFor()));
		commonAttribute.put("clientTypes", gson.toJson(travelogixCommonDataFacade.getClientTypes()));
		commonAttribute.put("recofirmationCutOffType", gson.toJson(reconfirmationConfigFacade.getRecofirmationCutOffType()));
		commonAttribute.put("recofirmationToBeSentTo", gson.toJson(reconfirmationConfigFacade.getRecofirmationToBeSentTo()));
		commonAttribute.put("clientCategories", gson.toJson(travelogixCommonDataFacade.getClientCategory()));
		commonAttribute.put("clientSubCategories", gson.toJson(travelogixCommonDataFacade.getClientSubCategory()));
		commonAttribute.put("productCategoryAndSubCategories",
				gson.toJson(travelogixCommonDataFacade.getProductCategoryAndSubCategory()));
		commonAttribute.put("clientGroups", gson.toJson(travelogixCommonDataFacade.getClientGroupCompany()));
		commonAttribute.put("continents", gson.toJson(travelogixCommonDataFacade.getContinents()));
		commonAttribute.put("isapprover", reconfirmationConfigFacade.isReconfirmationApprover());
		commonAttribute.put("iscreator", reconfirmationConfigFacade.isReconfirmationCreator());
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(final Model model) throws CMSItemNotFoundException
	{
		init();
		model.addAllAttributes(commonAttribute);

		storeCmsPageInModel(model, getContentPageForLabelOrId(RECONFIGURATION_SEARCH_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(RECONFIGURATION_SEARCH_PAGE));

		return getViewForPage(model);
	}

	@ResponseBody
	@RequestMapping(value = "/search", method =
	{ RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
	public SearchPageData<ReconfirmationConfigData> seacrhResults(@RequestBody ReconfirmationSearchForm reconfirmationSearchForm,
			final Model model,@RequestParam(value = "page", defaultValue = "0") int page,
			@RequestParam(value = "size", defaultValue = "10") int size,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode)
	{

		final PageableData pageableData = createPageableData(page, size, sortCode, showMode);
		final SearchPageData<ReconfirmationConfigData> searchPageData = reconfirmationConfigFacade
				.getAllReconfirmationConfigs(populateSearchData(reconfirmationSearchForm), pageableData);
		model.addAllAttributes(commonAttribute);

		return searchPageData;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add(final Model model) throws CMSItemNotFoundException
	{
		final ReconfirmationForm reconfirmationForm = new ReconfirmationForm();

		model.addAttribute(RECONFIGURATION_FORM, gson.toJson(reconfirmationForm));
		init();
		model.addAllAttributes(commonAttribute);
		model.addAttribute("mode", true);

		storeCmsPageInModel(model, getContentPageForLabelOrId(RECONFIGURATION_DETAIL_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(RECONFIGURATION_DETAIL_PAGE));

		return getViewForPage(model);
	}

	@RequestMapping(value = "/view/" + RECONFIGURATION_VIEW_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String view(@PathVariable("rcCode") final String rcCode, final Model model) throws CMSItemNotFoundException
	{
		final ReconfirmationConfigData reconfirmationConfigData = reconfirmationConfigFacade.getReconfirmationConfigForCode(rcCode);
		final ReconfirmationForm reconfirmationForm = new ReconfirmationForm();

		model.addAttribute(RECONFIGURATION_FORM, reconfirmationForm);
		model.addAttribute("reconfirmationConfigData", reconfirmationConfigData);
		model.addAllAttributes(commonAttribute);

		model.addAttribute("mode", false);


		storeCmsPageInModel(model, getContentPageForLabelOrId(RECONFIGURATION_DETAIL_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(RECONFIGURATION_DETAIL_PAGE));

		return getViewForPage(model);
	}

	@RequestMapping(value = "/update/" + RECONFIGURATION_VIEW_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String updateRecord(@PathVariable("rcCode") final String rcCode, final Model model) throws CMSItemNotFoundException
	{
		final ReconfirmationConfigData reconfirmationConfigData = reconfirmationConfigFacade.getReconfirmationConfigForCode(rcCode);
		boolean lock=reconfirmationConfigFacade.lockReconfirmationRecord(reconfirmationConfigData.getCode());
		final ReconfirmationForm reconfirmationForm = new ReconfirmationForm();

		model.addAttribute(RECONFIGURATION_FORM, reconfirmationForm);
		model.addAttribute("reconfirmationConfigData", reconfirmationConfigData);
		model.addAllAttributes(commonAttribute);
		model.addAttribute("lock", lock);
		model.addAttribute("mode", "edit");


		storeCmsPageInModel(model, getContentPageForLabelOrId(RECONFIGURATION_DETAIL_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(RECONFIGURATION_DETAIL_PAGE));

		return getViewForPage(model);
	}

	@ResponseBody
	@RequestMapping(value = "/delete/" + RECONFIGURATION_VIEW_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public boolean delete(@PathVariable("rcCode") final String rcCode)
	{
		return reconfirmationConfigFacade.deleteReconfirmationRecordForCode(rcCode);
	}

	@ResponseBody
	@RequestMapping(value = "/activate", method =
	{ RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean activate(@RequestBody ReconfirmationActivateForm reconfirmationActivateForm)
	{
		ActivateParameterData activateData = populateActivateData(reconfirmationActivateForm);
		return reconfirmationConfigFacade.activateReconfirmationRecord(activateData);
	}
	
	@ResponseBody
	@RequestMapping(value = "/add-record", method =
	{ RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addRecordViaAjax(@RequestBody ReconfirmationConfigData configData)
	{
		return reconfirmationConfigFacade.addRecofirmationRecord(configData);
	}

	@ResponseBody
	@RequestMapping(value = "/update-record", method =
	{ RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateRecordViaAjax(@RequestBody ReconfirmationConfigData configData)
	{
		return reconfirmationConfigFacade.updateReconfirmationRecordForCode(configData);
	}

	@ResponseBody
	@RequestMapping(value = "/search-product", method = RequestMethod.GET)
	public List<ProductData> productForCategory(@RequestParam("subCategoryCode") final String subCategoryCode)
	{
		return travelogixCommonDataFacade.getProductsForCategory(subCategoryCode);
	}

	@ResponseBody
	@RequestMapping(value = "/search-supplier", method = RequestMethod.GET)
	public List<SupplierData> supplierForCategory(@RequestParam("categoryCode") final String categoryCode,
			@RequestParam("subCategoryCode") final String subCategoryCode)
	{
		return travelogixCommonDataFacade.getSuppliers(categoryCode, subCategoryCode);
	}

	@ResponseBody
	@RequestMapping(value = "/search-client", method = RequestMethod.GET)
	public List<TravelogixB2BUnitData> getClients(@RequestParam("clientCategory") final String clientCategory,
			@RequestParam("clientSubCategory") final String clientSubCategory)
	{
		return travelogixCommonDataFacade.getClients(clientCategory, clientSubCategory);
	}
	
	@ResponseBody
	@RequestMapping(value = "/search-cities", method = RequestMethod.GET)
	public List<CityData> getCities(@RequestParam("countryIsocode") final String countryIsocode)
	{
		return travelogixCommonDataFacade.getCities(countryIsocode);
	}

	@ResponseBody
	@RequestMapping(value = "/releaselock", method = RequestMethod.GET)
	public boolean lock(@RequestParam("rc_code") final String rc_code)
	{
		 return reconfirmationConfigFacade.releaseLockReconfirmationRecord(rc_code);
	}

	@ResponseBody
	@RequestMapping(value = "/approval", method = RequestMethod.GET)
	public boolean approval(@RequestParam("rc_code") final String rc_code,@RequestParam("remark") final String remark)
	{
		return reconfirmationConfigFacade.approvalReconfirmationRecord(rc_code, remark);
}
	@ResponseBody
	@RequestMapping(value = "/reject", method = RequestMethod.GET)
	public boolean reject(@RequestParam("rc_code") final String rc_code,@RequestParam("remark") final String remark)
	{
		return reconfirmationConfigFacade.rejectReconfirmationRecord(rc_code, remark);
	}
	
	/**
	 * Creates the DTO object from Form object as the DTO object will be used to pass search information to facade layer.
	 *
	 * @param reconfirmationSearchForm
	 * @return ReconfirmationSearchParameterData
	 */
	private ReconfirmationSearchParameterData populateSearchData(final ReconfirmationSearchForm reconfirmationSearchForm)
	{
		final ReconfirmationSearchParameterData reconfirmationSearchParameterData = new ReconfirmationSearchParameterData();
		reconfirmationSearchParameterData.setConfigurationFor(reconfirmationSearchForm.getConfigurationFor());
		reconfirmationSearchParameterData.setProductCode(reconfirmationSearchForm.getProductCode());
		reconfirmationSearchParameterData.setProductCategoryCode(reconfirmationSearchForm.getProductCategoryCode());
		reconfirmationSearchParameterData.setProductCategorySubTypeCode(reconfirmationSearchForm.getProductCategorySubTypeCode());
		reconfirmationSearchParameterData.setSupplierCode(reconfirmationSearchForm.getSupplierCode());
		reconfirmationSearchParameterData.setClientCode(reconfirmationSearchForm.getClientCode());
		reconfirmationSearchParameterData.setClientCategory(reconfirmationSearchForm.getClientCategory());
		reconfirmationSearchParameterData.setClientSubCategory(reconfirmationSearchForm.getClientSubCategory());
		reconfirmationSearchParameterData.setClientGroup(reconfirmationSearchForm.getClientGroup());
		return reconfirmationSearchParameterData;
	}

	private ActivateParameterData populateActivateData(ReconfirmationActivateForm reconfirmationActivateForm)
	{
		ActivateParameterData activateData = new ActivateParameterData();
		activateData.setCode(reconfirmationActivateForm.getRcCode());
		activateData.setEffectiveFromDate(getConvertedDate(reconfirmationActivateForm.getEffectiveFromDate()));
		activateData.setReason(reconfirmationActivateForm.getReason());
		activateData.setActive(Boolean.valueOf(reconfirmationActivateForm.getStatus()));
		return activateData;
	}
	
	private Date getConvertedDate(String date){
	   try
		{
			return new SimpleDateFormat("YYYY-MM-DD hh:mm:ss").parse(date);
		}
		catch (ParseException e)
		{
			LOG.error("Date ParseException :",e);
		} 
	   return new Date();
	}
}
