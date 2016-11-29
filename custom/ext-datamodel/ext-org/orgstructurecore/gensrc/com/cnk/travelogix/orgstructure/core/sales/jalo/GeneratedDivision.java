/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.orgstructure.core.sales.jalo;

import com.cnk.travelogix.orgstructure.core.constants.OrgstructurecoreConstants;
import com.cnk.travelogix.orgstructure.core.jalo.AbstractOrganization;
import com.cnk.travelogix.orgstructure.core.sales.jalo.DistributionChannel;
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
 * Generated class for type {@link com.cnk.travelogix.orgstructure.core.sales.jalo.Division Division}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDivision extends AbstractOrganization
{
	/** Qualifier of the <code>Division.distributionChannel</code> attribute **/
	public static final String DISTRIBUTIONCHANNEL = "distributionChannel";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n DISTRIBUTIONCHANNEL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDivision> DISTRIBUTIONCHANNELHANDLER = new BidirectionalOneToManyHandler<GeneratedDivision>(
	OrgstructurecoreConstants.TC.DIVISION,
	false,
	"distributionChannel",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractOrganization.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(DISTRIBUTIONCHANNEL, AttributeMode.INITIAL);
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
		DISTRIBUTIONCHANNELHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Division.distributionChannel</code> attribute.
	 * @return the distributionChannel
	 */
	public DistributionChannel getDistributionChannel(final SessionContext ctx)
	{
		return (DistributionChannel)getProperty( ctx, DISTRIBUTIONCHANNEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Division.distributionChannel</code> attribute.
	 * @return the distributionChannel
	 */
	public DistributionChannel getDistributionChannel()
	{
		return getDistributionChannel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Division.distributionChannel</code> attribute. 
	 * @param value the distributionChannel
	 */
	public void setDistributionChannel(final SessionContext ctx, final DistributionChannel value)
	{
		DISTRIBUTIONCHANNELHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Division.distributionChannel</code> attribute. 
	 * @param value the distributionChannel
	 */
	public void setDistributionChannel(final DistributionChannel value)
	{
		setDistributionChannel( getSession().getSessionContext(), value );
	}
	
}
