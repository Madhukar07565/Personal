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
 * Generated class for type {@link com.cnk.travelogix.client.core.traveller.general.jalo.PassportDetails PassportDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPassportDetails extends GenericItem
{
	/** Qualifier of the <code>PassportDetails.passportNumber</code> attribute **/
	public static final String PASSPORTNUMBER = "passportNumber";
	/** Qualifier of the <code>PassportDetails.hasValifdPassport</code> attribute **/
	public static final String HASVALIFDPASSPORT = "hasValifdPassport";
	/** Qualifier of the <code>PassportDetails.passportType</code> attribute **/
	public static final String PASSPORTTYPE = "passportType";
	/** Qualifier of the <code>PassportDetails.issueDate</code> attribute **/
	public static final String ISSUEDATE = "issueDate";
	/** Qualifier of the <code>PassportDetails.expiryDate</code> attribute **/
	public static final String EXPIRYDATE = "expiryDate";
	/** Qualifier of the <code>PassportDetails.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>PassportDetails.placeOfIssue</code> attribute **/
	public static final String PLACEOFISSUE = "placeOfIssue";
	/** Qualifier of the <code>PassportDetails.blankPages</code> attribute **/
	public static final String BLANKPAGES = "blankPages";
	/** Qualifier of the <code>PassportDetails.passportCopy</code> attribute **/
	public static final String PASSPORTCOPY = "passportCopy";
	/** Qualifier of the <code>PassportDetails.travellerProfile</code> attribute **/
	public static final String TRAVELLERPROFILE = "travellerProfile";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLERPROFILE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPassportDetails> TRAVELLERPROFILEHANDLER = new BidirectionalOneToManyHandler<GeneratedPassportDetails>(
	ClientcoreConstants.TC.PASSPORTDETAILS,
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
		tmp.put(PASSPORTNUMBER, AttributeMode.INITIAL);
		tmp.put(HASVALIFDPASSPORT, AttributeMode.INITIAL);
		tmp.put(PASSPORTTYPE, AttributeMode.INITIAL);
		tmp.put(ISSUEDATE, AttributeMode.INITIAL);
		tmp.put(EXPIRYDATE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(PLACEOFISSUE, AttributeMode.INITIAL);
		tmp.put(BLANKPAGES, AttributeMode.INITIAL);
		tmp.put(PASSPORTCOPY, AttributeMode.INITIAL);
		tmp.put(TRAVELLERPROFILE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.blankPages</code> attribute.
	 * @return the blankPages
	 */
	public String getBlankPages(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BLANKPAGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.blankPages</code> attribute.
	 * @return the blankPages
	 */
	public String getBlankPages()
	{
		return getBlankPages( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.blankPages</code> attribute. 
	 * @param value the blankPages
	 */
	public void setBlankPages(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BLANKPAGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.blankPages</code> attribute. 
	 * @param value the blankPages
	 */
	public void setBlankPages(final String value)
	{
		setBlankPages( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.country</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EXPIRYDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.expiryDate</code> attribute.
	 * @return the expiryDate
	 */
	public Date getExpiryDate()
	{
		return getExpiryDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EXPIRYDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.expiryDate</code> attribute. 
	 * @param value the expiryDate
	 */
	public void setExpiryDate(final Date value)
	{
		setExpiryDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.hasValifdPassport</code> attribute.
	 * @return the hasValifdPassport
	 */
	public Boolean isHasValifdPassport(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, HASVALIFDPASSPORT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.hasValifdPassport</code> attribute.
	 * @return the hasValifdPassport
	 */
	public Boolean isHasValifdPassport()
	{
		return isHasValifdPassport( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.hasValifdPassport</code> attribute. 
	 * @return the hasValifdPassport
	 */
	public boolean isHasValifdPassportAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isHasValifdPassport( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.hasValifdPassport</code> attribute. 
	 * @return the hasValifdPassport
	 */
	public boolean isHasValifdPassportAsPrimitive()
	{
		return isHasValifdPassportAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.hasValifdPassport</code> attribute. 
	 * @param value the hasValifdPassport
	 */
	public void setHasValifdPassport(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, HASVALIFDPASSPORT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.hasValifdPassport</code> attribute. 
	 * @param value the hasValifdPassport
	 */
	public void setHasValifdPassport(final Boolean value)
	{
		setHasValifdPassport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.hasValifdPassport</code> attribute. 
	 * @param value the hasValifdPassport
	 */
	public void setHasValifdPassport(final SessionContext ctx, final boolean value)
	{
		setHasValifdPassport( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.hasValifdPassport</code> attribute. 
	 * @param value the hasValifdPassport
	 */
	public void setHasValifdPassport(final boolean value)
	{
		setHasValifdPassport( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate()
	{
		return getIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final Date value)
	{
		setIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.passportCopy</code> attribute.
	 * @return the passportCopy
	 */
	public Media getPassportCopy(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, PASSPORTCOPY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.passportCopy</code> attribute.
	 * @return the passportCopy
	 */
	public Media getPassportCopy()
	{
		return getPassportCopy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.passportCopy</code> attribute. 
	 * @param value the passportCopy
	 */
	public void setPassportCopy(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, PASSPORTCOPY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.passportCopy</code> attribute. 
	 * @param value the passportCopy
	 */
	public void setPassportCopy(final Media value)
	{
		setPassportCopy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.passportNumber</code> attribute.
	 * @return the passportNumber
	 */
	public String getPassportNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PASSPORTNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.passportNumber</code> attribute.
	 * @return the passportNumber
	 */
	public String getPassportNumber()
	{
		return getPassportNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.passportNumber</code> attribute. 
	 * @param value the passportNumber
	 */
	public void setPassportNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PASSPORTNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.passportNumber</code> attribute. 
	 * @param value the passportNumber
	 */
	public void setPassportNumber(final String value)
	{
		setPassportNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.passportType</code> attribute.
	 * @return the passportType
	 */
	public EnumerationValue getPassportType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSPORTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.passportType</code> attribute.
	 * @return the passportType
	 */
	public EnumerationValue getPassportType()
	{
		return getPassportType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.passportType</code> attribute. 
	 * @param value the passportType
	 */
	public void setPassportType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSPORTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.passportType</code> attribute. 
	 * @param value the passportType
	 */
	public void setPassportType(final EnumerationValue value)
	{
		setPassportType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.placeOfIssue</code> attribute.
	 * @return the placeOfIssue
	 */
	public String getPlaceOfIssue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PLACEOFISSUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.placeOfIssue</code> attribute.
	 * @return the placeOfIssue
	 */
	public String getPlaceOfIssue()
	{
		return getPlaceOfIssue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.placeOfIssue</code> attribute. 
	 * @param value the placeOfIssue
	 */
	public void setPlaceOfIssue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PLACEOFISSUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.placeOfIssue</code> attribute. 
	 * @param value the placeOfIssue
	 */
	public void setPlaceOfIssue(final String value)
	{
		setPlaceOfIssue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile(final SessionContext ctx)
	{
		return (TravellerProfile)getProperty( ctx, TRAVELLERPROFILE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PassportDetails.travellerProfile</code> attribute.
	 * @return the travellerProfile
	 */
	public TravellerProfile getTravellerProfile()
	{
		return getTravellerProfile( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final SessionContext ctx, final TravellerProfile value)
	{
		TRAVELLERPROFILEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PassportDetails.travellerProfile</code> attribute. 
	 * @param value the travellerProfile
	 */
	public void setTravellerProfile(final TravellerProfile value)
	{
		setTravellerProfile( getSession().getSessionContext(), value );
	}
	
}
