/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.ClientDetails ClientDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientDetails extends GenericItem
{
	/** Qualifier of the <code>ClientDetails.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>ClientDetails.clientCategory</code> attribute **/
	public static final String CLIENTCATEGORY = "clientCategory";
	/** Qualifier of the <code>ClientDetails.clientSubCategory</code> attribute **/
	public static final String CLIENTSUBCATEGORY = "clientSubCategory";
	/** Qualifier of the <code>ClientDetails.clientName</code> attribute **/
	public static final String CLIENTNAME = "clientName";
	/** Qualifier of the <code>ClientDetails.clientGroup</code> attribute **/
	public static final String CLIENTGROUP = "clientGroup";
	/** Qualifier of the <code>ClientDetails.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>ClientDetails.pointOfSale</code> attribute **/
	public static final String POINTOFSALE = "pointOfSale";
	/** Qualifier of the <code>ClientDetails.companyClientDetails</code> attribute **/
	public static final String COMPANYCLIENTDETAILS = "companyClientDetails";
	/** Relation ordering override parameter constants for CompanyOffers2ClientDetails from ((clientcore))*/
	protected static String COMPANYOFFERS2CLIENTDETAILS_SRC_ORDERED = "relation.CompanyOffers2ClientDetails.source.ordered";
	protected static String COMPANYOFFERS2CLIENTDETAILS_TGT_ORDERED = "relation.CompanyOffers2ClientDetails.target.ordered";
	/** Relation disable markmodifed parameter constants for CompanyOffers2ClientDetails from ((clientcore))*/
	protected static String COMPANYOFFERS2CLIENTDETAILS_MARKMODIFIED = "relation.CompanyOffers2ClientDetails.markmodified";
	/** Qualifier of the <code>ClientDetails.deactivateOffersClient</code> attribute **/
	public static final String DEACTIVATEOFFERSCLIENT = "deactivateOffersClient";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DEACTIVATEOFFERSCLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedClientDetails> DEACTIVATEOFFERSCLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedClientDetails>(
	ClientcoreConstants.TC.CLIENTDETAILS,
	false,
	"deactivateOffersClient",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(CLIENTCATEGORY, AttributeMode.INITIAL);
		tmp.put(CLIENTSUBCATEGORY, AttributeMode.INITIAL);
		tmp.put(CLIENTNAME, AttributeMode.INITIAL);
		tmp.put(CLIENTGROUP, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(POINTOFSALE, AttributeMode.INITIAL);
		tmp.put(DEACTIVATEOFFERSCLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientCategory</code> attribute.
	 * @return the clientCategory
	 */
	public EnumerationValue getClientCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientCategory</code> attribute.
	 * @return the clientCategory
	 */
	public EnumerationValue getClientCategory()
	{
		return getClientCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientCategory</code> attribute. 
	 * @param value the clientCategory
	 */
	public void setClientCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientCategory</code> attribute. 
	 * @param value the clientCategory
	 */
	public void setClientCategory(final EnumerationValue value)
	{
		setClientCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientGroup</code> attribute.
	 * @return the clientGroup
	 */
	public EnumerationValue getClientGroup(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientGroup</code> attribute.
	 * @return the clientGroup
	 */
	public EnumerationValue getClientGroup()
	{
		return getClientGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientGroup</code> attribute. 
	 * @param value the clientGroup
	 */
	public void setClientGroup(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientGroup</code> attribute. 
	 * @param value the clientGroup
	 */
	public void setClientGroup(final EnumerationValue value)
	{
		setClientGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientName</code> attribute.
	 * @return the clientName
	 */
	public EnumerationValue getClientName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientName</code> attribute.
	 * @return the clientName
	 */
	public EnumerationValue getClientName()
	{
		return getClientName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final EnumerationValue value)
	{
		setClientName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientSubCategory</code> attribute.
	 * @return the clientSubCategory
	 */
	public EnumerationValue getClientSubCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTSUBCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientSubCategory</code> attribute.
	 * @return the clientSubCategory
	 */
	public EnumerationValue getClientSubCategory()
	{
		return getClientSubCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientSubCategory</code> attribute. 
	 * @param value the clientSubCategory
	 */
	public void setClientSubCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTSUBCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientSubCategory</code> attribute. 
	 * @param value the clientSubCategory
	 */
	public void setClientSubCategory(final EnumerationValue value)
	{
		setClientSubCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.companyClientDetails</code> attribute.
	 * @return the companyClientDetails
	 */
	public Collection<CompanyOffers> getCompanyClientDetails(final SessionContext ctx)
	{
		final List<CompanyOffers> items = getLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			"CompanyOffers",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.companyClientDetails</code> attribute.
	 * @return the companyClientDetails
	 */
	public Collection<CompanyOffers> getCompanyClientDetails()
	{
		return getCompanyClientDetails( getSession().getSessionContext() );
	}
	
	public long getCompanyClientDetailsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			"CompanyOffers",
			null
		);
	}
	
	public long getCompanyClientDetailsCount()
	{
		return getCompanyClientDetailsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.companyClientDetails</code> attribute. 
	 * @param value the companyClientDetails
	 */
	public void setCompanyClientDetails(final SessionContext ctx, final Collection<CompanyOffers> value)
	{
		setLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2CLIENTDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.companyClientDetails</code> attribute. 
	 * @param value the companyClientDetails
	 */
	public void setCompanyClientDetails(final Collection<CompanyOffers> value)
	{
		setCompanyClientDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyClientDetails. 
	 * @param value the item to add to companyClientDetails
	 */
	public void addToCompanyClientDetails(final SessionContext ctx, final CompanyOffers value)
	{
		addLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2CLIENTDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to companyClientDetails. 
	 * @param value the item to add to companyClientDetails
	 */
	public void addToCompanyClientDetails(final CompanyOffers value)
	{
		addToCompanyClientDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyClientDetails. 
	 * @param value the item to remove from companyClientDetails
	 */
	public void removeFromCompanyClientDetails(final SessionContext ctx, final CompanyOffers value)
	{
		removeLinkedItems( 
			ctx,
			false,
			ClientcoreConstants.Relations.COMPANYOFFERS2CLIENTDETAILS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(COMPANYOFFERS2CLIENTDETAILS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from companyClientDetails. 
	 * @param value the item to remove from companyClientDetails
	 */
	public void removeFromCompanyClientDetails(final CompanyOffers value)
	{
		removeFromCompanyClientDetails( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		DEACTIVATEOFFERSCLIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.deactivateOffersClient</code> attribute.
	 * @return the deactivateOffersClient
	 */
	public CompanyOffers getDeactivateOffersClient(final SessionContext ctx)
	{
		return (CompanyOffers)getProperty( ctx, DEACTIVATEOFFERSCLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.deactivateOffersClient</code> attribute.
	 * @return the deactivateOffersClient
	 */
	public CompanyOffers getDeactivateOffersClient()
	{
		return getDeactivateOffersClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.deactivateOffersClient</code> attribute. 
	 * @param value the deactivateOffersClient
	 */
	public void setDeactivateOffersClient(final SessionContext ctx, final CompanyOffers value)
	{
		DEACTIVATEOFFERSCLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.deactivateOffersClient</code> attribute. 
	 * @param value the deactivateOffersClient
	 */
	public void setDeactivateOffersClient(final CompanyOffers value)
	{
		setDeactivateOffersClient( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.nationality</code> attribute.
	 * @return the nationality
	 */
	public Country getNationality(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.nationality</code> attribute.
	 * @return the nationality
	 */
	public Country getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final Country value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public PointOfSale getPointOfSale(final SessionContext ctx)
	{
		return (PointOfSale)getProperty( ctx, POINTOFSALE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientDetails.pointOfSale</code> attribute.
	 * @return the pointOfSale
	 */
	public PointOfSale getPointOfSale()
	{
		return getPointOfSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final SessionContext ctx, final PointOfSale value)
	{
		setProperty(ctx, POINTOFSALE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientDetails.pointOfSale</code> attribute. 
	 * @param value the pointOfSale
	 */
	public void setPointOfSale(final PointOfSale value)
	{
		setPointOfSale( getSession().getSessionContext(), value );
	}
	
}
