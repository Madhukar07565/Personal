/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.ancillary;

import com.cnk.travelogix.product.transport.masters.core.jalo.CruisePort;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsaccommodationConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AbstractAncillaryRateDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.ancillary.CommonAncillaryRateDetail CommonAncillaryRateDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommonAncillaryRateDetail extends AbstractAncillaryRateDetail
{
	/** Qualifier of the <code>CommonAncillaryRateDetail.startTime</code> attribute **/
	public static final String STARTTIME = "startTime";
	/** Qualifier of the <code>CommonAncillaryRateDetail.durationType</code> attribute **/
	public static final String DURATIONTYPE = "durationType";
	/** Qualifier of the <code>CommonAncillaryRateDetail.durationValue</code> attribute **/
	public static final String DURATIONVALUE = "durationValue";
	/** Qualifier of the <code>CommonAncillaryRateDetail.seatingType</code> attribute **/
	public static final String SEATINGTYPE = "seatingType";
	/** Qualifier of the <code>CommonAncillaryRateDetail.costApplicability</code> attribute **/
	public static final String COSTAPPLICABILITY = "costApplicability";
	/** Qualifier of the <code>CommonAncillaryRateDetail.paxType</code> attribute **/
	public static final String PAXTYPE = "paxType";
	/** Qualifier of the <code>CommonAncillaryRateDetail.childAge</code> attribute **/
	public static final String CHILDAGE = "childAge";
	/** Qualifier of the <code>CommonAncillaryRateDetail.vehicleType</code> attribute **/
	public static final String VEHICLETYPE = "vehicleType";
	/** Qualifier of the <code>CommonAncillaryRateDetail.portName</code> attribute **/
	public static final String PORTNAME = "portName";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAncillaryRateDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STARTTIME, AttributeMode.INITIAL);
		tmp.put(DURATIONTYPE, AttributeMode.INITIAL);
		tmp.put(DURATIONVALUE, AttributeMode.INITIAL);
		tmp.put(SEATINGTYPE, AttributeMode.INITIAL);
		tmp.put(COSTAPPLICABILITY, AttributeMode.INITIAL);
		tmp.put(PAXTYPE, AttributeMode.INITIAL);
		tmp.put(CHILDAGE, AttributeMode.INITIAL);
		tmp.put(VEHICLETYPE, AttributeMode.INITIAL);
		tmp.put(PORTNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.childAge</code> attribute.
	 * @return the childAge
	 */
	public AgeDetail getChildAge(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, CHILDAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.childAge</code> attribute.
	 * @return the childAge
	 */
	public AgeDetail getChildAge()
	{
		return getChildAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.childAge</code> attribute. 
	 * @param value the childAge
	 */
	public void setChildAge(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, CHILDAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.childAge</code> attribute. 
	 * @param value the childAge
	 */
	public void setChildAge(final AgeDetail value)
	{
		setChildAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.costApplicability</code> attribute.
	 * @return the costApplicability
	 */
	public EnumerationValue getCostApplicability(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COSTAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.costApplicability</code> attribute.
	 * @return the costApplicability
	 */
	public EnumerationValue getCostApplicability()
	{
		return getCostApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.costApplicability</code> attribute. 
	 * @param value the costApplicability
	 */
	public void setCostApplicability(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COSTAPPLICABILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.costApplicability</code> attribute. 
	 * @param value the costApplicability
	 */
	public void setCostApplicability(final EnumerationValue value)
	{
		setCostApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.durationType</code> attribute.
	 * @return the durationType
	 */
	public EnumerationValue getDurationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DURATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.durationType</code> attribute.
	 * @return the durationType
	 */
	public EnumerationValue getDurationType()
	{
		return getDurationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.durationType</code> attribute. 
	 * @param value the durationType
	 */
	public void setDurationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DURATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.durationType</code> attribute. 
	 * @param value the durationType
	 */
	public void setDurationType(final EnumerationValue value)
	{
		setDurationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.durationValue</code> attribute.
	 * @return the durationValue
	 */
	public Double getDurationValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DURATIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.durationValue</code> attribute.
	 * @return the durationValue
	 */
	public Double getDurationValue()
	{
		return getDurationValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.durationValue</code> attribute. 
	 * @return the durationValue
	 */
	public double getDurationValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getDurationValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.durationValue</code> attribute. 
	 * @return the durationValue
	 */
	public double getDurationValueAsPrimitive()
	{
		return getDurationValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.durationValue</code> attribute. 
	 * @param value the durationValue
	 */
	public void setDurationValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DURATIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.durationValue</code> attribute. 
	 * @param value the durationValue
	 */
	public void setDurationValue(final Double value)
	{
		setDurationValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.durationValue</code> attribute. 
	 * @param value the durationValue
	 */
	public void setDurationValue(final SessionContext ctx, final double value)
	{
		setDurationValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.durationValue</code> attribute. 
	 * @param value the durationValue
	 */
	public void setDurationValue(final double value)
	{
		setDurationValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.paxType</code> attribute.
	 * @return the paxType
	 */
	public EnumerationValue getPaxType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PAXTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.paxType</code> attribute.
	 * @return the paxType
	 */
	public EnumerationValue getPaxType()
	{
		return getPaxType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.paxType</code> attribute. 
	 * @param value the paxType
	 */
	public void setPaxType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PAXTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.paxType</code> attribute. 
	 * @param value the paxType
	 */
	public void setPaxType(final EnumerationValue value)
	{
		setPaxType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.portName</code> attribute.
	 * @return the portName
	 */
	public CruisePort getPortName(final SessionContext ctx)
	{
		return (CruisePort)getProperty( ctx, PORTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.portName</code> attribute.
	 * @return the portName
	 */
	public CruisePort getPortName()
	{
		return getPortName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.portName</code> attribute. 
	 * @param value the portName
	 */
	public void setPortName(final SessionContext ctx, final CruisePort value)
	{
		setProperty(ctx, PORTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.portName</code> attribute. 
	 * @param value the portName
	 */
	public void setPortName(final CruisePort value)
	{
		setPortName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.seatingType</code> attribute.
	 * @return the seatingType
	 */
	public String getSeatingType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SEATINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.seatingType</code> attribute.
	 * @return the seatingType
	 */
	public String getSeatingType()
	{
		return getSeatingType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.seatingType</code> attribute. 
	 * @param value the seatingType
	 */
	public void setSeatingType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SEATINGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.seatingType</code> attribute. 
	 * @param value the seatingType
	 */
	public void setSeatingType(final String value)
	{
		setSeatingType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.startTime</code> attribute.
	 * @return the startTime
	 */
	public String getStartTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STARTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.startTime</code> attribute.
	 * @return the startTime
	 */
	public String getStartTime()
	{
		return getStartTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.startTime</code> attribute. 
	 * @param value the startTime
	 */
	public void setStartTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STARTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.startTime</code> attribute. 
	 * @param value the startTime
	 */
	public void setStartTime(final String value)
	{
		setStartTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VEHICLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommonAncillaryRateDetail.vehicleType</code> attribute.
	 * @return the vehicleType
	 */
	public EnumerationValue getVehicleType()
	{
		return getVehicleType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VEHICLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommonAncillaryRateDetail.vehicleType</code> attribute. 
	 * @param value the vehicleType
	 */
	public void setVehicleType(final EnumerationValue value)
	{
		setVehicleType( getSession().getSessionContext(), value );
	}
	
}
