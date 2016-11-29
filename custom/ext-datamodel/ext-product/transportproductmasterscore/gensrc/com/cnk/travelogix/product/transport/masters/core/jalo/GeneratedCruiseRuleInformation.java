/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.product.common.core.jalo.Deck;
import com.cnk.travelogix.product.common.core.jalo.Ship;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.CruiseRuleInformation CruiseRuleInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseRuleInformation extends GenericItem
{
	/** Qualifier of the <code>CruiseRuleInformation.ruleName</code> attribute **/
	public static final String RULENAME = "ruleName";
	/** Qualifier of the <code>CruiseRuleInformation.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>CruiseRuleInformation.ruleInformationFor</code> attribute **/
	public static final String RULEINFORMATIONFOR = "ruleInformationFor";
	/** Qualifier of the <code>CruiseRuleInformation.deck</code> attribute **/
	public static final String DECK = "deck";
	/** Qualifier of the <code>CruiseRuleInformation.cabin</code> attribute **/
	public static final String CABIN = "cabin";
	/** Qualifier of the <code>CruiseRuleInformation.ship</code> attribute **/
	public static final String SHIP = "ship";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SHIP's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCruiseRuleInformation> SHIPHANDLER = new BidirectionalOneToManyHandler<GeneratedCruiseRuleInformation>(
	TransportproductmasterscoreConstants.TC.CRUISERULEINFORMATION,
	false,
	"ship",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RULENAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(RULEINFORMATIONFOR, AttributeMode.INITIAL);
		tmp.put(DECK, AttributeMode.INITIAL);
		tmp.put(CABIN, AttributeMode.INITIAL);
		tmp.put(SHIP, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.cabin</code> attribute.
	 * @return the cabin - Cabin
	 */
	public Cabin getCabin(final SessionContext ctx)
	{
		return (Cabin)getProperty( ctx, CABIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.cabin</code> attribute.
	 * @return the cabin - Cabin
	 */
	public Cabin getCabin()
	{
		return getCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.cabin</code> attribute. 
	 * @param value the cabin - Cabin
	 */
	public void setCabin(final SessionContext ctx, final Cabin value)
	{
		setProperty(ctx, CABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.cabin</code> attribute. 
	 * @param value the cabin - Cabin
	 */
	public void setCabin(final Cabin value)
	{
		setCabin( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SHIPHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.deck</code> attribute.
	 * @return the deck - Deck
	 */
	public Deck getDeck(final SessionContext ctx)
	{
		return (Deck)getProperty( ctx, DECK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.deck</code> attribute.
	 * @return the deck - Deck
	 */
	public Deck getDeck()
	{
		return getDeck( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.deck</code> attribute. 
	 * @param value the deck - Deck
	 */
	public void setDeck(final SessionContext ctx, final Deck value)
	{
		setProperty(ctx, DECK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.deck</code> attribute. 
	 * @param value the deck - Deck
	 */
	public void setDeck(final Deck value)
	{
		setDeck( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseRuleInformation.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseRuleInformation.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.ruleInformationFor</code> attribute.
	 * @return the ruleInformationFor - Rule Information For
	 */
	public EnumerationValue getRuleInformationFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RULEINFORMATIONFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.ruleInformationFor</code> attribute.
	 * @return the ruleInformationFor - Rule Information For
	 */
	public EnumerationValue getRuleInformationFor()
	{
		return getRuleInformationFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.ruleInformationFor</code> attribute. 
	 * @param value the ruleInformationFor - Rule Information For
	 */
	public void setRuleInformationFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RULEINFORMATIONFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.ruleInformationFor</code> attribute. 
	 * @param value the ruleInformationFor - Rule Information For
	 */
	public void setRuleInformationFor(final EnumerationValue value)
	{
		setRuleInformationFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.ruleName</code> attribute.
	 * @return the ruleName - Rule Name
	 */
	public String getRuleName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RULENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.ruleName</code> attribute.
	 * @return the ruleName - Rule Name
	 */
	public String getRuleName()
	{
		return getRuleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.ruleName</code> attribute. 
	 * @param value the ruleName - Rule Name
	 */
	public void setRuleName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RULENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.ruleName</code> attribute. 
	 * @param value the ruleName - Rule Name
	 */
	public void setRuleName(final String value)
	{
		setRuleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.ship</code> attribute.
	 * @return the ship
	 */
	public Ship getShip(final SessionContext ctx)
	{
		return (Ship)getProperty( ctx, SHIP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRuleInformation.ship</code> attribute.
	 * @return the ship
	 */
	public Ship getShip()
	{
		return getShip( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final SessionContext ctx, final Ship value)
	{
		SHIPHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRuleInformation.ship</code> attribute. 
	 * @param value the ship
	 */
	public void setShip(final Ship value)
	{
		setShip( getSession().getSessionContext(), value );
	}
	
}
