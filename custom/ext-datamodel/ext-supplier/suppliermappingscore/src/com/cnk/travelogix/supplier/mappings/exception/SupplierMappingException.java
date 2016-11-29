/**
 *
 */
package com.cnk.travelogix.supplier.mappings.exception;

/**
 * @author admin
 *
 */
public final class SupplierMappingException extends Exception
{

	/** The error code. */
	private final SupplierMappingErrorCodes errorCode;

	/**
	 * Instantiates a new supplier mapping exception.
	 *
	 * @param pErrorCode
	 *           the error code
	 */
	public SupplierMappingException(final SupplierMappingErrorCodes pErrorCode)
	{
		super("ERROR CODE : " + pErrorCode.getErrorCode());
		this.errorCode = pErrorCode;
	}

	/**
	 * Instantiates a new supplier mapping exception.
	 *
	 * @param pMsg
	 *           the msg
	 * @param pErrorCode
	 *           the error code
	 */
	public SupplierMappingException(final String pMsg, final SupplierMappingErrorCodes pErrorCode)
	{
		super(pMsg + " : ERROR CODE : " + pErrorCode.getErrorCode());
		this.errorCode = pErrorCode;
	}

	/**
	 * Instantiates a new supplier mapping exception.
	 *
	 * @param pErrorCode
	 *           the error code
	 * @param e
	 *           the e
	 */
	public SupplierMappingException(final SupplierMappingErrorCodes pErrorCode, final Exception e)
	{
		super("ERROR CODE : " + pErrorCode.getErrorCode(), e);
		this.errorCode = pErrorCode;
	}

	/**
	 * Instantiates a new supplier mapping exception.
	 *
	 * @param pMsg
	 *           the msg
	 * @param pErrorCode
	 *           the error code
	 * @param e
	 *           the e
	 */
	public SupplierMappingException(final String pMsg, final SupplierMappingErrorCodes pErrorCode, final Exception e)
	{
		super(pMsg + " : ERROR CODE : " + pErrorCode.getErrorCode(), e);
		this.errorCode = pErrorCode;
	}

	/**
	 * @return the errorCode
	 */
	public SupplierMappingErrorCodes getErrorCode()
	{
		return errorCode;
	}
}
