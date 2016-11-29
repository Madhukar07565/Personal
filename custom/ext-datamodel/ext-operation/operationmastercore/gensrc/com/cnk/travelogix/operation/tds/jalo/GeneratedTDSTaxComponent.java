/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.tds.jalo;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.tds.jalo.TDSMaster;
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
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.tds.jalo.TDSTaxComponent TDSTaxComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTDSTaxComponent extends GenericItem
{
	/** Qualifier of the <code>TDSTaxComponent.taxElement</code> attribute **/
	public static final String TAXELEMENT = "taxElement";
	/** Qualifier of the <code>TDSTaxComponent.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>TDSTaxComponent.taxElementList</code> attribute **/
	public static final String TAXELEMENTLIST = "taxElementList";
	/** Qualifier of the <code>TDSTaxComponent.tdsMaster</code> attribute **/
	public static final String TDSMASTER = "tdsMaster";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TDSMASTER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTDSTaxComponent> TDSMASTERHANDLER = new BidirectionalOneToManyHandler<GeneratedTDSTaxComponent>(
	OperationmastercoreConstants.TC.TDSTAXCOMPONENT,
	false,
	"tdsMaster",
	null,
	false,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TAXELEMENT, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(TAXELEMENTLIST, AttributeMode.INITIAL);
		tmp.put(TDSMASTER, AttributeMode.INITIAL);
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
		TDSMASTERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage()
	{
		return getPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive()
	{
		return getPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final double value)
	{
		setPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.taxElement</code> attribute.
	 * @return the taxElement
	 */
	public EnumerationValue getTaxElement(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TAXELEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.taxElement</code> attribute.
	 * @return the taxElement
	 */
	public EnumerationValue getTaxElement()
	{
		return getTaxElement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.taxElement</code> attribute. 
	 * @param value the taxElement
	 */
	public void setTaxElement(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TAXELEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.taxElement</code> attribute. 
	 * @param value the taxElement
	 */
	public void setTaxElement(final EnumerationValue value)
	{
		setTaxElement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.taxElementList</code> attribute.
	 * @return the taxElementList
	 */
	public Set<EnumerationValue> getTaxElementList(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, TAXELEMENTLIST);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.taxElementList</code> attribute.
	 * @return the taxElementList
	 */
	public Set<EnumerationValue> getTaxElementList()
	{
		return getTaxElementList( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.taxElementList</code> attribute. 
	 * @param value the taxElementList
	 */
	public void setTaxElementList(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, TAXELEMENTLIST,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.taxElementList</code> attribute. 
	 * @param value the taxElementList
	 */
	public void setTaxElementList(final Set<EnumerationValue> value)
	{
		setTaxElementList( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.tdsMaster</code> attribute.
	 * @return the tdsMaster
	 */
	public TDSMaster getTdsMaster(final SessionContext ctx)
	{
		return (TDSMaster)getProperty( ctx, TDSMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSTaxComponent.tdsMaster</code> attribute.
	 * @return the tdsMaster
	 */
	public TDSMaster getTdsMaster()
	{
		return getTdsMaster( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.tdsMaster</code> attribute. 
	 * @param value the tdsMaster
	 */
	public void setTdsMaster(final SessionContext ctx, final TDSMaster value)
	{
		TDSMASTERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSTaxComponent.tdsMaster</code> attribute. 
	 * @param value the tdsMaster
	 */
	public void setTdsMaster(final TDSMaster value)
	{
		setTdsMaster( getSession().getSessionContext(), value );
	}
	
}
