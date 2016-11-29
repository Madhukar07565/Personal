/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.Participant;
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
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.TeamMemberDetails TeamMemberDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTeamMemberDetails extends GenericItem
{
	/** Qualifier of the <code>TeamMemberDetails.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>TeamMemberDetails.age</code> attribute **/
	public static final String AGE = "age";
	/** Qualifier of the <code>TeamMemberDetails.height</code> attribute **/
	public static final String HEIGHT = "height";
	/** Qualifier of the <code>TeamMemberDetails.heightUnit</code> attribute **/
	public static final String HEIGHTUNIT = "heightUnit";
	/** Qualifier of the <code>TeamMemberDetails.weight</code> attribute **/
	public static final String WEIGHT = "weight";
	/** Qualifier of the <code>TeamMemberDetails.weightUnit</code> attribute **/
	public static final String WEIGHTUNIT = "weightUnit";
	/** Qualifier of the <code>TeamMemberDetails.ranking</code> attribute **/
	public static final String RANKING = "ranking";
	/** Qualifier of the <code>TeamMemberDetails.position</code> attribute **/
	public static final String POSITION = "position";
	/** Qualifier of the <code>TeamMemberDetails.teamMemberDesc</code> attribute **/
	public static final String TEAMMEMBERDESC = "teamMemberDesc";
	/** Qualifier of the <code>TeamMemberDetails.participant</code> attribute **/
	public static final String PARTICIPANT = "participant";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PARTICIPANT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTeamMemberDetails> PARTICIPANTHANDLER = new BidirectionalOneToManyHandler<GeneratedTeamMemberDetails>(
	ActivityproductmasterscoreConstants.TC.TEAMMEMBERDETAILS,
	false,
	"participant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(AGE, AttributeMode.INITIAL);
		tmp.put(HEIGHT, AttributeMode.INITIAL);
		tmp.put(HEIGHTUNIT, AttributeMode.INITIAL);
		tmp.put(WEIGHT, AttributeMode.INITIAL);
		tmp.put(WEIGHTUNIT, AttributeMode.INITIAL);
		tmp.put(RANKING, AttributeMode.INITIAL);
		tmp.put(POSITION, AttributeMode.INITIAL);
		tmp.put(TEAMMEMBERDESC, AttributeMode.INITIAL);
		tmp.put(PARTICIPANT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.age</code> attribute.
	 * @return the age - Team member age
	 */
	public String getAge(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.age</code> attribute.
	 * @return the age - Team member age
	 */
	public String getAge()
	{
		return getAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.age</code> attribute. 
	 * @param value the age - Team member age
	 */
	public void setAge(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.age</code> attribute. 
	 * @param value the age - Team member age
	 */
	public void setAge(final String value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PARTICIPANTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.height</code> attribute.
	 * @return the height - Team member height
	 */
	public String getHeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.height</code> attribute.
	 * @return the height - Team member height
	 */
	public String getHeight()
	{
		return getHeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.height</code> attribute. 
	 * @param value the height - Team member height
	 */
	public void setHeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.height</code> attribute. 
	 * @param value the height - Team member height
	 */
	public void setHeight(final String value)
	{
		setHeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.heightUnit</code> attribute.
	 * @return the heightUnit - Height unit
	 */
	public EnumerationValue getHeightUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, HEIGHTUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.heightUnit</code> attribute.
	 * @return the heightUnit - Height unit
	 */
	public EnumerationValue getHeightUnit()
	{
		return getHeightUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.heightUnit</code> attribute. 
	 * @param value the heightUnit - Height unit
	 */
	public void setHeightUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, HEIGHTUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.heightUnit</code> attribute. 
	 * @param value the heightUnit - Height unit
	 */
	public void setHeightUnit(final EnumerationValue value)
	{
		setHeightUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.name</code> attribute.
	 * @return the name - Team member name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.name</code> attribute.
	 * @return the name - Team member name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.name</code> attribute. 
	 * @param value the name - Team member name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.name</code> attribute. 
	 * @param value the name - Team member name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.participant</code> attribute.
	 * @return the participant
	 */
	public Participant getParticipant(final SessionContext ctx)
	{
		return (Participant)getProperty( ctx, PARTICIPANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.participant</code> attribute.
	 * @return the participant
	 */
	public Participant getParticipant()
	{
		return getParticipant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.participant</code> attribute. 
	 * @param value the participant
	 */
	public void setParticipant(final SessionContext ctx, final Participant value)
	{
		PARTICIPANTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.participant</code> attribute. 
	 * @param value the participant
	 */
	public void setParticipant(final Participant value)
	{
		setParticipant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.position</code> attribute.
	 * @return the position - Team member position
	 */
	public String getPosition(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POSITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.position</code> attribute.
	 * @return the position - Team member position
	 */
	public String getPosition()
	{
		return getPosition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.position</code> attribute. 
	 * @param value the position - Team member position
	 */
	public void setPosition(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POSITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.position</code> attribute. 
	 * @param value the position - Team member position
	 */
	public void setPosition(final String value)
	{
		setPosition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.ranking</code> attribute.
	 * @return the ranking - Team member rank
	 */
	public String getRanking(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.ranking</code> attribute.
	 * @return the ranking - Team member rank
	 */
	public String getRanking()
	{
		return getRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.ranking</code> attribute. 
	 * @param value the ranking - Team member rank
	 */
	public void setRanking(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RANKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.ranking</code> attribute. 
	 * @param value the ranking - Team member rank
	 */
	public void setRanking(final String value)
	{
		setRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.teamMemberDesc</code> attribute.
	 * @return the teamMemberDesc - Team member description
	 */
	public String getTeamMemberDesc(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEAMMEMBERDESC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.teamMemberDesc</code> attribute.
	 * @return the teamMemberDesc - Team member description
	 */
	public String getTeamMemberDesc()
	{
		return getTeamMemberDesc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.teamMemberDesc</code> attribute. 
	 * @param value the teamMemberDesc - Team member description
	 */
	public void setTeamMemberDesc(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEAMMEMBERDESC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.teamMemberDesc</code> attribute. 
	 * @param value the teamMemberDesc - Team member description
	 */
	public void setTeamMemberDesc(final String value)
	{
		setTeamMemberDesc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.weight</code> attribute.
	 * @return the weight - Team member weight
	 */
	public String getWeight(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.weight</code> attribute.
	 * @return the weight - Team member weight
	 */
	public String getWeight()
	{
		return getWeight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.weight</code> attribute. 
	 * @param value the weight - Team member weight
	 */
	public void setWeight(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.weight</code> attribute. 
	 * @param value the weight - Team member weight
	 */
	public void setWeight(final String value)
	{
		setWeight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.weightUnit</code> attribute.
	 * @return the weightUnit - Weight Unit
	 */
	public EnumerationValue getWeightUnit(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WEIGHTUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TeamMemberDetails.weightUnit</code> attribute.
	 * @return the weightUnit - Weight Unit
	 */
	public EnumerationValue getWeightUnit()
	{
		return getWeightUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.weightUnit</code> attribute. 
	 * @param value the weightUnit - Weight Unit
	 */
	public void setWeightUnit(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WEIGHTUNIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TeamMemberDetails.weightUnit</code> attribute. 
	 * @param value the weightUnit - Weight Unit
	 */
	public void setWeightUnit(final EnumerationValue value)
	{
		setWeightUnit( getSession().getSessionContext(), value );
	}
	
}
