/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import com.cnk.travelogix.common.core.jalo.Traveller;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem VisaInfo}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedVisaInfo extends GenericItem
{
	/** Qualifier of the <code>VisaInfo.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>VisaInfo.validTill</code> attribute **/
	public static final String VALIDTILL = "validTill";
	/** Qualifier of the <code>VisaInfo.traveller</code> attribute **/
	public static final String TRAVELLER = "traveller";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELLER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedVisaInfo> TRAVELLERHANDLER = new BidirectionalOneToManyHandler<GeneratedVisaInfo>(
	CommonCoreConstants.TC.VISAINFO,
	false,
	"traveller",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(VALIDTILL, AttributeMode.INITIAL);
		tmp.put(TRAVELLER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaInfo.country</code> attribute.
	 * @return the country
	 */
	public String getCountry(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaInfo.country</code> attribute.
	 * @return the country
	 */
	public String getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaInfo.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaInfo.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final String value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELLERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaInfo.traveller</code> attribute.
	 * @return the traveller
	 */
	public Traveller getTraveller(final SessionContext ctx)
	{
		return (Traveller)getProperty( ctx, TRAVELLER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaInfo.traveller</code> attribute.
	 * @return the traveller
	 */
	public Traveller getTraveller()
	{
		return getTraveller( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaInfo.traveller</code> attribute. 
	 * @param value the traveller
	 */
	public void setTraveller(final SessionContext ctx, final Traveller value)
	{
		TRAVELLERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaInfo.traveller</code> attribute. 
	 * @param value the traveller
	 */
	public void setTraveller(final Traveller value)
	{
		setTraveller( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaInfo.validTill</code> attribute.
	 * @return the validTill
	 */
	public Date getValidTill(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTILL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>VisaInfo.validTill</code> attribute.
	 * @return the validTill
	 */
	public Date getValidTill()
	{
		return getValidTill( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaInfo.validTill</code> attribute. 
	 * @param value the validTill
	 */
	public void setValidTill(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTILL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>VisaInfo.validTill</code> attribute. 
	 * @param value the validTill
	 */
	public void setValidTill(final Date value)
	{
		setValidTill( getSession().getSessionContext(), value );
	}
	
}
