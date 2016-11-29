/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractCommonMasterType;
import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.CommercialTerms;
import com.cnk.travelogix.presales.jalo.Lead;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.Competitor Competitor}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompetitor extends AbstractCommonMasterType
{
	/** Qualifier of the <code>Competitor.lead</code> attribute **/
	public static final String LEAD = "lead";
	/** Qualifier of the <code>Competitor.commertialTerms</code> attribute **/
	public static final String COMMERTIALTERMS = "commertialTerms";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n LEAD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCompetitor> LEADHANDLER = new BidirectionalOneToManyHandler<GeneratedCompetitor>(
	PresalescoreConstants.TC.COMPETITOR,
	false,
	"lead",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COMMERTIALTERMS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CommercialTerms> COMMERTIALTERMSHANDLER = new OneToManyHandler<CommercialTerms>(
	PresalescoreConstants.TC.COMMERCIALTERMS,
	false,
	"competitor",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommonMasterType.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LEAD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Competitor.commertialTerms</code> attribute.
	 * @return the commertialTerms
	 */
	public Collection<CommercialTerms> getCommertialTerms(final SessionContext ctx)
	{
		return COMMERTIALTERMSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Competitor.commertialTerms</code> attribute.
	 * @return the commertialTerms
	 */
	public Collection<CommercialTerms> getCommertialTerms()
	{
		return getCommertialTerms( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Competitor.commertialTerms</code> attribute. 
	 * @param value the commertialTerms
	 */
	public void setCommertialTerms(final SessionContext ctx, final Collection<CommercialTerms> value)
	{
		COMMERTIALTERMSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Competitor.commertialTerms</code> attribute. 
	 * @param value the commertialTerms
	 */
	public void setCommertialTerms(final Collection<CommercialTerms> value)
	{
		setCommertialTerms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commertialTerms. 
	 * @param value the item to add to commertialTerms
	 */
	public void addToCommertialTerms(final SessionContext ctx, final CommercialTerms value)
	{
		COMMERTIALTERMSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to commertialTerms. 
	 * @param value the item to add to commertialTerms
	 */
	public void addToCommertialTerms(final CommercialTerms value)
	{
		addToCommertialTerms( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commertialTerms. 
	 * @param value the item to remove from commertialTerms
	 */
	public void removeFromCommertialTerms(final SessionContext ctx, final CommercialTerms value)
	{
		COMMERTIALTERMSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from commertialTerms. 
	 * @param value the item to remove from commertialTerms
	 */
	public void removeFromCommertialTerms(final CommercialTerms value)
	{
		removeFromCommertialTerms( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		LEADHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Competitor.lead</code> attribute.
	 * @return the lead
	 */
	public Lead getLead(final SessionContext ctx)
	{
		return (Lead)getProperty( ctx, LEAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Competitor.lead</code> attribute.
	 * @return the lead
	 */
	public Lead getLead()
	{
		return getLead( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Competitor.lead</code> attribute. 
	 * @param value the lead
	 */
	public void setLead(final SessionContext ctx, final Lead value)
	{
		LEADHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Competitor.lead</code> attribute. 
	 * @param value the lead
	 */
	public void setLead(final Lead value)
	{
		setLead( getSession().getSessionContext(), value );
	}
	
}
