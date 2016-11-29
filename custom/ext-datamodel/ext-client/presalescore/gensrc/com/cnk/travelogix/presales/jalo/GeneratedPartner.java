/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.CommercialTerms;
import com.cnk.travelogix.presales.jalo.ContractDocuments;
import com.cnk.travelogix.presales.jalo.Lead;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.Partner Partner}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPartner extends GenericItem
{
	/** Qualifier of the <code>Partner.currentServiceProvider</code> attribute **/
	public static final String CURRENTSERVICEPROVIDER = "currentServiceProvider";
	/** Qualifier of the <code>Partner.contractSince</code> attribute **/
	public static final String CONTRACTSINCE = "contractSince";
	/** Qualifier of the <code>Partner.contractValidityDate</code> attribute **/
	public static final String CONTRACTVALIDITYDATE = "contractValidityDate";
	/** Qualifier of the <code>Partner.terminateReason</code> attribute **/
	public static final String TERMINATEREASON = "terminateReason";
	/** Qualifier of the <code>Partner.lead</code> attribute **/
	public static final String LEAD = "lead";
	/** Qualifier of the <code>Partner.commertialTerms</code> attribute **/
	public static final String COMMERTIALTERMS = "commertialTerms";
	/** Qualifier of the <code>Partner.uploadContracts</code> attribute **/
	public static final String UPLOADCONTRACTS = "uploadContracts";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n LEAD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPartner> LEADHANDLER = new BidirectionalOneToManyHandler<GeneratedPartner>(
	PresalescoreConstants.TC.PARTNER,
	false,
	"lead",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COMMERTIALTERMS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CommercialTerms> COMMERTIALTERMSHANDLER = new OneToManyHandler<CommercialTerms>(
	PresalescoreConstants.TC.COMMERCIALTERMS,
	false,
	"partner",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n UPLOADCONTRACTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ContractDocuments> UPLOADCONTRACTSHANDLER = new OneToManyHandler<ContractDocuments>(
	PresalescoreConstants.TC.CONTRACTDOCUMENTS,
	false,
	"partner",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CURRENTSERVICEPROVIDER, AttributeMode.INITIAL);
		tmp.put(CONTRACTSINCE, AttributeMode.INITIAL);
		tmp.put(CONTRACTVALIDITYDATE, AttributeMode.INITIAL);
		tmp.put(TERMINATEREASON, AttributeMode.INITIAL);
		tmp.put(LEAD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.commertialTerms</code> attribute.
	 * @return the commertialTerms
	 */
	public Collection<CommercialTerms> getCommertialTerms(final SessionContext ctx)
	{
		return COMMERTIALTERMSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.commertialTerms</code> attribute.
	 * @return the commertialTerms
	 */
	public Collection<CommercialTerms> getCommertialTerms()
	{
		return getCommertialTerms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.commertialTerms</code> attribute. 
	 * @param value the commertialTerms
	 */
	public void setCommertialTerms(final SessionContext ctx, final Collection<CommercialTerms> value)
	{
		COMMERTIALTERMSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.commertialTerms</code> attribute. 
	 * @param value the commertialTerms
	 */
	public void setCommertialTerms(final Collection<CommercialTerms> value)
	{
		setCommertialTerms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commertialTerms. 
	 * @param value the item to add to commertialTerms
	 */
	public void addToCommertialTerms(final SessionContext ctx, final CommercialTerms value)
	{
		COMMERTIALTERMSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commertialTerms. 
	 * @param value the item to add to commertialTerms
	 */
	public void addToCommertialTerms(final CommercialTerms value)
	{
		addToCommertialTerms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commertialTerms. 
	 * @param value the item to remove from commertialTerms
	 */
	public void removeFromCommertialTerms(final SessionContext ctx, final CommercialTerms value)
	{
		COMMERTIALTERMSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commertialTerms. 
	 * @param value the item to remove from commertialTerms
	 */
	public void removeFromCommertialTerms(final CommercialTerms value)
	{
		removeFromCommertialTerms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.contractSince</code> attribute.
	 * @return the contractSince - contract From Date
	 */
	public Date getContractSince(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONTRACTSINCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.contractSince</code> attribute.
	 * @return the contractSince - contract From Date
	 */
	public Date getContractSince()
	{
		return getContractSince( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.contractSince</code> attribute. 
	 * @param value the contractSince - contract From Date
	 */
	public void setContractSince(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONTRACTSINCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.contractSince</code> attribute. 
	 * @param value the contractSince - contract From Date
	 */
	public void setContractSince(final Date value)
	{
		setContractSince( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.contractValidityDate</code> attribute.
	 * @return the contractValidityDate - contract to Date
	 */
	public Date getContractValidityDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONTRACTVALIDITYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.contractValidityDate</code> attribute.
	 * @return the contractValidityDate - contract to Date
	 */
	public Date getContractValidityDate()
	{
		return getContractValidityDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.contractValidityDate</code> attribute. 
	 * @param value the contractValidityDate - contract to Date
	 */
	public void setContractValidityDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONTRACTVALIDITYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.contractValidityDate</code> attribute. 
	 * @param value the contractValidityDate - contract to Date
	 */
	public void setContractValidityDate(final Date value)
	{
		setContractValidityDate( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		LEADHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.currentServiceProvider</code> attribute.
	 * @return the currentServiceProvider - Current Service Provider for Partner
	 */
	public EnumerationValue getCurrentServiceProvider(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CURRENTSERVICEPROVIDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.currentServiceProvider</code> attribute.
	 * @return the currentServiceProvider - Current Service Provider for Partner
	 */
	public EnumerationValue getCurrentServiceProvider()
	{
		return getCurrentServiceProvider( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.currentServiceProvider</code> attribute. 
	 * @param value the currentServiceProvider - Current Service Provider for Partner
	 */
	public void setCurrentServiceProvider(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CURRENTSERVICEPROVIDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.currentServiceProvider</code> attribute. 
	 * @param value the currentServiceProvider - Current Service Provider for Partner
	 */
	public void setCurrentServiceProvider(final EnumerationValue value)
	{
		setCurrentServiceProvider( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.lead</code> attribute.
	 * @return the lead
	 */
	public Lead getLead(final SessionContext ctx)
	{
		return (Lead)getProperty( ctx, LEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.lead</code> attribute.
	 * @return the lead
	 */
	public Lead getLead()
	{
		return getLead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.lead</code> attribute. 
	 * @param value the lead
	 */
	public void setLead(final SessionContext ctx, final Lead value)
	{
		LEADHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.lead</code> attribute. 
	 * @param value the lead
	 */
	public void setLead(final Lead value)
	{
		setLead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.terminateReason</code> attribute.
	 * @return the terminateReason - Terminate Reason of a Partner
	 */
	public String getTerminateReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TERMINATEREASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.terminateReason</code> attribute.
	 * @return the terminateReason - Terminate Reason of a Partner
	 */
	public String getTerminateReason()
	{
		return getTerminateReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.terminateReason</code> attribute. 
	 * @param value the terminateReason - Terminate Reason of a Partner
	 */
	public void setTerminateReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TERMINATEREASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.terminateReason</code> attribute. 
	 * @param value the terminateReason - Terminate Reason of a Partner
	 */
	public void setTerminateReason(final String value)
	{
		setTerminateReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.uploadContracts</code> attribute.
	 * @return the uploadContracts
	 */
	public Collection<ContractDocuments> getUploadContracts(final SessionContext ctx)
	{
		return UPLOADCONTRACTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Partner.uploadContracts</code> attribute.
	 * @return the uploadContracts
	 */
	public Collection<ContractDocuments> getUploadContracts()
	{
		return getUploadContracts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.uploadContracts</code> attribute. 
	 * @param value the uploadContracts
	 */
	public void setUploadContracts(final SessionContext ctx, final Collection<ContractDocuments> value)
	{
		UPLOADCONTRACTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Partner.uploadContracts</code> attribute. 
	 * @param value the uploadContracts
	 */
	public void setUploadContracts(final Collection<ContractDocuments> value)
	{
		setUploadContracts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to uploadContracts. 
	 * @param value the item to add to uploadContracts
	 */
	public void addToUploadContracts(final SessionContext ctx, final ContractDocuments value)
	{
		UPLOADCONTRACTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to uploadContracts. 
	 * @param value the item to add to uploadContracts
	 */
	public void addToUploadContracts(final ContractDocuments value)
	{
		addToUploadContracts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from uploadContracts. 
	 * @param value the item to remove from uploadContracts
	 */
	public void removeFromUploadContracts(final SessionContext ctx, final ContractDocuments value)
	{
		UPLOADCONTRACTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from uploadContracts. 
	 * @param value the item to remove from uploadContracts
	 */
	public void removeFromUploadContracts(final ContractDocuments value)
	{
		removeFromUploadContracts( getSession().getSessionContext(), value );
	}
	
}
