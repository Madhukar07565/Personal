/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.occupancydetail.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.cruiseratedetail.jalo.CruiseRateDetail;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscruiseConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.occupancydetail.jalo.OccupancyDetail OccupancyDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOccupancyDetail extends GenericItem
{
	/** Qualifier of the <code>OccupancyDetail.occupancyType</code> attribute **/
	public static final String OCCUPANCYTYPE = "occupancyType";
	/** Qualifier of the <code>OccupancyDetail.extraPassenger</code> attribute **/
	public static final String EXTRAPASSENGER = "extraPassenger";
	/** Qualifier of the <code>OccupancyDetail.pricePercentage</code> attribute **/
	public static final String PRICEPERCENTAGE = "pricePercentage";
	/** Qualifier of the <code>OccupancyDetail.percentageCalculatedOn</code> attribute **/
	public static final String PERCENTAGECALCULATEDON = "percentageCalculatedOn";
	/** Qualifier of the <code>OccupancyDetail.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>OccupancyDetail.ageFrom</code> attribute **/
	public static final String AGEFROM = "ageFrom";
	/** Qualifier of the <code>OccupancyDetail.ageTo</code> attribute **/
	public static final String AGETO = "ageTo";
	/** Qualifier of the <code>OccupancyDetail.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>OccupancyDetail.commissionApplicable</code> attribute **/
	public static final String COMMISSIONAPPLICABLE = "commissionApplicable";
	/** Qualifier of the <code>OccupancyDetail.payOnArrival</code> attribute **/
	public static final String PAYONARRIVAL = "payOnArrival";
	/** Qualifier of the <code>OccupancyDetail.cruiseratedetail</code> attribute **/
	public static final String CRUISERATEDETAIL = "cruiseratedetail";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISERATEDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedOccupancyDetail> CRUISERATEDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedOccupancyDetail>(
	SupplierratedefinitionscruiseConstants.TC.OCCUPANCYDETAIL,
	false,
	"cruiseratedetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OCCUPANCYTYPE, AttributeMode.INITIAL);
		tmp.put(EXTRAPASSENGER, AttributeMode.INITIAL);
		tmp.put(PRICEPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(PERCENTAGECALCULATEDON, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(AGEFROM, AttributeMode.INITIAL);
		tmp.put(AGETO, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(COMMISSIONAPPLICABLE, AttributeMode.INITIAL);
		tmp.put(PAYONARRIVAL, AttributeMode.INITIAL);
		tmp.put(CRUISERATEDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageFrom</code> attribute.
	 * @return the ageFrom
	 */
	public Integer getAgeFrom(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOccupancyDetail.getAgeFrom requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, AGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageFrom</code> attribute.
	 * @return the ageFrom
	 */
	public Integer getAgeFrom()
	{
		return getAgeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @return the ageFrom
	 */
	public int getAgeFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAgeFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @return the ageFrom
	 */
	public int getAgeFromAsPrimitive()
	{
		return getAgeFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @return the localized ageFrom
	 */
	public Map<Language,Integer> getAllAgeFrom(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,AGEFROM,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @return the localized ageFrom
	 */
	public Map<Language,Integer> getAllAgeFrom()
	{
		return getAllAgeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAgeFrom(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOccupancyDetail.setAgeFrom requires a session language", 0 );
		}
		setLocalizedProperty(ctx, AGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAgeFrom(final Integer value)
	{
		setAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAgeFrom(final SessionContext ctx, final int value)
	{
		setAgeFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAgeFrom(final int value)
	{
		setAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAllAgeFrom(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,AGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageFrom</code> attribute. 
	 * @param value the ageFrom
	 */
	public void setAllAgeFrom(final Map<Language,Integer> value)
	{
		setAllAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageTo</code> attribute.
	 * @return the ageTo
	 */
	public Integer getAgeTo(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOccupancyDetail.getAgeTo requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, AGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageTo</code> attribute.
	 * @return the ageTo
	 */
	public Integer getAgeTo()
	{
		return getAgeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @return the ageTo
	 */
	public int getAgeToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAgeTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @return the ageTo
	 */
	public int getAgeToAsPrimitive()
	{
		return getAgeToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @return the localized ageTo
	 */
	public Map<Language,Integer> getAllAgeTo(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,AGETO,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @return the localized ageTo
	 */
	public Map<Language,Integer> getAllAgeTo()
	{
		return getAllAgeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAgeTo(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOccupancyDetail.setAgeTo requires a session language", 0 );
		}
		setLocalizedProperty(ctx, AGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAgeTo(final Integer value)
	{
		setAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAgeTo(final SessionContext ctx, final int value)
	{
		setAgeTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAgeTo(final int value)
	{
		setAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAllAgeTo(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,AGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.ageTo</code> attribute. 
	 * @param value the ageTo
	 */
	public void setAllAgeTo(final Map<Language,Integer> value)
	{
		setAllAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.commissionApplicable</code> attribute.
	 * @return the commissionApplicable
	 */
	public Boolean isCommissionApplicable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMMISSIONAPPLICABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.commissionApplicable</code> attribute.
	 * @return the commissionApplicable
	 */
	public Boolean isCommissionApplicable()
	{
		return isCommissionApplicable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.commissionApplicable</code> attribute. 
	 * @return the commissionApplicable
	 */
	public boolean isCommissionApplicableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCommissionApplicable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.commissionApplicable</code> attribute. 
	 * @return the commissionApplicable
	 */
	public boolean isCommissionApplicableAsPrimitive()
	{
		return isCommissionApplicableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.commissionApplicable</code> attribute. 
	 * @param value the commissionApplicable
	 */
	public void setCommissionApplicable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMMISSIONAPPLICABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.commissionApplicable</code> attribute. 
	 * @param value the commissionApplicable
	 */
	public void setCommissionApplicable(final Boolean value)
	{
		setCommissionApplicable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.commissionApplicable</code> attribute. 
	 * @param value the commissionApplicable
	 */
	public void setCommissionApplicable(final SessionContext ctx, final boolean value)
	{
		setCommissionApplicable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.commissionApplicable</code> attribute. 
	 * @param value the commissionApplicable
	 */
	public void setCommissionApplicable(final boolean value)
	{
		setCommissionApplicable( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CRUISERATEDETAILHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.cruiseratedetail</code> attribute.
	 * @return the cruiseratedetail
	 */
	public CruiseRateDetail getCruiseratedetail(final SessionContext ctx)
	{
		return (CruiseRateDetail)getProperty( ctx, CRUISERATEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.cruiseratedetail</code> attribute.
	 * @return the cruiseratedetail
	 */
	public CruiseRateDetail getCruiseratedetail()
	{
		return getCruiseratedetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.cruiseratedetail</code> attribute. 
	 * @param value the cruiseratedetail
	 */
	public void setCruiseratedetail(final SessionContext ctx, final CruiseRateDetail value)
	{
		CRUISERATEDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.cruiseratedetail</code> attribute. 
	 * @param value the cruiseratedetail
	 */
	public void setCruiseratedetail(final CruiseRateDetail value)
	{
		setCruiseratedetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.extraPassenger</code> attribute.
	 * @return the extraPassenger
	 */
	public Integer getExtraPassenger(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOccupancyDetail.getExtraPassenger requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, EXTRAPASSENGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.extraPassenger</code> attribute.
	 * @return the extraPassenger
	 */
	public Integer getExtraPassenger()
	{
		return getExtraPassenger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @return the extraPassenger
	 */
	public int getExtraPassengerAsPrimitive(final SessionContext ctx)
	{
		Integer value = getExtraPassenger( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @return the extraPassenger
	 */
	public int getExtraPassengerAsPrimitive()
	{
		return getExtraPassengerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @return the localized extraPassenger
	 */
	public Map<Language,Integer> getAllExtraPassenger(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,EXTRAPASSENGER,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @return the localized extraPassenger
	 */
	public Map<Language,Integer> getAllExtraPassenger()
	{
		return getAllExtraPassenger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @param value the extraPassenger
	 */
	public void setExtraPassenger(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOccupancyDetail.setExtraPassenger requires a session language", 0 );
		}
		setLocalizedProperty(ctx, EXTRAPASSENGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @param value the extraPassenger
	 */
	public void setExtraPassenger(final Integer value)
	{
		setExtraPassenger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @param value the extraPassenger
	 */
	public void setExtraPassenger(final SessionContext ctx, final int value)
	{
		setExtraPassenger( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @param value the extraPassenger
	 */
	public void setExtraPassenger(final int value)
	{
		setExtraPassenger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @param value the extraPassenger
	 */
	public void setAllExtraPassenger(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,EXTRAPASSENGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.extraPassenger</code> attribute. 
	 * @param value the extraPassenger
	 */
	public void setAllExtraPassenger(final Map<Language,Integer> value)
	{
		setAllExtraPassenger( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.occupancyType</code> attribute.
	 * @return the occupancyType
	 */
	public EnumerationValue getOccupancyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OCCUPANCYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.occupancyType</code> attribute.
	 * @return the occupancyType
	 */
	public EnumerationValue getOccupancyType()
	{
		return getOccupancyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.occupancyType</code> attribute. 
	 * @param value the occupancyType
	 */
	public void setOccupancyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OCCUPANCYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.occupancyType</code> attribute. 
	 * @param value the occupancyType
	 */
	public void setOccupancyType(final EnumerationValue value)
	{
		setOccupancyType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYONARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival()
	{
		return isPayOnArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayOnArrival( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive()
	{
		return isPayOnArrivalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYONARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final Boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final boolean value)
	{
		setPayOnArrival( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.percentageCalculatedOn</code> attribute.
	 * @return the percentageCalculatedOn
	 */
	public EnumerationValue getPercentageCalculatedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PERCENTAGECALCULATEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.percentageCalculatedOn</code> attribute.
	 * @return the percentageCalculatedOn
	 */
	public EnumerationValue getPercentageCalculatedOn()
	{
		return getPercentageCalculatedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.percentageCalculatedOn</code> attribute. 
	 * @param value the percentageCalculatedOn
	 */
	public void setPercentageCalculatedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PERCENTAGECALCULATEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.percentageCalculatedOn</code> attribute. 
	 * @param value the percentageCalculatedOn
	 */
	public void setPercentageCalculatedOn(final EnumerationValue value)
	{
		setPercentageCalculatedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOccupancyDetail.getPrice requires a session language", 0 );
		}
		return (Double)getLocalizedProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.price</code> attribute.
	 * @return the price
	 */
	public Double getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive(final SessionContext ctx)
	{
		Double value = getPrice( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.price</code> attribute. 
	 * @return the price
	 */
	public double getPriceAsPrimitive()
	{
		return getPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.price</code> attribute. 
	 * @return the localized price
	 */
	public Map<Language,Double> getAllPrice(final SessionContext ctx)
	{
		return (Map<Language,Double>)getAllLocalizedProperties(ctx,PRICE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.price</code> attribute. 
	 * @return the localized price
	 */
	public Map<Language,Double> getAllPrice()
	{
		return getAllPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final Double value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedOccupancyDetail.setPrice requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final Double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final double value)
	{
		setPrice( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final double value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.price</code> attribute. 
	 * @param value the price
	 */
	public void setAllPrice(final SessionContext ctx, final Map<Language,Double> value)
	{
		setAllLocalizedProperties(ctx,PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.price</code> attribute. 
	 * @param value the price
	 */
	public void setAllPrice(final Map<Language,Double> value)
	{
		setAllPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.pricePercentage</code> attribute.
	 * @return the pricePercentage
	 */
	public Double getPricePercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PRICEPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.pricePercentage</code> attribute.
	 * @return the pricePercentage
	 */
	public Double getPricePercentage()
	{
		return getPricePercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.pricePercentage</code> attribute. 
	 * @return the pricePercentage
	 */
	public double getPricePercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getPricePercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OccupancyDetail.pricePercentage</code> attribute. 
	 * @return the pricePercentage
	 */
	public double getPricePercentageAsPrimitive()
	{
		return getPricePercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.pricePercentage</code> attribute. 
	 * @param value the pricePercentage
	 */
	public void setPricePercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PRICEPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.pricePercentage</code> attribute. 
	 * @param value the pricePercentage
	 */
	public void setPricePercentage(final Double value)
	{
		setPricePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.pricePercentage</code> attribute. 
	 * @param value the pricePercentage
	 */
	public void setPricePercentage(final SessionContext ctx, final double value)
	{
		setPricePercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OccupancyDetail.pricePercentage</code> attribute. 
	 * @param value the pricePercentage
	 */
	public void setPricePercentage(final double value)
	{
		setPricePercentage( getSession().getSessionContext(), value );
	}
	
}
