/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo.SupplierTerminationFeeCommercialRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.termination.jalo.ReturnOfPayable ReturnOfPayable}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedReturnOfPayable extends GenericItem
{
	/** Qualifier of the <code>ReturnOfPayable.commercialHead</code> attribute **/
	public static final String COMMERCIALHEAD = "commercialHead";
	/** Qualifier of the <code>ReturnOfPayable.periodFrom</code> attribute **/
	public static final String PERIODFROM = "periodFrom";
	/** Qualifier of the <code>ReturnOfPayable.periodTo</code> attribute **/
	public static final String PERIODTO = "periodTo";
	/** Qualifier of the <code>ReturnOfPayable.interestPercentage</code> attribute **/
	public static final String INTERESTPERCENTAGE = "interestPercentage";
	/** Qualifier of the <code>ReturnOfPayable.commercial</code> attribute **/
	public static final String COMMERCIAL = "commercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedReturnOfPayable> COMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedReturnOfPayable>(
	SuppliercommercialscoreConstants.TC.RETURNOFPAYABLE,
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
		tmp.put(PERIODFROM, AttributeMode.INITIAL);
		tmp.put(PERIODTO, AttributeMode.INITIAL);
		tmp.put(INTERESTPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(COMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierTerminationFeeCommercialRecord getCommercial(final SessionContext ctx)
	{
		return (SupplierTerminationFeeCommercialRecord)getProperty( ctx, COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierTerminationFeeCommercialRecord getCommercial()
	{
		return getCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SessionContext ctx, final SupplierTerminationFeeCommercialRecord value)
	{
		COMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SupplierTerminationFeeCommercialRecord value)
	{
		setCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALHEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead()
	{
		return getCommercialHead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALHEAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.commercialHead</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.interestPercentage</code> attribute.
	 * @return the interestPercentage
	 */
	public Double getInterestPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, INTERESTPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.interestPercentage</code> attribute.
	 * @return the interestPercentage
	 */
	public Double getInterestPercentage()
	{
		return getInterestPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.interestPercentage</code> attribute. 
	 * @return the interestPercentage
	 */
	public double getInterestPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getInterestPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.interestPercentage</code> attribute. 
	 * @return the interestPercentage
	 */
	public double getInterestPercentageAsPrimitive()
	{
		return getInterestPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.interestPercentage</code> attribute. 
	 * @param value the interestPercentage
	 */
	public void setInterestPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, INTERESTPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.interestPercentage</code> attribute. 
	 * @param value the interestPercentage
	 */
	public void setInterestPercentage(final Double value)
	{
		setInterestPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.interestPercentage</code> attribute. 
	 * @param value the interestPercentage
	 */
	public void setInterestPercentage(final SessionContext ctx, final double value)
	{
		setInterestPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.interestPercentage</code> attribute. 
	 * @param value the interestPercentage
	 */
	public void setInterestPercentage(final double value)
	{
		setInterestPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.periodFrom</code> attribute.
	 * @return the periodFrom
	 */
	public Date getPeriodFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PERIODFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.periodFrom</code> attribute.
	 * @return the periodFrom
	 */
	public Date getPeriodFrom()
	{
		return getPeriodFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.periodFrom</code> attribute. 
	 * @param value the periodFrom
	 */
	public void setPeriodFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PERIODFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.periodFrom</code> attribute. 
	 * @param value the periodFrom
	 */
	public void setPeriodFrom(final Date value)
	{
		setPeriodFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.periodTo</code> attribute.
	 * @return the periodTo
	 */
	public Date getPeriodTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PERIODTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ReturnOfPayable.periodTo</code> attribute.
	 * @return the periodTo
	 */
	public Date getPeriodTo()
	{
		return getPeriodTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.periodTo</code> attribute. 
	 * @param value the periodTo
	 */
	public void setPeriodTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PERIODTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ReturnOfPayable.periodTo</code> attribute. 
	 * @param value the periodTo
	 */
	public void setPeriodTo(final Date value)
	{
		setPeriodTo( getSession().getSessionContext(), value );
	}
	
}
