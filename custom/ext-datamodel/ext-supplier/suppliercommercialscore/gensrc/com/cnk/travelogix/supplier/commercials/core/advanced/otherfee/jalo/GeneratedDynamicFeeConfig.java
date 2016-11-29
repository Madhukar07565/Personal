/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo.SupplierOtherFeeCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo.DynamicFeeConfig DynamicFeeConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDynamicFeeConfig extends GenericItem
{
	/** Qualifier of the <code>DynamicFeeConfig.commercialHead</code> attribute **/
	public static final String COMMERCIALHEAD = "commercialHead";
	/** Qualifier of the <code>DynamicFeeConfig.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>DynamicFeeConfig.from</code> attribute **/
	public static final String FROM = "from";
	/** Qualifier of the <code>DynamicFeeConfig.to</code> attribute **/
	public static final String TO = "to";
	/** Qualifier of the <code>DynamicFeeConfig.commercial</code> attribute **/
	public static final String COMMERCIAL = "commercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDynamicFeeConfig> COMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedDynamicFeeConfig>(
	SuppliercommercialscoreConstants.TC.DYNAMICFEECONFIG,
	false,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMMERCIALHEAD, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(FROM, AttributeMode.INITIAL);
		tmp.put(TO, AttributeMode.INITIAL);
		tmp.put(COMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierOtherFeeCommercialRecord getCommercial(final SessionContext ctx)
	{
		return (SupplierOtherFeeCommercialRecord)getProperty( ctx, COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierOtherFeeCommercialRecord getCommercial()
	{
		return getCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SessionContext ctx, final SupplierOtherFeeCommercialRecord value)
	{
		COMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SupplierOtherFeeCommercialRecord value)
	{
		setCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALHEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead()
	{
		return getCommercialHead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALHEAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final EnumerationValue value)
	{
		setCommercialHead( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.from</code> attribute.
	 * @return the from
	 */
	public Date getFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.from</code> attribute.
	 * @return the from
	 */
	public Date getFrom()
	{
		return getFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.from</code> attribute. 
	 * @param value the from
	 */
	public void setFrom(final Date value)
	{
		setFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage()
	{
		return getPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive()
	{
		return getPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final double value)
	{
		setPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.to</code> attribute.
	 * @return the to
	 */
	public Date getTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DynamicFeeConfig.to</code> attribute.
	 * @return the to
	 */
	public Date getTo()
	{
		return getTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DynamicFeeConfig.to</code> attribute. 
	 * @param value the to
	 */
	public void setTo(final Date value)
	{
		setTo( getSession().getSessionContext(), value );
	}
	
}
