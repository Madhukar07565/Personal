/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.Partner;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.ContractDocuments ContractDocuments}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedContractDocuments extends Media
{
	/** Qualifier of the <code>ContractDocuments.contractFrom</code> attribute **/
	public static final String CONTRACTFROM = "contractFrom";
	/** Qualifier of the <code>ContractDocuments.contractTo</code> attribute **/
	public static final String CONTRACTTO = "contractTo";
	/** Qualifier of the <code>ContractDocuments.partner</code> attribute **/
	public static final String PARTNER = "partner";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PARTNER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedContractDocuments> PARTNERHANDLER = new BidirectionalOneToManyHandler<GeneratedContractDocuments>(
	PresalescoreConstants.TC.CONTRACTDOCUMENTS,
	false,
	"partner",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Media.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CONTRACTFROM, AttributeMode.INITIAL);
		tmp.put(CONTRACTTO, AttributeMode.INITIAL);
		tmp.put(PARTNER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractDocuments.contractFrom</code> attribute.
	 * @return the contractFrom - Contract From Date
	 */
	public Date getContractFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONTRACTFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractDocuments.contractFrom</code> attribute.
	 * @return the contractFrom - Contract From Date
	 */
	public Date getContractFrom()
	{
		return getContractFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractDocuments.contractFrom</code> attribute. 
	 * @param value the contractFrom - Contract From Date
	 */
	public void setContractFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONTRACTFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractDocuments.contractFrom</code> attribute. 
	 * @param value the contractFrom - Contract From Date
	 */
	public void setContractFrom(final Date value)
	{
		setContractFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractDocuments.contractTo</code> attribute.
	 * @return the contractTo - Contract To Date
	 */
	public Date getContractTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CONTRACTTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractDocuments.contractTo</code> attribute.
	 * @return the contractTo - Contract To Date
	 */
	public Date getContractTo()
	{
		return getContractTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractDocuments.contractTo</code> attribute. 
	 * @param value the contractTo - Contract To Date
	 */
	public void setContractTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CONTRACTTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractDocuments.contractTo</code> attribute. 
	 * @param value the contractTo - Contract To Date
	 */
	public void setContractTo(final Date value)
	{
		setContractTo( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PARTNERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractDocuments.partner</code> attribute.
	 * @return the partner
	 */
	public Partner getPartner(final SessionContext ctx)
	{
		return (Partner)getProperty( ctx, PARTNER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ContractDocuments.partner</code> attribute.
	 * @return the partner
	 */
	public Partner getPartner()
	{
		return getPartner( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractDocuments.partner</code> attribute. 
	 * @param value the partner
	 */
	public void setPartner(final SessionContext ctx, final Partner value)
	{
		PARTNERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ContractDocuments.partner</code> attribute. 
	 * @param value the partner
	 */
	public void setPartner(final Partner value)
	{
		setPartner( getSession().getSessionContext(), value );
	}
	
}
