/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.TransportationRateAdvDefinition;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.PeakHours PeakHours}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPeakHours extends GenericItem
{
	/** Qualifier of the <code>PeakHours.timeFrom</code> attribute **/
	public static final String TIMEFROM = "timeFrom";
	/** Qualifier of the <code>PeakHours.timeTo</code> attribute **/
	public static final String TIMETO = "timeTo";
	/** Qualifier of the <code>PeakHours.transportationOffers</code> attribute **/
	public static final String TRANSPORTATIONOFFERS = "transportationOffers";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRANSPORTATIONOFFERS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPeakHours> TRANSPORTATIONOFFERSHANDLER = new BidirectionalOneToManyHandler<GeneratedPeakHours>(
	SupplierratedefinitionstransportConstants.TC.PEAKHOURS,
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
		tmp.put(TIMEFROM, AttributeMode.INITIAL);
		tmp.put(TIMETO, AttributeMode.INITIAL);
		tmp.put(TRANSPORTATIONOFFERS, AttributeMode.INITIAL);
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
		TRANSPORTATIONOFFERSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeakHours.timeFrom</code> attribute.
	 * @return the timeFrom
	 */
	public String getTimeFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeakHours.timeFrom</code> attribute.
	 * @return the timeFrom
	 */
	public String getTimeFrom()
	{
		return getTimeFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeakHours.timeFrom</code> attribute. 
	 * @param value the timeFrom
	 */
	public void setTimeFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeakHours.timeFrom</code> attribute. 
	 * @param value the timeFrom
	 */
	public void setTimeFrom(final String value)
	{
		setTimeFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeakHours.timeTo</code> attribute.
	 * @return the timeTo
	 */
	public String getTimeTo(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TIMETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeakHours.timeTo</code> attribute.
	 * @return the timeTo
	 */
	public String getTimeTo()
	{
		return getTimeTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeakHours.timeTo</code> attribute. 
	 * @param value the timeTo
	 */
	public void setTimeTo(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TIMETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeakHours.timeTo</code> attribute. 
	 * @param value the timeTo
	 */
	public void setTimeTo(final String value)
	{
		setTimeTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeakHours.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationRateAdvDefinition getTransportationOffers(final SessionContext ctx)
	{
		return (TransportationRateAdvDefinition)getProperty( ctx, TRANSPORTATIONOFFERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PeakHours.transportationOffers</code> attribute.
	 * @return the transportationOffers
	 */
	public TransportationRateAdvDefinition getTransportationOffers()
	{
		return getTransportationOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeakHours.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final SessionContext ctx, final TransportationRateAdvDefinition value)
	{
		TRANSPORTATIONOFFERSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PeakHours.transportationOffers</code> attribute. 
	 * @param value the transportationOffers
	 */
	public void setTransportationOffers(final TransportationRateAdvDefinition value)
	{
		setTransportationOffers( getSession().getSessionContext(), value );
	}
	
}
