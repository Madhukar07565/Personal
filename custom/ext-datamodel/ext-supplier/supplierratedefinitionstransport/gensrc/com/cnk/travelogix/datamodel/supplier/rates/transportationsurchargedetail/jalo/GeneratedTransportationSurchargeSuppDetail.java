/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.transportationsurchargedetail.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.driverallowancecharge.jalo.DriverAllowanceCharge;
import com.cnk.travelogix.datamodel.supplier.rates.dropoffchargesdetail.jalo.DropOffChargesDetail;
import com.cnk.travelogix.datamodel.supplier.rates.vehiclecharge.jalo.VehicleCharge;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractSurchargeSuppDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.transportationsurchargedetail.jalo.TransportationSurchargeSuppDetail TransportationSurchargeSuppDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationSurchargeSuppDetail extends AbstractSurchargeSuppDetail
{
	/** Qualifier of the <code>TransportationSurchargeSuppDetail.subType</code> attribute **/
	public static final String SUBTYPE = "subType";
	/** Qualifier of the <code>TransportationSurchargeSuppDetail.charge</code> attribute **/
	public static final String CHARGE = "charge";
	/** Qualifier of the <code>TransportationSurchargeSuppDetail.stdCommissionType</code> attribute **/
	public static final String STDCOMMISSIONTYPE = "stdCommissionType";
	/** Qualifier of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute **/
	public static final String STDCOMMISSIONVALUE = "stdCommissionValue";
	/** Qualifier of the <code>TransportationSurchargeSuppDetail.driverAllowanceCharge</code> attribute **/
	public static final String DRIVERALLOWANCECHARGE = "driverAllowanceCharge";
	/** Qualifier of the <code>TransportationSurchargeSuppDetail.vehicleCharge</code> attribute **/
	public static final String VEHICLECHARGE = "vehicleCharge";
	/** Qualifier of the <code>TransportationSurchargeSuppDetail.dropOffChargesDetails</code> attribute **/
	public static final String DROPOFFCHARGESDETAILS = "dropOffChargesDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n DROPOFFCHARGESDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DropOffChargesDetail> DROPOFFCHARGESDETAILSHANDLER = new OneToManyHandler<DropOffChargesDetail>(
	SupplierratedefinitionstransportConstants.TC.DROPOFFCHARGESDETAIL,
	true,
	"transportsurchrgedetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSurchargeSuppDetail.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUBTYPE, AttributeMode.INITIAL);
		tmp.put(CHARGE, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONTYPE, AttributeMode.INITIAL);
		tmp.put(STDCOMMISSIONVALUE, AttributeMode.INITIAL);
		tmp.put(DRIVERALLOWANCECHARGE, AttributeMode.INITIAL);
		tmp.put(VEHICLECHARGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.charge</code> attribute.
	 * @return the charge
	 */
	public Double getCharge(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.charge</code> attribute.
	 * @return the charge
	 */
	public Double getCharge()
	{
		return getCharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.charge</code> attribute. 
	 * @return the charge
	 */
	public double getChargeAsPrimitive(final SessionContext ctx)
	{
		Double value = getCharge( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.charge</code> attribute. 
	 * @return the charge
	 */
	public double getChargeAsPrimitive()
	{
		return getChargeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.charge</code> attribute. 
	 * @param value the charge
	 */
	public void setCharge(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.charge</code> attribute. 
	 * @param value the charge
	 */
	public void setCharge(final Double value)
	{
		setCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.charge</code> attribute. 
	 * @param value the charge
	 */
	public void setCharge(final SessionContext ctx, final double value)
	{
		setCharge( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.charge</code> attribute. 
	 * @param value the charge
	 */
	public void setCharge(final double value)
	{
		setCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.driverAllowanceCharge</code> attribute.
	 * @return the driverAllowanceCharge
	 */
	public DriverAllowanceCharge getDriverAllowanceCharge(final SessionContext ctx)
	{
		return (DriverAllowanceCharge)getProperty( ctx, DRIVERALLOWANCECHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.driverAllowanceCharge</code> attribute.
	 * @return the driverAllowanceCharge
	 */
	public DriverAllowanceCharge getDriverAllowanceCharge()
	{
		return getDriverAllowanceCharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.driverAllowanceCharge</code> attribute. 
	 * @param value the driverAllowanceCharge
	 */
	public void setDriverAllowanceCharge(final SessionContext ctx, final DriverAllowanceCharge value)
	{
		setProperty(ctx, DRIVERALLOWANCECHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.driverAllowanceCharge</code> attribute. 
	 * @param value the driverAllowanceCharge
	 */
	public void setDriverAllowanceCharge(final DriverAllowanceCharge value)
	{
		setDriverAllowanceCharge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.dropOffChargesDetails</code> attribute.
	 * @return the dropOffChargesDetails
	 */
	public Collection<DropOffChargesDetail> getDropOffChargesDetails(final SessionContext ctx)
	{
		return DROPOFFCHARGESDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.dropOffChargesDetails</code> attribute.
	 * @return the dropOffChargesDetails
	 */
	public Collection<DropOffChargesDetail> getDropOffChargesDetails()
	{
		return getDropOffChargesDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.dropOffChargesDetails</code> attribute. 
	 * @param value the dropOffChargesDetails
	 */
	public void setDropOffChargesDetails(final SessionContext ctx, final Collection<DropOffChargesDetail> value)
	{
		DROPOFFCHARGESDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.dropOffChargesDetails</code> attribute. 
	 * @param value the dropOffChargesDetails
	 */
	public void setDropOffChargesDetails(final Collection<DropOffChargesDetail> value)
	{
		setDropOffChargesDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dropOffChargesDetails. 
	 * @param value the item to add to dropOffChargesDetails
	 */
	public void addToDropOffChargesDetails(final SessionContext ctx, final DropOffChargesDetail value)
	{
		DROPOFFCHARGESDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dropOffChargesDetails. 
	 * @param value the item to add to dropOffChargesDetails
	 */
	public void addToDropOffChargesDetails(final DropOffChargesDetail value)
	{
		addToDropOffChargesDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dropOffChargesDetails. 
	 * @param value the item to remove from dropOffChargesDetails
	 */
	public void removeFromDropOffChargesDetails(final SessionContext ctx, final DropOffChargesDetail value)
	{
		DROPOFFCHARGESDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dropOffChargesDetails. 
	 * @param value the item to remove from dropOffChargesDetails
	 */
	public void removeFromDropOffChargesDetails(final DropOffChargesDetail value)
	{
		removeFromDropOffChargesDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STDCOMMISSIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.stdCommissionType</code> attribute.
	 * @return the stdCommissionType
	 */
	public EnumerationValue getStdCommissionType()
	{
		return getStdCommissionType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STDCOMMISSIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.stdCommissionType</code> attribute. 
	 * @param value the stdCommissionType
	 */
	public void setStdCommissionType(final EnumerationValue value)
	{
		setStdCommissionType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, STDCOMMISSIONVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute.
	 * @return the stdCommissionValue
	 */
	public Double getStdCommissionValue()
	{
		return getStdCommissionValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getStdCommissionValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @return the stdCommissionValue
	 */
	public double getStdCommissionValueAsPrimitive()
	{
		return getStdCommissionValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, STDCOMMISSIONVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final Double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final SessionContext ctx, final double value)
	{
		setStdCommissionValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.stdCommissionValue</code> attribute. 
	 * @param value the stdCommissionValue
	 */
	public void setStdCommissionValue(final double value)
	{
		setStdCommissionValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.subType</code> attribute.
	 * @return the subType
	 */
	public EnumerationValue getSubType()
	{
		return getSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.subType</code> attribute. 
	 * @param value the subType
	 */
	public void setSubType(final EnumerationValue value)
	{
		setSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.vehicleCharge</code> attribute.
	 * @return the vehicleCharge
	 */
	public VehicleCharge getVehicleCharge(final SessionContext ctx)
	{
		return (VehicleCharge)getProperty( ctx, VEHICLECHARGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationSurchargeSuppDetail.vehicleCharge</code> attribute.
	 * @return the vehicleCharge
	 */
	public VehicleCharge getVehicleCharge()
	{
		return getVehicleCharge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.vehicleCharge</code> attribute. 
	 * @param value the vehicleCharge
	 */
	public void setVehicleCharge(final SessionContext ctx, final VehicleCharge value)
	{
		setProperty(ctx, VEHICLECHARGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationSurchargeSuppDetail.vehicleCharge</code> attribute. 
	 * @param value the vehicleCharge
	 */
	public void setVehicleCharge(final VehicleCharge value)
	{
		setVehicleCharge( getSession().getSessionContext(), value );
	}
	
}
