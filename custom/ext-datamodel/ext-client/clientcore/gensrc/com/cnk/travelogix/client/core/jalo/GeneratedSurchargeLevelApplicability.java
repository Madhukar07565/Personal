/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.AdvanceApplicability;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.SurchargeLevelApplicability SurchargeLevelApplicability}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSurchargeLevelApplicability extends GenericItem
{
	/** Qualifier of the <code>SurchargeLevelApplicability.surchargeType</code> attribute **/
	public static final String SURCHARGETYPE = "surchargeType";
	/** Qualifier of the <code>SurchargeLevelApplicability.surchargeSubType</code> attribute **/
	public static final String SURCHARGESUBTYPE = "surchargeSubType";
	/** Qualifier of the <code>SurchargeLevelApplicability.advanceApplicability</code> attribute **/
	public static final String ADVANCEAPPLICABILITY = "advanceApplicability";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEAPPLICABILITY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSurchargeLevelApplicability> ADVANCEAPPLICABILITYHANDLER = new BidirectionalOneToManyHandler<GeneratedSurchargeLevelApplicability>(
	ClientcoreConstants.TC.SURCHARGELEVELAPPLICABILITY,
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
		tmp.put(SURCHARGETYPE, AttributeMode.INITIAL);
		tmp.put(SURCHARGESUBTYPE, AttributeMode.INITIAL);
		tmp.put(ADVANCEAPPLICABILITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SurchargeLevelApplicability.advanceApplicability</code> attribute.
	 * @return the advanceApplicability
	 */
	public AdvanceApplicability getAdvanceApplicability(final SessionContext ctx)
	{
		return (AdvanceApplicability)getProperty( ctx, ADVANCEAPPLICABILITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SurchargeLevelApplicability.advanceApplicability</code> attribute.
	 * @return the advanceApplicability
	 */
	public AdvanceApplicability getAdvanceApplicability()
	{
		return getAdvanceApplicability( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SurchargeLevelApplicability.advanceApplicability</code> attribute. 
	 * @param value the advanceApplicability
	 */
	public void setAdvanceApplicability(final SessionContext ctx, final AdvanceApplicability value)
	{
		ADVANCEAPPLICABILITYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SurchargeLevelApplicability.advanceApplicability</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>SurchargeLevelApplicability.surchargeSubType</code> attribute.
	 * @return the surchargeSubType - Surcharge Sub Type
	 */
	public EnumerationValue getSurchargeSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SURCHARGESUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SurchargeLevelApplicability.surchargeSubType</code> attribute.
	 * @return the surchargeSubType - Surcharge Sub Type
	 */
	public EnumerationValue getSurchargeSubType()
	{
		return getSurchargeSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SurchargeLevelApplicability.surchargeSubType</code> attribute. 
	 * @param value the surchargeSubType - Surcharge Sub Type
	 */
	public void setSurchargeSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SURCHARGESUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SurchargeLevelApplicability.surchargeSubType</code> attribute. 
	 * @param value the surchargeSubType - Surcharge Sub Type
	 */
	public void setSurchargeSubType(final EnumerationValue value)
	{
		setSurchargeSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SurchargeLevelApplicability.surchargeType</code> attribute.
	 * @return the surchargeType - Surcharge Type
	 */
	public EnumerationValue getSurchargeType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SURCHARGETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SurchargeLevelApplicability.surchargeType</code> attribute.
	 * @return the surchargeType - Surcharge Type
	 */
	public EnumerationValue getSurchargeType()
	{
		return getSurchargeType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SurchargeLevelApplicability.surchargeType</code> attribute. 
	 * @param value the surchargeType - Surcharge Type
	 */
	public void setSurchargeType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SURCHARGETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SurchargeLevelApplicability.surchargeType</code> attribute. 
	 * @param value the surchargeType - Surcharge Type
	 */
	public void setSurchargeType(final EnumerationValue value)
	{
		setSurchargeType( getSession().getSessionContext(), value );
	}
	
}
