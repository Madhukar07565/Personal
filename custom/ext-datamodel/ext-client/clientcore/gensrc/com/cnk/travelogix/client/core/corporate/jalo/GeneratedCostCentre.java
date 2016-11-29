/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.corporate.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.TravelogixCorporateUnit;
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
 * Generated class for type {@link com.cnk.travelogix.client.core.corporate.jalo.CostCentre CostCentre}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCostCentre extends GenericItem
{
	/** Qualifier of the <code>CostCentre.costCentreName</code> attribute **/
	public static final String COSTCENTRENAME = "costCentreName";
	/** Qualifier of the <code>CostCentre.costCentreCode</code> attribute **/
	public static final String COSTCENTRECODE = "costCentreCode";
	/** Qualifier of the <code>CostCentre.clientFinanceCode</code> attribute **/
	public static final String CLIENTFINANCECODE = "clientFinanceCode";
	/** Qualifier of the <code>CostCentre.travelogixCorporateUnit</code> attribute **/
	public static final String TRAVELOGIXCORPORATEUNIT = "travelogixCorporateUnit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXCORPORATEUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCostCentre> TRAVELOGIXCORPORATEUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedCostCentre>(
	ClientcoreConstants.TC.COSTCENTRE,
	false,
	"travelogixCorporateUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COSTCENTRENAME, AttributeMode.INITIAL);
		tmp.put(COSTCENTRECODE, AttributeMode.INITIAL);
		tmp.put(CLIENTFINANCECODE, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXCORPORATEUNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CostCentre.clientFinanceCode</code> attribute.
	 * @return the clientFinanceCode
	 */
	public String getClientFinanceCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTFINANCECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CostCentre.clientFinanceCode</code> attribute.
	 * @return the clientFinanceCode
	 */
	public String getClientFinanceCode()
	{
		return getClientFinanceCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CostCentre.clientFinanceCode</code> attribute. 
	 * @param value the clientFinanceCode
	 */
	public void setClientFinanceCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTFINANCECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CostCentre.clientFinanceCode</code> attribute. 
	 * @param value the clientFinanceCode
	 */
	public void setClientFinanceCode(final String value)
	{
		setClientFinanceCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CostCentre.costCentreCode</code> attribute.
	 * @return the costCentreCode
	 */
	public String getCostCentreCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COSTCENTRECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CostCentre.costCentreCode</code> attribute.
	 * @return the costCentreCode
	 */
	public String getCostCentreCode()
	{
		return getCostCentreCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CostCentre.costCentreCode</code> attribute. 
	 * @param value the costCentreCode
	 */
	public void setCostCentreCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COSTCENTRECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CostCentre.costCentreCode</code> attribute. 
	 * @param value the costCentreCode
	 */
	public void setCostCentreCode(final String value)
	{
		setCostCentreCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CostCentre.costCentreName</code> attribute.
	 * @return the costCentreName
	 */
	public String getCostCentreName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COSTCENTRENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CostCentre.costCentreName</code> attribute.
	 * @return the costCentreName
	 */
	public String getCostCentreName()
	{
		return getCostCentreName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CostCentre.costCentreName</code> attribute. 
	 * @param value the costCentreName
	 */
	public void setCostCentreName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COSTCENTRENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CostCentre.costCentreName</code> attribute. 
	 * @param value the costCentreName
	 */
	public void setCostCentreName(final String value)
	{
		setCostCentreName( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELOGIXCORPORATEUNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CostCentre.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit(final SessionContext ctx)
	{
		return (TravelogixCorporateUnit)getProperty( ctx, TRAVELOGIXCORPORATEUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CostCentre.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit()
	{
		return getTravelogixCorporateUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CostCentre.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final SessionContext ctx, final TravelogixCorporateUnit value)
	{
		TRAVELOGIXCORPORATEUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CostCentre.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnit( getSession().getSessionContext(), value );
	}
	
}
