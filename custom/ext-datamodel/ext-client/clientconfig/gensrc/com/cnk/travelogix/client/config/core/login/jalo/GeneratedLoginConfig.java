/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.login.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.login.jalo.PasswordConfig;
import com.cnk.travelogix.client.masters.core.constants.ClientmastercoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.login.jalo.LoginConfig LoginConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLoginConfig extends GenericItem
{
	/** Qualifier of the <code>LoginConfig.entityName</code> attribute **/
	public static final String ENTITYNAME = "entityName";
	/** Qualifier of the <code>LoginConfig.loginType</code> attribute **/
	public static final String LOGINTYPE = "loginType";
	/** Qualifier of the <code>LoginConfig.childClientB2BAll</code> attribute **/
	public static final String CHILDCLIENTB2BALL = "childClientB2BAll";
	/** Qualifier of the <code>LoginConfig.childClientB2CAll</code> attribute **/
	public static final String CHILDCLIENTB2CALL = "childClientB2CAll";
	/** Qualifier of the <code>LoginConfig.loginValidation</code> attribute **/
	public static final String LOGINVALIDATION = "loginValidation";
	/** Qualifier of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute **/
	public static final String THIRDPARTYLOGINALLOWED = "thirdPartyLoginAllowed";
	/** Qualifier of the <code>LoginConfig.keepUserSignInAllowed</code> attribute **/
	public static final String KEEPUSERSIGNINALLOWED = "keepUserSignInAllowed";
	/** Qualifier of the <code>LoginConfig.userAccountLockAllowed</code> attribute **/
	public static final String USERACCOUNTLOCKALLOWED = "userAccountLockAllowed";
	/** Qualifier of the <code>LoginConfig.keepUserSignInDays</code> attribute **/
	public static final String KEEPUSERSIGNINDAYS = "keepUserSignInDays";
	/** Qualifier of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute **/
	public static final String RETRIESCOUNTBEFORELOCKING = "retriesCountBeforeLocking";
	/** Qualifier of the <code>LoginConfig.passwordConfig</code> attribute **/
	public static final String PASSWORDCONFIG = "passwordConfig";
	/** Qualifier of the <code>LoginConfig.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>LoginConfig.loginParameters</code> attribute **/
	public static final String LOGINPARAMETERS = "loginParameters";
	/** Qualifier of the <code>LoginConfig.childClientTypes</code> attribute **/
	public static final String CHILDCLIENTTYPES = "childClientTypes";
	/** Relation ordering override parameter constants for LoginConfig2ChildClientTypes from ((clientconfig))*/
	protected static String LOGINCONFIG2CHILDCLIENTTYPES_SRC_ORDERED = "relation.LoginConfig2ChildClientTypes.source.ordered";
	protected static String LOGINCONFIG2CHILDCLIENTTYPES_TGT_ORDERED = "relation.LoginConfig2ChildClientTypes.target.ordered";
	/** Relation disable markmodifed parameter constants for LoginConfig2ChildClientTypes from ((clientconfig))*/
	protected static String LOGINCONFIG2CHILDCLIENTTYPES_MARKMODIFIED = "relation.LoginConfig2ChildClientTypes.markmodified";
	/** Qualifier of the <code>LoginConfig.forgetUserIdCommunicationModes</code> attribute **/
	public static final String FORGETUSERIDCOMMUNICATIONMODES = "forgetUserIdCommunicationModes";
	/** Qualifier of the <code>LoginConfig.allowedThirdParties</code> attribute **/
	public static final String ALLOWEDTHIRDPARTIES = "allowedThirdParties";
	/**
	* {@link OneToManyHandler} for handling 1:n LOGINPARAMETERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> LOGINPARAMETERSHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.LOGINPARAMETERS,
	false,
	"loginConfigration",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n FORGETUSERIDCOMMUNICATIONMODES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> FORGETUSERIDCOMMUNICATIONMODESHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.COMMUNICATIONMODE,
	false,
	"loginConfigForForgetUserId",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ALLOWEDTHIRDPARTIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> ALLOWEDTHIRDPARTIESHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.ALLOWEDTHIRDPARTIES,
	false,
	"loginConfigForThirdParties",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ENTITYNAME, AttributeMode.INITIAL);
		tmp.put(LOGINTYPE, AttributeMode.INITIAL);
		tmp.put(CHILDCLIENTB2BALL, AttributeMode.INITIAL);
		tmp.put(CHILDCLIENTB2CALL, AttributeMode.INITIAL);
		tmp.put(LOGINVALIDATION, AttributeMode.INITIAL);
		tmp.put(THIRDPARTYLOGINALLOWED, AttributeMode.INITIAL);
		tmp.put(KEEPUSERSIGNINALLOWED, AttributeMode.INITIAL);
		tmp.put(USERACCOUNTLOCKALLOWED, AttributeMode.INITIAL);
		tmp.put(KEEPUSERSIGNINDAYS, AttributeMode.INITIAL);
		tmp.put(RETRIESCOUNTBEFORELOCKING, AttributeMode.INITIAL);
		tmp.put(PASSWORDCONFIG, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.allowedThirdParties</code> attribute.
	 * @return the allowedThirdParties
	 */
	public Set<EnumerationValue> getAllowedThirdParties(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)ALLOWEDTHIRDPARTIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.allowedThirdParties</code> attribute.
	 * @return the allowedThirdParties
	 */
	public Set<EnumerationValue> getAllowedThirdParties()
	{
		return getAllowedThirdParties( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.allowedThirdParties</code> attribute. 
	 * @param value the allowedThirdParties
	 */
	public void setAllowedThirdParties(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		ALLOWEDTHIRDPARTIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.allowedThirdParties</code> attribute. 
	 * @param value the allowedThirdParties
	 */
	public void setAllowedThirdParties(final Set<EnumerationValue> value)
	{
		setAllowedThirdParties( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to allowedThirdParties. 
	 * @param value the item to add to allowedThirdParties
	 */
	public void addToAllowedThirdParties(final SessionContext ctx, final EnumerationValue value)
	{
		ALLOWEDTHIRDPARTIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to allowedThirdParties. 
	 * @param value the item to add to allowedThirdParties
	 */
	public void addToAllowedThirdParties(final EnumerationValue value)
	{
		addToAllowedThirdParties( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from allowedThirdParties. 
	 * @param value the item to remove from allowedThirdParties
	 */
	public void removeFromAllowedThirdParties(final SessionContext ctx, final EnumerationValue value)
	{
		ALLOWEDTHIRDPARTIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from allowedThirdParties. 
	 * @param value the item to remove from allowedThirdParties
	 */
	public void removeFromAllowedThirdParties(final EnumerationValue value)
	{
		removeFromAllowedThirdParties( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientB2BAll</code> attribute.
	 * @return the childClientB2BAll
	 */
	public Boolean isChildClientB2BAll(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHILDCLIENTB2BALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientB2BAll</code> attribute.
	 * @return the childClientB2BAll
	 */
	public Boolean isChildClientB2BAll()
	{
		return isChildClientB2BAll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientB2BAll</code> attribute. 
	 * @return the childClientB2BAll
	 */
	public boolean isChildClientB2BAllAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChildClientB2BAll( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientB2BAll</code> attribute. 
	 * @return the childClientB2BAll
	 */
	public boolean isChildClientB2BAllAsPrimitive()
	{
		return isChildClientB2BAllAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientB2BAll</code> attribute. 
	 * @param value the childClientB2BAll
	 */
	public void setChildClientB2BAll(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHILDCLIENTB2BALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientB2BAll</code> attribute. 
	 * @param value the childClientB2BAll
	 */
	public void setChildClientB2BAll(final Boolean value)
	{
		setChildClientB2BAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientB2BAll</code> attribute. 
	 * @param value the childClientB2BAll
	 */
	public void setChildClientB2BAll(final SessionContext ctx, final boolean value)
	{
		setChildClientB2BAll( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientB2BAll</code> attribute. 
	 * @param value the childClientB2BAll
	 */
	public void setChildClientB2BAll(final boolean value)
	{
		setChildClientB2BAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientB2CAll</code> attribute.
	 * @return the childClientB2CAll
	 */
	public Boolean isChildClientB2CAll(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, CHILDCLIENTB2CALL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientB2CAll</code> attribute.
	 * @return the childClientB2CAll
	 */
	public Boolean isChildClientB2CAll()
	{
		return isChildClientB2CAll( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientB2CAll</code> attribute. 
	 * @return the childClientB2CAll
	 */
	public boolean isChildClientB2CAllAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isChildClientB2CAll( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientB2CAll</code> attribute. 
	 * @return the childClientB2CAll
	 */
	public boolean isChildClientB2CAllAsPrimitive()
	{
		return isChildClientB2CAllAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientB2CAll</code> attribute. 
	 * @param value the childClientB2CAll
	 */
	public void setChildClientB2CAll(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, CHILDCLIENTB2CALL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientB2CAll</code> attribute. 
	 * @param value the childClientB2CAll
	 */
	public void setChildClientB2CAll(final Boolean value)
	{
		setChildClientB2CAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientB2CAll</code> attribute. 
	 * @param value the childClientB2CAll
	 */
	public void setChildClientB2CAll(final SessionContext ctx, final boolean value)
	{
		setChildClientB2CAll( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientB2CAll</code> attribute. 
	 * @param value the childClientB2CAll
	 */
	public void setChildClientB2CAll(final boolean value)
	{
		setChildClientB2CAll( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientTypes</code> attribute.
	 * @return the childClientTypes
	 */
	public Set<Principal> getChildClientTypes(final SessionContext ctx)
	{
		final List<Principal> items = getLinkedItems( 
			ctx,
			true,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			"Principal",
			null,
			false,
			false
		);
		return new LinkedHashSet<Principal>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.childClientTypes</code> attribute.
	 * @return the childClientTypes
	 */
	public Set<Principal> getChildClientTypes()
	{
		return getChildClientTypes( getSession().getSessionContext() );
	}
	
	public long getChildClientTypesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			"Principal",
			null
		);
	}
	
	public long getChildClientTypesCount()
	{
		return getChildClientTypesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientTypes</code> attribute. 
	 * @param value the childClientTypes
	 */
	public void setChildClientTypes(final SessionContext ctx, final Set<Principal> value)
	{
		setLinkedItems( 
			ctx,
			true,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(LOGINCONFIG2CHILDCLIENTTYPES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.childClientTypes</code> attribute. 
	 * @param value the childClientTypes
	 */
	public void setChildClientTypes(final Set<Principal> value)
	{
		setChildClientTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to childClientTypes. 
	 * @param value the item to add to childClientTypes
	 */
	public void addToChildClientTypes(final SessionContext ctx, final Principal value)
	{
		addLinkedItems( 
			ctx,
			true,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(LOGINCONFIG2CHILDCLIENTTYPES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to childClientTypes. 
	 * @param value the item to add to childClientTypes
	 */
	public void addToChildClientTypes(final Principal value)
	{
		addToChildClientTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from childClientTypes. 
	 * @param value the item to remove from childClientTypes
	 */
	public void removeFromChildClientTypes(final SessionContext ctx, final Principal value)
	{
		removeLinkedItems( 
			ctx,
			true,
			ClientconfigConstants.Relations.LOGINCONFIG2CHILDCLIENTTYPES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(LOGINCONFIG2CHILDCLIENTTYPES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from childClientTypes. 
	 * @param value the item to remove from childClientTypes
	 */
	public void removeFromChildClientTypes(final Principal value)
	{
		removeFromChildClientTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName(final SessionContext ctx)
	{
		return (Principal)getProperty( ctx, ENTITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.entityName</code> attribute.
	 * @return the entityName
	 */
	public Principal getEntityName()
	{
		return getEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final SessionContext ctx, final Principal value)
	{
		setProperty(ctx, ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.entityName</code> attribute. 
	 * @param value the entityName
	 */
	public void setEntityName(final Principal value)
	{
		setEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.forgetUserIdCommunicationModes</code> attribute.
	 * @return the forgetUserIdCommunicationModes
	 */
	public Set<EnumerationValue> getForgetUserIdCommunicationModes(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)FORGETUSERIDCOMMUNICATIONMODESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.forgetUserIdCommunicationModes</code> attribute.
	 * @return the forgetUserIdCommunicationModes
	 */
	public Set<EnumerationValue> getForgetUserIdCommunicationModes()
	{
		return getForgetUserIdCommunicationModes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.forgetUserIdCommunicationModes</code> attribute. 
	 * @param value the forgetUserIdCommunicationModes
	 */
	public void setForgetUserIdCommunicationModes(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		FORGETUSERIDCOMMUNICATIONMODESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.forgetUserIdCommunicationModes</code> attribute. 
	 * @param value the forgetUserIdCommunicationModes
	 */
	public void setForgetUserIdCommunicationModes(final Set<EnumerationValue> value)
	{
		setForgetUserIdCommunicationModes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to forgetUserIdCommunicationModes. 
	 * @param value the item to add to forgetUserIdCommunicationModes
	 */
	public void addToForgetUserIdCommunicationModes(final SessionContext ctx, final EnumerationValue value)
	{
		FORGETUSERIDCOMMUNICATIONMODESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to forgetUserIdCommunicationModes. 
	 * @param value the item to add to forgetUserIdCommunicationModes
	 */
	public void addToForgetUserIdCommunicationModes(final EnumerationValue value)
	{
		addToForgetUserIdCommunicationModes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from forgetUserIdCommunicationModes. 
	 * @param value the item to remove from forgetUserIdCommunicationModes
	 */
	public void removeFromForgetUserIdCommunicationModes(final SessionContext ctx, final EnumerationValue value)
	{
		FORGETUSERIDCOMMUNICATIONMODESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from forgetUserIdCommunicationModes. 
	 * @param value the item to remove from forgetUserIdCommunicationModes
	 */
	public void removeFromForgetUserIdCommunicationModes(final EnumerationValue value)
	{
		removeFromForgetUserIdCommunicationModes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.keepUserSignInAllowed</code> attribute.
	 * @return the keepUserSignInAllowed
	 */
	public Boolean isKeepUserSignInAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, KEEPUSERSIGNINALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.keepUserSignInAllowed</code> attribute.
	 * @return the keepUserSignInAllowed
	 */
	public Boolean isKeepUserSignInAllowed()
	{
		return isKeepUserSignInAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.keepUserSignInAllowed</code> attribute. 
	 * @return the keepUserSignInAllowed
	 */
	public boolean isKeepUserSignInAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isKeepUserSignInAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.keepUserSignInAllowed</code> attribute. 
	 * @return the keepUserSignInAllowed
	 */
	public boolean isKeepUserSignInAllowedAsPrimitive()
	{
		return isKeepUserSignInAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.keepUserSignInAllowed</code> attribute. 
	 * @param value the keepUserSignInAllowed
	 */
	public void setKeepUserSignInAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, KEEPUSERSIGNINALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.keepUserSignInAllowed</code> attribute. 
	 * @param value the keepUserSignInAllowed
	 */
	public void setKeepUserSignInAllowed(final Boolean value)
	{
		setKeepUserSignInAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.keepUserSignInAllowed</code> attribute. 
	 * @param value the keepUserSignInAllowed
	 */
	public void setKeepUserSignInAllowed(final SessionContext ctx, final boolean value)
	{
		setKeepUserSignInAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.keepUserSignInAllowed</code> attribute. 
	 * @param value the keepUserSignInAllowed
	 */
	public void setKeepUserSignInAllowed(final boolean value)
	{
		setKeepUserSignInAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.keepUserSignInDays</code> attribute.
	 * @return the keepUserSignInDays
	 */
	public Integer getKeepUserSignInDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, KEEPUSERSIGNINDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.keepUserSignInDays</code> attribute.
	 * @return the keepUserSignInDays
	 */
	public Integer getKeepUserSignInDays()
	{
		return getKeepUserSignInDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.keepUserSignInDays</code> attribute. 
	 * @return the keepUserSignInDays
	 */
	public int getKeepUserSignInDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getKeepUserSignInDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.keepUserSignInDays</code> attribute. 
	 * @return the keepUserSignInDays
	 */
	public int getKeepUserSignInDaysAsPrimitive()
	{
		return getKeepUserSignInDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.keepUserSignInDays</code> attribute. 
	 * @param value the keepUserSignInDays
	 */
	public void setKeepUserSignInDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, KEEPUSERSIGNINDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.keepUserSignInDays</code> attribute. 
	 * @param value the keepUserSignInDays
	 */
	public void setKeepUserSignInDays(final Integer value)
	{
		setKeepUserSignInDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.keepUserSignInDays</code> attribute. 
	 * @param value the keepUserSignInDays
	 */
	public void setKeepUserSignInDays(final SessionContext ctx, final int value)
	{
		setKeepUserSignInDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.keepUserSignInDays</code> attribute. 
	 * @param value the keepUserSignInDays
	 */
	public void setKeepUserSignInDays(final int value)
	{
		setKeepUserSignInDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.loginParameters</code> attribute.
	 * @return the loginParameters
	 */
	public Set<EnumerationValue> getLoginParameters(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)LOGINPARAMETERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.loginParameters</code> attribute.
	 * @return the loginParameters
	 */
	public Set<EnumerationValue> getLoginParameters()
	{
		return getLoginParameters( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.loginParameters</code> attribute. 
	 * @param value the loginParameters
	 */
	public void setLoginParameters(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		LOGINPARAMETERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.loginParameters</code> attribute. 
	 * @param value the loginParameters
	 */
	public void setLoginParameters(final Set<EnumerationValue> value)
	{
		setLoginParameters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to loginParameters. 
	 * @param value the item to add to loginParameters
	 */
	public void addToLoginParameters(final SessionContext ctx, final EnumerationValue value)
	{
		LOGINPARAMETERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to loginParameters. 
	 * @param value the item to add to loginParameters
	 */
	public void addToLoginParameters(final EnumerationValue value)
	{
		addToLoginParameters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from loginParameters. 
	 * @param value the item to remove from loginParameters
	 */
	public void removeFromLoginParameters(final SessionContext ctx, final EnumerationValue value)
	{
		LOGINPARAMETERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from loginParameters. 
	 * @param value the item to remove from loginParameters
	 */
	public void removeFromLoginParameters(final EnumerationValue value)
	{
		removeFromLoginParameters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.loginType</code> attribute.
	 * @return the loginType
	 */
	public EnumerationValue getLoginType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, LOGINTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.loginType</code> attribute.
	 * @return the loginType
	 */
	public EnumerationValue getLoginType()
	{
		return getLoginType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.loginType</code> attribute. 
	 * @param value the loginType
	 */
	public void setLoginType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, LOGINTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.loginType</code> attribute. 
	 * @param value the loginType
	 */
	public void setLoginType(final EnumerationValue value)
	{
		setLoginType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.loginValidation</code> attribute.
	 * @return the loginValidation
	 */
	public EnumerationValue getLoginValidation(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, LOGINVALIDATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.loginValidation</code> attribute.
	 * @return the loginValidation
	 */
	public EnumerationValue getLoginValidation()
	{
		return getLoginValidation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.loginValidation</code> attribute. 
	 * @param value the loginValidation
	 */
	public void setLoginValidation(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, LOGINVALIDATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.loginValidation</code> attribute. 
	 * @param value the loginValidation
	 */
	public void setLoginValidation(final EnumerationValue value)
	{
		setLoginValidation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.passwordConfig</code> attribute.
	 * @return the passwordConfig
	 */
	public PasswordConfig getPasswordConfig(final SessionContext ctx)
	{
		return (PasswordConfig)getProperty( ctx, PASSWORDCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.passwordConfig</code> attribute.
	 * @return the passwordConfig
	 */
	public PasswordConfig getPasswordConfig()
	{
		return getPasswordConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.passwordConfig</code> attribute. 
	 * @param value the passwordConfig
	 */
	public void setPasswordConfig(final SessionContext ctx, final PasswordConfig value)
	{
		new PartOfHandler<PasswordConfig>()
		{
			@Override
			protected PasswordConfig doGetValue(final SessionContext ctx)
			{
				return getPasswordConfig( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final PasswordConfig _value)
			{
				final PasswordConfig value = _value;
				setProperty(ctx, PASSWORDCONFIG,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.passwordConfig</code> attribute. 
	 * @param value the passwordConfig
	 */
	public void setPasswordConfig(final PasswordConfig value)
	{
		setPasswordConfig( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute.
	 * @return the retriesCountBeforeLocking
	 */
	public Integer getRetriesCountBeforeLocking(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, RETRIESCOUNTBEFORELOCKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute.
	 * @return the retriesCountBeforeLocking
	 */
	public Integer getRetriesCountBeforeLocking()
	{
		return getRetriesCountBeforeLocking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute. 
	 * @return the retriesCountBeforeLocking
	 */
	public int getRetriesCountBeforeLockingAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRetriesCountBeforeLocking( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute. 
	 * @return the retriesCountBeforeLocking
	 */
	public int getRetriesCountBeforeLockingAsPrimitive()
	{
		return getRetriesCountBeforeLockingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute. 
	 * @param value the retriesCountBeforeLocking
	 */
	public void setRetriesCountBeforeLocking(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, RETRIESCOUNTBEFORELOCKING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute. 
	 * @param value the retriesCountBeforeLocking
	 */
	public void setRetriesCountBeforeLocking(final Integer value)
	{
		setRetriesCountBeforeLocking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute. 
	 * @param value the retriesCountBeforeLocking
	 */
	public void setRetriesCountBeforeLocking(final SessionContext ctx, final int value)
	{
		setRetriesCountBeforeLocking( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.retriesCountBeforeLocking</code> attribute. 
	 * @param value the retriesCountBeforeLocking
	 */
	public void setRetriesCountBeforeLocking(final int value)
	{
		setRetriesCountBeforeLocking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute.
	 * @return the thirdPartyLoginAllowed
	 */
	public Boolean isThirdPartyLoginAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, THIRDPARTYLOGINALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute.
	 * @return the thirdPartyLoginAllowed
	 */
	public Boolean isThirdPartyLoginAllowed()
	{
		return isThirdPartyLoginAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute. 
	 * @return the thirdPartyLoginAllowed
	 */
	public boolean isThirdPartyLoginAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isThirdPartyLoginAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute. 
	 * @return the thirdPartyLoginAllowed
	 */
	public boolean isThirdPartyLoginAllowedAsPrimitive()
	{
		return isThirdPartyLoginAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute. 
	 * @param value the thirdPartyLoginAllowed
	 */
	public void setThirdPartyLoginAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, THIRDPARTYLOGINALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute. 
	 * @param value the thirdPartyLoginAllowed
	 */
	public void setThirdPartyLoginAllowed(final Boolean value)
	{
		setThirdPartyLoginAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute. 
	 * @param value the thirdPartyLoginAllowed
	 */
	public void setThirdPartyLoginAllowed(final SessionContext ctx, final boolean value)
	{
		setThirdPartyLoginAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.thirdPartyLoginAllowed</code> attribute. 
	 * @param value the thirdPartyLoginAllowed
	 */
	public void setThirdPartyLoginAllowed(final boolean value)
	{
		setThirdPartyLoginAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.userAccountLockAllowed</code> attribute.
	 * @return the userAccountLockAllowed
	 */
	public Boolean isUserAccountLockAllowed(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, USERACCOUNTLOCKALLOWED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.userAccountLockAllowed</code> attribute.
	 * @return the userAccountLockAllowed
	 */
	public Boolean isUserAccountLockAllowed()
	{
		return isUserAccountLockAllowed( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.userAccountLockAllowed</code> attribute. 
	 * @return the userAccountLockAllowed
	 */
	public boolean isUserAccountLockAllowedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isUserAccountLockAllowed( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LoginConfig.userAccountLockAllowed</code> attribute. 
	 * @return the userAccountLockAllowed
	 */
	public boolean isUserAccountLockAllowedAsPrimitive()
	{
		return isUserAccountLockAllowedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.userAccountLockAllowed</code> attribute. 
	 * @param value the userAccountLockAllowed
	 */
	public void setUserAccountLockAllowed(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, USERACCOUNTLOCKALLOWED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.userAccountLockAllowed</code> attribute. 
	 * @param value the userAccountLockAllowed
	 */
	public void setUserAccountLockAllowed(final Boolean value)
	{
		setUserAccountLockAllowed( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.userAccountLockAllowed</code> attribute. 
	 * @param value the userAccountLockAllowed
	 */
	public void setUserAccountLockAllowed(final SessionContext ctx, final boolean value)
	{
		setUserAccountLockAllowed( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LoginConfig.userAccountLockAllowed</code> attribute. 
	 * @param value the userAccountLockAllowed
	 */
	public void setUserAccountLockAllowed(final boolean value)
	{
		setUserAccountLockAllowed( getSession().getSessionContext(), value );
	}
	
}
