/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.cruisesurchargesuppdetail.jalo;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscruiseConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractSurchargeSuppDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.cruisesurchargesuppdetail.jalo.CruiseSurchargeSuppDetail CruiseSurchargeSuppDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseSurchargeSuppDetail extends AbstractSurchargeSuppDetail
{
	/** Qualifier of the <code>CruiseSurchargeSuppDetail.subType</code> attribute **/
	public static final String SUBTYPE = "subType";
	/** Qualifier of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute **/
	public static final String STDCOMMISSIONVALUE = "stdCommissionValue";
	/** Qualifier of the <code>CruiseSurchargeSuppDetail.stdCommissionType</code> attribute **/
	public static final String STDCOMMISSIONTYPE = "stdCommissionType";
	/** Qualifier of the <code>CruiseSurchargeSuppDetail.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>CruiseSurchargeSuppDetail.cabinType</code> attribute **/
	public static final String CABINTYPE = "cabinType";
	/** Qualifier of the <code>CruiseSurchargeSuppDetail.cabinCategory</code> attribute **/
	public static final String CABINCATEGORY = "cabinCategory";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSurchargeSuppDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUBTYPE, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONVALUE, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONTYPE, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(CABINTYPE, AttributeMode.INITIAL);
		tmp.put(CABINCATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseSurchargeSuppDetail.getAmount requires a session language", 0 );
		}
		return (Double)getLocalizedProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @return the localized amount
	 */
	public Map<Language,Double> getAllAmount(final SessionContext ctx)
	{
		return (Map<Language,Double>)getAllLocalizedProperties(ctx,AMOUNT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @return the localized amount
	 */
	public Map<Language,Double> getAllAmount()
	{
		return getAllAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseSurchargeSuppDetail.setAmount requires a session language", 0 );
		}
		setLocalizedProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAllAmount(final SessionContext ctx, final Map<Language,Double> value)
	{
		setAllLocalizedProperties(ctx,AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAllAmount(final Map<Language,Double> value)
	{
		setAllAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.cabinCategory</code> attribute.
	 * @return the cabinCategory
	 */
	public EnumerationValue getCabinCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.cabinCategory</code> attribute.
	 * @return the cabinCategory
	 */
	public EnumerationValue getCabinCategory()
	{
		return getCabinCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.cabinCategory</code> attribute. 
	 * @param value the cabinCategory
	 */
	public void setCabinCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.cabinCategory</code> attribute. 
	 * @param value the cabinCategory
	 */
	public void setCabinCategory(final EnumerationValue value)
	{
		setCabinCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.cabinType</code> attribute.
	 * @return the cabinType
	 */
	public EnumerationValue getCabinType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.cabinType</code> attribute.
	 * @return the cabinType
	 */
	public EnumerationValue getCabinType()
	{
		return getCabinType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.cabinType</code> attribute. 
	 * @param value the cabinType
	 */
	public void setCabinType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.cabinType</code> attribute. 
	 * @param value the cabinType
	 */
	public void setCabinType(final EnumerationValue value)
	{
		setCabinType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STDCOMMISSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType()
	{
		return getStdCommissionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STDCOMMISSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final EnumerationValue value)
	{
		setStdCommissionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseSurchargeSuppDetail.getStdCommissionValue requires a session language", 0 );
		}
		return (Double)getLocalizedProperty( ctx, STDCOMMISSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue()
	{
		return getStdCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getStdCommissionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive()
	{
		return getStdCommissionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the localized stdCommissionValue
	 */
	public Map<Language,Double> getAllStdCommissionValue(final SessionContext ctx)
	{
		return (Map<Language,Double>)getAllLocalizedProperties(ctx,STDCOMMISSIONVALUE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the localized stdCommissionValue
	 */
	public Map<Language,Double> getAllStdCommissionValue()
	{
		return getAllStdCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final Double value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseSurchargeSuppDetail.setStdCommissionValue requires a session language", 0 );
		}
		setLocalizedProperty(ctx, STDCOMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final Double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final double value)
	{
		setStdCommissionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setAllStdCommissionValue(final SessionContext ctx, final Map<Language,Double> value)
	{
		setAllLocalizedProperties(ctx,STDCOMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setAllStdCommissionValue(final Map<Language,Double> value)
	{
		setAllStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseSurchargeSuppDetail.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType()
	{
		return getSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseSurchargeSuppDetail.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final EnumerationValue value)
	{
		setSubType( getSession().getSessionContext(), value );
	}
	
}
