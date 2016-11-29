/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.KPIInfo;
import com.cnk.travelogix.client.masters.core.jalo.Measure;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.KPIDefinition KPIDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedKPIDefinition extends GenericItem
{
	/** Qualifier of the <code>KPIDefinition.kpi</code> attribute **/
	public static final String KPI = "kpi";
	/** Qualifier of the <code>KPIDefinition.function</code> attribute **/
	public static final String FUNCTION = "function";
	/** Qualifier of the <code>KPIDefinition.measure</code> attribute **/
	public static final String MEASURE = "measure";
	/** Qualifier of the <code>KPIDefinition.targetKPI</code> attribute **/
	public static final String TARGETKPI = "targetKPI";
	/** Qualifier of the <code>KPIDefinition.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>KPIDefinition.equation</code> attribute **/
	public static final String EQUATION = "equation";
	/** Qualifier of the <code>KPIDefinition.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>KPIDefinition.time</code> attribute **/
	public static final String TIME = "time";
	/** Qualifier of the <code>KPIDefinition.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>KPIDefinition.kpiInfo</code> attribute **/
	public static final String KPIINFO = "kpiInfo";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n KPIINFO's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedKPIDefinition> KPIINFOHANDLER = new BidirectionalOneToManyHandler<GeneratedKPIDefinition>(
	ClientconfigConstants.TC.KPIDEFINITION,
	false,
	"kpiInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(KPI, AttributeMode.INITIAL);
		tmp.put(FUNCTION, AttributeMode.INITIAL);
		tmp.put(MEASURE, AttributeMode.INITIAL);
		tmp.put(TARGETKPI, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(EQUATION, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(TIME, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(KPIINFO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		KPIINFOHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.currency</code> attribute.
	 * @return the currency - Currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.currency</code> attribute. 
	 * @param value the currency - Currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.equation</code> attribute.
	 * @return the equation - Equation
	 */
	public EnumerationValue getEquation(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, EQUATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.equation</code> attribute.
	 * @return the equation - Equation
	 */
	public EnumerationValue getEquation()
	{
		return getEquation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.equation</code> attribute. 
	 * @param value the equation - Equation
	 */
	public void setEquation(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, EQUATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.equation</code> attribute. 
	 * @param value the equation - Equation
	 */
	public void setEquation(final EnumerationValue value)
	{
		setEquation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.function</code> attribute.
	 * @return the function - Function
	 */
	public UserGroup getFunction(final SessionContext ctx)
	{
		return (UserGroup)getProperty( ctx, FUNCTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.function</code> attribute.
	 * @return the function - Function
	 */
	public UserGroup getFunction()
	{
		return getFunction( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.function</code> attribute. 
	 * @param value the function - Function
	 */
	public void setFunction(final SessionContext ctx, final UserGroup value)
	{
		setProperty(ctx, FUNCTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.function</code> attribute. 
	 * @param value the function - Function
	 */
	public void setFunction(final UserGroup value)
	{
		setFunction( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.kpi</code> attribute.
	 * @return the kpi - Key Performance Indicator
	 */
	public EnumerationValue getKpi(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, KPI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.kpi</code> attribute.
	 * @return the kpi - Key Performance Indicator
	 */
	public EnumerationValue getKpi()
	{
		return getKpi( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.kpi</code> attribute. 
	 * @param value the kpi - Key Performance Indicator
	 */
	public void setKpi(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, KPI,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.kpi</code> attribute. 
	 * @param value the kpi - Key Performance Indicator
	 */
	public void setKpi(final EnumerationValue value)
	{
		setKpi( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.kpiInfo</code> attribute.
	 * @return the kpiInfo
	 */
	public KPIInfo getKpiInfo(final SessionContext ctx)
	{
		return (KPIInfo)getProperty( ctx, KPIINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.kpiInfo</code> attribute.
	 * @return the kpiInfo
	 */
	public KPIInfo getKpiInfo()
	{
		return getKpiInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.kpiInfo</code> attribute. 
	 * @param value the kpiInfo
	 */
	public void setKpiInfo(final SessionContext ctx, final KPIInfo value)
	{
		KPIINFOHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.kpiInfo</code> attribute. 
	 * @param value the kpiInfo
	 */
	public void setKpiInfo(final KPIInfo value)
	{
		setKpiInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.measure</code> attribute.
	 * @return the measure - Measure
	 */
	public Measure getMeasure(final SessionContext ctx)
	{
		return (Measure)getProperty( ctx, MEASURE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.measure</code> attribute.
	 * @return the measure - Measure
	 */
	public Measure getMeasure()
	{
		return getMeasure( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.measure</code> attribute. 
	 * @param value the measure - Measure
	 */
	public void setMeasure(final SessionContext ctx, final Measure value)
	{
		setProperty(ctx, MEASURE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.measure</code> attribute. 
	 * @param value the measure - Measure
	 */
	public void setMeasure(final Measure value)
	{
		setMeasure( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.remark</code> attribute.
	 * @return the remark - Value
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.remark</code> attribute.
	 * @return the remark - Value
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.remark</code> attribute. 
	 * @param value the remark - Value
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.remark</code> attribute. 
	 * @param value the remark - Value
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.targetKPI</code> attribute.
	 * @return the targetKPI - Target KPI
	 */
	public Double getTargetKPI(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TARGETKPI);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.targetKPI</code> attribute.
	 * @return the targetKPI - Target KPI
	 */
	public Double getTargetKPI()
	{
		return getTargetKPI( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.targetKPI</code> attribute. 
	 * @return the targetKPI - Target KPI
	 */
	public double getTargetKPIAsPrimitive(final SessionContext ctx)
	{
		Double value = getTargetKPI( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.targetKPI</code> attribute. 
	 * @return the targetKPI - Target KPI
	 */
	public double getTargetKPIAsPrimitive()
	{
		return getTargetKPIAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.targetKPI</code> attribute. 
	 * @param value the targetKPI - Target KPI
	 */
	public void setTargetKPI(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TARGETKPI,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.targetKPI</code> attribute. 
	 * @param value the targetKPI - Target KPI
	 */
	public void setTargetKPI(final Double value)
	{
		setTargetKPI( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.targetKPI</code> attribute. 
	 * @param value the targetKPI - Target KPI
	 */
	public void setTargetKPI(final SessionContext ctx, final double value)
	{
		setTargetKPI( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.targetKPI</code> attribute. 
	 * @param value the targetKPI - Target KPI
	 */
	public void setTargetKPI(final double value)
	{
		setTargetKPI( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.time</code> attribute.
	 * @return the time - Currency
	 */
	public String getTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.time</code> attribute.
	 * @return the time - Currency
	 */
	public String getTime()
	{
		return getTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.time</code> attribute. 
	 * @param value the time - Currency
	 */
	public void setTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.time</code> attribute. 
	 * @param value the time - Currency
	 */
	public void setTime(final String value)
	{
		setTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.value</code> attribute.
	 * @return the value - Value
	 */
	public Integer getValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.value</code> attribute.
	 * @return the value - Value
	 */
	public Integer getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.value</code> attribute. 
	 * @return the value - Value
	 */
	public int getValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KPIDefinition.value</code> attribute. 
	 * @return the value - Value
	 */
	public int getValueAsPrimitive()
	{
		return getValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final Integer value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final SessionContext ctx, final int value)
	{
		setValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KPIDefinition.value</code> attribute. 
	 * @param value the value - Value
	 */
	public void setValue(final int value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
