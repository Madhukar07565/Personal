/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.NameOfPlace;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.Route Route}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoute extends GenericItem
{
	/** Qualifier of the <code>Route.from</code> attribute **/
	public static final String FROM = "from";
	/** Qualifier of the <code>Route.nameOfPlace</code> attribute **/
	public static final String NAMEOFPLACE = "nameOfPlace";
	/** Qualifier of the <code>Route.modeOfTransport</code> attribute **/
	public static final String MODEOFTRANSPORT = "modeOfTransport";
	/** Qualifier of the <code>Route.transportType</code> attribute **/
	public static final String TRANSPORTTYPE = "transportType";
	/** Qualifier of the <code>Route.distanceFromProperty</code> attribute **/
	public static final String DISTANCEFROMPROPERTY = "distanceFromProperty";
	/** Qualifier of the <code>Route.approximateDuration</code> attribute **/
	public static final String APPROXIMATEDURATION = "approximateDuration";
	/** Qualifier of the <code>Route.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Route.drivingDirection</code> attribute **/
	public static final String DRIVINGDIRECTION = "drivingDirection";
	/** Qualifier of the <code>Route.validFromTO</code> attribute **/
	public static final String VALIDFROMTO = "validFromTO";
	/** Qualifier of the <code>Route.distanceUnit</code> attribute **/
	public static final String DISTANCEUNIT = "distanceUnit";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FROM, AttributeMode.INITIAL);
		tmp.put(NAMEOFPLACE, AttributeMode.INITIAL);
		tmp.put(MODEOFTRANSPORT, AttributeMode.INITIAL);
		tmp.put(TRANSPORTTYPE, AttributeMode.INITIAL);
		tmp.put(DISTANCEFROMPROPERTY, AttributeMode.INITIAL);
		tmp.put(APPROXIMATEDURATION, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(DRIVINGDIRECTION, AttributeMode.INITIAL);
		tmp.put(VALIDFROMTO, AttributeMode.INITIAL);
		tmp.put(DISTANCEUNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.approximateDuration</code> attribute.
	 * @return the approximateDuration - Approximate Duration
	 */
	public String getApproximateDuration(final SessionContext ctx)
	{
		return (String)getProperty( ctx, APPROXIMATEDURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.approximateDuration</code> attribute.
	 * @return the approximateDuration - Approximate Duration
	 */
	public String getApproximateDuration()
	{
		return getApproximateDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.approximateDuration</code> attribute. 
	 * @param value the approximateDuration - Approximate Duration
	 */
	public void setApproximateDuration(final SessionContext ctx, final String value)
	{
		setProperty(ctx, APPROXIMATEDURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.approximateDuration</code> attribute. 
	 * @param value the approximateDuration - Approximate Duration
	 */
	public void setApproximateDuration(final String value)
	{
		setApproximateDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRoute.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRoute.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.distanceFromProperty</code> attribute.
	 * @return the distanceFromProperty - Distance From Property
	 */
	public Double getDistanceFromProperty(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DISTANCEFROMPROPERTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.distanceFromProperty</code> attribute.
	 * @return the distanceFromProperty - Distance From Property
	 */
	public Double getDistanceFromProperty()
	{
		return getDistanceFromProperty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.distanceFromProperty</code> attribute. 
	 * @return the distanceFromProperty - Distance From Property
	 */
	public double getDistanceFromPropertyAsPrimitive(final SessionContext ctx)
	{
		Double value = getDistanceFromProperty( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.distanceFromProperty</code> attribute. 
	 * @return the distanceFromProperty - Distance From Property
	 */
	public double getDistanceFromPropertyAsPrimitive()
	{
		return getDistanceFromPropertyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.distanceFromProperty</code> attribute. 
	 * @param value the distanceFromProperty - Distance From Property
	 */
	public void setDistanceFromProperty(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DISTANCEFROMPROPERTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.distanceFromProperty</code> attribute. 
	 * @param value the distanceFromProperty - Distance From Property
	 */
	public void setDistanceFromProperty(final Double value)
	{
		setDistanceFromProperty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.distanceFromProperty</code> attribute. 
	 * @param value the distanceFromProperty - Distance From Property
	 */
	public void setDistanceFromProperty(final SessionContext ctx, final double value)
	{
		setDistanceFromProperty( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.distanceFromProperty</code> attribute. 
	 * @param value the distanceFromProperty - Distance From Property
	 */
	public void setDistanceFromProperty(final double value)
	{
		setDistanceFromProperty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.distanceUnit</code> attribute.
	 * @return the distanceUnit - Distance Unit
	 */
	public EnumerationValue getDistanceUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISTANCEUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.distanceUnit</code> attribute.
	 * @return the distanceUnit - Distance Unit
	 */
	public EnumerationValue getDistanceUnit()
	{
		return getDistanceUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.distanceUnit</code> attribute. 
	 * @param value the distanceUnit - Distance Unit
	 */
	public void setDistanceUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISTANCEUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.distanceUnit</code> attribute. 
	 * @param value the distanceUnit - Distance Unit
	 */
	public void setDistanceUnit(final EnumerationValue value)
	{
		setDistanceUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.drivingDirection</code> attribute.
	 * @return the drivingDirection - Driving Direction
	 */
	public String getDrivingDirection(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DRIVINGDIRECTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.drivingDirection</code> attribute.
	 * @return the drivingDirection - Driving Direction
	 */
	public String getDrivingDirection()
	{
		return getDrivingDirection( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.drivingDirection</code> attribute. 
	 * @param value the drivingDirection - Driving Direction
	 */
	public void setDrivingDirection(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DRIVINGDIRECTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.drivingDirection</code> attribute. 
	 * @param value the drivingDirection - Driving Direction
	 */
	public void setDrivingDirection(final String value)
	{
		setDrivingDirection( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.from</code> attribute.
	 * @return the from - From
	 */
	public Location getFrom(final SessionContext ctx)
	{
		return (Location)getProperty( ctx, FROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.from</code> attribute.
	 * @return the from - From
	 */
	public Location getFrom()
	{
		return getFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.from</code> attribute. 
	 * @param value the from - From
	 */
	public void setFrom(final SessionContext ctx, final Location value)
	{
		setProperty(ctx, FROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.from</code> attribute. 
	 * @param value the from - From
	 */
	public void setFrom(final Location value)
	{
		setFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.modeOfTransport</code> attribute.
	 * @return the modeOfTransport - Mode Of Transport
	 */
	public EnumerationValue getModeOfTransport(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFTRANSPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.modeOfTransport</code> attribute.
	 * @return the modeOfTransport - Mode Of Transport
	 */
	public EnumerationValue getModeOfTransport()
	{
		return getModeOfTransport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.modeOfTransport</code> attribute. 
	 * @param value the modeOfTransport - Mode Of Transport
	 */
	public void setModeOfTransport(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFTRANSPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.modeOfTransport</code> attribute. 
	 * @param value the modeOfTransport - Mode Of Transport
	 */
	public void setModeOfTransport(final EnumerationValue value)
	{
		setModeOfTransport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.nameOfPlace</code> attribute.
	 * @return the nameOfPlace - Name Of Place
	 */
	public NameOfPlace getNameOfPlace(final SessionContext ctx)
	{
		return (NameOfPlace)getProperty( ctx, NAMEOFPLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.nameOfPlace</code> attribute.
	 * @return the nameOfPlace - Name Of Place
	 */
	public NameOfPlace getNameOfPlace()
	{
		return getNameOfPlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.nameOfPlace</code> attribute. 
	 * @param value the nameOfPlace - Name Of Place
	 */
	public void setNameOfPlace(final SessionContext ctx, final NameOfPlace value)
	{
		setProperty(ctx, NAMEOFPLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.nameOfPlace</code> attribute. 
	 * @param value the nameOfPlace - Name Of Place
	 */
	public void setNameOfPlace(final NameOfPlace value)
	{
		setNameOfPlace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.transportType</code> attribute.
	 * @return the transportType - Transport Type
	 */
	public ProductCategorySubType getTransportType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, TRANSPORTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.transportType</code> attribute.
	 * @return the transportType - Transport Type
	 */
	public ProductCategorySubType getTransportType()
	{
		return getTransportType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.transportType</code> attribute. 
	 * @param value the transportType - Transport Type
	 */
	public void setTransportType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, TRANSPORTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.transportType</code> attribute. 
	 * @param value the transportType - Transport Type
	 */
	public void setTransportType(final ProductCategorySubType value)
	{
		setTransportType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.validFromTO</code> attribute.
	 * @return the validFromTO - Valid From
	 */
	public StandardDateRange getValidFromTO(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, VALIDFROMTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Route.validFromTO</code> attribute.
	 * @return the validFromTO - Valid From
	 */
	public StandardDateRange getValidFromTO()
	{
		return getValidFromTO( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.validFromTO</code> attribute. 
	 * @param value the validFromTO - Valid From
	 */
	public void setValidFromTO(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, VALIDFROMTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Route.validFromTO</code> attribute. 
	 * @param value the validFromTO - Valid From
	 */
	public void setValidFromTO(final StandardDateRange value)
	{
		setValidFromTO( getSession().getSessionContext(), value );
	}
	
}
