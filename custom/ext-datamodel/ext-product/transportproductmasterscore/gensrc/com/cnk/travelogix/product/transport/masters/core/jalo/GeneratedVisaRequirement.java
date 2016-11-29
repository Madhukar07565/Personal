/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.CruisePackage;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.VisaRequirement VisaRequirement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVisaRequirement extends GenericItem
{
	/** Qualifier of the <code>VisaRequirement.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>VisaRequirement.travellingCountry</code> attribute **/
	public static final String TRAVELLINGCOUNTRY = "travellingCountry";
	/** Qualifier of the <code>VisaRequirement.remark</code> attribute **/
	public static final String REMARK = "remark";
	/** Qualifier of the <code>VisaRequirement.cruisePackage</code> attribute **/
	public static final String CRUISEPACKAGE = "cruisePackage";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISEPACKAGE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVisaRequirement> CRUISEPACKAGEHANDLER = new BidirectionalOneToManyHandler<GeneratedVisaRequirement>(
	TransportproductmasterscoreConstants.TC.VISAREQUIREMENT,
	false,
	"cruisePackage",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(TRAVELLINGCOUNTRY, AttributeMode.INITIAL);
		tmp.put(REMARK, AttributeMode.INITIAL);
		tmp.put(CRUISEPACKAGE, AttributeMode.INITIAL);
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
		CRUISEPACKAGEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaRequirement.cruisePackage</code> attribute.
	 * @return the cruisePackage
	 */
	public CruisePackage getCruisePackage(final SessionContext ctx)
	{
		return (CruisePackage)getProperty( ctx, CRUISEPACKAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaRequirement.cruisePackage</code> attribute.
	 * @return the cruisePackage
	 */
	public CruisePackage getCruisePackage()
	{
		return getCruisePackage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaRequirement.cruisePackage</code> attribute. 
	 * @param value the cruisePackage
	 */
	public void setCruisePackage(final SessionContext ctx, final CruisePackage value)
	{
		CRUISEPACKAGEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaRequirement.cruisePackage</code> attribute. 
	 * @param value the cruisePackage
	 */
	public void setCruisePackage(final CruisePackage value)
	{
		setCruisePackage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaRequirement.nationality</code> attribute.
	 * @return the nationality - To show the nationalities.
	 */
	public Country getNationality(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, NATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaRequirement.nationality</code> attribute.
	 * @return the nationality - To show the nationalities.
	 */
	public Country getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaRequirement.nationality</code> attribute. 
	 * @param value the nationality - To show the nationalities.
	 */
	public void setNationality(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, NATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaRequirement.nationality</code> attribute. 
	 * @param value the nationality - To show the nationalities.
	 */
	public void setNationality(final Country value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaRequirement.remark</code> attribute.
	 * @return the remark - Day Description Remark
	 */
	public String getRemark(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaRequirement.remark</code> attribute.
	 * @return the remark - Day Description Remark
	 */
	public String getRemark()
	{
		return getRemark( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaRequirement.remark</code> attribute. 
	 * @param value the remark - Day Description Remark
	 */
	public void setRemark(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaRequirement.remark</code> attribute. 
	 * @param value the remark - Day Description Remark
	 */
	public void setRemark(final String value)
	{
		setRemark( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaRequirement.travellingCountry</code> attribute.
	 * @return the travellingCountry - To show the travellingCountry.
	 */
	public Country getTravellingCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, TRAVELLINGCOUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaRequirement.travellingCountry</code> attribute.
	 * @return the travellingCountry - To show the travellingCountry.
	 */
	public Country getTravellingCountry()
	{
		return getTravellingCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaRequirement.travellingCountry</code> attribute. 
	 * @param value the travellingCountry - To show the travellingCountry.
	 */
	public void setTravellingCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, TRAVELLINGCOUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaRequirement.travellingCountry</code> attribute. 
	 * @param value the travellingCountry - To show the travellingCountry.
	 */
	public void setTravellingCountry(final Country value)
	{
		setTravellingCountry( getSession().getSessionContext(), value );
	}
	
}
