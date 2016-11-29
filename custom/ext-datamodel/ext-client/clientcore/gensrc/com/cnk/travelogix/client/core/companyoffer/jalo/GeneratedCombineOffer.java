/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyOffers;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
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
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.CombineOffer CombineOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCombineOffer extends GenericItem
{
	/** Qualifier of the <code>CombineOffer.companyOffers</code> attribute **/
	public static final String COMPANYOFFERS = "companyOffers";
	/** Qualifier of the <code>CombineOffer.companyCombineOffer</code> attribute **/
	public static final String COMPANYCOMBINEOFFER = "companyCombineOffer";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMPANYCOMBINEOFFER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCombineOffer> COMPANYCOMBINEOFFERHANDLER = new BidirectionalOneToManyHandler<GeneratedCombineOffer>(
	ClientcoreConstants.TC.COMBINEOFFER,
	false,
	"companyCombineOffer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANYOFFERS, AttributeMode.INITIAL);
		tmp.put(COMPANYCOMBINEOFFER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombineOffer.companyCombineOffer</code> attribute.
	 * @return the companyCombineOffer
	 */
	public CompanyOffers getCompanyCombineOffer(final SessionContext ctx)
	{
		return (CompanyOffers)getProperty( ctx, COMPANYCOMBINEOFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombineOffer.companyCombineOffer</code> attribute.
	 * @return the companyCombineOffer
	 */
	public CompanyOffers getCompanyCombineOffer()
	{
		return getCompanyCombineOffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombineOffer.companyCombineOffer</code> attribute. 
	 * @param value the companyCombineOffer
	 */
	public void setCompanyCombineOffer(final SessionContext ctx, final CompanyOffers value)
	{
		COMPANYCOMBINEOFFERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombineOffer.companyCombineOffer</code> attribute. 
	 * @param value the companyCombineOffer
	 */
	public void setCompanyCombineOffer(final CompanyOffers value)
	{
		setCompanyCombineOffer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombineOffer.companyOffers</code> attribute.
	 * @return the companyOffers
	 */
	public Set<CompanyOffers> getCompanyOffers(final SessionContext ctx)
	{
		Set<CompanyOffers> coll = (Set<CompanyOffers>)getProperty( ctx, COMPANYOFFERS);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CombineOffer.companyOffers</code> attribute.
	 * @return the companyOffers
	 */
	public Set<CompanyOffers> getCompanyOffers()
	{
		return getCompanyOffers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombineOffer.companyOffers</code> attribute. 
	 * @param value the companyOffers
	 */
	public void setCompanyOffers(final SessionContext ctx, final Set<CompanyOffers> value)
	{
		setProperty(ctx, COMPANYOFFERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CombineOffer.companyOffers</code> attribute. 
	 * @param value the companyOffers
	 */
	public void setCompanyOffers(final Set<CompanyOffers> value)
	{
		setCompanyOffers( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMPANYCOMBINEOFFERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
}
