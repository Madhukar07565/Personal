/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.GuideSurchargeDetail;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.MealSupplementDetail;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.OtherSurcharge;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractSurchargeSuppDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivitySurchargeSuppDetail ActivitySurchargeSuppDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivitySurchargeSuppDetail extends AbstractSurchargeSuppDetail
{
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute **/
	public static final String STDCOMMISSIONVALUE = "stdCommissionValue";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.stdCommissionType</code> attribute **/
	public static final String STDCOMMISSIONTYPE = "stdCommissionType";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.costPerType</code> attribute **/
	public static final String COSTPERTYPE = "costPerType";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.ageDetail</code> attribute **/
	public static final String AGEDETAIL = "ageDetail";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.subType</code> attribute **/
	public static final String SUBTYPE = "subType";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.otherSurcharge</code> attribute **/
	public static final String OTHERSURCHARGE = "otherSurcharge";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.mealSupplementDetail</code> attribute **/
	public static final String MEALSUPPLEMENTDETAIL = "mealSupplementDetail";
	/** Qualifier of the <code>ActivitySurchargeSuppDetail.guideSurchargeDetail</code> attribute **/
	public static final String GUIDESURCHARGEDETAIL = "guideSurchargeDetail";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSurchargeSuppDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STDCOMMISSIONVALUE, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONTYPE, AttributeMode.INITIAL);
		tmp.put(COSTPERTYPE, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(AGEDETAIL, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(SUBTYPE, AttributeMode.INITIAL);
		tmp.put(OTHERSURCHARGE, AttributeMode.INITIAL);
		tmp.put(MEALSUPPLEMENTDETAIL, AttributeMode.INITIAL);
		tmp.put(GUIDESURCHARGEDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.ageDetail</code> attribute.
	 * @return the ageDetail
	 */
	public AgeDetail getAgeDetail(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, AGEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.ageDetail</code> attribute.
	 * @return the ageDetail
	 */
	public AgeDetail getAgeDetail()
	{
		return getAgeDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.ageDetail</code> attribute. 
	 * @param value the ageDetail
	 */
	public void setAgeDetail(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, AGEDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.ageDetail</code> attribute. 
	 * @param value the ageDetail
	 */
	public void setAgeDetail(final AgeDetail value)
	{
		setAgeDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.costPerType</code> attribute.
	 * @return the costPerType
	 */
	public EnumerationValue getCostPerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COSTPERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.costPerType</code> attribute.
	 * @return the costPerType
	 */
	public EnumerationValue getCostPerType()
	{
		return getCostPerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.costPerType</code> attribute. 
	 * @param value the costPerType
	 */
	public void setCostPerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COSTPERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.costPerType</code> attribute. 
	 * @param value the costPerType
	 */
	public void setCostPerType(final EnumerationValue value)
	{
		setCostPerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.guideSurchargeDetail</code> attribute.
	 * @return the guideSurchargeDetail
	 */
	public GuideSurchargeDetail getGuideSurchargeDetail(final SessionContext ctx)
	{
		return (GuideSurchargeDetail)getProperty( ctx, GUIDESURCHARGEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.guideSurchargeDetail</code> attribute.
	 * @return the guideSurchargeDetail
	 */
	public GuideSurchargeDetail getGuideSurchargeDetail()
	{
		return getGuideSurchargeDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.guideSurchargeDetail</code> attribute. 
	 * @param value the guideSurchargeDetail
	 */
	public void setGuideSurchargeDetail(final SessionContext ctx, final GuideSurchargeDetail value)
	{
		new PartOfHandler<GuideSurchargeDetail>()
		{
			@Override
			protected GuideSurchargeDetail doGetValue(final SessionContext ctx)
			{
				return getGuideSurchargeDetail( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final GuideSurchargeDetail _value)
			{
				final GuideSurchargeDetail value = _value;
				setProperty(ctx, GUIDESURCHARGEDETAIL,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.guideSurchargeDetail</code> attribute. 
	 * @param value the guideSurchargeDetail
	 */
	public void setGuideSurchargeDetail(final GuideSurchargeDetail value)
	{
		setGuideSurchargeDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.mealSupplementDetail</code> attribute.
	 * @return the mealSupplementDetail
	 */
	public MealSupplementDetail getMealSupplementDetail(final SessionContext ctx)
	{
		return (MealSupplementDetail)getProperty( ctx, MEALSUPPLEMENTDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.mealSupplementDetail</code> attribute.
	 * @return the mealSupplementDetail
	 */
	public MealSupplementDetail getMealSupplementDetail()
	{
		return getMealSupplementDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.mealSupplementDetail</code> attribute. 
	 * @param value the mealSupplementDetail
	 */
	public void setMealSupplementDetail(final SessionContext ctx, final MealSupplementDetail value)
	{
		new PartOfHandler<MealSupplementDetail>()
		{
			@Override
			protected MealSupplementDetail doGetValue(final SessionContext ctx)
			{
				return getMealSupplementDetail( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final MealSupplementDetail _value)
			{
				final MealSupplementDetail value = _value;
				setProperty(ctx, MEALSUPPLEMENTDETAIL,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.mealSupplementDetail</code> attribute. 
	 * @param value the mealSupplementDetail
	 */
	public void setMealSupplementDetail(final MealSupplementDetail value)
	{
		setMealSupplementDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.otherSurcharge</code> attribute.
	 * @return the otherSurcharge
	 */
	public OtherSurcharge getOtherSurcharge(final SessionContext ctx)
	{
		return (OtherSurcharge)getProperty( ctx, OTHERSURCHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.otherSurcharge</code> attribute.
	 * @return the otherSurcharge
	 */
	public OtherSurcharge getOtherSurcharge()
	{
		return getOtherSurcharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.otherSurcharge</code> attribute. 
	 * @param value the otherSurcharge
	 */
	public void setOtherSurcharge(final SessionContext ctx, final OtherSurcharge value)
	{
		new PartOfHandler<OtherSurcharge>()
		{
			@Override
			protected OtherSurcharge doGetValue(final SessionContext ctx)
			{
				return getOtherSurcharge( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final OtherSurcharge _value)
			{
				final OtherSurcharge value = _value;
				setProperty(ctx, OTHERSURCHARGE,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.otherSurcharge</code> attribute. 
	 * @param value the otherSurcharge
	 */
	public void setOtherSurcharge(final OtherSurcharge value)
	{
		setOtherSurcharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STDCOMMISSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType()
	{
		return getStdCommissionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STDCOMMISSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final EnumerationValue value)
	{
		setStdCommissionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, STDCOMMISSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue()
	{
		return getStdCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getStdCommissionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive()
	{
		return getStdCommissionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, STDCOMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final Double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final double value)
	{
		setStdCommissionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySurchargeSuppDetail.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType()
	{
		return getSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySurchargeSuppDetail.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final EnumerationValue value)
	{
		setSubType( getSession().getSessionContext(), value );
	}
	
}
