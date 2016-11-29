/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ShipEquipmentDetails ShipEquipmentDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShipEquipmentDetails extends GenericItem
{
	/** Qualifier of the <code>ShipEquipmentDetails.generator</code> attribute **/
	public static final String GENERATOR = "generator";
	/** Qualifier of the <code>ShipEquipmentDetails.stabilizers</code> attribute **/
	public static final String STABILIZERS = "stabilizers";
	/** Qualifier of the <code>ShipEquipmentDetails.thrusters</code> attribute **/
	public static final String THRUSTERS = "thrusters";
	/** Qualifier of the <code>ShipEquipmentDetails.amenities</code> attribute **/
	public static final String AMENITIES = "amenities";
	/** Qualifier of the <code>ShipEquipmentDetails.noOfNavigationSystem_GPS</code> attribute **/
	public static final String NOOFNAVIGATIONSYSTEM_GPS = "noOfNavigationSystem_GPS";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(GENERATOR, AttributeMode.INITIAL);
		tmp.put(STABILIZERS, AttributeMode.INITIAL);
		tmp.put(THRUSTERS, AttributeMode.INITIAL);
		tmp.put(AMENITIES, AttributeMode.INITIAL);
		tmp.put(NOOFNAVIGATIONSYSTEM_GPS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.amenities</code> attribute.
	 * @return the amenities - Amenities
	 */
	public String getAmenities(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AMENITIES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.amenities</code> attribute.
	 * @return the amenities - Amenities
	 */
	public String getAmenities()
	{
		return getAmenities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.amenities</code> attribute. 
	 * @param value the amenities - Amenities
	 */
	public void setAmenities(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AMENITIES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.amenities</code> attribute. 
	 * @param value the amenities - Amenities
	 */
	public void setAmenities(final String value)
	{
		setAmenities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.generator</code> attribute.
	 * @return the generator - Generator
	 */
	public String getGenerator(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GENERATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.generator</code> attribute.
	 * @return the generator - Generator
	 */
	public String getGenerator()
	{
		return getGenerator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.generator</code> attribute. 
	 * @param value the generator - Generator
	 */
	public void setGenerator(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GENERATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.generator</code> attribute. 
	 * @param value the generator - Generator
	 */
	public void setGenerator(final String value)
	{
		setGenerator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.noOfNavigationSystem_GPS</code> attribute.
	 * @return the noOfNavigationSystem_GPS - No Of Navigation System_GPS
	 */
	public String getNoOfNavigationSystem_GPS(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOOFNAVIGATIONSYSTEM_GPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.noOfNavigationSystem_GPS</code> attribute.
	 * @return the noOfNavigationSystem_GPS - No Of Navigation System_GPS
	 */
	public String getNoOfNavigationSystem_GPS()
	{
		return getNoOfNavigationSystem_GPS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.noOfNavigationSystem_GPS</code> attribute. 
	 * @param value the noOfNavigationSystem_GPS - No Of Navigation System_GPS
	 */
	public void setNoOfNavigationSystem_GPS(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOOFNAVIGATIONSYSTEM_GPS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.noOfNavigationSystem_GPS</code> attribute. 
	 * @param value the noOfNavigationSystem_GPS - No Of Navigation System_GPS
	 */
	public void setNoOfNavigationSystem_GPS(final String value)
	{
		setNoOfNavigationSystem_GPS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.stabilizers</code> attribute.
	 * @return the stabilizers - Stabilizers
	 */
	public String getStabilizers(final SessionContext ctx)
	{
		return (String)getProperty( ctx, STABILIZERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.stabilizers</code> attribute.
	 * @return the stabilizers - Stabilizers
	 */
	public String getStabilizers()
	{
		return getStabilizers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.stabilizers</code> attribute. 
	 * @param value the stabilizers - Stabilizers
	 */
	public void setStabilizers(final SessionContext ctx, final String value)
	{
		setProperty(ctx, STABILIZERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.stabilizers</code> attribute. 
	 * @param value the stabilizers - Stabilizers
	 */
	public void setStabilizers(final String value)
	{
		setStabilizers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.thrusters</code> attribute.
	 * @return the thrusters - Thrusters
	 */
	public String getThrusters(final SessionContext ctx)
	{
		return (String)getProperty( ctx, THRUSTERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipEquipmentDetails.thrusters</code> attribute.
	 * @return the thrusters - Thrusters
	 */
	public String getThrusters()
	{
		return getThrusters( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.thrusters</code> attribute. 
	 * @param value the thrusters - Thrusters
	 */
	public void setThrusters(final SessionContext ctx, final String value)
	{
		setProperty(ctx, THRUSTERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipEquipmentDetails.thrusters</code> attribute. 
	 * @param value the thrusters - Thrusters
	 */
	public void setThrusters(final String value)
	{
		setThrusters( getSession().getSessionContext(), value );
	}
	
}
