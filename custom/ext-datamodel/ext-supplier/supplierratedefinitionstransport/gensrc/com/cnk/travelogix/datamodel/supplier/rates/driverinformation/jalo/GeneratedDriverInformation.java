/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.driverinformation.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.transportationoffers.jalo.TransportationOffers;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.driverinformation.jalo.DriverInformation DriverInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDriverInformation extends GenericItem
{
	/** Qualifier of the <code>DriverInformation.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>DriverInformation.driverAgeFrom</code> attribute **/
	public static final String DRIVERAGEFROM = "driverAgeFrom";
	/** Qualifier of the <code>DriverInformation.driverAgeTo</code> attribute **/
	public static final String DRIVERAGETO = "driverAgeTo";
	/** Qualifier of the <code>DriverInformation.transportationOffers</code> attribute **/
	public static final String TRANSPORTATIONOFFERS = "transportationOffers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRANSPORTATIONOFFERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDriverInformation> TRANSPORTATIONOFFERSHANDLER = new BidirectionalOneToManyHandler<GeneratedDriverInformation>(
	SupplierratedefinitionstransportConstants.TC.DRIVERINFORMATION,
	false,
	"transportationOffers",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(DRIVERAGEFROM, AttributeMode.INITIAL);
		tmp.put(DRIVERAGETO, AttributeMode.INITIAL);
		tmp.put(TRANSPORTATIONOFFERS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.country</code> attribute.
	 * @return the country
	 */
	public Collection<Country> getCountry(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, COUNTRY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.country</code> attribute.
	 * @return the country
	 */
	public Collection<Country> getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, COUNTRY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Collection<Country> value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRANSPORTATIONOFFERSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.driverAgeFrom</code> attribute.
	 * @return the driverAgeFrom
	 */
	public Integer getDriverAgeFrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DRIVERAGEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.driverAgeFrom</code> attribute.
	 * @return the driverAgeFrom
	 */
	public Integer getDriverAgeFrom()
	{
		return getDriverAgeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.driverAgeFrom</code> attribute. 
	 * @return the driverAgeFrom
	 */
	public int getDriverAgeFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDriverAgeFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.driverAgeFrom</code> attribute. 
	 * @return the driverAgeFrom
	 */
	public int getDriverAgeFromAsPrimitive()
	{
		return getDriverAgeFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.driverAgeFrom</code> attribute. 
	 * @param value the driverAgeFrom
	 */
	public void setDriverAgeFrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DRIVERAGEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.driverAgeFrom</code> attribute. 
	 * @param value the driverAgeFrom
	 */
	public void setDriverAgeFrom(final Integer value)
	{
		setDriverAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.driverAgeFrom</code> attribute. 
	 * @param value the driverAgeFrom
	 */
	public void setDriverAgeFrom(final SessionContext ctx, final int value)
	{
		setDriverAgeFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.driverAgeFrom</code> attribute. 
	 * @param value the driverAgeFrom
	 */
	public void setDriverAgeFrom(final int value)
	{
		setDriverAgeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.driverAgeTo</code> attribute.
	 * @return the driverAgeTo
	 */
	public Integer getDriverAgeTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DRIVERAGETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.driverAgeTo</code> attribute.
	 * @return the driverAgeTo
	 */
	public Integer getDriverAgeTo()
	{
		return getDriverAgeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.driverAgeTo</code> attribute. 
	 * @return the driverAgeTo
	 */
	public int getDriverAgeToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDriverAgeTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.driverAgeTo</code> attribute. 
	 * @return the driverAgeTo
	 */
	public int getDriverAgeToAsPrimitive()
	{
		return getDriverAgeToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.driverAgeTo</code> attribute. 
	 * @param value the driverAgeTo
	 */
	public void setDriverAgeTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DRIVERAGETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.driverAgeTo</code> attribute. 
	 * @param value the driverAgeTo
	 */
	public void setDriverAgeTo(final Integer value)
	{
		setDriverAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.driverAgeTo</code> attribute. 
	 * @param value the driverAgeTo
	 */
	public void setDriverAgeTo(final SessionContext ctx, final int value)
	{
		setDriverAgeTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.driverAgeTo</code> attribute. 
	 * @param value the driverAgeTo
	 */
	public void setDriverAgeTo(final int value)
	{
		setDriverAgeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationOffers getTransportationOffers(final SessionContext ctx)
	{
		return (TransportationOffers)getProperty( ctx, TRANSPORTATIONOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DriverInformation.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationOffers getTransportationOffers()
	{
		return getTransportationOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final SessionContext ctx, final TransportationOffers value)
	{
		TRANSPORTATIONOFFERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DriverInformation.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final TransportationOffers value)
	{
		setTransportationOffers( getSession().getSessionContext(), value );
	}
	
}
