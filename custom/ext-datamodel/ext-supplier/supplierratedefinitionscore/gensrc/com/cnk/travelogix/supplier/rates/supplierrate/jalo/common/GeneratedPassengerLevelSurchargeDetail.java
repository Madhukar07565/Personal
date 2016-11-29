/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractSurchargeSuppDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.PassengerLevelSurchargeDetail PassengerLevelSurchargeDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPassengerLevelSurchargeDetail extends GenericItem
{
	/** Qualifier of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute **/
	public static final String STDCOMMISSIONVALUE = "stdCommissionValue";
	/** Qualifier of the <code>PassengerLevelSurchargeDetail.stdCommissionType</code> attribute **/
	public static final String STDCOMMISSIONTYPE = "stdCommissionType";
	/** Qualifier of the <code>PassengerLevelSurchargeDetail.amount</code> attribute **/
	public static final String AMOUNT = "amount";
	/** Qualifier of the <code>PassengerLevelSurchargeDetail.ageDetail</code> attribute **/
	public static final String AGEDETAIL = "ageDetail";
	/** Qualifier of the <code>PassengerLevelSurchargeDetail.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>PassengerLevelSurchargeDetail.surchargeSuppDetail</code> attribute **/
	public static final String SURCHARGESUPPDETAIL = "surchargeSuppDetail";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SURCHARGESUPPDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPassengerLevelSurchargeDetail> SURCHARGESUPPDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedPassengerLevelSurchargeDetail>(
	SupplierratedefinitionscoreConstants.TC.PASSENGERLEVELSURCHARGEDETAIL,
	false,
	"surchargeSuppDetail",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(STDCOMMISSIONVALUE, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONTYPE, AttributeMode.INITIAL);
		tmp.put(AMOUNT, AttributeMode.INITIAL);
		tmp.put(AGEDETAIL, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(SURCHARGESUPPDETAIL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.ageDetail</code> attribute.
	 * @return the ageDetail
	 */
	public AgeDetail getAgeDetail(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, AGEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.ageDetail</code> attribute.
	 * @return the ageDetail
	 */
	public AgeDetail getAgeDetail()
	{
		return getAgeDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.ageDetail</code> attribute. 
	 * @param value the ageDetail
	 */
	public void setAgeDetail(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, AGEDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.ageDetail</code> attribute. 
	 * @param value the ageDetail
	 */
	public void setAgeDetail(final AgeDetail value)
	{
		setAgeDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.amount</code> attribute.
	 * @return the amount
	 */
	public Double getAmount()
	{
		return getAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.amount</code> attribute. 
	 * @return the amount
	 */
	public double getAmountAsPrimitive()
	{
		return getAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final Double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final SessionContext ctx, final double value)
	{
		setAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.amount</code> attribute. 
	 * @param value the amount
	 */
	public void setAmount(final double value)
	{
		setAmount( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SURCHARGESUPPDETAILHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STDCOMMISSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType()
	{
		return getStdCommissionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STDCOMMISSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final EnumerationValue value)
	{
		setStdCommissionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, STDCOMMISSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue()
	{
		return getStdCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getStdCommissionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive()
	{
		return getStdCommissionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, STDCOMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final Double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final double value)
	{
		setStdCommissionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.surchargeSuppDetail</code> attribute.
	 * @return the surchargeSuppDetail
	 */
	public AbstractSurchargeSuppDetail getSurchargeSuppDetail(final SessionContext ctx)
	{
		return (AbstractSurchargeSuppDetail)getProperty( ctx, SURCHARGESUPPDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassengerLevelSurchargeDetail.surchargeSuppDetail</code> attribute.
	 * @return the surchargeSuppDetail
	 */
	public AbstractSurchargeSuppDetail getSurchargeSuppDetail()
	{
		return getSurchargeSuppDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.surchargeSuppDetail</code> attribute. 
	 * @param value the surchargeSuppDetail
	 */
	public void setSurchargeSuppDetail(final SessionContext ctx, final AbstractSurchargeSuppDetail value)
	{
		SURCHARGESUPPDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassengerLevelSurchargeDetail.surchargeSuppDetail</code> attribute. 
	 * @param value the surchargeSuppDetail
	 */
	public void setSurchargeSuppDetail(final AbstractSurchargeSuppDetail value)
	{
		setSurchargeSuppDetail( getSession().getSessionContext(), value );
	}
	
}
