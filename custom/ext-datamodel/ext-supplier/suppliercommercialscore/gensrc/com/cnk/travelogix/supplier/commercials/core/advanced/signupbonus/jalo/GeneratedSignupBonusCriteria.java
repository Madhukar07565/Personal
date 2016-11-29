/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo.SupplierSignUpBonusCommercialRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo.SignupBonusCriteria SignupBonusCriteria}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSignupBonusCriteria extends GenericItem
{
	/** Qualifier of the <code>SignupBonusCriteria.slabType</code> attribute **/
	public static final String SLABTYPE = "slabType";
	/** Qualifier of the <code>SignupBonusCriteria.targetFrom</code> attribute **/
	public static final String TARGETFROM = "targetFrom";
	/** Qualifier of the <code>SignupBonusCriteria.targetTo</code> attribute **/
	public static final String TARGETTO = "targetTo";
	/** Qualifier of the <code>SignupBonusCriteria.periodFrom</code> attribute **/
	public static final String PERIODFROM = "periodFrom";
	/** Qualifier of the <code>SignupBonusCriteria.periodTo</code> attribute **/
	public static final String PERIODTO = "periodTo";
	/** Qualifier of the <code>SignupBonusCriteria.commercial</code> attribute **/
	public static final String COMMERCIAL = "commercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSignupBonusCriteria> COMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSignupBonusCriteria>(
	SuppliercommercialscoreConstants.TC.SIGNUPBONUSCRITERIA,
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
		tmp.put(SLABTYPE, AttributeMode.INITIAL);
		tmp.put(TARGETFROM, AttributeMode.INITIAL);
		tmp.put(TARGETTO, AttributeMode.INITIAL);
		tmp.put(PERIODFROM, AttributeMode.INITIAL);
		tmp.put(PERIODTO, AttributeMode.INITIAL);
		tmp.put(COMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierSignUpBonusCommercialRecord getCommercial(final SessionContext ctx)
	{
		return (SupplierSignUpBonusCommercialRecord)getProperty( ctx, COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierSignUpBonusCommercialRecord getCommercial()
	{
		return getCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SessionContext ctx, final SupplierSignUpBonusCommercialRecord value)
	{
		COMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SupplierSignUpBonusCommercialRecord value)
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
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.periodFrom</code> attribute.
	 * @return the periodFrom
	 */
	public Date getPeriodFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PERIODFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.periodFrom</code> attribute.
	 * @return the periodFrom
	 */
	public Date getPeriodFrom()
	{
		return getPeriodFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.periodFrom</code> attribute. 
	 * @param value the periodFrom
	 */
	public void setPeriodFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PERIODFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.periodFrom</code> attribute. 
	 * @param value the periodFrom
	 */
	public void setPeriodFrom(final Date value)
	{
		setPeriodFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.periodTo</code> attribute.
	 * @return the periodTo
	 */
	public Date getPeriodTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PERIODTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.periodTo</code> attribute.
	 * @return the periodTo
	 */
	public Date getPeriodTo()
	{
		return getPeriodTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.periodTo</code> attribute. 
	 * @param value the periodTo
	 */
	public void setPeriodTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PERIODTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.periodTo</code> attribute. 
	 * @param value the periodTo
	 */
	public void setPeriodTo(final Date value)
	{
		setPeriodTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.slabType</code> attribute.
	 * @return the slabType
	 */
	public EnumerationValue getSlabType()
	{
		return getSlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.slabType</code> attribute. 
	 * @param value the slabType
	 */
	public void setSlabType(final EnumerationValue value)
	{
		setSlabType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.targetFrom</code> attribute.
	 * @return the targetFrom
	 */
	public Double getTargetFrom(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TARGETFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.targetFrom</code> attribute.
	 * @return the targetFrom
	 */
	public Double getTargetFrom()
	{
		return getTargetFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.targetFrom</code> attribute. 
	 * @return the targetFrom
	 */
	public double getTargetFromAsPrimitive(final SessionContext ctx)
	{
		Double value = getTargetFrom( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.targetFrom</code> attribute. 
	 * @return the targetFrom
	 */
	public double getTargetFromAsPrimitive()
	{
		return getTargetFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.targetFrom</code> attribute. 
	 * @param value the targetFrom
	 */
	public void setTargetFrom(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TARGETFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.targetFrom</code> attribute. 
	 * @param value the targetFrom
	 */
	public void setTargetFrom(final Double value)
	{
		setTargetFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.targetFrom</code> attribute. 
	 * @param value the targetFrom
	 */
	public void setTargetFrom(final SessionContext ctx, final double value)
	{
		setTargetFrom( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.targetFrom</code> attribute. 
	 * @param value the targetFrom
	 */
	public void setTargetFrom(final double value)
	{
		setTargetFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.targetTo</code> attribute.
	 * @return the targetTo
	 */
	public Double getTargetTo(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, TARGETTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.targetTo</code> attribute.
	 * @return the targetTo
	 */
	public Double getTargetTo()
	{
		return getTargetTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.targetTo</code> attribute. 
	 * @return the targetTo
	 */
	public double getTargetToAsPrimitive(final SessionContext ctx)
	{
		Double value = getTargetTo( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SignupBonusCriteria.targetTo</code> attribute. 
	 * @return the targetTo
	 */
	public double getTargetToAsPrimitive()
	{
		return getTargetToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.targetTo</code> attribute. 
	 * @param value the targetTo
	 */
	public void setTargetTo(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, TARGETTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.targetTo</code> attribute. 
	 * @param value the targetTo
	 */
	public void setTargetTo(final Double value)
	{
		setTargetTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.targetTo</code> attribute. 
	 * @param value the targetTo
	 */
	public void setTargetTo(final SessionContext ctx, final double value)
	{
		setTargetTo( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SignupBonusCriteria.targetTo</code> attribute. 
	 * @param value the targetTo
	 */
	public void setTargetTo(final double value)
	{
		setTargetTo( getSession().getSessionContext(), value );
	}
	
}
