/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.revenuerecognition.jalo;

import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import de.hybris.platform.catalog.jalo.Company;
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
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.revenuerecognition.jalo.RevenueRecognitionConfig RevenueRecognitionConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRevenueRecognitionConfig extends GenericItem
{
	/** Qualifier of the <code>RevenueRecognitionConfig.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>RevenueRecognitionConfig.trigger</code> attribute **/
	public static final String TRIGGER = "trigger";
	/** Qualifier of the <code>RevenueRecognitionConfig.before</code> attribute **/
	public static final String BEFORE = "before";
	/** Qualifier of the <code>RevenueRecognitionConfig.days</code> attribute **/
	public static final String DAYS = "days";
	/** Qualifier of the <code>RevenueRecognitionConfig.periodic</code> attribute **/
	public static final String PERIODIC = "periodic";
	/** Qualifier of the <code>RevenueRecognitionConfig.company</code> attribute **/
	public static final String COMPANY = "company";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRevenueRecognitionConfig> COMPANYHANDLER = new BidirectionalOneToManyHandler<GeneratedRevenueRecognitionConfig>(
	OrgstructurecoreConstants.TC.REVENUERECOGNITIONCONFIG,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(TRIGGER, AttributeMode.INITIAL);
		tmp.put(BEFORE, AttributeMode.INITIAL);
		tmp.put(DAYS, AttributeMode.INITIAL);
		tmp.put(PERIODIC, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.before</code> attribute.
	 * @return the before
	 */
	public Boolean isBefore(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BEFORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.before</code> attribute.
	 * @return the before
	 */
	public Boolean isBefore()
	{
		return isBefore( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.before</code> attribute. 
	 * @return the before
	 */
	public boolean isBeforeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBefore( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.before</code> attribute. 
	 * @return the before
	 */
	public boolean isBeforeAsPrimitive()
	{
		return isBeforeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.before</code> attribute. 
	 * @param value the before
	 */
	public void setBefore(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BEFORE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.before</code> attribute. 
	 * @param value the before
	 */
	public void setBefore(final Boolean value)
	{
		setBefore( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.before</code> attribute. 
	 * @param value the before
	 */
	public void setBefore(final SessionContext ctx, final boolean value)
	{
		setBefore( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.before</code> attribute. 
	 * @param value the before
	 */
	public void setBefore(final boolean value)
	{
		setBefore( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		COMPANYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.days</code> attribute.
	 * @return the days
	 */
	public Integer getDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, DAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.days</code> attribute.
	 * @return the days
	 */
	public Integer getDays()
	{
		return getDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.days</code> attribute. 
	 * @return the days
	 */
	public int getDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.days</code> attribute. 
	 * @return the days
	 */
	public int getDaysAsPrimitive()
	{
		return getDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, DAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final Integer value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final SessionContext ctx, final int value)
	{
		setDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.days</code> attribute. 
	 * @param value the days
	 */
	public void setDays(final int value)
	{
		setDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.periodic</code> attribute.
	 * @return the periodic
	 */
	public Boolean isPeriodic(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERIODIC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.periodic</code> attribute.
	 * @return the periodic
	 */
	public Boolean isPeriodic()
	{
		return isPeriodic( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.periodic</code> attribute. 
	 * @return the periodic
	 */
	public boolean isPeriodicAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPeriodic( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.periodic</code> attribute. 
	 * @return the periodic
	 */
	public boolean isPeriodicAsPrimitive()
	{
		return isPeriodicAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.periodic</code> attribute. 
	 * @param value the periodic
	 */
	public void setPeriodic(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERIODIC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.periodic</code> attribute. 
	 * @param value the periodic
	 */
	public void setPeriodic(final Boolean value)
	{
		setPeriodic( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.periodic</code> attribute. 
	 * @param value the periodic
	 */
	public void setPeriodic(final SessionContext ctx, final boolean value)
	{
		setPeriodic( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.periodic</code> attribute. 
	 * @param value the periodic
	 */
	public void setPeriodic(final boolean value)
	{
		setPeriodic( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.trigger</code> attribute.
	 * @return the trigger
	 */
	public EnumerationValue getTrigger(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TRIGGER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RevenueRecognitionConfig.trigger</code> attribute.
	 * @return the trigger
	 */
	public EnumerationValue getTrigger()
	{
		return getTrigger( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.trigger</code> attribute. 
	 * @param value the trigger
	 */
	public void setTrigger(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TRIGGER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RevenueRecognitionConfig.trigger</code> attribute. 
	 * @param value the trigger
	 */
	public void setTrigger(final EnumerationValue value)
	{
		setTrigger( getSession().getSessionContext(), value );
	}
	
}
