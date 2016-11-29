/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.masterdata.core.deals.jalo.DealCode;
import com.cnk.travelogix.masterdata.core.fare.jalo.FareBasis;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.FlightBasis FlightBasis}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFlightBasis extends GenericItem
{
	/** Qualifier of the <code>FlightBasis.includeorExclude</code> attribute **/
	public static final String INCLUDEOREXCLUDE = "includeorExclude";
	/** Qualifier of the <code>FlightBasis.fareBasis</code> attribute **/
	public static final String FAREBASIS = "fareBasis";
	/** Qualifier of the <code>FlightBasis.fareBasisValue</code> attribute **/
	public static final String FAREBASISVALUE = "fareBasisValue";
	/** Qualifier of the <code>FlightBasis.fareTypes</code> attribute **/
	public static final String FARETYPES = "fareTypes";
	/** Qualifier of the <code>FlightBasis.dealCodes</code> attribute **/
	public static final String DEALCODES = "dealCodes";
	/** Qualifier of the <code>FlightBasis.tourCodes</code> attribute **/
	public static final String TOURCODES = "tourCodes";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUDEOREXCLUDE, AttributeMode.INITIAL);
		tmp.put(FAREBASIS, AttributeMode.INITIAL);
		tmp.put(FAREBASISVALUE, AttributeMode.INITIAL);
		tmp.put(FARETYPES, AttributeMode.INITIAL);
		tmp.put(DEALCODES, AttributeMode.INITIAL);
		tmp.put(TOURCODES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.dealCodes</code> attribute.
	 * @return the dealCodes - Company Policy Deal Codes
	 */
	public DealCode getDealCodes(final SessionContext ctx)
	{
		return (DealCode)getProperty( ctx, DEALCODES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.dealCodes</code> attribute.
	 * @return the dealCodes - Company Policy Deal Codes
	 */
	public DealCode getDealCodes()
	{
		return getDealCodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.dealCodes</code> attribute. 
	 * @param value the dealCodes - Company Policy Deal Codes
	 */
	public void setDealCodes(final SessionContext ctx, final DealCode value)
	{
		setProperty(ctx, DEALCODES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.dealCodes</code> attribute. 
	 * @param value the dealCodes - Company Policy Deal Codes
	 */
	public void setDealCodes(final DealCode value)
	{
		setDealCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.fareBasis</code> attribute.
	 * @return the fareBasis - Company Policy fare Basis
	 */
	public FareBasis getFareBasis(final SessionContext ctx)
	{
		return (FareBasis)getProperty( ctx, FAREBASIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.fareBasis</code> attribute.
	 * @return the fareBasis - Company Policy fare Basis
	 */
	public FareBasis getFareBasis()
	{
		return getFareBasis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.fareBasis</code> attribute. 
	 * @param value the fareBasis - Company Policy fare Basis
	 */
	public void setFareBasis(final SessionContext ctx, final FareBasis value)
	{
		setProperty(ctx, FAREBASIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.fareBasis</code> attribute. 
	 * @param value the fareBasis - Company Policy fare Basis
	 */
	public void setFareBasis(final FareBasis value)
	{
		setFareBasis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.fareBasisValue</code> attribute.
	 * @return the fareBasisValue - Company Policy Fare Basis Value
	 */
	public String getFareBasisValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAREBASISVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.fareBasisValue</code> attribute.
	 * @return the fareBasisValue - Company Policy Fare Basis Value
	 */
	public String getFareBasisValue()
	{
		return getFareBasisValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.fareBasisValue</code> attribute. 
	 * @param value the fareBasisValue - Company Policy Fare Basis Value
	 */
	public void setFareBasisValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAREBASISVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.fareBasisValue</code> attribute. 
	 * @param value the fareBasisValue - Company Policy Fare Basis Value
	 */
	public void setFareBasisValue(final String value)
	{
		setFareBasisValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.fareTypes</code> attribute.
	 * @return the fareTypes - Company Policy Fare Types
	 */
	public String getFareTypes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FARETYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.fareTypes</code> attribute.
	 * @return the fareTypes - Company Policy Fare Types
	 */
	public String getFareTypes()
	{
		return getFareTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.fareTypes</code> attribute. 
	 * @param value the fareTypes - Company Policy Fare Types
	 */
	public void setFareTypes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FARETYPES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.fareTypes</code> attribute. 
	 * @param value the fareTypes - Company Policy Fare Types
	 */
	public void setFareTypes(final String value)
	{
		setFareTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.includeorExclude</code> attribute.
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public Boolean isIncludeorExclude(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDEOREXCLUDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.includeorExclude</code> attribute.
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public Boolean isIncludeorExclude()
	{
		return isIncludeorExclude( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public boolean isIncludeorExcludeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncludeorExclude( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.includeorExclude</code> attribute. 
	 * @return the includeorExclude - Company Policy include or Exclude
	 */
	public boolean isIncludeorExcludeAsPrimitive()
	{
		return isIncludeorExcludeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDEOREXCLUDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final Boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final SessionContext ctx, final boolean value)
	{
		setIncludeorExclude( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.includeorExclude</code> attribute. 
	 * @param value the includeorExclude - Company Policy include or Exclude
	 */
	public void setIncludeorExclude(final boolean value)
	{
		setIncludeorExclude( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.tourCodes</code> attribute.
	 * @return the tourCodes - Company Policy Tour Codes
	 */
	public DealCode getTourCodes(final SessionContext ctx)
	{
		return (DealCode)getProperty( ctx, TOURCODES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightBasis.tourCodes</code> attribute.
	 * @return the tourCodes - Company Policy Tour Codes
	 */
	public DealCode getTourCodes()
	{
		return getTourCodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.tourCodes</code> attribute. 
	 * @param value the tourCodes - Company Policy Tour Codes
	 */
	public void setTourCodes(final SessionContext ctx, final DealCode value)
	{
		setProperty(ctx, TOURCODES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightBasis.tourCodes</code> attribute. 
	 * @param value the tourCodes - Company Policy Tour Codes
	 */
	public void setTourCodes(final DealCode value)
	{
		setTourCodes( getSession().getSessionContext(), value );
	}
	
}
