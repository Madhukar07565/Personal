/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.DayOfOperation;
import com.cnk.travelogix.product.activity.masters.core.jalo.Inclusion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.Entertainment Entertainment}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEntertainment extends GenericItem
{
	/** Qualifier of the <code>Entertainment.entertainmentType</code> attribute **/
	public static final String ENTERTAINMENTTYPE = "entertainmentType";
	/** Qualifier of the <code>Entertainment.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Entertainment.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Entertainment.fromToDate</code> attribute **/
	public static final String FROMTODATE = "fromToDate";
	/** Qualifier of the <code>Entertainment.media</code> attribute **/
	public static final String MEDIA = "media";
	/** Qualifier of the <code>Entertainment.inclusionEntertainments</code> attribute **/
	public static final String INCLUSIONENTERTAINMENTS = "inclusionEntertainments";
	/** Qualifier of the <code>Entertainment.entertainmentCastAndCrew</code> attribute **/
	public static final String ENTERTAINMENTCASTANDCREW = "entertainmentCastAndCrew";
	/** Qualifier of the <code>Entertainment.entertainmentOperation</code> attribute **/
	public static final String ENTERTAINMENTOPERATION = "entertainmentOperation";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INCLUSIONENTERTAINMENTS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedEntertainment> INCLUSIONENTERTAINMENTSHANDLER = new BidirectionalOneToManyHandler<GeneratedEntertainment>(
	ActivityproductmasterscoreConstants.TC.ENTERTAINMENT,
	false,
	"inclusionEntertainments",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ENTERTAINMENTCASTANDCREW's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AdditionalActivityInfo> ENTERTAINMENTCASTANDCREWHANDLER = new OneToManyHandler<AdditionalActivityInfo>(
	ActivityproductmasterscoreConstants.TC.ADDITIONALACTIVITYINFO,
	false,
	"entertainment",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ENTERTAINMENTOPERATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DayOfOperation> ENTERTAINMENTOPERATIONHANDLER = new OneToManyHandler<DayOfOperation>(
	ActivityproductmasterscoreConstants.TC.DAYOFOPERATION,
	false,
	"entertainment",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ENTERTAINMENTTYPE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(FROMTODATE, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		tmp.put(INCLUSIONENTERTAINMENTS, AttributeMode.INITIAL);
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
		INCLUSIONENTERTAINMENTSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.description</code> attribute.
	 * @return the description - Entertainment description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.description</code> attribute.
	 * @return the description - Entertainment description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.description</code> attribute. 
	 * @param value the description - Entertainment description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.description</code> attribute. 
	 * @param value the description - Entertainment description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.entertainmentCastAndCrew</code> attribute.
	 * @return the entertainmentCastAndCrew
	 */
	public Collection<AdditionalActivityInfo> getEntertainmentCastAndCrew(final SessionContext ctx)
	{
		return ENTERTAINMENTCASTANDCREWHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.entertainmentCastAndCrew</code> attribute.
	 * @return the entertainmentCastAndCrew
	 */
	public Collection<AdditionalActivityInfo> getEntertainmentCastAndCrew()
	{
		return getEntertainmentCastAndCrew( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.entertainmentCastAndCrew</code> attribute. 
	 * @param value the entertainmentCastAndCrew
	 */
	public void setEntertainmentCastAndCrew(final SessionContext ctx, final Collection<AdditionalActivityInfo> value)
	{
		ENTERTAINMENTCASTANDCREWHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.entertainmentCastAndCrew</code> attribute. 
	 * @param value the entertainmentCastAndCrew
	 */
	public void setEntertainmentCastAndCrew(final Collection<AdditionalActivityInfo> value)
	{
		setEntertainmentCastAndCrew( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entertainmentCastAndCrew. 
	 * @param value the item to add to entertainmentCastAndCrew
	 */
	public void addToEntertainmentCastAndCrew(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ENTERTAINMENTCASTANDCREWHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entertainmentCastAndCrew. 
	 * @param value the item to add to entertainmentCastAndCrew
	 */
	public void addToEntertainmentCastAndCrew(final AdditionalActivityInfo value)
	{
		addToEntertainmentCastAndCrew( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entertainmentCastAndCrew. 
	 * @param value the item to remove from entertainmentCastAndCrew
	 */
	public void removeFromEntertainmentCastAndCrew(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ENTERTAINMENTCASTANDCREWHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entertainmentCastAndCrew. 
	 * @param value the item to remove from entertainmentCastAndCrew
	 */
	public void removeFromEntertainmentCastAndCrew(final AdditionalActivityInfo value)
	{
		removeFromEntertainmentCastAndCrew( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.entertainmentOperation</code> attribute.
	 * @return the entertainmentOperation
	 */
	public Collection<DayOfOperation> getEntertainmentOperation(final SessionContext ctx)
	{
		return ENTERTAINMENTOPERATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.entertainmentOperation</code> attribute.
	 * @return the entertainmentOperation
	 */
	public Collection<DayOfOperation> getEntertainmentOperation()
	{
		return getEntertainmentOperation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.entertainmentOperation</code> attribute. 
	 * @param value the entertainmentOperation
	 */
	public void setEntertainmentOperation(final SessionContext ctx, final Collection<DayOfOperation> value)
	{
		ENTERTAINMENTOPERATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.entertainmentOperation</code> attribute. 
	 * @param value the entertainmentOperation
	 */
	public void setEntertainmentOperation(final Collection<DayOfOperation> value)
	{
		setEntertainmentOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entertainmentOperation. 
	 * @param value the item to add to entertainmentOperation
	 */
	public void addToEntertainmentOperation(final SessionContext ctx, final DayOfOperation value)
	{
		ENTERTAINMENTOPERATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to entertainmentOperation. 
	 * @param value the item to add to entertainmentOperation
	 */
	public void addToEntertainmentOperation(final DayOfOperation value)
	{
		addToEntertainmentOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entertainmentOperation. 
	 * @param value the item to remove from entertainmentOperation
	 */
	public void removeFromEntertainmentOperation(final SessionContext ctx, final DayOfOperation value)
	{
		ENTERTAINMENTOPERATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from entertainmentOperation. 
	 * @param value the item to remove from entertainmentOperation
	 */
	public void removeFromEntertainmentOperation(final DayOfOperation value)
	{
		removeFromEntertainmentOperation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.entertainmentType</code> attribute.
	 * @return the entertainmentType - Entertainment Type
	 */
	public EnumerationValue getEntertainmentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENTERTAINMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.entertainmentType</code> attribute.
	 * @return the entertainmentType - Entertainment Type
	 */
	public EnumerationValue getEntertainmentType()
	{
		return getEntertainmentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.entertainmentType</code> attribute. 
	 * @param value the entertainmentType - Entertainment Type
	 */
	public void setEntertainmentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENTERTAINMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.entertainmentType</code> attribute. 
	 * @param value the entertainmentType - Entertainment Type
	 */
	public void setEntertainmentType(final EnumerationValue value)
	{
		setEntertainmentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.fromToDate</code> attribute.
	 * @return the fromToDate - From date to date
	 */
	public StandardDateRange getFromToDate(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, FROMTODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.fromToDate</code> attribute.
	 * @return the fromToDate - From date to date
	 */
	public StandardDateRange getFromToDate()
	{
		return getFromToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.fromToDate</code> attribute. 
	 * @param value the fromToDate - From date to date
	 */
	public void setFromToDate(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, FROMTODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.fromToDate</code> attribute. 
	 * @param value the fromToDate - From date to date
	 */
	public void setFromToDate(final StandardDateRange value)
	{
		setFromToDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.inclusionEntertainments</code> attribute.
	 * @return the inclusionEntertainments
	 */
	public Inclusion getInclusionEntertainments(final SessionContext ctx)
	{
		return (Inclusion)getProperty( ctx, INCLUSIONENTERTAINMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.inclusionEntertainments</code> attribute.
	 * @return the inclusionEntertainments
	 */
	public Inclusion getInclusionEntertainments()
	{
		return getInclusionEntertainments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.inclusionEntertainments</code> attribute. 
	 * @param value the inclusionEntertainments
	 */
	public void setInclusionEntertainments(final SessionContext ctx, final Inclusion value)
	{
		INCLUSIONENTERTAINMENTSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.inclusionEntertainments</code> attribute. 
	 * @param value the inclusionEntertainments
	 */
	public void setInclusionEntertainments(final Inclusion value)
	{
		setInclusionEntertainments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.media</code> attribute.
	 * @return the media - Entertainment Media
	 */
	public Collection<Media> getMedia(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, MEDIA);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.media</code> attribute.
	 * @return the media - Entertainment Media
	 */
	public Collection<Media> getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.media</code> attribute. 
	 * @param value the media - Entertainment Media
	 */
	public void setMedia(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, MEDIA,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.media</code> attribute. 
	 * @param value the media - Entertainment Media
	 */
	public void setMedia(final Collection<Media> value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.name</code> attribute.
	 * @return the name - Entertainment name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Entertainment.name</code> attribute.
	 * @return the name - Entertainment name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.name</code> attribute. 
	 * @param value the name - Entertainment name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Entertainment.name</code> attribute. 
	 * @param value the name - Entertainment name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
