package com.cnk.travelogix.crm.converter;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.util.Assert;

import com.cnk.travelogix.sap.crm.integration.mapping.dto.Custmast;

import de.hybris.platform.commerceservices.strategies.CustomerNameStrategy;
import de.hybris.platform.core.model.c2l.CountryModel;
import de.hybris.platform.core.model.c2l.RegionModel;
import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.search.restriction.SearchRestrictionService;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.user.UserService;

public class CRMEmployeeConverter extends AbstractCRMConverter {

	@Resource(name = "commonI18NService")
	private CommonI18NService commonI18NService;

	@Resource(name = "customerNameStrategy")
	private CustomerNameStrategy customerNameStrategy;

	@Resource(name = "modelService")
	private ModelService modelService;

	@Resource(name = "userService")
	private UserService userService;

	@Resource(name = "flexibleSearchService")
	FlexibleSearchService flexibleSearchService;

	@Resource(name = "searchRestrictionService")
	private SearchRestrictionService searchRestrictionService;

	Logger LOG = Logger.getLogger(CRMEmployeeConverter.class);

	public void populateCustomerModel(final Custmast employeeData, final EmployeeModel employeeModel) {
		Assert.notNull(employeeData, "Parameter source cannot be null.");
		Assert.notNull(employeeModel, "Parameter target cannot be null.");

		// Currency
		if (employeeData.getCurrency() != null) {
			final String isocode = employeeData.getCurrency();
			try {
				employeeModel.setSessionCurrency(getCommonI18NService().getCurrency(isocode));
			} catch (final UnknownIdentifierException e) {
				throw new ConversionException("No currency with the code " + isocode + " found.", e);
			}
		}
		// First name and Last name
		employeeModel.setName(getCustomerNameStrategy().getName(employeeData.getName1(), employeeData.getName2()));
		employeeModel.setFirstName(employeeData.getName1());
		employeeModel.setLastName(employeeData.getName2());
		employeeModel.setContactEmail(employeeData.getEmail());
		employeeModel.setDesignation(employeeData.getTitle());

		// UID
		setUid(employeeData, employeeModel);

	}

	protected void setUid(final Custmast employeeData, final EmployeeModel employeeModel) {
		// As per business we are setting uid as crm customer id if email id is
		// null.
		String uid = null;
		if (null != employeeData.getEmail()) {
			uid = employeeData.getEmail();
		} else {
			uid = employeeData.getCustomer();
		}
		employeeModel.setUid(uid);
	}

	protected void setAddress(final Custmast employeeAddressData, final EmployeeModel employeeModel) {
		final AddressModel employeeAddressModel = getModelService().create(AddressModel.class);

		if (null != employeeAddressData.getName1()) {
			employeeAddressModel.setFirstname(employeeAddressData.getName1());
		}
		if (null != employeeAddressData.getName2()) {
			employeeAddressModel.setLastname(employeeAddressData.getName2());
		}
		if (null != employeeAddressData.getCompCode()) {
			employeeAddressModel.setCompany(employeeAddressData.getCompCode());
		}
		if (null != employeeAddressData.getStreet()) {
			employeeAddressModel.setLine1(employeeAddressData.getStreet());
		}
		if (null != employeeAddressData.getStreet2()) {
			employeeAddressModel.setLine2(employeeAddressData.getStreet2());
		}
		if (null != employeeAddressData.getStreet5()) {
			employeeAddressModel.setTown(employeeAddressData.getStreet5()); // town
		}
		if (null != employeeAddressData.getPostalCode()) {
			employeeAddressModel.setPostalcode(employeeAddressData.getPostalCode());
		}
		if (null != employeeAddressData.getTelNo()) {
			employeeAddressModel.setPhone1(employeeAddressData.getTelNo());
		}
		if (null != employeeAddressData.getTelNo2()) {
			employeeAddressModel.setPhone2(employeeAddressData.getTelNo2());
		}

		if (employeeAddressData.getCountryKey() != null) {
			final String isocode = employeeAddressData.getCountryKey();
			try {
				final CountryModel countryModel = getCommonI18NService().getCountry(isocode);
				employeeAddressModel.setCountry(countryModel);
			} catch (final UnknownIdentifierException e) {
				throw new ConversionException("No country with the code " + isocode + " found.", e);
			} catch (final AmbiguousIdentifierException e) {
				throw new ConversionException("More than one country with the code " + isocode + " found.", e);
			}
		}

		if (employeeAddressData.getRegion() != null) {
			final String isocode = employeeAddressData.getRegion();
			try {
				final RegionModel regionModel = getCommonI18NService()
						.getRegion(getCommonI18NService().getCountry(employeeAddressData.getCountryKey()), isocode);
				employeeAddressModel.setRegion(regionModel);
			} catch (final UnknownIdentifierException e) {
				throw new ConversionException("No region with the code " + isocode + " found.", e);
			} catch (final AmbiguousIdentifierException e) {
				throw new ConversionException("More than one region with the code " + isocode + " found.", e);
			}
		}
		employeeAddressModel.setCity(getCity(employeeAddressData.getCity()));

		employeeAddressModel.setOwner(employeeModel);
		employeeModel.setDefaultShipmentAddress(employeeAddressModel);
		employeeModel.setDefaultPaymentAddress(employeeAddressModel);

	}

	public CommonI18NService getCommonI18NService() {
		return commonI18NService;
	}

	public void setCommonI18NService(CommonI18NService commonI18NService) {
		this.commonI18NService = commonI18NService;
	}

	public CustomerNameStrategy getCustomerNameStrategy() {
		return customerNameStrategy;
	}

	public void setCustomerNameStrategy(CustomerNameStrategy customerNameStrategy) {
		this.customerNameStrategy = customerNameStrategy;
	}

	public ModelService getModelService() {
		return modelService;
	}

	public void setModelService(ModelService modelService) {
		this.modelService = modelService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public FlexibleSearchService getFlexibleSearchService() {
		return flexibleSearchService;
	}

	public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
		this.flexibleSearchService = flexibleSearchService;
	}

	public SearchRestrictionService getSearchRestrictionService() {
		return searchRestrictionService;
	}

	public void setSearchRestrictionService(SearchRestrictionService searchRestrictionService) {
		this.searchRestrictionService = searchRestrictionService;
	}
}
