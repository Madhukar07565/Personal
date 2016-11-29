/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.clienttype.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.UserGroup;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.clienttype.jalo.TravelogixClientType TravelogixClientType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixClientType extends UserGroup
{
	/** Qualifier of the <code>TravelogixClientType.language</code> attribute **/
	public static final String LANGUAGE = "language";
	/** Qualifier of the <code>TravelogixClientType.defaultCurrency</code> attribute **/
	public static final String DEFAULTCURRENCY = "defaultCurrency";
	/** Qualifier of the <code>TravelogixClientType.transactional</code> attribute **/
	public static final String TRANSACTIONAL = "transactional";
	/** Qualifier of the <code>TravelogixClientType.clientCommercials</code> attribute **/
	public static final String CLIENTCOMMERCIALS = "clientCommercials";
	/** Qualifier of the <code>TravelogixClientType.settlement</code> attribute **/
	public static final String SETTLEMENT = "settlement";
	/** Qualifier of the <code>TravelogixClientType.activeClientCount</code> attribute **/
	public static final String ACTIVECLIENTCOUNT = "activeClientCount";
	/** Qualifier of the <code>TravelogixClientType.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>TravelogixClientType.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>TravelogixClientType.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>TravelogixClientType.companyMarkets</code> attribute **/
	public static final String COMPANYMARKETS = "companyMarkets";
	/** Relation ordering override parameter constants for TravelogixClientType2Market from ((clientcore))*/
	protected static String TRAVELOGIXCLIENTTYPE2MARKET_SRC_ORDERED = "relation.TravelogixClientType2Market.source.ordered";
	protected static String TRAVELOGIXCLIENTTYPE2MARKET_TGT_ORDERED = "relation.TravelogixClientType2Market.target.ordered";
	/** Relation disable markmodifed parameter constants for TravelogixClientType2Market from ((clientcore))*/
	protected static String TRAVELOGIXCLIENTTYPE2MARKET_MARKMODIFIED = "relation.TravelogixClientType2Market.markmodified";
	/** Qualifier of the <code>TravelogixClientType.transactionalCurrency</code> attribute **/
	public static final String TRANSACTIONALCURRENCY = "transactionalCurrency";
	/** Relation ordering override parameter constants for TravelogixClientType2Currency from ((clientcore))*/
	protected static String TRAVELOGIXCLIENTTYPE2CURRENCY_SRC_ORDERED = "relation.TravelogixClientType2Currency.source.ordered";
	protected static String TRAVELOGIXCLIENTTYPE2CURRENCY_TGT_ORDERED = "relation.TravelogixClientType2Currency.target.ordered";
	/** Relation disable markmodifed parameter constants for TravelogixClientType2Currency from ((clientcore))*/
	protected static String TRAVELOGIXCLIENTTYPE2CURRENCY_MARKMODIFIED = "relation.TravelogixClientType2Currency.markmodified";
	/** Qualifier of the <code>TravelogixClientType.pointOfSale</code> attribute **/
	public static final String POINTOFSALE = "pointOfSale";
	/**
	* {@link OneToManyHandler} for handling 1:n POINTOFSALE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DistributionChannel> POINTOFSALEHANDLER = new OneToManyHandler<DistributionChannel>(
	OrgstructurecoreConstants.TC.DISTRIBUTIONCHANNEL,
	false,
	"travelogixClientType",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(UserGroup.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LANGUAGE, AttributeMode.INITIAL);
		tmp.put(DEFAULTCURRENCY, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONAL, AttributeMode.INITIAL);
		tmp.put(CLIENTCOMMERCIALS, AttributeMode.INITIAL);
		tmp.put(SETTLEMENT, AttributeMode.INITIAL);
		tmp.put(ACTIVECLIENTCOUNT, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.activeClientCount</code> attribute.
	 * @return the activeClientCount
	 */
	public String getActiveClientCount(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ACTIVECLIENTCOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.activeClientCount</code> attribute.
	 * @return the activeClientCount
	 */
	public String getActiveClientCount()
	{
		return getActiveClientCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.activeClientCount</code> attribute. 
	 * @param value the activeClientCount
	 */
	public void setActiveClientCount(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ACTIVECLIENTCOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.activeClientCount</code> attribute. 
	 * @param value the activeClientCount
	 */
	public void setActiveClientCount(final String value)
	{
		setActiveClientCount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.clientCommercials</code> attribute.
	 * @return the clientCommercials
	 */
	public Boolean isClientCommercials(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CLIENTCOMMERCIALS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.clientCommercials</code> attribute.
	 * @return the clientCommercials
	 */
	public Boolean isClientCommercials()
	{
		return isClientCommercials( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.clientCommercials</code> attribute. 
	 * @return the clientCommercials
	 */
	public boolean isClientCommercialsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isClientCommercials( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.clientCommercials</code> attribute. 
	 * @return the clientCommercials
	 */
	public boolean isClientCommercialsAsPrimitive()
	{
		return isClientCommercialsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CLIENTCOMMERCIALS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final Boolean value)
	{
		setClientCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final SessionContext ctx, final boolean value)
	{
		setClientCommercials( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.clientCommercials</code> attribute. 
	 * @param value the clientCommercials
	 */
	public void setClientCommercials(final boolean value)
	{
		setClientCommercials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.companyMarkets</code> attribute.
	 * @return the companyMarkets
	 */
	public Set<Market> getCompanyMarkets(final SessionContext ctx)
	{
		final List<Market> items = getLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			"Market",
			null,
			false,
			false
		);
		return new LinkedHashSet<Market>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.companyMarkets</code> attribute.
	 * @return the companyMarkets
	 */
	public Set<Market> getCompanyMarkets()
	{
		return getCompanyMarkets( getSession().getSessionContext() );
	}
	
	public long getCompanyMarketsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			"Market",
			null
		);
	}
	
	public long getCompanyMarketsCount()
	{
		return getCompanyMarketsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.companyMarkets</code> attribute. 
	 * @param value the companyMarkets
	 */
	public void setCompanyMarkets(final SessionContext ctx, final Set<Market> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2MARKET_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.companyMarkets</code> attribute. 
	 * @param value the companyMarkets
	 */
	public void setCompanyMarkets(final Set<Market> value)
	{
		setCompanyMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyMarkets. 
	 * @param value the item to add to companyMarkets
	 */
	public void addToCompanyMarkets(final SessionContext ctx, final Market value)
	{
		addLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2MARKET_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyMarkets. 
	 * @param value the item to add to companyMarkets
	 */
	public void addToCompanyMarkets(final Market value)
	{
		addToCompanyMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyMarkets. 
	 * @param value the item to remove from companyMarkets
	 */
	public void removeFromCompanyMarkets(final SessionContext ctx, final Market value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2MARKET,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2MARKET_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyMarkets. 
	 * @param value the item to remove from companyMarkets
	 */
	public void removeFromCompanyMarkets(final Market value)
	{
		removeFromCompanyMarkets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.defaultCurrency</code> attribute.
	 * @return the defaultCurrency
	 */
	public Currency getDefaultCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, DEFAULTCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.defaultCurrency</code> attribute.
	 * @return the defaultCurrency
	 */
	public Currency getDefaultCurrency()
	{
		return getDefaultCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.defaultCurrency</code> attribute. 
	 * @param value the defaultCurrency
	 */
	public void setDefaultCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, DEFAULTCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.defaultCurrency</code> attribute. 
	 * @param value the defaultCurrency
	 */
	public void setDefaultCurrency(final Currency value)
	{
		setDefaultCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage(final SessionContext ctx)
	{
		return (Language)getProperty( ctx, LANGUAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.language</code> attribute.
	 * @return the language
	 */
	public Language getLanguage()
	{
		return getLanguage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final SessionContext ctx, final Language value)
	{
		setProperty(ctx, LANGUAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.language</code> attribute. 
	 * @param value the language
	 */
	public void setLanguage(final Language value)
	{
		setLanguage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Set<DistributionChannel> getPointOfSale(final SessionContext ctx)
	{
		return (Set<DistributionChannel>)POINTOFSALEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public Set<DistributionChannel> getPointOfSale()
	{
		return getPointOfSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final SessionContext ctx, final Set<DistributionChannel> value)
	{
		POINTOFSALEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final Set<DistributionChannel> value)
	{
		setPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final SessionContext ctx, final DistributionChannel value)
	{
		POINTOFSALEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to pointOfSale. 
	 * @param value the item to add to pointOfSale
	 */
	public void addToPointOfSale(final DistributionChannel value)
	{
		addToPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final SessionContext ctx, final DistributionChannel value)
	{
		POINTOFSALEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from pointOfSale. 
	 * @param value the item to remove from pointOfSale
	 */
	public void removeFromPointOfSale(final DistributionChannel value)
	{
		removeFromPointOfSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixClientType.getReason requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.reason</code> attribute. 
	 * @return the localized reason
	 */
	public Map<Language,String> getAllReason(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REASON,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.reason</code> attribute. 
	 * @return the localized reason
	 */
	public Map<Language,String> getAllReason()
	{
		return getAllReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixClientType.setReason requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setAllReason(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setAllReason(final Map<Language,String> value)
	{
		setAllReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixClientType.getRemarks requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.remarks</code> attribute. 
	 * @return the localized remarks
	 */
	public Map<Language,String> getAllRemarks(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,REMARKS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.remarks</code> attribute. 
	 * @return the localized remarks
	 */
	public Map<Language,String> getAllRemarks()
	{
		return getAllRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedTravelogixClientType.setRemarks requires a session language", 0 );
		}
		setLocalizedProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setAllRemarks(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setAllRemarks(final Map<Language,String> value)
	{
		setAllRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.settlement</code> attribute.
	 * @return the settlement
	 */
	public Boolean isSettlement(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.settlement</code> attribute.
	 * @return the settlement
	 */
	public Boolean isSettlement()
	{
		return isSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.settlement</code> attribute. 
	 * @return the settlement
	 */
	public boolean isSettlementAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSettlement( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.settlement</code> attribute. 
	 * @return the settlement
	 */
	public boolean isSettlementAsPrimitive()
	{
		return isSettlementAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final Boolean value)
	{
		setSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final SessionContext ctx, final boolean value)
	{
		setSettlement( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.settlement</code> attribute. 
	 * @param value the settlement
	 */
	public void setSettlement(final boolean value)
	{
		setSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.transactional</code> attribute.
	 * @return the transactional
	 */
	public Boolean isTransactional(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.transactional</code> attribute.
	 * @return the transactional
	 */
	public Boolean isTransactional()
	{
		return isTransactional( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.transactional</code> attribute. 
	 * @return the transactional
	 */
	public boolean isTransactionalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactional( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.transactional</code> attribute. 
	 * @return the transactional
	 */
	public boolean isTransactionalAsPrimitive()
	{
		return isTransactionalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final Boolean value)
	{
		setTransactional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final SessionContext ctx, final boolean value)
	{
		setTransactional( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final boolean value)
	{
		setTransactional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.transactionalCurrency</code> attribute.
	 * @return the transactionalCurrency
	 */
	public Set<Currency> getTransactionalCurrency(final SessionContext ctx)
	{
		final List<Currency> items = getLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			"Currency",
			null,
			false,
			false
		);
		return new LinkedHashSet<Currency>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixClientType.transactionalCurrency</code> attribute.
	 * @return the transactionalCurrency
	 */
	public Set<Currency> getTransactionalCurrency()
	{
		return getTransactionalCurrency( getSession().getSessionContext() );
	}
	
	public long getTransactionalCurrencyCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			"Currency",
			null
		);
	}
	
	public long getTransactionalCurrencyCount()
	{
		return getTransactionalCurrencyCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.transactionalCurrency</code> attribute. 
	 * @param value the transactionalCurrency
	 */
	public void setTransactionalCurrency(final SessionContext ctx, final Set<Currency> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2CURRENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixClientType.transactionalCurrency</code> attribute. 
	 * @param value the transactionalCurrency
	 */
	public void setTransactionalCurrency(final Set<Currency> value)
	{
		setTransactionalCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to transactionalCurrency. 
	 * @param value the item to add to transactionalCurrency
	 */
	public void addToTransactionalCurrency(final SessionContext ctx, final Currency value)
	{
		addLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2CURRENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to transactionalCurrency. 
	 * @param value the item to add to transactionalCurrency
	 */
	public void addToTransactionalCurrency(final Currency value)
	{
		addToTransactionalCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from transactionalCurrency. 
	 * @param value the item to remove from transactionalCurrency
	 */
	public void removeFromTransactionalCurrency(final SessionContext ctx, final Currency value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ClientcoreConstants.Relations.TRAVELOGIXCLIENTTYPE2CURRENCY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TRAVELOGIXCLIENTTYPE2CURRENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from transactionalCurrency. 
	 * @param value the item to remove from transactionalCurrency
	 */
	public void removeFromTransactionalCurrency(final Currency value)
	{
		removeFromTransactionalCurrency( getSession().getSessionContext(), value );
	}
	
}
