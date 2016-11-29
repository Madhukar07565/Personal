/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion;

import com.cnk.travelogix.masterdata.core.fare.jalo.FareBasis;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.config.jalo.AbstractAdvDefConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.AirSupplierAdvanceDefinition;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
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
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.FareBasisConfig FareClassesConfig}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFareBasisConfig extends AbstractAdvDefConfig
{
	/** Qualifier of the <code>FareClassesConfig.fareBasis</code> attribute **/
	public static final String FAREBASIS = "fareBasis";
	/** Qualifier of the <code>FareClassesConfig.fareBasisValue</code> attribute **/
	public static final String FAREBASISVALUE = "fareBasisValue";
	/** Qualifier of the <code>FareClassesConfig.advanceDefinition</code> attribute **/
	public static final String ADVANCEDEFINITION = "advanceDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ADVANCEDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFareBasisConfig> ADVANCEDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedFareBasisConfig>(
	SuppliercommercialscoreConstants.TC.FARECLASSESCONFIG,
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
		tmp.put(FAREBASIS, AttributeMode.INITIAL);
		tmp.put(FAREBASISVALUE, AttributeMode.INITIAL);
		tmp.put(ADVANCEDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareClassesConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AirSupplierAdvanceDefinition getAdvanceDefinition(final SessionContext ctx)
	{
		return (AirSupplierAdvanceDefinition)getProperty( ctx, ADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareClassesConfig.advanceDefinition</code> attribute.
	 * @return the advanceDefinition
	 */
	public AirSupplierAdvanceDefinition getAdvanceDefinition()
	{
		return getAdvanceDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareClassesConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final SessionContext ctx, final AirSupplierAdvanceDefinition value)
	{
		ADVANCEDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareClassesConfig.advanceDefinition</code> attribute. 
	 * @param value the advanceDefinition
	 */
	public void setAdvanceDefinition(final AirSupplierAdvanceDefinition value)
	{
		setAdvanceDefinition( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ADVANCEDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareClassesConfig.fareBasis</code> attribute.
	 * @return the fareBasis
	 */
	public FareBasis getFareBasis(final SessionContext ctx)
	{
		return (FareBasis)getProperty( ctx, FAREBASIS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareClassesConfig.fareBasis</code> attribute.
	 * @return the fareBasis
	 */
	public FareBasis getFareBasis()
	{
		return getFareBasis( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareClassesConfig.fareBasis</code> attribute. 
	 * @param value the fareBasis
	 */
	public void setFareBasis(final SessionContext ctx, final FareBasis value)
	{
		setProperty(ctx, FAREBASIS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareClassesConfig.fareBasis</code> attribute. 
	 * @param value the fareBasis
	 */
	public void setFareBasis(final FareBasis value)
	{
		setFareBasis( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareClassesConfig.fareBasisValue</code> attribute.
	 * @return the fareBasisValue - Defines the fare Basis Value
	 */
	public String getFareBasisValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAREBASISVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FareClassesConfig.fareBasisValue</code> attribute.
	 * @return the fareBasisValue - Defines the fare Basis Value
	 */
	public String getFareBasisValue()
	{
		return getFareBasisValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareClassesConfig.fareBasisValue</code> attribute. 
	 * @param value the fareBasisValue - Defines the fare Basis Value
	 */
	public void setFareBasisValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAREBASISVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FareClassesConfig.fareBasisValue</code> attribute. 
	 * @param value the fareBasisValue - Defines the fare Basis Value
	 */
	public void setFareBasisValue(final String value)
	{
		setFareBasisValue( getSession().getSessionContext(), value );
	}
	
}
