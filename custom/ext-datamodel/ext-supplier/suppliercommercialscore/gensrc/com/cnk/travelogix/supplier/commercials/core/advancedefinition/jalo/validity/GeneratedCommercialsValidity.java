/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.validity;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.validity.CommercialsValidity CommercialsValidityConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommercialsValidity extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>CommercialsValidityConfig.validityOn</code> attribute **/
	public static final String VALIDITYON = "validityOn";
	/** Qualifier of the <code>CommercialsValidityConfig.validFrom</code> attribute **/
	public static final String VALIDFROM = "validFrom";
	/** Qualifier of the <code>CommercialsValidityConfig.validTo</code> attribute **/
	public static final String VALIDTO = "validTo";
	/** Qualifier of the <code>CommercialsValidityConfig.blockOutFrom</code> attribute **/
	public static final String BLOCKOUTFROM = "blockOutFrom";
	/** Qualifier of the <code>CommercialsValidityConfig.blockOutTo</code> attribute **/
	public static final String BLOCKOUTTO = "blockOutTo";
	/** Qualifier of the <code>CommercialsValidityConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCommercialsValidity> ADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedCommercialsValidity>(
	SuppliercommercialscoreConstants.TC.COMMERCIALSVALIDITYCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractAdvDefConfig.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(VALIDITYON, AttributeMode.INITIAL);
		tmp.put(VALIDFROM, AttributeMode.INITIAL);
		tmp.put(VALIDTO, AttributeMode.INITIAL);
		tmp.put(BLOCKOUTFROM, AttributeMode.INITIAL);
		tmp.put(BLOCKOUTTO, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public SupplierCommercialAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (SupplierCommercialAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public SupplierCommercialAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final SupplierCommercialAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SupplierCommercialAdvanceDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.blockOutFrom</code> attribute.
	 * @return the blockOutFrom - Defines the block out start date
	 */
	public Date getBlockOutFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BLOCKOUTFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.blockOutFrom</code> attribute.
	 * @return the blockOutFrom - Defines the block out start date
	 */
	public Date getBlockOutFrom()
	{
		return getBlockOutFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.blockOutFrom</code> attribute. 
	 * @param value the blockOutFrom - Defines the block out start date
	 */
	public void setBlockOutFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BLOCKOUTFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.blockOutFrom</code> attribute. 
	 * @param value the blockOutFrom - Defines the block out start date
	 */
	public void setBlockOutFrom(final Date value)
	{
		setBlockOutFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.blockOutTo</code> attribute.
	 * @return the blockOutTo - Defines the block out end date
	 */
	public Date getBlockOutTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, BLOCKOUTTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.blockOutTo</code> attribute.
	 * @return the blockOutTo - Defines the block out end date
	 */
	public Date getBlockOutTo()
	{
		return getBlockOutTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.blockOutTo</code> attribute. 
	 * @param value the blockOutTo - Defines the block out end date
	 */
	public void setBlockOutTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, BLOCKOUTTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.blockOutTo</code> attribute. 
	 * @param value the blockOutTo - Defines the block out end date
	 */
	public void setBlockOutTo(final Date value)
	{
		setBlockOutTo( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.validFrom</code> attribute.
	 * @return the validFrom - Defines the validity start date
	 */
	public Date getValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.validFrom</code> attribute.
	 * @return the validFrom - Defines the validity start date
	 */
	public Date getValidFrom()
	{
		return getValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.validFrom</code> attribute. 
	 * @param value the validFrom - Defines the validity start date
	 */
	public void setValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.validFrom</code> attribute. 
	 * @param value the validFrom - Defines the validity start date
	 */
	public void setValidFrom(final Date value)
	{
		setValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.validityOn</code> attribute.
	 * @return the validityOn - Defines the criterias for applying the validity
	 */
	public EnumerationValue getValidityOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, VALIDITYON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.validityOn</code> attribute.
	 * @return the validityOn - Defines the criterias for applying the validity
	 */
	public EnumerationValue getValidityOn()
	{
		return getValidityOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.validityOn</code> attribute. 
	 * @param value the validityOn - Defines the criterias for applying the validity
	 */
	public void setValidityOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, VALIDITYON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.validityOn</code> attribute. 
	 * @param value the validityOn - Defines the criterias for applying the validity
	 */
	public void setValidityOn(final EnumerationValue value)
	{
		setValidityOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.validTo</code> attribute.
	 * @return the validTo - Defines the validity end date
	 */
	public Date getValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, VALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialsValidityConfig.validTo</code> attribute.
	 * @return the validTo - Defines the validity end date
	 */
	public Date getValidTo()
	{
		return getValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.validTo</code> attribute. 
	 * @param value the validTo - Defines the validity end date
	 */
	public void setValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, VALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialsValidityConfig.validTo</code> attribute. 
	 * @param value the validTo - Defines the validity end date
	 */
	public void setValidTo(final Date value)
	{
		setValidTo( getSession().getSessionContext(), value );
	}
	
}
