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
package com.cnk.travelogix.b2c.facades.customer.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.cms2.servicelayer.services.CMSSiteService;
import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.storesession.data.CurrencyData;
import de.hybris.platform.commercefacades.storesession.data.LanguageData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.ProfileData;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commercefacades.user.exceptions.PasswordMismatchException;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.commerceservices.i18n.CommerceCommonI18NService;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.c2l.LanguageModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.event.EventService;
import de.hybris.platform.util.Config;
import de.hybris.platform.util.mail.MailUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.BooleanUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import com.cnk.travelogix.b2c.facades.customer.B2cCustomerFacade;
import com.cnk.travelogix.b2c.facades.customer.converters.populator.B2cCustomerReversePopulator;
import com.cnk.travelogix.b2c.facades.customer.converters.populator.ProfilePopulator;
import com.cnk.travelogix.b2c.facades.customer.converters.populator.ProfileReversePopulator;
import com.cnk.travelogix.b2c.facades.customer.converters.populator.TravellerReversePopulator;
import com.cnk.travelogix.b2c.facades.wallet.impl.ValidationFailedException;
import com.cnk.travelogix.b2c.services.customer.impl.ExtB2cCustomerAccountService;
import com.cnk.travelogix.client.config.core.registration.model.B2CRegistrationConfigModel;
import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.event.B2cAccountEnableEvent;
import com.cnk.travelogix.common.core.event.B2cAccountLockEvent;
import com.cnk.travelogix.common.core.event.B2cRegisterEvent;
import com.cnk.travelogix.common.core.model.SendCustomerToCRMProcessModel;
import com.cnk.travelogix.common.core.model.TravellerModel;
import com.cnk.travelogix.common.core.util.EmailGenerationService;


/**
 *
 */
public class ExtB2cCustomerFacade extends DefaultCustomerFacade implements B2cCustomerFacade
{
	private static final Logger LOG = Logger.getLogger(ExtB2cCustomerFacade.class);

	@Resource(name = "extB2cCustomerAccountService")
	private ExtB2cCustomerAccountService extB2cCustomerAccountService;
	@Resource(name = "commerceCommonI18NService")
	private CommerceCommonI18NService commerceCommonI18NService;
	@Resource(name = "b2cCustomerReversePopulator")
	private B2cCustomerReversePopulator b2cCustomerReversePopulator;
	@Resource(name = "profilePopulator")
	private ProfilePopulator profilePopulator;
	@Resource(name = "profileReversePopulator")
	private ProfileReversePopulator profileReversePopulator;
	@Resource(name = "currencyConverter")
	private Converter<CurrencyModel, CurrencyData> currencyConverter;
	@Resource(name = "languageConverter")
	private Converter<LanguageModel, LanguageData> languageConverter;
	@Resource(name = "countryConverter")
	private Converter<CountryModel, CountryData> countryConverter;
	@Resource
	private TravellerReversePopulator travellerReversePopulator;
	@Resource(name = "businessProcessService")
	private BusinessProcessService businessProcessService;
	@Resource(name = "cmsSiteService")
	private CMSSiteService cmsSiteService;
	@Resource(name = "eventService")
	private EventService eventService;
	// add by Rick Zhang for TRAV-384 start
	@Resource
	private Converter<UserModel, CustomerData> b2cCustomerConverter;
	// add by Rick Zhang for TRAV-384 end


