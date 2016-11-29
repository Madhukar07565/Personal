/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.masterdata.core.proucts.jalo.RailPass;
import com.cnk.travelogix.masterdata.core.proucts.jalo.Train;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialProductInfo;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.RailProductInfo RailProductInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRailProductInfo extends CommercialProductInfo
{
	/** Qualifier of the <code>RailProductInfo.channel</code> attribute **/
	public static final String CHANNEL = "channel";
	/** Qualifier of the <code>RailProductInfo.train</code> attribute **/
	public static final String TRAIN = "train";
	/** Qualifier of the <code>RailProductInfo.trainCategory</code> attribute **/
	public static final String TRAINCATEGORY = "trainCategory";
	/** Qualifier of the <code>RailProductInfo.ticketType</code> attribute **/
	public static final String TICKETTYPE = "ticketType";
	/** Qualifier of the <code>RailProductInfo.groupMode</code> attribute **/
	public static final String GROUPMODE = "groupMode";
	/** Qualifier of the <code>RailProductInfo.fareType</code> attribute **/
	public static final String FARETYPE = "fareType";
	/** Qualifier of the <code>RailProductInfo.passName</code> attribute **/
	public static final String PASSNAME = "passName";
	/** Qualifier of the <code>RailProductInfo.includedCountries</code> attribute **/
	public static final String INCLUDEDCOUNTRIES = "includedCountries";
	/** Qualifier of the <code>RailProductInfo.excludedCountries</code> attribute **/
	public static final String EXCLUDEDCOUNTRIES = "excludedCountries";
	/**
	* {@link OneToManyHandler} for handling 1:n INCLUDEDCOUNTRIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Country> INCLUDEDCOUNTRIESHANDLER = new OneToManyHandler<Country>(
	CoreConstants.TC.COUNTRY,
	false,
	"commercialProductInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EXCLUDEDCOUNTRIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Country> EXCLUDEDCOUNTRIESHANDLER = new OneToManyHandler<Country>(
	CoreConstants.TC.COUNTRY,
	false,
	"commercialProductInfo",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CommercialProductInfo.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CHANNEL, AttributeMode.INITIAL);
		tmp.put(TRAIN, AttributeMode.INITIAL);
		tmp.put(TRAINCATEGORY, AttributeMode.INITIAL);
		tmp.put(TICKETTYPE, AttributeMode.INITIAL);
		tmp.put(GROUPMODE, AttributeMode.INITIAL);
		tmp.put(FARETYPE, AttributeMode.INITIAL);
		tmp.put(PASSNAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.channel</code> attribute.
	 * @return the channel
	 */
	public EnumerationValue getChannel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.channel</code> attribute.
	 * @return the channel
	 */
	public EnumerationValue getChannel()
	{
		return getChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.channel</code> attribute. 
	 * @param value the channel
	 */
	public void setChannel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.channel</code> attribute. 
	 * @param value the channel
	 */
	public void setChannel(final EnumerationValue value)
	{
		setChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.excludedCountries</code> attribute.
	 * @return the excludedCountries
	 */
	public Collection<Country> getExcludedCountries(final SessionContext ctx)
	{
		return EXCLUDEDCOUNTRIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.excludedCountries</code> attribute.
	 * @return the excludedCountries
	 */
	public Collection<Country> getExcludedCountries()
	{
		return getExcludedCountries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.excludedCountries</code> attribute. 
	 * @param value the excludedCountries
	 */
	public void setExcludedCountries(final SessionContext ctx, final Collection<Country> value)
	{
		EXCLUDEDCOUNTRIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.excludedCountries</code> attribute. 
	 * @param value the excludedCountries
	 */
	public void setExcludedCountries(final Collection<Country> value)
	{
		setExcludedCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to excludedCountries. 
	 * @param value the item to add to excludedCountries
	 */
	public void addToExcludedCountries(final SessionContext ctx, final Country value)
	{
		EXCLUDEDCOUNTRIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to excludedCountries. 
	 * @param value the item to add to excludedCountries
	 */
	public void addToExcludedCountries(final Country value)
	{
		addToExcludedCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from excludedCountries. 
	 * @param value the item to remove from excludedCountries
	 */
	public void removeFromExcludedCountries(final SessionContext ctx, final Country value)
	{
		EXCLUDEDCOUNTRIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from excludedCountries. 
	 * @param value the item to remove from excludedCountries
	 */
	public void removeFromExcludedCountries(final Country value)
	{
		removeFromExcludedCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.fareType</code> attribute.
	 * @return the fareType
	 */
	public EnumerationValue getFareType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, FARETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.fareType</code> attribute.
	 * @return the fareType
	 */
	public EnumerationValue getFareType()
	{
		return getFareType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.fareType</code> attribute. 
	 * @param value the fareType
	 */
	public void setFareType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, FARETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.fareType</code> attribute. 
	 * @param value the fareType
	 */
	public void setFareType(final EnumerationValue value)
	{
		setFareType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.groupMode</code> attribute.
	 * @return the groupMode
	 */
	public EnumerationValue getGroupMode(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GROUPMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.groupMode</code> attribute.
	 * @return the groupMode
	 */
	public EnumerationValue getGroupMode()
	{
		return getGroupMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.groupMode</code> attribute. 
	 * @param value the groupMode
	 */
	public void setGroupMode(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GROUPMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.groupMode</code> attribute. 
	 * @param value the groupMode
	 */
	public void setGroupMode(final EnumerationValue value)
	{
		setGroupMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.includedCountries</code> attribute.
	 * @return the includedCountries
	 */
	public Collection<Country> getIncludedCountries(final SessionContext ctx)
	{
		return INCLUDEDCOUNTRIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.includedCountries</code> attribute.
	 * @return the includedCountries
	 */
	public Collection<Country> getIncludedCountries()
	{
		return getIncludedCountries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.includedCountries</code> attribute. 
	 * @param value the includedCountries
	 */
	public void setIncludedCountries(final SessionContext ctx, final Collection<Country> value)
	{
		INCLUDEDCOUNTRIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.includedCountries</code> attribute. 
	 * @param value the includedCountries
	 */
	public void setIncludedCountries(final Collection<Country> value)
	{
		setIncludedCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to includedCountries. 
	 * @param value the item to add to includedCountries
	 */
	public void addToIncludedCountries(final SessionContext ctx, final Country value)
	{
		INCLUDEDCOUNTRIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to includedCountries. 
	 * @param value the item to add to includedCountries
	 */
	public void addToIncludedCountries(final Country value)
	{
		addToIncludedCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from includedCountries. 
	 * @param value the item to remove from includedCountries
	 */
	public void removeFromIncludedCountries(final SessionContext ctx, final Country value)
	{
		INCLUDEDCOUNTRIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from includedCountries. 
	 * @param value the item to remove from includedCountries
	 */
	public void removeFromIncludedCountries(final Country value)
	{
		removeFromIncludedCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.passName</code> attribute.
	 * @return the passName
	 */
	public RailPass getPassName(final SessionContext ctx)
	{
		return (RailPass)getProperty( ctx, PASSNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.passName</code> attribute.
	 * @return the passName
	 */
	public RailPass getPassName()
	{
		return getPassName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.passName</code> attribute. 
	 * @param value the passName
	 */
	public void setPassName(final SessionContext ctx, final RailPass value)
	{
		setProperty(ctx, PASSNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.passName</code> attribute. 
	 * @param value the passName
	 */
	public void setPassName(final RailPass value)
	{
		setPassName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.ticketType</code> attribute.
	 * @return the ticketType
	 */
	public EnumerationValue getTicketType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TICKETTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.ticketType</code> attribute.
	 * @return the ticketType
	 */
	public EnumerationValue getTicketType()
	{
		return getTicketType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.ticketType</code> attribute. 
	 * @param value the ticketType
	 */
	public void setTicketType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TICKETTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.ticketType</code> attribute. 
	 * @param value the ticketType
	 */
	public void setTicketType(final EnumerationValue value)
	{
		setTicketType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.train</code> attribute.
	 * @return the train
	 */
	public Train getTrain(final SessionContext ctx)
	{
		return (Train)getProperty( ctx, TRAIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.train</code> attribute.
	 * @return the train
	 */
	public Train getTrain()
	{
		return getTrain( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.train</code> attribute. 
	 * @param value the train
	 */
	public void setTrain(final SessionContext ctx, final Train value)
	{
		setProperty(ctx, TRAIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.train</code> attribute. 
	 * @param value the train
	 */
	public void setTrain(final Train value)
	{
		setTrain( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.trainCategory</code> attribute.
	 * @return the trainCategory
	 */
	public EnumerationValue getTrainCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRAINCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RailProductInfo.trainCategory</code> attribute.
	 * @return the trainCategory
	 */
	public EnumerationValue getTrainCategory()
	{
		return getTrainCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.trainCategory</code> attribute. 
	 * @param value the trainCategory
	 */
	public void setTrainCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRAINCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RailProductInfo.trainCategory</code> attribute. 
	 * @param value the trainCategory
	 */
	public void setTrainCategory(final EnumerationValue value)
	{
		setTrainCategory( getSession().getSessionContext(), value );
	}
	
}
