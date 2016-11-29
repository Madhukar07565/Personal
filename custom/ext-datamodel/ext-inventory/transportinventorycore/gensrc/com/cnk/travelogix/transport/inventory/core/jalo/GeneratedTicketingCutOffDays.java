/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transport.inventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transport.inventory.core.jalo.TicketingCutOffDays TicketingCutOffDays}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTicketingCutOffDays extends GenericItem
{
	/** Qualifier of the <code>TicketingCutOffDays.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>TicketingCutOffDays.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	/** Qualifier of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute **/
	public static final String SUPPLIERCUTOFFDAYS = "supplierCutOffDays";
	/** Qualifier of the <code>TicketingCutOffDays.bufferDays</code> attribute **/
	public static final String BUFFERDAYS = "bufferDays";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCUTOFFDAYS, AttributeMode.INITIAL);
		tmp.put(BUFFERDAYS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.appliedOn</code> attribute.
	 * @return the appliedOn - Applied 
	 * 						on
	 */
	public EnumerationValue getAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.appliedOn</code> attribute.
	 * @return the appliedOn - Applied 
	 * 						on
	 */
	public EnumerationValue getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied 
	 * 						on
	 */
	public void setAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied 
	 * 						on
	 */
	public void setAppliedOn(final EnumerationValue value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.bufferDays</code> attribute.
	 * @return the bufferDays - Buffer days
	 */
	public Long getBufferDays(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, BUFFERDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.bufferDays</code> attribute.
	 * @return the bufferDays - Buffer days
	 */
	public Long getBufferDays()
	{
		return getBufferDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.bufferDays</code> attribute. 
	 * @return the bufferDays - Buffer days
	 */
	public long getBufferDaysAsPrimitive(final SessionContext ctx)
	{
		Long value = getBufferDays( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.bufferDays</code> attribute. 
	 * @return the bufferDays - Buffer days
	 */
	public long getBufferDaysAsPrimitive()
	{
		return getBufferDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.bufferDays</code> attribute. 
	 * @param value the bufferDays - Buffer days
	 */
	public void setBufferDays(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, BUFFERDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.bufferDays</code> attribute. 
	 * @param value the bufferDays - Buffer days
	 */
	public void setBufferDays(final Long value)
	{
		setBufferDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.bufferDays</code> attribute. 
	 * @param value the bufferDays - Buffer days
	 */
	public void setBufferDays(final SessionContext ctx, final long value)
	{
		setBufferDays( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.bufferDays</code> attribute. 
	 * @param value the bufferDays - Buffer days
	 */
	public void setBufferDays(final long value)
	{
		setBufferDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.definedBy</code> attribute.
	 * @return the definedBy - Air defined by
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.definedBy</code> attribute.
	 * @return the definedBy - Air defined by
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.definedBy</code> attribute. 
	 * @param value the definedBy - Air defined by
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.definedBy</code> attribute. 
	 * @param value the definedBy - Air defined by
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute.
	 * @return the supplierCutOffDays - Supplier cut off days
	 */
	public Long getSupplierCutOffDays(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, SUPPLIERCUTOFFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute.
	 * @return the supplierCutOffDays - Supplier cut off days
	 */
	public Long getSupplierCutOffDays()
	{
		return getSupplierCutOffDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute. 
	 * @return the supplierCutOffDays - Supplier cut off days
	 */
	public long getSupplierCutOffDaysAsPrimitive(final SessionContext ctx)
	{
		Long value = getSupplierCutOffDays( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute. 
	 * @return the supplierCutOffDays - Supplier cut off days
	 */
	public long getSupplierCutOffDaysAsPrimitive()
	{
		return getSupplierCutOffDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute. 
	 * @param value the supplierCutOffDays - Supplier cut off days
	 */
	public void setSupplierCutOffDays(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, SUPPLIERCUTOFFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute. 
	 * @param value the supplierCutOffDays - Supplier cut off days
	 */
	public void setSupplierCutOffDays(final Long value)
	{
		setSupplierCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute. 
	 * @param value the supplierCutOffDays - Supplier cut off days
	 */
	public void setSupplierCutOffDays(final SessionContext ctx, final long value)
	{
		setSupplierCutOffDays( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TicketingCutOffDays.supplierCutOffDays</code> attribute. 
	 * @param value the supplierCutOffDays - Supplier cut off days
	 */
	public void setSupplierCutOffDays(final long value)
	{
		setSupplierCutOffDays( getSession().getSessionContext(), value );
	}
	
}
