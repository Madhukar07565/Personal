/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.timelimit.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.partpayment.jalo.ProductInformation;
import com.cnk.travelogix.client.config.core.supplier.jalo.SupplierInformation;
import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitExpiryDetails;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel;
import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig TimeLimitMasterConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTimeLimitMasterConfig extends AbstractTravelogixItem
{
	/** Qualifier of the <code>TimeLimitMasterConfig.timeLimitMasterId</code> attribute **/
	public static final String TIMELIMITMASTERID = "timeLimitMasterId";
	/** Qualifier of the <code>TimeLimitMasterConfig.entityName</code> attribute **/
	public static final String ENTITYNAME = "entityName";
	/** Qualifier of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute **/
	public static final String ENABLEPAYMENTFORTIMELIMITBOOKING = "enablePaymentForTimeLimitBooking";
	/** Qualifier of the <code>TimeLimitMasterConfig.bufferDays</code> attribute **/
	public static final String BUFFERDAYS = "bufferDays";
	/** Qualifier of the <code>TimeLimitMasterConfig.bufferHours</code> attribute **/
	public static final String BUFFERHOURS = "bufferHours";
	/** Qualifier of the <code>TimeLimitMasterConfig.bookingDate</code> attribute **/
	public static final String BOOKINGDATE = "bookingDate";
	/** Qualifier of the <code>TimeLimitMasterConfig.travelDate</code> attribute **/
	public static final String TRAVELDATE = "travelDate";
	/** Qualifier of the <code>TimeLimitMasterConfig.timeLimit</code> attribute **/
	public static final String TIMELIMIT = "timeLimit";
	/** Qualifier of the <code>TimeLimitMasterConfig.reconfirmation</code> attribute **/
	public static final String RECONFIRMATION = "reconfirmation";
	/** Qualifier of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute **/
	public static final String EXCLUDEALLOCATION = "excludeAllocation";
	/** Qualifier of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute **/
	public static final String TIMELIMITEXTENSION = "timeLimitExtension";
	/** Qualifier of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute **/
	public static final String EXPIRYNOTIFICATIONPERIODINDAYS = "expiryNotificationPeriodInDays";
	/** Qualifier of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute **/
	public static final String EXPIRYNOTIFICATIONPERIODINHOURS = "expiryNotificationPeriodInHours";
	/** Qualifier of the <code>TimeLimitMasterConfig.timeLimitExpiryEnabledOn</code> attribute **/
	public static final String TIMELIMITEXPIRYENABLEDON = "timeLimitExpiryEnabledOn";
	/** Qualifier of the <code>TimeLimitMasterConfig.timeLimitExpiryDetails</code> attribute **/
	public static final String TIMELIMITEXPIRYDETAILS = "timeLimitExpiryDetails";
	/** Qualifier of the <code>TimeLimitMasterConfig.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>TimeLimitMasterConfig.supplierInformation</code> attribute **/
	public static final String SUPPLIERINFORMATION = "supplierInformation";
	/** Qualifier of the <code>TimeLimitMasterConfig.productInformation</code> attribute **/
	public static final String PRODUCTINFORMATION = "productInformation";
	/** Qualifier of the <code>TimeLimitMasterConfig.suppliers</code> attribute **/
	public static final String SUPPLIERS = "suppliers";
	/** Qualifier of the <code>TimeLimitMasterConfig.pointOfSale</code> attribute **/
	public static final String POINTOFSALE = "pointOfSale";
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierInformation> SUPPLIERINFORMATIONHANDLER = new OneToManyHandler<SupplierInformation>(
	ClientconfigConstants.TC.SUPPLIERINFORMATION,
	false,
	"timeLimitMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ProductInformation> PRODUCTINFORMATIONHANDLER = new OneToManyHandler<ProductInformation>(
	ClientconfigConstants.TC.PRODUCTINFORMATION,
	false,
	"timeLimitMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Supplier> SUPPLIERSHANDLER = new OneToManyHandler<Supplier>(
	SuppliercoreConstants.TC.SUPPLIER,
	false,
	"timeLimitMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POINTOFSALE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DistributionChannel> POINTOFSALEHANDLER = new OneToManyHandler<DistributionChannel>(
	OrgstructurecoreConstants.TC.DISTRIBUTIONCHANNEL,
	false,
	"timeLimitMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TIMELIMITMASTERID, AttributeMode.INITIAL);
		tmp.put(ENTITYNAME, AttributeMode.INITIAL);
		tmp.put(ENABLEPAYMENTFORTIMELIMITBOOKING, AttributeMode.INITIAL);
		tmp.put(BUFFERDAYS, AttributeMode.INITIAL);
		tmp.put(BUFFERHOURS, AttributeMode.INITIAL);
		tmp.put(BOOKINGDATE, AttributeMode.INITIAL);
		tmp.put(TRAVELDATE, AttributeMode.INITIAL);
		tmp.put(TIMELIMIT, AttributeMode.INITIAL);
		tmp.put(RECONFIRMATION, AttributeMode.INITIAL);
		tmp.put(EXCLUDEALLOCATION, AttributeMode.INITIAL);
		tmp.put(TIMELIMITEXTENSION, AttributeMode.INITIAL);
		tmp.put(EXPIRYNOTIFICATIONPERIODINDAYS, AttributeMode.INITIAL);
		tmp.put(EXPIRYNOTIFICATIONPERIODINHOURS, AttributeMode.INITIAL);
		tmp.put(TIMELIMITEXPIRYENABLEDON, AttributeMode.INITIAL);
		tmp.put(TIMELIMITEXPIRYDETAILS, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.bookingDate</code> attribute.
	 * @return the bookingDate
	 */
	public Date getBookingDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BOOKINGDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.bookingDate</code> attribute.
	 * @return the bookingDate
	 */
	public Date getBookingDate()
	{
		return getBookingDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.bookingDate</code> attribute. 
	 * @param value the bookingDate
	 */
	public void setBookingDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BOOKINGDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.bookingDate</code> attribute. 
	 * @param value the bookingDate
	 */
	public void setBookingDate(final Date value)
	{
		setBookingDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.bufferDays</code> attribute.
	 * @return the bufferDays
	 */
	public String getBufferDays(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUFFERDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.bufferDays</code> attribute.
	 * @return the bufferDays
	 */
	public String getBufferDays()
	{
		return getBufferDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.bufferDays</code> attribute. 
	 * @param value the bufferDays
	 */
	public void setBufferDays(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUFFERDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.bufferDays</code> attribute. 
	 * @param value the bufferDays
	 */
	public void setBufferDays(final String value)
	{
		setBufferDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.bufferHours</code> attribute.
	 * @return the bufferHours
	 */
	public String getBufferHours(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUFFERHOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.bufferHours</code> attribute.
	 * @return the bufferHours
	 */
	public String getBufferHours()
	{
		return getBufferHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.bufferHours</code> attribute. 
	 * @param value the bufferHours
	 */
	public void setBufferHours(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUFFERHOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.bufferHours</code> attribute. 
	 * @param value the bufferHours
	 */
	public void setBufferHours(final String value)
	{
		setBufferHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective from Date
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.effectiveFrom</code> attribute.
	 * @return the effectiveFrom - Effective from Date
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective from Date
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom - Effective from Date
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute.
	 * @return the enablePaymentForTimeLimitBooking
	 */
	public Boolean isEnablePaymentForTimeLimitBooking(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ENABLEPAYMENTFORTIMELIMITBOOKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute.
	 * @return the enablePaymentForTimeLimitBooking
	 */
	public Boolean isEnablePaymentForTimeLimitBooking()
	{
		return isEnablePaymentForTimeLimitBooking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute. 
	 * @return the enablePaymentForTimeLimitBooking
	 */
	public boolean isEnablePaymentForTimeLimitBookingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnablePaymentForTimeLimitBooking( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute. 
	 * @return the enablePaymentForTimeLimitBooking
	 */
	public boolean isEnablePaymentForTimeLimitBookingAsPrimitive()
	{
		return isEnablePaymentForTimeLimitBookingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute. 
	 * @param value the enablePaymentForTimeLimitBooking
	 */
	public void setEnablePaymentForTimeLimitBooking(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ENABLEPAYMENTFORTIMELIMITBOOKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute. 
	 * @param value the enablePaymentForTimeLimitBooking
	 */
	public void setEnablePaymentForTimeLimitBooking(final Boolean value)
	{
		setEnablePaymentForTimeLimitBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute. 
	 * @param value the enablePaymentForTimeLimitBooking
	 */
	public void setEnablePaymentForTimeLimitBooking(final SessionContext ctx, final boolean value)
	{
		setEnablePaymentForTimeLimitBooking( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.enablePaymentForTimeLimitBooking</code> attribute. 
	 * @param value the enablePaymentForTimeLimitBooking
	 */
	public void setEnablePaymentForTimeLimitBooking(final boolean value)
	{
		setEnablePaymentForTimeLimitBooking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName()
	{
		return getEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final Principal value)
	{
		setEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute.
	 * @return the excludeAllocation
	 */
	public Boolean isExcludeAllocation(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, EXCLUDEALLOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute.
	 * @return the excludeAllocation
	 */
	public Boolean isExcludeAllocation()
	{
		return isExcludeAllocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute. 
	 * @return the excludeAllocation
	 */
	public boolean isExcludeAllocationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isExcludeAllocation( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute. 
	 * @return the excludeAllocation
	 */
	public boolean isExcludeAllocationAsPrimitive()
	{
		return isExcludeAllocationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute. 
	 * @param value the excludeAllocation
	 */
	public void setExcludeAllocation(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, EXCLUDEALLOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute. 
	 * @param value the excludeAllocation
	 */
	public void setExcludeAllocation(final Boolean value)
	{
		setExcludeAllocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute. 
	 * @param value the excludeAllocation
	 */
	public void setExcludeAllocation(final SessionContext ctx, final boolean value)
	{
		setExcludeAllocation( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.excludeAllocation</code> attribute. 
	 * @param value the excludeAllocation
	 */
	public void setExcludeAllocation(final boolean value)
	{
		setExcludeAllocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute.
	 * @return the expiryNotificationPeriodInDays
	 */
	public Integer getExpiryNotificationPeriodInDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EXPIRYNOTIFICATIONPERIODINDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute.
	 * @return the expiryNotificationPeriodInDays
	 */
	public Integer getExpiryNotificationPeriodInDays()
	{
		return getExpiryNotificationPeriodInDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute. 
	 * @return the expiryNotificationPeriodInDays
	 */
	public int getExpiryNotificationPeriodInDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getExpiryNotificationPeriodInDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute. 
	 * @return the expiryNotificationPeriodInDays
	 */
	public int getExpiryNotificationPeriodInDaysAsPrimitive()
	{
		return getExpiryNotificationPeriodInDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute. 
	 * @param value the expiryNotificationPeriodInDays
	 */
	public void setExpiryNotificationPeriodInDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EXPIRYNOTIFICATIONPERIODINDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute. 
	 * @param value the expiryNotificationPeriodInDays
	 */
	public void setExpiryNotificationPeriodInDays(final Integer value)
	{
		setExpiryNotificationPeriodInDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute. 
	 * @param value the expiryNotificationPeriodInDays
	 */
	public void setExpiryNotificationPeriodInDays(final SessionContext ctx, final int value)
	{
		setExpiryNotificationPeriodInDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInDays</code> attribute. 
	 * @param value the expiryNotificationPeriodInDays
	 */
	public void setExpiryNotificationPeriodInDays(final int value)
	{
		setExpiryNotificationPeriodInDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute.
	 * @return the expiryNotificationPeriodInHours
	 */
	public Integer getExpiryNotificationPeriodInHours(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EXPIRYNOTIFICATIONPERIODINHOURS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute.
	 * @return the expiryNotificationPeriodInHours
	 */
	public Integer getExpiryNotificationPeriodInHours()
	{
		return getExpiryNotificationPeriodInHours( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute. 
	 * @return the expiryNotificationPeriodInHours
	 */
	public int getExpiryNotificationPeriodInHoursAsPrimitive(final SessionContext ctx)
	{
		Integer value = getExpiryNotificationPeriodInHours( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute. 
	 * @return the expiryNotificationPeriodInHours
	 */
	public int getExpiryNotificationPeriodInHoursAsPrimitive()
	{
		return getExpiryNotificationPeriodInHoursAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute. 
	 * @param value the expiryNotificationPeriodInHours
	 */
	public void setExpiryNotificationPeriodInHours(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EXPIRYNOTIFICATIONPERIODINHOURS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute. 
	 * @param value the expiryNotificationPeriodInHours
	 */
	public void setExpiryNotificationPeriodInHours(final Integer value)
	{
		setExpiryNotificationPeriodInHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute. 
	 * @param value the expiryNotificationPeriodInHours
	 */
	public void setExpiryNotificationPeriodInHours(final SessionContext ctx, final int value)
	{
		setExpiryNotificationPeriodInHours( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.expiryNotificationPeriodInHours</code> attribute. 
	 * @param value the expiryNotificationPeriodInHours
	 */
	public void setExpiryNotificationPeriodInHours(final int value)
	{
		setExpiryNotificationPeriodInHours( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Set<DistributionChannel> getPointOfSale(final SessionContext ctx)
	{
		return (Set<DistributionChannel>)POINTOFSALEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Set<DistributionChannel> getPointOfSale()
	{
		return getPointOfSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final SessionContext ctx, final Set<DistributionChannel> value)
	{
		POINTOFSALEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final Set<DistributionChannel> value)
	{
		setPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final SessionContext ctx, final DistributionChannel value)
	{
		POINTOFSALEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final DistributionChannel value)
	{
		addToPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final SessionContext ctx, final DistributionChannel value)
	{
		POINTOFSALEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final DistributionChannel value)
	{
		removeFromPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.productInformation</code> attribute.
	 * @return the productInformation
	 */
	public Set<ProductInformation> getProductInformation(final SessionContext ctx)
	{
		return (Set<ProductInformation>)PRODUCTINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.productInformation</code> attribute.
	 * @return the productInformation
	 */
	public Set<ProductInformation> getProductInformation()
	{
		return getProductInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.productInformation</code> attribute. 
	 * @param value the productInformation
	 */
	public void setProductInformation(final SessionContext ctx, final Set<ProductInformation> value)
	{
		PRODUCTINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.productInformation</code> attribute. 
	 * @param value the productInformation
	 */
	public void setProductInformation(final Set<ProductInformation> value)
	{
		setProductInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productInformation. 
	 * @param value the item to add to productInformation
	 */
	public void addToProductInformation(final SessionContext ctx, final ProductInformation value)
	{
		PRODUCTINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productInformation. 
	 * @param value the item to add to productInformation
	 */
	public void addToProductInformation(final ProductInformation value)
	{
		addToProductInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productInformation. 
	 * @param value the item to remove from productInformation
	 */
	public void removeFromProductInformation(final SessionContext ctx, final ProductInformation value)
	{
		PRODUCTINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productInformation. 
	 * @param value the item to remove from productInformation
	 */
	public void removeFromProductInformation(final ProductInformation value)
	{
		removeFromProductInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.reconfirmation</code> attribute.
	 * @return the reconfirmation
	 */
	public String getReconfirmation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RECONFIRMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.reconfirmation</code> attribute.
	 * @return the reconfirmation
	 */
	public String getReconfirmation()
	{
		return getReconfirmation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.reconfirmation</code> attribute. 
	 * @param value the reconfirmation
	 */
	public void setReconfirmation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RECONFIRMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.reconfirmation</code> attribute. 
	 * @param value the reconfirmation
	 */
	public void setReconfirmation(final String value)
	{
		setReconfirmation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.supplierInformation</code> attribute.
	 * @return the supplierInformation
	 */
	public Set<SupplierInformation> getSupplierInformation(final SessionContext ctx)
	{
		return (Set<SupplierInformation>)SUPPLIERINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.supplierInformation</code> attribute.
	 * @return the supplierInformation
	 */
	public Set<SupplierInformation> getSupplierInformation()
	{
		return getSupplierInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.supplierInformation</code> attribute. 
	 * @param value the supplierInformation
	 */
	public void setSupplierInformation(final SessionContext ctx, final Set<SupplierInformation> value)
	{
		SUPPLIERINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.supplierInformation</code> attribute. 
	 * @param value the supplierInformation
	 */
	public void setSupplierInformation(final Set<SupplierInformation> value)
	{
		setSupplierInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierInformation. 
	 * @param value the item to add to supplierInformation
	 */
	public void addToSupplierInformation(final SessionContext ctx, final SupplierInformation value)
	{
		SUPPLIERINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierInformation. 
	 * @param value the item to add to supplierInformation
	 */
	public void addToSupplierInformation(final SupplierInformation value)
	{
		addToSupplierInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierInformation. 
	 * @param value the item to remove from supplierInformation
	 */
	public void removeFromSupplierInformation(final SessionContext ctx, final SupplierInformation value)
	{
		SUPPLIERINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierInformation. 
	 * @param value the item to remove from supplierInformation
	 */
	public void removeFromSupplierInformation(final SupplierInformation value)
	{
		removeFromSupplierInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Set<Supplier> getSuppliers(final SessionContext ctx)
	{
		return (Set<Supplier>)SUPPLIERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.suppliers</code> attribute.
	 * @return the suppliers
	 */
	public Set<Supplier> getSuppliers()
	{
		return getSuppliers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final SessionContext ctx, final Set<Supplier> value)
	{
		SUPPLIERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.suppliers</code> attribute. 
	 * @param value the suppliers
	 */
	public void setSuppliers(final Set<Supplier> value)
	{
		setSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to suppliers. 
	 * @param value the item to add to suppliers
	 */
	public void addToSuppliers(final Supplier value)
	{
		addToSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final SessionContext ctx, final Supplier value)
	{
		SUPPLIERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from suppliers. 
	 * @param value the item to remove from suppliers
	 */
	public void removeFromSuppliers(final Supplier value)
	{
		removeFromSuppliers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimit</code> attribute.
	 * @return the timeLimit
	 */
	public String getTimeLimit(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMELIMIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimit</code> attribute.
	 * @return the timeLimit
	 */
	public String getTimeLimit()
	{
		return getTimeLimit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimit</code> attribute. 
	 * @param value the timeLimit
	 */
	public void setTimeLimit(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMELIMIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimit</code> attribute. 
	 * @param value the timeLimit
	 */
	public void setTimeLimit(final String value)
	{
		setTimeLimit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitExpiryDetails</code> attribute.
	 * @return the timeLimitExpiryDetails
	 */
	public TimeLimitExpiryDetails getTimeLimitExpiryDetails(final SessionContext ctx)
	{
		return (TimeLimitExpiryDetails)getProperty( ctx, TIMELIMITEXPIRYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitExpiryDetails</code> attribute.
	 * @return the timeLimitExpiryDetails
	 */
	public TimeLimitExpiryDetails getTimeLimitExpiryDetails()
	{
		return getTimeLimitExpiryDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitExpiryDetails</code> attribute. 
	 * @param value the timeLimitExpiryDetails
	 */
	public void setTimeLimitExpiryDetails(final SessionContext ctx, final TimeLimitExpiryDetails value)
	{
		setProperty(ctx, TIMELIMITEXPIRYDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitExpiryDetails</code> attribute. 
	 * @param value the timeLimitExpiryDetails
	 */
	public void setTimeLimitExpiryDetails(final TimeLimitExpiryDetails value)
	{
		setTimeLimitExpiryDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitExpiryEnabledOn</code> attribute.
	 * @return the timeLimitExpiryEnabledOn
	 */
	public EnumerationValue getTimeLimitExpiryEnabledOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TIMELIMITEXPIRYENABLEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitExpiryEnabledOn</code> attribute.
	 * @return the timeLimitExpiryEnabledOn
	 */
	public EnumerationValue getTimeLimitExpiryEnabledOn()
	{
		return getTimeLimitExpiryEnabledOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitExpiryEnabledOn</code> attribute. 
	 * @param value the timeLimitExpiryEnabledOn
	 */
	public void setTimeLimitExpiryEnabledOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TIMELIMITEXPIRYENABLEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitExpiryEnabledOn</code> attribute. 
	 * @param value the timeLimitExpiryEnabledOn
	 */
	public void setTimeLimitExpiryEnabledOn(final EnumerationValue value)
	{
		setTimeLimitExpiryEnabledOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute.
	 * @return the timeLimitExtension
	 */
	public Boolean isTimeLimitExtension(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TIMELIMITEXTENSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute.
	 * @return the timeLimitExtension
	 */
	public Boolean isTimeLimitExtension()
	{
		return isTimeLimitExtension( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute. 
	 * @return the timeLimitExtension
	 */
	public boolean isTimeLimitExtensionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTimeLimitExtension( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute. 
	 * @return the timeLimitExtension
	 */
	public boolean isTimeLimitExtensionAsPrimitive()
	{
		return isTimeLimitExtensionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute. 
	 * @param value the timeLimitExtension
	 */
	public void setTimeLimitExtension(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TIMELIMITEXTENSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute. 
	 * @param value the timeLimitExtension
	 */
	public void setTimeLimitExtension(final Boolean value)
	{
		setTimeLimitExtension( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute. 
	 * @param value the timeLimitExtension
	 */
	public void setTimeLimitExtension(final SessionContext ctx, final boolean value)
	{
		setTimeLimitExtension( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitExtension</code> attribute. 
	 * @param value the timeLimitExtension
	 */
	public void setTimeLimitExtension(final boolean value)
	{
		setTimeLimitExtension( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitMasterId</code> attribute.
	 * @return the timeLimitMasterId
	 */
	public String getTimeLimitMasterId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMELIMITMASTERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.timeLimitMasterId</code> attribute.
	 * @return the timeLimitMasterId
	 */
	public String getTimeLimitMasterId()
	{
		return getTimeLimitMasterId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitMasterId</code> attribute. 
	 * @param value the timeLimitMasterId
	 */
	public void setTimeLimitMasterId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMELIMITMASTERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.timeLimitMasterId</code> attribute. 
	 * @param value the timeLimitMasterId
	 */
	public void setTimeLimitMasterId(final String value)
	{
		setTimeLimitMasterId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.travelDate</code> attribute.
	 * @return the travelDate
	 */
	public Date getTravelDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TRAVELDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TimeLimitMasterConfig.travelDate</code> attribute.
	 * @return the travelDate
	 */
	public Date getTravelDate()
	{
		return getTravelDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.travelDate</code> attribute. 
	 * @param value the travelDate
	 */
	public void setTravelDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TRAVELDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TimeLimitMasterConfig.travelDate</code> attribute. 
	 * @param value the travelDate
	 */
	public void setTravelDate(final Date value)
	{
		setTravelDate( getSession().getSessionContext(), value );
	}
	
}
