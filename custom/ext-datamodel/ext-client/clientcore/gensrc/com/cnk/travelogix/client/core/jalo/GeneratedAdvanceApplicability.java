/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.CategoriesAndProductLevelApplicability;
import com.cnk.travelogix.client.core.jalo.RoomLevelApplicability;
import com.cnk.travelogix.client.core.jalo.SupplierRateTypeAndCode;
import com.cnk.travelogix.client.core.jalo.SurchargeLevelApplicability;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import com.cnk.travelogix.product.common.core.jalo.PointOfSale;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.AdvanceApplicability AdvanceApplicability}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAdvanceApplicability extends GenericItem
{
	/** Qualifier of the <code>AdvanceApplicability.pointOfSales</code> attribute **/
	public static final String POINTOFSALES = "pointOfSales";
	/** Qualifier of the <code>AdvanceApplicability.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>AdvanceApplicability.countryOfResidence</code> attribute **/
	public static final String COUNTRYOFRESIDENCE = "countryOfResidence";
	/** Qualifier of the <code>AdvanceApplicability.ancillary</code> attribute **/
	public static final String ANCILLARY = "ancillary";
	/** Qualifier of the <code>AdvanceApplicability.applicableCategoriesAndProduct</code> attribute **/
	public static final String APPLICABLECATEGORIESANDPRODUCT = "applicableCategoriesAndProduct";
	/** Qualifier of the <code>AdvanceApplicability.surchargesApplicability</code> attribute **/
	public static final String SURCHARGESAPPLICABILITY = "surchargesApplicability";
	/** Qualifier of the <code>AdvanceApplicability.rateTypeAndCodeApplicability</code> attribute **/
	public static final String RATETYPEANDCODEAPPLICABILITY = "rateTypeAndCodeApplicability";
	/** Qualifier of the <code>AdvanceApplicability.roomLevelApplicability</code> attribute **/
	public static final String ROOMLEVELAPPLICABILITY = "roomLevelApplicability";
	/**
	* {@link OneToManyHandler} for handling 1:n APPLICABLECATEGORIESANDPRODUCT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CategoriesAndProductLevelApplicability> APPLICABLECATEGORIESANDPRODUCTHANDLER = new OneToManyHandler<CategoriesAndProductLevelApplicability>(
	ClientcoreConstants.TC.CATEGORIESANDPRODUCTLEVELAPPLICABILITY,
	false,
	"advanceApplicability",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SURCHARGESAPPLICABILITY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SurchargeLevelApplicability> SURCHARGESAPPLICABILITYHANDLER = new OneToManyHandler<SurchargeLevelApplicability>(
	ClientcoreConstants.TC.SURCHARGELEVELAPPLICABILITY,
	false,
	"advanceApplicability",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RATETYPEANDCODEAPPLICABILITY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierRateTypeAndCode> RATETYPEANDCODEAPPLICABILITYHANDLER = new OneToManyHandler<SupplierRateTypeAndCode>(
	ClientcoreConstants.TC.SUPPLIERRATETYPEANDCODE,
	false,
	"advanceApplicability",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ROOMLEVELAPPLICABILITY's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RoomLevelApplicability> ROOMLEVELAPPLICABILITYHANDLER = new OneToManyHandler<RoomLevelApplicability>(
	ClientcoreConstants.TC.ROOMLEVELAPPLICABILITY,
	false,
	"advanceApplicability",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(POINTOFSALES, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(COUNTRYOFRESIDENCE, AttributeMode.INITIAL);
		tmp.put(ANCILLARY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.ancillary</code> attribute.
	 * @return the ancillary - Ancillary
	 */
	public Collection<Ancillary> getAncillary(final SessionContext ctx)
	{
		Collection<Ancillary> coll = (Collection<Ancillary>)getProperty( ctx, ANCILLARY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.ancillary</code> attribute.
	 * @return the ancillary - Ancillary
	 */
	public Collection<Ancillary> getAncillary()
	{
		return getAncillary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.ancillary</code> attribute. 
	 * @param value the ancillary - Ancillary
	 */
	public void setAncillary(final SessionContext ctx, final Collection<Ancillary> value)
	{
		setProperty(ctx, ANCILLARY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.ancillary</code> attribute. 
	 * @param value the ancillary - Ancillary
	 */
	public void setAncillary(final Collection<Ancillary> value)
	{
		setAncillary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.applicableCategoriesAndProduct</code> attribute.
	 * @return the applicableCategoriesAndProduct
	 */
	public Collection<CategoriesAndProductLevelApplicability> getApplicableCategoriesAndProduct(final SessionContext ctx)
	{
		return APPLICABLECATEGORIESANDPRODUCTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.applicableCategoriesAndProduct</code> attribute.
	 * @return the applicableCategoriesAndProduct
	 */
	public Collection<CategoriesAndProductLevelApplicability> getApplicableCategoriesAndProduct()
	{
		return getApplicableCategoriesAndProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.applicableCategoriesAndProduct</code> attribute. 
	 * @param value the applicableCategoriesAndProduct
	 */
	public void setApplicableCategoriesAndProduct(final SessionContext ctx, final Collection<CategoriesAndProductLevelApplicability> value)
	{
		APPLICABLECATEGORIESANDPRODUCTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.applicableCategoriesAndProduct</code> attribute. 
	 * @param value the applicableCategoriesAndProduct
	 */
	public void setApplicableCategoriesAndProduct(final Collection<CategoriesAndProductLevelApplicability> value)
	{
		setApplicableCategoriesAndProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to applicableCategoriesAndProduct. 
	 * @param value the item to add to applicableCategoriesAndProduct
	 */
	public void addToApplicableCategoriesAndProduct(final SessionContext ctx, final CategoriesAndProductLevelApplicability value)
	{
		APPLICABLECATEGORIESANDPRODUCTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to applicableCategoriesAndProduct. 
	 * @param value the item to add to applicableCategoriesAndProduct
	 */
	public void addToApplicableCategoriesAndProduct(final CategoriesAndProductLevelApplicability value)
	{
		addToApplicableCategoriesAndProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from applicableCategoriesAndProduct. 
	 * @param value the item to remove from applicableCategoriesAndProduct
	 */
	public void removeFromApplicableCategoriesAndProduct(final SessionContext ctx, final CategoriesAndProductLevelApplicability value)
	{
		APPLICABLECATEGORIESANDPRODUCTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from applicableCategoriesAndProduct. 
	 * @param value the item to remove from applicableCategoriesAndProduct
	 */
	public void removeFromApplicableCategoriesAndProduct(final CategoriesAndProductLevelApplicability value)
	{
		removeFromApplicableCategoriesAndProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.countryOfResidence</code> attribute.
	 * @return the countryOfResidence - Country Of Residence
	 */
	public Collection<Country> getCountryOfResidence(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, COUNTRYOFRESIDENCE);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.countryOfResidence</code> attribute.
	 * @return the countryOfResidence - Country Of Residence
	 */
	public Collection<Country> getCountryOfResidence()
	{
		return getCountryOfResidence( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.countryOfResidence</code> attribute. 
	 * @param value the countryOfResidence - Country Of Residence
	 */
	public void setCountryOfResidence(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, COUNTRYOFRESIDENCE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.countryOfResidence</code> attribute. 
	 * @param value the countryOfResidence - Country Of Residence
	 */
	public void setCountryOfResidence(final Collection<Country> value)
	{
		setCountryOfResidence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.nationality</code> attribute.
	 * @return the nationality - Nationality
	 */
	public Collection<Country> getNationality(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, NATIONALITY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.nationality</code> attribute.
	 * @return the nationality - Nationality
	 */
	public Collection<Country> getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.nationality</code> attribute. 
	 * @param value the nationality - Nationality
	 */
	public void setNationality(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, NATIONALITY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.nationality</code> attribute. 
	 * @param value the nationality - Nationality
	 */
	public void setNationality(final Collection<Country> value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.pointOfSales</code> attribute.
	 * @return the pointOfSales - Point Of Sales
	 */
	public Set<PointOfSale> getPointOfSales(final SessionContext ctx)
	{
		Set<PointOfSale> coll = (Set<PointOfSale>)getProperty( ctx, POINTOFSALES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.pointOfSales</code> attribute.
	 * @return the pointOfSales - Point Of Sales
	 */
	public Set<PointOfSale> getPointOfSales()
	{
		return getPointOfSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.pointOfSales</code> attribute. 
	 * @param value the pointOfSales - Point Of Sales
	 */
	public void setPointOfSales(final SessionContext ctx, final Set<PointOfSale> value)
	{
		setProperty(ctx, POINTOFSALES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.pointOfSales</code> attribute. 
	 * @param value the pointOfSales - Point Of Sales
	 */
	public void setPointOfSales(final Set<PointOfSale> value)
	{
		setPointOfSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.rateTypeAndCodeApplicability</code> attribute.
	 * @return the rateTypeAndCodeApplicability
	 */
	public Collection<SupplierRateTypeAndCode> getRateTypeAndCodeApplicability(final SessionContext ctx)
	{
		return RATETYPEANDCODEAPPLICABILITYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.rateTypeAndCodeApplicability</code> attribute.
	 * @return the rateTypeAndCodeApplicability
	 */
	public Collection<SupplierRateTypeAndCode> getRateTypeAndCodeApplicability()
	{
		return getRateTypeAndCodeApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.rateTypeAndCodeApplicability</code> attribute. 
	 * @param value the rateTypeAndCodeApplicability
	 */
	public void setRateTypeAndCodeApplicability(final SessionContext ctx, final Collection<SupplierRateTypeAndCode> value)
	{
		RATETYPEANDCODEAPPLICABILITYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.rateTypeAndCodeApplicability</code> attribute. 
	 * @param value the rateTypeAndCodeApplicability
	 */
	public void setRateTypeAndCodeApplicability(final Collection<SupplierRateTypeAndCode> value)
	{
		setRateTypeAndCodeApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rateTypeAndCodeApplicability. 
	 * @param value the item to add to rateTypeAndCodeApplicability
	 */
	public void addToRateTypeAndCodeApplicability(final SessionContext ctx, final SupplierRateTypeAndCode value)
	{
		RATETYPEANDCODEAPPLICABILITYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rateTypeAndCodeApplicability. 
	 * @param value the item to add to rateTypeAndCodeApplicability
	 */
	public void addToRateTypeAndCodeApplicability(final SupplierRateTypeAndCode value)
	{
		addToRateTypeAndCodeApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rateTypeAndCodeApplicability. 
	 * @param value the item to remove from rateTypeAndCodeApplicability
	 */
	public void removeFromRateTypeAndCodeApplicability(final SessionContext ctx, final SupplierRateTypeAndCode value)
	{
		RATETYPEANDCODEAPPLICABILITYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rateTypeAndCodeApplicability. 
	 * @param value the item to remove from rateTypeAndCodeApplicability
	 */
	public void removeFromRateTypeAndCodeApplicability(final SupplierRateTypeAndCode value)
	{
		removeFromRateTypeAndCodeApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.roomLevelApplicability</code> attribute.
	 * @return the roomLevelApplicability
	 */
	public Collection<RoomLevelApplicability> getRoomLevelApplicability(final SessionContext ctx)
	{
		return ROOMLEVELAPPLICABILITYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.roomLevelApplicability</code> attribute.
	 * @return the roomLevelApplicability
	 */
	public Collection<RoomLevelApplicability> getRoomLevelApplicability()
	{
		return getRoomLevelApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.roomLevelApplicability</code> attribute. 
	 * @param value the roomLevelApplicability
	 */
	public void setRoomLevelApplicability(final SessionContext ctx, final Collection<RoomLevelApplicability> value)
	{
		ROOMLEVELAPPLICABILITYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.roomLevelApplicability</code> attribute. 
	 * @param value the roomLevelApplicability
	 */
	public void setRoomLevelApplicability(final Collection<RoomLevelApplicability> value)
	{
		setRoomLevelApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomLevelApplicability. 
	 * @param value the item to add to roomLevelApplicability
	 */
	public void addToRoomLevelApplicability(final SessionContext ctx, final RoomLevelApplicability value)
	{
		ROOMLEVELAPPLICABILITYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roomLevelApplicability. 
	 * @param value the item to add to roomLevelApplicability
	 */
	public void addToRoomLevelApplicability(final RoomLevelApplicability value)
	{
		addToRoomLevelApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomLevelApplicability. 
	 * @param value the item to remove from roomLevelApplicability
	 */
	public void removeFromRoomLevelApplicability(final SessionContext ctx, final RoomLevelApplicability value)
	{
		ROOMLEVELAPPLICABILITYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roomLevelApplicability. 
	 * @param value the item to remove from roomLevelApplicability
	 */
	public void removeFromRoomLevelApplicability(final RoomLevelApplicability value)
	{
		removeFromRoomLevelApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.surchargesApplicability</code> attribute.
	 * @return the surchargesApplicability
	 */
	public Collection<SurchargeLevelApplicability> getSurchargesApplicability(final SessionContext ctx)
	{
		return SURCHARGESAPPLICABILITYHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AdvanceApplicability.surchargesApplicability</code> attribute.
	 * @return the surchargesApplicability
	 */
	public Collection<SurchargeLevelApplicability> getSurchargesApplicability()
	{
		return getSurchargesApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.surchargesApplicability</code> attribute. 
	 * @param value the surchargesApplicability
	 */
	public void setSurchargesApplicability(final SessionContext ctx, final Collection<SurchargeLevelApplicability> value)
	{
		SURCHARGESAPPLICABILITYHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AdvanceApplicability.surchargesApplicability</code> attribute. 
	 * @param value the surchargesApplicability
	 */
	public void setSurchargesApplicability(final Collection<SurchargeLevelApplicability> value)
	{
		setSurchargesApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to surchargesApplicability. 
	 * @param value the item to add to surchargesApplicability
	 */
	public void addToSurchargesApplicability(final SessionContext ctx, final SurchargeLevelApplicability value)
	{
		SURCHARGESAPPLICABILITYHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to surchargesApplicability. 
	 * @param value the item to add to surchargesApplicability
	 */
	public void addToSurchargesApplicability(final SurchargeLevelApplicability value)
	{
		addToSurchargesApplicability( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from surchargesApplicability. 
	 * @param value the item to remove from surchargesApplicability
	 */
	public void removeFromSurchargesApplicability(final SessionContext ctx, final SurchargeLevelApplicability value)
	{
		SURCHARGESAPPLICABILITYHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from surchargesApplicability. 
	 * @param value the item to remove from surchargesApplicability
	 */
	public void removeFromSurchargesApplicability(final SurchargeLevelApplicability value)
	{
		removeFromSurchargesApplicability( getSession().getSessionContext(), value );
	}
	
}
