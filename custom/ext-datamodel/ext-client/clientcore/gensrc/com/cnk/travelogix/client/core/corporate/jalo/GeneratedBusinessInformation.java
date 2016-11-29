/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.corporate.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.TravelogixCorporateUnit;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.corporate.jalo.BusinessInformation BusinessInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusinessInformation extends GenericItem
{
	/** Qualifier of the <code>BusinessInformation.industry</code> attribute **/
	public static final String INDUSTRY = "industry";
	/** Qualifier of the <code>BusinessInformation.sector</code> attribute **/
	public static final String SECTOR = "sector";
	/** Qualifier of the <code>BusinessInformation.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>BusinessInformation.travelogixCorporateUnit</code> attribute **/
	public static final String TRAVELOGIXCORPORATEUNIT = "travelogixCorporateUnit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXCORPORATEUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBusinessInformation> TRAVELOGIXCORPORATEUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedBusinessInformation>(
	ClientcoreConstants.TC.BUSINESSINFORMATION,
	false,
	"travelogixCorporateUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(INDUSTRY, AttributeMode.INITIAL);
		tmp.put(SECTOR, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXCORPORATEUNIT, AttributeMode.INITIAL);
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
		TRAVELOGIXCORPORATEUNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.industry</code> attribute.
	 * @return the industry - industry for BusinessInformation
	 */
	public EnumerationValue getIndustry(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INDUSTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.industry</code> attribute.
	 * @return the industry - industry for BusinessInformation
	 */
	public EnumerationValue getIndustry()
	{
		return getIndustry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.industry</code> attribute. 
	 * @param value the industry - industry for BusinessInformation
	 */
	public void setIndustry(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INDUSTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.industry</code> attribute. 
	 * @param value the industry - industry for BusinessInformation
	 */
	public void setIndustry(final EnumerationValue value)
	{
		setIndustry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.product</code> attribute.
	 * @return the product - product for BusinessInformation
	 */
	public EnumerationValue getProduct(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.product</code> attribute.
	 * @return the product - product for BusinessInformation
	 */
	public EnumerationValue getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.product</code> attribute. 
	 * @param value the product - product for BusinessInformation
	 */
	public void setProduct(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.product</code> attribute. 
	 * @param value the product - product for BusinessInformation
	 */
	public void setProduct(final EnumerationValue value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.sector</code> attribute.
	 * @return the sector - sector for BusinessInformation
	 */
	public EnumerationValue getSector(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SECTOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.sector</code> attribute.
	 * @return the sector - sector for BusinessInformation
	 */
	public EnumerationValue getSector()
	{
		return getSector( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.sector</code> attribute. 
	 * @param value the sector - sector for BusinessInformation
	 */
	public void setSector(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SECTOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.sector</code> attribute. 
	 * @param value the sector - sector for BusinessInformation
	 */
	public void setSector(final EnumerationValue value)
	{
		setSector( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit(final SessionContext ctx)
	{
		return (TravelogixCorporateUnit)getProperty( ctx, TRAVELOGIXCORPORATEUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessInformation.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit()
	{
		return getTravelogixCorporateUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final SessionContext ctx, final TravelogixCorporateUnit value)
	{
		TRAVELOGIXCORPORATEUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessInformation.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnit( getSession().getSessionContext(), value );
	}
	
}
