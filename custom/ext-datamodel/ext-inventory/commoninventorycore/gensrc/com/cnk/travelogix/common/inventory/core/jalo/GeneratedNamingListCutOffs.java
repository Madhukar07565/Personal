/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import com.cnk.travelogix.common.inventory.core.jalo.AbstractInventoryDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.NamingListCutOffs NamingListCutOffs}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNamingListCutOffs extends GenericItem
{
	/** Qualifier of the <code>NamingListCutOffs.definedBy</code> attribute **/
	public static final String DEFINEDBY = "definedBy";
	/** Qualifier of the <code>NamingListCutOffs.typeOfList</code> attribute **/
	public static final String TYPEOFLIST = "typeOfList";
	/** Qualifier of the <code>NamingListCutOffs.appliedOn</code> attribute **/
	public static final String APPLIEDON = "appliedOn";
	/** Qualifier of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute **/
	public static final String SUPPLIERCUTOFFDAYS = "supplierCutOffDays";
	/** Qualifier of the <code>NamingListCutOffs.bufferDays</code> attribute **/
	public static final String BUFFERDAYS = "bufferDays";
	/** Qualifier of the <code>NamingListCutOffs.noOfNTBAS</code> attribute **/
	public static final String NOOFNTBAS = "noOfNTBAS";
	/** Qualifier of the <code>NamingListCutOffs.releaseTime</code> attribute **/
	public static final String RELEASETIME = "releaseTime";
	/** Qualifier of the <code>NamingListCutOffs.abstractInventoryDefinition</code> attribute **/
	public static final String ABSTRACTINVENTORYDEFINITION = "abstractInventoryDefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTINVENTORYDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedNamingListCutOffs> ABSTRACTINVENTORYDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedNamingListCutOffs>(
	CommoninventorycoreConstants.TC.NAMINGLISTCUTOFFS,
	false,
	"abstractInventoryDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DEFINEDBY, AttributeMode.INITIAL);
		tmp.put(TYPEOFLIST, AttributeMode.INITIAL);
		tmp.put(APPLIEDON, AttributeMode.INITIAL);
		tmp.put(SUPPLIERCUTOFFDAYS, AttributeMode.INITIAL);
		tmp.put(BUFFERDAYS, AttributeMode.INITIAL);
		tmp.put(NOOFNTBAS, AttributeMode.INITIAL);
		tmp.put(RELEASETIME, AttributeMode.INITIAL);
		tmp.put(ABSTRACTINVENTORYDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.abstractInventoryDefinition</code> attribute.
	 * @return the abstractInventoryDefinition
	 */
	public AbstractInventoryDefinition getAbstractInventoryDefinition(final SessionContext ctx)
	{
		return (AbstractInventoryDefinition)getProperty( ctx, ABSTRACTINVENTORYDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.abstractInventoryDefinition</code> attribute.
	 * @return the abstractInventoryDefinition
	 */
	public AbstractInventoryDefinition getAbstractInventoryDefinition()
	{
		return getAbstractInventoryDefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.abstractInventoryDefinition</code> attribute. 
	 * @param value the abstractInventoryDefinition
	 */
	public void setAbstractInventoryDefinition(final SessionContext ctx, final AbstractInventoryDefinition value)
	{
		ABSTRACTINVENTORYDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.abstractInventoryDefinition</code> attribute. 
	 * @param value the abstractInventoryDefinition
	 */
	public void setAbstractInventoryDefinition(final AbstractInventoryDefinition value)
	{
		setAbstractInventoryDefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.appliedOn</code> attribute.
	 * @return the appliedOn - Applied On
	 */
	public EnumerationValue getAppliedOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLIEDON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.appliedOn</code> attribute.
	 * @return the appliedOn - Applied On
	 */
	public EnumerationValue getAppliedOn()
	{
		return getAppliedOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied On
	 */
	public void setAppliedOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLIEDON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.appliedOn</code> attribute. 
	 * @param value the appliedOn - Applied On
	 */
	public void setAppliedOn(final EnumerationValue value)
	{
		setAppliedOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.bufferDays</code> attribute.
	 * @return the bufferDays - Buffer Days
	 */
	public Integer getBufferDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BUFFERDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.bufferDays</code> attribute.
	 * @return the bufferDays - Buffer Days
	 */
	public Integer getBufferDays()
	{
		return getBufferDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.bufferDays</code> attribute. 
	 * @return the bufferDays - Buffer Days
	 */
	public int getBufferDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBufferDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.bufferDays</code> attribute. 
	 * @return the bufferDays - Buffer Days
	 */
	public int getBufferDaysAsPrimitive()
	{
		return getBufferDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.bufferDays</code> attribute. 
	 * @param value the bufferDays - Buffer Days
	 */
	public void setBufferDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BUFFERDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.bufferDays</code> attribute. 
	 * @param value the bufferDays - Buffer Days
	 */
	public void setBufferDays(final Integer value)
	{
		setBufferDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.bufferDays</code> attribute. 
	 * @param value the bufferDays - Buffer Days
	 */
	public void setBufferDays(final SessionContext ctx, final int value)
	{
		setBufferDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.bufferDays</code> attribute. 
	 * @param value the bufferDays - Buffer Days
	 */
	public void setBufferDays(final int value)
	{
		setBufferDays( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ABSTRACTINVENTORYDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.definedBy</code> attribute.
	 * @return the definedBy - Defined By
	 */
	public EnumerationValue getDefinedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DEFINEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.definedBy</code> attribute.
	 * @return the definedBy - Defined By
	 */
	public EnumerationValue getDefinedBy()
	{
		return getDefinedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.definedBy</code> attribute. 
	 * @param value the definedBy - Defined By
	 */
	public void setDefinedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DEFINEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.definedBy</code> attribute. 
	 * @param value the definedBy - Defined By
	 */
	public void setDefinedBy(final EnumerationValue value)
	{
		setDefinedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.noOfNTBAS</code> attribute.
	 * @return the noOfNTBAS - No Of NTBAS
	 */
	public Integer getNoOfNTBAS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFNTBAS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.noOfNTBAS</code> attribute.
	 * @return the noOfNTBAS - No Of NTBAS
	 */
	public Integer getNoOfNTBAS()
	{
		return getNoOfNTBAS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.noOfNTBAS</code> attribute. 
	 * @return the noOfNTBAS - No Of NTBAS
	 */
	public int getNoOfNTBASAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfNTBAS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.noOfNTBAS</code> attribute. 
	 * @return the noOfNTBAS - No Of NTBAS
	 */
	public int getNoOfNTBASAsPrimitive()
	{
		return getNoOfNTBASAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.noOfNTBAS</code> attribute. 
	 * @param value the noOfNTBAS - No Of NTBAS
	 */
	public void setNoOfNTBAS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFNTBAS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.noOfNTBAS</code> attribute. 
	 * @param value the noOfNTBAS - No Of NTBAS
	 */
	public void setNoOfNTBAS(final Integer value)
	{
		setNoOfNTBAS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.noOfNTBAS</code> attribute. 
	 * @param value the noOfNTBAS - No Of NTBAS
	 */
	public void setNoOfNTBAS(final SessionContext ctx, final int value)
	{
		setNoOfNTBAS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.noOfNTBAS</code> attribute. 
	 * @param value the noOfNTBAS - No Of NTBAS
	 */
	public void setNoOfNTBAS(final int value)
	{
		setNoOfNTBAS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.releaseTime</code> attribute.
	 * @return the releaseTime - Release Time
	 */
	public String getReleaseTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RELEASETIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.releaseTime</code> attribute.
	 * @return the releaseTime - Release Time
	 */
	public String getReleaseTime()
	{
		return getReleaseTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.releaseTime</code> attribute. 
	 * @param value the releaseTime - Release Time
	 */
	public void setReleaseTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RELEASETIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.releaseTime</code> attribute. 
	 * @param value the releaseTime - Release Time
	 */
	public void setReleaseTime(final String value)
	{
		setReleaseTime( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute.
	 * @return the supplierCutOffDays - supplier Cut Off Days
	 */
	public Integer getSupplierCutOffDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SUPPLIERCUTOFFDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute.
	 * @return the supplierCutOffDays - supplier Cut Off Days
	 */
	public Integer getSupplierCutOffDays()
	{
		return getSupplierCutOffDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute. 
	 * @return the supplierCutOffDays - supplier Cut Off Days
	 */
	public int getSupplierCutOffDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSupplierCutOffDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute. 
	 * @return the supplierCutOffDays - supplier Cut Off Days
	 */
	public int getSupplierCutOffDaysAsPrimitive()
	{
		return getSupplierCutOffDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute. 
	 * @param value the supplierCutOffDays - supplier Cut Off Days
	 */
	public void setSupplierCutOffDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SUPPLIERCUTOFFDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute. 
	 * @param value the supplierCutOffDays - supplier Cut Off Days
	 */
	public void setSupplierCutOffDays(final Integer value)
	{
		setSupplierCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute. 
	 * @param value the supplierCutOffDays - supplier Cut Off Days
	 */
	public void setSupplierCutOffDays(final SessionContext ctx, final int value)
	{
		setSupplierCutOffDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.supplierCutOffDays</code> attribute. 
	 * @param value the supplierCutOffDays - supplier Cut Off Days
	 */
	public void setSupplierCutOffDays(final int value)
	{
		setSupplierCutOffDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.typeOfList</code> attribute.
	 * @return the typeOfList - Type Of List
	 */
	public EnumerationValue getTypeOfList(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFLIST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NamingListCutOffs.typeOfList</code> attribute.
	 * @return the typeOfList - Type Of List
	 */
	public EnumerationValue getTypeOfList()
	{
		return getTypeOfList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.typeOfList</code> attribute. 
	 * @param value the typeOfList - Type Of List
	 */
	public void setTypeOfList(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFLIST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NamingListCutOffs.typeOfList</code> attribute. 
	 * @param value the typeOfList - Type Of List
	 */
	public void setTypeOfList(final EnumerationValue value)
	{
		setTypeOfList( getSession().getSessionContext(), value );
	}
	
}
