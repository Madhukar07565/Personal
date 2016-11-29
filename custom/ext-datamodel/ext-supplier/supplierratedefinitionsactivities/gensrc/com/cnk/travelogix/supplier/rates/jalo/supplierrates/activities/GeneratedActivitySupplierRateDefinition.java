/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.masterdata.core.policy.ActivityDynamicPolicy;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityInventory;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivityRateDetailDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.ActivitySupplierRateDefinition ActivitySupplierRateDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivitySupplierRateDefinition extends AbstractRateDefinition
{
	/** Qualifier of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute **/
	public static final String FREESALELIMITED = "freeSaleLimited";
	/** Qualifier of the <code>ActivitySupplierRateDefinition.inventory</code> attribute **/
	public static final String INVENTORY = "inventory";
	/** Qualifier of the <code>ActivitySupplierRateDefinition.rateDetailDefs</code> attribute **/
	public static final String RATEDETAILDEFS = "rateDetailDefs";
	/** Qualifier of the <code>ActivitySupplierRateDefinition.dynamicPolicies</code> attribute **/
	public static final String DYNAMICPOLICIES = "dynamicPolicies";
	/** Qualifier of the <code>ActivitySupplierRateDefinition.absTravelogixSupplierOffers</code> attribute **/
	public static final String ABSTRAVELOGIXSUPPLIEROFFERS = "absTravelogixSupplierOffers";
	/**
	* {@link OneToManyHandler} for handling 1:n RATEDETAILDEFS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityRateDetailDefinition> RATEDETAILDEFSHANDLER = new OneToManyHandler<ActivityRateDetailDefinition>(
	SupplierratedefinitionsactivitiesConstants.TC.ACTIVITYRATEDETAILDEFINITION,
	true,
	"activitySuppRateDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DYNAMICPOLICIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityDynamicPolicy> DYNAMICPOLICIESHANDLER = new OneToManyHandler<ActivityDynamicPolicy>(
	SuppliermasterscoreConstants.TC.ACTIVITYDYNAMICPOLICY,
	true,
	"supplierRateDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ABSTRAVELOGIXSUPPLIEROFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractTravelogixSupplierOffer> ABSTRAVELOGIXSUPPLIEROFFERSHANDLER = new OneToManyHandler<AbstractTravelogixSupplierOffer>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTTRAVELOGIXSUPPLIEROFFER,
	false,
	"supplierRateDef",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(FREESALELIMITED, AttributeMode.INITIAL);
		tmp.put(INVENTORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.absTravelogixSupplierOffers</code> attribute.
	 * @return the absTravelogixSupplierOffers
	 */
	public Collection<AbstractTravelogixSupplierOffer> getAbsTravelogixSupplierOffers(final SessionContext ctx)
	{
		return ABSTRAVELOGIXSUPPLIEROFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.absTravelogixSupplierOffers</code> attribute.
	 * @return the absTravelogixSupplierOffers
	 */
	public Collection<AbstractTravelogixSupplierOffer> getAbsTravelogixSupplierOffers()
	{
		return getAbsTravelogixSupplierOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.absTravelogixSupplierOffers</code> attribute. 
	 * @param value the absTravelogixSupplierOffers
	 */
	public void setAbsTravelogixSupplierOffers(final SessionContext ctx, final Collection<AbstractTravelogixSupplierOffer> value)
	{
		ABSTRAVELOGIXSUPPLIEROFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.absTravelogixSupplierOffers</code> attribute. 
	 * @param value the absTravelogixSupplierOffers
	 */
	public void setAbsTravelogixSupplierOffers(final Collection<AbstractTravelogixSupplierOffer> value)
	{
		setAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to absTravelogixSupplierOffers. 
	 * @param value the item to add to absTravelogixSupplierOffers
	 */
	public void addToAbsTravelogixSupplierOffers(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		ABSTRAVELOGIXSUPPLIEROFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to absTravelogixSupplierOffers. 
	 * @param value the item to add to absTravelogixSupplierOffers
	 */
	public void addToAbsTravelogixSupplierOffers(final AbstractTravelogixSupplierOffer value)
	{
		addToAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from absTravelogixSupplierOffers. 
	 * @param value the item to remove from absTravelogixSupplierOffers
	 */
	public void removeFromAbsTravelogixSupplierOffers(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		ABSTRAVELOGIXSUPPLIEROFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from absTravelogixSupplierOffers. 
	 * @param value the item to remove from absTravelogixSupplierOffers
	 */
	public void removeFromAbsTravelogixSupplierOffers(final AbstractTravelogixSupplierOffer value)
	{
		removeFromAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.dynamicPolicies</code> attribute.
	 * @return the dynamicPolicies
	 */
	public Collection<ActivityDynamicPolicy> getDynamicPolicies(final SessionContext ctx)
	{
		return DYNAMICPOLICIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.dynamicPolicies</code> attribute.
	 * @return the dynamicPolicies
	 */
	public Collection<ActivityDynamicPolicy> getDynamicPolicies()
	{
		return getDynamicPolicies( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.dynamicPolicies</code> attribute. 
	 * @param value the dynamicPolicies
	 */
	public void setDynamicPolicies(final SessionContext ctx, final Collection<ActivityDynamicPolicy> value)
	{
		DYNAMICPOLICIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.dynamicPolicies</code> attribute. 
	 * @param value the dynamicPolicies
	 */
	public void setDynamicPolicies(final Collection<ActivityDynamicPolicy> value)
	{
		setDynamicPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dynamicPolicies. 
	 * @param value the item to add to dynamicPolicies
	 */
	public void addToDynamicPolicies(final SessionContext ctx, final ActivityDynamicPolicy value)
	{
		DYNAMICPOLICIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to dynamicPolicies. 
	 * @param value the item to add to dynamicPolicies
	 */
	public void addToDynamicPolicies(final ActivityDynamicPolicy value)
	{
		addToDynamicPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dynamicPolicies. 
	 * @param value the item to remove from dynamicPolicies
	 */
	public void removeFromDynamicPolicies(final SessionContext ctx, final ActivityDynamicPolicy value)
	{
		DYNAMICPOLICIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from dynamicPolicies. 
	 * @param value the item to remove from dynamicPolicies
	 */
	public void removeFromDynamicPolicies(final ActivityDynamicPolicy value)
	{
		removeFromDynamicPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute.
	 * @return the freeSaleLimited
	 */
	public Boolean isFreeSaleLimited(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FREESALELIMITED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute.
	 * @return the freeSaleLimited
	 */
	public Boolean isFreeSaleLimited()
	{
		return isFreeSaleLimited( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute. 
	 * @return the freeSaleLimited
	 */
	public boolean isFreeSaleLimitedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFreeSaleLimited( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute. 
	 * @return the freeSaleLimited
	 */
	public boolean isFreeSaleLimitedAsPrimitive()
	{
		return isFreeSaleLimitedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute. 
	 * @param value the freeSaleLimited
	 */
	public void setFreeSaleLimited(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FREESALELIMITED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute. 
	 * @param value the freeSaleLimited
	 */
	public void setFreeSaleLimited(final Boolean value)
	{
		setFreeSaleLimited( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute. 
	 * @param value the freeSaleLimited
	 */
	public void setFreeSaleLimited(final SessionContext ctx, final boolean value)
	{
		setFreeSaleLimited( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.freeSaleLimited</code> attribute. 
	 * @param value the freeSaleLimited
	 */
	public void setFreeSaleLimited(final boolean value)
	{
		setFreeSaleLimited( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.inventory</code> attribute.
	 * @return the inventory
	 */
	public ActivityInventory getInventory(final SessionContext ctx)
	{
		return (ActivityInventory)getProperty( ctx, INVENTORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.inventory</code> attribute.
	 * @return the inventory
	 */
	public ActivityInventory getInventory()
	{
		return getInventory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.inventory</code> attribute. 
	 * @param value the inventory
	 */
	public void setInventory(final SessionContext ctx, final ActivityInventory value)
	{
		setProperty(ctx, INVENTORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.inventory</code> attribute. 
	 * @param value the inventory
	 */
	public void setInventory(final ActivityInventory value)
	{
		setInventory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.rateDetailDefs</code> attribute.
	 * @return the rateDetailDefs
	 */
	public Collection<ActivityRateDetailDefinition> getRateDetailDefs(final SessionContext ctx)
	{
		return RATEDETAILDEFSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivitySupplierRateDefinition.rateDetailDefs</code> attribute.
	 * @return the rateDetailDefs
	 */
	public Collection<ActivityRateDetailDefinition> getRateDetailDefs()
	{
		return getRateDetailDefs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.rateDetailDefs</code> attribute. 
	 * @param value the rateDetailDefs
	 */
	public void setRateDetailDefs(final SessionContext ctx, final Collection<ActivityRateDetailDefinition> value)
	{
		RATEDETAILDEFSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivitySupplierRateDefinition.rateDetailDefs</code> attribute. 
	 * @param value the rateDetailDefs
	 */
	public void setRateDetailDefs(final Collection<ActivityRateDetailDefinition> value)
	{
		setRateDetailDefs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rateDetailDefs. 
	 * @param value the item to add to rateDetailDefs
	 */
	public void addToRateDetailDefs(final SessionContext ctx, final ActivityRateDetailDefinition value)
	{
		RATEDETAILDEFSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rateDetailDefs. 
	 * @param value the item to add to rateDetailDefs
	 */
	public void addToRateDetailDefs(final ActivityRateDetailDefinition value)
	{
		addToRateDetailDefs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rateDetailDefs. 
	 * @param value the item to remove from rateDetailDefs
	 */
	public void removeFromRateDetailDefs(final SessionContext ctx, final ActivityRateDetailDefinition value)
	{
		RATEDETAILDEFSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rateDetailDefs. 
	 * @param value the item to remove from rateDetailDefs
	 */
	public void removeFromRateDetailDefs(final ActivityRateDetailDefinition value)
	{
		removeFromRateDetailDefs( getSession().getSessionContext(), value );
	}
	
}
