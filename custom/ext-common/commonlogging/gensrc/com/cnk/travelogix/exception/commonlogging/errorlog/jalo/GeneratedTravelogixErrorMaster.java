/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.exception.commonlogging.errorlog.jalo;

import com.cnk.travelogix.exception.commonlogging.constants.CommonloggingConstants;
import com.cnk.travelogix.exception.commonlogging.errorlog.jalo.SupplierError;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.exception.commonlogging.errorlog.jalo.TravelogixErrorMaster TravelogixErrorMaster}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixErrorMaster extends GenericItem
{
	/** Qualifier of the <code>TravelogixErrorMaster.errorCode</code> attribute **/
	public static final String ERRORCODE = "errorCode";
	/** Qualifier of the <code>TravelogixErrorMaster.errorCategory</code> attribute **/
	public static final String ERRORCATEGORY = "errorCategory";
	/** Qualifier of the <code>TravelogixErrorMaster.handling</code> attribute **/
	public static final String HANDLING = "handling";
	/** Qualifier of the <code>TravelogixErrorMaster.errorType</code> attribute **/
	public static final String ERRORTYPE = "errorType";
	/** Qualifier of the <code>TravelogixErrorMaster.reportingRequired</code> attribute **/
	public static final String REPORTINGREQUIRED = "reportingRequired";
	/** Qualifier of the <code>TravelogixErrorMaster.operationRequired</code> attribute **/
	public static final String OPERATIONREQUIRED = "operationRequired";
	/** Qualifier of the <code>TravelogixErrorMaster.supplierError</code> attribute **/
	public static final String SUPPLIERERROR = "supplierError";
	/** Qualifier of the <code>TravelogixErrorMaster.presentationMsg</code> attribute **/
	public static final String PRESENTATIONMSG = "presentationMsg";
	/** Qualifier of the <code>TravelogixErrorMaster.verboseMsg</code> attribute **/
	public static final String VERBOSEMSG = "verboseMsg";
	/** Qualifier of the <code>TravelogixErrorMaster.correctiveMeasures</code> attribute **/
	public static final String CORRECTIVEMEASURES = "correctiveMeasures";
	/** Qualifier of the <code>TravelogixErrorMaster.supplierErrors</code> attribute **/
	public static final String SUPPLIERERRORS = "supplierErrors";
	/** Relation ordering override parameter constants for ErrorMaster2Supplier from ((commonlogging))*/
	protected static String ERRORMASTER2SUPPLIER_SRC_ORDERED = "relation.ErrorMaster2Supplier.source.ordered";
	protected static String ERRORMASTER2SUPPLIER_TGT_ORDERED = "relation.ErrorMaster2Supplier.target.ordered";
	/** Relation disable markmodifed parameter constants for ErrorMaster2Supplier from ((commonlogging))*/
	protected static String ERRORMASTER2SUPPLIER_MARKMODIFIED = "relation.ErrorMaster2Supplier.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ERRORCODE, AttributeMode.INITIAL);
		tmp.put(ERRORCATEGORY, AttributeMode.INITIAL);
		tmp.put(HANDLING, AttributeMode.INITIAL);
		tmp.put(ERRORTYPE, AttributeMode.INITIAL);
		tmp.put(REPORTINGREQUIRED, AttributeMode.INITIAL);
		tmp.put(OPERATIONREQUIRED, AttributeMode.INITIAL);
		tmp.put(SUPPLIERERROR, AttributeMode.INITIAL);
		tmp.put(PRESENTATIONMSG, AttributeMode.INITIAL);
		tmp.put(VERBOSEMSG, AttributeMode.INITIAL);
		tmp.put(CORRECTIVEMEASURES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.correctiveMeasures</code> attribute.
	 * @return the correctiveMeasures
	 */
	public String getCorrectiveMeasures(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CORRECTIVEMEASURES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.correctiveMeasures</code> attribute.
	 * @return the correctiveMeasures
	 */
	public String getCorrectiveMeasures()
	{
		return getCorrectiveMeasures( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.correctiveMeasures</code> attribute. 
	 * @param value the correctiveMeasures
	 */
	public void setCorrectiveMeasures(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CORRECTIVEMEASURES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.correctiveMeasures</code> attribute. 
	 * @param value the correctiveMeasures
	 */
	public void setCorrectiveMeasures(final String value)
	{
		setCorrectiveMeasures( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.errorCategory</code> attribute.
	 * @return the errorCategory
	 */
	public EnumerationValue getErrorCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ERRORCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.errorCategory</code> attribute.
	 * @return the errorCategory
	 */
	public EnumerationValue getErrorCategory()
	{
		return getErrorCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.errorCategory</code> attribute. 
	 * @param value the errorCategory
	 */
	public void setErrorCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ERRORCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.errorCategory</code> attribute. 
	 * @param value the errorCategory
	 */
	public void setErrorCategory(final EnumerationValue value)
	{
		setErrorCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.errorCode</code> attribute.
	 * @return the errorCode
	 */
	public String getErrorCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ERRORCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.errorCode</code> attribute.
	 * @return the errorCode
	 */
	public String getErrorCode()
	{
		return getErrorCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.errorCode</code> attribute. 
	 * @param value the errorCode
	 */
	public void setErrorCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ERRORCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.errorCode</code> attribute. 
	 * @param value the errorCode
	 */
	public void setErrorCode(final String value)
	{
		setErrorCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.errorType</code> attribute.
	 * @return the errorType
	 */
	public EnumerationValue getErrorType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ERRORTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.errorType</code> attribute.
	 * @return the errorType
	 */
	public EnumerationValue getErrorType()
	{
		return getErrorType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.errorType</code> attribute. 
	 * @param value the errorType
	 */
	public void setErrorType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ERRORTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.errorType</code> attribute. 
	 * @param value the errorType
	 */
	public void setErrorType(final EnumerationValue value)
	{
		setErrorType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.handling</code> attribute.
	 * @return the handling
	 */
	public EnumerationValue getHandling(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, HANDLING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.handling</code> attribute.
	 * @return the handling
	 */
	public EnumerationValue getHandling()
	{
		return getHandling( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.handling</code> attribute. 
	 * @param value the handling
	 */
	public void setHandling(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, HANDLING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.handling</code> attribute. 
	 * @param value the handling
	 */
	public void setHandling(final EnumerationValue value)
	{
		setHandling( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.operationRequired</code> attribute.
	 * @return the operationRequired
	 */
	public Boolean isOperationRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OPERATIONREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.operationRequired</code> attribute.
	 * @return the operationRequired
	 */
	public Boolean isOperationRequired()
	{
		return isOperationRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.operationRequired</code> attribute. 
	 * @return the operationRequired
	 */
	public boolean isOperationRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOperationRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.operationRequired</code> attribute. 
	 * @return the operationRequired
	 */
	public boolean isOperationRequiredAsPrimitive()
	{
		return isOperationRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.operationRequired</code> attribute. 
	 * @param value the operationRequired
	 */
	public void setOperationRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OPERATIONREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.operationRequired</code> attribute. 
	 * @param value the operationRequired
	 */
	public void setOperationRequired(final Boolean value)
	{
		setOperationRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.operationRequired</code> attribute. 
	 * @param value the operationRequired
	 */
	public void setOperationRequired(final SessionContext ctx, final boolean value)
	{
		setOperationRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.operationRequired</code> attribute. 
	 * @param value the operationRequired
	 */
	public void setOperationRequired(final boolean value)
	{
		setOperationRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.presentationMsg</code> attribute.
	 * @return the presentationMsg
	 */
	public String getPresentationMsg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRESENTATIONMSG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.presentationMsg</code> attribute.
	 * @return the presentationMsg
	 */
	public String getPresentationMsg()
	{
		return getPresentationMsg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.presentationMsg</code> attribute. 
	 * @param value the presentationMsg
	 */
	public void setPresentationMsg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRESENTATIONMSG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.presentationMsg</code> attribute. 
	 * @param value the presentationMsg
	 */
	public void setPresentationMsg(final String value)
	{
		setPresentationMsg( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.reportingRequired</code> attribute.
	 * @return the reportingRequired
	 */
	public Boolean isReportingRequired(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REPORTINGREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.reportingRequired</code> attribute.
	 * @return the reportingRequired
	 */
	public Boolean isReportingRequired()
	{
		return isReportingRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.reportingRequired</code> attribute. 
	 * @return the reportingRequired
	 */
	public boolean isReportingRequiredAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isReportingRequired( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.reportingRequired</code> attribute. 
	 * @return the reportingRequired
	 */
	public boolean isReportingRequiredAsPrimitive()
	{
		return isReportingRequiredAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.reportingRequired</code> attribute. 
	 * @param value the reportingRequired
	 */
	public void setReportingRequired(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REPORTINGREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.reportingRequired</code> attribute. 
	 * @param value the reportingRequired
	 */
	public void setReportingRequired(final Boolean value)
	{
		setReportingRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.reportingRequired</code> attribute. 
	 * @param value the reportingRequired
	 */
	public void setReportingRequired(final SessionContext ctx, final boolean value)
	{
		setReportingRequired( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.reportingRequired</code> attribute. 
	 * @param value the reportingRequired
	 */
	public void setReportingRequired(final boolean value)
	{
		setReportingRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.supplierError</code> attribute.
	 * @return the supplierError
	 */
	public Boolean isSupplierError(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SUPPLIERERROR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.supplierError</code> attribute.
	 * @return the supplierError
	 */
	public Boolean isSupplierError()
	{
		return isSupplierError( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.supplierError</code> attribute. 
	 * @return the supplierError
	 */
	public boolean isSupplierErrorAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSupplierError( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.supplierError</code> attribute. 
	 * @return the supplierError
	 */
	public boolean isSupplierErrorAsPrimitive()
	{
		return isSupplierErrorAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.supplierError</code> attribute. 
	 * @param value the supplierError
	 */
	public void setSupplierError(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SUPPLIERERROR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.supplierError</code> attribute. 
	 * @param value the supplierError
	 */
	public void setSupplierError(final Boolean value)
	{
		setSupplierError( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.supplierError</code> attribute. 
	 * @param value the supplierError
	 */
	public void setSupplierError(final SessionContext ctx, final boolean value)
	{
		setSupplierError( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.supplierError</code> attribute. 
	 * @param value the supplierError
	 */
	public void setSupplierError(final boolean value)
	{
		setSupplierError( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.supplierErrors</code> attribute.
	 * @return the supplierErrors
	 */
	public Set<SupplierError> getSupplierErrors(final SessionContext ctx)
	{
		final List<SupplierError> items = getLinkedItems( 
			ctx,
			true,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			"SupplierError",
			null,
			false,
			false
		);
		return new LinkedHashSet<SupplierError>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.supplierErrors</code> attribute.
	 * @return the supplierErrors
	 */
	public Set<SupplierError> getSupplierErrors()
	{
		return getSupplierErrors( getSession().getSessionContext() );
	}
	
	public long getSupplierErrorsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			"SupplierError",
			null
		);
	}
	
	public long getSupplierErrorsCount()
	{
		return getSupplierErrorsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.supplierErrors</code> attribute. 
	 * @param value the supplierErrors
	 */
	public void setSupplierErrors(final SessionContext ctx, final Set<SupplierError> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ERRORMASTER2SUPPLIER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.supplierErrors</code> attribute. 
	 * @param value the supplierErrors
	 */
	public void setSupplierErrors(final Set<SupplierError> value)
	{
		setSupplierErrors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierErrors. 
	 * @param value the item to add to supplierErrors
	 */
	public void addToSupplierErrors(final SessionContext ctx, final SupplierError value)
	{
		addLinkedItems( 
			ctx,
			true,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ERRORMASTER2SUPPLIER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierErrors. 
	 * @param value the item to add to supplierErrors
	 */
	public void addToSupplierErrors(final SupplierError value)
	{
		addToSupplierErrors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierErrors. 
	 * @param value the item to remove from supplierErrors
	 */
	public void removeFromSupplierErrors(final SessionContext ctx, final SupplierError value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ERRORMASTER2SUPPLIER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierErrors. 
	 * @param value the item to remove from supplierErrors
	 */
	public void removeFromSupplierErrors(final SupplierError value)
	{
		removeFromSupplierErrors( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.verboseMsg</code> attribute.
	 * @return the verboseMsg
	 */
	public String getVerboseMsg(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VERBOSEMSG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixErrorMaster.verboseMsg</code> attribute.
	 * @return the verboseMsg
	 */
	public String getVerboseMsg()
	{
		return getVerboseMsg( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.verboseMsg</code> attribute. 
	 * @param value the verboseMsg
	 */
	public void setVerboseMsg(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VERBOSEMSG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixErrorMaster.verboseMsg</code> attribute. 
	 * @param value the verboseMsg
	 */
	public void setVerboseMsg(final String value)
	{
		setVerboseMsg( getSession().getSessionContext(), value );
	}
	
}
