/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.Prospect;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.user.Address;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.PresalesAddress PresalesAddress}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPresalesAddress extends Address
{
	/** Qualifier of the <code>PresalesAddress.webSiteUrl</code> attribute **/
	public static final String WEBSITEURL = "webSiteUrl";
	/** Qualifier of the <code>PresalesAddress.officialEmailId</code> attribute **/
	public static final String OFFICIALEMAILID = "officialEmailId";
	/** Qualifier of the <code>PresalesAddress.servingLocation</code> attribute **/
	public static final String SERVINGLOCATION = "servingLocation";
	/** Qualifier of the <code>PresalesAddress.prospect</code> attribute **/
	public static final String PROSPECT = "prospect";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PROSPECT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPresalesAddress> PROSPECTHANDLER = new BidirectionalOneToManyHandler<GeneratedPresalesAddress>(
	PresalescoreConstants.TC.PRESALESADDRESS,
	false,
	"prospect",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Address.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(WEBSITEURL, AttributeMode.INITIAL);
		tmp.put(OFFICIALEMAILID, AttributeMode.INITIAL);
		tmp.put(SERVINGLOCATION, AttributeMode.INITIAL);
		tmp.put(PROSPECT, AttributeMode.INITIAL);
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
		PROSPECTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PresalesAddress.officialEmailId</code> attribute.
	 * @return the officialEmailId - OfficialEmailId for Address
	 */
	public String getOfficialEmailId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFICIALEMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PresalesAddress.officialEmailId</code> attribute.
	 * @return the officialEmailId - OfficialEmailId for Address
	 */
	public String getOfficialEmailId()
	{
		return getOfficialEmailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PresalesAddress.officialEmailId</code> attribute. 
	 * @param value the officialEmailId - OfficialEmailId for Address
	 */
	public void setOfficialEmailId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFICIALEMAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PresalesAddress.officialEmailId</code> attribute. 
	 * @param value the officialEmailId - OfficialEmailId for Address
	 */
	public void setOfficialEmailId(final String value)
	{
		setOfficialEmailId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PresalesAddress.prospect</code> attribute.
	 * @return the prospect
	 */
	public Prospect getProspect(final SessionContext ctx)
	{
		return (Prospect)getProperty( ctx, PROSPECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PresalesAddress.prospect</code> attribute.
	 * @return the prospect
	 */
	public Prospect getProspect()
	{
		return getProspect( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PresalesAddress.prospect</code> attribute. 
	 * @param value the prospect
	 */
	public void setProspect(final SessionContext ctx, final Prospect value)
	{
		PROSPECTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PresalesAddress.prospect</code> attribute. 
	 * @param value the prospect
	 */
	public void setProspect(final Prospect value)
	{
		setProspect( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PresalesAddress.servingLocation</code> attribute.
	 * @return the servingLocation - servicing location
	 */
	public EnumerationValue getServingLocation(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SERVINGLOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PresalesAddress.servingLocation</code> attribute.
	 * @return the servingLocation - servicing location
	 */
	public EnumerationValue getServingLocation()
	{
		return getServingLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PresalesAddress.servingLocation</code> attribute. 
	 * @param value the servingLocation - servicing location
	 */
	public void setServingLocation(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SERVINGLOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PresalesAddress.servingLocation</code> attribute. 
	 * @param value the servingLocation - servicing location
	 */
	public void setServingLocation(final EnumerationValue value)
	{
		setServingLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PresalesAddress.webSiteUrl</code> attribute.
	 * @return the webSiteUrl - WebSiteUrl for Address
	 */
	public String getWebSiteUrl(final SessionContext ctx)
	{
		return (String)getProperty( ctx, WEBSITEURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PresalesAddress.webSiteUrl</code> attribute.
	 * @return the webSiteUrl - WebSiteUrl for Address
	 */
	public String getWebSiteUrl()
	{
		return getWebSiteUrl( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PresalesAddress.webSiteUrl</code> attribute. 
	 * @param value the webSiteUrl - WebSiteUrl for Address
	 */
	public void setWebSiteUrl(final SessionContext ctx, final String value)
	{
		setProperty(ctx, WEBSITEURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PresalesAddress.webSiteUrl</code> attribute. 
	 * @param value the webSiteUrl - WebSiteUrl for Address
	 */
	public void setWebSiteUrl(final String value)
	{
		setWebSiteUrl( getSession().getSessionContext(), value );
	}
	
}
