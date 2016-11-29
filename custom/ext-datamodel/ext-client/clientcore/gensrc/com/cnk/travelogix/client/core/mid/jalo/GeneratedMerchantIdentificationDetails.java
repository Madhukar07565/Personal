/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.mid.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.masterdata.core.jalo.BankAccountDetail;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.mid.jalo.MerchantIdentificationDetails MerchantIdentificationDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMerchantIdentificationDetails extends GenericItem
{
	/** Qualifier of the <code>MerchantIdentificationDetails.midNumber</code> attribute **/
	public static final String MIDNUMBER = "midNumber";
	/** Qualifier of the <code>MerchantIdentificationDetails.midTypes</code> attribute **/
	public static final String MIDTYPES = "midTypes";
	/** Qualifier of the <code>MerchantIdentificationDetails.alias</code> attribute **/
	public static final String ALIAS = "alias";
	/** Qualifier of the <code>MerchantIdentificationDetails.clientType</code> attribute **/
	public static final String CLIENTTYPE = "clientType";
	/** Qualifier of the <code>MerchantIdentificationDetails.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>MerchantIdentificationDetails.bankDetail</code> attribute **/
	public static final String BANKDETAIL = "bankDetail";
	/** Qualifier of the <code>MerchantIdentificationDetails.acquirers</code> attribute **/
	public static final String ACQUIRERS = "acquirers";
	/** Qualifier of the <code>MerchantIdentificationDetails.enabler</code> attribute **/
	public static final String ENABLER = "enabler";
	/** Qualifier of the <code>MerchantIdentificationDetails.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>MerchantIdentificationDetails.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>MerchantIdentificationDetails.users</code> attribute **/
	public static final String USERS = "users";
	/**
	* {@link OneToManyHandler} for handling 1:n USERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelogixB2BUnit> USERSHANDLER = new OneToManyHandler<TravelogixB2BUnit>(
	ClientcoreConstants.TC.TRAVELOGIXB2BUNIT,
	false,
	"merchantIdentificationDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MIDNUMBER, AttributeMode.INITIAL);
		tmp.put(MIDTYPES, AttributeMode.INITIAL);
		tmp.put(ALIAS, AttributeMode.INITIAL);
		tmp.put(CLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(BANKDETAIL, AttributeMode.INITIAL);
		tmp.put(ACQUIRERS, AttributeMode.INITIAL);
		tmp.put(ENABLER, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.acquirers</code> attribute.
	 * @return the acquirers
	 */
	public Supplier getAcquirers(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, ACQUIRERS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.acquirers</code> attribute.
	 * @return the acquirers
	 */
	public Supplier getAcquirers()
	{
		return getAcquirers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.acquirers</code> attribute. 
	 * @param value the acquirers
	 */
	public void setAcquirers(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, ACQUIRERS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.acquirers</code> attribute. 
	 * @param value the acquirers
	 */
	public void setAcquirers(final Supplier value)
	{
		setAcquirers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.alias</code> attribute.
	 * @return the alias
	 */
	public String getAlias(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ALIAS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.alias</code> attribute.
	 * @return the alias
	 */
	public String getAlias()
	{
		return getAlias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.alias</code> attribute. 
	 * @param value the alias
	 */
	public void setAlias(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ALIAS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.alias</code> attribute. 
	 * @param value the alias
	 */
	public void setAlias(final String value)
	{
		setAlias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.bankDetail</code> attribute.
	 * @return the bankDetail
	 */
	public BankAccountDetail getBankDetail(final SessionContext ctx)
	{
		return (BankAccountDetail)getProperty( ctx, BANKDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.bankDetail</code> attribute.
	 * @return the bankDetail
	 */
	public BankAccountDetail getBankDetail()
	{
		return getBankDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.bankDetail</code> attribute. 
	 * @param value the bankDetail
	 */
	public void setBankDetail(final SessionContext ctx, final BankAccountDetail value)
	{
		setProperty(ctx, BANKDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.bankDetail</code> attribute. 
	 * @param value the bankDetail
	 */
	public void setBankDetail(final BankAccountDetail value)
	{
		setBankDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.clientType</code> attribute.
	 * @return the clientType
	 */
	public EnumerationValue getClientType()
	{
		return getClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.clientType</code> attribute. 
	 * @param value the clientType
	 */
	public void setClientType(final EnumerationValue value)
	{
		setClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.enabler</code> attribute.
	 * @return the enabler
	 */
	public Supplier getEnabler(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, ENABLER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.enabler</code> attribute.
	 * @return the enabler
	 */
	public Supplier getEnabler()
	{
		return getEnabler( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.enabler</code> attribute. 
	 * @param value the enabler
	 */
	public void setEnabler(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, ENABLER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.enabler</code> attribute. 
	 * @param value the enabler
	 */
	public void setEnabler(final Supplier value)
	{
		setEnabler( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.midNumber</code> attribute.
	 * @return the midNumber
	 */
	public Integer getMidNumber(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MIDNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.midNumber</code> attribute.
	 * @return the midNumber
	 */
	public Integer getMidNumber()
	{
		return getMidNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.midNumber</code> attribute. 
	 * @return the midNumber
	 */
	public int getMidNumberAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMidNumber( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.midNumber</code> attribute. 
	 * @return the midNumber
	 */
	public int getMidNumberAsPrimitive()
	{
		return getMidNumberAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.midNumber</code> attribute. 
	 * @param value the midNumber
	 */
	public void setMidNumber(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MIDNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.midNumber</code> attribute. 
	 * @param value the midNumber
	 */
	public void setMidNumber(final Integer value)
	{
		setMidNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.midNumber</code> attribute. 
	 * @param value the midNumber
	 */
	public void setMidNumber(final SessionContext ctx, final int value)
	{
		setMidNumber( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.midNumber</code> attribute. 
	 * @param value the midNumber
	 */
	public void setMidNumber(final int value)
	{
		setMidNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.midTypes</code> attribute.
	 * @return the midTypes
	 */
	public EnumerationValue getMidTypes(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MIDTYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.midTypes</code> attribute.
	 * @return the midTypes
	 */
	public EnumerationValue getMidTypes()
	{
		return getMidTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.midTypes</code> attribute. 
	 * @param value the midTypes
	 */
	public void setMidTypes(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MIDTYPES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.midTypes</code> attribute. 
	 * @param value the midTypes
	 */
	public void setMidTypes(final EnumerationValue value)
	{
		setMidTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.users</code> attribute.
	 * @return the users
	 */
	public Collection<TravelogixB2BUnit> getUsers(final SessionContext ctx)
	{
		return USERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MerchantIdentificationDetails.users</code> attribute.
	 * @return the users
	 */
	public Collection<TravelogixB2BUnit> getUsers()
	{
		return getUsers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.users</code> attribute. 
	 * @param value the users
	 */
	public void setUsers(final SessionContext ctx, final Collection<TravelogixB2BUnit> value)
	{
		USERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MerchantIdentificationDetails.users</code> attribute. 
	 * @param value the users
	 */
	public void setUsers(final Collection<TravelogixB2BUnit> value)
	{
		setUsers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to users. 
	 * @param value the item to add to users
	 */
	public void addToUsers(final SessionContext ctx, final TravelogixB2BUnit value)
	{
		USERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to users. 
	 * @param value the item to add to users
	 */
	public void addToUsers(final TravelogixB2BUnit value)
	{
		addToUsers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from users. 
	 * @param value the item to remove from users
	 */
	public void removeFromUsers(final SessionContext ctx, final TravelogixB2BUnit value)
	{
		USERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from users. 
	 * @param value the item to remove from users
	 */
	public void removeFromUsers(final TravelogixB2BUnit value)
	{
		removeFromUsers( getSession().getSessionContext(), value );
	}
	
}
