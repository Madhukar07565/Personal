/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo.SupplierPenaltyKickBackCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.penalty.jalo.PenaltyCriteria PenaltyCriteria}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPenaltyCriteria extends GenericItem
{
	/** Qualifier of the <code>PenaltyCriteria.criteriaSlabType</code> attribute **/
	public static final String CRITERIASLABTYPE = "criteriaSlabType";
	/** Qualifier of the <code>PenaltyCriteria.targetFrom</code> attribute **/
	public static final String TARGETFROM = "targetFrom";
	/** Qualifier of the <code>PenaltyCriteria.targetTo</code> attribute **/
	public static final String TARGETTO = "targetTo";
	/** Qualifier of the <code>PenaltyCriteria.minAchievePercentage</code> attribute **/
	public static final String MINACHIEVEPERCENTAGE = "minAchievePercentage";
	/** Qualifier of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute **/
	public static final String MINFROMACHIEVEPERCENTAGE = "minFromAchievePercentage";
	/** Qualifier of the <code>PenaltyCriteria.achievementPeriod</code> attribute **/
	public static final String ACHIEVEMENTPERIOD = "achievementPeriod";
	/** Qualifier of the <code>PenaltyCriteria.periodFrom</code> attribute **/
	public static final String PERIODFROM = "periodFrom";
	/** Qualifier of the <code>PenaltyCriteria.periodTo</code> attribute **/
	public static final String PERIODTO = "periodTo";
	/** Qualifier of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute **/
	public static final String TRANSACTIONWISEPENALTY = "transactionwisePenalty";
	/** Qualifier of the <code>PenaltyCriteria.periodwisePenalty</code> attribute **/
	public static final String PERIODWISEPENALTY = "periodwisePenalty";
	/** Qualifier of the <code>PenaltyCriteria.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>PenaltyCriteria.penaltySlabType</code> attribute **/
	public static final String PENALTYSLABTYPE = "penaltySlabType";
	/** Qualifier of the <code>PenaltyCriteria.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>PenaltyCriteria.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>PenaltyCriteria.commercial</code> attribute **/
	public static final String COMMERCIAL = "commercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPenaltyCriteria> COMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedPenaltyCriteria>(
	SuppliercommercialscoreConstants.TC.PENALTYCRITERIA,
	false,
	"commercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CRITERIASLABTYPE, AttributeMode.INITIAL);
		tmp.put(TARGETFROM, AttributeMode.INITIAL);
		tmp.put(TARGETTO, AttributeMode.INITIAL);
		tmp.put(MINACHIEVEPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(MINFROMACHIEVEPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(ACHIEVEMENTPERIOD, AttributeMode.INITIAL);
		tmp.put(PERIODFROM, AttributeMode.INITIAL);
		tmp.put(PERIODTO, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONWISEPENALTY, AttributeMode.INITIAL);
		tmp.put(PERIODWISEPENALTY, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(PENALTYSLABTYPE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(COMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.achievementPeriod</code> attribute.
	 * @return the achievementPeriod
	 */
	public EnumerationValue getAchievementPeriod(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ACHIEVEMENTPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.achievementPeriod</code> attribute.
	 * @return the achievementPeriod
	 */
	public EnumerationValue getAchievementPeriod()
	{
		return getAchievementPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.achievementPeriod</code> attribute. 
	 * @param value the achievementPeriod
	 */
	public void setAchievementPeriod(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ACHIEVEMENTPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.achievementPeriod</code> attribute. 
	 * @param value the achievementPeriod
	 */
	public void setAchievementPeriod(final EnumerationValue value)
	{
		setAchievementPeriod( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierPenaltyKickBackCommercialRecord getCommercial(final SessionContext ctx)
	{
		return (SupplierPenaltyKickBackCommercialRecord)getProperty( ctx, COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierPenaltyKickBackCommercialRecord getCommercial()
	{
		return getCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SessionContext ctx, final SupplierPenaltyKickBackCommercialRecord value)
	{
		COMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SupplierPenaltyKickBackCommercialRecord value)
	{
		setCommercial( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.criteriaSlabType</code> attribute.
	 * @return the criteriaSlabType
	 */
	public EnumerationValue getCriteriaSlabType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CRITERIASLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.criteriaSlabType</code> attribute.
	 * @return the criteriaSlabType
	 */
	public EnumerationValue getCriteriaSlabType()
	{
		return getCriteriaSlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.criteriaSlabType</code> attribute. 
	 * @param value the criteriaSlabType
	 */
	public void setCriteriaSlabType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CRITERIASLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.criteriaSlabType</code> attribute. 
	 * @param value the criteriaSlabType
	 */
	public void setCriteriaSlabType(final EnumerationValue value)
	{
		setCriteriaSlabType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.minAchievePercentage</code> attribute.
	 * @return the minAchievePercentage
	 */
	public Double getMinAchievePercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MINACHIEVEPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.minAchievePercentage</code> attribute.
	 * @return the minAchievePercentage
	 */
	public Double getMinAchievePercentage()
	{
		return getMinAchievePercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.minAchievePercentage</code> attribute. 
	 * @return the minAchievePercentage
	 */
	public double getMinAchievePercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getMinAchievePercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.minAchievePercentage</code> attribute. 
	 * @return the minAchievePercentage
	 */
	public double getMinAchievePercentageAsPrimitive()
	{
		return getMinAchievePercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.minAchievePercentage</code> attribute. 
	 * @param value the minAchievePercentage
	 */
	public void setMinAchievePercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MINACHIEVEPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.minAchievePercentage</code> attribute. 
	 * @param value the minAchievePercentage
	 */
	public void setMinAchievePercentage(final Double value)
	{
		setMinAchievePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.minAchievePercentage</code> attribute. 
	 * @param value the minAchievePercentage
	 */
	public void setMinAchievePercentage(final SessionContext ctx, final double value)
	{
		setMinAchievePercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.minAchievePercentage</code> attribute. 
	 * @param value the minAchievePercentage
	 */
	public void setMinAchievePercentage(final double value)
	{
		setMinAchievePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute.
	 * @return the minFromAchievePercentage
	 */
	public Double getMinFromAchievePercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MINFROMACHIEVEPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute.
	 * @return the minFromAchievePercentage
	 */
	public Double getMinFromAchievePercentage()
	{
		return getMinFromAchievePercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute. 
	 * @return the minFromAchievePercentage
	 */
	public double getMinFromAchievePercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getMinFromAchievePercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute. 
	 * @return the minFromAchievePercentage
	 */
	public double getMinFromAchievePercentageAsPrimitive()
	{
		return getMinFromAchievePercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute. 
	 * @param value the minFromAchievePercentage
	 */
	public void setMinFromAchievePercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MINFROMACHIEVEPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute. 
	 * @param value the minFromAchievePercentage
	 */
	public void setMinFromAchievePercentage(final Double value)
	{
		setMinFromAchievePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute. 
	 * @param value the minFromAchievePercentage
	 */
	public void setMinFromAchievePercentage(final SessionContext ctx, final double value)
	{
		setMinFromAchievePercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.minFromAchievePercentage</code> attribute. 
	 * @param value the minFromAchievePercentage
	 */
	public void setMinFromAchievePercentage(final double value)
	{
		setMinFromAchievePercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.penaltySlabType</code> attribute.
	 * @return the penaltySlabType
	 */
	public EnumerationValue getPenaltySlabType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PENALTYSLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.penaltySlabType</code> attribute.
	 * @return the penaltySlabType
	 */
	public EnumerationValue getPenaltySlabType()
	{
		return getPenaltySlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.penaltySlabType</code> attribute. 
	 * @param value the penaltySlabType
	 */
	public void setPenaltySlabType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PENALTYSLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.penaltySlabType</code> attribute. 
	 * @param value the penaltySlabType
	 */
	public void setPenaltySlabType(final EnumerationValue value)
	{
		setPenaltySlabType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.percentage</code> attribute.
	 * @return the percentage
	 */
	public Boolean isPercentage()
	{
		return isPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPercentage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.percentage</code> attribute. 
	 * @return the percentage
	 */
	public boolean isPercentageAsPrimitive()
	{
		return isPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final boolean value)
	{
		setPercentage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final boolean value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.periodFrom</code> attribute.
	 * @return the periodFrom
	 */
	public Date getPeriodFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PERIODFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.periodFrom</code> attribute.
	 * @return the periodFrom
	 */
	public Date getPeriodFrom()
	{
		return getPeriodFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.periodFrom</code> attribute. 
	 * @param value the periodFrom
	 */
	public void setPeriodFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PERIODFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.periodFrom</code> attribute. 
	 * @param value the periodFrom
	 */
	public void setPeriodFrom(final Date value)
	{
		setPeriodFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.periodTo</code> attribute.
	 * @return the periodTo
	 */
	public Date getPeriodTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PERIODTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.periodTo</code> attribute.
	 * @return the periodTo
	 */
	public Date getPeriodTo()
	{
		return getPeriodTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.periodTo</code> attribute. 
	 * @param value the periodTo
	 */
	public void setPeriodTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PERIODTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.periodTo</code> attribute. 
	 * @param value the periodTo
	 */
	public void setPeriodTo(final Date value)
	{
		setPeriodTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.periodwisePenalty</code> attribute.
	 * @return the periodwisePenalty
	 */
	public Boolean isPeriodwisePenalty(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERIODWISEPENALTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.periodwisePenalty</code> attribute.
	 * @return the periodwisePenalty
	 */
	public Boolean isPeriodwisePenalty()
	{
		return isPeriodwisePenalty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.periodwisePenalty</code> attribute. 
	 * @return the periodwisePenalty
	 */
	public boolean isPeriodwisePenaltyAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPeriodwisePenalty( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.periodwisePenalty</code> attribute. 
	 * @return the periodwisePenalty
	 */
	public boolean isPeriodwisePenaltyAsPrimitive()
	{
		return isPeriodwisePenaltyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.periodwisePenalty</code> attribute. 
	 * @param value the periodwisePenalty
	 */
	public void setPeriodwisePenalty(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERIODWISEPENALTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.periodwisePenalty</code> attribute. 
	 * @param value the periodwisePenalty
	 */
	public void setPeriodwisePenalty(final Boolean value)
	{
		setPeriodwisePenalty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.periodwisePenalty</code> attribute. 
	 * @param value the periodwisePenalty
	 */
	public void setPeriodwisePenalty(final SessionContext ctx, final boolean value)
	{
		setPeriodwisePenalty( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.periodwisePenalty</code> attribute. 
	 * @param value the periodwisePenalty
	 */
	public void setPeriodwisePenalty(final boolean value)
	{
		setPeriodwisePenalty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.targetFrom</code> attribute.
	 * @return the targetFrom
	 */
	public Double getTargetFrom(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TARGETFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.targetFrom</code> attribute.
	 * @return the targetFrom
	 */
	public Double getTargetFrom()
	{
		return getTargetFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.targetFrom</code> attribute. 
	 * @return the targetFrom
	 */
	public double getTargetFromAsPrimitive(final SessionContext ctx)
	{
		Double value = getTargetFrom( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.targetFrom</code> attribute. 
	 * @return the targetFrom
	 */
	public double getTargetFromAsPrimitive()
	{
		return getTargetFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.targetFrom</code> attribute. 
	 * @param value the targetFrom
	 */
	public void setTargetFrom(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TARGETFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.targetFrom</code> attribute. 
	 * @param value the targetFrom
	 */
	public void setTargetFrom(final Double value)
	{
		setTargetFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.targetFrom</code> attribute. 
	 * @param value the targetFrom
	 */
	public void setTargetFrom(final SessionContext ctx, final double value)
	{
		setTargetFrom( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.targetFrom</code> attribute. 
	 * @param value the targetFrom
	 */
	public void setTargetFrom(final double value)
	{
		setTargetFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.targetTo</code> attribute.
	 * @return the targetTo
	 */
	public Double getTargetTo(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TARGETTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.targetTo</code> attribute.
	 * @return the targetTo
	 */
	public Double getTargetTo()
	{
		return getTargetTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.targetTo</code> attribute. 
	 * @return the targetTo
	 */
	public double getTargetToAsPrimitive(final SessionContext ctx)
	{
		Double value = getTargetTo( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.targetTo</code> attribute. 
	 * @return the targetTo
	 */
	public double getTargetToAsPrimitive()
	{
		return getTargetToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.targetTo</code> attribute. 
	 * @param value the targetTo
	 */
	public void setTargetTo(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TARGETTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.targetTo</code> attribute. 
	 * @param value the targetTo
	 */
	public void setTargetTo(final Double value)
	{
		setTargetTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.targetTo</code> attribute. 
	 * @param value the targetTo
	 */
	public void setTargetTo(final SessionContext ctx, final double value)
	{
		setTargetTo( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.targetTo</code> attribute. 
	 * @param value the targetTo
	 */
	public void setTargetTo(final double value)
	{
		setTargetTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute.
	 * @return the transactionwisePenalty
	 */
	public Boolean isTransactionwisePenalty(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONWISEPENALTY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute.
	 * @return the transactionwisePenalty
	 */
	public Boolean isTransactionwisePenalty()
	{
		return isTransactionwisePenalty( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute. 
	 * @return the transactionwisePenalty
	 */
	public boolean isTransactionwisePenaltyAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactionwisePenalty( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute. 
	 * @return the transactionwisePenalty
	 */
	public boolean isTransactionwisePenaltyAsPrimitive()
	{
		return isTransactionwisePenaltyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute. 
	 * @param value the transactionwisePenalty
	 */
	public void setTransactionwisePenalty(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONWISEPENALTY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute. 
	 * @param value the transactionwisePenalty
	 */
	public void setTransactionwisePenalty(final Boolean value)
	{
		setTransactionwisePenalty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute. 
	 * @param value the transactionwisePenalty
	 */
	public void setTransactionwisePenalty(final SessionContext ctx, final boolean value)
	{
		setTransactionwisePenalty( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.transactionwisePenalty</code> attribute. 
	 * @param value the transactionwisePenalty
	 */
	public void setTransactionwisePenalty(final boolean value)
	{
		setTransactionwisePenalty( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.value</code> attribute.
	 * @return the value
	 */
	public Double getValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.value</code> attribute.
	 * @return the value
	 */
	public Double getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PenaltyCriteria.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive()
	{
		return getValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final Double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final double value)
	{
		setValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PenaltyCriteria.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
