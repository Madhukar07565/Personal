/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.exception.commonlogging.errorlog.jalo;

import com.cnk.travelogix.exception.commonlogging.constants.CommonloggingConstants;
import com.cnk.travelogix.exception.commonlogging.errorlog.jalo.TravelogixErrorMaster;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
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
 * Generated class for type {@link com.cnk.travelogix.exception.commonlogging.errorlog.jalo.SupplierError SupplierError}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierError extends GenericItem
{
	/** Qualifier of the <code>SupplierError.supplierErrorType</code> attribute **/
	public static final String SUPPLIERERRORTYPE = "supplierErrorType";
	/** Qualifier of the <code>SupplierError.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>SupplierError.supplierErrorCode</code> attribute **/
	public static final String SUPPLIERERRORCODE = "supplierErrorCode";
	/** Qualifier of the <code>SupplierError.supplierErrorMessage</code> attribute **/
	public static final String SUPPLIERERRORMESSAGE = "supplierErrorMessage";
	/** Qualifier of the <code>SupplierError.travelogixErrorMasters</code> attribute **/
	public static final String TRAVELOGIXERRORMASTERS = "travelogixErrorMasters";
	/** Relation ordering override parameter constants for ErrorMaster2Supplier from ((commonlogging))*/
	protected static String ERRORMASTER2SUPPLIER_SRC_ORDERED = "relation.ErrorMaster2Supplier.source.ordered";
	protected static String ERRORMASTER2SUPPLIER_TGT_ORDERED = "relation.ErrorMaster2Supplier.target.ordered";
	/** Relation disable markmodifed parameter constants for ErrorMaster2Supplier from ((commonlogging))*/
	protected static String ERRORMASTER2SUPPLIER_MARKMODIFIED = "relation.ErrorMaster2Supplier.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIERERRORTYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(SUPPLIERERRORCODE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERERRORMESSAGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.supplierErrorCode</code> attribute.
	 * @return the supplierErrorCode
	 */
	public String getSupplierErrorCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPLIERERRORCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.supplierErrorCode</code> attribute.
	 * @return the supplierErrorCode
	 */
	public String getSupplierErrorCode()
	{
		return getSupplierErrorCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.supplierErrorCode</code> attribute. 
	 * @param value the supplierErrorCode
	 */
	public void setSupplierErrorCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPLIERERRORCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.supplierErrorCode</code> attribute. 
	 * @param value the supplierErrorCode
	 */
	public void setSupplierErrorCode(final String value)
	{
		setSupplierErrorCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.supplierErrorMessage</code> attribute.
	 * @return the supplierErrorMessage
	 */
	public String getSupplierErrorMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPLIERERRORMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.supplierErrorMessage</code> attribute.
	 * @return the supplierErrorMessage
	 */
	public String getSupplierErrorMessage()
	{
		return getSupplierErrorMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.supplierErrorMessage</code> attribute. 
	 * @param value the supplierErrorMessage
	 */
	public void setSupplierErrorMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPLIERERRORMESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.supplierErrorMessage</code> attribute. 
	 * @param value the supplierErrorMessage
	 */
	public void setSupplierErrorMessage(final String value)
	{
		setSupplierErrorMessage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.supplierErrorType</code> attribute.
	 * @return the supplierErrorType
	 */
	public EnumerationValue getSupplierErrorType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLIERERRORTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.supplierErrorType</code> attribute.
	 * @return the supplierErrorType
	 */
	public EnumerationValue getSupplierErrorType()
	{
		return getSupplierErrorType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.supplierErrorType</code> attribute. 
	 * @param value the supplierErrorType
	 */
	public void setSupplierErrorType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLIERERRORTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.supplierErrorType</code> attribute. 
	 * @param value the supplierErrorType
	 */
	public void setSupplierErrorType(final EnumerationValue value)
	{
		setSupplierErrorType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.travelogixErrorMasters</code> attribute.
	 * @return the travelogixErrorMasters
	 */
	public Set<TravelogixErrorMaster> getTravelogixErrorMasters(final SessionContext ctx)
	{
		final List<TravelogixErrorMaster> items = getLinkedItems( 
			ctx,
			false,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			"TravelogixErrorMaster",
			null,
			false,
			false
		);
		return new LinkedHashSet<TravelogixErrorMaster>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierError.travelogixErrorMasters</code> attribute.
	 * @return the travelogixErrorMasters
	 */
	public Set<TravelogixErrorMaster> getTravelogixErrorMasters()
	{
		return getTravelogixErrorMasters( getSession().getSessionContext() );
	}
	
	public long getTravelogixErrorMastersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			"TravelogixErrorMaster",
			null
		);
	}
	
	public long getTravelogixErrorMastersCount()
	{
		return getTravelogixErrorMastersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.travelogixErrorMasters</code> attribute. 
	 * @param value the travelogixErrorMasters
	 */
	public void setTravelogixErrorMasters(final SessionContext ctx, final Set<TravelogixErrorMaster> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ERRORMASTER2SUPPLIER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierError.travelogixErrorMasters</code> attribute. 
	 * @param value the travelogixErrorMasters
	 */
	public void setTravelogixErrorMasters(final Set<TravelogixErrorMaster> value)
	{
		setTravelogixErrorMasters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixErrorMasters. 
	 * @param value the item to add to travelogixErrorMasters
	 */
	public void addToTravelogixErrorMasters(final SessionContext ctx, final TravelogixErrorMaster value)
	{
		addLinkedItems( 
			ctx,
			false,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ERRORMASTER2SUPPLIER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelogixErrorMasters. 
	 * @param value the item to add to travelogixErrorMasters
	 */
	public void addToTravelogixErrorMasters(final TravelogixErrorMaster value)
	{
		addToTravelogixErrorMasters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixErrorMasters. 
	 * @param value the item to remove from travelogixErrorMasters
	 */
	public void removeFromTravelogixErrorMasters(final SessionContext ctx, final TravelogixErrorMaster value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CommonloggingConstants.Relations.ERRORMASTER2SUPPLIER,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ERRORMASTER2SUPPLIER_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelogixErrorMasters. 
	 * @param value the item to remove from travelogixErrorMasters
	 */
	public void removeFromTravelogixErrorMasters(final TravelogixErrorMaster value)
	{
		removeFromTravelogixErrorMasters( getSession().getSessionContext(), value );
	}
	
}
