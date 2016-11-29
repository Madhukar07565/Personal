/**
 *
 */
package com.cnk.travelogix.b2c.storefront.forms;

import de.hybris.platform.commercefacades.product.data.ImageData;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.RegionData;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.cnk.travelogix.common.core.cart.data.CityData;
import com.cnk.travelogix.common.core.cart.data.TravellerData;
import com.cnk.travelogix.common.core.cart.data.VisaInfoData;


/**
 * @author i054410
 *
 */
public class TravellerForm extends TravellerData implements MetaDataGenerator
{
	private static final long serialVersionUID = 1L;
	private static final String EMAIL_REGEX = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
	private static final String NUMBER_REGEX = "^[0-9]*$";
	private static final String ALPHABET_REGEX = "^[A-Za-z]+$";
	private static final String ALPHANUMERIC_REGEX = "^[A-Za-z0-9]+$";
	private String cid;
	private String action;

	@Override
	public Object generate()
	{
		final TravellerForm tlf = new TravellerForm();
		final AddressData ad = new AddressData();
		final CountryData country = new CountryData();
		ad.setCountry(country);
		final RegionData region = new RegionData();
		ad.setRegion(region);
		final CityData city = new CityData();
		ad.setCity(city);

		tlf.setVisaInfos(Arrays.asList(new VisaInfoData()));
		tlf.setAddress(ad);
		tlf.setPhoto(new ImageData());
		return tlf;
	}

	/**
	 * @return the cid
	 */
	public String getCid()
	{
		return cid;
	}

	/**
	 * @param cid
	 *           the cid to set
	 */
	public void setCid(final String cid)
	{
		this.cid = cid;
	}

	/**
	 * @return the action
	 */
	public String getAction()
	{
		return action;
	}

	/**
	 * @param action
	 *           the action to set
	 */
	public void setAction(final String action)
	{
		this.action = action;
	}

	public boolean validate(final ResponseMessage responseMessage)
	{
		boolean isValid = true;

		if (StringUtils.isEmpty(getTitle()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("title"), "Please select a valid title");
		}
		if (StringUtils.isBlank(getFirstName()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("firstName"), "Please enter a valid first name");
		}
		if (StringUtils.isBlank(getLastName()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("lastName"), "Please enter a valid last name");
		}
		if (getDateOfBirth() == null)
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("dateOfBirth"), "Please enter a valid date of birth");
		}

		// Contact Details
		if (StringUtils.isBlank(getEmail()) || (StringUtils.length(getEmail()) > 255 || !Pattern.matches(EMAIL_REGEX, getEmail())))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("email"), "Please enter a valid email");
		}
		if (StringUtils.isBlank(getMobileNumber()) || !Pattern.matches(NUMBER_REGEX, getMobileNumber()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("mobileNumber"), "Please enter a valid mobile number");
		}

		if (StringUtils.isBlank(getAddress().getCountry().getIsocode()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("address.country.isocode"),
					"Please select a country for address");
		}
		if (StringUtils.isBlank(getAddress().getRegion().getIsocode()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("address.region.isocode"),
					"Please select a state for address");
		}
		if (StringUtils.isBlank(getAddress().getCity().getCityIsoCode()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("address.city.cityIsoCode"),
					"Please select a city for address");
		}
		if (StringUtils.isBlank(getAddress().getPostalCode()) || !Pattern.matches(ALPHANUMERIC_REGEX, getAddress().getPostalCode()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("address.postalCode"),
					"Please enter a valid zip code for address");
		}

		// Travel Documents
		if (StringUtils.isNotBlank(getPassportNumber()) && !Pattern.matches(ALPHANUMERIC_REGEX, getPassportNumber()))
		{
			isValid = false;
			responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey("passportNumber"),
					"Please enter a valid passport number");
		}

		for (final VisaInfoData visa : getVisaInfos())
		{
			if (StringUtils.isBlank(visa.getCountry()) || !Pattern.matches(ALPHABET_REGEX, visa.getCountry()))
			{
				isValid = false;
				final String key = "visaInfos:" + visa.getCid() + ".country";
				responseMessage.changeStatus("Error").addInfo(buildErrorObjectKey(key), "Please enter a valid country name for visa");
			}
		}

		return isValid;
	}

	private String buildErrorObjectKey(final String keyName)
	{
		return "travellers:" + this.cid + "." + keyName;
	}
}
