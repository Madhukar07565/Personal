/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.accommodation;

import com.cnk.travelogix.supplier.masterdata.core.policy.AccoDynamicPolicy;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsaccommodationConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.AccoRateDetailDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.AccoSurchargeSuppDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.accommodation.AccommodationRateDefinition AccommodationRateDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccommodationRateDefinition extends AbstractRateDefinition
{
	/** Qualifier of the <code>AccommodationRateDefinition.priceApplicability</code> attribute **/
	public static final String PRICEAPPLICABILITY = "priceApplicability";
	/** Qualifier of the <code>AccommodationRateDefinition.noOfRooms</code> attribute **/
	public static final String NOOFROOMS = "noOfRooms";
	/** Qualifier of the <code>AccommodationRateDefinition.comparator</code> attribute **/
	public static final String COMPARATOR = "comparator";
	/** Qualifier of the <code>AccommodationRateDefinition.surchargeSupplement</code> attribute **/
	public static final String SURCHARGESUPPLEMENT = "surchargeSupplement";
	/** Qualifier of the <code>AccommodationRateDefinition.accoRateDetailDefs</code> attribute **/
	public static final String ACCORATEDETAILDEFS = "accoRateDetailDefs";
	/** Qualifier of the <code>AccommodationRateDefinition.accoDynamicPolicies</code> attribute **/
	public static final String ACCODYNAMICPOLICIES = "accoDynamicPolicies";
	/** Relation ordering override parameter constants for AccoRateDef2AccoDynamicPolicyRel from ((supplierratedefinitionsaccommodation))*/
	protected static String ACCORATEDEF2ACCODYNAMICPOLICYREL_SRC_ORDERED = "relation.AccoRateDef2AccoDynamicPolicyRel.source.ordered";
	protected static String ACCORATEDEF2ACCODYNAMICPOLICYREL_TGT_ORDERED = "relation.AccoRateDef2AccoDynamicPolicyRel.target.ordered";
	/** Relation disable markmodifed parameter constants for AccoRateDef2AccoDynamicPolicyRel from ((supplierratedefinitionsaccommodation))*/
	protected static String ACCORATEDEF2ACCODYNAMICPOLICYREL_MARKMODIFIED = "relation.AccoRateDef2AccoDynamicPolicyRel.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n ACCORATEDETAILDEFS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoRateDetailDefinition> ACCORATEDETAILDEFSHANDLER = new OneToManyHandler<AccoRateDetailDefinition>(
	SupplierratedefinitionsaccommodationConstants.TC.ACCORATEDETAILDEFINITION,
	false,
	"accoRateDef",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRICEAPPLICABILITY, AttributeMode.INITIAL);
		tmp.put(NOOFROOMS, AttributeMode.INITIAL);
		tmp.put(COMPARATOR, AttributeMode.INITIAL);
		tmp.put(SURCHARGESUPPLEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.accoDynamicPolicies</code> attribute.
	 * @return the accoDynamicPolicies
	 */
	public Set<AccoDynamicPolicy> getAccoDynamicPolicies(final SessionContext ctx)
	{
		final List<AccoDynamicPolicy> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			"AccoDynamicPolicy",
			null,
			false,
			false
		);
		return new LinkedHashSet<AccoDynamicPolicy>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.accoDynamicPolicies</code> attribute.
	 * @return the accoDynamicPolicies
	 */
	public Set<AccoDynamicPolicy> getAccoDynamicPolicies()
	{
		return getAccoDynamicPolicies( getSession().getSessionContext() );
	}
	
	public long getAccoDynamicPoliciesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			"AccoDynamicPolicy",
			null
		);
	}
	
	public long getAccoDynamicPoliciesCount()
	{
		return getAccoDynamicPoliciesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.accoDynamicPolicies</code> attribute. 
	 * @param value the accoDynamicPolicies
	 */
	public void setAccoDynamicPolicies(final SessionContext ctx, final Set<AccoDynamicPolicy> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDEF2ACCODYNAMICPOLICYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.accoDynamicPolicies</code> attribute. 
	 * @param value the accoDynamicPolicies
	 */
	public void setAccoDynamicPolicies(final Set<AccoDynamicPolicy> value)
	{
		setAccoDynamicPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoDynamicPolicies. 
	 * @param value the item to add to accoDynamicPolicies
	 */
	public void addToAccoDynamicPolicies(final SessionContext ctx, final AccoDynamicPolicy value)
	{
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDEF2ACCODYNAMICPOLICYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoDynamicPolicies. 
	 * @param value the item to add to accoDynamicPolicies
	 */
	public void addToAccoDynamicPolicies(final AccoDynamicPolicy value)
	{
		addToAccoDynamicPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoDynamicPolicies. 
	 * @param value the item to remove from accoDynamicPolicies
	 */
	public void removeFromAccoDynamicPolicies(final SessionContext ctx, final AccoDynamicPolicy value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDEF2ACCODYNAMICPOLICYREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDEF2ACCODYNAMICPOLICYREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoDynamicPolicies. 
	 * @param value the item to remove from accoDynamicPolicies
	 */
	public void removeFromAccoDynamicPolicies(final AccoDynamicPolicy value)
	{
		removeFromAccoDynamicPolicies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.accoRateDetailDefs</code> attribute.
	 * @return the accoRateDetailDefs
	 */
	public Set<AccoRateDetailDefinition> getAccoRateDetailDefs(final SessionContext ctx)
	{
		return (Set<AccoRateDetailDefinition>)ACCORATEDETAILDEFSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.accoRateDetailDefs</code> attribute.
	 * @return the accoRateDetailDefs
	 */
	public Set<AccoRateDetailDefinition> getAccoRateDetailDefs()
	{
		return getAccoRateDetailDefs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.accoRateDetailDefs</code> attribute. 
	 * @param value the accoRateDetailDefs
	 */
	public void setAccoRateDetailDefs(final SessionContext ctx, final Set<AccoRateDetailDefinition> value)
	{
		ACCORATEDETAILDEFSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.accoRateDetailDefs</code> attribute. 
	 * @param value the accoRateDetailDefs
	 */
	public void setAccoRateDetailDefs(final Set<AccoRateDetailDefinition> value)
	{
		setAccoRateDetailDefs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoRateDetailDefs. 
	 * @param value the item to add to accoRateDetailDefs
	 */
	public void addToAccoRateDetailDefs(final SessionContext ctx, final AccoRateDetailDefinition value)
	{
		ACCORATEDETAILDEFSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to accoRateDetailDefs. 
	 * @param value the item to add to accoRateDetailDefs
	 */
	public void addToAccoRateDetailDefs(final AccoRateDetailDefinition value)
	{
		addToAccoRateDetailDefs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoRateDetailDefs. 
	 * @param value the item to remove from accoRateDetailDefs
	 */
	public void removeFromAccoRateDetailDefs(final SessionContext ctx, final AccoRateDetailDefinition value)
	{
		ACCORATEDETAILDEFSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from accoRateDetailDefs. 
	 * @param value the item to remove from accoRateDetailDefs
	 */
	public void removeFromAccoRateDetailDefs(final AccoRateDetailDefinition value)
	{
		removeFromAccoRateDetailDefs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.comparator</code> attribute.
	 * @return the comparator
	 */
	public EnumerationValue getComparator(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPARATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.comparator</code> attribute.
	 * @return the comparator
	 */
	public EnumerationValue getComparator()
	{
		return getComparator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.comparator</code> attribute. 
	 * @param value the comparator
	 */
	public void setComparator(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPARATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.comparator</code> attribute. 
	 * @param value the comparator
	 */
	public void setComparator(final EnumerationValue value)
	{
		setComparator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.noOfRooms</code> attribute.
	 * @return the noOfRooms
	 */
	public Integer getNoOfRooms(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFROOMS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.noOfRooms</code> attribute.
	 * @return the noOfRooms
	 */
	public Integer getNoOfRooms()
	{
		return getNoOfRooms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.noOfRooms</code> attribute. 
	 * @return the noOfRooms
	 */
	public int getNoOfRoomsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfRooms( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.noOfRooms</code> attribute. 
	 * @return the noOfRooms
	 */
	public int getNoOfRoomsAsPrimitive()
	{
		return getNoOfRoomsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.noOfRooms</code> attribute. 
	 * @param value the noOfRooms
	 */
	public void setNoOfRooms(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFROOMS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.noOfRooms</code> attribute. 
	 * @param value the noOfRooms
	 */
	public void setNoOfRooms(final Integer value)
	{
		setNoOfRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.noOfRooms</code> attribute. 
	 * @param value the noOfRooms
	 */
	public void setNoOfRooms(final SessionContext ctx, final int value)
	{
		setNoOfRooms( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.noOfRooms</code> attribute. 
	 * @param value the noOfRooms
	 */
	public void setNoOfRooms(final int value)
	{
		setNoOfRooms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.priceApplicability</code> attribute.
	 * @return the priceApplicability
	 */
	public EnumerationValue getPriceApplicability(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRICEAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.priceApplicability</code> attribute.
	 * @return the priceApplicability
	 */
	public EnumerationValue getPriceApplicability()
	{
		return getPriceApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.priceApplicability</code> attribute. 
	 * @param value the priceApplicability
	 */
	public void setPriceApplicability(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRICEAPPLICABILITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.priceApplicability</code> attribute. 
	 * @param value the priceApplicability
	 */
	public void setPriceApplicability(final EnumerationValue value)
	{
		setPriceApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.surchargeSupplement</code> attribute.
	 * @return the surchargeSupplement
	 */
	public AccoSurchargeSuppDetail getSurchargeSupplement(final SessionContext ctx)
	{
		return (AccoSurchargeSuppDetail)getProperty( ctx, SURCHARGESUPPLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccommodationRateDefinition.surchargeSupplement</code> attribute.
	 * @return the surchargeSupplement
	 */
	public AccoSurchargeSuppDetail getSurchargeSupplement()
	{
		return getSurchargeSupplement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.surchargeSupplement</code> attribute. 
	 * @param value the surchargeSupplement
	 */
	public void setSurchargeSupplement(final SessionContext ctx, final AccoSurchargeSuppDetail value)
	{
		setProperty(ctx, SURCHARGESUPPLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccommodationRateDefinition.surchargeSupplement</code> attribute. 
	 * @param value the surchargeSupplement
	 */
	public void setSurchargeSupplement(final AccoSurchargeSuppDetail value)
	{
		setSurchargeSupplement( getSession().getSessionContext(), value );
	}
	
}
