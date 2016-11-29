/**
 *
 */
package com.cnk.travelogix.supplier.mappings.exception;

// TODO: Auto-generated Javadoc
/**
 * The Enum SupplierMappingErrorCodes.
 *
 * @author admin
 */
public enum SupplierMappingErrorCodes
{

	/** The err runtime. */
	ERR_RUNTIME(1100),

	/** The err empty result set. */
	ERR_EMPTY_RESULT_SET(1101),

	/** The err duplicate record found. */
	ERR_DUPLICATE_RECORD_FOUND(1102, ""),

	/** The err mandatory record. */
	ERR_MANDATORY_RECORD_FOUND_NULL(1103, "");

	/** The localized msg key. */
	private String localizedMsgKey;

	/** The error code. */
	private int errorCode;


	SupplierMappingErrorCodes(final int pErrorCode)
	{
		this.errorCode = pErrorCode;
	}

	/**
	 * Instantiates a new supplier mapping error codes.
	 *
	 * @param pErrorCode
	 *           the error code
	 * @param pLocalizedMsgKey
	 *           the localized msg key
	 */
	SupplierMappingErrorCodes(final int pErrorCode, final String pLocalizedMsgKey)
	{
		this(pErrorCode);
		this.localizedMsgKey = pLocalizedMsgKey;
	}

	/**
	 * Gets the localized msg key.
	 *
	 * @return the localizedMsgKey
	 */
	public String getLocalizedMsgKey()
	{
		return localizedMsgKey;
	}

	/**
	 * Gets the error code.
	 *
	 * @return the errorCode
	 */
	public int getErrorCode()
	{
		return errorCode;
	}

}
