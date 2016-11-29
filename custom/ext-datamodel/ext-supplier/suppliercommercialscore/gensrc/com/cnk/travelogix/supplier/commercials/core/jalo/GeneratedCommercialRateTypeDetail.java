/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.masterdata.core.proucts.jalo.RateCode;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.GeneralCommercialRecord;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.CommercialRateTypeDetail CommercialRateTypeDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommercialRateTypeDetail extends GenericItem
{
	/** Qualifier of the <code>CommercialRateTypeDetail.rateType</code> attribute **/
	public static final String RATETYPE = "rateType";
	/** Qualifier of the <code>CommercialRateTypeDetail.rateCode</code> attribute **/
	public static final String RATECODE = "rateCode";
	/** Qualifier of the <code>CommercialRateTypeDetail.commercialrcd</code> attribute **/
	public static final String COMMERCIALRCD = "commercialrcd";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIALRCD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCommercialRateTypeDetail> COMMERCIALRCDHANDLER = new BidirectionalOneToManyHandler<GeneratedCommercialRateTypeDetail>(
	SuppliercommercialscoreConstants.TC.COMMERCIALRATETYPEDETAIL,
	false,
	"commercialrcd",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RATETYPE, AttributeMode.INITIAL);
		tmp.put(RATECODE, AttributeMode.INITIAL);
		tmp.put(COMMERCIALRCD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialRateTypeDetail.commercialrcd</code> attribute.
	 * @return the commercialrcd
	 */
	public GeneralCommercialRecord getCommercialrcd(final SessionContext ctx)
	{
		return (GeneralCommercialRecord)getProperty( ctx, COMMERCIALRCD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialRateTypeDetail.commercialrcd</code> attribute.
	 * @return the commercialrcd
	 */
	public GeneralCommercialRecord getCommercialrcd()
	{
		return getCommercialrcd( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialRateTypeDetail.commercialrcd</code> attribute. 
	 * @param value the commercialrcd
	 */
	public void setCommercialrcd(final SessionContext ctx, final GeneralCommercialRecord value)
	{
		COMMERCIALRCDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialRateTypeDetail.commercialrcd</code> attribute. 
	 * @param value the commercialrcd
	 */
	public void setCommercialrcd(final GeneralCommercialRecord value)
	{
		setCommercialrcd( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMERCIALRCDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialRateTypeDetail.rateCode</code> attribute.
	 * @return the rateCode
	 */
	public RateCode getRateCode(final SessionContext ctx)
	{
		return (RateCode)getProperty( ctx, RATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialRateTypeDetail.rateCode</code> attribute.
	 * @return the rateCode
	 */
	public RateCode getRateCode()
	{
		return getRateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialRateTypeDetail.rateCode</code> attribute. 
	 * @param value the rateCode
	 */
	public void setRateCode(final SessionContext ctx, final RateCode value)
	{
		setProperty(ctx, RATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialRateTypeDetail.rateCode</code> attribute. 
	 * @param value the rateCode
	 */
	public void setRateCode(final RateCode value)
	{
		setRateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialRateTypeDetail.rateType</code> attribute.
	 * @return the rateType
	 */
	public RateType getRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, RATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialRateTypeDetail.rateType</code> attribute.
	 * @return the rateType
	 */
	public RateType getRateType()
	{
		return getRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialRateTypeDetail.rateType</code> attribute. 
	 * @param value the rateType
	 */
	public void setRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, RATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialRateTypeDetail.rateType</code> attribute. 
	 * @param value the rateType
	 */
	public void setRateType(final RateType value)
	{
		setRateType( getSession().getSessionContext(), value );
	}
	
}
