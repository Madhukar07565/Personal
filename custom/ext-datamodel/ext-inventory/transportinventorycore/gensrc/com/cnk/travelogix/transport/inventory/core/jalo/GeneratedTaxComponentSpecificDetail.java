/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.order.price.Tax;
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
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.TaxComponentSpecificDetail TaxComponentSpecificDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTaxComponentSpecificDetail extends GenericItem
{
	/** Qualifier of the <code>TaxComponentSpecificDetail.taxComponent</code> attribute **/
	public static final String TAXCOMPONENT = "taxComponent";
	/** Qualifier of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute **/
	public static final String FAREINCLUSIVE = "fareInclusive";
	/** Qualifier of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute **/
	public static final String PULLEDFROMSUPPLIER = "pulledFromSupplier";
	/** Qualifier of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute **/
	public static final String PULLEDFULL = "pulledFull";
	/** Qualifier of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute **/
	public static final String PERCENTAGEAMOUNT = "percentageAmount";
	/** Qualifier of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute **/
	public static final String ACTUALAMOUNT = "actualAmount";
	/** Qualifier of the <code>TaxComponentSpecificDetail.cabinClass</code> attribute **/
	public static final String CABINCLASS = "cabinClass";
	/** Qualifier of the <code>TaxComponentSpecificDetail.taxes</code> attribute **/
	public static final String TAXES = "taxes";
	/** Qualifier of the <code>TaxComponentSpecificDetail.applicableFareComponent</code> attribute **/
	public static final String APPLICABLEFARECOMPONENT = "applicableFareComponent";
	/** Relation ordering override parameter constants for TaxComponentSpecificDetailToFareComponent from ((transportinventorycore))*/
	protected static String TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_SRC_ORDERED = "relation.TaxComponentSpecificDetailToFareComponent.source.ordered";
	protected static String TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_TGT_ORDERED = "relation.TaxComponentSpecificDetailToFareComponent.target.ordered";
	/** Relation disable markmodifed parameter constants for TaxComponentSpecificDetailToFareComponent from ((transportinventorycore))*/
	protected static String TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_MARKMODIFIED = "relation.TaxComponentSpecificDetailToFareComponent.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TAXES's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTaxComponentSpecificDetail> TAXESHANDLER = new BidirectionalOneToManyHandler<GeneratedTaxComponentSpecificDetail>(
	TransportinventorycoreConstants.TC.TAXCOMPONENTSPECIFICDETAIL,
	false,
	"taxes",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TAXCOMPONENT, AttributeMode.INITIAL);
		tmp.put(FAREINCLUSIVE, AttributeMode.INITIAL);
		tmp.put(PULLEDFROMSUPPLIER, AttributeMode.INITIAL);
		tmp.put(PULLEDFULL, AttributeMode.INITIAL);
		tmp.put(PERCENTAGEAMOUNT, AttributeMode.INITIAL);
		tmp.put(ACTUALAMOUNT, AttributeMode.INITIAL);
		tmp.put(CABINCLASS, AttributeMode.INITIAL);
		tmp.put(TAXES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute.
	 * @return the actualAmount
	 */
	public Double getActualAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, ACTUALAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute.
	 * @return the actualAmount
	 */
	public Double getActualAmount()
	{
		return getActualAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute. 
	 * @return the actualAmount
	 */
	public double getActualAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getActualAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute. 
	 * @return the actualAmount
	 */
	public double getActualAmountAsPrimitive()
	{
		return getActualAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute. 
	 * @param value the actualAmount
	 */
	public void setActualAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, ACTUALAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute. 
	 * @param value the actualAmount
	 */
	public void setActualAmount(final Double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute. 
	 * @param value the actualAmount
	 */
	public void setActualAmount(final SessionContext ctx, final double value)
	{
		setActualAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.actualAmount</code> attribute. 
	 * @param value the actualAmount
	 */
	public void setActualAmount(final double value)
	{
		setActualAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.applicableFareComponent</code> attribute.
	 * @return the applicableFareComponent
	 */
	public Collection<FareComponent> getApplicableFareComponent(final SessionContext ctx)
	{
		final List<FareComponent> items = getLinkedItems( 
			ctx,
			true,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			"FareComponent",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.applicableFareComponent</code> attribute.
	 * @return the applicableFareComponent
	 */
	public Collection<FareComponent> getApplicableFareComponent()
	{
		return getApplicableFareComponent( getSession().getSessionContext() );
	}
	
	public long getApplicableFareComponentCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			"FareComponent",
			null
		);
	}
	
	public long getApplicableFareComponentCount()
	{
		return getApplicableFareComponentCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.applicableFareComponent</code> attribute. 
	 * @param value the applicableFareComponent
	 */
	public void setApplicableFareComponent(final SessionContext ctx, final Collection<FareComponent> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.applicableFareComponent</code> attribute. 
	 * @param value the applicableFareComponent
	 */
	public void setApplicableFareComponent(final Collection<FareComponent> value)
	{
		setApplicableFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to applicableFareComponent. 
	 * @param value the item to add to applicableFareComponent
	 */
	public void addToApplicableFareComponent(final SessionContext ctx, final FareComponent value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to applicableFareComponent. 
	 * @param value the item to add to applicableFareComponent
	 */
	public void addToApplicableFareComponent(final FareComponent value)
	{
		addToApplicableFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from applicableFareComponent. 
	 * @param value the item to remove from applicableFareComponent
	 */
	public void removeFromApplicableFareComponent(final SessionContext ctx, final FareComponent value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportinventorycoreConstants.Relations.TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TAXCOMPONENTSPECIFICDETAILTOFARECOMPONENT_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from applicableFareComponent. 
	 * @param value the item to remove from applicableFareComponent
	 */
	public void removeFromApplicableFareComponent(final FareComponent value)
	{
		removeFromApplicableFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public EnumerationValue getCabinClass(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CABINCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.cabinClass</code> attribute.
	 * @return the cabinClass
	 */
	public EnumerationValue getCabinClass()
	{
		return getCabinClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CABINCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.cabinClass</code> attribute. 
	 * @param value the cabinClass
	 */
	public void setCabinClass(final EnumerationValue value)
	{
		setCabinClass( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TAXESHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute.
	 * @return the fareInclusive
	 */
	public Boolean isFareInclusive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FAREINCLUSIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute.
	 * @return the fareInclusive
	 */
	public Boolean isFareInclusive()
	{
		return isFareInclusive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute. 
	 * @return the fareInclusive
	 */
	public boolean isFareInclusiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFareInclusive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute. 
	 * @return the fareInclusive
	 */
	public boolean isFareInclusiveAsPrimitive()
	{
		return isFareInclusiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute. 
	 * @param value the fareInclusive
	 */
	public void setFareInclusive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FAREINCLUSIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute. 
	 * @param value the fareInclusive
	 */
	public void setFareInclusive(final Boolean value)
	{
		setFareInclusive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute. 
	 * @param value the fareInclusive
	 */
	public void setFareInclusive(final SessionContext ctx, final boolean value)
	{
		setFareInclusive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.fareInclusive</code> attribute. 
	 * @param value the fareInclusive
	 */
	public void setFareInclusive(final boolean value)
	{
		setFareInclusive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute.
	 * @return the percentageAmount
	 */
	public Double getPercentageAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGEAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute.
	 * @return the percentageAmount
	 */
	public Double getPercentageAmount()
	{
		return getPercentageAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute. 
	 * @return the percentageAmount
	 */
	public double getPercentageAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentageAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute. 
	 * @return the percentageAmount
	 */
	public double getPercentageAmountAsPrimitive()
	{
		return getPercentageAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute. 
	 * @param value the percentageAmount
	 */
	public void setPercentageAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGEAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute. 
	 * @param value the percentageAmount
	 */
	public void setPercentageAmount(final Double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute. 
	 * @param value the percentageAmount
	 */
	public void setPercentageAmount(final SessionContext ctx, final double value)
	{
		setPercentageAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.percentageAmount</code> attribute. 
	 * @param value the percentageAmount
	 */
	public void setPercentageAmount(final double value)
	{
		setPercentageAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute.
	 * @return the pulledFromSupplier
	 */
	public Boolean isPulledFromSupplier(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PULLEDFROMSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute.
	 * @return the pulledFromSupplier
	 */
	public Boolean isPulledFromSupplier()
	{
		return isPulledFromSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute. 
	 * @return the pulledFromSupplier
	 */
	public boolean isPulledFromSupplierAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPulledFromSupplier( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute. 
	 * @return the pulledFromSupplier
	 */
	public boolean isPulledFromSupplierAsPrimitive()
	{
		return isPulledFromSupplierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute. 
	 * @param value the pulledFromSupplier
	 */
	public void setPulledFromSupplier(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PULLEDFROMSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute. 
	 * @param value the pulledFromSupplier
	 */
	public void setPulledFromSupplier(final Boolean value)
	{
		setPulledFromSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute. 
	 * @param value the pulledFromSupplier
	 */
	public void setPulledFromSupplier(final SessionContext ctx, final boolean value)
	{
		setPulledFromSupplier( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.pulledFromSupplier</code> attribute. 
	 * @param value the pulledFromSupplier
	 */
	public void setPulledFromSupplier(final boolean value)
	{
		setPulledFromSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute.
	 * @return the pulledFull
	 */
	public Boolean isPulledFull(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PULLEDFULL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute.
	 * @return the pulledFull
	 */
	public Boolean isPulledFull()
	{
		return isPulledFull( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute. 
	 * @return the pulledFull
	 */
	public boolean isPulledFullAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPulledFull( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute. 
	 * @return the pulledFull
	 */
	public boolean isPulledFullAsPrimitive()
	{
		return isPulledFullAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute. 
	 * @param value the pulledFull
	 */
	public void setPulledFull(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PULLEDFULL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute. 
	 * @param value the pulledFull
	 */
	public void setPulledFull(final Boolean value)
	{
		setPulledFull( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute. 
	 * @param value the pulledFull
	 */
	public void setPulledFull(final SessionContext ctx, final boolean value)
	{
		setPulledFull( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.pulledFull</code> attribute. 
	 * @param value the pulledFull
	 */
	public void setPulledFull(final boolean value)
	{
		setPulledFull( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.taxComponent</code> attribute.
	 * @return the taxComponent
	 */
	public EnumerationValue getTaxComponent(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TAXCOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.taxComponent</code> attribute.
	 * @return the taxComponent
	 */
	public EnumerationValue getTaxComponent()
	{
		return getTaxComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.taxComponent</code> attribute. 
	 * @param value the taxComponent
	 */
	public void setTaxComponent(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TAXCOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.taxComponent</code> attribute. 
	 * @param value the taxComponent
	 */
	public void setTaxComponent(final EnumerationValue value)
	{
		setTaxComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.taxes</code> attribute.
	 * @return the taxes
	 */
	public Tax getTaxes(final SessionContext ctx)
	{
		return (Tax)getProperty( ctx, TAXES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TaxComponentSpecificDetail.taxes</code> attribute.
	 * @return the taxes
	 */
	public Tax getTaxes()
	{
		return getTaxes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final SessionContext ctx, final Tax value)
	{
		TAXESHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TaxComponentSpecificDetail.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final Tax value)
	{
		setTaxes( getSession().getSessionContext(), value );
	}
	
}
