/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.prefernce.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.prefernce.jalo.CarPreference CarPreference}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCarPreference extends GenericItem
{
	/** Qualifier of the <code>CarPreference.destinationCountry</code> attribute **/
	public static final String DESTINATIONCOUNTRY = "destinationCountry";
	/** Qualifier of the <code>CarPreference.carGroupType</code> attribute **/
	public static final String CARGROUPTYPE = "carGroupType";
	/** Qualifier of the <code>CarPreference.acrissCode</code> attribute **/
	public static final String ACRISSCODE = "acrissCode";
	/** Qualifier of the <code>CarPreference.carCategory</code> attribute **/
	public static final String CARCATEGORY = "carCategory";
	/** Qualifier of the <code>CarPreference.vehicleName</code> attribute **/
	public static final String VEHICLENAME = "vehicleName";
	/** Qualifier of the <code>CarPreference.withAc</code> attribute **/
	public static final String WITHAC = "withAc";
	/** Qualifier of the <code>CarPreference.withChauffer</code> attribute **/
	public static final String WITHCHAUFFER = "withChauffer";
	/** Qualifier of the <code>CarPreference.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCarPreference> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedCarPreference>(
	ClientcoreConstants.TC.CARPREFERENCE,
	false,
	"travellerProfile",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DESTINATIONCOUNTRY, AttributeMode.INITIAL);
		tmp.put(CARGROUPTYPE, AttributeMode.INITIAL);
		tmp.put(ACRISSCODE, AttributeMode.INITIAL);
		tmp.put(CARCATEGORY, AttributeMode.INITIAL);
		tmp.put(VEHICLENAME, AttributeMode.INITIAL);
		tmp.put(WITHAC, AttributeMode.INITIAL);
		tmp.put(WITHCHAUFFER, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.acrissCode</code> attribute.
	 * @return the acrissCode
	 */
	public EnumerationValue getAcrissCode(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ACRISSCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.acrissCode</code> attribute.
	 * @return the acrissCode
	 */
	public EnumerationValue getAcrissCode()
	{
		return getAcrissCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.acrissCode</code> attribute. 
	 * @param value the acrissCode
	 */
	public void setAcrissCode(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ACRISSCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.acrissCode</code> attribute. 
	 * @param value the acrissCode
	 */
	public void setAcrissCode(final EnumerationValue value)
	{
		setAcrissCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.carCategory</code> attribute.
	 * @return the carCategory
	 */
	public EnumerationValue getCarCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.carCategory</code> attribute.
	 * @return the carCategory
	 */
	public EnumerationValue getCarCategory()
	{
		return getCarCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.carCategory</code> attribute. 
	 * @param value the carCategory
	 */
	public void setCarCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.carCategory</code> attribute. 
	 * @param value the carCategory
	 */
	public void setCarCategory(final EnumerationValue value)
	{
		setCarCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.carGroupType</code> attribute.
	 * @return the carGroupType
	 */
	public EnumerationValue getCarGroupType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CARGROUPTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.carGroupType</code> attribute.
	 * @return the carGroupType
	 */
	public EnumerationValue getCarGroupType()
	{
		return getCarGroupType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.carGroupType</code> attribute. 
	 * @param value the carGroupType
	 */
	public void setCarGroupType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CARGROUPTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.carGroupType</code> attribute. 
	 * @param value the carGroupType
	 */
	public void setCarGroupType(final EnumerationValue value)
	{
		setCarGroupType( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.destinationCountry</code> attribute.
	 * @return the destinationCountry
	 */
	public Country getDestinationCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, DESTINATIONCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.destinationCountry</code> attribute.
	 * @return the destinationCountry
	 */
	public Country getDestinationCountry()
	{
		return getDestinationCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.destinationCountry</code> attribute. 
	 * @param value the destinationCountry
	 */
	public void setDestinationCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, DESTINATIONCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.destinationCountry</code> attribute. 
	 * @param value the destinationCountry
	 */
	public void setDestinationCountry(final Country value)
	{
		setDestinationCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.vehicleName</code> attribute.
	 * @return the vehicleName
	 */
	public Product getVehicleName(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, VEHICLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.vehicleName</code> attribute.
	 * @return the vehicleName
	 */
	public Product getVehicleName()
	{
		return getVehicleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.vehicleName</code> attribute. 
	 * @param value the vehicleName
	 */
	public void setVehicleName(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, VEHICLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.vehicleName</code> attribute. 
	 * @param value the vehicleName
	 */
	public void setVehicleName(final Product value)
	{
		setVehicleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.withAc</code> attribute.
	 * @return the withAc
	 */
	public Boolean isWithAc(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, WITHAC);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.withAc</code> attribute.
	 * @return the withAc
	 */
	public Boolean isWithAc()
	{
		return isWithAc( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.withAc</code> attribute. 
	 * @return the withAc
	 */
	public boolean isWithAcAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isWithAc( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.withAc</code> attribute. 
	 * @return the withAc
	 */
	public boolean isWithAcAsPrimitive()
	{
		return isWithAcAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.withAc</code> attribute. 
	 * @param value the withAc
	 */
	public void setWithAc(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, WITHAC,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.withAc</code> attribute. 
	 * @param value the withAc
	 */
	public void setWithAc(final Boolean value)
	{
		setWithAc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.withAc</code> attribute. 
	 * @param value the withAc
	 */
	public void setWithAc(final SessionContext ctx, final boolean value)
	{
		setWithAc( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.withAc</code> attribute. 
	 * @param value the withAc
	 */
	public void setWithAc(final boolean value)
	{
		setWithAc( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.withChauffer</code> attribute.
	 * @return the withChauffer
	 */
	public Boolean isWithChauffer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, WITHCHAUFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.withChauffer</code> attribute.
	 * @return the withChauffer
	 */
	public Boolean isWithChauffer()
	{
		return isWithChauffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.withChauffer</code> attribute. 
	 * @return the withChauffer
	 */
	public boolean isWithChaufferAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isWithChauffer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CarPreference.withChauffer</code> attribute. 
	 * @return the withChauffer
	 */
	public boolean isWithChaufferAsPrimitive()
	{
		return isWithChaufferAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.withChauffer</code> attribute. 
	 * @param value the withChauffer
	 */
	public void setWithChauffer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, WITHCHAUFFER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.withChauffer</code> attribute. 
	 * @param value the withChauffer
	 */
	public void setWithChauffer(final Boolean value)
	{
		setWithChauffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.withChauffer</code> attribute. 
	 * @param value the withChauffer
	 */
	public void setWithChauffer(final SessionContext ctx, final boolean value)
	{
		setWithChauffer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CarPreference.withChauffer</code> attribute. 
	 * @param value the withChauffer
	 */
	public void setWithChauffer(final boolean value)
	{
		setWithChauffer( getSession().getSessionContext(), value );
	}
	
}
