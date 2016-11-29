/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.nationality;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.AccoSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.accommodation.nationality.ClientNationalityConfig ClientNationalityConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientNationalityConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>ClientNationalityConfig.clientNationality</code> attribute **/
	public static final String CLIENTNATIONALITY = "clientNationality";
	/** Qualifier of the <code>ClientNationalityConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link OneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AccoSupplierAdvanceDefinition> ADVANCEDEFINITIONHANDLER = new OneToManyHandler<AccoSupplierAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.ACCOSUPPLIERADVANCEDEFINITION,
	false,
	"clientNationalities",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAdvDefConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CLIENTNATIONALITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientNationalityConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<AccoSupplierAdvanceDefinition> getAdvanceDefinition(final SessionContext ctx)
	{
		return ADVANCEDEFINITIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientNationalityConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public Collection<AccoSupplierAdvanceDefinition> getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientNationalityConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final Collection<AccoSupplierAdvanceDefinition> value)
	{
		ADVANCEDEFINITIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientNationalityConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final Collection<AccoSupplierAdvanceDefinition> value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final SessionContext ctx, final AccoSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advanceDefinition. 
	 * @param value the item to add to advanceDefinition
	 */
	public void addToAdvanceDefinition(final AccoSupplierAdvanceDefinition value)
	{
		addToAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final SessionContext ctx, final AccoSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advanceDefinition. 
	 * @param value the item to remove from advanceDefinition
	 */
	public void removeFromAdvanceDefinition(final AccoSupplierAdvanceDefinition value)
	{
		removeFromAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientNationalityConfig.clientNationality</code> attribute.
	 * @return the clientNationality
	 */
	public Country getClientNationality(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, CLIENTNATIONALITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientNationalityConfig.clientNationality</code> attribute.
	 * @return the clientNationality
	 */
	public Country getClientNationality()
	{
		return getClientNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientNationalityConfig.clientNationality</code> attribute. 
	 * @param value the clientNationality
	 */
	public void setClientNationality(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, CLIENTNATIONALITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientNationalityConfig.clientNationality</code> attribute. 
	 * @param value the clientNationality
	 */
	public void setClientNationality(final Country value)
	{
		setClientNationality( getSession().getSessionContext(), value );
	}
	
}