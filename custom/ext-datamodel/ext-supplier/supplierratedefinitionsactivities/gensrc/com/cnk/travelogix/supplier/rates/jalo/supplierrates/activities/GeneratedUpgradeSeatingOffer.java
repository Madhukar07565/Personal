/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsactivitiesConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.jalo.supplierrates.activities.UpgradeSeatingOffer UpgradeSeatingOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUpgradeSeatingOffer extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>UpgradeSeatingOffer.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>UpgradeSeatingOffer.upgradeSeatClassFrom</code> attribute **/
	public static final String UPGRADESEATCLASSFROM = "upgradeSeatClassFrom";
	/** Qualifier of the <code>UpgradeSeatingOffer.upgradeSeatClassTo</code> attribute **/
	public static final String UPGRADESEATCLASSTO = "upgradeSeatClassTo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(UPGRADESEATCLASSFROM, AttributeMode.INITIAL);
		tmp.put(UPGRADESEATCLASSTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeSeatingOffer.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeSeatingOffer.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeSeatingOffer.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeSeatingOffer.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeSeatingOffer.upgradeSeatClassFrom</code> attribute.
	 * @return the upgradeSeatClassFrom
	 */
	public EnumerationValue getUpgradeSeatClassFrom(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPGRADESEATCLASSFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeSeatingOffer.upgradeSeatClassFrom</code> attribute.
	 * @return the upgradeSeatClassFrom
	 */
	public EnumerationValue getUpgradeSeatClassFrom()
	{
		return getUpgradeSeatClassFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeSeatingOffer.upgradeSeatClassFrom</code> attribute. 
	 * @param value the upgradeSeatClassFrom
	 */
	public void setUpgradeSeatClassFrom(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPGRADESEATCLASSFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeSeatingOffer.upgradeSeatClassFrom</code> attribute. 
	 * @param value the upgradeSeatClassFrom
	 */
	public void setUpgradeSeatClassFrom(final EnumerationValue value)
	{
		setUpgradeSeatClassFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeSeatingOffer.upgradeSeatClassTo</code> attribute.
	 * @return the upgradeSeatClassTo
	 */
	public EnumerationValue getUpgradeSeatClassTo(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, UPGRADESEATCLASSTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UpgradeSeatingOffer.upgradeSeatClassTo</code> attribute.
	 * @return the upgradeSeatClassTo
	 */
	public EnumerationValue getUpgradeSeatClassTo()
	{
		return getUpgradeSeatClassTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeSeatingOffer.upgradeSeatClassTo</code> attribute. 
	 * @param value the upgradeSeatClassTo
	 */
	public void setUpgradeSeatClassTo(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, UPGRADESEATCLASSTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UpgradeSeatingOffer.upgradeSeatClassTo</code> attribute. 
	 * @param value the upgradeSeatClassTo
	 */
	public void setUpgradeSeatClassTo(final EnumerationValue value)
	{
		setUpgradeSeatClassTo( getSession().getSessionContext(), value );
	}
	
}
