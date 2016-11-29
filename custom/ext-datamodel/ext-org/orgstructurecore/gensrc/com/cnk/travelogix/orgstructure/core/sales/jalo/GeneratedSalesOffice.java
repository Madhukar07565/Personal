/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.sales.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.iata.jalo.IATAAgency;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.jalo.BusinessUnit;
import com.cnk.travelogix.orgstructure.core.sales.jalo.Division;
import com.cnk.travelogix.orgstructure.core.sales.jalo.SalesGroup;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.sales.jalo.SalesOffice SalesOffice}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSalesOffice extends AbstractOrganization
{
	/** Qualifier of the <code>SalesOffice.address</code> attribute **/
	public static final String ADDRESS = "address";
	/** Qualifier of the <code>SalesOffice.division</code> attribute **/
	public static final String DIVISION = "division";
	/** Qualifier of the <code>SalesOffice.iataAgency</code> attribute **/
	public static final String IATAAGENCY = "iataAgency";
	/** Qualifier of the <code>SalesOffice.contactPerson</code> attribute **/
	public static final String CONTACTPERSON = "contactPerson";
	/** Qualifier of the <code>SalesOffice.telephone</code> attribute **/
	public static final String TELEPHONE = "telephone";
	/** Qualifier of the <code>SalesOffice.fax</code> attribute **/
	public static final String FAX = "fax";
	/** Qualifier of the <code>SalesOffice.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>SalesOffice.websiteUrl</code> attribute **/
	public static final String WEBSITEURL = "websiteUrl";
	/** Qualifier of the <code>SalesOffice.shopNumber</code> attribute **/
	public static final String SHOPNUMBER = "shopNumber";
	/** Qualifier of the <code>SalesOffice.establishmentNumber</code> attribute **/
	public static final String ESTABLISHMENTNUMBER = "establishmentNumber";
	/** Qualifier of the <code>SalesOffice.salesGroups</code> attribute **/
	public static final String SALESGROUPS = "salesGroups";
	/** Relation ordering override parameter constants for SalesOffice2SalesGroup from ((orgstructurecore))*/
	protected static String SALESOFFICE2SALESGROUP_SRC_ORDERED = "relation.SalesOffice2SalesGroup.source.ordered";
	protected static String SALESOFFICE2SALESGROUP_TGT_ORDERED = "relation.SalesOffice2SalesGroup.target.ordered";
	/** Relation disable markmodifed parameter constants for SalesOffice2SalesGroup from ((orgstructurecore))*/
	protected static String SALESOFFICE2SALESGROUP_MARKMODIFIED = "relation.SalesOffice2SalesGroup.markmodified";
	/** Qualifier of the <code>SalesOffice.buAvailability</code> attribute **/
	public static final String BUAVAILABILITY = "buAvailability";
	/** Relation ordering override parameter constants for SalesOffice2BU from ((orgstructurecore))*/
	protected static String SALESOFFICE2BU_SRC_ORDERED = "relation.SalesOffice2BU.source.ordered";
	protected static String SALESOFFICE2BU_TGT_ORDERED = "relation.SalesOffice2BU.target.ordered";
	/** Relation disable markmodifed parameter constants for SalesOffice2BU from ((orgstructurecore))*/
	protected static String SALESOFFICE2BU_MARKMODIFIED = "relation.SalesOffice2BU.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOrganization.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ADDRESS, AttributeMode.INITIAL);
		tmp.put(DIVISION, AttributeMode.INITIAL);
		tmp.put(IATAAGENCY, AttributeMode.INITIAL);
		tmp.put(CONTACTPERSON, AttributeMode.INITIAL);
		tmp.put(TELEPHONE, AttributeMode.INITIAL);
		tmp.put(FAX, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(WEBSITEURL, AttributeMode.INITIAL);
		tmp.put(SHOPNUMBER, AttributeMode.INITIAL);
		tmp.put(ESTABLISHMENTNUMBER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress(final SessionContext ctx)
	{
		return (Address)getProperty( ctx, ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.address</code> attribute.
	 * @return the address
	 */
	public Address getAddress()
	{
		return getAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Address value)
	{
		setProperty(ctx, ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Address value)
	{
		setAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.buAvailability</code> attribute.
	 * @return the buAvailability
	 */
	public Set<BusinessUnit> getBuAvailability(final SessionContext ctx)
	{
		final List<BusinessUnit> items = getLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			"BusinessUnit",
			null,
			false,
			false
		);
		return new LinkedHashSet<BusinessUnit>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.buAvailability</code> attribute.
	 * @return the buAvailability
	 */
	public Set<BusinessUnit> getBuAvailability()
	{
		return getBuAvailability( getSession().getSessionContext() );
	}
	
	public long getBuAvailabilityCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			"BusinessUnit",
			null
		);
	}
	
	public long getBuAvailabilityCount()
	{
		return getBuAvailabilityCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.buAvailability</code> attribute. 
	 * @param value the buAvailability
	 */
	public void setBuAvailability(final SessionContext ctx, final Set<BusinessUnit> value)
	{
		setLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2BU_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.buAvailability</code> attribute. 
	 * @param value the buAvailability
	 */
	public void setBuAvailability(final Set<BusinessUnit> value)
	{
		setBuAvailability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to buAvailability. 
	 * @param value the item to add to buAvailability
	 */
	public void addToBuAvailability(final SessionContext ctx, final BusinessUnit value)
	{
		addLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2BU_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to buAvailability. 
	 * @param value the item to add to buAvailability
	 */
	public void addToBuAvailability(final BusinessUnit value)
	{
		addToBuAvailability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from buAvailability. 
	 * @param value the item to remove from buAvailability
	 */
	public void removeFromBuAvailability(final SessionContext ctx, final BusinessUnit value)
	{
		removeLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2BU,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2BU_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from buAvailability. 
	 * @param value the item to remove from buAvailability
	 */
	public void removeFromBuAvailability(final BusinessUnit value)
	{
		removeFromBuAvailability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.contactPerson</code> attribute.
	 * @return the contactPerson
	 */
	public String getContactPerson(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTPERSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.contactPerson</code> attribute.
	 * @return the contactPerson
	 */
	public String getContactPerson()
	{
		return getContactPerson( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.contactPerson</code> attribute. 
	 * @param value the contactPerson
	 */
	public void setContactPerson(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTPERSON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.contactPerson</code> attribute. 
	 * @param value the contactPerson
	 */
	public void setContactPerson(final String value)
	{
		setContactPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.division</code> attribute.
	 * @return the division
	 */
	public Division getDivision(final SessionContext ctx)
	{
		return (Division)getProperty( ctx, DIVISION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.division</code> attribute.
	 * @return the division
	 */
	public Division getDivision()
	{
		return getDivision( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final SessionContext ctx, final Division value)
	{
		setProperty(ctx, DIVISION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.division</code> attribute. 
	 * @param value the division
	 */
	public void setDivision(final Division value)
	{
		setDivision( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.establishmentNumber</code> attribute.
	 * @return the establishmentNumber
	 */
	public String getEstablishmentNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ESTABLISHMENTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.establishmentNumber</code> attribute.
	 * @return the establishmentNumber
	 */
	public String getEstablishmentNumber()
	{
		return getEstablishmentNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.establishmentNumber</code> attribute. 
	 * @param value the establishmentNumber
	 */
	public void setEstablishmentNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ESTABLISHMENTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.establishmentNumber</code> attribute. 
	 * @param value the establishmentNumber
	 */
	public void setEstablishmentNumber(final String value)
	{
		setEstablishmentNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.fax</code> attribute.
	 * @return the fax
	 */
	public String getFax(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.fax</code> attribute.
	 * @return the fax
	 */
	public String getFax()
	{
		return getFax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.fax</code> attribute. 
	 * @param value the fax
	 */
	public void setFax(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.fax</code> attribute. 
	 * @param value the fax
	 */
	public void setFax(final String value)
	{
		setFax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.iataAgency</code> attribute.
	 * @return the iataAgency
	 */
	public IATAAgency getIataAgency(final SessionContext ctx)
	{
		return (IATAAgency)getProperty( ctx, IATAAGENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.iataAgency</code> attribute.
	 * @return the iataAgency
	 */
	public IATAAgency getIataAgency()
	{
		return getIataAgency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.iataAgency</code> attribute. 
	 * @param value the iataAgency
	 */
	public void setIataAgency(final SessionContext ctx, final IATAAgency value)
	{
		setProperty(ctx, IATAAGENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.iataAgency</code> attribute. 
	 * @param value the iataAgency
	 */
	public void setIataAgency(final IATAAgency value)
	{
		setIataAgency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.salesGroups</code> attribute.
	 * @return the salesGroups
	 */
	public Set<SalesGroup> getSalesGroups(final SessionContext ctx)
	{
		final List<SalesGroup> items = getLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			"SalesGroup",
			null,
			false,
			false
		);
		return new LinkedHashSet<SalesGroup>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.salesGroups</code> attribute.
	 * @return the salesGroups
	 */
	public Set<SalesGroup> getSalesGroups()
	{
		return getSalesGroups( getSession().getSessionContext() );
	}
	
	public long getSalesGroupsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			"SalesGroup",
			null
		);
	}
	
	public long getSalesGroupsCount()
	{
		return getSalesGroupsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.salesGroups</code> attribute. 
	 * @param value the salesGroups
	 */
	public void setSalesGroups(final SessionContext ctx, final Set<SalesGroup> value)
	{
		setLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2SALESGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.salesGroups</code> attribute. 
	 * @param value the salesGroups
	 */
	public void setSalesGroups(final Set<SalesGroup> value)
	{
		setSalesGroups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesGroups. 
	 * @param value the item to add to salesGroups
	 */
	public void addToSalesGroups(final SessionContext ctx, final SalesGroup value)
	{
		addLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2SALESGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesGroups. 
	 * @param value the item to add to salesGroups
	 */
	public void addToSalesGroups(final SalesGroup value)
	{
		addToSalesGroups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesGroups. 
	 * @param value the item to remove from salesGroups
	 */
	public void removeFromSalesGroups(final SessionContext ctx, final SalesGroup value)
	{
		removeLinkedItems( 
			ctx,
			true,
			OrgstructurecoreConstants.Relations.SALESOFFICE2SALESGROUP,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SALESOFFICE2SALESGROUP_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesGroups. 
	 * @param value the item to remove from salesGroups
	 */
	public void removeFromSalesGroups(final SalesGroup value)
	{
		removeFromSalesGroups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.shopNumber</code> attribute.
	 * @return the shopNumber
	 */
	public String getShopNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHOPNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.shopNumber</code> attribute.
	 * @return the shopNumber
	 */
	public String getShopNumber()
	{
		return getShopNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.shopNumber</code> attribute. 
	 * @param value the shopNumber
	 */
	public void setShopNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHOPNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.shopNumber</code> attribute. 
	 * @param value the shopNumber
	 */
	public void setShopNumber(final String value)
	{
		setShopNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TELEPHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.telephone</code> attribute.
	 * @return the telephone
	 */
	public String getTelephone()
	{
		return getTelephone( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TELEPHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.telephone</code> attribute. 
	 * @param value the telephone
	 */
	public void setTelephone(final String value)
	{
		setTelephone( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.websiteUrl</code> attribute.
	 * @return the websiteUrl
	 */
	public String getWebsiteUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEBSITEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SalesOffice.websiteUrl</code> attribute.
	 * @return the websiteUrl
	 */
	public String getWebsiteUrl()
	{
		return getWebsiteUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.websiteUrl</code> attribute. 
	 * @param value the websiteUrl
	 */
	public void setWebsiteUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEBSITEURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SalesOffice.websiteUrl</code> attribute. 
	 * @param value the websiteUrl
	 */
	public void setWebsiteUrl(final String value)
	{
		setWebsiteUrl( getSession().getSessionContext(), value );
	}
	
}
