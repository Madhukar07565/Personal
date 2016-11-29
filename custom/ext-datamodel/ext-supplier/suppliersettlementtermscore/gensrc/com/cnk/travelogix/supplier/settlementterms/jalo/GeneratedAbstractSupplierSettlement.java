/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.AbstractSupplierSettlement AbstractSupplierSettlement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractSupplierSettlement extends GenericItem
{
	/** Qualifier of the <code>AbstractSupplierSettlement.commercialHead</code> attribute **/
	public static final String COMMERCIALHEAD = "commercialHead";
	/** Qualifier of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute **/
	public static final String INTERESTAPPLICABLE = "interestApplicable";
	/** Qualifier of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute **/
	public static final String INTERESTPERCENTAGE = "interestPercentage";
	/** Qualifier of the <code>AbstractSupplierSettlement.interestpercentageBasis</code> attribute **/
	public static final String INTERESTPERCENTAGEBASIS = "interestpercentageBasis";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMMERCIALHEAD, AttributeMode.INITIAL);
		tmp.put(INTERESTAPPLICABLE, AttributeMode.INITIAL);
		tmp.put(INTERESTPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(INTERESTPERCENTAGEBASIS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALHEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.commercialHead</code> attribute.
	 * @return the commercialHead
	 */
	public EnumerationValue getCommercialHead()
	{
		return getCommercialHead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALHEAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.commercialHead</code> attribute. 
	 * @param value the commercialHead
	 */
	public void setCommercialHead(final EnumerationValue value)
	{
		setCommercialHead( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute.
	 * @return the interestApplicable
	 */
	public Boolean isInterestApplicable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INTERESTAPPLICABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute.
	 * @return the interestApplicable
	 */
	public Boolean isInterestApplicable()
	{
		return isInterestApplicable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute. 
	 * @return the interestApplicable
	 */
	public boolean isInterestApplicableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInterestApplicable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute. 
	 * @return the interestApplicable
	 */
	public boolean isInterestApplicableAsPrimitive()
	{
		return isInterestApplicableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute. 
	 * @param value the interestApplicable
	 */
	public void setInterestApplicable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INTERESTAPPLICABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute. 
	 * @param value the interestApplicable
	 */
	public void setInterestApplicable(final Boolean value)
	{
		setInterestApplicable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute. 
	 * @param value the interestApplicable
	 */
	public void setInterestApplicable(final SessionContext ctx, final boolean value)
	{
		setInterestApplicable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestApplicable</code> attribute. 
	 * @param value the interestApplicable
	 */
	public void setInterestApplicable(final boolean value)
	{
		setInterestApplicable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute.
	 * @return the interestPercentage
	 */
	public Double getInterestPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, INTERESTPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute.
	 * @return the interestPercentage
	 */
	public Double getInterestPercentage()
	{
		return getInterestPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute. 
	 * @return the interestPercentage
	 */
	public double getInterestPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getInterestPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute. 
	 * @return the interestPercentage
	 */
	public double getInterestPercentageAsPrimitive()
	{
		return getInterestPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute. 
	 * @param value the interestPercentage
	 */
	public void setInterestPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, INTERESTPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute. 
	 * @param value the interestPercentage
	 */
	public void setInterestPercentage(final Double value)
	{
		setInterestPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute. 
	 * @param value the interestPercentage
	 */
	public void setInterestPercentage(final SessionContext ctx, final double value)
	{
		setInterestPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestPercentage</code> attribute. 
	 * @param value the interestPercentage
	 */
	public void setInterestPercentage(final double value)
	{
		setInterestPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestpercentageBasis</code> attribute.
	 * @return the interestpercentageBasis
	 */
	public EnumerationValue getInterestpercentageBasis(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INTERESTPERCENTAGEBASIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSupplierSettlement.interestpercentageBasis</code> attribute.
	 * @return the interestpercentageBasis
	 */
	public EnumerationValue getInterestpercentageBasis()
	{
		return getInterestpercentageBasis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestpercentageBasis</code> attribute. 
	 * @param value the interestpercentageBasis
	 */
	public void setInterestpercentageBasis(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INTERESTPERCENTAGEBASIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSupplierSettlement.interestpercentageBasis</code> attribute. 
	 * @param value the interestpercentageBasis
	 */
	public void setInterestpercentageBasis(final EnumerationValue value)
	{
		setInterestpercentageBasis( getSession().getSessionContext(), value );
	}
	
}
