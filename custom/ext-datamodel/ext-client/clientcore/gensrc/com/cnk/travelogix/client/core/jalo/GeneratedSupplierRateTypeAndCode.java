/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.AdvanceApplicability;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateCode;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.SupplierRateTypeAndCode SupplierRateTypeAndCode}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierRateTypeAndCode extends GenericItem
{
	/** Qualifier of the <code>SupplierRateTypeAndCode.rateType</code> attribute **/
	public static final String RATETYPE = "rateType";
	/** Qualifier of the <code>SupplierRateTypeAndCode.rateCode</code> attribute **/
	public static final String RATECODE = "rateCode";
	/** Qualifier of the <code>SupplierRateTypeAndCode.advanceApplicability</code> attribute **/
	public static final String ADVANCEAPPLICABILITY = "advanceApplicability";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEAPPLICABILITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierRateTypeAndCode> ADVANCEAPPLICABILITYHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierRateTypeAndCode>(
	ClientcoreConstants.TC.SUPPLIERRATETYPEANDCODE,
	false,
	"advanceApplicability",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(RATETYPE, AttributeMode.INITIAL);
		tmp.put(RATECODE, AttributeMode.INITIAL);
		tmp.put(ADVANCEAPPLICABILITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRateTypeAndCode.advanceApplicability</code> attribute.
	 * @return the advanceApplicability
	 */
	public AdvanceApplicability getAdvanceApplicability(final SessionContext ctx)
	{
		return (AdvanceApplicability)getProperty( ctx, ADVANCEAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRateTypeAndCode.advanceApplicability</code> attribute.
	 * @return the advanceApplicability
	 */
	public AdvanceApplicability getAdvanceApplicability()
	{
		return getAdvanceApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRateTypeAndCode.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability
	 */
	public void setAdvanceApplicability(final SessionContext ctx, final AdvanceApplicability value)
	{
		ADVANCEAPPLICABILITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRateTypeAndCode.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability
	 */
	public void setAdvanceApplicability(final AdvanceApplicability value)
	{
		setAdvanceApplicability( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADVANCEAPPLICABILITYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRateTypeAndCode.rateCode</code> attribute.
	 * @return the rateCode - Supplier Rate Code
	 */
	public RateCode getRateCode(final SessionContext ctx)
	{
		return (RateCode)getProperty( ctx, RATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRateTypeAndCode.rateCode</code> attribute.
	 * @return the rateCode - Supplier Rate Code
	 */
	public RateCode getRateCode()
	{
		return getRateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRateTypeAndCode.rateCode</code> attribute. 
	 * @param value the rateCode - Supplier Rate Code
	 */
	public void setRateCode(final SessionContext ctx, final RateCode value)
	{
		setProperty(ctx, RATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRateTypeAndCode.rateCode</code> attribute. 
	 * @param value the rateCode - Supplier Rate Code
	 */
	public void setRateCode(final RateCode value)
	{
		setRateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRateTypeAndCode.rateType</code> attribute.
	 * @return the rateType - Supplier Rate Type
	 */
	public RateType getRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, RATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierRateTypeAndCode.rateType</code> attribute.
	 * @return the rateType - Supplier Rate Type
	 */
	public RateType getRateType()
	{
		return getRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRateTypeAndCode.rateType</code> attribute. 
	 * @param value the rateType - Supplier Rate Type
	 */
	public void setRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, RATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierRateTypeAndCode.rateType</code> attribute. 
	 * @param value the rateType - Supplier Rate Type
	 */
	public void setRateType(final RateType value)
	{
		setRateType( getSession().getSessionContext(), value );
	}
	
}
