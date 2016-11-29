/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.transportationratedetail.jalo.TransportationRateDetail;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionstransportConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateDefinition;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.order.price.Tax;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.transportationratedefinition.jalo.TransportationRateDefinition TransportationRateDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationRateDefinition extends AbstractRateDefinition
{
	/** Qualifier of the <code>TransportationRateDefinition.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute **/
	public static final String FREESALEUNLIMITED = "freeSaleUnlimited";
	/** Qualifier of the <code>TransportationRateDefinition.taxes</code> attribute **/
	public static final String TAXES = "taxes";
	/** Qualifier of the <code>TransportationRateDefinition.transportationRateDetails</code> attribute **/
	public static final String TRANSPORTATIONRATEDETAILS = "transportationRateDetails";
	/**
	* {@link OneToManyHandler} for handling 1:n TAXES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Tax> TAXESHANDLER = new OneToManyHandler<Tax>(
	CoreConstants.TC.TAX,
	true,
	"transportationRateDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRANSPORTATIONRATEDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TransportationRateDetail> TRANSPORTATIONRATEDETAILSHANDLER = new OneToManyHandler<TransportationRateDetail>(
	SupplierratedefinitionstransportConstants.TC.TRANSPORTATIONRATEDETAIL,
	true,
	"transportationRateDefinition",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractRateDefinition.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(FREESALEUNLIMITED, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute.
	 * @return the freeSaleUnlimited
	 */
	public Boolean isFreeSaleUnlimited(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FREESALEUNLIMITED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute.
	 * @return the freeSaleUnlimited
	 */
	public Boolean isFreeSaleUnlimited()
	{
		return isFreeSaleUnlimited( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute. 
	 * @return the freeSaleUnlimited
	 */
	public boolean isFreeSaleUnlimitedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFreeSaleUnlimited( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute. 
	 * @return the freeSaleUnlimited
	 */
	public boolean isFreeSaleUnlimitedAsPrimitive()
	{
		return isFreeSaleUnlimitedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute. 
	 * @param value the freeSaleUnlimited
	 */
	public void setFreeSaleUnlimited(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FREESALEUNLIMITED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute. 
	 * @param value the freeSaleUnlimited
	 */
	public void setFreeSaleUnlimited(final Boolean value)
	{
		setFreeSaleUnlimited( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute. 
	 * @param value the freeSaleUnlimited
	 */
	public void setFreeSaleUnlimited(final SessionContext ctx, final boolean value)
	{
		setFreeSaleUnlimited( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.freeSaleUnlimited</code> attribute. 
	 * @param value the freeSaleUnlimited
	 */
	public void setFreeSaleUnlimited(final boolean value)
	{
		setFreeSaleUnlimited( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.taxes</code> attribute.
	 * @return the taxes
	 */
	public Collection<Tax> getTaxes(final SessionContext ctx)
	{
		return TAXESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.taxes</code> attribute.
	 * @return the taxes
	 */
	public Collection<Tax> getTaxes()
	{
		return getTaxes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final SessionContext ctx, final Collection<Tax> value)
	{
		TAXESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.taxes</code> attribute. 
	 * @param value the taxes
	 */
	public void setTaxes(final Collection<Tax> value)
	{
		setTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxes. 
	 * @param value the item to add to taxes
	 */
	public void addToTaxes(final SessionContext ctx, final Tax value)
	{
		TAXESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxes. 
	 * @param value the item to add to taxes
	 */
	public void addToTaxes(final Tax value)
	{
		addToTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxes. 
	 * @param value the item to remove from taxes
	 */
	public void removeFromTaxes(final SessionContext ctx, final Tax value)
	{
		TAXESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxes. 
	 * @param value the item to remove from taxes
	 */
	public void removeFromTaxes(final Tax value)
	{
		removeFromTaxes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.transportationRateDetails</code> attribute.
	 * @return the transportationRateDetails
	 */
	public Set<TransportationRateDetail> getTransportationRateDetails(final SessionContext ctx)
	{
		return (Set<TransportationRateDetail>)TRANSPORTATIONRATEDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationRateDefinition.transportationRateDetails</code> attribute.
	 * @return the transportationRateDetails
	 */
	public Set<TransportationRateDetail> getTransportationRateDetails()
	{
		return getTransportationRateDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.transportationRateDetails</code> attribute. 
	 * @param value the transportationRateDetails
	 */
	public void setTransportationRateDetails(final SessionContext ctx, final Set<TransportationRateDetail> value)
	{
		TRANSPORTATIONRATEDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationRateDefinition.transportationRateDetails</code> attribute. 
	 * @param value the transportationRateDetails
	 */
	public void setTransportationRateDetails(final Set<TransportationRateDetail> value)
	{
		setTransportationRateDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to transportationRateDetails. 
	 * @param value the item to add to transportationRateDetails
	 */
	public void addToTransportationRateDetails(final SessionContext ctx, final TransportationRateDetail value)
	{
		TRANSPORTATIONRATEDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to transportationRateDetails. 
	 * @param value the item to add to transportationRateDetails
	 */
	public void addToTransportationRateDetails(final TransportationRateDetail value)
	{
		addToTransportationRateDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from transportationRateDetails. 
	 * @param value the item to remove from transportationRateDetails
	 */
	public void removeFromTransportationRateDetails(final SessionContext ctx, final TransportationRateDetail value)
	{
		TRANSPORTATIONRATEDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from transportationRateDetails. 
	 * @param value the item to remove from transportationRateDetails
	 */
	public void removeFromTransportationRateDetails(final TransportationRateDetail value)
	{
		removeFromTransportationRateDetails( getSession().getSessionContext(), value );
	}
	
}
