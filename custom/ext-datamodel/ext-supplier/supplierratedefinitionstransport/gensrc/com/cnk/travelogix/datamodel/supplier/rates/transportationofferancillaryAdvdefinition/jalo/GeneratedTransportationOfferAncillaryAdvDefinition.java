/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.transportationofferancillaryAdvdefinition.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.AbstractAncillaryRateDeviations;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.PartOfHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.transportationofferancillaryAdvdefinition.jalo.TransportationOfferAncillaryAdvDefinition TransportationOfferAncillaryAdvDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationOfferAncillaryAdvDefinition extends AbstractRateAdvDefinition
{
	/** Qualifier of the <code>TransportationOfferAncillaryAdvDefinition.inclusionexclusion</code> attribute **/
	public static final String INCLUSIONEXCLUSION = "inclusionexclusion";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateAdvDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(INCLUSIONEXCLUSION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOfferAncillaryAdvDefinition.inclusionexclusion</code> attribute.
	 * @return the inclusionexclusion
	 */
	public AbstractAncillaryRateDeviations getInclusionexclusion(final SessionContext ctx)
	{
		return (AbstractAncillaryRateDeviations)getProperty( ctx, INCLUSIONEXCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationOfferAncillaryAdvDefinition.inclusionexclusion</code> attribute.
	 * @return the inclusionexclusion
	 */
	public AbstractAncillaryRateDeviations getInclusionexclusion()
	{
		return getInclusionexclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOfferAncillaryAdvDefinition.inclusionexclusion</code> attribute. 
	 * @param value the inclusionexclusion
	 */
	public void setInclusionexclusion(final SessionContext ctx, final AbstractAncillaryRateDeviations value)
	{
		new PartOfHandler<AbstractAncillaryRateDeviations>()
		{
			@Override
			protected AbstractAncillaryRateDeviations doGetValue(final SessionContext ctx)
			{
				return getInclusionexclusion( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final AbstractAncillaryRateDeviations _value)
			{
				final AbstractAncillaryRateDeviations value = _value;
				setProperty(ctx, INCLUSIONEXCLUSION,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationOfferAncillaryAdvDefinition.inclusionexclusion</code> attribute. 
	 * @param value the inclusionexclusion
	 */
	public void setInclusionexclusion(final AbstractAncillaryRateDeviations value)
	{
		setInclusionexclusion( getSession().getSessionContext(), value );
	}
	
}
