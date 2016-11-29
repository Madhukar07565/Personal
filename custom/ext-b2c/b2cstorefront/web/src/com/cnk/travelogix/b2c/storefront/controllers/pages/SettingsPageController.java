/**
 *
 */
package com.cnk.travelogix.b2c.storefront.controllers.pages;

import static com.cnk.travelogix.b2c.storefront.controllers.pages.GenericFormUtil.LOGGER;
import static org.apache.commons.lang.StringEscapeUtils.escapeHtml;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.RegionData;
import de.hybris.platform.commercefacades.user.exceptions.PasswordMismatchException;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cnk.travelogix.b2c.facades.customer.B2cCustomerFacade;
import com.cnk.travelogix.b2c.facades.wallet.impl.ValidationFailedException;
import com.cnk.travelogix.b2c.storefront.forms.AccountSettingsForm;
import com.cnk.travelogix.b2c.storefront.forms.CustomerForm;
import com.cnk.travelogix.b2c.storefront.forms.GenericForm;
import com.cnk.travelogix.b2c.storefront.forms.ResponseMessage;
import com.cnk.travelogix.b2c.storefront.forms.TravellerForm;
import com.cnk.travelogix.b2c.storefront.util.OperationEnum;
import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.common.facades.i18n.CnkI18NFacade;


/**
 * @author i322561
 *
 */
@Controller
@Scope("tenant")
@RequestMapping("/my-account")
public class SettingsPageController extends AbstractPageController implements GenericFormUtil
{

	private static final String SETTINGS_CMS_PAGE = "ezgb2cSettingsPage";


	@Resource(name = "customerFacade")
	private B2cCustomerFacade customerFacade;
	@Resource(name = "accountSettingsUserNameValidator")
	private Validator accountSettingsUserNameValidator;
	@Resource(name = "accountSettingsPwdValidator")
	private Validator accountSettingsPwdValidator;
	@Resource(name = "accountSettingsEmailValidator")
	private Validator accountSettingsEmailValidator;
	@Resource(name = "accountSettingsMobileValidator")
	private Validator accountSettingsMobileValidator;
	@Resource(name = "userFacade")
	private UserFacade userFacade;
	@Resource
	private CnkI18NFacade i18NFacade;

