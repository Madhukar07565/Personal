/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.jalo.AssociatedProductAndCategorySubtype;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.jalo.AssociatedCategories AssociatedCategories}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssociatedCategories extends GenericItem
{
	/** Qualifier of the <code>AssociatedCategories.enabled</code> attribute **/
	public static final String ENABLED = "enabled";
	/** Qualifier of the <code>AssociatedCategories.category</code> attribute **/
	public static final String CATEGORY = "category";
	/** Qualifier of the <code>AssociatedCategories.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>AssociatedCategories.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>AssociatedCategories.client</code> attribute **/
	public static final String CLIENT = "client";
	/** Qualifier of the <code>AssociatedCategories.categorySubtypesAndProducts</code> attribute **/
	public static final String CATEGORYSUBTYPESANDPRODUCTS = "categorySubtypesAndProducts";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAssociatedCategories> CLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedAssociatedCategories>(
	ClientconfigConstants.TC.ASSOCIATEDCATEGORIES,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CATEGORYSUBTYPESANDPRODUCTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AssociatedProductAndCategorySubtype> CATEGORYSUBTYPESANDPRODUCTSHANDLER = new OneToManyHandler<AssociatedProductAndCategorySubtype>(
	ClientconfigConstants.TC.ASSOCIATEDPRODUCTANDCATEGORYSUBTYPE,
	false,
	"categories",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ENABLED, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory(final SessionContext ctx)
	{
		return (Category)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.category</code> attribute.
	 * @return the category
	 */
	public Category getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final Category value)
	{
		setProperty(ctx, CATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final Category value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.categorySubtypesAndProducts</code> attribute.
	 * @return the categorySubtypesAndProducts
	 */
	public Collection<AssociatedProductAndCategorySubtype> getCategorySubtypesAndProducts(final SessionContext ctx)
	{
		return CATEGORYSUBTYPESANDPRODUCTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.categorySubtypesAndProducts</code> attribute.
	 * @return the categorySubtypesAndProducts
	 */
	public Collection<AssociatedProductAndCategorySubtype> getCategorySubtypesAndProducts()
	{
		return getCategorySubtypesAndProducts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.categorySubtypesAndProducts</code> attribute. 
	 * @param value the categorySubtypesAndProducts
	 */
	public void setCategorySubtypesAndProducts(final SessionContext ctx, final Collection<AssociatedProductAndCategorySubtype> value)
	{
		CATEGORYSUBTYPESANDPRODUCTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.categorySubtypesAndProducts</code> attribute. 
	 * @param value the categorySubtypesAndProducts
	 */
	public void setCategorySubtypesAndProducts(final Collection<AssociatedProductAndCategorySubtype> value)
	{
		setCategorySubtypesAndProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categorySubtypesAndProducts. 
	 * @param value the item to add to categorySubtypesAndProducts
	 */
	public void addToCategorySubtypesAndProducts(final SessionContext ctx, final AssociatedProductAndCategorySubtype value)
	{
		CATEGORYSUBTYPESANDPRODUCTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to categorySubtypesAndProducts. 
	 * @param value the item to add to categorySubtypesAndProducts
	 */
	public void addToCategorySubtypesAndProducts(final AssociatedProductAndCategorySubtype value)
	{
		addToCategorySubtypesAndProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categorySubtypesAndProducts. 
	 * @param value the item to remove from categorySubtypesAndProducts
	 */
	public void removeFromCategorySubtypesAndProducts(final SessionContext ctx, final AssociatedProductAndCategorySubtype value)
	{
		CATEGORYSUBTYPESANDPRODUCTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from categorySubtypesAndProducts. 
	 * @param value the item to remove from categorySubtypesAndProducts
	 */
	public void removeFromCategorySubtypesAndProducts(final AssociatedProductAndCategorySubtype value)
	{
		removeFromCategorySubtypesAndProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.client</code> attribute.
	 * @return the client
	 */
	public Principal getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final Principal value)
	{
		CLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final Principal value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.enabled</code> attribute.
	 * @return the enabled
	 */
	public Boolean isEnabled(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ENABLED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.enabled</code> attribute.
	 * @return the enabled
	 */
	public Boolean isEnabled()
	{
		return isEnabled( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.enabled</code> attribute. 
	 * @return the enabled
	 */
	public boolean isEnabledAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnabled( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.enabled</code> attribute. 
	 * @return the enabled
	 */
	public boolean isEnabledAsPrimitive()
	{
		return isEnabledAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ENABLED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final Boolean value)
	{
		setEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final SessionContext ctx, final boolean value)
	{
		setEnabled( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.enabled</code> attribute. 
	 * @param value the enabled
	 */
	public void setEnabled(final boolean value)
	{
		setEnabled( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssociatedCategories.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssociatedCategories.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
