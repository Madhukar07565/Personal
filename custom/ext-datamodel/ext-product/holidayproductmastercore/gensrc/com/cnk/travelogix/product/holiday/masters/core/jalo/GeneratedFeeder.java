/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayFlavor;
import com.cnk.travelogix.product.holiday.masters.core.jalo.HolidayHub;
import com.cnk.travelogix.product.holiday.masters.core.jalo.TransferProductDayWiseItinerary;
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
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.Feeder Feeder}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFeeder extends GenericItem
{
	/** Qualifier of the <code>Feeder.preTour</code> attribute **/
	public static final String PRETOUR = "preTour";
	/** Qualifier of the <code>Feeder.postTour</code> attribute **/
	public static final String POSTTOUR = "postTour";
	/** Qualifier of the <code>Feeder.flavor</code> attribute **/
	public static final String FLAVOR = "flavor";
	/** Qualifier of the <code>Feeder.transfer</code> attribute **/
	public static final String TRANSFER = "transfer";
	/** Qualifier of the <code>Feeder.holidayHub</code> attribute **/
	public static final String HOLIDAYHUB = "holidayHub";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n HOLIDAYHUB's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFeeder> HOLIDAYHUBHANDLER = new BidirectionalOneToManyHandler<GeneratedFeeder>(
	HolidayproductmastercoreConstants.TC.FEEDER,
	false,
	"holidayHub",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRETOUR, AttributeMode.INITIAL);
		tmp.put(POSTTOUR, AttributeMode.INITIAL);
		tmp.put(FLAVOR, AttributeMode.INITIAL);
		tmp.put(TRANSFER, AttributeMode.INITIAL);
		tmp.put(HOLIDAYHUB, AttributeMode.INITIAL);
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
		HOLIDAYHUBHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.flavor</code> attribute.
	 * @return the flavor - Flavor
	 */
	public HolidayFlavor getFlavor(final SessionContext ctx)
	{
		return (HolidayFlavor)getProperty( ctx, FLAVOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.flavor</code> attribute.
	 * @return the flavor - Flavor
	 */
	public HolidayFlavor getFlavor()
	{
		return getFlavor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.flavor</code> attribute. 
	 * @param value the flavor - Flavor
	 */
	public void setFlavor(final SessionContext ctx, final HolidayFlavor value)
	{
		setProperty(ctx, FLAVOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.flavor</code> attribute. 
	 * @param value the flavor - Flavor
	 */
	public void setFlavor(final HolidayFlavor value)
	{
		setFlavor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.holidayHub</code> attribute.
	 * @return the holidayHub
	 */
	public HolidayHub getHolidayHub(final SessionContext ctx)
	{
		return (HolidayHub)getProperty( ctx, HOLIDAYHUB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.holidayHub</code> attribute.
	 * @return the holidayHub
	 */
	public HolidayHub getHolidayHub()
	{
		return getHolidayHub( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.holidayHub</code> attribute. 
	 * @param value the holidayHub
	 */
	public void setHolidayHub(final SessionContext ctx, final HolidayHub value)
	{
		HOLIDAYHUBHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.holidayHub</code> attribute. 
	 * @param value the holidayHub
	 */
	public void setHolidayHub(final HolidayHub value)
	{
		setHolidayHub( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.postTour</code> attribute.
	 * @return the postTour - Is post tour
	 */
	public Boolean isPostTour(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, POSTTOUR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.postTour</code> attribute.
	 * @return the postTour - Is post tour
	 */
	public Boolean isPostTour()
	{
		return isPostTour( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.postTour</code> attribute. 
	 * @return the postTour - Is post tour
	 */
	public boolean isPostTourAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPostTour( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.postTour</code> attribute. 
	 * @return the postTour - Is post tour
	 */
	public boolean isPostTourAsPrimitive()
	{
		return isPostTourAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.postTour</code> attribute. 
	 * @param value the postTour - Is post tour
	 */
	public void setPostTour(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, POSTTOUR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.postTour</code> attribute. 
	 * @param value the postTour - Is post tour
	 */
	public void setPostTour(final Boolean value)
	{
		setPostTour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.postTour</code> attribute. 
	 * @param value the postTour - Is post tour
	 */
	public void setPostTour(final SessionContext ctx, final boolean value)
	{
		setPostTour( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.postTour</code> attribute. 
	 * @param value the postTour - Is post tour
	 */
	public void setPostTour(final boolean value)
	{
		setPostTour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.preTour</code> attribute.
	 * @return the preTour - Is pre tour
	 */
	public Boolean isPreTour(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PRETOUR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.preTour</code> attribute.
	 * @return the preTour - Is pre tour
	 */
	public Boolean isPreTour()
	{
		return isPreTour( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.preTour</code> attribute. 
	 * @return the preTour - Is pre tour
	 */
	public boolean isPreTourAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPreTour( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.preTour</code> attribute. 
	 * @return the preTour - Is pre tour
	 */
	public boolean isPreTourAsPrimitive()
	{
		return isPreTourAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.preTour</code> attribute. 
	 * @param value the preTour - Is pre tour
	 */
	public void setPreTour(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PRETOUR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.preTour</code> attribute. 
	 * @param value the preTour - Is pre tour
	 */
	public void setPreTour(final Boolean value)
	{
		setPreTour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.preTour</code> attribute. 
	 * @param value the preTour - Is pre tour
	 */
	public void setPreTour(final SessionContext ctx, final boolean value)
	{
		setPreTour( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.preTour</code> attribute. 
	 * @param value the preTour - Is pre tour
	 */
	public void setPreTour(final boolean value)
	{
		setPreTour( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.transfer</code> attribute.
	 * @return the transfer - Transfer
	 */
	public TransferProductDayWiseItinerary getTransfer(final SessionContext ctx)
	{
		return (TransferProductDayWiseItinerary)getProperty( ctx, TRANSFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Feeder.transfer</code> attribute.
	 * @return the transfer - Transfer
	 */
	public TransferProductDayWiseItinerary getTransfer()
	{
		return getTransfer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.transfer</code> attribute. 
	 * @param value the transfer - Transfer
	 */
	public void setTransfer(final SessionContext ctx, final TransferProductDayWiseItinerary value)
	{
		setProperty(ctx, TRANSFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Feeder.transfer</code> attribute. 
	 * @param value the transfer - Transfer
	 */
	public void setTransfer(final TransferProductDayWiseItinerary value)
	{
		setTransfer( getSession().getSessionContext(), value );
	}
	
}
