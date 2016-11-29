/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.roomorcabinupgrade.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.roomorcabinupgrade.jalo.RoomOrCabinUpgrade RoomOrCabinUpgrade}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRoomOrCabinUpgrade extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute **/
	public static final String MINPAXORNIGHT = "minPaxOrNight";
	/** Qualifier of the <code>RoomOrCabinUpgrade.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>RoomOrCabinUpgrade.roomType</code> attribute **/
	public static final String ROOMTYPE = "roomType";
	/** Qualifier of the <code>RoomOrCabinUpgrade.upgrade</code> attribute **/
	public static final String UPGRADE = "upgrade";
	/** Qualifier of the <code>RoomOrCabinUpgrade.upgradeRoomCategoryTo</code> attribute **/
	public static final String UPGRADEROOMCATEGORYTO = "upgradeRoomCategoryTo";
	/** Qualifier of the <code>RoomOrCabinUpgrade.upgradeRoomType</code> attribute **/
	public static final String UPGRADEROOMTYPE = "upgradeRoomType";
	/** Qualifier of the <code>RoomOrCabinUpgrade.upgradeMealPlan</code> attribute **/
	public static final String UPGRADEMEALPLAN = "upgradeMealPlan";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MINPAXORNIGHT, AttributeMode.INITIAL);
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(ROOMTYPE, AttributeMode.INITIAL);
		tmp.put(UPGRADE, AttributeMode.INITIAL);
		tmp.put(UPGRADEROOMCATEGORYTO, AttributeMode.INITIAL);
		tmp.put(UPGRADEROOMTYPE, AttributeMode.INITIAL);
		tmp.put(UPGRADEMEALPLAN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAXORNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight()
	{
		return getMinPaxOrNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPaxOrNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive()
	{
		return getMinPaxOrNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAXORNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final Integer value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final int value)
	{
		setMinPaxOrNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final int value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.roomType</code> attribute.
	 * @return the roomType
	 */
	public EnumerationValue getRoomType()
	{
		return getRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.roomType</code> attribute. 
	 * @param value the roomType
	 */
	public void setRoomType(final EnumerationValue value)
	{
		setRoomType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.upgrade</code> attribute.
	 * @return the upgrade
	 */
	public EnumerationValue getUpgrade(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPGRADE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.upgrade</code> attribute.
	 * @return the upgrade
	 */
	public EnumerationValue getUpgrade()
	{
		return getUpgrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.upgrade</code> attribute. 
	 * @param value the upgrade
	 */
	public void setUpgrade(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPGRADE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.upgrade</code> attribute. 
	 * @param value the upgrade
	 */
	public void setUpgrade(final EnumerationValue value)
	{
		setUpgrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.upgradeMealPlan</code> attribute.
	 * @return the upgradeMealPlan
	 */
	public EnumerationValue getUpgradeMealPlan(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPGRADEMEALPLAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.upgradeMealPlan</code> attribute.
	 * @return the upgradeMealPlan
	 */
	public EnumerationValue getUpgradeMealPlan()
	{
		return getUpgradeMealPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.upgradeMealPlan</code> attribute. 
	 * @param value the upgradeMealPlan
	 */
	public void setUpgradeMealPlan(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPGRADEMEALPLAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.upgradeMealPlan</code> attribute. 
	 * @param value the upgradeMealPlan
	 */
	public void setUpgradeMealPlan(final EnumerationValue value)
	{
		setUpgradeMealPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.upgradeRoomCategoryTo</code> attribute.
	 * @return the upgradeRoomCategoryTo
	 */
	public EnumerationValue getUpgradeRoomCategoryTo(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPGRADEROOMCATEGORYTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.upgradeRoomCategoryTo</code> attribute.
	 * @return the upgradeRoomCategoryTo
	 */
	public EnumerationValue getUpgradeRoomCategoryTo()
	{
		return getUpgradeRoomCategoryTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.upgradeRoomCategoryTo</code> attribute. 
	 * @param value the upgradeRoomCategoryTo
	 */
	public void setUpgradeRoomCategoryTo(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPGRADEROOMCATEGORYTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.upgradeRoomCategoryTo</code> attribute. 
	 * @param value the upgradeRoomCategoryTo
	 */
	public void setUpgradeRoomCategoryTo(final EnumerationValue value)
	{
		setUpgradeRoomCategoryTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.upgradeRoomType</code> attribute.
	 * @return the upgradeRoomType
	 */
	public EnumerationValue getUpgradeRoomType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPGRADEROOMTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RoomOrCabinUpgrade.upgradeRoomType</code> attribute.
	 * @return the upgradeRoomType
	 */
	public EnumerationValue getUpgradeRoomType()
	{
		return getUpgradeRoomType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.upgradeRoomType</code> attribute. 
	 * @param value the upgradeRoomType
	 */
	public void setUpgradeRoomType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPGRADEROOMTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RoomOrCabinUpgrade.upgradeRoomType</code> attribute. 
	 * @param value the upgradeRoomType
	 */
	public void setUpgradeRoomType(final EnumerationValue value)
	{
		setUpgradeRoomType( getSession().getSessionContext(), value );
	}
	
}
