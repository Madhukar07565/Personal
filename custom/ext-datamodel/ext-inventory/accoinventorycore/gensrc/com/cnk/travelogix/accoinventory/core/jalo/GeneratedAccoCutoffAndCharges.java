/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.accoinventory.core.jalo;

import com.cnk.travelogix.acco.inventory.core.constants.AccoinventorycoreConstants;
import com.cnk.travelogix.accoinventory.core.jalo.AccoPenaltyChargesRelease;
import com.cnk.travelogix.common.inventory.core.jalo.CutOffsAndCharges;
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
 * Generated class for type {@link com.cnk.travelogix.accoinventory.core.jalo.AccoCutoffAndCharges AccoCutoffAndCharges}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAccoCutoffAndCharges extends CutOffsAndCharges
{
	/** Qualifier of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute **/
	public static final String MINUTILIZATIONTHRESHOLD = "minUtilizationThreshold";
	/** Qualifier of the <code>AccoCutoffAndCharges.accoPenaltyChargesRelease</code> attribute **/
	public static final String ACCOPENALTYCHARGESRELEASE = "accoPenaltyChargesRelease";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOPENALTYCHARGESRELEASE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAccoCutoffAndCharges> ACCOPENALTYCHARGESRELEASEHANDLER = new BidirectionalOneToManyHandler<GeneratedAccoCutoffAndCharges>(
	AccoinventorycoreConstants.TC.ACCOCUTOFFANDCHARGES,
	false,
	"accoPenaltyChargesRelease",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CutOffsAndCharges.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MINUTILIZATIONTHRESHOLD, AttributeMode.INITIAL);
		tmp.put(ACCOPENALTYCHARGESRELEASE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCutoffAndCharges.accoPenaltyChargesRelease</code> attribute.
	 * @return the accoPenaltyChargesRelease
	 */
	public AccoPenaltyChargesRelease getAccoPenaltyChargesRelease(final SessionContext ctx)
	{
		return (AccoPenaltyChargesRelease)getProperty( ctx, ACCOPENALTYCHARGESRELEASE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCutoffAndCharges.accoPenaltyChargesRelease</code> attribute.
	 * @return the accoPenaltyChargesRelease
	 */
	public AccoPenaltyChargesRelease getAccoPenaltyChargesRelease()
	{
		return getAccoPenaltyChargesRelease( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCutoffAndCharges.accoPenaltyChargesRelease</code> attribute. 
	 * @param value the accoPenaltyChargesRelease
	 */
	public void setAccoPenaltyChargesRelease(final SessionContext ctx, final AccoPenaltyChargesRelease value)
	{
		ACCOPENALTYCHARGESRELEASEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCutoffAndCharges.accoPenaltyChargesRelease</code> attribute. 
	 * @param value the accoPenaltyChargesRelease
	 */
	public void setAccoPenaltyChargesRelease(final AccoPenaltyChargesRelease value)
	{
		setAccoPenaltyChargesRelease( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOPENALTYCHARGESRELEASEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute.
	 * @return the minUtilizationThreshold - Min Utilization Threshold
	 */
	public Long getMinUtilizationThreshold(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, MINUTILIZATIONTHRESHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute.
	 * @return the minUtilizationThreshold - Min Utilization Threshold
	 */
	public Long getMinUtilizationThreshold()
	{
		return getMinUtilizationThreshold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute. 
	 * @return the minUtilizationThreshold - Min Utilization Threshold
	 */
	public long getMinUtilizationThresholdAsPrimitive(final SessionContext ctx)
	{
		Long value = getMinUtilizationThreshold( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute. 
	 * @return the minUtilizationThreshold - Min Utilization Threshold
	 */
	public long getMinUtilizationThresholdAsPrimitive()
	{
		return getMinUtilizationThresholdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute. 
	 * @param value the minUtilizationThreshold - Min Utilization Threshold
	 */
	public void setMinUtilizationThreshold(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, MINUTILIZATIONTHRESHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute. 
	 * @param value the minUtilizationThreshold - Min Utilization Threshold
	 */
	public void setMinUtilizationThreshold(final Long value)
	{
		setMinUtilizationThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute. 
	 * @param value the minUtilizationThreshold - Min Utilization Threshold
	 */
	public void setMinUtilizationThreshold(final SessionContext ctx, final long value)
	{
		setMinUtilizationThreshold( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AccoCutoffAndCharges.minUtilizationThreshold</code> attribute. 
	 * @param value the minUtilizationThreshold - Min Utilization Threshold
	 */
	public void setMinUtilizationThreshold(final long value)
	{
		setMinUtilizationThreshold( getSession().getSessionContext(), value );
	}
	
}
