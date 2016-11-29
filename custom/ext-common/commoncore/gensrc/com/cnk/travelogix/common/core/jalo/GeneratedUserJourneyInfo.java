/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.UserJourneyNote;
import com.cnk.travelogix.common.core.jalo.UserJourneyPhone;
import com.cnk.travelogix.common.core.jalo.UserJourneyProductInfo;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem UserJourneyInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUserJourneyInfo extends GenericItem
{
	/** Qualifier of the <code>UserJourneyInfo.siteChannel</code> attribute **/
	public static final String SITECHANNEL = "siteChannel";
	/** Qualifier of the <code>UserJourneyInfo.groupId</code> attribute **/
	public static final String GROUPID = "groupId";
	/** Qualifier of the <code>UserJourneyInfo.itemId</code> attribute **/
	public static final String ITEMID = "itemId";
	/** Qualifier of the <code>UserJourneyInfo.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>UserJourneyInfo.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>UserJourneyInfo.middleName</code> attribute **/
	public static final String MIDDLENAME = "middleName";
	/** Qualifier of the <code>UserJourneyInfo.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>UserJourneyInfo.destination</code> attribute **/
	public static final String DESTINATION = "destination";
	/** Qualifier of the <code>UserJourneyInfo.email</code> attribute **/
	public static final String EMAIL = "email";
	/** Qualifier of the <code>UserJourneyInfo.mobileNo</code> attribute **/
	public static final String MOBILENO = "mobileNo";
	/** Qualifier of the <code>UserJourneyInfo.submitter</code> attribute **/
	public static final String SUBMITTER = "submitter";
	/** Qualifier of the <code>UserJourneyInfo.customer</code> attribute **/
	public static final String CUSTOMER = "customer";
	/** Qualifier of the <code>UserJourneyInfo.productInfoList</code> attribute **/
	public static final String PRODUCTINFOLIST = "productInfoList";
	/** Qualifier of the <code>UserJourneyInfo.noteList</code> attribute **/
	public static final String NOTELIST = "noteList";
	/**
	* {@link OneToManyHandler} for handling 1:n PRODUCTINFOLIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<UserJourneyProductInfo> PRODUCTINFOLISTHANDLER = new OneToManyHandler<UserJourneyProductInfo>(
	CommonCoreConstants.TC.USERJOURNEYPRODUCTINFO,
	true,
	"journeyInfo",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n NOTELIST's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<UserJourneyNote> NOTELISTHANDLER = new OneToManyHandler<UserJourneyNote>(
	CommonCoreConstants.TC.USERJOURNEYNOTE,
	true,
	"journeyInfo",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SITECHANNEL, AttributeMode.INITIAL);
		tmp.put(GROUPID, AttributeMode.INITIAL);
		tmp.put(ITEMID, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(MIDDLENAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(DESTINATION, AttributeMode.INITIAL);
		tmp.put(EMAIL, AttributeMode.INITIAL);
		tmp.put(MOBILENO, AttributeMode.INITIAL);
		tmp.put(SUBMITTER, AttributeMode.INITIAL);
		tmp.put(CUSTOMER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer(final SessionContext ctx)
	{
		return (Customer)getProperty( ctx, CUSTOMER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.customer</code> attribute.
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return getCustomer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final SessionContext ctx, final Customer value)
	{
		setProperty(ctx, CUSTOMER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.customer</code> attribute. 
	 * @param value the customer
	 */
	public void setCustomer(final Customer value)
	{
		setCustomer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.destination</code> attribute.
	 * @return the destination
	 */
	public String getDestination(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESTINATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.destination</code> attribute.
	 * @return the destination
	 */
	public String getDestination()
	{
		return getDestination( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.destination</code> attribute. 
	 * @param value the destination
	 */
	public void setDestination(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESTINATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.destination</code> attribute. 
	 * @param value the destination
	 */
	public void setDestination(final String value)
	{
		setDestination( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.email</code> attribute.
	 * @return the email
	 */
	public String getEmail(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EMAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.email</code> attribute.
	 * @return the email
	 */
	public String getEmail()
	{
		return getEmail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EMAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.email</code> attribute. 
	 * @param value the email
	 */
	public void setEmail(final String value)
	{
		setEmail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.groupId</code> attribute.
	 * @return the groupId
	 */
	public String getGroupId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, GROUPID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.groupId</code> attribute.
	 * @return the groupId
	 */
	public String getGroupId()
	{
		return getGroupId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.groupId</code> attribute. 
	 * @param value the groupId
	 */
	public void setGroupId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, GROUPID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.groupId</code> attribute. 
	 * @param value the groupId
	 */
	public void setGroupId(final String value)
	{
		setGroupId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.itemId</code> attribute.
	 * @return the itemId
	 */
	public String getItemId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ITEMID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.itemId</code> attribute.
	 * @return the itemId
	 */
	public String getItemId()
	{
		return getItemId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.itemId</code> attribute. 
	 * @param value the itemId
	 */
	public void setItemId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ITEMID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.itemId</code> attribute. 
	 * @param value the itemId
	 */
	public void setItemId(final String value)
	{
		setItemId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MIDDLENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.middleName</code> attribute.
	 * @return the middleName
	 */
	public String getMiddleName()
	{
		return getMiddleName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MIDDLENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.middleName</code> attribute. 
	 * @param value the middleName
	 */
	public void setMiddleName(final String value)
	{
		setMiddleName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.mobileNo</code> attribute.
	 * @return the mobileNo
	 */
	public UserJourneyPhone getMobileNo(final SessionContext ctx)
	{
		return (UserJourneyPhone)getProperty( ctx, MOBILENO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.mobileNo</code> attribute.
	 * @return the mobileNo
	 */
	public UserJourneyPhone getMobileNo()
	{
		return getMobileNo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.mobileNo</code> attribute. 
	 * @param value the mobileNo
	 */
	public void setMobileNo(final SessionContext ctx, final UserJourneyPhone value)
	{
		new PartOfHandler<UserJourneyPhone>()
		{
			@Override
			protected UserJourneyPhone doGetValue(final SessionContext ctx)
			{
				return getMobileNo( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final UserJourneyPhone _value)
			{
				final UserJourneyPhone value = _value;
				setProperty(ctx, MOBILENO,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.mobileNo</code> attribute. 
	 * @param value the mobileNo
	 */
	public void setMobileNo(final UserJourneyPhone value)
	{
		setMobileNo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.noteList</code> attribute.
	 * @return the noteList
	 */
	public List<UserJourneyNote> getNoteList(final SessionContext ctx)
	{
		return (List<UserJourneyNote>)NOTELISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.noteList</code> attribute.
	 * @return the noteList
	 */
	public List<UserJourneyNote> getNoteList()
	{
		return getNoteList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.noteList</code> attribute. 
	 * @param value the noteList
	 */
	public void setNoteList(final SessionContext ctx, final List<UserJourneyNote> value)
	{
		NOTELISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.noteList</code> attribute. 
	 * @param value the noteList
	 */
	public void setNoteList(final List<UserJourneyNote> value)
	{
		setNoteList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to noteList. 
	 * @param value the item to add to noteList
	 */
	public void addToNoteList(final SessionContext ctx, final UserJourneyNote value)
	{
		NOTELISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to noteList. 
	 * @param value the item to add to noteList
	 */
	public void addToNoteList(final UserJourneyNote value)
	{
		addToNoteList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from noteList. 
	 * @param value the item to remove from noteList
	 */
	public void removeFromNoteList(final SessionContext ctx, final UserJourneyNote value)
	{
		NOTELISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from noteList. 
	 * @param value the item to remove from noteList
	 */
	public void removeFromNoteList(final UserJourneyNote value)
	{
		removeFromNoteList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.productInfoList</code> attribute.
	 * @return the productInfoList
	 */
	public List<UserJourneyProductInfo> getProductInfoList(final SessionContext ctx)
	{
		return (List<UserJourneyProductInfo>)PRODUCTINFOLISTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.productInfoList</code> attribute.
	 * @return the productInfoList
	 */
	public List<UserJourneyProductInfo> getProductInfoList()
	{
		return getProductInfoList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.productInfoList</code> attribute. 
	 * @param value the productInfoList
	 */
	public void setProductInfoList(final SessionContext ctx, final List<UserJourneyProductInfo> value)
	{
		PRODUCTINFOLISTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.productInfoList</code> attribute. 
	 * @param value the productInfoList
	 */
	public void setProductInfoList(final List<UserJourneyProductInfo> value)
	{
		setProductInfoList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productInfoList. 
	 * @param value the item to add to productInfoList
	 */
	public void addToProductInfoList(final SessionContext ctx, final UserJourneyProductInfo value)
	{
		PRODUCTINFOLISTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to productInfoList. 
	 * @param value the item to add to productInfoList
	 */
	public void addToProductInfoList(final UserJourneyProductInfo value)
	{
		addToProductInfoList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productInfoList. 
	 * @param value the item to remove from productInfoList
	 */
	public void removeFromProductInfoList(final SessionContext ctx, final UserJourneyProductInfo value)
	{
		PRODUCTINFOLISTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from productInfoList. 
	 * @param value the item to remove from productInfoList
	 */
	public void removeFromProductInfoList(final UserJourneyProductInfo value)
	{
		removeFromProductInfoList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.siteChannel</code> attribute.
	 * @return the siteChannel
	 */
	public EnumerationValue getSiteChannel(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SITECHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.siteChannel</code> attribute.
	 * @return the siteChannel
	 */
	public EnumerationValue getSiteChannel()
	{
		return getSiteChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.siteChannel</code> attribute. 
	 * @param value the siteChannel
	 */
	public void setSiteChannel(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SITECHANNEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.siteChannel</code> attribute. 
	 * @param value the siteChannel
	 */
	public void setSiteChannel(final EnumerationValue value)
	{
		setSiteChannel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.submitter</code> attribute.
	 * @return the submitter
	 */
	public User getSubmitter(final SessionContext ctx)
	{
		return (User)getProperty( ctx, SUBMITTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.submitter</code> attribute.
	 * @return the submitter
	 */
	public User getSubmitter()
	{
		return getSubmitter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.submitter</code> attribute. 
	 * @param value the submitter
	 */
	public void setSubmitter(final SessionContext ctx, final User value)
	{
		setProperty(ctx, SUBMITTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.submitter</code> attribute. 
	 * @param value the submitter
	 */
	public void setSubmitter(final User value)
	{
		setSubmitter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UserJourneyInfo.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UserJourneyInfo.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
}
