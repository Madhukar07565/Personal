/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.kyc.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.Market;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.kyc.jalo.KYCRequirement KYCRequirement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedKYCRequirement extends GenericItem
{
	/** Qualifier of the <code>KYCRequirement.clientCompanyType</code> attribute **/
	public static final String CLIENTCOMPANYTYPE = "clientCompanyType";
	/** Qualifier of the <code>KYCRequirement.market</code> attribute **/
	public static final String MARKET = "market";
	/** Qualifier of the <code>KYCRequirement.kycDocuments</code> attribute **/
	public static final String KYCDOCUMENTS = "kycDocuments";
	/** Relation ordering override parameter constants for KYCRequirement2KYCDocument from ((orgstructurecore))*/
	protected static String KYCREQUIREMENT2KYCDOCUMENT_SRC_ORDERED = "relation.KYCRequirement2KYCDocument.source.ordered";
	protected static String KYCREQUIREMENT2KYCDOCUMENT_TGT_ORDERED = "relation.KYCRequirement2KYCDocument.target.ordered";
	/** Relation disable markmodifed parameter constants for KYCRequirement2KYCDocument from ((orgstructurecore))*/
	protected static String KYCREQUIREMENT2KYCDOCUMENT_MARKMODIFIED = "relation.KYCRequirement2KYCDocument.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n MARKET's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedKYCRequirement> MARKETHANDLER = new BidirectionalOneToManyHandler<GeneratedKYCRequirement>(
	OrgstructurecoreConstants.TC.KYCREQUIREMENT,
	false,
	"market",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CLIENTCOMPANYTYPE, AttributeMode.INITIAL);
		tmp.put(MARKET, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCRequirement.clientCompanyType</code> attribute.
	 * @return the clientCompanyType
	 */
	public EnumerationValue getClientCompanyType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTCOMPANYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCRequirement.clientCompanyType</code> attribute.
	 * @return the clientCompanyType
	 */
	public EnumerationValue getClientCompanyType()
	{
		return getClientCompanyType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCRequirement.clientCompanyType</code> attribute. 
	 * @param value the clientCompanyType
	 */
	public void setClientCompanyType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTCOMPANYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCRequirement.clientCompanyType</code> attribute. 
	 * @param value the clientCompanyType
	 */
	public void setClientCompanyType(final EnumerationValue value)
	{
		setClientCompanyType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		MARKETHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCRequirement.kycDocuments</code> attribute.
	 * @return the kycDocuments
	 */
	public Set<EnumerationValue> getKycDocuments(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			"KYCDocumentType",
			null,
			false,
			false
		);
		return new LinkedHashSet<EnumerationValue>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCRequirement.kycDocuments</code> attribute.
	 * @return the kycDocuments
	 */
	public Set<EnumerationValue> getKycDocuments()
	{
		return getKycDocuments( getSession().getSessionContext() );
	}
	
	public long getKycDocumentsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			"KYCDocumentType",
			null
		);
	}
	
	public long getKycDocumentsCount()
	{
		return getKycDocumentsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCRequirement.kycDocuments</code> attribute. 
	 * @param value the kycDocuments
	 */
	public void setKycDocuments(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(KYCREQUIREMENT2KYCDOCUMENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCRequirement.kycDocuments</code> attribute. 
	 * @param value the kycDocuments
	 */
	public void setKycDocuments(final Set<EnumerationValue> value)
	{
		setKycDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycDocuments. 
	 * @param value the item to add to kycDocuments
	 */
	public void addToKycDocuments(final SessionContext ctx, final EnumerationValue value)
	{
		addLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(KYCREQUIREMENT2KYCDOCUMENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to kycDocuments. 
	 * @param value the item to add to kycDocuments
	 */
	public void addToKycDocuments(final EnumerationValue value)
	{
		addToKycDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycDocuments. 
	 * @param value the item to remove from kycDocuments
	 */
	public void removeFromKycDocuments(final SessionContext ctx, final EnumerationValue value)
	{
		removeLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.KYCREQUIREMENT2KYCDOCUMENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(KYCREQUIREMENT2KYCDOCUMENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from kycDocuments. 
	 * @param value the item to remove from kycDocuments
	 */
	public void removeFromKycDocuments(final EnumerationValue value)
	{
		removeFromKycDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCRequirement.market</code> attribute.
	 * @return the market
	 */
	public Market getMarket(final SessionContext ctx)
	{
		return (Market)getProperty( ctx, MARKET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCRequirement.market</code> attribute.
	 * @return the market
	 */
	public Market getMarket()
	{
		return getMarket( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCRequirement.market</code> attribute. 
	 * @param value the market
	 */
	public void setMarket(final SessionContext ctx, final Market value)
	{
		MARKETHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCRequirement.market</code> attribute. 
	 * @param value the market
	 */
	public void setMarket(final Market value)
	{
		setMarket( getSession().getSessionContext(), value );
	}
	
}