	@Override
	public void register(final String fullContextPath, final RegisterData registerData) throws DuplicateUidException
	{
		validateParameterNotNullStandardMessage("registerData", registerData);
		Assert.hasText(registerData.getLogin(), "The field [Login] cannot be empty");

		final CustomerModel newCustomer = getModelService().create(CustomerModel.class);
		newCustomer.setDashboardEmail(registerData.getLogin());

		setUidForRegister(registerData, newCustomer);
		newCustomer.setSessionLanguage(getCommonI18NService().getCurrentLanguage());
		newCustomer.setSessionCurrency(getCommonI18NService().getCurrentCurrency());
		newCustomer.setSubscribe(registerData.getSubscribe());
		if (registerData.getSubscribe().booleanValue())
		{
			final List<String> emails = new ArrayList<String>();
			emails.add(registerData.getLogin());
			newCustomer.setEmails(emails);
		}

		final boolean profileAutoActivation = getProfileAutoActivation();

		if (profileAutoActivation)
		{
			newCustomer.setIsActive(Boolean.TRUE);
		}
		else
		{
			newCustomer.setIsActive(Boolean.FALSE);
		}

		final String randomCode = getRandomCode();
		if (!profileAutoActivation)
		{
			newCustomer.setActivationRandomCode(randomCode);
			newCustomer.setActivationLinkSendDate(new Date());
		}

		extB2cCustomerAccountService.register(newCustomer, registerData.getPassword());
		//send activation link email
		if (!profileAutoActivation)
		{
			sendActivationLinkEmail(registerData.getLogin(), randomCode);
		}
		//send success registration email
		sendSuccessRegisterEmail(registerData.getLogin(), registerData.getPassword());

		//send customer to CRM
		sendNewCustomer2CRM(newCustomer);
	}

	@Override
	public void sendActivationLinkEmail(final String email, final String randomCode)
	{
		final CustomerModel customer = getUserService().getUserForUID(email, CustomerModel.class);
		customer.setActivationRandomCode(randomCode);
		getModelService().save(customer);

		final B2cRegisterEvent registerEvent = new B2cRegisterEvent();
		registerEvent.setEventType(B2cRegisterEvent.EventType.ACTIVATION);
		registerEvent.setRandomCode(randomCode);
		eventService.publishEvent(extB2cCustomerAccountService.initializeEvent(registerEvent,
				getUserService().getUserForUID(email, CustomerModel.class)));
	}

	@Override
	public void sendActivationLinkEmail(final String fullContextPath, final String email, final String randomCode)
	{
		try
		{
			final CustomerModel customer = getUserService().getUserForUID(email, CustomerModel.class);
			customer.setActivationRandomCode(randomCode);
			getModelService().save(customer);

			final HtmlEmail mail = (HtmlEmail) MailUtils.getPreConfiguredEmail();
			mail.setSubject("Your Ezeego Account");
			mail.setMsg(generateActivationEmailBody(fullContextPath, email, randomCode));
			mail.addTo(email);
			EmailGenerationService.sendMail(mail);
		}
		catch (final EmailException e)
		{
			// YTODO Auto-generated catch block
			e.printStackTrace();
			LOG.info("Email sent failed to: " + email);
		}
	}

	@Override
	public void sendSuccessRegisterEmail(final String email, final String pwd)
	{
		final B2cRegisterEvent registerEvent = new B2cRegisterEvent();
		registerEvent.setEventType(B2cRegisterEvent.EventType.REGISTRATION);
		registerEvent.setPassword(pwd);
		eventService.publishEvent(extB2cCustomerAccountService.initializeEvent(registerEvent,
				getUserService().getUserForUID(email, CustomerModel.class)));

		//		try
		//		{
		//			final HtmlEmail mail = (HtmlEmail) MailUtils.getPreConfiguredEmail();
		//			mail.setSubject("Your Ezeego Account");
		//			mail.setMsg(generateSuccessRegisterEmailBody(email, pwd));
		//			mail.addTo(email);
		//			EmailGenerationService.sendMail(mail);
		//		}
		//		catch (final EmailException e)
		//		{
		//			// YTODO Auto-generated catch block
		//			e.printStackTrace();
		//			LOG.info("Email sent failed to: " + email);
		//		}
	}

