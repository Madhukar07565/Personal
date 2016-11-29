/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.ConsortiumMember ConsortiumMember}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedConsortiumMember extends GenericItem
{
	/** Qualifier of the <code>ConsortiumMember.clientName</code> attribute **/
	public static final String CLIENTNAME = "clientName";
	/** Qualifier of the <code>ConsortiumMember.mobileNumber</code> attribute **/
	public static final String MOBILENUMBER = "mobileNumber";
	/** Qualifier of the <code>ConsortiumMember.emailId</code> attribute **/
	public static final String EMAILID = "emailId";
	/** Qualifier of the <code>ConsortiumMember.contactPersonName</code> attribute **/
	public static final String CONTACTPERSONNAME = "contactPersonName";
	/** Qualifier of the <code>ConsortiumMember.travelogixB2BUnit</code> attribute **/
	public static final String TRAVELOGIXB2BUNIT = "travelogixB2BUnit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXB2BUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedConsortiumMember> TRAVELOGIXB2BUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedConsortiumMember>(
	ClientcoreConstants.TC.CONSORTIUMMEMBER,
	false,
	"travelogixB2BUnit",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CLIENTNAME, AttributeMode.INITIAL);
		tmp.put(MOBILENUMBER, AttributeMode.INITIAL);
		tmp.put(EMAILID, AttributeMode.INITIAL);
		tmp.put(CONTACTPERSONNAME, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXB2BUNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.clientName</code> attribute.
	 * @return the clientName
	 */
	public String getClientName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.clientName</code> attribute.
	 * @return the clientName
	 */
	public String getClientName()
	{
		return getClientName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.clientName</code> attribute. 
	 * @param value the clientName
	 */
	public void setClientName(final String value)
	{
		setClientName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.contactPersonName</code> attribute.
	 * @return the contactPersonName
	 */
	public String getContactPersonName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CONTACTPERSONNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.contactPersonName</code> attribute.
	 * @return the contactPersonName
	 */
	public String getContactPersonName()
	{
		return getContactPersonName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.contactPersonName</code> attribute. 
	 * @param value the contactPersonName
	 */
	public void setContactPersonName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CONTACTPERSONNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.contactPersonName</code> attribute. 
	 * @param value the contactPersonName
	 */
	public void setContactPersonName(final String value)
	{
		setContactPersonName( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELOGIXB2BUNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.emailId</code> attribute.
	 * @return the emailId
	 */
	public String getEmailId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.emailId</code> attribute.
	 * @return the emailId
	 */
	public String getEmailId()
	{
		return getEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setEmailId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.emailId</code> attribute. 
	 * @param value the emailId
	 */
	public void setEmailId(final String value)
	{
		setEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.mobileNumber</code> attribute.
	 * @return the mobileNumber
	 */
	public String getMobileNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MOBILENUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.mobileNumber</code> attribute.
	 * @return the mobileNumber
	 */
	public String getMobileNumber()
	{
		return getMobileNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.mobileNumber</code> attribute. 
	 * @param value the mobileNumber
	 */
	public void setMobileNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MOBILENUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.mobileNumber</code> attribute. 
	 * @param value the mobileNumber
	 */
	public void setMobileNumber(final String value)
	{
		setMobileNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit(final SessionContext ctx)
	{
		return (TravelogixB2BUnit)getProperty( ctx, TRAVELOGIXB2BUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConsortiumMember.travelogixB2BUnit</code> attribute.
	 * @return the travelogixB2BUnit
	 */
	public TravelogixB2BUnit getTravelogixB2BUnit()
	{
		return getTravelogixB2BUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final SessionContext ctx, final TravelogixB2BUnit value)
	{
		TRAVELOGIXB2BUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConsortiumMember.travelogixB2BUnit</code> attribute. 
	 * @param value the travelogixB2BUnit
	 */
	public void setTravelogixB2BUnit(final TravelogixB2BUnit value)
	{
		setTravelogixB2BUnit( getSession().getSessionContext(), value );
	}
	
}
