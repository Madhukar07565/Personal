/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import com.cnk.travelogix.orgstructure.core.jalo.StrategicBusinessUnit;
import com.cnk.travelogix.orgstructure.core.sales.jalo.Division;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesOffice;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.CompanyDetails CompanyDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyDetails extends GenericItem
{
	/** Qualifier of the <code>CompanyDetails.sbu</code> attribute **/
	public static final String SBU = "sbu";
	/** Qualifier of the <code>CompanyDetails.bu</code> attribute **/
	public static final String BU = "bu";
	/** Qualifier of the <code>CompanyDetails.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>CompanyDetails.saleOffice</code> attribute **/
	public static final String SALEOFFICE = "saleOffice";
	/** Qualifier of the <code>CompanyDetails.companyMarket</code> attribute **/
	public static final String COMPANYMARKET = "companyMarket";
	/** Qualifier of the <code>CompanyDetails.sapCampaign</code> attribute **/
	public static final String SAPCAMPAIGN = "sapCampaign";
	/** Qualifier of the <code>CompanyDetails.companyCompanyDetails</code> attribute **/
	public static final String COMPANYCOMPANYDETAILS = "companyCompanyDetails";
	/** Relation ordering override parameter constants for CompanyOffers2CompanyDetails from ((clientcore))*/
	protected static String COMPANYOFFERS2COMPANYDETAILS_SRC_ORDERED = "relation.CompanyOffers2CompanyDetails.source.ordered";
	protected static String COMPANYOFFERS2COMPANYDETAILS_TGT_ORDERED = "relation.CompanyOffers2CompanyDetails.target.ordered";
	/** Relation disable markmodifed parameter constants for CompanyOffers2CompanyDetails from ((clientcore))*/
	protected static String COMPANYOFFERS2COMPANYDETAILS_MARKMODIFIED = "relation.CompanyOffers2CompanyDetails.markmodified";
	/** Qualifier of the <code>CompanyDetails.deactivateOffersCompany</code> attribute **/
	public static final String DEACTIVATEOFFERSCOMPANY = "deactivateOffersCompany";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEACTIVATEOFFERSCOMPANY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCompanyDetails> DEACTIVATEOFFERSCOMPANYHANDLER = new BidirectionalOneToManyHandler<GeneratedCompanyDetails>(
	ClientcoreConstants.TC.COMPANYDETAILS,
	false,
	"deactivateOffersCompany",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SBU, AttributeMode.INITIAL);
		tmp.put(BU, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(SALEOFFICE, AttributeMode.INITIAL);
		tmp.put(COMPANYMARKET, AttributeMode.INITIAL);
		tmp.put(SAPCAMPAIGN, AttributeMode.INITIAL);
		tmp.put(DEACTIVATEOFFERSCOMPANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.bu</code> attribute.
	 * @return the bu
	 */
	public BusinessUnit getBu(final SessionContext ctx)
	{
		return (BusinessUnit)getProperty( ctx, BU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.bu</code> attribute.
	 * @return the bu
	 */
	public BusinessUnit getBu()
	{
		return getBu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.bu</code> attribute. 
	 * @param value the bu
	 */
	public void setBu(final SessionContext ctx, final BusinessUnit value)
	{
		setProperty(ctx, BU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.bu</code> attribute. 
	 * @param value the bu
	 */
	public void setBu(final BusinessUnit value)
	{
		setBu( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.companyCompanyDetails</code> attribute.
	 * @return the companyCompanyDetails
	 */
	public Collection<CompanyOffers> getCompanyCompanyDetails(final SessionContext ctx)
	{
		final List<CompanyOffers> items = getLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			"CompanyOffers",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.companyCompanyDetails</code> attribute.
	 * @return the companyCompanyDetails
	 */
	public Collection<CompanyOffers> getCompanyCompanyDetails()
	{
		return getCompanyCompanyDetails( getSession().getSessionContext() );
	}
	
	public long getCompanyCompanyDetailsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			"CompanyOffers",
			null
		);
	}
	
	public long getCompanyCompanyDetailsCount()
	{
		return getCompanyCompanyDetailsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.companyCompanyDetails</code> attribute. 
	 * @param value the companyCompanyDetails
	 */
	public void setCompanyCompanyDetails(final SessionContext ctx, final Collection<CompanyOffers> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.companyCompanyDetails</code> attribute. 
	 * @param value the companyCompanyDetails
	 */
	public void setCompanyCompanyDetails(final Collection<CompanyOffers> value)
	{
		setCompanyCompanyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyCompanyDetails. 
	 * @param value the item to add to companyCompanyDetails
	 */
	public void addToCompanyCompanyDetails(final SessionContext ctx, final CompanyOffers value)
	{
		addLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyCompanyDetails. 
	 * @param value the item to add to companyCompanyDetails
	 */
	public void addToCompanyCompanyDetails(final CompanyOffers value)
	{
		addToCompanyCompanyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyCompanyDetails. 
	 * @param value the item to remove from companyCompanyDetails
	 */
	public void removeFromCompanyCompanyDetails(final SessionContext ctx, final CompanyOffers value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2COMPANYDETAILS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2COMPANYDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyCompanyDetails. 
	 * @param value the item to remove from companyCompanyDetails
	 */
	public void removeFromCompanyCompanyDetails(final CompanyOffers value)
	{
		removeFromCompanyCompanyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, COMPANYMARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.companyMarket</code> attribute.
	 * @return the companyMarket
	 */
	public Market getCompanyMarket()
	{
		return getCompanyMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final SessionContext ctx, final Market value)
	{
		setProperty(ctx, COMPANYMARKET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.companyMarket</code> attribute. 
	 * @param value the companyMarket
	 */
	public void setCompanyMarket(final Market value)
	{
		setCompanyMarket( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DEACTIVATEOFFERSCOMPANYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.deactivateOffersCompany</code> attribute.
	 * @return the deactivateOffersCompany
	 */
	public CompanyOffers getDeactivateOffersCompany(final SessionContext ctx)
	{
		return (CompanyOffers)getProperty( ctx, DEACTIVATEOFFERSCOMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.deactivateOffersCompany</code> attribute.
	 * @return the deactivateOffersCompany
	 */
	public CompanyOffers getDeactivateOffersCompany()
	{
		return getDeactivateOffersCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.deactivateOffersCompany</code> attribute. 
	 * @param value the deactivateOffersCompany
	 */
	public void setDeactivateOffersCompany(final SessionContext ctx, final CompanyOffers value)
	{
		DEACTIVATEOFFERSCOMPANYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.deactivateOffersCompany</code> attribute. 
	 * @param value the deactivateOffersCompany
	 */
	public void setDeactivateOffersCompany(final CompanyOffers value)
	{
		setDeactivateOffersCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.division</code> attribute.
	 * @return the division
	 */
	public Division getDivision(final SessionContext ctx)
	{
		return (Division)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.division</code> attribute.
	 * @return the division
	 */
	public Division getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final Division value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final Division value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.saleOffice</code> attribute.
	 * @return the saleOffice
	 */
	public SalesOffice getSaleOffice(final SessionContext ctx)
	{
		return (SalesOffice)getProperty( ctx, SALEOFFICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.saleOffice</code> attribute.
	 * @return the saleOffice
	 */
	public SalesOffice getSaleOffice()
	{
		return getSaleOffice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.saleOffice</code> attribute. 
	 * @param value the saleOffice
	 */
	public void setSaleOffice(final SessionContext ctx, final SalesOffice value)
	{
		setProperty(ctx, SALEOFFICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.saleOffice</code> attribute. 
	 * @param value the saleOffice
	 */
	public void setSaleOffice(final SalesOffice value)
	{
		setSaleOffice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.sapCampaign</code> attribute.
	 * @return the sapCampaign
	 */
	public String getSapCampaign(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SAPCAMPAIGN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.sapCampaign</code> attribute.
	 * @return the sapCampaign
	 */
	public String getSapCampaign()
	{
		return getSapCampaign( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.sapCampaign</code> attribute. 
	 * @param value the sapCampaign
	 */
	public void setSapCampaign(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SAPCAMPAIGN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.sapCampaign</code> attribute. 
	 * @param value the sapCampaign
	 */
	public void setSapCampaign(final String value)
	{
		setSapCampaign( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.sbu</code> attribute.
	 * @return the sbu
	 */
	public StrategicBusinessUnit getSbu(final SessionContext ctx)
	{
		return (StrategicBusinessUnit)getProperty( ctx, SBU);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyDetails.sbu</code> attribute.
	 * @return the sbu
	 */
	public StrategicBusinessUnit getSbu()
	{
		return getSbu( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.sbu</code> attribute. 
	 * @param value the sbu
	 */
	public void setSbu(final SessionContext ctx, final StrategicBusinessUnit value)
	{
		setProperty(ctx, SBU,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyDetails.sbu</code> attribute. 
	 * @param value the sbu
	 */
	public void setSbu(final StrategicBusinessUnit value)
	{
		setSbu( getSession().getSessionContext(), value );
	}
	
}
