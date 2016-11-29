/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.exception.commonlogging.constants;

/**
 * @deprecated use constants in Model classes instead
 */
@Deprecated
@SuppressWarnings({"unused","cast","PMD"})
public class GeneratedCommonloggingConstants
{
	public static final String EXTENSIONNAME = "commonlogging";
	public static class TC
	{
		public static final String ERRORCATEGORY = "ErrorCategory".intern();
		public static final String ERRORTYPE = "ErrorType".intern();
		public static final String HANDLING = "Handling".intern();
		public static final String SUPPLIERERROR = "SupplierError".intern();
		public static final String SUPPLIERERRORTYPE = "SupplierErrorType".intern();
		public static final String TRAVELOGIXERRORMASTER = "TravelogixErrorMaster".intern();
	}
	public static class Attributes
	{
		// no constants defined.
	}
	public static class Enumerations
	{
		public static class ErrorCategory
		{
			// values were not generated
		}
		public static class ErrorType
		{
			public static final String UNKNOWN = "UNKNOWN".intern();
			public static final String RECOVERABLE = "RECOVERABLE".intern();
			public static final String UNRECOVERABLE = "UNRECOVERABLE".intern();
			public static final String AGENT_ATTENTION = "AGENT_ATTENTION".intern();
		}
		public static class Handling
		{
			public static final String UNKNOWN = "UNKNOWN".intern();
			public static final String RECOVERABLE = "RECOVERABLE".intern();
			public static final String UNRECOVERABLE = "UNRECOVERABLE".intern();
			public static final String AGENT_ATTENTION = "AGENT_ATTENTION".intern();
		}
		public static class SupplierErrorType
		{
			public static final String SUPPLIER = "SUPPLIER".intern();
			public static final String NONSUPPLIER = "NONSUPPLIER".intern();
		}
	}
	public static class Relations
	{
		public static final String ERRORMASTER2SUPPLIER = "ErrorMaster2Supplier".intern();
	}
	
	protected GeneratedCommonloggingConstants()
	{
		// private constructor
	}
	
	
}
