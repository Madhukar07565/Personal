/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo.SignupBonusCriteria;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierSignUpBonusCommercial;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo.SupplierSignUpBonusCommercialRecord SupplierSignUpBonusCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierSignUpBonusCommercialRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>SupplierSignUpBonusCommercialRecord.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>SupplierSignUpBonusCommercialRecord.criteria</code> attribute **/
	public static final String CRITERIA = "criteria";
	/** Qualifier of the <code>SupplierSignUpBonusCommercialRecord.signUpBonusCommercial</code> attribute **/
	public static final String SIGNUPBONUSCOMMERCIAL = "signUpBonusCommercial";
	/**
	* {@link OneToManyHandler} for handling 1:n CRITERIA's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SignupBonusCriteria> CRITERIAHANDLER = new OneToManyHandler<SignupBonusCriteria>(
	SuppliercommercialscoreConstants.TC.SIGNUPBONUSCRITERIA,
	true,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SIGNUPBONUSCOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierSignUpBonusCommercialRecord> SIGNUPBONUSCOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierSignUpBonusCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERSIGNUPBONUSCOMMERCIALRECORD,
	false,
	"signUpBonusCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(SIGNUPBONUSCOMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		SIGNUPBONUSCOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.criteria</code> attribute.
	 * @return the criteria
	 */
	public Collection<SignupBonusCriteria> getCriteria(final SessionContext ctx)
	{
		return CRITERIAHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.criteria</code> attribute.
	 * @return the criteria
	 */
	public Collection<SignupBonusCriteria> getCriteria()
	{
		return getCriteria( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.criteria</code> attribute. 
	 * @param value the criteria
	 */
	public void setCriteria(final SessionContext ctx, final Collection<SignupBonusCriteria> value)
	{
		CRITERIAHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.criteria</code> attribute. 
	 * @param value the criteria
	 */
	public void setCriteria(final Collection<SignupBonusCriteria> value)
	{
		setCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to criteria. 
	 * @param value the item to add to criteria
	 */
	public void addToCriteria(final SessionContext ctx, final SignupBonusCriteria value)
	{
		CRITERIAHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to criteria. 
	 * @param value the item to add to criteria
	 */
	public void addToCriteria(final SignupBonusCriteria value)
	{
		addToCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from criteria. 
	 * @param value the item to remove from criteria
	 */
	public void removeFromCriteria(final SessionContext ctx, final SignupBonusCriteria value)
	{
		CRITERIAHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from criteria. 
	 * @param value the item to remove from criteria
	 */
	public void removeFromCriteria(final SignupBonusCriteria value)
	{
		removeFromCriteria( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.signUpBonusCommercial</code> attribute.
	 * @return the signUpBonusCommercial
	 */
	public SupplierSignUpBonusCommercial getSignUpBonusCommercial(final SessionContext ctx)
	{
		return (SupplierSignUpBonusCommercial)getProperty( ctx, SIGNUPBONUSCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.signUpBonusCommercial</code> attribute.
	 * @return the signUpBonusCommercial
	 */
	public SupplierSignUpBonusCommercial getSignUpBonusCommercial()
	{
		return getSignUpBonusCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.signUpBonusCommercial</code> attribute. 
	 * @param value the signUpBonusCommercial
	 */
	public void setSignUpBonusCommercial(final SessionContext ctx, final SupplierSignUpBonusCommercial value)
	{
		SIGNUPBONUSCOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.signUpBonusCommercial</code> attribute. 
	 * @param value the signUpBonusCommercial
	 */
	public void setSignUpBonusCommercial(final SupplierSignUpBonusCommercial value)
	{
		setSignUpBonusCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute.
	 * @return the value
	 */
	public Double getValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute.
	 * @return the value
	 */
	public Double getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive()
	{
		return getValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final Double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final double value)
	{
		setValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercialRecord.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
