/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.traveller.general.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.traveller.jalo.TravellerProfile;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.general.jalo.VisaDetails VisaDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVisaDetails extends GenericItem
{
	/** Qualifier of the <code>VisaDetails.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>VisaDetails.number</code> attribute **/
	public static final String NUMBER = "number";
	/** Qualifier of the <code>VisaDetails.territory</code> attribute **/
	public static final String TERRITORY = "territory";
	/** Qualifier of the <code>VisaDetails.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>VisaDetails.visaType</code> attribute **/
	public static final String VISATYPE = "visaType";
	/** Qualifier of the <code>VisaDetails.visaCategory</code> attribute **/
	public static final String VISACATEGORY = "visaCategory";
	/** Qualifier of the <code>VisaDetails.issuePlace</code> attribute **/
	public static final String ISSUEPLACE = "issuePlace";
	/** Qualifier of the <code>VisaDetails.issueDate</code> attribute **/
	public static final String ISSUEDATE = "issueDate";
	/** Qualifier of the <code>VisaDetails.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>VisaDetails.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>VisaDetails.visaCopy</code> attribute **/
	public static final String VISACOPY = "visaCopy";
	/** Qualifier of the <code>VisaDetails.passportNumber</code> attribute **/
	public static final String PASSPORTNUMBER = "passportNumber";
	/** Qualifier of the <code>VisaDetails.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVisaDetails> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedVisaDetails>(
	ClientcoreConstants.TC.VISADETAILS,
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
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		tmp.put(NUMBER, AttributeMode.INITIAL);
		tmp.put(TERRITORY, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(VISATYPE, AttributeMode.INITIAL);
		tmp.put(VISACATEGORY, AttributeMode.INITIAL);
		tmp.put(ISSUEPLACE, AttributeMode.INITIAL);
		tmp.put(ISSUEDATE, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(VISACOPY, AttributeMode.INITIAL);
		tmp.put(PASSPORTNUMBER, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERPROFILEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.documentType</code> attribute.
	 * @return the documentType
	 */
	public EnumerationValue getDocumentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.documentType</code> attribute.
	 * @return the documentType
	 */
	public EnumerationValue getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final EnumerationValue value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate()
	{
		return getIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final Date value)
	{
		setIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.issuePlace</code> attribute.
	 * @return the issuePlace
	 */
	public String getIssuePlace(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ISSUEPLACE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.issuePlace</code> attribute.
	 * @return the issuePlace
	 */
	public String getIssuePlace()
	{
		return getIssuePlace( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.issuePlace</code> attribute. 
	 * @param value the issuePlace
	 */
	public void setIssuePlace(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ISSUEPLACE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.issuePlace</code> attribute. 
	 * @param value the issuePlace
	 */
	public void setIssuePlace(final String value)
	{
		setIssuePlace( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.number</code> attribute.
	 * @return the number
	 */
	public String getNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.number</code> attribute.
	 * @return the number
	 */
	public String getNumber()
	{
		return getNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.number</code> attribute. 
	 * @param value the number
	 */
	public void setNumber(final String value)
	{
		setNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.passportNumber</code> attribute.
	 * @return the passportNumber
	 */
	public String getPassportNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSPORTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.passportNumber</code> attribute.
	 * @return the passportNumber
	 */
	public String getPassportNumber()
	{
		return getPassportNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.passportNumber</code> attribute. 
	 * @param value the passportNumber
	 */
	public void setPassportNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSPORTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.passportNumber</code> attribute. 
	 * @param value the passportNumber
	 */
	public void setPassportNumber(final String value)
	{
		setPassportNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.territory</code> attribute.
	 * @return the territory
	 */
	public EnumerationValue getTerritory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TERRITORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.territory</code> attribute.
	 * @return the territory
	 */
	public EnumerationValue getTerritory()
	{
		return getTerritory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.territory</code> attribute. 
	 * @param value the territory
	 */
	public void setTerritory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TERRITORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.territory</code> attribute. 
	 * @param value the territory
	 */
	public void setTerritory(final EnumerationValue value)
	{
		setTerritory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.validFrom</code> attribute.
	 * @return the validFrom
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.validFrom</code> attribute. 
	 * @param value the validFrom
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.validTo</code> attribute.
	 * @return the validTo
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.validTo</code> attribute. 
	 * @param value the validTo
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.visaCategory</code> attribute.
	 * @return the visaCategory
	 */
	public EnumerationValue getVisaCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VISACATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.visaCategory</code> attribute.
	 * @return the visaCategory
	 */
	public EnumerationValue getVisaCategory()
	{
		return getVisaCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.visaCategory</code> attribute. 
	 * @param value the visaCategory
	 */
	public void setVisaCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VISACATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.visaCategory</code> attribute. 
	 * @param value the visaCategory
	 */
	public void setVisaCategory(final EnumerationValue value)
	{
		setVisaCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.visaCopy</code> attribute.
	 * @return the visaCopy
	 */
	public Media getVisaCopy(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, VISACOPY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.visaCopy</code> attribute.
	 * @return the visaCopy
	 */
	public Media getVisaCopy()
	{
		return getVisaCopy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.visaCopy</code> attribute. 
	 * @param value the visaCopy
	 */
	public void setVisaCopy(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, VISACOPY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.visaCopy</code> attribute. 
	 * @param value the visaCopy
	 */
	public void setVisaCopy(final Media value)
	{
		setVisaCopy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.visaType</code> attribute.
	 * @return the visaType
	 */
	public EnumerationValue getVisaType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VISATYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaDetails.visaType</code> attribute.
	 * @return the visaType
	 */
	public EnumerationValue getVisaType()
	{
		return getVisaType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.visaType</code> attribute. 
	 * @param value the visaType
	 */
	public void setVisaType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VISATYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaDetails.visaType</code> attribute. 
	 * @param value the visaType
	 */
	public void setVisaType(final EnumerationValue value)
	{
		setVisaType( getSession().getSessionContext(), value );
	}
	
}
