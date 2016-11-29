/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.PenaltyKickBackFeeCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.SlabCompanyCommercial;
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
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.Criteria Criteria}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCriteria extends GenericItem
{
	/** Qualifier of the <code>Criteria.slab</code> attribute **/
	public static final String SLAB = "slab";
	/** Qualifier of the <code>Criteria.minimumAchiveTo</code> attribute **/
	public static final String MINIMUMACHIVETO = "minimumAchiveTo";
	/** Qualifier of the <code>Criteria.mininumAchiveFrom</code> attribute **/
	public static final String MININUMACHIVEFROM = "mininumAchiveFrom";
	/** Qualifier of the <code>Criteria.achivementPeriod</code> attribute **/
	public static final String ACHIVEMENTPERIOD = "achivementPeriod";
	/** Qualifier of the <code>Criteria.penaltyKickBackFee</code> attribute **/
	public static final String PENALTYKICKBACKFEE = "penaltyKickBackFee";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PENALTYKICKBACKFEE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCriteria> PENALTYKICKBACKFEEHANDLER = new BidirectionalOneToManyHandler<GeneratedCriteria>(
	ClientcommercialsConstants.TC.CRITERIA,
	false,
	"penaltyKickBackFee",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SLAB, AttributeMode.INITIAL);
		tmp.put(MINIMUMACHIVETO, AttributeMode.INITIAL);
		tmp.put(MININUMACHIVEFROM, AttributeMode.INITIAL);
		tmp.put(ACHIVEMENTPERIOD, AttributeMode.INITIAL);
		tmp.put(PENALTYKICKBACKFEE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.achivementPeriod</code> attribute.
	 * @return the achivementPeriod
	 */
	public EnumerationValue getAchivementPeriod(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ACHIVEMENTPERIOD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.achivementPeriod</code> attribute.
	 * @return the achivementPeriod
	 */
	public EnumerationValue getAchivementPeriod()
	{
		return getAchivementPeriod( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.achivementPeriod</code> attribute. 
	 * @param value the achivementPeriod
	 */
	public void setAchivementPeriod(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ACHIVEMENTPERIOD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.achivementPeriod</code> attribute. 
	 * @param value the achivementPeriod
	 */
	public void setAchivementPeriod(final EnumerationValue value)
	{
		setAchivementPeriod( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PENALTYKICKBACKFEEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.minimumAchiveTo</code> attribute.
	 * @return the minimumAchiveTo
	 */
	public Double getMinimumAchiveTo(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MINIMUMACHIVETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.minimumAchiveTo</code> attribute.
	 * @return the minimumAchiveTo
	 */
	public Double getMinimumAchiveTo()
	{
		return getMinimumAchiveTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.minimumAchiveTo</code> attribute. 
	 * @return the minimumAchiveTo
	 */
	public double getMinimumAchiveToAsPrimitive(final SessionContext ctx)
	{
		Double value = getMinimumAchiveTo( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.minimumAchiveTo</code> attribute. 
	 * @return the minimumAchiveTo
	 */
	public double getMinimumAchiveToAsPrimitive()
	{
		return getMinimumAchiveToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.minimumAchiveTo</code> attribute. 
	 * @param value the minimumAchiveTo
	 */
	public void setMinimumAchiveTo(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MINIMUMACHIVETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.minimumAchiveTo</code> attribute. 
	 * @param value the minimumAchiveTo
	 */
	public void setMinimumAchiveTo(final Double value)
	{
		setMinimumAchiveTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.minimumAchiveTo</code> attribute. 
	 * @param value the minimumAchiveTo
	 */
	public void setMinimumAchiveTo(final SessionContext ctx, final double value)
	{
		setMinimumAchiveTo( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.minimumAchiveTo</code> attribute. 
	 * @param value the minimumAchiveTo
	 */
	public void setMinimumAchiveTo(final double value)
	{
		setMinimumAchiveTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.mininumAchiveFrom</code> attribute.
	 * @return the mininumAchiveFrom
	 */
	public Double getMininumAchiveFrom(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MININUMACHIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.mininumAchiveFrom</code> attribute.
	 * @return the mininumAchiveFrom
	 */
	public Double getMininumAchiveFrom()
	{
		return getMininumAchiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.mininumAchiveFrom</code> attribute. 
	 * @return the mininumAchiveFrom
	 */
	public double getMininumAchiveFromAsPrimitive(final SessionContext ctx)
	{
		Double value = getMininumAchiveFrom( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.mininumAchiveFrom</code> attribute. 
	 * @return the mininumAchiveFrom
	 */
	public double getMininumAchiveFromAsPrimitive()
	{
		return getMininumAchiveFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.mininumAchiveFrom</code> attribute. 
	 * @param value the mininumAchiveFrom
	 */
	public void setMininumAchiveFrom(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MININUMACHIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.mininumAchiveFrom</code> attribute. 
	 * @param value the mininumAchiveFrom
	 */
	public void setMininumAchiveFrom(final Double value)
	{
		setMininumAchiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.mininumAchiveFrom</code> attribute. 
	 * @param value the mininumAchiveFrom
	 */
	public void setMininumAchiveFrom(final SessionContext ctx, final double value)
	{
		setMininumAchiveFrom( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.mininumAchiveFrom</code> attribute. 
	 * @param value the mininumAchiveFrom
	 */
	public void setMininumAchiveFrom(final double value)
	{
		setMininumAchiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.penaltyKickBackFee</code> attribute.
	 * @return the penaltyKickBackFee
	 */
	public PenaltyKickBackFeeCompanyCommercial getPenaltyKickBackFee(final SessionContext ctx)
	{
		return (PenaltyKickBackFeeCompanyCommercial)getProperty( ctx, PENALTYKICKBACKFEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.penaltyKickBackFee</code> attribute.
	 * @return the penaltyKickBackFee
	 */
	public PenaltyKickBackFeeCompanyCommercial getPenaltyKickBackFee()
	{
		return getPenaltyKickBackFee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.penaltyKickBackFee</code> attribute. 
	 * @param value the penaltyKickBackFee
	 */
	public void setPenaltyKickBackFee(final SessionContext ctx, final PenaltyKickBackFeeCompanyCommercial value)
	{
		PENALTYKICKBACKFEEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.penaltyKickBackFee</code> attribute. 
	 * @param value the penaltyKickBackFee
	 */
	public void setPenaltyKickBackFee(final PenaltyKickBackFeeCompanyCommercial value)
	{
		setPenaltyKickBackFee( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.slab</code> attribute.
	 * @return the slab
	 */
	public SlabCompanyCommercial getSlab(final SessionContext ctx)
	{
		return (SlabCompanyCommercial)getProperty( ctx, SLAB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Criteria.slab</code> attribute.
	 * @return the slab
	 */
	public SlabCompanyCommercial getSlab()
	{
		return getSlab( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.slab</code> attribute. 
	 * @param value the slab
	 */
	public void setSlab(final SessionContext ctx, final SlabCompanyCommercial value)
	{
		setProperty(ctx, SLAB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Criteria.slab</code> attribute. 
	 * @param value the slab
	 */
	public void setSlab(final SlabCompanyCommercial value)
	{
		setSlab( getSession().getSessionContext(), value );
	}
	
}
