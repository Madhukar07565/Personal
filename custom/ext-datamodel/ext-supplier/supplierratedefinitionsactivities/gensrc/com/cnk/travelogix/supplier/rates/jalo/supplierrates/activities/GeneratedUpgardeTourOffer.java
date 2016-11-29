/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.masterdata.core.c2l.jalo.City;
import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.ActivityProduct;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.UpgardeTourOffer UpgardeTourOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUpgardeTourOffer extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>UpgardeTourOffer.city</code> attribute **/
	public static final String CITY = "city";
	/** Qualifier of the <code>UpgardeTourOffer.upgradeToProduct</code> attribute **/
	public static final String UPGRADETOPRODUCT = "upgradeToProduct";
	/** Qualifier of the <code>UpgardeTourOffer.activityproduct</code> attribute **/
	public static final String ACTIVITYPRODUCT = "activityproduct";
	/**
	* {@link OneToManyHandler} for handling 1:n ACTIVITYPRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ActivityProduct> ACTIVITYPRODUCTHANDLER = new OneToManyHandler<ActivityProduct>(
	ActivityproductmasterscoreConstants.TC.ACTIVITYPRODUCT,
	false,
	"upgardetouroffer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CITY, AttributeMode.INITIAL);
		tmp.put(UPGRADETOPRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgardeTourOffer.activityproduct</code> attribute.
	 * @return the activityproduct
	 */
	public Collection<ActivityProduct> getActivityproduct(final SessionContext ctx)
	{
		return ACTIVITYPRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgardeTourOffer.activityproduct</code> attribute.
	 * @return the activityproduct
	 */
	public Collection<ActivityProduct> getActivityproduct()
	{
		return getActivityproduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgardeTourOffer.activityproduct</code> attribute. 
	 * @param value the activityproduct
	 */
	public void setActivityproduct(final SessionContext ctx, final Collection<ActivityProduct> value)
	{
		ACTIVITYPRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgardeTourOffer.activityproduct</code> attribute. 
	 * @param value the activityproduct
	 */
	public void setActivityproduct(final Collection<ActivityProduct> value)
	{
		setActivityproduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityproduct. 
	 * @param value the item to add to activityproduct
	 */
	public void addToActivityproduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to activityproduct. 
	 * @param value the item to add to activityproduct
	 */
	public void addToActivityproduct(final ActivityProduct value)
	{
		addToActivityproduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityproduct. 
	 * @param value the item to remove from activityproduct
	 */
	public void removeFromActivityproduct(final SessionContext ctx, final ActivityProduct value)
	{
		ACTIVITYPRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from activityproduct. 
	 * @param value the item to remove from activityproduct
	 */
	public void removeFromActivityproduct(final ActivityProduct value)
	{
		removeFromActivityproduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgardeTourOffer.city</code> attribute.
	 * @return the city
	 */
	public City getCity(final SessionContext ctx)
	{
		return (City)getProperty( ctx, CITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgardeTourOffer.city</code> attribute.
	 * @return the city
	 */
	public City getCity()
	{
		return getCity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgardeTourOffer.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final SessionContext ctx, final City value)
	{
		setProperty(ctx, CITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgardeTourOffer.city</code> attribute. 
	 * @param value the city
	 */
	public void setCity(final City value)
	{
		setCity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgardeTourOffer.upgradeToProduct</code> attribute.
	 * @return the upgradeToProduct
	 */
	public ActivityProduct getUpgradeToProduct(final SessionContext ctx)
	{
		return (ActivityProduct)getProperty( ctx, UPGRADETOPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgardeTourOffer.upgradeToProduct</code> attribute.
	 * @return the upgradeToProduct
	 */
	public ActivityProduct getUpgradeToProduct()
	{
		return getUpgradeToProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgardeTourOffer.upgradeToProduct</code> attribute. 
	 * @param value the upgradeToProduct
	 */
	public void setUpgradeToProduct(final SessionContext ctx, final ActivityProduct value)
	{
		setProperty(ctx, UPGRADETOPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgardeTourOffer.upgradeToProduct</code> attribute. 
	 * @param value the upgradeToProduct
	 */
	public void setUpgradeToProduct(final ActivityProduct value)
	{
		setUpgradeToProduct( getSession().getSessionContext(), value );
	}
	
}
