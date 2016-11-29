/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.fOCoffer.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.fOCoffer.jalo.FOCOffer FOCOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFOCOffer extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>FOCOffer.minPaxOrNight</code> attribute **/
	public static final String MINPAXORNIGHT = "minPaxOrNight";
	/** Qualifier of the <code>FOCOffer.maxPaxOrNights</code> attribute **/
	public static final String MAXPAXORNIGHTS = "maxPaxOrNights";
	/** Qualifier of the <code>FOCOffer.focAppliedOnSupplement</code> attribute **/
	public static final String FOCAPPLIEDONSUPPLEMENT = "focAppliedOnSupplement";
	/** Qualifier of the <code>FOCOffer.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>FOCOffer.childAge</code> attribute **/
	public static final String CHILDAGE = "childAge";
	/** Qualifier of the <code>FOCOffer.noOfChildren</code> attribute **/
	public static final String NOOFCHILDREN = "noOfChildren";
	/** Qualifier of the <code>FOCOffer.supplementMandatory</code> attribute **/
	public static final String SUPPLEMENTMANDATORY = "supplementMandatory";
	/** Qualifier of the <code>FOCOffer.supplement</code> attribute **/
	public static final String SUPPLEMENT = "supplement";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MINPAXORNIGHT, AttributeMode.INITIAL);
		tmp.put(MAXPAXORNIGHTS, AttributeMode.INITIAL);
		tmp.put(FOCAPPLIEDONSUPPLEMENT, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(CHILDAGE, AttributeMode.INITIAL);
		tmp.put(NOOFCHILDREN, AttributeMode.INITIAL);
		tmp.put(SUPPLEMENTMANDATORY, AttributeMode.INITIAL);
		tmp.put(SUPPLEMENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.childAge</code> attribute.
	 * @return the childAge
	 */
	public AgeDetail getChildAge(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, CHILDAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.childAge</code> attribute.
	 * @return the childAge
	 */
	public AgeDetail getChildAge()
	{
		return getChildAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.childAge</code> attribute. 
	 * @param value the childAge
	 */
	public void setChildAge(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, CHILDAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.childAge</code> attribute. 
	 * @param value the childAge
	 */
	public void setChildAge(final AgeDetail value)
	{
		setChildAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.focAppliedOnSupplement</code> attribute.
	 * @return the focAppliedOnSupplement
	 */
	public Boolean isFocAppliedOnSupplement(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FOCAPPLIEDONSUPPLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.focAppliedOnSupplement</code> attribute.
	 * @return the focAppliedOnSupplement
	 */
	public Boolean isFocAppliedOnSupplement()
	{
		return isFocAppliedOnSupplement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.focAppliedOnSupplement</code> attribute. 
	 * @return the focAppliedOnSupplement
	 */
	public boolean isFocAppliedOnSupplementAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFocAppliedOnSupplement( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.focAppliedOnSupplement</code> attribute. 
	 * @return the focAppliedOnSupplement
	 */
	public boolean isFocAppliedOnSupplementAsPrimitive()
	{
		return isFocAppliedOnSupplementAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.focAppliedOnSupplement</code> attribute. 
	 * @param value the focAppliedOnSupplement
	 */
	public void setFocAppliedOnSupplement(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FOCAPPLIEDONSUPPLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.focAppliedOnSupplement</code> attribute. 
	 * @param value the focAppliedOnSupplement
	 */
	public void setFocAppliedOnSupplement(final Boolean value)
	{
		setFocAppliedOnSupplement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.focAppliedOnSupplement</code> attribute. 
	 * @param value the focAppliedOnSupplement
	 */
	public void setFocAppliedOnSupplement(final SessionContext ctx, final boolean value)
	{
		setFocAppliedOnSupplement( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.focAppliedOnSupplement</code> attribute. 
	 * @param value the focAppliedOnSupplement
	 */
	public void setFocAppliedOnSupplement(final boolean value)
	{
		setFocAppliedOnSupplement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.maxPaxOrNights</code> attribute.
	 * @return the maxPaxOrNights
	 */
	public Integer getMaxPaxOrNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPAXORNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.maxPaxOrNights</code> attribute.
	 * @return the maxPaxOrNights
	 */
	public Integer getMaxPaxOrNights()
	{
		return getMaxPaxOrNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.maxPaxOrNights</code> attribute. 
	 * @return the maxPaxOrNights
	 */
	public int getMaxPaxOrNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPaxOrNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.maxPaxOrNights</code> attribute. 
	 * @return the maxPaxOrNights
	 */
	public int getMaxPaxOrNightsAsPrimitive()
	{
		return getMaxPaxOrNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.maxPaxOrNights</code> attribute. 
	 * @param value the maxPaxOrNights
	 */
	public void setMaxPaxOrNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPAXORNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.maxPaxOrNights</code> attribute. 
	 * @param value the maxPaxOrNights
	 */
	public void setMaxPaxOrNights(final Integer value)
	{
		setMaxPaxOrNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.maxPaxOrNights</code> attribute. 
	 * @param value the maxPaxOrNights
	 */
	public void setMaxPaxOrNights(final SessionContext ctx, final int value)
	{
		setMaxPaxOrNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.maxPaxOrNights</code> attribute. 
	 * @param value the maxPaxOrNights
	 */
	public void setMaxPaxOrNights(final int value)
	{
		setMaxPaxOrNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAXORNIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.minPaxOrNight</code> attribute.
	 * @return the minPaxOrNight
	 */
	public Integer getMinPaxOrNight()
	{
		return getMinPaxOrNight( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPaxOrNight( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.minPaxOrNight</code> attribute. 
	 * @return the minPaxOrNight
	 */
	public int getMinPaxOrNightAsPrimitive()
	{
		return getMinPaxOrNightAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAXORNIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final Integer value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final SessionContext ctx, final int value)
	{
		setMinPaxOrNight( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.minPaxOrNight</code> attribute. 
	 * @param value the minPaxOrNight
	 */
	public void setMinPaxOrNight(final int value)
	{
		setMinPaxOrNight( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.noOfChildren</code> attribute.
	 * @return the noOfChildren
	 */
	public Integer getNoOfChildren(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFCHILDREN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.noOfChildren</code> attribute.
	 * @return the noOfChildren
	 */
	public Integer getNoOfChildren()
	{
		return getNoOfChildren( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.noOfChildren</code> attribute. 
	 * @return the noOfChildren
	 */
	public int getNoOfChildrenAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfChildren( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.noOfChildren</code> attribute. 
	 * @return the noOfChildren
	 */
	public int getNoOfChildrenAsPrimitive()
	{
		return getNoOfChildrenAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.noOfChildren</code> attribute. 
	 * @param value the noOfChildren
	 */
	public void setNoOfChildren(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFCHILDREN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.noOfChildren</code> attribute. 
	 * @param value the noOfChildren
	 */
	public void setNoOfChildren(final Integer value)
	{
		setNoOfChildren( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.noOfChildren</code> attribute. 
	 * @param value the noOfChildren
	 */
	public void setNoOfChildren(final SessionContext ctx, final int value)
	{
		setNoOfChildren( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.noOfChildren</code> attribute. 
	 * @param value the noOfChildren
	 */
	public void setNoOfChildren(final int value)
	{
		setNoOfChildren( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.supplement</code> attribute.
	 * @return the supplement
	 */
	public EnumerationValue getSupplement(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.supplement</code> attribute.
	 * @return the supplement
	 */
	public EnumerationValue getSupplement()
	{
		return getSupplement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.supplement</code> attribute. 
	 * @param value the supplement
	 */
	public void setSupplement(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.supplement</code> attribute. 
	 * @param value the supplement
	 */
	public void setSupplement(final EnumerationValue value)
	{
		setSupplement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.supplementMandatory</code> attribute.
	 * @return the supplementMandatory
	 */
	public Boolean isSupplementMandatory(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SUPPLEMENTMANDATORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.supplementMandatory</code> attribute.
	 * @return the supplementMandatory
	 */
	public Boolean isSupplementMandatory()
	{
		return isSupplementMandatory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.supplementMandatory</code> attribute. 
	 * @return the supplementMandatory
	 */
	public boolean isSupplementMandatoryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSupplementMandatory( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCOffer.supplementMandatory</code> attribute. 
	 * @return the supplementMandatory
	 */
	public boolean isSupplementMandatoryAsPrimitive()
	{
		return isSupplementMandatoryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.supplementMandatory</code> attribute. 
	 * @param value the supplementMandatory
	 */
	public void setSupplementMandatory(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SUPPLEMENTMANDATORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.supplementMandatory</code> attribute. 
	 * @param value the supplementMandatory
	 */
	public void setSupplementMandatory(final Boolean value)
	{
		setSupplementMandatory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.supplementMandatory</code> attribute. 
	 * @param value the supplementMandatory
	 */
	public void setSupplementMandatory(final SessionContext ctx, final boolean value)
	{
		setSupplementMandatory( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCOffer.supplementMandatory</code> attribute. 
	 * @param value the supplementMandatory
	 */
	public void setSupplementMandatory(final boolean value)
	{
		setSupplementMandatory( getSession().getSessionContext(), value );
	}
	
}
