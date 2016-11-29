/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.paxapplicability.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.abstractpriceapplicability.jalo.AbstractPriceApplicability;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.paxapplicability.jalo.PaxApplicability PaxApplicability}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaxApplicability extends AbstractPriceApplicability
{
	/** Qualifier of the <code>PaxApplicability.childAgeDetails</code> attribute **/
	public static final String CHILDAGEDETAILS = "childAgeDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n CHILDAGEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ChildAgeDetail> CHILDAGEDETAILSHANDLER = new OneToManyHandler<ChildAgeDetail>(
	SupplierratedefinitionscoreConstants.TC.CHILDAGEDETAIL,
	true,
	"paxapplicability",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractPriceApplicability.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxApplicability.childAgeDetails</code> attribute.
	 * @return the childAgeDetails
	 */
	public Collection<ChildAgeDetail> getChildAgeDetails(final SessionContext ctx)
	{
		return CHILDAGEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaxApplicability.childAgeDetails</code> attribute.
	 * @return the childAgeDetails
	 */
	public Collection<ChildAgeDetail> getChildAgeDetails()
	{
		return getChildAgeDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxApplicability.childAgeDetails</code> attribute. 
	 * @param value the childAgeDetails
	 */
	public void setChildAgeDetails(final SessionContext ctx, final Collection<ChildAgeDetail> value)
	{
		CHILDAGEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaxApplicability.childAgeDetails</code> attribute. 
	 * @param value the childAgeDetails
	 */
	public void setChildAgeDetails(final Collection<ChildAgeDetail> value)
	{
		setChildAgeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to childAgeDetails. 
	 * @param value the item to add to childAgeDetails
	 */
	public void addToChildAgeDetails(final SessionContext ctx, final ChildAgeDetail value)
	{
		CHILDAGEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to childAgeDetails. 
	 * @param value the item to add to childAgeDetails
	 */
	public void addToChildAgeDetails(final ChildAgeDetail value)
	{
		addToChildAgeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from childAgeDetails. 
	 * @param value the item to remove from childAgeDetails
	 */
	public void removeFromChildAgeDetails(final SessionContext ctx, final ChildAgeDetail value)
	{
		CHILDAGEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from childAgeDetails. 
	 * @param value the item to remove from childAgeDetails
	 */
	public void removeFromChildAgeDetails(final ChildAgeDetail value)
	{
		removeFromChildAgeDetails( getSession().getSessionContext(), value );
	}
	
}