	@Override
	public void sendAccountLockedInformingEmail(final String email)
	{
		final B2cAccountLockEvent accountLockEvent = new B2cAccountLockEvent();
		eventService.publishEvent(extB2cCustomerAccountService.initializeEvent(accountLockEvent,
				getUserService().getUserForUID(email, CustomerModel.class)));
		//		try
		//		{
		//			final HtmlEmail mail = (HtmlEmail) MailUtils.getPreConfiguredEmail();
		//			mail.setSubject("Your Ezeego Account");
		//			mail.setMsg(generateAccountLockedInformingEmailBody());
		//			mail.addTo(email);
		//			EmailGenerationService.sendMail(mail);
		//		}
		//		catch (final EmailException e)
		//		{
		//			// YTODO Auto-generated catch block
		//			e.printStackTrace();
		//			LOG.info("Email sent failed to: " + email);
		//		}
	}

	@Override
	public boolean getProfileAutoActivation()
	{
		final B2CRegistrationConfigModel b2CRegistrationConfig = extB2cCustomerAccountService.getB2CRegistrationConfig();
		return b2CRegistrationConfig != null && b2CRegistrationConfig.getProfileAutoActivation().booleanValue();
	}

	/**
	 *
	 * @return
	 */
	private String generateActivationEmailBody(final String fullContextPath, final String email, final String randomCode)
	{
		final StringBuilder body = new StringBuilder();
		body.append("Dear, \n");
		body.append("We've received a request to create an  Account using your e-mail address.\n");
		body.append("You already have an  Account with this e-mail address.\n");
		if (fullContextPath != null)
		{
			body.append("Please click below link to activate your account.\n");
			body.append(generateVerficiationLink(fullContextPath, email, randomCode));
		}
		return body.toString();
	}

	private String generateSuccessRegisterEmailBody(final String email, final String pwd)
	{
		final StringBuilder body = new StringBuilder();
		body.append("Dear, \n");
		body.append("We've received a request to create an  Account using your e-mail address.\n");
		body.append("You already have an  Account with this e-mail address.\n");
		body.append("Your account: " + email + "\n");
		body.append("Your password: " + pwd);
		return body.toString();
	}

	private StringBuilder generateVerficiationLink(final String fullContextPath, final String email, final String randomCode)
	{
		final StringBuilder link = new StringBuilder();
		link.append(Config.getParameter("website.ezeego1.https"));
		link.append(fullContextPath);
		link.append("/register/activeAccount");
		link.append("?email=");
		link.append(email);
		link.append("&strVer=");
		link.append(randomCode);

		return link;
	}

	private String generateAccountLockedInformingEmailBody()
	{
		final StringBuilder body = new StringBuilder();
		body.append("Dear, \n");
		body.append("Your account has been locked due to invalid attempts.\n");
		return body.toString();
	}

	@Override
	public String getHomePageLink(final String fullContextPath)
	{
		return Config.getParameter("website.ezeego1.https") + fullContextPath;
	}

	@Override
	public boolean checkUserExist(final String email)
	{
		return getUserService().isUserExisting(email);

	}

	@Override
	public String getRandomCode()
	{
		return extB2cCustomerAccountService.generateRandomCode();
	}

	@Override
	public boolean activateAccount(final String email, final String randomCode)
	{
		//check is user has been registered
		boolean success = false;
		if (checkUserExist(email))
		{
			final String code = extB2cCustomerAccountService.getActivationRandomCode(email);
			if (randomCode != null && randomCode.equals(code))
			{
				//activate account
				final CustomerModel customer = getUserService().getUserForUID(email, CustomerModel.class);
				if (customer != null)
				{
					customer.setIsActive(Boolean.TRUE);
					getModelService().save(customer);
					success = true;
					getUserService().setCurrentUser(customer);
				}
			}

		}
		return success;
	}

	@Override
	public boolean checkVerLinkExpire(final String email)
	{
		boolean expire = false;
		final B2CRegistrationConfigModel b2CRegistrationConfig = extB2cCustomerAccountService.getB2CRegistrationConfig();
		final CustomerModel customer = getUserService().getUserForUID(email, CustomerModel.class);
		if (b2CRegistrationConfig != null && customer.getActivationLinkSendDate() != null)
		{
			//		if (customer.getActivationLinkSendDate() != null)
			//		{
			final int validDays = b2CRegistrationConfig.getActivationLinkValidForDay().intValue();
			final Date currentDate = new Date();
			final int diff = Integer.parseInt(
					String.valueOf((currentDate.getTime() - customer.getActivationLinkSendDate().getTime()) / (24 * 60 * 60 * 1000)));
			expire = validDays < diff;
		}
		return expire;
	}

