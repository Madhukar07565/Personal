/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Combo;
import com.cnk.travelogix.product.common.core.jalo.Individual;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.PriceRetention PriceRetention}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPriceRetention extends GenericItem
{
	/** Qualifier of the <code>PriceRetention.includeStandardCommission</code> attribute **/
	public static final String INCLUDESTANDARDCOMMISSION = "includeStandardCommission";
	/** Qualifier of the <code>PriceRetention.isCombo</code> attribute **/
	public static final String ISCOMBO = "isCombo";
	/** Qualifier of the <code>PriceRetention.comboRetention</code> attribute **/
	public static final String COMBORETENTION = "comboRetention";
	/** Qualifier of the <code>PriceRetention.individualRetentions</code> attribute **/
	public static final String INDIVIDUALRETENTIONS = "individualRetentions";
	/**
	* {@link OneToManyHandler} for handling 1:n INDIVIDUALRETENTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Individual> INDIVIDUALRETENTIONSHANDLER = new OneToManyHandler<Individual>(
	CommonproductcoreConstants.TC.INDIVIDUAL,
	false,
	"priceRetention",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INCLUDESTANDARDCOMMISSION, AttributeMode.INITIAL);
		tmp.put(ISCOMBO, AttributeMode.INITIAL);
		tmp.put(COMBORETENTION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.comboRetention</code> attribute.
	 * @return the comboRetention - Combo Retention
	 */
	public Combo getComboRetention(final SessionContext ctx)
	{
		return (Combo)getProperty( ctx, COMBORETENTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.comboRetention</code> attribute.
	 * @return the comboRetention - Combo Retention
	 */
	public Combo getComboRetention()
	{
		return getComboRetention( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.comboRetention</code> attribute. 
	 * @param value the comboRetention - Combo Retention
	 */
	public void setComboRetention(final SessionContext ctx, final Combo value)
	{
		setProperty(ctx, COMBORETENTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.comboRetention</code> attribute. 
	 * @param value the comboRetention - Combo Retention
	 */
	public void setComboRetention(final Combo value)
	{
		setComboRetention( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.includeStandardCommission</code> attribute.
	 * @return the includeStandardCommission - Whether standard commission is to be included to calculate 'Retention on Difference'
	 */
	public Boolean isIncludeStandardCommission(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUDESTANDARDCOMMISSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.includeStandardCommission</code> attribute.
	 * @return the includeStandardCommission - Whether standard commission is to be included to calculate 'Retention on Difference'
	 */
	public Boolean isIncludeStandardCommission()
	{
		return isIncludeStandardCommission( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.includeStandardCommission</code> attribute. 
	 * @return the includeStandardCommission - Whether standard commission is to be included to calculate 'Retention on Difference'
	 */
	public boolean isIncludeStandardCommissionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIncludeStandardCommission( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.includeStandardCommission</code> attribute. 
	 * @return the includeStandardCommission - Whether standard commission is to be included to calculate 'Retention on Difference'
	 */
	public boolean isIncludeStandardCommissionAsPrimitive()
	{
		return isIncludeStandardCommissionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.includeStandardCommission</code> attribute. 
	 * @param value the includeStandardCommission - Whether standard commission is to be included to calculate 'Retention on Difference'
	 */
	public void setIncludeStandardCommission(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUDESTANDARDCOMMISSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.includeStandardCommission</code> attribute. 
	 * @param value the includeStandardCommission - Whether standard commission is to be included to calculate 'Retention on Difference'
	 */
	public void setIncludeStandardCommission(final Boolean value)
	{
		setIncludeStandardCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.includeStandardCommission</code> attribute. 
	 * @param value the includeStandardCommission - Whether standard commission is to be included to calculate 'Retention on Difference'
	 */
	public void setIncludeStandardCommission(final SessionContext ctx, final boolean value)
	{
		setIncludeStandardCommission( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.includeStandardCommission</code> attribute. 
	 * @param value the includeStandardCommission - Whether standard commission is to be included to calculate 'Retention on Difference'
	 */
	public void setIncludeStandardCommission(final boolean value)
	{
		setIncludeStandardCommission( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.individualRetentions</code> attribute.
	 * @return the individualRetentions
	 */
	public Collection<Individual> getIndividualRetentions(final SessionContext ctx)
	{
		return INDIVIDUALRETENTIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.individualRetentions</code> attribute.
	 * @return the individualRetentions
	 */
	public Collection<Individual> getIndividualRetentions()
	{
		return getIndividualRetentions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.individualRetentions</code> attribute. 
	 * @param value the individualRetentions
	 */
	public void setIndividualRetentions(final SessionContext ctx, final Collection<Individual> value)
	{
		INDIVIDUALRETENTIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.individualRetentions</code> attribute. 
	 * @param value the individualRetentions
	 */
	public void setIndividualRetentions(final Collection<Individual> value)
	{
		setIndividualRetentions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to individualRetentions. 
	 * @param value the item to add to individualRetentions
	 */
	public void addToIndividualRetentions(final SessionContext ctx, final Individual value)
	{
		INDIVIDUALRETENTIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to individualRetentions. 
	 * @param value the item to add to individualRetentions
	 */
	public void addToIndividualRetentions(final Individual value)
	{
		addToIndividualRetentions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from individualRetentions. 
	 * @param value the item to remove from individualRetentions
	 */
	public void removeFromIndividualRetentions(final SessionContext ctx, final Individual value)
	{
		INDIVIDUALRETENTIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from individualRetentions. 
	 * @param value the item to remove from individualRetentions
	 */
	public void removeFromIndividualRetentions(final Individual value)
	{
		removeFromIndividualRetentions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.isCombo</code> attribute.
	 * @return the isCombo - Retention type. If selected value is TRUE then Retention type is Combo Retention and if FALSE is selected then Retention type is Individual Product Retention
	 */
	public Boolean isIsCombo(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISCOMBO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.isCombo</code> attribute.
	 * @return the isCombo - Retention type. If selected value is TRUE then Retention type is Combo Retention and if FALSE is selected then Retention type is Individual Product Retention
	 */
	public Boolean isIsCombo()
	{
		return isIsCombo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.isCombo</code> attribute. 
	 * @return the isCombo - Retention type. If selected value is TRUE then Retention type is Combo Retention and if FALSE is selected then Retention type is Individual Product Retention
	 */
	public boolean isIsComboAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsCombo( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRetention.isCombo</code> attribute. 
	 * @return the isCombo - Retention type. If selected value is TRUE then Retention type is Combo Retention and if FALSE is selected then Retention type is Individual Product Retention
	 */
	public boolean isIsComboAsPrimitive()
	{
		return isIsComboAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.isCombo</code> attribute. 
	 * @param value the isCombo - Retention type. If selected value is TRUE then Retention type is Combo Retention and if FALSE is selected then Retention type is Individual Product Retention
	 */
	public void setIsCombo(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISCOMBO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.isCombo</code> attribute. 
	 * @param value the isCombo - Retention type. If selected value is TRUE then Retention type is Combo Retention and if FALSE is selected then Retention type is Individual Product Retention
	 */
	public void setIsCombo(final Boolean value)
	{
		setIsCombo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.isCombo</code> attribute. 
	 * @param value the isCombo - Retention type. If selected value is TRUE then Retention type is Combo Retention and if FALSE is selected then Retention type is Individual Product Retention
	 */
	public void setIsCombo(final SessionContext ctx, final boolean value)
	{
		setIsCombo( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRetention.isCombo</code> attribute. 
	 * @param value the isCombo - Retention type. If selected value is TRUE then Retention type is Combo Retention and if FALSE is selected then Retention type is Individual Product Retention
	 */
	public void setIsCombo(final boolean value)
	{
		setIsCombo( getSession().getSessionContext(), value );
	}
	
}
