/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialValue;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialValueRange;
import com.cnk.travelogix.supplier.commercials.core.jalo.FixedCommercialValue;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SlabCommercialValue SlabCommercialValue}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSlabCommercialValue extends AbstractCommercialValue
{
	/** Qualifier of the <code>SlabCommercialValue.segment</code> attribute **/
	public static final String SEGMENT = "segment";
	/** Qualifier of the <code>SlabCommercialValue.cumulative</code> attribute **/
	public static final String CUMULATIVE = "cumulative";
	/** Qualifier of the <code>SlabCommercialValue.slabType</code> attribute **/
	public static final String SLABTYPE = "slabType";
	/** Qualifier of the <code>SlabCommercialValue.fareComponent</code> attribute **/
	public static final String FARECOMPONENT = "fareComponent";
	/** Qualifier of the <code>SlabCommercialValue.commercialValues</code> attribute **/
	public static final String COMMERCIALVALUES = "commercialValues";
	/** Qualifier of the <code>SlabCommercialValue.fixValues</code> attribute **/
	public static final String FIXVALUES = "fixValues";
	/** Relation ordering override parameter constants for slabcommValue2valueRange from ((suppliercommercialscore))*/
	protected static String SLABCOMMVALUE2VALUERANGE_SRC_ORDERED = "relation.slabcommValue2valueRange.source.ordered";
	protected static String SLABCOMMVALUE2VALUERANGE_TGT_ORDERED = "relation.slabcommValue2valueRange.target.ordered";
	/** Relation disable markmodifed parameter constants for slabcommValue2valueRange from ((suppliercommercialscore))*/
	protected static String SLABCOMMVALUE2VALUERANGE_MARKMODIFIED = "relation.slabcommValue2valueRange.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n COMMERCIALVALUES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<FixedCommercialValue> COMMERCIALVALUESHANDLER = new OneToManyHandler<FixedCommercialValue>(
	SuppliercommercialscoreConstants.TC.FIXEDCOMMERCIALVALUE,
	true,
	"slabCommercialValue",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialValue.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SEGMENT, AttributeMode.INITIAL);
		tmp.put(CUMULATIVE, AttributeMode.INITIAL);
		tmp.put(SLABTYPE, AttributeMode.INITIAL);
		tmp.put(FARECOMPONENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.commercialValues</code> attribute.
	 * @return the commercialValues
	 */
	public Collection<FixedCommercialValue> getCommercialValues(final SessionContext ctx)
	{
		return COMMERCIALVALUESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.commercialValues</code> attribute.
	 * @return the commercialValues
	 */
	public Collection<FixedCommercialValue> getCommercialValues()
	{
		return getCommercialValues( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.commercialValues</code> attribute. 
	 * @param value the commercialValues
	 */
	public void setCommercialValues(final SessionContext ctx, final Collection<FixedCommercialValue> value)
	{
		COMMERCIALVALUESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.commercialValues</code> attribute. 
	 * @param value the commercialValues
	 */
	public void setCommercialValues(final Collection<FixedCommercialValue> value)
	{
		setCommercialValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialValues. 
	 * @param value the item to add to commercialValues
	 */
	public void addToCommercialValues(final SessionContext ctx, final FixedCommercialValue value)
	{
		COMMERCIALVALUESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commercialValues. 
	 * @param value the item to add to commercialValues
	 */
	public void addToCommercialValues(final FixedCommercialValue value)
	{
		addToCommercialValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialValues. 
	 * @param value the item to remove from commercialValues
	 */
	public void removeFromCommercialValues(final SessionContext ctx, final FixedCommercialValue value)
	{
		COMMERCIALVALUESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commercialValues. 
	 * @param value the item to remove from commercialValues
	 */
	public void removeFromCommercialValues(final FixedCommercialValue value)
	{
		removeFromCommercialValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.cumulative</code> attribute.
	 * @return the cumulative
	 */
	public Boolean isCumulative(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CUMULATIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.cumulative</code> attribute.
	 * @return the cumulative
	 */
	public Boolean isCumulative()
	{
		return isCumulative( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.cumulative</code> attribute. 
	 * @return the cumulative
	 */
	public boolean isCumulativeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCumulative( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.cumulative</code> attribute. 
	 * @return the cumulative
	 */
	public boolean isCumulativeAsPrimitive()
	{
		return isCumulativeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.cumulative</code> attribute. 
	 * @param value the cumulative
	 */
	public void setCumulative(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CUMULATIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.cumulative</code> attribute. 
	 * @param value the cumulative
	 */
	public void setCumulative(final Boolean value)
	{
		setCumulative( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.cumulative</code> attribute. 
	 * @param value the cumulative
	 */
	public void setCumulative(final SessionContext ctx, final boolean value)
	{
		setCumulative( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.cumulative</code> attribute. 
	 * @param value the cumulative
	 */
	public void setCumulative(final boolean value)
	{
		setCumulative( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent(final SessionContext ctx)
	{
		return (FareComponent)getProperty( ctx, FARECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent()
	{
		return getFareComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final SessionContext ctx, final FareComponent value)
	{
		setProperty(ctx, FARECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final FareComponent value)
	{
		setFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.fixValues</code> attribute.
	 * @return the fixValues
	 */
	public Set<CommercialValueRange> getFixValues(final SessionContext ctx)
	{
		final List<CommercialValueRange> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			"CommercialValueRange",
			null,
			false,
			false
		);
		return new LinkedHashSet<CommercialValueRange>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.fixValues</code> attribute.
	 * @return the fixValues
	 */
	public Set<CommercialValueRange> getFixValues()
	{
		return getFixValues( getSession().getSessionContext() );
	}
	
	public long getFixValuesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			"CommercialValueRange",
			null
		);
	}
	
	public long getFixValuesCount()
	{
		return getFixValuesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.fixValues</code> attribute. 
	 * @param value the fixValues
	 */
	public void setFixValues(final SessionContext ctx, final Set<CommercialValueRange> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SLABCOMMVALUE2VALUERANGE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.fixValues</code> attribute. 
	 * @param value the fixValues
	 */
	public void setFixValues(final Set<CommercialValueRange> value)
	{
		setFixValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fixValues. 
	 * @param value the item to add to fixValues
	 */
	public void addToFixValues(final SessionContext ctx, final CommercialValueRange value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SLABCOMMVALUE2VALUERANGE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to fixValues. 
	 * @param value the item to add to fixValues
	 */
	public void addToFixValues(final CommercialValueRange value)
	{
		addToFixValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fixValues. 
	 * @param value the item to remove from fixValues
	 */
	public void removeFromFixValues(final SessionContext ctx, final CommercialValueRange value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SLABCOMMVALUE2VALUERANGE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from fixValues. 
	 * @param value the item to remove from fixValues
	 */
	public void removeFromFixValues(final CommercialValueRange value)
	{
		removeFromFixValues( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.segment</code> attribute.
	 * @return the segment
	 */
	public EnumerationValue getSegment(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SEGMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.segment</code> attribute.
	 * @return the segment
	 */
	public EnumerationValue getSegment()
	{
		return getSegment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.segment</code> attribute. 
	 * @param value the segment
	 */
	public void setSegment(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SEGMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.segment</code> attribute. 
	 * @param value the segment
	 */
	public void setSegment(final EnumerationValue value)
	{
		setSegment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SlabCommercialValue.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType()
	{
		return getSlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SlabCommercialValue.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final EnumerationValue value)
	{
		setSlabType( getSession().getSessionContext(), value );
	}
	
}