	@Override
	public boolean getUserActivationStatus(final String email)
	{
		final CustomerModel customer = getUserService().getUserForUID(email, CustomerModel.class);
		return BooleanUtils.isTrue(customer.getIsActive());
	}

	private List<CountryModel> getAllCountries()
	{
		Collection<CountryModel> countries = commerceCommonI18NService.getAllCountries();
		if (countries != null && countries.isEmpty())
		{
			countries = getCommonI18NService().getAllCountries();
		}

		if (countries != null && !countries.isEmpty())
		{
			final List<CountryModel> allCountries = new ArrayList<CountryModel>(countries);
			Collections.sort(allCountries, new Comparator<CountryModel>()
			{
				@Override
				public int compare(final CountryModel arg0, final CountryModel arg1)
				{
					return arg0.getName().compareTo(arg1.getName());
				}
			});
			return allCountries;
		}
		return Collections.emptyList();
	}

	@Override
	public List<CountryData> getAllCountryData()
	{
		return Converters.convertAll(getAllCountries(), countryConverter);
	}

	@Override
	public Map<String, List<LanguageData>> getCountry2Language()
	{
		final Map<String, List<LanguageData>> country2Language = new HashMap<String, List<LanguageData>>();
		final List<CountryModel> allCountries = getAllCountries();
		for (final CountryModel country : allCountries)
		{
			final List<LanguageData> allLanguageData = new ArrayList<LanguageData>();
			for (final LanguageModel lang : country.getLanguages())
			{
				final LanguageData langData = languageConverter.convert(lang);
				allLanguageData.add(langData);
			}

			country2Language.put(country.getIsocode(), allLanguageData);
		}
		return country2Language;
	}

	@Override
	public Map<String, List<CurrencyData>> getCountry2Currency()
	{
		final Map<String, List<CurrencyData>> country2Currency = new HashMap<String, List<CurrencyData>>();
		final List<CountryModel> allCountries = getAllCountries();
		for (final CountryModel country : allCountries)
		{
			final List<CurrencyData> allCurrencyData = new ArrayList<CurrencyData>();
			for (final CurrencyModel curr : country.getCurrencies())
			{
				final CurrencyData currData = currencyConverter.convert(curr);
				allCurrencyData.add(currData);
			}

			country2Currency.put(country.getIsocode(), allCurrencyData);
		}
		return country2Currency;
	}

	//	@Override
	//	public List<LanguageModel> getAllLanguages()
	//	{
	//		final Collection<LanguageModel> languages = commerceCommonI18NService.getAllLanguages();
	//		if (languages != null && !languages.isEmpty())
	//		{
	//			return new ArrayList<LanguageModel>(languages);
	//		}
	//		else
	//		{
	//			return Collections.emptyList();
	//		}
	//	}
	//
	//	@Override
	//	public List<CurrencyModel> getAllCurrencies()
	//	{
	//		return commerceCommonI18NService.getAllCurrencies();
	//	}

	@Override
	public void updateCustomer(final CustomerData customerData)
	{
		validateParameterNotNullStandardMessage("customerData", customerData);

		final CustomerModel customer = getCurrentSessionCustomer();
		b2cCustomerReversePopulator.populate(customerData, customer);

		getModelService().save(customer);
		//send customer to CRM
		sendModifiedCustomer2CRM(customer);
	}

	private void updateHybrisCustomer(final CustomerData customerData)
	{
		validateParameterNotNullStandardMessage("customerData", customerData);

		final CustomerModel customer = getCurrentSessionCustomer();
		b2cCustomerReversePopulator.populate(customerData, customer);

		getModelService().save(customer);
	}

