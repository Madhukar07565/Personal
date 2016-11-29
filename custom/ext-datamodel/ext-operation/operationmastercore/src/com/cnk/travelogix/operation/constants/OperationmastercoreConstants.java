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
package com.cnk.travelogix.operation.constants;

/**
 * Global class for all Operationmastercore constants. You can add global constants for your extension into this class.
 */
public final class OperationmastercoreConstants extends GeneratedOperationmastercoreConstants
{
	public static final String EXTENSIONNAME = "operationmastercore";

	private OperationmastercoreConstants()
	{
		//empty to avoid instantiating this constant class
	}

	// implement here constants used by this extension

	public static final String COMP_ID = "compId".intern();
	public static final String QUERY_FORCMS_COMP = "select {comp:pk} from {AbstractCMSComponent As comp} where {comp.uid}=?compId"
			.intern();
	// for recofirmation config models

	public static final String QUERY_FOR_RECONFIRMATION_CONFIG_MODEL = "select {rc:pk} from {ReconfirmationConfig As rc}".intern();

	public static final String PRODUCT_PK = "productPK".intern();
	public static final String QUERY_FOR_RECONFIRMATION_CONFIG_FOR_PRODUCT = "select {rc:pk} from {ReconfirmationConfig As rc} where {rc.product}=?productPK"
			.intern();

	public static final String CLINET_PK = "clientPK".intern();
	public static final String QUERY_FOR_RECONFIRMATION_CONFIG_FOR_CLIENT = "select {rc:pk} from {ReconfirmationConfig As rc JOIN ClientReconfirmationConfig As crc ON {crc.reconfirmationconfig}={rc.pk} JOIN TravelogixB2BUnit As unit ON {crc.client}={unit.pk}} where {unit.pk}=?clientPK"
			.intern();

	public static final String SUPPLIER_PK = "supplierPK".intern();
	public static final String QUERY_FOR_RECONFIRMATION_CONFIG_FOR_SUPPLIER = "select {rc:pk} from {ReconfirmationConfig As rc JOIN SupplierReconfirmationConfig As src ON {src.reconfirmationconfig}={rc.pk} JOIN Supplier As s ON {src.supplier}={s.pk}} where {s.pk}=?supplierPK"
			.intern();

	public static final String QUERY_FOR_SUPPLIER_RECONFIRMATION_CONFIG_FOR_SUPPLIER = "select {src:pk} from {SupplierReconfirmationConfig As src JOIN Supplier As s ON {src.supplier}={s.pk}} where {s.pk}=?supplierPK"
			.intern();

	public static final String QUERY_FOR_CLIENT_RECONFIRMATION_CONFIG_FOR_CLIENT = "select {crc:pk} from {ClientReconfirmationConfig As crc JOIN TravelogixB2BUnit As unit ON {crc.client}={unit.pk}} where {unit.pk}=?clientPK"
			.intern();

	public static final String QUERY_FOR_SUPPLIER_RECONFIRMATION_CONFIG = "select {src:pk} from {SupplierReconfirmationConfig As src}"
			.intern();

	public static final String QUERY_FOR_CLIENT_RECONFIRMATION_CONFIG = "select {crc:pk} from {ClientReconfirmationConfig As crc }"
			.intern();

	public static final String CAT_ID = "catId".intern();
	public static final String QUERY_PRODUCT_CAT_SUB_TYPE = "select {cat:pk} from {ProductCategorySubType As cat} where {cat.code}=?catId"
			.intern();
	public static final String QUERY_ALL_PRODUCT_CATEGORY = "select {cat:pk} from {Category as cat}".intern();

}
