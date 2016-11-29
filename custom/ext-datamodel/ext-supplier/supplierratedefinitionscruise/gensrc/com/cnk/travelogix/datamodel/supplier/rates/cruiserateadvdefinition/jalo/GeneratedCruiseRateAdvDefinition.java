/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.cruiserateadvdefinition.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.cabinoffer.jalo.CabinOffer;
import com.cnk.travelogix.datamodel.supplier.rates.supplieroffervalidity.jalo.SupplierOfferValidity;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscruiseConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.cruiserateadvdefinition.jalo.CruiseRateAdvDefinition CruiseRateAdvDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruiseRateAdvDefinition extends AbstractRateAdvDefinition
{
	/** Qualifier of the <code>CruiseRateAdvDefinition.rateType</code> attribute **/
	public static final String RATETYPE = "rateType";
	/** Qualifier of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute **/
	public static final String DININGCREDITPERCABIN = "diningCreditPerCabin";
	/** Qualifier of the <code>CruiseRateAdvDefinition.diningCreditApplicableFor</code> attribute **/
	public static final String DININGCREDITAPPLICABLEFOR = "diningCreditApplicableFor";
	/** Qualifier of the <code>CruiseRateAdvDefinition.supplierOfferValidities</code> attribute **/
	public static final String SUPPLIEROFFERVALIDITIES = "supplierOfferValidities";
	/** Qualifier of the <code>CruiseRateAdvDefinition.cabinOffers</code> attribute **/
	public static final String CABINOFFERS = "cabinOffers";
	/**
	* {@link OneToManyHandler} for handling 1:n SUPPLIEROFFERVALIDITIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierOfferValidity> SUPPLIEROFFERVALIDITIESHANDLER = new OneToManyHandler<SupplierOfferValidity>(
	SupplierratedefinitionscruiseConstants.TC.SUPPLIEROFFERVALIDITY,
	false,
	"cruiserateadvdefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CABINOFFERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CabinOffer> CABINOFFERSHANDLER = new OneToManyHandler<CabinOffer>(
	SupplierratedefinitionscruiseConstants.TC.CABINOFFER,
	false,
	"cruiserateadvdefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateAdvDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(RATETYPE, AttributeMode.INITIAL);
		tmp.put(DININGCREDITPERCABIN, AttributeMode.INITIAL);
		tmp.put(DININGCREDITAPPLICABLEFOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.cabinOffers</code> attribute.
	 * @return the cabinOffers
	 */
	public Collection<CabinOffer> getCabinOffers(final SessionContext ctx)
	{
		return CABINOFFERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.cabinOffers</code> attribute.
	 * @return the cabinOffers
	 */
	public Collection<CabinOffer> getCabinOffers()
	{
		return getCabinOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.cabinOffers</code> attribute. 
	 * @param value the cabinOffers
	 */
	public void setCabinOffers(final SessionContext ctx, final Collection<CabinOffer> value)
	{
		CABINOFFERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.cabinOffers</code> attribute. 
	 * @param value the cabinOffers
	 */
	public void setCabinOffers(final Collection<CabinOffer> value)
	{
		setCabinOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabinOffers. 
	 * @param value the item to add to cabinOffers
	 */
	public void addToCabinOffers(final SessionContext ctx, final CabinOffer value)
	{
		CABINOFFERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabinOffers. 
	 * @param value the item to add to cabinOffers
	 */
	public void addToCabinOffers(final CabinOffer value)
	{
		addToCabinOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cabinOffers. 
	 * @param value the item to remove from cabinOffers
	 */
	public void removeFromCabinOffers(final SessionContext ctx, final CabinOffer value)
	{
		CABINOFFERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cabinOffers. 
	 * @param value the item to remove from cabinOffers
	 */
	public void removeFromCabinOffers(final CabinOffer value)
	{
		removeFromCabinOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.diningCreditApplicableFor</code> attribute.
	 * @return the diningCreditApplicableFor
	 */
	public EnumerationValue getDiningCreditApplicableFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DININGCREDITAPPLICABLEFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.diningCreditApplicableFor</code> attribute.
	 * @return the diningCreditApplicableFor
	 */
	public EnumerationValue getDiningCreditApplicableFor()
	{
		return getDiningCreditApplicableFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.diningCreditApplicableFor</code> attribute. 
	 * @param value the diningCreditApplicableFor
	 */
	public void setDiningCreditApplicableFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DININGCREDITAPPLICABLEFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.diningCreditApplicableFor</code> attribute. 
	 * @param value the diningCreditApplicableFor
	 */
	public void setDiningCreditApplicableFor(final EnumerationValue value)
	{
		setDiningCreditApplicableFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute.
	 * @return the diningCreditPerCabin
	 */
	public String getDiningCreditPerCabin(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseRateAdvDefinition.getDiningCreditPerCabin requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DININGCREDITPERCABIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute.
	 * @return the diningCreditPerCabin
	 */
	public String getDiningCreditPerCabin()
	{
		return getDiningCreditPerCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute. 
	 * @return the localized diningCreditPerCabin
	 */
	public Map<Language,String> getAllDiningCreditPerCabin(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DININGCREDITPERCABIN,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute. 
	 * @return the localized diningCreditPerCabin
	 */
	public Map<Language,String> getAllDiningCreditPerCabin()
	{
		return getAllDiningCreditPerCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute. 
	 * @param value the diningCreditPerCabin
	 */
	public void setDiningCreditPerCabin(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCruiseRateAdvDefinition.setDiningCreditPerCabin requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DININGCREDITPERCABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute. 
	 * @param value the diningCreditPerCabin
	 */
	public void setDiningCreditPerCabin(final String value)
	{
		setDiningCreditPerCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute. 
	 * @param value the diningCreditPerCabin
	 */
	public void setAllDiningCreditPerCabin(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DININGCREDITPERCABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.diningCreditPerCabin</code> attribute. 
	 * @param value the diningCreditPerCabin
	 */
	public void setAllDiningCreditPerCabin(final Map<Language,String> value)
	{
		setAllDiningCreditPerCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.rateType</code> attribute.
	 * @return the rateType
	 */
	public Set<EnumerationValue> getRateType(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, RATETYPE);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.rateType</code> attribute.
	 * @return the rateType
	 */
	public Set<EnumerationValue> getRateType()
	{
		return getRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.rateType</code> attribute. 
	 * @param value the rateType
	 */
	public void setRateType(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, RATETYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.rateType</code> attribute. 
	 * @param value the rateType
	 */
	public void setRateType(final Set<EnumerationValue> value)
	{
		setRateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.supplierOfferValidities</code> attribute.
	 * @return the supplierOfferValidities
	 */
	public Collection<SupplierOfferValidity> getSupplierOfferValidities(final SessionContext ctx)
	{
		return SUPPLIEROFFERVALIDITIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruiseRateAdvDefinition.supplierOfferValidities</code> attribute.
	 * @return the supplierOfferValidities
	 */
	public Collection<SupplierOfferValidity> getSupplierOfferValidities()
	{
		return getSupplierOfferValidities( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.supplierOfferValidities</code> attribute. 
	 * @param value the supplierOfferValidities
	 */
	public void setSupplierOfferValidities(final SessionContext ctx, final Collection<SupplierOfferValidity> value)
	{
		SUPPLIEROFFERVALIDITIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruiseRateAdvDefinition.supplierOfferValidities</code> attribute. 
	 * @param value the supplierOfferValidities
	 */
	public void setSupplierOfferValidities(final Collection<SupplierOfferValidity> value)
	{
		setSupplierOfferValidities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierOfferValidities. 
	 * @param value the item to add to supplierOfferValidities
	 */
	public void addToSupplierOfferValidities(final SessionContext ctx, final SupplierOfferValidity value)
	{
		SUPPLIEROFFERVALIDITIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supplierOfferValidities. 
	 * @param value the item to add to supplierOfferValidities
	 */
	public void addToSupplierOfferValidities(final SupplierOfferValidity value)
	{
		addToSupplierOfferValidities( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierOfferValidities. 
	 * @param value the item to remove from supplierOfferValidities
	 */
	public void removeFromSupplierOfferValidities(final SessionContext ctx, final SupplierOfferValidity value)
	{
		SUPPLIEROFFERVALIDITIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supplierOfferValidities. 
	 * @param value the item to remove from supplierOfferValidities
	 */
	public void removeFromSupplierOfferValidities(final SupplierOfferValidity value)
	{
		removeFromSupplierOfferValidities( getSession().getSessionContext(), value );
	}
	
}
