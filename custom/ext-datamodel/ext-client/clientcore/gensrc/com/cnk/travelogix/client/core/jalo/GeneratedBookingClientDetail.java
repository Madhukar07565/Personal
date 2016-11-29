/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.supplier.masterdata.core.bookingconfig.BookingConfiguration;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BookingClientDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBookingClientDetail extends GenericItem
{
	/** Qualifier of the <code>BookingClientDetail.entityType</code> attribute **/
	public static final String ENTITYTYPE = "entityType";
	/** Qualifier of the <code>BookingClientDetail.entityCategory</code> attribute **/
	public static final String ENTITYCATEGORY = "entityCategory";
	/** Qualifier of the <code>BookingClientDetail.entitySubCategory</code> attribute **/
	public static final String ENTITYSUBCATEGORY = "entitySubCategory";
	/** Qualifier of the <code>BookingClientDetail.entityGroup</code> attribute **/
	public static final String ENTITYGROUP = "entityGroup";
	/** Qualifier of the <code>BookingClientDetail.entityName</code> attribute **/
	public static final String ENTITYNAME = "entityName";
	/** Qualifier of the <code>BookingClientDetail.client</code> attribute **/
	public static final String CLIENT = "client";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CLIENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBookingClientDetail> CLIENTHANDLER = new BidirectionalOneToManyHandler<GeneratedBookingClientDetail>(
	ClientcoreConstants.TC.BOOKINGCLIENTDETAIL,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ENTITYTYPE, AttributeMode.INITIAL);
		tmp.put(ENTITYCATEGORY, AttributeMode.INITIAL);
		tmp.put(ENTITYSUBCATEGORY, AttributeMode.INITIAL);
		tmp.put(ENTITYGROUP, AttributeMode.INITIAL);
		tmp.put(ENTITYNAME, AttributeMode.INITIAL);
		tmp.put(CLIENT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.client</code> attribute.
	 * @return the client
	 */
	public BookingConfiguration getClient(final SessionContext ctx)
	{
		return (BookingConfiguration)getProperty( ctx, CLIENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.client</code> attribute.
	 * @return the client
	 */
	public BookingConfiguration getClient()
	{
		return getClient( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final SessionContext ctx, final BookingConfiguration value)
	{
		CLIENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.client</code> attribute. 
	 * @param value the client
	 */
	public void setClient(final BookingConfiguration value)
	{
		setClient( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CLIENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityCategory</code> attribute.
	 * @return the entityCategory - Entity Category
	 */
	public EnumerationValue getEntityCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENTITYCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityCategory</code> attribute.
	 * @return the entityCategory - Entity Category
	 */
	public EnumerationValue getEntityCategory()
	{
		return getEntityCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityCategory</code> attribute. 
	 * @param value the entityCategory - Entity Category
	 */
	public void setEntityCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENTITYCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityCategory</code> attribute. 
	 * @param value the entityCategory - Entity Category
	 */
	public void setEntityCategory(final EnumerationValue value)
	{
		setEntityCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityGroup</code> attribute.
	 * @return the entityGroup - Entity Group
	 */
	public EnumerationValue getEntityGroup(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENTITYGROUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityGroup</code> attribute.
	 * @return the entityGroup - Entity Group
	 */
	public EnumerationValue getEntityGroup()
	{
		return getEntityGroup( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityGroup</code> attribute. 
	 * @param value the entityGroup - Entity Group
	 */
	public void setEntityGroup(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENTITYGROUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityGroup</code> attribute. 
	 * @param value the entityGroup - Entity Group
	 */
	public void setEntityGroup(final EnumerationValue value)
	{
		setEntityGroup( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityName</code> attribute.
	 * @return the entityName - Entity Name
	 */
	public String getEntityName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBookingClientDetail.getEntityName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, ENTITYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityName</code> attribute.
	 * @return the entityName - Entity Name
	 */
	public String getEntityName()
	{
		return getEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityName</code> attribute. 
	 * @return the localized entityName - Entity Name
	 */
	public Map<Language,String> getAllEntityName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,ENTITYNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityName</code> attribute. 
	 * @return the localized entityName - Entity Name
	 */
	public Map<Language,String> getAllEntityName()
	{
		return getAllEntityName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityName</code> attribute. 
	 * @param value the entityName - Entity Name
	 */
	public void setEntityName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBookingClientDetail.setEntityName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityName</code> attribute. 
	 * @param value the entityName - Entity Name
	 */
	public void setEntityName(final String value)
	{
		setEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityName</code> attribute. 
	 * @param value the entityName - Entity Name
	 */
	public void setAllEntityName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,ENTITYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityName</code> attribute. 
	 * @param value the entityName - Entity Name
	 */
	public void setAllEntityName(final Map<Language,String> value)
	{
		setAllEntityName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entitySubCategory</code> attribute.
	 * @return the entitySubCategory - Entity SubCategory
	 */
	public EnumerationValue getEntitySubCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENTITYSUBCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entitySubCategory</code> attribute.
	 * @return the entitySubCategory - Entity SubCategory
	 */
	public EnumerationValue getEntitySubCategory()
	{
		return getEntitySubCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entitySubCategory</code> attribute. 
	 * @param value the entitySubCategory - Entity SubCategory
	 */
	public void setEntitySubCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENTITYSUBCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entitySubCategory</code> attribute. 
	 * @param value the entitySubCategory - Entity SubCategory
	 */
	public void setEntitySubCategory(final EnumerationValue value)
	{
		setEntitySubCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityType</code> attribute.
	 * @return the entityType - Entity Type
	 */
	public EnumerationValue getEntityType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, ENTITYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BookingClientDetail.entityType</code> attribute.
	 * @return the entityType - Entity Type
	 */
	public EnumerationValue getEntityType()
	{
		return getEntityType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityType</code> attribute. 
	 * @param value the entityType - Entity Type
	 */
	public void setEntityType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, ENTITYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BookingClientDetail.entityType</code> attribute. 
	 * @param value the entityType - Entity Type
	 */
	public void setEntityType(final EnumerationValue value)
	{
		setEntityType( getSession().getSessionContext(), value );
	}
	
}
