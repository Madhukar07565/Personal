/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import com.cnk.travelogix.product.common.core.jalo.CruiseBrand;
import com.cnk.travelogix.product.common.core.jalo.CruiseCompany;
import com.cnk.travelogix.product.common.core.jalo.CruiseDestination;
import com.cnk.travelogix.product.common.core.jalo.Ship;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.CruiseItinerary;
import com.cnk.travelogix.product.transport.masters.core.jalo.VisaRequirement;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.CruisePackage CruisePackage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCruisePackage extends Product
{
	/** Qualifier of the <code>CruisePackage.cruiseCompanyName</code> attribute **/
	public static final String CRUISECOMPANYNAME = "cruiseCompanyName";
	/** Qualifier of the <code>CruisePackage.cruiseBrandName</code> attribute **/
	public static final String CRUISEBRANDNAME = "cruiseBrandName";
	/** Qualifier of the <code>CruisePackage.shipName</code> attribute **/
	public static final String SHIPNAME = "shipName";
	/** Qualifier of the <code>CruisePackage.cruiseDestinationName</code> attribute **/
	public static final String CRUISEDESTINATIONNAME = "cruiseDestinationName";
	/** Qualifier of the <code>CruisePackage.pakageName</code> attribute **/
	public static final String PAKAGENAME = "pakageName";
	/** Qualifier of the <code>CruisePackage.supplierProductCode</code> attribute **/
	public static final String SUPPLIERPRODUCTCODE = "supplierProductCode";
	/** Qualifier of the <code>CruisePackage.companyRecommended</code> attribute **/
	public static final String COMPANYRECOMMENDED = "companyRecommended";
	/** Qualifier of the <code>CruisePackage.supplierRating</code> attribute **/
	public static final String SUPPLIERRATING = "supplierRating";
	/** Qualifier of the <code>CruisePackage.companyRating</code> attribute **/
	public static final String COMPANYRATING = "companyRating";
	/** Qualifier of the <code>CruisePackage.supplierRatingAsOnDate</code> attribute **/
	public static final String SUPPLIERRATINGASONDATE = "supplierRatingAsOnDate";
	/** Qualifier of the <code>CruisePackage.companyRatingAsOnDate</code> attribute **/
	public static final String COMPANYRATINGASONDATE = "companyRatingAsOnDate";
	/** Qualifier of the <code>CruisePackage.itineraries</code> attribute **/
	public static final String ITINERARIES = "itineraries";
	/** Qualifier of the <code>CruisePackage.cruiseAncillaries</code> attribute **/
	public static final String CRUISEANCILLARIES = "cruiseAncillaries";
	/** Qualifier of the <code>CruisePackage.visaRequirements</code> attribute **/
	public static final String VISAREQUIREMENTS = "visaRequirements";
	/** Qualifier of the <code>CruisePackage.themes</code> attribute **/
	public static final String THEMES = "themes";
	/** Relation ordering override parameter constants for CruisePackageTOThemes from ((transportproductmasterscore))*/
	protected static String CRUISEPACKAGETOTHEMES_SRC_ORDERED = "relation.CruisePackageTOThemes.source.ordered";
	protected static String CRUISEPACKAGETOTHEMES_TGT_ORDERED = "relation.CruisePackageTOThemes.target.ordered";
	/** Relation disable markmodifed parameter constants for CruisePackageTOThemes from ((transportproductmasterscore))*/
	protected static String CRUISEPACKAGETOTHEMES_MARKMODIFIED = "relation.CruisePackageTOThemes.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n ITINERARIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CruiseItinerary> ITINERARIESHANDLER = new OneToManyHandler<CruiseItinerary>(
	TransportproductmasterscoreConstants.TC.CRUISEITINERARY,
	true,
	"cruisePackage",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CRUISEANCILLARIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Ancillary> CRUISEANCILLARIESHANDLER = new OneToManyHandler<Ancillary>(
	CommonproductcoreConstants.TC.ANCILLARY,
	true,
	"cruisePackage",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n VISAREQUIREMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VisaRequirement> VISAREQUIREMENTSHANDLER = new OneToManyHandler<VisaRequirement>(
	TransportproductmasterscoreConstants.TC.VISAREQUIREMENT,
	true,
	"cruisePackage",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CRUISECOMPANYNAME, AttributeMode.INITIAL);
		tmp.put(CRUISEBRANDNAME, AttributeMode.INITIAL);
		tmp.put(SHIPNAME, AttributeMode.INITIAL);
		tmp.put(CRUISEDESTINATIONNAME, AttributeMode.INITIAL);
		tmp.put(PAKAGENAME, AttributeMode.INITIAL);
		tmp.put(SUPPLIERPRODUCTCODE, AttributeMode.INITIAL);
		tmp.put(COMPANYRECOMMENDED, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATING, AttributeMode.INITIAL);
		tmp.put(COMPANYRATING, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATINGASONDATE, AttributeMode.INITIAL);
		tmp.put(COMPANYRATINGASONDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.companyRating</code> attribute.
	 * @return the companyRating - To show the companyRating.
	 */
	public EnumerationValue getCompanyRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMPANYRATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.companyRating</code> attribute.
	 * @return the companyRating - To show the companyRating.
	 */
	public EnumerationValue getCompanyRating()
	{
		return getCompanyRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.companyRating</code> attribute. 
	 * @param value the companyRating - To show the companyRating.
	 */
	public void setCompanyRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMPANYRATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.companyRating</code> attribute. 
	 * @param value the companyRating - To show the companyRating.
	 */
	public void setCompanyRating(final EnumerationValue value)
	{
		setCompanyRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.companyRatingAsOnDate</code> attribute.
	 * @return the companyRatingAsOnDate - To show the companyRatingAsOnDate.
	 */
	public Date getCompanyRatingAsOnDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, COMPANYRATINGASONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.companyRatingAsOnDate</code> attribute.
	 * @return the companyRatingAsOnDate - To show the companyRatingAsOnDate.
	 */
	public Date getCompanyRatingAsOnDate()
	{
		return getCompanyRatingAsOnDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.companyRatingAsOnDate</code> attribute. 
	 * @param value the companyRatingAsOnDate - To show the companyRatingAsOnDate.
	 */
	public void setCompanyRatingAsOnDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, COMPANYRATINGASONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.companyRatingAsOnDate</code> attribute. 
	 * @param value the companyRatingAsOnDate - To show the companyRatingAsOnDate.
	 */
	public void setCompanyRatingAsOnDate(final Date value)
	{
		setCompanyRatingAsOnDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.companyRecommended</code> attribute.
	 * @return the companyRecommended - To show the companyRecommended.
	 */
	public Boolean isCompanyRecommended(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMPANYRECOMMENDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.companyRecommended</code> attribute.
	 * @return the companyRecommended - To show the companyRecommended.
	 */
	public Boolean isCompanyRecommended()
	{
		return isCompanyRecommended( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.companyRecommended</code> attribute. 
	 * @return the companyRecommended - To show the companyRecommended.
	 */
	public boolean isCompanyRecommendedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCompanyRecommended( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.companyRecommended</code> attribute. 
	 * @return the companyRecommended - To show the companyRecommended.
	 */
	public boolean isCompanyRecommendedAsPrimitive()
	{
		return isCompanyRecommendedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.companyRecommended</code> attribute. 
	 * @param value the companyRecommended - To show the companyRecommended.
	 */
	public void setCompanyRecommended(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMPANYRECOMMENDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.companyRecommended</code> attribute. 
	 * @param value the companyRecommended - To show the companyRecommended.
	 */
	public void setCompanyRecommended(final Boolean value)
	{
		setCompanyRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.companyRecommended</code> attribute. 
	 * @param value the companyRecommended - To show the companyRecommended.
	 */
	public void setCompanyRecommended(final SessionContext ctx, final boolean value)
	{
		setCompanyRecommended( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.companyRecommended</code> attribute. 
	 * @param value the companyRecommended - To show the companyRecommended.
	 */
	public void setCompanyRecommended(final boolean value)
	{
		setCompanyRecommended( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.cruiseAncillaries</code> attribute.
	 * @return the cruiseAncillaries
	 */
	public Collection<Ancillary> getCruiseAncillaries(final SessionContext ctx)
	{
		return CRUISEANCILLARIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.cruiseAncillaries</code> attribute.
	 * @return the cruiseAncillaries
	 */
	public Collection<Ancillary> getCruiseAncillaries()
	{
		return getCruiseAncillaries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.cruiseAncillaries</code> attribute. 
	 * @param value the cruiseAncillaries
	 */
	public void setCruiseAncillaries(final SessionContext ctx, final Collection<Ancillary> value)
	{
		CRUISEANCILLARIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.cruiseAncillaries</code> attribute. 
	 * @param value the cruiseAncillaries
	 */
	public void setCruiseAncillaries(final Collection<Ancillary> value)
	{
		setCruiseAncillaries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseAncillaries. 
	 * @param value the item to add to cruiseAncillaries
	 */
	public void addToCruiseAncillaries(final SessionContext ctx, final Ancillary value)
	{
		CRUISEANCILLARIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cruiseAncillaries. 
	 * @param value the item to add to cruiseAncillaries
	 */
	public void addToCruiseAncillaries(final Ancillary value)
	{
		addToCruiseAncillaries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseAncillaries. 
	 * @param value the item to remove from cruiseAncillaries
	 */
	public void removeFromCruiseAncillaries(final SessionContext ctx, final Ancillary value)
	{
		CRUISEANCILLARIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cruiseAncillaries. 
	 * @param value the item to remove from cruiseAncillaries
	 */
	public void removeFromCruiseAncillaries(final Ancillary value)
	{
		removeFromCruiseAncillaries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.cruiseBrandName</code> attribute.
	 * @return the cruiseBrandName - To show the cruiseBrandName.
	 */
	public CruiseBrand getCruiseBrandName(final SessionContext ctx)
	{
		return (CruiseBrand)getProperty( ctx, CRUISEBRANDNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.cruiseBrandName</code> attribute.
	 * @return the cruiseBrandName - To show the cruiseBrandName.
	 */
	public CruiseBrand getCruiseBrandName()
	{
		return getCruiseBrandName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.cruiseBrandName</code> attribute. 
	 * @param value the cruiseBrandName - To show the cruiseBrandName.
	 */
	public void setCruiseBrandName(final SessionContext ctx, final CruiseBrand value)
	{
		setProperty(ctx, CRUISEBRANDNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.cruiseBrandName</code> attribute. 
	 * @param value the cruiseBrandName - To show the cruiseBrandName.
	 */
	public void setCruiseBrandName(final CruiseBrand value)
	{
		setCruiseBrandName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.cruiseCompanyName</code> attribute.
	 * @return the cruiseCompanyName - To show the cruiseCompanyName.
	 */
	public CruiseCompany getCruiseCompanyName(final SessionContext ctx)
	{
		return (CruiseCompany)getProperty( ctx, CRUISECOMPANYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.cruiseCompanyName</code> attribute.
	 * @return the cruiseCompanyName - To show the cruiseCompanyName.
	 */
	public CruiseCompany getCruiseCompanyName()
	{
		return getCruiseCompanyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.cruiseCompanyName</code> attribute. 
	 * @param value the cruiseCompanyName - To show the cruiseCompanyName.
	 */
	public void setCruiseCompanyName(final SessionContext ctx, final CruiseCompany value)
	{
		setProperty(ctx, CRUISECOMPANYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.cruiseCompanyName</code> attribute. 
	 * @param value the cruiseCompanyName - To show the cruiseCompanyName.
	 */
	public void setCruiseCompanyName(final CruiseCompany value)
	{
		setCruiseCompanyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.cruiseDestinationName</code> attribute.
	 * @return the cruiseDestinationName - To show the cruiseDestinationName.
	 */
	public CruiseDestination getCruiseDestinationName(final SessionContext ctx)
	{
		return (CruiseDestination)getProperty( ctx, CRUISEDESTINATIONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.cruiseDestinationName</code> attribute.
	 * @return the cruiseDestinationName - To show the cruiseDestinationName.
	 */
	public CruiseDestination getCruiseDestinationName()
	{
		return getCruiseDestinationName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.cruiseDestinationName</code> attribute. 
	 * @param value the cruiseDestinationName - To show the cruiseDestinationName.
	 */
	public void setCruiseDestinationName(final SessionContext ctx, final CruiseDestination value)
	{
		setProperty(ctx, CRUISEDESTINATIONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.cruiseDestinationName</code> attribute. 
	 * @param value the cruiseDestinationName - To show the cruiseDestinationName.
	 */
	public void setCruiseDestinationName(final CruiseDestination value)
	{
		setCruiseDestinationName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.itineraries</code> attribute.
	 * @return the itineraries
	 */
	public Collection<CruiseItinerary> getItineraries(final SessionContext ctx)
	{
		return ITINERARIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.itineraries</code> attribute.
	 * @return the itineraries
	 */
	public Collection<CruiseItinerary> getItineraries()
	{
		return getItineraries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.itineraries</code> attribute. 
	 * @param value the itineraries
	 */
	public void setItineraries(final SessionContext ctx, final Collection<CruiseItinerary> value)
	{
		ITINERARIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.itineraries</code> attribute. 
	 * @param value the itineraries
	 */
	public void setItineraries(final Collection<CruiseItinerary> value)
	{
		setItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraries. 
	 * @param value the item to add to itineraries
	 */
	public void addToItineraries(final SessionContext ctx, final CruiseItinerary value)
	{
		ITINERARIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to itineraries. 
	 * @param value the item to add to itineraries
	 */
	public void addToItineraries(final CruiseItinerary value)
	{
		addToItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraries. 
	 * @param value the item to remove from itineraries
	 */
	public void removeFromItineraries(final SessionContext ctx, final CruiseItinerary value)
	{
		ITINERARIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from itineraries. 
	 * @param value the item to remove from itineraries
	 */
	public void removeFromItineraries(final CruiseItinerary value)
	{
		removeFromItineraries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.pakageName</code> attribute.
	 * @return the pakageName - To show the pakageName.
	 */
	public String getPakageName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAKAGENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.pakageName</code> attribute.
	 * @return the pakageName - To show the pakageName.
	 */
	public String getPakageName()
	{
		return getPakageName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.pakageName</code> attribute. 
	 * @param value the pakageName - To show the pakageName.
	 */
	public void setPakageName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAKAGENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.pakageName</code> attribute. 
	 * @param value the pakageName - To show the pakageName.
	 */
	public void setPakageName(final String value)
	{
		setPakageName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.shipName</code> attribute.
	 * @return the shipName - To show the shipName.
	 */
	public Ship getShipName(final SessionContext ctx)
	{
		return (Ship)getProperty( ctx, SHIPNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.shipName</code> attribute.
	 * @return the shipName - To show the shipName.
	 */
	public Ship getShipName()
	{
		return getShipName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.shipName</code> attribute. 
	 * @param value the shipName - To show the shipName.
	 */
	public void setShipName(final SessionContext ctx, final Ship value)
	{
		setProperty(ctx, SHIPNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.shipName</code> attribute. 
	 * @param value the shipName - To show the shipName.
	 */
	public void setShipName(final Ship value)
	{
		setShipName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.supplierProductCode</code> attribute.
	 * @return the supplierProductCode - To show the supplierProductCode.
	 */
	public String getSupplierProductCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUPPLIERPRODUCTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.supplierProductCode</code> attribute.
	 * @return the supplierProductCode - To show the supplierProductCode.
	 */
	public String getSupplierProductCode()
	{
		return getSupplierProductCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.supplierProductCode</code> attribute. 
	 * @param value the supplierProductCode - To show the supplierProductCode.
	 */
	public void setSupplierProductCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUPPLIERPRODUCTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.supplierProductCode</code> attribute. 
	 * @param value the supplierProductCode - To show the supplierProductCode.
	 */
	public void setSupplierProductCode(final String value)
	{
		setSupplierProductCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.supplierRating</code> attribute.
	 * @return the supplierRating - To show the supplierRating.
	 */
	public EnumerationValue getSupplierRating(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SUPPLIERRATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.supplierRating</code> attribute.
	 * @return the supplierRating - To show the supplierRating.
	 */
	public EnumerationValue getSupplierRating()
	{
		return getSupplierRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.supplierRating</code> attribute. 
	 * @param value the supplierRating - To show the supplierRating.
	 */
	public void setSupplierRating(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SUPPLIERRATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.supplierRating</code> attribute. 
	 * @param value the supplierRating - To show the supplierRating.
	 */
	public void setSupplierRating(final EnumerationValue value)
	{
		setSupplierRating( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.supplierRatingAsOnDate</code> attribute.
	 * @return the supplierRatingAsOnDate - To show the supplierRatingAsOnDate.
	 */
	public Date getSupplierRatingAsOnDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, SUPPLIERRATINGASONDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.supplierRatingAsOnDate</code> attribute.
	 * @return the supplierRatingAsOnDate - To show the supplierRatingAsOnDate.
	 */
	public Date getSupplierRatingAsOnDate()
	{
		return getSupplierRatingAsOnDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.supplierRatingAsOnDate</code> attribute. 
	 * @param value the supplierRatingAsOnDate - To show the supplierRatingAsOnDate.
	 */
	public void setSupplierRatingAsOnDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, SUPPLIERRATINGASONDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.supplierRatingAsOnDate</code> attribute. 
	 * @param value the supplierRatingAsOnDate - To show the supplierRatingAsOnDate.
	 */
	public void setSupplierRatingAsOnDate(final Date value)
	{
		setSupplierRatingAsOnDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.themes</code> attribute.
	 * @return the themes
	 */
	public Collection<EnumerationValue> getThemes(final SessionContext ctx)
	{
		final List<EnumerationValue> items = getLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			"Theme",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.themes</code> attribute.
	 * @return the themes
	 */
	public Collection<EnumerationValue> getThemes()
	{
		return getThemes( getSession().getSessionContext() );
	}
	
	public long getThemesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			"Theme",
			null
		);
	}
	
	public long getThemesCount()
	{
		return getThemesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.themes</code> attribute. 
	 * @param value the themes
	 */
	public void setThemes(final SessionContext ctx, final Collection<EnumerationValue> value)
	{
		new PartOfHandler<Collection<EnumerationValue>>()
		{
			@Override
			protected Collection<EnumerationValue> doGetValue(final SessionContext ctx)
			{
				return getThemes( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Collection<EnumerationValue> _value)
			{
				final Collection<EnumerationValue> value = _value;
				setLinkedItems( 
					ctx,
					true,
					TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(CRUISEPACKAGETOTHEMES_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.themes</code> attribute. 
	 * @param value the themes
	 */
	public void setThemes(final Collection<EnumerationValue> value)
	{
		setThemes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to themes. 
	 * @param value the item to add to themes
	 */
	public void addToThemes(final SessionContext ctx, final EnumerationValue value)
	{
		addLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CRUISEPACKAGETOTHEMES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to themes. 
	 * @param value the item to add to themes
	 */
	public void addToThemes(final EnumerationValue value)
	{
		addToThemes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from themes. 
	 * @param value the item to remove from themes
	 */
	public void removeFromThemes(final SessionContext ctx, final EnumerationValue value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CRUISEPACKAGETOTHEMES_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,TransportproductmasterscoreConstants.Relations.CRUISEPACKAGETOTHEMES,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from themes. 
	 * @param value the item to remove from themes
	 */
	public void removeFromThemes(final EnumerationValue value)
	{
		removeFromThemes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.visaRequirements</code> attribute.
	 * @return the visaRequirements
	 */
	public Collection<VisaRequirement> getVisaRequirements(final SessionContext ctx)
	{
		return VISAREQUIREMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CruisePackage.visaRequirements</code> attribute.
	 * @return the visaRequirements
	 */
	public Collection<VisaRequirement> getVisaRequirements()
	{
		return getVisaRequirements( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.visaRequirements</code> attribute. 
	 * @param value the visaRequirements
	 */
	public void setVisaRequirements(final SessionContext ctx, final Collection<VisaRequirement> value)
	{
		VISAREQUIREMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CruisePackage.visaRequirements</code> attribute. 
	 * @param value the visaRequirements
	 */
	public void setVisaRequirements(final Collection<VisaRequirement> value)
	{
		setVisaRequirements( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visaRequirements. 
	 * @param value the item to add to visaRequirements
	 */
	public void addToVisaRequirements(final SessionContext ctx, final VisaRequirement value)
	{
		VISAREQUIREMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to visaRequirements. 
	 * @param value the item to add to visaRequirements
	 */
	public void addToVisaRequirements(final VisaRequirement value)
	{
		addToVisaRequirements( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visaRequirements. 
	 * @param value the item to remove from visaRequirements
	 */
	public void removeFromVisaRequirements(final SessionContext ctx, final VisaRequirement value)
	{
		VISAREQUIREMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from visaRequirements. 
	 * @param value the item to remove from visaRequirements
	 */
	public void removeFromVisaRequirements(final VisaRequirement value)
	{
		removeFromVisaRequirements( getSession().getSessionContext(), value );
	}
	
}
