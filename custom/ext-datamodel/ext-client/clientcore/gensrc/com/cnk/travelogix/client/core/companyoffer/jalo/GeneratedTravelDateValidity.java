/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.BlockOutDate;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.companyoffer.jalo.RedemptionCompanyOffers;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.TravelDateValidity TravelDateValidity}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelDateValidity extends GenericItem
{
	/** Qualifier of the <code>TravelDateValidity.travelDateFrom</code> attribute **/
	public static final String TRAVELDATEFROM = "travelDateFrom";
	/** Qualifier of the <code>TravelDateValidity.travelDateTo</code> attribute **/
	public static final String TRAVELDATETO = "travelDateTo";
	/** Qualifier of the <code>TravelDateValidity.arrivaldaysOfWeek</code> attribute **/
	public static final String ARRIVALDAYSOFWEEK = "arrivaldaysOfWeek";
	/** Qualifier of the <code>TravelDateValidity.staydaysOfWeek</code> attribute **/
	public static final String STAYDAYSOFWEEK = "staydaysOfWeek";
	/** Qualifier of the <code>TravelDateValidity.companyTravelDateValidity</code> attribute **/
	public static final String COMPANYTRAVELDATEVALIDITY = "companyTravelDateValidity";
	/** Qualifier of the <code>TravelDateValidity.redempOffersValidity</code> attribute **/
	public static final String REDEMPOFFERSVALIDITY = "redempOffersValidity";
	/** Qualifier of the <code>TravelDateValidity.blockOutDateTravel</code> attribute **/
	public static final String BLOCKOUTDATETRAVEL = "blockOutDateTravel";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANYTRAVELDATEVALIDITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTravelDateValidity> COMPANYTRAVELDATEVALIDITYHANDLER = new BidirectionalOneToManyHandler<GeneratedTravelDateValidity>(
	ClientcoreConstants.TC.TRAVELDATEVALIDITY,
	false,
	"companyTravelDateValidity",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n REDEMPOFFERSVALIDITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTravelDateValidity> REDEMPOFFERSVALIDITYHANDLER = new BidirectionalOneToManyHandler<GeneratedTravelDateValidity>(
	ClientcoreConstants.TC.TRAVELDATEVALIDITY,
	false,
	"redempOffersValidity",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BLOCKOUTDATETRAVEL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BlockOutDate> BLOCKOUTDATETRAVELHANDLER = new OneToManyHandler<BlockOutDate>(
	ClientcoreConstants.TC.BLOCKOUTDATE,
	false,
	"travelDateBlockOut",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TRAVELDATEFROM, AttributeMode.INITIAL);
		tmp.put(TRAVELDATETO, AttributeMode.INITIAL);
		tmp.put(ARRIVALDAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(STAYDAYSOFWEEK, AttributeMode.INITIAL);
		tmp.put(COMPANYTRAVELDATEVALIDITY, AttributeMode.INITIAL);
		tmp.put(REDEMPOFFERSVALIDITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.arrivaldaysOfWeek</code> attribute.
	 * @return the arrivaldaysOfWeek
	 */
	public EnumerationValue getArrivaldaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ARRIVALDAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.arrivaldaysOfWeek</code> attribute.
	 * @return the arrivaldaysOfWeek
	 */
	public EnumerationValue getArrivaldaysOfWeek()
	{
		return getArrivaldaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.arrivaldaysOfWeek</code> attribute. 
	 * @param value the arrivaldaysOfWeek
	 */
	public void setArrivaldaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ARRIVALDAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.arrivaldaysOfWeek</code> attribute. 
	 * @param value the arrivaldaysOfWeek
	 */
	public void setArrivaldaysOfWeek(final EnumerationValue value)
	{
		setArrivaldaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.blockOutDateTravel</code> attribute.
	 * @return the blockOutDateTravel
	 */
	public Collection<BlockOutDate> getBlockOutDateTravel(final SessionContext ctx)
	{
		return BLOCKOUTDATETRAVELHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.blockOutDateTravel</code> attribute.
	 * @return the blockOutDateTravel
	 */
	public Collection<BlockOutDate> getBlockOutDateTravel()
	{
		return getBlockOutDateTravel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.blockOutDateTravel</code> attribute. 
	 * @param value the blockOutDateTravel
	 */
	public void setBlockOutDateTravel(final SessionContext ctx, final Collection<BlockOutDate> value)
	{
		BLOCKOUTDATETRAVELHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.blockOutDateTravel</code> attribute. 
	 * @param value the blockOutDateTravel
	 */
	public void setBlockOutDateTravel(final Collection<BlockOutDate> value)
	{
		setBlockOutDateTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to blockOutDateTravel. 
	 * @param value the item to add to blockOutDateTravel
	 */
	public void addToBlockOutDateTravel(final SessionContext ctx, final BlockOutDate value)
	{
		BLOCKOUTDATETRAVELHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to blockOutDateTravel. 
	 * @param value the item to add to blockOutDateTravel
	 */
	public void addToBlockOutDateTravel(final BlockOutDate value)
	{
		addToBlockOutDateTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from blockOutDateTravel. 
	 * @param value the item to remove from blockOutDateTravel
	 */
	public void removeFromBlockOutDateTravel(final SessionContext ctx, final BlockOutDate value)
	{
		BLOCKOUTDATETRAVELHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from blockOutDateTravel. 
	 * @param value the item to remove from blockOutDateTravel
	 */
	public void removeFromBlockOutDateTravel(final BlockOutDate value)
	{
		removeFromBlockOutDateTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.companyTravelDateValidity</code> attribute.
	 * @return the companyTravelDateValidity
	 */
	public CompanyOffers getCompanyTravelDateValidity(final SessionContext ctx)
	{
		return (CompanyOffers)getProperty( ctx, COMPANYTRAVELDATEVALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.companyTravelDateValidity</code> attribute.
	 * @return the companyTravelDateValidity
	 */
	public CompanyOffers getCompanyTravelDateValidity()
	{
		return getCompanyTravelDateValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.companyTravelDateValidity</code> attribute. 
	 * @param value the companyTravelDateValidity
	 */
	public void setCompanyTravelDateValidity(final SessionContext ctx, final CompanyOffers value)
	{
		COMPANYTRAVELDATEVALIDITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.companyTravelDateValidity</code> attribute. 
	 * @param value the companyTravelDateValidity
	 */
	public void setCompanyTravelDateValidity(final CompanyOffers value)
	{
		setCompanyTravelDateValidity( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANYTRAVELDATEVALIDITYHANDLER.newInstance(ctx, allAttributes);
		REDEMPOFFERSVALIDITYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.redempOffersValidity</code> attribute.
	 * @return the redempOffersValidity
	 */
	public RedemptionCompanyOffers getRedempOffersValidity(final SessionContext ctx)
	{
		return (RedemptionCompanyOffers)getProperty( ctx, REDEMPOFFERSVALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.redempOffersValidity</code> attribute.
	 * @return the redempOffersValidity
	 */
	public RedemptionCompanyOffers getRedempOffersValidity()
	{
		return getRedempOffersValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.redempOffersValidity</code> attribute. 
	 * @param value the redempOffersValidity
	 */
	public void setRedempOffersValidity(final SessionContext ctx, final RedemptionCompanyOffers value)
	{
		REDEMPOFFERSVALIDITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.redempOffersValidity</code> attribute. 
	 * @param value the redempOffersValidity
	 */
	public void setRedempOffersValidity(final RedemptionCompanyOffers value)
	{
		setRedempOffersValidity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.staydaysOfWeek</code> attribute.
	 * @return the staydaysOfWeek
	 */
	public EnumerationValue getStaydaysOfWeek(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STAYDAYSOFWEEK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.staydaysOfWeek</code> attribute.
	 * @return the staydaysOfWeek
	 */
	public EnumerationValue getStaydaysOfWeek()
	{
		return getStaydaysOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.staydaysOfWeek</code> attribute. 
	 * @param value the staydaysOfWeek
	 */
	public void setStaydaysOfWeek(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STAYDAYSOFWEEK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.staydaysOfWeek</code> attribute. 
	 * @param value the staydaysOfWeek
	 */
	public void setStaydaysOfWeek(final EnumerationValue value)
	{
		setStaydaysOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.travelDateFrom</code> attribute.
	 * @return the travelDateFrom
	 */
	public Date getTravelDateFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TRAVELDATEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.travelDateFrom</code> attribute.
	 * @return the travelDateFrom
	 */
	public Date getTravelDateFrom()
	{
		return getTravelDateFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.travelDateFrom</code> attribute. 
	 * @param value the travelDateFrom
	 */
	public void setTravelDateFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TRAVELDATEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.travelDateFrom</code> attribute. 
	 * @param value the travelDateFrom
	 */
	public void setTravelDateFrom(final Date value)
	{
		setTravelDateFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.travelDateTo</code> attribute.
	 * @return the travelDateTo
	 */
	public Date getTravelDateTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TRAVELDATETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelDateValidity.travelDateTo</code> attribute.
	 * @return the travelDateTo
	 */
	public Date getTravelDateTo()
	{
		return getTravelDateTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.travelDateTo</code> attribute. 
	 * @param value the travelDateTo
	 */
	public void setTravelDateTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TRAVELDATETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelDateValidity.travelDateTo</code> attribute. 
	 * @param value the travelDateTo
	 */
	public void setTravelDateTo(final Date value)
	{
		setTravelDateTo( getSession().getSessionContext(), value );
	}
	
}
