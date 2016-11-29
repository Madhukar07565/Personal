/**
 *
 */
package com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.service.impl;

import de.hybris.platform.servicelayer.keygenerator.KeyGenerator;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.model.AbstractTravelogixSupplierOfferModel;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.service.TravelogixSupplierOfferService;


/**
 * @author Puneet
 *
 */
public class TravelogixSupplierOfferServiceImpl implements TravelogixSupplierOfferService
{

	private KeyGenerator keyGenerator;

	/*
	 * (non-Javadoc)
	 *
	 * @see com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.service.TravelogixSupplierOfferService#
	 * generateTravelogixId(com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.model.
	 * TravelogixSupplierOfferModel)
	 */
	@Override
	public void generateTravelogixId(final AbstractTravelogixSupplierOfferModel travelogixSupplierOfferModel)
	{
		travelogixSupplierOfferModel.setCode(getKeyGenerator().generate().toString());
	}

	/**
	 * @return the keyGenerator
	 */
	public KeyGenerator getKeyGenerator()
	{
		return keyGenerator;
	}

	/**
	 * @param keyGenerator
	 *           the keyGenerator to set
	 */
	public void setKeyGenerator(final KeyGenerator keyGenerator)
	{
		this.keyGenerator = keyGenerator;
	}


}