	@RequestMapping(value = "/settings")
	public String getSettings(final HttpServletRequest request, final Model model) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(SETTINGS_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SETTINGS_CMS_PAGE));

		final CustomerData customerData = customerFacade.getCurrentCustomer();

		final List<TravellerForm> multiCopyValue = MultiCopyValue(customerData.getTravellers(), TravellerForm.class);
		final GenericForm<TravellerForm> gm = new GenericForm<TravellerForm>();

		gm.setData(multiCopyValue);
		gm.setMeta(new TravellerForm());

		model.addAttribute("travellerList", escapeHtml(writeToJson(gm)));
		model.addAttribute("titleList", writeToJson(userFacade.getTitles()));
		model.addAttribute("monthList", initMonthList(request));
		model.addAttribute("countryList", escapeHtml(writeToJson(customerFacade.getAllCountryData())));

		model.addAttribute("customerData", customerData);
		model.addAttribute("homeLink", customerFacade.getHomePageLink(request.getContextPath()));
		model.addAttribute("countries", customerFacade.getAllCountryData());
		model.addAttribute("titles", userFacade.getTitles());

		return "pages/ezg/account/settingsPage";
	}


	@RequestMapping(value = "/regions")
	@ResponseBody
	public List<RegionData> getRegionByCountry(final HttpServletRequest request,
			@RequestParam("countryISO") final String countryISO)
	{

		return i18NFacade.getRegionsForCountryIso(countryISO);
	}

	@RequestMapping(value = "/cities")
	@ResponseBody
	public List<CityData> getCityByRegion(final HttpServletRequest request, @RequestParam("countryISO") final String countryISO)
	{

		return i18NFacade.getCitiesForCountryIso(countryISO);
	}


	@RequestMapping(value = "/changeUserName")
	@ResponseBody
	public Map<String, String> changeUserName(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		final Map<String, String> result = new HashMap<String, String>();

		accountSettingsUserNameValidator.validate(form, bindingResult);
		final List<FieldError> allErrors = bindingResult.getFieldErrors();
		if (allErrors != null && allErrors.size() != 0)
		{
			for (final FieldError error : allErrors)
			{
				result.put(error.getField(), error.getCode());
			}
			return result;
		}

		try
		{
			customerFacade.changeUid(form.getNewUserName(), form.getCurrentPwd());
			// Replace the spring security authentication with the new UID
			final String newUid = customerFacade.getCurrentCustomer().getUid().toLowerCase();
			final Authentication oldAuthentication = SecurityContextHolder.getContext().getAuthentication();
			final UsernamePasswordAuthenticationToken newAuthentication = new UsernamePasswordAuthenticationToken(newUid, null,
					oldAuthentication.getAuthorities());
			newAuthentication.setDetails(oldAuthentication.getDetails());
			SecurityContextHolder.getContext().setAuthentication(newAuthentication);
			result.put("success", "1");
			result.put("changedUserName", form.getNewUserName());
		}
		catch (final PasswordMismatchException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
			result.put("oldPwdMismatch", "account.settings.oldPwd.mismatch");
		}
		catch (final DuplicateUidException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	@RequestMapping(value = "/changePwd")
	@ResponseBody
	public Map<String, String> changePwd(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		final Map<String, String> result = new HashMap<String, String>();

		accountSettingsPwdValidator.validate(form, bindingResult);
		final List<FieldError> allErrors = bindingResult.getFieldErrors();
		if (allErrors != null && allErrors.size() != 0)
		{
			for (final FieldError error : allErrors)
			{
				result.put(error.getField(), error.getCode());
			}
			return result;
		}

		try
		{
			customerFacade.changePassword(form.getOldPwd(), form.getNewPwd());
			result.put("success", "1");
		}
		catch (final PasswordMismatchException e)
		{
			result.put("oldPwd", "account.settings.oldPwd.mismatch");
		}

		return result;

	}

	@RequestMapping(value = "/saveSettings", method = RequestMethod.POST)
	@ResponseBody
	public ResponseMessage saveSettings(final AccountSettingsForm form, @RequestBody final CustomerForm requestBody,
			final HttpServletRequest request)
	{
		final ResponseMessage rm = new ResponseMessage();
		final List<TravellerForm> travellers = requestBody.getTravellers();

		try
		{
			for (final TravellerForm tf : travellers)
			{
				if (tf.getAction().equalsIgnoreCase(OperationEnum.CREATE.getId()))
				{
					tf.validate(rm);
					if (rm.hasError())
					{
						return rm;
					}
					customerFacade.addTraveller(tf);
				}
				else if (tf.getAction().equalsIgnoreCase(OperationEnum.DELETE.getId()))
				{
					customerFacade.deleteTraveller(tf.getFirstName(), tf.getMiddleName(), tf.getLastName());
				}
				else
				{
					tf.validate(rm);
					if (rm.hasError())
					{
						return rm;
					}
					customerFacade.updateTraveller(tf);
				}
			}
		}
		catch (final ValidationFailedException e)
		{
			LOGGER.error(e.getMessage());
			return new ResponseMessage(e);
		}

		final String countryCode = requestBody.getDefaultWebSite().getIsocode();
		final String languageCode = requestBody.getLanguage().getIsocode();
		final String currencyCode = requestBody.getCurrency().getIsocode();
		final boolean subscribe = requestBody.getSubscribe();

		final CustomerData customerData = customerFacade.getCurrentCustomer();

		if (!"0".equals(countryCode))
		{
			final CountryData countryData = new CountryData();
			countryData.setIsocode(countryCode);
			customerData.setDefaultWebSite(countryData);
		}
		if (!"0".equals(languageCode))
		{
			final LanguageData languageData = new LanguageData();
			languageData.setIsocode(languageCode);
			customerData.setLanguage(languageData);
		}
		if (!"0".equals(currencyCode))
		{
			final CurrencyData currencyData = new CurrencyData();
			currencyData.setIsocode(currencyCode);
			customerData.setCurrency(currencyData);
		}
		customerData.setSubscribe(subscribe);
		customerFacade.updateCustomer(customerData);
		return rm.changeStatus("OK");
	}

	@RequestMapping(value = "/getPreferredLangauge")
	@ResponseBody
	public Map<String, List<LanguageData>> getPreferredLangauge(final HttpServletRequest request,
			final HttpServletResponse response)
	{
		return customerFacade.getCountry2Language();
	}

	@RequestMapping(value = "/getPreferredCurrency")
	@ResponseBody
	public Map<String, List<CurrencyData>> getPreferredCurrency(final HttpServletRequest request,
			final HttpServletResponse response)
	{
		return customerFacade.getCountry2Currency();
	}

	@RequestMapping(value = "/addEmail")
	@ResponseBody
	public Map<String, String> addSubscribeEmail(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		final Map<String, String> result = new HashMap<String, String>();
		final String email = form.getSubscribeEmail();
		accountSettingsEmailValidator.validate(email, bindingResult);
		final List<FieldError> allErrors = bindingResult.getFieldErrors();
		if (allErrors != null && allErrors.size() != 0)
		{
			for (final FieldError error : allErrors)
			{
				result.put(error.getField(), error.getCode());
			}
			return result;
		}

		if (customerFacade.emailExist(email))
		{
			result.put("emailExist", "account.settings.addEmail.exist");
		}
		else
		{
			customerFacade.saveSubscribeEmail(email);
			result.put("success", email);
		}
		return result;
	}

	@RequestMapping(value = "/addAnotherEmail")
	@ResponseBody
	public Map<String, String> addAnotheSubscribeEmail(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		final Map<String, String> result = new HashMap<String, String>();
		final String email = form.getNewSubscribeEmail();
		accountSettingsEmailValidator.validate(email, bindingResult);
		final List<FieldError> allErrors = bindingResult.getFieldErrors();
		if (allErrors != null && allErrors.size() != 0)
		{
			for (final FieldError error : allErrors)
			{
				result.put(error.getField(), error.getCode());
			}
			return result;
		}

		if (customerFacade.emailExist(email))
		{
			result.put("emailExist", "account.settings.addEmail.exist");
		}
		else
		{
			customerFacade.saveSubscribeEmail(email);
			result.put("success", email);
		}
		return result;
	}

	@RequestMapping(value = "/unSubscribe")
	@ResponseBody
	public Map<String, String> unSubscribe(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		final Map<String, String> result = new HashMap<String, String>();
		final String email = request.getParameter("email");
		if (!StringUtils.isEmpty(email))
		{
			customerFacade.removeEmail(email);
			result.put("success", "1");
		}

		return result;
	}

	@RequestMapping(value = "/addMobile")
	@ResponseBody
	public Map<String, String> addMobile(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		final Map<String, String> result = new HashMap<String, String>();
		final String mobile = form.getCountryCode() + " " + form.getMobile();
		accountSettingsMobileValidator.validate(form.getMobile(), bindingResult);
		final List<FieldError> allErrors = bindingResult.getFieldErrors();
		if (allErrors != null && allErrors.size() != 0)
		{
			for (final FieldError error : allErrors)
			{
				result.put(error.getField(), error.getCode());
			}
			return result;
		}

		if (customerFacade.mobileExist(mobile))
		{
			result.put("mobileExist", "account.settings.addMobile.exist");
		}
		else
		{
			customerFacade.saveMobile(mobile);
			result.put("success", mobile);
		}
		return result;
	}

	@RequestMapping(value = "/addAnotherMobile")
	@ResponseBody
	public Map<String, String> addAnotherMobile(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		final Map<String, String> result = new HashMap<String, String>();
		final String mobile = form.getCountryCode() + " " + form.getNewMobile();
		accountSettingsMobileValidator.validate(form.getNewMobile(), bindingResult);
		final List<FieldError> allErrors = bindingResult.getFieldErrors();
		if (allErrors != null && allErrors.size() != 0)
		{
			for (final FieldError error : allErrors)
			{
				result.put(error.getField(), error.getCode());
			}
			return result;
		}

		if (customerFacade.mobileExist(mobile))
		{
			result.put("mobileExist", "account.settings.addMobile.exist");
		}
		else
		{
			customerFacade.saveMobile(mobile);
			result.put("success", mobile);
		}
		return result;
	}

	@RequestMapping(value = "/deActivateMobile")
	@ResponseBody
	public Map<String, String> deActive(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		final Map<String, String> result = new HashMap<String, String>();
		final String mobile = request.getParameter("mobile");
		if (!StringUtils.isEmpty(mobile))
		{
			customerFacade.removeMobile(mobile);
			result.put("success", "1");
		}

		return result;
	}

	@RequestMapping(value = "/deActivateAccount")
	@ResponseBody
	public void deActivateAccount(final AccountSettingsForm form, final BindingResult bindingResult,
			final HttpServletRequest request, final HttpServletResponse response)
	{
		customerFacade.deActivateAccount();
	}

}
