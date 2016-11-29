/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.dropoffchargesdetail.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.transportationsurchargedetail.jalo.TransportationSurchargeSuppDetail;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
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
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.dropoffchargesdetail.jalo.DropOffChargesDetail DropOffChargesDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDropOffChargesDetail extends GenericItem
{
	/** Qualifier of the <code>DropOffChargesDetail.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>DropOffChargesDetail.dropOffPointType</code> attribute **/
	public static final String DROPOFFPOINTTYPE = "dropOffPointType";
	/** Qualifier of the <code>DropOffChargesDetail.dropOffPointName</code> attribute **/
	public static final String DROPOFFPOINTNAME = "dropOffPointName";
	/** Qualifier of the <code>DropOffChargesDetail.dropOffFees</code> attribute **/
	public static final String DROPOFFFEES = "dropOffFees";
	/** Qualifier of the <code>DropOffChargesDetail.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	/** Qualifier of the <code>DropOffChargesDetail.daysFrom</code> attribute **/
	public static final String DAYSFROM = "daysFrom";
	/** Qualifier of the <code>DropOffChargesDetail.daysTo</code> attribute **/
	public static final String DAYSTO = "daysTo";
	/** Qualifier of the <code>DropOffChargesDetail.stdCommissionType</code> attribute **/
	public static final String STDCOMMISSIONTYPE = "stdCommissionType";
	/** Qualifier of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute **/
	public static final String STDCOMMISSIONVALUE = "stdCommissionValue";
	/** Qualifier of the <code>DropOffChargesDetail.transportsurchrgedetail</code> attribute **/
	public static final String TRANSPORTSURCHRGEDETAIL = "transportsurchrgedetail";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRANSPORTSURCHRGEDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDropOffChargesDetail> TRANSPORTSURCHRGEDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedDropOffChargesDetail>(
	SupplierratedefinitionstransportConstants.TC.DROPOFFCHARGESDETAIL,
	false,
	"transportsurchrgedetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(DROPOFFPOINTTYPE, AttributeMode.INITIAL);
		tmp.put(DROPOFFPOINTNAME, AttributeMode.INITIAL);
		tmp.put(DROPOFFFEES, AttributeMode.INITIAL);
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		tmp.put(DAYSFROM, AttributeMode.INITIAL);
		tmp.put(DAYSTO, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONTYPE, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONVALUE, AttributeMode.INITIAL);
		tmp.put(TRANSPORTSURCHRGEDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.appliedOn</code> attribute.
	 * @return the appliedOn
	 */
	public String getAppliedOn(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDropOffChargesDetail.getAppliedOn requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.appliedOn</code> attribute.
	 * @return the appliedOn
	 */
	public String getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.appliedOn</code> attribute. 
	 * @return the localized appliedOn
	 */
	public Map<Language,String> getAllAppliedOn(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,APPLIEDON,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.appliedOn</code> attribute. 
	 * @return the localized appliedOn
	 */
	public Map<Language,String> getAllAppliedOn()
	{
		return getAllAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.appliedOn</code> attribute. 
	 * @param value the appliedOn
	 */
	public void setAppliedOn(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDropOffChargesDetail.setAppliedOn requires a session language", 0 );
		}
		setLocalizedProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.appliedOn</code> attribute. 
	 * @param value the appliedOn
	 */
	public void setAppliedOn(final String value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.appliedOn</code> attribute. 
	 * @param value the appliedOn
	 */
	public void setAllAppliedOn(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.appliedOn</code> attribute. 
	 * @param value the appliedOn
	 */
	public void setAllAppliedOn(final Map<Language,String> value)
	{
		setAllAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRANSPORTSURCHRGEDETAILHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysFrom</code> attribute.
	 * @return the daysFrom
	 */
	public Integer getDaysFrom(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDropOffChargesDetail.getDaysFrom requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, DAYSFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysFrom</code> attribute.
	 * @return the daysFrom
	 */
	public Integer getDaysFrom()
	{
		return getDaysFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @return the daysFrom
	 */
	public int getDaysFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDaysFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @return the daysFrom
	 */
	public int getDaysFromAsPrimitive()
	{
		return getDaysFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @return the localized daysFrom
	 */
	public Map<Language,Integer> getAllDaysFrom(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,DAYSFROM,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @return the localized daysFrom
	 */
	public Map<Language,Integer> getAllDaysFrom()
	{
		return getAllDaysFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @param value the daysFrom
	 */
	public void setDaysFrom(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDropOffChargesDetail.setDaysFrom requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DAYSFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @param value the daysFrom
	 */
	public void setDaysFrom(final Integer value)
	{
		setDaysFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @param value the daysFrom
	 */
	public void setDaysFrom(final SessionContext ctx, final int value)
	{
		setDaysFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @param value the daysFrom
	 */
	public void setDaysFrom(final int value)
	{
		setDaysFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @param value the daysFrom
	 */
	public void setAllDaysFrom(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,DAYSFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysFrom</code> attribute. 
	 * @param value the daysFrom
	 */
	public void setAllDaysFrom(final Map<Language,Integer> value)
	{
		setAllDaysFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysTo</code> attribute.
	 * @return the daysTo
	 */
	public Integer getDaysTo(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDropOffChargesDetail.getDaysTo requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, DAYSTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysTo</code> attribute.
	 * @return the daysTo
	 */
	public Integer getDaysTo()
	{
		return getDaysTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @return the daysTo
	 */
	public int getDaysToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDaysTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @return the daysTo
	 */
	public int getDaysToAsPrimitive()
	{
		return getDaysToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @return the localized daysTo
	 */
	public Map<Language,Integer> getAllDaysTo(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,DAYSTO,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @return the localized daysTo
	 */
	public Map<Language,Integer> getAllDaysTo()
	{
		return getAllDaysTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @param value the daysTo
	 */
	public void setDaysTo(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDropOffChargesDetail.setDaysTo requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DAYSTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @param value the daysTo
	 */
	public void setDaysTo(final Integer value)
	{
		setDaysTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @param value the daysTo
	 */
	public void setDaysTo(final SessionContext ctx, final int value)
	{
		setDaysTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @param value the daysTo
	 */
	public void setDaysTo(final int value)
	{
		setDaysTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @param value the daysTo
	 */
	public void setAllDaysTo(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,DAYSTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.daysTo</code> attribute. 
	 * @param value the daysTo
	 */
	public void setAllDaysTo(final Map<Language,Integer> value)
	{
		setAllDaysTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffFees</code> attribute.
	 * @return the dropOffFees
	 */
	public Double getDropOffFees(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DROPOFFFEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffFees</code> attribute.
	 * @return the dropOffFees
	 */
	public Double getDropOffFees()
	{
		return getDropOffFees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffFees</code> attribute. 
	 * @return the dropOffFees
	 */
	public double getDropOffFeesAsPrimitive(final SessionContext ctx)
	{
		Double value = getDropOffFees( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffFees</code> attribute. 
	 * @return the dropOffFees
	 */
	public double getDropOffFeesAsPrimitive()
	{
		return getDropOffFeesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffFees</code> attribute. 
	 * @param value the dropOffFees
	 */
	public void setDropOffFees(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DROPOFFFEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffFees</code> attribute. 
	 * @param value the dropOffFees
	 */
	public void setDropOffFees(final Double value)
	{
		setDropOffFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffFees</code> attribute. 
	 * @param value the dropOffFees
	 */
	public void setDropOffFees(final SessionContext ctx, final double value)
	{
		setDropOffFees( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffFees</code> attribute. 
	 * @param value the dropOffFees
	 */
	public void setDropOffFees(final double value)
	{
		setDropOffFees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffPointName</code> attribute.
	 * @return the dropOffPointName
	 */
	public String getDropOffPointName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDropOffChargesDetail.getDropOffPointName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DROPOFFPOINTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffPointName</code> attribute.
	 * @return the dropOffPointName
	 */
	public String getDropOffPointName()
	{
		return getDropOffPointName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffPointName</code> attribute. 
	 * @return the localized dropOffPointName
	 */
	public Map<Language,String> getAllDropOffPointName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DROPOFFPOINTNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffPointName</code> attribute. 
	 * @return the localized dropOffPointName
	 */
	public Map<Language,String> getAllDropOffPointName()
	{
		return getAllDropOffPointName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffPointName</code> attribute. 
	 * @param value the dropOffPointName
	 */
	public void setDropOffPointName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedDropOffChargesDetail.setDropOffPointName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DROPOFFPOINTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffPointName</code> attribute. 
	 * @param value the dropOffPointName
	 */
	public void setDropOffPointName(final String value)
	{
		setDropOffPointName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffPointName</code> attribute. 
	 * @param value the dropOffPointName
	 */
	public void setAllDropOffPointName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DROPOFFPOINTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffPointName</code> attribute. 
	 * @param value the dropOffPointName
	 */
	public void setAllDropOffPointName(final Map<Language,String> value)
	{
		setAllDropOffPointName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffPointType</code> attribute.
	 * @return the dropOffPointType
	 */
	public EnumerationValue getDropOffPointType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DROPOFFPOINTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.dropOffPointType</code> attribute.
	 * @return the dropOffPointType
	 */
	public EnumerationValue getDropOffPointType()
	{
		return getDropOffPointType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffPointType</code> attribute. 
	 * @param value the dropOffPointType
	 */
	public void setDropOffPointType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DROPOFFPOINTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.dropOffPointType</code> attribute. 
	 * @param value the dropOffPointType
	 */
	public void setDropOffPointType(final EnumerationValue value)
	{
		setDropOffPointType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STDCOMMISSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType()
	{
		return getStdCommissionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STDCOMMISSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final EnumerationValue value)
	{
		setStdCommissionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, STDCOMMISSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue()
	{
		return getStdCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getStdCommissionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive()
	{
		return getStdCommissionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, STDCOMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final Double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final double value)
	{
		setStdCommissionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.transportsurchrgedetail</code> attribute.
	 * @return the transportsurchrgedetail
	 */
	public TransportationSurchargeSuppDetail getTransportsurchrgedetail(final SessionContext ctx)
	{
		return (TransportationSurchargeSuppDetail)getProperty( ctx, TRANSPORTSURCHRGEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DropOffChargesDetail.transportsurchrgedetail</code> attribute.
	 * @return the transportsurchrgedetail
	 */
	public TransportationSurchargeSuppDetail getTransportsurchrgedetail()
	{
		return getTransportsurchrgedetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.transportsurchrgedetail</code> attribute. 
	 * @param value the transportsurchrgedetail
	 */
	public void setTransportsurchrgedetail(final SessionContext ctx, final TransportationSurchargeSuppDetail value)
	{
		TRANSPORTSURCHRGEDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DropOffChargesDetail.transportsurchrgedetail</code> attribute. 
	 * @param value the transportsurchrgedetail
	 */
	public void setTransportsurchrgedetail(final TransportationSurchargeSuppDetail value)
	{
		setTransportsurchrgedetail( getSession().getSessionContext(), value );
	}
	
}
