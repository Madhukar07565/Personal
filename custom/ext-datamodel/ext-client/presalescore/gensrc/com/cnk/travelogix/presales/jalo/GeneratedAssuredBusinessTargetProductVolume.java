/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.AbstractTargetProductVolume;
import com.cnk.travelogix.presales.jalo.AssuredBusiness;
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
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.AssuredBusinessTargetProductVolume AssuredBusinessTargetProductVolume}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAssuredBusinessTargetProductVolume extends AbstractTargetProductVolume
{
	/** Qualifier of the <code>AssuredBusinessTargetProductVolume.assuredBusiness</code> attribute **/
	public static final String ASSUREDBUSINESS = "assuredBusiness";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ASSUREDBUSINESS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAssuredBusinessTargetProductVolume> ASSUREDBUSINESSHANDLER = new BidirectionalOneToManyHandler<GeneratedAssuredBusinessTargetProductVolume>(
	PresalescoreConstants.TC.ASSUREDBUSINESSTARGETPRODUCTVOLUME,
	false,
	"assuredBusiness",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTargetProductVolume.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ASSUREDBUSINESS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusinessTargetProductVolume.assuredBusiness</code> attribute.
	 * @return the assuredBusiness
	 */
	public AssuredBusiness getAssuredBusiness(final SessionContext ctx)
	{
		return (AssuredBusiness)getProperty( ctx, ASSUREDBUSINESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AssuredBusinessTargetProductVolume.assuredBusiness</code> attribute.
	 * @return the assuredBusiness
	 */
	public AssuredBusiness getAssuredBusiness()
	{
		return getAssuredBusiness( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusinessTargetProductVolume.assuredBusiness</code> attribute. 
	 * @param value the assuredBusiness
	 */
	public void setAssuredBusiness(final SessionContext ctx, final AssuredBusiness value)
	{
		ASSUREDBUSINESSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AssuredBusinessTargetProductVolume.assuredBusiness</code> attribute. 
	 * @param value the assuredBusiness
	 */
	public void setAssuredBusiness(final AssuredBusiness value)
	{
		setAssuredBusiness( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ASSUREDBUSINESSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
