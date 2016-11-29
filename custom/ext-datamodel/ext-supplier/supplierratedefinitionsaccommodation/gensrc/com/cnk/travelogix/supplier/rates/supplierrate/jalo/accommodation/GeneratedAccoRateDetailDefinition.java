/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionsaccommodationConstants;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.jalo.supplierrates.accommodation.AccommodationRateDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.CommonRateAdvDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeRateDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RoomTypeRate;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.accommodation.AccoRateDetailDefinition AccoRateDetailDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoRateDetailDefinition extends GenericItem
{
	/** Qualifier of the <code>AccoRateDetailDefinition.minNights</code> attribute **/
	public static final String MINNIGHTS = "minNights";
	/** Qualifier of the <code>AccoRateDetailDefinition.dayOfWeek</code> attribute **/
	public static final String DAYOFWEEK = "dayOfWeek";
	/** Qualifier of the <code>AccoRateDetailDefinition.rateDefinedFor</code> attribute **/
	public static final String RATEDEFINEDFOR = "rateDefinedFor";
	/** Qualifier of the <code>AccoRateDetailDefinition.roomCategory</code> attribute **/
	public static final String ROOMCATEGORY = "roomCategory";
	/** Qualifier of the <code>AccoRateDetailDefinition.proRata</code> attribute **/
	public static final String PRORATA = "proRata";
	/** Qualifier of the <code>AccoRateDetailDefinition.stayDuration</code> attribute **/
	public static final String STAYDURATION = "stayDuration";
	/** Qualifier of the <code>AccoRateDetailDefinition.rateFor</code> attribute **/
	public static final String RATEFOR = "rateFor";
	/** Qualifier of the <code>AccoRateDetailDefinition.mealPlan</code> attribute **/
	public static final String MEALPLAN = "mealPlan";
	/** Qualifier of the <code>AccoRateDetailDefinition.checkInTime</code> attribute **/
	public static final String CHECKINTIME = "checkInTime";
	/** Qualifier of the <code>AccoRateDetailDefinition.checkOutTime</code> attribute **/
	public static final String CHECKOUTTIME = "checkOutTime";
	/** Qualifier of the <code>AccoRateDetailDefinition.commissionExcluded</code> attribute **/
	public static final String COMMISSIONEXCLUDED = "commissionExcluded";
	/** Qualifier of the <code>AccoRateDetailDefinition.childAge</code> attribute **/
	public static final String CHILDAGE = "childAge";
	/** Qualifier of the <code>AccoRateDetailDefinition.noOfChild</code> attribute **/
	public static final String NOOFCHILD = "noOfChild";
	/** Qualifier of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute **/
	public static final String NOOFADULTS = "noOfAdults";
	/** Qualifier of the <code>AccoRateDetailDefinition.adultAge</code> attribute **/
	public static final String ADULTAGE = "adultAge";
	/** Qualifier of the <code>AccoRateDetailDefinition.rate</code> attribute **/
	public static final String RATE = "rate";
	/** Qualifier of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute **/
	public static final String MINPAXOCCUPANCY = "minPaxOccupancy";
	/** Qualifier of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute **/
	public static final String MAXPAXOCCUPANCY = "maxPaxOccupancy";
	/** Qualifier of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute **/
	public static final String PAYONARRIVAL = "payOnArrival";
	/** Qualifier of the <code>AccoRateDetailDefinition.commonRateAdvDefinition</code> attribute **/
	public static final String COMMONRATEADVDEFINITION = "commonRateAdvDefinition";
	/** Qualifier of the <code>AccoRateDetailDefinition.accoRateDef</code> attribute **/
	public static final String ACCORATEDEF = "accoRateDef";
	/** Qualifier of the <code>AccoRateDetailDefinition.roomTypeRates</code> attribute **/
	public static final String ROOMTYPERATES = "roomTypeRates";
	/** Qualifier of the <code>AccoRateDetailDefinition.absTravelogixSupplierOffers</code> attribute **/
	public static final String ABSTRAVELOGIXSUPPLIEROFFERS = "absTravelogixSupplierOffers";
	/** Relation ordering override parameter constants for AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel from ((supplierratedefinitionsaccommodation))*/
	protected static String ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_SRC_ORDERED = "relation.AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel.source.ordered";
	protected static String ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_TGT_ORDERED = "relation.AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel.target.ordered";
	/** Relation disable markmodifed parameter constants for AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel from ((supplierratedefinitionsaccommodation))*/
	protected static String ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_MARKMODIFIED = "relation.AccoRateDetailDefinition2AbstractTravelogixSupplierOfferRel.markmodified";
	/** Qualifier of the <code>AccoRateDetailDefinition.childRate</code> attribute **/
	public static final String CHILDRATE = "childRate";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCORATEDEF's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoRateDetailDefinition> ACCORATEDEFHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoRateDetailDefinition>(
	SupplierratedefinitionsaccommodationConstants.TC.ACCORATEDETAILDEFINITION,
	false,
	"accoRateDef",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ROOMTYPERATES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RoomTypeRate> ROOMTYPERATESHANDLER = new OneToManyHandler<RoomTypeRate>(
	SupplierratedefinitionsaccommodationConstants.TC.ROOMTYPERATE,
	true,
	"accoRateDetailDefinition",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CHILDRATE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ChildAgeRateDetail> CHILDRATEHANDLER = new OneToManyHandler<ChildAgeRateDetail>(
	SupplierratedefinitionscoreConstants.TC.CHILDAGERATEDETAIL,
	true,
	"accoRateDetailDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MINNIGHTS, AttributeMode.INITIAL);
		tmp.put(DAYOFWEEK, AttributeMode.INITIAL);
		tmp.put(RATEDEFINEDFOR, AttributeMode.INITIAL);
		tmp.put(ROOMCATEGORY, AttributeMode.INITIAL);
		tmp.put(PRORATA, AttributeMode.INITIAL);
		tmp.put(STAYDURATION, AttributeMode.INITIAL);
		tmp.put(RATEFOR, AttributeMode.INITIAL);
		tmp.put(MEALPLAN, AttributeMode.INITIAL);
		tmp.put(CHECKINTIME, AttributeMode.INITIAL);
		tmp.put(CHECKOUTTIME, AttributeMode.INITIAL);
		tmp.put(COMMISSIONEXCLUDED, AttributeMode.INITIAL);
		tmp.put(CHILDAGE, AttributeMode.INITIAL);
		tmp.put(NOOFCHILD, AttributeMode.INITIAL);
		tmp.put(NOOFADULTS, AttributeMode.INITIAL);
		tmp.put(ADULTAGE, AttributeMode.INITIAL);
		tmp.put(RATE, AttributeMode.INITIAL);
		tmp.put(MINPAXOCCUPANCY, AttributeMode.INITIAL);
		tmp.put(MAXPAXOCCUPANCY, AttributeMode.INITIAL);
		tmp.put(PAYONARRIVAL, AttributeMode.INITIAL);
		tmp.put(COMMONRATEADVDEFINITION, AttributeMode.INITIAL);
		tmp.put(ACCORATEDEF, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.absTravelogixSupplierOffers</code> attribute.
	 * @return the absTravelogixSupplierOffers
	 */
	public Collection<AbstractTravelogixSupplierOffer> getAbsTravelogixSupplierOffers(final SessionContext ctx)
	{
		final List<AbstractTravelogixSupplierOffer> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			"AbstractTravelogixSupplierOffer",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.absTravelogixSupplierOffers</code> attribute.
	 * @return the absTravelogixSupplierOffers
	 */
	public Collection<AbstractTravelogixSupplierOffer> getAbsTravelogixSupplierOffers()
	{
		return getAbsTravelogixSupplierOffers( getSession().getSessionContext() );
	}
	
	public long getAbsTravelogixSupplierOffersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			"AbstractTravelogixSupplierOffer",
			null
		);
	}
	
	public long getAbsTravelogixSupplierOffersCount()
	{
		return getAbsTravelogixSupplierOffersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.absTravelogixSupplierOffers</code> attribute. 
	 * @param value the absTravelogixSupplierOffers
	 */
	public void setAbsTravelogixSupplierOffers(final SessionContext ctx, final Collection<AbstractTravelogixSupplierOffer> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.absTravelogixSupplierOffers</code> attribute. 
	 * @param value the absTravelogixSupplierOffers
	 */
	public void setAbsTravelogixSupplierOffers(final Collection<AbstractTravelogixSupplierOffer> value)
	{
		setAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to absTravelogixSupplierOffers. 
	 * @param value the item to add to absTravelogixSupplierOffers
	 */
	public void addToAbsTravelogixSupplierOffers(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to absTravelogixSupplierOffers. 
	 * @param value the item to add to absTravelogixSupplierOffers
	 */
	public void addToAbsTravelogixSupplierOffers(final AbstractTravelogixSupplierOffer value)
	{
		addToAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from absTravelogixSupplierOffers. 
	 * @param value the item to remove from absTravelogixSupplierOffers
	 */
	public void removeFromAbsTravelogixSupplierOffers(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionsaccommodationConstants.Relations.ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ACCORATEDETAILDEFINITION2ABSTRACTTRAVELOGIXSUPPLIEROFFERREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from absTravelogixSupplierOffers. 
	 * @param value the item to remove from absTravelogixSupplierOffers
	 */
	public void removeFromAbsTravelogixSupplierOffers(final AbstractTravelogixSupplierOffer value)
	{
		removeFromAbsTravelogixSupplierOffers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.accoRateDef</code> attribute.
	 * @return the accoRateDef
	 */
	public AccommodationRateDefinition getAccoRateDef(final SessionContext ctx)
	{
		return (AccommodationRateDefinition)getProperty( ctx, ACCORATEDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.accoRateDef</code> attribute.
	 * @return the accoRateDef
	 */
	public AccommodationRateDefinition getAccoRateDef()
	{
		return getAccoRateDef( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.accoRateDef</code> attribute. 
	 * @param value the accoRateDef
	 */
	public void setAccoRateDef(final SessionContext ctx, final AccommodationRateDefinition value)
	{
		ACCORATEDEFHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.accoRateDef</code> attribute. 
	 * @param value the accoRateDef
	 */
	public void setAccoRateDef(final AccommodationRateDefinition value)
	{
		setAccoRateDef( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.adultAge</code> attribute.
	 * @return the adultAge
	 */
	public AgeDetail getAdultAge(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, ADULTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.adultAge</code> attribute.
	 * @return the adultAge
	 */
	public AgeDetail getAdultAge()
	{
		return getAdultAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.adultAge</code> attribute. 
	 * @param value the adultAge
	 */
	public void setAdultAge(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, ADULTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.adultAge</code> attribute. 
	 * @param value the adultAge
	 */
	public void setAdultAge(final AgeDetail value)
	{
		setAdultAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.checkInTime</code> attribute.
	 * @return the checkInTime
	 */
	public String getCheckInTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHECKINTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.checkInTime</code> attribute.
	 * @return the checkInTime
	 */
	public String getCheckInTime()
	{
		return getCheckInTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.checkInTime</code> attribute. 
	 * @param value the checkInTime
	 */
	public void setCheckInTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHECKINTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.checkInTime</code> attribute. 
	 * @param value the checkInTime
	 */
	public void setCheckInTime(final String value)
	{
		setCheckInTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.checkOutTime</code> attribute.
	 * @return the checkOutTime
	 */
	public String getCheckOutTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHECKOUTTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.checkOutTime</code> attribute.
	 * @return the checkOutTime
	 */
	public String getCheckOutTime()
	{
		return getCheckOutTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.checkOutTime</code> attribute. 
	 * @param value the checkOutTime
	 */
	public void setCheckOutTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHECKOUTTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.checkOutTime</code> attribute. 
	 * @param value the checkOutTime
	 */
	public void setCheckOutTime(final String value)
	{
		setCheckOutTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.childAge</code> attribute.
	 * @return the childAge
	 */
	public AgeDetail getChildAge(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, CHILDAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.childAge</code> attribute.
	 * @return the childAge
	 */
	public AgeDetail getChildAge()
	{
		return getChildAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.childAge</code> attribute. 
	 * @param value the childAge
	 */
	public void setChildAge(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, CHILDAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.childAge</code> attribute. 
	 * @param value the childAge
	 */
	public void setChildAge(final AgeDetail value)
	{
		setChildAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.childRate</code> attribute.
	 * @return the childRate
	 */
	public Collection<ChildAgeRateDetail> getChildRate(final SessionContext ctx)
	{
		return CHILDRATEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.childRate</code> attribute.
	 * @return the childRate
	 */
	public Collection<ChildAgeRateDetail> getChildRate()
	{
		return getChildRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.childRate</code> attribute. 
	 * @param value the childRate
	 */
	public void setChildRate(final SessionContext ctx, final Collection<ChildAgeRateDetail> value)
	{
		CHILDRATEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.childRate</code> attribute. 
	 * @param value the childRate
	 */
	public void setChildRate(final Collection<ChildAgeRateDetail> value)
	{
		setChildRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to childRate. 
	 * @param value the item to add to childRate
	 */
	public void addToChildRate(final SessionContext ctx, final ChildAgeRateDetail value)
	{
		CHILDRATEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to childRate. 
	 * @param value the item to add to childRate
	 */
	public void addToChildRate(final ChildAgeRateDetail value)
	{
		addToChildRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from childRate. 
	 * @param value the item to remove from childRate
	 */
	public void removeFromChildRate(final SessionContext ctx, final ChildAgeRateDetail value)
	{
		CHILDRATEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from childRate. 
	 * @param value the item to remove from childRate
	 */
	public void removeFromChildRate(final ChildAgeRateDetail value)
	{
		removeFromChildRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.commissionExcluded</code> attribute.
	 * @return the commissionExcluded
	 */
	public EnumerationValue getCommissionExcluded(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMISSIONEXCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.commissionExcluded</code> attribute.
	 * @return the commissionExcluded
	 */
	public EnumerationValue getCommissionExcluded()
	{
		return getCommissionExcluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.commissionExcluded</code> attribute. 
	 * @param value the commissionExcluded
	 */
	public void setCommissionExcluded(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMISSIONEXCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.commissionExcluded</code> attribute. 
	 * @param value the commissionExcluded
	 */
	public void setCommissionExcluded(final EnumerationValue value)
	{
		setCommissionExcluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.commonRateAdvDefinition</code> attribute.
	 * @return the commonRateAdvDefinition
	 */
	public CommonRateAdvDefinition getCommonRateAdvDefinition(final SessionContext ctx)
	{
		return (CommonRateAdvDefinition)getProperty( ctx, COMMONRATEADVDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.commonRateAdvDefinition</code> attribute.
	 * @return the commonRateAdvDefinition
	 */
	public CommonRateAdvDefinition getCommonRateAdvDefinition()
	{
		return getCommonRateAdvDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.commonRateAdvDefinition</code> attribute. 
	 * @param value the commonRateAdvDefinition
	 */
	public void setCommonRateAdvDefinition(final SessionContext ctx, final CommonRateAdvDefinition value)
	{
		setProperty(ctx, COMMONRATEADVDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.commonRateAdvDefinition</code> attribute. 
	 * @param value the commonRateAdvDefinition
	 */
	public void setCommonRateAdvDefinition(final CommonRateAdvDefinition value)
	{
		setCommonRateAdvDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCORATEDEFHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.dayOfWeek</code> attribute.
	 * @return the dayOfWeek
	 */
	public Collection<EnumerationValue> getDayOfWeek(final SessionContext ctx)
	{
		Collection<EnumerationValue> coll = (Collection<EnumerationValue>)getProperty( ctx, DAYOFWEEK);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.dayOfWeek</code> attribute.
	 * @return the dayOfWeek
	 */
	public Collection<EnumerationValue> getDayOfWeek()
	{
		return getDayOfWeek( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.dayOfWeek</code> attribute. 
	 * @param value the dayOfWeek
	 */
	public void setDayOfWeek(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		setProperty(ctx, DAYOFWEEK,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.dayOfWeek</code> attribute. 
	 * @param value the dayOfWeek
	 */
	public void setDayOfWeek(final Collection<EnumerationValue> value)
	{
		setDayOfWeek( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute.
	 * @return the maxPaxOccupancy
	 */
	public Integer getMaxPaxOccupancy(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPAXOCCUPANCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute.
	 * @return the maxPaxOccupancy
	 */
	public Integer getMaxPaxOccupancy()
	{
		return getMaxPaxOccupancy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute. 
	 * @return the maxPaxOccupancy
	 */
	public int getMaxPaxOccupancyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPaxOccupancy( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute. 
	 * @return the maxPaxOccupancy
	 */
	public int getMaxPaxOccupancyAsPrimitive()
	{
		return getMaxPaxOccupancyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute. 
	 * @param value the maxPaxOccupancy
	 */
	public void setMaxPaxOccupancy(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPAXOCCUPANCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute. 
	 * @param value the maxPaxOccupancy
	 */
	public void setMaxPaxOccupancy(final Integer value)
	{
		setMaxPaxOccupancy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute. 
	 * @param value the maxPaxOccupancy
	 */
	public void setMaxPaxOccupancy(final SessionContext ctx, final int value)
	{
		setMaxPaxOccupancy( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.maxPaxOccupancy</code> attribute. 
	 * @param value the maxPaxOccupancy
	 */
	public void setMaxPaxOccupancy(final int value)
	{
		setMaxPaxOccupancy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.mealPlan</code> attribute.
	 * @return the mealPlan
	 */
	public EnumerationValue getMealPlan(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MEALPLAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.mealPlan</code> attribute.
	 * @return the mealPlan
	 */
	public EnumerationValue getMealPlan()
	{
		return getMealPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.mealPlan</code> attribute. 
	 * @param value the mealPlan
	 */
	public void setMealPlan(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MEALPLAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.mealPlan</code> attribute. 
	 * @param value the mealPlan
	 */
	public void setMealPlan(final EnumerationValue value)
	{
		setMealPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.minNights</code> attribute.
	 * @return the minNights
	 */
	public Integer getMinNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.minNights</code> attribute.
	 * @return the minNights
	 */
	public Integer getMinNights()
	{
		return getMinNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.minNights</code> attribute. 
	 * @return the minNights
	 */
	public int getMinNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.minNights</code> attribute. 
	 * @return the minNights
	 */
	public int getMinNightsAsPrimitive()
	{
		return getMinNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.minNights</code> attribute. 
	 * @param value the minNights
	 */
	public void setMinNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.minNights</code> attribute. 
	 * @param value the minNights
	 */
	public void setMinNights(final Integer value)
	{
		setMinNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.minNights</code> attribute. 
	 * @param value the minNights
	 */
	public void setMinNights(final SessionContext ctx, final int value)
	{
		setMinNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.minNights</code> attribute. 
	 * @param value the minNights
	 */
	public void setMinNights(final int value)
	{
		setMinNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute.
	 * @return the minPaxOccupancy
	 */
	public Integer getMinPaxOccupancy(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAXOCCUPANCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute.
	 * @return the minPaxOccupancy
	 */
	public Integer getMinPaxOccupancy()
	{
		return getMinPaxOccupancy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute. 
	 * @return the minPaxOccupancy
	 */
	public int getMinPaxOccupancyAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPaxOccupancy( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute. 
	 * @return the minPaxOccupancy
	 */
	public int getMinPaxOccupancyAsPrimitive()
	{
		return getMinPaxOccupancyAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute. 
	 * @param value the minPaxOccupancy
	 */
	public void setMinPaxOccupancy(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAXOCCUPANCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute. 
	 * @param value the minPaxOccupancy
	 */
	public void setMinPaxOccupancy(final Integer value)
	{
		setMinPaxOccupancy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute. 
	 * @param value the minPaxOccupancy
	 */
	public void setMinPaxOccupancy(final SessionContext ctx, final int value)
	{
		setMinPaxOccupancy( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.minPaxOccupancy</code> attribute. 
	 * @param value the minPaxOccupancy
	 */
	public void setMinPaxOccupancy(final int value)
	{
		setMinPaxOccupancy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute.
	 * @return the noOfAdults
	 */
	public Integer getNoOfAdults(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFADULTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute.
	 * @return the noOfAdults
	 */
	public Integer getNoOfAdults()
	{
		return getNoOfAdults( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute. 
	 * @return the noOfAdults
	 */
	public int getNoOfAdultsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfAdults( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute. 
	 * @return the noOfAdults
	 */
	public int getNoOfAdultsAsPrimitive()
	{
		return getNoOfAdultsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute. 
	 * @param value the noOfAdults
	 */
	public void setNoOfAdults(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFADULTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute. 
	 * @param value the noOfAdults
	 */
	public void setNoOfAdults(final Integer value)
	{
		setNoOfAdults( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute. 
	 * @param value the noOfAdults
	 */
	public void setNoOfAdults(final SessionContext ctx, final int value)
	{
		setNoOfAdults( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.noOfAdults</code> attribute. 
	 * @param value the noOfAdults
	 */
	public void setNoOfAdults(final int value)
	{
		setNoOfAdults( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.noOfChild</code> attribute.
	 * @return the noOfChild
	 */
	public Integer getNoOfChild(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.noOfChild</code> attribute.
	 * @return the noOfChild
	 */
	public Integer getNoOfChild()
	{
		return getNoOfChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.noOfChild</code> attribute. 
	 * @return the noOfChild
	 */
	public int getNoOfChildAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfChild( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.noOfChild</code> attribute. 
	 * @return the noOfChild
	 */
	public int getNoOfChildAsPrimitive()
	{
		return getNoOfChildAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.noOfChild</code> attribute. 
	 * @param value the noOfChild
	 */
	public void setNoOfChild(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.noOfChild</code> attribute. 
	 * @param value the noOfChild
	 */
	public void setNoOfChild(final Integer value)
	{
		setNoOfChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.noOfChild</code> attribute. 
	 * @param value the noOfChild
	 */
	public void setNoOfChild(final SessionContext ctx, final int value)
	{
		setNoOfChild( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.noOfChild</code> attribute. 
	 * @param value the noOfChild
	 */
	public void setNoOfChild(final int value)
	{
		setNoOfChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PAYONARRIVAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute.
	 * @return the payOnArrival
	 */
	public Boolean isPayOnArrival()
	{
		return isPayOnArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPayOnArrival( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute. 
	 * @return the payOnArrival
	 */
	public boolean isPayOnArrivalAsPrimitive()
	{
		return isPayOnArrivalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PAYONARRIVAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final Boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final SessionContext ctx, final boolean value)
	{
		setPayOnArrival( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.payOnArrival</code> attribute. 
	 * @param value the payOnArrival
	 */
	public void setPayOnArrival(final boolean value)
	{
		setPayOnArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.proRata</code> attribute.
	 * @return the proRata
	 */
	public Boolean isProRata(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PRORATA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.proRata</code> attribute.
	 * @return the proRata
	 */
	public Boolean isProRata()
	{
		return isProRata( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.proRata</code> attribute. 
	 * @return the proRata
	 */
	public boolean isProRataAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isProRata( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.proRata</code> attribute. 
	 * @return the proRata
	 */
	public boolean isProRataAsPrimitive()
	{
		return isProRataAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.proRata</code> attribute. 
	 * @param value the proRata
	 */
	public void setProRata(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PRORATA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.proRata</code> attribute. 
	 * @param value the proRata
	 */
	public void setProRata(final Boolean value)
	{
		setProRata( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.proRata</code> attribute. 
	 * @param value the proRata
	 */
	public void setProRata(final SessionContext ctx, final boolean value)
	{
		setProRata( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.proRata</code> attribute. 
	 * @param value the proRata
	 */
	public void setProRata(final boolean value)
	{
		setProRata( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.rate</code> attribute.
	 * @return the rate
	 */
	public Double getRate(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.rate</code> attribute.
	 * @return the rate
	 */
	public Double getRate()
	{
		return getRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.rate</code> attribute. 
	 * @return the rate
	 */
	public double getRateAsPrimitive(final SessionContext ctx)
	{
		Double value = getRate( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.rate</code> attribute. 
	 * @return the rate
	 */
	public double getRateAsPrimitive()
	{
		return getRateAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final Double value)
	{
		setRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final SessionContext ctx, final double value)
	{
		setRate( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.rate</code> attribute. 
	 * @param value the rate
	 */
	public void setRate(final double value)
	{
		setRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.rateDefinedFor</code> attribute.
	 * @return the rateDefinedFor
	 */
	public EnumerationValue getRateDefinedFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATEDEFINEDFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.rateDefinedFor</code> attribute.
	 * @return the rateDefinedFor
	 */
	public EnumerationValue getRateDefinedFor()
	{
		return getRateDefinedFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.rateDefinedFor</code> attribute. 
	 * @param value the rateDefinedFor
	 */
	public void setRateDefinedFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATEDEFINEDFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.rateDefinedFor</code> attribute. 
	 * @param value the rateDefinedFor
	 */
	public void setRateDefinedFor(final EnumerationValue value)
	{
		setRateDefinedFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.rateFor</code> attribute.
	 * @return the rateFor
	 */
	public EnumerationValue getRateFor(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RATEFOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.rateFor</code> attribute.
	 * @return the rateFor
	 */
	public EnumerationValue getRateFor()
	{
		return getRateFor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.rateFor</code> attribute. 
	 * @param value the rateFor
	 */
	public void setRateFor(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RATEFOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.rateFor</code> attribute. 
	 * @param value the rateFor
	 */
	public void setRateFor(final EnumerationValue value)
	{
		setRateFor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ROOMCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.roomCategory</code> attribute.
	 * @return the roomCategory
	 */
	public EnumerationValue getRoomCategory()
	{
		return getRoomCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ROOMCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.roomCategory</code> attribute. 
	 * @param value the roomCategory
	 */
	public void setRoomCategory(final EnumerationValue value)
	{
		setRoomCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.roomTypeRates</code> attribute.
	 * @return the roomTypeRates
	 */
	public Set<RoomTypeRate> getRoomTypeRates(final SessionContext ctx)
	{
		return (Set<RoomTypeRate>)ROOMTYPERATESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.roomTypeRates</code> attribute.
	 * @return the roomTypeRates
	 */
	public Set<RoomTypeRate> getRoomTypeRates()
	{
		return getRoomTypeRates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.roomTypeRates</code> attribute. 
	 * @param value the roomTypeRates
	 */
	public void setRoomTypeRates(final SessionContext ctx, final Set<RoomTypeRate> value)
	{
		ROOMTYPERATESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.roomTypeRates</code> attribute. 
	 * @param value the roomTypeRates
	 */
	public void setRoomTypeRates(final Set<RoomTypeRate> value)
	{
		setRoomTypeRates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomTypeRates. 
	 * @param value the item to add to roomTypeRates
	 */
	public void addToRoomTypeRates(final SessionContext ctx, final RoomTypeRate value)
	{
		ROOMTYPERATESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomTypeRates. 
	 * @param value the item to add to roomTypeRates
	 */
	public void addToRoomTypeRates(final RoomTypeRate value)
	{
		addToRoomTypeRates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomTypeRates. 
	 * @param value the item to remove from roomTypeRates
	 */
	public void removeFromRoomTypeRates(final SessionContext ctx, final RoomTypeRate value)
	{
		ROOMTYPERATESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomTypeRates. 
	 * @param value the item to remove from roomTypeRates
	 */
	public void removeFromRoomTypeRates(final RoomTypeRate value)
	{
		removeFromRoomTypeRates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.stayDuration</code> attribute.
	 * @return the stayDuration
	 */
	public Integer getStayDuration(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, STAYDURATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.stayDuration</code> attribute.
	 * @return the stayDuration
	 */
	public Integer getStayDuration()
	{
		return getStayDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.stayDuration</code> attribute. 
	 * @return the stayDuration
	 */
	public int getStayDurationAsPrimitive(final SessionContext ctx)
	{
		Integer value = getStayDuration( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoRateDetailDefinition.stayDuration</code> attribute. 
	 * @return the stayDuration
	 */
	public int getStayDurationAsPrimitive()
	{
		return getStayDurationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.stayDuration</code> attribute. 
	 * @param value the stayDuration
	 */
	public void setStayDuration(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, STAYDURATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.stayDuration</code> attribute. 
	 * @param value the stayDuration
	 */
	public void setStayDuration(final Integer value)
	{
		setStayDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.stayDuration</code> attribute. 
	 * @param value the stayDuration
	 */
	public void setStayDuration(final SessionContext ctx, final int value)
	{
		setStayDuration( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoRateDetailDefinition.stayDuration</code> attribute. 
	 * @param value the stayDuration
	 */
	public void setStayDuration(final int value)
	{
		setStayDuration( getSession().getSessionContext(), value );
	}
	
}
