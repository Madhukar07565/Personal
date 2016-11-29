/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.AdditionalActivityInfo;
import com.cnk.travelogix.product.activity.masters.core.jalo.TeamMemberDetails;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.Participant Participant}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedParticipant extends GenericItem
{
	/** Qualifier of the <code>Participant.sportsName</code> attribute **/
	public static final String SPORTSNAME = "sportsName";
	/** Qualifier of the <code>Participant.teamName</code> attribute **/
	public static final String TEAMNAME = "teamName";
	/** Qualifier of the <code>Participant.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>Participant.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>Participant.teamRanking</code> attribute **/
	public static final String TEAMRANKING = "teamRanking";
	/** Qualifier of the <code>Participant.flag</code> attribute **/
	public static final String FLAG = "flag";
	/** Qualifier of the <code>Participant.teamMemberDetails</code> attribute **/
	public static final String TEAMMEMBERDETAILS = "teamMemberDetails";
	/** Qualifier of the <code>Participant.additionalActivityInfoParticipant</code> attribute **/
	public static final String ADDITIONALACTIVITYINFOPARTICIPANT = "additionalActivityInfoParticipant";
	/**
	* {@link OneToManyHandler} for handling 1:n TEAMMEMBERDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TeamMemberDetails> TEAMMEMBERDETAILSHANDLER = new OneToManyHandler<TeamMemberDetails>(
	ActivityproductmasterscoreConstants.TC.TEAMMEMBERDETAILS,
	false,
	"participant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADDITIONALACTIVITYINFOPARTICIPANT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedParticipant> ADDITIONALACTIVITYINFOPARTICIPANTHANDLER = new BidirectionalOneToManyHandler<GeneratedParticipant>(
	ActivityproductmasterscoreConstants.TC.PARTICIPANT,
	false,
	"additionalActivityInfoParticipant",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SPORTSNAME, AttributeMode.INITIAL);
		tmp.put(TEAMNAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(TEAMRANKING, AttributeMode.INITIAL);
		tmp.put(FLAG, AttributeMode.INITIAL);
		tmp.put(ADDITIONALACTIVITYINFOPARTICIPANT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.additionalActivityInfoParticipant</code> attribute.
	 * @return the additionalActivityInfoParticipant
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoParticipant(final SessionContext ctx)
	{
		return (AdditionalActivityInfo)getProperty( ctx, ADDITIONALACTIVITYINFOPARTICIPANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.additionalActivityInfoParticipant</code> attribute.
	 * @return the additionalActivityInfoParticipant
	 */
	public AdditionalActivityInfo getAdditionalActivityInfoParticipant()
	{
		return getAdditionalActivityInfoParticipant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.additionalActivityInfoParticipant</code> attribute. 
	 * @param value the additionalActivityInfoParticipant
	 */
	public void setAdditionalActivityInfoParticipant(final SessionContext ctx, final AdditionalActivityInfo value)
	{
		ADDITIONALACTIVITYINFOPARTICIPANTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.additionalActivityInfoParticipant</code> attribute. 
	 * @param value the additionalActivityInfoParticipant
	 */
	public void setAdditionalActivityInfoParticipant(final AdditionalActivityInfo value)
	{
		setAdditionalActivityInfoParticipant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.country</code> attribute.
	 * @return the country - Country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.country</code> attribute. 
	 * @param value the country - Country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADDITIONALACTIVITYINFOPARTICIPANTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.description</code> attribute.
	 * @return the description - description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.description</code> attribute.
	 * @return the description - description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.description</code> attribute. 
	 * @param value the description - description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.description</code> attribute. 
	 * @param value the description - description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.flag</code> attribute.
	 * @return the flag - Flag media
	 */
	public Media getFlag(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, FLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.flag</code> attribute.
	 * @return the flag - Flag media
	 */
	public Media getFlag()
	{
		return getFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.flag</code> attribute. 
	 * @param value the flag - Flag media
	 */
	public void setFlag(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, FLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.flag</code> attribute. 
	 * @param value the flag - Flag media
	 */
	public void setFlag(final Media value)
	{
		setFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.sportsName</code> attribute.
	 * @return the sportsName - SportsName
	 */
	public String getSportsName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SPORTSNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.sportsName</code> attribute.
	 * @return the sportsName - SportsName
	 */
	public String getSportsName()
	{
		return getSportsName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.sportsName</code> attribute. 
	 * @param value the sportsName - SportsName
	 */
	public void setSportsName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SPORTSNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.sportsName</code> attribute. 
	 * @param value the sportsName - SportsName
	 */
	public void setSportsName(final String value)
	{
		setSportsName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.teamMemberDetails</code> attribute.
	 * @return the teamMemberDetails
	 */
	public Collection<TeamMemberDetails> getTeamMemberDetails(final SessionContext ctx)
	{
		return TEAMMEMBERDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.teamMemberDetails</code> attribute.
	 * @return the teamMemberDetails
	 */
	public Collection<TeamMemberDetails> getTeamMemberDetails()
	{
		return getTeamMemberDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.teamMemberDetails</code> attribute. 
	 * @param value the teamMemberDetails
	 */
	public void setTeamMemberDetails(final SessionContext ctx, final Collection<TeamMemberDetails> value)
	{
		TEAMMEMBERDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.teamMemberDetails</code> attribute. 
	 * @param value the teamMemberDetails
	 */
	public void setTeamMemberDetails(final Collection<TeamMemberDetails> value)
	{
		setTeamMemberDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to teamMemberDetails. 
	 * @param value the item to add to teamMemberDetails
	 */
	public void addToTeamMemberDetails(final SessionContext ctx, final TeamMemberDetails value)
	{
		TEAMMEMBERDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to teamMemberDetails. 
	 * @param value the item to add to teamMemberDetails
	 */
	public void addToTeamMemberDetails(final TeamMemberDetails value)
	{
		addToTeamMemberDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from teamMemberDetails. 
	 * @param value the item to remove from teamMemberDetails
	 */
	public void removeFromTeamMemberDetails(final SessionContext ctx, final TeamMemberDetails value)
	{
		TEAMMEMBERDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from teamMemberDetails. 
	 * @param value the item to remove from teamMemberDetails
	 */
	public void removeFromTeamMemberDetails(final TeamMemberDetails value)
	{
		removeFromTeamMemberDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.teamName</code> attribute.
	 * @return the teamName - teamName
	 */
	public String getTeamName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEAMNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.teamName</code> attribute.
	 * @return the teamName - teamName
	 */
	public String getTeamName()
	{
		return getTeamName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.teamName</code> attribute. 
	 * @param value the teamName - teamName
	 */
	public void setTeamName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEAMNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.teamName</code> attribute. 
	 * @param value the teamName - teamName
	 */
	public void setTeamName(final String value)
	{
		setTeamName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.teamRanking</code> attribute.
	 * @return the teamRanking - teamRanking
	 */
	public String getTeamRanking(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEAMRANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Participant.teamRanking</code> attribute.
	 * @return the teamRanking - teamRanking
	 */
	public String getTeamRanking()
	{
		return getTeamRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.teamRanking</code> attribute. 
	 * @param value the teamRanking - teamRanking
	 */
	public void setTeamRanking(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEAMRANKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Participant.teamRanking</code> attribute. 
	 * @param value the teamRanking - teamRanking
	 */
	public void setTeamRanking(final String value)
	{
		setTeamRanking( getSession().getSessionContext(), value );
	}
	
}
