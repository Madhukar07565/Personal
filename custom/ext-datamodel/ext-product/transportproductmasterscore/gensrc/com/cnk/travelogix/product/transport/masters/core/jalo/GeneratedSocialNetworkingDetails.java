/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import com.cnk.travelogix.product.transport.masters.core.jalo.AbstractCruiseItem;
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
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.SocialNetworkingDetails SocialNetworkingDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSocialNetworkingDetails extends GenericItem
{
	/** Qualifier of the <code>SocialNetworkingDetails.socialNetworkingName</code> attribute **/
	public static final String SOCIALNETWORKINGNAME = "socialNetworkingName";
	/** Qualifier of the <code>SocialNetworkingDetails.socialNetworkingID</code> attribute **/
	public static final String SOCIALNETWORKINGID = "socialNetworkingID";
	/** Qualifier of the <code>SocialNetworkingDetails.company</code> attribute **/
	public static final String COMPANY = "company";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSocialNetworkingDetails> COMPANYHANDLER = new BidirectionalOneToManyHandler<GeneratedSocialNetworkingDetails>(
	TransportproductmasterscoreConstants.TC.SOCIALNETWORKINGDETAILS,
	false,
	"company",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SOCIALNETWORKINGNAME, AttributeMode.INITIAL);
		tmp.put(SOCIALNETWORKINGID, AttributeMode.INITIAL);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialNetworkingDetails.company</code> attribute.
	 * @return the company
	 */
	public AbstractCruiseItem getCompany(final SessionContext ctx)
	{
		return (AbstractCruiseItem)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialNetworkingDetails.company</code> attribute.
	 * @return the company
	 */
	public AbstractCruiseItem getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialNetworkingDetails.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final AbstractCruiseItem value)
	{
		COMPANYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialNetworkingDetails.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final AbstractCruiseItem value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialNetworkingDetails.socialNetworkingID</code> attribute.
	 * @return the socialNetworkingID - Social Networking ID
	 */
	public String getSocialNetworkingID(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOCIALNETWORKINGID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialNetworkingDetails.socialNetworkingID</code> attribute.
	 * @return the socialNetworkingID - Social Networking ID
	 */
	public String getSocialNetworkingID()
	{
		return getSocialNetworkingID( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialNetworkingDetails.socialNetworkingID</code> attribute. 
	 * @param value the socialNetworkingID - Social Networking ID
	 */
	public void setSocialNetworkingID(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOCIALNETWORKINGID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialNetworkingDetails.socialNetworkingID</code> attribute. 
	 * @param value the socialNetworkingID - Social Networking ID
	 */
	public void setSocialNetworkingID(final String value)
	{
		setSocialNetworkingID( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialNetworkingDetails.socialNetworkingName</code> attribute.
	 * @return the socialNetworkingName - Social Networking Name
	 */
	public String getSocialNetworkingName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SOCIALNETWORKINGNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SocialNetworkingDetails.socialNetworkingName</code> attribute.
	 * @return the socialNetworkingName - Social Networking Name
	 */
	public String getSocialNetworkingName()
	{
		return getSocialNetworkingName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialNetworkingDetails.socialNetworkingName</code> attribute. 
	 * @param value the socialNetworkingName - Social Networking Name
	 */
	public void setSocialNetworkingName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SOCIALNETWORKINGNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SocialNetworkingDetails.socialNetworkingName</code> attribute. 
	 * @param value the socialNetworkingName - Social Networking Name
	 */
	public void setSocialNetworkingName(final String value)
	{
		setSocialNetworkingName( getSession().getSessionContext(), value );
	}
	
}
