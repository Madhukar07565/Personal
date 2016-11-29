/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.corporate.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.CostCentre;
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
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.corporate.jalo.Project Project}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProject extends GenericItem
{
	/** Qualifier of the <code>Project.projectName</code> attribute **/
	public static final String PROJECTNAME = "projectName";
	/** Qualifier of the <code>Project.projectCode</code> attribute **/
	public static final String PROJECTCODE = "projectCode";
	/** Qualifier of the <code>Project.clientFinanceCode</code> attribute **/
	public static final String CLIENTFINANCECODE = "clientFinanceCode";
	/** Qualifier of the <code>Project.costCentre</code> attribute **/
	public static final String COSTCENTRE = "costCentre";
	/** Qualifier of the <code>Project.fromDate</code> attribute **/
	public static final String FROMDATE = "fromDate";
	/** Qualifier of the <code>Project.toDate</code> attribute **/
	public static final String TODATE = "toDate";
	/** Qualifier of the <code>Project.travelogixCorporateUnit</code> attribute **/
	public static final String TRAVELOGIXCORPORATEUNIT = "travelogixCorporateUnit";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXCORPORATEUNIT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedProject> TRAVELOGIXCORPORATEUNITHANDLER = new BidirectionalOneToManyHandler<GeneratedProject>(
	ClientcoreConstants.TC.PROJECT,
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
		tmp.put(PROJECTNAME, AttributeMode.INITIAL);
		tmp.put(PROJECTCODE, AttributeMode.INITIAL);
		tmp.put(CLIENTFINANCECODE, AttributeMode.INITIAL);
		tmp.put(COSTCENTRE, AttributeMode.INITIAL);
		tmp.put(FROMDATE, AttributeMode.INITIAL);
		tmp.put(TODATE, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXCORPORATEUNIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.clientFinanceCode</code> attribute.
	 * @return the clientFinanceCode
	 */
	public String getClientFinanceCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTFINANCECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.clientFinanceCode</code> attribute.
	 * @return the clientFinanceCode
	 */
	public String getClientFinanceCode()
	{
		return getClientFinanceCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.clientFinanceCode</code> attribute. 
	 * @param value the clientFinanceCode
	 */
	public void setClientFinanceCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTFINANCECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.clientFinanceCode</code> attribute. 
	 * @param value the clientFinanceCode
	 */
	public void setClientFinanceCode(final String value)
	{
		setClientFinanceCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.costCentre</code> attribute.
	 * @return the costCentre
	 */
	public CostCentre getCostCentre(final SessionContext ctx)
	{
		return (CostCentre)getProperty( ctx, COSTCENTRE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.costCentre</code> attribute.
	 * @return the costCentre
	 */
	public CostCentre getCostCentre()
	{
		return getCostCentre( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.costCentre</code> attribute. 
	 * @param value the costCentre
	 */
	public void setCostCentre(final SessionContext ctx, final CostCentre value)
	{
		setProperty(ctx, COSTCENTRE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.costCentre</code> attribute. 
	 * @param value the costCentre
	 */
	public void setCostCentre(final CostCentre value)
	{
		setCostCentre( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TRAVELOGIXCORPORATEUNITHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.fromDate</code> attribute.
	 * @return the fromDate
	 */
	public Date getFromDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, FROMDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.fromDate</code> attribute.
	 * @return the fromDate
	 */
	public Date getFromDate()
	{
		return getFromDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.fromDate</code> attribute. 
	 * @param value the fromDate
	 */
	public void setFromDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, FROMDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.fromDate</code> attribute. 
	 * @param value the fromDate
	 */
	public void setFromDate(final Date value)
	{
		setFromDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.projectCode</code> attribute.
	 * @return the projectCode
	 */
	public String getProjectCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROJECTCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.projectCode</code> attribute.
	 * @return the projectCode
	 */
	public String getProjectCode()
	{
		return getProjectCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.projectCode</code> attribute. 
	 * @param value the projectCode
	 */
	public void setProjectCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROJECTCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.projectCode</code> attribute. 
	 * @param value the projectCode
	 */
	public void setProjectCode(final String value)
	{
		setProjectCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.projectName</code> attribute.
	 * @return the projectName
	 */
	public String getProjectName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROJECTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.projectName</code> attribute.
	 * @return the projectName
	 */
	public String getProjectName()
	{
		return getProjectName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.projectName</code> attribute. 
	 * @param value the projectName
	 */
	public void setProjectName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROJECTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.projectName</code> attribute. 
	 * @param value the projectName
	 */
	public void setProjectName(final String value)
	{
		setProjectName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.toDate</code> attribute.
	 * @return the toDate
	 */
	public Date getToDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, TODATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.toDate</code> attribute.
	 * @return the toDate
	 */
	public Date getToDate()
	{
		return getToDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.toDate</code> attribute. 
	 * @param value the toDate
	 */
	public void setToDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, TODATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.toDate</code> attribute. 
	 * @param value the toDate
	 */
	public void setToDate(final Date value)
	{
		setToDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit(final SessionContext ctx)
	{
		return (TravelogixCorporateUnit)getProperty( ctx, TRAVELOGIXCORPORATEUNIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Project.travelogixCorporateUnit</code> attribute.
	 * @return the travelogixCorporateUnit
	 */
	public TravelogixCorporateUnit getTravelogixCorporateUnit()
	{
		return getTravelogixCorporateUnit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final SessionContext ctx, final TravelogixCorporateUnit value)
	{
		TRAVELOGIXCORPORATEUNITHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Project.travelogixCorporateUnit</code> attribute. 
	 * @param value the travelogixCorporateUnit
	 */
	public void setTravelogixCorporateUnit(final TravelogixCorporateUnit value)
	{
		setTravelogixCorporateUnit( getSession().getSessionContext(), value );
	}
	
}