	@Override
	public boolean emailExist(final String email)
	{
		final List<String> emails = getCurrentCustomer().getEmails();
		if (emails != null && emails.contains(email))
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean mobileExist(final String mobile)
	{
		final List<String> mobiles = getCurrentCustomer().getMobiles();
		if (mobiles != null && mobiles.contains(mobile))
		{
			return true;
		}
		return false;
	}

	@Override
	public void saveSubscribeEmail(final String email)
	{
		validateParameterNotNullStandardMessage("email", email);
		final CustomerData customerData = getCurrentCustomer();
		if (customerData.getEmails() != null)
		{
			final List<String> emails = new ArrayList<String>(customerData.getEmails());
			emails.add(email);
			customerData.setEmails(emails);
		}
		else
		{
			customerData.setEmails(new ArrayList<String>()
			{
				{
					add(email);
				}
			});
		}
		updateHybrisCustomer(customerData);
	}

	@Override
	public void removeEmail(final String email)
	{
		final CustomerData customerData = getCurrentCustomer();
		if (customerData.getEmails() != null)
		{
			final List<String> emails = new ArrayList<String>(customerData.getEmails());
			emails.remove(email);
			customerData.setEmails(emails);
			updateHybrisCustomer(customerData);
		}
	}

	@Override
	public void saveMobile(final String mobile)
	{
		validateParameterNotNullStandardMessage("mobile", mobile);
		final CustomerData customerData = getCurrentCustomer();
		if (customerData.getMobiles() != null)
		{
			final List<String> mobiles = new ArrayList<String>(customerData.getMobiles());
			mobiles.add(mobile);
			customerData.setMobiles(mobiles);
		}
		else
		{
			customerData.setMobiles(new ArrayList<String>()
			{
				{
					add(mobile);
				}
			});
		}
		updateHybrisCustomer(customerData);
	}

	@Override
	public void removeMobile(final String mobile)
	{
		final CustomerData customerData = getCurrentCustomer();
		if (customerData.getMobiles() != null)
		{
			final List<String> mobiles = new ArrayList<String>(customerData.getMobiles());
			mobiles.remove(mobile);
			customerData.setMobiles(mobiles);
			updateHybrisCustomer(customerData);
		}
	}

	@Override
	public void deActivateAccount()
	{
		final CustomerModel customer = getCurrentSessionCustomer();
		customer.setIsActive(Boolean.FALSE);
		getModelService().save(customer);
	}

	@Override
	public void addTraveller(final TravellerData travellerData) throws ValidationFailedException
	{
		validateParameterNotNullStandardMessage("travellerData", travellerData);
		if (extB2cCustomerAccountService.getTraveller(StringUtils.trimToNull(travellerData.getFirstName()),
				StringUtils.trimToNull(travellerData.getMiddleName()), StringUtils.trimToNull(travellerData.getLastName())) != null)
		{
			throw new ValidationFailedException().addInfo("Traveller", "Duplicate record exists");
		}

		final TravellerModel travellerModel = getModelService().create(TravellerModel.class);
		travellerReversePopulator.populate(travellerData, travellerModel);
		extB2cCustomerAccountService.addTraveller(travellerModel);
	}

	@Override
	public void deleteTraveller(final String firstName, final String middleName, final String lastName)
	{
		validateParameterNotNullStandardMessage("firstName", firstName);
		validateParameterNotNullStandardMessage("lastName", lastName);

		extB2cCustomerAccountService.deleteTraveller(firstName, middleName, lastName);
	}

	@Override
	public void updateTraveller(final TravellerData travellerData)
	{
		validateParameterNotNullStandardMessage("travellerData", travellerData);
		final TravellerModel travellerModel = extB2cCustomerAccountService.getTraveller(
				StringUtils.trimToNull(travellerData.getFirstName()), StringUtils.trimToNull(travellerData.getMiddleName()),
				StringUtils.trimToNull(travellerData.getLastName()));

		if (travellerModel != null)
		{
			getModelService().removeAll(travellerModel.getVisaInfos());
		}
		travellerReversePopulator.populate(travellerData, travellerModel);
		extB2cCustomerAccountService.updateTraveller(travellerModel);
	}

	@Override
	public void updateProfile(final ProfileData profileData)
	{
		final CustomerModel customerModel = (CustomerModel) getUserService().getCurrentUser();
		profileReversePopulator.populate(profileData, customerModel);
		getModelService().save(customerModel);
		//send customer to CRM
		sendModifiedCustomer2CRM(customerModel);
	}

	@Override
	public ProfileData getProfile()
	{
		final CustomerModel customerModel = (CustomerModel) getUserService().getCurrentUser();
		final ProfileData profileData = new ProfileData();
		profilePopulator.populate(customerModel, profileData);
		return profileData;
	}

	@Override
	public void changeUid(final String newUid, final String currentPassword)
			throws DuplicateUidException, PasswordMismatchException
	{
		try
		{
			getCustomerAccountService().changeUid(newUid, currentPassword);
			// added by Alex for TRAV-130 start
			// change dashboard email when user email id is changed
			final CustomerModel customerModel = getCurrentSessionCustomer();
			customerModel.setDashboardEmail(newUid);
			getModelService().save(customerModel);
			// added by Alex for TRAV-130 end
			//send customer to CRM
			sendModifiedCustomer2CRM(customerModel);
		}
		catch (final de.hybris.platform.commerceservices.customer.PasswordMismatchException pse)
		{
			throw new PasswordMismatchException(pse);
		}

	}

	@Override
	public boolean checkUserFirstLogin()
	{
		final CustomerModel customer = getCurrentSessionCustomer();
		if (customer.getLastLogin() == null || !checkProfileComplete(customer))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private boolean checkProfileComplete(final CustomerModel customer)
	{
		boolean complete = true;
		if (StringUtils.isBlank(customer.getName()))
		{
			complete = false;
		}
		return complete;
	}


	@Override
	public void updateCustomerLastLoginTime()
	{
		final CustomerModel customer = getCurrentSessionCustomer();
		customer.setLastLogin(new Date());
		getModelService().save(customer);
	}

	@Override
	public void processForgetPassword(final String uid)
	{
		Assert.hasText(uid, "The field [uid] cannot be empty");
		final CustomerModel customerModel = getUserService().getUserForUID(uid.toLowerCase(), CustomerModel.class);
		extB2cCustomerAccountService.forgottenPassword(customerModel);
	}

	@Override
	public void processEnableAccount(final String uid)
	{
		Assert.hasText(uid, "The field [uid] cannot be empty");
		final CustomerModel customerModel = getUserService().getUserForUID(uid.toLowerCase(), CustomerModel.class);
		final String token = extB2cCustomerAccountService.processEnableAccount(customerModel);
		eventService.publishEvent(extB2cCustomerAccountService.initializeEvent(new B2cAccountEnableEvent(token),
				getUserService().getUserForUID(uid, CustomerModel.class)));
	}

	@Override
	public void createCustomerByCRM(final CustomerModel customerModel, final String originalPassword) throws DuplicateUidException
	{
		validateParameterNotNullStandardMessage("customerModel", customerModel);
		Assert.hasText(customerModel.getUid(), "The field [uid] cannot be empty!");
		Assert.hasText(originalPassword, "The field [Password] cannot be empty!");

		setUidForRegister(customerModel);
		getCustomerAccountService().register(customerModel, originalPassword);
	}

	@Override
	public void updateCustomerByCRM(final CustomerModel customerModel)
	{
		validateParameterNotNullStandardMessage("customerModel", customerModel);
		Assert.hasText(customerModel.getUid(), "The field [uid] cannot be empty!");

		final CustomerModel originalCustomer = (CustomerModel) getUserService().getUserForUID(customerModel.getUid());
		populate(customerModel, originalCustomer);
		getModelService().save(originalCustomer);
	}

	protected void setUidForRegister(final CustomerModel newCustomer)
	{
		newCustomer.setUid(StringUtils.lowerCase(newCustomer.getUid()));
		newCustomer.setOriginalUid(newCustomer.getUid());
	}

	protected void populate(final CustomerModel customerFromCRM, final CustomerModel originalCustomer)
	{
		originalCustomer.setCrmCustomerId(customerFromCRM.getCrmCustomerId());
		originalCustomer.setName(customerFromCRM.getName());
		originalCustomer.setIsActive(customerFromCRM.getIsActive());
		originalCustomer.setSubscribe(customerFromCRM.getSubscribe());
		originalCustomer.setDashboardEmail(customerFromCRM.getDashboardEmail());
		originalCustomer.setDefaultWebSite(customerFromCRM.getDefaultWebSite());
		originalCustomer.setSessionLanguage(customerFromCRM.getSessionLanguage());
		originalCustomer.setSessionCurrency(customerFromCRM.getSessionCurrency());
		originalCustomer.setEmails(customerFromCRM.getEmails());
		originalCustomer.setMobiles(customerFromCRM.getMobiles());
		originalCustomer.setTravellers(customerFromCRM.getTravellers());
		originalCustomer.setCreditCards(customerFromCRM.getCreditCards());
	}

	private void sendNewCustomer2CRM(final CustomerModel customer)
	{
		final SendCustomerToCRMProcessModel processModel = setValueToProcessModel(customer, false);
		getModelService().save(processModel);
		businessProcessService.startProcess(processModel);
	}

	private void sendModifiedCustomer2CRM(final CustomerModel customer)
	{
		final SendCustomerToCRMProcessModel processModel = setValueToProcessModel(customer, true);
		getModelService().save(processModel);
		businessProcessService.startProcess(processModel);
	}

	private SendCustomerToCRMProcessModel setValueToProcessModel(final CustomerModel customer, final boolean update)
	{
		final SendCustomerToCRMProcessModel processModel = (SendCustomerToCRMProcessModel) businessProcessService.createProcess(
				"sendCustomerToCRMProcess-" + customer.getUid() + "-" + System.currentTimeMillis(), "sendCustomerToCRMProcess");
		if (update)
		{
			processModel.setObjectTask("M");
		}
		else
		{
			processModel.setObjectTask("I");
		}
		processModel.setLegacyBP(customer.getUid());
		processModel.setCategory("1");
		processModel.setBpRole("CRM000");
		processModel.setCustAccGrp("RETL");
		if (update)
		{
			processModel.setCustomer(customer.getCrmCustomerId());
		}

		String companyCode = "";
		String salesOrg = "";
		final CMSSiteModel currentSite = cmsSiteService.getCurrentSite();
		if ("B2C".equals(currentSite.getChannel().getCode()))
		{
			if (currentSite.getName().contains("Ezeego"))
			{
				companyCode = "E000";
				salesOrg = "O 50000619";
			}
			if (currentSite.getName().contains("Cox"))
			{
				companyCode = "C000";
				salesOrg = "O 50000610";
			}
		}

		processModel.setCompCode(companyCode);
		processModel.setSalesOrg(salesOrg);
		processModel.setDistChannel("C2");
		processModel.setDivision("C1");
		String firstName = "";
		String lastName = "";
		if (customer.getName() != null)
		{
			final String[] name = customer.getName().split(", ");
			firstName = name[0];
			lastName = name[name.length - 1];
		}
		processModel.setName1(firstName);
		processModel.setName2(lastName);
		processModel.setSearchTerm(firstName);
		if (customer.getDefaultWebSite() != null)
		{
			processModel.setCountryKey(customer.getDefaultWebSite().getIsocode());
		}
		processModel.setTradePartner(companyCode);
		processModel.setReccAcc("221010");
		processModel.setCurrency(customer.getSessionCurrency().getIsocode());
		processModel.setPricingProc("1");
		processModel.setCustStatGrp("1");
		processModel.setDelivPlant(companyCode);
		processModel.setAccAssGrp("01");
		processModel.setPlanGrp("C1");

		return processModel;
	}

	// add by Rick Zhang for TRAV-384 start
	@Override
	protected Converter<UserModel, CustomerData> getCustomerConverter()
	{
		return b2cCustomerConverter;
	}
	// add by Rick Zhang for TRAV-384 end
}
