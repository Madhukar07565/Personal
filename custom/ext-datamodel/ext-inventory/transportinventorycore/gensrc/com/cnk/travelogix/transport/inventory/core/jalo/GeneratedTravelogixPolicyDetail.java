/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transport.inventory.core.jalo.AirInvSupplierAdvanceDefinition;
import com.cnk.travelogix.transport.inventory.core.jalo.PolicyDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.TravelogixPolicyDetail TravelogixPolicyDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixPolicyDetail extends GenericItem
{
	/** Qualifier of the <code>TravelogixPolicyDetail.policy</code> attribute **/
	public static final String POLICY = "policy";
	/** Qualifier of the <code>TravelogixPolicyDetail.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TravelogixPolicyDetail.airInventorySupplierAdvanceDefinition</code> attribute **/
	public static final String AIRINVENTORYSUPPLIERADVANCEDEFINITION = "airInventorySupplierAdvanceDefinition";
	/** Qualifier of the <code>TravelogixPolicyDetail.policyDetails</code> attribute **/
	public static final String POLICYDETAILS = "policyDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AIRINVENTORYSUPPLIERADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTravelogixPolicyDetail> AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedTravelogixPolicyDetail>(
	TransportinventorycoreConstants.TC.TRAVELOGIXPOLICYDETAIL,
	false,
	"airInventorySupplierAdvanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POLICYDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PolicyDetail> POLICYDETAILSHANDLER = new OneToManyHandler<PolicyDetail>(
	TransportinventorycoreConstants.TC.POLICYDETAIL,
	false,
	"travelogixPolicyDetail",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(POLICY, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(AIRINVENTORYSUPPLIERADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicyDetail.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition(final SessionContext ctx)
	{
		return (AirInvSupplierAdvanceDefinition)getProperty( ctx, AIRINVENTORYSUPPLIERADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicyDetail.airInventorySupplierAdvanceDefinition</code> attribute.
	 * @return the airInventorySupplierAdvanceDefinition
	 */
	public AirInvSupplierAdvanceDefinition getAirInventorySupplierAdvanceDefinition()
	{
		return getAirInventorySupplierAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicyDetail.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final SessionContext ctx, final AirInvSupplierAdvanceDefinition value)
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicyDetail.airInventorySupplierAdvanceDefinition</code> attribute. 
	 * @param value the airInventorySupplierAdvanceDefinition
	 */
	public void setAirInventorySupplierAdvanceDefinition(final AirInvSupplierAdvanceDefinition value)
	{
		setAirInventorySupplierAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicyDetail.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicyDetail.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicyDetail.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicyDetail.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AIRINVENTORYSUPPLIERADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicyDetail.policy</code> attribute.
	 * @return the policy
	 */
	public TravelogixPolicy getPolicy(final SessionContext ctx)
	{
		return (TravelogixPolicy)getProperty( ctx, POLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicyDetail.policy</code> attribute.
	 * @return the policy
	 */
	public TravelogixPolicy getPolicy()
	{
		return getPolicy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicyDetail.policy</code> attribute. 
	 * @param value the policy
	 */
	public void setPolicy(final SessionContext ctx, final TravelogixPolicy value)
	{
		setProperty(ctx, POLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicyDetail.policy</code> attribute. 
	 * @param value the policy
	 */
	public void setPolicy(final TravelogixPolicy value)
	{
		setPolicy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicyDetail.policyDetails</code> attribute.
	 * @return the policyDetails
	 */
	public Collection<PolicyDetail> getPolicyDetails(final SessionContext ctx)
	{
		return POLICYDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicyDetail.policyDetails</code> attribute.
	 * @return the policyDetails
	 */
	public Collection<PolicyDetail> getPolicyDetails()
	{
		return getPolicyDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicyDetail.policyDetails</code> attribute. 
	 * @param value the policyDetails
	 */
	public void setPolicyDetails(final SessionContext ctx, final Collection<PolicyDetail> value)
	{
		POLICYDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicyDetail.policyDetails</code> attribute. 
	 * @param value the policyDetails
	 */
	public void setPolicyDetails(final Collection<PolicyDetail> value)
	{
		setPolicyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyDetails. 
	 * @param value the item to add to policyDetails
	 */
	public void addToPolicyDetails(final SessionContext ctx, final PolicyDetail value)
	{
		POLICYDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to policyDetails. 
	 * @param value the item to add to policyDetails
	 */
	public void addToPolicyDetails(final PolicyDetail value)
	{
		addToPolicyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyDetails. 
	 * @param value the item to remove from policyDetails
	 */
	public void removeFromPolicyDetails(final SessionContext ctx, final PolicyDetail value)
	{
		POLICYDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from policyDetails. 
	 * @param value the item to remove from policyDetails
	 */
	public void removeFromPolicyDetails(final PolicyDetail value)
	{
		removeFromPolicyDetails( getSession().getSessionContext(), value );
	}
	
}
