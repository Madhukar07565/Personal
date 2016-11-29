/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.BusinessInformation;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.Lead;
import com.cnk.travelogix.presales.jalo.PresalesAddress;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.Prospect Prospect}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProspect extends TravelogixB2BUnit
{
	/** Qualifier of the <code>Prospect.prospectId</code> attribute **/
	public static final String PROSPECTID = "prospectId";
	/** Qualifier of the <code>Prospect.corporateType</code> attribute **/
	public static final String CORPORATETYPE = "corporateType";
	/** Qualifier of the <code>Prospect.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>Prospect.numberOfBranches</code> attribute **/
	public static final String NUMBEROFBRANCHES = "numberOfBranches";
	/** Qualifier of the <code>Prospect.servicingLocations</code> attribute **/
	public static final String SERVICINGLOCATIONS = "servicingLocations";
	/** Qualifier of the <code>Prospect.prospectAddress</code> attribute **/
	public static final String PROSPECTADDRESS = "prospectAddress";
	/** Qualifier of the <code>Prospect.prospectBuisnessInfo</code> attribute **/
	public static final String PROSPECTBUISNESSINFO = "prospectBuisnessInfo";
	/** Qualifier of the <code>Prospect.prospectLeads</code> attribute **/
	public static final String PROSPECTLEADS = "prospectLeads";
	/**
	* {@link OneToManyHandler} for handling 1:n PROSPECTADDRESS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PresalesAddress> PROSPECTADDRESSHANDLER = new OneToManyHandler<PresalesAddress>(
	PresalescoreConstants.TC.PRESALESADDRESS,
	false,
	"prospect",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PROSPECTBUISNESSINFO's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusinessInformation> PROSPECTBUISNESSINFOHANDLER = new OneToManyHandler<BusinessInformation>(
	ClientcoreConstants.TC.BUSINESSINFORMATION,
	false,
	"prospect",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PROSPECTLEADS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Lead> PROSPECTLEADSHANDLER = new OneToManyHandler<Lead>(
	PresalescoreConstants.TC.LEAD,
	false,
	"prospect",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TravelogixB2BUnit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PROSPECTID, AttributeMode.INITIAL);
		tmp.put(CORPORATETYPE, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(NUMBEROFBRANCHES, AttributeMode.INITIAL);
		tmp.put(SERVICINGLOCATIONS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.clientType</code> attribute.
	 * @return the clientType - ClientType for Prospect
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.clientType</code> attribute.
	 * @return the clientType - ClientType for Prospect
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.clientType</code> attribute. 
	 * @param value the clientType - ClientType for Prospect
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.clientType</code> attribute. 
	 * @param value the clientType - ClientType for Prospect
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.corporateType</code> attribute.
	 * @return the corporateType - CorporateType for Prospect
	 */
	public EnumerationValue getCorporateType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CORPORATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.corporateType</code> attribute.
	 * @return the corporateType - CorporateType for Prospect
	 */
	public EnumerationValue getCorporateType()
	{
		return getCorporateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.corporateType</code> attribute. 
	 * @param value the corporateType - CorporateType for Prospect
	 */
	public void setCorporateType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CORPORATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.corporateType</code> attribute. 
	 * @param value the corporateType - CorporateType for Prospect
	 */
	public void setCorporateType(final EnumerationValue value)
	{
		setCorporateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.numberOfBranches</code> attribute.
	 * @return the numberOfBranches - NumberOfBranches for Prospect
	 */
	public Integer getNumberOfBranches(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFBRANCHES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.numberOfBranches</code> attribute.
	 * @return the numberOfBranches - NumberOfBranches for Prospect
	 */
	public Integer getNumberOfBranches()
	{
		return getNumberOfBranches( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.numberOfBranches</code> attribute. 
	 * @return the numberOfBranches - NumberOfBranches for Prospect
	 */
	public int getNumberOfBranchesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfBranches( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.numberOfBranches</code> attribute. 
	 * @return the numberOfBranches - NumberOfBranches for Prospect
	 */
	public int getNumberOfBranchesAsPrimitive()
	{
		return getNumberOfBranchesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.numberOfBranches</code> attribute. 
	 * @param value the numberOfBranches - NumberOfBranches for Prospect
	 */
	public void setNumberOfBranches(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFBRANCHES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.numberOfBranches</code> attribute. 
	 * @param value the numberOfBranches - NumberOfBranches for Prospect
	 */
	public void setNumberOfBranches(final Integer value)
	{
		setNumberOfBranches( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.numberOfBranches</code> attribute. 
	 * @param value the numberOfBranches - NumberOfBranches for Prospect
	 */
	public void setNumberOfBranches(final SessionContext ctx, final int value)
	{
		setNumberOfBranches( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.numberOfBranches</code> attribute. 
	 * @param value the numberOfBranches - NumberOfBranches for Prospect
	 */
	public void setNumberOfBranches(final int value)
	{
		setNumberOfBranches( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.prospectAddress</code> attribute.
	 * @return the prospectAddress
	 */
	public Collection<PresalesAddress> getProspectAddress(final SessionContext ctx)
	{
		return PROSPECTADDRESSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.prospectAddress</code> attribute.
	 * @return the prospectAddress
	 */
	public Collection<PresalesAddress> getProspectAddress()
	{
		return getProspectAddress( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.prospectAddress</code> attribute. 
	 * @param value the prospectAddress
	 */
	public void setProspectAddress(final SessionContext ctx, final Collection<PresalesAddress> value)
	{
		PROSPECTADDRESSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.prospectAddress</code> attribute. 
	 * @param value the prospectAddress
	 */
	public void setProspectAddress(final Collection<PresalesAddress> value)
	{
		setProspectAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prospectAddress. 
	 * @param value the item to add to prospectAddress
	 */
	public void addToProspectAddress(final SessionContext ctx, final PresalesAddress value)
	{
		PROSPECTADDRESSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prospectAddress. 
	 * @param value the item to add to prospectAddress
	 */
	public void addToProspectAddress(final PresalesAddress value)
	{
		addToProspectAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prospectAddress. 
	 * @param value the item to remove from prospectAddress
	 */
	public void removeFromProspectAddress(final SessionContext ctx, final PresalesAddress value)
	{
		PROSPECTADDRESSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prospectAddress. 
	 * @param value the item to remove from prospectAddress
	 */
	public void removeFromProspectAddress(final PresalesAddress value)
	{
		removeFromProspectAddress( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.prospectBuisnessInfo</code> attribute.
	 * @return the prospectBuisnessInfo
	 */
	public Collection<BusinessInformation> getProspectBuisnessInfo(final SessionContext ctx)
	{
		return PROSPECTBUISNESSINFOHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.prospectBuisnessInfo</code> attribute.
	 * @return the prospectBuisnessInfo
	 */
	public Collection<BusinessInformation> getProspectBuisnessInfo()
	{
		return getProspectBuisnessInfo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.prospectBuisnessInfo</code> attribute. 
	 * @param value the prospectBuisnessInfo
	 */
	public void setProspectBuisnessInfo(final SessionContext ctx, final Collection<BusinessInformation> value)
	{
		PROSPECTBUISNESSINFOHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.prospectBuisnessInfo</code> attribute. 
	 * @param value the prospectBuisnessInfo
	 */
	public void setProspectBuisnessInfo(final Collection<BusinessInformation> value)
	{
		setProspectBuisnessInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prospectBuisnessInfo. 
	 * @param value the item to add to prospectBuisnessInfo
	 */
	public void addToProspectBuisnessInfo(final SessionContext ctx, final BusinessInformation value)
	{
		PROSPECTBUISNESSINFOHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prospectBuisnessInfo. 
	 * @param value the item to add to prospectBuisnessInfo
	 */
	public void addToProspectBuisnessInfo(final BusinessInformation value)
	{
		addToProspectBuisnessInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prospectBuisnessInfo. 
	 * @param value the item to remove from prospectBuisnessInfo
	 */
	public void removeFromProspectBuisnessInfo(final SessionContext ctx, final BusinessInformation value)
	{
		PROSPECTBUISNESSINFOHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prospectBuisnessInfo. 
	 * @param value the item to remove from prospectBuisnessInfo
	 */
	public void removeFromProspectBuisnessInfo(final BusinessInformation value)
	{
		removeFromProspectBuisnessInfo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.prospectId</code> attribute.
	 * @return the prospectId - ID for Prospect
	 */
	public String getProspectId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROSPECTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.prospectId</code> attribute.
	 * @return the prospectId - ID for Prospect
	 */
	public String getProspectId()
	{
		return getProspectId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.prospectId</code> attribute. 
	 * @param value the prospectId - ID for Prospect
	 */
	public void setProspectId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROSPECTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.prospectId</code> attribute. 
	 * @param value the prospectId - ID for Prospect
	 */
	public void setProspectId(final String value)
	{
		setProspectId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.prospectLeads</code> attribute.
	 * @return the prospectLeads
	 */
	public Collection<Lead> getProspectLeads(final SessionContext ctx)
	{
		return PROSPECTLEADSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.prospectLeads</code> attribute.
	 * @return the prospectLeads
	 */
	public Collection<Lead> getProspectLeads()
	{
		return getProspectLeads( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.prospectLeads</code> attribute. 
	 * @param value the prospectLeads
	 */
	public void setProspectLeads(final SessionContext ctx, final Collection<Lead> value)
	{
		PROSPECTLEADSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.prospectLeads</code> attribute. 
	 * @param value the prospectLeads
	 */
	public void setProspectLeads(final Collection<Lead> value)
	{
		setProspectLeads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prospectLeads. 
	 * @param value the item to add to prospectLeads
	 */
	public void addToProspectLeads(final SessionContext ctx, final Lead value)
	{
		PROSPECTLEADSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to prospectLeads. 
	 * @param value the item to add to prospectLeads
	 */
	public void addToProspectLeads(final Lead value)
	{
		addToProspectLeads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prospectLeads. 
	 * @param value the item to remove from prospectLeads
	 */
	public void removeFromProspectLeads(final SessionContext ctx, final Lead value)
	{
		PROSPECTLEADSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from prospectLeads. 
	 * @param value the item to remove from prospectLeads
	 */
	public void removeFromProspectLeads(final Lead value)
	{
		removeFromProspectLeads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.servicingLocations</code> attribute.
	 * @return the servicingLocations - NumberOfBranches for Prospect
	 */
	public Collection<EnumerationValue> getServicingLocations(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, SERVICINGLOCATIONS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Prospect.servicingLocations</code> attribute.
	 * @return the servicingLocations - NumberOfBranches for Prospect
	 */
	public Collection<EnumerationValue> getServicingLocations()
	{
		return getServicingLocations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.servicingLocations</code> attribute. 
	 * @param value the servicingLocations - NumberOfBranches for Prospect
	 */
	public void setServicingLocations(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, SERVICINGLOCATIONS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Prospect.servicingLocations</code> attribute. 
	 * @param value the servicingLocations - NumberOfBranches for Prospect
	 */
	public void setServicingLocations(final Collection<EnumerationValue> value)
	{
		setServicingLocations( getSession().getSessionContext(), value );
	}
	
}
