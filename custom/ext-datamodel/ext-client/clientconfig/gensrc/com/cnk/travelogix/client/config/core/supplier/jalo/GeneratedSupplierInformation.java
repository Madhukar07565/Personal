/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.config.core.supplier.jalo;

import com.cnk.travelogix.client.config.constants.ClientconfigConstants;
import com.cnk.travelogix.client.config.core.timelimit.jalo.TimeLimitMasterConfig;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
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

/**
 * Generated class for type {@link com.cnk.travelogix.client.config.core.supplier.jalo.SupplierInformation SupplierInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierInformation extends GenericItem
{
	/** Qualifier of the <code>SupplierInformation.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>SupplierInformation.inclusion</code> attribute **/
	public static final String INCLUSION = "inclusion";
	/** Qualifier of the <code>SupplierInformation.timeLimitMasterConfig</code> attribute **/
	public static final String TIMELIMITMASTERCONFIG = "timeLimitMasterConfig";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TIMELIMITMASTERCONFIG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierInformation> TIMELIMITMASTERCONFIGHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierInformation>(
	ClientconfigConstants.TC.SUPPLIERINFORMATION,
	false,
	"timeLimitMasterConfig",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(INCLUSION, AttributeMode.INITIAL);
		tmp.put(TIMELIMITMASTERCONFIG, AttributeMode.INITIAL);
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
		TIMELIMITMASTERCONFIGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInformation.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Boolean isInclusion(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, INCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInformation.inclusion</code> attribute.
	 * @return the inclusion
	 */
	public Boolean isInclusion()
	{
		return isInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInformation.inclusion</code> attribute. 
	 * @return the inclusion
	 */
	public boolean isInclusionAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isInclusion( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInformation.inclusion</code> attribute. 
	 * @return the inclusion
	 */
	public boolean isInclusionAsPrimitive()
	{
		return isInclusionAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInformation.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, INCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInformation.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final Boolean value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInformation.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final SessionContext ctx, final boolean value)
	{
		setInclusion( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInformation.inclusion</code> attribute. 
	 * @param value the inclusion
	 */
	public void setInclusion(final boolean value)
	{
		setInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInformation.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInformation.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInformation.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInformation.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInformation.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig(final SessionContext ctx)
	{
		return (TimeLimitMasterConfig)getProperty( ctx, TIMELIMITMASTERCONFIG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierInformation.timeLimitMasterConfig</code> attribute.
	 * @return the timeLimitMasterConfig
	 */
	public TimeLimitMasterConfig getTimeLimitMasterConfig()
	{
		return getTimeLimitMasterConfig( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInformation.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final SessionContext ctx, final TimeLimitMasterConfig value)
	{
		TIMELIMITMASTERCONFIGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierInformation.timeLimitMasterConfig</code> attribute. 
	 * @param value the timeLimitMasterConfig
	 */
	public void setTimeLimitMasterConfig(final TimeLimitMasterConfig value)
	{
		setTimeLimitMasterConfig( getSession().getSessionContext(), value );
	}
	
}
