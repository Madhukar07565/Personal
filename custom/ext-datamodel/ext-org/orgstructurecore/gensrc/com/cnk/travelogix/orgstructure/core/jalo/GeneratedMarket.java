/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.kyc.jalo.KYCRequirement;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.jalo.Market Market}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMarket extends AbstractOrganization
{
	/** Qualifier of the <code>Market.marketDateFormat</code> attribute **/
	public static final String MARKETDATEFORMAT = "marketDateFormat";
	/** Qualifier of the <code>Market.localCurrency</code> attribute **/
	public static final String LOCALCURRENCY = "localCurrency";
	/** Qualifier of the <code>Market.businessUnit</code> attribute **/
	public static final String BUSINESSUNIT = "businessUnit";
	/** Qualifier of the <code>Market.constituentCountries</code> attribute **/
	public static final String CONSTITUENTCOUNTRIES = "constituentCountries";
	/** Relation ordering override parameter constants for Market2CountryRel from ((orgstructurecore))*/
	protected static String MARKET2COUNTRYREL_SRC_ORDERED = "relation.Market2CountryRel.source.ordered";
	protected static String MARKET2COUNTRYREL_TGT_ORDERED = "relation.Market2CountryRel.target.ordered";
	/** Relation disable markmodifed parameter constants for Market2CountryRel from ((orgstructurecore))*/
	protected static String MARKET2COUNTRYREL_MARKMODIFIED = "relation.Market2CountryRel.markmodified";
	/** Qualifier of the <code>Market.kycDocuments</code> attribute **/
	public static final String KYCDOCUMENTS = "kycDocuments";
	/** Qualifier of the <code>Market.company</code> attribute **/
	public static final String COMPANY = "company";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BUSINESSUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMarket> BUSINESSUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedMarket>(
	OrgstructurecoreConstants.TC.MARKET,
	false,
	"businessUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n KYCDOCUMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<KYCRequirement> KYCDOCUMENTSHANDLER = new OneToManyHandler<KYCRequirement>(
	OrgstructurecoreConstants.TC.KYCREQUIREMENT,
	true,
	"market",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedMarket> COMPANYHANDLER = new BidirectionalOneToManyHandler<GeneratedMarket>(
	OrgstructurecoreConstants.TC.MARKET,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOrganization.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MARKETDATEFORMAT, AttributeMode.INITIAL);
		tmp.put(LOCALCURRENCY, AttributeMode.INITIAL);
		tmp.put(BUSINESSUNIT, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.businessUnit</code> attribute.
	 * @return the businessUnit
	 */
	public BusinessUnit getBusinessUnit(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BUSINESSUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.businessUnit</code> attribute.
	 * @return the businessUnit
	 */
	public BusinessUnit getBusinessUnit()
	{
		return getBusinessUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.businessUnit</code> attribute. 
	 * @param value the businessUnit
	 */
	public void setBusinessUnit(final SessionContext ctx, final BusinessUnit value)
	{
		BUSINESSUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.businessUnit</code> attribute. 
	 * @param value the businessUnit
	 */
	public void setBusinessUnit(final BusinessUnit value)
	{
		setBusinessUnit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		COMPANYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.constituentCountries</code> attribute.
	 * @return the constituentCountries
	 */
	public Set<Country> getConstituentCountries(final SessionContext ctx)
	{
		final List<Country> items = getLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			"Country",
			null,
			false,
			false
		);
		return new LinkedHashSet<Country>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.constituentCountries</code> attribute.
	 * @return the constituentCountries
	 */
	public Set<Country> getConstituentCountries()
	{
		return getConstituentCountries( getSession().getSessionContext() );
	}
	
	public long getConstituentCountriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			"Country",
			null
		);
	}
	
	public long getConstituentCountriesCount()
	{
		return getConstituentCountriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.constituentCountries</code> attribute. 
	 * @param value the constituentCountries
	 */
	public void setConstituentCountries(final SessionContext ctx, final Set<Country> value)
	{
		setLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MARKET2COUNTRYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.constituentCountries</code> attribute. 
	 * @param value the constituentCountries
	 */
	public void setConstituentCountries(final Set<Country> value)
	{
		setConstituentCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to constituentCountries. 
	 * @param value the item to add to constituentCountries
	 */
	public void addToConstituentCountries(final SessionContext ctx, final Country value)
	{
		addLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MARKET2COUNTRYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to constituentCountries. 
	 * @param value the item to add to constituentCountries
	 */
	public void addToConstituentCountries(final Country value)
	{
		addToConstituentCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from constituentCountries. 
	 * @param value the item to remove from constituentCountries
	 */
	public void removeFromConstituentCountries(final SessionContext ctx, final Country value)
	{
		removeLinkedItems( 
			ctx,
			false,
			OrgstructurecoreConstants.Relations.MARKET2COUNTRYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MARKET2COUNTRYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from constituentCountries. 
	 * @param value the item to remove from constituentCountries
	 */
	public void removeFromConstituentCountries(final Country value)
	{
		removeFromConstituentCountries( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BUSINESSUNITHANDLER.newInstance(ctx, allAttributes);
		COMPANYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.kycDocuments</code> attribute.
	 * @return the kycDocuments
	 */
	public Set<KYCRequirement> getKycDocuments(final SessionContext ctx)
	{
		return (Set<KYCRequirement>)KYCDOCUMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.kycDocuments</code> attribute.
	 * @return the kycDocuments
	 */
	public Set<KYCRequirement> getKycDocuments()
	{
		return getKycDocuments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.kycDocuments</code> attribute. 
	 * @param value the kycDocuments
	 */
	public void setKycDocuments(final SessionContext ctx, final Set<KYCRequirement> value)
	{
		KYCDOCUMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.kycDocuments</code> attribute. 
	 * @param value the kycDocuments
	 */
	public void setKycDocuments(final Set<KYCRequirement> value)
	{
		setKycDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycDocuments. 
	 * @param value the item to add to kycDocuments
	 */
	public void addToKycDocuments(final SessionContext ctx, final KYCRequirement value)
	{
		KYCDOCUMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycDocuments. 
	 * @param value the item to add to kycDocuments
	 */
	public void addToKycDocuments(final KYCRequirement value)
	{
		addToKycDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycDocuments. 
	 * @param value the item to remove from kycDocuments
	 */
	public void removeFromKycDocuments(final SessionContext ctx, final KYCRequirement value)
	{
		KYCDOCUMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycDocuments. 
	 * @param value the item to remove from kycDocuments
	 */
	public void removeFromKycDocuments(final KYCRequirement value)
	{
		removeFromKycDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.localCurrency</code> attribute.
	 * @return the localCurrency
	 */
	public Currency getLocalCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, LOCALCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.localCurrency</code> attribute.
	 * @return the localCurrency
	 */
	public Currency getLocalCurrency()
	{
		return getLocalCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.localCurrency</code> attribute. 
	 * @param value the localCurrency
	 */
	public void setLocalCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, LOCALCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.localCurrency</code> attribute. 
	 * @param value the localCurrency
	 */
	public void setLocalCurrency(final Currency value)
	{
		setLocalCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.marketDateFormat</code> attribute.
	 * @return the marketDateFormat
	 */
	public String getMarketDateFormat(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MARKETDATEFORMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Market.marketDateFormat</code> attribute.
	 * @return the marketDateFormat
	 */
	public String getMarketDateFormat()
	{
		return getMarketDateFormat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.marketDateFormat</code> attribute. 
	 * @param value the marketDateFormat
	 */
	public void setMarketDateFormat(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MARKETDATEFORMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Market.marketDateFormat</code> attribute. 
	 * @param value the marketDateFormat
	 */
	public void setMarketDateFormat(final String value)
	{
		setMarketDateFormat( getSession().getSessionContext(), value );
	}
	
}
