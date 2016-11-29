/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent;

import com.cnk.travelogix.datamodel.supplier.rates.dateRange.jalo.DateRangeRestriction;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.PassengerLevelSurchargeDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractSurchargeSuppDetail AbstractSurchargeSuppDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractSurchargeSuppDetail extends GenericItem
{
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.surchargeId</code> attribute **/
	public static final String SURCHARGEID = "surchargeId";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute **/
	public static final String SURCHARGENAME = "surchargeName";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.supplement</code> attribute **/
	public static final String SUPPLEMENT = "supplement";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute **/
	public static final String PRICEINCLUSION = "priceInclusion";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute **/
	public static final String PRICEEXCLUSION = "priceExclusion";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute **/
	public static final String INTERNALDESCRIPTION = "internalDescription";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute **/
	public static final String EXTERNALDESCRIPTION = "externalDescription";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute **/
	public static final String PAYONARRIVAL = "payOnArrival";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.supplierRate</code> attribute **/
	public static final String SUPPLIERRATE = "supplierRate";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.passengerLevelSurchargeDetails</code> attribute **/
	public static final String PASSENGERLEVELSURCHARGEDETAILS = "passengerLevelSurchargeDetails";
	/** Qualifier of the <code>AbstractSurchargeSuppDetail.travelDate</code> attribute **/
	public static final String TRAVELDATE = "travelDate";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERRATE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractSurchargeSuppDetail> SUPPLIERRATEHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractSurchargeSuppDetail>(
	SupplierratedefinitionscoreConstants.TC.ABSTRACTSURCHARGESUPPDETAIL,
	false,
	"supplierRate",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PASSENGERLEVELSURCHARGEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PassengerLevelSurchargeDetail> PASSENGERLEVELSURCHARGEDETAILSHANDLER = new OneToManyHandler<PassengerLevelSurchargeDetail>(
	SupplierratedefinitionscoreConstants.TC.PASSENGERLEVELSURCHARGEDETAIL,
	true,
	"surchargeSuppDetail",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELDATE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DateRangeRestriction> TRAVELDATEHANDLER = new OneToManyHandler<DateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	true,
	"absSurchargeSuppDetail",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SURCHARGEID, AttributeMode.INITIAL);
		tmp.put(SURCHARGENAME, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLEMENT, AttributeMode.INITIAL);
		tmp.put(PRICEINCLUSION, AttributeMode.INITIAL);
		tmp.put(PRICEEXCLUSION, AttributeMode.INITIAL);
		tmp.put(INTERNALDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(EXTERNALDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PAYONARRIVAL, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATE, AttributeMode.INITIAL);
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
		SUPPLIERRATEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute.
	 * @return the externalDescription
	 */
	public String getExternalDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.getExternalDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, EXTERNALDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute.
	 * @return the externalDescription
	 */
	public String getExternalDescription()
	{
		return getExternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute. 
	 * @return the localized externalDescription
	 */
	public Map<Language,String> getAllExternalDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,EXTERNALDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute. 
	 * @return the localized externalDescription
	 */
	public Map<Language,String> getAllExternalDescription()
	{
		return getAllExternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setExternalDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.setExternalDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, EXTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setExternalDescription(final String value)
	{
		setExternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setAllExternalDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,EXTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setAllExternalDescription(final Map<Language,String> value)
	{
		setAllExternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute.
	 * @return the internalDescription
	 */
	public String getInternalDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.getInternalDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, INTERNALDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute.
	 * @return the internalDescription
	 */
	public String getInternalDescription()
	{
		return getInternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute. 
	 * @return the localized internalDescription
	 */
	public Map<Language,String> getAllInternalDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,INTERNALDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute. 
	 * @return the localized internalDescription
	 */
	public Map<Language,String> getAllInternalDescription()
	{
		return getAllInternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setInternalDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.setInternalDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, INTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setInternalDescription(final String value)
	{
		setInternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setAllInternalDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,INTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setAllInternalDescription(final Map<Language,String> value)
	{
		setAllInternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.passengerLevelSurchargeDetails</code> attribute.
	 * @return the passengerLevelSurchargeDetails
	 */
	public Set<PassengerLevelSurchargeDetail> getPassengerLevelSurchargeDetails(final SessionContext ctx)
	{
		return (Set<PassengerLevelSurchargeDetail>)PASSENGERLEVELSURCHARGEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.passengerLevelSurchargeDetails</code> attribute.
	 * @return the passengerLevelSurchargeDetails
	 */
	public Set<PassengerLevelSurchargeDetail> getPassengerLevelSurchargeDetails()
	{
		return getPassengerLevelSurchargeDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.passengerLevelSurchargeDetails</code> attribute. 
	 * @param value the passengerLevelSurchargeDetails
	 */
	public void setPassengerLevelSurchargeDetails(final SessionContext ctx, final Set<PassengerLevelSurchargeDetail> value)
	{
		PASSENGERLEVELSURCHARGEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.passengerLevelSurchargeDetails</code> attribute. 
	 * @param value the passengerLevelSurchargeDetails
	 */
	public void setPassengerLevelSurchargeDetails(final Set<PassengerLevelSurchargeDetail> value)
	{
		setPassengerLevelSurchargeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passengerLevelSurchargeDetails. 
	 * @param value the item to add to passengerLevelSurchargeDetails
	 */
	public void addToPassengerLevelSurchargeDetails(final SessionContext ctx, final PassengerLevelSurchargeDetail value)
	{
		PASSENGERLEVELSURCHARGEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to passengerLevelSurchargeDetails. 
	 * @param value the item to add to passengerLevelSurchargeDetails
	 */
	public void addToPassengerLevelSurchargeDetails(final PassengerLevelSurchargeDetail value)
	{
		addToPassengerLevelSurchargeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passengerLevelSurchargeDetails. 
	 * @param value the item to remove from passengerLevelSurchargeDetails
	 */
	public void removeFromPassengerLevelSurchargeDetails(final SessionContext ctx, final PassengerLevelSurchargeDetail value)
	{
		PASSENGERLEVELSURCHARGEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from passengerLevelSurchargeDetails. 
	 * @param value the item to remove from passengerLevelSurchargeDetails
	 */
	public void removeFromPassengerLevelSurchargeDetails(final PassengerLevelSurchargeDetail value)
	{
		removeFromPassengerLevelSurchargeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYONARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival()
	{
		return isPayOnArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayOnArrival( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive()
	{
		return isPayOnArrivalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYONARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final Boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final boolean value)
	{
		setPayOnArrival( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute.
	 * @return the priceExclusion
	 */
	public String getPriceExclusion(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.getPriceExclusion requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PRICEEXCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute.
	 * @return the priceExclusion
	 */
	public String getPriceExclusion()
	{
		return getPriceExclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute. 
	 * @return the localized priceExclusion
	 */
	public Map<Language,String> getAllPriceExclusion(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PRICEEXCLUSION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute. 
	 * @return the localized priceExclusion
	 */
	public Map<Language,String> getAllPriceExclusion()
	{
		return getAllPriceExclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute. 
	 * @param value the priceExclusion
	 */
	public void setPriceExclusion(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.setPriceExclusion requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRICEEXCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute. 
	 * @param value the priceExclusion
	 */
	public void setPriceExclusion(final String value)
	{
		setPriceExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute. 
	 * @param value the priceExclusion
	 */
	public void setAllPriceExclusion(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PRICEEXCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.priceExclusion</code> attribute. 
	 * @param value the priceExclusion
	 */
	public void setAllPriceExclusion(final Map<Language,String> value)
	{
		setAllPriceExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute.
	 * @return the priceInclusion
	 */
	public String getPriceInclusion(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.getPriceInclusion requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PRICEINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute.
	 * @return the priceInclusion
	 */
	public String getPriceInclusion()
	{
		return getPriceInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute. 
	 * @return the localized priceInclusion
	 */
	public Map<Language,String> getAllPriceInclusion(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PRICEINCLUSION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute. 
	 * @return the localized priceInclusion
	 */
	public Map<Language,String> getAllPriceInclusion()
	{
		return getAllPriceInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute. 
	 * @param value the priceInclusion
	 */
	public void setPriceInclusion(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.setPriceInclusion requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRICEINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute. 
	 * @param value the priceInclusion
	 */
	public void setPriceInclusion(final String value)
	{
		setPriceInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute. 
	 * @param value the priceInclusion
	 */
	public void setAllPriceInclusion(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PRICEINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.priceInclusion</code> attribute. 
	 * @param value the priceInclusion
	 */
	public void setAllPriceInclusion(final Map<Language,String> value)
	{
		setAllPriceInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.supplement</code> attribute.
	 * @return the supplement
	 */
	public EnumerationValue getSupplement(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.supplement</code> attribute.
	 * @return the supplement
	 */
	public EnumerationValue getSupplement()
	{
		return getSupplement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.supplement</code> attribute. 
	 * @param value the supplement
	 */
	public void setSupplement(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.supplement</code> attribute. 
	 * @param value the supplement
	 */
	public void setSupplement(final EnumerationValue value)
	{
		setSupplement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public AbstractRateDefinition getSupplierRate(final SessionContext ctx)
	{
		return (AbstractRateDefinition)getProperty( ctx, SUPPLIERRATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.supplierRate</code> attribute.
	 * @return the supplierRate
	 */
	public AbstractRateDefinition getSupplierRate()
	{
		return getSupplierRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final SessionContext ctx, final AbstractRateDefinition value)
	{
		SUPPLIERRATEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.supplierRate</code> attribute. 
	 * @param value the supplierRate
	 */
	public void setSupplierRate(final AbstractRateDefinition value)
	{
		setSupplierRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.surchargeId</code> attribute.
	 * @return the surchargeId
	 */
	public String getSurchargeId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SURCHARGEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.surchargeId</code> attribute.
	 * @return the surchargeId
	 */
	public String getSurchargeId()
	{
		return getSurchargeId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.surchargeId</code> attribute. 
	 * @param value the surchargeId
	 */
	protected void setSurchargeId(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+SURCHARGEID+"' is not changeable", 0 );
		}
		setProperty(ctx, SURCHARGEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.surchargeId</code> attribute. 
	 * @param value the surchargeId
	 */
	protected void setSurchargeId(final String value)
	{
		setSurchargeId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute.
	 * @return the surchargeName
	 */
	public String getSurchargeName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.getSurchargeName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SURCHARGENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute.
	 * @return the surchargeName
	 */
	public String getSurchargeName()
	{
		return getSurchargeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute. 
	 * @return the localized surchargeName
	 */
	public Map<Language,String> getAllSurchargeName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SURCHARGENAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute. 
	 * @return the localized surchargeName
	 */
	public Map<Language,String> getAllSurchargeName()
	{
		return getAllSurchargeName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute. 
	 * @param value the surchargeName
	 */
	public void setSurchargeName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractSurchargeSuppDetail.setSurchargeName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SURCHARGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute. 
	 * @param value the surchargeName
	 */
	public void setSurchargeName(final String value)
	{
		setSurchargeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute. 
	 * @param value the surchargeName
	 */
	public void setAllSurchargeName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SURCHARGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.surchargeName</code> attribute. 
	 * @param value the surchargeName
	 */
	public void setAllSurchargeName(final Map<Language,String> value)
	{
		setAllSurchargeName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.travelDate</code> attribute.
	 * @return the travelDate
	 */
	public Set<DateRangeRestriction> getTravelDate(final SessionContext ctx)
	{
		return (Set<DateRangeRestriction>)TRAVELDATEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.travelDate</code> attribute.
	 * @return the travelDate
	 */
	public Set<DateRangeRestriction> getTravelDate()
	{
		return getTravelDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.travelDate</code> attribute. 
	 * @param value the travelDate
	 */
	public void setTravelDate(final SessionContext ctx, final Set<DateRangeRestriction> value)
	{
		TRAVELDATEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.travelDate</code> attribute. 
	 * @param value the travelDate
	 */
	public void setTravelDate(final Set<DateRangeRestriction> value)
	{
		setTravelDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDate. 
	 * @param value the item to add to travelDate
	 */
	public void addToTravelDate(final SessionContext ctx, final DateRangeRestriction value)
	{
		TRAVELDATEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDate. 
	 * @param value the item to add to travelDate
	 */
	public void addToTravelDate(final DateRangeRestriction value)
	{
		addToTravelDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDate. 
	 * @param value the item to remove from travelDate
	 */
	public void removeFromTravelDate(final SessionContext ctx, final DateRangeRestriction value)
	{
		TRAVELDATEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDate. 
	 * @param value the item to remove from travelDate
	 */
	public void removeFromTravelDate(final DateRangeRestriction value)
	{
		removeFromTravelDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractSurchargeSuppDetail.type</code> attribute.
	 * @return the type
	 */
	public EnumerationValue getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractSurchargeSuppDetail.type</code> attribute. 
	 * @param value the type
	 */
	public void setType(final EnumerationValue value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
}
