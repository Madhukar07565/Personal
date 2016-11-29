/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.OtherFeeCompanyCommercial;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.Fees Fees}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFees extends GenericItem
{
	/** Qualifier of the <code>Fees.commercialHead</code> attribute **/
	public static final String COMMERCIALHEAD = "commercialHead";
	/** Qualifier of the <code>Fees.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>Fees.dates</code> attribute **/
	public static final String DATES = "dates";
	/** Qualifier of the <code>Fees.otherFee</code> attribute **/
	public static final String OTHERFEE = "otherFee";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n OTHERFEE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFees> OTHERFEEHANDLER = new BidirectionalOneToManyHandler<GeneratedFees>(
	ClientcommercialsConstants.TC.FEES,
	false,
	"otherFee",
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
		tmp.put(DATES, AttributeMode.INITIAL);
		tmp.put(OTHERFEE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALHEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead()
	{
		return getCommercialHead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALHEAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final EnumerationValue value)
	{
		setCommercialHead( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		OTHERFEEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.dates</code> attribute.
	 * @return the dates
	 */
	public StandardDateRange getDates(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, DATES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.dates</code> attribute.
	 * @return the dates
	 */
	public StandardDateRange getDates()
	{
		return getDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.dates</code> attribute. 
	 * @param value the dates
	 */
	public void setDates(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, DATES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.dates</code> attribute. 
	 * @param value the dates
	 */
	public void setDates(final StandardDateRange value)
	{
		setDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.otherFee</code> attribute.
	 * @return the otherFee
	 */
	public OtherFeeCompanyCommercial getOtherFee(final SessionContext ctx)
	{
		return (OtherFeeCompanyCommercial)getProperty( ctx, OTHERFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.otherFee</code> attribute.
	 * @return the otherFee
	 */
	public OtherFeeCompanyCommercial getOtherFee()
	{
		return getOtherFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.otherFee</code> attribute. 
	 * @param value the otherFee
	 */
	public void setOtherFee(final SessionContext ctx, final OtherFeeCompanyCommercial value)
	{
		OTHERFEEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.otherFee</code> attribute. 
	 * @param value the otherFee
	 */
	public void setOtherFee(final OtherFeeCompanyCommercial value)
	{
		setOtherFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage()
	{
		return getPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Fees.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive()
	{
		return getPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final double value)
	{
		setPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Fees.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
}
