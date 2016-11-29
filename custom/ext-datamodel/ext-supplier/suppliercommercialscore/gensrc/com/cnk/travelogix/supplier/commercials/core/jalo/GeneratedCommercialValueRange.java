/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.SlabCommercialValue;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.CommercialValueRange CommercialValueRange}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommercialValueRange extends GenericItem
{
	/** Qualifier of the <code>CommercialValueRange.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>CommercialValueRange.from</code> attribute **/
	public static final String FROM = "from";
	/** Qualifier of the <code>CommercialValueRange.to</code> attribute **/
	public static final String TO = "to";
	/** Qualifier of the <code>CommercialValueRange.fromInWords</code> attribute **/
	public static final String FROMINWORDS = "fromInWords";
	/** Qualifier of the <code>CommercialValueRange.toInWords</code> attribute **/
	public static final String TOINWORDS = "toInWords";
	/** Qualifier of the <code>CommercialValueRange.slabcommvalue</code> attribute **/
	public static final String SLABCOMMVALUE = "slabcommvalue";
	/** Relation ordering override parameter constants for slabcommValue2valueRange from ((suppliercommercialscore))*/
	protected static String SLABCOMMVALUE2VALUERANGE_SRC_ORDERED = "relation.slabcommValue2valueRange.source.ordered";
	protected static String SLABCOMMVALUE2VALUERANGE_TGT_ORDERED = "relation.slabcommValue2valueRange.target.ordered";
	/** Relation disable markmodifed parameter constants for slabcommValue2valueRange from ((suppliercommercialscore))*/
	protected static String SLABCOMMVALUE2VALUERANGE_MARKMODIFIED = "relation.slabcommValue2valueRange.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(FROM, AttributeMode.INITIAL);
		tmp.put(TO, AttributeMode.INITIAL);
		tmp.put(FROMINWORDS, AttributeMode.INITIAL);
		tmp.put(TOINWORDS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.from</code> attribute.
	 * @return the from
	 */
	public Double getFrom(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, FROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.from</code> attribute.
	 * @return the from
	 */
	public Double getFrom()
	{
		return getFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.from</code> attribute. 
	 * @return the from
	 */
	public double getFromAsPrimitive(final SessionContext ctx)
	{
		Double value = getFrom( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.from</code> attribute. 
	 * @return the from
	 */
	public double getFromAsPrimitive()
	{
		return getFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, FROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final Double value)
	{
		setFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final SessionContext ctx, final double value)
	{
		setFrom( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final double value)
	{
		setFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.fromInWords</code> attribute.
	 * @return the fromInWords
	 */
	public String getFromInWords(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMINWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.fromInWords</code> attribute.
	 * @return the fromInWords
	 */
	public String getFromInWords()
	{
		return getFromInWords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.fromInWords</code> attribute. 
	 * @param value the fromInWords
	 */
	public void setFromInWords(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMINWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.fromInWords</code> attribute. 
	 * @param value the fromInWords
	 */
	public void setFromInWords(final String value)
	{
		setFromInWords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.slabcommvalue</code> attribute.
	 * @return the slabcommvalue
	 */
	public Set<SlabCommercialValue> getSlabcommvalue(final SessionContext ctx)
	{
		final List<SlabCommercialValue> items = getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			"SlabCommercialValue",
			null,
			false,
			false
		);
		return new LinkedHashSet<SlabCommercialValue>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.slabcommvalue</code> attribute.
	 * @return the slabcommvalue
	 */
	public Set<SlabCommercialValue> getSlabcommvalue()
	{
		return getSlabcommvalue( getSession().getSessionContext() );
	}
	
	public long getSlabcommvalueCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			"SlabCommercialValue",
			null
		);
	}
	
	public long getSlabcommvalueCount()
	{
		return getSlabcommvalueCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.slabcommvalue</code> attribute. 
	 * @param value the slabcommvalue
	 */
	public void setSlabcommvalue(final SessionContext ctx, final Set<SlabCommercialValue> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SLABCOMMVALUE2VALUERANGE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.slabcommvalue</code> attribute. 
	 * @param value the slabcommvalue
	 */
	public void setSlabcommvalue(final Set<SlabCommercialValue> value)
	{
		setSlabcommvalue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to slabcommvalue. 
	 * @param value the item to add to slabcommvalue
	 */
	public void addToSlabcommvalue(final SessionContext ctx, final SlabCommercialValue value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SLABCOMMVALUE2VALUERANGE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to slabcommvalue. 
	 * @param value the item to add to slabcommvalue
	 */
	public void addToSlabcommvalue(final SlabCommercialValue value)
	{
		addToSlabcommvalue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from slabcommvalue. 
	 * @param value the item to remove from slabcommvalue
	 */
	public void removeFromSlabcommvalue(final SessionContext ctx, final SlabCommercialValue value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.SLABCOMMVALUE2VALUERANGE,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SLABCOMMVALUE2VALUERANGE_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from slabcommvalue. 
	 * @param value the item to remove from slabcommvalue
	 */
	public void removeFromSlabcommvalue(final SlabCommercialValue value)
	{
		removeFromSlabcommvalue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.to</code> attribute.
	 * @return the to
	 */
	public Double getTo(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.to</code> attribute.
	 * @return the to
	 */
	public Double getTo()
	{
		return getTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.to</code> attribute. 
	 * @return the to
	 */
	public double getToAsPrimitive(final SessionContext ctx)
	{
		Double value = getTo( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.to</code> attribute. 
	 * @return the to
	 */
	public double getToAsPrimitive()
	{
		return getToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final Double value)
	{
		setTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final SessionContext ctx, final double value)
	{
		setTo( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final double value)
	{
		setTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.toInWords</code> attribute.
	 * @return the toInWords
	 */
	public String getToInWords(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOINWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialValueRange.toInWords</code> attribute.
	 * @return the toInWords
	 */
	public String getToInWords()
	{
		return getToInWords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.toInWords</code> attribute. 
	 * @param value the toInWords
	 */
	public void setToInWords(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOINWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialValueRange.toInWords</code> attribute. 
	 * @param value the toInWords
	 */
	public void setToInWords(final String value)
	{
		setToInWords( getSession().getSessionContext(), value );
	}
	
}
